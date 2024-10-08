package X;

import java.io.IOException;

/* renamed from: X.8VX  reason: invalid class name */
public final class AnonymousClass8VX {
    public static AnonymousClass8VW parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("unlockable_sticker_nux_info".equals(A0q)) {
                    r0.A00 = C394829yl.parseFromJson(r3);
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
