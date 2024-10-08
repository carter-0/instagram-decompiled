package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;
import java.io.IOException;

/* renamed from: X.D1a  reason: case insensitive filesystem */
public abstract class C45675D1a {
    public static CurrencyAmountInfoImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("amount".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("amount_with_offset".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (!"currency".equals(A17)) {
                    num = C41847B3o.A13(r7, num, A17, "offset");
                } else if (r7.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r7.A1P();
                }
                r7.A0z();
            }
            return new CurrencyAmountInfoImpl(num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, CurrencyAmountInfoImpl currencyAmountInfoImpl) {
        r2.A0c();
        String str = currencyAmountInfoImpl.A01;
        if (str != null) {
            r2.A0R("amount", str);
        }
        String str2 = currencyAmountInfoImpl.A02;
        if (str2 != null) {
            r2.A0R("amount_with_offset", str2);
        }
        String str3 = currencyAmountInfoImpl.A03;
        if (str3 != null) {
            r2.A0R("currency", str3);
        }
        Integer num = currencyAmountInfoImpl.A00;
        if (num != null) {
            r2.A0P("offset", num.intValue());
        }
        r2.A0Z();
    }
}
