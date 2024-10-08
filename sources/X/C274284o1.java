package X;

import java.io.IOException;

/* renamed from: X.4o1  reason: invalid class name and case insensitive filesystem */
public abstract class C274284o1 {
    public static C53445God parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            Boolean bool = null;
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool2 = null;
            Integer num = null;
            Boolean bool3 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("can_hush".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("can_unhush".equals(A0q)) {
                    bool2 = Boolean.valueOf(r11.A0d());
                } else if ("cover_reason_category".equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("is_post_covered".equals(A0q)) {
                    bool3 = Boolean.valueOf(r11.A0d());
                }
                r11.A0z();
            }
            if (bool == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("can_hush", "HushInfoImpl");
            } else if (bool2 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("can_unhush", "HushInfoImpl");
            } else if (num == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("cover_reason_category", "HushInfoImpl");
            } else if (bool3 != null || !(r11 instanceof 0c9)) {
                return new C53445God(num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                ((0c9) r11).A03.A00("is_post_covered", "HushInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
