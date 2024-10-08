package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class A7F {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final GradientSpinnerAvatarView A04;

    public A7F(View view) {
        this.A00 = view;
        this.A02 = (TextView) view.requireViewById(R.id.row_user_fullname);
        this.A03 = (TextView) view.requireViewById(R.id.row_user_username);
        this.A04 = (GradientSpinnerAvatarView) view.requireViewById(R.id.row_user_avatar);
        this.A01 = view.requireViewById(R.id.row_user_not_mentionable_overlay);
    }
}
