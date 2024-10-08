package X;

import android.view.View;

public final class PWD implements Runnable {
    public final /* synthetic */ View A00;

    public PWD(View view) {
        this.A00 = view;
    }

    public final void run() {
        this.A00.performHapticFeedback(0);
    }
}
