package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Ezi  reason: case insensitive filesystem */
public final class C49625Ezi {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final HashtagFollowButton A03;
    public final GradientSpinnerAvatarView A04;

    public C49625Ezi(View view, int i) {
        0qQ.A0B(view, 1);
        ViewGroup A0I = DbX.A0I(view, R.id.follow_list_container);
        this.A00 = A0I;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.follow_list_username);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.follow_list_subtitle);
        this.A04 = DbX.A0j(view, R.id.follow_list_user_imageview);
        A0I.setPadding(i, 0, i, 0);
        View inflate = ((ViewStub) AnonymousClass7TF.A0F(view, R.id.hashtag_follow_button_stub)).inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.hashtag.ui.HashtagFollowButton");
        this.A03 = (HashtagFollowButton) inflate;
    }
}
