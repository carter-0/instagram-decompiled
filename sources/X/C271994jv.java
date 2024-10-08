package X;

import java.io.IOException;

/* renamed from: X.4jv  reason: invalid class name and case insensitive filesystem */
public abstract class C271994jv {
    public static C272004jw parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            Float f = null;
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("count".equals(A0q)) {
                    num = Integer.valueOf(r6.A1D());
                } else if ("font_size".equals(A0q)) {
                    f = new Float(r6.A0U());
                } else if ("text".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C272004jw(f, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C272004jw r3) {
        r2.A0c();
        Integer num = r3.A01;
        if (num != null) {
            r2.A0P("count", num.intValue());
        }
        Float f = r3.A00;
        if (f != null) {
            r2.A0O("font_size", f.floatValue());
        }
        String str = r3.A02;
        if (str != null) {
            r2.A0R("text", str);
        }
        r2.A0Z();
    }
}
