import java.util.*;
import java.lang.Math;

public class App {
    public static float sqr=0;
    public static ArrayList<Integer> ar=new ArrayList<Integer>();
    public static int finalMul=0;

    public static void ascii(String in){
        //System.out.println("All chars:");
        for(int i=0;i<in.length();i++){
            ar.add((int)in.charAt(i));
            //System.out.println(ar.get(i));
        }
    }

    public static void addSqr(){
        int add=0;
        for(int i=0;i<ar.size();i++){
            int temp=ar.get(i);
            add=add+temp;
        }
        sqr=(float)Math.sqrt(add);
        //System.out.println("SQuare root is: "+sqr);
    }

    public static int countDigits(){
        int count=0;
        double temp=sqr;
        while(temp>1){
            temp=temp/10;
            count++;
        }
        return count;
    }

    public static void mul(){
        //System.out.println("Count is:" + countDigits());
        double mul=0;
        if(countDigits()==0){
            mul=sqr*(Math.pow(10, 5));
        }
        else{
            mul=sqr*(Math.pow(10, 5-(countDigits())));
        }
        finalMul=(int)Math.round(mul);
        //System.out.println("Final product is:" + finalMul);
    }

    
    public static void convHex(){
        int temp=finalMul;
        int temp2;
        ArrayList<Character> hex=new ArrayList<Character>();
        while(temp>1){
            temp2=temp%16;
            temp=temp/16;
            if(temp2<10){
                hex.add((char)(temp2+48));
            }
            else{
                hex.add((char)(temp2+55));
            }
        }
        char rev[]=new char[hex.size()+1];
        int j=0;
        for(int i=hex.size();i>0;i--){
            rev[i]=hex.get(j);
            j++;
        }
        System.out.println("\nThe hash for the sentence is: ");
        for(int i=0;i<=hex.size();i++){
            System.out.print(rev[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=in.nextLine();
        ascii(s);
        addSqr();
        mul();
        convHex();
        in.close();
    }
}
