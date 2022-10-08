
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
	 
	public double tax() 
	{
		if(salary<1000) {return 0;}
		else
		{
		double a;
		a=(salary*0.03); 
		return a;
		}
	}
	public double bonus() 
	{
		if(workHours > 40) 
		{
		int a;
		a=((workHours-40)*30) ;
		return a;
		}
		else {return 0;}
	}
	public double raiseSalary()
	{
		    double tot;
			tot= bonus()+tax()+salary;
		if(0<hireYear-2021&&hireYear-2021<10) 
		{
			
			double a;
			a=tot*0.05;
			return a;
			
		}
		else if(9<hireYear-2021&&hireYear-2021<20) 
		{
			double a;
			a=tot*0.1;
			return a;
		}
		else if(hireYear-2021>19) 
		{
			double a;
			a=tot*0.15;
			return a;
		}
		else {return 0;}
	}
	public String toString() 
	{
		double x=tax()+bonus()+salary;
		double y=x+raiseSalary();
		return "isim: "+name+"\n"+"maas: "+salary+"\n"+"calisma saati: "+workHours+"\n"+"ise baslangic tarihi: "+hireYear+"\n"+
		"Vergi: "+tax()+" TL"+"\n"+"bonus: "+bonus()+" TL"+"\n"+"Maas artisi: "+raiseSalary()+" TL"+"\n"+"Vergi ve bonusla birlikte maas: "
		+x+" TL"+"\n"+"Toplam maas: "+y+" TL";
	}
	
}
