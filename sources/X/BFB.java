package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFB extends AnonymousClass0T0 implements C46248DSd {
    public final String A00;
    public final String A01;

    public final BFB F4y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFB) {
                BFB bfb = (BFB) obj;
                if (!0qQ.A0K(this.A00, bfb.A00) || !0qQ.A0K(this.A01, bfb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BXn() {
        return this.A00;
    }

    public final String Bhf() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGPromoAdsPromoCodeDict", CZI.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BFB(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
