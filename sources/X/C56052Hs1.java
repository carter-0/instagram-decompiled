package X;

/* renamed from: X.Hs1  reason: case insensitive filesystem */
public final class C56052Hs1 {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C56052Hs1) || j != ((C56052Hs1) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(C289095d0.A00(C51971G9r.A01(j)));
        A1A.append(" x ");
        return AnonymousClass7TF.A0i(C289095d0.A00(C51972G9s.A00(j)), A1A);
    }

    public /* synthetic */ C56052Hs1(long j) {
        this.A00 = j;
    }
}
