package X;

import java.io.IOException;

/* renamed from: X.Ckd  reason: case insensitive filesystem */
public abstract class C44766Ckd {
    public static C45345Cun parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45345Cun cun = new C45345Cun();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("body".equals(A17)) {
                    cun.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("footer".equals(A17)) {
                    cun.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("header".equals(A17)) {
                    cun.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return cun;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
