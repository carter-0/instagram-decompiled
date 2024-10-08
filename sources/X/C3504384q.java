package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.84q  reason: invalid class name and case insensitive filesystem */
public final class C3504384q implements C3504484r {
    public BubbleSpinner A00;
    public Runnable A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final ViewStub A03;

    public C3504384q(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A03 = viewStub;
    }

    public final void A00() {
        BubbleSpinner bubbleSpinner = this.A00;
        if (bubbleSpinner == null) {
            View inflate = this.A03.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.bubblespinner.BubbleSpinner");
            bubbleSpinner = (BubbleSpinner) inflate;
            this.A00 = bubbleSpinner;
        }
        bubbleSpinner.setLoadingStatus(AnonymousClass8YA.LOADING);
    }

    public final void CLY() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
            this.A01 = null;
        }
        BubbleSpinner bubbleSpinner = this.A00;
        if (bubbleSpinner == null) {
            View inflate = this.A03.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.bubblespinner.BubbleSpinner");
            bubbleSpinner = (BubbleSpinner) inflate;
            this.A00 = bubbleSpinner;
        }
        bubbleSpinner.setLoadingStatus(AnonymousClass8YA.DONE);
    }
}
