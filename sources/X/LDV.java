package X;

public final class LDV {
    public long A00;
    public Integer A01;
    public final long A02;
    public final int A03;

    public LDV(Integer num, int i, long j, long j2) {
        this.A03 = i;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = num;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A03);
        A1A.append(';');
        A1A.append(this.A02);
        A1A.append(';');
        A1A.append(this.A00);
        A1A.append(';');
        A1A.append(C63290KuZ.A00(this.A01));
        return A1A.toString();
    }
}
