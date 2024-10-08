package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

public final class EyU {
    public final IgTextView A00;
    public final CircularImageView A01;
    public final FollowButton A02;

    public EyU(View view) {
        0qQ.A0B(view, 1);
        this.A00 = DbX.A0Z(view, R.id.follow_upsell_text);
        this.A02 = (FollowButton) AnonymousClass7TF.A0F(view, R.id.follow_upsell_button);
        this.A01 = DbX.A0a(view, R.id.follow_upsell_user_image);
    }
}
