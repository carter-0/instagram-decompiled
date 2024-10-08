package X;

import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Wps  reason: case insensitive filesystem */
public final class C20353Wps implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ CircularImageView A04;
    public final /* synthetic */ CircularImageView A05;
    public final /* synthetic */ WJp A06;

    public C20353Wps(CircularImageView circularImageView, CircularImageView circularImageView2, WJp wJp, int i, int i2, int i3, int i4) {
        this.A06 = wJp;
        this.A05 = circularImageView;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = circularImageView2;
        this.A02 = i3;
        this.A01 = i4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void run() {
        WJp wJp = this.A06;
        wJp.A09 = false;
        ? r1 = this.A05;
        C71392co r0 = C315596kB.A02;
        C294975nL A0A = C294975nL.A01(r1, 0).A0A();
        A0A.A0S((float) ((-this.A00) - wJp.A0B), (float) this.A03);
        A0A.A0H();
        C294975nL A0A2 = C294975nL.A01(this.A04, 0).A0A();
        A0A2.A0S((float) this.A02, (float) this.A01);
        A0A2.A06 = new C19673Wdb(this, 3);
        A0A2.A05 = new C19671WdZ(this, 5);
        A0A2.A0H();
    }
}
