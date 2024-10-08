package X;

import com.instagram.profile.fragment.ProfileMediaTabFragment;

/* renamed from: X.71o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3252371o implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ProfileMediaTabFragment A01;

    public /* synthetic */ C3252371o(ProfileMediaTabFragment profileMediaTabFragment, int i) {
        this.A01 = profileMediaTabFragment;
        this.A00 = i;
    }

    public final void run() {
        C16129UpG upG;
        ProfileMediaTabFragment profileMediaTabFragment = this.A01;
        int i = this.A00;
        if (profileMediaTabFragment.mRecyclerView == null) {
            return;
        }
        if (!profileMediaTabFragment.A08 || (upG = profileMediaTabFragment.A01) == null) {
            AnonymousClass71N r1 = profileMediaTabFragment.A02;
            r1.A02.A03 = i;
            r1.A01();
            return;
        }
        upG.A02.A03 = i;
        upG.A01();
    }
}
