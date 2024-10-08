package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Eer  reason: case insensitive filesystem */
public abstract class C48458Eer {
    public static final String A00(C307896Rx r3, AnonymousClass6Tm r4) {
        String A0g = DbY.A0g(r4);
        0lg A0B = C308206Td.A0B(r3);
        FragmentActivity A04 = C308206Td.A04(r3);
        CountryCodeData countryCodeData = ((RegFlowExtras) A0B.A01(RegFlowExtras.class, G1R.A00)).A01;
        if (countryCodeData == null) {
            countryCodeData = C3270479e.A00(A04);
        }
        try {
            return String.valueOf(Long.valueOf(PhoneNumberUtil.A01(A04).A0F(A0g, countryCodeData.A00).A02));
        } catch (C231962sh unused) {
            return null;
        }
    }
}
