package X;

import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;

/* renamed from: X.EKx  reason: case insensitive filesystem */
public final class C47877EKx extends C48180EaM {
    public final FanClubNextStepsRecommendationsType A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47877EKx) {
                C47877EKx eKx = (C47877EKx) obj;
                if (this.A00 != eKx.A00 || !0qQ.A0K(this.A02, eKx.A02) || !0qQ.A0K(this.A01, eKx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public C47877EKx(FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = fanClubNextStepsRecommendationsType;
        this.A02 = str;
        this.A01 = str2;
    }
}
