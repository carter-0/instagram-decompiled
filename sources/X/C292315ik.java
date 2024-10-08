package X;

import java.io.IOException;

/* renamed from: X.5ik  reason: invalid class name and case insensitive filesystem */
public abstract class C292315ik {
    public static C376619Ir parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("badge_use_case_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("count".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("badge_use_case_id", "BadgeCountBreakdown");
            } else if (num != null || !(r9 instanceof 0c9)) {
                return new C376619Ir(str, num.intValue(), 0);
            } else {
                ((0c9) r9).A03.A00("count", "BadgeCountBreakdown");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
