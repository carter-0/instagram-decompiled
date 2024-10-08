package X;

import android.view.View;

public final /* synthetic */ class M4N implements Runnable {
    public final /* synthetic */ View A00;

    public /* synthetic */ M4N(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        2eQ.A02(view);
        view.post(new M4O(view));
    }
}
