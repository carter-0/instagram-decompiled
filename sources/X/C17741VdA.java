package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.VdA  reason: case insensitive filesystem */
public final class C17741VdA {
    public Drawable A00;
    public View A01;
    public C14631Tzd A02;
    public ReelBrandingBadgeView A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ViewGroup A08;
    public final ViewStub A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final C71662eb A0D;
    public final C71662eb A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final C71662eb A0H;
    public final C71662eb A0I;
    public final GradientSpinnerAvatarView A0J;

    public C17741VdA(ViewGroup viewGroup) {
        this.A08 = DbU.A0C(viewGroup, R.id.row_viewer_container);
        this.A0J = (GradientSpinnerAvatarView) viewGroup.requireViewById(R.id.row_viewer_imageview);
        this.A07 = DbU.A0C(viewGroup, R.id.row_viewer_image_container);
        this.A09 = DbU.A0D(viewGroup, R.id.row_viewer_reel_ring);
        this.A0C = DbU.A0G(viewGroup, R.id.row_title);
        this.A0B = DbU.A0G(viewGroup, R.id.row_subtitle);
        this.A04 = viewGroup.requireViewById(R.id.hide_button);
        this.A05 = viewGroup.requireViewById(R.id.unhide_button);
        this.A0D = DbY.A0S(viewGroup, R.id.blocked_button);
        this.A0A = DbU.A0F(viewGroup, R.id.row_slider);
        this.A0F = DbY.A0S(viewGroup, R.id.row_reel_viewer_open_direct_reply_modal_button_stub);
        this.A0G = DbY.A0S(viewGroup, R.id.row_reel_viewer_open_messenger_chat_button_stub);
        this.A0E = DbY.A0S(viewGroup, R.id.row_reel_viewer_inline_icon_follow_button_stub);
        this.A0I = DbY.A0S(viewGroup, R.id.row_reel_viewer_regular_follow_button_stub);
        this.A0H = DbY.A0S(viewGroup, R.id.row_reel_viewer_overflow_button_stub);
        this.A06 = viewGroup.requireViewById(R.id.row_title_unread_dot);
    }
}
