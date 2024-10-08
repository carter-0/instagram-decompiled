package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Kva  reason: case insensitive filesystem */
public abstract class C63353Kva {
    public static final void A00(Fragment fragment, Fragment fragment2, boolean z) {
        0qQ.A0B(fragment, 0);
        if (!z || (fragment = fragment.mParentFragment) != null) {
            0hq parentFragmentManager = fragment.getParentFragmentManager();
            int i = fragment.mFragmentId;
            0s1 r0 = new 0s1(parentFragmentManager);
            r0.A0A(fragment2, i);
            r0.A0I((String) null);
            r0.A01();
        }
    }
}
