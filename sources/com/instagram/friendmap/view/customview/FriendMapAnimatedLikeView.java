package com.instagram.friendmap.view.customview;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0nB;
import X.C306386Ly;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class FriendMapAnimatedLikeView extends IgFrameLayout {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public IgSimpleImageView A02;
    public ValueAnimator A03;
    public final int A04;
    public final int A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FriendMapAnimatedLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A06 = context2.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        this.A05 = context2.getResources().getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A04 = AnonymousClass0nB.A01(context2);
        A00(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        r0 = java.lang.Float.valueOf(r14.y);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.graphics.PointF r13, android.graphics.PointF r14, X.C62320sa r15) {
        /*
            r12 = this;
            r8 = 0
            r4 = 2
            com.instagram.common.ui.base.IgSimpleImageView r0 = r12.A02
            r7 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "likeImageView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0011:
            r0.clearAnimation()
            android.animation.ValueAnimator r0 = r12.A03
            if (r0 == 0) goto L_0x001b
            r0.cancel()
        L_0x001b:
            android.animation.AnimatorSet r0 = r12.A00
            if (r0 == 0) goto L_0x0022
            r0.cancel()
        L_0x0022:
            android.animation.ValueAnimator r0 = r12.A01
            if (r0 == 0) goto L_0x0029
            r0.cancel()
        L_0x0029:
            r12.setVisibility(r8)
            A01(r13, r12)
            r6 = 3
            float[] r2 = new float[r6]
            r2 = {1045220557, 1058642330, 0} // fill-array
            r0 = 19
            X.J6i r1 = new X.J6i
            r1.<init>(r12, r0)
            float[] r0 = java.util.Arrays.copyOf(r2, r6)
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r3 = 20
            X.I84.A01(r2, r1, r3)
            X.61i r0 = new X.61i
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            X.C56678I7i.A00(r2, r12, r6)
            r12.A01 = r2
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r2 = 4
            float r9 = r13.x
            if (r14 == 0) goto L_0x0181
            float r0 = r14.x
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x006b:
            r11 = 1
            float[] r1 = new float[r4]
            r1[r8] = r9
            if (r0 == 0) goto L_0x0169
            float r0 = r0.floatValue()
            r1[r11] = r0
        L_0x0078:
            float[] r9 = java.util.Arrays.copyOf(r1, r4)
            X.J6i r1 = new X.J6i
            r1.<init>(r12, r3)
            int r0 = r9.length
            float[] r0 = java.util.Arrays.copyOf(r9, r0)
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r0)
            X.I84.A01(r9, r1, r3)
            float r10 = r13.y
            if (r14 == 0) goto L_0x0156
            float r0 = r14.y
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L_0x0156
            float[] r1 = new float[r4]
            r1[r8] = r10
            float r0 = r0.floatValue()
            r1[r11] = r0
        L_0x00a3:
            int r0 = r1.length
            float[] r6 = java.util.Arrays.copyOf(r1, r0)
            r0 = 21
            X.J6i r1 = new X.J6i
            r1.<init>(r12, r0)
            int r0 = r6.length
            float[] r0 = java.util.Arrays.copyOf(r6, r0)
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r0)
            X.I84.A01(r10, r1, r3)
            float[] r6 = new float[r4]
            r6 = {0, -1011613696} // fill-array
            r0 = 22
            X.J6i r1 = new X.J6i
            r1.<init>(r12, r0)
            float[] r0 = java.util.Arrays.copyOf(r6, r4)
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r0)
            X.I84.A01(r6, r1, r3)
            if (r14 == 0) goto L_0x00d5
            r6 = r7
        L_0x00d5:
            float[] r11 = new float[r4]
            r11 = {1061997773, 1045220557} // fill-array
            r0 = 23
            X.J6i r1 = new X.J6i
            r1.<init>(r12, r0)
            float[] r0 = java.util.Arrays.copyOf(r11, r4)
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            X.I84.A01(r0, r1, r3)
            if (r14 == 0) goto L_0x00ef
            r7 = r0
        L_0x00ef:
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[]{r9, r10, r6, r7}
            java.util.List r1 = X.C51967G9n.A0s(r0)
            android.animation.ValueAnimator[] r0 = new android.animation.ValueAnimator[r8]
            java.lang.Object[] r1 = r1.toArray(r0)
            android.animation.ValueAnimator[] r1 = (android.animation.ValueAnimator[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            r5.playTogether(r0)
            X.6Y3 r0 = new X.6Y3
            r0.<init>()
            r5.setInterpolator(r0)
            r6 = 400(0x190, double:1.976E-321)
            if (r14 == 0) goto L_0x0153
            r0 = 1
        L_0x0117:
            long r0 = r0 * r6
            r5.setDuration(r0)
            r0 = 150(0x96, double:7.4E-322)
            r5.setStartDelay(r0)
            X.I7b r0 = new X.I7b
            r0.<init>(r4, r15, r12)
            r5.addListener(r0)
            r12.A00 = r5
            float[] r4 = new float[r2]
            r4 = {0, 1058642330, 1073741824, 1061997773} // fill-array
            r0 = 24
            X.J6i r1 = new X.J6i
            r1.<init>(r12, r0)
            float[] r0 = java.util.Arrays.copyOf(r4, r2)
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r0)
            X.I84.A01(r4, r1, r3)
            r0 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r0 = r4.setDuration(r0)
            X.C51969G9p.A10(r0)
            X.C56678I7i.A00(r0, r12, r2)
            r0.start()
            r12.A03 = r0
            return
        L_0x0153:
            r0 = 2
            goto L_0x0117
        L_0x0156:
            float[] r1 = new float[r6]
            r1[r8] = r10
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r0 = r0 * r10
            r1[r11] = r0
            r0 = 1067030938(0x3f99999a, float:1.2)
            float r10 = r10 * r0
            float r0 = -r10
            r1[r4] = r0
            goto L_0x00a3
        L_0x0169:
            int r10 = r12.A04
            int r0 = r10 / 2
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x017a
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r0
            float r9 = -r9
        L_0x0176:
            r1[r11] = r9
            goto L_0x0078
        L_0x017a:
            float r0 = (float) r10
            float r0 = X.C51967G9n.A00(r0, r9)
            float r9 = r9 + r0
            goto L_0x0176
        L_0x0181:
            r0 = r7
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView.A03(android.graphics.PointF, android.graphics.PointF, X.0sa):void");
    }

    private final void A00(Context context) {
        IgSimpleImageView igSimpleImageView = new IgSimpleImageView(context);
        this.A02 = igSimpleImageView;
        int i = this.A06;
        igSimpleImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        IgSimpleImageView igSimpleImageView2 = this.A02;
        if (igSimpleImageView2 != null) {
            C306386Ly r1 = new C306386Ly(context, i);
            r1.A0A((float) this.A05);
            r1.A0M("❤️");
            igSimpleImageView2.setImageDrawable(r1);
            setVisibility(8);
            IgSimpleImageView igSimpleImageView3 = this.A02;
            if (igSimpleImageView3 != null) {
                addView(igSimpleImageView3);
                return;
            }
        }
        0qQ.A0F("likeImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(PointF pointF, FriendMapAnimatedLikeView friendMapAnimatedLikeView) {
        float f;
        float f2;
        IgSimpleImageView igSimpleImageView = friendMapAnimatedLikeView.A02;
        if (igSimpleImageView == null) {
            0qQ.A0F("likeImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        igSimpleImageView.setTranslationX(0.0f);
        igSimpleImageView.setTranslationY(0.0f);
        if (pointF != null) {
            f = pointF.x;
        } else {
            f = 0.0f;
        }
        float f3 = ((float) friendMapAnimatedLikeView.A06) / 2.0f;
        igSimpleImageView.setX(f - f3);
        if (pointF != null) {
            f2 = pointF.y;
        } else {
            f2 = 0.0f;
        }
        igSimpleImageView.setY(f2 - f3);
        igSimpleImageView.setScaleX(0.0f);
        igSimpleImageView.setScaleY(0.0f);
        igSimpleImageView.setRotation(0.0f);
    }

    /* access modifiers changed from: private */
    public final void setScale(float f) {
        IgSimpleImageView igSimpleImageView = this.A02;
        if (igSimpleImageView != null) {
            igSimpleImageView.setScaleX(f);
            IgSimpleImageView igSimpleImageView2 = this.A02;
            if (igSimpleImageView2 != null) {
                igSimpleImageView2.setScaleY(f);
                return;
            }
        }
        0qQ.A0F("likeImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FriendMapAnimatedLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A06 = context2.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        this.A05 = context2.getResources().getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A04 = AnonymousClass0nB.A01(context2);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FriendMapAnimatedLikeView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A06 = context2.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        this.A05 = context2.getResources().getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A04 = AnonymousClass0nB.A01(context2);
    }
}
