package X;

import java.io.IOException;

/* renamed from: X.EcU  reason: case insensitive filesystem */
public abstract class C48311EcU {
    /* JADX WARNING: type inference failed for: r0v8, types: [X.Eb9, java.lang.Object] */
    public static C48228Eb9 parseFromJson(16F r7) {
        String A00;
        0qQ.A0B(r7, 0);
        try {
            C45201CsC csC = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            EM4 em4 = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(5218);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                if (A00.equals(A17)) {
                    csC = CUH.parseFromJson(r7);
                } else if ("login_response".equals(A17)) {
                    em4 = FCB.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (csC == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r7, "LoggedInChildAccountInfo");
            } else if (em4 != null || !(r7 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = csC;
                obj.A01 = em4;
                return obj;
            } else {
                AnonymousClass7TF.A1L("login_response", r7, "LoggedInChildAccountInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
