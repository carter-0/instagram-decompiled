package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SponsoredAdsDisclaimerType;

/* renamed from: X.3yE  reason: invalid class name and case insensitive filesystem */
public final class C257953yE extends AnonymousClass0T0 implements C257963yF {
    public final SponsoredAdsDisclaimerType A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C257953yE(SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType, String str, String str2, boolean z) {
        0qQ.A0B(str2, 3);
        0qQ.A0B(sponsoredAdsDisclaimerType, 4);
        this.A01 = str;
        this.A03 = z;
        this.A02 = str2;
        this.A00 = sponsoredAdsDisclaimerType;
    }

    public final C257953yE F9I() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257953yE) {
                C257953yE r5 = (C257953yE) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A03 != r5.A03 || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Agq() {
        return this.A01;
    }

    public final boolean BAh() {
        return this.A03;
    }

    public final String BKL() {
        return this.A02;
    }

    public final SponsoredAdsDisclaimerType BKP() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSponsoredAdsDisclaimer", C44366Cdm.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return ((((i + i2) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }
}
