package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

public abstract class AAL {
    public static byte[] A01(AnonymousClass983 r1) {
        AnonymousClass98E r0;
        if (r1 instanceof AnonymousClass98L) {
            r0 = ((AnonymousClass98L) r1).A00;
        } else {
            r0 = (AnonymousClass98E) C3739497o.A01.A03(r1);
        }
        return r0.A00.A0B();
    }

    public static AnonymousClass983 A00(byte[] bArr) {
        try {
            C384459hM r0 = (C384459hM) AnonymousClass972.A02(C3738397d.A00(), C384459hM.DEFAULT_INSTANCE, bArr);
            C3739497o r5 = C3739497o.A01;
            AnonymousClass98E A00 = AnonymousClass98E.A00(r0);
            if (!((C3739597p) r5.A00.get()).A02.containsKey(new AnonymousClass98F(A00.A01, A00.getClass()))) {
                return new AnonymousClass98L(A00);
            }
            return r5.A01(A00);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
