package X;

public final class ONJ {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONJ) {
                ONJ onj = (ONJ) obj;
                if (!0qQ.A0K(this.A00, onj.A00) || !0qQ.A0K(this.A01, onj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("GenerateRecoveryCodeAndVirtualDeviceIdResponse(recoveryCode=", this.A00, ", virtualDeviceId=", this.A01, ')');
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public ONJ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
