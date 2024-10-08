package X;

import android.util.Size;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

public final class OWC {
    public final View A00;
    public final UserSession A01;
    public final C71662eb A02;
    public final C252063oV A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final C252063oV A0A;
    public final C252063oV A0B;
    public final C252063oV A0C;
    public final C252063oV A0D;
    public final C252063oV A0E;
    public final C252063oV A0F;
    public final C252063oV A0G;
    public final C252063oV A0H;
    public final C252063oV A0I;
    public final C252063oV A0J;
    public final C252063oV A0K;
    public final C252063oV A0L;
    public final C252063oV A0M;
    public final RoundedCornerConstraintLayout A0N;
    public final AnonymousClass0eM A0O = C73909Plk.A00(this, 49);
    public final AnonymousClass0eM A0P = C73920Pm0.A01(this, 0);
    public final AnonymousClass0eM A0Q;

    public static C252063oV A00(View view, UserSession userSession, int i) {
        return 2b1.A01(view.requireViewById(i), false, C70867OPg.A00(userSession));
    }

    public final void A02(Size size, AnonymousClass0iw r15, AnonymousClass77D r16, C68821NYf nYf, C262224Cq r18) {
        int i;
        CharSequence charSequence;
        C68821NYf nYf2 = nYf;
        C262224Cq r12 = r18;
        AnonymousClass7TF.A1C(nYf2, 0, r12);
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A0N;
        roundedCornerConstraintLayout.setOutlineProvider((ViewOutlineProvider) null);
        roundedCornerConstraintLayout.setCornerRadius(0);
        IgImageView A0R = C66580MXl.A0R(this.A0O);
        UserSession userSession = this.A01;
        C71050OaS.A01(size, r15, userSession, A0R, r16, nYf2, r12);
        C328667Fr r6 = nYf2.A02;
        AnonymousClass774 r4 = r6.A0E;
        C252063oV r1 = this.A0D;
        if (r1.CVM() || r4 != null || !C70867OPg.A01(userSession)) {
            View view = r1.getView();
            if (r4 != null) {
                i = 0;
                ((IgImageView) AnonymousClass7TE.A14(this.A0Q)).setUrl((ImageUrl) r4.A0A.get(0), r15);
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        AnonymousClass74T r0 = r6.A0D;
        if (r0 == null || (charSequence = r0.A09) == null) {
            charSequence = "";
        }
        C252063oV r13 = this.A0F;
        if (r13.CVM() || charSequence.length() != 0 || !C70867OPg.A01(userSession)) {
            ((TextView) r13.getView()).setText(charSequence);
            C63237Kti.A00(r13.getView());
        }
    }

    public final void A01() {
        C66580MXl.A0R(this.A0O).A09();
        if (this.A0D.CVM()) {
            ((IgImageView) AnonymousClass7TE.A14(this.A0Q)).A09();
        }
        TextView textView = (TextView) this.A0F.E2D();
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = (TextView) this.A0L.E2D();
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
    }

    public OWC(View view, UserSession userSession) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A00 = view;
        this.A01 = userSession;
        this.A0N = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(view, R.id.card);
        this.A0B = 2b1.A01(view.requireViewById(R.id.privacy_overlay_image_container_legacy_view_stub), false, C70867OPg.A00(userSession));
        this.A0A = 2b1.A01(view.requireViewById(R.id.privacy_overlay_image_container_flat_view_stub), false, C70867OPg.A00(userSession));
        this.A08 = A00(view, userSession, R.id.play_icon_view_stub);
        this.A07 = A00(view, userSession, R.id.hd_icon_view_stub);
        this.A0C = A00(view, userSession, R.id.privacy_overlay_stub);
        this.A06 = A00(view, userSession, R.id.determinate_progress_overlay);
        this.A0D = A00(view, userSession, R.id.profile_picture_layout_view_stub);
        this.A0Q = C73920Pm0.A01(this, A1Y ? 1 : 0);
        this.A0G = A00(view, userSession, R.id.reels_icon_view_stub);
        this.A09 = A00(view, userSession, R.id.center_playstack_icon_view_stub);
        this.A0F = A00(view, userSession, R.id.question_text_stub);
        this.A0L = A00(view, userSession, R.id.username_stub);
        this.A03 = A00(view, userSession, R.id.bottom_gradient_view_stub);
        this.A0M = A00(view, userSession, R.id.video_duration_view_stub);
        this.A0E = A00(view, userSession, R.id.indeterminate_progress_overlay_view_stub);
        this.A02 = DbY.A0T(view, R.id.card_reactions_pill_stub);
        this.A05 = A00(view, userSession, R.id.xma_cta_button_view_stub);
        this.A0H = A00(view, userSession, R.id.stacks_subtitle_text_view_stub);
        this.A0I = A00(view, userSession, R.id.stacks_timestamp_view_stub);
        this.A0J = A00(view, userSession, R.id.top_gradient_view_stub);
        this.A0K = A00(view, userSession, R.id.upload_error_indicator_view_stub);
        this.A04 = A00(view, userSession, R.id.select_winner_checkbox_view_stub);
    }
}
