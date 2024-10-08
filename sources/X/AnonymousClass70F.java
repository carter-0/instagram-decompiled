package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.70F  reason: invalid class name */
public final class AnonymousClass70F implements AnonymousClass70G {
    public View A00;
    public ConstraintLayout A01;
    public ShimmerFrameLayout A02;
    public C321266tq A03 = null;
    public IgSimpleImageView A04;
    public IgTextView A05;
    public CircularImageView A06;
    public IgImageView A07;
    public IgImageView A08;
    public C71662eb A09;
    public C71662eb A0A;
    public C71662eb A0B;
    public NoteBubbleView A0C;
    public AnonymousClass70M A0D;
    public PulseEmitter A0E;
    public PulsingMultiImageView A0F;
    public Runnable A0G;
    public boolean A0H = true;
    public boolean A0I;
    public final ViewGroup A0J;
    public final ViewStub A0K;
    public final ViewStub A0L;
    public final ViewStub A0M;
    public final IgImageView A0N;
    public final C71662eb A0O;
    public final C71662eb A0P;
    public final C71662eb A0Q;
    public final C71662eb A0R;
    public final C71662eb A0S;
    public final C71662eb A0T;
    public final C71662eb A0U;
    public final GradientSpinner A0V;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public static void A00(AnonymousClass70F r2) {
        PulseEmitter pulseEmitter = r2.A0E;
        if (pulseEmitter != null && r2.A0F != null) {
            pulseEmitter.A02();
            r2.A0E.setVisibility(8);
            r2.A0F.A0I();
            r2.A0F.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r1.A01() != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r6.A05(r5) != false) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(com.instagram.common.session.UserSession r5, X.C319896rP r6, com.instagram.user.model.User r7, boolean r8) {
        /*
            r4 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r6 == 0) goto L_0x000e
            boolean r1 = r6.A05(r5)
            r0 = 1
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            boolean r0 = X.AnonymousClass70L.A03(r5, r7, r8, r0)
            if (r0 == 0) goto L_0x001e
            X.2eb r0 = r4.A0O
            android.view.View r0 = r0.A01()
            r2.add(r0)
        L_0x001e:
            if (r6 == 0) goto L_0x0049
            com.instagram.model.reels.Reel r0 = r6.A00()
            X.3ID r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x0049
            X.2eb r1 = r4.A0P
        L_0x002c:
            android.view.View r0 = r1.A01()
            r2.add(r0)
        L_0x0033:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            X.70M r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x0048
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.A0V
            r3.add(r0)
        L_0x0048:
            return r3
        L_0x0049:
            X.70M r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x0033
            X.70M r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0068
            X.2eb r1 = r4.A0S
            android.view.View r0 = r1.A01()
            if (r0 == 0) goto L_0x0033
            goto L_0x002c
        L_0x0068:
            X.70M r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0033
            X.2eb r0 = r4.A09
            if (r0 == 0) goto L_0x007e
            android.view.View r0 = r0.A01()
            r2.add(r0)
        L_0x007e:
            X.2eb r1 = r4.A0Q
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70F.A01(com.instagram.common.session.UserSession, X.6rP, com.instagram.user.model.User, boolean):java.util.ArrayList");
    }

    public final void A02() {
        this.A0P.A03(8);
        C71662eb r0 = this.A09;
        if (r0 != null) {
            r0.A03(8);
        }
        this.A0Q.A03(8);
        this.A0S.A03(8);
        this.A0U.A03(8);
        this.A0T.A03(8);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final View AeY() {
        C71662eb r2;
        ? r0;
        if (this.A0I) {
            r2 = this.A0A;
        } else {
            AnonymousClass70M r02 = this.A0D;
            r02.getClass();
            if (r02.A02 == AnonymousClass05K.A00 && (r0 = this.A0F) != 0) {
                return r0;
            }
            r2 = this.A0R;
            if (r2.A00 == null || r2.A01().getVisibility() == 8) {
                return this.A0N;
            }
        }
        return r2.A01();
    }

    public final GradientSpinner Bkt() {
        return this.A0V;
    }

    public AnonymousClass70F(ViewGroup viewGroup, UserSession userSession) {
        int i;
        this.A0J = viewGroup;
        IgImageView requireViewById = viewGroup.requireViewById(R.id.row_profile_header_imageview);
        this.A0N = requireViewById;
        this.A0A = new C71662eb((ViewStub) viewGroup.findViewById(R.id.profile_picture_updating_shimmer_stub));
        this.A0L = (ViewStub) viewGroup.requireViewById(R.id.pulse_emitter_stub);
        this.A0M = (ViewStub) viewGroup.requireViewById(R.id.pulsing_image_view_stub);
        GradientSpinner gradientSpinner = (GradientSpinner) viewGroup.requireViewById(R.id.reel_ring);
        this.A0V = gradientSpinner;
        this.A0R = new C71662eb((ViewStub) viewGroup.findViewById(R.id.avatar_on_profile_view_stub));
        this.A0K = (ViewStub) viewGroup.requireViewById(R.id.birthday_confetti_animation_stub);
        this.A0P = new C71662eb((ViewStub) viewGroup.findViewById(R.id.reel_glyph_stub));
        this.A0Q = new C71662eb((ViewStub) viewGroup.findViewById(R.id.live_badge_view_stub));
        C71662eb r1 = new C71662eb((ViewStub) viewGroup.findViewById(R.id.new_badge_view_stub));
        this.A0S = r1;
        r1.A02 = new AnonymousClass70H();
        C71662eb r3 = new C71662eb((ViewStub) viewGroup.findViewById(R.id.profile_pic_creation_nudge_overlay));
        this.A0U = r3;
        this.A0T = new C71662eb((ViewStub) viewGroup.findViewById(R.id.profile_pic_creation_nudge_badge));
        this.A0O = new C71662eb((ViewStub) viewGroup.requireViewById(R.id.empty_badge_stub));
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.live_badge_margin_spacer_stub);
        if (viewStub != null) {
            this.A09 = new C71662eb(viewStub);
        }
        Resources resources = viewGroup.getResources();
        ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
        0qQ.A0B(resources, 2);
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession, 36327795462781643L);
        int intValue = AnonymousClass70I.A02(viewGroup).intValue();
        if (A062) {
            if (intValue == 0) {
                i = R.dimen.avatar_reel_ring_size_xxxxlarge;
            } else if (intValue != 1) {
                i = R.dimen.album_thumbnail_image_size;
                if (intValue != 2) {
                    i = R.dimen.ad_not_delivering_thumbnail_height;
                }
            } else {
                i = R.dimen.achievements_achievement_image_size;
            }
        } else if (intValue != 0) {
            i = R.dimen.prism_avatar_story_ring_size_medium_device;
            if (intValue != 1) {
                i = R.dimen.album_preview_add_item_circle_size;
            }
        } else {
            i = R.dimen.audition_flow_footer_text_button_min_width;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        gradientSpinner.setActiveStrokeWidth((float) AnonymousClass70I.A00(resources, viewGroup));
        gradientSpinner.setInactiveStrokeWidth((float) AnonymousClass70I.A00(resources, viewGroup));
        gradientSpinner.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = requireViewById.getLayoutParams();
        int A012 = AnonymousClass70I.A01(resources, viewGroup, userSession);
        layoutParams2.height = A012;
        layoutParams2.width = A012;
        requireViewById.requestLayout();
        View A013 = r3.A01();
        if (A013 != null) {
            ViewGroup.LayoutParams layoutParams3 = A013.getLayoutParams();
            layoutParams3.height = A012;
            layoutParams3.width = A012;
            r3.A01().requestLayout();
        }
        if (C322606w6.A01(userSession)) {
            this.A01 = (ConstraintLayout) viewGroup.findViewById(R.id.pog_note_bubble_container);
            this.A0C = (NoteBubbleView) viewGroup.findViewById(R.id.pog_note_bubble_view);
            this.A07 = viewGroup.findViewById(R.id.filled_like_view);
            this.A04 = (IgSimpleImageView) viewGroup.findViewById(R.id.note_custom_activation_view);
        }
        if (182.A06(r2, userSession, 36322207710062595L)) {
            this.A0B = new C71662eb((ViewStub) viewGroup.findViewById(R.id.video_on_profile_picture_stub));
        }
    }

    public final RectF AeG() {
        return 0nA.A0F(AeY());
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(AeY());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        AeY().setVisibility(4);
        ViewStub viewStub = this.A0K;
        if (viewStub != null && this.A06 != null) {
            viewStub.setVisibility(8);
            this.A06.setVisibility(8);
        }
    }

    public final void Eu3(AnonymousClass0iw r9) {
        View AeY = AeY();
        View view = this.A0N;
        if (AeY == view) {
            A00(this);
            ShimmerFrameLayout shimmerFrameLayout = this.A02;
            if (shimmerFrameLayout != null) {
                C71662eb r0 = this.A0A;
                shimmerFrameLayout.A03();
                r0.A03(8);
                this.A02.setVisibility(8);
            }
            view.setVisibility(0);
            AnonymousClass70M r02 = this.A0D;
            r02.getClass();
            view.setScaleX(r02.A00());
            AnonymousClass70M r03 = this.A0D;
            r03.getClass();
            view.setScaleY(r03.A00());
            return;
        }
        C71662eb r7 = this.A0R;
        if (AeY == r7.A01()) {
            if (view != null) {
                view.setVisibility(4);
            }
            A00(this);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
            if (shimmerFrameLayout2 != null) {
                C71662eb r04 = this.A0A;
                shimmerFrameLayout2.A03();
                r04.A03(8);
                this.A02.setVisibility(8);
            }
            this.A0U.A03(8);
            this.A0T.A03(8);
            C320946tJ r4 = ((ProfileCoinFlipView) r7.A01()).A01;
            C320946tJ r3 = C320946tJ.AVATAR;
            View A012 = r7.A01();
            AnonymousClass70M r05 = this.A0D;
            r05.getClass();
            float A002 = r05.A00();
            if (r4 == r3) {
                A002 *= -1.0f;
            }
            A012.setScaleX(A002);
            View A013 = r7.A01();
            AnonymousClass70M r06 = this.A0D;
            r06.getClass();
            A013.setScaleY(r06.A00());
            AnonymousClass70M r07 = this.A0D;
            r07.getClass();
            ((ProfileCoinFlipView) r7.A01()).A00 = r07.A00();
            r7.A01().setVisibility(0);
            return;
        }
        if (this.A0I) {
            C71662eb r32 = this.A0A;
            if (r32.A01() == AeY) {
                this.A02 = (ShimmerFrameLayout) AeY;
                A00(this);
                if (this.A02 != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.LayoutParams layoutParams2 = this.A02.getLayoutParams();
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.A02.A02();
                    r32.A03(0);
                    this.A02.setVisibility(0);
                    view.setVisibility(4);
                    r7.A01().setVisibility(4);
                    return;
                }
                return;
            }
        }
        IgImageView igImageView = this.A0F;
        boolean z = false;
        if (AeY == igImageView) {
            z = true;
        }
        17k.A0F(z);
        igImageView.getClass();
        igImageView.setVisibility(0);
        view.setVisibility(4);
    }
}
