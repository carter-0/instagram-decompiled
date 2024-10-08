package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.IDo  reason: case insensitive filesystem */
public final class C56817IDo implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UserDetailFragment A00;

    public C56817IDo(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onGlobalLayout() {
        UserDetailFragment userDetailFragment = this.A00;
        C318916pk r0 = userDetailFragment.A0s;
        if (r0 != null) {
            C318916pk.A00(r0);
            C318916pk.A01(r0);
        }
        ViewGroup viewGroup = userDetailFragment.A06;
        if (viewGroup != null) {
            C51967G9n.A0y(viewGroup, this);
        }
    }
}
