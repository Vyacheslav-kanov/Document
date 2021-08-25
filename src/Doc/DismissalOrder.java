package Doc;

import java.util.Objects;

public class DismissalOrder implements Interface.IntDismissalOrder {
    private int number;
    private String name;
    private Employee employee;
    private String message;
    private String reasonForDismissal;
    private Status status;

    public DismissalOrder(int number, String name, Employee employee, String message, String reasonForDismissal) {
        this.number = number;
        this.name = name;
        this.employee = employee;
        this.message = message;
        this.reasonForDismissal = reasonForDismissal;
        this.status = Status.CREATED;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReasonForDismissal() {
        return reasonForDismissal;
    }

    public void setReasonForDismissal(String reasonForDismissal) {
        this.reasonForDismissal = reasonForDismissal;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "DismissalOrder{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                ", message='" + message + '\'' +
                ", reasonForDismissal='" + reasonForDismissal + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DismissalOrder that = (DismissalOrder) o;
        return number == that.number && Objects.equals(name, that.name) && Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, employee, status);
    }

    public void print(){
        System.out.println(toString());
        status = Status.EXECUTED;
    }

    public void print(String[] args){
        boolean isPresent = false;

        for(String e: args){
            if(e.equals("-simple")) isPresent = true;
        }
        if(isPresent){
            System.out.println(
                    "DismissalOrder{" +
                            "number=" + number +
                            ", name='" + name
            );
            status = Status.EXECUTED;
        }else print();
    }
}
