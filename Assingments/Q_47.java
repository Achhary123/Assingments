package Assingments;

public class Q_47 {
	public abstract class Bank {
		 abstract String getBalance();
	}

	class BankA extends Bank {

		
		 String getBalance() {
			return "$100";
		}
	}

	class BankB extends Bank {

		 String getBalance() {
			return "$200";
		}
	}

	class BankC extends Bank {

		 String getBalance() {
			return "$300";
		}
	}

}
