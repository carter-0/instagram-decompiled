package X;

/* renamed from: X.4UO  reason: invalid class name */
public final class AnonymousClass4UO implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass4OJ A02;
    public final /* synthetic */ C263684My A03;
    public final /* synthetic */ C263674Mx A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass4UO(AnonymousClass4OJ r1, C263684My r2, C263674Mx r3, String str, int i, long j, boolean z, boolean z2) {
        this.A02 = r1;
        this.A00 = i;
        this.A04 = r3;
        this.A03 = r2;
        this.A07 = z;
        this.A06 = z2;
        this.A01 = j;
        this.A05 = str;
    }

    public final void run() {
        C263444Ma r0 = this.A02.A03;
        int i = this.A00;
        C263674Mx r2 = this.A04;
        C263684My r1 = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        r0.CkW(r1, r2, this.A05, i, this.A01, z, z2);
    }
}
