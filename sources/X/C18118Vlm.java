package X;

import java.io.IOException;

/* renamed from: X.Vlm  reason: case insensitive filesystem */
public abstract class C18118Vlm {
    public static UNO parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("border_color".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("border_width".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r6);
                } else if ("thumbnail_url".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new UNO(f, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNO uno) {
        r2.A0c();
        String str = uno.A01;
        if (str != null) {
            r2.A0R("border_color", str);
        }
        Float f = uno.A00;
        if (f != null) {
            r2.A0O("border_width", f.floatValue());
        }
        String str2 = uno.A02;
        if (str2 != null) {
            r2.A0R("thumbnail_url", str2);
        }
        r2.A0Z();
    }
}
