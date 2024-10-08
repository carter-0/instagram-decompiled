package X;

public final class JJT extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJT(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    public static boolean A00(C286575Wy r2, C62320sa r3, JJT jjt) {
        I6S.A05(r3, C304346Dc.A00(r2, ((C53358Gmi) jjt.A04).A00), r2, 0);
        return 0fL.A02();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v155, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: X.Iw7} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0600, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0663, code lost:
        if (r11 == X.AnonymousClass5XT.A00) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a47, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a48, code lost:
        r1.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
        if (r13.A5G() == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0140, code lost:
        if (r1 != false) goto L_0x0142;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            r32 = this;
            r0 = r32
            r3 = r33
            r5 = r35
            r1 = r34
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0238;
                case 1: goto L_0x02c8;
                case 2: goto L_0x039c;
                case 3: goto L_0x03dd;
                case 4: goto L_0x04fc;
                case 5: goto L_0x069f;
                case 6: goto L_0x0722;
                case 7: goto L_0x0755;
                case 8: goto L_0x07ea;
                case 9: goto L_0x0896;
                case 10: goto L_0x08f9;
                case 11: goto L_0x091f;
                case 12: goto L_0x0955;
                case 13: goto L_0x098b;
                case 14: goto L_0x09c1;
                case 15: goto L_0x0a01;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.Gms r5 = (X.C53368Gms) r5
            r11 = 1
            int r20 = X.DbW.A02(r11, r1, r5)
            r10 = 0
            android.view.View r12 = r1.getChildAt(r10)
            java.lang.String r1 = "null cannot be cast to non-null type instagram.features.clips.viewer.adapter.common.LithoClipsViewerVideoLayout"
            X.0qQ.A0C(r12, r1)
            X.GIC r12 = (X.GIC) r12
            java.lang.Object r9 = r0.A04
            X.GGu r9 = (X.C52152GGu) r9
            java.lang.Object r1 = r0.A03
            android.content.Context r19 = X.C51969G9p.A0L(r1)
            int r8 = r5.A01
            int r7 = r5.A00
            java.lang.ref.WeakReference r1 = r9.A05
            java.lang.Object r6 = r1.get()
            X.JSd r6 = (X.C59659JSd) r6
            java.lang.Object r3 = r0.A01
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.Object r13 = r0.A02
            X.1Xj r13 = (X.1Xj) r13
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r12.A01
            if (r3 == 0) goto L_0x004b
            X.0iw r2 = r9.A02
            X.1Tw r0 = X.1Tw.A06
            r1.setUrl(r3, r2, r0)
        L_0x004b:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r0)
            boolean r0 = r9.A09
            r4 = 0
            if (r0 == 0) goto L_0x0066
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            boolean r0 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0066
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            if (r2 == 0) goto L_0x0066
            r2.gravity = r10
            r1.setLayoutParams(r2)
        L_0x0066:
            if (r13 == 0) goto L_0x006f
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r2 = r12.A00
            X.0iw r0 = r9.A02
            r2.setVideoSource(r13, r0)
        L_0x006f:
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x00c7
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r3 = r12.A00
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r0 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0088
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            if (r2 == 0) goto L_0x0088
            r0 = 48
            r2.gravity = r0
            r3.setLayoutParams(r2)
        L_0x0088:
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x00c7
            X.4bN r0 = r9.A00
            X.3OA r2 = r0.A06()
            X.1Xj r0 = r2.A0K
            X.1Xy r0 = r0.A0C
            java.lang.String r3 = r0.getDominantColor()
            X.3xz r2 = r2.A0H
            if (r2 == 0) goto L_0x0229
            X.4iX r0 = r2.AhE()
            if (r0 == 0) goto L_0x00a8
            java.lang.String r4 = r0.getBackgroundColor()
        L_0x00a8:
            X.4iX r0 = r2.C8L()
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = r0.getBackgroundColor()
            if (r0 == 0) goto L_0x0229
            if (r4 == 0) goto L_0x0229
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int r2 = android.graphics.Color.parseColor(r0)
            int r0 = android.graphics.Color.parseColor(r4)
            android.graphics.drawable.GradientDrawable r0 = X.C51970G9q.A0O(r3, r2, r0)
        L_0x00c4:
            r12.setBackground(r0)
        L_0x00c7:
            X.GDy r5 = X.C52152GGu.A00(r13, r9)
            if (r5 == 0) goto L_0x01b8
            X.GDe r14 = r9.A01
            java.lang.Integer r0 = r14.A0J
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r12.A00
            r5.A05 = r0
            r5.A01 = r1
            if (r1 == 0) goto L_0x00e8
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A0A
            boolean r0 = r0.A1u
            int r0 = X.DbW.A00(r0)
            r1.setVisibility(r0)
        L_0x00e8:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A02
            r5.A02 = r0
            com.instagram.common.session.UserSession r0 = r5.A0B
            boolean r0 = X.1KU.A07(r0)
            if (r0 == 0) goto L_0x00f9
            if (r2 == 0) goto L_0x00f9
            X.C52078GDy.A01(r5, r11, r10)
        L_0x00f9:
            r5.A07 = r11
            X.4bN r4 = r9.A00
            com.instagram.common.session.UserSession r3 = r9.A03
            boolean r0 = X.C52076GDw.A05(r4, r3)
            r2 = 8
            if (r0 != 0) goto L_0x010b
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x010e
        L_0x010b:
            r1.setVisibility(r2)
        L_0x010e:
            boolean r1 = r9.A08
            r0 = 4
            X.0qQ.A0B(r3, r0)
            if (r1 == 0) goto L_0x021c
            r15 = 0
        L_0x0117:
            if (r13 == 0) goto L_0x0233
            if (r15 != 0) goto L_0x0142
            X.3eu r0 = r13.A1S()
            if (r0 == 0) goto L_0x0216
            int r1 = r0.A01
            float r1 = (float) r1
            int r0 = r0.A00
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0128:
            double r0 = (double) r1
            r17 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r16)
            boolean r0 = r13.CcK()
            if (r0 != 0) goto L_0x0140
            boolean r0 = r13.A5G()
            if (r0 == 0) goto L_0x0142
        L_0x0140:
            if (r1 == 0) goto L_0x0159
        L_0x0142:
            float r1 = (float) r8
            float r0 = (float) r7
            float r16 = r1 / r0
            X.3eu r0 = r13.A1S()
            if (r0 == 0) goto L_0x0210
            int r13 = r0.A01
            float r13 = (float) r13
            int r0 = r0.A00
            float r0 = (float) r0
            float r13 = r13 / r0
        L_0x0153:
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0159
            float r1 = r1 / r13
            int r7 = (int) r1
        L_0x0159:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A02()
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r5.A03()
            android.view.View[] r16 = new android.view.View[]{r1, r0}
            r1 = 0
        L_0x0166:
            r13 = r16[r1]
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r0.height = r7
            r13.setLayoutParams(r0)
            int r1 = r1 + 1
            r0 = r20
            if (r1 < r0) goto L_0x0166
            if (r15 != 0) goto L_0x018c
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r5.A03()
            android.view.View[] r0 = new android.view.View[]{r0}
            r1 = r0[r10]
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r8
            r1.setLayoutParams(r0)
        L_0x018c:
            X.0qQ.A0B(r4, r11)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x01f3
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r8 = r5.A03()
            java.lang.String r1 = "Reel Item "
            int r0 = r14.A09()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            X.0qQ.A07(r0)
        L_0x01b0:
            r8.setContentDescription(r0)
            X.3oV r0 = r5.A0D
            r0.setVisibility(r2)
        L_0x01b8:
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x01e0
            if (r5 == 0) goto L_0x01e0
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r2 = r5.A03()
            java.lang.String r1 = "Reel Item "
            X.GDe r0 = r9.A01
            int r0 = r0.A09()
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            X.0qQ.A07(r0)
            r2.setContentDescription(r0)
        L_0x01e0:
            X.GHy r0 = new X.GHy
            r0.<init>(r6)
            r12.post(r0)
            r0 = 18
            X.Iw1 r0 = X.C58692Iw1.A00(r12, r9, r0)
            X.3eI r2 = X.C51965G9l.A0f(r0)
            return r2
        L_0x01f3:
            boolean r0 = r4.CcK()
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r8 = r5.A03()
            android.content.res.Resources r7 = r19.getResources()
            r1 = 2131956144(0x7f1311b0, float:1.9548835E38)
            if (r0 == 0) goto L_0x0207
            r1 = 2131956135(0x7f1311a7, float:1.9548817E38)
        L_0x0207:
            java.lang.String r0 = r4.AyM(r3)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r7, r0, r1)
            goto L_0x01b0
        L_0x0210:
            float r13 = r13.A0l()
            goto L_0x0153
        L_0x0216:
            float r1 = r13.A0l()
            goto L_0x0128
        L_0x021c:
            X.0Tu r15 = X.0Tu.A05
            r0 = 36322559897118965(0x810b2d000028f5, double:3.033871365922603E-306)
            boolean r15 = X.182.A06(r15, r3, r0)
            goto L_0x0117
        L_0x0229:
            int r0 = android.graphics.Color.parseColor(r3)
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r0)
            goto L_0x00c4
        L_0x0233:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0238:
            X.JL1 r3 = (X.JL1) r3
            X.5Wy r1 = (X.C286575Wy) r1
            int r4 = X.AnonymousClass7TE.A0M(r5)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x024d
            boolean r2 = X.G9t.A1T(r1, r3, r4)
            int r2 = X.C51970G9q.A05(r2)
            r4 = r4 | r2
        L_0x024d:
            r4 = r4 & 19
            r2 = 18
            if (r4 != r2) goto L_0x0259
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x0259:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0267
            r4 = -1862279075(0xffffffff90ffe05d, float:-1.0092545E-28)
            java.lang.String r2 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)"
            X.0fL.A01(r4, r2)
        L_0x0267:
            java.lang.Object r7 = r0.A02
            boolean r2 = r1.AGu(r7)
            java.lang.Object r5 = r0.A04
            boolean r2 = X.C51966G9m.A1U(r1, r5, r2)
            java.lang.Object r6 = r0.A03
            X.IES r6 = (X.IES) r6
            boolean r4 = X.C51966G9m.A1U(r1, r6, r2)
            java.lang.Object r2 = r1.ECw()
            if (r4 != 0) goto L_0x0285
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r2 != r4) goto L_0x028e
        L_0x0285:
            r4 = 1
            X.Iwy r2 = new X.Iwy
            r2.<init>(r4, r7, r5, r6)
            r1.FLL(r2)
        L_0x028e:
            X.0sP r2 = (X.0sP) r2
            X.C286645Xf.A03(r1, r3, r2)
            X.0vr r4 = r6.A02
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"
            X.0qQ.A0C(r3, r2)
            r2 = r3
            X.IEM r2 = (X.IEM) r2
            X.5Oz r2 = r2.A01
            r4.A09(r5, r2)
            java.lang.Object r4 = r1.ECw()
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x02b2
            X.IEL r4 = new X.IEL
            r4.<init>(r3)
            r1.FLL(r4)
        L_0x02b2:
            java.lang.Object r2 = r0.A01
            X.0sJ r2 = (X.0sJ) r2
            java.lang.Integer r0 = X.C51967G9n.A0k()
            r2.invoke(r4, r5, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = 1283538674(0x4c813ef2, float:6.7762064E7)
            goto L_0x0a42
        L_0x02c8:
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            X.5Wy r4 = X.C51966G9m.A0R(r1, r5)
            r1 = -84507373(0xfffffffffaf68513, float:-6.4000205E35)
            boolean r1 = X.C51967G9n.A1U(r4, r1)
            if (r1 == 0) goto L_0x02df
            r2 = 1620636687(0x6098f40f, float:8.8171605E19)
            java.lang.String r1 = "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"
            X.0fL.A01(r2, r1)
        L_0x02df:
            java.lang.Object r14 = r4.ECw()
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r14 != r5) goto L_0x02ef
            X.Hk1 r14 = new X.Hk1
            r14.<init>()
            r4.FLL(r14)
        L_0x02ef:
            java.lang.Object r12 = r0.A01
            X.6Ff r12 = (X.C304786Ff) r12
            boolean r1 = r12 instanceof X.C304776Fe
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x0305
            r1 = r12
            X.6Fe r1 = (X.C304776Fe) r1
            long r1 = r1.A00
            r7 = 16
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0305
            r9 = 0
        L_0x0305:
            X.4bM r1 = X.AnonymousClass5YA.A0E
            java.lang.Object r1 = r4.AJO(r1)
            X.5Qx r1 = (X.C285345Qx) r1
            X.5Qw r1 = (X.C285335Qw) r1
            X.5Oz r1 = r1.A00
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 == 0) goto L_0x0392
            java.lang.Object r11 = r0.A03
            X.Gc7 r11 = (X.C52754Gc7) r11
            X.5Oz r1 = r11.A0A
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 == 0) goto L_0x0392
            java.lang.Object r15 = r0.A04
            X.5Tl r15 = (X.C285975Tl) r15
            long r1 = r15.A00
            boolean r6 = X.C285965Tk.A03(r1)
            if (r6 == 0) goto L_0x0392
            if (r9 == 0) goto L_0x0392
            r6 = 808320157(0x302dfc9d, float:6.329602E-10)
            r4.ExS(r6)
            X.5Tq r8 = r15.A01
            X.5Tk r7 = new X.5Tk
            r7.<init>(r1)
            boolean r2 = r4.AGw(r14)
            java.lang.Object r1 = r4.ECw()
            if (r2 != 0) goto L_0x034a
            if (r1 != r5) goto L_0x0355
        L_0x034a:
            r6 = 0
            r2 = 16
            X.JTh r1 = new X.JTh
            r1.<init>((java.lang.Object) r14, (X.AnonymousClass4D7) r6, (int) r2)
            r4.FLL(r1)
        L_0x0355:
            X.0sL r1 = (X.0sL) r1
            X.C286645Xf.A02(r4, r8, r7, r1)
            boolean r1 = r4.AGw(r14)
            java.lang.Object r13 = r0.A02
            boolean r0 = X.C51972G9s.A1W(r4, r13, r15, r1)
            boolean r0 = X.C51972G9s.A1W(r4, r11, r12, r0)
            java.lang.Object r9 = r4.ECw()
            if (r0 != 0) goto L_0x0370
            if (r9 != r5) goto L_0x0378
        L_0x0370:
            X.Ixb r9 = new X.Ixb
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4.FLL(r9)
        L_0x0378:
            X.0sP r9 = (X.0sP) r9
            androidx.compose.ui.Modifier r2 = X.C289575dp.A01(r3, r9)
            X.5Wx r1 = X.C51965G9l.A0H(r4, r10)
        L_0x0382:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x038e
            r0 = -634904039(0xffffffffda282219, float:-1.18313217E16)
            X.0fL.A00(r0)
        L_0x038e:
            X.C286565Wx.A0L(r1, r10)
            return r2
        L_0x0392:
            r0 = 809534830(0x3040856e, float:7.003881E-10)
            X.5Wx r1 = X.C51970G9q.A0R(r4, r0)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            goto L_0x0382
        L_0x039c:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0D(r5)
            r2 = 16
            if (r3 != r2) goto L_0x03ac
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x03ac:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x03ba
            r3 = -1830899324(0xffffffff92deb184, float:-1.4053931E-27)
            java.lang.String r2 = "com.instagram.aistudio.home.view.homeSectionItem.<anonymous> (AiAgentsHomeFragment.kt:410)"
            X.0fL.A01(r3, r2)
        L_0x03ba:
            java.lang.Object r4 = r0.A02
            X.JcX r4 = (X.C59964JcX) r4
            java.lang.Object r3 = r0.A01
            X.LRW r3 = (X.LRW) r3
            java.lang.Object r2 = r0.A04
            X.0sK r2 = (X.0sK) r2
            java.lang.Object r0 = r0.A03
            X.0sL r0 = (X.0sL) r0
            r8 = 0
            r6 = r0
            r7 = r2
            r5 = r3
            r3 = r1
            X.C56204HuX.A00(r3, r4, r5, r6, r7, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = 1436998680(0x55a6dc18, float:2.29330282E13)
            goto L_0x0a42
        L_0x03dd:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.AnonymousClass7TE.A0M(r5)
            r4 = 0
            X.0qQ.A0B(r3, r4)
            r3 = r2 & 17
            r2 = 16
            if (r3 != r2) goto L_0x03f3
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x03f3:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0401
            r3 = 1847288125(0x6e1b613d, float:1.2021933E28)
            java.lang.String r2 = "com.instagram.aistudio.home.view.listHomeSectionItems.<anonymous> (AiAgentsHomeFragment.kt:435)"
            X.0fL.A01(r3, r2)
        L_0x0401:
            X.5Zp r5 = X.C287215Zl.A04
            java.lang.Object r3 = r0.A04
            X.JcX r3 = (X.C59964JcX) r3
            java.lang.Object r2 = r0.A01
            X.LRW r2 = (X.LRW) r2
            java.lang.Object r9 = r0.A03
            java.lang.Object r8 = r0.A02
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            X.5RD r7 = X.C51965G9l.A0Q(r1, r5)
            int r11 = X.C287425a7.A00(r1)
            r0 = r1
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r5 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r1, r6)
            X.C51973G9u.A0y(r1, r0)
            X.C51971G9r.A12(r1, r7, r5)
            X.0sL r7 = X.C287485aD.A02
            boolean r5 = r0.A0K
            if (r5 != 0) goto L_0x0436
            boolean r5 = X.C51972G9s.A1Q(r1, r11)
            if (r5 != 0) goto L_0x0439
        L_0x0436:
            X.C51971G9r.A13(r1, r7, r11)
        L_0x0439:
            X.C51965G9l.A18(r1, r10)
            X.6FX r12 = X.AnonymousClass6FX.A00
            java.lang.Object r11 = r3.A02
            X.Gll r11 = (X.C53299Gll) r11
            java.lang.String r10 = r11.A03
            long r18 = X.C51966G9m.A0H(r1)
            X.5Z4 r16 = X.C51966G9m.A0e(r1)
            r7 = 1098907648(0x41800000, float:16.0)
            r5 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A09(r6, r7, r5)
            r13 = 1
            androidx.compose.ui.Modifier r15 = r12.A00(r5)
            r5 = 0
            r17 = r10
            r14 = r1
            X.AnonymousClass5ZZ.A0Q(r14, r15, r16, r17, r18)
            boolean r12 = r11.A05
            if (r12 == 0) goto L_0x04b5
            r8 = 898668134(0x35909666, float:1.0772608E-6)
            r1.ExS(r8)
            X.HT4.A00(r1, r2, r10, r4)
            r8 = 2131952627(0x7f1303f3, float:1.9541702E38)
            java.lang.String r15 = X.C288035bG.A00(r1, r8)
            long r16 = X.C51966G9m.A0N(r1)
            X.5Z4 r14 = X.C51965G9l.A0S(r1)
            androidx.compose.ui.Modifier r7 = X.G9w.A0I(r6, r7)
            r6 = 1553020355(0x5c9135c3, float:3.26983866E17)
            boolean r6 = X.G9t.A1Y(r1, r9, r2, r6)
            boolean r6 = X.C51966G9m.A1U(r1, r3, r6)
            java.lang.Object r8 = r1.ECw()
            if (r6 != 0) goto L_0x0495
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r8 != r6) goto L_0x049b
        L_0x0495:
            r6 = 30
            X.Iw5 r8 = X.C58696Iw5.A00(r1, r2, r9, r3, r6)
        L_0x049b:
            X.0sa r2 = X.C51965G9l.A0y(r0, r8, r4)
        L_0x049f:
            androidx.compose.ui.Modifier r13 = X.C287635aW.A05(r7, r5, r5, r2, r13)
            r12 = r1
            X.AnonymousClass5ZZ.A0Q(r12, r13, r14, r15, r16)
        L_0x04a7:
            X.C286565Wx.A0L(r0, r4)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x0a45
            r0 = -1244248692(0xffffffffb5d6458c, float:-1.5964483E-6)
            goto L_0x0a42
        L_0x04b5:
            boolean r9 = r11.A06
            if (r9 == 0) goto L_0x04f5
            r9 = 899192437(0x35989675, float:1.1368671E-6)
            r1.ExS(r9)
            X.HT4.A00(r1, r2, r10, r4)
            r9 = 2131952627(0x7f1303f3, float:1.9541702E38)
            java.lang.String r15 = X.C288035bG.A00(r1, r9)
            long r16 = X.C51966G9m.A0N(r1)
            X.5Z4 r14 = X.C51965G9l.A0S(r1)
            androidx.compose.ui.Modifier r7 = X.G9w.A0I(r6, r7)
            r6 = 1553037268(0x5c9177d4, float:3.27564992E17)
            boolean r6 = X.G9t.A1Y(r1, r8, r3, r6)
            boolean r6 = X.C51966G9m.A1U(r1, r2, r6)
            java.lang.Object r9 = r1.ECw()
            if (r6 != 0) goto L_0x04ea
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r9 != r6) goto L_0x04f0
        L_0x04ea:
            r6 = 31
            X.Iw5 r9 = X.C58696Iw5.A00(r1, r2, r8, r3, r6)
        L_0x04f0:
            X.0sa r2 = X.C51965G9l.A0y(r0, r9, r4)
            goto L_0x049f
        L_0x04f5:
            r2 = 899705611(0x35a06b0b, float:1.1952083E-6)
            r1.ExS(r2)
            goto L_0x04a7
        L_0x04fc:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.AnonymousClass7TE.A0M(r5)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            r3 = r2 & 17
            r2 = 16
            if (r3 != r2) goto L_0x0512
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x0512:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0520
            r3 = 1909382133(0x71cedbf5, float:2.0486344E30)
            java.lang.String r2 = "com.instagram.aistudio.home.view.listHomeSectionItems.<anonymous> (AiAgentsHomeFragment.kt:468)"
            X.0fL.A01(r3, r2)
        L_0x0520:
            java.lang.Object r4 = r0.A04
            X.JcX r4 = (X.C59964JcX) r4
            boolean r2 = r4.A04
            if (r2 == 0) goto L_0x053c
            r0 = -146295875(0xfffffffff747b3bd, float:-4.0504398E33)
            r1.ExS(r0)
            X.HT7.A00(r1, r5)
        L_0x0531:
            boolean r0 = X.C51970G9q.A1a(r1, r5)
            if (r0 == 0) goto L_0x0a45
            r0 = 1502283287(0x598b0617, float:4.8914647E15)
            goto L_0x0a42
        L_0x053c:
            r2 = -146186848(0xfffffffff7495da0, float:-4.084182E33)
            r1.ExS(r2)
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r10 = r0.A01
            X.LRW r10 = (X.LRW) r10
            java.lang.Object r9 = r0.A02
            java.lang.Object r8 = r0.A03
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r16 = r2.iterator()
            r6 = 0
        L_0x0557:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0531
            java.lang.Object r0 = r16.next()
            int r15 = r6 + 1
            if (r6 >= 0) goto L_0x056d
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x056d:
            X.GmB r0 = (X.C53325GmB) r0
            java.lang.String r7 = r0.A06
            X.Kp1 r11 = r0.A00
            java.lang.String r23 = r11.A01()
            java.lang.String r14 = r0.A05
            java.lang.Object r2 = r4.A02
            X.Gll r2 = (X.C53299Gll) r2
            java.lang.String r3 = r2.A03
            int r12 = r2.A00
            java.lang.Integer r21 = java.lang.Integer.valueOf(r12)
            com.instagram.api.schemas.IGAIAgentType r19 = r11.A00()
            java.lang.String r27 = r11.A02()
            X.Kiw r2 = r2.A01
            java.lang.String r25 = "home"
            r29 = 196608(0x30000, float:2.75506E-40)
            r20 = r2
            r22 = r7
            r24 = r14
            r26 = r3
            r28 = r6
            r30 = r5
            r31 = r5
            r18 = r10
            r17 = r1
            X.HT3.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.4Yx r3 = r0.A01
            r2 = -1251626468(0xffffffffb565b21c, float:-8.556833E-7)
            r1.ExS(r2)
            r20 = 0
            if (r3 != 0) goto L_0x0699
            r23 = r20
        L_0x05b6:
            X.5Wx r7 = X.C51965G9l.A0H(r1, r5)
            X.0lg r12 = X.C51969G9p.A0j(r1)
            X.0Tu r11 = X.0Tu.A05
            r2 = 36325145469006478(0x810d870018328e, double:3.035506491995528E-306)
            boolean r2 = X.182.A06(r11, r12, r2)
            if (r2 == 0) goto L_0x063a
            r2 = 900524817(0x35aceb11, float:1.2883412E-6)
            r1.ExS(r2)
            java.lang.String r2 = r0.A03
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r2)
            r26 = 1
            X.2DN r19 = X.1zC.A00(r1, r2)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r2 = 1086324736(0x40c00000, float:6.0)
            androidx.compose.ui.Modifier r18 = X.C51967G9n.A0F(r3, r2)
            java.lang.String r12 = r0.A09
            boolean r11 = r0.A0C
            r2 = 1553081619(0x5c922513, float:3.29088881E17)
            boolean r3 = X.G9t.A1Y(r1, r9, r0, r2)
            boolean r2 = r1.AGs(r6)
            boolean r3 = X.C51968G9o.A1T(r1, r4, r3, r2)
            java.lang.Object r2 = r1.ECw()
            if (r3 != 0) goto L_0x0602
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x0614
        L_0x0602:
            X.Iw7 r2 = new X.Iw7
            r24 = r2
            r25 = r6
            r27 = r0
            r28 = r4
            r29 = r9
            r24.<init>((int) r25, (int) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.Object) r29)
            r1.FLL(r2)
        L_0x0614:
            X.0sa r24 = X.C51965G9l.A0y(r7, r2, r5)
            r3 = -46306647(0xfffffffffd3d6aa9, float:-1.5736119E37)
            r2 = 12
            X.5PJ r25 = X.JJU.A00(r1, r0, r8, r2, r3)
            r26 = 100663344(0x6000030, float:2.4074262E-35)
            r27 = 16
            r21 = r14
            r22 = r12
            r28 = r11
            X.HT8.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x062f:
            X.C286565Wx.A0L(r7, r5)
            X.0gF r0 = X.C60340gF.A00
            r13.add(r0)
            r6 = r15
            goto L_0x0557
        L_0x063a:
            r2 = 901157899(0x35b6940b, float:1.3603143E-6)
            r1.ExS(r2)
            java.lang.String r2 = r0.A03
            X.2DN r19 = X.C51975G9x.A0W(r1, r2)
            X.5bM r20 = X.C288075bK.A03
            java.lang.String r3 = r0.A07
            boolean r2 = r0.A0C
            r11 = 1553101459(0x5c927293, float:3.29770578E17)
            boolean r12 = X.G9t.A1Y(r1, r9, r0, r11)
            boolean r11 = r1.AGs(r6)
            boolean r12 = X.C51968G9o.A1T(r1, r4, r12, r11)
            java.lang.Object r11 = r1.ECw()
            if (r12 != 0) goto L_0x0665
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r11 != r12) goto L_0x0679
        L_0x0665:
            r26 = 2
            X.Iw7 r11 = new X.Iw7
            r24 = r11
            r25 = r6
            r27 = r0
            r28 = r4
            r29 = r9
            r24.<init>((int) r25, (int) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.Object) r29)
            r1.FLL(r11)
        L_0x0679:
            X.0sa r24 = X.C51965G9l.A0y(r7, r11, r5)
            r11 = 1422262355(0x54c60053, float:6.8032717E12)
            r6 = 13
            X.5PJ r25 = X.JJU.A00(r1, r0, r8, r6, r11)
            r27 = 196614(0x30006, float:2.75515E-40)
            r28 = 23244(0x5acc, float:3.2572E-41)
            r18 = r1
            r21 = r14
            r22 = r3
            r26 = r5
            r29 = r2
            X.GS8.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x062f
        L_0x0699:
            java.lang.String r23 = X.C52409GRk.A01(r1, r3)
            goto L_0x05b6
        L_0x069f:
            X.5Wy r1 = (X.C286575Wy) r1
            boolean r2 = X.G9w.A1a(r5)
            if (r2 == 0) goto L_0x06af
            r3 = 36407584(0x22b8920, float:1.2602449E-37)
            java.lang.String r2 = "com.instagram.barcelona.common.ui.toast.BdsToastMessage.<anonymous> (BdsToastMessage.kt:67)"
            X.0fL.A01(r3, r2)
        L_0x06af:
            java.lang.Object r8 = r0.A01
            r7 = 0
            r2 = -432921363(0xffffffffe63224ed, float:-2.103156E23)
            r1.ExS(r2)
            java.lang.Object r9 = r0.A02
            boolean r2 = r1.AGu(r9)
            java.lang.Object r4 = r1.ECw()
            if (r2 != 0) goto L_0x06c8
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x06d2
        L_0x06c8:
            r2 = 40
            X.MMP r4 = new X.MMP
            r4.<init>(r9, r2)
            r1.FLL(r4)
        L_0x06d2:
            X.0sa r4 = (X.C62320sa) r4
            X.5Wx r6 = X.C51965G9l.A0H(r1, r7)
            r2 = -432919116(0xffffffffe6322db4, float:-2.1035608E23)
            r1.ExS(r2)
            java.lang.Object r5 = r0.A03
            boolean r3 = r1.AGu(r5)
            java.lang.Object r2 = r1.ECw()
            if (r3 != 0) goto L_0x06ee
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x06f8
        L_0x06ee:
            r3 = 41
            X.MMP r2 = new X.MMP
            r2.<init>(r5, r3)
            r1.FLL(r2)
        L_0x06f8:
            X.0sa r15 = X.C51965G9l.A0y(r6, r2, r7)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            r2 = 1899635516(0x713a233c, float:9.217089E29)
            java.lang.Object r10 = r0.A04
            X.J8V r6 = new X.J8V
            r11 = r7
            r12 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.5PJ r16 = X.AnonymousClass5PI.A01(r1, r6, r2)
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = r7
            r14 = r4
            r12 = r1
            X.C54819HUa.A00(r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = 1007009859(0x3c05c043, float:0.008163515)
            goto L_0x0a42
        L_0x0722:
            X.5Wy r1 = (X.C286575Wy) r1
            boolean r2 = X.G9w.A1a(r5)
            if (r2 == 0) goto L_0x0732
            r3 = -1032630509(0xffffffffc2734f13, float:-60.82722)
            java.lang.String r2 = "com.instagram.creation.genai.contextualbackground.ui.ContextualBackgroundScreen.<anonymous>.<anonymous>.<anonymous> (ContextualBackgroundScreen.kt:138)"
            X.0fL.A01(r3, r2)
        L_0x0732:
            java.lang.Object r4 = r0.A04
            X.Jvo r4 = (X.C61050Jvo) r4
            java.lang.Object r3 = r0.A03
            X.0sa r3 = (X.C62320sa) r3
            java.lang.Object r2 = r0.A01
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            r8 = 0
            r6 = r2
            r7 = r0
            r5 = r3
            r3 = r1
            X.I7I.A04(r3, r4, r5, r6, r7, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = 969388395(0x39c7b16b, float:3.8088424E-4)
            goto L_0x0a42
        L_0x0755:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.AnonymousClass7TE.A0M(r5)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            r3 = r2 & 17
            r2 = 16
            if (r3 != r2) goto L_0x076b
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x076b:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0779
            r3 = 378906916(0x1695a924, float:2.417899E-25)
            java.lang.String r2 = "com.instagram.creator.achievements.modules.fragments.AchievementsHubScreen.<anonymous>.<anonymous>.<anonymous> (AchievementsHubFragment.kt:294)"
            X.0fL.A01(r3, r2)
        L_0x0779:
            r11 = 0
            java.lang.Object r8 = r0.A04
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r10 = r0.A01
            X.Gmk r10 = (X.C53360Gmk) r10
            java.lang.Object r6 = r10.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r10.A04
            java.lang.Object r4 = r0.A02
            X.0sP r4 = (X.0sP) r4
            r2 = 1824431008(0x6cbe9ba0, float:1.8434466E27)
            r1.ExS(r2)
            int r3 = r6.size()
            r2 = 10
            if (r3 <= r2) goto L_0x07e8
            r2 = 2131972971(0x7f13536b, float:1.9582965E38)
            java.lang.String r9 = X.C288035bG.A00(r1, r2)
            r2 = 1824437615(0x6cbeb56f, float:1.8444216E27)
            r1.ExS(r2)
            java.lang.Object r2 = r0.A03
            boolean r0 = X.C51971G9r.A1T(r1, r2, r10)
            java.lang.Object r3 = r1.ECw()
            if (r0 != 0) goto L_0x07b7
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x07c1
        L_0x07b7:
            r0 = 47
            X.MMY r3 = new X.MMY
            r3.<init>(r0, r2, r10)
            r1.FLL(r3)
        L_0x07c1:
            X.0sa r3 = (X.C62320sa) r3
            X.C51965G9l.A1X(r1, r7)
            r2 = 1
            X.IPk r0 = new X.IPk
            r0.<init>(r9, r3, r2)
        L_0x07cc:
            X.C51965G9l.A1X(r1, r7)
            r18 = 1
            r13 = r0
            r14 = r5
            r15 = r6
            r16 = r4
            r17 = r7
            r12 = r8
            r10 = r1
            X.C54937HYt.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = 1476220650(0x57fd56ea, float:5.5709947E14)
            goto L_0x0a42
        L_0x07e8:
            r0 = 0
            goto L_0x07cc
        L_0x07ea:
            X.5Wy r1 = (X.C286575Wy) r1
            int r4 = X.AnonymousClass7TE.A0M(r5)
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r4 = r4 & 17
            r3 = 16
            if (r4 != r3) goto L_0x0800
            boolean r3 = r1.Bwn()
            if (r3 != 0) goto L_0x0a48
        L_0x0800:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x080e
            r4 = -73841482(0xfffffffffb9944b6, float:-1.5916301E36)
            java.lang.String r3 = "com.instagram.creator.agent.settings.summary.BioSummary.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BioSummaryFragment.kt:120)"
            X.0fL.A01(r4, r3)
        L_0x080e:
            r3 = 2131953785(0x7f130879, float:1.954405E38)
            java.lang.String r15 = X.C288035bG.A00(r1, r3)
            X.5Z4 r14 = X.C51966G9m.A0b(r1)
            long r16 = X.C51966G9m.A0M(r1)
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r6 = 2
            r4 = 1098907648(0x41800000, float:16.0)
            r3 = 0
            androidx.compose.ui.Modifier r13 = X.C287195Zj.A0A(r5, r4, r3, r4)
            r10 = 0
            r8 = 48
            r12 = r1
            X.AnonymousClass5ZZ.A0W(r12, r13, r14, r15, r16)
            java.lang.Object r7 = r0.A04
            X.GnF r7 = (X.C53383GnF) r7
            java.lang.Object r3 = r7.A01
            X.HLa r3 = (X.C54617HLa) r3
            int r4 = r3.ordinal()
            if (r4 == r2) goto L_0x0880
            if (r4 == r6) goto L_0x086b
            r3 = 1
            if (r4 != r3) goto L_0x088e
            r3 = -128910551(0xfffffffff850fb29, float:-1.6954561E34)
            r1.ExS(r3)
            java.lang.String r6 = r7.A03
            boolean r5 = r7.A08
            boolean r4 = r7.A05
            java.lang.Object r3 = r0.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            r7 = r3
            r8 = r2
            r9 = r5
            r10 = r4
            r5 = r6
            r6 = r0
            r4 = r1
            X.C56287Hvv.A01(r4, r5, r6, r7, r8, r9, r10)
        L_0x0860:
            boolean r0 = X.C51970G9q.A1a(r1, r2)
            if (r0 == 0) goto L_0x0a45
            r0 = 300275003(0x11e5d53b, float:3.6261243E-28)
            goto L_0x0a42
        L_0x086b:
            r3 = -128913627(0xfffffffff850ef25, float:-1.6950753E34)
            r1.ExS(r3)
            java.lang.Object r0 = r0.A03
            X.0sa r0 = (X.C62320sa) r0
            androidx.compose.ui.Modifier r6 = X.C51966G9m.A0T(r5)
            r9 = 4
            r7 = r0
            r5 = r1
            X.HXX.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0860
        L_0x0880:
            r0 = -128915810(0xfffffffff850e69e, float:-1.694805E34)
            r1.ExS(r0)
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0T(r5)
            X.GQD.A01(r1, r0)
            goto L_0x0860
        L_0x088e:
            r0 = -128917547(0xfffffffff850dfd5, float:-1.69459E34)
            X.Wub r0 = X.C51973G9u.A0n(r1, r0)
            throw r0
        L_0x0896:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0D(r5)
            r2 = 16
            if (r3 != r2) goto L_0x08a6
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x08a6:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x08b4
            r3 = 1684250336(0x64639ee0, float:1.6795436E22)
            java.lang.String r2 = "com.instagram.direct.fragment.thread.threaddetail.customization.ThemesPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomGroupEmojiImagePicker.kt:161)"
            X.0fL.A01(r3, r2)
        L_0x08b4:
            java.lang.Object r6 = r0.A01
            X.JwA r6 = (X.C61072JwA) r6
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r0.A03
            boolean r5 = X.0qQ.A0K(r3, r2)
            r2 = 811180378(0x3059a15a, float:7.9173434E-10)
            r1.ExS(r2)
            java.lang.Object r4 = r0.A04
            boolean r2 = X.C51971G9r.A1V(r1, r4, r6)
            java.lang.Object r3 = r0.A02
            boolean r0 = X.C51966G9m.A1U(r1, r3, r2)
            java.lang.Object r2 = r1.ECw()
            if (r0 != 0) goto L_0x08dc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x08e5
        L_0x08dc:
            r0 = 1
            X.Inz r2 = new X.Inz
            r2.<init>(r0, r6, r4, r3)
            r1.FLL(r2)
        L_0x08e5:
            X.0sa r2 = (X.C62320sa) r2
            boolean r0 = X.C51968G9o.A1Y(r1)
            X.I78.A03(r1, r6, r2, r0, r5)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = -891189669(0xffffffffcae1865b, float:-7389997.5)
            goto L_0x0a42
        L_0x08f9:
            android.view.View r3 = (android.view.View) r3
            int r10 = X.AnonymousClass7TE.A0M(r1)
            X.JPN r5 = (X.JPN) r5
            X.DbY.A1S(r3, r5)
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r2 = r0.A04
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A01
            X.3V2 r1 = (X.AnonymousClass3V2) r1
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r6 = r1
            r7 = r4
            r8 = r2
            r9 = r0
            r4 = r5
            r5 = r3
            r4.Dky(r5, r6, r7, r8, r9, r10)
            goto L_0x0a45
        L_0x091f:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0E(r5)
            r2 = 16
            if (r3 != r2) goto L_0x092f
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x092f:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x093d
            r3 = 829603881(0x3172c029, float:3.5324865E-9)
            java.lang.String r2 = "com.instagram.invite.view.ContactList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InviteContactContent.kt:164)"
            X.0fL.A01(r3, r2)
        L_0x093d:
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 20
            X.Iw4 r2 = new X.Iw4
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6, (java.lang.Object) r5)
            boolean r0 = A00(r1, r2, r0)
            if (r0 == 0) goto L_0x0a45
            r0 = -1459283709(0xffffffffa9051903, float:-2.9553627E-14)
            goto L_0x0a42
        L_0x0955:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0E(r5)
            r2 = 16
            if (r3 != r2) goto L_0x0965
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x0965:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0973
            r3 = 1207628102(0x47faf146, float:128482.55)
            java.lang.String r2 = "com.instagram.invite.view.ContactList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InviteContactContent.kt:183)"
            X.0fL.A01(r3, r2)
        L_0x0973:
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 21
            X.Iw4 r2 = new X.Iw4
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6, (java.lang.Object) r5)
            boolean r0 = A00(r1, r2, r0)
            if (r0 == 0) goto L_0x0a45
            r0 = 782279395(0x2ea0a2e3, float:7.304892E-11)
            goto L_0x0a42
        L_0x098b:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0E(r5)
            r2 = 16
            if (r3 != r2) goto L_0x099b
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x099b:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x09a9
            r3 = -383693176(0xffffffffe9214e88, float:-1.2187994E25)
            java.lang.String r2 = "com.instagram.invite.view.ContactList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InviteContactContent.kt:199)"
            X.0fL.A01(r3, r2)
        L_0x09a9:
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 22
            X.Iw4 r2 = new X.Iw4
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6, (java.lang.Object) r5)
            boolean r0 = A00(r1, r2, r0)
            if (r0 == 0) goto L_0x0a45
            r0 = 958936833(0x39283701, float:1.6042219E-4)
            goto L_0x0a42
        L_0x09c1:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0D(r5)
            r2 = 16
            if (r3 != r2) goto L_0x09d1
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x09d1:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x09df
            r3 = -297047574(0xffffffffee4b69ea, float:-1.5738375E28)
            java.lang.String r2 = "com.instagram.schools.tab.ui.StudentUserRow.<anonymous> (SchoolDirectoryComposeComponents.kt:287)"
            X.0fL.A01(r3, r2)
        L_0x09df:
            java.lang.Object r4 = r0.A03
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r3 = r0.A01
            X.0sa r3 = (X.C62320sa) r3
            java.lang.Object r2 = r0.A02
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r0 = r0.A04
            X.Gly r0 = (X.C53312Gly) r0
            r7 = 0
            r5 = r3
            r6 = r2
            r3 = r0
            r2 = r1
            X.I7T.A07(r2, r3, r4, r5, r6, r7)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = -86697767(0xfffffffffad518d9, float:-5.532316E35)
            goto L_0x0a42
        L_0x0a01:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0D(r5)
            r2 = 16
            if (r3 != r2) goto L_0x0a11
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0a48
        L_0x0a11:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0a1f
            r3 = 953371171(0x38d34a23, float:1.0075073E-4)
            java.lang.String r2 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:153)"
            X.0fL.A01(r3, r2)
        L_0x0a1f:
            java.lang.Object r4 = r0.A04
            X.JOY r4 = (X.JOY) r4
            X.GqW r4 = (X.C53560GqW) r4
            java.lang.Object r3 = r0.A03
            X.JOX r3 = (X.JOX) r3
            java.lang.Object r2 = r0.A02
            X.JOX r2 = (X.JOX) r2
            java.lang.Object r0 = r0.A01
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r0 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r0
            r7 = 0
            r5 = r0
            r6 = r4
            r4 = r2
            r2 = r1
            X.I6Z.A03(r2, r3, r4, r5, r6, r7)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0a45
            r0 = 1068013725(0x3fa8989d, float:1.3171574)
        L_0x0a42:
            X.0fL.A00(r0)
        L_0x0a45:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0a48:
            r1.Evl()
            goto L_0x0a45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JJT.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
