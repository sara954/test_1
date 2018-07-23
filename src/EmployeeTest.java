//class use to test the code
public class EmployeeTest{
    public static void main(String []args) {
        Employee employe1 =new Employee("Ahmad","Omar",320); // create object of type Employee
        Employee employe2 =new Employee("Rami","Sami",-660); // create object of type Employee
        System.out.println("the salary before bonus :");
        //display salary before bonus by calling bonus
        System.out.printf("the year salary for %s %s  is equal to : %f\n",employe1.getFirst_name(),employe1.getLast_name(),employe1.yearly_salary());
        System.out.printf("the year salary for %s %s is equal to : %f\n",employe2.getFirst_name(),employe2.getLast_name(),employe2.yearly_salary());
        System.out.println("____________________________________________________________________");
        //display salary after bonus  by calling year bonus
        System.out.println("the salary after bonus :");
        System.out.printf("the year salary for %s %s is equal to : %f\n",employe1.getFirst_name(),employe1.getLast_name(),employe1.year_bonus());
        System.out.printf("the year salary for %s %s is equal to : %f\n",employe2.getFirst_name(),employe2.getLast_name(),employe2.year_bonus());


    }







}