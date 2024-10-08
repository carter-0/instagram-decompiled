package X;

import java.io.IOException;

/* renamed from: X.Clb  reason: case insensitive filesystem */
public abstract class C44825Clb {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cu4, java.lang.Object] */
    public static C45301Cu4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("tile_tap_target".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1G(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            String str = obj.A01;
            0qQ.A0B(str, 0);
            C54645HMc.A01.get(str);
            C62546Khc.A01.get(obj.A00);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
