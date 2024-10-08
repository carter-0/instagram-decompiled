package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Aft  reason: case insensitive filesystem */
public final class C40631Aft implements C295005nO {
    public final /* synthetic */ C3503684j A00;

    public C40631Aft(C3503684j r1) {
        this.A00 = r1;
    }

    public final void onFinish() {
        C3503684j r3 = this.A00;
        List list = r3.A0J;
        synchronized (list) {
            int i = r3.A02 + 1;
            r3.A02 = i;
            if (i == list.size()) {
                r3.A02 = 0;
                View view = r3.A0A;
                Runnable runnable = r3.A0H;
                view.removeCallbacks(runnable);
                view.post(runnable);
                Runnable runnable2 = r3.A0I;
                view.removeCallbacks(runnable2);
                view.post(runnable2);
                return;
            }
            r3.A0A.postDelayed(new C20006WjR(this), 1000);
        }
    }
}
