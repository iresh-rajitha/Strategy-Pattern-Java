package com.ireshrajitha;

public class main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("2+3 = "+ context.execute(2,3));;

        context =  new Context(new OperationMultiply());
        System.out.println("3 x 10 = "+ context.execute(3, 10));;

        context = new Context(new OperationSubstract());
        System.out.println("10 - 4 = "+context.execute(10 , 4));;
    }
}
