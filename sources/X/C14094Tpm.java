package X;

/* renamed from: X.Tpm  reason: case insensitive filesystem */
public final class C14094Tpm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass4OJ A02;
    public final /* synthetic */ C263684My A03;
    public final /* synthetic */ C263674Mx A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C14094Tpm(AnonymousClass4OJ r1, C263684My r2, C263674Mx r3, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A01 = j;
        this.A00 = i;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = str4;
    }

    public final void run() {
        AnonymousClass4MZ r0 = this.A02.A02;
        C263674Mx r2 = this.A04;
        C263684My r1 = this.A03;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A05;
        long j = this.A01;
        r0.ChQ(r1, r2, str, str2, str3, this.A08, this.A00, j, this.A09, this.A0A);
    }
}
