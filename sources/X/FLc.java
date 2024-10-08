package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;

public final /* synthetic */ class FLc implements View.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ FLc(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onClick(View view) {
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.isResumed()) {
            userDetailFragment.getRootActivity().onBackPressed();
        }
    }
}
