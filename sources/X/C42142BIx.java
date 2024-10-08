package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BIx  reason: case insensitive filesystem */
public final class C42142BIx extends AnonymousClass0T0 implements DST {
    public final List A00;

    public final C42142BIx FGb() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42142BIx) && 0qQ.A0K(this.A00, ((C42142BIx) obj).A00));
    }

    public final List B2Y() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTAndAggregatorClientDict", C45095CqD.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public C42142BIx(List list) {
        this.A00 = list;
    }
}
