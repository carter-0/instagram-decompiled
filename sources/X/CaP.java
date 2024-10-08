package X;

import java.io.IOException;

public abstract class CaP {
    public static C257823y1 parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(1594);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("action_link".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action_link", r8, "MessageExtensionInfo");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new C257823y1(str, str2);
            } else {
                AnonymousClass7TF.A1L(A00, r8, "MessageExtensionInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
