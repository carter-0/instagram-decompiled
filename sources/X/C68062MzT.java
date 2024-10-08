package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.MzT  reason: case insensitive filesystem */
public final class C68062MzT extends C249703kE implements C331027Pf {
    public final View A00;
    public final ViewStub A01;
    public final FrameLayout A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final C71662eb A0A;
    public final C71662eb A0B;
    public final C71662eb A0C;
    public final C71662eb A0D;
    public final C71662eb A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final C71662eb A0H;
    public final OG6 A0I;
    public final OG6 A0J;
    public final OG6 A0K;
    public final GradientSpinnerAvatarView A0L;

    public C68062MzT(View view) {
        super(view);
        this.A00 = view;
        this.A09 = DbU.A0G(view, R.id.other_user_full_name_or_username);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view.requireViewById(R.id.user_avatar);
        this.A0L = gradientSpinnerAvatarView;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.setFocusable(false);
        this.A02 = (FrameLayout) view.requireViewById(R.id.context_avatar_override);
        this.A01 = DbU.A0D(view, R.id.direct_group_photo_faceswarm_stub);
        this.A06 = DbU.A0G(view, R.id.meta_verified_label);
        TextView A0G2 = DbU.A0G(view, R.id.network_attribution);
        this.A07 = A0G2;
        DbT.A1H(A0G2);
        this.A0H = DbY.A0S(view, R.id.thread_labels);
        this.A0A = DbY.A0S(view, R.id.change_name_and_photo);
        this.A0C = DbY.A0S(view, R.id.thread_context_item_stub_0);
        this.A0D = DbY.A0S(view, R.id.thread_context_item_stub_1);
        this.A0E = DbY.A0S(view, R.id.thread_context_item_stub_2);
        this.A0F = DbY.A0S(view, R.id.thread_context_item_stub_3);
        this.A0G = DbY.A0S(view, R.id.thread_context_item_stub_4);
        this.A0B = DbY.A0S(view, R.id.responsiveness_item);
        this.A03 = (LinearLayout) view.requireViewById(R.id.null_state_shortcut_container);
        this.A0I = new OG6(view.requireViewById(R.id.null_state_item_1));
        this.A0J = new OG6(view.requireViewById(R.id.null_state_item_2));
        this.A0K = new OG6(view.requireViewById(R.id.null_state_item_3));
        this.A08 = DbU.A0G(view, R.id.privacy_disclosure_text);
        this.A05 = DbU.A0G(view, R.id.view_profile_button);
        this.A04 = DbU.A0G(view, R.id.view_channel_button);
    }
}
