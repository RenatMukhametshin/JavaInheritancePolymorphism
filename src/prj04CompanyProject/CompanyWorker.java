package prj04CompanyProject;

import java.util.Comparator;

public abstract class CompanyWorker implements Employee, Comparable<CompanyWorker> {
    private Company company;
    private String name;
    private Double fixSalary;

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(Double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public int compareTo(CompanyWorker worker) {
        System.out.println(getMonthSalary() + " worker.getMonthSalary " + worker.getMonthSalary());
        if(getMonthSalary() > worker.getMonthSalary()){
            return 1;
        } else if (getMonthSalary() < worker.getMonthSalary()){
            return -1;
        } else {
            return 0;
        }
    }
}
