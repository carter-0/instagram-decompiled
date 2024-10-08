package X;

import java.io.IOException;

/* renamed from: X.9zw  reason: invalid class name and case insensitive filesystem */
public abstract class C395549zw {
    public static C65671fe parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C65671fe r1 = new C65671fe();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(3396).equals(A17)) {
                    QP5 parseFromJson = C70078Nwu.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A00 = parseFromJson;
                } else if ("question_response_type".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r1.A01 = str;
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
