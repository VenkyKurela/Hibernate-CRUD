package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s = new Student();
     /*    s.setAge(27);
        s.setName("Kalyan");
        s.setTech("Coud "); */

       // System.out.println(s.toString());

      /*  Configuration config = new Configuration();
        config.addAnnotatedClass(com.demo.Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory(); */

        SessionFactory factory = new Configuration().addAnnotatedClass(com.demo.Student.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        // insert data

     /*   Transaction transaction = session.beginTransaction();
        session.persist(s);
        transaction.commit(); */ // transaction req for save, update and delete


        // Fetch the data
  /*       Student s1 = session.get(Student.class,26); //Eager Fetching
        //Student s1 = session.find(Student.class,26); //Eager Fetching
        //Student s1 = session.byId(Student.class).load(26); //Eager Fetching
        //Student s1 = session.byId(Student.class).getReference(26); //lazy fetching
       // System.out.println(s1); */

        // update the data
       /* Transaction transaction = session.beginTransaction();

        session.merge(s);
        transaction.commit(); */

        // Delete Data from table

    /*    Transaction transaction = session.beginTransaction();
        Student s1 = session.find(Student.class,22);
        session.remove(s1);
        transaction.commit(); */

        session.close();
        factory.close();


    }
}