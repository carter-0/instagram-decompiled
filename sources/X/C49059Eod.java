package X;

import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;

/* renamed from: X.Eod  reason: case insensitive filesystem */
public abstract class C49059Eod {
    public static CountryCodeData parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CountryCodeData countryCodeData = new CountryCodeData();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("country_code".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    countryCodeData.A01 = A0l;
                } else if ("display_string".equals(A17)) {
                    countryCodeData.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("country".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    countryCodeData.A00 = A0l2;
                }
                r4.A0z();
            }
            return countryCodeData;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
