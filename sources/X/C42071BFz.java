package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BFz  reason: case insensitive filesystem */
public final class C42071BFz extends AnonymousClass0T0 implements DTM {
    public final String A00;
    public final List A01;
    public final List A02;

    public final C42071BFz F7u() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42071BFz) {
                C42071BFz bFz = (C42071BFz) obj;
                if (!0qQ.A0K(this.A01, bFz.A01) || !0qQ.A0K(this.A02, bFz.A02) || !0qQ.A0K(this.A00, bFz.A00)) {
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

    public final List BIw() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductPickerPageCTAInfo", Cc3.A00(this));
    }

    public final String getProductId() {
        return this.A00;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A00);
    }

    public C42071BFz(List list, List list2, String str) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = str;
    }
}
