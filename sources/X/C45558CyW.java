package X;

import java.io.IOException;

/* renamed from: X.CyW  reason: case insensitive filesystem */
public final class C45558CyW {
    public static C43796CDo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("challenge_toast_info".equals(A17)) {
                    r3.A01 = CVT.parseFromJson(r4);
                } else if ("toast_info".equals(A17)) {
                    r3.A00 = CUM.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            r3.A02 = new C47138DrF(r3.A00, r3.A01);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
