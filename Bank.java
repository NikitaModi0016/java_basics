class BankDetails
{
	String Accno;
	String Name;
	double balance;
	public void getvalue()
	{
		System.out.println("Accounct number of the account holder:"+Accno);
		System.out.println("Account holder name:"+Name);
		System.out.println("Account balance:"+balance);


	}
	public void setvalue(String Accno,String Name, double balance)
	{
		this.Accno=Accno;
		this.Name=Name;
		this.balance=balance;
	}
	void deposit(double money)
	{
		this.balance=balance+money;
		System.out.println(" "+money+"is added in your account");
		getvalue();
	}
	void withdrawl(double money)
	{
		if(money>this.balance)
		{
			System.out.println("Can not withdrawl from your account");
		}
		else
		{
			this.balance=balance-money;
			System.out.println(" "+money+"is withdrawl from your account");
			getvalue();
		}
	}
}
class BankAccount
{
	public static void main(String args[])
	{
		BankDetails obj=new BankDetails();
		BankDetails obj1=new BankDetails();
		BankDetails obj2=new BankDetails();
		obj.setvalue("247876","Nikita",5000);
		obj.getvalue();
		obj.deposit(5000);
		obj.withdrawl(60000);
		obj1.setvalue("23687","Rimpa",70000);
		obj1.getvalue();
		obj1.deposit(34000);
		obj1.withdrawl(59000);
		obj2.setvalue("243545","Aradhita",100000);
		obj2.getvalue();
		obj2.deposit(290400);
		obj2.withdrawl(560000);

		
	}
}