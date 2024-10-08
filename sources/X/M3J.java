package X;

import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class M3J implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public M3J(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    public final void run() {
        LFX lfx;
        FollowersShareFragment followersShareFragment = this.A00;
        AnonymousClass3Q2 A05 = FollowersShareFragment.A05(followersShareFragment);
        if (A05 != null && (lfx = followersShareFragment.A0F) != null) {
            IgAutoCompleteTextView igAutoCompleteTextView = lfx.A01;
            if (igAutoCompleteTextView != null) {
                A05.A2Z = AnonymousClass7TF.A0f(igAutoCompleteTextView);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
