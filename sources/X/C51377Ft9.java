package X;

import android.view.ViewGroup;

/* renamed from: X.Ft9  reason: case insensitive filesystem */
public final class C51377Ft9 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ViewGroup A01;

    public C51377Ft9(ViewGroup viewGroup, float f) {
        this.A01 = viewGroup;
        this.A00 = f;
    }

    public final void run() {
        ViewGroup viewGroup = this.A01;
        C71392co r0 = C315596kB.A02;
        C294975nL A012 = C294975nL.A01(viewGroup, 0);
        A012.A0G();
        A012.A0T(this.A00, viewGroup.getTranslationY());
        A012.A04 = 0;
        A012.A0H();
    }
}
