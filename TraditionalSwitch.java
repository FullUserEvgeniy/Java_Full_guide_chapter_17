// Использование традиционного оператора switch для установки
// уровня приоритета на основе кода события
public class TraditionalSwitch {
    public static void main(String[] args) {
        int priorityLevel;
        int eventCode = 6010;
        switch (eventCode){
            case 1000, 1205, 8900:
                priorityLevel = 1;
                break;
            case 2000, 6010, 9128:
                priorityLevel = 2;
                break;
            case 1002, 7023, 9300:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 0;
        }
        System.out.println("Уровень приоритета для кода события " + eventCode + " равен " + priorityLevel);
    }
}
/*
Уровень приоритета для кода события 6010 равен 2
 */
