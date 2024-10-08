package X;

import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.XFBIGBoostAudienceGeolocationImportance;
import java.util.List;

public final class BBN extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final AdsTargetingGender A02;
    public final XFBIGBoostAudienceGeolocationImportance A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBN) {
                BBN bbn = (BBN) obj;
                if (!0qQ.A0K(this.A05, bbn.A05) || this.A02 != bbn.A02 || this.A03 != bbn.A03 || !0qQ.A0K(this.A07, bbn.A07) || !0qQ.A0K(this.A08, bbn.A08) || this.A00 != bbn.A00 || this.A01 != bbn.A01 || !0qQ.A0K(this.A06, bbn.A06) || !0qQ.A0K(this.A04, bbn.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A05);
        return ((((((AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A07(this.A02, A0O) + AnonymousClass7TG.A0C(this.A03)) * 31)) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public BBN(AdsTargetingGender adsTargetingGender, XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance, Boolean bool, String str, String str2, List list, List list2, int i, int i2) {
        AnonymousClass7TG.A1O(str, adsTargetingGender);
        AnonymousClass7TG.A1R(list, list2);
        this.A05 = str;
        this.A02 = adsTargetingGender;
        this.A03 = xFBIGBoostAudienceGeolocationImportance;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = str2;
        this.A04 = bool;
    }
}
