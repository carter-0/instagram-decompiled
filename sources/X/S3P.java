package X;

import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;
import java.util.HashMap;
import java.util.Map;

public final class S3P {
    public String A00;
    public final IgFormField A01;
    public final IgFormField A02;
    public final IgFormField A03;
    public final IgFormField A04;
    public final IgFormField A05;
    public final IgFormField A06;
    public final IgFormField A07;
    public final IgFormField A08;
    public final IgFormField A09;

    public S3P(Context context, View view) {
        this.A07 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.given_name);
        this.A06 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.family_name);
        this.A03 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.address_line_1);
        this.A04 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.address_line_2);
        this.A01 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.address_level_1);
        this.A02 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.address_level_2);
        this.A08 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.postal_code);
        this.A05 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.email);
        this.A09 = (IgFormField) AnonymousClass7TF.A0F(view, R.id.tel);
        IgFormField igFormField = this.A05;
        igFormField.setRuleChecker(new C50498Fck(context));
        this.A07.setInputType(8288);
        this.A06.setInputType(8288);
        for (IgFormField inputType : 0sr.A1P(new IgFormField[]{this.A03, this.A04, this.A01, this.A02})) {
            inputType.setInputType(8304);
        }
        this.A08.setInputType(112);
        igFormField.setInputType(33);
        this.A09.setInputType(3);
    }

    public final AutofillData A00() {
        HashMap A1E = AnonymousClass7TE.A1E();
        String str = this.A00;
        if (str != null) {
            A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        C9774RgW.A00(this.A07, "given-name", A1E);
        C9774RgW.A00(this.A06, "family-name", A1E);
        C9774RgW.A00(this.A03, "address-line1", A1E);
        C9774RgW.A00(this.A04, "address-line2", A1E);
        C9774RgW.A00(this.A01, "address-level1", A1E);
        C9774RgW.A00(this.A02, "address-level2", A1E);
        C9774RgW.A00(this.A08, "postal-code", A1E);
        C9774RgW.A00(this.A05, "email", A1E);
        C9774RgW.A00(this.A09, "tel", A1E);
        return new AutofillData((Map) A1E);
    }
}
