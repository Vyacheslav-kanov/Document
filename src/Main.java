import Doc.DismissalOrder;
import Doc.Employee;
import Doc.EmploymentOrder;
import Doc.Latter;

public class Main {

    private static Latter latter = new Latter(1, "Уведомление", "petrov@mail.ru", "slava@mail.ru");
    private static EmploymentOrder employmentOrder = new EmploymentOrder(1, "Приказ о принятии на работу", new Employee("Petrov", "Pupkin"), "Уволить сотрудника");
    private static DismissalOrder dismissalOrder = new DismissalOrder(1, "Приказ об уволении сотрудника", new Employee("Petrov", "Pupkin"), "Уволить сотрудника", "По собственному желанию");

    public static void main(String[] args) {
        employmentOrder.print(args);
        employmentOrder.print(args);
        System.out.println();
        dismissalOrder.print(args);
        dismissalOrder.print(args);
    }
}
