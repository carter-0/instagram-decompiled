package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Myk  reason: case insensitive filesystem */
public final class C68018Myk extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final RoundedCornerConstraintLayout A03;
    public final FollowButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68018Myk(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(view, R.id.card);
        this.A01 = DbX.A0Z(view, R.id.title_text);
        this.A00 = DbX.A0Z(view, R.id.subtitle_text);
        this.A02 = DbX.A0a(view, R.id.profile_picture);
        this.A04 = (FollowButton) AnonymousClass7TF.A0F(view, R.id.follow_button);
    }
}
