package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIK extends AnonymousClass0T0 implements DUF {
    public final BEB A00;
    public final String A01;
    public final String A02;

    public final BIK FDZ(1E9 r1) {
        return this;
    }

    public final BIK FDa(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIK) {
                BIK bik = (BIK) obj;
                if (!0qQ.A0K(this.A01, bik.A01) || !0qQ.A0K(this.A02, bik.A02) || !0qQ.A0K(this.A00, bik.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ DU6 Bch() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsAppAttribution", C44623Chv.A00(this));
    }

    public final String getAttributionAppId() {
        return this.A01;
    }

    public final String getAttributionAppName() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)));
    }

    public BIK(BEB beb, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, beb);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = beb;
    }

    public final DUF E9Z(1E9 r1) {
        return this;
    }
}
