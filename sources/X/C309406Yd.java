package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6Yd  reason: invalid class name and case insensitive filesystem */
public final class C309406Yd extends C316016ky implements C316056l2, C316066l3, C316076l4, C309476Yk, C316086l5, C316096l6, C316106l7, C309486Yl {
    public C255773uh A00;
    public C250973mM A01;
    public AnonymousClass3BQ A02;
    public AnonymousClass3PN A03;
    public C309426Yf A04;
    public C309666Zd A05;
    public C307076Os A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final View A0D;
    public final ImageView A0E;
    public final UserSession A0F;
    public final ColorFilterAlphaImageView A0G;
    public final C256003v4 A0H;
    public final C252063oV A0I;
    public final C252063oV A0J;
    public final IgProgressImageView A0K;
    public final C316706m5 A0L;
    public final C265864Wp A0M;
    public final C265844Wn A0N;
    public final C316906mP A0O;
    public final C316896mO A0P;
    public final C316886mN A0Q;
    public final ReelViewGroup A0R;
    public final C307266Pl A0S;
    public final AnonymousClass6PI A0T;
    public final C307306Pp A0U;
    public final C307286Pn A0V;
    public final AnonymousClass6PF A0W;
    public final AnonymousClass6PB A0X;
    public final AnonymousClass6PA A0Y;
    public final AnonymousClass6PX A0Z;
    public final AnonymousClass6PV A0a;
    public final AnonymousClass6PZ A0b;
    public final C307186Pd A0c;
    public final AnonymousClass6PL A0d;
    public final AnonymousClass6PR A0e;
    public final AnonymousClass6PN A0f;
    public final AnonymousClass6PP A0g;
    public final AnonymousClass6PT A0h;
    public final C307216Pg A0i;
    public final C307236Pi A0j;
    public final AnonymousClass6PH A0k;
    public final AnonymousClass6PK A0l;
    public final AnonymousClass6PJ A0m;
    public final C316206lH A0n;
    public final MediaFrameLayout A0o;
    public final RoundedCornerFrameLayout A0p;
    public final View A0q;
    public final View A0r;
    public final View A0s;
    public final C252063oV A0t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C309406Yd(View view, UserSession userSession, C313136fw r16) {
        super(view);
        0qQ.A0B(view, 1);
        this.A0r = view;
        this.A0F = userSession;
        View requireViewById = view.requireViewById(R.id.back_shadow_affordance);
        0qQ.A07(requireViewById);
        this.A0D = requireViewById;
        this.A0H = new C256003v4((ViewStub) view.requireViewById(R.id.media_subtitle_view_stub), false);
        Context context = view.getContext();
        requireViewById.setBackgroundResource(0mk.A02(context) ? R.drawable.reel_viewer_shadow_right : R.drawable.reel_viewer_shadow_left);
        View requireViewById2 = view.requireViewById(R.id.sponsored_reel_item_toolbar_stub);
        0qQ.A07(requireViewById2);
        ViewStub viewStub = (ViewStub) requireViewById2;
        viewStub.setLayoutResource(R.layout.layout_sponsored_reel_item_toolbar);
        viewStub.inflate();
        View requireViewById3 = view.requireViewById(R.id.toolbar_container);
        0qQ.A07(requireViewById3);
        this.A06 = new C307076Os((LinearLayout) requireViewById3, userSession);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.reel_viewer_media_layout);
        this.A0p = roundedCornerFrameLayout;
        roundedCornerFrameLayout.setCornerRadius(0);
        ReelViewGroup reelViewGroup = (ReelViewGroup) view.requireViewById(R.id.reel_main_container);
        this.A0R = reelViewGroup;
        this.A0t = 2b1.A01(view.requireViewById(R.id.reel_viewer_texture_viewstub), false, false);
        View requireViewById4 = view.requireViewById(R.id.reel_viewer_top_shadow);
        this.A0s = requireViewById4;
        this.A0I = 2b1.A01(view.requireViewById(R.id.reel_viewer_tall_android_top_bar_stub), false, false);
        View inflate = ((ViewStub) view.requireViewById(R.id.story_item_top_progress_bar_stub)).inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar");
        this.A0Y = new AnonymousClass6PA((SegmentedProgressBar) inflate);
        View requireViewById5 = view.requireViewById(R.id.reel_viewer_header);
        0qQ.A07(requireViewById5);
        View requireViewById6 = view.requireViewById(R.id.reel_viewer_header_container);
        0qQ.A07(requireViewById6);
        AnonymousClass6PB r5 = new AnonymousClass6PB(requireViewById5, requireViewById6);
        this.A0X = r5;
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.reel_viewer_media_container);
        this.A0o = mediaFrameLayout;
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.requireViewById(R.id.reel_viewer_image_view);
        this.A0K = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        igProgressImageView.setPlaceHolderColor(context.getColor(2Yu.A0H(igProgressImageView.getContext(), R.attr.igds_color_stories_loading_background)));
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        if (drawable != null) {
            igProgressImageView.setProgressBarDrawable(drawable);
            this.A0E = (ImageView) view.requireViewById(R.id.reel_viewer_image_link_icon);
            this.A0J = 2b1.A01(view.requireViewById(R.id.reel_viewer_zero_rating_data_banner_stub), false, false);
            ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.requireViewById(R.id.reel_retry_icon);
            this.A0G = colorFilterAlphaImageView;
            colorFilterAlphaImageView.setContentDescription(context.getString(2131971746));
            C252063oV A012 = 2b1.A01(view.requireViewById(R.id.reel_media_card_view_stub), false, false);
            C252063oV A013 = 2b1.A01(view.requireViewById(R.id.reel_flexible_media_card_view_stub), false, false);
            this.A0W = new AnonymousClass6PF(2b1.A01(view.findViewById(R.id.reel_item_bottom_banner), false, false));
            View requireViewById7 = view.requireViewById(R.id.landscape_overlay_container);
            0qQ.A07(requireViewById7);
            this.A0k = new AnonymousClass6PH(roundedCornerFrameLayout, (IgFrameLayout) requireViewById7, A012, A013, mediaFrameLayout);
            this.A0N = new C265844Wn((ViewStub) view.requireViewById(R.id.reel_poll_stub));
            this.A0M = new C265864Wp(2b1.A01(view.requireViewById(R.id.reel_poll_v2_stub), false, false));
            this.A0L = new C316706m5(2b1.A01(view.requireViewById(R.id.reel_countdown_sticker_stub), false, false));
            this.A0Q = new C316886mN(2b1.A01(view.requireViewById(R.id.reel_upcoming_event_card_sticker_stub), false, false));
            this.A0T = new AnonymousClass6PI(roundedCornerFrameLayout, A012, A013);
            View requireViewById8 = view.requireViewById(R.id.reel_swipe_up_instructions_stub);
            0qQ.A07(requireViewById8);
            this.A0n = new C316206lH((ViewStub) requireViewById8);
            View requireViewById9 = view.requireViewById(R.id.sponsored_reel_showreel_native_image_view_stub);
            0qQ.A07(requireViewById9);
            C313136fw r7 = r16;
            this.A0m = new AnonymousClass6PJ((ViewStub) requireViewById9, userSession, r7);
            View requireViewById10 = view.requireViewById(R.id.sponsored_reel_showreel_composition_view_stub);
            0qQ.A07(requireViewById10);
            this.A0l = new AnonymousClass6PK((ViewStub) requireViewById10, r7);
            View requireViewById11 = view.requireViewById(R.id.lead_gen_card_stub);
            0qQ.A07(requireViewById11);
            this.A0d = new AnonymousClass6PL((ViewStub) requireViewById11);
            View requireViewById12 = view.requireViewById(R.id.lead_gen_first_question_card_with_mcq_stub);
            0qQ.A07(requireViewById12);
            this.A0f = new AnonymousClass6PN((ViewStub) requireViewById12);
            View requireViewById13 = view.requireViewById(R.id.lead_gen_first_question_card_with_saq_stub);
            0qQ.A07(requireViewById13);
            this.A0g = new AnonymousClass6PP((ViewStub) requireViewById13);
            View requireViewById14 = view.requireViewById(R.id.lead_gen_first_question_card_with_contact_info_question_stub);
            0qQ.A07(requireViewById14);
            this.A0e = new AnonymousClass6PR((ViewStub) requireViewById14);
            View requireViewById15 = view.requireViewById(R.id.offsite_lead_gen_card_stub);
            0qQ.A07(requireViewById15);
            this.A0h = new AnonymousClass6PT((ViewStub) requireViewById15);
            View requireViewById16 = view.requireViewById(R.id.faqs_in_stories_card_stub);
            0qQ.A07(requireViewById16);
            this.A0a = new AnonymousClass6PV((ViewStub) requireViewById16);
            View requireViewById17 = view.requireViewById(R.id.ctwa_story_messaging_card_stub);
            0qQ.A07(requireViewById17);
            this.A0Z = new AnonymousClass6PX((ViewStub) requireViewById17);
            View requireViewById18 = view.requireViewById(R.id.generic_card_revamp_stub);
            0qQ.A07(requireViewById18);
            this.A0b = new AnonymousClass6PZ((ViewStub) requireViewById18);
            View requireViewById19 = view.requireViewById(R.id.generic_card_stub);
            0qQ.A07(requireViewById19);
            this.A0c = new C307186Pd((ViewStub) requireViewById19);
            View requireViewById20 = view.requireViewById(R.id.collection_ad_view_stub);
            0qQ.A07(requireViewById20);
            this.A0i = new C307216Pg((ViewStub) requireViewById20, userSession, mediaFrameLayout, roundedCornerFrameLayout);
            this.A0j = new C307236Pi(context, view, userSession, 2b1.A01(view.requireViewById(182.A06(0Tu.A05, userSession, 36313909835860275L) ? R.id.reel_cta_sticker_with_shadow_stub : R.id.reel_cta_sticker_stub), false, false));
            this.A0S = new C307266Pl(r5.A04, this.A06.A05.A04, 2b1.A01(view.requireViewById(R.id.end_scene_stub), false, false));
            this.A0P = new C316896mO(reelViewGroup, (ViewStub) view.requireViewById(R.id.sponsored_reel_product_sticker_stub), userSession);
            View requireViewById21 = view.requireViewById(R.id.sponsored_reel_multi_product_sticker_stub);
            0qQ.A07(requireViewById21);
            this.A0O = new C316906mP((ViewStub) requireViewById21, reelViewGroup);
            this.A0V = new C307286Pn(2b1.A01(view.requireViewById(R.id.reel_item_brand_survey), false, false));
            this.A0U = new C307306Pp(requireViewById4, userSession);
            this.A0q = view.requireViewById(R.id.delayed_skip_blocking_animation);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0131, code lost:
        if (r3 != null) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DcL(X.C309426Yf r13, int r14) {
        /*
            r12 = this;
            r5 = 0
            X.0qQ.A0B(r13, r5)
            r2 = 0
            r1 = 0
            r4 = 1
            r9 = r12
            if (r14 == r4) goto L_0x00a8
            r0 = 2
            if (r14 == r0) goto L_0x0029
            r0 = 8
            if (r14 != r0) goto L_0x0028
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0028
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x0028
            X.6Yf r0 = r12.A04
            if (r0 == 0) goto L_0x001f
            java.lang.Integer r1 = r0.A0V
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0028
            X.6Pi r0 = r12.A0j
            r0.A00()
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = r13.A18
            if (r0 == 0) goto L_0x0040
            X.3mM r0 = r12.A01
            if (r0 == 0) goto L_0x0040
            com.instagram.model.reels.Reel r0 = r0.A0H
            X.3IB r0 = r0.A0I
            if (r0 == 0) goto L_0x0040
            r0 = 0
            r13.A02(r0)
            X.3uh r0 = r12.A00
            X.C307976Sf.A04(r0, r13)
        L_0x0040:
            X.3uh r6 = r12.A00
            X.3mM r1 = r12.A01
            if (r6 == 0) goto L_0x0073
            if (r1 == 0) goto L_0x0073
            boolean r0 = r13.A18
            if (r0 == 0) goto L_0x0073
            com.instagram.common.session.UserSession r8 = r12.A0F
            boolean r0 = X.C297785sK.A0J(r8, r6, r1)
            if (r0 == 0) goto L_0x0073
            X.6Zd r7 = r12.A05
            if (r7 == 0) goto L_0x0073
            X.6Os r0 = r12.A06
            X.6Oy r0 = r0.A07
            X.3oV r0 = r0.A05
            android.view.View r3 = r0.getView()
            X.0qQ.A0B(r8, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342160823172208184(0x208106dc00041638, double:4.063732302494146E-152)
            boolean r0 = X.182.A06(r2, r8, r0)
            r7.DDd(r3, r0)
        L_0x0073:
            X.3mM r3 = r12.A01
            if (r3 == 0) goto L_0x0084
            X.3uh r2 = r12.A00
            if (r2 == 0) goto L_0x0084
            X.6Zd r1 = r12.A05
            if (r1 == 0) goto L_0x0084
            boolean r0 = r13.A18
            r1.DzT(r2, r3, r0)
        L_0x0084:
            boolean r0 = r13.A18
            if (r0 == 0) goto L_0x0028
            if (r6 == 0) goto L_0x0028
            boolean r0 = r6.A1F()
            if (r0 != r4) goto L_0x0028
            X.6PN r1 = r12.A0f
            boolean r0 = r13.A18
            if (r0 == 0) goto L_0x0028
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r1.A0C
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0028
            r1.A02(r4)
            r1.A0E = r5
            return
        L_0x00a8:
            X.3mM r6 = r12.A01
            if (r6 == 0) goto L_0x00cb
            com.instagram.model.reels.Reel r0 = r6.A0H
            X.3IB r0 = r0.A0I
            if (r0 == 0) goto L_0x00b8
            X.6PA r0 = r12.A0Y
            r0.A00(r6, r13)
            return
        L_0x00b8:
            boolean r0 = X.C309456Yi.A02(r6)
            if (r0 == 0) goto L_0x00cb
            X.6PA r0 = r12.A0Y
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r0.A00
            int r1 = r0.A03
            int r0 = r6.A01()
            if (r1 == r0) goto L_0x00cb
            r2 = 1
        L_0x00cb:
            X.6Zd r10 = r12.A05
            if (r10 == 0) goto L_0x00ee
            X.6Yf r8 = r12.A04
            if (r8 == 0) goto L_0x00ee
            if (r6 == 0) goto L_0x00ee
            X.3uh r5 = r12.A00
            if (r5 == 0) goto L_0x00ee
            X.3BQ r7 = r12.A02
            if (r7 == 0) goto L_0x00ee
            if (r2 != 0) goto L_0x00e5
            boolean r0 = X.C297785sK.A0o(r6, r8)
            if (r0 == 0) goto L_0x00ee
        L_0x00e5:
            X.6PB r0 = r12.A0X
            X.6PC r11 = r0.A0G
            com.instagram.common.session.UserSession r4 = r12.A0F
            X.C307366Pv.A03(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00ee:
            X.3uh r0 = r12.A00
            if (r0 == 0) goto L_0x0115
            boolean r0 = X.C297785sK.A0Y(r0)
            if (r0 == 0) goto L_0x0115
            float r3 = r13.A0B
            com.instagram.feed.widget.IgProgressImageView r2 = r12.BGP()
            if (r2 == 0) goto L_0x0115
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.getIgImageView()
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x0115
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1034147600(0x3da3d710, float:0.08000004)
            float r3 = r3 * r0
            float r1 = r1 + r3
            r2.setScaleX(r1)
            r2.setScaleY(r1)
        L_0x0115:
            X.3mM r1 = r12.A01
            if (r1 == 0) goto L_0x011e
            X.6PA r0 = r12.A0Y
            r0.A00(r1, r13)
        L_0x011e:
            X.6Pp r6 = r12.A0U
            X.3uh r2 = r12.A00
            X.3mM r1 = r12.A01
            r5 = 0
            if (r1 == 0) goto L_0x0198
            boolean r0 = X.C309456Yi.A02(r1)
            if (r0 == 0) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            java.util.List r3 = r2.A0M
            if (r3 != 0) goto L_0x0139
        L_0x0133:
            X.0sn r3 = X.0sn.A00
            if (r0 == 0) goto L_0x0196
            if (r1 == 0) goto L_0x0196
        L_0x0139:
            int r7 = r1.A01()
        L_0x013d:
            if (r2 == 0) goto L_0x0193
            if (r1 == 0) goto L_0x0193
            float r4 = X.C297785sK.A01(r2, r1, r13)
        L_0x0145:
            if (r0 == 0) goto L_0x016d
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r3.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            float r2 = (float) r0
            int r0 = r7 + 1
            java.lang.Object r0 = X.00k.A0O(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x018f
            double r0 = r0.doubleValue()
            float r4 = (float) r0
        L_0x0169:
            float r4 = r4 - r2
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r0
        L_0x016d:
            java.lang.Integer r0 = r13.A0V
            if (r0 == 0) goto L_0x0181
            com.instagram.common.session.UserSession r3 = r12.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342167003630153371(0x20810c7b00042e9b, double:4.068972806558129E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0181
            r5 = 1
        L_0x0181:
            float r1 = (float) r7
            float r1 = r1 * r4
            float r0 = r13.A0B
            float r0 = r0 * r4
            float r1 = r1 + r0
            X.6Pt r0 = r6.A01
            if (r0 == 0) goto L_0x0028
            r0.A02(r5, r1)
            return
        L_0x018f:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r0
            goto L_0x0169
        L_0x0193:
            float r4 = r13.A0A
            goto L_0x0145
        L_0x0196:
            r7 = 0
            goto L_0x013d
        L_0x0198:
            r0 = 0
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309406Yd.DcL(X.6Yf, int):void");
    }

    private final AnonymousClass6K2 A00() {
        IgShowreelCompositionView igShowreelCompositionView;
        AnonymousClass6PK r3 = this.A0l;
        if (r3.A00 == null) {
            0wb.A03("SponsoredReelViewerItemBinder#getTextureView", "IgShowreelCompositionVideoView is null");
            C252063oV r1 = r3.A02;
            if (r1.CVM() && (igShowreelCompositionView = (IgShowreelCompositionView) r1.getView()) != null) {
                r3.A00 = igShowreelCompositionView.getCompositionController().getVideoView();
            }
            if (r3.A00 != null) {
                0wb.A03("SponsoredReelViewerItemBinder#getTextureView", "success on findViewWithTag for IgShowreelCompositionVideoView");
            }
        }
        return r3.A00;
    }

    private final boolean A01() {
        C255773uh r3 = this.A00;
        if (r3 != null) {
            UserSession userSession = this.A0F;
            if (C297785sK.A0F(userSession, r3) || C297785sK.A0B(userSession, r3)) {
                return true;
            }
        }
        if (!this.A07) {
            return false;
        }
        Context context = this.A0r.getContext();
        0qQ.A07(context);
        if (!C316216lI.A0B(context)) {
            return true;
        }
        return false;
    }

    public final void A02() {
        C250973mM r3 = this.A01;
        if (r3 != null) {
            r3.A07 = true;
            AnonymousClass6PA r0 = this.A0Y;
            UserSession userSession = this.A0F;
            SegmentedProgressBar segmentedProgressBar = r0.A00;
            segmentedProgressBar.A06 = -1;
            int A022 = r3.A02(userSession);
            int i = segmentedProgressBar.A04;
            if (i < A022) {
                segmentedProgressBar.A0A = i;
                segmentedProgressBar.A09 = segmentedProgressBar.A08;
                segmentedProgressBar.A07 = segmentedProgressBar.A06;
                segmentedProgressBar.A04 = A022;
                segmentedProgressBar.A0M.start();
                segmentedProgressBar.invalidate();
            }
        }
    }

    public final void A03() {
        FrameLayout.LayoutParams layoutParams;
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0p;
        Context context = roundedCornerFrameLayout.getContext();
        roundedCornerFrameLayout.setBackgroundColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_media_background)));
        MediaFrameLayout mediaFrameLayout = this.A0o;
        ViewGroup.LayoutParams layoutParams2 = mediaFrameLayout.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.gravity = 0;
            layoutParams.setMargins(0, 0, 0, 0);
            mediaFrameLayout.setLayoutParams(layoutParams);
        }
        mediaFrameLayout.setTranslationY(0.0f);
        mediaFrameLayout.A00 = -1.0f;
        mediaFrameLayout.setScaleX(1.0f);
        mediaFrameLayout.setScaleY(1.0f);
        IgProgressImageView igProgressImageView = this.A0K;
        igProgressImageView.setScaleX(1.0f);
        igProgressImageView.setScaleY(1.0f);
    }

    public final void A04() {
        ScalingTextureView C5p;
        IgProgressImageView igProgressImageView = this.A0K;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        if (this.A08 || this.A09) {
            if (this.A0A) {
                igImageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                igImageView.setClipToOutline(false);
                if (igProgressImageView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.LayoutParams layoutParams = igProgressImageView.getLayoutParams();
                    0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                }
                ImageView imageView = this.A0E;
                imageView.setOnTouchListener((View.OnTouchListener) null);
                imageView.setVisibility(8);
            }
            if (this.A08) {
                igImageView.setOnTouchListener((View.OnTouchListener) null);
            }
            if (this.A09 && (C5p = C5p()) != null) {
                C5p.setOnTouchListener((View.OnTouchListener) null);
            }
            this.A08 = false;
            this.A09 = false;
        }
        this.A0A = false;
    }

    public final void A05() {
        AnonymousClass6PB r3 = this.A0X;
        IgImageView igImageView = r3.A0F;
        igImageView.setVisibility(0);
        r3.A0E.setVisibility(8);
        igImageView.A09();
        ImageView imageView = r3.A00;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        r3.A0G.A00.setText("");
        r3.A0H.A04.setVisibility(8);
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        A04();
        this.A0K.A04();
        this.A0Y.A00.setProgress(0.0f);
        this.A06.A05.A00 = false;
        C307306Pp r2 = this.A0U;
        0qQ.A0B(r2, 0);
        C307346Pt r1 = r2.A01;
        if (r1 != null) {
            r1.A01((String) null, (String) null, 0sn.A00);
        }
        r2.A00 = null;
    }

    public final C305966Kg AYM() {
        return this.A06.AYM();
    }

    public final C74500Pvu AjF() {
        C255773uh r3 = this.A00;
        C250973mM r2 = this.A01;
        if (!(r3 == null || r2 == null)) {
            Context context = this.A0r.getContext();
            0qQ.A07(context);
            UserSession userSession = this.A0F;
            if (C309506Yn.A05(context, userSession, r3, r2) && C309506Yn.A09(userSession, r3, r2.A01)) {
                return this.A0j.A01;
            }
        }
        return this.A06.AjF();
    }

    public final IgProgressImageView BGP() {
        AnonymousClass6K2 r0;
        C250973mM r02 = this.A01;
        if (r02 != null) {
            UserSession userSession = this.A0F;
            C255773uh A082 = r02.A08(userSession);
            if (C297785sK.A0c(A082) && (r0 = this.A0l.A00) != null) {
                return r0.A00;
            }
            C250973mM r03 = this.A01;
            if (r03 == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (!C297785sK.A0L(userSession, A082, r03)) {
                return this.A0K;
            } else {
                IgProgressImageView igProgressImageView = this.A0T.A02;
                if (igProgressImageView != null) {
                    return igProgressImageView;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final C255773uh Bkg() {
        return this.A00;
    }

    public final FrameLayout Bkk() {
        AnonymousClass6K2 r0;
        if (C263454Mb.A00(this.A0F, "reel_sponsored_viewer")) {
            r0 = A00();
        } else {
            r0 = this.A0l.A00;
        }
        C255773uh r1 = this.A00;
        if (r1 == null || !C297785sK.A0c(r1) || r0 == null) {
            return this.A0o;
        }
        return r0.A01;
    }

    public final View Bkr() {
        C265864Wp r2 = this.A0M;
        View view = null;
        if (!r2.A09.CVM() || (view = r2.A00) != null) {
            return view;
        }
        0qQ.A0F("stickerContainerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup Bks() {
        ViewGroup viewGroup = this.A0N.A02;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C305946Ke C3Z() {
        C255773uh r1 = this.A00;
        if (r1 == null || !C309506Yn.A08(this.A0F, r1)) {
            return this.A06.C3Z();
        }
        return this.A0j.C3Z();
    }

    public final ScalingTextureView C5p() {
        AnonymousClass6K2 A002;
        ScalingTextureView scalingTextureView;
        if (C263454Mb.A00(this.A0F, "reel_sponsored_viewer")) {
            return null;
        }
        C255773uh r0 = this.A00;
        if (r0 == null || !C297785sK.A0c(r0) || (A002 = A00()) == null || (scalingTextureView = A002.getScalingTextureView()) == null) {
            return (ScalingTextureView) this.A0t.getView();
        }
        return scalingTextureView;
    }

    public final void DPI(boolean z) {
        UserSession userSession = this.A0F;
        if (this.A07) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36313909834484009L)) {
                this.A0j.A00();
            }
        }
        if (!A01()) {
            this.A0n.A01(userSession, this.A00, this.A01, z);
        }
        C307146Oz r4 = this.A06.A09;
        View view = r4.A01;
        if (view.getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) view.getContext().getResources().getInteger(R.integer.config_activityLongDur));
            alphaAnimation.setAnimationListener(new WCT(r4));
            view.startAnimation(alphaAnimation);
        }
    }

    public final void DPJ() {
        UserSession userSession = this.A0F;
        if (this.A07) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36313909834484009L)) {
                this.A0j.A01();
            }
        }
        if (!A01()) {
            this.A0n.A00();
        }
        C307146Oz r4 = this.A06.A09;
        View view = r4.A01;
        if (view.getVisibility() == 8) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) view.getContext().getResources().getInteger(R.integer.config_activityLongDur));
            alphaAnimation.setAnimationListener(new WCS(r4));
            view.startAnimation(alphaAnimation);
        }
    }

    public final void DcO() {
        C307076Os r2 = this.A06;
        C309426Yf r1 = r2.A00;
        if (r1 != null) {
            r1.A0j = false;
        }
        C74500Pvu AjF = r2.AjF();
        if (AjF != null) {
            C66951Mfk.A00(AjF);
        }
        r2.A05.A00();
        C305956Kf.A03(r2.C3Z());
        r2.A0A.A02();
        C305966Kg AYM = r2.AYM();
        Animator animator = (Animator) AYM.A02.getValue();
        if (animator != null) {
            animator.cancel();
        }
        C309426Yf r12 = AYM.A00;
        if (r12 != null) {
            r12.A0i = false;
        }
        r2.A07.A00();
        r2.A09.A01.setVisibility(0);
        this.A0S.A0B.setVisibility(8);
        if (this.A07 && this.A0B) {
            this.A0j.A01();
        }
        C307236Pi r3 = this.A0j;
        AnonymousClass6MY r22 = r3.A01;
        if (r22 != null) {
            C309426Yf r13 = r22.A02;
            if (r13 == null || !r13.A0z || C309506Yn.A0C(r3.A06, r13)) {
                C309426Yf r14 = r22.A02;
                if (r14 != null) {
                    r14.A0j = true;
                }
                r22.Eqh();
            } else {
                C66951Mfk.A00(r22);
                r22.EIN();
            }
        }
        C305956Kf.A03(r3.C3Z());
        r3.A09.A02();
        C305956Kf.A03(C3Z());
    }

    public final void ERT(float f) {
        this.A0s.setAlpha(f);
        this.A0Y.A00.setAlpha(f);
        this.A0X.A04.setAlpha(f);
        C307076Os r2 = this.A06;
        r2.A07.A04.setAlpha(f);
        C252063oV r1 = r2.A03;
        if (r1.CVM()) {
            r1.getView().setAlpha(f);
        }
        C252063oV r12 = r2.A02;
        if (r12.CVM()) {
            r12.getView().setAlpha(f);
        }
        C252063oV r13 = r2.A04;
        if (r13.CVM()) {
            r13.getView().setAlpha(f);
        }
        r2.A0A.A03(f);
        r2.A05.A04.setAlpha(f);
        C252063oV r14 = r2.A06.A00;
        if (r14.CVM()) {
            r14.getView().setAlpha(f);
        }
        this.A0j.A09.A03(f);
    }
}
