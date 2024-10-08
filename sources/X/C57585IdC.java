package X;

/* renamed from: X.IdC  reason: case insensitive filesystem */
public final class C57585IdC implements C59585JPf {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57585IdC) {
                C57585IdC idC = (C57585IdC) obj;
                if (this.A00 != idC.A00 || !0qQ.A0K(this.A01, idC.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int BEU() {
        return this.A00;
    }

    public final C53913GwJ Ezr(C70832Wc r4) {
        return C55237HeS.A00(HNO.A0B, this.A01, (C62320sa) null, (C62320sa) null);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, this.A00 * 31);
    }

    public C57585IdC(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Disabled(id=");
        A1A.append(this.A00);
        A1A.append(", text=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
