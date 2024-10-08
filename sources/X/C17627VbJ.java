package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.VbJ  reason: case insensitive filesystem */
public final class C17627VbJ {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final FollowButton A06;

    public C17627VbJ(View view) {
        this.A00 = view;
        this.A05 = DbU.A0X(view, R.id.row_user_imageview);
        TextView A0G = DbU.A0G(view, R.id.row_user_username);
        this.A04 = A0G;
        A0G.getPaint().setFakeBoldText(true);
        this.A03 = DbU.A0G(view, R.id.row_user_subtitle);
        this.A02 = DbU.A0G(view, R.id.row_user_social_context);
        TextView A0G2 = DbU.A0G(view, R.id.row_requested_user_accept);
        this.A01 = A0G2;
        C13988Tno.A16(A0G2, true);
        this.A06 = (FollowButton) view.requireViewById(R.id.row_requested_user_follow_button_large);
    }
}
