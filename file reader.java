

		package com.java.io;

		import java.io.FileInputStream;
		import java.io.IOException;
		import java.io.InputStream;
		import java.io.InputStreamReader;
		public class objectjava {

			public static void main(String[] args) {
				 InputStream inputStream = null;
			        InputStreamReader isr = null;
			        try {
			            inputStream = new FileInputStream("/Test/TestFolder/test-file.txt");
			            isr = new InputStreamReader(inputStream);
			            System.out.println("Encoding:" + isr.getEncoding());
			            int data;
			            if (isr.ready()) {
	}
			            while ((data = isr.read()) != -1) {
		                    System.out.print((char) data);
		                }
		            

		        } catch (IOException ex) {
		            ex.printStackTrace();
		        } finally {
		            if (inputStream != null)
		                try {
		                    inputStream.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            if (isr != null)
		            	 try {
		                     isr.close();
		                 } catch (IOException e) {
		                     e.printStackTrace();
		                 }
		         }

		     }

		 
		        }

