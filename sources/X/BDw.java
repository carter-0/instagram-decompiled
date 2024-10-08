package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BDw extends AnonymousClass0T0 implements DSF {
    public final C46274DTd A00;

    public final BDw F0t() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BDw) && 0qQ.A0K(this.A00, ((BDw) obj).A00));
    }

    public final C46274DTd BFU() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public BDw(C46274DTd dTd) {
        this.A00 = dTd;
    }

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
        return C41845B3m.A0T("XDTBloksStickerNativeProps", 0Yt.A0B(A0t));
    }
}
