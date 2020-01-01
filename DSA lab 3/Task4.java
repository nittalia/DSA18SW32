class Task4
{
	public static void main(String [] arg)
	{
	String A[]={"abcd","gggh","oouu","rfgdd","hiiii","ufght"};
	int n=A.length;
	String b= "hiiii";
	boolean NotFound= false;
	int lowerbound=1;
	int upperbound=n;
	while(!NotFound)
	{
	if(upperbound<lowerbound)
	{
	System.out.print("does not exixt");
	break;
	}
	int midpoint=lowerbound+(upperbound-lowerbound)/2;
	if(A[midpoint].compareTo(b)<0)
	lowerbound=midpoint+1;
	if(A[midpoint].compareTo(b)>0)
	upperbound=midpoint-1;
	if(A[midpoint].compareTo(b)==0)
	{
	System.out.print(b + " at " + midpoint);
	NotFound=true;
	break;}

	}
}
}
	