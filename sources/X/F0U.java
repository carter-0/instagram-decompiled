package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

public final class F0U {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final GradientSpinnerAvatarView A04;
    public final StackedAvatarView A05;

    public F0U(View view) {
        0qQ.A0B(view, 1);
        this.A00 = DbX.A0I(view, R.id.container);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.title);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        this.A03 = DbX.A0a(view, R.id.follower_group_icon);
        this.A05 = (StackedAvatarView) AnonymousClass7TF.A0F(view, R.id.stacked_avatar_view);
        this.A04 = DbX.A0j(view, R.id.single_avatar_view);
    }
}
