class ArrayExample{

    void demoArray(){
        int[] age  = new int[5];
        float[] weight = new float[3];
        String[] name = {"Rahul","Raj","Vijay"};

        age[0]= 32;
        age[1]=34;
        age[2]=31;

        System.out.println(age[0]);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

    }
}
public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();

    }
}
