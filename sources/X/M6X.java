package X;

import android.view.View;

public final class M6X implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ JYD A01;

    public M6X(View view, JYD jyd) {
        this.A01 = jyd;
        this.A00 = view;
    }

    public final void run() {
        JYD jyd = this.A01;
        View view = this.A00;
        view.setVisibility(0);
        view.animate().cancel();
        view.setAlpha(0.15f);
        C51972G9s.A0I(view).setDuration(1000).withEndAction(new M6Z(view, jyd)).start();
    }
}
