package X;

public final class S35 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public S35(String str, String str2, long j, long j2, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z;
        this.A05 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A03);
        A1A.append("/");
        A1A.append(this.A02);
        A1A.append("/");
        A1A.append(this.A00);
        A1A.append("/");
        A1A.append(this.A01);
        A1A.append("/");
        A1A.append(this.A04);
        A1A.append("/");
        A1A.append(this.A05);
        return DbT.A10(A1A);
    }
}
