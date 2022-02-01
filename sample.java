import java.util.*;
interface a
{
    public abstract void tasu();
    public abstract void hiku();
    public abstract void waru();
    public abstract void kakeru();
}
class  aa implements a
{
    private int i;
    private int j;
    private int g;
    public aa(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    public void tasu()
    {
        int q=this.i+this.j;
        this.g=q;
    }
    public  void hiku()
    {
        int q=this.i-this.j;
        this.g=q;
    }
    public  void waru()
    {
        int q=this.i/this.j;
        this.g=q;
    }
    public  void kakeru()
    {
        int q=this.i*this.j;
        this.g=q;
    }
    public void goukei()
    {
        System.out.println("合計は"+g+"です");
    }
}
public class  sample
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("整数を二つ入力してください");
        int qq=s.nextInt();
        int ww=s.nextInt();
        System.out.println("１，足す　２，引く　３，割る　４，かける");
        int zzz=s.nextInt();
        aa z=new aa(qq,ww);
        switch(zzz)
        {
        case 1:
        z.tasu();
        z.goukei();
        break;
        case 2:
        z.hiku();
        z.goukei();
        break;
        case 3:
        z.waru();
        z.goukei();
        break;
        case 4:
        z.kakeru();
        z.goukei();
        break;
        }
    }
}