package X;

import android.content.DialogInterface;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final /* synthetic */ class FIB implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ FIB(UserDetailFragment userDetailFragment, User user) {
        this.A00 = userDetailFragment;
        this.A01 = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A00;
        User user = this.A01;
        C273004lm A002 = C272994ll.A00(userDetailFragment.A0I);
        long parseLong = Long.parseLong(user.getId());
        0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "fan_management_follow_after_onboarded");
        Dbb.A1D(A0e, "profile", parseLong);
        A0e.Cgf();
        if (userDetailFragment.isResumed()) {
            FH6.A01(userDetailFragment.requireActivity(), (0xF) null, (1P0) null, userDetailFragment.A0I, (1Xj) null, (AnonymousClass3W1) null, user, "user_profile_header");
        }
    }
}
