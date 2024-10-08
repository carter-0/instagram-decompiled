package X;

import java.io.IOException;

/* renamed from: X.Vlu  reason: case insensitive filesystem */
public abstract class C18126Vlu {
    public static C15057UNa parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("hint_text".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("is_hint_row".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if (C41845B3m.A1A(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C15057UNa(bool, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C15057UNa uNa) {
        r2.A0c();
        Integer num = uNa.A01;
        if (num != null) {
            r2.A0P("count", num.intValue());
        }
        String str = uNa.A02;
        if (str != null) {
            r2.A0R("hint_text", str);
        }
        Boolean bool = uNa.A00;
        if (bool != null) {
            r2.A0S("is_hint_row", bool.booleanValue());
        }
        C41846B3n.A0z(r2, uNa.A03);
        r2.A0Z();
    }
}
