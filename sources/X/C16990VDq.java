package X;

import java.io.IOException;

/* renamed from: X.VDq  reason: case insensitive filesystem */
public abstract class C16990VDq {
    public static VSY parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VSY vsy = new VSY();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A19(A17)) {
                    vsy.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("template".equals(A17)) {
                    vsy.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vsy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
