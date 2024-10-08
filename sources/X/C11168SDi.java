package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.SDi  reason: case insensitive filesystem */
public final class C11168SDi {
    public final 0lg A00;

    public static Fragment A00(Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 == null || (fragment instanceof C8810RAm)) {
            return fragment;
        }
        return A00(fragment2);
    }

    public C11168SDi(0lg r1) {
        this.A00 = r1;
    }
}
