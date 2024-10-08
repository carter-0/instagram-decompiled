package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BF0 extends AnonymousClass0T0 implements C3499182k {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final BF0 F3d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF0) {
                BF0 bf0 = (BF0) obj;
                if (!0qQ.A0K(this.A02, bf0.A02) || this.A00 != bf0.A00 || !0qQ.A0K(this.A03, bf0.A03) || this.A01 != bf0.A01 || !0qQ.A0K(this.A04, bf0.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int B6u() {
        return this.A00;
    }

    public final String BAL() {
        return this.A03;
    }

    public final int BRT() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTHallpass", CYV.A00(this));
    }

    public final String getColor() {
        return this.A02;
    }

    public final String getName() {
        return this.A04;
    }

    public final int hashCode() {
        String str = this.A03;
        return C41845B3m.A01(this.A04, (AnonymousClass7TF.A08(str, (AnonymousClass7TE.A0O(this.A02) + this.A00) * 31) + this.A01) * 31);
    }

    public BF0(String str, int i, String str2, int i2, String str3) {
        AnonymousClass7TG.A1P(str, str2);
        0qQ.A0B(str3, 5);
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = i2;
        this.A04 = str3;
    }
}
