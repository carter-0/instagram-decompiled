package X;

import java.io.IOException;

/* renamed from: X.VDk  reason: case insensitive filesystem */
public abstract class C16984VDk {
    public static VSW parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VSW vsw = new VSW();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("field_key".equals(A17)) {
                    vsw.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("input_type".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (C41845B3m.A19(A17)) {
                    vsw.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vsw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
