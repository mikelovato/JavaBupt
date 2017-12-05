package com.company;

public class studentlist {
    private student []list;
    private int total;

    public studentlist(int length){
        list=new student[length];
    }

    public boolean add(student stu){

        try {
            if(total-1<list.length) {
                total++;
                list[total-1] = stu;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(String number){
        try{
            int i=0;
            for(i=0;i<total-1;i++){
                if(number.equals(list[i].getNumber()))
                    break;
            }
            for(int j=i;j<total-1;j++){
                list[j]=list[j+1];
            }
            total=total-1;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(int num){
        try{
            if(num>total||num<0)
                return false;
            else{
                for(int i=num-1;i<total-1;i++)
                    list[i]=list[i+1];
                total--;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmpty(){

        if(total==0)
            return true;
        else
            return false;
    }

    public student  getItem(int no){
        if(no>total)
            return null;
        else{
            return list[no-1];
        }
    }

    public student getItem(String numbe){
        for(student temp:list) {
            String te=temp.getNumber();
            if (numbe.equals(te))
                return temp;
        }
        return null;
    }

    public int getTotal(){
        return total;
    }
}
