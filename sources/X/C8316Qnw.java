package X;

/* renamed from: X.Qnw  reason: case insensitive filesystem */
public final class C8316Qnw extends C9018RLt {
    public final long A00;
    public final C9143RQu A01;
    public final C9144RQv A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9018RLt)) {
                return false;
            }
            C8316Qnw qnw = (C8316Qnw) ((C9018RLt) obj);
            if (this.A00 != qnw.A00 || !this.A02.equals(qnw.A02) || !this.A01.equals(qnw.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ ((((C51968G9o.A03(this.A00) ^ 1000003) * 1000003) ^ this.A02.hashCode()) * 1000003);
    }

    public C8316Qnw(C9143RQu rQu, C9144RQv rQv, long j) {
        this.A00 = j;
        if (rQv != null) {
            this.A02 = rQv;
            this.A01 = rQu;
            return;
        }
        throw AnonymousClass7TE.A11("Null transportContext");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PersistedEvent{id=");
        A1A.append(this.A00);
        A1A.append(", transportContext=");
        A1A.append(this.A02);
        A1A.append(", event=");
        return C66582MXn.A0v(this.A01, A1A);
    }
}
