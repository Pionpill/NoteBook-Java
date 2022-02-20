/*
 * @Author: your name
 * @Date: 2022-01-14 15:50:03
 * @LastEditTime: 2022-01-26 20:25:42
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \Notebook-Java\Java-Basic\CoreJava\Code\fundamentals\src\main\java\core\App.java
 */
package core;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Pionpill");
        Manager manager = new Manager("Pionpill2", "Intelligence");

        System.out.println(employee instanceof Manager);
    }
}

class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Manager extends Employee {
    private String part;

    Manager(String name, String part) {
        super(name);
        this.part = part;
    }

    public String getPart() {
        return this.part;
    }
}