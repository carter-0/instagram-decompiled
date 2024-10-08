package X;

import android.content.DialogInterface;
import android.view.View;

public final class WAM implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ X4P A02;
    public final /* synthetic */ X4Q A03;
    public final /* synthetic */ AnonymousClass6ZF A04;
    public final /* synthetic */ C311376ca A05;
    public final /* synthetic */ X4R A06;
    public final /* synthetic */ X4U A07;
    public final /* synthetic */ C19200WPg A08;
    public final /* synthetic */ AnonymousClass6ZK A09;
    public final /* synthetic */ AnonymousClass6ZD A0A;
    public final /* synthetic */ AnonymousClass6ZC A0B;
    public final /* synthetic */ 0eP A0C;

    public WAM(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r2, X4P x4p, X4Q x4q, AnonymousClass6ZF r5, C311376ca r6, X4R x4r, X4U x4u, C19200WPg wPg, AnonymousClass6ZK r10, AnonymousClass6ZD r11, AnonymousClass6ZC r12, 0eP r13) {
        this.A08 = wPg;
        this.A0C = r13;
        this.A00 = onDismissListener;
        this.A04 = r5;
        this.A07 = x4u;
        this.A09 = r10;
        this.A0B = r12;
        this.A0A = r11;
        this.A05 = r6;
        this.A06 = x4r;
        this.A02 = x4p;
        this.A03 = x4q;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1917863918);
        C19200WPg wPg = this.A08;
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        AnonymousClass6ZF r6 = this.A04;
        X4U x4u = this.A07;
        AnonymousClass6ZK r12 = this.A09;
        AnonymousClass6ZC r14 = this.A0B;
        AnonymousClass6ZD r13 = this.A0A;
        C311376ca r7 = this.A05;
        X4R x4r = this.A06;
        X4P x4p = this.A02;
        X4Q x4q = this.A03;
        C19200WPg.A01(onDismissListener, this.A01, x4p, x4q, r6, r7, x4r, x4u, (C16593Uxn) this.A0C.A00, wPg, r12, r13, r14);
        AnonymousClass0fD.A0C(1630967535, A052);
    }
}
