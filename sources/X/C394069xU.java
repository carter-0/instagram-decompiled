package X;

import java.io.IOException;

/* renamed from: X.9xU  reason: invalid class name and case insensitive filesystem */
public abstract class C394069xU {
    public static C387359m5 parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            C387359m5 r0 = new C387359m5();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("text".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A02 = str;
                } else if ("text_size".equals(A17)) {
                    r0.A00 = (float) r5.A0U();
                } else if ("max_width".equals(A17)) {
                    r0.A01 = r5.A1D();
                } else {
                    AAV.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
