package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.B7o  reason: case insensitive filesystem */
public final class C41937B7o extends AnonymousClass0T0 implements DU9 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final C41937B7o F8e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41937B7o) {
                C41937B7o b7o = (C41937B7o) obj;
                if (!0qQ.A0K(this.A01, b7o.A01) || !0qQ.A0K(this.A00, b7o.A00) || !0qQ.A0K(this.A02, b7o.A02) || this.A04 != b7o.A04 || !0qQ.A0K(this.A03, b7o.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AyF() {
        return this.A01;
    }

    public final Integer AzJ() {
        return this.A00;
    }

    public final String BCo() {
        return this.A02;
    }

    public final List BQQ() {
        return this.A03;
    }

    public final boolean CSO() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTReelsTappableTooltip", C44311Cct.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public C41937B7o(Integer num, String str, String str2, List list, boolean z) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = list;
    }
}
