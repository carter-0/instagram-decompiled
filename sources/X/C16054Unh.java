package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.Unh  reason: case insensitive filesystem */
public final class C16054Unh extends C14769U8f {
    public final UserSession A00;
    public final LeadGenFormData A01;
    public final String A02;

    public C16054Unh(C319836rJ r3, UserSession userSession, WYZ wyz) {
        super(new C17776Vfn(wyz));
        this.A00 = userSession;
        Object A002 = r3.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A01 = leadGenFormData;
            this.A02 = C13989Tnp.A0s(leadGenFormData.A01);
            String str = leadGenFormData.A04;
            0qQ.A0B(str, 0);
            this.A00 = str;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
