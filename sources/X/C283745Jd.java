package X;

import java.io.IOException;

/* renamed from: X.5Jd  reason: invalid class name and case insensitive filesystem */
public abstract class C283745Jd {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5Je, java.lang.Object] */
    public static C283755Je parseFromJson(16F r3) {
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
                if ("eligible_promotions".equals(A0q)) {
                    obj.A00 = C283765Jf.parseFromJson(r3);
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
