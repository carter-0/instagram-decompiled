package X;

import android.view.View;

public final class M6D implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C39770A8k A01;

    public M6D(View view, C39770A8k a8k) {
        this.A01 = a8k;
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        view.setHapticFeedbackEnabled(true);
        view.performHapticFeedback(1);
    }
}
