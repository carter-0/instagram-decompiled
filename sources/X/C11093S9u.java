package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.S9u  reason: case insensitive filesystem */
public abstract class C11093S9u {
    public static final boolean A01(Bundle bundle, Fragment fragment, boolean z) {
        C13613Tdf targetFragment = fragment.getTargetFragment();
        if (targetFragment instanceof C13613Tdf) {
            07M.A02(fragment);
            if (targetFragment.DGj(bundle, fragment.mTargetRequestCode, z)) {
                return true;
            }
        }
        C13613Tdf tdf = fragment.mParentFragment;
        if (tdf instanceof C13613Tdf) {
            07M.A02(fragment);
            if (tdf.DGj(bundle, fragment.mTargetRequestCode, z)) {
                return true;
            }
        }
        C13613Tdf activity = fragment.getActivity();
        if (!(activity instanceof C13613Tdf)) {
            return false;
        }
        07M.A02(fragment);
        return activity.DGj(bundle, fragment.mTargetRequestCode, z);
    }

    public static void A00(Bundle bundle, Fragment fragment, boolean z) {
        A01(bundle, fragment, z);
        SRV A0E = AnonymousClass2E0.A0E();
        C11168SDi sDi = A0E.A02;
        if (sDi == null) {
            sDi = new C11168SDi(A0E.A09);
            A0E.A02 = sDi;
        }
        new C309516Yo(fragment.requireActivity(), sDi.A00).A06();
    }
}
