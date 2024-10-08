package X;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2ji  reason: invalid class name and case insensitive filesystem */
public final class C227662ji extends AnonymousClass06A {
    public final /* synthetic */ C227552jW A00;

    public C227662ji(C227552jW r1) {
        this.A00 = r1;
    }

    public final View A00(int i) {
        Window window;
        C227552jW r2 = this.A00;
        FragmentActivity activity = r2.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || window.getDecorView() == null) {
            throw new IllegalStateException("Fragment does not have a Activity view");
        }
        FragmentActivity activity2 = r2.getActivity();
        if (activity2 != null) {
            return activity2.findViewById(i);
        }
        return null;
    }

    public final boolean A01() {
        Window window;
        FragmentActivity activity = this.A00.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }
}
