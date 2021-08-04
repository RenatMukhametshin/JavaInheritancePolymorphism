package prj04CompanyProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Company company1 = new Company("Java Corporation");
        company1.setRevenues(15000000.0);
        company1.hireAll(generateWorkers(company1));

        List<CompanyWorker> workers = company1.getWorkers();
        Collections.sort(workers, new Comparator<CompanyWorker>() {
            @Override
            public int compare(CompanyWorker companyWorker1, CompanyWorker companyWorker2) {
                return companyWorker1.compareTo(companyWorker2);
            }
        });

        for(CompanyWorker worker : workers){
            System.out.println(worker);
        }

        System.out.println("\n 15 top salaryies");
        List<Employee> top = company1.getTopSalaryStaff(15);
        for(Employee object : top){
            System.out.println(object.getMonthSalary());
        }

        System.out.println("\n 30 lowest salaryies");
        List<Employee> lowest = company1.getLowestSalaryStaff(30);
        for(Employee object : lowest){
            System.out.println(object.getMonthSalary());
        }

        for(CompanyWorker worker : workers){
            System.out.println(worker);
        }

        company1.fire50PercentWorkers();

        System.out.println("\n 15 top salaryies");
        top = company1.getTopSalaryStaff(15);
        for(Employee object : top){
            System.out.println(object.getMonthSalary());
        }

        System.out.println("\n 30 lowest salaryies");
        lowest = company1.getLowestSalaryStaff(30);
        for(Employee object : lowest){
            System.out.println(object.getMonthSalary());
        }

    }

    public static List<CompanyWorker> generateWorkers(Company company) {
        List<CompanyWorker> workers = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            int type = (int) (30 * Math.random());
            if (type <= 20) {
                workers.add(new Operator(company, "operator" + i, 20000 + Math.random() * 10000));
            } else if (type <= 27) {
                workers.add(new Manager(company, "manager" + i, 100000 + Math.random() * 200000, 30000.0));
            } else {
                workers.add(new TopManager(company, "topmanager" + i, 100000 + Math.random() * 50000.0));
            }
        }
        return workers;
    }
}
