package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BEQ extends AnonymousClass0T0 implements DSY {
    public final String A00;
    public final String A01;

    public final BEQ F27() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEQ) {
                BEQ beq = (BEQ) obj;
                if (!0qQ.A0K(this.A00, beq.A00) || !0qQ.A0K(this.A01, beq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AmJ() {
        return this.A00;
    }

    public final String AmK() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTContextualAdsInfo", CWL.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public BEQ(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
