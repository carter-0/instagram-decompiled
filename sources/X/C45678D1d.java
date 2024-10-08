package X;

import java.io.IOException;

/* renamed from: X.D1d  reason: case insensitive filesystem */
public abstract class C45678D1d {
    public static C269814fj parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            String str2 = null;
            Integer num = null;
            Float f4 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("background_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("height_percentage".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r10);
                } else if ("start_x_position_percentage".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r10);
                } else if ("start_y_position_percentage".equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r10);
                } else if ("text_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("text_size".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("width_percentage".equals(A17)) {
                    f4 = AnonymousClass7TF.A0U(r10);
                }
                r10.A0z();
            }
            return new C269814fj(f, f2, f3, f4, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C269814fj r3) {
        r2.A0c();
        String str = r3.A05;
        if (str != null) {
            r2.A0R("background_color", str);
        }
        Float f = r3.A00;
        if (f != null) {
            r2.A0O("height_percentage", f.floatValue());
        }
        Float f2 = r3.A01;
        if (f2 != null) {
            r2.A0O("start_x_position_percentage", f2.floatValue());
        }
        Float f3 = r3.A02;
        if (f3 != null) {
            r2.A0O("start_y_position_percentage", f3.floatValue());
        }
        String str2 = r3.A06;
        if (str2 != null) {
            r2.A0R("text_color", str2);
        }
        Integer num = r3.A04;
        if (num != null) {
            r2.A0P("text_size", num.intValue());
        }
        Float f4 = r3.A03;
        if (f4 != null) {
            r2.A0O("width_percentage", f4.floatValue());
        }
        r2.A0Z();
    }
}
