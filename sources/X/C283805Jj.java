package X;

import java.io.IOException;

/* renamed from: X.5Jj  reason: invalid class name and case insensitive filesystem */
public abstract class C283805Jj {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5Jk] */
    public static C283815Jk parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                Long l = null;
                if ("start".equals(A0q)) {
                    if (r4.A11() == 16L.A0I) {
                        l = Long.valueOf(r4.A0y());
                    }
                    obj.A01 = l;
                } else if ("end".equals(A0q)) {
                    if (r4.A11() == 16L.A0I) {
                        l = Long.valueOf(r4.A0y());
                    }
                    obj.A00 = l;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
