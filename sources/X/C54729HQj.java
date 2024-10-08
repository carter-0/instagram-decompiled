package X;

/* renamed from: X.HQj  reason: case insensitive filesystem */
public final class C54729HQj {
    public float A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54729HQj) {
                C54729HQj hQj = (C54729HQj) obj;
                if (!(this.A01 == hQj.A01 && Float.compare(this.A00, hQj.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(C51975G9x.A03(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DataPointAtTime(time=");
        A1A.append(this.A01);
        A1A.append(", dataPoint=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
