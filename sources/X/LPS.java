package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.io.StringWriter;

public abstract class LPS {
    public static C61000Juw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61000Juw juw = new C61000Juw();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    juw.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("price_amount".equals(A17)) {
                    juw.A02 = AnonymousClass7TF.A0X(r3);
                } else if ("price_currency".equals(A17)) {
                    juw.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("product_variants".equals(A17)) {
                    juw.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("action".equals(A17)) {
                    C41846B3n.A1A(r3);
                    juw.A01 = AnonymousClass05K.A0N;
                } else if ("formatted_price".equals(A17)) {
                    juw.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("inventory_quantity".equals(A17)) {
                    juw.A00 = r3.A1D();
                } else if ("is_bip_order".equals(A17)) {
                    juw.A07 = r3.A0d();
                }
                r3.A0z();
            }
            return juw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(C61000Juw juw) {
        StringWriter A0v = JTO.A0v();
        17W A0Q = JTO.A0Q(A0v);
        A01(A0Q, juw);
        return JTP.A0n(A0Q, A0v);
    }

    public static void A01(17Z r2, C61000Juw juw) {
        String str;
        r2.A0c();
        String str2 = juw.A05;
        if (str2 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str2);
        }
        Integer num = juw.A02;
        if (num != null) {
            r2.A0P("price_amount", num.intValue());
        }
        String str3 = juw.A03;
        if (str3 != null) {
            r2.A0R("price_currency", str3);
        }
        String str4 = juw.A06;
        if (str4 != null) {
            r2.A0R("product_variants", str4);
        }
        Integer num2 = juw.A01;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str = "update";
                    break;
                case 2:
                    str = "delete";
                    break;
                case 3:
                    str = "";
                    break;
                default:
                    str = "create";
                    break;
            }
            r2.A0R("action", str);
        }
        String str5 = juw.A04;
        if (str5 != null) {
            r2.A0R("formatted_price", str5);
        }
        r2.A0P("inventory_quantity", juw.A00);
        r2.A0S("is_bip_order", juw.A07);
        r2.A0Z();
    }
}
