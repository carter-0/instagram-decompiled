package X;

import java.io.IOException;

/* renamed from: X.5gU  reason: invalid class name and case insensitive filesystem */
public abstract class C291075gU {
    public static C291085gV parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C291085gV r0 = new C291085gV();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("seq_id".equals(A0q)) {
                    r0.A02 = r3.A0y();
                } else if ("succeeded".equals(A0q)) {
                    r0.A05 = r3.A0d();
                } else if ("error_type".equals(A0q)) {
                    r0.A00 = r3.A1D();
                } else if ("error_message".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A04 = str;
                } else if ("subscribed_at_ms".equals(A0q)) {
                    r0.A03 = r3.A0y();
                } else if ("latest_seq_id".equals(A0q)) {
                    r0.A01 = r3.A0y();
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
