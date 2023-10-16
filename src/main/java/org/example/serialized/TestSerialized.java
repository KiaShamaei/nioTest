package org.example.serialized;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialized {
    public static void main(String[] args) {

//        Human h = new Human(1, "nader");
//        serialized(h);
       Object h2 = (Human) deSerialized();
        System.out.println(h2.toString());;

    }

    private static void serialized(Human h) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("human.ser"));) {
            o.writeObject(h);
            System.out.println("object get serialized...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Object  deSerialized() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("human.ser"))) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("rrr");
        }
    }
}
