package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.Locale;

/* renamed from: X.79e  reason: invalid class name and case insensitive filesystem */
public abstract class C3270479e {
    public static final CountryCodeData A00(Context context) {
        0qQ.A0B(context, 0);
        Object systemService = context.getSystemService("phone");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null && (simCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            simCountryIso = Locale.getDefault().getCountry();
        }
        0qQ.A07(simCountryIso);
        String upperCase = simCountryIso.toUpperCase(Locale.ROOT);
        0qQ.A07(upperCase);
        if (upperCase.length() == 0) {
            upperCase = "US";
        }
        return new CountryCodeData(String.valueOf(PhoneNumberUtil.A01(context).A0A(upperCase)), new Locale("", upperCase).getDisplayCountry(), upperCase);
    }

    public static final CountryCodeData A01(Context context, String str) {
        0qQ.A0B(context, 0);
        0qQ.A0B(str, 1);
        if (str.length() == 0) {
            return A00(context);
        }
        int parseInt = Integer.parseInt(str);
        String A01 = PhoneNumberUtil.A01(context).A00.A01(parseInt);
        0qQ.A07(A01);
        return new CountryCodeData(parseInt, A01);
    }
}
