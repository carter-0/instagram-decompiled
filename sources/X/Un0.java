package X;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

public class Un0 extends C14746U6n {
    public TextWatcher A00;
    public TextWatcher A01;
    public final IgFormField A02 = DbT.A0d(this, R.id.info_form_field);

    public void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        this.A00 = leadGenFormBaseQuestion;
        this.A04 = z3;
        this.A06 = z2;
        IgFormField igFormField = this.A02;
        igFormField.setPrismMode(z2);
        Context A0S = AnonymousClass7TE.A0S(this);
        Integer num = leadGenFormBaseQuestion.A04;
        if (num != null) {
            str = AnonymousClass7TE.A16(A0S, num.intValue());
        } else {
            str = leadGenFormBaseQuestion.A0A;
        }
        igFormField.setLabelText(str);
        setLastKnownInput(leadGenFormBaseQuestion.A00);
        igFormField.setText(leadGenFormBaseQuestion.A00);
        if (!leadGenFormBaseQuestion.A0I || !z3) {
            igFormField.getBottomSubtitleErrorView().setVisibility(8);
        } else {
            String A0d = AnonymousClass7TF.A0d(getResources(), 2131964697);
            if (z2) {
                igFormField.getBottomSubtitleInfoView().setText(A0d);
                igFormField.getBottomSubtitleInfoView().setVisibility(0);
            } else {
                if (num != null) {
                    str2 = AnonymousClass7TE.A16(A0S, num.intValue());
                } else {
                    str2 = leadGenFormBaseQuestion.A0A;
                }
                igFormField.setLabelText(002.A0h(str2, " (", A0d, ')'));
            }
            W0n.A02(igFormField, new C19406WXz(this, 1));
        }
        if (leadGenFormBaseQuestion.A03 == C16595Uxp.A09) {
            igFormField.A0F();
            if (!z2) {
                igFormField.setAlpha(0.3f);
            }
        }
        igFormField.setRuleChecker(new C19404WXx(leadGenFormBaseQuestion, this, true, z));
        A0I();
        igFormField.setInputType(W33.A00.A05(leadGenFormBaseQuestion));
    }

    public final void A0I() {
        int i;
        if (!(this instanceof C16012Umt)) {
            TextWatcher textWatcher = this.A01;
            if (textWatcher != null) {
                DbU.A1E(textWatcher, this.A02);
            }
            TextWatcher textWatcher2 = this.A00;
            if (textWatcher2 != null) {
                DbU.A1E(textWatcher2, this.A02);
            }
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A00;
            if (leadGenFormBaseQuestion != null) {
                if (this instanceof C16014Umv) {
                    i = 5;
                } else {
                    i = 6;
                }
                W7Z w7z = new W7Z(i, leadGenFormBaseQuestion, this);
                this.A01 = w7z;
                IgFormField igFormField = this.A02;
                igFormField.A0G(w7z);
                String str = leadGenFormBaseQuestion.A08;
                VOK vok = new VOK(this);
                V4Q A002 = Ri5.A00((C16644Uyg) EnumHelper.A00(str, C16644Uyg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
                if (A002 != null) {
                    W7l w7l = new W7l(igFormField, A002, vok);
                    this.A00 = w7l;
                    igFormField.A0G(w7l);
                }
            }
        }
    }

    public final IgFormField getQuestionForm() {
        return this.A02;
    }

    public final void setImeOption(int i) {
        this.A02.getMEditText().setImeOptions(i);
    }

    public Un0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.lead_gen_view_form_customer_info, this);
    }
}
