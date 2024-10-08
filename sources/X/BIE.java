package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIE extends AnonymousClass0T0 implements DTW {
    public final DT5 A00;
    public final DSR A01;
    public final boolean A02;

    public final BIE FDK() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIE) {
                BIE bie = (BIE) obj;
                if (this.A02 != bie.A02 || !0qQ.A0K(this.A00, bie.A00) || !0qQ.A0K(this.A01, bie.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final DT5 ApG() {
        return this.A00;
    }

    public final DSR BZ5() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTVisualRepliesInfo", C44579ChD.A00(this));
    }

    public final boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
        return this.A02;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, i * 31));
    }

    public BIE(DT5 dt5, DSR dsr, boolean z) {
        AnonymousClass7TG.A1Q(dt5, dsr);
        this.A02 = z;
        this.A00 = dt5;
        this.A01 = dsr;
    }
}
