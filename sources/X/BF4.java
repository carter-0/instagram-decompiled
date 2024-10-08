package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;

public final class BF4 extends AnonymousClass0T0 implements C269934fv {
    public final IGBuyWithPrimeExperienceTypes A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final BF4 F45() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF4) {
                BF4 bf4 = (BF4) obj;
                if (!0qQ.A0K(this.A03, bf4.A03) || !0qQ.A0K(this.A01, bf4.A01) || !0qQ.A0K(this.A02, bf4.A02) || !0qQ.A0K(this.A04, bf4.A04) || !0qQ.A0K(this.A05, bf4.A05) || this.A00 != bf4.A00 || !0qQ.A0K(this.A06, bf4.A06) || !0qQ.A0K(this.A07, bf4.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer AXk() {
        return this.A01;
    }

    public final Integer AXl() {
        return this.A02;
    }

    public final String Ac0() {
        return this.A04;
    }

    public final String AfY() {
        return this.A05;
    }

    public final IGBuyWithPrimeExperienceTypes Aj5() {
        return this.A00;
    }

    public final String Anc() {
        return this.A06;
    }

    public final String BaI() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGBuyWithPrimeIABPostClickDataExtensionDict", C9765RgN.A00(this));
    }

    public final String getAccessToken() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A07);
    }

    public BF4(IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = iGBuyWithPrimeExperienceTypes;
        this.A06 = str4;
        this.A07 = str5;
    }
}
