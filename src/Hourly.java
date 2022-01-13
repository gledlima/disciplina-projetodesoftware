package colabory;

public class Hourly extends Employee {
    
    //private String name;
    private double Salary;
    public double workingHorys;
    

    public Hourly(String name, String address, String district, int typeofEmployee, int matricula)
    {
        super(name, address, district, typeofEmployee, matricula);
    }

    public Hourly(int typeofEmployee, double workingHorys)
    {
        if(typeofEmployee == 3)
        {
            this.workingHorys = workingHorys;
        }
    }

    public double getSalary() 
    {
        return Salary;
	}


}



