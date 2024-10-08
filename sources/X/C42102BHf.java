package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BHf  reason: case insensitive filesystem */
public final class C42102BHf extends AnonymousClass0T0 implements DUD {
    public final 1Xj A00;
    public final Long A01;
    public final String A02;
    public final List A03;

    public final C42102BHf FC8(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42102BHf) {
                C42102BHf bHf = (C42102BHf) obj;
                if (!0qQ.A0K(this.A01, bHf.A01) || !0qQ.A0K(this.A00, bHf.A00) || !0qQ.A0K(this.A03, bHf.A03) || !0qQ.A0K(this.A02, bHf.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Long AvQ() {
        return this.A01;
    }

    public final 1Xj Bh1() {
        return this.A00;
    }

    public final List BiI() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSuperlativeUserData", C44488Cfk.A00(this));
    }

    public final String getUsername() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public C42102BHf(1Xj r1, Long l, String str, List list) {
        this.A01 = l;
        this.A00 = r1;
        this.A03 = list;
        this.A02 = str;
    }

    public final DUD E9J(1E9 r1) {
        return this;
    }
}
