package X;

import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Okq  reason: case insensitive filesystem */
public final class C71451Okq implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ AnonymousClass7TI A00;

    public C71451Okq(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final void onWindowFocusChanged(boolean z) {
        FragmentActivity activity = this.A00.A0U.getActivity();
        if (activity != null && activity.getWindow() != null) {
            Window window = activity.getWindow();
            AnonymousClass79I A002 = AnonymousClass79I.A02.A00();
            if (z) {
                A002.A02(window, "DirectThreadController");
            } else {
                A002.A01(window, "DirectThreadController");
            }
        }
    }
}
