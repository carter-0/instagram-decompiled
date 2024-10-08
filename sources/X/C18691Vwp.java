package X;

import java.io.IOException;

/* renamed from: X.Vwp  reason: case insensitive filesystem */
public final class C18691Vwp {
    public static UY2 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            UY2 uy2 = new UY2();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, uy2, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return uy2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(16F r1, UY2 uy2, String str) {
        if ("metadata".equals(str)) {
            uy2.A01 = VF3.parseFromJson(r1);
        } else if ("product_feed".equals(str)) {
            uy2.A02 = LJM.parseFromJson(r1);
        } else if (AnonymousClass000.A00(639).equals(str)) {
            uy2.A00 = C63336KvJ.parseFromJson(r1);
        } else {
            1XY.A01(r1, uy2, str);
        }
    }
}
