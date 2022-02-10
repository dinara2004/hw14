package com.company;

public class Class {
    private int num;
    private String word;
    private int [] massiv;

    public Class() {
    }

    public Class(int num, String word, int[] massiv) {
        this.num = num;
        this.word = word;
        this.massiv = massiv;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassiv() {
        for (int a: massiv) {
            System.out.print(a+" ");

        }
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }


}
