package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BEI extends AnonymousClass0T0 implements DSI {
    public final List A00;

    public BEI(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final BEI F1n() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BEI) && 0qQ.A0K(this.A00, ((BEI) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List CEY() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsTemplatesReusableMediaAssetInfo", C44098CVp.A00(this));
    }
}
