package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BI8 extends AnonymousClass0T0 implements C46291DTu {
    public final Double A00;
    public final String A01;
    public final String A02;

    public final BI8 FD8() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI8) {
                BI8 bi8 = (BI8) obj;
                if (!0qQ.A0K(this.A01, bi8.A01) || !0qQ.A0K(this.A02, bi8.A02) || !0qQ.A0K(this.A00, bi8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C45372CvE AKU() {
        return new C45372CvE(this);
    }

    public final String BwK() {
        return this.A01;
    }

    public final String BwN() {
        return this.A02;
    }

    public final Double C7G() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUserEngagementSignal", C44565Cgz.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BI8(Double d, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = d;
    }
}
