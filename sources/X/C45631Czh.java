package X;

import java.io.IOException;

/* renamed from: X.Czh  reason: case insensitive filesystem */
public abstract class C45631Czh {
    public static C42072BGa parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("bloks_app".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("should_preload".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else {
                    num = C41847B3o.A13(r7, num, A17, "show_tooltip_count");
                }
                r7.A0z();
            }
            return new C42072BGa(bool, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42072BGa bGa) {
        r2.A0c();
        String str = bGa.A02;
        if (str != null) {
            r2.A0R("bloks_app", str);
        }
        C41846B3n.A0y(r2, bGa.A03);
        Boolean bool = bGa.A00;
        if (bool != null) {
            r2.A0S("should_preload", bool.booleanValue());
        }
        Integer num = bGa.A01;
        if (num != null) {
            r2.A0P("show_tooltip_count", num.intValue());
        }
        r2.A0Z();
    }
}
