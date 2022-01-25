package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(3);
        helloLombok.setName("fksdjfk");

        String name = helloLombok.name;
        int age = helloLombok.age;

        System.out.println("helloLombok = " + helloLombok);
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}
