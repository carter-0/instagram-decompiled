package X;

import java.io.IOException;

/* renamed from: X.Ccy  reason: case insensitive filesystem */
public abstract class C44316Ccy {
    public static BB7 parseFromJson(16F r9) {
        String A00;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r7 = 16L.A09;
                A00 = C66579MXk.A00(310);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if (A00.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("display_headline".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("display_learn_more".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r9, "RequiredActionMessageImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new BB7(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("display_headline", r9, "RequiredActionMessageImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
