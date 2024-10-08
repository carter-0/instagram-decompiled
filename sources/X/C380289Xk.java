package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9Xk  reason: invalid class name and case insensitive filesystem */
public final class C380289Xk extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C3510387i A01;
    public final /* synthetic */ C3511387s A02;

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        Integer num2 = null;
        if (motionEvent != null) {
            num = Integer.valueOf((int) motionEvent.getX());
            num2 = Integer.valueOf((int) motionEvent.getY());
        } else {
            num = null;
        }
        int[] iArr = {-1, -1};
        RecyclerView recyclerView = this.A01.A0J;
        recyclerView.getLocationOnScreen(iArr);
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight();
        if (!(num == null || num2 == null)) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int i = iArr[0];
            int i2 = iArr[1];
            if (i != -1 && i2 != -1 && intValue >= i && intValue <= i + width && intValue2 >= i2 && intValue2 <= i2 + height) {
                recyclerView.scrollBy((int) f, 0);
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0066, code lost:
        if (r13 > (r2 + r6)) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r5 = 0
            r1 = r22
            X.0qQ.A0B(r1, r5)
            float r0 = r1.getX()
            int r14 = (int) r0
            float r0 = r1.getY()
            int r13 = (int) r0
            r10 = 2
            int[] r9 = new int[r10]
            r9 = {-1, -1} // fill-array
            r3 = r21
            X.87i r12 = r3.A01
            com.instagram.common.ui.base.IgTextView r0 = r12.A0M
            r0.getLocationOnScreen(r9)
            int r20 = r0.getWidth()
            int r19 = r0.getHeight()
            int[] r8 = new int[r10]
            r8 = {-1, -1} // fill-array
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A0N
            r0.getLocationOnScreen(r8)
            int r18 = r0.getWidth()
            int r17 = r0.getHeight()
            com.instagram.common.ui.base.IgTextView r2 = r12.A0L
            int r1 = r2.getVisibility()
            r0 = 1
            if (r1 != 0) goto L_0x02cd
            r16 = 1
            int[] r1 = new int[r10]
            r1 = {-1, -1} // fill-array
            r2.getLocationOnScreen(r1)
            int r7 = r2.getWidth()
            int r6 = r2.getHeight()
            r4 = r1[r5]
            r2 = r1[r0]
            r1 = -1
            if (r4 == r1) goto L_0x0068
            if (r2 == r1) goto L_0x0068
            if (r14 < r4) goto L_0x0068
            int r4 = r4 + r7
            if (r14 > r4) goto L_0x0068
            if (r13 < r2) goto L_0x0068
            int r2 = r2 + r6
            r15 = 1
            if (r13 <= r2) goto L_0x0069
        L_0x0068:
            r15 = 0
        L_0x0069:
            int[] r6 = new int[r10]
            r6 = {-1, -1} // fill-array
            androidx.recyclerview.widget.RecyclerView r11 = r12.A0J
            r11.getLocationOnScreen(r6)
            int r7 = r11.getWidth()
            int r4 = r11.getHeight()
            r2 = r9[r5]
            r1 = r9[r0]
            r9 = -1
            if (r2 == r9) goto L_0x00e7
            if (r1 == r9) goto L_0x00e7
            if (r14 < r2) goto L_0x00e7
            int r2 = r2 + r20
            if (r14 > r2) goto L_0x00e7
            if (r13 < r1) goto L_0x00e7
            int r1 = r1 + r19
            if (r13 > r1) goto L_0x00e7
        L_0x0090:
            X.87s r2 = r3.A02
            com.instagram.common.session.UserSession r11 = r12.A0K
            X.4DH r1 = r3.A00
            androidx.fragment.app.FragmentActivity r9 = r1.requireActivity()
            android.content.Context r3 = r12.A0F
            java.lang.String r6 = r12.A0D
            java.lang.String r5 = "VideoStickerController"
            X.AnonymousClass7TF.A1D(r3, r10, r6)
            X.27r r7 = X.27p.A01(r11)
            X.4gw r1 = r2.A04
            if (r1 == 0) goto L_0x02d1
            X.4yi r1 = r1.Ad4()
            if (r1 == 0) goto L_0x02d1
            java.lang.String r4 = r1.getTemplateMediaId()
            if (r4 == 0) goto L_0x02d1
            X.293 r2 = r2.A03
            if (r2 != 0) goto L_0x00bd
            X.293 r2 = X.293.A06
        L_0x00bd:
            java.lang.String r1 = "TEMPLATE_LANDING_PAGE_PROFILE_PICTURE_TAP"
            r7.A1W(r2, r4, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r12 = com.instagram.modal.ModalActivity.class
            X.1a0 r1 = X.C46447Df9.A03()
            X.1a1 r2 = r1.A01
            java.lang.String r1 = "clips_template_landing_page"
            X.Dfc r1 = X.C46548Dgp.A02(r11, r6, r1, r5)
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r1.A04()
            android.os.Bundle r10 = r2.A01(r11, r1)
            java.lang.String r13 = "profile"
            X.6W8 r8 = new X.6W8
            r8.<init>(r9, r10, r11, r12, r13)
            int[] r1 = com.instagram.modal.ModalActivity.A08
            r8.A0J = r1
            r8.A0C(r3)
        L_0x00e6:
            return r0
        L_0x00e7:
            r2 = r8[r5]
            r1 = r8[r0]
            if (r2 == r9) goto L_0x00fc
            if (r1 == r9) goto L_0x00fc
            if (r14 < r2) goto L_0x00fc
            int r2 = r2 + r18
            if (r14 > r2) goto L_0x00fc
            if (r13 < r1) goto L_0x00fc
            int r1 = r1 + r17
            if (r13 > r1) goto L_0x00fc
            goto L_0x0090
        L_0x00fc:
            if (r16 == 0) goto L_0x012f
            if (r15 == 0) goto L_0x012f
            X.87s r2 = r3.A02
            X.4DH r1 = r3.A00
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            X.4gw r1 = r2.A04
            if (r1 == 0) goto L_0x00e6
            X.4yi r6 = r1.Ad4()
            if (r6 == 0) goto L_0x00e6
            com.instagram.common.session.UserSession r5 = r2.A0K
            X.27r r4 = X.27p.A01(r5)
            java.lang.String r3 = r6.getTemplateMediaId()
            X.293 r2 = r2.A03
            if (r2 != 0) goto L_0x0122
            X.293 r2 = X.293.A06
        L_0x0122:
            java.lang.String r1 = "TEMPLATE_LANDING_PAGE_TEMPLATE_ATTRIBUTION_TAPPED"
            r4.A1W(r2, r3, r1)
            java.lang.String r1 = r6.getTemplateMediaId()
            X.C52273GLp.A06(r7, r5, r1)
            return r0
        L_0x012f:
            r2 = r6[r5]
            r1 = r6[r0]
            if (r2 == r9) goto L_0x00e6
            if (r1 == r9) goto L_0x00e6
            if (r14 < r2) goto L_0x00e6
            int r2 = r2 + r7
            if (r14 > r2) goto L_0x00e6
            if (r13 < r1) goto L_0x00e6
            int r1 = r1 + r4
            if (r13 > r1) goto L_0x00e6
            X.Gi5 r1 = r12.A0B
            if (r1 == 0) goto L_0x00e6
            X.87s r2 = r3.A02
            X.4DH r4 = r3.A00
            java.util.List r1 = r1.A00
            java.util.Iterator r17 = r1.iterator()
            r3 = 0
        L_0x0150:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x00e6
            int r16 = r3 + 1
            java.lang.Object r8 = r17.next()
            X.0eP r8 = (X.0eP) r8
            X.3kE r1 = r11.A0W(r3)
            if (r1 == 0) goto L_0x022c
            android.view.View r3 = r1.itemView
        L_0x0166:
            int[] r15 = new int[r10]
            r15 = {-1, -1} // fill-array
            if (r3 == 0) goto L_0x0228
            r3.getLocationOnScreen(r15)
            int r1 = r3.getLeft()
            if (r1 < 0) goto L_0x0222
            int r7 = r3.getWidth()
        L_0x017a:
            int r6 = r3.getHeight()
            r3 = r15[r5]
            r1 = r15[r0]
            if (r3 == r9) goto L_0x0228
            if (r1 == r9) goto L_0x0228
            if (r14 < r3) goto L_0x0228
            int r3 = r3 + r7
            if (r14 > r3) goto L_0x0228
            if (r13 < r1) goto L_0x0228
            int r1 = r1 + r6
            if (r13 > r1) goto L_0x0228
            X.1Xj r11 = r12.A0C
            if (r11 == 0) goto L_0x00e6
            java.lang.Object r6 = r8.A00
            java.lang.String r6 = (java.lang.String) r6
            X.0qQ.A0B(r6, r5)
            X.0qQ.A0B(r4, r10)
            int r3 = r6.hashCode()
            r1 = -1306084975(0xffffffffb226b991, float:-9.704665E-9)
            if (r3 == r1) goto L_0x0272
            r1 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r3 == r1) goto L_0x022f
            r1 = 1362253043(0x513254f3, float:4.7870587E10)
            if (r3 != r1) goto L_0x00e6
            r1 = 1177(0x499, float:1.65E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00e6
            com.instagram.common.session.UserSession r7 = r2.A0K
            X.27r r6 = X.27p.A01(r7)
            X.4gw r3 = r2.A04
            r1 = 0
            if (r3 == 0) goto L_0x02da
            X.4yi r3 = r3.Ad4()
            if (r3 == 0) goto L_0x02da
            java.lang.String r5 = r3.getTemplateMediaId()
            if (r5 == 0) goto L_0x02da
            X.293 r4 = r2.A03
            if (r4 != 0) goto L_0x01da
            X.293 r4 = X.293.A06
        L_0x01da:
            java.lang.String r3 = "TEMPLATE_LANDING_PAGE_CLIPS_METADATA_TAPPED"
            r6.A1W(r4, r5, r3)
            r2.A0G(r0)
            X.05G r4 = r2.A0Q
            X.8YK r3 = X.AnonymousClass8YK.EMPTY_TIMELINE
            r4.Epw(r3)
            X.05G r5 = r2.A0S
            X.883 r3 = X.AnonymousClass883.PAUSED
            r5.Epw(r3)
            X.87u r3 = r2.A0I
            r3.A00()
            r2.A0E = r0
            X.1E8 r4 = X.1E7.A00(r7)
            com.instagram.clips.template.creation.model.ClipsTemplateModel r3 = r2.A05
            if (r3 == 0) goto L_0x0201
            java.lang.String r1 = r3.A03
        L_0x0201:
            X.1Xj r3 = r4.A02(r1)
            if (r3 == 0) goto L_0x021b
            X.87q r1 = r2.A0M
            r1.A03(r3)
            X.05G r2 = r2.A0R
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0212:
            r2.Epw(r1)
            X.883 r1 = X.AnonymousClass883.BUILDER_PLAYBACK
            r5.Epw(r1)
            return r0
        L_0x021b:
            com.instagram.common.gallery.Medium r1 = r2.A06
            if (r1 == 0) goto L_0x02d6
            X.05G r2 = r2.A0P
            goto L_0x0212
        L_0x0222:
            int r7 = r3.getRight()
            goto L_0x017a
        L_0x0228:
            r3 = r16
            goto L_0x0150
        L_0x022c:
            r3 = 0
            goto L_0x0166
        L_0x022f:
            java.lang.String r1 = "audio"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00e6
            androidx.fragment.app.FragmentActivity r7 = r4.requireActivity()
            com.instagram.common.session.UserSession r10 = r2.A0K
            X.27r r4 = X.27p.A01(r10)
            X.4gw r1 = r2.A04
            if (r1 == 0) goto L_0x02df
            X.4yi r1 = r1.Ad4()
            if (r1 == 0) goto L_0x02df
            java.lang.String r3 = r1.getTemplateMediaId()
            if (r3 == 0) goto L_0x02df
            X.293 r2 = r2.A03
            if (r2 != 0) goto L_0x0257
            X.293 r2 = X.293.A06
        L_0x0257:
            java.lang.String r1 = "TEMPLATE_LANDING_PAGE_AUDIO_METADATA_TAPPED"
            r4.A1W(r2, r3, r1)
            java.lang.String r12 = X.AnonymousClass7TG.A0j()
            java.lang.String r17 = X.AnonymousClass7TG.A0j()
            r9 = 0
            X.8ZN r8 = X.AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r18 = r5
            X.C52273GLp.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0272:
            java.lang.String r1 = "effect"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00e6
            com.instagram.common.session.UserSession r3 = r2.A0K
            X.27r r6 = X.27p.A01(r3)
            X.4gw r1 = r2.A04
            if (r1 == 0) goto L_0x02e4
            X.4yi r1 = r1.Ad4()
            if (r1 == 0) goto L_0x02e4
            java.lang.String r5 = r1.getTemplateMediaId()
            if (r5 == 0) goto L_0x02e4
            X.293 r2 = r2.A03
            if (r2 != 0) goto L_0x0296
            X.293 r2 = X.293.A06
        L_0x0296:
            java.lang.String r1 = "TEMPLATE_LANDING_PAGE_EFFECT_METADATA_TAPPED"
            r6.A1W(r2, r5, r1)
            java.lang.String r13 = X.AnonymousClass7TG.A0j()
            X.1Xy r1 = r11.A0C
            com.instagram.feed.media.CreativeConfigIntf r1 = r1.AsO()
            if (r1 == 0) goto L_0x00e6
            java.util.List r1 = r1.B02()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r2 = X.00k.A0J(r1)
            com.instagram.feed.media.EffectPreviewIntf r2 = (com.instagram.feed.media.EffectPreviewIntf) r2
            if (r2 == 0) goto L_0x00e6
            androidx.fragment.app.FragmentActivity r6 = r4.requireActivity()
            boolean r1 = X.DDx.A04(r2)
            r17 = r1 ^ 1
            r12 = 0
            X.8ZN r7 = X.AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE
            r8 = r4
            r9 = r3
            r10 = r2
            r14 = r12
            r15 = r12
            r16 = r12
            X.C52273GLp.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L_0x02cd:
            r16 = 0
            goto L_0x0068
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02d6:
            X.C3511387s.A00(r2)
            return r0
        L_0x02da:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380289Xk.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public C380289Xk(AnonymousClass4DH r1, C3510387i r2, C3511387s r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
