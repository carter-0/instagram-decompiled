package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4Gb  reason: invalid class name and case insensitive filesystem */
public final class C262804Gb implements C262814Gc {
    public final View A00;
    public final ReboundViewPager A01;
    public final SimpleZoomableViewContainer A02;
    public final C274054nd A03;
    public final C274064ne A04;
    public final C274044nc A05;
    public final C274074nf A06;
    public final C262794Ga A07;
    public final AnonymousClass4GZ A08;
    public final AnonymousClass4G9 A09;
    public final C274084ng A0A;
    public final AnonymousClass4GY A0B;
    public final AnonymousClass3V8 A0C;
    public final C256053v9 A0D;
    public final C256033v7 A0E;
    public final IgProgressImageView A0F;
    public final AnonymousClass3V9 A0G;
    public final AnonymousClass3V9 A0H;
    public final AnonymousClass3VF A0I;
    public final MediaFrameLayout A0J;
    public final C252063oV A0K;

    public final void D63(UserSession userSession, 1Xj r5, float f, float f2, int i) {
        ReboundViewPager reboundViewPager;
        0qQ.A0B(r5, 1);
        AnonymousClass3V9 r0 = this.A0I.A01;
        if (r0 != null) {
            r0.A0E(i, f);
        }
        if (C262574Fa.A00(userSession, r5) && (reboundViewPager = this.A01) != null) {
            C18531Vtj.A00.A00(reboundViewPager, this.A0K.getView(), f2);
        }
    }

    public C262804Gb(View view, ReboundViewPager reboundViewPager, C252063oV r13, SimpleZoomableViewContainer simpleZoomableViewContainer, C274054nd r15, C274064ne r16, C274044nc r17, C274074nf r18, C262794Ga r19, AnonymousClass4GZ r20, AnonymousClass4G9 r21, C274084ng r22, AnonymousClass4GY r23, AnonymousClass3V8 r24, C256053v9 r25, C256033v7 r26, IgProgressImageView igProgressImageView, AnonymousClass3VC r28, AnonymousClass3V9 r29, AnonymousClass3V9 r30, AnonymousClass3V9 r31, AnonymousClass3V9 r32, AnonymousClass3V9 r33, AnonymousClass3VD r34, AnonymousClass3VE r35, MediaFrameLayout mediaFrameLayout) {
        0qQ.A0B(simpleZoomableViewContainer, 1);
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        0qQ.A0B(mediaFrameLayout2, 2);
        IgProgressImageView igProgressImageView2 = igProgressImageView;
        0qQ.A0B(igProgressImageView2, 3);
        0qQ.A0B(view, 4);
        C256033v7 r3 = r26;
        0qQ.A0B(r3, 11);
        this.A02 = simpleZoomableViewContainer;
        this.A0J = mediaFrameLayout2;
        this.A00 = view;
        this.A0C = r24;
        this.A0E = r3;
        this.A05 = r17;
        this.A03 = r15;
        this.A08 = r20;
        this.A04 = r16;
        this.A07 = r19;
        this.A0G = r32;
        this.A0H = r33;
        this.A0D = r25;
        this.A06 = r18;
        this.A0A = r22;
        this.A09 = r21;
        this.A01 = reboundViewPager;
        this.A0K = r13;
        AnonymousClass3V9 r5 = r29;
        AnonymousClass3VC r4 = r28;
        this.A0I = new AnonymousClass3VF(r4, r5, r30, r31, r34, r35);
        this.A0B = r23;
        this.A0F = igProgressImageView2;
        mediaFrameLayout2.setTag(R.id.feed_cta_extra_tappable_target, "carousel_image_view");
    }
}
