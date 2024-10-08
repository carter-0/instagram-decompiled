package X;

import android.view.View;

public final class M6Z implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ JYD A01;

    public M6Z(View view, JYD jyd) {
        this.A00 = view;
        this.A01 = jyd;
    }

    public final void run() {
        View view = this.A00;
        if (view.getParent() != null) {
            JYD jyd = this.A01;
            jyd.A0C.removeView(view);
            jyd.A0W.offer(view);
        }
    }
}
