package com.company;

public class student {
    private String studentNumber;
    private String studentName;
    private int markForMaths;
    private int markForEnglish;
    private int markForScience;

    public student(String number,String name){
        this.studentNumber= number;
        this.studentName = name;
        this.markForEnglish=0;
        this.markForMaths=0;
        this.markForScience=0;
    }
    public student(String number,String name,int math,int english,int science){
        this.studentNumber= number;
        this.studentName = name;
        this.markForEnglish=english;
        this.markForMaths=math;
        this.markForScience=science;
    }
    public student(){
        this.studentNumber= "2019200000";
        this.studentName = "Tom";
        this.markForEnglish=0;
        this.markForMaths=0;
        this.markForScience=0;
    }

    String getNumber(){
        return studentNumber;
    }
    String getName()
    {
        return studentName;
    }
    void enterMarks(int markForMaths,int markForEnglish,int markForScience)
    {
        this.markForMaths=markForMaths;
        this.markForEnglish=markForEnglish;
        this.markForScience=markForScience;
    }
    int getMarkForMaths(){
        return markForMaths;
    }
    int getMarkForEnglish(){
        return markForEnglish;
    }
    int getMarkForScience(){
        return markForScience;
    }
    double calculateAverage(){
        double i=(double)markForMaths;
        double j=(double)markForEnglish;
        double k=(double)markForScience;
        return (i+j+k)/3.0;
    }
    public String toString(){
        System.out.println("学生信息如下：");
        System.out.println("学号"+studentNumber);
        System.out.println("姓名"+studentName);
        System.out.println("数学成绩"+markForMaths);
        System.out.println("英语成绩"+markForEnglish);
        System.out.println("科学成绩"+markForScience);
        System.out.println("平均成绩"+calculateAverage());
        return "success";
    }
}
