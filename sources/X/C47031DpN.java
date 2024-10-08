package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.DpN  reason: case insensitive filesystem */
public final class C47031DpN extends C249703kE {
    public final ViewStub A00;
    public final ViewStub A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final CircularImageView A08;
    public final FollowButton A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47031DpN(View view) {
        super(view);
        0qQ.A0B(view, 1);
        LinearLayout linearLayout = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.user_row);
        this.A04 = linearLayout;
        this.A08 = DbX.A0a(linearLayout, R.id.row_recommended_user_imageview);
        this.A07 = AnonymousClass7TG.A0R(linearLayout, R.id.row_recommended_user_username);
        this.A05 = AnonymousClass7TG.A0R(linearLayout, R.id.row_recommended_user_fullname);
        this.A09 = (FollowButton) AnonymousClass7TF.A0F(linearLayout, R.id.row_recommended_user_follow_button);
        this.A02 = DbX.A0J(linearLayout, R.id.row_recommended_hide_icon_button);
        this.A03 = (LinearLayout) AnonymousClass7TF.A0F(linearLayout, R.id.row_recommended_social_context_container);
        this.A06 = AnonymousClass7TG.A0R(linearLayout, R.id.row_recommended_social_context);
        this.A00 = (ViewStub) AnonymousClass7TE.A0b(view, R.id.three_posts_viewstub);
        this.A01 = (ViewStub) AnonymousClass7TE.A0b(view, R.id.four_reels_viewstub);
    }
}
