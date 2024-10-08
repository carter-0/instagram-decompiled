package X;

import java.io.IOException;

/* renamed from: X.6zD  reason: invalid class name and case insensitive filesystem */
public final class C324396zD {
    public static C324576zY parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C324576zY r0 = new C324576zY();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("broadcast".equals(A0q)) {
                    r0.A02 = C277424v9.parseFromJson(r3);
                } else if ("reel".equals(A0q)) {
                    r0.A03 = AnonymousClass3HR.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A0q);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
