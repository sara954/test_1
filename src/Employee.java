/*
Name            : Sara ALabedallha
section         : 11
Time            : 10 am -4 pm
# Assignment    : 1
about this code : calculate the yearly salary  and amount of bonus on it if the bonus value was 10% from yearly salary
*/

public class Employee {
    // instance variable
    private String first_name,last_name;
    private double salary;

    // Employee constructor that receives three parameters
    public Employee(String first,String last, double money) {
        // This constructor has one parameter, name.
        first_name=first; // store value
        last_name=last; //store value
        //check if salary is not positive and put it to  default value which is  0.0
        if (money<0)
            salary=0.0;
        else
            salary=money; // store value
    }
    //method to get first name
    public String getFirst_name()
    {
        return first_name;
    } //end get method
    //method to set first name
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }//end set method
    //method to get last name
    public String getLast_name()
    {
        return last_name;
    }//end get method
    //method to set last name
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    } //end set method
    //method to get salary
    public double getSalary() {
        return salary;
    }
    //method to set salary
    public void setSalary(double salary) {

        this.salary = salary;
    }
    //method to calculate the yearly salary by multiple salary with 12
    public double yearly_salary()
    {
        double year_salary=12*salary;
        return year_salary;
    }
    //method to calculate the yearly salary bonus by multiple salary with bonus parentage then add it to yearly salary
    public double year_bonus()
    {
        double bonus=.1*yearly_salary();
        double year_bouns=bonus+yearly_salary();
        return year_bouns;
    }


}