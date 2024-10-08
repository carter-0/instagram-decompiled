package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.Umv  reason: case insensitive filesystem */
public final class C16014Umv extends C16015Umx {
    public C11463SaR A00;

    public final void A0G(LeadGenFormBaseQuestion leadGenFormBaseQuestion, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(leadGenFormBaseQuestion, 0);
        super.A0G(leadGenFormBaseQuestion, z, z2, z3);
        Context context = getContext();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        C3259474u r2 = null;
        try {
            r2 = A01.A0F(leadGenFormBaseQuestion.A00, (String) null);
        } catch (C231962sh unused) {
        }
        if (r2 != null) {
            String A04 = PhoneNumberUtil.A04(r2);
            IgFormField igFormField = this.A02;
            0qQ.A0A(A04);
            igFormField.setText(A04);
            setLastKnownInput(A0D(A04));
            0qQ.A07(context);
            String A0H = A01.A0H(r2);
            0qQ.A07(A0H);
            FLQ(W33.A00(context, A0H));
            return;
        }
        this.A02.setText("");
        0qQ.A07(context);
        FLQ(W33.A00(context, ""));
        A0F(leadGenFormBaseQuestion, "");
    }

    public final void FLQ(N4R n4r) {
        String str;
        0qQ.A0B(n4r, 0);
        this.A00 = n4r;
        IgFormField igFormField = this.A02;
        CountryCodeData countryCodeData = (CountryCodeData) n4r.A00;
        if (countryCodeData != null) {
            str = countryCodeData.A02();
        } else {
            str = "";
        }
        igFormField.setComboFieldText(str, (String) null);
        C11463SaR saR = this.A00;
        if (saR != null) {
            DbU.A1E(saR, igFormField);
        }
        C11463SaR saR2 = new C11463SaR(getContext(), n4r.A03());
        this.A00 = saR2;
        igFormField.A0G(saR2);
        igFormField.setText(igFormField.getText());
    }
}
