package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.6pN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C318696pN implements Runnable {
    public final /* synthetic */ C322596w5 A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C318696pN(C322596w5 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        C323606xm r0;
        boolean z;
        C323606xm r02;
        C322596w5 r03 = this.A00;
        boolean z2 = this.A01;
        UserDetailFragment userDetailFragment = r03.A00;
        if ((!UserDetailFragment.A0h(userDetailFragment) || (r02 = userDetailFragment.A17) == null || !r02.A03()) && ((r0 = userDetailFragment.A17) == null || r0.A00 == null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z2 || !z) {
            userDetailFragment.A11.A03(!z2);
        }
    }
}
