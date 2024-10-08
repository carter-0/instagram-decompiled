package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class F03 {
    public ViewGroup A00;
    public GradientSpinnerAvatarView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public F03(View view) {
        this.A00 = DbX.A0I(view, R.id.row_user_container);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_user_username);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.row_user_info);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.user_social_context);
        GradientSpinnerAvatarView A0j = DbX.A0j(view, R.id.selectable_user_row_avatar);
        this.A01 = A0j;
        A0j.setGradientSpinnerVisible(false);
    }
}
