package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN8 extends AnonymousClass0T0 implements C21023XAc {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final UN8 F4t() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN8) {
                UN8 un8 = (UN8) obj;
                if (!0qQ.A0K(this.A01, un8.A01) || !0qQ.A0K(this.A02, un8.A02) || !0qQ.A0K(this.A00, un8.A00) || !0qQ.A0K(this.A03, un8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ax2() {
        return this.A01;
    }

    public final String Bjb() {
        return this.A02;
    }

    public final Integer BpK() {
        return this.A00;
    }

    public final String BpL() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardRatingsAndReviewsDimensionalInfoDict", V7W.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03);
    }

    public UN8(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
    }
}
