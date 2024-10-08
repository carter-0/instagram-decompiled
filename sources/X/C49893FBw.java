package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.FBw  reason: case insensitive filesystem */
public abstract class C49893FBw {
    /* JADX WARNING: type inference failed for: r0v15, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    public static final BusinessInfo A00(Context context, F16 f16) {
        FEa fEa = new FEa();
        fEa.A09 = f16.A02;
        fEa.A0B = f16.A09;
        fEa.A0J = f16.A04;
        fEa.A0O = true;
        fEa.A0A = f16.A03;
        fEa.A02 = f16.A00;
        fEa.A03 = f16.A01;
        String str = f16.A0A;
        if (str.length() != 0) {
            String str2 = f16.A0B;
            if (str2.length() != 0) {
                String stripSeparators = PhoneNumberUtils.stripSeparators(002.A0T(str, str2, ' '));
                String str3 = f16.A0A;
                String str4 = f16.A0B;
                ? obj = new Object();
                obj.A01 = str3;
                obj.A02 = str4;
                obj.A03 = stripSeparators;
                obj.A00 = "";
                fEa.A01 = obj;
            }
        }
        if (f16.A05.length() != 0) {
            String str5 = f16.A06;
            if (str5.length() != 0) {
                String A05 = AnonymousClass703.A05(context, f16.A08, f16.A07, str5);
                0qQ.A07(A05);
                fEa.A00 = new Address(f16.A08, f16.A06, f16.A05, f16.A07, A05);
            }
        }
        return new BusinessInfo(fEa);
    }

    public static final void A02(Context context, AnonymousClass07i r4, G7X g7x, 0lg r6) {
        0qQ.A0B(r6, 2);
        1NY A0a = AnonymousClass7TG.A0a(r6);
        A0a.A0A("business/account/fetch_account_type_quick_conversion_settings/");
        A0a.A0Q(DvE.class, F7M.class);
        1OC A0K = DbW.A0K(A0a);
        A0K.A00 = C47697EDg.A00(g7x, 35);
        1ES.A00(context, r4, A0K);
    }

    public static final Map A01(F16 f16) {
        String str;
        String str2;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (f16 != null) {
            A1E.put("category_id", f16.A02);
            A1E.put("category_name", f16.A03);
            16V r0 = f16.A00;
            String str3 = "";
            if (r0 == null || (str = r0.A01) == null) {
                str = str3;
            }
            A1E.put("category_account_type", str);
            16V r02 = f16.A01;
            if (!(r02 == null || (str2 = r02.A01) == null)) {
                str3 = str2;
            }
            A1E.put("previous_account_type", str3);
            A1E.put("address_city_id", f16.A05);
            A1E.put("address_city_name", f16.A06);
            A1E.put("address_postal_code", f16.A07);
            A1E.put("address_street", f16.A08);
            A1E.put("email", f16.A09);
            A1E.put("is_page_convertable", String.valueOf(f16.A0D));
            A1E.put("page_id", f16.A04);
            A1E.put("phone_country_code", f16.A0A);
            A1E.put("phone_national_number", f16.A0B);
            A1E.put("source", f16.A0C);
        }
        return 0Yt.A0B(A1E);
    }
}
