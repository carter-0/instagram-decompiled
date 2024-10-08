package X;

import android.widget.FrameLayout;

/* renamed from: X.IjI  reason: case insensitive filesystem */
public final class C57963IjI implements Runnable {
    public final /* synthetic */ C273694n2 A00;
    public final /* synthetic */ AnonymousClass6NS A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C316746m9 A03;
    public final /* synthetic */ C255783ui A04;

    public C57963IjI(C273694n2 r1, AnonymousClass6NS r2, C255773uh r3, C316746m9 r4, C255783ui r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass6NS r0 = this.A01;
        C273694n2 r1 = this.A00;
        r0.A07(r1);
        C255783ui r2 = this.A04;
        FrameLayout frameLayout = this.A03.A00;
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        float A002 = this.A02.A00();
        C306406Ma r02 = C306406Ma.A00;
        0qQ.A0B(r1, 0);
        C306406Ma.A04(r1, r2, A002, width, height, false);
    }
}
