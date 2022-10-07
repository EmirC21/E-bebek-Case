
public class Employee {

	private String name; //isim
	private int salary; //maaş
	private int workHours; // haftalık çalışma saati
	private int hireYear; // işe başlangıç yılı
	
	public Employee(String name,int salary,int workHours,int hireYear) {
		this.name=name; 
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	 
	public void tax() 
	{
		if(salary<1000) { System.out.println("vergi miktari : "+ 0+" TL");}
		else
		{
		double a;
		a=(salary*0.03); 
		System.out.println("vergi miktari : "+a+" TL");
		}
	}
	public void bonus() 
	{
		if(workHours > 40) 
		{
		int a;
		a=((workHours-40)*30) ;
		System.out.println("bonus miktari: "+ a+" TL");
		}
		else {		System.out.println("bonus miktari: "+0+" TL");}
	}
	public void raiseSalary()
	{
		if(hireYear-2021<10) 
		{
			double a;
			a=salary*0.05;
			System.out.println("zam miktari: "+a+" TL");
			
		}
		else if(9<hireYear-2021&&hireYear-2021<20) 
		{
			double a;
			a=salary*0.1;
			System.out.println("zam miktari: "+a+" TL");
		}
		else if(hireYear-2021>19) 
		{
			double a;
			a=salary*0.15;
			System.out.println("zam miktari: "+a+" TL");
		}
	}
	public void toSalary() 
	{
		System.out.println("isim: "+name+" maas: "+salary+" calisma saati: "+workHours+" ise baslangic tarihi: "+hireYear);
	}
	
}
