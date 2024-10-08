package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

public final class UEI extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final FollowButton A08;
    public final ViewStub A09;

    public UEI(View view) {
        super(view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.suggested_entity_card_container);
        this.A07 = DbX.A0a(view, R.id.suggested_entity_card_image);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.suggested_entity_card_name);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.suggested_entity_card_context);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.dismiss_button);
        this.A08 = (FollowButton) AnonymousClass7TF.A0F(view, R.id.suggested_user_card_follow_button);
        ViewStub A0X = JTR.A0X(view, R.id.follow_actions_stub);
        this.A09 = A0X;
        View inflate = A0X.inflate();
        0qQ.A07(inflate);
        this.A02 = inflate;
        this.A03 = AnonymousClass7TG.A0R(inflate, R.id.row_requested_user_accept);
        this.A05 = AnonymousClass7TG.A0R(inflate, R.id.row_requested_user_ignore);
    }
}
