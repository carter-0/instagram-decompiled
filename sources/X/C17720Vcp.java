package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Vcp  reason: case insensitive filesystem */
public final class C17720Vcp {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final CircularImageView A0B;
    public final FollowButton A0C;
    public final boolean A0D;

    public C17720Vcp(Context context, View view, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A0D = z3;
        this.A0B = DbX.A0a(view, R.id.row_user_imageview);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.row_user_username);
        this.A0A = A0R;
        this.A09 = AnonymousClass7TG.A0R(view, R.id.row_user_subtitle);
        this.A08 = AnonymousClass7TG.A0R(view, R.id.row_user_social_context);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_requested_user_approval_actions);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.row_requested_user_accept);
        this.A04 = A0R2;
        TextView A0R3 = AnonymousClass7TG.A0R(view, R.id.row_requested_user_accept_secondary);
        this.A05 = A0R3;
        TextView A0R4 = AnonymousClass7TG.A0R(view, R.id.row_requested_user_ignore);
        this.A06 = A0R4;
        View A0G = AnonymousClass7TF.A0G(view, R.id.row_requested_user_dismiss);
        this.A02 = A0G;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.row_requested_user_overflow);
        this.A03 = A0G2;
        this.A0C = (FollowButton) AnonymousClass7TF.A0F(view, R.id.row_requested_user_follow_button_large);
        this.A07 = AnonymousClass7TG.A0R(view, R.id.row_internal_badge);
        boolean z4 = true;
        A0R.getPaint().setFakeBoldText(true);
        1QE.A0G(A0R2, A0R2);
        int i = 0;
        A0R2.setVisibility(z ? 4 : 0);
        int i2 = 8;
        if (z3) {
            1QE.A0H(A0R3, A0R3);
            A0R3.setVisibility(A0R2.getVisibility());
            A0R2.setVisibility(8);
        }
        if (0nA.A09(context) > 1000) {
            z4 = false;
            i2 = 0;
        }
        A0R4.setVisibility(i2);
        A0G.setVisibility(C13988Tno.A0E(z4));
        A0G2.setVisibility((z4 || !z2) ? 8 : i);
    }
}
