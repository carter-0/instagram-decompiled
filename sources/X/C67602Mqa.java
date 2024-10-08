package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.Mqa  reason: case insensitive filesystem */
public final class C67602Mqa extends C316016ky implements C316056l2, C316076l4, C316086l5, C316096l6, C316106l7 {
    public View A00;
    public C247833gz A01;
    public IgImageView A02;
    public C226642hc A03;
    public C71662eb A04;
    public IgProgressImageView A05;
    public C255773uh A06;
    public C250973mM A07;
    public C309426Yf A08;
    public MediaFrameLayout A09;
    public MediaFrameLayout A0A;
    public final View A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final UserSession A0E;
    public final IgView A0F;
    public final ReelViewGroup A0G;
    public final AnonymousClass6N9 A0H;
    public final C306606Mu A0I;
    public final AnonymousClass6N7 A0J;
    public final AnonymousClass6NA A0K;
    public final AnonymousClass6NC A0L;
    public final AnonymousClass6NG A0M;
    public final C306656Mz A0N;
    public final AnonymousClass6N3 A0O;
    public final C306616Mv A0P;
    public final C306596Mt A0Q;
    public final AnonymousClass6NE A0R;
    public final AnonymousClass6N4 A0S;
    public final C306636Mx A0T;
    public final AnonymousClass6N1 A0U;
    public final AnonymousClass6N0 A0V;
    public final AnonymousClass6NF A0W;
    public final AnonymousClass6N2 A0X;
    public final AnonymousClass6N8 A0Y;
    public final RoundedCornerFrameLayout A0Z;
    public final SegmentedProgressBar A0a;
    public final IgView A0b;
    public final C252063oV A0c;
    public final C316206lH A0d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67602Mqa(View view, UserSession userSession) {
        super(view);
        0qQ.A0B(view, 1);
        this.A0E = userSession;
        this.A0G = (ReelViewGroup) AnonymousClass7TF.A0F(view, R.id.reel_view_group);
        this.A0b = (IgView) AnonymousClass7TF.A0F(view, R.id.reel_viewer_top_shadow);
        this.A0a = (SegmentedProgressBar) AnonymousClass7TF.A0F(view, R.id.reel_viewer_progress_bar);
        View requireViewById = view.requireViewById(R.id.back_shadow_affordance);
        IgView igView = (IgView) requireViewById;
        igView.setBackgroundResource(0mk.A02(view.getContext()) ? R.drawable.reel_viewer_shadow_right : R.drawable.reel_viewer_shadow_left);
        0qQ.A07(requireViewById);
        this.A0F = igView;
        this.A0B = AnonymousClass7TF.A0G(view, R.id.header_menu_button);
        this.A0Q = new C306596Mt(DbX.A0I(view, R.id.netego_toolbar), userSession);
        this.A0C = JTR.A0X(view, R.id.reel_viewer_media_layout_stub);
        this.A0D = JTR.A0X(view, R.id.netego_background_stub);
        this.A0I = new C306606Mu(JTR.A0X(view, R.id.simple_action_stub));
        this.A0P = new C306616Mv(JTR.A0X(view, R.id.quality_survey_stub));
        this.A0T = new C306636Mx(JTR.A0X(view, R.id.story_creation_upsell_stub));
        this.A0N = new C306656Mz(JTR.A0X(view, R.id.new_ad4ad_overlay_stub));
        this.A0V = new AnonymousClass6N0(DbU.A0D(view, R.id.netego_su_overlay_stub));
        this.A0U = new AnonymousClass6N1(JTR.A0X(view, R.id.reel_netego_suggested_clips_stub));
        this.A0X = new AnonymousClass6N2(JTR.A0X(view, R.id.reel_netego_trending_prompt_stub));
        this.A0O = new AnonymousClass6N3(JTR.A0X(view, R.id.netego_pfy_overlay_stub));
        View findViewById = view.findViewById(R.id.netego_sfy_overlay_stub);
        if (findViewById != null) {
            this.A0S = new AnonymousClass6N6((ViewStub) findViewById);
            View requireViewById2 = view.requireViewById(R.id.netego_continue_shopping_overlay_stub);
            0qQ.A0C(requireViewById2, "null cannot be cast to non-null type android.view.ViewStub");
            this.A0J = new AnonymousClass6N7((ViewStub) requireViewById2);
            View requireViewById3 = view.requireViewById(R.id.netego_visit_these_shops_again_overlay_stub);
            0qQ.A0C(requireViewById3, "null cannot be cast to non-null type android.view.ViewStub");
            this.A0Y = new AnonymousClass6N8((ViewStub) requireViewById3);
            this.A0c = DbU.A0Z(view, R.id.reel_viewer_tall_android_top_bar_stub);
            this.A0Z = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.rounded_frame_layout);
            this.A0H = new AnonymousClass6N9(JTR.A0X(view, R.id.reel_netego_bloks_stub));
            this.A0d = new C316206lH(JTR.A0X(view, R.id.reel_swipe_up_instructions_stub));
            this.A0K = new AnonymousClass6NA(AnonymousClass7TF.A0G(view, R.id.ig_consent_growth_story_stub));
            this.A0L = new AnonymousClass6NC(JTR.A0X(view, R.id.reel_netego_ig_insights_tip_stub));
            this.A0R = new AnonymousClass6NE(JTR.A0X(view, R.id.reel_netego_share_comment_to_story_stub));
            this.A0W = new AnonymousClass6NF(JTR.A0X(view, R.id.reel_netego_threads_in_stories_story_stub));
            this.A0M = new AnonymousClass6NG(JTR.A0X(view, R.id.reel_netego_meta_gallery_stories_netego_stub));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DcL(C309426Yf r3, int i) {
        0qQ.A0B(r3, 0);
        if (i == 1) {
            this.A0a.setProgress(r3.A0B);
        } else if (i == 7) {
            C70315O1t.A00(this.A0I);
            this.A0Q.A05.setVisibility(8);
        }
    }

    public final void A00() {
        AnonymousClass0iw r4;
        C255773uh r0;
        C270074g9 r3;
        boolean z;
        AnonymousClass6N0 r6 = this.A0V;
        UserSession userSession = r6.A06;
        if (userSession != null && (r4 = r6.A05) != null && (r0 = r6.A08) != null && (r3 = r0.A09) != null && DbY.A1Y(0Tu.A05, userSession, 36325218481877735L)) {
            C309426Yf r02 = r6.A09;
            if (r02 != null) {
                z = r02.A11;
            } else {
                z = false;
            }
            C306896Ny.A01(r4, userSession, r3, z);
        }
    }

    public final void A01() {
        String str;
        IgProgressImageView igProgressImageView = this.A05;
        if (igProgressImageView != null) {
            igProgressImageView.setVisibility(0);
            return;
        }
        C255773uh r0 = this.A06;
        if (r0 != null) {
            str = 002.A0R("ImegeView was null for Netego of type ", r0.A0e.name());
        } else {
            str = "Both ImegeView and reelItem are null";
        }
        0wb.A03("STORIES_NETEGO_ITEM_SHOW_COVER", str);
    }

    public final C74500Pvu AjF() {
        return this.A0Q.AjF();
    }

    public final IgProgressImageView BGP() {
        return this.A05;
    }

    public final RoundedCornerFrameLayout BQU() {
        return this.A0Z;
    }

    public final C255773uh Bkg() {
        return this.A06;
    }

    public final ViewGroup Bki() {
        return this.A0G;
    }

    public final FrameLayout Bkk() {
        return this.A09;
    }

    public final C252063oV C46() {
        return this.A0c;
    }

    public final ScalingTextureView C5p() {
        C71662eb r0 = this.A04;
        if (r0 != null) {
            return (ScalingTextureView) r0.A01();
        }
        return null;
    }

    public final View C8B() {
        return this.A0Q.A05;
    }

    public final void DPI(boolean z) {
        this.A0d.A01(this.A0E, this.A06, this.A07, z);
    }

    public final void DPJ() {
        this.A0d.A00();
    }

    public final void DcO() {
        C306596Mt r2 = this.A0Q;
        C309426Yf r1 = r2.A01;
        if (r1 != null) {
            r1.A0j = false;
        }
        C74500Pvu AjF = r2.AjF();
        if (AjF != null) {
            C66951Mfk.A00(AjF);
        }
        r2.A06.A00();
        C316246lL r4 = r2.A07;
        if (r4.A04 != null) {
            TextView textView = r4.A07;
            if (textView != null) {
                CharSequence text = textView.getText();
                if (!(text == null || text.length() == 0)) {
                    View view = r4.A02;
                    if (view != null) {
                        view.setAlpha(1.0f);
                        View view2 = r4.A03;
                        if (view2 != null) {
                            view2.setAlpha(0.0f);
                            r4.A02();
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        r4.A0A = false;
        AnonymousClass6N0 r22 = this.A0V;
        AnonymousClass6NJ r0 = r22.A07;
        if (r0 != null) {
            ValueAnimator valueAnimator = r0.A03;
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
        }
        r22.A00();
        A00();
    }

    public final void ERT(float f) {
        this.A0b.setAlpha(f);
        this.A0a.setAlpha(f);
        this.A0Q.A04.setAlpha(f);
        this.A0B.setAlpha(f);
    }

    public final void onSurfaceTextureDestroyed() {
        A01();
    }

    public final void Cyz(boolean z) {
        A01();
    }
}
