package X;

import android.view.View;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.HashMap;

public final class FNT implements View.OnClickListener {
    public final /* synthetic */ 2bv A00;
    public final /* synthetic */ AnonymousClass4UC A01;
    public final /* synthetic */ C254113rx A02;

    public FNT(2bv r1, AnonymousClass4UC r2, C254113rx r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(-888576407);
        C254113rx r3 = this.A02;
        EditPhoneNumberView editPhoneNumberView = r3.A01;
        if (editPhoneNumberView == null) {
            i = 1822849106;
        } else {
            try {
                PhoneNumberUtil phoneNumberUtil = editPhoneNumberView.A09;
                if (phoneNumberUtil.A0N(phoneNumberUtil.A0F(editPhoneNumberView.getPhoneNumber(), (String) null))) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("custom_param_phone_number", editPhoneNumberView.getPhoneNumber());
                    2bv r2 = this.A00;
                    if (r2 != null) {
                        r2.DbI(this.A01, AnonymousClass05K.A01, A1E);
                    }
                    i = -1792652286;
                }
            } catch (C231962sh unused) {
            }
            editPhoneNumberView.A05.A04(AnonymousClass7TE.A0S(r3.itemView).getString(2131964472));
            i = -1792652286;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
