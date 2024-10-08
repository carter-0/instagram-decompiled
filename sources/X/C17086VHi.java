package X;

import java.io.IOException;

/* renamed from: X.VHi  reason: case insensitive filesystem */
public abstract class C17086VHi {
    public static C61076JwE parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61076JwE jwE = new C61076JwE(20);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("thumbnail_url".equals(A17)) {
                    jwE.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("thumbnail_icon_type".equals(A17)) {
                    C16552Uwz uwz = (C16552Uwz) C16552Uwz.A01.get(AnonymousClass7TG.A0l(r3));
                    if (uwz == null) {
                        uwz = C16552Uwz.UNKNOWN;
                    }
                    jwE.A00 = uwz;
                }
                r3.A0z();
            }
            return jwE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
