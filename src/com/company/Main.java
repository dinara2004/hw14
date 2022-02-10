package com.company;

public class Main {

    public static void main(String[] args) {
//        Class деген класс тузунуз
//        ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана массив деген сан сактаган массив бар
//        конструктор жазыныз
//        мейн методтон Classтын объектисин тузунуз
//        объекттин полелерине конструктор аркылуу маани бериниз
//        ошол объекттин полелерин консольго чыгарыныз.
        Class class1 = new Class(5, "Java", new int[]{1,2,3,4,5});
        System.out.print(class1.getNum()+" "+class1.getWord()+" ");
        class1.getMassiv();


    }
}
