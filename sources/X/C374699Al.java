package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Al  reason: invalid class name and case insensitive filesystem */
public final class C374699Al extends AnonymousClass99N {
    public final C3744299k A00;
    public final C3740497y A01;
    public final C375079Cd A02;
    public final Integer A03;

    public static C374699Al A00(C3744199j r5, C375079Cd r6, Integer num) {
        C3740497y A012;
        C3744199j r4 = C3744199j.A02;
        if (r5 != r4 && num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("For given Variant ");
            sb.append(r5);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        } else if (r5 != r4 || num == null) {
            int length = r6.A00.A00.length;
            if (length == 32) {
                C3744299k r3 = new C3744299k(r5);
                C3744199j r2 = r3.A00;
                if (r2 == r4) {
                    A012 = C375109Ch.A00;
                } else if (r2 == C3744199j.A01) {
                    A012 = C375109Ch.A00(num.intValue());
                } else if (r2 == C3744199j.A03) {
                    A012 = C375109Ch.A01(num.intValue());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown Variant: ");
                    sb2.append(r2);
                    throw new IllegalStateException(sb2.toString());
                }
                return new C374699Al(r3, A012, r6, num);
            }
            throw new GeneralSecurityException(002.A0O("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }

    public C374699Al(C3744299k r1, C3740497y r2, C375079Cd r3, Integer num) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = num;
    }
}
