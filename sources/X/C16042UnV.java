package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;

/* renamed from: X.UnV  reason: case insensitive filesystem */
public final class C16042UnV extends C14766U8c {
    public final UserSession A00;
    public final C18059Vki A01;
    public final LeadGenConsumerFormData A02;

    public C16042UnV(C319836rJ r2, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new C18059Vki(userSession);
        this.A02 = (LeadGenConsumerFormData) r2.A00("args_consumer_form_data");
    }
}
