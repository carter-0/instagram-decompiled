package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.UnP  reason: case insensitive filesystem */
public final class C16036UnP extends U8S {
    public final UserSession A00;
    public final LeadGenFormData A01;
    public final String A02;
    public final WYZ A03;

    public C16036UnP(C319836rJ r2, UserSession userSession, WYZ wyz) {
        super(new VOH(wyz));
        this.A00 = userSession;
        this.A03 = wyz;
        Object A002 = r2.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A01 = leadGenFormData;
            this.A02 = C13989Tnp.A0s(leadGenFormData.A01);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
