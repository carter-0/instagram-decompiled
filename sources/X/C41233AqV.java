package X;

import android.app.Dialog;

/* renamed from: X.AqV  reason: case insensitive filesystem */
public final /* synthetic */ class C41233AqV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C21986Xoh A01;
    public final /* synthetic */ AnonymousClass8HF A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C41233AqV(C21986Xoh xoh, AnonymousClass8HF r2, int i, boolean z, boolean z2) {
        this.A02 = r2;
        this.A03 = z;
        this.A01 = xoh;
        this.A04 = z2;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass8HF r5 = this.A02;
        boolean z = this.A03;
        C21986Xoh xoh = this.A01;
        boolean z2 = this.A04;
        r5.A0H.A01(xoh, this.A00, z, z2);
        AnonymousClass0eM r1 = r5.A09;
        if (((Dialog) r1.getValue()).isShowing()) {
            AnonymousClass7TF.A1N(r1);
        }
        if (z) {
            r5.A07(r5.A0T);
        }
        r5.A05();
    }
}
