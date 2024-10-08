package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BFC extends AnonymousClass0T0 implements C257983yH {
    public final List A00;

    public final BFC F52() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BFC) && 0qQ.A0K(this.A00, ((BFC) obj).A00));
    }

    public final List BVS() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGSmartTextOverlays", CZO.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public BFC(List list) {
        this.A00 = list;
    }
}
