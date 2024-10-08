package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.GoU  reason: case insensitive filesystem */
public final class C53437GoU extends AnonymousClass0T0 implements JSL {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C53437GoU(int i, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A0w(1, str, str2, str3);
        0qQ.A0B(str4, 5);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final C53437GoU F1H() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53437GoU) {
                C53437GoU goU = (C53437GoU) obj;
                if (!0qQ.A0K(this.A01, goU.A01) || this.A00 != goU.A00 || !0qQ.A0K(this.A02, goU.A02) || !0qQ.A0K(this.A03, goU.A03) || !0qQ.A0K(this.A04, goU.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String CCC() {
        return this.A01;
    }

    public final int CCE() {
        return this.A00;
    }

    public final String CCF() {
        return this.A02;
    }

    public final String CCG() {
        return this.A03;
    }

    public final String CCH() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTChainingUpsellCardDict", HTR.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, (AnonymousClass7TE.A0O(this.A01) + this.A00) * 31)));
    }
}
