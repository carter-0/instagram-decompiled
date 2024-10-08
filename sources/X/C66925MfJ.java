package X;

/* renamed from: X.MfJ  reason: case insensitive filesystem */
public final class C66925MfJ extends AnonymousClass0T0 {
    public final long A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66925MfJ) {
                C66925MfJ mfJ = (C66925MfJ) obj;
                if (!(this.A02 == mfJ.A02 && this.A01 == mfJ.A01 && this.A00 == mfJ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A02)) + C51968G9o.A03(this.A00);
    }

    public C66925MfJ(long j, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadState(isLoading=");
        A1A.append(this.A02);
        A1A.append(", canLoadMore=");
        A1A.append(this.A01);
        A1A.append(", oldestThreadLoadTimestamp=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
