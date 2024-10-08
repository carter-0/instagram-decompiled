package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BIw  reason: case insensitive filesystem */
public final class C42141BIw extends AnonymousClass0T0 implements DT7 {
    public final List A00;

    public C42141BIw(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C42141BIw FGV(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42141BIw) && 0qQ.A0K(this.A00, ((C42141BIw) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List C4e() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTemplateInfoCollection", C45006Coj.A00(this));
    }

    public final DT7 EAU(1E9 r1) {
        return this;
    }
}
