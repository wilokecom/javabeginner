package com.wiloke.generic;

import com.wiloke.thread.basic.ThreadBasic;

import java.util.HashMap;

public class Main {
    public Main() {
//        var first = new User("A Vuong", 5);
//        var second = new User("B Tuong", 6);
//
//        System.out.println(Utils.max(first, second));
//        Utils.keyValue("username", "Alex");
//
//        Student student = new Student("ABC");
//        School student1 = new Student("XYZ");
//        School school = new School("Oke");
//
//        var studentList = new GenericList<Student>();
//
//        var schoolList = new GenericList<School>();
//        schoolList.addItem(student);
////        schoolList.addItem(school);
//        // Wild cast
//
//        Utils.printStudent(schoolList);

        var map = new HashMap<String, Object>();
        map.put("subkey", "subvalue");


        var map1 = new HashMap<String, Object>();
        map.put("key", map1);

        var item = map1.get("key");

        new ThreadBasic();
    }
}
