package X;

import java.io.IOException;

/* renamed from: X.8wl  reason: invalid class name and case insensitive filesystem */
public abstract class C370618wl {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.A5N, java.lang.Object] */
    public static A5N parseFromJson(16F r3) {
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
                if ("cutover_timestamp".equals(A0q)) {
                    obj.A00 = Long.valueOf(r3.A0y());
                } else if ("undo_cutover_timestamp".equals(A0q)) {
                    obj.A01 = Long.valueOf(r3.A0y());
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
