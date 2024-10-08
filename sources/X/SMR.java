package X;

import androidx.fragment.app.Fragment;

public final class SMR {
    public static final /* synthetic */ SMR A00 = new Object();

    public static final C13875Tiw A00(Fragment fragment) {
        C13875Tiw tiw;
        Fragment fragment2 = fragment;
        while (true) {
            if (tiw != null) {
                if (tiw instanceof C13875Tiw) {
                    break;
                }
                fragment2 = tiw.mParentFragment;
            } else {
                if (fragment != null) {
                    tiw = fragment.getActivity();
                } else {
                    tiw = null;
                }
                if (!(tiw instanceof C13875Tiw)) {
                    return null;
                }
            }
        }
        return tiw;
    }
}
