package X;

import android.view.View;

/* renamed from: X.LYm  reason: case insensitive filesystem */
public final class C64286LYm implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C64286LYm(View view, int i) {
        this.A00 = i;
        if (6 - i != 0) {
            this.A01 = view;
        } else {
            this.A01 = view;
        }
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new C64286LYm(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0254, code lost:
        if (r2.A00 <= 0.0f) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0260, code lost:
        if (r2.A00 >= 0.0f) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0266, code lost:
        if (r0 != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0293, code lost:
        if (r2.A0Y == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a3, code lost:
        if (r2.A0Y == false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ad, code lost:
        if (r2.A0Y == false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02bb, code lost:
        if (r0 == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x038d, code lost:
        if (r2.A0C == false) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x039d, code lost:
        if (r2.A0C == false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03a7, code lost:
        if (r0 == false) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03aa, code lost:
        if (r4 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03ac, code lost:
        if (r3 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03ae, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03b6, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04fc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        return r0.onTouchEvent(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x03b2;
                case 1: goto L_0x05c3;
                case 2: goto L_0x059a;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x02c2;
                case 6: goto L_0x0594;
                case 7: goto L_0x0585;
                case 8: goto L_0x01d1;
                case 9: goto L_0x056e;
                case 10: goto L_0x01c9;
                case 11: goto L_0x015a;
                case 12: goto L_0x0540;
                case 13: goto L_0x04da;
                case 14: goto L_0x0146;
                case 15: goto L_0x04c9;
                case 16: goto L_0x012c;
                case 17: goto L_0x04ae;
                case 18: goto L_0x0594;
                case 19: goto L_0x016e;
                case 20: goto L_0x045c;
                case 21: goto L_0x0059;
                case 22: goto L_0x000e;
                case 23: goto L_0x0449;
                case 24: goto L_0x0401;
                case 25: goto L_0x03e8;
                case 26: goto L_0x0005;
                case 27: goto L_0x03ce;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
        L_0x0009:
            boolean r1 = r0.onTouchEvent(r10)
        L_0x000d:
            return r1
        L_0x000e:
            java.lang.Object r4 = r8.A01
            X.K5a r4 = (X.C61382K5a) r4
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = r4.A02
            if (r0 != 0) goto L_0x0019
            java.lang.String r7 = "touchImageView"
            goto L_0x0077
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            r3 = 1
            r0.requestDisallowInterceptTouchEvent(r3)
            int r0 = r10.getAction()
            java.lang.String r7 = "punchedOverlayView"
            r1 = 300(0x12c, double:1.48E-321)
            if (r0 != 0) goto L_0x0041
            r4.A03 = r3
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r0 = r4.A01
            if (r0 == 0) goto L_0x0077
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
        L_0x0038:
            android.view.ViewPropertyAnimator r0 = r3.alpha(r0)
            r0.setDuration(r1)
            goto L_0x05d8
        L_0x0041:
            int r0 = r10.getAction()
            if (r0 == r3) goto L_0x004e
            int r3 = r10.getAction()
            r0 = 3
            if (r3 != r0) goto L_0x05d8
        L_0x004e:
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r0 = r4.A01
            if (r0 == 0) goto L_0x0077
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0038
        L_0x0059:
            int r4 = r10.getAction()
            java.lang.String r6 = "gridLinesView"
            java.lang.String r5 = "explainerTextView"
            java.lang.String r3 = "punchedOverlayView"
            r1 = 300(0x12c, double:1.48E-321)
            r0 = 1
            if (r4 == 0) goto L_0x00f6
            if (r4 == r0) goto L_0x00c5
            r0 = 2
            if (r4 != r0) goto L_0x03b0
            java.lang.Object r1 = r8.A01
            X.K6t r1 = (X.C61422K6t) r1
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r4 = r1.A08
            if (r4 != 0) goto L_0x007c
            java.lang.String r7 = "videoPreviewView"
        L_0x0077:
            X.0qQ.A0F(r7)
            goto L_0x04f8
        L_0x007c:
            float r6 = r10.getY()
            float r0 = r1.A00
            float r6 = r6 - r0
            int r0 = r4.getTop()
            float r5 = (float) r0
            float r0 = r4.getTranslationY()
            float r5 = r5 + r0
            float r5 = r5 + r6
            int r0 = r4.getBottom()
            float r3 = (float) r0
            float r0 = r4.getTranslationY()
            float r3 = r3 + r0
            float r3 = r3 + r6
            android.graphics.RectF r2 = r1.A02
            java.lang.String r7 = "punchHoleRectF"
            if (r2 == 0) goto L_0x0077
            float r1 = r2.top
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b5
            float r0 = r2.bottom
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
        L_0x00ab:
            float r0 = r4.getTranslationY()
            float r0 = r0 + r6
            r4.setTranslationY(r0)
            goto L_0x03b0
        L_0x00b5:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            float r5 = r5 - r1
            float r6 = r6 - r5
            goto L_0x00ab
        L_0x00bc:
            float r1 = r2.bottom
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b0
            float r1 = r1 - r3
            float r6 = r6 + r1
            goto L_0x00ab
        L_0x00c5:
            java.lang.Object r4 = r8.A01
            X.K6t r4 = (X.C61422K6t) r4
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r0 = r4.A07
            if (r0 == 0) goto L_0x03c4
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            r0.setDuration(r1)
            com.instagram.common.ui.base.IgTextView r0 = r4.A06
            if (r0 == 0) goto L_0x03bf
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            r0.setDuration(r1)
            com.instagram.creation.base.ui.grid.GridLinesView r0 = r4.A09
            if (r0 == 0) goto L_0x03ba
            android.view.ViewPropertyAnimator r0 = X.C51972G9s.A0I(r0)
            r0.setDuration(r1)
            goto L_0x03b0
        L_0x00f6:
            java.lang.Object r4 = r8.A01
            X.K6t r4 = (X.C61422K6t) r4
            r4.A0A = r0
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r0 = r4.A07
            if (r0 == 0) goto L_0x03c4
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            android.view.ViewPropertyAnimator r0 = r3.alpha(r0)
            r0.setDuration(r1)
            com.instagram.common.ui.base.IgTextView r0 = r4.A06
            if (r0 == 0) goto L_0x03bf
            android.view.ViewPropertyAnimator r0 = X.C51972G9s.A0I(r0)
            r0.setDuration(r1)
            com.instagram.creation.base.ui.grid.GridLinesView r0 = r4.A09
            if (r0 == 0) goto L_0x03ba
            android.view.ViewPropertyAnimator r0 = X.DbY.A0G(r0)
            r0.setDuration(r1)
            float r0 = r10.getY()
            r4.A00 = r0
            goto L_0x03b0
        L_0x012c:
            java.lang.Object r2 = r8.A01
            X.K66 r2 = (X.K66) r2
            X.LBG r0 = r2.A06
            java.lang.String r1 = "viewHolder"
            if (r0 == 0) goto L_0x03c9
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            r0.clearFocus()
            X.LBG r0 = r2.A06
            if (r0 == 0) goto L_0x03c9
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            X.0nA.A0N(r0)
            goto L_0x03b0
        L_0x0146:
            java.lang.Object r1 = r8.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            android.view.View r0 = r1.mView
            X.0nA.A0N(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = X.LQa.A01(r1)
            r0.clearFocus()
            goto L_0x03b0
        L_0x015a:
            java.lang.Object r1 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x03b0
            X.030 r0 = r1.A08
            android.view.GestureDetector r0 = r0.A00
            boolean r0 = r0.onTouchEvent(r10)
            if (r0 == 0) goto L_0x05d8
            goto L_0x03b0
        L_0x016e:
            java.lang.Object r0 = r8.A01
            X.7Kj r0 = (X.C329827Kj) r0
            android.view.ViewGroup r4 = r0.A01
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x000d
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x000d
            r0 = 2
            int[] r3 = new int[r0]
            r4.getLocationInWindow(r3)
            int[] r2 = new int[r0]
            r9.getLocationInWindow(r2)
            r5 = r3[r1]
            r0 = r2[r1]
            int r5 = r5 - r0
            r0 = 1
            r3 = r3[r0]
            r0 = r2[r0]
            int r3 = r3 - r0
            float r2 = r10.getX()
            float r0 = (float) r5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            float r2 = r10.getX()
            int r0 = r4.getWidth()
            int r5 = r5 + r0
            float r0 = (float) r5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x000d
            float r2 = r10.getY()
            float r0 = (float) r3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            float r2 = r10.getY()
            int r0 = r4.getHeight()
            int r3 = r3 + r0
            float r0 = (float) r3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x000d
            goto L_0x03b0
        L_0x01c9:
            java.lang.Object r0 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController) r0
            X.030 r0 = r0.A08
            goto L_0x03b6
        L_0x01d1:
            r4 = 1
            X.0qQ.A0B(r10, r4)
            java.lang.Object r2 = r8.A01
            X.JY9 r2 = (X.JY9) r2
            X.Lbq r0 = r2.A0A
            r3 = 1
            if (r0 == 0) goto L_0x01e4
            X.MXG r1 = r0.A00
            X.MXG r0 = r0.A02
            if (r1 != r0) goto L_0x01f6
        L_0x01e4:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            if (r0 == 0) goto L_0x01f6
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01f6
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            if (r0 == 0) goto L_0x020a
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L_0x020a
        L_0x01f6:
            r1 = 0
            if (r3 == 0) goto L_0x000d
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x020c
            float r0 = r10.getY()
            boolean r0 = X.JY9.A0E(r2, r0)
            if (r0 == 0) goto L_0x020c
            return r1
        L_0x020a:
            r3 = 0
            goto L_0x01f6
        L_0x020c:
            boolean r0 = r2.A0k
            if (r0 != 0) goto L_0x03b0
            int r0 = r10.getActionMasked()
            r6 = 0
            if (r0 != 0) goto L_0x0239
            r2.A0Z = r1
            X.Lbq r0 = r2.A0A
            r3 = 1
            if (r0 == 0) goto L_0x0272
            X.MXG r0 = r0.A00
            boolean r0 = r0.isScrolledToTop()
            if (r0 != r4) goto L_0x0272
        L_0x0226:
            r2.A0q = r3
            X.Lbq r0 = r2.A0A
            r3 = 1
            if (r0 == 0) goto L_0x0270
            X.MXG r0 = r0.A00
            boolean r0 = r0.isScrolledToBottom()
            if (r0 != r4) goto L_0x0270
        L_0x0235:
            r2.A0p = r3
            r2.A00 = r6
        L_0x0239:
            boolean r0 = r2.A0Z
            if (r0 != 0) goto L_0x024b
            float r0 = r10.getY()
            boolean r0 = X.JY9.A0E(r2, r0)
            if (r0 == 0) goto L_0x024b
            r2.A0Z = r4
            r2.A0a = r4
        L_0x024b:
            boolean r7 = r2.A0q
            if (r7 == 0) goto L_0x0256
            float r0 = r2.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r5 = 1
            if (r0 > 0) goto L_0x0257
        L_0x0256:
            r5 = 0
        L_0x0257:
            boolean r4 = r2.A0p
            if (r4 == 0) goto L_0x0262
            float r0 = r2.A00
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r0 = 1
            if (r3 < 0) goto L_0x0263
        L_0x0262:
            r0 = 0
        L_0x0263:
            if (r5 != 0) goto L_0x0268
            r3 = 0
            if (r0 == 0) goto L_0x0269
        L_0x0268:
            r3 = 1
        L_0x0269:
            boolean r0 = r2.A0Z
            if (r0 != 0) goto L_0x0274
            if (r3 == 0) goto L_0x0274
            return r1
        L_0x0270:
            r3 = 0
            goto L_0x0235
        L_0x0272:
            r3 = 0
            goto L_0x0226
        L_0x0274:
            if (r7 != 0) goto L_0x027e
            if (r4 != 0) goto L_0x027e
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0286
        L_0x027e:
            android.view.GestureDetector r0 = r2.A12
            r0.onTouchEvent(r10)
            X.JY9.A05(r10, r2)
        L_0x0286:
            boolean r0 = r2.A0q
            if (r0 == 0) goto L_0x0295
            float r0 = r2.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0295
            boolean r0 = r2.A0Y
            r5 = 1
            if (r0 != 0) goto L_0x0296
        L_0x0295:
            r5 = 0
        L_0x0296:
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x02a5
            float r0 = r2.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a5
            boolean r0 = r2.A0Y
            r4 = 1
            if (r0 != 0) goto L_0x02a6
        L_0x02a5:
            r4 = 0
        L_0x02a6:
            boolean r0 = r2.A0Z
            if (r0 == 0) goto L_0x02af
            boolean r0 = r2.A0Y
            r3 = 1
            if (r0 != 0) goto L_0x02b0
        L_0x02af:
            r3 = 0
        L_0x02b0:
            float r0 = r2.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02bd
            boolean r0 = r2.A0Q()
            r2 = 1
            if (r0 != 0) goto L_0x02be
        L_0x02bd:
            r2 = 0
        L_0x02be:
            if (r5 != 0) goto L_0x03b0
            goto L_0x03aa
        L_0x02c2:
            java.lang.Object r2 = r8.A01
            X.LYn r2 = (X.C64287LYn) r2
            boolean r0 = X.C64287LYn.A02(r2)
            r1 = 0
            if (r0 == 0) goto L_0x000d
            int r0 = r10.getActionMasked()
            r3 = 0
            if (r0 != 0) goto L_0x02ea
            r2.A0D = r1
            boolean r0 = X.C64287LYn.A02(r2)
            if (r0 != 0) goto L_0x0354
            r0 = 1
        L_0x02dd:
            r2.A0G = r0
            boolean r0 = X.C64287LYn.A02(r2)
            if (r0 != 0) goto L_0x0337
            r0 = 1
        L_0x02e6:
            r2.A0F = r0
            r2.A00 = r3
        L_0x02ea:
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0319
            android.view.View r0 = r2.A02
            float r4 = r0.getY()
            android.view.View r0 = r2.A01
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r4 = r4 + r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x030c
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r4 = r4 + r0
        L_0x030c:
            float r0 = r10.getY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0319
            r0 = 1
            r2.A0D = r0
            r2.A0E = r0
        L_0x0319:
            boolean r5 = r2.A0G
            if (r5 == 0) goto L_0x0323
            float r0 = r2.A00
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x032d
        L_0x0323:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0335
            float r0 = r2.A00
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0335
        L_0x032d:
            r4 = 1
        L_0x032e:
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0372
            if (r4 == 0) goto L_0x0372
            return r1
        L_0x0335:
            r4 = 0
            goto L_0x032e
        L_0x0337:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0351
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            android.view.View r0 = r0.A0F
        L_0x0343:
            r0.getClass()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.3Ar r0 = X.C238103Ao.A00(r0)
            boolean r0 = r0.COv()
            goto L_0x02e6
        L_0x0351:
            android.widget.ListView r0 = r2.A04
            goto L_0x0343
        L_0x0354:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x036f
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A08
            android.view.View r0 = r0.A0F
        L_0x0360:
            r0.getClass()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.3Ar r0 = X.C238103Ao.A00(r0)
            boolean r0 = r0.COw()
            goto L_0x02dd
        L_0x036f:
            android.widget.ListView r0 = r2.A04
            goto L_0x0360
        L_0x0372:
            if (r5 != 0) goto L_0x0378
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0380
        L_0x0378:
            android.view.GestureDetector r0 = r2.A0M
            r0.onTouchEvent(r10)
            X.C64287LYn.A00(r10, r2)
        L_0x0380:
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x038f
            float r0 = r2.A00
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x038f
            boolean r0 = r2.A0C
            r4 = 1
            if (r0 != 0) goto L_0x0390
        L_0x038f:
            r4 = 0
        L_0x0390:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x039f
            float r0 = r2.A00
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x039f
            boolean r0 = r2.A0C
            r3 = 1
            if (r0 != 0) goto L_0x03a0
        L_0x039f:
            r3 = 0
        L_0x03a0:
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x03a9
            boolean r0 = r2.A0C
            r2 = 1
            if (r0 != 0) goto L_0x03aa
        L_0x03a9:
            r2 = 0
        L_0x03aa:
            if (r4 != 0) goto L_0x03b0
            if (r3 != 0) goto L_0x03b0
            if (r2 == 0) goto L_0x000d
        L_0x03b0:
            r1 = 1
            return r1
        L_0x03b2:
            java.lang.Object r0 = r8.A01
            X.030 r0 = (X.AnonymousClass030) r0
        L_0x03b6:
            android.view.GestureDetector r0 = r0.A00
            goto L_0x0009
        L_0x03ba:
            X.0qQ.A0F(r6)
            goto L_0x04f8
        L_0x03bf:
            X.0qQ.A0F(r5)
            goto L_0x04f8
        L_0x03c4:
            X.0qQ.A0F(r3)
            goto L_0x04f8
        L_0x03c9:
            X.0qQ.A0F(r1)
            goto L_0x04f8
        L_0x03ce:
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x05d8
            java.lang.Object r0 = r8.A01
            X.L9S r0 = (X.L9S) r0
            X.L3T r0 = r0.A02
            X.JTQ.A1K(r9)
            X.7bg r0 = r0.A01
            X.6zK r0 = r0.A00
            if (r0 == 0) goto L_0x05d8
            r0.A03(r9)
            goto L_0x05d8
        L_0x03e8:
            r1 = 1
            X.0qQ.A0B(r10, r1)
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x05d8
            java.lang.Object r0 = r8.A01
            X.6iR r0 = (X.C314546iR) r0
            X.0eM r0 = r0.A0H
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            X.JTP.A15(r0, r1)
            goto L_0x05d8
        L_0x0401:
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 != 0) goto L_0x043b
            java.lang.Object r0 = r8.A01
            X.LuT r0 = (X.C65505LuT) r0
            android.widget.SeekBar r4 = r0.A07
            float r3 = r10.getX()
            float r2 = r10.getY()
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x05d8
            int r0 = r4.getRight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x05d8
            int r0 = r4.getTop()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x05d8
            int r0 = r4.getBottom()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x05d8
            return r1
        L_0x043b:
            int r0 = r10.getActionMasked()
            if (r0 != r1) goto L_0x05d8
            java.lang.Object r0 = r8.A01
            X.LuT r0 = (X.C65505LuT) r0
            X.C65505LuT.A00(r0)
            return r1
        L_0x0449:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x05d8
            java.lang.Object r1 = r8.A01
            X.JoW r1 = (X.C60623JoW) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.8Qm r0 = r1.A01
            r0.A07(r1)
            goto L_0x05d8
        L_0x045c:
            java.lang.Object r7 = r8.A01
            X.K6J r7 = (X.K6J) r7
            android.view.ViewGroup r0 = r7.A05
            if (r0 == 0) goto L_0x046e
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x046e
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x046e:
            r6 = 1
            r7.A0G = r6
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x05d8
            X.0eM r0 = r7.A0R
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r7.requireContext()
            X.LRh r5 = new X.LRh
            r5.<init>(r1, r0)
            java.lang.String r4 = r7.A0E
            com.instagram.common.session.UserSession r0 = r5.A07
            X.0iw r3 = r5.A05
            X.0Aj r2 = X.C51975G9x.A0S(r3, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x04aa
            X.HOu r1 = X.C54689HOu.OPEN_CAROUSEL_SUBMIT_CROP
            java.lang.String r0 = "action_source"
            r2.A8M(r1, r0)
            X.DbW.A16(r2, r3)
            java.lang.String r0 = r5.A08
            X.C51965G9l.A1K(r2, r0)
            java.lang.Long r0 = X.LRh.A00(r4)
            X.JTQ.A13(r2, r0)
        L_0x04aa:
            r7.A0H = r6
            goto L_0x05d8
        L_0x04ae:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x05d8
            java.lang.Object r0 = r8.A01
            X.K66 r0 = (X.K66) r0
            X.27r r2 = X.JTP.A0X(r0)
            X.80P r1 = X.AnonymousClass80P.WRITE_CAPTION
            X.Kka r0 = X.C62674Kka.A0P
            r2.A1B(r0, r1)
            goto L_0x05d8
        L_0x04c9:
            X.6SR r1 = X.AnonymousClass6SR.A01()
            r0 = 1
            r1.A0H = r0
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setOnTouchListener(r0)
            goto L_0x05d8
        L_0x04da:
            int r1 = r10.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x05d8
            java.lang.Object r2 = r8.A01
            com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment r2 = (com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment) r2
            X.JVj r0 = r2.A00
            if (r0 == 0) goto L_0x05d8
            X.0eM r0 = r2.A09
            X.27r r1 = X.C51971G9r.A0g(r0)
            X.Jj5 r0 = r2.A03
            if (r0 != 0) goto L_0x04fd
            java.lang.String r0 = "giphyBrowserViewModel"
            X.0qQ.A0F(r0)
        L_0x04f8:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04fd:
            X.0Ud r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.String r4 = r0.A01
            X.JVj r3 = r2.A00
            if (r3 == 0) goto L_0x053b
            X.29R r1 = r1.A09
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x05d8
            X.JTO.A1V(r2)
            java.lang.String r0 = "THIRD_PARTY_CLIP_HUB_SEARCH_BAR_TAP"
            X.283 r1 = X.JTT.A0N(r2, r1, r0)
            r2.A0d(r3)
            X.JTU.A15(r2, r1)
            java.lang.String r0 = "gif_category"
            r2.A0R(r0, r4)
            java.lang.String r1 = r1.A0M
            java.lang.String r0 = "composition_str_id"
            r2.A0R(r0, r1)
            X.JTS.A1E(r2)
            goto L_0x05d8
        L_0x053b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0540:
            int r0 = r10.getAction()
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x055f
            java.lang.Object r3 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView) r3
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x055d
            int r0 = r3.getScrollX()
            r3.A00 = r0
            java.lang.Runnable r2 = r3.A02
            long r0 = r3.A06
            r3.postDelayed(r2, r0)
        L_0x055d:
            r3.A04 = r4
        L_0x055f:
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x05d8
            java.lang.Object r0 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView) r0
            r0.A04 = r5
            r0.A03 = r4
            goto L_0x05d8
        L_0x056e:
            java.lang.Object r1 = r8.A01
            X.Jpu r1 = (X.C60709Jpu) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.JdE r1 = r1.A05
            X.5nl r0 = r1.A03
            if (r0 != 0) goto L_0x0581
            X.5nl r0 = new X.5nl
            r0.<init>((android.graphics.drawable.Drawable) r1)
            r1.A03 = r0
        L_0x0581:
            r0.A02(r10)
            goto L_0x05d8
        L_0x0585:
            java.lang.Object r0 = r8.A01
            X.3NM r0 = (X.AnonymousClass3NM) r0
            X.0qQ.A0A(r9)
            X.0qQ.A0A(r10)
            boolean r1 = r0.onTouch(r9, r10)
            return r1
        L_0x0594:
            java.lang.Object r0 = r8.A01
            X.C51969G9p.A1M(r0)
            goto L_0x05d8
        L_0x059a:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            int r0 = r10.getAction()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x05a9
            r2 = 1064849900(0x3f7851ec, float:0.97)
        L_0x05a9:
            java.lang.Object r1 = r8.A01
            X.Jpa r1 = (X.C60689Jpa) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A06
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r2)
            android.view.ViewPropertyAnimator r2 = r0.scaleY(r2)
            r0 = 50
            r2.setDuration(r0)
            goto L_0x05d8
        L_0x05c3:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.37E r1 = X.AnonymousClass37D.A00
            android.content.Context r0 = r0.requireContext()
            X.37D r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x05d8
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r1.A0T(r0)
        L_0x05d8:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64286LYm.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C64286LYm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
