package X;

import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormSingleMultipleChoiceQuestionView;

public final class WA6 implements View.OnClickListener {
    public final /* synthetic */ IgFrameLayout A00;
    public final /* synthetic */ LeadGenFormBaseQuestion A01;
    public final /* synthetic */ LeadGenFormSingleMultipleChoiceQuestionView A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public WA6(IgFrameLayout igFrameLayout, LeadGenFormBaseQuestion leadGenFormBaseQuestion, LeadGenFormSingleMultipleChoiceQuestionView leadGenFormSingleMultipleChoiceQuestionView, String str, boolean z) {
        this.A04 = z;
        this.A01 = leadGenFormBaseQuestion;
        this.A00 = igFrameLayout;
        this.A02 = leadGenFormSingleMultipleChoiceQuestionView;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-2070608332);
        if (!this.A04 || !this.A01.A0I || !this.A00.isSelected()) {
            LeadGenFormSingleMultipleChoiceQuestionView leadGenFormSingleMultipleChoiceQuestionView = this.A02;
            0kx r2 = new 0kx(leadGenFormSingleMultipleChoiceQuestionView.A00);
            while (r2.hasNext()) {
                ((View) r2.next()).setSelected(false);
            }
            this.A00.setSelected(true);
            leadGenFormSingleMultipleChoiceQuestionView.A0F(this.A01, this.A03);
        } else {
            0kx r22 = new 0kx(this.A02.A00);
            while (r22.hasNext()) {
                ((View) r22.next()).setSelected(false);
            }
        }
        AnonymousClass0fD.A0C(26296975, A05);
    }
}
