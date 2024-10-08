package X;

public final class ONK {
    public final long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONK) {
                ONK onk = (ONK) obj;
                if (this.A00 != onk.A00 || !0qQ.A0K(this.A01, onk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, C51975G9x.A03(this.A00));
    }

    public ONK(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GenerateOneTimeCodeResponse(sessionId=");
        A1A.append(this.A00);
        A1A.append(", code=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}
