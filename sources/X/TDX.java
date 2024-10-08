package X;

import android.view.View;

public final class TDX implements Runnable {
    public final /* synthetic */ View A00;

    public TDX(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }
}
