package org.phone;

public class InternalStorage
{
	public void processorName()
	{
		System.out.println("intel processor");
	}
	public void ramSize()
	{
		System.out.println("45646");
	}
	public static void main(String[] args) {
		InternalStorage i=new InternalStorage();
		i.processorName();
		i.ramSize();
		ExternalStorage e=new ExternalStorage();
		e.size();
	}

}
