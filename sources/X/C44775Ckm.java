package X;

import java.io.IOException;

/* renamed from: X.Ckm  reason: case insensitive filesystem */
public abstract class C44775Ckm {
    public static C45347Cup parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45347Cup cup = new C45347Cup();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("body".equals(A17)) {
                    cup.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("header".equals(A17)) {
                    cup.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("photo".equals(A17)) {
                    cup.A00 = C44774Ckl.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cup;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
