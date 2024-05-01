package gr.aueb.cf.ch14.reflection;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("gr.aueb.cf.ch14.reflection.Student");

            Constructor<?> defaultCtr = clazz.getDeclaredConstructor();
            defaultCtr.setAccessible(true);
            Student student1 = (Student) defaultCtr.newInstance();

            System.out.println("id " + clazz.getMethod("getId").invoke(student1) );
            System.out.println("firstname " + clazz.getMethod("getFirstname").invoke(student1) );
            System.out.println("lastname " + clazz.getMethod("getLastname").invoke(student1) );
        }catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
