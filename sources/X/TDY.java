package X;

import android.view.View;

public final class TDY implements Runnable {
    public final /* synthetic */ View A00;

    public TDY(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}
