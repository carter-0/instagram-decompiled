package X;

import java.io.IOException;

/* renamed from: X.Cio  reason: case insensitive filesystem */
public abstract class C44670Cio {
    public static A5L parseFromJson(16F r9) {
        String A02;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r7 = 16L.A09;
                A02 = DcV.A02(94, 8, 3);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if ("igid".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (A02.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("igid", r9, "DirectNicknameObject");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new A5L(str, str2);
            } else {
                AnonymousClass7TF.A1L(A02, r9, "DirectNicknameObject");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
