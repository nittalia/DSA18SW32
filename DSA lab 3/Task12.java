public class Task12
{
	public int LinearSearch(char [] ary, char val)
	{
	for (int i=0;i<ary.length; i++)
	{
	if(ary[i]== val)
	{
	return i;
	}
	}
	return -1;
	}
	public static void main(String args[])
	{
	char [] ary = {'a','e','i','o','u'};
	Task12 ob = new Task12();
	System.out.print(ob.LinearSearch(ary, 'u'));
	}
}