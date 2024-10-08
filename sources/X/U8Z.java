package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

public final class U8Z extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final C17778Vfp A03;
    public final C16602Uxw A04;
    public final LeadGenFormData A05;
    public final String A06;
    public final 05G A07;
    public final 05G A08;

    public U8Z(C319836rJ r3, UserSession userSession, WYZ wyz) {
        this.A02 = userSession;
        this.A03 = new C17778Vfp(wyz);
        Object A002 = r3.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A05 = leadGenFormData;
            C16602Uxw uxw = leadGenFormData.A01;
            this.A04 = uxw;
            this.A06 = C13989Tnp.A0s(uxw);
            02z r0 = new 02z(C16607Uy3.A06);
            this.A07 = r0;
            19B r1 = 19B.A00;
            this.A00 = C226292g8.A00(r1, r0);
            02z A10 = C51970G9q.A10(false);
            this.A08 = A10;
            this.A01 = C226292g8.A00(r1, A10);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
