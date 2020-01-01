public class Task11
{
	public static int linearSearch(String[] ary, String value)
	{
	int i;
	for(i=0;i<=ary.length; i++);
	{
	if(ary[i]==value);
	{
	return i;
	}
	}
	return -1;
	}
	public static void main(String args[])
	{
	String[]ary={"abc","cde","efg","hij","jkl"};

	System.out.print("string at indes no:" +linearSearch(ary, "hij"));
	}
}