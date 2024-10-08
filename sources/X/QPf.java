package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.PartnerTypes;

public final class QPf extends AnonymousClass0T0 implements C269924fu {
    public final BuyWithIntegrationPostClickExperienceTypes A00;
    public final PartnerTypes A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final QPf F44() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPf) {
                QPf qPf = (QPf) obj;
                if (!0qQ.A0K(this.A04, qPf.A04) || !0qQ.A0K(this.A02, qPf.A02) || !0qQ.A0K(this.A05, qPf.A05) || !0qQ.A0K(this.A06, qPf.A06) || this.A00 != qPf.A00 || !0qQ.A0K(this.A03, qPf.A03) || !0qQ.A0K(this.A07, qPf.A07) || this.A01 != qPf.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer AXl() {
        return this.A02;
    }

    public final String Ac0() {
        return this.A05;
    }

    public final String AfY() {
        return this.A06;
    }

    public final BuyWithIntegrationPostClickExperienceTypes Aj3() {
        return this.A00;
    }

    public final Long BXh() {
        return this.A03;
    }

    public final String BaI() {
        return this.A07;
    }

    public final PartnerTypes Baq() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGBuyWithIntegrationIABPostClickDataExtensionDict", C9764RgM.A00(this));
    }

    public final String getAccessToken() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public QPf(BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes, PartnerTypes partnerTypes, Integer num, Long l, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = buyWithIntegrationPostClickExperienceTypes;
        this.A03 = l;
        this.A07 = str4;
        this.A01 = partnerTypes;
    }
}
