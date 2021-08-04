package prj04CompanyProject;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<CompanyWorker> workers = new ArrayList<>();
    private double revenues;

    public Company(String name) {
        this.name = name;
    }

    public void hireAll(List<CompanyWorker> workers) {
        this.workers = workers;
    }

    public void fire50PercentWorkers(){
        int countWorkers = workers.size();
        int countFire = countWorkers / 2;
        ArrayList<Integer> indexToFire = new ArrayList<>();
        List<CompanyWorker> workersToFire = new ArrayList<>();
        int step = 1;
        while(step < countFire){
            int index = (int) (Math.random() * 199);
            if(indexToFire.contains(index)){
                continue;
            } else {
                indexToFire.add(index);
                workersToFire.add(workers.get(index));
                System.out.print(index + " ");
            }
            step++;
            System.out.println();
        }
        for(int i = 0; i < indexToFire.size(); i++){
            workers.removeAll(workersToFire);
        }
    }

    public List<CompanyWorker> getWorkers() {
        return workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getRevenues() {
        return revenues;
    }

    public void setRevenues(double revenues) {
        this.revenues = revenues;
    }

    public List<Employee> getTopSalaryStaff(int count){
        List<Employee> topSalaryStaff = new ArrayList<Employee>();
        for(int i = workers.size() - 1; i >= workers.size() - 1 - count; i--){
            topSalaryStaff.add(workers.get(i));
        }
        return topSalaryStaff;
    }
    public List<Employee> getLowestSalaryStaff(int count){
        List<Employee> lowestSalaryStaff = new ArrayList<Employee>();
        for(int i = 0; i < count; i++){
            lowestSalaryStaff.add(workers.get(i));
        }
        return lowestSalaryStaff;
    }

}
