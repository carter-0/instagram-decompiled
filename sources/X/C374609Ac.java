package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Ac  reason: invalid class name and case insensitive filesystem */
public final class C374609Ac extends AnonymousClass99N {
    public final C374639Af A00;
    public final C3740497y A01;
    public final Integer A02;

    public static C374609Ac A00(C374639Af r3, Integer num) {
        C3740497y A012;
        C39881ADd aDd = r3.A01;
        if (aDd == C39881ADd.A01) {
            if (num == null) {
                A012 = C375109Ch.A00;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (aDd != C39881ADd.A02) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown Variant: ");
            sb.append(aDd);
            throw new GeneralSecurityException(sb.toString());
        } else if (num != null) {
            A012 = C375109Ch.A01(num.intValue());
        } else {
            throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
        }
        return new C374609Ac(r3, A012, num);
    }

    public C374609Ac(C374639Af r1, C3740497y r2, Integer num) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
    }
}
