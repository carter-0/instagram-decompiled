package X;

import java.io.IOException;

/* renamed from: X.3U6  reason: invalid class name */
public abstract class AnonymousClass3U6 {
    public static AnonymousClass9IM parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass9IM r0 = new AnonymousClass9IM(7);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("nudge_type".equals(A0q)) {
                    r0.A00 = r3.A1D();
                } else if ("create_time".equals(A0q)) {
                    r0.A01 = Long.valueOf(r3.A0y());
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

    public static void A00(AnonymousClass9IM r2, 17Z r3) {
        r3.A0c();
        r3.A0P("nudge_type", r2.A00);
        Number number = (Number) r2.A01;
        if (number != null) {
            r3.A0Q("create_time", number.longValue());
        }
        r3.A0Z();
    }
}
