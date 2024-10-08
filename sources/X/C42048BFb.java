package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BFb  reason: case insensitive filesystem */
public final class C42048BFb extends AnonymousClass0T0 implements C46253DSi {
    public final String A00;
    public final String A01;

    public final C42048BFb F6R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42048BFb) {
                C42048BFb bFb = (C42048BFb) obj;
                if (!0qQ.A0K(this.A00, bFb.A00) || !0qQ.A0K(this.A01, bFb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BE9() {
        return this.A00;
    }

    public final String BEQ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMoreInfoSubItem", C44220Cah.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C42048BFb(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
