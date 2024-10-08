package X;

import java.io.IOException;

public abstract class CYY {
    public static BF2 parseFromJson(16F r12) {
        String A00;
        String A002;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r10 = 16L.A09;
                A00 = C273654mx.A00(368);
                A002 = AnonymousClass000.A00(1580);
                if (A1J == r10) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if (A002.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("merchant_name".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("profile_pic_url".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r12, "HouseAdContextImpl");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant_name", r12, "HouseAdContextImpl");
            } else if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r12, "HouseAdContextImpl");
            } else if (str4 != null || !(r12 instanceof 0c9)) {
                return new BF2(str, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L("profile_pic_url", r12, "HouseAdContextImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
