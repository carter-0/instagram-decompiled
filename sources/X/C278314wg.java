package X;

import java.io.IOException;

/* renamed from: X.4wg  reason: invalid class name and case insensitive filesystem */
public abstract class C278314wg {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.4wh, java.lang.Object] */
    public static C278324wh parseFromJson(16F r4) {
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
                if ("start".equals(A0q)) {
                    obj.A01 = r4.A1D();
                } else if ("end".equals(A0q)) {
                    obj.A00 = r4.A1D();
                } else if ("bold".equals(A0q)) {
                    obj.A05 = r4.A0d();
                } else {
                    String str = null;
                    if ("color".equals(A0q)) {
                        if (r4.A11() != 16L.A0G) {
                            str = r4.A1P();
                        }
                        obj.A04 = str;
                    } else if ("intent".equals(A0q)) {
                        if (r4.A11() != 16L.A0G) {
                            str = r4.A1P();
                        }
                        obj.A03 = str;
                    } else if ("semantic_color".equals(A0q)) {
                        if (r4.A11() != 16L.A0G) {
                            str = r4.A1P();
                        }
                        obj.A02 = AnonymousClass5H9.A00(str);
                    }
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

    public static void A00(17Z r2, C278324wh r3) {
        r2.A0c();
        r2.A0P("start", r3.A01);
        r2.A0P("end", r3.A00);
        r2.A0S("bold", r3.A05);
        String str = r3.A04;
        if (str != null) {
            r2.A0R("color", str);
        }
        String str2 = r3.A03;
        if (str2 != null) {
            r2.A0R("intent", str2);
        }
        if (r3.A02 != null) {
            r2.A0R("semantic_color", "emphasized");
        }
        r2.A0Z();
    }
}
