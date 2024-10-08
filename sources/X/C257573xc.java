package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3xc  reason: invalid class name and case insensitive filesystem */
public final class C257573xc extends AnonymousClass0T0 implements C257583xd {
    public final List A00;

    public final C257573xc F0I(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C257573xc) && 0qQ.A0K(this.A00, ((C257573xc) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final List B1b() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsShoppingInfoDict", CUT.A00(this));
    }

    public C257573xc(List list) {
        this.A00 = list;
    }

    public final C257583xd E72(1E9 r1) {
        return this;
    }
}
