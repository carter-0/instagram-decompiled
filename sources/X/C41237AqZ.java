package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.AqZ  reason: case insensitive filesystem */
public final class C41237AqZ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass91N A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C41237AqZ(View view, AnonymousClass91N r2, boolean z, boolean z2, boolean z3) {
        this.A00 = view;
        this.A04 = z;
        this.A01 = r2;
        this.A03 = z2;
        this.A02 = z3;
    }

    public final void run() {
        C226262fy r0;
        View view = this.A00;
        Context A0S = AnonymousClass7TE.A0S(view);
        ViewGroup A012 = C3019160o.A01(view);
        boolean z = this.A04;
        int i = 2131975124;
        if (z) {
            i = 2131975127;
        }
        AnonymousClass5Gt r4 = new AnonymousClass5Gt(A0S, A012, new C315476jx(i));
        AnonymousClass91N r3 = this.A01;
        r4.A03(r3.A01);
        if (this.A03) {
            r0 = C226262fy.ABOVE_ANCHOR;
        } else {
            r0 = C226262fy.BELOW_ANCHOR;
        }
        r4.A05 = r0;
        r4.A00 = 5000;
        r4.A04 = new C389349pI(r3, 0, z, this.A02);
        r4.A00().A07(r3.A03);
    }
}
