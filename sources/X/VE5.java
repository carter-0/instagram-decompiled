package X;

import java.io.IOException;

public abstract class VE5 {
    public static C17445VVy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17445VVy vVy = new C17445VVy();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    vVy.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("intro_text".equals(A0q)) {
                    vVy.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("outro_text".equals(A0q)) {
                    vVy.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vVy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
