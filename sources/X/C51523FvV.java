package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FvV  reason: case insensitive filesystem */
public final /* synthetic */ class C51523FvV implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserDetailFragment A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C51523FvV(View view, UserDetailFragment userDetailFragment, boolean z, boolean z2) {
        this.A01 = userDetailFragment;
        this.A00 = view;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void run() {
        Runnable frD;
        UserDetailFragment userDetailFragment = this.A01;
        View view = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (C319536ql.A03(view)) {
            if (z) {
                userDetailFragment.getString(2131973523);
                frD = new C51257FrC(userDetailFragment);
            } else if (z2) {
                userDetailFragment.getString(2131965618);
                frD = new C51258FrD(userDetailFragment);
            } else {
                return;
            }
            AnonymousClass5Gv r1 = userDetailFragment.A0Z;
            if (r1 == null) {
                r1 = C319536ql.A00(userDetailFragment.requireActivity(), view, C226262fy.BELOW_ANCHOR, userDetailFragment.getString(2131973523));
                userDetailFragment.A0Z = r1;
            }
            if (!UserDetailFragment.A0i(userDetailFragment) && r1 != null) {
                r1.A07(userDetailFragment.A0I);
                frD.run();
            }
        }
    }
}
