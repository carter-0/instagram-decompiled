package X;

/* renamed from: X.S5e  reason: case insensitive filesystem */
public final class C11008S5e {
    public final long A00;
    public final C10750RxU A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11008S5e) {
                C11008S5e s5e = (C11008S5e) obj;
                if (this.A00 != s5e.A00 || !0qQ.A0K(this.A01, s5e.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, C51968G9o.A03(this.A00) * 31);
    }

    public C11008S5e(C10750RxU rxU, long j) {
        this.A00 = j;
        this.A01 = rxU;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductConfigValue(timestamp=");
        A1A.append(this.A00);
        A1A.append(", productConfig=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
