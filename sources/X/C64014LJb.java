package X;

import java.io.IOException;

/* renamed from: X.LJb  reason: case insensitive filesystem */
public abstract class C64014LJb {
    public static C61079JwH parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C61079JwH jwH = new C61079JwH(22);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    jwH.A02 = str;
                } else if ("start".equals(A17)) {
                    jwH.A01 = AnonymousClass7TF.A0X(r3);
                } else if ("end".equals(A17)) {
                    jwH.A00 = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return jwH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C61079JwH jwH, 17Z r3) {
        r3.A0c();
        String str = jwH.A02;
        if (str != null) {
            r3.A0R("text", str);
        }
        Number number = (Number) jwH.A01;
        if (number != null) {
            r3.A0P("start", number.intValue());
        }
        Number number2 = (Number) jwH.A00;
        if (number2 != null) {
            r3.A0P("end", number2.intValue());
        }
        r3.A0Z();
    }
}
