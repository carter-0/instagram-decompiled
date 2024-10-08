package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fnn  reason: case insensitive filesystem */
public final class C51057Fnn implements C51952G8v {
    public final Fragment A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && DbY.A1b(this, obj) && 0qQ.A0K(this.A00, ((C51057Fnn) obj).A00));
    }

    public final 0hq B7v() {
        0hq childFragmentManager = this.A00.getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        return childFragmentManager;
    }

    public final boolean Cb4(boolean z) {
        Fragment fragment = this.A00;
        if (z) {
            return fragment.isAdded();
        }
        if (!fragment.isAdded() || fragment.isStateSaved()) {
            return false;
        }
        return true;
    }

    public final Context getContext() {
        return this.A00.requireContext();
    }

    public final AnonymousClass07V getLifecycle() {
        0h9 r0 = this.A00.mLifecycleRegistry;
        0qQ.A07(r0);
        return r0;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C51057Fnn(Fragment fragment) {
        this.A00 = fragment;
    }
}
