package X;

import java.io.IOException;

/* renamed from: X.Cla  reason: case insensitive filesystem */
public abstract class C44824Cla {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Csp, java.lang.Object] */
    public static C45234Csp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (C41845B3m.A1Q(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("icon_url".equals(A17)) {
                    obj.A00 = 16h.A00(r3);
                } else if ("primary_button_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (AnonymousClass000.A00(186).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("can_dismiss".equals(A17)) {
                    r3.A0d();
                } else if ("upsell_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
