package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.Uno  reason: case insensitive filesystem */
public final class C16061Uno extends C14767U8d {
    public final UserSession A00;
    public final C16602Uxw A01;
    public final LeadGenFormData A02;
    public final String A03;

    public C16061Uno(C319836rJ r2, UserSession userSession, WYZ wyz) {
        super(new C17778Vfp(wyz));
        this.A00 = userSession;
        Object A002 = r2.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A02 = leadGenFormData;
            C16602Uxw uxw = leadGenFormData.A01;
            this.A01 = uxw;
            this.A03 = C13989Tnp.A0s(uxw);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
