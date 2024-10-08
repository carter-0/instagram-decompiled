package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FrD  reason: case insensitive filesystem */
public final /* synthetic */ class C51258FrD implements Runnable {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C51258FrD(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void run() {
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.A00.A0I));
        A0p.E5T("should_show_share_profile_long_press_tooltip", false);
        A0p.apply();
    }
}
