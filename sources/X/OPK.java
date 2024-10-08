package X;

import androidx.fragment.app.FragmentActivity;

public abstract class OPK {
    public static final void A01(AnonymousClass4DH r3, String str) {
        A00(r3);
        0wb.A01.Ew1("ThreadKey is null", str, 1);
    }

    public static final void A00(AnonymousClass4DH r1) {
        FragmentActivity requireActivity = r1.requireActivity();
        requireActivity.runOnUiThread(new PVK(requireActivity));
    }
}
