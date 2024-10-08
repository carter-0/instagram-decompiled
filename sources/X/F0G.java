package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

public final class F0G {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final GradientSpinnerAvatarView A04;
    public final FollowButton A05;

    public F0G(View view) {
        this.A00 = view;
        this.A04 = DbX.A0j(view, R.id.recommended_user_card_avatar_view);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.recommended_user_card_name);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.recommended_user_card_context);
        this.A05 = (FollowButton) AnonymousClass7TF.A0F(view, R.id.recommended_user_card_follow_button);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.recommended_user_dismiss_button);
    }
}
