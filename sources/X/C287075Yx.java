package X;

/* renamed from: X.5Yx  reason: invalid class name and case insensitive filesystem */
public final class C287075Yx extends AnonymousClass0T0 implements C287085Yy {
    public final long A00;

    public final C267804cE AKt(C287615aU r4) {
        0qQ.A0B(r4, 0);
        return new GPP(r4, this.A00);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C287075Yx) {
                long j = this.A00;
                long j2 = ((C287075Yx) obj).A00;
                long j3 = AnonymousClass5RW.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        return (int) (j ^ (j >>> 32));
    }

    public C287075Yx(long j) {
        this.A00 = j;
    }
}
