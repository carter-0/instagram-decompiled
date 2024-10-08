package X;

import com.instagram.api.schemas.NativeInfoCardTextAlignment;
import java.io.IOException;

/* renamed from: X.Vlk  reason: case insensitive filesystem */
public abstract class C18116Vlk {
    public static UNM parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            NativeInfoCardTextAlignment nativeInfoCardTextAlignment = null;
            Float f = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("alignment".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    nativeInfoCardTextAlignment = (NativeInfoCardTextAlignment) NativeInfoCardTextAlignment.A01.get(str);
                    if (nativeInfoCardTextAlignment == null) {
                        nativeInfoCardTextAlignment = NativeInfoCardTextAlignment.UNRECOGNIZED;
                    }
                } else if ("font_size".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r8);
                } else if ("max_number_of_lines".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if (C41845B3m.A1A(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("text_color".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new UNM(nativeInfoCardTextAlignment, f, num, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNM unm) {
        r2.A0c();
        NativeInfoCardTextAlignment nativeInfoCardTextAlignment = unm.A00;
        if (nativeInfoCardTextAlignment != null) {
            r2.A0R("alignment", nativeInfoCardTextAlignment.A00);
        }
        Float f = unm.A01;
        if (f != null) {
            r2.A0O("font_size", f.floatValue());
        }
        Integer num = unm.A02;
        if (num != null) {
            r2.A0P("max_number_of_lines", num.intValue());
        }
        C41846B3n.A0z(r2, unm.A03);
        C13988Tno.A1G(r2, unm.A04);
        r2.A0Z();
    }
}
