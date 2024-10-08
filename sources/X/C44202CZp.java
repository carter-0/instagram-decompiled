package X;

import java.io.IOException;

/* renamed from: X.CZp  reason: case insensitive filesystem */
public abstract class C44202CZp {
    public static N49 parseFromJson(16F r7) {
        String A00;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(2913);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                if (A00.equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("form_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new N49(str, str2, 9);
            }
            AnonymousClass7TF.A1L(A00, r7, "LeadFormConfigV2Impl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
