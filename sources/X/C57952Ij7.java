package X;

import android.widget.ImageView;

/* renamed from: X.Ij7  reason: case insensitive filesystem */
public final /* synthetic */ class C57952Ij7 implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C317596nW A01;
    public final /* synthetic */ C316706m5 A02;
    public final /* synthetic */ C255783ui A03;

    public /* synthetic */ C57952Ij7(C255773uh r1, C317596nW r2, C316706m5 r3, C255783ui r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void run() {
        C316706m5 r3 = this.A02;
        C255773uh r2 = this.A00;
        C255783ui r5 = this.A03;
        C317596nW r1 = this.A01;
        r3.A01.getClass();
        r3.A00.getClass();
        ImageView imageView = r3.A01;
        int width = r3.A00.getWidth();
        int height = r3.A00.getHeight();
        float A002 = r2.A00();
        C306406Ma r0 = C306406Ma.A00;
        0qQ.A0B(imageView, 0);
        C306406Ma.A04(imageView, r5, A002, width, height, true);
        ImageView imageView2 = r3.A01;
        imageView2.getClass();
        r1.DnC(imageView2, r2, r5);
    }
}
