package X;

/* renamed from: X.Wpo  reason: case insensitive filesystem */
public final class C20349Wpo implements Runnable {
    public final /* synthetic */ AnonymousClass4OJ A00;
    public final /* synthetic */ C297475ro A01;
    public final /* synthetic */ C284815Oa A02;
    public final /* synthetic */ C263684My A03;
    public final /* synthetic */ C263674Mx A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C20349Wpo(AnonymousClass4OJ r1, C297475ro r2, C284815Oa r3, C263684My r4, C263674Mx r5, String str, boolean z) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = z;
        this.A05 = str;
    }

    public final void run() {
        AnonymousClass4MZ r0 = this.A00.A02;
        C263674Mx r4 = this.A04;
        C263684My r3 = this.A03;
        r0.Chw(this.A01, this.A02, r3, r4, this.A05, this.A06);
    }
}
