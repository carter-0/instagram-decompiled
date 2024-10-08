package X;

import java.lang.ref.WeakReference;

/* renamed from: X.TuO  reason: case insensitive filesystem */
public final class C14341TuO implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C242423Ua A03;
    public final /* synthetic */ AnonymousClass3WR A04;
    public final /* synthetic */ C14044Tol A05;
    public final /* synthetic */ C263754Nf A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C14341TuO(C242423Ua r1, AnonymousClass3WR r2, C14044Tol tol, C263754Nf r4, String str, String str2, float f, int i, int i2, boolean z, boolean z2) {
        this.A05 = tol;
        this.A0A = z;
        this.A04 = r2;
        this.A03 = r1;
        this.A06 = r4;
        this.A00 = f;
        this.A09 = z2;
        this.A08 = str;
        this.A07 = str2;
        this.A02 = i;
        this.A01 = i2;
    }

    public final void run() {
        C14044Tol tol = this.A05;
        AnonymousClass4M3 r1 = tol.A06;
        r1.Ech(this.A0A);
        AnonymousClass3WR r6 = this.A04;
        C242423Ua r4 = this.A03;
        C263754Nf r7 = this.A06;
        float f = this.A00;
        boolean z = this.A09;
        r1.E4H(new C263794Nj(r4, new C263414Lx(false, false, false, false), r6, r7, this.A07, this.A08, f, this.A02, this.A01, z));
        tol.A07.A01 = new WeakReference(r7);
    }
}
