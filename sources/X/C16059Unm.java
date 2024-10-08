package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import java.util.ArrayList;

/* renamed from: X.Unm  reason: case insensitive filesystem */
public final class C16059Unm extends C14785U8v {
    public final LeadGenEntryPoint A00;
    public final PromoteData A01;
    public final UserSession A02;
    public final LeadGenBaseFormList A03 = new LeadGenBaseFormList((XIGIGBoostCallToAction) null, (LeadForm) null, (String) null, "", new ArrayList(), false);
    public final String A04;

    public C16059Unm(WYX wyx, PromoteData promoteData) {
        super(new C18028Vk6(wyx));
        this.A01 = promoteData;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A02 = userSession;
        LeadGenEntryPoint leadGenEntryPoint = LeadGenEntryPoint.PROMOTE;
        this.A00 = leadGenEntryPoint;
        this.A04 = AnonymousClass7TF.A0j(leadGenEntryPoint.A00);
    }
}
