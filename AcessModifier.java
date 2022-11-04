package Access_Modifiers;

class Test{
    String name;
    public int id;
    private double marks;
    protected String address;
    protected String phn_num;

    Test(String name){
        this.name=name;
    }
    Test(int id){
        this.id=id;
    }
    Test(double marks){
        this.marks=marks;
    }
    Test(String address,String phn_num){
        this.address=address;
        this.phn_num=phn_num;
    }
}

public class AcessModifier {
    public static void main(String[] args) {
        Test t1;
        t1=new Test("David");
        System.out.println(t1.name);
        t1=new Test(111);
        System.out.println(t1.id);
        t1=new Test(88.75);
        //  System.out.println(t1.marks);
        t1=new Test("Dhaka","011111111");
        System.out.println(t1.address);
        System.out.println(t1.phn_num);

    }
}
