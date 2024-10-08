package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class LAO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C64162LRd A05;
    public final GradientSpinnerAvatarView A06;

    public LAO(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = DbU.A0F(view, R.id.add_to_fb_story_icon);
        this.A06 = (GradientSpinnerAvatarView) view.requireViewById(R.id.add_to_fb_profile_icon);
        this.A02 = DbU.A0G(view, R.id.add_to_fb_story_label);
        this.A03 = DbU.A0G(view, R.id.add_to_fb_story_target_name);
        this.A04 = DbU.A0G(view, R.id.add_to_fb_story_username);
        JTR.A1C(view, R.id.one_tap_button_view_stub);
        this.A05 = new C64162LRd(view, userSession, AnonymousClass05K.A01);
    }
}
