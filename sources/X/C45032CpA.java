package X;

import java.io.IOException;

/* renamed from: X.CpA  reason: case insensitive filesystem */
public abstract class C45032CpA {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Cvj] */
    public static C45403Cvj parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(2588).equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if (C41845B3m.A1E(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1L(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("primary_button_text".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(186).equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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
