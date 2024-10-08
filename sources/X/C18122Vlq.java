package X;

import java.io.IOException;

/* renamed from: X.Vlq  reason: case insensitive filesystem */
public abstract class C18122Vlq {
    public static UNW parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Boolean bool = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            String str2 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("background_color_hex".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("button_height_pct".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r12);
                } else if ("button_x".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r12);
                } else if ("button_y".equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r12);
                } else if ("is_dark_mode".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("label_height_pct".equals(A17)) {
                    f4 = AnonymousClass7TF.A0U(r12);
                } else if ("label_width_pct".equals(A17)) {
                    f5 = AnonymousClass7TF.A0U(r12);
                } else if ("padding_pct".equals(A17)) {
                    f6 = AnonymousClass7TF.A0U(r12);
                } else if ("text_color_hex".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            return new UNW(bool, f, f2, f3, f4, f5, f6, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNW unw, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = unw.A07;
        if (str != null) {
            r2.A0R("background_color_hex", str);
        }
        Float f = unw.A01;
        if (f != null) {
            r2.A0O("button_height_pct", f.floatValue());
        }
        Float f2 = unw.A02;
        if (f2 != null) {
            r2.A0O("button_x", f2.floatValue());
        }
        Float f3 = unw.A03;
        if (f3 != null) {
            r2.A0O("button_y", f3.floatValue());
        }
        Boolean bool = unw.A00;
        if (bool != null) {
            r2.A0S("is_dark_mode", bool.booleanValue());
        }
        Float f4 = unw.A04;
        if (f4 != null) {
            r2.A0O("label_height_pct", f4.floatValue());
        }
        Float f5 = unw.A05;
        if (f5 != null) {
            r2.A0O("label_width_pct", f5.floatValue());
        }
        Float f6 = unw.A06;
        if (f6 != null) {
            r2.A0O("padding_pct", f6.floatValue());
        }
        String str2 = unw.A08;
        if (str2 != null) {
            r2.A0R("text_color_hex", str2);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
