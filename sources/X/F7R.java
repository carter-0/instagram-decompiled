package X;

import java.io.IOException;

public final class F7R {
    public static C47354Dvo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C47354Dvo dvo = new C47354Dvo();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("invite_message".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    dvo.A00 = A0l;
                } else if ("invite_subject".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    dvo.A01 = A0l2;
                } else {
                    1XY.A01(r4, dvo, A17);
                }
                r4.A0z();
            }
            return dvo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
