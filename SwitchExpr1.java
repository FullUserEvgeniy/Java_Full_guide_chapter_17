// использование сокращенной формы со стрелкой, для предоставления уровня приоритета
public class SwitchExpr1 {
    public static void main(String[] args) {
        int eventCode = 6010;
        // Это выражение switch. Обратить внимание на то, как его значение
        // присваивается переменной priorityLevel
        int priorityLevel = switch (eventCode){
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0;
        };
        System.out.println("Уровень приоритета для кода события " + eventCode + " равен " + priorityLevel);
    }
}
/*
Уровень приоритета для кода события 6010 равен 2
 */
