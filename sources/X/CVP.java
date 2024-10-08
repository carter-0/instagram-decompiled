package X;

import java.io.IOException;

public abstract class CVP {
    public static BE2 parseFromJson(16F r10) {
        String A00;
        String A002;
        String A003;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            String str = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(704);
                A002 = AnonymousClass000.A00(69);
                A003 = AnonymousClass000.A00(885);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A002.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("is_child_deleted".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r10, A003);
            } else if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_child_deleted", r10, A003);
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new BE2(str, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(A00, r10, A003);
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
