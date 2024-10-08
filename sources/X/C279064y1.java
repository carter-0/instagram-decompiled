package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4y1  reason: invalid class name and case insensitive filesystem */
public final class C279064y1 implements AnonymousClass3V3, AnonymousClass2xU, C262814Gc {
    public AnonymousClass3TS A00;
    public AnonymousClass3W1 A01;
    public final View A02;
    public final C256003v4 A03;
    public final ReboundViewPager A04;
    public final SimpleZoomableViewContainer A05;
    public final C262794Ga A06;
    public final AnonymousClass4GZ A07;
    public final AnonymousClass4G9 A08;
    public final AnonymousClass4GY A09;
    public final AnonymousClass3V8 A0A;
    public final C256053v9 A0B;
    public final AnonymousClass3V4 A0C;
    public final C256033v7 A0D;
    public final IgProgressImageView A0E;
    public final AnonymousClass3V9 A0F;
    public final AnonymousClass3V9 A0G;
    public final AnonymousClass3VF A0H;
    public final MediaActionsView A0I;
    public final MediaFrameLayout A0J;
    public final C247233fz A0K;
    public final C252063oV A0L;
    public final C256043v8 A0M;

    public C279064y1(View view, C256003v4 r12, ReboundViewPager reboundViewPager, C252063oV r14, SimpleZoomableViewContainer simpleZoomableViewContainer, C262794Ga r16, AnonymousClass4GZ r17, AnonymousClass4G9 r18, AnonymousClass4GY r19, AnonymousClass3V8 r20, C256053v9 r21, C256043v8 r22, AnonymousClass3V4 r23, C256033v7 r24, IgProgressImageView igProgressImageView, AnonymousClass3V9 r26, AnonymousClass3V9 r27, AnonymousClass3V9 r28, AnonymousClass3V9 r29, AnonymousClass3V9 r30, AnonymousClass3VE r31, MediaActionsView mediaActionsView, MediaFrameLayout mediaFrameLayout) {
        0qQ.A0B(simpleZoomableViewContainer, 1);
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        0qQ.A0B(mediaFrameLayout2, 2);
        IgProgressImageView igProgressImageView2 = igProgressImageView;
        0qQ.A0B(igProgressImageView2, 3);
        0qQ.A0B(view, 4);
        MediaActionsView mediaActionsView2 = mediaActionsView;
        0qQ.A0B(mediaActionsView2, 5);
        C256033v7 r4 = r24;
        0qQ.A0B(r4, 8);
        this.A05 = simpleZoomableViewContainer;
        this.A0J = mediaFrameLayout2;
        this.A0E = igProgressImageView2;
        this.A02 = view;
        this.A0I = mediaActionsView2;
        this.A03 = r12;
        this.A0A = r20;
        this.A0D = r4;
        this.A0C = r23;
        this.A09 = r19;
        this.A0M = r22;
        this.A06 = r16;
        this.A07 = r17;
        this.A0F = r29;
        this.A0G = r30;
        this.A0B = r21;
        this.A08 = r18;
        this.A04 = reboundViewPager;
        this.A0L = r14;
        this.A0K = new C256063vA(r12);
        this.A0H = new AnonymousClass3VF((AnonymousClass3VC) null, r26, r27, r28, (AnonymousClass3VD) null, r31);
        mediaActionsView2.A0F = new C279074y2();
        mediaFrameLayout2.setTag(R.id.feed_cta_extra_tappable_target, "carousel_video_view");
    }

    public final C258253yi BRL() {
        return null;
    }

    public final void D63(UserSession userSession, 1Xj r5, float f, float f2, int i) {
        ReboundViewPager reboundViewPager;
        0qQ.A0B(r5, 1);
        AnonymousClass3V9 r0 = this.A0H.A01;
        if (r0 != null) {
            r0.A0E(i, f);
        }
        if (C262574Fa.A00(userSession, r5) && (reboundViewPager = this.A04) != null) {
            C18531Vtj.A00.A00(reboundViewPager, this.A0L.getView(), f2);
        }
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r4, 0);
        int i2 = 4;
        if (i == 4) {
            MediaActionsView mediaActionsView = this.A0I;
            if (!r4.A36) {
                i2 = 0;
            }
            mediaActionsView.setVisibility(i2);
        }
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r2, 1);
        this.A0E.A09(r2, imageUrl, z);
    }

    public final AnonymousClass3TS Adf() {
        return this.A00;
    }

    public final C256043v8 B5X() {
        if (this.A00 != null) {
            return this.A0M;
        }
        return null;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A0I;
    }

    public final View BG1() {
        return this.A0E;
    }

    public final View BQB() {
        return this.A0J;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A01;
    }

    public final C247233fz BQv() {
        return this.A0K;
    }

    public final C242423Ua C5r() {
        return this.A0J;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A0I.getWidth();
    }

    public final void EEI(int i) {
        this.A0E.A06(i);
    }
}
