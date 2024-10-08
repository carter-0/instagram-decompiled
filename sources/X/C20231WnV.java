package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.WnV  reason: case insensitive filesystem */
public final class C20231WnV implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C15312UaJ A01;

    public C20231WnV(View view, C15312UaJ uaJ) {
        this.A01 = uaJ;
        this.A00 = view;
    }

    public final void run() {
        ScrollView scrollView = this.A01.A02;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, this.A00.getBottom());
        }
    }
}
