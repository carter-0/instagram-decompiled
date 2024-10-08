package X;

/* renamed from: X.9bl  reason: invalid class name and case insensitive filesystem */
public final class C381439bl extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public C381439bl(int i, String str, String str2, long j) {
        AnonymousClass7TG.A1P(str, str2);
        this.A03 = str;
        this.A01 = j;
        this.A02 = str2;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectMutationInfo(type=");
        A1A.append(this.A03);
        A1A.append(", createdAtMs=");
        A1A.append(this.A01);
        A1A.append(", lifecycleState=");
        A1A.append(this.A02);
        A1A.append(", sendRetryCount=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
