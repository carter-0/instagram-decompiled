package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BEX extends AnonymousClass0T0 implements C46276DTf {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final BEX F2Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEX) {
                BEX bex = (BEX) obj;
                if (!0qQ.A0K(this.A01, bex.A01) || !0qQ.A0K(this.A02, bex.A02) || !0qQ.A0K(this.A03, bex.A03) || !0qQ.A0K(this.A00, bex.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B49() {
        return this.A01;
    }

    public final String B4A() {
        return this.A02;
    }

    public final String C5t() {
        return this.A03;
    }

    public final Boolean CBS() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTCrosspostMetadataDict", CX0.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BEX(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = bool;
    }
}
