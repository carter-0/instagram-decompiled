package X;

import java.io.IOException;

/* renamed from: X.Clz  reason: case insensitive filesystem */
public abstract class C44849Clz {
    public static C60919Jtd parseFromJson(16F r10) {
        String A00;
        String A002;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r8 = 16L.A09;
                A00 = AnonymousClass000.A00(5100);
                A002 = AnonymousClass000.A00(5099);
                if (A1J == r8) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A002.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("thumbnail_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r10, "SuggestedMediaImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "SuggestedMediaImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new C60919Jtd(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("thumbnail_url", r10, "SuggestedMediaImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
