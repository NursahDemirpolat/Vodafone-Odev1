public class Fibonacci {

    public static void main(String args[])
    {
        int x=0,y=1,z,i,count=20; //değişken tanımlama

        System.out.println("Fibonacci sayıları");
        System.out.print(x+" "+y);

        for(i=2;i<count;++i)  //önceki sayıyla toplayarak artma
        {
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }

    }
}