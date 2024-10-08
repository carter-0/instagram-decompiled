package X;

import android.widget.ImageView;

/* renamed from: X.M4s  reason: case insensitive filesystem */
public final class C65929M4s implements Runnable {
    public final /* synthetic */ LMz A00;

    public C65929M4s(LMz lMz) {
        this.A00 = lMz;
    }

    public final void run() {
        LMz lMz = this.A00;
        ImageView imageView = lMz.A03;
        C71392co r0 = C315596kB.A02;
        C294975nL A0A = C294975nL.A00(imageView).A0E(LMz.A06).A0A();
        A0A.A0U(1.0f, 0.9f, -1.0f);
        A0A.A0V(1.0f, 0.9f, -1.0f);
        A0A.A0M(1.0f, 0.0f);
        C65724Lye.A00(A0A, lMz, 25);
    }
}
