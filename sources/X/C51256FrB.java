package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.instagram.android.R;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FrB  reason: case insensitive filesystem */
public final /* synthetic */ class C51256FrB implements Runnable {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C51256FrB(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void run() {
        View findViewById;
        CoordinatorLayout coordinatorLayout = this.A00.A07;
        if (coordinatorLayout != null && (findViewById = coordinatorLayout.findViewById(R.id.row_profile_header)) != null) {
            ((AnonymousClass70C) findViewById.getTag()).AeZ().Bkt().A05();
        }
    }
}
