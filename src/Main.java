/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/9/8
 * Time: 19:51
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Facade facade=new Facade();
        System.out.println("调用方法A");
        facade.methodA();
        System.out.println("调用方法B");
        facade.methodB();
    }
}
