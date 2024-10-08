package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.DhJ  reason: case insensitive filesystem */
public final class C46577DhJ {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TightTextView A04;
    public final CircularImageView A05;
    public final FollowButton A06;

    public C46577DhJ(View view) {
        this.A00 = view;
        this.A05 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.card_avatar);
        this.A03 = DbW.A0B(view, R.id.card_suggested_name);
        this.A02 = (ImageView) AnonymousClass7TE.A0b(view, R.id.card_suggested_subtitle_stacked_avatar);
        this.A04 = (TightTextView) AnonymousClass7TE.A0b(view, R.id.card_suggested_subtitle);
        this.A06 = (FollowButton) AnonymousClass7TE.A0b(view, R.id.card_follow_button);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.card_dismiss_button);
    }
}
