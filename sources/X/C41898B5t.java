package X;

import java.io.IOException;

/* renamed from: X.B5t  reason: case insensitive filesystem */
public final class C41898B5t {
    public static B6E parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("promotional_video_media_info".equals(A0q)) {
                    r2.A00 = C275974sH.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r2, A0q);
                }
                r3.A0z();
            }
            r2.A01 = new C41899B5u(r2.A00);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
