package com.ryba;
/*
* создать свой класс
* Поля + конструктор
* Геттеры + сеттеры (alt+insert)
* equals и compareTo (все, как у кота)
* реализовать самим toString() (прочитайте в гугле инфы)
* сделать hashCode  - прочитать зачем и реализовать
* Будем говорить про TreeMap -- добавьте пару объектов
* и покажите их в отсортированном виде
* */
public class HelloWord {
    public static void main(String[] args) {
        Cat c = new Cat(3,"a");
        Cat d = new Cat(3,"a");
        if(c.equals(d))
            System.out.println("Ok!!!");
        if(c == d)
            System.out.println("LaLaLa");

        if(c.equals(d))
            System.out.println("Вывели кота через интерфейс");

        System.out.println(c instanceof Object);
        System.out.println(c instanceof Cat);
        System.out.println(c.equals(d));

    }

    public static void main2(String[] args) {
        Integer a = 45;//wrapper class (класс обертки) над примитивом
        int b = 23;//Примитивный тип данных, не класс, только значение
        b = 4 + a;
        int x=4;
        int y=4;
        Integer d = 55;
        Integer s = 55;
        if(d.intValue()==s.intValue())
            System.out.println("Integer int");
        if(x==y)
            System.out.println("int");
        if(d.equals(s))
            System.out.println("Integer equals");
        //equals - принимает все, что угодно object
        //говорит только да или нет
        //есть у ЛЮБОГО класса (!!!)
        if(d.compareTo(s)==0)
            System.out.println("Integer compareTo");
        //compareTo принимает объект того же класса
        //возвращает int -1 0 1 (меньше равно больше)
        //этого метода нет, если не описать
        //Надо описать отдельно (!!!КАК???)
    }

    //psvm->tab

    public static void main111(String[] args) {
        //sout->tab
        System.out.println("Hello!");
        System.out.println(args[0]);
        //G:\ПРОЕКТИРОВАНИЕ\Академия Шаг\JAVA\Day1\src\com\ryba  - это путь к нашему классу HelloWorld!
        //C:\ set "PATH=%PATH;%C:\Program Files\Java\jdk1.8.0_91\bin;" - так
        // мы добавляем в перечень exe файлов путь к файлу javac. Теперь можно
        // откомпилировать проект из консольки C:\>javac
    }
}

