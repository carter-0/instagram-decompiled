package X;

import java.io.IOException;

/* renamed from: X.4s4  reason: invalid class name and case insensitive filesystem */
public abstract class C275864s4 {
    public static C275904s8 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            C275884s6 r5 = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            C275884s6 r4 = null;
            Boolean bool = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("is_possible_impersonator".equals(A0q)) {
                    r5 = C275874s5.parseFromJson(r9);
                } else if ("is_possible_impersonator_threads".equals(A0q)) {
                    r4 = C275874s5.parseFromJson(r9);
                } else if ("is_possible_scammer".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                }
                r9.A0z();
            }
            if (r5 == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("is_possible_impersonator", "ProactiveWarningsEventInfoImpl");
            } else if (r4 == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("is_possible_impersonator_threads", "ProactiveWarningsEventInfoImpl");
            } else if (bool != null || !(r9 instanceof 0c9)) {
                return new C275904s8(r5, r4, bool.booleanValue());
            } else {
                ((0c9) r9).A03.A00("is_possible_scammer", "ProactiveWarningsEventInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
