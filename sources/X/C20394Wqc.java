package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.Wqc  reason: case insensitive filesystem */
public final class C20394Wqc implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C307996Sh A03;
    public final /* synthetic */ C307786Rm A04;
    public final /* synthetic */ C276544tV A05;
    public final /* synthetic */ C276694tk A06;
    public final /* synthetic */ C17981VjJ A07;

    public C20394Wqc(Context context, C307996Sh r2, C307786Rm r3, C276544tV r4, C276694tk r5, C17981VjJ vjJ, int i, long j) {
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = context;
        this.A00 = i;
        this.A06 = r5;
        this.A07 = vjJ;
        this.A05 = r4;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C308006Si r0 = C307996Sh.A04;
        C307996Sh r2 = this.A03;
        C307786Rm r3 = this.A04;
        C244943c0 A012 = r0.A01(this.A02, r2, r3, C307806Ro.A00(r3), this.A00);
        C276694tk r8 = this.A06;
        return C276674ti.A01(C276704tl.DEFAULT, r8.A01(this.A07), new C58205Io9(0, this.A01, A012, this.A05, r8));
    }
}
