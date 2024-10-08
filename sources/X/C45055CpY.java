package X;

import java.io.IOException;

/* renamed from: X.CpY  reason: case insensitive filesystem */
public abstract class C45055CpY {
    public static BBG parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            Integer num = null;
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("bottom_padding".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("has_bottom_separator".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if ("has_top_separator".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r11);
                } else {
                    num2 = C41847B3o.A13(r11, num2, A17, "top_padding");
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("bottom_padding", r11, "Spacing");
            } else if (bool == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_bottom_separator", r11, "Spacing");
            } else if (bool2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_top_separator", r11, "Spacing");
            } else if (num2 != null || !(r11 instanceof 0c9)) {
                return new BBG(num.intValue(), num2.intValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("top_padding", r11, "Spacing");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
