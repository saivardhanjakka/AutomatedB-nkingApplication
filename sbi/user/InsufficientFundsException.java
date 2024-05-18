package com.sbi.user;

public class InsufficientFundsException extends Exception{
// Constructor to create an instance of InsufficientFundsException with a specified message.
	public InsufficientFundsException(String msg){
		super(msg);
        // Call the constructor of the parent class (Exception) and pass the message to it.
	}
	

}


/*user defined exception create cheskorandhuku,constructor cretae cheskuntam,arg string,aa 
string arg ni super msg dwara it is sending back toits immediate parent class exception class
aa msg recieve karandhuku ekkadaithe main class lo insuffiecient funds exception vasthey 
this msg we will pass*/