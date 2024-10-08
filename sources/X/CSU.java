package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CSU extends 17P implements C250463lU {
    public final C250443lS BI2() {
        return (C250443lS) A05(301526158, CST.class);
    }

    public final C250453lT FG1() {
        C250433lR r1;
        C250443lS BI2 = BI2();
        if (BI2 != null) {
            r1 = BI2.FG2();
        } else {
            r1 = null;
        }
        return new C250453lT(r1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CSU, X.3lU] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (BI2() != null) {
            C250443lS BI2 = BI2();
            if (BI2 != null) {
                treeUpdaterJNI = BI2.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("instruction", treeUpdaterJNI);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
