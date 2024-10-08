package X;

public final class F2B {
    public final long A00;
    public final String A01;
    public final String A02;

    public F2B(String str, String str2, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("timestamp=");
        A1A.append(this.A00);
        A1A.append(Pxd.A00(317));
        A1A.append("UNKNOWN");
        A1A.append(", reliabilityLabel=");
        A1A.append(this.A02);
        A1A.append(", details=");
        String A0l = AnonymousClass7TF.A0l(this.A01, A1A);
        0qQ.A07(A0l);
        return A0l;
    }
}
