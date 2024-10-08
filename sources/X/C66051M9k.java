package X;

import android.graphics.Bitmap;

/* renamed from: X.M9k  reason: case insensitive filesystem */
public final /* synthetic */ class C66051M9k implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C62934Kom A02;
    public final /* synthetic */ LP1 A03;

    public /* synthetic */ C66051M9k(Bitmap bitmap, C62934Kom kom, LP1 lp1, int i) {
        this.A03 = lp1;
        this.A01 = bitmap;
        this.A00 = i;
        this.A02 = kom;
    }

    public final void run() {
        LP1 lp1 = this.A03;
        Bitmap bitmap = this.A01;
        int i = this.A00;
        C62934Kom kom = this.A02;
        MUV muv = lp1.A02;
        if (muv != null) {
            muv.APo(bitmap, i, kom.A03);
        }
    }
}
