package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodLibraryUser extends LibraryUser {
	
	
	static Scanner in = new Scanner(System.in);
	LibraryUser libraryuser = new LibraryUser(getUserId(),getRegDate(), getName(), getEmail());
	List<LibraryUser> libraryuserList = new ArrayList<LibraryUser>();

	public MethodLibraryUser(LocalDate regDate, String name, String email) {
		super(regDate, name, email);
	}
	public MethodLibraryUser(int userId ,LocalDate regDate, String name, String email) {
		super(userId,regDate, name, email);
	}

	public LibraryUser cretNewUser() {
		
		System.out.println("please enter user name ");
		String userName =in.next();
		libraryuser.setName(userName);		
		System.out.println("please enter user email ");
		String userEmail =in.next();
		libraryuser.setEmail(userEmail);
		libraryuser.setRegDate(LocalDate.now());
		System.out.println(libraryuser);
		libraryuserList.add(libraryuser);
		return saveUser(libraryuser);

	}
	
	public LibraryUser saveUser(LibraryUser libraryuser) throws IllegalArgumentException {
		
		if (libraryuser == null) {
			throw new IllegalArgumentException();
		} else {
			libraryuserList.add(libraryuser);
			return libraryuser;
		}

}
	public LibraryUser findUserId(int userId) {

		System.out.println("enter userid");
		in.nextInt();
		for (LibraryUser useridlist1 : libraryuserList) {
			if(useridlist1==findUserId(userId)) {
				System.out.println(useridlist1);
		}
				return useridlist1;
	}
		return libraryuser;

}
	public List<LibraryUser> findAllUser() {
		System.out.println(libraryuserList);
		return libraryuserList;
	}
	
	public boolean deleteUser(LibraryUser libraryuser) {
		boolean isDeletedUser = false;
		for (LibraryUser user : libraryuserList) {
			
			isDeletedUser = libraryuserList.remove(user);
			if (isDeletedUser)
			{
				System.out.println("user Has Been Removed");
			} 
			else {
				System.out.println("user Has Not Been Removed");
			}
			return isDeletedUser;
		}
		return false;
	}
	
}