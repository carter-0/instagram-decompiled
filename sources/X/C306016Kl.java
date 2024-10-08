package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6Kl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C306016Kl implements C305916Kb {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ AnonymousClass6UX A04;
    public final /* synthetic */ ReelViewerFragment A05;

    public /* synthetic */ C306016Kl(View view, Reel reel, C255773uh r3, C250973mM r4, AnonymousClass6UX r5, ReelViewerFragment reelViewerFragment) {
        this.A05 = reelViewerFragment;
        this.A00 = view;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = reel;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x012a, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AFC() {
        /*
            r51 = this;
            r1 = r51
            instagram.features.stories.fragment.ReelViewerFragment r9 = r1.A05
            android.view.View r8 = r1.A00
            X.6UX r0 = r1.A04
            r50 = r0
            X.3mM r13 = r1.A03
            com.instagram.model.reels.Reel r15 = r1.A01
            X.3uh r4 = r1.A02
            java.lang.String r1 = r9.A1y
            X.1OP r0 = X.1OP.$redex_init_class
            java.util.Map r0 = X.AnonymousClass3K2.A13
            java.lang.Object r0 = r0.get(r1)
            X.3K2 r0 = (X.AnonymousClass3K2) r0
            if (r0 == 0) goto L_0x0021
            r0.A0R()
        L_0x0021:
            com.instagram.common.session.UserSession r1 = r9.getSession()
            X.6fm r0 = r9.mViewPager
            X.6fl r0 = (X.C313046fl) r0
            android.view.ViewGroup r0 = r0.A02
            r49 = r0
            android.view.View r0 = r9.mViewerBackgroundView
            r48 = r0
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r3 = r9.mAvatarAnimationView
            X.6Yq r0 = r9.A15
            r46 = r0
            X.3BQ r0 = r9.A0d
            r38 = r0
            X.6KS r26 = new X.6KS
            r0 = r26
            r0.<init>(r9)
            android.content.Context r11 = r49.getContext()
            if (r8 == 0) goto L_0x0239
            java.lang.Object r0 = r8.getTag()
            boolean r0 = r0 instanceof X.C316006kx
            if (r0 == 0) goto L_0x0239
            java.lang.Object r2 = r8.getTag()
            X.6kx r2 = (X.C316006kx) r2
        L_0x0056:
            r0 = r50
            X.6KT r12 = r0.A08(r15, r4)
            android.graphics.RectF r5 = r12.A02
            android.graphics.RectF r25 = new android.graphics.RectF
            r0 = r25
            r0.<init>(r5)
            android.graphics.RectF r5 = r12.A01
            android.graphics.RectF r24 = new android.graphics.RectF
            r0 = r24
            r0.<init>(r5)
            boolean r0 = r12.A03
            r23 = r0
            boolean r0 = r50.A07()
            r7 = 0
            if (r0 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            r0 = r50
            com.instagram.common.typedurl.ImageUrl r5 = r0.A04(r1, r15)
            if (r5 == 0) goto L_0x008f
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A0g
            r1.setVisibility(r7)
            r0 = 0
            r1.setAlpha(r0)
            r1.setUrl(r5, r9)
        L_0x008f:
            int r0 = X.0nA.A09(r11)
            float r6 = (float) r0
            r22 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r22
            X.0qQ.A0B(r11, r7)
            int r1 = X.AnonymousClass0nB.A00(r11)
            int r0 = X.AnonymousClass2uJ.A00
            int r1 = r1 - r0
            float r5 = (float) r1
            float r5 = r5 / r22
            float r39 = r49.getTranslationX()
            float r21 = r49.getTranslationY()
            float r40 = r49.getScaleY()
            int r0 = r49.getWidth()
            int r0 = r0 / 2
            float r1 = (float) r0
            r0 = r49
            r0.setPivotX(r1)
            int r0 = r49.getHeight()
            int r0 = r0 / 2
            float r1 = (float) r0
            r0 = r49
            r0.setPivotY(r1)
            float r0 = -r6
            r37 = r0
            float r0 = -r5
            r20 = r0
            int r0 = X.AnonymousClass4EQ.A01()
            float r0 = (float) r0
            float r0 = r0 / r22
            float r10 = r20 - r0
            r1 = r37
            r0 = r25
            r0.offset(r1, r10)
            boolean r0 = X.C316216lI.A0D(r11, r13)
            if (r0 == 0) goto L_0x022f
            float r41 = r25.height()
            int r0 = r49.getHeight()
        L_0x00ed:
            float r0 = (float) r0
            float r41 = r41 / r0
            int r0 = r49.getHeight()
            r1 = r21
            double r10 = (double) r1
            r18 = 0
            double r13 = (double) r0
            r0 = r18
            double r0 = java.lang.Math.max(r10, r0)
            double r0 = java.lang.Math.min(r0, r13)
            float r10 = (float) r0
            double r0 = (double) r10
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r27 = r0
            r29 = r18
            r31 = r13
            r33 = r16
            r35 = r18
            double r0 = X.AnonymousClass37Q.A04(r27, r29, r31, r33, r35)
            float r11 = (float) r0
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>()
            X.4gL r0 = r4.A0c
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = r0.A0Y
            if (r0 != 0) goto L_0x0126
            java.lang.String r0 = ""
        L_0x0126:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c8
        L_0x012c:
            r0 = 8
            r3.setVisibility(r0)
        L_0x0131:
            r7 = 0
        L_0x0132:
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto L_0x0139
            r7 = 0
        L_0x0139:
            float r47 = r24.width()
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r47 = r47 / r0
            r8 = r24
            r1 = r37
            r0 = r20
            r8.offset(r1, r0)
            r3.setScaleX(r7)
            r3.setScaleY(r7)
            float r0 = r10.centerX()
            float r0 = r0 - r6
            r3.setTranslationX(r0)
            float r0 = r10.centerY()
            float r0 = r0 - r5
            r3.setTranslationY(r0)
            float r42 = r3.getTranslationX()
            float r44 = r3.getTranslationY()
            int r0 = X.AnonymousClass4EQ.A01()
            float r0 = (float) r0
            float r0 = r0 / r22
            float r44 = r44 - r0
            float r43 = r24.centerX()
            float r45 = r24.centerY()
            int r0 = X.AnonymousClass4EQ.A01()
            float r0 = (float) r0
            float r0 = r0 / r22
            float r45 = r45 - r0
            r0 = r50
            r0.A0A(r15, r4)
            X.2cp r0 = X.C61340me.A00()
            X.2cs r5 = r0.A02()
            r0 = 1
            r5.A06 = r0
            r0 = r18
            r5.A05(r0)
            X.6KU r0 = new X.6KU
            r28 = r49
            r29 = r48
            r30 = r15
            r31 = r4
            r32 = r12
            r33 = r50
            r34 = r46
            r35 = r3
            r36 = r2
            r37 = r26
            r38 = r21
            r46 = r7
            r48 = r11
            r49 = r23
            r26 = r0
            r27 = r25
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r5.A0A(r0)
            r0 = r16
            r5.A06(r0)
            return
        L_0x01c8:
            boolean r0 = r15.A0g()
            if (r0 != 0) goto L_0x012c
            if (r8 == 0) goto L_0x0131
            if (r23 != 0) goto L_0x0131
            r0 = 2131439687(0x7f0b3047, float:1.8501336E38)
            android.view.View r8 = r8.findViewById(r0)
            if (r8 == 0) goto L_0x0131
            r0 = 4
            r8.setVisibility(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r15.A07()
            X.3BQ r10 = X.AnonymousClass3BQ.OPAL
            r0 = r38
            if (r0 != r10) goto L_0x0217
            com.instagram.user.model.User r10 = r4.A0i
            if (r10 == 0) goto L_0x0217
            X.4Cl r0 = r10.A03
            X.4bl r0 = r0.BYD()
            if (r0 == 0) goto L_0x0217
            X.4Cl r0 = r10.A03
            X.4bl r0 = r0.BYD()
            java.lang.String r0 = r0.Bh8()
            if (r0 == 0) goto L_0x0217
            X.4Cl r0 = r10.A03
            X.4bl r0 = r0.BYD()
            java.lang.String r0 = r0.Bh8()
            android.net.Uri r1 = X.0cp.A03(r0)
            X.0qQ.A0B(r1, r7)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A00(r1, r0, r0)
        L_0x0217:
            if (r1 == 0) goto L_0x021c
            r3.A04(r1, r9)
        L_0x021c:
            r3.setVisibility(r7)
            android.graphics.RectF r10 = X.0nA.A0F(r8)
            float r7 = r10.width()
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r7 = r7 / r0
            goto L_0x0132
        L_0x022f:
            float r41 = r25.width()
            int r0 = r49.getWidth()
            goto L_0x00ed
        L_0x0239:
            r2 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306016Kl.AFC():void");
    }
}
