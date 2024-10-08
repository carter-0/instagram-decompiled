package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

public final class Ncv extends OCP {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final CircularImageView A09;
    public final FollowButton A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Ncv(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.suggested_entity_card_container);
        this.A09 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.suggested_entity_card_image);
        this.A08 = DbW.A0B(view, R.id.suggested_user_card_username);
        this.A06 = DbW.A0B(view, R.id.suggested_entity_card_name);
        this.A03 = (ViewGroup) AnonymousClass7TE.A0b(view, R.id.suggested_user_media_container);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.suggested_user_no_media_previews_notice);
        this.A04 = (ImageView) AnonymousClass7TE.A0b(view, R.id.suggested_user_no_media_previews_notice_icon);
        this.A07 = DbW.A0B(view, R.id.suggested_user_no_media_previews_notice_text);
        this.A05 = DbW.A0B(view, R.id.suggested_entity_card_context);
        this.A0A = (FollowButton) AnonymousClass7TE.A0b(view, R.id.suggested_user_card_follow_button);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.dismiss_button);
    }
}
