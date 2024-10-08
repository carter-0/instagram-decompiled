package X;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class OTR {
    public final int A00;
    public final C70756OKc A01;
    public final List A02;
    public final Random A03 = new Random();

    public static final C8888REf A00(String str, List list) {
        if (str != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8888REf rEf = (C8888REf) ((0sP) it.next()).invoke(str);
                if (rEf != null) {
                    return rEf;
                }
            }
        }
        return null;
    }

    public OTR(C70756OKc oKc, List list, int i) {
        this.A02 = list;
        this.A01 = oKc;
        this.A00 = i;
    }
}
