package X;

import java.io.IOException;

/* renamed from: X.VDx  reason: case insensitive filesystem */
public abstract class C16997VDx {
    public static C17350VSd parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17350VSd vSd = new C17350VSd();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("page_index".equals(A17)) {
                    vSd.A00 = r3.A1D();
                } else if ("response_option_numeric_value".equals(A17)) {
                    vSd.A01 = r3.A1D();
                }
                r3.A0z();
            }
            return vSd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
