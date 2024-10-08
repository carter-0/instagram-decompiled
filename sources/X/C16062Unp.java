package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* renamed from: X.Unp  reason: case insensitive filesystem */
public final class C16062Unp extends C14767U8d {
    public final PromoteData A00;
    public final PromoteState A01;
    public final UserSession A02;
    public final String A03 = AnonymousClass7TF.A0j(LeadGenEntryPoint.PROMOTE.A00);
    public final WYX A04;

    public C16062Unp(WYX wyx, PromoteData promoteData, PromoteState promoteState) {
        super(new C17778Vfp(wyx));
        this.A00 = promoteData;
        this.A01 = promoteState;
        this.A04 = wyx;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A02 = userSession;
        JTR.A1V(this.A04);
    }
}
