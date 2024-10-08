package X;

import java.io.IOException;

/* renamed from: X.VIc  reason: case insensitive filesystem */
public abstract class C17106VIc {
    public static AnonymousClass8DA parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass8DA r0 = new AnonymousClass8DA();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("offset_y".equals(A17)) {
                    r0.A00 = (float) r4.A0U();
                } else if ("scale".equals(A17)) {
                    r0.A01 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
