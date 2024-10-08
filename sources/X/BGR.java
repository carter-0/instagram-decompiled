package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BGR extends AnonymousClass0T0 implements DUQ {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final BGR F95() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGR) {
                BGR bgr = (BGR) obj;
                if (!0qQ.A0K(this.A01, bgr.A01) || !0qQ.A0K(this.A05, bgr.A05) || !0qQ.A0K(this.A02, bgr.A02) || !0qQ.A0K(this.A00, bgr.A00) || !0qQ.A0K(this.A03, bgr.A03) || !0qQ.A0K(this.A04, bgr.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AZ4() {
        return this.A01;
    }

    public final List Ace() {
        return this.A05;
    }

    public final String Anf() {
        return this.A02;
    }

    public final Integer Blx() {
        return this.A00;
    }

    public final String Bm0() {
        return this.A03;
    }

    public final String C4Z() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShowreelPayload", C44355Cdb.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public BGR(Integer num, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A05 = list;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
        this.A04 = str4;
    }
}
