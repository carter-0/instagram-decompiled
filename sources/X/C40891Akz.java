package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Akz  reason: case insensitive filesystem */
public final class C40891Akz implements Runnable {
    public final /* synthetic */ AnonymousClass6ZO A00;

    public C40891Akz(AnonymousClass6ZO r1) {
        this.A00 = r1;
    }

    public final void run() {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A00.A08.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            activity.finish();
        }
    }
}
