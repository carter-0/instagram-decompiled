package X;

/* renamed from: X.MbB  reason: case insensitive filesystem */
public final class C66704MbB extends C69599Noh {
    public final int A00;
    public final C254743sy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66704MbB) {
                C66704MbB mbB = (C66704MbB) obj;
                if (!0qQ.A0K(this.A01, mbB.A01) || this.A00 != mbB.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C66704MbB(C254743sy r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OpenThread(threadKey=");
        A1A.append(this.A01);
        A1A.append(", threadSubtype=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
