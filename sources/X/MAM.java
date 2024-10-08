package X;

import android.os.Handler;
import android.view.View;

public final class MAM implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public MAM(View view, boolean z) {
        this.A01 = z;
        this.A00 = view;
    }

    public static void A00(Handler handler, View view, long j, boolean z) {
        handler.postDelayed(new MAM(view, z), j);
    }

    public final void run() {
        boolean z = this.A01;
        View view = this.A00;
        if (z) {
            C294975nL A0b = JTP.A0b(view);
            A0b.A0P(0.6f, -1.0f);
            A0b.A0Q(0.6f, -1.0f);
            A0b.A0I(0.0f);
            A0b.A0H();
            return;
        }
        view.setScaleX(0.6f);
        view.setScaleY(0.6f);
        view.setAlpha(0.0f);
    }
}
