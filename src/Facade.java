/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/9/8
 * Time: 19:26
 * To change this template use File | Settings | File Templates.
 */
public class Facade {
    //我觉得最主要的思想是封装，同时也实现了用户和子系统的耦合。
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade(){
        subSystemA=new SubSystemA();
        subSystemB=new SubSystemB();
        subSystemC=new SubSystemC();
    }

    public void methodA(){
        System.out.println("方法组 A");
        subSystemA.workA();
        subSystemB.workB();
    }

    public void methodB(){
        System.out.println("方法组B");
        subSystemA.workA();
        subSystemC.workC();
    }

}
