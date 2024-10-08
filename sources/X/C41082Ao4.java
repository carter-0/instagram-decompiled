package X;

import android.view.View;

/* renamed from: X.Ao4  reason: case insensitive filesystem */
public final class C41082Ao4 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C3264076q A01;

    public C41082Ao4(View view, C3264076q r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        Integer num;
        C3264076q r2 = this.A01;
        r2.A05 = true;
        A47 a47 = r2.A02;
        if (!(a47 == null || (num = r2.A03) == null)) {
            a47.A00.add(num);
        }
        C3264076q.A00(this.A00);
        C3264076q.A01(r2.A01);
    }
}
