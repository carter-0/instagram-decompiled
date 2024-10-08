package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class LB7 {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final IgdsButton A08;
    public final GradientSpinnerAvatarView A09;

    public LB7(View view) {
        0qQ.A0B(view, 1);
        this.A00 = (LinearLayout) view;
        this.A05 = DbU.A0Z(view, R.id.icon);
        this.A09 = DbX.A0j(view, R.id.fb_profile_avatar);
        this.A03 = DbX.A0Z(view, R.id.title);
        C252063oV A0Z = DbU.A0Z(view, R.id.subtitle);
        this.A07 = A0Z;
        this.A02 = DbX.A0Z(A0Z.getView(), R.id.subtitle);
        this.A06 = DbU.A0Z(view, R.id.share_button_group);
        this.A04 = DbU.A0Z(view, R.id.auto_share_buttons);
        this.A08 = JTR.A0n(view, R.id.share_button_evergreen);
        this.A01 = DbX.A0Z(view, R.id.shared_button_evergreen);
    }
}
