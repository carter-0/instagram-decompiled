package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class F11 {
    public LMN A00;
    public final View A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final C71662eb A07;
    public final C64162LRd A08;
    public final C67077Mhs A09;
    public final GradientSpinnerAvatarView A0A;

    public F11(View view, UserSession userSession, Integer num) {
        ViewGroup A0C = DbU.A0C(view, R.id.row_user_container);
        this.A03 = A0C;
        this.A02 = DbU.A0C(view, R.id.row_user_info_layout);
        this.A06 = DbU.A0G(view, R.id.row_user_username);
        this.A05 = DbU.A0G(view, R.id.row_user_info);
        this.A04 = DbU.A0G(view, R.id.user_social_context);
        this.A0A = (GradientSpinnerAvatarView) view.requireViewById(R.id.selectable_user_row_avatar);
        this.A01 = DbY.A0F(view, R.id.one_tap_button_view_stub);
        this.A08 = new C64162LRd(A0C, userSession, num);
        this.A07 = new C71662eb((ViewStub) DbU.A0B(A0C, R.id.shh_mode_indicator_stub));
        this.A09 = new C67077Mhs(A0C.getContext());
    }
}
