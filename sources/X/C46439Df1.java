package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Df1  reason: case insensitive filesystem */
public final /* synthetic */ class C46439Df1 implements Runnable {
    public final /* synthetic */ C3034368u A00;
    public final /* synthetic */ UserDetailFragment A01;

    public /* synthetic */ C46439Df1(C3034368u r1, UserDetailFragment userDetailFragment) {
        this.A01 = userDetailFragment;
        this.A00 = r1;
    }

    public final void run() {
        UserDetailFragment userDetailFragment = this.A01;
        C3034368u r2 = this.A00;
        if (userDetailFragment.isResumed()) {
            C322486vu r1 = userDetailFragment.A0z.A0P;
            if (r1.A05 != r2) {
                r1.A05 = r2;
                r1.A00();
            }
        }
    }
}
