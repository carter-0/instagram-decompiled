package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.GjH  reason: case insensitive filesystem */
public final class C53145GjH extends C249703kE {
    public FollowButton A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final GradientSpinnerAvatarView A04;
    public final View A05;
    public final ViewStub A06;

    public C53145GjH(View view) {
        super(view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.follow_list_user_imageview);
        this.A04 = gradientSpinnerAvatarView;
        TextView A0B = DbW.A0B(view, R.id.follow_list_username);
        this.A03 = A0B;
        this.A02 = DbW.A0B(view, R.id.follow_list_subtitle);
        ViewStub viewStub = (ViewStub) AnonymousClass7TE.A0b(view, R.id.follow_list_large_follow_button_stub);
        this.A06 = viewStub;
        View A0G = AnonymousClass7TF.A0G(view, R.id.follow_list_container);
        this.A01 = A0G;
        View A0b = AnonymousClass7TE.A0b(view, R.id.row_divider);
        this.A05 = A0b;
        A0G.setBackgroundResource(0);
        Context context = A0G.getContext();
        A0G.setPadding(AnonymousClass7TG.A02(context), context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), 0, AnonymousClass7TF.A02(context, R.dimen.abc_button_padding_horizontal_material));
        A0b.setVisibility(8);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        Context context2 = A0B.getContext();
        DbT.A17(context2, A0B, 2Yu.A0H(context2, R.attr.igds_color_primary_text_on_media));
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, C273654mx.A00(50));
        FollowButton followButton = (FollowButton) inflate;
        this.A00 = followButton;
        if (followButton != null) {
            followButton.setVisibility(0);
        }
    }
}
