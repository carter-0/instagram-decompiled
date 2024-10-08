package X;

/* renamed from: X.LFw  reason: case insensitive filesystem */
public final class C63969LFw {
    public final C62627Kiy A00;
    public final C62631Kj2 A01;
    public final Boolean A02;
    public final Double A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63969LFw) {
                C63969LFw lFw = (C63969LFw) obj;
                if (!0qQ.A0K(this.A02, lFw.A02) || this.A00 != lFw.A00 || !0qQ.A0K(this.A03, lFw.A03) || this.A01 != lFw.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C63969LFw(C62627Kiy kiy, C62631Kj2 kj2, Boolean bool, Double d) {
        this.A02 = bool;
        this.A00 = kiy;
        this.A03 = d;
        this.A01 = kj2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MEmuExtendedCaptureVerificationResult(isSimilar=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(100));
        A1A.append(this.A00);
        A1A.append(", similarityScore=");
        A1A.append(this.A03);
        A1A.append(", verificationStatus=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
