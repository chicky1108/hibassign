package com.cg.project.client;

import java.util.Scanner;


import com.cg.project.exception.AuthorNotFoundException;
import com.cg.project.services.AuthorServices;
import com.cg.project.services.AuthorServicesImpl;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static AuthorServicesImpl services = new AuthorServicesImpl();
public static void main(String args[]) throws AuthorNotFoundException {
mainScreen();
int choiceOfClient = sc.nextInt();

choiceMenu(choiceOfClient);
}

	private static void choiceMenu(int choiceOfClient) throws AuthorNotFoundException {
		switch(choiceOfClient)
		{
		case 1:
			System.out.println("Enter the authorId");
			int authorId=sc.nextInt();
			System.out.println("Enter firstName");
			String firstName=sc.next();
			System.out.println("Enter middleName");
			String middleName=sc.next();
			System.out.println("Enter lastName");
			String lastName=sc.next();
			System.out.println("Enter phoneNo");
			String phoneNo=sc.next();
			services.acceptAuthorDetails(authorId,firstName,middleName,lastName,phoneNo);
				break;
			
		case 2:
			try{System.out.println("Enter the Author Id");
			int authorId1=sc.nextInt();
			System.out.println(services.getAuthorDetails(authorId1));
			break;}
			catch(AuthorNotFoundException e) {e.printStackTrace();break;}
			
		case 3:
			System.out.println("All Author in Database are:-");
			System.out.println(services.getAllAuthorDetails());
			break;

		case 4:
			System.out.println("Enter the lastName:");
			String lastName1=sc.next();
			System.out.println("Enter the author id");
			int authorId2=sc.nextInt();
			services.update(lastName1, authorId2);
			break;

		case 5:System.out.println("Enter the author id which is to be deleted");
		int authorId3=sc.nextInt();
		services.deleteAuthor(authorId3);
			
			break;

		case 6:
			System.exit(0);

		default:
			System.out.println("Invalid choice!!. Please try again..");
		}
		sc.nextLine();
		main(null);}
	public static void mainScreen() {
		System.out.println("\n\n_______________________________________Welcome to Author Information Page_______________________________________");
		System.out.println("Please Enter any one of the choices:-");
		System.out.println("1. Create an entry");
		System.out.println("2. Get an author Details");
		System.out.println("3. Get all author Details");
		System.out.println("4. update details");
		System.out.println("5. delete details");
		System.out.println("6. Exit\n");

	}

}