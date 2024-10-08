package X;

import java.io.IOException;

/* renamed from: X.8wm  reason: invalid class name and case insensitive filesystem */
public abstract class C370628wm {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5xW, java.lang.Object] */
    public static C300625xW parseFromJson(16F r3) {
        String str;
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
                if ("reported_timestamp_ms".equals(A0q)) {
                    obj.A00 = r3.A0y();
                } else if ("reviewed_timestamp_ms".equals(A0q)) {
                    obj.A01 = r3.A0y();
                } else if ("visibility".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A02 = str;
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

    public static void A00(17Z r3, C300625xW r4) {
        r3.A0c();
        r3.A0Q("reported_timestamp_ms", r4.A00);
        r3.A0Q("reviewed_timestamp_ms", r4.A01);
        String str = r4.A02;
        if (str != null) {
            r3.A0R("visibility", str);
        }
        r3.A0Z();
    }
}
