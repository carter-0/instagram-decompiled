package X;

import java.io.IOException;

/* renamed from: X.3iG  reason: invalid class name and case insensitive filesystem */
public abstract class C248603iG {
    public static C248623iI parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("count".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("hex_rgba_color".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("count", "ClipsTextColor");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C248623iI(num.intValue(), str);
            } else {
                ((0c9) r8).A03.A00("hex_rgba_color", "ClipsTextColor");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
