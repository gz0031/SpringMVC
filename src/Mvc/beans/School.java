package Mvc.beans;

/**
 * ClassName:School
 * Package:Mvc.beans
 *
 * @date:2020/2/7 19:02
 */
public class School {
    private String name;
    private String address;
    //test
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
