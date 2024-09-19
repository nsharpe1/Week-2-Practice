public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID()
    {
        return this.id;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getName()
    {
        return (this.firstName + "  " + this.lastName);
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getAnnualSalary()
    {
        int AnnualSalaryamount = this.salary * 12;
        return AnnualSalaryamount;
    }

    public double raiseSalary(int percent) 
    {
        double Salaryraise = (percent / 100.0) * this.salary;
        this.salary += (int)Salaryraise;
        return this.salary;
    } 

    public String toString()
    {
        return ("Employee[id=" + this.id + ",name=" + this.firstName + " " + this.lastName + ",salary=" + this.salary);
    }
}
