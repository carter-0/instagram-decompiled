package X;

import java.io.IOException;

/* renamed from: X.4iU  reason: invalid class name and case insensitive filesystem */
public abstract class C271234iU {
    public static C257793xy parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C271254iW r4 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C271254iW r3 = null;
            C271254iW r2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("bottom".equals(A0q)) {
                    r4 = C271244iV.parseFromJson(r5);
                } else if ("text".equals(A0q)) {
                    r3 = C271244iV.parseFromJson(r5);
                } else if ("top".equals(A0q)) {
                    r2 = C271244iV.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new C257793xy(r4, r3, r2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C257793xy r3) {
        r2.A0c();
        C271254iW r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("bottom");
            r2.A0c();
            String str = r1.A00;
            if (str != null) {
                r2.A0R("background_color", str);
            }
            r2.A0Z();
        }
        C271254iW r12 = r3.A01;
        if (r12 != null) {
            r2.A0q("text");
            r2.A0c();
            String str2 = r12.A00;
            if (str2 != null) {
                r2.A0R("background_color", str2);
            }
            r2.A0Z();
        }
        C271254iW r13 = r3.A02;
        if (r13 != null) {
            r2.A0q("top");
            r2.A0c();
            String str3 = r13.A00;
            if (str3 != null) {
                r2.A0R("background_color", str3);
            }
            r2.A0Z();
        }
        r2.A0Z();
    }
}
