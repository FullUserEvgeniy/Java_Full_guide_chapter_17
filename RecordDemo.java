record Employee(String name, int idNumber){
    public Employee { // канонический конструктор, можно оставить тело ЗАПИСИ пустым
        name = name.trim();// удаление ведущих и завершающих пробельных символов (метот определен в String)
        //this.idNumber = idNumber; // понадобится если конструктор принимает параметры
        // в данном случае инициализируется по умолчанию
    }
}

public class RecordDemo {
    public static void main(String[] args) {
        Employee[] employeesList = new Employee[4];
        employeesList[0] = new Employee("Doe", 1047);
        employeesList[1] = new Employee("Jones", 1048);
        employeesList[2] = new Employee("Smith", 1049);
        employeesList[3] = new Employee("Martin", 1050);

        for (Employee e:employeesList)
            System.out.println("Сотрудник " + e.name() + " имеет идентификатор - " + e.idNumber());
    }
}
/*
Сотрудник Doe имеет идентификатор - 1047
Сотрудник Jones имеет идентификатор - 1048
Сотрудник Smith имеет идентификатор - 1049
Сотрудник Martin имеет идентификатор - 1050
 */