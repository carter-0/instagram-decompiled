package X;

import android.widget.AbsListView;
import androidx.fragment.app.Fragment;

/* renamed from: X.VIo  reason: case insensitive filesystem */
public abstract class C17118VIo {
    public static final void A00(AbsListView absListView, Fragment fragment) {
        AnonymousClass7TF.A1H(fragment, absListView);
        if (absListView.getCount() != 0 && absListView.getHeight() != 0) {
            absListView.smoothScrollToPosition(0);
            absListView.postDelayed(new C20257Wnw(absListView, fragment), 100);
        }
    }
}
