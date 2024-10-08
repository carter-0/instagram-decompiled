package X;

import android.view.View;

public final class PVG implements Runnable {
    public final /* synthetic */ View A00;

    public PVG(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        view.setBottom(view.getBottom() + AnonymousClass2uJ.A00);
        0nA.A0r(view, this);
    }
}
