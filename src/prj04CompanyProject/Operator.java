package prj04CompanyProject;

public class Operator extends CompanyWorker{

    public Operator(Company company, String name, double fixSalary){
        setCompany(company);
        setName(name);
        setFixSalary(fixSalary);
    }

    @Override
    public double getMonthSalary() {
        return getFixSalary();
    }

    @Override
    public String toString() {
        return getCompany().getName() + " / " + getName() + " / fixSalary = " + getFixSalary() + " / monthSalary = " + getMonthSalary();
    }
}
