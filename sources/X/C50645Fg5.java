package X;

import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.Fg5  reason: case insensitive filesystem */
public final class C50645Fg5 implements G6B {
    public final /* synthetic */ C254113rx A00;

    public C50645Fg5(C254113rx r1) {
        this.A00 = r1;
    }

    public final void ESy(CountryCodeData countryCodeData) {
        EditPhoneNumberView editPhoneNumberView = this.A00.A01;
        if (editPhoneNumberView != null) {
            editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
        }
    }
}
