import Employer.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Employee>employees = new ArrayList<>();
        employees.add(new Employee("Person1","Management", 37, true));
        employees.add(new Employee("Person2", "IT", 36, false));
        employees.add(new Employee("Person3", "Software",24,true));
        employees.add(new Employee("Person4", "Management", 28, true));
        employees.add(new Employee("Person5","Software", 29,true));
        employees.add(new Employee("Person6","Management", 29,true));
        employees.add(new Employee("Person7","IT",34,false));
        employees.add(new Employee("Person8","Management", 30,true));
        employees.add(new Employee("Person9", "IT", 31, false));
        employees.add(new Employee("Person10","Management",31,true));




        List<Employee>filteredEmployees = employees.stream().filter(e -> e.getDepartment().equals("Management")).filter(e -> e.isPayedPerHour()).filter(e -> e.getAge() > 25).distinct().limit(5).collect(Collectors.toList());
        filteredEmployees.forEach(System.out::println);


        List<String>filteredNames = employees.stream().filter(e -> !e.isPayedPerHour()).filter(e -> e.getAge() > 30).map(Employee::getName).sorted().collect(Collectors.toList());
        System.out.println("Numele angajatilor in ordine alfabetica care nu sunt platiti pe ora si virsta e mai mare de 30 ani");
        System.out.println(filteredNames);

        Optional<Employee> result = employees.stream().filter(e -> e.getDepartment().equals("Software")).filter(Employee::isCanLeadInterviews).filter(Employee::isCanAttendTraining).findFirst();
        System.out.println("Afișează angajatul găsit");
        result.ifPresent(System.out::println);
    }
}