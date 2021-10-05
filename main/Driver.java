/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package main;
import vault.PasswordVault;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		PasswordVault vault = new PasswordVault();
		try {
			vault.addNewUser("sarahh", "Helloo2!");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		vault.print();



		// TODO Auto-generated method stub

	}

}
