package X;

import java.io.IOException;

/* renamed from: X.Cyn  reason: case insensitive filesystem */
public final class C45575Cyn {
    public static CED parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("emoji".equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("enabled".equals(A17)) {
                    r4.A01 = AnonymousClass7TF.A0S(r5);
                } else if ("welcome_message_text".equals(A17)) {
                    r4.A03 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            r4.A00 = new C47148DrP(r4.A01, r4.A02, r4.A03);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
