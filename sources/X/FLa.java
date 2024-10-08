package X;

import android.content.Context;
import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final /* synthetic */ class FLa implements View.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ FLa(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onClick(View view) {
        String A0h;
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.A10.A03 != null && userDetailFragment.A17 != null && userDetailFragment.mView != null && userDetailFragment.getContext() != null && userDetailFragment.isResumed()) {
            User user = userDetailFragment.A10.A03;
            C323606xm r0 = userDetailFragment.A17;
            Context context = userDetailFragment.getContext();
            User user2 = r0.A03;
            EBG ebg = null;
            if (!(user2 == null || context == null || (A0h = DbW.A0h(context, user2.B8Q(), 2131970077)) == null)) {
                ebg = new EBG(context, A0h);
            }
            UserDetailFragment.A0P(ebg, userDetailFragment, user, C273654mx.A00(900), (String) null);
            userDetailFragment.A17.A01(userDetailFragment.getContext(), userDetailFragment.mView, false);
        }
    }
}
