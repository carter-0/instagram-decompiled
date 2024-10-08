package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.user.model.User;

/* renamed from: X.Jus  reason: case insensitive filesystem */
public final class C60996Jus extends AnonymousClass0T0 {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Long A07;
    public final String A08;

    public C60996Jus(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A07 = l;
        this.A00 = bool;
        this.A04 = str5;
        this.A03 = str6;
        this.A08 = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60996Jus) {
                C60996Jus jus = (C60996Jus) obj;
                if (!0qQ.A0K(this.A05, jus.A05) || !0qQ.A0K(this.A06, jus.A06) || !0qQ.A0K(this.A01, jus.A01) || !0qQ.A0K(this.A02, jus.A02) || !0qQ.A0K(this.A07, jus.A07) || !0qQ.A0K(this.A00, jus.A00) || !0qQ.A0K(this.A04, jus.A04) || !0qQ.A0K(this.A03, jus.A03) || !0qQ.A0K(this.A08, jus.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final User A00() {
        User user = new User(this.A01, this.A06);
        user.A0u(this.A08);
        user.A0t(this.A02);
        user.A03.EOm(BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED);
        return user;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A05)))) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A08);
    }
}
