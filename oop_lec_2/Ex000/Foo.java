package oop_lec_2.Ex000;

class Doo extends Foo {
    // public void M() {
    //     Foo.count=123; protected static Integer count;
    // }
}

public class Foo {
    public Integer value;

    protected static Integer count;

    public static Integer getCount(){
        return count;
    }

    static {
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
