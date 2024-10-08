package X;

import java.io.IOException;

/* renamed from: X.5JZ  reason: invalid class name */
public abstract class AnonymousClass5JZ {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5Ja] */
    public static AnonymousClass5Ja parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("surface".equals(A0q)) {
                    obj.A01 = Integer.valueOf(r3.A1D());
                } else if ("data".equals(A0q)) {
                    obj.A00 = AnonymousClass5Jb.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
