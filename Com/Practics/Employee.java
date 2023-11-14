package Com.Practics;


public class Employee {
    String empName;
    String empType;
    int empId;

    public static void main(String a[]){
        //creating the object
        Employee tester=new Employee();
        tester.empType="Testing";
        System.out.println(tester.empType);


        //multiple objects
        Employee dev=new Employee();
        dev.empType="Development";
        dev.empName="john";
        System.out.println(dev.empType+"\t"+dev.empName);

    }
}