class Task3{
	public static void main(String [] arg)
	{
	char A[]={'f','g','a','r','h','u'};
	int n=A.length;
	char b= 'r';
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
	if((int)A[midpoint]<(int)b)
	lowerbound=midpoint+1;
	if((int)A[midpoint]>(int)b)
	upperbound=midpoint-1;
	if((int)A[midpoint]==(int)b)
	{
	System.out.print(b + " at " + midpoint);
	NotFound=true;
	break;

	}

	}
	}
	}
