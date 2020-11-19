package io.pragra.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private IAddress iAddress;

    private List<String> hobbies;

    public Person(String name, int age, IAddress iAddress, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.iAddress = iAddress;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iAddress=" + iAddress +
                ", hobbies=" + hobbies +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IAddress getiAddress() {
        return iAddress;
    }

    public void setiAddress(IAddress iAddress) {
        this.iAddress = iAddress;
    }

//    @PostConstruct
    public void init(){
        System.out.println("*************INIT***************");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("**********DESTROY***************");
    }
}
