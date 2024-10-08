package X;

import java.io.IOException;

/* renamed from: X.Ckb  reason: case insensitive filesystem */
public abstract class C44764Ckb {
    public static C45289Cts parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45289Cts cts = new C45289Cts();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("body".equals(A17)) {
                    cts.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("header".equals(A17)) {
                    cts.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return cts;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
