package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4EA  reason: invalid class name */
public final class AnonymousClass4EA extends C249703kE implements AnonymousClass3V3, AnonymousClass2xU {
    public long A00;
    public AnonymousClass3TS A01;
    public C256053v9 A02;
    public C258253yi A03;
    public AnonymousClass3W1 A04;
    public boolean A05;
    public final View A06;
    public final AnonymousClass3TX A07;
    public final IgFrameLayout A08;
    public final IgView A09;
    public final C256003v4 A0A;
    public final C256063vA A0B;
    public final C252063oV A0C;
    public final AnonymousClass3TY A0D;
    public final C258313yo A0E;
    public final AnonymousClass3TW A0F;
    public final AnonymousClass3V8 A0G;
    public final C258263yj A0H;
    public final C258323yp A0I;
    public final AnonymousClass3V4 A0J;
    public final AnonymousClass3Ux A0K;
    public final C258333yq A0L;
    public final C256033v7 A0M;
    public final IgProgressImageView A0N;
    public final C258243yh A0O;
    public final AnonymousClass3V9 A0P;
    public final AnonymousClass3VF A0Q;
    public final LikeActionView A0R;
    public final MediaActionsView A0S;
    public final MediaFrameLayout A0T;
    public final C256043v8 A0U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4EA(View view, View view2, AnonymousClass3TX r13, AnonymousClass3TS r14, IgFrameLayout igFrameLayout, IgView igView, C256003v4 r17, C252063oV r18, AnonymousClass3TY r19, C258313yo r20, AnonymousClass3TW r21, AnonymousClass3V8 r22, C258263yj r23, C256053v9 r24, C258323yp r25, C256043v8 r26, AnonymousClass3V4 r27, C258253yi r28, AnonymousClass3Ux r29, C258333yq r30, C256033v7 r31, IgProgressImageView igProgressImageView, C258243yh r33, AnonymousClass3VC r34, AnonymousClass3V9 r35, AnonymousClass3V9 r36, AnonymousClass3V9 r37, AnonymousClass3V9 r38, AnonymousClass3VD r39, AnonymousClass3VE r40, LikeActionView likeActionView, MediaActionsView mediaActionsView, MediaFrameLayout mediaFrameLayout) {
        super(view);
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        0qQ.A0B(mediaFrameLayout2, 3);
        IgProgressImageView igProgressImageView2 = igProgressImageView;
        0qQ.A0B(igProgressImageView2, 4);
        LikeActionView likeActionView2 = likeActionView;
        0qQ.A0B(likeActionView2, 5);
        MediaActionsView mediaActionsView2 = mediaActionsView;
        0qQ.A0B(mediaActionsView2, 6);
        this.A08 = igFrameLayout;
        this.A0T = mediaFrameLayout2;
        this.A0N = igProgressImageView2;
        this.A0R = likeActionView2;
        this.A0S = mediaActionsView2;
        this.A06 = view2;
        this.A0O = r33;
        this.A0P = r38;
        this.A01 = r14;
        C256003v4 r1 = r17;
        this.A0A = r1;
        this.A03 = r28;
        this.A02 = r24;
        this.A0M = r31;
        this.A0L = r30;
        this.A0U = r26;
        this.A0G = r22;
        this.A0F = r21;
        this.A07 = r13;
        this.A0J = r27;
        this.A0H = r23;
        this.A0K = r29;
        this.A0D = r19;
        this.A0E = r20;
        this.A0I = r25;
        this.A0C = r18;
        this.A09 = igView;
        this.A0B = new C256063vA(r1);
        AnonymousClass3V9 r7 = r37;
        AnonymousClass3V9 r6 = r36;
        AnonymousClass3V9 r5 = r35;
        AnonymousClass3VC r4 = r34;
        this.A0Q = new AnonymousClass3VF(r4, r5, r6, r7, r39, r40);
        if (igFrameLayout != null) {
            Context context = igFrameLayout.getContext();
            0qQ.A07(context);
            if (C255983v2.A00(context)) {
                igFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "media_view");
                return;
            }
        }
        mediaFrameLayout2.setTag(R.id.feed_cta_extra_tappable_target, "media_view");
    }

    public final void DQp(AnonymousClass3W1 r2, int i) {
        0qQ.A0B(r2, 0);
        AnonymousClass3Ux r0 = this.A0K;
        if (r0 != null) {
            r0.DQp(r2, i);
        }
        C258243yh r02 = this.A0O;
        if (r02 != null) {
            r02.DQp(r2, i);
        }
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r2, 1);
        this.A0N.A09(r2, imageUrl, z);
    }

    public final AnonymousClass3TS Adf() {
        return this.A01;
    }

    public final C256043v8 B5X() {
        return this.A0U;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A0S;
    }

    public final View BG1() {
        return this.A0N;
    }

    public final View BQB() {
        return this.A0T;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A04;
    }

    public final C247233fz BQv() {
        return this.A0B;
    }

    public final C258253yi BRL() {
        return this.A03;
    }

    public final C242423Ua C5r() {
        return this.A0T;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A0S.getWidth();
    }

    public final void EEI(int i) {
        this.A0N.A06(i);
    }
}
