package X;

import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

public final class U8Y extends 2YL {
    public final 2Fk A00;
    public final WYX A01;
    public final PromoteData A02;
    public final PromoteState A03;
    public final UserSession A04;
    public final Long A05;
    public final String A06;
    public final 05G A07;

    public U8Y(C319836rJ r3, WYX wyx, PromoteData promoteData, PromoteState promoteState) {
        this.A02 = promoteData;
        this.A03 = promoteState;
        this.A01 = wyx;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A04 = userSession;
        this.A06 = (String) r3.A00("lead_gen_cta_flow_backstack_name");
        this.A05 = DbZ.A0d(C13991Tnr.A0h(userSession));
        02z A012 = 106.A01(promoteData.A0d);
        this.A07 = A012;
        this.A00 = DbT.A0G(A012);
    }
}
