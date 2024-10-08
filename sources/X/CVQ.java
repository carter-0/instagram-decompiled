package X;

import java.io.IOException;

public abstract class CVQ {
    public static C381459bn parseFromJson(16F r10) {
        String A00;
        String A002;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(69);
                A002 = AnonymousClass000.A00(2140);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A00.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("media_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("thumbnail_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, A002);
            } else if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r10, A002);
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C381459bn(num.intValue(), str, str2);
            } else {
                AnonymousClass7TF.A1L("thumbnail_url", r10, A002);
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
