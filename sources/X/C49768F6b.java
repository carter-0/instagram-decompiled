package X;

import java.io.IOException;

/* renamed from: X.F6b  reason: case insensitive filesystem */
public final class C49768F6b {
    public static ENL parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r0 = new 1XQ();
            16L A11 = r6.A11();
            16L r4 = 16L.A0D;
            if (A11 != r4) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r5 = 16L.A09;
                if (A1J == r5) {
                    return r0;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if ("verified".equals(A17)) {
                    r0.A01 = r6.A0d();
                } else if ("nonce_valid".equals(A17) || "phone_number_valid".equals(A17)) {
                    r6.A0d();
                } else if (Dbj.A00().equals(A17)) {
                    C41846B3n.A1A(r6);
                } else if ("errors".equals(A17)) {
                    16L A112 = r6.A11();
                    String str = null;
                    if (A112 != r4) {
                        if (A112 == 16L.A0C) {
                            r6.A0z();
                        }
                        r0.A00 = str;
                    }
                    while (r6.A1J() != r5) {
                        r6.A1J();
                        while (r6.A1J() != 16L.A08) {
                            if (str == null) {
                                str = r6.A1P();
                            }
                        }
                    }
                    r0.A00 = str;
                } else {
                    C49027Eo3.A00(r6, r0, A17);
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
