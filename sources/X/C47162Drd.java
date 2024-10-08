package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.List;

/* renamed from: X.Drd  reason: case insensitive filesystem */
public final class C47162Drd extends AnonymousClass0T0 {
    public String A00;
    public final UserMonetizationProductType A01;
    public final C48185EaR A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47162Drd) {
                C47162Drd drd = (C47162Drd) obj;
                if (this.A01 != drd.A01 || this.A09 != drd.A09 || !0qQ.A0K(this.A04, drd.A04) || !0qQ.A0K(this.A05, drd.A05) || !0qQ.A0K(this.A02, drd.A02) || !0qQ.A0K(this.A03, drd.A03) || this.A08 != drd.A08 || !0qQ.A0K(this.A07, drd.A07) || !0qQ.A0K(this.A00, drd.A00) || !0qQ.A0K(this.A06, drd.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return ((((AnonymousClass7TF.A09(this.A08, (((((((AnonymousClass7TF.A09(this.A09, A0K) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A06);
    }

    public C47162Drd(UserMonetizationProductType userMonetizationProductType, C48185EaR eaR, Integer num, Integer num2, Integer num3, String str, String str2, List list, boolean z, boolean z2) {
        this.A01 = userMonetizationProductType;
        this.A09 = z;
        this.A04 = num;
        this.A05 = num2;
        this.A02 = eaR;
        this.A03 = num3;
        this.A08 = z2;
        this.A07 = list;
        this.A00 = str;
        this.A06 = str2;
    }
}
