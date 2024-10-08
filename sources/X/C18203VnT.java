package X;

import java.io.IOException;

/* renamed from: X.VnT  reason: case insensitive filesystem */
public final class C18203VnT {
    public static C15627Uft parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15627Uft uft = new C15627Uft();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    C41846B3n.A1A(r3);
                } else if (AnonymousClass000.A00(1149).equals(A0q)) {
                    uft.A00 = VD9.parseFromJson(r3);
                }
                r3.A0z();
            }
            return uft;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
