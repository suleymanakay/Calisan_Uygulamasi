package org.example;

public class Employee {
    private String name;
    private Double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Double tax(Double salary){
        if(salary<1000.0){
            return 0.0;
        }
        else if(salary>1000.0){
            return  salary*3/100;
        }
        else {
            return 0.0;
        }

    }
    public int bonus(int workHours){
        if(workHours>40){
            return ((workHours-40)*30);
        }
        else{
            return 0;
        }
    }
    public Double raiseSalary(int hireYear){

        if((2021-hireYear)<10){
            return (salary*5/100);
        }
        else if((2021-hireYear)>9 && (2021-hireYear)<20){
            return (salary*10/100);
        }
        else if ((2021-hireYear)>19) {
            return (salary*15/100);
        }
        else
            return 0.0;
    }

    @Override
    public String toString() {
        return "Calisanin{"
                +
                "Adi='" + this.name + '\'' +
                ", Maasi=" + this.salary +
                ", Calisma Saati=" + this.workHours +
                ", Baslama Yili=" + this.hireYear +
                ", Vergi=" + tax(this.salary) +
                ", Bonus=" + bonus(this.workHours) +
                ", Maas Artisi=" + raiseSalary(this.hireYear) +
                ", Vergi ve Bonuslar ile birlikte maas=" + (this.salary+(bonus(this.workHours)-tax(this.salary))) +
                ", Toplam Maas=" + (this.salary+raiseSalary(this.hireYear)+bonus(this.workHours)) +
                '}';
    }
}
