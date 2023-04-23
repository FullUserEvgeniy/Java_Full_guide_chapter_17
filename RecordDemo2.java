record Employee2 (String name, int idNumber){
    static int pendingID = -1;// поля экземпляра запрещены, потому поле static
    public Employee2{// канонический конструктор ЗАПИСИ
        name = name.trim();
    }
    public Employee2(String name){ // неканонический конструктор
        this(name, pendingID);     // вызов канонического конструктора обязателен
    }
}
public class RecordDemo2 {
    public static void main(String[] args) {
        Employee2[] employees2List = new Employee2[4];
        employees2List[0] = new Employee2("Doe", 1047);
        employees2List[1] = new Employee2("Jones", 1048);
        employees2List[2] = new Employee2("Smith", 1049);
        employees2List[3] = new Employee2("Martin");//вызов неканонического конструктора ЗАПИСИ

        for (Employee2 e:employees2List)
            System.out.println("Сотрудник " + e.name() + " имеет идентификатор - " + e.idNumber());
    }
}
/*
Сотрудник Doe имеет идентификатор - 1047
Сотрудник Jones имеет идентификатор - 1048
Сотрудник Smith имеет идентификатор - 1049
Сотрудник Martin имеет идентификатор - -1
 */