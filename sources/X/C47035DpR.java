package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DpR  reason: case insensitive filesystem */
public final class C47035DpR extends C249703kE {
    public final View A00;
    public final ViewGroup A01;
    public final CheckBox A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final C252063oV A0B;
    public final GradientSpinnerAvatarView A0C;

    public C47035DpR(Context context, FrameLayout frameLayout) {
        super(frameLayout);
        this.A03 = frameLayout;
        this.A06 = (LinearLayout) frameLayout.requireViewById(R.id.user_row_background);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) frameLayout.requireViewById(R.id.row_user_imageview);
        this.A0C = gradientSpinnerAvatarView;
        this.A0B = DbU.A0Z(frameLayout, R.id.row_users_faceswarm_stub);
        this.A01 = DbU.A0C(frameLayout, R.id.row_user_info_layout);
        this.A09 = DbU.A0G(frameLayout, R.id.row_user_primary_name);
        this.A0A = DbU.A0G(frameLayout, R.id.row_user_secondary_name);
        this.A07 = DbU.A0G(frameLayout, R.id.row_user_context_line);
        CheckBox checkBox = (CheckBox) frameLayout.requireViewById(R.id.recipient_toggle);
        this.A02 = checkBox;
        checkBox.setBackground(AnonymousClass3JT.A07(context, R.color.badge_color));
        2eS.A04(checkBox, AnonymousClass05K.A0C);
        this.A00 = frameLayout.requireViewById(R.id.shh_mode_indicator_placeholder);
        gradientSpinnerAvatarView.A02 = -0.03f;
        this.A05 = DbU.A0F(frameLayout, R.id.recipient_typeahead_add);
        this.A04 = DbU.A0F(frameLayout, R.id.recipient_chevron);
        this.A08 = DbU.A0G(frameLayout, R.id.row_search_debug_info);
    }
}
