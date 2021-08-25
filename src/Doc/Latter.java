package Doc;

import Interface.IntLatter;

import java.util.Objects;

public class Latter implements IntLatter {
    private int number;
    private String name;
    private String whom;
    private String fromWhom;

    public Latter(int number, String name, String whom, String fromWhom) {
        this.number = number;
        this.name = name;
        this.whom = whom;
        this.fromWhom = fromWhom;
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

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    public String getFromWhom() {
        return fromWhom;
    }

    public void setFromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
    }

    @Override
    public String toString() {
        return "Latter{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", whom='" + whom + '\'' +
                ", fromWhom='" + fromWhom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Latter latter = (Latter) o;
        return number == latter.number && Objects.equals(name, latter.name) && Objects.equals(whom, latter.whom) && Objects.equals(fromWhom, latter.fromWhom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, whom, fromWhom);
    }

    public void print(){
        System.out.println(toString());
    }
}
