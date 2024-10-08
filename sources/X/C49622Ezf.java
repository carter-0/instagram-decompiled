package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Ezf  reason: case insensitive filesystem */
public final class C49622Ezf {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final C252063oV A03;
    public final GradientSpinnerAvatarView A04;

    public C49622Ezf(View view) {
        this.A00 = view;
        this.A04 = DbX.A0j(view, R.id.grid_view_pog_avatar_view);
        this.A03 = DbU.A0Z(view, R.id.group_photo_faceswarm_stub);
        this.A01 = DbX.A0Z(view, R.id.grid_view_pog_text_view_first_line);
        this.A02 = DbX.A0Z(view, R.id.grid_view_pog_text_view_second_line);
    }
}
