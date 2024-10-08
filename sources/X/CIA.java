package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CIA extends 17P implements DSF {
    public final C46274DTd BFU() {
        return (C46274DTd) A05(-1629695031, CIB.class);
    }

    public final BDw F0t() {
        BDx bDx;
        C46274DTd BFU = BFU();
        if (BFU != null) {
            bDx = BFU.F0s();
        } else {
            bDx = null;
        }
        return new BDw(bDx);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CIA, X.DSF] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (BFU() != null) {
            C46274DTd BFU = BFU();
            if (BFU != null) {
                treeUpdaterJNI = BFU.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("ig_mention", treeUpdaterJNI);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
