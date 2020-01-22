package tmk;
import java.util.Random;

public class Workers {
    public int pc_secim(){
        Random rd=new Random();
        return (rd.nextInt(3)+1);
    }
}
