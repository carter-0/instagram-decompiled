package X;

public final class ONN {
    public final long A00;
    public final C10797RyJ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONN) {
                ONN onn = (ONN) obj;
                if (this.A00 != onn.A00 || !0qQ.A0K(this.A01, onn.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, C51975G9x.A03(this.A00));
    }

    public ONN(C10797RyJ ryJ, long j) {
        this.A00 = j;
        this.A01 = ryJ;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ECPInitDataValue(timestamp=");
        A1A.append(this.A00);
        A1A.append(", ecpInitData=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
