package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.Unc  reason: case insensitive filesystem */
public final class C16049Unc extends C14772U8i {
    public final int A00;
    public final UserSession A01;
    public final LeadGenFormData A02;
    public final String A03;
    public final boolean A04;
    public final WYZ A05;

    public C16049Unc(C319836rJ r7, UserSession userSession, WYZ wyz) {
        super(r7, new VOI(wyz));
        int size;
        LeadFormCustomQuestion leadFormCustomQuestion;
        this.A01 = userSession;
        this.A05 = wyz;
        Object A002 = r7.A00("args_form_data");
        if (A002 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A002;
            this.A02 = leadGenFormData;
            Number number = (Number) r7.A00("args_custom_question_index");
            if (number != null) {
                size = number.intValue();
            } else {
                size = leadGenFormData.A06.size();
            }
            this.A00 = size;
            int i = 0;
            this.A04 = AnonymousClass7TF.A1T(size, leadGenFormData.A06.size());
            this.A03 = C13989Tnp.A0s(leadGenFormData.A01);
            if (this.A04 && (leadFormCustomQuestion = (LeadFormCustomQuestion) 00k.A0O(leadGenFormData.A06, this.A00)) != null) {
                this.A08.Epw(leadFormCustomQuestion.A01);
                for (Object next : leadFormCustomQuestion.A02) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    05G[] r1 = this.A0A;
                    if (i < r1.length) {
                        r1[i].Epw(next);
                    }
                    i = i2;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
