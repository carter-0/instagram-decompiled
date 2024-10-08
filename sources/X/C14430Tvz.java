package X;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Tvz  reason: case insensitive filesystem */
public abstract class C14430Tvz extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgThemedFragment";

    public void onResume() {
        Window window;
        int A02 = AnonymousClass0fD.A02(1672790109);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(2Yu.A0F(window.getContext(), 16842801)));
        }
        AnonymousClass0fD.A09(1850724313, A02);
    }
}
