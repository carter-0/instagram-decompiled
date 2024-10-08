package X;

import android.content.Context;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.Umt  reason: case insensitive filesystem */
public final class C16012Umt extends Un0 implements C20979X7s {
    public 0sP A00;
    public N4R A01;

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        String str;
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        this.A00 = leadGenFormBaseQuestion;
        this.A06 = z2;
        this.A04 = z3;
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
        N4R A002 = W33.A00(A0S, leadGenFormBaseQuestion.A00);
        this.A01 = A002;
        String A03 = A002.A03();
        0qQ.A0B(A03, 0);
        leadGenFormBaseQuestion.A00 = A03;
        igFormField.setText(A002.A04());
        igFormField.setRuleChecker(new C19404WXx(leadGenFormBaseQuestion, this, false, z));
        igFormField.setInPickerMode(new WBA((Object) this, 21));
    }

    public final void FLQ(N4R n4r) {
        0qQ.A0B(n4r, 0);
        this.A01 = n4r;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A00;
        if (leadGenFormBaseQuestion != null && !0qQ.A0K(n4r.A03(), leadGenFormBaseQuestion.A00)) {
            A0F(leadGenFormBaseQuestion, n4r.A03());
            X4J x4j = this.A02;
            if (x4j != null) {
                x4j.DwH(leadGenFormBaseQuestion);
            }
            this.A02.setText(n4r.A04());
        }
    }

    public String getCurrentCountryCode() {
        String A03;
        N4R n4r = this.A01;
        if (n4r == null || (A03 = n4r.A03()) == null) {
            return "";
        }
        return A03;
    }

    public 0sP getOnCountryPickerClickListener() {
        return this.A00;
    }

    public void setOnCountryPickerClickListener(0sP r1) {
        this.A00 = r1;
    }
}
