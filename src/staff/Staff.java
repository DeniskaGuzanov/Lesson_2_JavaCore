package staff;

import java.util.ArrayList;
import java.util.List;

public class Staff {

    public static void main(String[] args) {



        Employee employee1 = new Employee("Petrov", "Ivan", "Petrovich", 23598, 21, 26000 );
        Employee employee2 = new Employee("Sidorov", "Petr", "Sergeevich", 23574, 41, 40000 );
        Employee employee3 = new Employee("Dygeev", "Anton", "Rastislavovich", 25898, 50, 46000 );
        Employee employee4 = new Employee("Somov", "Sergey", "Antonovich", 85698, 55, 56000 );
        Employee employee5 = new Employee("Yrgaliev", "Oleg", "Nurlanovich", 25498, 47, 66000 );

        List<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println(employees);

       Staff staff = new Staff();
       staff.printStaffSalaryAge((ArrayList<Employee>) employees,45, 5000 );




    }

    void  printStaffSalaryAge(ArrayList<Employee> employeeArrayList1, int a, int s){

        for (Employee em1 : employeeArrayList1){
            if (em1.age > a){
               em1.salary = em1.salary + 5000;

                System.out.println(em1);
            }
        }
   }

   void printAverageStaffSalaryAge(ArrayList<Employee> employeeArrayList2, int a, int s){
        for (Employee em2 : employeeArrayList2){

            em2.age = em2.age / 5;
            em2.salary = em2.salary / 5;

            System.out.println(em2);
        }
   }

}



