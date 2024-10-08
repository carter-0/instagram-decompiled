package X;

/* renamed from: X.HsJ  reason: case insensitive filesystem */
public final class C56070HsJ {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56070HsJ) {
                long j = this.A01;
                C56070HsJ hsJ = (C56070HsJ) obj;
                long j2 = hsJ.A01;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A00 == hsJ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        int A02 = C51967G9n.A02(j);
        long j3 = this.A00;
        return A02 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C56070HsJ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SelectionColors(selectionHandleColor=");
        A1A.append(AnonymousClass5RW.A06(this.A01));
        A1A.append(", selectionBackgroundColor=");
        return AnonymousClass7TG.A0n(AnonymousClass5RW.A06(this.A00), A1A);
    }
}
