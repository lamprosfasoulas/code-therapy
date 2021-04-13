import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * Day: 2 / 100
 * Creator: Lampros Fasoulas
 * 
 * This is me trying to make a sample blockchain
 * 
 */

public class daytwo {

    public class BlockChainProgram {
    
        
    }
    public static class Block {
        private String[] transactions;
        private int blockHash;
        private int previousBlockHash;

        //this is the block constractor
        public Block(String[] transactions, int previousBlockHash) {
            this.transactions = transactions;
            this.previousBlockHash = previousBlockHash;
            this.blockHash = Arrays.hashCode( new int[]{ Arrays.hashCode(transactions),this.previousBlockHash});
        }
        
        //getter and setters
        public String[] getTransactions() {
            return transactions;
        }
        public void setTransactions(String[] transactions) {
            this.transactions = transactions;
        }
        public int getBlockHash() {
            return blockHash;
        }
        public void setBlockHash(int blockHash) {
            this.blockHash = blockHash;
        }
        public int getPreviousBlockHash() {
            return previousBlockHash;
        }
        public void setPreviousBlockHash(int previousBlockHash) {
            this.previousBlockHash = previousBlockHash;
        }

        @Override
        public String toString() {
            return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash + ", previousBlockHash="
                    + previousBlockHash + "]";
        }
         
    }
    
    

    public static String[] getTransactions(){
        Scanner s = new Scanner(System.in);
        
        //this method scans for user input and parses it as transaction
        //data
        System.out.println("--Welcome to the Lampros BlockChain--");
        System.out.println("--Enter the number of transactions--");
        int transactionsNum = s.nextInt();
        String [] values = new String [transactionsNum]; 
        System.out.println("--Please enter the transactions--");
        for (int i = 0; i < transactionsNum; i++) {
            values[i] = s.next();
        }

        return values;

    }

    public static void main(String[] args) {
        ArrayList<Block> blockChain = new ArrayList<Block>();
        //this is how to get the previous block hash
        //this gets the last block of the blockchain and returns its blockHash
        //then we can assign it to the new block
        int prevHash;
        try{
             prevHash = blockChain.get(blockChain.size()-1).getBlockHash();
        }catch(Exception e){
             prevHash = 0;
        }
        
        //this get the input transactions for the block
        String transactionsToParse [] =  getTransactions();
        //this creates the block
        Block blockName = new Block(transactionsToParse, prevHash);
        //this append the block to the blockchain
        blockChain.add(blockName);
        System.out.println(blockChain.toString()); 
          
               
        
    }

}