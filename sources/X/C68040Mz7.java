package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Mz7  reason: case insensitive filesystem */
public final class C68040Mz7 extends C249703kE {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final UserSession A05;
    public final IgSimpleImageView A06;
    public final CircularImageView A07;
    public final FollowButton A08;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68040Mz7(Context context, View view, UserSession userSession) {
        super(view);
        int dimensionPixelSize;
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A00 = context;
        this.A05 = userSession;
        FollowButton followButton = (FollowButton) AnonymousClass7TF.A0F(view, R.id.card_follow_button);
        this.A08 = followButton;
        this.A04 = AnonymousClass7TG.A0R(view, R.id.card_suggested_name);
        this.A02 = DbX.A0J(view, R.id.card_suggested_subtitle_stacked_avatar);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.card_suggested_subtitle);
        IgSimpleImageView A0Y = DbX.A0Y(view, R.id.dismiss_button);
        this.A06 = A0Y;
        ? A0a = DbX.A0a(view, R.id.card_avatar);
        this.A07 = A0a;
        followButton.setBackground((Drawable) null);
        DbT.A17(context, followButton, 2Yu.A0D(context));
        DbU.A11(context, view, !AnonymousClass3HA.A00(context) ? R.drawable.card_background : R.drawable.quad_card_su_background_night);
        int A09 = 0nA.A09(context);
        int A082 = 0nA.A08(context);
        C270354gb r3 = new C270354gb();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        r3.A0I(constraintLayout);
        double d = 0.6d;
        if (182.A06(0Tu.A06, userSession, 36316577007800835L)) {
            C270354gb.A02(r3, R.id.card_avatar).A03.A0W = Integer.MAX_VALUE;
            C270354gb.A02(r3, R.id.card_avatar).A03.A0u = Integer.MAX_VALUE;
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            if (A09 > 1000) {
                d = 0.7d;
            }
        } else {
            C270354gb.A02(r3, R.id.card_avatar).A03.A0W = context.getResources().getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xlarge);
            C270354gb.A02(r3, R.id.card_avatar).A03.A0u = AnonymousClass7TF.A02(context, R.dimen.avatar_size_ridiculously_xlarge);
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        }
        constraintLayout.setLayoutParams(new C71492dQ((A09 / 2) - 60, ((int) (((double) A082) * d)) / 2));
        r3.A0G(constraintLayout);
        int A032 = AnonymousClass7TG.A03(context);
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(A0a);
        A0G.setMargins(dimensionPixelSize, A032, dimensionPixelSize, 0);
        A0a.setLayoutParams(A0G);
        0qQ.A0B(A0Y, 0);
        0nA.A0p(A0Y, new 0mu(A0Y, view));
    }
}
