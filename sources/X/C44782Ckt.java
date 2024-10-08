package X;

import java.io.IOException;

/* renamed from: X.Ckt  reason: case insensitive filesystem */
public abstract class C44782Ckt {
    public static C45224Csf parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45224Csf csf = new C45224Csf();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("uri".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    csf.A00 = str;
                }
                r3.A0z();
            }
            return csf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
