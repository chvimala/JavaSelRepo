package coreJava.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class FinallyEx {

	 public void openFile(){
	        FileReader reader = null;
	        try {
	            reader = new FileReader("someFile");
	            int i=0;
	            while(i != -1){
	                i = reader.read();
	                System.out.println((char) i );
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if(reader != null){
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    //do something clever with the exception
	                }
	            }
	            System.out.println("--- File End ---");
	        }
	    }
	 
	public static void main(String[] args) {
		
		FinallyEx finalobj = new FinallyEx();
		finalobj.openFile();

	}

}
