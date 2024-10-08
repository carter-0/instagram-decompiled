package X;

import android.view.ViewGroup;

/* renamed from: X.Wpl  reason: case insensitive filesystem */
public final class C20346Wpl implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass2xI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;

    public C20346Wpl(ViewGroup viewGroup, AnonymousClass2xI r2, String str, C62320sa r4, long j, boolean z) {
        this.A02 = r2;
        this.A04 = r4;
        this.A01 = viewGroup;
        this.A03 = str;
        this.A00 = j;
        this.A05 = z;
    }

    public final void run() {
        C226262fy r0;
        C283255Gu r02;
        AnonymousClass2xI r5 = this.A02;
        C283245Gr r8 = (C283245Gr) this.A04.invoke();
        ViewGroup viewGroup = this.A01;
        String str = this.A03;
        long j = this.A00;
        boolean z = this.A05;
        AnonymousClass5Gt r4 = new AnonymousClass5Gt(AnonymousClass7TE.A0S(viewGroup), viewGroup, new C315476jx((CharSequence) str));
        0qQ.A0B(r8, 0);
        r4.A03 = r8;
        C234192xF r1 = r5.A03;
        if (r1.EvT()) {
            r0 = C226262fy.ABOVE_ANCHOR;
        } else {
            r0 = C226262fy.BELOW_ANCHOR;
        }
        r4.A05 = r0;
        if (r1.EvU()) {
            r02 = C283255Gu.A07;
        } else {
            r02 = C283255Gu.A06;
        }
        r4.A07(r02);
        r4.A0A = false;
        r4.A0B = z;
        r4.A04 = r5.A04;
        AnonymousClass5Gv A002 = r4.A00();
        C20218WnI wnI = r5.A00;
        if (wnI != null) {
            r5.A01.removeCallbacks(wnI);
            AnonymousClass5Gv r12 = wnI.A00;
            if (r12.A09()) {
                r12.A08(false);
            }
        }
        C20218WnI wnI2 = new C20218WnI(r5.A02, A002);
        r5.A01.postDelayed(wnI2, j);
        r5.A00 = wnI2;
    }
}
