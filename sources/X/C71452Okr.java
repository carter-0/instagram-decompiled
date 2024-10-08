package X;

import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Okr  reason: case insensitive filesystem */
public final class C71452Okr implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ C66633Ma2 A00;

    public C71452Okr(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void onWindowFocusChanged(boolean z) {
        FragmentActivity activity = this.A00.A1J.getActivity();
        if (activity != null && activity.getWindow() != null) {
            Window window = activity.getWindow();
            AnonymousClass79I A002 = AnonymousClass79I.A02.A00();
            if (z) {
                A002.A02(window, "DirectInboxController");
            } else {
                A002.A01(window, "DirectInboxController");
            }
        }
    }
}
