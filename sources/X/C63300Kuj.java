package X;

import java.io.IOException;

/* renamed from: X.Kuj  reason: case insensitive filesystem */
public abstract class C63300Kuj {
    public static C61957KTg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61957KTg kTg = new C61957KTg();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                LPa.A01(r3, kTg, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return kTg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
