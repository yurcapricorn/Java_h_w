/**
 * Created by user on 16-Nov-16.
 */
public class triangle {
    public static void main(String[] args){
        String a = "*";
        String b = "";
        for (int i=1;i<18;i++){
            if (i<=9){b+=a;}
            else{b = b.substring(0, b.length() - 1);}
        System.out.println(b);
        }
    }
}
