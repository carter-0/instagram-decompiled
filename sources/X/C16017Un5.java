package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.Un5  reason: case insensitive filesystem */
public abstract class C16017Un5 extends C14746U6n implements C20979X7s {
    public N4R A00;
    public 0sP A01;
    public boolean A02;
    public final IgTextView A03 = DbT.A0a(this, R.id.country_picker_text);
    public final IgFormField A04;
    public final View A05 = requireViewById(R.id.country_picker_field);

    public static final void A01(C16017Un5 un5) {
        X4E wXx;
        C16017Un5 un52 = un5;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = un5.A00;
        if (leadGenFormBaseQuestion != null) {
            if (un5.A02) {
                IgFormField igFormField = un5.A04;
                boolean A1X = DbW.A1X(igFormField);
                wXx = new C19405WXy(igFormField, leadGenFormBaseQuestion, un52, A1X, A1X);
            } else {
                wXx = new C19404WXx(leadGenFormBaseQuestion, un5, true, false);
            }
            un52.A04.setRuleChecker(wXx);
        }
    }

    public void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        String str;
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        this.A04 = z3;
        this.A00 = leadGenFormBaseQuestion;
        IgFormField igFormField = this.A04;
        Context A0S = AnonymousClass7TE.A0S(this);
        Integer num = leadGenFormBaseQuestion.A04;
        if (num != null) {
            str = AnonymousClass7TE.A16(A0S, num.intValue());
        } else {
            str = leadGenFormBaseQuestion.A0A;
        }
        igFormField.setLabelText(str);
        A01(this);
        igFormField.setInputType(W33.A00.A05(leadGenFormBaseQuestion));
        this.A05.setOnClickListener(new WBA((Object) this, 22));
        if (z3 && leadGenFormBaseQuestion.A0I) {
            W0n.A02(igFormField, new C19406WXz(this, 2));
        }
    }

    public void FLQ(N4R n4r) {
        0qQ.A0B(n4r, 0);
        this.A00 = n4r;
        A01(this);
        Context context = getContext();
        this.A05.setContentDescription(DbV.A0u(context, AnonymousClass7TE.A16(context, 2131964683), n4r.A03(), 2131964685));
    }

    public final IgTextView getCountryText() {
        return this.A03;
    }

    public final N4R getCurrentCountry() {
        return this.A00;
    }

    public String getCurrentCountryCode() {
        String A032;
        N4R n4r = this.A00;
        if (n4r == null || (A032 = n4r.A03()) == null) {
            return "";
        }
        return A032;
    }

    public 0sP getOnCountryPickerClickListener() {
        return this.A01;
    }

    public final IgFormField getQuestionForm() {
        return this.A04;
    }

    public final void setCurrentCountry(N4R n4r) {
        this.A00 = n4r;
    }

    public void setOnCountryPickerClickListener(0sP r1) {
        this.A01 = r1;
    }

    public C16017Un5(Context context, AttributeSet attributeSet, int i, 0sP r6) {
        super(context, attributeSet, i);
        this.A01 = r6;
        View.inflate(context, R.layout.lead_gen_view_form_field_with_picker, this);
        IgFormField A0d = DbT.A0d(this, R.id.form_field);
        this.A04 = A0d;
        A0d.setPrismMode(false);
    }
}
