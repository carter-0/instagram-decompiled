package X;

import java.io.IOException;

/* renamed from: X.5FU  reason: invalid class name */
public abstract class AnonymousClass5FU {
    public static AnonymousClass5FY parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            AnonymousClass5FV r4 = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("style".equals(A0q)) {
                    r4 = AnonymousClass5FV.A02.A00(r5.A1D());
                } else if ("attachment_url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            AnonymousClass5FY r0 = new AnonymousClass5FY();
            if (r4 != null) {
                r0.A00 = r4;
            }
            if (str != null) {
                r0.A01 = str;
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
