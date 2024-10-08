package X;

import java.util.concurrent.Callable;

/* renamed from: X.Wqd  reason: case insensitive filesystem */
public final /* synthetic */ class C20395Wqd implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C244943c0 A03;
    public final /* synthetic */ C307996Sh A04;
    public final /* synthetic */ C276544tV A05;
    public final /* synthetic */ C276694tk A06;
    public final /* synthetic */ C17981VjJ A07;

    public /* synthetic */ C20395Wqd(C244943c0 r1, C307996Sh r2, C276544tV r3, C276694tk r4, C17981VjJ vjJ, int i, int i2, int i3) {
        this.A04 = r2;
        this.A03 = r1;
        this.A00 = i;
        this.A06 = r4;
        this.A07 = vjJ;
        this.A05 = r3;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final Object call() {
        C307996Sh r4 = this.A04;
        C244943c0 r0 = this.A03;
        int i = this.A00;
        C276694tk r9 = this.A06;
        C17981VjJ vjJ = this.A07;
        C276544tV r8 = this.A05;
        int i2 = this.A01;
        int i3 = this.A02;
        Object obj = r0.A05;
        C244943c0 A012 = C307996Sh.A04.A01(r0.A04, r4, obj, C307806Ro.A00((C307786Rm) obj), i);
        return C276674ti.A01(C276704tl.DEFAULT, r9.A01(vjJ), new C20416Wr0(A012, r8, r9, i2, i3));
    }
}
