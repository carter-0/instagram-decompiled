package X;

import java.io.IOException;

/* renamed from: X.Clv  reason: case insensitive filesystem */
public abstract class C44845Clv {
    public static C60912JtW parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (!"end_cursor".equals(A17)) {
                    bool = C41847B3o.A0z(r7, bool, A17, "has_next_page");
                } else if (r7.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r7.A1P();
                }
                r7.A0z();
            }
            if (bool != null || !(r7 instanceof 0c9)) {
                return new C60912JtW(str, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("has_next_page", r7, "LeadFormPageInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
