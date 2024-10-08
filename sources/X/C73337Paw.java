package X;

import android.view.View;

/* renamed from: X.Paw  reason: case insensitive filesystem */
public final class C73337Paw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69106Nel A01;
    public final /* synthetic */ boolean A02;

    public C73337Paw(C69106Nel nel, int i, boolean z) {
        this.A01 = nel;
        this.A02 = z;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.Ps0, java.lang.Object] */
    public final void run() {
        C69106Nel nel = this.A01;
        if (nel.A03 == null && this.A02) {
            AnonymousClass0eM r1 = nel.A0G.A09;
            nel.A01 = AnonymousClass7TE.A0c(r1).getWidth();
            nel.A00 = AnonymousClass7TE.A0c(r1).getHeight();
            C69106Nel.A02(nel);
        }
        boolean z = this.A02;
        if (z) {
            nel.A0D.A05(PO2.A00);
        }
        OK7 ok7 = nel.A0F;
        int i = this.A00;
        ok7.A00.A00(new PK0(i - 1));
        PMQ pmq = nel.A0G;
        C73671Phk phk = new C73671Phk(nel, i, 2, z);
        View A0c = AnonymousClass7TE.A0c(pmq.A0E);
        A0c.setVisibility(0);
        C66580MXl.A1A(A0c);
        A0c.setAlpha(0.8f);
        C51972G9s.A0I(A0c).setDuration(500).setListener(new C71156OeV(pmq, phk)).start();
        nel.A0D.A05(new Object());
    }
}
