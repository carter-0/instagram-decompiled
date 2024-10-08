package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView;

/* renamed from: X.We6  reason: case insensitive filesystem */
public final class C19704We6 implements X83 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LeadGenFormBaseQuestion A01;
    public final /* synthetic */ LeadGenFormSliderQuestionView A02;

    public final /* synthetic */ void DAc() {
    }

    public final /* synthetic */ void DAh() {
    }

    public C19704We6(LeadGenFormBaseQuestion leadGenFormBaseQuestion, LeadGenFormSliderQuestionView leadGenFormSliderQuestionView, int i) {
        this.A00 = i;
        this.A01 = leadGenFormBaseQuestion;
        this.A02 = leadGenFormSliderQuestionView;
    }

    public final void DaL(int i) {
        int i2 = this.A00;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A01;
        this.A02.A0F(leadGenFormBaseQuestion, String.valueOf(i2 + (i * leadGenFormBaseQuestion.A02)));
    }
}
