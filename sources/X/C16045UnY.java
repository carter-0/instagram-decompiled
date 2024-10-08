package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;

/* renamed from: X.UnY  reason: case insensitive filesystem */
public final class C16045UnY extends C14786U8w {
    public final UserSession A00;
    public final LeadGenBaseFormList A01;
    public final WYZ A02;
    public final C16602Uxw A03;
    public final LeadGenFormData A04;
    public final Long A05;
    public final String A06;
    public final boolean A07;

    public C16045UnY(C319836rJ r8, UserSession userSession, WYZ wyz) {
        super(new C18059Vki(userSession));
        this.A00 = userSession;
        this.A02 = wyz;
        Object A002 = r8.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A04 = leadGenFormData;
            C16602Uxw uxw = leadGenFormData.A01;
            this.A03 = uxw;
            this.A06 = C13989Tnp.A0s(uxw);
            this.A05 = DbZ.A0d(C13991Tnr.A0h(this.A00));
            LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) r8.A00("args_form_list_data");
            this.A01 = leadGenBaseFormList == null ? new LeadGenBaseFormList((XIGIGBoostCallToAction) null, (LeadForm) null, (String) null, "", new ArrayList(), false) : leadGenBaseFormList;
            this.A07 = C13991Tnr.A1X(r8, AnonymousClass000.A00(1108));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
