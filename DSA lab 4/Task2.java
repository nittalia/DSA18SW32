class LinkedList {
 
        int data;
	LinkedList next;
	LinkedList(int data)
	{
		this.data=data;
	}
	LinkedList(int data,LinkedList next)
	{
		this.data=data;
		this.next=next;
	}

	public static LinkedList insert(LinkedList start,int x)
	{
		//for inserting in starting of linkedlist
		if(start.data>x || start==null){
			start=new LinkedList(x,start);
			return start;
		}
		LinkedList p=start;

		while(p.next!=null)
		{
			if(p.next.data>x)
				break;
			else
				p=p.next;
		}
		p.next=new LinkedList(x,p.next);
		return start;
	}

	public static LinkedList delete(LinkedList start,int x)
	{
		if(start.data>x || start==null)
		{
			return start;
		}
		else if(start.data==x)
		{
			//start=start.next;
			return start.next;
		}
		LinkedList p=start;
		while(p.next!=null)
		{
			if(p.next.data>x) break;
			else
				if(p.next.data==x){
					p.next=p.next.next;
					break;
				}
			p=p.next;
		}
		//p.next=new Node(x,p.next);
		return start;
	}

	int size(LinkedList list)
	{
		int size=0;
		while(list!=null)
		{
			++size;
			list=list.next;
		}
		return size;
	}

	int sum(LinkedList list)
	{
		int sum=0;
		while(list!=null)
		{
			sum+=list.data;
			list=list.next;
		}
		return sum;
	}

	int get(LinkedList list,int index)
	{
		LinkedList p=list;
		int i=0;
		while(i<index && p!=null)
		{
			++i;
			p=p.next;
		}  
		 return p.data;
	}

	  void set(LinkedList list, int index, int value) {
	   
	     for (int j=0; j<index; j++) {
	         if (list == null) {   
	            throw new IllegalStateException();  
	              } 
	     
	               list = list.next;  } 

	                list.data = value;
	      //           return list;  
	              }


}
public class Task2
{
	public static void main(String[] args) 
	{	
		LinkedList start =new LinkedList(11);
		LinkedList p=start;
		for(int i=2;i<=5;i++)
		{
			p=p.next=new LinkedList(start.data*i);
			
		}
                System.out.println("Elements in LinkedList are: ");
                for (LinkedList s=start;s!=null;s=s.next)
		{
			System.out.println(s.data);
			
		}
                System.out.println("Set the value 24 at index 2");
            start.set(start,2,24);
		//System.out.println(start.get(start,22));
		//System.out.println(start.size(start));
	System.out.println("Elements in LinkedList are: ");	
            for (LinkedList s=start;s!=null;s=s.next)
		{
			System.out.println(s.data);
			
		}
		System.out.println("Sum of all elements : "+ start.sum(start));
                System.out.println("Size of LinkedList is: "+start.size(start));
	}
}   