import java.util.*;
interface calci{
public int getsum(int n1,int n2);
}
class calciimpl implements calci{
    public int getsum(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
public class driver{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(n1+"+"+n2=getsum(int n1,int n2));
    }
}