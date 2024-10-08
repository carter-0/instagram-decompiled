package X;

public final class NT6 extends NT7 {
    public final int A00;
    public final long A01;
    public final String A02;

    public NT6(1OS r9, String str, int i, long j, long j2) {
        super(r9, (C270214gN) null, AnonymousClass05K.A0Y, Long.valueOf(j), (String) null, (String) null, (String) null);
        this.A02 = str;
        this.A01 = j2;
        this.A00 = i;
    }

    public final String A00() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.A00());
        A1A.append(" messageId=");
        A1A.append(this.A02);
        A1A.append(" errorCode=");
        A1A.append(this.A01);
        A1A.append(" messageSendStatus=");
        A1A.append(this.A00);
        return DbT.A10(A1A);
    }
}
