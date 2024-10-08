package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.Df7  reason: case insensitive filesystem */
public abstract class C46445Df7 {
    public static final void A00(View view, boolean z) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.listview_progressbar)) != null) {
            findViewById.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    public static void A01(Fragment fragment, boolean z) {
        A00(fragment.mView, z);
    }
}
