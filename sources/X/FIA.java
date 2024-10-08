package X;

import android.content.DialogInterface;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final /* synthetic */ class FIA implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ FIA(UserDetailFragment userDetailFragment, User user) {
        this.A00 = userDetailFragment;
        this.A01 = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A00;
        User user = this.A01;
        UserDetailFragment.A0P(new EDV(29, userDetailFragment, user), userDetailFragment, user, "suggest_request_follow_dialog", (String) null);
    }
}
