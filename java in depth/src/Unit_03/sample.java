package Unit_03;

import java.io.IOException;

public class sample {
	
	public static void main(string[] args) {
		//TODO Auto-generated method stub
		/*
		try {
			int a=10, b=0;
			int c=a/b;
			System.out.println("After the exception"+c);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Exception handeled");
		}
		catch(Exception e) {
			System.out.println(e.get message());
		}
		//if there is no exception finally will always run
		//finally always run irrespective of whether exception handeled or not
		//
		finally {
			System.out.println("Done");
		}*/
			//Runtime: If any exception bypasses the compiler process and break at run time then it is called runtime exception
		void CheckedAndUncheckedException() {
			int a=0;
			int b=5;
			if(x<2) {
				throw new IOException();
			}
			int c=b/a;
			
			System.out.println(c);
		}
	}

}
