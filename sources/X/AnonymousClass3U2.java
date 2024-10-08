package X;

import java.io.IOException;

/* renamed from: X.3U2  reason: invalid class name */
public abstract class AnonymousClass3U2 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.3Tv, java.lang.Object] */
    public static C242383Tv parseFromJson(16F r3) {
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
                if ("text".equals(A0q)) {
                    obj.A01 = r3.A1D();
                } else if ("instamadillo_cutover".equals(A0q)) {
                    obj.A00 = r3.A1D();
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
