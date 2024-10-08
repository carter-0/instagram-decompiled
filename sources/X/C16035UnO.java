package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.UnO  reason: case insensitive filesystem */
public final class C16035UnO extends U8S {
    public final PromoteData A00;
    public final UserSession A01;
    public final String A02 = AnonymousClass7TF.A0j(LeadGenEntryPoint.PROMOTE.A00);
    public final WYX A03;

    public C16035UnO(WYX wyx, PromoteData promoteData) {
        super(new VOH(wyx));
        this.A00 = promoteData;
        this.A03 = wyx;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A01 = userSession;
    }
}
