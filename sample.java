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
        System.out.println("���v��"+g+"�ł�");
    }
}
public class  sample
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("���������͂��Ă�������");
        int qq=s.nextInt();
        int ww=s.nextInt();
        System.out.println("�P�C�����@�Q�C�����@�R�C����@�S�C������");
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