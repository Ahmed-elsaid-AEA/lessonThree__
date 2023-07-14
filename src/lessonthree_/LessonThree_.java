/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonthree_;

import java.util.Scanner;

/**
 *
 * @author A.E.A
 */
public class LessonThree_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user name , grade , age

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your name");
//        String name = input.nextLine();
//        System.out.println("enter your grade");
//        double grade = input.nextDouble();
//        System.out.println("enter your age");
//        int age = input.nextInt();
//        System.out.println("your name is  : " + name  + " ,\n your age  is : " + age + " , your grade is  : " + grade);
//        System.out.println("hello\nworld");
//        System.out.println("hello\tworld");
//        System.out.println("hello\rworld");
//        System.out.println("hello\bworld");
//        System.out.println("hello\fworld");
//        System.out.println("ahmed said \"hello\"");
//        System.out.println("ahmed said \'hello\'");
//        System.out.println("ahmed said 'hello'");
//        System.out.println("j:\\Newolder");
//        System.out.println("ahmed" + "mohmed");
//        String name="ahmed";
//        System.out.println(name.concat("mohmed"));
        double x = 10.5, y = 5.5;
//        System.out.println((int)Math.max(x, y));
//        System.out.println((int) Math.cbrt(27));
//        System.out.println(Math.pow(2, 5));
//        System.out.println(Math.round(y));
//        System.out.println(Math.floor(y));
//        System.out.println(Math.ceil(y));
//        System.out.println(Math.abs(10));
//        System.out.println(Math.random());
        //math 
        System.out.println("Enter your grade");
        int grade = 10;
        if (grade >= 50 && grade < 60) {
            System.out.println("مقبول");
        } else {
            System.out.println("[جيد");
        }
        String a = (grade >= 50 && grade < 60) ? "مقبول" : "جيد";
        System.out.println(a);
        System.out.println("قم بعمل برنامج يسمع للمتسخدم بادخال االسم والرقم والهوايات والكلية ودرجتة ، واذا كانت الدرجة اكبر \n" +
"من 50 واصغر من 60 قم بطباعة مقبول وهكذا \n" +
"وقم في النهاية بطباعة كل البيانات ");

    }

}
