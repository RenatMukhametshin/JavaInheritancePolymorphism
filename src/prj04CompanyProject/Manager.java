package prj04CompanyProject;

public class Manager extends CompanyWorker {
    private double earned;

    public Manager(Company company, String name, double earned, double fixSalary) {
        this.earned = earned;
        setCompany(company);
        setName(name);
        setFixSalary(fixSalary);
    }

    private double getEarned() {
        return this.earned;
    }

    @Override
    public double getMonthSalary() {
        return getFixSalary() + getEarned() * 0.05;
    }

    @Override
    public String toString() {
        return getCompany().getName() + " / " + getName() + " / fixSalary = " + getFixSalary() + " / earned = " + getEarned() +
                " / monthSalary = " + getMonthSalary();
    }
}
