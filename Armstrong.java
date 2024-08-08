class Buzz 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		if(num%7==0 && num%7==7)
		{
			System.out.println("Number is buzz");
		}
		else 
		{
			System.out.println("Number is not buzz number");
		}
	}
}
