package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BEd  reason: case insensitive filesystem */
public final class C42028BEd extends AnonymousClass0T0 implements DTD {
    public final String A00;
    public final List A01;
    public final List A02;

    public final C42028BEd F2i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42028BEd) {
                C42028BEd bEd = (C42028BEd) obj;
                if (!0qQ.A0K(this.A01, bEd.A01) || !0qQ.A0K(this.A00, bEd.A00) || !0qQ.A0K(this.A02, bEd.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Abc() {
        return this.A01;
    }

    public final String Azc() {
        return this.A00;
    }

    public final List BIw() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTDynamicAdsLinks", CXJ.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C42028BEd(List list, List list2, String str) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = list2;
    }
}
