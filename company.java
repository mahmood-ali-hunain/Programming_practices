class employee{
    String name;
    String designation;
    int salary;

    public void employeeInfo(String name,String designation){
        System.out.println("Name: "+ this.name);
        System.out.println("Designation: "+ this.designation);
    }
    public void employeeInfo(int salary){
        System.out.println("Salary: "+ this.salary);

    }
    public void employeeInfo(String name, String designation, int salary ){
        System.out.println("Name: "+ this.name);
        System.out.println("Designation: "+this.designation);
        System.out.println("Salary: "+this.salary);
        
    }
    employee(employee e2){              //Copy constructor
        this.name=e2.name;
       this.designation=e2.designation;
        this.salary=e2.salary;
    }

    employee(){

    }

}

public class company {
    public static void main(String args[]){
        employee e1 = new employee();
        e1.name= "Hunain";
        e1.designation="CEO";
        e1.salary= 600000;
        employee e2= new employee(e1);

        e2.employeeInfo(e1.name,e1.designation);

    }
}
