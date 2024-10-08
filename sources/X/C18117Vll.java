package X;

import java.io.IOException;

/* renamed from: X.Vll  reason: case insensitive filesystem */
public abstract class C18117Vll {
    public static UNN parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            Float f = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("icon_location".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("icon_type".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else if (C41845B3m.A1A(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("text_color".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("text_font_size".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r8);
                }
                r8.A0z();
            }
            return new UNN(f, num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNN unn) {
        r2.A0c();
        Integer num = unn.A01;
        if (num != null) {
            r2.A0P("icon_location", num.intValue());
        }
        Integer num2 = unn.A02;
        if (num2 != null) {
            r2.A0P("icon_type", num2.intValue());
        }
        C41846B3n.A0z(r2, unn.A03);
        C13988Tno.A1G(r2, unn.A04);
        Float f = unn.A00;
        if (f != null) {
            r2.A0O("text_font_size", f.floatValue());
        }
        r2.A0Z();
    }
}
