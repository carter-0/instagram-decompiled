package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN9 extends AnonymousClass0T0 implements XAO {
    public final String A00;
    public final String A01;

    public final UN9 F4u() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN9) {
                UN9 un9 = (UN9) obj;
                if (!0qQ.A0K(this.A00, un9.A00) || !0qQ.A0K(this.A01, un9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BjY() {
        return this.A00;
    }

    public final String BoJ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardRatingsAndReviewsRatingOnlyInfoDict", V7Y.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public UN9(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
