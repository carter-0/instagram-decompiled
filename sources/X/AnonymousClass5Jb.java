package X;

import java.io.IOException;

/* renamed from: X.5Jb  reason: invalid class name */
public abstract class AnonymousClass5Jb {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5Jc, java.lang.Object] */
    public static C283735Jc parseFromJson(16F r3) {
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
                if ("viewer".equals(A0q)) {
                    obj.A00 = C283745Jd.parseFromJson(r3);
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
