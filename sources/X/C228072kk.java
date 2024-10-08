package X;

/* renamed from: X.2kk  reason: invalid class name and case insensitive filesystem */
public final class C228072kk implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass2PQ A02;
    public final /* synthetic */ AnonymousClass2PQ A03;
    public final /* synthetic */ AnonymousClass2PL A04;

    public C228072kk(AnonymousClass2PQ r1, AnonymousClass2PQ r2, AnonymousClass2PL r3, long j, long j2) {
        this.A04 = r3;
        this.A00 = j;
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = j2;
    }

    public final void run() {
        AnonymousClass2PQ r5;
        long j = this.A00;
        AnonymousClass2PL r6 = this.A04;
        if (j == r6.A00) {
            r5 = this.A03;
        } else {
            r5 = this.A02;
        }
        AnonymousClass2PL.A00(r5, r6, -1, -this.A01);
    }
}
