package Com.AccessModifier.inheritance;
import Com.AccessModifier.Student;


public class SubClass  extends Student{
    public static void main(String arg[]){
        new SubClass().test();
    }
    public void test(){
        System.out.println(rollno);
        printRollnumber();
    }

}
