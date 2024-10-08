package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;

public final class BE0 extends AnonymousClass0T0 implements C257603xf {
    public final ShoppingIGFundedIncentivesShopAdsBannerStyles A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final BE0 F15() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE0) {
                BE0 be0 = (BE0) obj;
                if (!0qQ.A0K(this.A01, be0.A01) || !0qQ.A0K(this.A02, be0.A02) || this.A00 != be0.A00 || !0qQ.A0K(this.A03, be0.A03) || !0qQ.A0K(this.A04, be0.A04) || !0qQ.A0K(this.A05, be0.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Air() {
        return this.A01;
    }

    public final String AwU() {
        return this.A02;
    }

    public final ShoppingIGFundedIncentivesShopAdsBannerStyles AyI() {
        return this.A00;
    }

    public final String BGl() {
        return this.A03;
    }

    public final String C4g() {
        return this.A04;
    }

    public final String C4h() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBuyerIncentiveAdsInfo", CVE.A00(this));
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public BE0(ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = shoppingIGFundedIncentivesShopAdsBannerStyles;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
