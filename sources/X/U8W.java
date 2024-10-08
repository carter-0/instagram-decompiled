package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

public final class U8W extends 2YL {
    public final UserSession A00;
    public final VOH A01;
    public final LeadGenFormData A02;
    public final String A03;
    public final String A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;

    public U8W(C319836rJ r3, UserSession userSession, WYZ wyz) {
        this.A00 = userSession;
        1HR A0f = C13990Tnq.A0f();
        this.A05 = A0f;
        this.A06 = 0u9.A04(A0f);
        Object A002 = r3.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A02 = leadGenFormData;
            this.A03 = C13989Tnp.A0s(leadGenFormData.A01);
            this.A04 = leadGenFormData.A04;
            this.A01 = new VOH(wyz);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
