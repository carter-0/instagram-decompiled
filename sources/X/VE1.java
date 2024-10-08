package X;

import java.io.IOException;

public abstract class VE1 {
    public static C17352VSf parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17352VSf vSf = new C17352VSf();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    vSf.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A0q)) {
                    C41846B3n.A1A(r3);
                } else if ("survey_flow".equals(A0q)) {
                    vSf.A00 = C18207VnX.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vSf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
