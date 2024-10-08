package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ung  reason: case insensitive filesystem */
public final class C16053Ung extends C14769U8f {
    public final PromoteData A00;
    public final UserSession A01;
    public final String A02 = AnonymousClass7TF.A0j(LeadGenEntryPoint.PROMOTE.A00);

    public C16053Ung(WYX wyx, PromoteData promoteData) {
        super(new C17776Vfn(wyx));
        this.A00 = promoteData;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A01 = userSession;
        String str = promoteData.A1N;
        this.A00 = str == null ? "" : str;
    }
}
