package X;

import java.io.IOException;

/* renamed from: X.Cya  reason: case insensitive filesystem */
public abstract class C45562Cya {
    public static C42040BEs parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("background_height".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("background_url".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("background_width".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                } else if (C41845B3m.A1A(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C42040BEs(num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42040BEs bEs) {
        r2.A0c();
        Integer num = bEs.A00;
        if (num != null) {
            r2.A0P("background_height", num.intValue());
        }
        String str = bEs.A02;
        if (str != null) {
            r2.A0R("background_url", str);
        }
        Integer num2 = bEs.A01;
        if (num2 != null) {
            r2.A0P("background_width", num2.intValue());
        }
        C41846B3n.A0z(r2, bEs.A03);
        r2.A0Z();
    }
}
