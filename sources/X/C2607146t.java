package X;

import java.io.IOException;

/* renamed from: X.46t  reason: invalid class name and case insensitive filesystem */
public abstract class C2607146t {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.46u, java.lang.Object] */
    public static C2607246u parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                String str = null;
                if ("sender_id".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A03 = str;
                } else if ("emoji".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    obj.A02 = str;
                } else if ("super_react_type".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    obj.A04 = str;
                } else if ("timestamp".equals(A0q)) {
                    obj.A01 = Long.valueOf(r5.A0y());
                } else if ("avatar_reaction".equals(A0q)) {
                    obj.A00 = 16W.parseFromJson(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C2607246u r4) {
        r3.A0c();
        r4.A00();
        r3.A0R("sender_id", r4.A00());
        String str = r4.A02;
        if (str != null) {
            r3.A0R("emoji", str);
        }
        String str2 = r4.A04;
        if (str2 != null) {
            r3.A0R("super_react_type", str2);
        }
        Long l = r4.A01;
        if (l != null) {
            r3.A0Q("timestamp", l.longValue());
        }
        if (r4.A00 != null) {
            r3.A0q("avatar_reaction");
            16W.A00(r3, r4.A00);
        }
        r3.A0Z();
    }
}
