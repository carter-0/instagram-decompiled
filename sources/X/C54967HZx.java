package X;

import java.io.IOException;

/* renamed from: X.HZx  reason: case insensitive filesystem */
public abstract class C54967HZx {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Hkm] */
    public static C55627Hkm parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("item".equals(A17)) {
                    1Xj A00 = 1Xj.A00(r4);
                    0qQ.A0B(A00, 0);
                    obj.A00 = A00;
                } else if (C273654mx.A00(2160).equals(A17)) {
                    obj.A01 = C250043ko.parseFromJson(r4);
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
