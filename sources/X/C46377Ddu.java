package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Ddu  reason: case insensitive filesystem */
public final /* synthetic */ class C46377Ddu implements View.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46377Ddu(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onClick(View view) {
        UserDetailFragment userDetailFragment = this.A00;
        UserDetailFragment.A0Q(userDetailFragment.A0z.A0B(), userDetailFragment, false, false);
        userDetailFragment.A07.removeView(userDetailFragment.A05);
        userDetailFragment.A05.setVisibility(8);
        User user = userDetailFragment.A10.A03;
        if (user != null) {
            C324046yW.A00(userDetailFragment.A0I).A01(user);
        }
    }
}
