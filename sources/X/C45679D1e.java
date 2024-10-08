package X;

import java.io.IOException;

/* renamed from: X.D1e  reason: case insensitive filesystem */
public abstract class C45679D1e {
    public static C257533xY parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (C41845B3m.A1A(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C257533xY(str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C257533xY r3) {
        r2.A0c();
        C41846B3n.A0z(r2, r3.A00);
        C41846B3n.A10(r2, r3.A01);
        String str = r3.A02;
        if (str != null) {
            r2.A0R("url", str);
        }
        r2.A0Z();
    }
}
