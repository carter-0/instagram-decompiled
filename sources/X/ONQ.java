package X;

public final class ONQ {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONQ) {
                ONQ onq = (ONQ) obj;
                if (!0qQ.A0K(this.A00, onq.A00) || !0qQ.A0K(this.A01, onq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)) + C51968G9o.A03(30000);
    }

    public ONQ(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ZeroHeadersHttpParams(url=");
        A1A.append(this.A00);
        A1A.append(", flowId=");
        A1A.append(this.A01);
        A1A.append(", timeoutDurationInMillis=");
        A1A.append(30000);
        return AnonymousClass7TG.A0p(A1A);
    }
}
