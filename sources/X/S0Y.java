package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Locale;

public final class S0Y {
    public final PhoneNumberUtil A00;

    public final String A00(Locale locale, String str) {
        String str2;
        boolean z;
        try {
            PhoneNumberUtil phoneNumberUtil = this.A00;
            String country = locale.getCountry();
            C3259474u r5 = new C3259474u();
            PhoneNumberUtil.A06(phoneNumberUtil, r5, str, country, true, true);
            if (r5.A00 == 1) {
                str2 = phoneNumberUtil.A0I(r5, AnonymousClass05K.A0C);
                0qQ.A07(str2);
                z = new 11S("^\\(\\d{3}\\) \\d{3}-\\d{4}$").A08(str2);
            } else {
                str2 = phoneNumberUtil.A0I(r5, AnonymousClass05K.A01);
                0qQ.A07(str2);
                z = C66580MXl.A1a("+", 1, str2);
            }
            if (z) {
                return str2;
            }
            return null;
        } catch (C231962sh unused) {
        }
    }

    public S0Y(Context context) {
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        0qQ.A07(A01);
        this.A00 = A01;
    }
}
