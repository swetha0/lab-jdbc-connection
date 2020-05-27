package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) {
		
	// Fill your code
		ConnectionManager manager= new ConnectionManager();
		Connection con = manager.getConnection();
		if(con!=null) {
			System.out.println("Connection established");
		}
		else
			System.out.println("Check your connection");
	}
}
