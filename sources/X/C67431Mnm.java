package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Mnm  reason: case insensitive filesystem */
public final class C67431Mnm implements AnonymousClass3N3 {
    public View A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public CircularImageView A05;
    public IgImageView A06;
    public IgdsButton A07;
    public boolean A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final ViewStub A0G;
    public final FrameLayout A0H;
    public final IgSimpleImageView A0I;
    public final IgTextView A0J;
    public final IgTextView A0K;
    public final IgTextView A0L;
    public final IgTextView A0M;
    public final CircularImageView A0N;
    public final C252063oV A0O;
    public final C252063oV A0P;
    public final C252063oV A0Q;
    public final C252063oV A0R;
    public final C252063oV A0S;
    public final GradientSpinner A0T;
    public final FollowButton A0U;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A0N);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A0N;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A0N);
    }

    public final GradientSpinner Bkt() {
        return this.A0T;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A0N.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A0N.setVisibility(0);
    }

    public C67431Mnm(Context context, ViewGroup viewGroup, boolean z) {
        boolean A1Y = DbW.A1Y(viewGroup);
        this.A0A = viewGroup;
        this.A09 = DbU.A0C(viewGroup, R.id.row_search_user_container);
        DbU.A0D(viewGroup, R.id.row_search_avatar_with_ring_stub).inflate();
        this.A0N = DbU.A0X(viewGroup, R.id.row_search_avatar_in_ring);
        this.A0T = (GradientSpinner) viewGroup.requireViewById(R.id.reel_seen_state);
        FrameLayout frameLayout = (FrameLayout) viewGroup.requireViewById(R.id.row_search_avatar_with_ring);
        this.A0H = frameLayout;
        this.A0B = DbU.A0D(viewGroup, R.id.birthday_confetti_animation_stub);
        this.A08 = z;
        int A082 = C51972G9s.A08(context);
        int i = 0;
        if (this.A08) {
            i = A082;
            A082 = 0;
        }
        frameLayout.setPadding(i, 0, A082, 0);
        this.A0U = (FollowButton) viewGroup.requireViewById(R.id.row_search_user_follow_button);
        this.A0L = DbT.A0a(viewGroup, R.id.row_search_user_fullname);
        this.A0I = JTP.A0T(viewGroup, R.id.row_search_facepiles);
        this.A0K = DbT.A0a(viewGroup, R.id.row_search_social_context_rtl);
        IgTextView A0a = DbT.A0a(viewGroup, R.id.row_search_user_username);
        this.A0M = A0a;
        A0a.getPaint().setFakeBoldText(A1Y);
        this.A0J = DbT.A0a(viewGroup, R.id.row_search_user_secondary_subtitle);
        this.A0C = DbU.A0D(viewGroup, R.id.dismiss_button_stub);
        this.A0G = DbU.A0D(viewGroup, R.id.remove_user_stub);
        this.A0E = DbU.A0D(viewGroup, R.id.extra_label_stub);
        this.A0D = DbU.A0D(viewGroup, R.id.extra_button_stub);
        this.A0S = DbV.A0T(viewGroup, R.id.unavailable_user_overlay_stub, false);
        viewGroup.setBackgroundResource(2Yu.A0H(context, R.attr.backgroundDrawable));
        this.A0F = DbU.A0D(viewGroup, R.id.row_search_internal_badge);
        this.A0O = DbV.A0T(viewGroup, R.id.live_badge_stub, false);
        this.A0P = DbV.A0T(viewGroup, R.id.pulse_emitter_stub, false);
        this.A0Q = DbV.A0T(viewGroup, R.id.pulsing_image_view_stub, false);
        this.A0R = DbV.A0T(viewGroup, R.id.right_arrow_stub, false);
    }
}
