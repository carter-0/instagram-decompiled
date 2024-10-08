package X;

import java.io.IOException;

/* renamed from: X.VnU  reason: case insensitive filesystem */
public final class C18204VnU {
    public static C15628Ufu parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15628Ufu ufu = new C15628Ufu();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    C41846B3n.A1A(r3);
                } else if (AnonymousClass000.A00(1149).equals(A0q)) {
                    ufu.A00 = VDS.parseFromJson(r3);
                }
                r3.A0z();
            }
            return ufu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
