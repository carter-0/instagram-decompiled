package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BFG extends AnonymousClass0T0 implements DSJ {
    public final DSM A00;

    public final BFG F5C() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BFG) && 0qQ.A0K(this.A00, ((BFG) obj).A00));
    }

    public final DSM Bc0() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public BFG(DSM dsm) {
        this.A00 = dsm;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (Bc0() != null) {
            DSM Bc0 = Bc0();
            if (Bc0 != null) {
                treeUpdaterJNI = Bc0.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("photo3d_info", treeUpdaterJNI);
        }
        return C41845B3m.A0T("XDTImmersiveMediaMetadata", 0Yt.A0B(A0t));
    }
}
