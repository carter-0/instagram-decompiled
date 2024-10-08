package X;

import java.io.IOException;

/* renamed from: X.9V5  reason: invalid class name */
public abstract class AnonymousClass9V5 {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.A5i, java.lang.Object] */
    public static C39692A5i parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("key".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("data".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (str2 != null) {
                obj.A00 = str2;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
