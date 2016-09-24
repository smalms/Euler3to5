import com.sun.org.apache.xpath.internal.SourceTreeManager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Steven on 2/17/2016.
 */
public class Multiplicities {
    public static void main(String[] args) {
        int MAX= 1000;
        int SOLUTION=0;
        for (int counter=0; counter<MAX; counter++){
                if (counter%3==0 || counter%5==0)
                    SOLUTION+=counter;
        }
        System.out.println(SOLUTION);

    }

}

