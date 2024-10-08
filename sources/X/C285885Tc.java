package X;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5Tc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285885Tc implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView A00;

    public /* synthetic */ C285885Tc(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        AnonymousClass5V7 r0 = this.A00.A0V;
        int i = 2;
        if (z) {
            i = 1;
        }
        r0.A00.Epw(new AnonymousClass5V9(i));
    }
}
