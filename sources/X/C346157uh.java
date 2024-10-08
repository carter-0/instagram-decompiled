package X;

import java.io.IOException;

/* renamed from: X.7uh  reason: invalid class name and case insensitive filesystem */
public abstract class C346157uh {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.7ui, java.lang.Object] */
    public static C346167ui parseFromJson(16F r4) {
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
                String str = null;
                if ("token".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A02 = str;
                } else if ("text".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A01 = str;
                } else if ("image".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A00 = str;
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

    public static void A00(17Z r2, C346167ui r3) {
        r2.A0c();
        String str = r3.A02;
        if (str != null) {
            r2.A0R("token", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r2.A0R("text", str2);
        }
        String str3 = r3.A00;
        if (str3 != null) {
            r2.A0R("image", str3);
        }
        r2.A0Z();
    }
}
