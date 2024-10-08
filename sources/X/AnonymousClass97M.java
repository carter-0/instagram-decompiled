package X;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collection;

/* renamed from: X.97M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass97M implements AnonymousClass97E {
    public final Object AJN(AnonymousClass97G r6) {
        AnonymousClass97N r62 = (AnonymousClass97N) r6;
        AnonymousClass981 r1 = r62.A00;
        AnonymousClass97I r0 = AnonymousClass97L.A03;
        int i = r1.A00;
        if (i == 64) {
            Collection collection = AnonymousClass9DR.A04;
            return new AnonymousClass9DR(r62.A01, r62.A02.A02(C375049Ca.A00));
        }
        throw new InvalidAlgorithmParameterException(002.A0n("invalid key size: ", ". Valid keys must have ", " bytes.", i, 64));
    }
}
