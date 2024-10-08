package X;

import java.io.IOException;

/* renamed from: X.Cq8  reason: case insensitive filesystem */
public abstract class C45090Cq8 {
    public static BBV parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            BBV bbv = new BBV(31);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if (C41845B3m.A1A(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    bbv.A00 = str;
                }
                r4.A0z();
            }
            return bbv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
