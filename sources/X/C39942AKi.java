package X;

import android.content.DialogInterface;

/* renamed from: X.AKi  reason: case insensitive filesystem */
public final class C39942AKi implements DialogInterface.OnClickListener {
    public final /* synthetic */ C357128Wq A00;
    public final /* synthetic */ C390709ri A01;
    public final /* synthetic */ C390789rq A02;
    public final /* synthetic */ String A03;

    public C39942AKi(C357128Wq r1, C390709ri r2, C390789rq r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C357128Wq r5 = this.A00;
        0wc r4 = r5.A06;
        AnonymousClass8Wm r3 = r5.A0A;
        AIG.A00(r4, r3.AbO(), this.A03, r5.A03);
        C357128Wq.A01(r5, this.A01, this.A02, (Runnable) null);
        r3.DND();
    }
}
