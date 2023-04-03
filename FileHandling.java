package FirstAssesment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename;
		char tb;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Lockers Pvt.Ltd.");
		System.out.println("I am Tejas Badodekar, working as full stack developer");
		System.out.println("This is our first project-LockedMe.com");
		System.out.println("######################################################");
		System.out.println("here we can perform various file handling operations");
		System.out.println("you can create, search, delete files and many more. ");
		System.out.println("######################################################");
		
		do
		{
			System.out.println("select from the below options");
			System.out.println("1.Create a file");
			System.out.println("2.See the list of files");
			System.out.println("3.Delete a file");
			System.out.println("4.Search for a file");
			System.out.println("5.Exit");
			
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("please enter your file name");
			filename=sc.next();
			try
			{
				File file1=new File("C:\\Users\\tbbadode\\Desktop\\FileHandling\\"+filename+".txt");
				
				if(file1.createNewFile()) 
				{
					System.out.println("your file has been created");
	            }
				else
				{
					if(file1.exists())
					{
						System.out.println("file name already exists");
					}
					else
					{
						System.out.println("file does'nt exists");
					}
				}
					
				}
			catch(IOException e)
			{
			  e.printStackTrace();
			}
			   break;
			   
		case 2:
			System.out.println("list of files");
			File file2=new File("C:\\Users\\tbbadode\\Desktop\\FileHandling\\");
			
			String[] flist=file2.list();
			
			for(String f:flist)
			{
				System.out.println(f);
				
			}
			break;
			
		case 3:
			System.out.println("enter the file name you want to delete");
			
			filename=sc.next();
			File file3=new File("C:\\Users\\tbbadode\\Desktop\\FileHandling\\"+filename+".txt");
			
			if(file3.delete())
				
		{
				System.out.println(filename+"is deleted successfully");
				
		}
			else
			{
				System.out.println("please enter valid file name");
			}
			break;
			
		case 4:
			System.out.println("enter the file name you want to search");
			
			filename=sc.next();
			File file4=new File("C:\\Users\\tbbadode\\Desktop\\FileHandling\\");
			
			String[] flist1=file4.list();
			int flag=0;
			
			if(flist1==null)
			{
				System.out.println("no files in the folder");
			}
			
			else
			{
				for(String s:flist1)
				{
					if(s.equalsIgnoreCase(filename))
					{
						System.out.println(s+" file is found");
						flag=1;
					}
					
				}
			}
			if(flag==0)
			{
				System.out.println("file not found");
			}
			break;
			
		case 5:
			
		System.out.println("you are now re-directed to home page, thank you for your precious time!");
		
		    break;
		    
		    default:
		    	System.out.println("please choose from the given options ");
			
			}
		
		     System.out.println("do you want to continue?");
		     System.out.println("y or n");
		     
		     tb=sc.next().charAt(0);
		     
		    		 
		}
		while(tb=='Y'||tb=='y');
		
	}

}
