package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

public final class LM8 {
    public final UserSession A00;

    public static final MCA A00(LM8 lm8, C60971JuT juT, Integer num, Integer num2) {
        boolean z = false;
        1NY A0M = DbU.A0M(lm8.A00);
        if (juT.A01 instanceof ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint) {
            A0M.A0A("commerce/reconsideration_destination/");
            A0M.A05();
            A0M.A0Q(CGL.class, C45704D2d.class);
            A0M.A0A = DbS.A0t(juT.A05);
            A0M.A07 = num2;
            A0M.A01 = juT.A00.A00;
            if (juT.A0A && juT.A02 == AnonymousClass05K.A0C) {
                z = true;
            }
            A0M.A0H("is_ptr", z);
            A0M.A0G("pagination_token", juT.A03);
            return JUM.A01(new MEQ(26, (AnonymousClass4D7) null), JUM.A00(new C66186MGx((Object) num, (AnonymousClass4D7) null, 29, 42), A0M.A0M().A03(737)));
        }
        throw AnonymousClass7TE.A1K();
    }

    public LM8(UserSession userSession) {
        this.A00 = userSession;
    }
}
