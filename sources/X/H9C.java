package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

public final class H9C extends I22 {
    public final View A00;
    public final ViewGroup A01;
    public final UserSession A02;
    public final IgImageView A03;
    public final RoundedCornerLinearLayout A04;
    public final String A05;

    public H9C(View view, UserSession userSession, String str) {
        super(userSession);
        this.A02 = userSession;
        this.A05 = str;
        ViewGroup A0I = DbX.A0I(view, R.id.cover_photo_preview);
        this.A01 = A0I;
        this.A03 = DbX.A0b(A0I, R.id.clip_thumbnail_image);
        this.A04 = (RoundedCornerLinearLayout) AnonymousClass7TF.A0F(A0I, R.id.clip_thumbnail_layout);
        this.A00 = AnonymousClass7TF.A0G(A0I, R.id.preview_button_pill);
        A0I.setVisibility(0);
    }
}
