package X;

import java.io.IOException;

/* renamed from: X.Nwp  reason: case insensitive filesystem */
public abstract class C70073Nwp {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.OGw, java.lang.Object] */
    public static C70701OGw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A0q)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("link".equals(A0q)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(273).equals(A0q)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(2612).equals(A0q)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(2614).equals(A0q)) {
                    obj.A00 = 16h.A00(r3);
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
