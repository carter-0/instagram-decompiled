package X;

import android.view.View;

/* renamed from: X.IjV  reason: case insensitive filesystem */
public final class C57976IjV implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C267324bN A01;
    public final /* synthetic */ C52058GDe A02;
    public final /* synthetic */ GCV A03;
    public final /* synthetic */ String A04;

    public C57976IjV(View view, C267324bN r2, C52058GDe gDe, GCV gcv, String str) {
        this.A03 = gcv;
        this.A01 = r2;
        this.A02 = gDe;
        this.A00 = view;
        this.A04 = str;
    }

    public final void run() {
        GCV gcv = this.A03;
        GCV.A00(this.A00, this.A01, this.A02, gcv, this.A04);
    }
}
