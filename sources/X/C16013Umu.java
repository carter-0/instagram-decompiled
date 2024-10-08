package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.Umu  reason: case insensitive filesystem */
public final class C16013Umu extends C16017Un5 {
    public C11463SaR A00;

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        IgFormField igFormField = this.A04;
        igFormField.setAutofillHints(new String[]{Pxd.A00(840)});
        Context context = getContext();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        C3259474u r1 = null;
        try {
            r1 = A01.A0F(leadGenFormBaseQuestion.A00, (String) null);
        } catch (C231962sh unused) {
        }
        if (r1 != null) {
            String A04 = PhoneNumberUtil.A04(r1);
            0qQ.A0A(A04);
            igFormField.setText(A04);
            setLastKnownInput(A0D(A04));
            0qQ.A07(context);
            String A0H = A01.A0H(r1);
            0qQ.A07(A0H);
            FLQ(W33.A00(context, A0H));
        } else {
            igFormField.setText("");
            0qQ.A07(context);
            FLQ(W33.A00(context, ""));
            A0F(leadGenFormBaseQuestion, "");
        }
        igFormField.A0G(new W7Z(4, leadGenFormBaseQuestion, this));
    }

    public final void FLQ(N4R n4r) {
        String str;
        0qQ.A0B(n4r, 0);
        super.FLQ(n4r);
        IgTextView igTextView = this.A03;
        CountryCodeData countryCodeData = (CountryCodeData) n4r.A00;
        if (countryCodeData != null) {
            str = countryCodeData.A02();
        } else {
            str = "";
        }
        igTextView.setText(str);
        C11463SaR saR = this.A00;
        if (saR != null) {
            DbU.A1E(saR, this.A04);
        }
        C11463SaR saR2 = new C11463SaR(getContext(), n4r.A03());
        this.A00 = saR2;
        IgFormField igFormField = this.A04;
        igFormField.A0G(saR2);
        igFormField.setText(igFormField.getText());
    }
}
