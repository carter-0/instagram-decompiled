package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class L9H {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final C252063oV A03;
    public final GradientSpinnerAvatarView A04;

    public L9H(View view) {
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_user_container);
        this.A04 = DbX.A0j(view, R.id.selectable_user_row_avatar);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.row_user_username);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.row_user_info);
        C252063oV A012 = 2b1.A01(view.requireViewById(R.id.selectable_user_row_checkbox_view_stub), false, false);
        this.A03 = A012;
        A012.EeU(C64887Ljn.A00);
        A012.setVisibility(0);
    }
}
