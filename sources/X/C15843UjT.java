package X;

import android.content.Intent;
import android.view.View;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.UjT  reason: case insensitive filesystem */
public final class C15843UjT extends AnonymousClass3NK {
    public final /* synthetic */ UserDetailTabController A00;

    public C15843UjT(UserDetailTabController userDetailTabController) {
        this.A00 = userDetailTabController;
    }

    public final boolean Dqe(View view) {
        Intent intent = new Intent();
        UserDetailTabController userDetailTabController = this.A00;
        intent.putExtra(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userDetailTabController.A0Z);
        Dba.A0k(userDetailTabController.A0I, intent);
        return true;
    }
}
