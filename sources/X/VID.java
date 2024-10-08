package X;

import java.io.IOException;

public abstract class VID {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.6Mm] */
    public static C306526Mm parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C306516Ml r5 = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            C306536Mn r4 = null;
            C306546Mo r3 = null;
            C306566Mq r2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("move_to_action".equals(A17)) {
                    r5 = VIC.parseFromJson(r6);
                } else if ("line_to_action".equals(A17)) {
                    r4 = VIB.parseFromJson(r6);
                } else if ("close_action".equals(A17)) {
                    r3 = VIA.parseFromJson(r6);
                } else if ("add_round_rect_action".equals(A17)) {
                    r2 = VI9.parseFromJson(r6);
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (r5 != null) {
                obj.A03 = r5;
            }
            if (r4 != null) {
                obj.A02 = r4;
            }
            if (r3 != null) {
                obj.A01 = r3;
            }
            if (r2 == null) {
                return obj;
            }
            obj.A00 = r2;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
