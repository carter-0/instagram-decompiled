package X;

import java.io.IOException;

/* renamed from: X.CpS  reason: case insensitive filesystem */
public abstract class C45049CpS {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CtB, java.lang.Object] */
    public static C45248CtB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("merchant".equals(A17)) {
                    obj.A00 = C41845B3m.A0a(r4, false);
                } else {
                    if (AnonymousClass000.A00(3899).equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if (AnonymousClass000.A00(1773).equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if (C41845B3m.A1E(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("show_about_this_account".equals(A17)) {
                        r4.A0d();
                    }
                    r4.A1P();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
