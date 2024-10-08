package X;

import java.io.IOException;

/* renamed from: X.Cit  reason: case insensitive filesystem */
public abstract class C44675Cit {
    public static BBV parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            BBV bbv = new BBV(20);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (C41845B3m.A19(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    bbv.A00 = str;
                }
                r3.A0z();
            }
            return bbv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
