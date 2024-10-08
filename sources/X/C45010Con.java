package X;

import java.io.IOException;

/* renamed from: X.Con  reason: case insensitive filesystem */
public abstract class C45010Con {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.CTN, X.F2I, java.lang.Object] */
    public static CTN parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                } else if ("preview_no".equals(A0q)) {
                    obj.A00 = r4.A1D();
                } else if ("has_more_suggestions".equals(A0q)) {
                    obj.A01 = r4.A0d();
                } else {
                    D2P.A00(r4, obj, A0q);
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
