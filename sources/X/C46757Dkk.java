package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dkk  reason: case insensitive filesystem */
public final class C46757Dkk extends 2YL {
    public final int A00;
    public final UserMonetizationProductType A01;
    public final String A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;
    public final 05G A05;

    public C46757Dkk(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str) {
        int i;
        Object value;
        JV2 jv2;
        int A022 = DbW.A02(1, userSession, userMonetizationProductType);
        this.A04 = userSession;
        this.A01 = userMonetizationProductType;
        this.A02 = str;
        if (userMonetizationProductType == UserMonetizationProductType.IGTV_REVSHARE) {
            i = 2131963660;
            if (C49785F6t.A01(userSession)) {
                i = 2131963702;
            }
        } else {
            i = 2131963624;
        }
        this.A00 = i;
        02z A10 = DbS.A10(new JV2(2131969164, A022, false, false));
        this.A05 = A10;
        this.A03 = 10b.A03(A10);
        do {
            value = A10.getValue();
            if (0qQ.A0K(MonetizationEligibilityDecision.ELIGIBLE.A00, this.A02) || 0qQ.A0K(MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE.A00, this.A02)) {
                jv2 = new JV2(2131969163, A022, true, false);
            } else {
                jv2 = new JV2(2131969164, A022, false, true);
            }
        } while (!A10.AIY(value, jv2));
    }
}
