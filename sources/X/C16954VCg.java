package X;

import java.io.IOException;

/* renamed from: X.VCg  reason: case insensitive filesystem */
public abstract class C16954VCg {
    public static C17436VVp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17436VVp vVp = new C17436VVp();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1A(A17)) {
                    vVp.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("token".equals(A17)) {
                    vVp.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("image".equals(A17)) {
                    vVp.A00 = C16953VCf.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vVp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
