package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.WnW  reason: case insensitive filesystem */
public final class C20232WnW implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C16002Umj A01;

    public C20232WnW(View view, C16002Umj umj) {
        this.A01 = umj;
        this.A00 = view;
    }

    public final void run() {
        ScrollView scrollView = this.A01.A01;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, this.A00.getBottom());
        }
    }
}
