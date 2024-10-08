package X;

import java.io.IOException;
import java.util.Map;

/* renamed from: X.RSl  reason: case insensitive filesystem */
public abstract class C9182RSl {
    public static final C3034368u A00(C307896Rx r3, AnonymousClass6Tm r4) {
        C276464tN r0;
        Object A0p = DbT.A0p(r4, 0);
        DbS.A1Y(A0p);
        String str = (String) A0p;
        1KZ.A01("ParseEmbedded");
        try {
            C361028fY A00 = C361028fY.A00(C64361Kj.A00().A0A.ANB(r3, str));
            if (A00 == null || (r0 = A00.A00) == null) {
                throw AnonymousClass7TE.A0w("Encountered empty BloksResponse. Could not parse embedded payload");
            }
            C3034368u A01 = Q4I.A01(r3, r0.A00, (Map) null, false, false);
            1KZ.A00();
            return A01;
        } catch (IOException unused) {
            throw AnonymousClass7TE.A0w("Could not parse embedded payload");
        }
    }
}
