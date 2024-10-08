package X;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5VR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5VR implements Runnable {
    public final /* synthetic */ AndroidComposeView A00;

    public /* synthetic */ AnonymousClass5VR(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    public final void run() {
        AndroidComposeView androidComposeView = this.A00;
        androidComposeView.A07 = false;
        MotionEvent motionEvent = androidComposeView.A03;
        0qQ.A0A(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            AndroidComposeView.A01(motionEvent, androidComposeView);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
    }
}
