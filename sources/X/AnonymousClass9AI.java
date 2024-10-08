package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AI  reason: invalid class name */
public final class AnonymousClass9AI extends AnonymousClass99N {
    public final C3744099i A00;
    public final C3740497y A01;
    public final C375079Cd A02;
    public final Integer A03;

    public static AnonymousClass9AI A00(C3743999h r5, C375079Cd r6, Integer num) {
        C3740497y A012;
        C3743999h r4 = C3743999h.A02;
        if (r5 != r4 && num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("For given Variant ");
            sb.append(r5);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        } else if (r5 != r4 || num == null) {
            int length = r6.A00.A00.length;
            if (length == 32) {
                C3744099i r3 = new C3744099i(r5);
                C3743999h r2 = r3.A00;
                if (r2 == r4) {
                    A012 = C375109Ch.A00;
                } else if (r2 == C3743999h.A01) {
                    A012 = C375109Ch.A00(num.intValue());
                } else if (r2 == C3743999h.A03) {
                    A012 = C375109Ch.A01(num.intValue());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown Variant: ");
                    sb2.append(r2);
                    throw new IllegalStateException(sb2.toString());
                }
                return new AnonymousClass9AI(r3, A012, r6, num);
            }
            throw new GeneralSecurityException(002.A0O("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }

    public AnonymousClass9AI(C3744099i r1, C3740497y r2, C375079Cd r3, Integer num) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = num;
    }
}
