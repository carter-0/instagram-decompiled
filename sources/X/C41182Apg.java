package X;

import android.view.ViewGroup;

/* renamed from: X.Apg  reason: case insensitive filesystem */
public final class C41182Apg implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C316856mK A02;

    public C41182Apg(C255773uh r1, C255783ui r2, C316856mK r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C316856mK r1 = this.A02;
        ViewGroup A012 = C3019160o.A01(r1.A00());
        C306406Ma.A04(r1.A00(), this.A01, this.A00.A00(), A012.getWidth(), A012.getHeight(), true);
    }
}
