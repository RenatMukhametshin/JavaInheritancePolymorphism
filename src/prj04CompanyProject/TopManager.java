package prj04CompanyProject;

public class TopManager extends CompanyWorker {

    public TopManager(Company company, String name, double fixSalary) {
        setCompany(company);
        setName(name);
        setFixSalary(fixSalary);
    }

    @Override
    public double getMonthSalary() {
        double revenues = getCompany().getRevenues();
        double multi = 1.0;
        if (revenues > 10000000.0) {
            multi = 2.5;
        }
        return getFixSalary() * multi;
    }

    public String toString() {
        return getCompany().getName() + " / " + getName() + " / company revenues = " + getCompany().getRevenues() + " / fixSalary = " + getFixSalary() + " / monthSalary = " + getMonthSalary();
    }
}
