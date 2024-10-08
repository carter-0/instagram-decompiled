package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6kL  reason: invalid class name and case insensitive filesystem */
public final class C315686kL {
    public static final C315686kL A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070 A[Catch:{ IllegalArgumentException -> 0x0098, all -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b A[Catch:{ IllegalArgumentException -> 0x0098, all -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.ViewGroup A00(android.app.Activity r14, android.view.ViewGroup r15, X.C247833gz r16, com.instagram.common.session.UserSession r17, X.C226642hc r18, X.AnonymousClass3BQ r19, java.lang.Integer r20) {
        /*
            r12 = 0
            X.0qQ.A0B(r14, r12)
            r13 = 1
            r10 = r15
            X.0qQ.A0B(r15, r13)
            r0 = 4
            r4 = r17
            X.0qQ.A0B(r4, r0)
            r6 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x001f
            r1 = 1329745399(0x4f424df7, float:3.25988941E9)
            java.lang.String r0 = "ReelViewerItemBinder.newView"
            X.0fS.A01(r0, r1)
        L_0x001f:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r14)     // Catch:{ all -> 0x00db }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x00db }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x00db }
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup"
            r3 = -1
            r1 = r20
            if (r1 == r0) goto L_0x0051
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x00db }
            r0 = 36323320106396744(0x810bde00012c48, double:3.034352125330987E-306)
            boolean r0 = X.182.A06(r2, r4, r0)     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x0051
            r0 = 2131627183(0x7f0e0caf, float:1.8881623E38)
            android.view.View r2 = r8.inflate(r0, r15, r12)     // Catch:{ all -> 0x00db }
            X.0qQ.A0C(r2, r5)     // Catch:{ all -> 0x00db }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x00db }
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x00db }
            r0.<init>(r3, r3)     // Catch:{ all -> 0x00db }
            r2.setLayoutParams(r0)     // Catch:{ all -> 0x00db }
            goto L_0x0062
        L_0x0051:
            r11 = 2131627183(0x7f0e0caf, float:1.8881623E38)
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x00db }
            r9.<init>(r3, r3)     // Catch:{ all -> 0x00db }
            android.view.View r2 = X.2Su.A01(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00db }
            X.0qQ.A0C(r2, r5)     // Catch:{ all -> 0x00db }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x00db }
        L_0x0062:
            X.6kx r3 = new X.6kx     // Catch:{ IllegalArgumentException -> 0x0098 }
            r3.<init>(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r3.A1q     // Catch:{ IllegalArgumentException -> 0x0098 }
            r0.setCornerRadius(r12)     // Catch:{ IllegalArgumentException -> 0x0098 }
            r1 = r18
            if (r18 == 0) goto L_0x0077
            com.instagram.feed.widget.IgProgressImageView r0 = r3.BGP()     // Catch:{ IllegalArgumentException -> 0x0098 }
            r0.setPostProcessor(r1)     // Catch:{ IllegalArgumentException -> 0x0098 }
        L_0x0077:
            r1 = r16
            if (r16 == 0) goto L_0x0082
            com.instagram.feed.widget.IgProgressImageView r0 = r3.BGP()     // Catch:{ IllegalArgumentException -> 0x0098 }
            r0.setProgressiveImageConfig(r1)     // Catch:{ IllegalArgumentException -> 0x0098 }
        L_0x0082:
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r1 = r3.A1r     // Catch:{ IllegalArgumentException -> 0x0098 }
            r0 = 0
            r1.setLayerType(r13, r0)     // Catch:{ IllegalArgumentException -> 0x0098 }
            r2.setTag(r3)     // Catch:{ all -> 0x00db }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0097
            r0 = 992791641(0x3b2ccc59, float:0.0026366918)
            X.0fS.A00(r0)
        L_0x0097:
            return r2
        L_0x0098:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r1.<init>()     // Catch:{ all -> 0x00db }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00db }
            r1.append(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "\n|- Organic item View Hierarchy on "
            r1.append(r0)     // Catch:{ all -> 0x00db }
            if (r19 == 0) goto L_0x00b2
            java.lang.String r0 = r19.name()     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x00b4
        L_0x00b2:
            X.3BQ r0 = X.AnonymousClass3BQ.UNKNOWN     // Catch:{ all -> 0x00db }
        L_0x00b4:
            r1.append(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = " -|\n"
            r1.append(r0)     // Catch:{ all -> 0x00db }
            X.0qQ.A0B(r2, r12)     // Catch:{ all -> 0x00db }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r0.<init>()     // Catch:{ all -> 0x00db }
            X.C49106EpV.A00(r2, r0, r12)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00db }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00db }
            r1.append(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00db }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00db }
            r0.<init>(r1)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x00e8
            r0 = -875708474(0xffffffffcbcdbfc6, float:-2.6967948E7)
            X.0fS.A00(r0)
        L_0x00e8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315686kL.A00(android.app.Activity, android.view.ViewGroup, X.3gz, com.instagram.common.session.UserSession, X.2hc, X.3BQ, java.lang.Integer):android.view.ViewGroup");
    }

    public static final void A01(AnonymousClass0iw r23, C229392nJ r24, UserSession userSession, AnonymousClass34Y r26, C255773uh r27, C250973mM r28, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r30, C231002qi r31, C230882qT r32, C310016aI r33, C309426Yf r34, C317566nT r35, C317116mk r36, C316006kx r37, C317286n1 r38, AnonymousClass6a7 r39, C309936a9 r40, String str, int i, int i2, int i3, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C316006kx r4 = r37;
        0qQ.A0B(r4, 1);
        C255773uh r15 = r27;
        0qQ.A0B(r15, 3);
        ReelViewerConfig reelViewerConfig2 = reelViewerConfig;
        0qQ.A0B(reelViewerConfig2, 5);
        C317116mk r5 = r36;
        0qQ.A0B(r5, 9);
        C317566nT r6 = r35;
        0qQ.A0B(r6, 11);
        AnonymousClass3BQ r7 = r30;
        0qQ.A0B(r7, 12);
        AnonymousClass0iw r12 = r23;
        0qQ.A0B(r12, 14);
        String str2 = str;
        0qQ.A0B(str2, 17);
        0qQ.A0B(r26, 19);
        C229392nJ r13 = r24;
        0qQ.A0B(r13, 22);
        if (Systrace.A0E(1)) {
            0fS.A01("ReelViewerItemBinder.bindView", -2015708394);
        }
        try {
            C230882qT r20 = r32;
            C231002qi r19 = r31;
            C250973mM r0 = r28;
            int i4 = i3;
            int i5 = i2;
            int i6 = i;
            C309936a9 r282 = r40;
            AnonymousClass6a7 r272 = r39;
            C317286n1 r262 = r38;
            C317566nT r232 = r6;
            C317116mk r242 = r5;
            C316006kx r25 = r4;
            String str3 = str2;
            AnonymousClass3BQ r18 = r7;
            ReelViewerConfig reelViewerConfig3 = reelViewerConfig2;
            C250973mM r16 = r0;
            A00.A02(r12, r13, userSession2, r15, r16, reelViewerConfig3, r18, r19, r20, r33, r34, r232, r242, r25, r262, r272, r282, str3, 0.0f, i6, i5, i4, z, false, z2);
            r5.DzR(r15, r0, r4, false);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-898322379);
            }
        }
    }

    public static final void A04(C229392nJ r21, UserSession userSession, AnonymousClass34Y r23, C255773uh r24, C250973mM r25, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r27, C316006kx r28, float f, int i, int i2, boolean z, boolean z2) {
        C316006kx r3 = r28;
        0qQ.A0B(r3, 1);
        C255773uh r10 = r24;
        0qQ.A0B(r10, 3);
        AnonymousClass3BQ r13 = r27;
        0qQ.A0B(r13, 5);
        0qQ.A0B(r23, 11);
        C229392nJ r8 = r21;
        0qQ.A0B(r8, 12);
        if (Systrace.A0E(1)) {
            0fS.A01("ReelViewerItemBinder.bindViewAsAnimationShim", 1537503594);
        }
        try {
            C315686kL r6 = A00;
            C309426Yf r1 = new C309426Yf(true);
            C317116mk r19 = C317116mk.A01;
            C309426Yf r17 = r1;
            r6.A02(new 0xG("reel_animator"), r8, userSession, r10, r25, reelViewerConfig, r13, (C231002qi) null, (C230882qT) null, (C310016aI) null, r17, C317566nT.A01, r19, r3, (C317286n1) null, (AnonymousClass6a7) null, (C309936a9) null, "", f, i, i2, -1, z, true, z2);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1781502634);
            }
        }
    }

    public static final void A03(AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C250973mM r7, C317116mk r8, C316006kx r9) {
        FollowButtonBase followButtonBase;
        int i;
        User user;
        Reel reel = r7.A0H;
        if (reel.A0P == ReelType.A0i || (reel.A0u() && (user = r6.A0i) != null && user.B6o() == FollowStatus.A06)) {
            View view = r9.A04;
            if (view == null) {
                View inflate = r9.A0b.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
                view = (FollowButton) inflate;
                r9.A04 = view;
            }
            FollowButtonBase followButtonBase2 = (FollowButtonBase) view;
            if (followButtonBase2 != null) {
                C267064at r1 = followButtonBase2.A0J;
                r1.A04 = r6.A0b;
                r1.A07(r8);
                r1.A0K = reel.A0H(userSession);
                r1.A03(r4, userSession, r6.A0i);
                i = 0;
                followButtonBase = followButtonBase2;
            } else {
                return;
            }
        } else {
            View view2 = r9.A04;
            if (view2 != null) {
                i = 8;
                followButtonBase = view2;
            } else {
                return;
            }
        }
        followButtonBase.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.A0C.AdL() == null) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (X.C318996ps.A00().A04(r12) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (X.2R8.A05(r12, r0) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        if (X.AnonymousClass37B.A01(r12, true) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r0.A0C.AdL() == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(com.instagram.common.session.UserSession r26, X.C255773uh r27, X.C250973mM r28, com.instagram.model.reels.ReelViewerConfig r29, X.C316006kx r30) {
        /*
            r25 = this;
            r11 = r27
            com.instagram.user.model.User r5 = r11.A0i
            X.0eE r0 = X.AnonymousClass0t1.A01
            r12 = r26
            com.instagram.user.model.User r4 = r0.A01(r12)
            X.3QO r1 = r11.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x002f
            X.3QO r1 = r11.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 != r0) goto L_0x03c8
            boolean r0 = X.0qQ.A0K(r5, r4)
            if (r0 != 0) goto L_0x03c8
            X.1Xj r0 = r11.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.AdL()
            if (r0 != 0) goto L_0x03c8
        L_0x002f:
            r3 = 1
        L_0x0030:
            X.3QO r0 = r11.A0B()
            X.3QO r1 = X.AnonymousClass3QO.CUSTOM
            if (r0 != r1) goto L_0x003e
            boolean r0 = X.0qQ.A0K(r5, r4)
            if (r0 != 0) goto L_0x0057
        L_0x003e:
            X.3QO r0 = r11.A0B()
            if (r0 != r1) goto L_0x03c5
            boolean r0 = X.0qQ.A0K(r5, r4)
            if (r0 != 0) goto L_0x03c5
            X.1Xj r0 = r11.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.AdL()
            if (r0 == 0) goto L_0x03c5
        L_0x0057:
            r13 = 1
        L_0x0058:
            X.3QO r1 = r11.A0B()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x0070
            X.1q7 r0 = X.1q7.A03
            if (r0 == 0) goto L_0x0070
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A04(r12)
            r23 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r23 = 0
        L_0x0072:
            r0 = r28
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r0 = r0.A0g()
            r7 = 0
            if (r0 != 0) goto L_0x0092
            X.1Xj r0 = r11.A0b
            if (r0 == 0) goto L_0x03c2
            com.instagram.user.model.User r0 = r0.A2A(r12)
            if (r0 == 0) goto L_0x03c2
            java.lang.String r0 = r0.getId()
        L_0x008b:
            boolean r0 = X.2R8.A05(r12, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            X.3QO r1 = r11.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 != r0) goto L_0x00a6
            if (r2 == 0) goto L_0x00a6
            r0 = 1
            boolean r0 = X.AnonymousClass37B.A01(r12, r0)
            r22 = 1
            if (r0 != 0) goto L_0x00a8
        L_0x00a6:
            r22 = 0
        L_0x00a8:
            r9 = 8
            r10 = r30
            android.view.View r6 = r10.A01
            if (r3 == 0) goto L_0x03b4
            if (r6 != 0) goto L_0x00ba
            android.view.ViewStub r0 = r10.A0Y
            android.view.View r6 = r0.inflate()
            r10.A01 = r6
        L_0x00ba:
            if (r6 == 0) goto L_0x03cb
            android.content.Context r1 = r6.getContext()
            r0 = 2131231421(0x7f0802bd, float:1.8078923E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r6.setBackground(r0)
            r0 = 2131430333(0x7f0b0bbd, float:1.8482364E38)
            android.view.View r3 = r6.requireViewById(r0)
            X.0qQ.A07(r3)
            r0 = 2131430330(0x7f0b0bba, float:1.8482358E38)
            android.view.View r2 = r6.requireViewById(r0)
            X.0qQ.A07(r2)
            r1 = 0
            r3.setVisibility(r1)
            r0 = r29
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x03a6
            r0 = 1
            r6.setClickable(r0)
            r6.setEnabled(r0)
            X.Dg7 r0 = new X.Dg7
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r6)
            r2.setVisibility(r1)
        L_0x00fa:
            r6.setVisibility(r1)
            java.lang.Runnable r0 = r10.A1t
            r6.post(r0)
        L_0x0102:
            boolean r21 = X.0qQ.A0K(r5, r4)
            X.2eb r8 = r10.A0i
            if (r13 == 0) goto L_0x039c
            android.view.View r7 = r8.A01()
            X.0qQ.A07(r7)
            r0 = 2131438246(0x7f0b2aa6, float:1.8498413E38)
            android.view.View r20 = r7.requireViewById(r0)
            X.0qQ.A07(r20)
            r0 = 2131438250(0x7f0b2aaa, float:1.8498422E38)
            android.view.View r6 = r7.requireViewById(r0)
            X.0qQ.A07(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131438245(0x7f0b2aa5, float:1.8498411E38)
            android.view.View r13 = r7.requireViewById(r0)
            X.0qQ.A07(r13)
            android.content.Context r19 = r20.getContext()
            android.content.res.Resources r2 = r19.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r2 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r19.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r0)
            r5 = 0
            r1.setMarginEnd(r5)
            r0 = r20
            r0.setLayoutParams(r1)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.0qQ.A0C(r0, r4)
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r0)
            r2.setMarginStart(r5)
            android.content.Context r18 = r7.getContext()
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginEnd(r0)
            r7.setLayoutParams(r2)
            r13.setVisibility(r5)
            X.2eb r0 = r10.A0h
            r24 = r0
            android.view.View r3 = r24.A01()
            X.0qQ.A07(r3)
            r0 = 2131438250(0x7f0b2aaa, float:1.8498422E38)
            android.view.View r2 = r3.requireViewById(r0)
            X.0qQ.A07(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.0Tu r17 = X.0Tu.A05
            r0 = 36319901312556751(0x8108c200031ecf, double:3.032190066340198E-306)
            r14 = r17
            boolean r0 = X.182.A06(r14, r12, r0)
            if (r0 == 0) goto L_0x0391
            r6.setVisibility(r5)
            r2.setVisibility(r5)
            java.lang.String r14 = ""
            int r0 = X.AnonymousClass0nB.A01(r18)
            double r0 = (double) r0
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r0 = r0 / r15
            int r0 = X.AnonymousClass1GB.A00(r0)
            r6.setText(r14)
            r6.setMaxWidth(r0)
            r2.setText(r14)
            r2.setMaxWidth(r0)
            X.1Xj r0 = r11.A0b
            if (r0 == 0) goto L_0x0231
            X.1Xy r0 = r0.A0C
            X.DSP r0 = r0.C1N()
            if (r0 == 0) goto L_0x0231
            java.util.List r0 = r0.AdE()
            java.util.Iterator r16 = r0.iterator()
        L_0x01dc:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r15 = r16.next()
            X.DTS r15 = (X.DTS) r15
            com.instagram.api.schemas.StoryTextAttributionType r1 = r15.AdA()
            com.instagram.api.schemas.StoryTextAttributionType r0 = com.instagram.api.schemas.StoryTextAttributionType.MULTIPLE_LISTS
            if (r1 != r0) goto L_0x01dc
            java.lang.String r14 = r15.getText()
        L_0x01f4:
            int r0 = r14.length()
            if (r0 <= 0) goto L_0x0231
            android.content.res.Resources r15 = r19.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            r1 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r15 = r15.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r19.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r0)
            android.content.res.Resources r15 = r19.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r15.getDimensionPixelSize(r0)
            r1.setMarginEnd(r0)
            r0 = r20
            r0.setLayoutParams(r1)
            r13.setVisibility(r9)
            r6.setText(r14)
            r2.setText(r14)
        L_0x0231:
            X.FLq r0 = new X.FLq
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r7)
            X.FLr r0 = new X.FLr
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r3)
            r0 = 36319901313474265(0x8108c200111ed9, double:3.0321900669204374E-306)
            r13 = r17
            boolean r0 = X.182.A06(r13, r12, r0)
            if (r0 == 0) goto L_0x034f
            java.lang.CharSequence r0 = r2.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x038b
            if (r21 != 0) goto L_0x028a
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.0qQ.A0C(r0, r4)
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r0)
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginStart(r0)
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginEnd(r0)
            r3.setLayoutParams(r2)
        L_0x028a:
            r8.A03(r9)
            r0 = r24
            r0.A03(r5)
        L_0x0292:
            if (r23 == 0) goto L_0x0349
            X.2eb r1 = r10.A0j
            android.view.View r2 = r1.A01()
            X.0qQ.A07(r2)
            X.FLt r0 = new X.FLt
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r2)
            r0 = 0
            r1.A03(r0)
            X.1q7 r0 = X.1q7.A03
            if (r0 == 0) goto L_0x02f0
            X.1q7 r0 = X.C318996ps.A00()
            r0.A03()
            android.content.Context r1 = r2.getContext()
            X.0qQ.A07(r1)
            r0 = 2131968843(0x7f13434b, float:1.9574592E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r2.setContentDescription(r0)
            X.1q7 r0 = X.C318996ps.A00()
            X.F1V r3 = r0.A02()
            X.3uh r0 = r10.A08
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0347
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L_0x0347
            java.lang.String r1 = r0.getId()
        L_0x02de:
            X.3uh r0 = r10.A08
            if (r0 == 0) goto L_0x02ed
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x02ed
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x02ed
            r2 = r0
        L_0x02ed:
            r3.A00(r12, r1, r2)
        L_0x02f0:
            X.3oV r0 = r10.A0s
            android.view.View r4 = r0.getView()
            if (r22 == 0) goto L_0x0344
            r0 = 2131429508(0x7f0b0884, float:1.848069E38)
            android.view.View r5 = r4.requireViewById(r0)
            X.0qQ.A07(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r3 = r5.getContext()
            X.0qQ.A07(r3)
            int r2 = X.2Yu.A05(r3)
            r1 = 2131238336(0x7f081dc0, float:1.8092948E38)
            android.graphics.Paint r0 = X.AnonymousClass3JT.A00
            int r0 = r3.getColor(r2)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r3, r1, r0)
            r5.setImageDrawable(r0)
            X.1Xj r0 = r11.A0b
            if (r0 == 0) goto L_0x033f
            X.1Xy r0 = r0.A0C
            X.82k r0 = r0.BAJ()
            if (r0 == 0) goto L_0x033f
            java.lang.String r2 = r0.BAL()
            java.lang.String r1 = r0.getName()
            if (r2 == 0) goto L_0x033f
            if (r1 == 0) goto L_0x033f
            X.FNY r0 = new X.FNY
            r0.<init>(r10, r2, r1)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x033f:
            r0 = 0
        L_0x0340:
            r4.setVisibility(r0)
            return
        L_0x0344:
            r0 = 8
            goto L_0x0340
        L_0x0347:
            r1 = r2
            goto L_0x02de
        L_0x0349:
            X.2eb r0 = r10.A0j
            r0.A03(r9)
            goto L_0x02f0
        L_0x034f:
            java.lang.CharSequence r0 = r6.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x038b
            if (r21 != 0) goto L_0x038b
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.0qQ.A0C(r0, r4)
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r0)
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginStart(r0)
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginEnd(r0)
            r7.setLayoutParams(r2)
        L_0x038b:
            r8.A03(r5)
            r0 = r24
            goto L_0x03a1
        L_0x0391:
            r6.setVisibility(r9)
            r13.setVisibility(r5)
            r2.setVisibility(r9)
            goto L_0x0231
        L_0x039c:
            r8.A03(r9)
            X.2eb r0 = r10.A0h
        L_0x03a1:
            r0.A03(r9)
            goto L_0x0292
        L_0x03a6:
            r6.setClickable(r1)
            r6.setEnabled(r1)
            r6.setOnClickListener(r7)
            r2.setVisibility(r9)
            goto L_0x00fa
        L_0x03b4:
            if (r6 == 0) goto L_0x0102
            r6.setVisibility(r9)
            android.view.View r0 = r10.A01
            if (r0 == 0) goto L_0x0102
            r0.setOnClickListener(r7)
            goto L_0x0102
        L_0x03c2:
            r0 = r7
            goto L_0x008b
        L_0x03c5:
            r13 = 0
            goto L_0x0058
        L_0x03c8:
            r3 = 0
            goto L_0x0030
        L_0x03cb:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315686kL.A05(com.instagram.common.session.UserSession, X.3uh, X.3mM, com.instagram.model.reels.ReelViewerConfig, X.6kx):void");
    }

    private final void A06(UserSession userSession, C255773uh r8, C250973mM r9, C309426Yf r10, C317116mk r11, C316006kx r12) {
        User user = r8.A0i;
        1Xj r3 = r8.A0b;
        C3499182k r2 = null;
        if (r3 != null) {
            r2 = r3.A0C.BAJ();
        }
        if (r8.A0B() != AnonymousClass3QO.HALLPASS || r2 == null || !r9.A0H.A0g() || !AnonymousClass37B.A01(userSession, true) || user == null) {
            View view = r12.A00;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = r12.A00;
        if (view2 == null) {
            View inflate = r12.A0W.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton");
            view2 = (IgdsMediaButton) inflate;
            r12.A00 = view2;
        }
        0qQ.A0C(view2, "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton");
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view2;
        Context context = igdsMediaButton.getContext();
        0qQ.A07(context);
        igdsMediaButton.setEndAddOn(C62567Khx.CAMERA_FILLED);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) context.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height));
        gradientDrawable.setColor(0nH.A07(15395562, 0.25f));
        igdsMediaButton.setBackground(gradientDrawable);
        r10.A0a = false;
        if (r3 != null) {
            AnonymousClass0fU.A00(new C71341Oiq(r3, r10, r11), igdsMediaButton);
        }
        igdsMediaButton.setVisibility(0);
    }

    public static final void A07(UserSession userSession, C316006kx r12, boolean z) {
        View view;
        int i;
        Drawable mutate;
        Drawable mutate2;
        if (z) {
            View view2 = r12.A03;
            if (view2 == null) {
                view2 = r12.A0a.inflate();
                0qQ.A0C(view2, "null cannot be cast to non-null type android.view.View");
                r12.A03 = view2;
            }
            if (view2 != null) {
                Context context = view2.getContext();
                0qQ.A07(context);
                View view3 = r12.A03;
                if (view3 != null) {
                    View requireViewById = view3.requireViewById(R.id.fan_club_badge_background);
                    0qQ.A07(requireViewById);
                    View requireViewById2 = view3.requireViewById(R.id.fan_club_badge_crown);
                    0qQ.A07(requireViewById2);
                    ImageView imageView = (ImageView) requireViewById2;
                    View requireViewById3 = view3.requireViewById(R.id.fan_club_badge_chevron);
                    0qQ.A07(requireViewById3);
                    ImageView imageView2 = (ImageView) requireViewById3;
                    View requireViewById4 = view3.requireViewById(R.id.fan_club_badge_label);
                    0qQ.A07(requireViewById4);
                    TextView textView = (TextView) requireViewById4;
                    C314996jB A002 = C314986jA.A00(userSession);
                    boolean z2 = true;
                    if (textView.getAlpha() == 0.0f || !FC9.A02(ProductType.STORY, A002)) {
                        z2 = false;
                    }
                    Drawable drawable = null;
                    requireViewById.setVisibility(0);
                    requireViewById.setBackground(context.getDrawable(R.drawable.fan_club_badge_background));
                    imageView.setVisibility(0);
                    Drawable drawable2 = context.getDrawable(R.drawable.instagram_crown_pano_filled_12);
                    if (z2) {
                        if (!(drawable2 == null || (mutate2 = drawable2.mutate()) == null)) {
                            mutate2.setColorFilter(AnonymousClass37O.A00(context.getColor(R.color.canvas_bottom_sheet_description_text_color)));
                            drawable = mutate2;
                        }
                        imageView.setImageDrawable(drawable);
                        textView.setVisibility(0);
                        imageView2.setVisibility(0);
                        imageView2.setAlpha(0.0f);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                        ofFloat.setDuration(300);
                        ofFloat.setStartDelay(3000);
                        ofFloat.addUpdateListener(new C71165Oee(imageView2, textView));
                        ofFloat.addListener(new FHJ(ProductType.STORY, A002));
                        ofFloat.start();
                    } else {
                        if (!(drawable2 == null || (mutate = drawable2.mutate()) == null)) {
                            mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(R.color.canvas_bottom_sheet_description_text_color)));
                            drawable = mutate;
                        }
                        imageView.setImageDrawable(drawable);
                        imageView2.setVisibility(0);
                    }
                    View view4 = r12.A03;
                    if (view4 != null) {
                        AnonymousClass0fU.A00(new C50052FLs(r12), view4);
                    }
                    view = r12.A03;
                    if (view != null) {
                        i = 0;
                    } else {
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            view = r12.A03;
            if (view != null) {
                i = 8;
            } else {
                return;
            }
        }
        view.setVisibility(i);
    }

    public static final void A08(C316006kx r1, float f, int i, int i2) {
        SegmentedProgressBar segmentedProgressBar = r1.A1r;
        segmentedProgressBar.setSegments(i);
        segmentedProgressBar.A06(i2, false);
        segmentedProgressBar.setProgress(f);
        segmentedProgressBar.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v293, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v373, resolved type: X.6We} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: X.6X8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v531, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v570, resolved type: X.Ttd} */
    /* JADX WARNING: type inference failed for: r6v105, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v108, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r5v230, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v111, types: [java.lang.Object, X.Vuw] */
    /* JADX WARNING: type inference failed for: r7v436, types: [java.lang.Object, X.WaP] */
    /* JADX WARNING: type inference failed for: r9v117, types: [java.lang.Object, X.Aej] */
    /* JADX WARNING: type inference failed for: r10v108, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r10v109, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r36v66, types: [X.6XZ] */
    /* JADX WARNING: type inference failed for: r36v67, types: [X.6X6] */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:1454|1455|1456|1457|1458|1459|1452) */
    /* JADX WARNING: Code restructure failed: missing block: B:1070:0x20df, code lost:
        if (r16 != null) goto L_0x20e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0434, code lost:
        if (r163.A0H.A1d == false) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1574:0x2d72, code lost:
        if (r187 != false) goto L_0x2d74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1576:0x2d78, code lost:
        if (r13.A0g() == false) goto L_0x2cce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1633:0x2e6e, code lost:
        if (r5.getVisibility() != 0) goto L_0x2e70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1834:0x32fe, code lost:
        if (X.C39575A0r.A00(r4).A00(r7) != false) goto L_0x3300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1976:0x3689, code lost:
        X.AnonymousClass0fU.A00(r10, r11);
        r11.setText(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2004:0x37b1, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x37f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2005:0x37b3, code lost:
        r7 = -550026036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2112:0x3973, code lost:
        if (r5.A1O == false) goto L_0x3a22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2141:0x39e9, code lost:
        if (r6 != null) goto L_0x39eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2152:0x3a1c, code lost:
        if (r6 != null) goto L_0x3a1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2302:0x3caf, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2303:0x3cb0, code lost:
        X.1zE.A00(r21, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b3d, code lost:
        if (r5 == null) goto L_0x0b3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x11c5, code lost:
        if (r160.A18 == false) goto L_0x11c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r155.CVM() != false) goto L_0x003f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1457:0x2b02 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1005:0x1f42  */
    /* JADX WARNING: Removed duplicated region for block: B:1008:0x1f4d A[SYNTHETIC, Splitter:B:1008:0x1f4d] */
    /* JADX WARNING: Removed duplicated region for block: B:1019:0x1f70 A[Catch:{ all -> 0x3cc1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1020:0x1f93 A[Catch:{ all -> 0x3cc1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1081:0x2123 A[Catch:{ all -> 0x3cc1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1107:0x2285  */
    /* JADX WARNING: Removed duplicated region for block: B:1115:0x22b0  */
    /* JADX WARNING: Removed duplicated region for block: B:1119:0x22bc A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1124:0x22dc A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1128:0x22f3 A[SYNTHETIC, Splitter:B:1128:0x22f3] */
    /* JADX WARNING: Removed duplicated region for block: B:1132:0x22fe A[SYNTHETIC, Splitter:B:1132:0x22fe] */
    /* JADX WARNING: Removed duplicated region for block: B:1153:0x234d A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1158:0x235e A[SYNTHETIC, Splitter:B:1158:0x235e] */
    /* JADX WARNING: Removed duplicated region for block: B:1246:0x2534 A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1248:0x254c A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1251:0x2559 A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1254:0x2567 A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1259:0x2573 A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1265:0x2592 A[Catch:{ all -> 0x3ca1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1269:0x259f A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1275:0x25bf A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1278:0x25c8 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1281:0x25d1 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1284:0x25dc A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1287:0x25e5 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1290:0x25ee A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1293:0x25f7 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1296:0x25fe A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1299:0x2605 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1302:0x260c A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1305:0x2613 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1308:0x261a A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1311:0x2623 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1314:0x262c A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1317:0x2635 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1320:0x263e A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1323:0x2647 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1326:0x2650 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1329:0x2659 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1332:0x2666 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1335:0x266f A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1338:0x2678 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1341:0x2681 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1344:0x268a A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1347:0x2693 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1350:0x269c A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1353:0x26a5 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1356:0x26c3 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1359:0x26ca A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1362:0x26d3 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1365:0x26dc A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1368:0x26e5 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1371:0x26ee A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1374:0x26f7 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1377:0x2700 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1380:0x2709 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1383:0x2716 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1386:0x271f A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1389:0x2728 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1392:0x2731 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1395:0x273a A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1398:0x2743 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1401:0x274c A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1404:0x2755 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1407:0x2767 A[Catch:{ all -> 0x3caf }] */
    /* JADX WARNING: Removed duplicated region for block: B:1488:0x2bc9 A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1491:0x2bde A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1494:0x2beb A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1497:0x2bfa A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1512:0x2c4c A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1555:0x2d23 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1557:0x2d31 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1583:0x2d8d A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1588:0x2dc2 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1595:0x2dd5 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1599:0x2de3 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1601:0x2df0 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1602:0x2df6 A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1608:0x2e0e A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1646:0x2ebb A[Catch:{ all -> 0x3c76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1656:0x2ed4 A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1661:0x2ee9 A[SYNTHETIC, Splitter:B:1661:0x2ee9] */
    /* JADX WARNING: Removed duplicated region for block: B:1665:0x2ef3 A[SYNTHETIC, Splitter:B:1665:0x2ef3] */
    /* JADX WARNING: Removed duplicated region for block: B:1679:0x2f2b A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1684:0x2f3b A[SYNTHETIC, Splitter:B:1684:0x2f3b] */
    /* JADX WARNING: Removed duplicated region for block: B:1688:0x2f46 A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1734:0x306d A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1738:0x3079 A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1761:0x30f3 A[Catch:{ all -> 0x2c40, all -> 0x3cb6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1764:0x30ff  */
    /* JADX WARNING: Removed duplicated region for block: B:1767:0x3112  */
    /* JADX WARNING: Removed duplicated region for block: B:1775:0x312e A[Catch:{ all -> 0x3c37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1778:0x313d A[Catch:{ all -> 0x3c37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1779:0x3147 A[Catch:{ all -> 0x3c37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1786:0x31ad A[Catch:{ all -> 0x3c37 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1804:0x3268  */
    /* JADX WARNING: Removed duplicated region for block: B:1807:0x3274  */
    /* JADX WARNING: Removed duplicated region for block: B:1811:0x3282 A[Catch:{ all -> 0x3c23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1818:0x32b9  */
    /* JADX WARNING: Removed duplicated region for block: B:1821:0x32cb  */
    /* JADX WARNING: Removed duplicated region for block: B:1832:0x32f4  */
    /* JADX WARNING: Removed duplicated region for block: B:1840:0x3312  */
    /* JADX WARNING: Removed duplicated region for block: B:1844:0x331e  */
    /* JADX WARNING: Removed duplicated region for block: B:2024:0x37ef A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2028:0x37fb A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2044:0x3846 A[Catch:{ all -> 0x3be7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:2049:0x385c A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2052:0x3868 A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2056:0x387c A[Catch:{ all -> 0x3bdc }] */
    /* JADX WARNING: Removed duplicated region for block: B:2082:0x391a A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2085:0x392b A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2087:0x3935  */
    /* JADX WARNING: Removed duplicated region for block: B:2151:0x3a0d A[Catch:{ all -> 0x3bd1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:2158:0x3a2d A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2161:0x3a39 A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2165:0x3a4d A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2185:0x3aae A[Catch:{ all -> 0x3bc6, all -> 0x3c0b }] */
    /* JADX WARNING: Removed duplicated region for block: B:2189:0x3aba  */
    /* JADX WARNING: Removed duplicated region for block: B:2192:0x3ac6  */
    /* JADX WARNING: Removed duplicated region for block: B:2196:0x3ad4 A[Catch:{ all -> 0x3bba }] */
    /* JADX WARNING: Removed duplicated region for block: B:2197:0x3aef A[Catch:{ all -> 0x3bba }] */
    /* JADX WARNING: Removed duplicated region for block: B:2208:0x3b4c  */
    /* JADX WARNING: Removed duplicated region for block: B:2211:0x3b5f  */
    /* JADX WARNING: Removed duplicated region for block: B:2255:0x3c2f  */
    /* JADX WARNING: Removed duplicated region for block: B:2360:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0ae4  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0d6d A[SYNTHETIC, Splitter:B:468:0x0d6d] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0e11 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0e9b A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0eba A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0f05 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0f0a A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:724:0x16db A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:727:0x16ec A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:730:0x16f5 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:733:0x16ff A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:765:0x17f3 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:776:0x1864 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:779:0x1883 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:803:0x1932 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:806:0x193c A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:813:0x19a4 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:817:0x19b0 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:818:0x19b7 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:819:0x19be A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:825:0x19d6 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:826:0x19da A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:836:0x1a5e A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:933:0x1d27 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:939:0x1d35 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:948:0x1d96 A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:949:0x1d9d A[Catch:{ all -> 0x3ccc }] */
    /* JADX WARNING: Removed duplicated region for block: B:998:0x1f24  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(X.AnonymousClass0iw r165, X.C229392nJ r166, com.instagram.common.session.UserSession r167, X.C255773uh r168, X.C250973mM r169, com.instagram.model.reels.ReelViewerConfig r170, X.AnonymousClass3BQ r171, X.C231002qi r172, X.C230882qT r173, X.C310016aI r174, X.C309426Yf r175, X.C317566nT r176, X.C317116mk r177, X.C316006kx r178, X.C317286n1 r179, X.AnonymousClass6a7 r180, X.C309936a9 r181, java.lang.String r182, float r183, int r184, int r185, int r186, boolean r187, boolean r188, boolean r189) {
        /*
            r164 = this;
            r27 = r166
            r121 = r165
            java.lang.String r32 = r121.getModuleName()
            r2 = 0
            r8 = 4
            r1 = 8
            r33 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x001c
            r3 = 1172495584(0x45e2dce0, float:7259.6094)
            java.lang.String r0 = "ReelViewerItemBinder.unbindHolder"
            X.0fS.A01(r0, r3)
        L_0x001c:
            r26 = r188
            r0 = r178
            r3 = r26
            r0.A0J = r3     // Catch:{ all -> 0x3ce2 }
            android.view.View r3 = r0.A0N     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r8)     // Catch:{ all -> 0x3ce2 }
            r4 = r167
            X.1NN r3 = X.1NM.A00(r4)     // Catch:{ all -> 0x3ce2 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x003f
            X.3oV r3 = r0.A0u     // Catch:{ all -> 0x3ce2 }
            r155 = r3
            boolean r3 = r155.CVM()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x004c
        L_0x003f:
            X.3oV r3 = r0.A0u     // Catch:{ all -> 0x3ce2 }
            r155 = r3
            android.view.View r3 = r155.getView()     // Catch:{ all -> 0x3ce2 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x004c:
            X.1NN r3 = X.1NM.A00(r4)     // Catch:{ all -> 0x3ce2 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x005e
            X.3oV r3 = r0.A11     // Catch:{ all -> 0x3ce2 }
            boolean r3 = r3.CVM()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0067
        L_0x005e:
            X.3oV r3 = r0.A11     // Catch:{ all -> 0x3ce2 }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0067:
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r3 = r0.A1s     // Catch:{ all -> 0x3ce2 }
            r65 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            r35 = 0
            X.6WO r6 = X.AnonymousClass6WO.OTHER     // Catch:{ all -> 0x3ce2 }
            r5 = r3
            r3 = r35
            r5.setUrl(r3, r4, r6)     // Catch:{ all -> 0x3ce2 }
            r163 = r169
            r3 = r163
            r0.A09 = r3     // Catch:{ all -> 0x3ce2 }
            r158 = r177
            r3 = r158
            r0.A0E = r3     // Catch:{ all -> 0x3ce2 }
            r23 = r179
            r3 = r23
            r0.A0I = r3     // Catch:{ all -> 0x3ce2 }
            com.instagram.reels.viewer.common.ReelViewGroup r3 = r0.A1k     // Catch:{ all -> 0x3ce2 }
            r154 = r3
            r5 = r3
            r3 = r158
            r5.A92(r3)     // Catch:{ all -> 0x3ce2 }
            r5 = r35
            r3 = r154
            r3.A00 = r5     // Catch:{ all -> 0x3ce2 }
            r3.setUserSession(r4)     // Catch:{ all -> 0x3ce2 }
            r29 = 0
            r5 = r3
            r6 = r35
            r3 = r29
            r5.A08(r6, r3)     // Catch:{ all -> 0x3ce2 }
            r161 = r171
            r3 = r161
            r0.A0A = r3     // Catch:{ all -> 0x3ce2 }
            X.6m5 r3 = r0.A19     // Catch:{ all -> 0x3ce2 }
            r64 = r3
            X.3oV r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mJ r5 = r0.A1K     // Catch:{ all -> 0x3ce2 }
            r5.A08 = r6     // Catch:{ all -> 0x3ce2 }
            X.2eb r3 = r5.A0A     // Catch:{ all -> 0x3ce2 }
            r153 = r3
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            X.6m6 r3 = r0.A1Y     // Catch:{ all -> 0x3ce2 }
            r152 = r3
            X.2eb r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r151 = r3
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            X.6m7 r3 = r0.A1c     // Catch:{ all -> 0x3ce2 }
            r150 = r3
            X.2eb r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r149 = r3
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            X.6lA r3 = r0.A1e     // Catch:{ all -> 0x3ce2 }
            r148 = r3
            X.6lD r3 = r3.A1j     // Catch:{ all -> 0x3ce2 }
            r147 = r3
            X.2eb r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r146 = r3
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            r3 = r148
            X.6lF r3 = r3.A1k     // Catch:{ all -> 0x3ce2 }
            r145 = r3
            X.3oV r3 = r3.A01     // Catch:{ all -> 0x3ce2 }
            r144 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            r3 = r148
            X.6lG r3 = r3.A1i     // Catch:{ all -> 0x3ce2 }
            r143 = r3
            X.3oV r3 = r3.A01     // Catch:{ all -> 0x3ce2 }
            r142 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            r3 = r148
            X.6lJ r3 = r3.A1l     // Catch:{ all -> 0x3ce2 }
            r141 = r3
            X.3oV r3 = r3.A00     // Catch:{ all -> 0x3ce2 }
            r140 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mV r11 = r0.A1g     // Catch:{ all -> 0x3ce2 }
            X.3oV r3 = r11.A00     // Catch:{ all -> 0x3ce2 }
            r22 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mW r15 = r0.A1X     // Catch:{ all -> 0x3ce2 }
            X.3oV r3 = r15.A00     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.4Wn r3 = r0.A1O     // Catch:{ all -> 0x3ce2 }
            r63 = r3
            r63.A01()     // Catch:{ all -> 0x3ce2 }
            X.4Wp r3 = r0.A1N     // Catch:{ all -> 0x3ce2 }
            r62 = r3
            r62.A01()     // Catch:{ all -> 0x3ce2 }
            X.6m9 r3 = r0.A16     // Catch:{ all -> 0x3ce2 }
            r61 = r3
            android.widget.FrameLayout r3 = r3.A00     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mA r9 = r0.A13     // Catch:{ all -> 0x3ce2 }
            if (r9 == 0) goto L_0x013d
            X.2eb r3 = r9.A00     // Catch:{ all -> 0x3ce2 }
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x013d:
            X.6nQ r3 = r0.A1b     // Catch:{ all -> 0x3ce2 }
            r60 = r3
            android.view.View r3 = r3.A01     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.4X0 r3 = r0.A1T     // Catch:{ all -> 0x3ce2 }
            r59 = r3
            r59.A06()     // Catch:{ all -> 0x3ce2 }
            X.6mB r3 = r0.A1J     // Catch:{ all -> 0x3ce2 }
            r58 = r3
            r3.A04(r4)     // Catch:{ all -> 0x3ce2 }
            X.6mH r3 = r0.A1M     // Catch:{ all -> 0x3ce2 }
            r139 = r3
            X.3oV r3 = r3.A04     // Catch:{ all -> 0x3ce2 }
            r138 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.4Wv r3 = r0.A1U     // Catch:{ all -> 0x3ce2 }
            r57 = r3
            X.3oV r3 = r3.A09     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.4Wi r3 = r0.A14     // Catch:{ all -> 0x3ce2 }
            r56 = r3
            android.view.View r3 = r3.A03     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mL r3 = r0.A1a     // Catch:{ all -> 0x3ce2 }
            r55 = r3
            android.widget.FrameLayout r3 = r3.A00     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x017c
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x017c:
            X.6mM r3 = r0.A1h     // Catch:{ all -> 0x3ce2 }
            r54 = r3
            com.instagram.common.ui.base.IgSimpleImageView r3 = r3.A00     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0187
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0187:
            X.6mR r3 = r0.A1S     // Catch:{ all -> 0x3ce2 }
            r137 = r3
            android.view.ViewStub r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mO r3 = r0.A1R     // Catch:{ all -> 0x3ce2 }
            r136 = r3
            android.view.ViewStub r3 = r3.A04     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mQ r3 = r0.A1Q     // Catch:{ all -> 0x3ce2 }
            r135 = r3
            com.instagram.common.ui.base.IgFrameLayout r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mK r3 = r0.A1i     // Catch:{ all -> 0x3ce2 }
            r134 = r3
            X.2eb r3 = r3.A01     // Catch:{ all -> 0x3ce2 }
            r133 = r3
            android.view.View r3 = r3.A00     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x01b7
            com.instagram.common.ui.base.IgFrameLayout r3 = r134.A00()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x01b7
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x01b7:
            X.6ma r3 = r0.A1A     // Catch:{ all -> 0x3ce2 }
            r53 = r3
            X.2eb r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r52 = r3
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mX r3 = r0.A17     // Catch:{ all -> 0x3ce2 }
            r51 = r3
            r51.A02()     // Catch:{ all -> 0x3ce2 }
            X.6mY r3 = r0.A1I     // Catch:{ all -> 0x3ce2 }
            r50 = r3
            X.C316996mY.A00(r50)     // Catch:{ all -> 0x3ce2 }
            X.3oV r3 = r3.A02     // Catch:{ all -> 0x3ce2 }
            r49 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.0eM r3 = r0.A1u     // Catch:{ all -> 0x3ce2 }
            r21 = r3
            boolean r3 = r21.CVQ()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0248
            java.lang.Object r7 = r21.getValue()     // Catch:{ all -> 0x3ce2 }
            X.6Ut r7 = (X.C308566Ut) r7     // Catch:{ all -> 0x3ce2 }
            boolean r3 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x01f5
            r6 = 1724215907(0x66c57263, float:4.6620813E23)
            java.lang.String r3 = "SuperlativeCardViewManager.hideAllViewStubs"
            X.0fS.A01(r3, r6)     // Catch:{ all -> 0x3ce2 }
        L_0x01f5:
            java.util.Map r3 = r7.A08     // Catch:{ all -> 0x022e }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x022e }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x022e }
        L_0x01ff:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x022e }
            if (r3 == 0) goto L_0x023c
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x022e }
            X.6V7 r3 = (X.AnonymousClass6V7) r3     // Catch:{ all -> 0x022e }
            X.6Uv r10 = r3.A00     // Catch:{ all -> 0x022e }
            X.3oV r3 = r10.A07     // Catch:{ all -> 0x022e }
            r3.setVisibility(r1)     // Catch:{ all -> 0x022e }
            X.0eM r3 = r10.A0C     // Catch:{ all -> 0x022e }
            java.lang.Object r6 = r3.getValue()     // Catch:{ all -> 0x022e }
            X.6V8 r6 = (X.AnonymousClass6V8) r6     // Catch:{ all -> 0x022e }
            X.6V9 r3 = X.AnonymousClass6V9.A00     // Catch:{ all -> 0x022e }
            X.AnonymousClass6V8.A00(r6, r3)     // Catch:{ all -> 0x022e }
            X.0s0 r7 = r10.A0D     // Catch:{ all -> 0x022e }
            X.0YZ[] r6 = X.C308586Uv.A0I     // Catch:{ all -> 0x022e }
            r3 = 1
            r6 = r6[r3]     // Catch:{ all -> 0x022e }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x022e }
            r7.Epx(r10, r3, r6)     // Catch:{ all -> 0x022e }
            goto L_0x01ff
        L_0x022e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3ce2 }
            if (r0 == 0) goto L_0x023b
            r0 = -1419297651(0xffffffffab673c8d, float:-8.2151717E-13)
            X.0fS.A00(r0)     // Catch:{ all -> 0x3ce2 }
        L_0x023b:
            throw r1     // Catch:{ all -> 0x3ce2 }
        L_0x023c:
            boolean r3 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0248
            r3 = -319074786(0xffffffffecfb4e1e, float:-2.4304742E27)
            X.0fS.A00(r3)     // Catch:{ all -> 0x3ce2 }
        L_0x0248:
            X.6mb r3 = r0.A1n     // Catch:{ all -> 0x3ce2 }
            r132 = r3
            android.view.View r3 = r3.A01     // Catch:{ all -> 0x3ce2 }
            r131 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mc r3 = r0.A1m     // Catch:{ all -> 0x3ce2 }
            r130 = r3
            r3.A00(r2)     // Catch:{ all -> 0x3ce2 }
            X.6md r3 = r0.A1o     // Catch:{ all -> 0x3ce2 }
            r129 = r3
            android.view.View r3 = r3.A03     // Catch:{ all -> 0x3ce2 }
            r128 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mf r3 = r0.A1l     // Catch:{ all -> 0x3ce2 }
            r127 = r3
            android.view.View r3 = r3.A00     // Catch:{ all -> 0x3ce2 }
            r126 = r3
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.6mS r6 = r0.A1d     // Catch:{ all -> 0x3ce2 }
            com.instagram.common.ui.base.IgLinearLayout r3 = r6.A00     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0279
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0279:
            X.6mi r12 = r0.A0H     // Catch:{ all -> 0x3ce2 }
            if (r12 == 0) goto L_0x0282
            X.3oV r3 = r12.A0C     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0282:
            X.6mj r10 = r0.A0F     // Catch:{ all -> 0x3ce2 }
            if (r10 == 0) goto L_0x028b
            X.3oV r3 = r10.A04     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x028b:
            X.UDi r3 = r0.A06     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0294
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r3 = r3.A04     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0294:
            android.widget.ImageView r3 = r0.A05     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x029b
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x029b:
            r3 = r148
            X.6lK r7 = r3.A0n     // Catch:{ all -> 0x3ce2 }
            com.instagram.common.session.UserSession r13 = r7.A01     // Catch:{ all -> 0x3ce2 }
            boolean r3 = X.C317336n6.A00(r13)     // Catch:{ all -> 0x3ce2 }
            if (r3 != 0) goto L_0x02de
            X.0eM r3 = r7.A06     // Catch:{ all -> 0x3ce2 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x3ce2 }
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x02b4
            r3.setVisibility(r8)     // Catch:{ all -> 0x3ce2 }
        L_0x02b4:
            boolean r3 = X.C317336n6.A00(r13)     // Catch:{ all -> 0x3ce2 }
            if (r3 != 0) goto L_0x02de
            X.0eM r7 = r7.A08     // Catch:{ all -> 0x3ce2 }
            java.lang.Object r3 = r7.getValue()     // Catch:{ all -> 0x3ce2 }
            X.61R r3 = (X.AnonymousClass61R) r3     // Catch:{ all -> 0x3ce2 }
            X.61U r3 = r3.A03     // Catch:{ all -> 0x3ce2 }
            boolean r3 = r3.isRunning()     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x02de
            java.lang.Object r3 = r7.getValue()     // Catch:{ all -> 0x3ce2 }
            X.61R r3 = (X.AnonymousClass61R) r3     // Catch:{ all -> 0x3ce2 }
            r3.stop()     // Catch:{ all -> 0x3ce2 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x3ce2 }
            X.61R r7 = (X.AnonymousClass61R) r7     // Catch:{ all -> 0x3ce2 }
            r3 = r29
            r7.EL2(r3)     // Catch:{ all -> 0x3ce2 }
        L_0x02de:
            android.view.View r3 = r0.A01     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x02e5
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x02e5:
            X.2eb r3 = r0.A0j     // Catch:{ all -> 0x3ce2 }
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            X.3oV r3 = r0.A0s     // Catch:{ all -> 0x3ce2 }
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
            X.2eb r3 = r0.A0i     // Catch:{ all -> 0x3ce2 }
            r3.A03(r1)     // Catch:{ all -> 0x3ce2 }
            android.view.View r3 = r0.A03     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x02fb
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x02fb:
            android.view.View r3 = r0.A00     // Catch:{ all -> 0x3ce2 }
            if (r3 == 0) goto L_0x0302
            r3.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0302:
            r3 = r168
            boolean r7 = r3.A1s(r4)     // Catch:{ all -> 0x3ce2 }
            if (r7 != 0) goto L_0x0315
            X.3oV r7 = r0.A0t     // Catch:{ all -> 0x3ce2 }
            boolean r8 = r7.CVM()     // Catch:{ all -> 0x3ce2 }
            if (r8 == 0) goto L_0x0315
            r7.setVisibility(r1)     // Catch:{ all -> 0x3ce2 }
        L_0x0315:
            X.0xi r30 = X.0tS.A4E     // Catch:{ all -> 0x3ce2 }
            X.0tS r13 = r30.A00()     // Catch:{ all -> 0x3ce2 }
            X.0s0 r8 = r13.A2x     // Catch:{ all -> 0x3ce2 }
            X.0YZ[] r20 = X.0tS.A4G     // Catch:{ all -> 0x3ce2 }
            r7 = 10
            r7 = r20[r7]     // Catch:{ all -> 0x3ce2 }
            java.lang.Object r7 = r8.CDM(r13, r7)     // Catch:{ all -> 0x3ce2 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x3ce2 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x3ce2 }
            if (r7 == 0) goto L_0x0356
            boolean r7 = X.2R8.A00(r4)     // Catch:{ all -> 0x3ce2 }
            if (r7 == 0) goto L_0x0356
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3ce2 }
            r8 = 1234567(0x12d687, float:1.729997E-39)
            android.view.View r7 = r7.findViewById(r8)     // Catch:{ all -> 0x3ce2 }
            if (r7 == 0) goto L_0x0356
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3ce2 }
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ all -> 0x3ce2 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3ce2 }
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8     // Catch:{ all -> 0x3ce2 }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3ce2 }
            r7.removeView(r8)     // Catch:{ all -> 0x3ce2 }
        L_0x0356:
            X.6Yf r8 = r0.A0C     // Catch:{ all -> 0x3ce2 }
            r160 = r175
            if (r8 == 0) goto L_0x0363
            r7 = r160
            if (r8 == r7) goto L_0x0363
            r8.A04(r0)     // Catch:{ all -> 0x3ce2 }
        L_0x0363:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x036f
            r7 = -1308810681(0xffffffffb1fd2247, float:-7.367166E-9)
            X.0fS.A00(r7)
        L_0x036f:
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()
            android.content.Context r19 = r7.getContext()
            X.0qQ.A0A(r19)
            r8 = r19
            r7 = r163
            X.C316216lI.A05(r8, r7, r0)
            X.2eb r13 = r0.A0q
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x0391
            r8 = 1785124113(0x6a66d511, float:6.976478E25)
            java.lang.String r7 = "ReelViewerItemBinder.bindZeroRatingDataBanner"
            X.0fS.A01(r7, r8)
        L_0x0391:
            X.3kW r7 = X.AnonymousClass1Qz.A00(r4)     // Catch:{ all -> 0x3cd7 }
            X.1R7 r7 = r7.C82()     // Catch:{ all -> 0x3cd7 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3cd7 }
            java.lang.String r8 = "ig_zero_rating_data_banner"
            java.util.Set r7 = r7.A0C     // Catch:{ all -> 0x3cd7 }
            boolean r8 = r7.contains(r8)     // Catch:{ all -> 0x3cd7 }
            r7 = 8
            if (r8 == 0) goto L_0x03a9
            r7 = 0
        L_0x03a9:
            r13.A03(r7)     // Catch:{ all -> 0x3cd7 }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x03b8
            r7 = 387617954(0x171a94a2, float:4.9947685E-25)
            X.0fS.A00(r7)
        L_0x03b8:
            X.OEM r13 = r0.A0G
            if (r13 == 0) goto L_0x03ef
            X.LNc r8 = X.LNc.A00
            r7 = r163
            java.lang.String r7 = r8.A00(r4, r3, r7)
            if (r7 == 0) goto L_0x03ef
            X.3oV r7 = r13.A00
            r7.setVisibility(r1)
            X.0eM r7 = r13.A02
            java.lang.Object r8 = r7.getValue()
            android.view.View r8 = (android.view.View) r8
            X.DEB r14 = new X.DEB
            r7 = r158
            r14.<init>(r7)
            X.AnonymousClass0fU.A00(r14, r8)
            X.0eM r7 = r13.A01
            java.lang.Object r13 = r7.getValue()
            android.view.View r13 = (android.view.View) r13
            X.DEC r8 = new X.DEC
            r7 = r158
            r8.<init>(r7)
            X.AnonymousClass0fU.A00(r8, r13)
        L_0x03ef:
            X.1Xj r7 = r3.A0b
            r16 = r7
            if (r7 == 0) goto L_0x03fd
            com.instagram.ui.widget.framelayout.MediaFrameLayout r13 = r0.A1p
            r8 = r7
            r7 = r121
            r13.setVideoSource(r8, r7)
        L_0x03fd:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r7 = r0.A1p
            r48 = r7
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A00 = r8
            X.3v7 r14 = r0.A12
            X.C256013v5.A03(r14)
            X.6l8 r8 = r0.A1f
            X.0qQ.A0B(r8, r2)
            android.view.View r7 = r8.A00
            if (r7 == 0) goto L_0x0416
            r7.setVisibility(r1)
        L_0x0416:
            X.0eE r31 = X.AnonymousClass0t1.A01
            r7 = r31
            com.instagram.user.model.User r13 = r7.A01(r4)
            if (r16 == 0) goto L_0x0455
            r7 = r16
            com.instagram.user.model.User r7 = r7.A2A(r4)
        L_0x0426:
            boolean r7 = X.0qQ.A0K(r13, r7)
            if (r7 != 0) goto L_0x0436
            r7 = r163
            com.instagram.model.reels.Reel r7 = r7.A0H
            boolean r7 = r7.A1d
            r118 = 1
            if (r7 != 0) goto L_0x0438
        L_0x0436:
            r118 = 0
        L_0x0438:
            boolean r18 = r3.A1N()
            r17 = 0
            r159 = r176
            r162 = r170
            r156 = r185
            if (r18 == 0) goto L_0x04b1
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x0457
            r6 = 1375326779(0x51f9d23b, float:1.34121742E11)
            java.lang.String r5 = "ReelViewerItemBinder.bindAsPlaceHolder"
            X.0fS.A01(r5, r6)
            goto L_0x0457
        L_0x0455:
            r7 = 0
            goto L_0x0426
        L_0x0457:
            r5 = r35
            r0.A08 = r5     // Catch:{ all -> 0x04a5 }
            r0.A0C = r5     // Catch:{ all -> 0x04a5 }
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x04a5 }
            r5.setVisibility(r2)     // Catch:{ all -> 0x04a5 }
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x04a5 }
            r5.A04()     // Catch:{ all -> 0x04a5 }
            r5 = r163
            boolean r5 = r5.A0E(r4)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0490
            r5 = r163
            com.instagram.model.reels.Reel r5 = r5.A0H     // Catch:{ all -> 0x04a5 }
            boolean r5 = r5.A1X     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0490
            java.lang.String r7 = "reel_story_unavailable"
            r6 = r32
            r5 = r35
            X.LS4.A02(r4, r5, r7, r6)     // Catch:{ all -> 0x04a5 }
            r5 = r160
            r5.A03(r0)     // Catch:{ all -> 0x04a5 }
            r5 = 1
            r6 = r29
            A08(r0, r6, r5, r2)     // Catch:{ all -> 0x04a5 }
            goto L_0x049a
        L_0x0490:
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r5 = r0.A1r     // Catch:{ all -> 0x04a5 }
            r6 = r29
            r5.setProgress(r6)     // Catch:{ all -> 0x04a5 }
            r5.setVisibility(r1)     // Catch:{ all -> 0x04a5 }
        L_0x049a:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x22aa
            r5 = 891913876(0x35298694, float:6.3153243E-7)
            goto L_0x09cb
        L_0x04a5:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = -1736670772(0xffffffff987c81cc, float:-3.2635767E-24)
            goto L_0x3cf7
        L_0x04b1:
            boolean r7 = r3.A16()
            r157 = r184
            if (r7 == 0) goto L_0x0520
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x04c7
            r6 = -829192901(0xffffffffce93853b, float:-1.23749107E9)
            java.lang.String r5 = "ReelViewerItemBinder.bindPendingConfigurationItem"
            X.0fS.A01(r5, r6)
        L_0x04c7:
            r0.A08 = r3     // Catch:{ all -> 0x3ced }
            r5 = r160
            r5.A03(r0)     // Catch:{ all -> 0x3ced }
            r0.A0C = r5     // Catch:{ all -> 0x3ced }
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x3ced }
            r5.A04()     // Catch:{ all -> 0x3ced }
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x3ced }
            r5.setVisibility(r2)     // Catch:{ all -> 0x3ced }
            X.6kL r6 = A00     // Catch:{ all -> 0x3ced }
            boolean r5 = r3.A1D()     // Catch:{ all -> 0x3ced }
            A07(r4, r0, r5)     // Catch:{ all -> 0x3ced }
            r7 = r121
            r8 = r4
            r9 = r3
            r10 = r163
            r11 = r158
            r12 = r0
            A03(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3ced }
            r7 = r4
            r8 = r3
            r9 = r10
            r10 = r160
            r6.A06(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3ced }
            r5 = r6
            r6 = r4
            r7 = r3
            r8 = r9
            r9 = r162
            r10 = r0
            r5.A05(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x3ced }
            r6 = r136
            r5 = r35
            X.AnonymousClass6WX.A00(r3, r6, r5)     // Catch:{ all -> 0x3ced }
            X.6mP r6 = r0.A1P     // Catch:{ all -> 0x3ced }
            X.0qQ.A0B(r6, r2)     // Catch:{ all -> 0x3ced }
            X.AnonymousClass6WY.A00(r4, r3, r6, r5)     // Catch:{ all -> 0x3ced }
            r6 = r135
            X.AnonymousClass6WZ.A00(r3, r5, r6)     // Catch:{ all -> 0x3ced }
            r5 = r137
            X.AnonymousClass6Wa.A00(r3, r5)     // Catch:{ all -> 0x3ced }
            goto L_0x2295
        L_0x0520:
            boolean r7 = r3.A1k()
            r28 = 1
            if (r7 == 0) goto L_0x05a5
            X.3uh r5 = r0.A08
            if (r5 == 0) goto L_0x0584
            X.3mL r5 = r5.A0e
        L_0x052e:
            X.3mL r10 = r3.A0e
            if (r5 != r10) goto L_0x053b
            X.LOb r5 = r3.A0E
            r5.getClass()
            r6 = r28
            r5.A02 = r6
        L_0x053b:
            X.LOb r6 = r3.A0E
            r6.getClass()
            r5 = r163
            boolean r5 = r5.A0D
            r6.A01 = r5
            r0.A08 = r3
            r5 = r160
            r5.A03(r0)
            r0.A0C = r5
            r7 = r29
            r6 = r157
            r5 = r156
            A08(r0, r7, r6, r5)
            r6 = r28
            r5 = r160
            r5.A0l = r6
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()
            r5.A04()
            java.lang.Object r9 = r21.getValue()
            X.6Ut r9 = (X.C308566Ut) r9
            r8 = 5
            X.PqS r7 = new X.PqS
            r6 = r161
            r5 = r158
            r7.<init>((int) r8, (java.lang.Object) r6, (java.lang.Object) r5)
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x0586
            r6 = 177741104(0xa981d30, float:1.4648047E-32)
            java.lang.String r5 = "SuperlativeCardViewManager.bindView"
            X.0fS.A01(r5, r6)
            goto L_0x0586
        L_0x0584:
            r5 = 0
            goto L_0x052e
        L_0x0586:
            java.util.Map r5 = r9.A08     // Catch:{ all -> 0x0599 }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ all -> 0x0599 }
            X.6V7 r5 = (X.AnonymousClass6V7) r5     // Catch:{ all -> 0x0599 }
            if (r5 == 0) goto L_0x09c2
            X.0sJ r6 = r5.A01     // Catch:{ all -> 0x0599 }
            r5 = r121
            r6.invoke(r3, r5, r4, r7)     // Catch:{ all -> 0x0599 }
            goto L_0x09c2
        L_0x0599:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 670760145(0x27fafcd1, float:6.9663043E-15)
            goto L_0x3cf7
        L_0x05a5:
            boolean r7 = r3.A1i()
            if (r7 == 0) goto L_0x07b7
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x05b9
            r6 = -262622305(0xfffffffff058b39f, float:-2.6826364E29)
            java.lang.String r5 = "ReelViewerItemBinder.bindStorySnapshot"
            X.0fS.A01(r5, r6)
        L_0x05b9:
            if (r12 == 0) goto L_0x07ac
            r0.A08 = r3     // Catch:{ all -> 0x07a0 }
            r5 = r160
            r5.A03(r0)     // Catch:{ all -> 0x07a0 }
            r0.A0C = r5     // Catch:{ all -> 0x07a0 }
            r7 = r29
            r6 = r157
            r5 = r156
            A08(r0, r7, r6, r5)     // Catch:{ all -> 0x07a0 }
            r6 = r28
            r5 = r160
            r5.A0l = r6     // Catch:{ all -> 0x07a0 }
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x07a0 }
            r5.A04()     // Catch:{ all -> 0x07a0 }
            X.3IL r7 = r3.A03     // Catch:{ all -> 0x07a0 }
            r7.getClass()     // Catch:{ all -> 0x07a0 }
            X.3oV r11 = r12.A0C     // Catch:{ all -> 0x07a0 }
            android.view.View r6 = r11.getView()     // Catch:{ all -> 0x07a0 }
            r5 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r5 = r6.requireViewById(r5)     // Catch:{ all -> 0x07a0 }
            r12.A00 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A08 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131433208(0x7f0b16f8, float:1.8488195E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r5     // Catch:{ all -> 0x07a0 }
            r12.A0A = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131436351(0x7f0b233f, float:1.849457E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r5     // Catch:{ all -> 0x07a0 }
            r12.A0B = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131428524(0x7f0b04ac, float:1.8478695E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r5     // Catch:{ all -> 0x07a0 }
            r12.A09 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131433209(0x7f0b16f9, float:1.8488197E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgFrameLayout r5 = (com.instagram.common.ui.base.IgFrameLayout) r5     // Catch:{ all -> 0x07a0 }
            r12.A01 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131441838(0x7f0b38ae, float:1.8505699E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A07 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131441837(0x7f0b38ad, float:1.8505697E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A06 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131434622(0x7f0b1c7e, float:1.8491063E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A04 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131427479(0x7f0b0097, float:1.8476575E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A02 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131434953(0x7f0b1dc9, float:1.8491734E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A05 = r5     // Catch:{ all -> 0x07a0 }
            r5 = 2131441522(0x7f0b3772, float:1.8505058E38)
            android.view.View r5 = X.C317096mi.A00(r12, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x07a0 }
            r12.A03 = r5     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A08     // Catch:{ all -> 0x07a0 }
            java.lang.String r14 = "titleText"
            if (r6 == 0) goto L_0x0716
            java.lang.String r5 = r7.A05     // Catch:{ all -> 0x07a0 }
            r6.setText(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A03     // Catch:{ all -> 0x07a0 }
            if (r6 != 0) goto L_0x0680
            java.lang.String r7 = "disclaimer"
        L_0x0678:
            X.0qQ.A0F(r7)     // Catch:{ all -> 0x07a0 }
        L_0x067b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x07a0 }
            throw r0     // Catch:{ all -> 0x07a0 }
        L_0x0680:
            java.lang.String r5 = r7.A06     // Catch:{ all -> 0x07a0 }
            r6.setText(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A07     // Catch:{ all -> 0x07a0 }
            java.lang.String r13 = "storiesCreatedNumber"
            if (r6 == 0) goto L_0x0778
            java.lang.Integer r5 = r7.A00     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x06a1
            int r5 = r5.intValue()     // Catch:{ all -> 0x07a0 }
            java.lang.String r5 = X.C317096mi.A01(r12, r5)     // Catch:{ all -> 0x07a0 }
        L_0x0697:
            r6.setText(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A04     // Catch:{ all -> 0x07a0 }
            if (r6 != 0) goto L_0x06a4
            java.lang.String r7 = "impressions"
            goto L_0x0678
        L_0x06a1:
            r5 = r35
            goto L_0x0697
        L_0x06a4:
            java.lang.Integer r5 = r7.A02     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x06ba
            int r5 = r5.intValue()     // Catch:{ all -> 0x07a0 }
            java.lang.String r5 = X.C317096mi.A01(r12, r5)     // Catch:{ all -> 0x07a0 }
        L_0x06b0:
            r6.setText(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A02     // Catch:{ all -> 0x07a0 }
            if (r6 != 0) goto L_0x06bd
            java.lang.String r7 = "accountsReached"
            goto L_0x0678
        L_0x06ba:
            r5 = r35
            goto L_0x06b0
        L_0x06bd:
            java.lang.Integer r5 = r7.A01     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x06d3
            int r5 = r5.intValue()     // Catch:{ all -> 0x07a0 }
            java.lang.String r5 = X.C317096mi.A01(r12, r5)     // Catch:{ all -> 0x07a0 }
        L_0x06c9:
            r6.setText(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A05     // Catch:{ all -> 0x07a0 }
            if (r6 != 0) goto L_0x06d6
            java.lang.String r7 = "interactions"
            goto L_0x0678
        L_0x06d3:
            r5 = r35
            goto L_0x06c9
        L_0x06d6:
            java.lang.Integer r5 = r7.A03     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x06ec
            int r5 = r5.intValue()     // Catch:{ all -> 0x07a0 }
            java.lang.String r5 = X.C317096mi.A01(r12, r5)     // Catch:{ all -> 0x07a0 }
        L_0x06e2:
            r6.setText(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = r12.A0A     // Catch:{ all -> 0x07a0 }
            if (r6 != 0) goto L_0x06ef
            java.lang.String r7 = "frontImage"
            goto L_0x0678
        L_0x06ec:
            r5 = r35
            goto L_0x06e2
        L_0x06ef:
            r5 = r121
            X.C317096mi.A02(r7, r5, r6, r2)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r8 = r12.A0B     // Catch:{ all -> 0x07a0 }
            if (r8 != 0) goto L_0x06fc
            java.lang.String r7 = "middleImage"
            goto L_0x0678
        L_0x06fc:
            r6 = r5
            r5 = r28
            X.C317096mi.A02(r7, r6, r8, r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r8 = r12.A09     // Catch:{ all -> 0x07a0 }
            if (r8 != 0) goto L_0x070a
            java.lang.String r7 = "backImage"
            goto L_0x0678
        L_0x070a:
            r6 = 2
            r5 = r121
            X.C317096mi.A02(r7, r5, r8, r6)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgFrameLayout r6 = r12.A01     // Catch:{ all -> 0x07a0 }
            if (r6 != 0) goto L_0x071b
            java.lang.String r14 = "frontImageAndSticker"
        L_0x0716:
            X.0qQ.A0F(r14)     // Catch:{ all -> 0x07a0 }
            goto L_0x067b
        L_0x071b:
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.setRotation(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r10 = r12.A0B     // Catch:{ all -> 0x07a0 }
            if (r10 != 0) goto L_0x0727
            java.lang.String r14 = "middleImage"
            goto L_0x0716
        L_0x0727:
            r9 = 1092616192(0x41200000, float:10.0)
            r8 = 1063675494(0x3f666666, float:0.9)
            r7 = -1046478848(0xffffffffc1a00000, float:-20.0)
            android.view.ViewTreeObserver r6 = r10.getViewTreeObserver()     // Catch:{ all -> 0x07a0 }
            X.LYy r5 = new X.LYy     // Catch:{ all -> 0x07a0 }
            r5.<init>(r10, r9, r8, r7)     // Catch:{ all -> 0x07a0 }
            r6.addOnGlobalLayoutListener(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r10 = r12.A09     // Catch:{ all -> 0x07a0 }
            if (r10 != 0) goto L_0x0741
            java.lang.String r14 = "backImage"
            goto L_0x0716
        L_0x0741:
            r9 = 1101004800(0x41a00000, float:20.0)
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            r7 = -1041235968(0xffffffffc1f00000, float:-30.0)
            android.view.ViewTreeObserver r6 = r10.getViewTreeObserver()     // Catch:{ all -> 0x07a0 }
            X.LYy r5 = new X.LYy     // Catch:{ all -> 0x07a0 }
            r5.<init>(r10, r9, r8, r7)     // Catch:{ all -> 0x07a0 }
            r6.addOnGlobalLayoutListener(r5)     // Catch:{ all -> 0x07a0 }
            android.view.View r5 = r12.A00     // Catch:{ all -> 0x07a0 }
            java.lang.String r7 = "rootView"
            if (r5 == 0) goto L_0x0678
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x07a0 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x07a0 }
            X.0qq r6 = X.AnonymousClass0qo.A00(r5)     // Catch:{ all -> 0x07a0 }
            X.0qm r5 = X.0qm.A0V     // Catch:{ all -> 0x07a0 }
            android.graphics.Typeface r6 = r6.A02(r5)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = r12.A07     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x0778
            r5.setTypeface(r6)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r5 = r12.A06     // Catch:{ all -> 0x07a0 }
            if (r5 != 0) goto L_0x077d
            java.lang.String r13 = "storiesCreatedLabel"
        L_0x0778:
            X.0qQ.A0F(r13)     // Catch:{ all -> 0x07a0 }
            goto L_0x067b
        L_0x077d:
            r5.setTypeface(r6)     // Catch:{ all -> 0x07a0 }
            com.instagram.common.ui.base.IgTextView r6 = r12.A08     // Catch:{ all -> 0x07a0 }
            if (r6 == 0) goto L_0x0716
            android.view.View r5 = r12.A00     // Catch:{ all -> 0x07a0 }
            if (r5 == 0) goto L_0x0678
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x07a0 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x07a0 }
            X.0qq r7 = X.AnonymousClass0qo.A00(r5)     // Catch:{ all -> 0x07a0 }
            X.0qm r5 = X.0qm.A0Y     // Catch:{ all -> 0x07a0 }
            android.graphics.Typeface r5 = r7.A02(r5)     // Catch:{ all -> 0x07a0 }
            r6.setTypeface(r5)     // Catch:{ all -> 0x07a0 }
            r11.setVisibility(r2)     // Catch:{ all -> 0x07a0 }
            goto L_0x07ac
        L_0x07a0:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 223242416(0xd4e68b0, float:6.3604664E-31)
            goto L_0x3cf7
        L_0x07ac:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x22aa
            r5 = -107273506(0xfffffffff99b22de, float:-1.0068915E35)
            goto L_0x09cb
        L_0x07b7:
            boolean r7 = r3.A1B()
            if (r7 == 0) goto L_0x09d0
            r5 = r160
            r5.A03(r0)
            r7 = r29
            r6 = r157
            r5 = r156
            A08(r0, r7, r6, r5)
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x07d9
            r6 = -489026454(0xffffffffe2da0c6a, float:-2.0111424E21)
            java.lang.String r5 = "ReelViewerItemBinder.bindStoriesEmptyState"
            X.0fS.A01(r5, r6)
        L_0x07d9:
            if (r10 == 0) goto L_0x09b8
            X.DUq r5 = r3.A06     // Catch:{ all -> 0x09ac }
            if (r5 == 0) goto L_0x09b8
            X.3oV r12 = r10.A04     // Catch:{ all -> 0x09ac }
            android.view.View r6 = r12.getView()     // Catch:{ all -> 0x09ac }
            r5 = 2131432376(0x7f0b13b8, float:1.8486508E38)
            android.view.View r5 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            r10.A00 = r5     // Catch:{ all -> 0x09ac }
            android.view.View r6 = r12.getView()     // Catch:{ all -> 0x09ac }
            r5 = 2131432381(0x7f0b13bd, float:1.8486518E38)
            android.view.View r5 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            r10.A01 = r5     // Catch:{ all -> 0x09ac }
            android.view.View r6 = r12.getView()     // Catch:{ all -> 0x09ac }
            r5 = 2131432377(0x7f0b13b9, float:1.848651E38)
            android.view.View r9 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x09ac }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ all -> 0x09ac }
            r5 = 2131961623(0x7f132717, float:1.9559948E38)
            r9.setText(r5)     // Catch:{ all -> 0x09ac }
            android.content.Context r6 = r9.getContext()     // Catch:{ all -> 0x09ac }
            r5 = 2131238965(0x7f082035, float:1.8094224E38)
            android.graphics.drawable.Drawable r8 = r6.getDrawable(r5)     // Catch:{ all -> 0x09ac }
            if (r8 == 0) goto L_0x0833
            r5 = 2131100036(0x7f060184, float:1.7812442E38)
            int r5 = r6.getColor(r5)     // Catch:{ all -> 0x09ac }
            android.graphics.ColorFilter r5 = X.AnonymousClass37O.A00(r5)     // Catch:{ all -> 0x09ac }
            r8.setColorFilter(r5)     // Catch:{ all -> 0x09ac }
            android.graphics.RectF r5 = X.0nA.A01     // Catch:{ all -> 0x09ac }
            r7 = r35
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r7, r7, r7)     // Catch:{ all -> 0x09ac }
        L_0x0833:
            X.3mL r6 = r3.A0e     // Catch:{ all -> 0x09ac }
            X.3mL r5 = X.C250963mL.EMPTY_STORIES_STATE_CONTACT_IMPORT     // Catch:{ all -> 0x09ac }
            java.lang.String r14 = "suggestedUsersView"
            java.lang.String r13 = "upsellView"
            if (r6 != r5) goto L_0x0912
            android.view.View r6 = r10.A01     // Catch:{ all -> 0x09ac }
            if (r6 == 0) goto L_0x09a0
            android.content.Context r11 = r6.getContext()     // Catch:{ all -> 0x09ac }
            r5 = 2131429678(0x7f0b092e, float:1.8481036E38)
            android.view.View r7 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x09ac }
            r5 = 2131974418(0x7f135912, float:1.95859E38)
            java.lang.String r5 = r11.getString(r5)     // Catch:{ all -> 0x09ac }
            r7.setText(r5)     // Catch:{ all -> 0x09ac }
            r5 = 2131429217(0x7f0b0761, float:1.84801E38)
            android.view.View r5 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x09ac }
            com.instagram.igds.components.bulletcell.IgdsBulletCell r5 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r5     // Catch:{ all -> 0x09ac }
            r9 = 2131100036(0x7f060184, float:1.7812442E38)
            r5.setIconColor(r9)     // Catch:{ all -> 0x09ac }
            r5.setTextColor(r9)     // Catch:{ all -> 0x09ac }
            r5 = 2131429225(0x7f0b0769, float:1.8480117E38)
            android.view.View r5 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x09ac }
            com.instagram.igds.components.bulletcell.IgdsBulletCell r5 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r5     // Catch:{ all -> 0x09ac }
            r5.setIconColor(r9)     // Catch:{ all -> 0x09ac }
            r5.setTextColor(r9)     // Catch:{ all -> 0x09ac }
            r5 = 2131429224(0x7f0b0768, float:1.8480115E38)
            android.view.View r8 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x09ac }
            com.instagram.igds.components.bulletcell.IgdsBulletCell r8 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r8     // Catch:{ all -> 0x09ac }
            r8.setIconColor(r9)     // Catch:{ all -> 0x09ac }
            r6 = 2131974416(0x7f135910, float:1.9585895E38)
            r5 = 2131964893(0x7f1333dd, float:1.956658E38)
            java.lang.String r7 = r11.getString(r5)     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x09ac }
            java.lang.Object[] r5 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x09ac }
            java.lang.String r5 = r11.getString(r6, r5)     // Catch:{ all -> 0x09ac }
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x09ac }
            r6.<init>(r5)     // Catch:{ all -> 0x09ac }
            X.DjB r5 = new X.DjB     // Catch:{ all -> 0x09ac }
            r5.<init>(r11, r4)     // Catch:{ all -> 0x09ac }
            X.AnonymousClass7AV.A05(r6, r5, r7)     // Catch:{ all -> 0x09ac }
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x09ac }
            r5 = r35
            r8.setMovementMethod(r5, r7)     // Catch:{ all -> 0x09ac }
            r8.setText((java.lang.CharSequence) r5, (java.lang.CharSequence) r6)     // Catch:{ all -> 0x09ac }
            r8.setTextColor(r9)     // Catch:{ all -> 0x09ac }
            android.view.View r5 = r10.A01     // Catch:{ all -> 0x09ac }
            if (r5 == 0) goto L_0x09a0
            r5.setVisibility(r2)     // Catch:{ all -> 0x09ac }
            android.view.View r5 = r10.A00     // Catch:{ all -> 0x09ac }
            if (r5 == 0) goto L_0x09a4
            r5.setVisibility(r1)     // Catch:{ all -> 0x09ac }
        L_0x08cd:
            X.6NJ r5 = r10.A02     // Catch:{ all -> 0x09ac }
            if (r5 != 0) goto L_0x0906
            android.view.View r6 = r12.getView()     // Catch:{ all -> 0x09ac }
            r5 = 2131430668(0x7f0b0d0c, float:1.8483043E38)
            android.view.View r9 = r6.requireViewById(r5)     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x09ac }
            android.content.Context r8 = r9.getContext()     // Catch:{ all -> 0x09ac }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x09ac }
            r7 = 2131100632(0x7f0603d8, float:1.781365E38)
            r6 = 2131100629(0x7f0603d5, float:1.7813645E38)
            X.6NJ r5 = new X.6NJ     // Catch:{ all -> 0x09ac }
            r5.<init>(r8, r7, r6)     // Catch:{ all -> 0x09ac }
            r9.setBackground(r5)     // Catch:{ all -> 0x09ac }
            android.animation.ValueAnimator r6 = r5.A03     // Catch:{ all -> 0x09ac }
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x09ac }
            if (r7 != 0) goto L_0x08ff
            r6.start()     // Catch:{ all -> 0x09ac }
        L_0x08ff:
            r10.A02 = r5     // Catch:{ all -> 0x09ac }
        L_0x0901:
            r12.setVisibility(r2)     // Catch:{ all -> 0x09ac }
            goto L_0x09b8
        L_0x0906:
            android.animation.ValueAnimator r5 = r5.A03     // Catch:{ all -> 0x09ac }
            boolean r6 = r5.isRunning()     // Catch:{ all -> 0x09ac }
            if (r6 != 0) goto L_0x0901
            r5.start()     // Catch:{ all -> 0x09ac }
            goto L_0x0901
        L_0x0912:
            X.3mL r5 = X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS     // Catch:{ all -> 0x09ac }
            if (r6 != r5) goto L_0x08cd
            android.view.View r11 = r10.A00     // Catch:{ all -> 0x09ac }
            if (r11 == 0) goto L_0x09a4
            X.6N0 r9 = new X.6N0     // Catch:{ all -> 0x09ac }
            r5 = r35
            r9.<init>(r5)     // Catch:{ all -> 0x09ac }
            r9.A06 = r4     // Catch:{ all -> 0x09ac }
            r5 = r121
            r9.A05 = r5     // Catch:{ all -> 0x09ac }
            r9.A08 = r3     // Catch:{ all -> 0x09ac }
            r5 = r160
            r9.A09 = r5     // Catch:{ all -> 0x09ac }
            r5 = r156
            r9.A00 = r5     // Catch:{ all -> 0x09ac }
            X.4g9 r8 = r3.A09     // Catch:{ all -> 0x09ac }
            if (r8 == 0) goto L_0x0961
            java.util.List r7 = r8.A01()     // Catch:{ all -> 0x09ac }
            int r6 = X.C317106mj.A06     // Catch:{ all -> 0x09ac }
            int r5 = r7.size()     // Catch:{ all -> 0x09ac }
            if (r6 >= r5) goto L_0x0961
            int r5 = X.C317106mj.A06     // Catch:{ all -> 0x09ac }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x09ac }
            X.6Nx r5 = (X.C306886Nx) r5     // Catch:{ all -> 0x09ac }
            X.6Nw r5 = (X.C306876Nw) r5     // Catch:{ all -> 0x09ac }
            com.instagram.user.model.User r5 = r5.A02     // Catch:{ all -> 0x09ac }
            java.lang.String r6 = r5.getId()     // Catch:{ all -> 0x09ac }
            java.lang.String r5 = X.C317106mj.A05     // Catch:{ all -> 0x09ac }
            boolean r5 = X.0qQ.A0K(r6, r5)     // Catch:{ all -> 0x09ac }
            if (r5 == 0) goto L_0x0961
            X.6Yf r6 = r9.A09     // Catch:{ all -> 0x09ac }
            if (r6 == 0) goto L_0x0961
            int r5 = X.C317106mj.A06     // Catch:{ all -> 0x09ac }
            r6.A0M = r5     // Catch:{ all -> 0x09ac }
        L_0x0961:
            r5 = r23
            r9.A0A = r5     // Catch:{ all -> 0x09ac }
            if (r8 == 0) goto L_0x0968
            goto L_0x096b
        L_0x0968:
            r6 = 0
            r5 = 0
            goto L_0x0971
        L_0x096b:
            X.3IN r5 = r8.A00     // Catch:{ all -> 0x09ac }
            boolean r6 = r5.A0B     // Catch:{ all -> 0x09ac }
            boolean r5 = r5.A08     // Catch:{ all -> 0x09ac }
        L_0x0971:
            r36 = r9
            r37 = r11
            r38 = r163
            r39 = r160
            r40 = r6
            r41 = r5
            r36.A01(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x09ac }
            X.6Nt r6 = X.C306846Nt.A01     // Catch:{ all -> 0x09ac }
            r5 = r163
            r6.A04(r5, r9, r2)     // Catch:{ all -> 0x09ac }
            X.XXf r5 = new X.XXf     // Catch:{ all -> 0x09ac }
            r5.<init>()     // Catch:{ all -> 0x09ac }
            X.C306846Nt.A00 = r5     // Catch:{ all -> 0x09ac }
            r10.A03 = r9     // Catch:{ all -> 0x09ac }
            android.view.View r5 = r10.A00     // Catch:{ all -> 0x09ac }
            if (r5 == 0) goto L_0x09a4
            r5.setVisibility(r2)     // Catch:{ all -> 0x09ac }
            android.view.View r5 = r10.A01     // Catch:{ all -> 0x09ac }
            if (r5 == 0) goto L_0x09a0
            r5.setVisibility(r1)     // Catch:{ all -> 0x09ac }
            goto L_0x08cd
        L_0x09a0:
            X.0qQ.A0F(r13)     // Catch:{ all -> 0x09ac }
            goto L_0x09a7
        L_0x09a4:
            X.0qQ.A0F(r14)     // Catch:{ all -> 0x09ac }
        L_0x09a7:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x09ac }
            throw r0     // Catch:{ all -> 0x09ac }
        L_0x09ac:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = -1588968614(0xffffffffa14a435a, float:-6.85294E-19)
            goto L_0x3cf7
        L_0x09b8:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x22aa
            r5 = -730297238(0xffffffffd4788c6a, float:-4.27003059E12)
            goto L_0x09cb
        L_0x09c2:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x22aa
            r5 = 1519625762(0x5a93a622, float:2.07797433E16)
        L_0x09cb:
            X.0fS.A00(r5)
            goto L_0x22aa
        L_0x09d0:
            X.6n7 r12 = new X.6n7
            r12.<init>(r4)
            if (r16 == 0) goto L_0x0af5
            boolean r10 = r16.A5f()
            r7 = r28
            if (r10 != r7) goto L_0x0af5
            r6 = r19
            X.0qQ.A0B(r6, r7)
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x09f2
            r6 = -1226409379(0xffffffffb6e67a5d, float:-6.868779E-6)
            java.lang.String r5 = "ReelViewerItemBinder.bindMediaCover"
            X.0fS.A01(r5, r6)
        L_0x09f2:
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0ae9 }
            r5 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r6 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x0ae9 }
            java.lang.String r5 = "Required value was null."
            if (r6 == 0) goto L_0x0a6e
            r6 = r19
            boolean r6 = r6 instanceof androidx.fragment.app.FragmentActivity     // Catch:{ all -> 0x0ae9 }
            if (r6 == 0) goto L_0x0a6e
            r7 = r19
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7     // Catch:{ all -> 0x0ae9 }
            r6 = r121
            X.2nI r13 = X.C229382nI.A04(r7, r6, r4)     // Catch:{ all -> 0x0ae9 }
            if (r9 == 0) goto L_0x0a62
            X.2eb r6 = r9.A00     // Catch:{ all -> 0x0ae9 }
            android.view.View r7 = r6.A01()     // Catch:{ all -> 0x0ae9 }
            android.content.Context r10 = r7.getContext()     // Catch:{ all -> 0x0ae9 }
            if (r10 == 0) goto L_0x0a5c
            r7 = r16
            X.4g6 r7 = r7.A07     // Catch:{ all -> 0x0ae9 }
            if (r7 == 0) goto L_0x0a68
            X.4hR r5 = r7.A01     // Catch:{ all -> 0x0ae9 }
            X.3ew r9 = r5.A01()     // Catch:{ all -> 0x0ae9 }
            X.4n2 r5 = new X.4n2     // Catch:{ all -> 0x0ae9 }
            r5.<init>(r10)     // Catch:{ all -> 0x0ae9 }
            android.view.View r7 = r6.A01()     // Catch:{ all -> 0x0ae9 }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x0ae9 }
            r7.addView(r5)     // Catch:{ all -> 0x0ae9 }
            r8 = r35
            X.68u r12 = X.C3034368u.A03(r8, r9, r8)     // Catch:{ all -> 0x0ae9 }
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0ae9 }
            java.util.Map r15 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0ae9 }
            android.util.SparseArray r11 = new android.util.SparseArray     // Catch:{ all -> 0x0ae9 }
            r11.<init>()     // Catch:{ all -> 0x0ae9 }
            r13.getClass()     // Catch:{ all -> 0x0ae9 }
            X.6NS r9 = new X.6NS     // Catch:{ all -> 0x0ae9 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0ae9 }
            r9.A07(r5)     // Catch:{ all -> 0x0ae9 }
            r6.A03(r2)     // Catch:{ all -> 0x0ae9 }
            goto L_0x0ade
        L_0x0a5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0ae9 }
            r0.<init>(r5)     // Catch:{ all -> 0x0ae9 }
            goto L_0x0a6d
        L_0x0a62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0ae9 }
            r0.<init>(r5)     // Catch:{ all -> 0x0ae9 }
            goto L_0x0a6d
        L_0x0a68:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0ae9 }
            r0.<init>(r5)     // Catch:{ all -> 0x0ae9 }
        L_0x0a6d:
            throw r0     // Catch:{ all -> 0x0ae9 }
        L_0x0a6e:
            r5 = r160
            r5.A03(r0)     // Catch:{ all -> 0x0ae9 }
            r5.A0l = r2     // Catch:{ all -> 0x0ae9 }
            r0.A08 = r3     // Catch:{ all -> 0x0ae9 }
            r0.A0C = r5     // Catch:{ all -> 0x0ae9 }
            r5.A0x = r2     // Catch:{ all -> 0x0ae9 }
            r5 = r16
            boolean r8 = r5.A6b(r4)     // Catch:{ all -> 0x0ae9 }
            r7 = -1
            r9 = r5
            r6 = r35
            r5 = r158
            X.3ev r7 = X.C246473ef.A00(r9, r6, r5, r7, r8)     // Catch:{ all -> 0x0ae9 }
            float[] r5 = new float[r1]     // Catch:{ all -> 0x0ae9 }
            r6 = r121
            r8 = r14
            r9 = r5
            r10 = r2
            r11 = r2
            r12 = r2
            X.C256013v5.A02(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0ae9 }
            r5 = r158
            r5.DzQ(r3)     // Catch:{ all -> 0x0ae9 }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x0ae9 }
            r6 = 2131435566(0x7f0b202e, float:1.8492978E38)
            X.WXI r5 = new X.WXI     // Catch:{ all -> 0x0ae9 }
            r8 = r5
            r9 = r4
            r10 = r3
            r11 = r163
            r12 = r160
            r13 = r158
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0ae9 }
            r7.A0A(r5, r6)     // Catch:{ all -> 0x0ae9 }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x0ae9 }
            long r5 = r3.A02()     // Catch:{ all -> 0x0ae9 }
            r7.setExpiration(r5)     // Catch:{ all -> 0x0ae9 }
            java.lang.String r6 = r16.BTL()     // Catch:{ all -> 0x0ae9 }
            java.lang.String r5 = "preview:/"
            java.lang.String r5 = X.002.A0R(r5, r6)     // Catch:{ all -> 0x0ae9 }
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x0ae9 }
            r7.<init>(r5)     // Catch:{ all -> 0x0ae9 }
            X.6VC r5 = X.AnonymousClass6VB.A00(r4)     // Catch:{ all -> 0x0ae9 }
            r5.A0C(r3, r2)     // Catch:{ all -> 0x0ae9 }
            com.instagram.feed.widget.IgProgressImageView r6 = r0.BGP()     // Catch:{ all -> 0x0ae9 }
            r5 = r121
            r6.setUrl(r7, r5)     // Catch:{ all -> 0x0ae9 }
        L_0x0ade:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x1f34
            r5 = 127384922(0x797bd5a, float:2.2831246E-34)
            goto L_0x1f31
        L_0x0ae9:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 52772307(0x3253dd3, float:4.8560113E-37)
            goto L_0x3cf7
        L_0x0af5:
            if (r118 == 0) goto L_0x0bef
            r5 = r31
            com.instagram.user.model.User r11 = r5.A01(r4)
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x0b0b
            r6 = -441372654(0xffffffffe5b13012, float:-1.045932E23)
            java.lang.String r5 = "ReelViewerStoryInterstitialBinder.bindView"
            X.0fS.A01(r5, r6)
        L_0x0b0b:
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x0be3 }
            android.content.Context r10 = r5.getContext()     // Catch:{ all -> 0x0be3 }
            r8.A00()     // Catch:{ all -> 0x0be3 }
            r11.Bh3()     // Catch:{ all -> 0x0be3 }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r8.A04     // Catch:{ all -> 0x0be3 }
            if (r7 == 0) goto L_0x0bd3
            com.instagram.common.typedurl.ImageUrl r6 = r11.Bh3()     // Catch:{ all -> 0x0be3 }
            r5 = r121
            r7.setUrl(r6, r5)     // Catch:{ all -> 0x0be3 }
            android.widget.TextView r7 = r8.A03     // Catch:{ all -> 0x0be3 }
            if (r7 == 0) goto L_0x0bcb
            java.lang.String r9 = ""
            if (r10 == 0) goto L_0x0b3f
            r6 = 2131971692(0x7f134e6c, float:1.958037E38)
            java.lang.String r5 = r11.getUsername()     // Catch:{ all -> 0x0be3 }
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x0be3 }
            java.lang.String r5 = r10.getString(r6, r5)     // Catch:{ all -> 0x0be3 }
            if (r5 != 0) goto L_0x0b40
        L_0x0b3f:
            r5 = r9
        L_0x0b40:
            r7.setText(r5)     // Catch:{ all -> 0x0be3 }
            X.3mM r5 = r0.A09     // Catch:{ all -> 0x0be3 }
            if (r5 == 0) goto L_0x0bc3
            com.instagram.model.reels.Reel r5 = r5.A0H     // Catch:{ all -> 0x0be3 }
            X.1Ns r5 = r5.A0W     // Catch:{ all -> 0x0be3 }
            if (r5 == 0) goto L_0x0b5c
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x0be3 }
            if (r6 == 0) goto L_0x0b5c
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0be3 }
        L_0x0b57:
            java.lang.String r7 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r5)     // Catch:{ all -> 0x0be3 }
            goto L_0x0b5f
        L_0x0b5c:
            java.lang.String r5 = "The story owner"
            goto L_0x0b57
        L_0x0b5f:
            r6 = 32
            if (r10 == 0) goto L_0x0b6d
            r5 = 2131971691(0x7f134e6b, float:1.9580368E38)
            java.lang.String r5 = r10.getString(r5)     // Catch:{ all -> 0x0be3 }
            if (r5 == 0) goto L_0x0b6d
            r9 = r5
        L_0x0b6d:
            java.lang.String r5 = X.002.A0T(r7, r9, r6)     // Catch:{ all -> 0x0be3 }
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0be3 }
            r6.<init>(r5)     // Catch:{ all -> 0x0be3 }
            X.0qQ.A0A(r7)     // Catch:{ all -> 0x0be3 }
            X.6Jl r5 = new X.6Jl     // Catch:{ all -> 0x0be3 }
            r5.<init>()     // Catch:{ all -> 0x0be3 }
            X.AnonymousClass7AV.A02(r6, r5, r7)     // Catch:{ all -> 0x0be3 }
            android.widget.TextView r5 = r8.A02     // Catch:{ all -> 0x0be3 }
            if (r5 == 0) goto L_0x0bbb
            r5.setText(r6)     // Catch:{ all -> 0x0be3 }
            android.widget.TextView r6 = r8.A01     // Catch:{ all -> 0x0be3 }
            if (r6 == 0) goto L_0x0bb3
            r5 = 2131971690(0x7f134e6a, float:1.9580366E38)
            r6.setText(r5)     // Catch:{ all -> 0x0be3 }
            android.widget.TextView r9 = r8.A01     // Catch:{ all -> 0x0be3 }
            if (r9 == 0) goto L_0x0bdb
            X.LXE r7 = new X.LXE     // Catch:{ all -> 0x0be3 }
            r6 = r163
            r5 = r158
            r7.<init>(r6, r5)     // Catch:{ all -> 0x0be3 }
            X.AnonymousClass0fU.A00(r7, r9)     // Catch:{ all -> 0x0be3 }
            android.view.View r5 = r8.A00     // Catch:{ all -> 0x0be3 }
            if (r5 == 0) goto L_0x0bab
            r5.setVisibility(r2)     // Catch:{ all -> 0x0be3 }
            goto L_0x1f28
        L_0x0bab:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
            goto L_0x0be2
        L_0x0bb3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
            goto L_0x0be2
        L_0x0bbb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
            goto L_0x0be2
        L_0x0bc3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
            goto L_0x0be2
        L_0x0bcb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
            goto L_0x0be2
        L_0x0bd3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
            goto L_0x0be2
        L_0x0bdb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0be3 }
            r1.<init>(r0)     // Catch:{ all -> 0x0be3 }
        L_0x0be2:
            throw r1     // Catch:{ all -> 0x0be3 }
        L_0x0be3:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 2074110665(0x7ba06ac9, float:1.6658667E36)
            goto L_0x3cf7
        L_0x0bef:
            X.3BK r7 = X.AnonymousClass3BJ.A00(r4)
            boolean r7 = r7.A02(r3)
            r10 = r174
            if (r7 == 0) goto L_0x0c7e
            r5 = r121
            X.C70312O1q.A00(r5, r3, r15)
            com.instagram.common.typedurl.ImageUrl r6 = r3.A06()
            com.instagram.user.model.User r5 = r3.A0i
            if (r6 == 0) goto L_0x0c61
            if (r5 == 0) goto L_0x0c61
            X.0eM r6 = r11.A03
            java.lang.Object r8 = r6.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            android.content.Context r7 = r6.getContext()
            r6 = 2131972425(0x7f135149, float:1.9581857E38)
            java.lang.String r6 = r7.getString(r6)
            r8.setText(r6)
            X.0eM r6 = r11.A01
            java.lang.Object r8 = r6.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            android.content.Context r7 = r6.getContext()
            r6 = 2131972424(0x7f135148, float:1.9581855E38)
            java.lang.String r5 = r5.getUsername()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = r7.getString(r6, r5)
            r8.setText(r5)
            X.0eM r5 = r11.A02
            java.lang.Object r7 = r5.getValue()
            android.view.View r7 = (android.view.View) r7
            X.FLu r6 = new X.FLu
            r5 = r158
            r6.<init>(r5)
            X.AnonymousClass0fU.A00(r6, r7)
            r5 = r22
            r5.setVisibility(r2)
        L_0x0c61:
            if (r174 == 0) goto L_0x1f34
            boolean r5 = r10.A03
            if (r5 != 0) goto L_0x1f34
            r5 = r163
            com.instagram.model.reels.Reel r5 = r5.A0H
            X.6aJ r9 = X.C310016aI.A01(r5, r10)
            com.instagram.common.session.UserSession r8 = r10.A06
            r7 = r163
            r6 = r35
            X.VFZ.A00(r8, r9, r7, r6, r6)
            r5 = r28
            r10.A03 = r5
            goto L_0x1f34
        L_0x0c7e:
            r7 = r163
            boolean r7 = r12.A00(r7)
            if (r7 == 0) goto L_0x0c8d
            r5 = r121
            X.C70312O1q.A00(r5, r3, r15)
            goto L_0x1f34
        L_0x0c8d:
            r25 = 2
            r24 = 3
            r21 = 4
            r17 = 5
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x0ca3
            r8 = 1497463107(0x59417943, float:3.40362495E15)
            java.lang.String r7 = "ReelViewerItemBinder.bindMedia"
            X.0fS.A01(r7, r8)
        L_0x0ca3:
            java.lang.String r23 = r121.getModuleName()     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r7.getIgImageView()     // Catch:{ all -> 0x3ccc }
            r7.clearColorFilter()     // Catch:{ all -> 0x3ccc }
            if (r16 == 0) goto L_0x0cca
            java.lang.String r7 = r16.A2a()     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x0cca
            com.instagram.feed.widget.IgProgressImageView r9 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            int r8 = android.graphics.Color.parseColor(r7)     // Catch:{ all -> 0x3ccc }
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable     // Catch:{ all -> 0x3ccc }
            r7.<init>(r8)     // Catch:{ all -> 0x3ccc }
            r9.setPlaceHolderColor((android.graphics.drawable.ColorDrawable) r7)     // Catch:{ all -> 0x3ccc }
        L_0x0cca:
            com.instagram.feed.widget.IgProgressImageView r11 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            if (r16 == 0) goto L_0x0ce7
            boolean r9 = r16.A6F()     // Catch:{ all -> 0x3ccc }
            r8 = 1
            if (r9 != r8) goto L_0x0ce8
            com.instagram.user.model.User r7 = r3.A0i     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x0ce8
            java.lang.String r7 = r7.getId()     // Catch:{ all -> 0x3ccc }
            boolean r9 = X.2R8.A05(r4, r7)     // Catch:{ all -> 0x3ccc }
            r7 = 0
            if (r9 == 0) goto L_0x0cea
            goto L_0x0ce8
        L_0x0ce7:
            r8 = 1
        L_0x0ce8:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0cea:
            r11.setAlpha(r7)     // Catch:{ all -> 0x3ccc }
            X.3uh r7 = r0.A08     // Catch:{ all -> 0x3ccc }
            boolean r117 = r3.equals(r7)     // Catch:{ all -> 0x3ccc }
            r0.A08 = r3     // Catch:{ all -> 0x3ccc }
            r7 = r160
            r7.A03(r0)     // Catch:{ all -> 0x3ccc }
            r0.A0C = r7     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            android.content.Context r7 = r7.getContext()     // Catch:{ all -> 0x3ccc }
            X.6kL r36 = A00     // Catch:{ all -> 0x3ccc }
            boolean r9 = r3.A1D()     // Catch:{ all -> 0x3ccc }
            if (r9 != 0) goto L_0x0d13
            boolean r9 = r3.A1E()     // Catch:{ all -> 0x3ccc }
            if (r9 != 0) goto L_0x0d13
            r8 = 0
        L_0x0d13:
            A07(r4, r0, r8)     // Catch:{ all -> 0x3ccc }
            r37 = r121
            r38 = r4
            r39 = r3
            r40 = r163
            r41 = r158
            r42 = r0
            A03(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3ccc }
            r37 = r4
            r38 = r3
            r39 = r163
            r40 = r160
            r36.A06(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3ccc }
            r40 = r162
            r41 = r0
            r36.A05(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3ccc }
            X.3v4 r11 = r0.A0f     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0B(r11, r2)     // Catch:{ all -> 0x3ccc }
            boolean r38 = r3.CWu()     // Catch:{ all -> 0x3ccc }
            if (r38 == 0) goto L_0x0d51
            boolean r8 = r3.A1m()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0d51
            boolean r8 = r3.CcK()     // Catch:{ all -> 0x3ccc }
            if (r8 != 0) goto L_0x0d51
            if (r16 == 0) goto L_0x0d51
            goto L_0x0d59
        L_0x0d51:
            r8 = r35
            r11.A01 = r8     // Catch:{ all -> 0x3ccc }
            X.C263164Jj.A00(r11)     // Catch:{ all -> 0x3ccc }
            goto L_0x0d65
        L_0x0d59:
            boolean r9 = r16.A51()     // Catch:{ all -> 0x3ccc }
            r8 = r28
            if (r9 != r8) goto L_0x0d51
            r8 = r158
            r11.A01 = r8     // Catch:{ all -> 0x3ccc }
        L_0x0d65:
            r8 = r160
            boolean r8 = r8.A0m     // Catch:{ all -> 0x3ccc }
            java.lang.String r22 = "Required value was null."
            if (r8 != 0) goto L_0x0e0b
            com.instagram.feed.widget.IgProgressImageView r8 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            r8.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            if (r117 == 0) goto L_0x1c37
            r8 = r160
            boolean r8 = r8.A0x     // Catch:{ all -> 0x3ccc }
            if (r8 != 0) goto L_0x1c37
            r11 = r158
            r9 = r160
            r8 = r28
            r11.DzS(r3, r9, r8)     // Catch:{ all -> 0x3ccc }
        L_0x0d85:
            X.3mM r8 = r0.A09     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1c2f
            com.instagram.model.reels.Reel r8 = r8.A0H     // Catch:{ all -> 0x3ccc }
            X.1Ns r13 = r8.A0W     // Catch:{ all -> 0x3ccc }
            if (r13 == 0) goto L_0x0e0b
            com.instagram.user.model.User r8 = r13.CCd()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0e0b
            long r8 = r3.A03()     // Catch:{ all -> 0x3ccc }
            long r14 = X.AnonymousClass3PE.A00     // Catch:{ all -> 0x3ccc }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r11
            long r8 = r8 + r14
            double r14 = (double) r8     // Catch:{ all -> 0x3ccc }
            boolean r8 = r3.A1m()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1c16
            android.content.Context r11 = r48.getContext()     // Catch:{ all -> 0x3ccc }
            r8 = 2131976403(0x7f1360d3, float:1.9589926E38)
            java.lang.String r9 = r11.getString(r8)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x3ccc }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = r9.toLowerCase(r8)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x3ccc }
        L_0x0dbd:
            r8 = r163
            com.instagram.model.reels.Reel r8 = r8.A0H     // Catch:{ all -> 0x3ccc }
            boolean r9 = r8.A0h()     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1bda
            r37 = 2131971722(0x7f134e8a, float:1.9580431E38)
            java.lang.String r8 = r8.A0r     // Catch:{ all -> 0x3ccc }
            r39 = r8
            r8 = r163
            int r8 = r8.A01     // Catch:{ all -> 0x3ccc }
            int r8 = r8 + 1
            java.lang.Integer r36 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x3ccc }
            r8 = r163
            int r8 = r8.A02(r4)     // Catch:{ all -> 0x3ccc }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x3ccc }
            android.widget.TextView r8 = r0.A0c     // Catch:{ all -> 0x3ccc }
            android.content.Context r12 = r8.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x3ccc }
            long r8 = (long) r14     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = X.JZV.A04(r12, r8)     // Catch:{ all -> 0x3ccc }
            r9 = r39
            r8 = r36
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r8, r13, r12}     // Catch:{ all -> 0x3ccc }
            r8 = r37
            java.lang.String r8 = r11.getString(r8, r9)     // Catch:{ all -> 0x3ccc }
        L_0x0dfe:
            X.0qQ.A0A(r8)     // Catch:{ all -> 0x3ccc }
            android.view.View r11 = r0.A0T     // Catch:{ all -> 0x3ccc }
            r11.setContentDescription(r8)     // Catch:{ all -> 0x3ccc }
            r8 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A06(r11, r8)     // Catch:{ all -> 0x3ccc }
        L_0x0e0b:
            boolean r8 = X.AnonymousClass4EQ.A0C(r4, r3)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0e45
            X.VTK r11 = new X.VTK     // Catch:{ all -> 0x3ccc }
            r8 = r181
            r11.<init>(r4, r8)     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = r3.A0Q()     // Catch:{ all -> 0x3ccc }
            if (r12 == 0) goto L_0x0e45
            X.WgW r9 = new X.WgW     // Catch:{ all -> 0x3ccc }
            r9.<init>(r0, r11)     // Catch:{ all -> 0x3ccc }
            r8 = r65
            r8.A01 = r9     // Catch:{ all -> 0x3ccc }
            com.instagram.common.typedurl.ImageUrl r9 = r3.A06()     // Catch:{ all -> 0x3ccc }
            r8.setPreviewUrl(r9)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.session.UserSession r13 = r11.A00     // Catch:{ all -> 0x3ccc }
            X.6WO r9 = X.AnonymousClass6WO.STORIES     // Catch:{ all -> 0x3ccc }
            r8.setUrl(r12, r13, r9)     // Catch:{ all -> 0x3ccc }
            X.A1A.A00(r0)     // Catch:{ all -> 0x3ccc }
            X.6a9 r8 = r11.A01     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0e45
            r8.A00 = r2     // Catch:{ all -> 0x3ccc }
            instagram.features.stories.fragment.ReelViewerFragment r9 = r8.A01     // Catch:{ all -> 0x3ccc }
            java.lang.String r8 = "immersive_photo_loading"
            r9.EHY(r8)     // Catch:{ all -> 0x3ccc }
        L_0x0e45:
            r8 = r158
            r8.DzQ(r3)     // Catch:{ all -> 0x3ccc }
            r8 = r154
            r8.setUserSession(r4)     // Catch:{ all -> 0x3ccc }
            float r11 = r3.A00()     // Catch:{ all -> 0x3ccc }
            java.util.List r9 = r3.A0b()     // Catch:{ all -> 0x3ccc }
            r8.A08(r9, r11)     // Catch:{ all -> 0x3ccc }
            if (r174 == 0) goto L_0x0efd
            if (r117 != 0) goto L_0x0efd
            X.3WT r8 = X.AnonymousClass3WT.RESHARE_VIEW_SHOP_CTA     // Catch:{ all -> 0x3ccc }
            java.util.List r8 = r3.Bkd(r8)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0efd
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x3ccc }
            if (r9 != 0) goto L_0x0efd
            java.lang.Object r11 = r8.get(r2)     // Catch:{ all -> 0x3ccc }
            X.3ui r11 = (X.C255783ui) r11     // Catch:{ all -> 0x3ccc }
            r8 = r28
            X.0qQ.A0B(r11, r8)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.session.UserSession r9 = r10.A06     // Catch:{ all -> 0x3ccc }
            r8 = r163
            X.3uh r8 = r8.A08(r9)     // Catch:{ all -> 0x3ccc }
            boolean r12 = r8.CWu()     // Catch:{ all -> 0x3ccc }
            if (r12 == 0) goto L_0x0efd
            X.1Xj r13 = r8.A0b     // Catch:{ all -> 0x3ccc }
            if (r13 == 0) goto L_0x0efd
            r8 = r163
            com.instagram.model.reels.Reel r8 = r8.A0H     // Catch:{ all -> 0x3ccc }
            X.6aJ r14 = X.C310016aI.A01(r8, r10)     // Catch:{ all -> 0x3ccc }
            java.lang.String r8 = r11.A1c     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0f05
            int r11 = r8.length()     // Catch:{ all -> 0x3ccc }
            if (r11 == 0) goto L_0x0f05
            X.4Ny r12 = X.C263944Ny.A00(r8)     // Catch:{ all -> 0x3ccc }
        L_0x0e9f:
            X.0wc r11 = X.AnonymousClass0kN.A01(r14, r9)     // Catch:{ all -> 0x3ccc }
            java.lang.String r9 = "instagram_shopping_format_stories_reshare_view_shop_cta_impression"
            X.0kJ r8 = r11.A00     // Catch:{ all -> 0x3ccc }
            X.0Aj r9 = r11.A00(r8, r9)     // Catch:{ all -> 0x3ccc }
            r8 = 314(0x13a, float:4.4E-43)
            X.1Ln r11 = new X.1Ln     // Catch:{ all -> 0x3ccc }
            r11.<init>(r9, r8)     // Catch:{ all -> 0x3ccc }
            X.0Aj r8 = r11.A00     // Catch:{ all -> 0x3ccc }
            boolean r8 = r8.isSampled()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0efd
            java.lang.String r8 = r13.getId()     // Catch:{ all -> 0x3ccc }
            r11.A0m(r8)     // Catch:{ all -> 0x3ccc }
            r11.A0e(r12)     // Catch:{ all -> 0x3ccc }
            java.lang.String r9 = "stories_reshare_view_shop_cta"
            java.lang.String r8 = "entry_point"
            r11.A0R(r8, r9)     // Catch:{ all -> 0x3ccc }
            X.327 r8 = new X.327     // Catch:{ all -> 0x3ccc }
            r8.<init>()     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = r10.A02     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = "shopping_session_id"
            r8.A06(r10, r12)     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = r14.getModuleName()     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = "prior_module"
            r8.A06(r10, r12)     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = "prior_submodule"
            r8.A06(r10, r9)     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = "submodule"
            r8.A06(r10, r9)     // Catch:{ all -> 0x3ccc }
            X.1QJ r9 = X.AnonymousClass1QI.A00     // Catch:{ all -> 0x3ccc }
            X.1QM r9 = r9.A02     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = r9.A00     // Catch:{ all -> 0x3ccc }
            java.lang.String r9 = "nav_chain"
            r8.A06(r9, r10)     // Catch:{ all -> 0x3ccc }
            java.lang.String r9 = "navigation_info"
            r11.A0N(r8, r9)     // Catch:{ all -> 0x3ccc }
            r11.Cgf()     // Catch:{ all -> 0x3ccc }
        L_0x0efd:
            X.4Wj r36 = new X.4Wj     // Catch:{ all -> 0x3ccc }
            r8 = r36
            r8.<init>(r4)     // Catch:{ all -> 0x3ccc }
            goto L_0x0f08
        L_0x0f05:
            r12 = r35
            goto L_0x0e9f
        L_0x0f08:
            if (r38 == 0) goto L_0x1d9d
            if (r16 == 0) goto L_0x1bd1
            r6 = r16
            X.1Xy r6 = r6.A0C     // Catch:{ all -> 0x3ccc }
            X.DSr r6 = r6.C11()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x0f64
            java.lang.String r8 = r6.getText()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1bc8
            r7 = r51
            r6 = r159
            r7.A03(r3, r6, r8)     // Catch:{ all -> 0x3ccc }
        L_0x0f23:
            boolean r6 = r0.A0J     // Catch:{ all -> 0x3ccc }
            r38 = r6
            r47 = 0
            r6 = r16
            X.1Xy r6 = r6.A0C     // Catch:{ all -> 0x3ccc }
            X.JSO r6 = r6.CGF()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x0f61
            java.lang.Integer r10 = r6.BES()     // Catch:{ all -> 0x3ccc }
        L_0x0f37:
            r6 = r16
            X.1Xy r6 = r6.A0C     // Catch:{ all -> 0x3ccc }
            X.JSO r6 = r6.CGF()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x0f5e
            java.lang.String r37 = r6.getIconicHorizonWorldName()     // Catch:{ all -> 0x3ccc }
        L_0x0f45:
            r6 = r16
            X.1Xy r6 = r6.A0C     // Catch:{ all -> 0x3ccc }
            X.JSO r6 = r6.CGF()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x0f53
            java.lang.String r47 = r6.getIconicHorizonWorldDeeplink()     // Catch:{ all -> 0x3ccc }
        L_0x0f53:
            r6 = r16
            boolean r7 = r6.A6a(r4)     // Catch:{ all -> 0x3ccc }
            r6 = r28
            if (r7 != r6) goto L_0x1182
            goto L_0x0f68
        L_0x0f5e:
            r37 = r35
            goto L_0x0f45
        L_0x0f61:
            r10 = r35
            goto L_0x0f37
        L_0x0f64:
            r51.A02()     // Catch:{ all -> 0x3ccc }
            goto L_0x0f23
        L_0x0f68:
            if (r10 == 0) goto L_0x1182
            if (r37 == 0) goto L_0x1182
            if (r47 == 0) goto L_0x1182
            X.I6E r8 = X.I6E.A00     // Catch:{ all -> 0x3ccc }
            java.lang.Integer r7 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x3ccc }
            r6 = r121
            r9 = r16
            r8.A04(r6, r4, r9, r7)     // Catch:{ all -> 0x3ccc }
            int r10 = r10.intValue()     // Catch:{ all -> 0x3ccc }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x3ccc }
            r6 = 36329083952578332(0x81111c00023f1c, double:3.037997204865369E-306)
            boolean r6 = X.182.A06(r9, r4, r6)     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x10db
            r6 = r50
            X.0eM r6 = r6.A08     // Catch:{ all -> 0x3ccc }
            r48 = r6
            java.lang.Object r6 = r48.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x3ccc }
            r6.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            android.view.View r6 = r49.getView()     // Catch:{ all -> 0x3ccc }
            android.content.Context r8 = r6.getContext()     // Catch:{ all -> 0x3ccc }
            r6 = 2131237875(0x7f081bf3, float:1.8092013E38)
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r6)     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x10cf
            r6 = r50
            X.0eM r10 = r6.A09     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r10.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6     // Catch:{ all -> 0x3ccc }
            r6.setImageDrawable(r7)     // Catch:{ all -> 0x3ccc }
            r6 = 36329083952643869(0x81111c00033f1d, double:3.037997204906815E-306)
            boolean r6 = X.182.A06(r9, r4, r6)     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1065
            java.lang.Object r7 = r10.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7     // Catch:{ all -> 0x3ccc }
            r6 = 16
            float r6 = X.0nA.A04(r8, r6)     // Catch:{ all -> 0x3ccc }
            int r9 = (int) r6     // Catch:{ all -> 0x3ccc }
            android.graphics.drawable.Drawable r6 = r7.getDrawable()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.graphics.Bitmap r12 = X.C62953Kp5.A00(r6, r9, r9)     // Catch:{ all -> 0x3ccc }
            int r15 = r12.getWidth()     // Catch:{ all -> 0x3ccc }
            int r11 = r12.getHeight()     // Catch:{ all -> 0x3ccc }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x3ccc }
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r15, r11, r6)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r14)     // Catch:{ all -> 0x3ccc }
            android.graphics.Canvas r13 = new android.graphics.Canvas     // Catch:{ all -> 0x3ccc }
            r13.<init>(r14)     // Catch:{ all -> 0x3ccc }
            r10 = r29
            r6 = r35
            r13.drawBitmap(r12, r10, r10, r6)     // Catch:{ all -> 0x3ccc }
            android.graphics.Paint r6 = new android.graphics.Paint     // Catch:{ all -> 0x3ccc }
            r6.<init>()     // Catch:{ all -> 0x3ccc }
            float r9 = (float) r11     // Catch:{ all -> 0x3ccc }
            r43 = r9
            r9 = 2131100304(0x7f060290, float:1.7812986E38)
            int r12 = r8.getColor(r9)     // Catch:{ all -> 0x3ccc }
            r9 = 2131100305(0x7f060291, float:1.7812988E38)
            int r11 = r8.getColor(r9)     // Catch:{ all -> 0x3ccc }
            r9 = 2131100306(0x7f060292, float:1.781299E38)
            int r10 = r8.getColor(r9)     // Catch:{ all -> 0x3ccc }
            r9 = 2131100307(0x7f060293, float:1.7812992E38)
            int r9 = r8.getColor(r9)     // Catch:{ all -> 0x3ccc }
            int[] r44 = new int[]{r12, r11, r10, r9}     // Catch:{ all -> 0x3ccc }
            android.graphics.Shader$TileMode r46 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ all -> 0x3ccc }
            android.graphics.LinearGradient r9 = new android.graphics.LinearGradient     // Catch:{ all -> 0x3ccc }
            r39 = r9
            r40 = r29
            r41 = r29
            r42 = r29
            r45 = r35
            r39.<init>(r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x3ccc }
            r6.setShader(r9)     // Catch:{ all -> 0x3ccc }
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ all -> 0x3ccc }
            android.graphics.PorterDuffXfermode r9 = new android.graphics.PorterDuffXfermode     // Catch:{ all -> 0x3ccc }
            r9.<init>(r10)     // Catch:{ all -> 0x3ccc }
            r6.setXfermode(r9)     // Catch:{ all -> 0x3ccc }
            float r9 = (float) r15     // Catch:{ all -> 0x3ccc }
            r39 = r13
            r42 = r9
            r44 = r6
            r39.drawRect(r40, r41, r42, r43, r44)     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r48.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x3ccc }
            android.content.res.Resources r9 = r6.getResources()     // Catch:{ all -> 0x3ccc }
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x3ccc }
            r6.<init>(r9, r14)     // Catch:{ all -> 0x3ccc }
            r7.setImageDrawable(r6)     // Catch:{ all -> 0x3ccc }
        L_0x1065:
            android.app.Activity r9 = X.C61270mF.A01(r8)     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x10d9
            r6 = 2131971529(0x7f134dc9, float:1.958004E38)
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            X.6jx r7 = new X.6jx     // Catch:{ all -> 0x3ccc }
            r7.<init>((java.lang.CharSequence) r6)     // Catch:{ all -> 0x3ccc }
            X.5Gt r6 = new X.5Gt     // Catch:{ all -> 0x3ccc }
            r6.<init>(r9, r7)     // Catch:{ all -> 0x3ccc }
            r6.A02()     // Catch:{ all -> 0x3ccc }
            java.lang.Object r7 = r48.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x3ccc }
            r6.A03(r7)     // Catch:{ all -> 0x3ccc }
            X.5Gu r7 = X.C283255Gu.A06     // Catch:{ all -> 0x3ccc }
            r6.A07(r7)     // Catch:{ all -> 0x3ccc }
            X.HBk r7 = new X.HBk     // Catch:{ all -> 0x3ccc }
            r42 = r7
            r43 = r8
            r44 = r121
            r45 = r4
            r46 = r16
            r42.<init>(r43, r44, r45, r46, r47)     // Catch:{ all -> 0x3ccc }
            r6.A04 = r7     // Catch:{ all -> 0x3ccc }
            X.5Gv r9 = r6.A00()     // Catch:{ all -> 0x3ccc }
        L_0x10a8:
            java.lang.Object r8 = r48.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x3ccc }
            X.IBz r7 = new X.IBz     // Catch:{ all -> 0x3ccc }
            r6 = r121
            r10 = r16
            r7.<init>(r6, r4, r10, r9)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r7, r8)     // Catch:{ all -> 0x3ccc }
            r6 = r50
            X.0eM r6 = r6.A0A     // Catch:{ all -> 0x3ccc }
            java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r7 = (com.instagram.common.ui.base.IgTextView) r7     // Catch:{ all -> 0x3ccc }
            r6 = r37
            r7.setText(r6)     // Catch:{ all -> 0x3ccc }
        L_0x10cf:
            X.C316996mY.A00(r50)     // Catch:{ all -> 0x3ccc }
            r6 = r49
            r6.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            goto L_0x117f
        L_0x10d9:
            r9 = 0
            goto L_0x10a8
        L_0x10db:
            r6 = r50
            X.0eM r6 = r6.A03     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x3ccc }
            r6.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            android.view.View r6 = r49.getView()     // Catch:{ all -> 0x3ccc }
            android.content.Context r9 = r6.getContext()     // Catch:{ all -> 0x3ccc }
            r6 = r50
            X.0eM r6 = r6.A0B     // Catch:{ all -> 0x3ccc }
            java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r7 = (com.instagram.common.ui.base.IgTextView) r7     // Catch:{ all -> 0x3ccc }
            r6 = r37
            r7.setText(r6)     // Catch:{ all -> 0x3ccc }
            if (r10 <= 0) goto L_0x1137
            r6 = r50
            X.0eM r6 = r6.A06     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x3ccc }
            r6.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            r6 = r50
            X.0eM r6 = r6.A07     // Catch:{ all -> 0x3ccc }
            java.lang.Object r8 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r8 = (com.instagram.common.ui.base.IgTextView) r8     // Catch:{ all -> 0x3ccc }
            r7 = 2131971530(0x7f134dca, float:1.9580042E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x3ccc }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x3ccc }
            java.lang.String r6 = r9.getString(r7, r6)     // Catch:{ all -> 0x3ccc }
            r8.setText(r6)     // Catch:{ all -> 0x3ccc }
            goto L_0x1147
        L_0x1137:
            r6 = r50
            X.0eM r6 = r6.A06     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x3ccc }
            r6.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
        L_0x1147:
            r6 = r50
            X.0eM r6 = r6.A04     // Catch:{ all -> 0x3ccc }
            java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x3ccc }
            X.ICN r6 = new X.ICN     // Catch:{ all -> 0x3ccc }
            r42 = r6
            r43 = r9
            r44 = r121
            r45 = r4
            r46 = r16
            r42.<init>(r43, r44, r45, r46, r47)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r6, r7)     // Catch:{ all -> 0x3ccc }
            r6 = r50
            X.0eM r6 = r6.A05     // Catch:{ all -> 0x3ccc }
            java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7     // Catch:{ all -> 0x3ccc }
            r6 = 2131237875(0x7f081bf3, float:1.8092013E38)
            android.graphics.drawable.Drawable r6 = r9.getDrawable(r6)     // Catch:{ all -> 0x3ccc }
            r7.setImageDrawable(r6)     // Catch:{ all -> 0x3ccc }
            goto L_0x10cf
        L_0x117f:
            if (r38 != 0) goto L_0x11a4
            goto L_0x118b
        L_0x1182:
            X.C316996mY.A00(r50)     // Catch:{ all -> 0x3ccc }
            r6 = r49
            r6.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x11a4
        L_0x118b:
            r6 = r160
            boolean r6 = r6.A18     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x11a4
            r6 = r50
            android.animation.ValueAnimator r6 = r6.A01     // Catch:{ all -> 0x3ccc }
            boolean r7 = r6.isStarted()     // Catch:{ all -> 0x3ccc }
            if (r7 != 0) goto L_0x11a4
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x3ccc }
            if (r7 != 0) goto L_0x11a4
            r6.start()     // Catch:{ all -> 0x3ccc }
        L_0x11a4:
            r6 = r55
            X.AnonymousClass6WT.A00(r4, r3, r6)     // Catch:{ all -> 0x3ccc }
            r6 = r54
            X.AnonymousClass6WU.A00(r4, r3, r6)     // Catch:{ all -> 0x3ccc }
            r7 = r60
            r6 = r159
            X.AnonymousClass6WV.A00(r4, r3, r7, r6)     // Catch:{ all -> 0x3ccc }
            boolean r7 = r0.A0J     // Catch:{ all -> 0x3ccc }
            r8 = r17
            r6 = r23
            X.0qQ.A0B(r6, r8)     // Catch:{ all -> 0x3ccc }
            if (r7 != 0) goto L_0x11c7
            r6 = r160
            boolean r6 = r6.A18     // Catch:{ all -> 0x3ccc }
            r12 = 1
            if (r6 != 0) goto L_0x11c8
        L_0x11c7:
            r12 = 0
        L_0x11c8:
            r6 = r4
            r7 = r161
            r8 = r3
            r9 = r159
            r10 = r59
            r11 = r23
            r13 = r2
            X.AnonymousClass4X1.A00(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x3ccc }
            r6 = r160
            boolean r8 = r6.A18     // Catch:{ all -> 0x3ccc }
            boolean r7 = r0.A0J     // Catch:{ all -> 0x3ccc }
            r6 = r58
            r6.A05(r4, r3, r8, r7)     // Catch:{ all -> 0x3ccc }
            java.util.List r7 = r3.A0b()     // Catch:{ all -> 0x3ccc }
            X.3WT r6 = X.AnonymousClass3WT.GROUP_MENTION     // Catch:{ all -> 0x3ccc }
            X.3ui r42 = X.C289745e8.A00(r6, r7)     // Catch:{ all -> 0x3ccc }
            if (r42 == 0) goto L_0x126f
            r6 = r52
            r6.A03(r2)     // Catch:{ all -> 0x3ccc }
            android.view.View r7 = r52.A01()     // Catch:{ all -> 0x3ccc }
            r6 = 2131433668(0x7f0b18c4, float:1.8489128E38)
            android.view.View r7 = r7.requireViewById(r6)     // Catch:{ all -> 0x3ccc }
            r6 = r53
            r6.A00 = r7     // Catch:{ all -> 0x3ccc }
            android.view.View r7 = r52.A01()     // Catch:{ all -> 0x3ccc }
            r6 = 2131433675(0x7f0b18cb, float:1.8489142E38)
            android.view.View r7 = r7.requireViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7     // Catch:{ all -> 0x3ccc }
            r6 = r53
            r6.A01 = r7     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = "stickerView"
            if (r7 == 0) goto L_0x1bbf
            android.content.Context r8 = r7.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3ccc }
            X.9m3 r7 = r42.A0C()     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1bb6
            X.7w8 r8 = X.C39576A0s.A00(r8, r4, r7, r11)     // Catch:{ all -> 0x3ccc }
            r6 = r53
            com.instagram.common.ui.base.IgSimpleImageView r7 = r6.A01     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1bbf
            android.graphics.drawable.Drawable r6 = r8.A04()     // Catch:{ all -> 0x3ccc }
            r7.setImageDrawable(r6)     // Catch:{ all -> 0x3ccc }
            r6 = r53
            android.view.View r8 = r6.A00     // Catch:{ all -> 0x3ccc }
            java.lang.String r10 = "stickerContainerView"
            if (r8 == 0) goto L_0x1bbf
            android.view.View r6 = r52.A01()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r7 = X.C3019160o.A01(r6)     // Catch:{ all -> 0x3ccc }
            X.IjJ r6 = new X.IjJ     // Catch:{ all -> 0x3ccc }
            r37 = r6
            r38 = r8
            r39 = r7
            r40 = r4
            r41 = r3
            r37.<init>(r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r7, r6)     // Catch:{ all -> 0x3ccc }
            X.9m3 r9 = r42.A0C()     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1bad
            r6 = r53
            android.view.View r8 = r6.A00     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1bbf
            X.AOE r7 = new X.AOE     // Catch:{ all -> 0x3ccc }
            r6 = r159
            r7.<init>(r3, r6, r9)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r7, r8)     // Catch:{ all -> 0x3ccc }
        L_0x126f:
            X.6m8 r7 = r0.A15     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x3ccc }
            X.3WT r6 = X.AnonymousClass3WT.AVATAR     // Catch:{ all -> 0x3ccc }
            java.util.List r8 = r3.Bkd(r6)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x12fe
            android.widget.FrameLayout r6 = r7.A00     // Catch:{ all -> 0x3ccc }
            r37 = r6
            android.content.Context r15 = r37.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r15)     // Catch:{ all -> 0x3ccc }
            android.util.DisplayMetrics r6 = X.0nA.A0H(r15)     // Catch:{ all -> 0x3ccc }
            int r14 = r6.widthPixels     // Catch:{ all -> 0x3ccc }
            int r13 = r6.heightPixels     // Catch:{ all -> 0x3ccc }
            java.util.Iterator r17 = r8.iterator()     // Catch:{ all -> 0x3ccc }
        L_0x1293:
            boolean r6 = r17.hasNext()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x12fe
            java.lang.Object r11 = r17.next()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x3ccc }
            X.3ui r11 = (X.C255783ui) r11     // Catch:{ all -> 0x3ccc }
            android.view.View r10 = new android.view.View     // Catch:{ all -> 0x3ccc }
            r10.<init>(r15)     // Catch:{ all -> 0x3ccc }
            r6 = r24
            X.0qQ.A0B(r11, r6)     // Catch:{ all -> 0x3ccc }
            float r6 = r11.A02     // Catch:{ all -> 0x3ccc }
            float r9 = (float) r14     // Catch:{ all -> 0x3ccc }
            float r6 = r6 * r9
            int r12 = (int) r6     // Catch:{ all -> 0x3ccc }
            float r6 = r11.A00     // Catch:{ all -> 0x3ccc }
            float r8 = (float) r13     // Catch:{ all -> 0x3ccc }
            float r6 = r6 * r8
            int r7 = (int) r6     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x3ccc }
            r6.<init>(r12, r7)     // Catch:{ all -> 0x3ccc }
            r10.setLayoutParams(r6)     // Catch:{ all -> 0x3ccc }
            float r6 = r11.A01     // Catch:{ all -> 0x3ccc }
            r10.setRotation(r6)     // Catch:{ all -> 0x3ccc }
            float r6 = r11.A03     // Catch:{ all -> 0x3ccc }
            float r6 = r6 * r9
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()     // Catch:{ all -> 0x3ccc }
            int r7 = r7.width     // Catch:{ all -> 0x3ccc }
            int r7 = r7 / 2
            float r7 = (float) r7     // Catch:{ all -> 0x3ccc }
            float r6 = r6 - r7
            r10.setX(r6)     // Catch:{ all -> 0x3ccc }
            float r6 = r11.A04     // Catch:{ all -> 0x3ccc }
            float r6 = r6 * r8
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()     // Catch:{ all -> 0x3ccc }
            int r7 = r7.height     // Catch:{ all -> 0x3ccc }
            int r7 = r7 / 2
            float r7 = (float) r7     // Catch:{ all -> 0x3ccc }
            float r6 = r6 - r7
            r10.setY(r6)     // Catch:{ all -> 0x3ccc }
            r10.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            java.lang.String r6 = r11.A1M     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x12f5
            android.content.res.Resources r7 = r15.getResources()     // Catch:{ all -> 0x3ccc }
            r6 = 2131953506(0x7f130762, float:1.9543485E38)
            java.lang.String r6 = r7.getString(r6)     // Catch:{ all -> 0x3ccc }
        L_0x12f5:
            r10.setContentDescription(r6)     // Catch:{ all -> 0x3ccc }
            r6 = r37
            r6.addView(r10)     // Catch:{ all -> 0x3ccc }
            goto L_0x1293
        L_0x12fe:
            r6 = r4
            r7 = r3
            r8 = r163
            r9 = r62
            r10 = r63
            r11 = r159
            r12 = r35
            X.C265884Wr.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3ccc }
            r6 = r61
            android.widget.FrameLayout r7 = r6.A00     // Catch:{ all -> 0x3ccc }
            r7.removeAllViews()     // Catch:{ all -> 0x3ccc }
            X.3WT r6 = X.AnonymousClass3WT.BLOKS     // Catch:{ all -> 0x3ccc }
            r8 = r16
            java.util.List r8 = r8.A3o(r6)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1393
            boolean r6 = r8.isEmpty()     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1393
            r7.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x3ccc }
        L_0x132b:
            boolean r6 = r12.hasNext()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1393
            java.lang.Object r6 = r12.next()     // Catch:{ all -> 0x3ccc }
            X.3ui r6 = (X.C255783ui) r6     // Catch:{ all -> 0x3ccc }
            X.DDv r8 = r6.A1E     // Catch:{ all -> 0x3ccc }
            r8.getClass()     // Catch:{ all -> 0x3ccc }
            X.4g6 r8 = r8.A02     // Catch:{ all -> 0x3ccc }
            java.lang.String r9 = "StoryBloksSticker"
            if (r8 != 0) goto L_0x1348
            java.lang.String r6 = "_bloksRenderModel is null"
        L_0x1344:
            X.0wb.A03(r9, r6)     // Catch:{ all -> 0x3ccc }
            goto L_0x132b
        L_0x1348:
            X.4hR r8 = r8.A01     // Catch:{ all -> 0x3ccc }
            if (r8 != 0) goto L_0x134f
            java.lang.String r6 = "_bloksRenderModel.bloksDataAdapater is null"
            goto L_0x1344
        L_0x134f:
            X.3ew r11 = r8.A01()     // Catch:{ all -> 0x3ccc }
            android.content.Context r8 = r7.getContext()     // Catch:{ all -> 0x3ccc }
            r10 = r35
            X.68u r40 = X.C3034368u.A03(r10, r11, r10)     // Catch:{ all -> 0x3ccc }
            java.util.Map r42 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x3ccc }
            java.util.Map r43 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x3ccc }
            android.util.SparseArray r39 = new android.util.SparseArray     // Catch:{ all -> 0x3ccc }
            r39.<init>()     // Catch:{ all -> 0x3ccc }
            r8.getClass()     // Catch:{ all -> 0x3ccc }
            X.6NS r37 = new X.6NS     // Catch:{ all -> 0x3ccc }
            r38 = r8
            r41 = r27
            r37.<init>(r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3ccc }
            X.4n2 r9 = new X.4n2     // Catch:{ all -> 0x3ccc }
            r9.<init>(r8)     // Catch:{ all -> 0x3ccc }
            r7.addView(r9)     // Catch:{ all -> 0x3ccc }
            X.IjI r8 = new X.IjI     // Catch:{ all -> 0x3ccc }
            r38 = r8
            r39 = r9
            r40 = r37
            r41 = r3
            r42 = r61
            r43 = r6
            r38.<init>(r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r7, r8)     // Catch:{ all -> 0x3ccc }
            goto L_0x132b
        L_0x1393:
            r7 = r57
            r6 = r159
            X.C265944Wx.A00(r4, r3, r6, r7, r2)     // Catch:{ all -> 0x3ccc }
            r6 = r36
            r7 = r16
            X.9JD r6 = r6.A00(r7)     // Catch:{ all -> 0x3ccc }
            r13 = r186
            r12 = r182
            r7 = r4
            r8 = r159
            r9 = r56
            r10 = r3
            r11 = r23
            r14 = r2
            X.C265814Wk.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x3ccc }
            r6 = r4
            r7 = r3
            r8 = r162
            r9 = r159
            r10 = r64
            X.AnonymousClass6YH.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x3ccc }
            X.6mN r8 = r0.A1W     // Catch:{ all -> 0x3ccc }
            r7 = 0
            if (r117 != 0) goto L_0x13c3
            r7 = 1
        L_0x13c3:
            X.AnonymousClass6YI.A00(r4, r3, r8, r9, r7)     // Catch:{ all -> 0x3ccc }
            X.6nR r7 = r0.A18     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass6WW.A00(r4, r9, r7, r3)     // Catch:{ all -> 0x3ccc }
            X.6mI r9 = r0.A1L     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0B(r9, r2)     // Catch:{ all -> 0x3ccc }
            X.3WT r13 = X.AnonymousClass3WT.MESSAGE_SHARE     // Catch:{ all -> 0x3ccc }
            java.util.List r6 = r3.Bkd(r13)     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1512
            java.lang.Object r8 = X.00k.A0J(r6)     // Catch:{ all -> 0x3ccc }
            X.3ui r8 = (X.C255783ui) r8     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1512
            X.8D7 r6 = r8.A13     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1512
            X.UOB r6 = r6.A0E     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1512
            X.XAt r14 = r6.A01     // Catch:{ all -> 0x3ccc }
            if (r14 == 0) goto L_0x1512
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x3ccc }
            r6 = 36319407395249489(0x81084f003f1d51, double:3.03187771104624E-306)
            boolean r6 = X.182.A06(r10, r4, r6)     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1512
            X.8D7 r6 = r8.A13     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1509
            r9.A03 = r6     // Catch:{ all -> 0x3ccc }
            X.2eb r7 = r9.A04     // Catch:{ all -> 0x3ccc }
            android.view.View r6 = r7.A00     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x143b
            android.view.View r7 = r7.A01()     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x3ccc }
            r9.A00 = r7     // Catch:{ all -> 0x3ccc }
            java.lang.String r17 = "buttonWrapperView"
            if (r7 == 0) goto L_0x1431
            r6 = 2131436237(0x7f0b22cd, float:1.8494339E38)
            android.view.View r6 = r7.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6     // Catch:{ all -> 0x3ccc }
            r9.A02 = r6     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r7 = r9.A00     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1431
            r6 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r6 = r7.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgProgressBar r6 = (com.instagram.common.ui.base.IgProgressBar) r6     // Catch:{ all -> 0x3ccc }
            r9.A01 = r6     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r7 = r9.A02     // Catch:{ all -> 0x3ccc }
            if (r7 != 0) goto L_0x1436
            java.lang.String r17 = "buttonView"
        L_0x1431:
            X.0qQ.A0F(r17)     // Catch:{ all -> 0x3ccc }
            goto L_0x1bc2
        L_0x1436:
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x3ccc }
            X.2eS.A04(r7, r6)     // Catch:{ all -> 0x3ccc }
        L_0x143b:
            android.view.ViewGroup r6 = r9.A00     // Catch:{ all -> 0x3ccc }
            java.lang.String r17 = "buttonWrapperView"
            if (r6 == 0) goto L_0x1431
            android.view.ViewGroup r37 = X.C3019160o.A01(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r7 = r9.A02     // Catch:{ all -> 0x3ccc }
            java.lang.String r15 = "buttonView"
            if (r7 == 0) goto L_0x1455
            android.content.Context r10 = r7.getContext()     // Catch:{ all -> 0x3ccc }
            X.8D7 r6 = r9.A03     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x145a
            java.lang.String r15 = "model"
        L_0x1455:
            X.0qQ.A0F(r15)     // Catch:{ all -> 0x3ccc }
            goto L_0x1bc2
        L_0x145a:
            boolean r6 = r6.A02()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1497
            r6 = r29
            r7.setAlpha(r6)     // Catch:{ all -> 0x3ccc }
        L_0x1465:
            com.instagram.common.ui.base.IgTextView r10 = r9.A02     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x1455
            X.IC1 r7 = new X.IC1     // Catch:{ all -> 0x3ccc }
            r6 = r159
            r7.<init>(r8, r3, r6, r9)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r7, r10)     // Catch:{ all -> 0x3ccc }
            r9.EcX(r2)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = r9.A00     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1431
            r6.requestLayout()     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r7 = r9.A00     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1431
            X.Aqj r6 = new X.Aqj     // Catch:{ all -> 0x3ccc }
            r36 = r6
            r38 = r14
            r39 = r4
            r40 = r8
            r41 = r3
            r42 = r9
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r7, r6)     // Catch:{ all -> 0x3ccc }
            goto L_0x1517
        L_0x1497:
            android.view.ViewGroup r7 = r9.A00     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1431
            java.lang.String r6 = r14.Aej()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x14df
            int r6 = r6.length()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x14df
            java.lang.String r6 = r14.Aej()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1500
            r11 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r11 = X.2Yu.A0H(r10, r11)     // Catch:{ all -> 0x3ccc }
            int r11 = r10.getColor(r11)     // Catch:{ all -> 0x3ccc }
            int r6 = X.0nH.A0C(r6, r11)     // Catch:{ all -> 0x3ccc }
        L_0x14bc:
            r7.setBackgroundColor(r6)     // Catch:{ all -> 0x3ccc }
            java.lang.String r7 = r14.C54()     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x14db
            com.instagram.common.ui.base.IgTextView r6 = r9.A02     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1455
            r11 = 2130970165(0x7f040635, float:1.7549032E38)
            int r11 = X.2Yu.A0H(r10, r11)     // Catch:{ all -> 0x3ccc }
            int r10 = r10.getColor(r11)     // Catch:{ all -> 0x3ccc }
            int r7 = X.0nH.A0C(r7, r10)     // Catch:{ all -> 0x3ccc }
            r6.setTextColor(r7)     // Catch:{ all -> 0x3ccc }
        L_0x14db:
            r9.FJq(r4)     // Catch:{ all -> 0x3ccc }
            goto L_0x1465
        L_0x14df:
            com.instagram.common.ui.base.IgTextView r6 = r9.A02     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1455
            android.content.Context r12 = r6.getContext()     // Catch:{ all -> 0x3ccc }
            java.lang.Boolean r11 = r14.CR9()     // Catch:{ all -> 0x3ccc }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r28)     // Catch:{ all -> 0x3ccc }
            boolean r11 = X.0qQ.A0K(r11, r6)     // Catch:{ all -> 0x3ccc }
            r6 = 2131100036(0x7f060184, float:1.7812442E38)
            if (r11 == 0) goto L_0x14fb
            r6 = 2131099778(0x7f060082, float:1.7811919E38)
        L_0x14fb:
            int r6 = r12.getColor(r6)     // Catch:{ all -> 0x3ccc }
            goto L_0x14bc
        L_0x1500:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1509:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1512:
            X.2eb r6 = r9.A04     // Catch:{ all -> 0x3ccc }
            r6.A03(r1)     // Catch:{ all -> 0x3ccc }
        L_0x1517:
            java.util.List r6 = r3.Bkd(r13)     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x165a
            java.lang.Object r7 = X.00k.A0J(r6)     // Catch:{ all -> 0x3ccc }
            X.3ui r7 = (X.C255783ui) r7     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x165a
            X.8D7 r6 = r7.A13     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x165a
            X.UOB r6 = r6.A0E     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x165a
            java.lang.String r8 = r5.A08     // Catch:{ all -> 0x3ccc }
            java.lang.String r14 = r6.A0J     // Catch:{ all -> 0x3ccc }
            boolean r8 = X.0qQ.A0K(r8, r14)     // Catch:{ all -> 0x3ccc }
            if (r8 != 0) goto L_0x165a
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x3ccc }
            r8 = 36319407398919554(0x81084f00771d82, double:3.031877713367204E-306)
            boolean r8 = X.182.A06(r10, r4, r8)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x165a
            X.OZ9 r119 = X.OZ9.A00     // Catch:{ all -> 0x3ccc }
            android.content.Context r8 = r5.A09     // Catch:{ all -> 0x3ccc }
            r17 = r8
            java.lang.String r10 = r6.A0K     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x1650
            java.lang.String r9 = r6.A0H     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1650
            X.0c5 r8 = X.0c9.A04     // Catch:{ all -> 0x3ccc }
            X.0c9 r9 = r8.A01(r4, r9)     // Catch:{ all -> 0x3ccc }
            r8 = r35
            X.3su r8 = X.C254703su.A00(r9, r8, r2)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1650
            com.instagram.user.model.User r15 = r6.A05     // Catch:{ all -> 0x3ccc }
            if (r15 == 0) goto L_0x1650
            X.3t0 r9 = new X.3t0     // Catch:{ all -> 0x3ccc }
            r9.<init>(r10)     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = r6.A0M     // Catch:{ all -> 0x3ccc }
            java.lang.Integer r10 = r6.A0B     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x1648
            int r72 = r10.intValue()     // Catch:{ all -> 0x3ccc }
        L_0x1573:
            X.0sn r62 = X.0sn.A00     // Catch:{ all -> 0x3ccc }
            X.4li r50 = new X.4li     // Catch:{ all -> 0x3ccc }
            r36 = r50
            r37 = r35
            r38 = r35
            r39 = r35
            r40 = r35
            r41 = r35
            r42 = r35
            r43 = r35
            r44 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x3ccc }
            java.lang.Integer r53 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x3ccc }
            r73 = 29
            X.0sm r68 = X.0Yt.A0E()     // Catch:{ all -> 0x3ccc }
            X.7SD r11 = new X.7SD     // Catch:{ all -> 0x3ccc }
            r36 = r11
            r44 = r35
            r45 = r35
            r46 = r35
            r47 = r35
            r48 = r35
            r49 = r35
            r51 = r35
            r52 = r9
            r54 = r53
            r55 = r35
            r56 = r35
            r57 = r12
            r58 = r35
            r59 = r35
            r60 = r35
            r61 = r35
            r63 = r62
            r64 = r62
            r65 = r35
            r66 = r35
            r67 = r35
            r69 = r35
            r70 = r35
            r71 = r35
            r74 = r2
            r75 = r2
            r76 = r2
            r77 = r2
            r78 = r2
            r79 = r2
            r80 = r2
            r81 = r2
            r82 = r2
            r83 = r28
            r84 = r2
            r85 = r28
            r86 = r2
            r87 = r2
            r88 = r2
            r89 = r2
            r90 = r2
            r91 = r2
            r92 = r2
            r93 = r2
            r94 = r2
            r95 = r28
            r96 = r2
            r97 = r2
            r98 = r2
            r99 = r2
            r100 = r2
            r101 = r2
            r102 = r2
            r103 = r2
            r104 = r2
            r105 = r2
            r106 = r2
            r107 = r2
            r108 = r2
            r109 = r2
            r110 = r2
            r111 = r2
            r112 = r2
            r113 = r2
            r114 = r2
            r115 = r2
            r116 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116)     // Catch:{ all -> 0x3ccc }
            X.7LQ r13 = new X.7LQ     // Catch:{ all -> 0x3ccc }
            r13.<init>(r4, r11, r8, r15)     // Catch:{ all -> 0x3ccc }
            android.os.Parcelable$Creator r8 = com.instagram.direct.capabilities.Capabilities.CREATOR     // Catch:{ all -> 0x3ccc }
            com.instagram.direct.capabilities.Capabilities r123 = X.C376189Gz.A00(r62)     // Catch:{ all -> 0x3ccc }
            X.12T r11 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x3ccc }
            r9 = 480314591(0x1ca104df, float:1.0655345E-21)
            r8 = r24
            X.0nV r8 = r11.CO6(r9, r8)     // Catch:{ all -> 0x3ccc }
            X.19S r125 = X.19E.A02(r8)     // Catch:{ all -> 0x3ccc }
            r120 = r17
            r122 = r4
            r124 = r13
            android.widget.LinearLayout r9 = r119.A01(r120, r121, r122, r123, r124, r125)     // Catch:{ all -> 0x3ccc }
            goto L_0x164c
        L_0x1648:
            r72 = 0
            goto L_0x1573
        L_0x164c:
            if (r9 == 0) goto L_0x1650
            goto L_0x1acd
        L_0x1650:
            r6 = r35
            r5.A08 = r6     // Catch:{ all -> 0x3ccc }
            r5 = r153
            r5.A03(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x16b2
        L_0x165a:
            r6 = r35
            r5.A08 = r6     // Catch:{ all -> 0x3ccc }
            r5 = r153
            r5.A03(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x16b2
        L_0x1664:
            X.0qQ.A0A(r8)     // Catch:{ all -> 0x3ccc }
            java.lang.String r8 = X.C66637Ma6.A00(r8, r10)     // Catch:{ all -> 0x3ccc }
            r6.setText(r8)     // Catch:{ all -> 0x3ccc }
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r10 = r5.A07     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = "avatar"
            if (r10 == 0) goto L_0x1ba9
            com.instagram.common.typedurl.ImageUrl r11 = r15.Bh3()     // Catch:{ all -> 0x3ccc }
            r8 = r35
            r6 = r121
            r10.A0F(r8, r6, r11)     // Catch:{ all -> 0x3ccc }
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = r5.A07     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1ba9
            r6.A06()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r10 = r5.A03     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x1b3d
            X.IC0 r8 = new X.IC0     // Catch:{ all -> 0x3ccc }
            r6 = r159
            r8.<init>(r7, r3, r6, r5)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r8, r10)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgFrameLayout r6 = r5.A01     // Catch:{ all -> 0x3ccc }
            java.lang.String r13 = "messagerowView"
            if (r6 == 0) goto L_0x1b3d
            r6.removeAllViews()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgFrameLayout r6 = r5.A01     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1b3d
            r6.addView(r9)     // Catch:{ all -> 0x3ccc }
            r5.FJq(r4)     // Catch:{ all -> 0x3ccc }
            r5.EcX(r2)     // Catch:{ all -> 0x3ccc }
            X.AqJ r6 = new X.AqJ     // Catch:{ all -> 0x3ccc }
            r6.<init>(r4, r7, r3, r5)     // Catch:{ all -> 0x3ccc }
            r9.post(r6)     // Catch:{ all -> 0x3ccc }
        L_0x16b2:
            r6 = r136
            r5 = r159
            X.AnonymousClass6WX.A00(r3, r6, r5)     // Catch:{ all -> 0x3ccc }
            X.6mP r6 = r0.A1P     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0B(r6, r2)     // Catch:{ all -> 0x3ccc }
            r5 = r35
            X.AnonymousClass6WY.A00(r4, r3, r6, r5)     // Catch:{ all -> 0x3ccc }
            r6 = r135
            r5 = r159
            X.AnonymousClass6WZ.A00(r3, r5, r6)     // Catch:{ all -> 0x3ccc }
            r5 = r137
            X.AnonymousClass6Wa.A00(r3, r5)     // Catch:{ all -> 0x3ccc }
            java.util.List r6 = r3.A0b()     // Catch:{ all -> 0x3ccc }
            X.3WT r5 = X.AnonymousClass3WT.FUNDRAISER     // Catch:{ all -> 0x3ccc }
            X.3ui r10 = X.C289745e8.A00(r5, r6)     // Catch:{ all -> 0x3ccc }
            if (r10 != 0) goto L_0x1a5e
            r5 = r151
            r5.A03(r1)     // Catch:{ all -> 0x3ccc }
        L_0x16e0:
            java.util.List r6 = r3.A0b()     // Catch:{ all -> 0x3ccc }
            X.3WT r5 = X.AnonymousClass3WT.SMB_SUPPORT     // Catch:{ all -> 0x3ccc }
            X.3ui r8 = X.C289745e8.A00(r5, r6)     // Catch:{ all -> 0x3ccc }
            if (r8 != 0) goto L_0x19da
            r5 = r149
            r5.A03(r1)     // Catch:{ all -> 0x3ccc }
        L_0x16f1:
            com.instagram.user.model.User r5 = r3.A0i     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19d6
            java.lang.String r5 = r5.getId()     // Catch:{ all -> 0x3ccc }
        L_0x16f9:
            boolean r5 = X.2R8.A05(r4, r5)     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x17c3
            java.util.List r6 = r3.A0b()     // Catch:{ all -> 0x3ccc }
            X.3WT r5 = X.AnonymousClass3WT.REACTION     // Catch:{ all -> 0x3ccc }
            X.3ui r12 = X.C289745e8.A00(r5, r6)     // Catch:{ all -> 0x3ccc }
            if (r12 == 0) goto L_0x19c5
            X.5Hn r5 = r12.A16     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19c5
            java.lang.String r5 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19c5
            boolean r5 = X.C336957fS.A03(r5)     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19c5
            X.5Hn r11 = r12.A16     // Catch:{ all -> 0x3ccc }
            if (r11 == 0) goto L_0x1b85
            r5 = r134
            X.0eM r10 = r5.A05     // Catch:{ all -> 0x3ccc }
            java.lang.Object r9 = r10.getValue()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r9 = (com.instagram.common.ui.base.IgSimpleImageView) r9     // Catch:{ all -> 0x3ccc }
            java.util.Map r8 = r5.A03     // Catch:{ all -> 0x3ccc }
            java.lang.Object r7 = r8.get(r11)     // Catch:{ all -> 0x3ccc }
            if (r7 != 0) goto L_0x173e
            android.content.Context r6 = r5.A00     // Catch:{ all -> 0x3ccc }
            X.WaI r5 = new X.WaI     // Catch:{ all -> 0x3ccc }
            r5.<init>(r11)     // Catch:{ all -> 0x3ccc }
            X.UpZ r7 = new X.UpZ     // Catch:{ all -> 0x3ccc }
            r7.<init>(r6, r5, r2, r2)     // Catch:{ all -> 0x3ccc }
            r8.put(r11, r7)     // Catch:{ all -> 0x3ccc }
        L_0x173e:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7     // Catch:{ all -> 0x3ccc }
            r9.setImageDrawable(r7)     // Catch:{ all -> 0x3ccc }
            r5 = r134
            X.0eM r9 = r5.A04     // Catch:{ all -> 0x3ccc }
            java.lang.Object r8 = r9.getValue()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r8 = (com.instagram.common.ui.base.IgSimpleImageView) r8     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1777
            java.util.Map r7 = r5.A02     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r7.get(r11)     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1772
            android.content.Context r5 = r5.A00     // Catch:{ all -> 0x3ccc }
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x3ccc }
            r5 = 2131165286(0x7f070066, float:1.7944785E38)
            int r5 = r6.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3ccc }
            float r5 = (float) r5     // Catch:{ all -> 0x3ccc }
            X.Ttd r6 = new X.Ttd     // Catch:{ all -> 0x3ccc }
            r6.<init>(r5)     // Catch:{ all -> 0x3ccc }
            java.lang.String r5 = r11.A00     // Catch:{ all -> 0x3ccc }
            r6.A00(r5)     // Catch:{ all -> 0x3ccc }
            r7.put(r11, r6)     // Catch:{ all -> 0x3ccc }
        L_0x1772:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6     // Catch:{ all -> 0x3ccc }
            r8.setImageDrawable(r6)     // Catch:{ all -> 0x3ccc }
        L_0x1777:
            java.lang.Object r5 = r10.getValue()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5     // Catch:{ all -> 0x3ccc }
            X.3NG r7 = new X.3NG     // Catch:{ all -> 0x3ccc }
            r7.<init>(r5)     // Catch:{ all -> 0x3ccc }
            r5 = r28
            r7.A07 = r5     // Catch:{ all -> 0x3ccc }
            X.NQz r6 = new X.NQz     // Catch:{ all -> 0x3ccc }
            r5 = r159
            r6.<init>(r12, r5)     // Catch:{ all -> 0x3ccc }
            r7.A04 = r6     // Catch:{ all -> 0x3ccc }
            X.3NM r5 = r7.A00()     // Catch:{ all -> 0x3ccc }
            java.lang.Object r6 = r9.getValue()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6     // Catch:{ all -> 0x3ccc }
            android.view.View[] r6 = new android.view.View[]{r6}     // Catch:{ all -> 0x3ccc }
            java.util.List r7 = r5.A09     // Catch:{ all -> 0x3ccc }
            r7.clear()     // Catch:{ all -> 0x3ccc }
            r6 = r6[r2]     // Catch:{ all -> 0x3ccc }
            X.3NH r5 = new X.3NH     // Catch:{ all -> 0x3ccc }
            r5.<init>(r6)     // Catch:{ all -> 0x3ccc }
            r7.add(r5)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgFrameLayout r7 = r134.A00()     // Catch:{ all -> 0x3ccc }
            X.Apg r6 = new X.Apg     // Catch:{ all -> 0x3ccc }
            r5 = r134
            r6.<init>(r3, r12, r5)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r7, r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgFrameLayout r5 = r134.A00()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x17c3
            r5.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
        L_0x17c3:
            X.3WT r9 = X.AnonymousClass3WT.POLAROID_STICKER     // Catch:{ all -> 0x3ccc }
            java.util.List r5 = r3.Bkd(r9)     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19be
            java.lang.Object r8 = X.00k.A0J(r5)     // Catch:{ all -> 0x3ccc }
            X.3ui r8 = (X.C255783ui) r8     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x19be
            int r6 = r5.size()     // Catch:{ all -> 0x3ccc }
            r5 = r28
            if (r6 != r5) goto L_0x19be
            X.1Xj r5 = r3.BPf()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19be
            X.1Xy r5 = r5.A0C     // Catch:{ all -> 0x3ccc }
            java.lang.Boolean r6 = r5.AgT()     // Catch:{ all -> 0x3ccc }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r28)     // Catch:{ all -> 0x3ccc }
            boolean r6 = X.0qQ.A0K(r6, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r28
            if (r6 != r5) goto L_0x19be
            r5 = r132
            android.animation.ValueAnimator r5 = r5.A00     // Catch:{ all -> 0x3ccc }
            r5.cancel()     // Catch:{ all -> 0x3ccc }
            r5.removeAllUpdateListeners()     // Catch:{ all -> 0x3ccc }
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = r131
            r5.setAlpha(r6)     // Catch:{ all -> 0x3ccc }
            r5.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            android.content.res.Resources r6 = r131.getResources()     // Catch:{ all -> 0x3ccc }
            r5 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r6 = r6.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3ccc }
            r5 = r131
            X.0nA.A0g(r5, r6, r6)     // Catch:{ all -> 0x3ccc }
            X.IBd r7 = new X.IBd     // Catch:{ all -> 0x3ccc }
            r6 = r159
            r5 = r132
            r7.<init>(r3, r6, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r131
            X.AnonymousClass0fU.A00(r7, r5)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = X.C3019160o.A01(r131)     // Catch:{ all -> 0x3ccc }
            X.IjO r5 = new X.IjO     // Catch:{ all -> 0x3ccc }
            r10 = r5
            r11 = r6
            r12 = r4
            r13 = r8
            r14 = r3
            r15 = r132
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r6, r5)     // Catch:{ all -> 0x3ccc }
        L_0x1838:
            java.util.List r6 = r3.Bkd(r9)     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x19b7
            java.lang.Object r5 = X.00k.A0J(r6)     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19b7
            int r6 = r6.size()     // Catch:{ all -> 0x3ccc }
            r5 = r28
            if (r6 != r5) goto L_0x19b7
            X.1Xj r5 = r3.BPf()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x19b7
            X.1Xy r5 = r5.A0C     // Catch:{ all -> 0x3ccc }
            java.lang.Boolean r6 = r5.AgT()     // Catch:{ all -> 0x3ccc }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r28)     // Catch:{ all -> 0x3ccc }
            boolean r6 = X.0qQ.A0K(r6, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r28
            if (r6 != r5) goto L_0x19b7
            r5 = r130
            X.5nL r5 = r5.A01     // Catch:{ all -> 0x3ccc }
            r5.A0G()     // Catch:{ all -> 0x3ccc }
            r5 = r130
            android.view.View r6 = r5.A00     // Catch:{ all -> 0x3ccc }
            r5 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r5)     // Catch:{ all -> 0x3ccc }
            r6.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
        L_0x1877:
            java.util.List r6 = r3.A0b()     // Catch:{ all -> 0x3ccc }
            X.3WT r5 = X.AnonymousClass3WT.MUSIC_PICK_STICKER     // Catch:{ all -> 0x3ccc }
            X.3ui r10 = X.C289745e8.A00(r5, r6)     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x19b0
            boolean r5 = r138.CVM()     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x18b1
            android.view.View r6 = r138.getView()     // Catch:{ all -> 0x3ccc }
            r5 = r139
            r5.A01 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r6 = r138.getView()     // Catch:{ all -> 0x3ccc }
            r5 = 2131436710(0x7f0b24a6, float:1.8495298E38)
            android.view.View r6 = r6.requireViewById(r5)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6     // Catch:{ all -> 0x3ccc }
            r5 = r139
            r5.A02 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r6 = r138.getView()     // Catch:{ all -> 0x3ccc }
            r5 = 2131436705(0x7f0b24a1, float:1.8495288E38)
            android.view.View r6 = r6.requireViewById(r5)     // Catch:{ all -> 0x3ccc }
            r5 = r139
            r5.A00 = r6     // Catch:{ all -> 0x3ccc }
        L_0x18b1:
            r5 = r139
            android.content.Context r7 = r5.A03     // Catch:{ all -> 0x3ccc }
            com.instagram.reels.musicpick.model.MusicPickStickerModel r6 = r10.A0D()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1b7c
            X.7w6 r9 = new X.7w6     // Catch:{ all -> 0x3ccc }
            r5 = r23
            r9.<init>(r7, r4, r6, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r139
            com.instagram.common.ui.base.IgSimpleImageView r7 = r5.A02     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = "stickerView"
            if (r7 == 0) goto L_0x1ba9
            X.IBa r6 = new X.IBa     // Catch:{ all -> 0x3ccc }
            r5 = r159
            r6.<init>(r3, r10, r5)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r6, r7)     // Catch:{ all -> 0x3ccc }
            r5 = r139
            android.view.View r8 = r5.A00     // Catch:{ all -> 0x3ccc }
            java.lang.String r11 = "buttonView"
            if (r8 == 0) goto L_0x1b78
            X.IC2 r7 = new X.IC2     // Catch:{ all -> 0x3ccc }
            r6 = r5
            r5 = r159
            r7.<init>(r3, r10, r5, r6)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r7, r8)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r5 = r6.A02     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1ba9
            r5.setImageDrawable(r9)     // Catch:{ all -> 0x3ccc }
            android.view.View r6 = r6.A01     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = "stickerContainerView"
            if (r6 == 0) goto L_0x1ba9
            int r5 = r9.A00     // Catch:{ all -> 0x3ccc }
            int r7 = r9.getIntrinsicHeight()     // Catch:{ all -> 0x3ccc }
            X.0nA.A0g(r6, r5, r7)     // Catch:{ all -> 0x3ccc }
            r6 = r139
            android.view.View r6 = r6.A00     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1b78
            int r5 = r5 / 2
            X.0nA.A0f(r6, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r139
            android.view.View r7 = r5.A01     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1ba9
            X.Ij8 r6 = new X.Ij8     // Catch:{ all -> 0x3ccc }
            r6.<init>(r4, r3, r10, r5)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r7, r6)     // Catch:{ all -> 0x3ccc }
            r5 = r138
            r5.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
        L_0x191b:
            X.3WT r5 = X.AnonymousClass3WT.SECRET_STICKER     // Catch:{ all -> 0x3ccc }
            java.util.List r6 = r3.Bkd(r5)     // Catch:{ all -> 0x3ccc }
            r5 = 0
            if (r6 == 0) goto L_0x19aa
            java.lang.Object r10 = X.00k.A0J(r6)     // Catch:{ all -> 0x3ccc }
            X.3ui r10 = (X.C255783ui) r10     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x19aa
            com.instagram.user.model.User r6 = r3.CCd()     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1936
            java.lang.String r5 = r6.getId()     // Catch:{ all -> 0x3ccc }
        L_0x1936:
            boolean r5 = X.2R8.A05(r4, r5)     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x19aa
            X.1Xj r5 = r3.BPf()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x199d
            com.instagram.common.typedurl.ImageUrl r39 = r5.A1Q()     // Catch:{ all -> 0x3ccc }
            if (r39 == 0) goto L_0x199d
            r6 = r129
            r6.A00 = r5     // Catch:{ all -> 0x3ccc }
            java.lang.String r6 = r10.A1e     // Catch:{ all -> 0x3ccc }
            X.1Xy r5 = r5.A0C     // Catch:{ all -> 0x3ccc }
            com.instagram.user.model.User r5 = r5.CCd()     // Catch:{ all -> 0x3ccc }
            X.Aej r9 = new X.Aej     // Catch:{ all -> 0x3ccc }
            r9.<init>()     // Catch:{ all -> 0x3ccc }
            r9.A01 = r6     // Catch:{ all -> 0x3ccc }
            r9.A00 = r5     // Catch:{ all -> 0x3ccc }
            r5 = r129
            android.view.View r8 = r5.A04     // Catch:{ all -> 0x3ccc }
            android.content.Context r7 = r8.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3ccc }
            java.lang.String r6 = r121.getModuleName()     // Catch:{ all -> 0x3ccc }
            X.7w5 r5 = new X.7w5     // Catch:{ all -> 0x3ccc }
            r5.<init>(r7, r9, r6)     // Catch:{ all -> 0x3ccc }
            r6 = r129
            com.instagram.common.ui.base.IgSimpleImageView r6 = r6.A06     // Catch:{ all -> 0x3ccc }
            r6.setImageDrawable(r5)     // Catch:{ all -> 0x3ccc }
            X.IB0 r6 = new X.IB0     // Catch:{ all -> 0x3ccc }
            r5 = r159
            r6.<init>(r3, r5)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r6, r8)     // Catch:{ all -> 0x3ccc }
            X.Ijd r5 = new X.Ijd     // Catch:{ all -> 0x3ccc }
            r36 = r5
            r37 = r121
            r38 = r4
            r40 = r10
            r41 = r3
            r42 = r159
            r43 = r129
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3ccc }
            r6 = r128
            X.0nA.A0q(r6, r5)     // Catch:{ all -> 0x3ccc }
            r6.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
        L_0x199d:
            X.3ui r8 = X.AnonymousClass6YG.A02(r3)     // Catch:{ all -> 0x3ccc }
            r6 = 0
            if (r8 == 0) goto L_0x1d27
            X.UNR r5 = r8.A0O     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1d1b
            goto L_0x1d23
        L_0x19aa:
            r5 = r128
            r5.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x199d
        L_0x19b0:
            r5 = r138
            r5.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x191b
        L_0x19b7:
            r5 = r130
            r5.A00(r2)     // Catch:{ all -> 0x3ccc }
            goto L_0x1877
        L_0x19be:
            r5 = r131
            r5.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x1838
        L_0x19c5:
            r5 = r133
            android.view.View r5 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x17c3
            com.instagram.common.ui.base.IgFrameLayout r5 = r134.A00()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x17c3
            r5.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x17c3
        L_0x19d6:
            r5 = r35
            goto L_0x16f9
        L_0x19da:
            r5 = r150
            android.widget.ImageView r5 = r5.A01     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x19f3
            android.view.View r6 = r149.A01()     // Catch:{ all -> 0x3ccc }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ all -> 0x3ccc }
            r5 = r150
            r5.A01 = r6     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = X.C3019160o.A00(r6)     // Catch:{ all -> 0x3ccc }
            r5.A00 = r6     // Catch:{ all -> 0x3ccc }
        L_0x19f3:
            r5 = r149
            r5.A03(r2)     // Catch:{ all -> 0x3ccc }
            com.instagram.api.schemas.SMBSupportStickerDict r5 = r8.A0P     // Catch:{ all -> 0x3ccc }
            r5.getClass()     // Catch:{ all -> 0x3ccc }
            X.Vuw r9 = new X.Vuw     // Catch:{ all -> 0x3ccc }
            r9.<init>()     // Catch:{ all -> 0x3ccc }
            r9.A00 = r5     // Catch:{ all -> 0x3ccc }
            r5 = r150
            android.widget.ImageView r5 = r5.A01     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r5)     // Catch:{ all -> 0x3ccc }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x3ccc }
            X.UpY r6 = new X.UpY     // Catch:{ all -> 0x3ccc }
            r6.<init>(r5)     // Catch:{ all -> 0x3ccc }
            r6.A0B(r9)     // Catch:{ all -> 0x3ccc }
            r5 = r150
            android.widget.ImageView r5 = r5.A01     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r5)     // Catch:{ all -> 0x3ccc }
            r5.setImageDrawable(r6)     // Catch:{ all -> 0x3ccc }
            r5 = r162
            boolean r5 = r5.A0H     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1a55
            java.lang.Integer r5 = r9.A01()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1a55
            r5 = r150
            android.widget.ImageView r7 = r5.A01     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r7)     // Catch:{ all -> 0x3ccc }
            X.W9q r6 = new X.W9q     // Catch:{ all -> 0x3ccc }
            r5 = r159
            r6.<init>(r3, r9, r5)     // Catch:{ all -> 0x3ccc }
        L_0x1a3e:
            X.AnonymousClass0fU.A00(r6, r7)     // Catch:{ all -> 0x3ccc }
            r5 = r150
            android.widget.ImageView r9 = r5.A01     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r9)     // Catch:{ all -> 0x3ccc }
            X.IjB r7 = new X.IjB     // Catch:{ all -> 0x3ccc }
            r6 = r5
            r5 = r159
            r7.<init>(r3, r8, r6, r5)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r9, r7)     // Catch:{ all -> 0x3ccc }
            goto L_0x16f1
        L_0x1a55:
            r5 = r150
            android.widget.ImageView r7 = r5.A01     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r7)     // Catch:{ all -> 0x3ccc }
            r6 = 0
            goto L_0x1a3e
        L_0x1a5e:
            r5 = r152
            android.widget.ImageView r5 = r5.A01     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1a77
            android.view.View r6 = r151.A01()     // Catch:{ all -> 0x3ccc }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ all -> 0x3ccc }
            r5 = r152
            r5.A01 = r6     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x3ccc }
            android.view.ViewGroup r6 = X.C3019160o.A00(r6)     // Catch:{ all -> 0x3ccc }
            r5.A00 = r6     // Catch:{ all -> 0x3ccc }
        L_0x1a77:
            r5 = r151
            r5.A03(r2)     // Catch:{ all -> 0x3ccc }
            X.8YF r5 = r10.A0y     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1b97
            X.WaN r9 = new X.WaN     // Catch:{ all -> 0x3ccc }
            r9.<init>(r5)     // Catch:{ all -> 0x3ccc }
            r5 = r152
            android.widget.ImageView r8 = r5.A01     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1b8e
            android.content.Context r6 = r8.getContext()     // Catch:{ all -> 0x3ccc }
            X.8v3 r5 = new X.8v3     // Catch:{ all -> 0x3ccc }
            r5.<init>(r6, r4, r9)     // Catch:{ all -> 0x3ccc }
            r8.setImageDrawable(r5)     // Catch:{ all -> 0x3ccc }
            r5 = r162
            boolean r5 = r5.A07     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1acb
            X.W9y r7 = new X.W9y     // Catch:{ all -> 0x3ccc }
            r6 = r152
            r5 = r159
            r7.<init>(r3, r9, r6, r5)     // Catch:{ all -> 0x3ccc }
        L_0x1aa6:
            X.AnonymousClass0fU.A00(r7, r8)     // Catch:{ all -> 0x3ccc }
            X.Wpw r5 = new X.Wpw     // Catch:{ all -> 0x3ccc }
            r110 = r173
            r109 = r172
            r105 = r5
            r106 = r8
            r107 = r4
            r108 = r3
            r111 = r9
            r112 = r10
            r113 = r160
            r114 = r152
            r115 = r159
            r116 = r23
            r105.<init>(r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r8, r5)     // Catch:{ all -> 0x3ccc }
            goto L_0x16e0
        L_0x1acb:
            r7 = 0
            goto L_0x1aa6
        L_0x1acd:
            r5.A08 = r14     // Catch:{ all -> 0x3ccc }
            r5.A06 = r6     // Catch:{ all -> 0x3ccc }
            r6 = r153
            android.view.View r6 = r6.A00     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1b54
            android.view.View r8 = r153.A01()     // Catch:{ all -> 0x3ccc }
            r5.A00 = r8     // Catch:{ all -> 0x3ccc }
            java.lang.String r13 = "view"
            if (r8 == 0) goto L_0x1b3d
            r6 = 2131436243(0x7f0b22d3, float:1.849435E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6     // Catch:{ all -> 0x3ccc }
            r5.A05 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r8 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1b3d
            r6 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6     // Catch:{ all -> 0x3ccc }
            r5.A04 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r8 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1b3d
            r6 = 2131436236(0x7f0b22cc, float:1.8494337E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r6     // Catch:{ all -> 0x3ccc }
            r5.A07 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r8 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1b3d
            r6 = 2131436241(0x7f0b22d1, float:1.8494347E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgFrameLayout r6 = (com.instagram.common.ui.base.IgFrameLayout) r6     // Catch:{ all -> 0x3ccc }
            r5.A01 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r8 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1b3d
            r6 = 2131436237(0x7f0b22cd, float:1.8494339E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = (com.instagram.common.ui.base.IgTextView) r6     // Catch:{ all -> 0x3ccc }
            r5.A03 = r6     // Catch:{ all -> 0x3ccc }
            android.view.View r8 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1b3d
            r6 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r6 = r8.findViewById(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgProgressBar r6 = (com.instagram.common.ui.base.IgProgressBar) r6     // Catch:{ all -> 0x3ccc }
            r5.A02 = r6     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = r5.A03     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1b42
            java.lang.String r13 = "buttonView"
        L_0x1b3d:
            X.0qQ.A0F(r13)     // Catch:{ all -> 0x3ccc }
            goto L_0x1bc2
        L_0x1b42:
            X.2eS.A01(r6)     // Catch:{ all -> 0x3ccc }
            android.view.View r11 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r11 == 0) goto L_0x1b3d
            r8 = r24
            r6 = r17
            float r6 = X.0nA.A04(r6, r8)     // Catch:{ all -> 0x3ccc }
            r11.setElevation(r6)     // Catch:{ all -> 0x3ccc }
        L_0x1b54:
            r8 = r153
            r6 = r21
            r8.A03(r6)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = r5.A03     // Catch:{ all -> 0x3ccc }
            java.lang.String r13 = "buttonView"
            if (r6 == 0) goto L_0x1b3d
            android.content.Context r8 = r6.getContext()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = r5.A05     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1b6c
            java.lang.String r13 = "title"
            goto L_0x1b3d
        L_0x1b6c:
            if (r12 == 0) goto L_0x1ba0
            r6.setText(r12)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r6 = r5.A04     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1664
            java.lang.String r13 = "subtitle"
            goto L_0x1b3d
        L_0x1b78:
            X.0qQ.A0F(r11)     // Catch:{ all -> 0x3ccc }
            goto L_0x1bc2
        L_0x1b7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1b85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1b8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1b97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1ba0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1ba9:
            X.0qQ.A0F(r12)     // Catch:{ all -> 0x3ccc }
            goto L_0x1bc2
        L_0x1bad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1bb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1bbf:
            X.0qQ.A0F(r10)     // Catch:{ all -> 0x3ccc }
        L_0x1bc2:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x1cad
        L_0x1bc8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1bd1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1bda:
            r36 = 2131971697(0x7f134e71, float:1.958038E38)
            com.instagram.user.model.User r8 = r13.CCd()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1c14
            java.lang.String r9 = r8.getUsername()     // Catch:{ all -> 0x3ccc }
        L_0x1be7:
            android.widget.TextView r8 = r0.A0c     // Catch:{ all -> 0x3ccc }
            android.content.Context r8 = r8.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3ccc }
            java.lang.String r14 = X.1G0.A03(r8, r14)     // Catch:{ all -> 0x3ccc }
            r8 = r163
            int r8 = r8.A01     // Catch:{ all -> 0x3ccc }
            int r8 = r8 + 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x3ccc }
            r8 = r163
            int r8 = r8.A02(r4)     // Catch:{ all -> 0x3ccc }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x3ccc }
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r14, r12, r13, r8}     // Catch:{ all -> 0x3ccc }
            r8 = r36
            java.lang.String r8 = r11.getString(r8, r9)     // Catch:{ all -> 0x3ccc }
            goto L_0x0dfe
        L_0x1c14:
            r9 = 0
            goto L_0x1be7
        L_0x1c16:
            android.content.Context r11 = r48.getContext()     // Catch:{ all -> 0x3ccc }
            r8 = 2131969399(0x7f134577, float:1.957572E38)
            java.lang.String r9 = r11.getString(r8)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x3ccc }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x3ccc }
            java.lang.String r12 = r9.toLowerCase(r8)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x3ccc }
            goto L_0x0dbd
        L_0x1c2f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1c37:
            r8 = r160
            r8.A0l = r2     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r9 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            java.lang.String r8 = r3.A0S()     // Catch:{ all -> 0x3ccc }
            r9.setMiniPreviewPayload(r8)     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r11 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            long r8 = r3.A02()     // Catch:{ all -> 0x3ccc }
            r11.setExpiration(r8)     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r11 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            r9 = 2131435566(0x7f0b202e, float:1.8492978E38)
            X.6WR r8 = new X.6WR     // Catch:{ all -> 0x3ccc }
            r39 = r8
            r40 = r121
            r41 = r4
            r42 = r3
            r43 = r163
            r44 = r160
            r45 = r158
            r46 = r0
            r47 = r23
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ all -> 0x3ccc }
            r11.A0A(r8, r9)     // Catch:{ all -> 0x3ccc }
            if (r38 == 0) goto L_0x1c75
            goto L_0x1cae
        L_0x1c75:
            r8 = r163
            com.instagram.model.reels.Reel r8 = r8.A0H     // Catch:{ all -> 0x3ccc }
            boolean r8 = r8.A18(r4)     // Catch:{ all -> 0x3ccc }
            if (r8 != 0) goto L_0x0d85
            boolean r8 = r3.A1E()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1c95
            com.instagram.feed.widget.IgProgressImageView r9 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            r8 = 2131240010(0x7f08244a, float:1.8096343E38)
            android.graphics.drawable.Drawable r8 = r7.getDrawable(r8)     // Catch:{ all -> 0x3ccc }
            r9.setImageDrawable(r8)     // Catch:{ all -> 0x3ccc }
            goto L_0x0d85
        L_0x1c95:
            X.6VC r8 = X.AnonymousClass6VB.A00(r4)     // Catch:{ all -> 0x3ccc }
            r8.A0C(r3, r2)     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r11 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.typedurl.ImageUrl r9 = r3.A08(r7)     // Catch:{ all -> 0x3ccc }
            if (r9 != 0) goto L_0x1cd2
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
        L_0x1cad:
            throw r1     // Catch:{ all -> 0x3ccc }
        L_0x1cae:
            r16.getClass()     // Catch:{ all -> 0x3ccc }
            r8 = r121
            r9 = r16
            X.AnonymousClass6YF.A03(r8, r4, r9)     // Catch:{ all -> 0x3ccc }
            boolean r8 = r16.A4o()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1ce1
            X.6VC r8 = X.AnonymousClass6VB.A00(r4)     // Catch:{ all -> 0x3ccc }
            r8.A0C(r3, r2)     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r11 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            android.net.Uri r9 = r9.A05     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1cd9
            r8 = -1
            com.instagram.common.typedurl.SimpleImageUrl r9 = X.C253833rU.A00(r9, r8, r8)     // Catch:{ all -> 0x3ccc }
        L_0x1cd2:
            r8 = r121
            r11.setUrl(r9, r8)     // Catch:{ all -> 0x3ccc }
            goto L_0x0d85
        L_0x1cd9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1ce1:
            com.instagram.common.typedurl.ImageUrl r8 = r3.A08(r7)     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0d85
            com.instagram.common.typedurl.ImageUrl r8 = r3.A06()     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x0d85
            X.6VC r8 = X.AnonymousClass6VB.A00(r4)     // Catch:{ all -> 0x3ccc }
            r8.A0C(r3, r2)     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r12 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.typedurl.ImageUrl r11 = r3.A08(r7)     // Catch:{ all -> 0x3ccc }
            if (r11 == 0) goto L_0x1d13
            com.instagram.common.typedurl.ImageUrl r9 = r3.A06()     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1d0b
            r8 = r121
            r12.setUrlWithFallback(r11, r9, r8)     // Catch:{ all -> 0x3ccc }
            goto L_0x0d85
        L_0x1d0b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1d13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3ccc }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x3ccc }
            goto L_0x1cad
        L_0x1d1b:
            X.WaP r7 = new X.WaP     // Catch:{ all -> 0x3ccc }
            r7.<init>()     // Catch:{ all -> 0x3ccc }
            r7.A00 = r5     // Catch:{ all -> 0x3ccc }
            goto L_0x1d24
        L_0x1d23:
            r7 = 0
        L_0x1d24:
            if (r7 == 0) goto L_0x1d31
            goto L_0x1d29
        L_0x1d27:
            r7 = r6
            goto L_0x1d31
        L_0x1d29:
            X.UNR r5 = r7.A00     // Catch:{ all -> 0x3ccc }
            com.instagram.reels.question.constants.QuestionStickerType r6 = r5.A00     // Catch:{ all -> 0x3ccc }
            if (r6 != 0) goto L_0x1d31
            com.instagram.reels.question.constants.QuestionStickerType r6 = com.instagram.reels.question.constants.QuestionStickerType.TEXT     // Catch:{ all -> 0x3ccc }
        L_0x1d31:
            com.instagram.reels.question.constants.QuestionStickerType r5 = com.instagram.reels.question.constants.QuestionStickerType.PICS_PLEASE     // Catch:{ all -> 0x3ccc }
            if (r6 != r5) goto L_0x1d96
            r5 = r25
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r24
            X.0qQ.A0B(r7, r5)     // Catch:{ all -> 0x3ccc }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x3ccc }
            r5 = 36329582168654030(0x811190000040ce, double:3.038312278717796E-306)
            boolean r10 = X.182.A06(r9, r4, r5)     // Catch:{ all -> 0x3ccc }
            X.Aeh r6 = new X.Aeh     // Catch:{ all -> 0x3ccc }
            r6.<init>(r7)     // Catch:{ all -> 0x3ccc }
            android.content.Context r5 = r126.getContext()     // Catch:{ all -> 0x3ccc }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x3ccc }
            X.9pu r9 = new X.9pu     // Catch:{ all -> 0x3ccc }
            r9.<init>(r5, r6)     // Catch:{ all -> 0x3ccc }
            int r6 = r9.A00     // Catch:{ all -> 0x3ccc }
            r5 = r126
            X.0nA.A0f(r5, r6)     // Catch:{ all -> 0x3ccc }
            r5 = r127
            com.instagram.common.ui.base.IgSimpleImageView r5 = r5.A01     // Catch:{ all -> 0x3ccc }
            r5.setImageDrawable(r9)     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x1d77
            X.W9e r6 = new X.W9e     // Catch:{ all -> 0x3ccc }
            r5 = r159
            r6.<init>(r7, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r126
            X.AnonymousClass0fU.A00(r6, r5)     // Catch:{ all -> 0x3ccc }
        L_0x1d77:
            android.view.ViewParent r6 = r126.getParent()     // Catch:{ all -> 0x3ccc }
            boolean r5 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1d8f
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x3ccc }
            if (r6 == 0) goto L_0x1d8f
            X.Aqa r5 = new X.Aqa     // Catch:{ all -> 0x3ccc }
            r7 = r4
            r9 = r3
            r10 = r127
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x3ccc }
            X.0nA.A0q(r6, r5)     // Catch:{ all -> 0x3ccc }
        L_0x1d8f:
            r5 = r126
            r5.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
            goto L_0x1f1e
        L_0x1d96:
            r5 = r126
            r5.setVisibility(r1)     // Catch:{ all -> 0x3ccc }
            goto L_0x1f1e
        L_0x1d9d:
            boolean r5 = r3.A1Y()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1df8
            r5 = r55
            X.AnonymousClass6WT.A00(r4, r3, r5)     // Catch:{ all -> 0x3ccc }
            r5 = r54
            X.AnonymousClass6WU.A00(r4, r3, r5)     // Catch:{ all -> 0x3ccc }
            X.4gK r5 = r3.A0d     // Catch:{ all -> 0x3ccc }
            r5.getClass()     // Catch:{ all -> 0x3ccc }
            X.3Q2 r5 = r5.A00     // Catch:{ all -> 0x3ccc }
            java.util.List r5 = r5.A4h     // Catch:{ all -> 0x3ccc }
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x3ccc }
        L_0x1dba:
            boolean r5 = r7.hasNext()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1df4
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x3ccc }
            X.5Ek r6 = (X.C282705Ek) r6     // Catch:{ all -> 0x3ccc }
            boolean r5 = r6.A0C     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1dba
            java.lang.String r7 = r6.A09     // Catch:{ all -> 0x3ccc }
            if (r7 == 0) goto L_0x1df4
            r6 = r51
            r5 = r159
            r6.A03(r3, r5, r7)     // Catch:{ all -> 0x3ccc }
        L_0x1dd5:
            r6 = r136
            r5 = r159
            X.AnonymousClass6WX.A00(r3, r6, r5)     // Catch:{ all -> 0x3ccc }
            X.6mP r6 = r0.A1P     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0B(r6, r2)     // Catch:{ all -> 0x3ccc }
            r5 = r35
            X.AnonymousClass6WY.A00(r4, r3, r6, r5)     // Catch:{ all -> 0x3ccc }
            r6 = r135
            r5 = r159
            X.AnonymousClass6WZ.A00(r3, r5, r6)     // Catch:{ all -> 0x3ccc }
            r5 = r137
            X.AnonymousClass6Wa.A00(r3, r5)     // Catch:{ all -> 0x3ccc }
            goto L_0x1f1e
        L_0x1df4:
            r51.A02()     // Catch:{ all -> 0x3ccc }
            goto L_0x1dd5
        L_0x1df8:
            boolean r5 = r3.A1E()     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1f1e
            X.0qQ.A0A(r7)     // Catch:{ all -> 0x3ccc }
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgLinearLayout r5 = r6.A00     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1e50
            X.3oV r5 = r6.A05     // Catch:{ all -> 0x3ccc }
            android.view.View r9 = r5.getView()     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgLinearLayout r9 = (com.instagram.common.ui.base.IgLinearLayout) r9     // Catch:{ all -> 0x3ccc }
            android.content.Context r5 = r9.getContext()     // Catch:{ all -> 0x3ccc }
            android.content.res.Resources r8 = r5.getResources()     // Catch:{ all -> 0x3ccc }
            r5 = 2131237725(0x7f081b5d, float:1.8091709E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass2dd.A00(r8, r5)     // Catch:{ all -> 0x3ccc }
            r9.setBackground(r5)     // Catch:{ all -> 0x3ccc }
            r6.A00 = r9     // Catch:{ all -> 0x3ccc }
            r5 = 2131432582(0x7f0b1486, float:1.8486926E38)
            android.view.View r5 = r9.requireViewById(r5)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5     // Catch:{ all -> 0x3ccc }
            r6.A01 = r5     // Catch:{ all -> 0x3ccc }
            r5 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r5 = r9.requireViewById(r5)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x3ccc }
            r6.A04 = r5     // Catch:{ all -> 0x3ccc }
            r5 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r5 = r9.requireViewById(r5)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5     // Catch:{ all -> 0x3ccc }
            r6.A03 = r5     // Catch:{ all -> 0x3ccc }
            r5 = 2131441814(0x7f0b3896, float:1.850565E38)
            android.view.View r5 = r9.requireViewById(r5)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5     // Catch:{ all -> 0x3ccc }
            r6.A02 = r5     // Catch:{ all -> 0x3ccc }
        L_0x1e50:
            boolean r5 = r3.A0Q     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1eff
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x3ccc }
            r8 = 36327073907751059(0x810f4800003893, double:3.036726044422801E-306)
            boolean r5 = X.182.A06(r5, r4, r8)     // Catch:{ all -> 0x3ccc }
            if (r5 != 0) goto L_0x1eff
            com.instagram.common.ui.base.IgSimpleImageView r5 = r6.A01     // Catch:{ all -> 0x3ccc }
            r11 = 0
            if (r5 == 0) goto L_0x1ebc
            com.instagram.user.model.User r8 = r3.A0i     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1efd
            android.content.res.Resources r10 = r7.getResources()     // Catch:{ all -> 0x3ccc }
            r9 = 2131165319(0x7f070087, float:1.7944852E38)
            int r39 = r10.getDimensionPixelSize(r9)     // Catch:{ all -> 0x3ccc }
            android.content.res.Resources r10 = r7.getResources()     // Catch:{ all -> 0x3ccc }
            r9 = 2131165190(0x7f070006, float:1.794459E38)
            int r40 = r10.getDimensionPixelSize(r9)     // Catch:{ all -> 0x3ccc }
            r9 = 2131240008(0x7f082448, float:1.809634E38)
            android.graphics.drawable.Drawable r10 = r7.getDrawable(r9)     // Catch:{ all -> 0x3ccc }
            r9 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r41 = r7.getColor(r9)     // Catch:{ all -> 0x3ccc }
            int r42 = r7.getColor(r9)     // Catch:{ all -> 0x3ccc }
            com.instagram.common.typedurl.ImageUrl r37 = r8.Bh3()     // Catch:{ all -> 0x3ccc }
            X.3ay r8 = new X.3ay     // Catch:{ all -> 0x3ccc }
            r36 = r8
            r38 = r11
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3ccc }
            android.graphics.drawable.Drawable[] r8 = new android.graphics.drawable.Drawable[]{r10, r8}     // Catch:{ all -> 0x3ccc }
            java.util.ArrayList r43 = X.0sr.A1L(r8)     // Catch:{ all -> 0x3ccc }
            java.lang.Integer r42 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x3ccc }
            r44 = 1045220557(0x3e4ccccd, float:0.2)
            X.3b0 r8 = new X.3b0     // Catch:{ all -> 0x3ccc }
            r40 = r8
            r41 = r7
            r45 = r39
            r46 = r28
            r40.<init>(r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x3ccc }
        L_0x1eb9:
            r5.setImageDrawable(r8)     // Catch:{ all -> 0x3ccc }
        L_0x1ebc:
            com.instagram.common.ui.base.IgTextView r8 = r6.A04     // Catch:{ all -> 0x3ccc }
            if (r8 == 0) goto L_0x1ec6
            r5 = 2131962040(0x7f1328b8, float:1.9560794E38)
            r8.setText(r5)     // Catch:{ all -> 0x3ccc }
        L_0x1ec6:
            com.instagram.common.ui.base.IgTextView r9 = r6.A03     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1ee0
            r8 = 2131962039(0x7f1328b7, float:1.9560792E38)
            com.instagram.user.model.User r5 = r3.A0i     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1ed5
            java.lang.String r11 = r5.getUsername()     // Catch:{ all -> 0x3ccc }
        L_0x1ed5:
            java.lang.Object[] r5 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x3ccc }
            java.lang.String r5 = r7.getString(r8, r5)     // Catch:{ all -> 0x3ccc }
            r9.setText(r5)     // Catch:{ all -> 0x3ccc }
        L_0x1ee0:
            com.instagram.common.ui.base.IgLinearLayout r5 = r6.A00     // Catch:{ all -> 0x3ccc }
            if (r5 == 0) goto L_0x1ee7
            r5.setVisibility(r2)     // Catch:{ all -> 0x3ccc }
        L_0x1ee7:
            com.instagram.feed.widget.IgProgressImageView r5 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            r5.setEnableProgressBar(r2)     // Catch:{ all -> 0x3ccc }
            com.instagram.feed.widget.IgProgressImageView r6 = r0.BGP()     // Catch:{ all -> 0x3ccc }
            r5 = 2131240010(0x7f08244a, float:1.8096343E38)
            android.graphics.drawable.Drawable r5 = r7.getDrawable(r5)     // Catch:{ all -> 0x3ccc }
            r6.setImageDrawable(r5)     // Catch:{ all -> 0x3ccc }
            goto L_0x1f1e
        L_0x1efd:
            r8 = r11
            goto L_0x1eb9
        L_0x1eff:
            com.instagram.common.ui.base.IgSimpleImageView r10 = r6.A02     // Catch:{ all -> 0x3ccc }
            if (r10 == 0) goto L_0x1f0f
            com.instagram.user.model.User r9 = r3.A0i     // Catch:{ all -> 0x3ccc }
            com.instagram.api.schemas.FanClubStoriesTeaserType r8 = r3.A02     // Catch:{ all -> 0x3ccc }
            X.UjN r5 = new X.UjN     // Catch:{ all -> 0x3ccc }
            r5.<init>(r7, r8, r4, r9)     // Catch:{ all -> 0x3ccc }
            r10.setImageDrawable(r5)     // Catch:{ all -> 0x3ccc }
        L_0x1f0f:
            com.instagram.common.ui.base.IgSimpleImageView r9 = r6.A02     // Catch:{ all -> 0x3ccc }
            if (r9 == 0) goto L_0x1ee0
            X.LXD r8 = new X.LXD     // Catch:{ all -> 0x3ccc }
            r5 = r158
            r8.<init>(r3, r5)     // Catch:{ all -> 0x3ccc }
            X.AnonymousClass0fU.A00(r8, r9)     // Catch:{ all -> 0x3ccc }
            goto L_0x1ee0
        L_0x1f1e:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x1f34
            r5 = -2027169605(0xffffffff872bd8bb, float:-1.2928302E-34)
            goto L_0x1f31
        L_0x1f28:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x1f34
            r5 = -1878971982(0xffffffff900129b2, float:-2.5472885E-29)
        L_0x1f31:
            X.0fS.A00(r5)
        L_0x1f34:
            r21 = 0
            r5 = 5
            r6 = r19
            X.0qQ.A0B(r6, r5)
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x1f4a
            r6 = 1660743758(0x62fcf04e, float:2.3329476E21)
            java.lang.String r5 = "ReelViewerItemBinder.bindMediaOverlayCTAView"
            X.0fS.A01(r5, r6)
        L_0x1f4a:
            r8 = 0
            if (r16 == 0) goto L_0x1f58
            X.4w4 r5 = r16.BQf()     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x1f58
            X.3xe r10 = r5.Af9()     // Catch:{ all -> 0x3cc1 }
            goto L_0x1f59
        L_0x1f58:
            r10 = r8
        L_0x1f59:
            r17 = 1
            if (r10 == 0) goto L_0x1f93
            r5 = r27
            boolean r5 = r5 instanceof X.C229382nI     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x1f93
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x3cc1 }
            r5 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r5 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x1f93
            r5 = r148
            android.view.ViewGroup r9 = r5.A12     // Catch:{ all -> 0x3cc1 }
            android.widget.FrameLayout r8 = X.C56311HwO.A00(r9)     // Catch:{ all -> 0x3cc1 }
            java.lang.Object r7 = r8.getTag()     // Catch:{ all -> 0x3cc1 }
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.feed.ui.shared.BloksComponentViewBinder.Holder"
            X.0qQ.A0C(r7, r5)     // Catch:{ all -> 0x3cc1 }
            X.Gj0 r7 = (X.C53128Gj0) r7     // Catch:{ all -> 0x3cc1 }
            X.4g6 r6 = X.Ci1.A00(r10)     // Catch:{ all -> 0x3cc1 }
            r5 = r27
            X.2nI r5 = (X.C229382nI) r5     // Catch:{ all -> 0x3cc1 }
            X.C56311HwO.A01(r5, r6, r7, r2, r2)     // Catch:{ all -> 0x3cc1 }
            r9.addView(r8)     // Catch:{ all -> 0x3cc1 }
            goto L_0x227f
        L_0x1f93:
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x3cc1 }
            r5 = 36311216888480215(0x8100dc000001d7, double:3.0266980015848276E-306)
            boolean r5 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x3cc1 }
            java.lang.String r12 = "Required value was null."
            if (r5 == 0) goto L_0x20df
            if (r16 == 0) goto L_0x211f
            X.4w4 r5 = r16.BQf()     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x20e1
            X.4w6 r5 = X.C52501GVd.A02(r5)     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x20e1
            X.4w4 r5 = r16.BQf()     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x20d3
            X.4w6 r11 = X.C52501GVd.A02(r5)     // Catch:{ all -> 0x3cc1 }
            if (r11 == 0) goto L_0x20d3
            X.GjL r5 = r0.A07     // Catch:{ all -> 0x3cc1 }
            if (r5 != 0) goto L_0x2070
            r5 = r148
            android.view.ViewGroup r15 = r5.A12     // Catch:{ all -> 0x3cc1 }
            r5 = r19
            android.view.View r19 = X.C56655I6k.A01(r5, r15, r4)     // Catch:{ all -> 0x3cc1 }
            java.lang.Object r10 = r19.getTag()     // Catch:{ all -> 0x3cc1 }
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.feed.adapter.overlaycta.MediaOverlayCTAViewBinder.Holder"
            X.0qQ.A0C(r10, r5)     // Catch:{ all -> 0x3cc1 }
            X.GjL r10 = (X.C53149GjL) r10     // Catch:{ all -> 0x3cc1 }
            r0.A07 = r10     // Catch:{ all -> 0x3cc1 }
            if (r10 == 0) goto L_0x1fda
            goto L_0x1fe1
        L_0x1fda:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3cc1 }
            r0.<init>(r12)     // Catch:{ all -> 0x3cc1 }
            goto L_0x20de
        L_0x1fe1:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r5 = r10.A08     // Catch:{ all -> 0x3cc1 }
            android.content.Context r9 = r5.getContext()     // Catch:{ all -> 0x3cc1 }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x3cc1 }
            android.view.View r6 = r10.A02     // Catch:{ all -> 0x3cc1 }
            r6.setVisibility(r1)     // Catch:{ all -> 0x3cc1 }
            android.view.View r6 = r10.A01     // Catch:{ all -> 0x3cc1 }
            r6.setVisibility(r1)     // Catch:{ all -> 0x3cc1 }
            android.widget.TextView r13 = r10.A03     // Catch:{ all -> 0x3cc1 }
            r7 = 2
            r6 = 1094713344(0x41400000, float:12.0)
            r13.setTextSize(r7, r6)     // Catch:{ all -> 0x3cc1 }
            android.widget.TextView r14 = r10.A04     // Catch:{ all -> 0x3cc1 }
            r14.setTextSize(r7, r6)     // Catch:{ all -> 0x3cc1 }
            r6 = 14
            float r6 = X.0nA.A04(r9, r6)     // Catch:{ all -> 0x3cc1 }
            int r7 = (int) r6     // Catch:{ all -> 0x3cc1 }
            r6 = 2131099791(0x7f06008f, float:1.7811945E38)
            int r6 = r9.getColor(r6)     // Catch:{ all -> 0x3cc1 }
            r5.setBackgroundColor(r6)     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0d(r5, r7)     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0U(r5, r7)     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0e(r5, r2)     // Catch:{ all -> 0x3cc1 }
            android.view.View r6 = r10.A00     // Catch:{ all -> 0x3cc1 }
            if (r6 != 0) goto L_0x203d
            android.view.View r6 = new android.view.View     // Catch:{ all -> 0x3cc1 }
            r6.<init>(r9)     // Catch:{ all -> 0x3cc1 }
            r10.A00 = r6     // Catch:{ all -> 0x3cc1 }
            android.view.ViewParent r5 = r5.getParent()     // Catch:{ all -> 0x3cc1 }
            boolean r14 = r5 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x3cc1 }
            if (r14 == 0) goto L_0x2035
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x2035
            r5.addView(r6, r2)     // Catch:{ all -> 0x3cc1 }
        L_0x2035:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x3cc1 }
            r5.<init>(r2, r2)     // Catch:{ all -> 0x3cc1 }
            r6.setLayoutParams(r5)     // Catch:{ all -> 0x3cc1 }
        L_0x203d:
            X.0nA.A0d(r6, r7)     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0U(r6, r7)     // Catch:{ all -> 0x3cc1 }
            com.instagram.common.ui.base.IgSimpleImageView r6 = r10.A06     // Catch:{ all -> 0x3cc1 }
            r5 = 12
            float r5 = X.0nA.A04(r9, r5)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0b(r6, r5)     // Catch:{ all -> 0x3cc1 }
            com.instagram.common.ui.base.IgLinearLayout r6 = r10.A05     // Catch:{ all -> 0x3cc1 }
            r5 = 11
            float r5 = X.0nA.A04(r9, r5)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0c(r6, r5)     // Catch:{ all -> 0x3cc1 }
            r5 = 13
            float r5 = X.0nA.A04(r9, r5)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0X(r6, r5)     // Catch:{ all -> 0x3cc1 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            r13.setMaxLines(r5)     // Catch:{ all -> 0x3cc1 }
            r5 = r19
            r15.addView(r5)     // Catch:{ all -> 0x3cc1 }
        L_0x2070:
            X.GjL r5 = r0.A07     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x20d9
            X.4w4 r6 = r16.BQf()     // Catch:{ all -> 0x3cc1 }
            if (r6 == 0) goto L_0x207d
            r6.getOverlayType()     // Catch:{ all -> 0x3cc1 }
        L_0x207d:
            r7 = r28
            X.C56655I6k.A04(r11, r5, r7, r7)     // Catch:{ all -> 0x3cc1 }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r9 = r5.A08     // Catch:{ all -> 0x3cc1 }
            android.content.Context r7 = r9.getContext()     // Catch:{ all -> 0x3cc1 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3cc1 }
            float r6 = X.0nA.A04(r7, r1)     // Catch:{ all -> 0x3cc1 }
            int r6 = (int) r6     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0T(r9, r6)     // Catch:{ all -> 0x3cc1 }
            android.view.View r5 = r5.A00     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x209a
            X.0nA.A0T(r5, r6)     // Catch:{ all -> 0x3cc1 }
        L_0x209a:
            java.lang.Integer r6 = X.I2I.A01(r11)     // Catch:{ all -> 0x3cc1 }
            java.lang.Integer r5 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x3cc1 }
            if (r6 == r5) goto L_0x20ab
            X.IB3 r8 = new X.IB3     // Catch:{ all -> 0x3cc1 }
            r5 = r158
            r6 = r16
            r8.<init>(r11, r5, r6)     // Catch:{ all -> 0x3cc1 }
        L_0x20ab:
            X.AnonymousClass0fU.A00(r8, r9)     // Catch:{ all -> 0x3cc1 }
            float r5 = X.0nA.A04(r7, r1)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            r9.setCornerRadius(r5)     // Catch:{ all -> 0x3cc1 }
            if (r188 != 0) goto L_0x20c1
            java.lang.Integer r6 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x3cc1 }
            r7 = r16
            r5 = r121
            X.I2F.A02(r7, r5, r4, r6)     // Catch:{ all -> 0x3cc1 }
        L_0x20c1:
            X.GjL r6 = r0.A07     // Catch:{ all -> 0x3cc1 }
            if (r6 == 0) goto L_0x227f
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r5 = r6.A08     // Catch:{ all -> 0x3cc1 }
            r5.setVisibility(r2)     // Catch:{ all -> 0x3cc1 }
            android.view.View r5 = r6.A00     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x227f
            r5.setVisibility(r2)     // Catch:{ all -> 0x3cc1 }
            goto L_0x227f
        L_0x20d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3cc1 }
            r0.<init>(r12)     // Catch:{ all -> 0x3cc1 }
            goto L_0x20de
        L_0x20d9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3cc1 }
            r0.<init>(r12)     // Catch:{ all -> 0x3cc1 }
        L_0x20de:
            throw r0     // Catch:{ all -> 0x3cc1 }
        L_0x20df:
            if (r16 == 0) goto L_0x211f
        L_0x20e1:
            r5 = r16
            X.1i4 r5 = r5.A0c     // Catch:{ all -> 0x3cc1 }
            java.lang.String r6 = r5.A07     // Catch:{ all -> 0x3cc1 }
            if (r6 == 0) goto L_0x211f
            r6 = r148
            android.view.ViewGroup r7 = r6.A12     // Catch:{ all -> 0x3cc1 }
            r6 = 2131435959(0x7f0b21b7, float:1.8493775E38)
            android.view.View r6 = r7.findViewById(r6)     // Catch:{ all -> 0x3cc1 }
            if (r6 != 0) goto L_0x210f
            r6 = 2131624723(0x7f0e0313, float:1.8876634E38)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r19)     // Catch:{ all -> 0x3cc1 }
            android.view.View r6 = r8.inflate(r6, r7, r2)     // Catch:{ all -> 0x3cc1 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x3cc1 }
            X.UDi r8 = new X.UDi     // Catch:{ all -> 0x3cc1 }
            r8.<init>(r6)     // Catch:{ all -> 0x3cc1 }
            r6.setTag(r8)     // Catch:{ all -> 0x3cc1 }
            r7.addView(r6)     // Catch:{ all -> 0x3cc1 }
        L_0x210f:
            java.lang.Object r7 = r6.getTag()     // Catch:{ all -> 0x3cc1 }
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.feed.adapter.overlaycta.CreatorStoryInsightTipViewBinder.Holder"
            X.0qQ.A0C(r7, r6)     // Catch:{ all -> 0x3cc1 }
            X.UDi r7 = (X.C14880UDi) r7     // Catch:{ all -> 0x3cc1 }
            r0.A06 = r7     // Catch:{ all -> 0x3cc1 }
            if (r7 == 0) goto L_0x227d
            goto L_0x212f
        L_0x211f:
            X.GjL r6 = r0.A07     // Catch:{ all -> 0x3cc1 }
            if (r6 == 0) goto L_0x227d
            r21 = 8
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r5 = r6.A08     // Catch:{ all -> 0x3cc1 }
            r5.setVisibility(r1)     // Catch:{ all -> 0x3cc1 }
            android.view.View r6 = r6.A00     // Catch:{ all -> 0x3cc1 }
            if (r6 == 0) goto L_0x227d
            goto L_0x2152
        L_0x212f:
            r12 = 2
            java.lang.String r14 = r5.A07     // Catch:{ all -> 0x3cc1 }
            java.lang.String r11 = r5.A04     // Catch:{ all -> 0x3cc1 }
            java.lang.String r10 = r5.A03     // Catch:{ all -> 0x3cc1 }
            java.lang.String r15 = r5.A06     // Catch:{ all -> 0x3cc1 }
            android.widget.TextView r9 = r7.A00     // Catch:{ all -> 0x3cc1 }
            java.lang.CharSequence r5 = r9.getText()     // Catch:{ all -> 0x3cc1 }
            boolean r5 = X.0qQ.A0K(r14, r5)     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x2159
            android.widget.TextView r5 = r7.A01     // Catch:{ all -> 0x3cc1 }
            java.lang.CharSequence r5 = r5.getText()     // Catch:{ all -> 0x3cc1 }
            boolean r5 = X.0qQ.A0K(r11, r5)     // Catch:{ all -> 0x3cc1 }
            if (r5 == 0) goto L_0x2159
        L_0x2150:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r6 = r7.A04     // Catch:{ all -> 0x3cc1 }
        L_0x2152:
            r5 = r21
            r6.setVisibility(r5)     // Catch:{ all -> 0x3cc1 }
            goto L_0x227d
        L_0x2159:
            r5 = r158
            r5.E3f(r3)     // Catch:{ all -> 0x3cc1 }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r8 = r7.A04     // Catch:{ all -> 0x3cc1 }
            android.content.Context r6 = r8.getContext()     // Catch:{ all -> 0x3cc1 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3cc1 }
            float r5 = X.0nA.A04(r6, r1)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            r8.setCornerRadius(r5)     // Catch:{ all -> 0x3cc1 }
            r5 = 20
            float r5 = X.0nA.A04(r6, r5)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0T(r8, r5)     // Catch:{ all -> 0x3cc1 }
            r5 = 16
            float r13 = X.0nA.A04(r6, r5)     // Catch:{ all -> 0x3cc1 }
            int r13 = (int) r13     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0d(r8, r13)     // Catch:{ all -> 0x3cc1 }
            float r5 = X.0nA.A04(r6, r5)     // Catch:{ all -> 0x3cc1 }
            int r5 = (int) r5     // Catch:{ all -> 0x3cc1 }
            X.0nA.A0U(r8, r5)     // Catch:{ all -> 0x3cc1 }
            com.instagram.common.ui.base.IgSimpleImageView r5 = r7.A02     // Catch:{ all -> 0x3cc1 }
            int r13 = X.2Yu.A05(r6)     // Catch:{ all -> 0x3cc1 }
            int r13 = r6.getColor(r13)     // Catch:{ all -> 0x3cc1 }
            android.graphics.ColorFilter r13 = X.AnonymousClass37O.A00(r13)     // Catch:{ all -> 0x3cc1 }
            r5.setColorFilter(r13)     // Catch:{ all -> 0x3cc1 }
            java.lang.String r13 = "story_replies_count_total"
            boolean r13 = X.0qQ.A0K(r10, r13)     // Catch:{ all -> 0x3cc1 }
            if (r13 != 0) goto L_0x21ae
            r13 = 1119092736(0x42b40000, float:90.0)
            r5.setRotation(r13)     // Catch:{ all -> 0x3cc1 }
            r13 = 80
            r5.setPadding(r2, r13, r2, r2)     // Catch:{ all -> 0x3cc1 }
        L_0x21ae:
            com.instagram.common.ui.base.IgSimpleImageView r5 = r7.A03     // Catch:{ all -> 0x3cc1 }
            r5.setVisibility(r2)     // Catch:{ all -> 0x3cc1 }
            r13 = 2131238468(0x7f081e44, float:1.8093216E38)
            r5.setImageResource(r13)     // Catch:{ all -> 0x3cc1 }
            int r13 = X.2Yu.A05(r6)     // Catch:{ all -> 0x3cc1 }
            int r6 = r6.getColor(r13)     // Catch:{ all -> 0x3cc1 }
            android.graphics.ColorFilter r6 = X.AnonymousClass37O.A00(r6)     // Catch:{ all -> 0x3cc1 }
            r5.setColorFilter(r6)     // Catch:{ all -> 0x3cc1 }
            r9.setText(r14)     // Catch:{ all -> 0x3cc1 }
            r6 = 1096810496(0x41600000, float:14.0)
            r9.setTextSize(r12, r6)     // Catch:{ all -> 0x3cc1 }
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT_BOLD     // Catch:{ all -> 0x3cc1 }
            r9.setTypeface(r5)     // Catch:{ all -> 0x3cc1 }
            r9.setMaxLines(r12)     // Catch:{ all -> 0x3cc1 }
            if (r11 == 0) goto L_0x21e5
            android.widget.TextView r5 = r7.A01     // Catch:{ all -> 0x3cc1 }
            r5.setText(r11)     // Catch:{ all -> 0x3cc1 }
            r5.setTextSize(r12, r6)     // Catch:{ all -> 0x3cc1 }
            r5.setMaxLines(r12)     // Catch:{ all -> 0x3cc1 }
        L_0x21e5:
            r5 = r158
            r5.Cj3(r3, r15, r10)     // Catch:{ all -> 0x3cc1 }
            X.IBm r6 = new X.IBm     // Catch:{ all -> 0x3cc1 }
            r6.<init>(r5, r3, r15, r10)     // Catch:{ all -> 0x3cc1 }
            X.AnonymousClass0fU.A00(r6, r8)     // Catch:{ all -> 0x3cc1 }
            r9 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r8 = new android.view.animation.AlphaAnimation     // Catch:{ all -> 0x3cc1 }
            r5 = r29
            r8.<init>(r5, r9)     // Catch:{ all -> 0x3cc1 }
            r5 = 500(0x1f4, double:2.47E-321)
            r8.setDuration(r5)     // Catch:{ all -> 0x3cc1 }
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator     // Catch:{ all -> 0x3cc1 }
            r5.<init>()     // Catch:{ all -> 0x3cc1 }
            r8.setInterpolator(r5)     // Catch:{ all -> 0x3cc1 }
            android.view.animation.AlphaAnimation r10 = new android.view.animation.AlphaAnimation     // Catch:{ all -> 0x3cc1 }
            r5 = r29
            r10.<init>(r5, r9)     // Catch:{ all -> 0x3cc1 }
            r5 = 200(0xc8, double:9.9E-322)
            r10.setDuration(r5)     // Catch:{ all -> 0x3cc1 }
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator     // Catch:{ all -> 0x3cc1 }
            r5.<init>()     // Catch:{ all -> 0x3cc1 }
            r10.setInterpolator(r5)     // Catch:{ all -> 0x3cc1 }
            android.widget.TextView r13 = r7.A01     // Catch:{ all -> 0x3cc1 }
            r13.measure(r2, r2)     // Catch:{ all -> 0x3cc1 }
            int r5 = r13.getMeasuredHeight()     // Catch:{ all -> 0x3cc1 }
            int[] r5 = new int[]{r5, r2}     // Catch:{ all -> 0x3cc1 }
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofInt(r5)     // Catch:{ all -> 0x3cc1 }
            r5 = 1000(0x3e8, double:4.94E-321)
            android.animation.ValueAnimator r12 = r9.setDuration(r5)     // Catch:{ all -> 0x3cc1 }
            X.W45 r9 = new X.W45     // Catch:{ all -> 0x3cc1 }
            r9.<init>(r7)     // Catch:{ all -> 0x3cc1 }
            r12.addUpdateListener(r9)     // Catch:{ all -> 0x3cc1 }
            X.U0G r11 = new X.U0G     // Catch:{ all -> 0x3cc1 }
            r9 = r160
            r11.<init>(r10, r7, r9)     // Catch:{ all -> 0x3cc1 }
            r12.addListener(r11)     // Catch:{ all -> 0x3cc1 }
            boolean r9 = r12.isRunning()     // Catch:{ all -> 0x3cc1 }
            if (r9 != 0) goto L_0x2268
            int r9 = r13.getVisibility()     // Catch:{ all -> 0x3cc1 }
            if (r9 != r1) goto L_0x2268
            r9 = r160
            boolean r9 = r9.A0e     // Catch:{ all -> 0x3cc1 }
            if (r9 != 0) goto L_0x2268
            android.os.Looper r9 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x3cc1 }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ all -> 0x3cc1 }
            r10.<init>(r9)     // Catch:{ all -> 0x3cc1 }
            X.TDn r9 = new X.TDn     // Catch:{ all -> 0x3cc1 }
            r9.<init>(r12)     // Catch:{ all -> 0x3cc1 }
            r10.postDelayed(r9, r5)     // Catch:{ all -> 0x3cc1 }
        L_0x2268:
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x3cc1 }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ all -> 0x3cc1 }
            r10.<init>(r5)     // Catch:{ all -> 0x3cc1 }
            X.WnF r9 = new X.WnF     // Catch:{ all -> 0x3cc1 }
            r9.<init>(r8, r7)     // Catch:{ all -> 0x3cc1 }
            r5 = 250(0xfa, double:1.235E-321)
            r10.postDelayed(r9, r5)     // Catch:{ all -> 0x3cc1 }
            goto L_0x2150
        L_0x227d:
            r17 = 0
        L_0x227f:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x228b
            r5 = 128987306(0x7b030aa, float:2.651014E-34)
            X.0fS.A00(r5)
        L_0x228b:
            r7 = r183
            r6 = r157
            r5 = r156
            A08(r0, r7, r6, r5)
            goto L_0x22aa
        L_0x2295:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x22a1
            r5 = 747936648(0x2c949b88, float:4.2236804E-12)
            X.0fS.A00(r5)
        L_0x22a1:
            r7 = r29
            r6 = r157
            r5 = r156
            A08(r0, r7, r6, r5)
        L_0x22aa:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)
            if (r5 == 0) goto L_0x22b8
            r6 = -937332800(0xffffffffc8216fc0, float:-165311.0)
            java.lang.String r5 = "ReelViewerItemBinder.bindHeaderViews"
            X.0fS.A01(r5, r6)
        L_0x22b8:
            com.instagram.user.model.User r14 = r3.A0i     // Catch:{ all -> 0x3cb6 }
            if (r14 != 0) goto L_0x22cf
            r5 = r163
            com.instagram.model.reels.Reel r5 = r5.A0H     // Catch:{ all -> 0x3cb6 }
            boolean r6 = r5.A18(r4)     // Catch:{ all -> 0x3cb6 }
            if (r6 != 0) goto L_0x22cf
            android.view.View r6 = r0.A0P     // Catch:{ all -> 0x3cb6 }
            r24 = r6
            r6.setVisibility(r1)     // Catch:{ all -> 0x3cb6 }
            goto L_0x30f9
        L_0x22cf:
            android.view.View r5 = r0.A0P     // Catch:{ all -> 0x3cb6 }
            r24 = r5
            r5.setVisibility(r2)     // Catch:{ all -> 0x3cb6 }
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x22e4
            r6 = 2102128686(0x7d4bf02e, float:1.6942523E37)
            java.lang.String r5 = "ReelViewerTitleBinder.bindView"
            X.0fS.A01(r5, r6)     // Catch:{ all -> 0x3cb6 }
        L_0x22e4:
            X.0Tu r19 = X.0Tu.A05     // Catch:{ all -> 0x3ca1 }
            r5 = 36324166214889307(0x810ca300002f5b, double:3.0348872077486895E-306)
            r7 = r19
            boolean r5 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x22fe
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x25a5
            r5 = -1744636483(0xffffffff9802f5bd, float:-1.6926172E-24)
            goto L_0x25a2
        L_0x22fe:
            android.widget.TextView r9 = r0.A0d     // Catch:{ all -> 0x3ca1 }
            android.content.res.Resources r23 = r9.getResources()     // Catch:{ all -> 0x3ca1 }
            r5 = r163
            com.instagram.model.reels.Reel r7 = r5.A0H     // Catch:{ all -> 0x3ca1 }
            X.1Ns r5 = r7.A0W     // Catch:{ all -> 0x3ca1 }
            r22 = r5
            java.lang.String r8 = "Required value was null."
            if (r5 == 0) goto L_0x3c95
            java.lang.Integer r6 = r22.CAm()     // Catch:{ all -> 0x3ca1 }
            java.lang.Integer r21 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x3ca1 }
            r5 = r21
            if (r6 != r5) goto L_0x2346
            if (r14 == 0) goto L_0x3c9b
            com.instagram.user.model.User r5 = r22.CCd()     // Catch:{ all -> 0x3ca1 }
            boolean r5 = r14.equals(r5)     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2346
            boolean r5 = r3.CWu()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2346
            r16.getClass()     // Catch:{ all -> 0x3ca1 }
            r5 = r16
            com.instagram.user.model.User r5 = r5.A2A(r4)     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x233f
            boolean r5 = r5.A2Q()     // Catch:{ all -> 0x3ca1 }
            r10 = 1
            if (r5 != 0) goto L_0x2347
            goto L_0x2346
        L_0x233f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x3ca0
        L_0x2346:
            r10 = 0
        L_0x2347:
            boolean r5 = r7.A18(r4)     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x235e
            r5 = 2131974756(0x7f135a64, float:1.9586585E38)
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x25a5
            r5 = -1207200873(0xffffffffb80b9397, float:-3.3277636E-5)
            goto L_0x25a2
        L_0x235e:
            boolean r5 = r3.A1i()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2387
            r5 = 2131974521(0x7f135979, float:1.9586108E38)
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
        L_0x236a:
            java.lang.Integer r6 = r22.CAm()     // Catch:{ all -> 0x3ca1 }
            r5 = r21
            if (r6 != r5) goto L_0x2522
            com.instagram.user.model.User r5 = r22.CCd()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x251b
            boolean r5 = r5.isVerified()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2522
            boolean r5 = r161.A00()     // Catch:{ all -> 0x3ca1 }
            r6 = 1
            if (r5 != 0) goto L_0x2523
            goto L_0x2522
        L_0x2387:
            boolean r5 = r7.A0u()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2397
            if (r14 == 0) goto L_0x2391
            goto L_0x2439
        L_0x2391:
            java.lang.String r5 = r22.getName()     // Catch:{ all -> 0x3ca1 }
            goto L_0x243d
        L_0x2397:
            boolean r5 = r7.A0l()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x23ba
            java.lang.String r6 = r4.A06     // Catch:{ all -> 0x3ca1 }
            java.lang.String r5 = r22.getId()     // Catch:{ all -> 0x3ca1 }
            boolean r5 = X.0qQ.A0K(r6, r5)     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x23ba
            android.view.View r5 = r0.itemView     // Catch:{ all -> 0x3ca1 }
            android.content.Context r6 = r5.getContext()     // Catch:{ all -> 0x3ca1 }
            r5 = 2131967975(0x7f133fe7, float:1.9572832E38)
            java.lang.String r5 = r6.getString(r5)     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x23ba:
            boolean r5 = r7.A0i()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x23dc
            java.lang.String r5 = r7.A0r     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x23dc
            X.3BQ r6 = X.AnonymousClass3BQ.REEL_HIGHLIGHTS_UPDATES_HUB     // Catch:{ all -> 0x3ca1 }
            r5 = r161
            if (r5 != r6) goto L_0x23d0
            boolean r5 = r7.A0l()     // Catch:{ all -> 0x3ca1 }
            if (r5 != 0) goto L_0x23dc
        L_0x23d0:
            com.instagram.model.reels.ReelType r6 = r7.A0P     // Catch:{ all -> 0x3ca1 }
            com.instagram.model.reels.ReelType r5 = com.instagram.model.reels.ReelType.A0D     // Catch:{ all -> 0x3ca1 }
            if (r6 == r5) goto L_0x23dc
            java.lang.String r5 = r7.A0r     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x23dc:
            boolean r5 = r7.A0b()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x23fa
            long r5 = r3.A03()     // Catch:{ all -> 0x3ca1 }
            double r12 = (double) r5     // Catch:{ all -> 0x3ca1 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x3ca1 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r10
            double r10 = (double) r5     // Catch:{ all -> 0x3ca1 }
            java.lang.String r5 = "EEEE, MMMM d"
            java.lang.String r5 = X.1G0.A0F(r5, r12, r10)     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x23fa:
            com.instagram.model.reels.ReelType r6 = r7.A0P     // Catch:{ all -> 0x3ca1 }
            com.instagram.model.reels.ReelType r5 = com.instagram.model.reels.ReelType.A0D     // Catch:{ all -> 0x3ca1 }
            if (r6 != r5) goto L_0x2418
            long r5 = r3.A03()     // Catch:{ all -> 0x3ca1 }
            double r12 = (double) r5     // Catch:{ all -> 0x3ca1 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x3ca1 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r10
            double r10 = (double) r5     // Catch:{ all -> 0x3ca1 }
            java.lang.String r5 = "MMMM d"
            java.lang.String r5 = X.1G0.A0F(r5, r12, r10)     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x2418:
            if (r10 == 0) goto L_0x2428
            r16.getClass()     // Catch:{ all -> 0x3ca1 }
            r5 = r16
            java.lang.String r5 = X.C231122qu.A0G(r4, r5)     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x2428:
            boolean r5 = r3.A12()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2442
            com.instagram.model.effect.AttributedAREffect r5 = r3.A05     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x236a
            java.lang.String r5 = r5.A05()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x236a
            goto L_0x243d
        L_0x2439:
            java.lang.String r5 = r14.getUsername()     // Catch:{ all -> 0x3ca1 }
        L_0x243d:
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x2442:
            boolean r5 = r7.A0g()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x246e
            if (r16 == 0) goto L_0x2467
            r5 = r16
            X.1Xy r5 = r5.A0C     // Catch:{ all -> 0x3ca1 }
            X.82k r10 = r5.BAJ()     // Catch:{ all -> 0x3ca1 }
            if (r10 == 0) goto L_0x2467
            java.lang.String r5 = r10.getName()     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            X.LXF r6 = new X.LXF     // Catch:{ all -> 0x3ca1 }
            r5 = r158
            r6.<init>(r10, r5)     // Catch:{ all -> 0x3ca1 }
            X.AnonymousClass0fU.A00(r6, r9)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x2467:
            java.lang.String r5 = ""
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x246e:
            X.1Ns r5 = r7.A0W     // Catch:{ all -> 0x3ca1 }
            boolean r5 = r5 instanceof X.AnonymousClass6YJ     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2512
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x3ca1 }
            r12.<init>()     // Catch:{ all -> 0x3ca1 }
            X.3mM r11 = r0.A09     // Catch:{ all -> 0x3ca1 }
            if (r11 == 0) goto L_0x3c8f
            com.instagram.model.reels.Reel r6 = r11.A0H     // Catch:{ all -> 0x3ca1 }
            X.1Ns r15 = r6.A0W     // Catch:{ all -> 0x3ca1 }
            android.content.Context r10 = r9.getContext()     // Catch:{ all -> 0x3ca1 }
            if (r15 == 0) goto L_0x3c89
            java.lang.Integer r5 = r15.CAm()     // Catch:{ all -> 0x3ca1 }
            java.lang.Integer r13 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x3ca1 }
            if (r5 != r13) goto L_0x2497
            r5 = 2131974453(0x7f135935, float:1.958597E38)
            java.lang.String r6 = r10.getString(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x24c3
        L_0x2497:
            java.lang.Integer r13 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x3ca1 }
            if (r5 != r13) goto L_0x249e
            java.lang.String r6 = r6.A0r     // Catch:{ all -> 0x3ca1 }
            goto L_0x24c3
        L_0x249e:
            X.0qQ.A0A(r10)     // Catch:{ all -> 0x3ca1 }
            java.lang.String r6 = r15.getName()     // Catch:{ all -> 0x3ca1 }
            r5 = 25
            if (r6 == 0) goto L_0x24c3
            java.util.regex.Pattern r13 = X.0mp.A00     // Catch:{ all -> 0x3ca1 }
            int r13 = r6.length()     // Catch:{ all -> 0x3ca1 }
            if (r13 < r5) goto L_0x24c3
            java.lang.String r6 = r6.substring(r2, r5)     // Catch:{ all -> 0x3ca1 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3ca1 }
            r5 = 2131961564(0x7f1326dc, float:1.9559828E38)
            java.lang.String r5 = r10.getString(r5)     // Catch:{ all -> 0x3ca1 }
            java.lang.String r6 = X.002.A0R(r6, r5)     // Catch:{ all -> 0x3ca1 }
        L_0x24c3:
            if (r6 == 0) goto L_0x24c8
            r12.append(r6)     // Catch:{ all -> 0x3ca1 }
        L_0x24c8:
            int r13 = r12.length()     // Catch:{ all -> 0x3ca1 }
            java.lang.String r5 = " • "
            r12.append(r5)     // Catch:{ all -> 0x3ca1 }
            r5 = -1
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan     // Catch:{ all -> 0x3ca1 }
            r10.<init>(r5)     // Catch:{ all -> 0x3ca1 }
            int r5 = r12.length()     // Catch:{ all -> 0x3ca1 }
            r12.setSpan(r10, r13, r5, r2)     // Catch:{ all -> 0x3ca1 }
            if (r14 == 0) goto L_0x3c83
            java.lang.String r5 = r14.getUsername()     // Catch:{ all -> 0x3ca1 }
            r12.append(r5)     // Catch:{ all -> 0x3ca1 }
            X.DjP r10 = new X.DjP     // Catch:{ all -> 0x3ca1 }
            r10.<init>(r3, r11, r15, r0)     // Catch:{ all -> 0x3ca1 }
            X.DjH r5 = new X.DjH     // Catch:{ all -> 0x3ca1 }
            r5.<init>(r3, r11, r0)     // Catch:{ all -> 0x3ca1 }
            if (r6 == 0) goto L_0x2503
            int r11 = r6.length()     // Catch:{ all -> 0x3ca1 }
            r6 = 33
            r12.setSpan(r10, r2, r11, r6)     // Catch:{ all -> 0x3ca1 }
            int r10 = r12.length()     // Catch:{ all -> 0x3ca1 }
            r12.setSpan(r5, r11, r10, r6)     // Catch:{ all -> 0x3ca1 }
        L_0x2503:
            r9.setText(r12)     // Catch:{ all -> 0x3ca1 }
            r9.setHighlightColor(r2)     // Catch:{ all -> 0x3ca1 }
            android.text.method.MovementMethod r5 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x3ca1 }
            r9.setMovementMethod(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x2512:
            java.lang.String r5 = r22.getName()     // Catch:{ all -> 0x3ca1 }
            r9.setText(r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x236a
        L_0x251b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x3ca0
        L_0x2522:
            r6 = 0
        L_0x2523:
            r8 = 2131165190(0x7f070006, float:1.794459E38)
            r5 = r23
            int r8 = r5.getDimensionPixelSize(r8)     // Catch:{ all -> 0x3ca1 }
            r5 = -1
            X.C244273av.A09(r9, r2, r8, r5, r6)     // Catch:{ all -> 0x3ca1 }
            android.widget.TextView r8 = r0.A0c     // Catch:{ all -> 0x3ca1 }
            if (r6 == 0) goto L_0x254c
            r6 = 2131165255(0x7f070047, float:1.7944722E38)
            r5 = r23
            int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ all -> 0x3ca1 }
        L_0x253d:
            X.0nA.A0Y(r8, r5)     // Catch:{ all -> 0x3ca1 }
            r5 = 36320481132945902(0x810949000021ee, double:3.032556747089046E-306)
            r8 = r19
            boolean r5 = X.182.A06(r8, r4, r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x2556
        L_0x254c:
            r6 = 2131165217(0x7f070021, float:1.7944645E38)
            r5 = r23
            int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ all -> 0x3ca1 }
            goto L_0x253d
        L_0x2556:
            if (r5 == 0) goto L_0x2559
            goto L_0x255c
        L_0x2559:
            android.view.View r8 = r0.A0T     // Catch:{ all -> 0x3ca1 }
            goto L_0x2569
        L_0x255c:
            r5 = 36320481133076975(0x810949000221ef, double:3.0325567471719373E-306)
            boolean r5 = X.182.A06(r8, r4, r5)     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2559
            android.view.View r8 = r0.A0Q     // Catch:{ all -> 0x3ca1 }
        L_0x2569:
            boolean r5 = r3.A0R     // Catch:{ all -> 0x3ca1 }
            if (r5 != 0) goto L_0x2592
            X.3BQ r6 = X.AnonymousClass3BQ.MY_WEEK_NUX     // Catch:{ all -> 0x3ca1 }
            r5 = r161
            if (r5 == r6) goto L_0x2592
            boolean r5 = r7.A0u()     // Catch:{ all -> 0x3ca1 }
            if (r5 == 0) goto L_0x2585
            if (r14 == 0) goto L_0x2585
            X.FNe r7 = new X.FNe     // Catch:{ all -> 0x3ca1 }
            r6 = r163
            r5 = r158
            r7.<init>(r3, r6, r5)     // Catch:{ all -> 0x3ca1 }
            goto L_0x258e
        L_0x2585:
            X.6Wc r7 = new X.6Wc     // Catch:{ all -> 0x3ca1 }
            r6 = r163
            r5 = r158
            r7.<init>(r3, r6, r5)     // Catch:{ all -> 0x3ca1 }
        L_0x258e:
            X.AnonymousClass0fU.A00(r7, r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x2599
        L_0x2592:
            android.view.View r6 = r0.A0T     // Catch:{ all -> 0x3ca1 }
            r5 = r35
            r6.setOnClickListener(r5)     // Catch:{ all -> 0x3ca1 }
        L_0x2599:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x25a5
            r5 = 1996745161(0x7703e9c9, float:2.675518E33)
        L_0x25a2:
            X.0fS.A00(r5)     // Catch:{ all -> 0x3cb6 }
        L_0x25a5:
            android.content.Context r37 = r24.getContext()     // Catch:{ all -> 0x3cb6 }
            X.0qQ.A07(r37)     // Catch:{ all -> 0x3cb6 }
            X.6lO r10 = r0.A1j     // Catch:{ all -> 0x3cb6 }
            r9 = 1
            r13 = 2
            X.0qQ.A0B(r10, r13)     // Catch:{ all -> 0x3cb6 }
            java.lang.String r5 = "ReelViewerAttributionBinder.bindView"
            X.0lp r21 = X.0lq.A00(r5)     // Catch:{ all -> 0x3cb6 }
            X.6lP r5 = r10.A0Y     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25c2
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25c2:
            X.6lQ r5 = r10.A08     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25cb
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25cb:
            X.6lR r5 = r10.A0B     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25d4
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25d4:
            X.6lS r5 = r10.A0o     // Catch:{ all -> 0x3c81 }
            r22 = r5
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25df
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25df:
            X.6lS r5 = r10.A0p     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25e8
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25e8:
            X.6lT r12 = r10.A0n     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r12.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25f1
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25f1:
            X.52z r5 = r10.A07     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A01     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x25fa
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x25fa:
            android.widget.TextView r5 = r10.A02     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2601
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2601:
            android.widget.TextView r5 = r10.A03     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2608
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2608:
            android.widget.TextView r5 = r10.A04     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x260f
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x260f:
            android.widget.TextView r5 = r10.A05     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2616
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2616:
            android.widget.TextView r5 = r10.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x261d
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x261d:
            X.6lU r5 = r10.A0l     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2626
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2626:
            X.6lV r5 = r10.A0E     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x262f
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x262f:
            X.6lW r15 = r10.A0k     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r15.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2638
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2638:
            X.6lX r5 = r10.A0S     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2641
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2641:
            X.6lY r5 = r10.A0j     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x264a
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x264a:
            X.6la r5 = r10.A0m     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2653
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2653:
            X.6lb r5 = r10.A0L     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x265c
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x265c:
            X.6lc r5 = r10.A0O     // Catch:{ all -> 0x3c81 }
            X.3oV r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            boolean r6 = r5.CVM()     // Catch:{ all -> 0x3c81 }
            if (r6 == 0) goto L_0x2669
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2669:
            X.6ld r5 = r10.A0P     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A01     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2672
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2672:
            X.6lf r5 = r10.A09     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x267b
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x267b:
            X.6lg r5 = r10.A0M     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2684
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2684:
            X.6lh r5 = r10.A0N     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x268d
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x268d:
            X.6li r5 = r10.A0d     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2696
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2696:
            X.6lj r5 = r10.A0c     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x269f
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x269f:
            X.6lk r5 = r10.A0Z     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26a8
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26a8:
            X.6ll r5 = r10.A0U     // Catch:{ all -> 0x3c81 }
            X.2eb r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            r5.A03(r1)     // Catch:{ all -> 0x3c81 }
            X.6lm r5 = r10.A0I     // Catch:{ all -> 0x3c81 }
            X.2eb r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            r5.A03(r1)     // Catch:{ all -> 0x3c81 }
            X.6ln r5 = r10.A0b     // Catch:{ all -> 0x3c81 }
            X.2eb r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            r5.A03(r1)     // Catch:{ all -> 0x3c81 }
            X.6lo r5 = r10.A0V     // Catch:{ all -> 0x3c81 }
            android.view.View r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26c6
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26c6:
            android.widget.TextView r5 = r10.A01     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26cd
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26cd:
            X.6lp r5 = r10.A0W     // Catch:{ all -> 0x3c81 }
            android.view.View r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26d6
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26d6:
            X.6lr r5 = r10.A0i     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26df
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26df:
            X.6ls r5 = r10.A0J     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26e8
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26e8:
            X.6lu r5 = r10.A0T     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26f1
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26f1:
            X.6lZ r5 = r10.A0g     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x26fa
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x26fa:
            X.6lx r5 = r10.A0e     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2703
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2703:
            X.6lt r5 = r10.A0f     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x270c
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x270c:
            X.6ly r5 = r10.A0h     // Catch:{ all -> 0x3c81 }
            X.3oV r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            boolean r6 = r5.CVM()     // Catch:{ all -> 0x3c81 }
            if (r6 == 0) goto L_0x2719
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2719:
            X.6m0 r5 = r10.A0K     // Catch:{ all -> 0x3c81 }
            android.view.View r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2722
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2722:
            X.6lz r5 = r10.A0G     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x272b
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x272b:
            X.6m1 r5 = r10.A0A     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2734
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2734:
            X.6m2 r5 = r10.A0C     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x273d
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x273d:
            X.6m3 r5 = r10.A0D     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2746
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2746:
            X.6lw r5 = r10.A0X     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x274f
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x274f:
            X.6m4 r5 = r10.A0a     // Catch:{ all -> 0x3c81 }
            android.view.ViewGroup r5 = r5.A00     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2758
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c81 }
        L_0x2758:
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r6 = r10.A0H     // Catch:{ all -> 0x3c81 }
            r6.setClickable(r2)     // Catch:{ all -> 0x3c81 }
            r5 = r35
            r6.setOnClickListener(r5)     // Catch:{ all -> 0x3c81 }
            r6.A04()     // Catch:{ all -> 0x3c81 }
            if (r18 != 0) goto L_0x2bbc
            r5 = r162
            java.util.List r8 = r5.A02     // Catch:{ all -> 0x3c81 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3c81 }
            com.instagram.model.reels.ReelHeaderAttributionType r5 = com.instagram.model.reels.ReelHeaderAttributionType.INTERNAL_ATTRIBUTION     // Catch:{ all -> 0x3c81 }
            boolean r7 = r8.contains(r5)     // Catch:{ all -> 0x3c81 }
            if (r7 != 0) goto L_0x2779
            r8.add(r5)     // Catch:{ all -> 0x3c81 }
        L_0x2779:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x3c81 }
            r7.<init>()     // Catch:{ all -> 0x3c81 }
            X.6Wd r5 = new X.6Wd     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r38 = r121
            r39 = r4
            r40 = r3
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wf r5 = new X.6Wf     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wg r5 = new X.6Wg     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wh r5 = new X.6Wh     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wi r5 = new X.6Wi     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r163
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wj r5 = new X.6Wj     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r42 = r161
            r43 = r10
            r44 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x3c81 }
            boolean r11 = r5.A09()     // Catch:{ all -> 0x3c81 }
            if (r11 == 0) goto L_0x280a
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X6 r5 = new X.6X6     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
        L_0x27df:
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x3c81 }
            r12.<init>()     // Catch:{ all -> 0x3c81 }
            java.util.Iterator r15 = r7.iterator()     // Catch:{ all -> 0x3c81 }
            r11 = 0
        L_0x27ec:
            boolean r5 = r15.hasNext()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2a69
            java.lang.Object r7 = r15.next()     // Catch:{ all -> 0x3c81 }
            X.6We r7 = (X.C308916We) r7     // Catch:{ all -> 0x3c81 }
            boolean r5 = r7 instanceof X.AnonymousClass6X8     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2800
            r11 = r7
            X.6X8 r11 = (X.AnonymousClass6X8) r11     // Catch:{ all -> 0x3c81 }
            goto L_0x27ec
        L_0x2800:
            boolean r5 = r7.A09()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x27ec
            r12.add(r7)     // Catch:{ all -> 0x3c81 }
            goto L_0x27ec
        L_0x280a:
            X.6Ws r5 = new X.6Ws     // Catch:{ all -> 0x3c81 }
            r44 = r180
            r36 = r5
            r41 = r161
            r42 = r10
            r43 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wt r5 = new X.6Wt     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wv r5 = new X.6Wv     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Ww r5 = new X.6Ww     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r163
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wx r5 = new X.6Wx     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r161
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wy r5 = new X.6Wy     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            r5 = r163
            com.instagram.model.reels.Reel r11 = r5.A0H     // Catch:{ all -> 0x3c81 }
            X.6Wz r5 = new X.6Wz     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r40 = r11
            r41 = r3
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X0 r5 = new X.6X0     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X1 r11 = new X.6X1     // Catch:{ all -> 0x3c81 }
            r5 = r121
            r11.<init>(r5, r4, r3, r10)     // Catch:{ all -> 0x3c81 }
            r7.add(r11)     // Catch:{ all -> 0x3c81 }
            X.6X2 r5 = new X.6X2     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r40 = r3
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X4 r5 = new X.6X4     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X5 r5 = new X.6X5     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X6 r5 = new X.6X6     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X7 r5 = new X.6X7     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X8 r5 = new X.6X8     // Catch:{ all -> 0x3c81 }
            r38 = r5
            r39 = r121
            r40 = r4
            r41 = r3
            r42 = r10
            r38.<init>(r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6X9 r5 = new X.6X9     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r38 = r121
            r39 = r4
            r40 = r3
            r41 = r163
            r42 = r161
            r43 = r10
            r44 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XA r5 = new X.6XA     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XB r5 = new X.6XB     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r38 = r6
            r39 = r121
            r40 = r4
            r41 = r16
            r42 = r3
            r43 = r162
            r45 = r22
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XC r5 = new X.6XC     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r38 = r121
            r39 = r4
            r40 = r16
            r41 = r3
            r42 = r158
            r43 = r12
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XD r5 = new X.6XD     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r40 = r3
            r41 = r10
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wl r5 = new X.6Wl     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XE r5 = new X.6XE     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wm r5 = new X.6Wm     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r158
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wn r5 = new X.6Wn     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wk r5 = new X.6Wk     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XF r5 = new X.6XF     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XG r5 = new X.6XG     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XH r5 = new X.6XH     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XI r5 = new X.6XI     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XJ r5 = new X.6XJ     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XK r5 = new X.6XK     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XL r5 = new X.6XL     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r163
            r42 = r10
            r43 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XM r5 = new X.6XM     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XN r5 = new X.6XN     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XO r5 = new X.6XO     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XP r5 = new X.6XP     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wo r5 = new X.6Wo     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r163
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XQ r5 = new X.6XQ     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r10
            r42 = r158
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XR r5 = new X.6XR     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XT r5 = new X.6XT     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XU r5 = new X.6XU     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wp r5 = new X.6Wp     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wr r5 = new X.6Wr     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6Wq r5 = new X.6Wq     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XV r5 = new X.6XV     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XW r5 = new X.6XW     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XX r5 = new X.6XX     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XY r5 = new X.6XY     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r41 = r163
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            X.6XZ r5 = new X.6XZ     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x3c81 }
            goto L_0x27df
        L_0x2a69:
            if (r11 == 0) goto L_0x2a7a
            boolean r5 = r12.isEmpty()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2a7a
            boolean r5 = r11.A09()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2a7a
            r12.add(r11)     // Catch:{ all -> 0x3c81 }
        L_0x2a7a:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x3c81 }
            r7.<init>()     // Catch:{ all -> 0x3c81 }
            java.util.Iterator r15 = r12.iterator()     // Catch:{ all -> 0x3c81 }
        L_0x2a83:
            boolean r5 = r15.hasNext()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2a9d
            java.lang.Object r5 = r15.next()     // Catch:{ all -> 0x3c81 }
            X.6We r5 = (X.C308916We) r5     // Catch:{ all -> 0x3c81 }
            java.lang.String r11 = r5.A02()     // Catch:{ all -> 0x3c81 }
            if (r11 == 0) goto L_0x2a83
            java.lang.String r5 = r5.A02()     // Catch:{ all -> 0x3c81 }
            r7.add(r5)     // Catch:{ all -> 0x3c81 }
            goto L_0x2a83
        L_0x2a9d:
            r5 = r160
            java.util.List r5 = r5.A1D     // Catch:{ all -> 0x3c81 }
            r5.clear()     // Catch:{ all -> 0x3c81 }
            r5.addAll(r7)     // Catch:{ all -> 0x3c81 }
            java.util.Iterator r15 = r12.iterator()     // Catch:{ all -> 0x3c81 }
            r11 = 0
        L_0x2aac:
            boolean r5 = r15.hasNext()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2ad0
            java.lang.Object r7 = r15.next()     // Catch:{ all -> 0x3c81 }
            X.6We r7 = (X.C308916We) r7     // Catch:{ all -> 0x3c81 }
            boolean r5 = r7 instanceof X.AnonymousClass6X4     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2acd
            X.6X4 r7 = (X.AnonymousClass6X4) r7     // Catch:{ all -> 0x3c81 }
            X.3uh r5 = r7.A01     // Catch:{ all -> 0x3c81 }
            java.util.List r5 = r5.A0b()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2acd
            com.instagram.music.common.model.MusicOverlayStickerModel r7 = X.C271404in.A06(r5)     // Catch:{ all -> 0x3c81 }
            r5 = 2
            if (r7 != 0) goto L_0x2ace
        L_0x2acd:
            r5 = 1
        L_0x2ace:
            int r11 = r11 + r5
            goto L_0x2aac
        L_0x2ad0:
            if (r11 < r13) goto L_0x2b5c
            java.util.Iterator r7 = r12.iterator()     // Catch:{ all -> 0x3c81 }
        L_0x2ad6:
            boolean r5 = r7.hasNext()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2ae5
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x3c81 }
            X.6We r5 = (X.C308916We) r5     // Catch:{ all -> 0x3c81 }
            r5.A00 = r9     // Catch:{ all -> 0x3c81 }
            goto L_0x2ad6
        L_0x2ae5:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x3c81 }
            r11.<init>()     // Catch:{ all -> 0x3c81 }
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x3c81 }
        L_0x2aee:
            boolean r5 = r13.hasNext()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2b10
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x3c81 }
            X.6We r7 = (X.C308916We) r7     // Catch:{ all -> 0x3c81 }
            java.util.List r5 = r7.A04()     // Catch:{ NullPointerException -> 0x2b02 }
            r11.addAll(r5)     // Catch:{ NullPointerException -> 0x2b02 }
            goto L_0x2aee
        L_0x2b02:
            java.lang.Class r0 = r7.getClass()     // Catch:{ all -> 0x3c81 }
            java.lang.String r1 = r0.getSimpleName()     // Catch:{ all -> 0x3c81 }
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x3c81 }
            r0.<init>(r1)     // Catch:{ all -> 0x3c81 }
            throw r0     // Catch:{ all -> 0x3c81 }
        L_0x2b10:
            java.util.Iterator r7 = r12.iterator()     // Catch:{ all -> 0x3c81 }
        L_0x2b14:
            boolean r5 = r7.hasNext()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2b2e
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x3c81 }
            X.6We r5 = (X.C308916We) r5     // Catch:{ all -> 0x3c81 }
            com.instagram.model.reels.ReelHeaderAttributionType r5 = r5.A01()     // Catch:{ all -> 0x3c81 }
            boolean r5 = r8.contains(r5)     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2b14
            r7.remove()     // Catch:{ all -> 0x3c81 }
            goto L_0x2b14
        L_0x2b2e:
            int r5 = r12.size()     // Catch:{ all -> 0x3c81 }
            if (r5 <= r9) goto L_0x2b42
            X.6KB r7 = new X.6KB     // Catch:{ all -> 0x3c81 }
            r5 = r158
            r7.<init>(r3, r5, r12)     // Catch:{ all -> 0x3c81 }
        L_0x2b3b:
            X.AnonymousClass0fU.A00(r7, r6)     // Catch:{ all -> 0x3c81 }
        L_0x2b3e:
            r6.A05(r4, r11)     // Catch:{ all -> 0x3c81 }
            goto L_0x2b8b
        L_0x2b42:
            boolean r5 = r12.isEmpty()     // Catch:{ all -> 0x3c81 }
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x2b3e
            java.lang.Object r5 = r12.get(r2)     // Catch:{ all -> 0x3c81 }
            X.6We r5 = (X.C308916We) r5     // Catch:{ all -> 0x3c81 }
            boolean r7 = r5.A08()     // Catch:{ all -> 0x3c81 }
            if (r7 == 0) goto L_0x2b3e
            X.IAZ r7 = new X.IAZ     // Catch:{ all -> 0x3c81 }
            r7.<init>(r5)     // Catch:{ all -> 0x3c81 }
            goto L_0x2b3b
        L_0x2b5c:
            boolean r5 = r12.isEmpty()     // Catch:{ all -> 0x3c81 }
            if (r5 != 0) goto L_0x2b8b
            java.lang.Object r7 = r12.get(r2)     // Catch:{ all -> 0x3c81 }
            X.6We r7 = (X.C308916We) r7     // Catch:{ all -> 0x3c81 }
            r7.A04()     // Catch:{ all -> 0x3c81 }
            boolean r5 = r7.A08()     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2b79
            X.6Ju r5 = new X.6Ju     // Catch:{ all -> 0x3c81 }
            r5.<init>(r7)     // Catch:{ all -> 0x3c81 }
            X.AnonymousClass0fU.A00(r5, r6)     // Catch:{ all -> 0x3c81 }
        L_0x2b79:
            com.instagram.model.reels.ReelHeaderAttributionType r5 = r7.A01()     // Catch:{ all -> 0x3c81 }
            boolean r5 = r8.contains(r5)     // Catch:{ all -> 0x3c81 }
            if (r5 == 0) goto L_0x2b8b
            r6.setClickable(r2)     // Catch:{ all -> 0x3c81 }
            r5 = r35
            r6.setOnClickListener(r5)     // Catch:{ all -> 0x3c81 }
        L_0x2b8b:
            android.view.View r7 = r10.A06     // Catch:{ all -> 0x3c81 }
            android.graphics.Rect r37 = new android.graphics.Rect     // Catch:{ all -> 0x3c81 }
            r37.<init>()     // Catch:{ all -> 0x3c81 }
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x3c81 }
            android.content.res.Resources r8 = r6.getResources()     // Catch:{ all -> 0x3c81 }
            r5 = 2131165200(0x7f070010, float:1.794461E38)
            int r40 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c81 }
            r5 = 2131165290(0x7f07006a, float:1.7944793E38)
            int r41 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c81 }
            r5 = 2131165207(0x7f070017, float:1.7944625E38)
            int r42 = r8.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c81 }
            X.6Xd r5 = new X.6Xd     // Catch:{ all -> 0x3c81 }
            r36 = r5
            r38 = r6
            r39 = r7
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x3c81 }
            r7.post(r5)     // Catch:{ all -> 0x3c81 }
        L_0x2bbc:
            r21.close()     // Catch:{ all -> 0x3cb6 }
            r5 = r160
            java.util.List r5 = r5.A1D     // Catch:{ all -> 0x3cb6 }
            int r5 = r5.size()     // Catch:{ all -> 0x3cb6 }
            if (r5 <= 0) goto L_0x2bfa
            int r5 = r0.A0L     // Catch:{ all -> 0x3cb6 }
            X.0nA.A0X(r6, r5)     // Catch:{ all -> 0x3cb6 }
            android.view.View r6 = r0.A0T     // Catch:{ all -> 0x3cb6 }
            X.0nA.A0X(r6, r2)     // Catch:{ all -> 0x3cb6 }
        L_0x2bd3:
            android.view.View r12 = r0.A0R     // Catch:{ all -> 0x3cb6 }
            X.0nA.A0X(r12, r5)     // Catch:{ all -> 0x3cb6 }
            r5 = r162
            java.lang.Integer r5 = r5.A01     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2be5
            int r5 = r5.intValue()     // Catch:{ all -> 0x3cb6 }
            X.0nA.A0d(r12, r5)     // Catch:{ all -> 0x3cb6 }
        L_0x2be5:
            boolean r5 = r3.A12()     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2c4c
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2c05
            r6 = 1127600195(0x4335d043, float:181.81352)
            java.lang.String r5 = "ReelViewerItemBinder.bindAREffectPreviewThumbnailImage"
            X.0fS.A01(r5, r6)     // Catch:{ all -> 0x3cb6 }
            goto L_0x2c05
        L_0x2bfa:
            android.view.View r7 = r0.A0T     // Catch:{ all -> 0x3cb6 }
            int r5 = r0.A0L     // Catch:{ all -> 0x3cb6 }
            X.0nA.A0X(r7, r5)     // Catch:{ all -> 0x3cb6 }
            X.0nA.A0X(r6, r2)     // Catch:{ all -> 0x3cb6 }
            goto L_0x2bd3
        L_0x2c05:
            com.instagram.model.effect.AttributedAREffect r5 = r3.A05     // Catch:{ all -> 0x2c40 }
            if (r5 == 0) goto L_0x2c35
            com.instagram.common.typedurl.ImageUrl r8 = r5.A01()     // Catch:{ all -> 0x2c40 }
            if (r8 == 0) goto L_0x2c35
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r5 = r0.A1V     // Catch:{ all -> 0x2c40 }
            r5.setVisibility(r1)     // Catch:{ all -> 0x2c40 }
            X.3oV r7 = r0.A0r     // Catch:{ all -> 0x2c40 }
            android.view.View r6 = r7.getView()     // Catch:{ all -> 0x2c40 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r6     // Catch:{ all -> 0x2c40 }
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ all -> 0x2c40 }
            r6.setScaleType(r5)     // Catch:{ all -> 0x2c40 }
            android.view.View r5 = r7.getView()     // Catch:{ all -> 0x2c40 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r5     // Catch:{ all -> 0x2c40 }
            r5.setVisibility(r2)     // Catch:{ all -> 0x2c40 }
            android.view.View r6 = r7.getView()     // Catch:{ all -> 0x2c40 }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r6     // Catch:{ all -> 0x2c40 }
            r5 = r121
            r6.setUrl(r8, r5)     // Catch:{ all -> 0x2c40 }
        L_0x2c35:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2ece
            r5 = -637703307(0xffffffffd9fd6b75, float:-8.9164149E15)
            goto L_0x2ecb
        L_0x2c40:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r0 == 0) goto L_0x3cb5
            r0 = 19702308(0x12ca224, float:3.170774E-38)
            goto L_0x3cab
        L_0x2c4c:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2c5a
            r6 = 1584517171(0x5e71d033, float:4.35612076E18)
            java.lang.String r5 = "ReelViewerItemBinder.bindOwnerImage"
            X.0fS.A01(r5, r6)     // Catch:{ all -> 0x3cb6 }
        L_0x2c5a:
            X.3mM r5 = r0.A09     // Catch:{ all -> 0x3c76 }
            java.lang.String r11 = "Required value was null."
            if (r5 == 0) goto L_0x3c6a
            com.instagram.model.reels.Reel r5 = r5.A0H     // Catch:{ all -> 0x3c76 }
            X.1Ns r15 = r5.A0W     // Catch:{ all -> 0x3c76 }
            if (r16 == 0) goto L_0x2cb7
            boolean r5 = r16.A4j()     // Catch:{ all -> 0x3c76 }
            if (r5 != r9) goto L_0x2cb7
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r12 = r0.A1V     // Catch:{ all -> 0x3c76 }
            android.content.Context r5 = r12.getContext()     // Catch:{ all -> 0x3c76 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x3c76 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x3c76 }
            r6 = r16
            com.instagram.user.model.User r6 = r6.A2A(r4)     // Catch:{ all -> 0x3c76 }
            if (r6 == 0) goto L_0x2cb0
            com.instagram.common.typedurl.ImageUrl r11 = r6.Bh3()     // Catch:{ all -> 0x3c76 }
            r6 = r163
            com.instagram.common.typedurl.ImageUrl r10 = r6.A07(r4)     // Catch:{ all -> 0x3c76 }
            r6 = 2131165287(0x7f070067, float:1.7944787E38)
            int r8 = r5.getDimensionPixelSize(r6)     // Catch:{ all -> 0x3c76 }
            r6 = 2131165195(0x7f07000b, float:1.79446E38)
            int r7 = r5.getDimensionPixelSize(r6)     // Catch:{ all -> 0x3c76 }
            com.instagram.common.ui.widget.imageview.CornerPunchedImageView r6 = r12.A01     // Catch:{ all -> 0x3c76 }
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x3c76 }
            r5.<init>(r8, r8)     // Catch:{ all -> 0x3c76 }
            r6.setLayoutParams(r5)     // Catch:{ all -> 0x3c76 }
            X.0nA.A0d(r6, r7)     // Catch:{ all -> 0x3c76 }
            X.0nA.A0e(r6, r7)     // Catch:{ all -> 0x3c76 }
            r5 = r121
            r12.setDoubleAvatarUrlsAndVisibility(r11, r10, r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2ec2
        L_0x2cb0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2cb7:
            if (r15 == 0) goto L_0x3c64
            r5 = r163
            com.instagram.model.reels.Reel r13 = r5.A0H     // Catch:{ all -> 0x3c76 }
            java.lang.String r6 = r13.getId()     // Catch:{ all -> 0x3c76 }
            java.lang.String r5 = "election:rollcall_v2"
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x3c76 }
            r7 = 0
            if (r5 == 0) goto L_0x2ccb
            r7 = 1
        L_0x2ccb:
            if (r14 == 0) goto L_0x2cce
            goto L_0x2cdb
        L_0x2cce:
            if (r7 == 0) goto L_0x2cd4
            if (r14 == 0) goto L_0x2cd4
            goto L_0x2d7a
        L_0x2cd4:
            r5 = r163
            com.instagram.common.typedurl.ImageUrl r7 = r5.A07(r4)     // Catch:{ all -> 0x3c76 }
            goto L_0x2d19
        L_0x2cdb:
            X.3QO r6 = r3.A0B()     // Catch:{ all -> 0x3c76 }
            X.3QO r5 = X.AnonymousClass3QO.OPAL     // Catch:{ all -> 0x3c76 }
            if (r6 != r5) goto L_0x2d56
            X.1q7 r5 = X.1q7.A03     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2d56
            X.1q7 r5 = X.C318996ps.A00()     // Catch:{ all -> 0x3c76 }
            boolean r5 = r5.A04(r4)     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2d56
            X.4Cl r5 = r14.A03     // Catch:{ all -> 0x3c76 }
            X.4bl r5 = r5.BYD()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2d4e
            java.lang.String r5 = r5.Bh8()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2d4e
            X.4Cl r5 = r14.A03     // Catch:{ all -> 0x3c76 }
            X.4bl r5 = r5.BYD()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x3c70
            java.lang.String r5 = r5.Bh8()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x3c70
            android.net.Uri r6 = X.0cp.A03(r5)     // Catch:{ all -> 0x3c76 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3c76 }
            r5 = -1
            com.instagram.common.typedurl.SimpleImageUrl r7 = X.C253833rU.A00(r6, r5, r5)     // Catch:{ all -> 0x3c76 }
        L_0x2d19:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r10 = r0.A1V     // Catch:{ all -> 0x3c76 }
            android.content.Context r8 = r10.getContext()     // Catch:{ all -> 0x3c76 }
            boolean r5 = r13.A1Z     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2d31
            r5 = 2131755018(0x7f10000a, float:1.9140903E38)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r5)     // Catch:{ all -> 0x3c76 }
            r10.A01(r5)     // Catch:{ all -> 0x3c76 }
        L_0x2d2d:
            X.0qQ.A0A(r8)     // Catch:{ all -> 0x3c76 }
            goto L_0x2d7f
        L_0x2d31:
            boolean r5 = r13.A0k()     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2d43
            X.3BQ r6 = X.AnonymousClass3BQ.BIRTHDAY_BOTTOM_SHEET     // Catch:{ all -> 0x3c76 }
            r5 = r161
            if (r5 == r6) goto L_0x2d43
            r5 = r121
            r10.A04(r7, r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2d2d
        L_0x2d43:
            r5 = 2131240006(0x7f082446, float:1.8096335E38)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r5)     // Catch:{ all -> 0x3c76 }
            r10.A01(r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2d2d
        L_0x2d4e:
            java.lang.String r5 = ""
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x3c76 }
            r7.<init>(r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2d19
        L_0x2d56:
            X.3BQ r6 = X.AnonymousClass3BQ.REEL_BOTTOM_SHEET_AGGREGATE_STORIES     // Catch:{ all -> 0x3c76 }
            r5 = r161
            if (r5 == r6) goto L_0x2d7a
            X.3BQ r6 = X.AnonymousClass3BQ.BOTTOM_SHEET_MAS_MUSIC     // Catch:{ all -> 0x3c76 }
            if (r5 == r6) goto L_0x2d7a
            boolean r5 = r13.A0u()     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2d7a
            X.3BQ r6 = X.AnonymousClass3BQ.REEL_HIGHLIGHTS_UPDATES_HUB     // Catch:{ all -> 0x3c76 }
            r5 = r161
            if (r5 != r6) goto L_0x2d74
            boolean r5 = r13.A0l()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2d74
            if (r187 == 0) goto L_0x2d7a
        L_0x2d74:
            boolean r5 = r13.A0g()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2cce
        L_0x2d7a:
            com.instagram.common.typedurl.ImageUrl r7 = r14.Bh3()     // Catch:{ all -> 0x3c76 }
            goto L_0x2d19
        L_0x2d7f:
            if (r187 == 0) goto L_0x2dc2
            boolean r5 = r13.A0b()     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2dc2
            boolean r5 = r13.A0i()     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2dc2
            r5 = 36326726015465418(0x810ef7000137ca, double:3.036506035940512E-306)
            r7 = r19
            boolean r5 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x3c76 }
            android.content.res.Resources r6 = r8.getResources()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2dba
            r5 = 2131165184(0x7f070000, float:1.7944578E38)
            int r6 = r6.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c76 }
        L_0x2da4:
            android.graphics.drawable.Drawable r5 = X.1QE.A0D(r8, r9)     // Catch:{ all -> 0x3c76 }
            r10.A02(r5, r6)     // Catch:{ all -> 0x3c76 }
            android.content.res.Resources r6 = r8.getResources()     // Catch:{ all -> 0x3c76 }
            r5 = 2131165195(0x7f07000b, float:1.79446E38)
            int r5 = r6.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c76 }
            r10.setBadgeOffset(r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2dc7
        L_0x2dba:
            r5 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r6 = r6.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2da4
        L_0x2dc2:
            r5 = r35
            r10.A02(r5, r2)     // Catch:{ all -> 0x3c76 }
        L_0x2dc7:
            boolean r5 = r3.A0R     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2dd5
            X.3mM r5 = r0.A09     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2ddd
            com.instagram.model.reels.Reel r5 = r5.A0H     // Catch:{ all -> 0x3c76 }
            boolean r5 = r5.A1Z     // Catch:{ all -> 0x3c76 }
            if (r5 != r9) goto L_0x2ddd
        L_0x2dd5:
            r5 = r35
            r10.setOnClickListener(r5)     // Catch:{ all -> 0x3c76 }
        L_0x2dda:
            boolean r5 = r3.A0R     // Catch:{ all -> 0x3c76 }
            goto L_0x2dee
        L_0x2ddd:
            X.3BQ r6 = X.AnonymousClass3BQ.MY_WEEK_NUX     // Catch:{ all -> 0x3c76 }
            r5 = r161
            if (r5 == r6) goto L_0x2dd5
            X.6Xe r6 = new X.6Xe     // Catch:{ all -> 0x3c76 }
            r5 = r158
            r6.<init>(r3, r5, r0)     // Catch:{ all -> 0x3c76 }
            X.AnonymousClass0fU.A00(r6, r10)     // Catch:{ all -> 0x3c76 }
            goto L_0x2dda
        L_0x2dee:
            if (r5 == 0) goto L_0x2df6
            r5 = r35
            r12.setOnClickListener(r5)     // Catch:{ all -> 0x3c76 }
            goto L_0x2e00
        L_0x2df6:
            X.6Xf r6 = new X.6Xf     // Catch:{ all -> 0x3c76 }
            r5 = r158
            r6.<init>(r3, r5, r0)     // Catch:{ all -> 0x3c76 }
            X.AnonymousClass0fU.A00(r6, r12)     // Catch:{ all -> 0x3c76 }
        L_0x2e00:
            if (r187 != 0) goto L_0x2ebb
            boolean r5 = r0.A0J     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2ebb
            X.3Nl r6 = r15.Aht()     // Catch:{ all -> 0x3c76 }
            X.3Nl r5 = X.C240993Nl.NONE     // Catch:{ all -> 0x3c76 }
            if (r6 == r5) goto L_0x2ebb
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 != 0) goto L_0x2e58
            android.view.ViewStub r5 = r0.A0X     // Catch:{ all -> 0x3c76 }
            android.view.View r6 = r5.inflate()     // Catch:{ all -> 0x3c76 }
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.reels.ui.badge.ReelBrandingBadgeView"
            X.0qQ.A0C(r6, r5)     // Catch:{ all -> 0x3c76 }
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r6 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r6     // Catch:{ all -> 0x3c76 }
            r0.A0D = r6     // Catch:{ all -> 0x3c76 }
            if (r6 == 0) goto L_0x2e28
            r5 = r29
            r6.setBorderWidth(r5)     // Catch:{ all -> 0x3c76 }
        L_0x2e28:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r6 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r6 == 0) goto L_0x2e32
            r5 = 1041865114(0x3e19999a, float:0.15)
            r6.setTranslationYFactor(r5)     // Catch:{ all -> 0x3c76 }
        L_0x2e32:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2e51
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2e51
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x3c76 }
            r5 = 2131165200(0x7f070010, float:1.794461E38)
            int r5 = r6.getDimensionPixelSize(r5)     // Catch:{ all -> 0x3c76 }
            float r6 = (float) r5     // Catch:{ all -> 0x3c76 }
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2e4f
            r5.setTranslationX(r6)     // Catch:{ all -> 0x3c76 }
        L_0x2e4f:
            r7 = 1
            goto L_0x2e59
        L_0x2e51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2e58:
            r7 = 0
        L_0x2e59:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2eb4
            X.3Nl r6 = r15.Aht()     // Catch:{ all -> 0x3c76 }
            r5.A03(r6)     // Catch:{ all -> 0x3c76 }
            if (r7 != 0) goto L_0x2e70
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2ead
            int r5 = r5.getVisibility()     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2ec2
        L_0x2e70:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2ea6
            r5.setVisibility(r2)     // Catch:{ all -> 0x3c76 }
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r6 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r6 == 0) goto L_0x2e9f
            r5 = r29
            r6.setAlpha(r5)     // Catch:{ all -> 0x3c76 }
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2e98
            android.view.ViewPropertyAnimator r6 = r5.animate()     // Catch:{ all -> 0x3c76 }
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r7 = r6.alpha(r5)     // Catch:{ all -> 0x3c76 }
            r5 = 100
            android.view.ViewPropertyAnimator r5 = r7.setDuration(r5)     // Catch:{ all -> 0x3c76 }
            r5.start()     // Catch:{ all -> 0x3c76 }
            goto L_0x2ec2
        L_0x2e98:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2e9f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2ea6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2ead:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2eb4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x2ebb:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r5 = r0.A0D     // Catch:{ all -> 0x3c76 }
            if (r5 == 0) goto L_0x2ec2
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c76 }
        L_0x2ec2:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2ece
            r5 = -340038461(0xffffffffebbb6cc3, float:-4.531655E26)
        L_0x2ecb:
            X.0fS.A00(r5)     // Catch:{ all -> 0x3cb6 }
        L_0x2ece:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x2edc
            r6 = 1302219893(0x4d9e4c75, float:3.31976352E8)
            java.lang.String r5 = "ReelViewerItemBinder.maybeBindVerifiedBadge"
            X.0fS.A01(r5, r6)     // Catch:{ all -> 0x3cb6 }
        L_0x2edc:
            r5 = 36324166214889307(0x810ca300002f5b, double:3.0348872077486895E-306)
            r7 = r19
            boolean r7 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x3c59 }
            if (r7 == 0) goto L_0x2ef3
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r7 == 0) goto L_0x2f25
            r7 = -647803112(0xffffffffd9634f18, float:-3.99886151E15)
            goto L_0x2f22
        L_0x2ef3:
            android.widget.TextView r11 = r0.A0d     // Catch:{ all -> 0x3c59 }
            r10 = 1
            if (r14 == 0) goto L_0x2f17
            boolean r7 = r14.isVerified()     // Catch:{ all -> 0x3c59 }
            if (r7 != r9) goto L_0x2f17
        L_0x2efe:
            android.widget.TextView r7 = r0.A0c     // Catch:{ all -> 0x3c59 }
            int r12 = r7.getPaddingLeft()     // Catch:{ all -> 0x3c59 }
            android.content.Context r8 = r11.getContext()     // Catch:{ all -> 0x3c59 }
            r7 = 2130970240(0x7f040680, float:1.7549185E38)
            int r7 = X.2Yu.A0H(r8, r7)     // Catch:{ all -> 0x3c59 }
            int r7 = r8.getColor(r7)     // Catch:{ all -> 0x3c59 }
            X.C244273av.A09(r11, r2, r12, r7, r10)     // Catch:{ all -> 0x3c59 }
            goto L_0x2f19
        L_0x2f17:
            r10 = 0
            goto L_0x2efe
        L_0x2f19:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r7 == 0) goto L_0x2f25
            r7 = 882465268(0x349959f4, float:2.856392E-7)
        L_0x2f22:
            X.0fS.A00(r7)     // Catch:{ all -> 0x3cb6 }
        L_0x2f25:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r7 == 0) goto L_0x2f33
            r8 = 1718898452(0x66744f14, float:2.8842904E23)
            java.lang.String r7 = "ReelViewerItemBinder.bindTimestamp"
            X.0fS.A01(r7, r8)     // Catch:{ all -> 0x3cb6 }
        L_0x2f33:
            r7 = r19
            boolean r5 = X.182.A06(r7, r4, r5)     // Catch:{ all -> 0x3c4e }
            if (r5 == 0) goto L_0x2f46
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x3073
            r5 = -1386258157(0xffffffffad5f6113, float:-1.2697637E-11)
            goto L_0x3070
        L_0x2f46:
            if (r18 != 0) goto L_0x3062
            boolean r5 = r3.A0R     // Catch:{ all -> 0x3c4e }
            if (r5 != 0) goto L_0x3062
            boolean r5 = r3.A12()     // Catch:{ all -> 0x3c4e }
            if (r5 != 0) goto L_0x3062
            boolean r5 = r3.A1E()     // Catch:{ all -> 0x3c4e }
            if (r5 != 0) goto L_0x3062
            r5 = r163
            com.instagram.model.reels.Reel r11 = r5.A0H     // Catch:{ all -> 0x3c4e }
            boolean r5 = r11.A18(r4)     // Catch:{ all -> 0x3c4e }
            if (r5 != 0) goto L_0x3062
            boolean r5 = r3.A1i()     // Catch:{ all -> 0x3c4e }
            if (r5 != 0) goto L_0x3062
            long r5 = r3.A03()     // Catch:{ all -> 0x3c4e }
            long r12 = X.AnonymousClass3PE.A00     // Catch:{ all -> 0x3c4e }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r7
            long r5 = r5 + r12
            X.3mM r10 = r0.A09     // Catch:{ all -> 0x3c4e }
            java.lang.String r12 = "Required value was null."
            if (r10 == 0) goto L_0x3056
            com.instagram.model.reels.Reel r10 = r10.A0H     // Catch:{ all -> 0x3c4e }
            boolean r13 = r10.A0b()     // Catch:{ all -> 0x3c4e }
            if (r13 == 0) goto L_0x2f98
            r9 = 3
            java.text.DateFormat r9 = java.text.DateFormat.getTimeInstance(r9)     // Catch:{ all -> 0x3c4e }
            long r5 = r5 * r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x3c4e }
            java.lang.String r9 = r9.format(r5)     // Catch:{ all -> 0x3c4e }
        L_0x2f8e:
            android.widget.TextView r5 = r0.A0c     // Catch:{ all -> 0x3c4e }
            r5.setText(r9)     // Catch:{ all -> 0x3c4e }
            r5.setVisibility(r2)     // Catch:{ all -> 0x3c4e }
            goto L_0x3067
        L_0x2f98:
            boolean r10 = r10.A0l()     // Catch:{ all -> 0x3c4e }
            if (r10 != r9) goto L_0x2fd3
            java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x3c4e }
            long r7 = r7 * r5
            r9.setTimeInMillis(r7)     // Catch:{ all -> 0x3c4e }
            java.util.Calendar r8 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x3c4e }
            r7 = 5
            int r8 = r8.get(r7)     // Catch:{ all -> 0x3c4e }
            int r7 = r9.get(r7)     // Catch:{ all -> 0x3c4e }
            if (r8 != r7) goto L_0x2fc3
            android.widget.TextView r7 = r0.A0c     // Catch:{ all -> 0x3c4e }
            android.content.Context r7 = r7.getContext()     // Catch:{ all -> 0x3c4e }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3c4e }
            java.lang.String r9 = X.JZV.A04(r7, r5)     // Catch:{ all -> 0x3c4e }
            goto L_0x2f8e
        L_0x2fc3:
            java.text.DateFormatSymbols r5 = java.text.DateFormatSymbols.getInstance()     // Catch:{ all -> 0x3c4e }
            java.lang.String[] r6 = r5.getShortWeekdays()     // Catch:{ all -> 0x3c4e }
            r5 = 7
            int r5 = r9.get(r5)     // Catch:{ all -> 0x3c4e }
            r9 = r6[r5]     // Catch:{ all -> 0x3c4e }
            goto L_0x2f8e
        L_0x2fd3:
            X.3mM r10 = r0.A09     // Catch:{ all -> 0x3c4e }
            if (r10 == 0) goto L_0x305c
            com.instagram.model.reels.Reel r12 = r10.A0H     // Catch:{ all -> 0x3c4e }
            boolean r10 = r12.A0i()     // Catch:{ all -> 0x3c4e }
            if (r10 != r9) goto L_0x2fed
            android.widget.TextView r7 = r0.A0c     // Catch:{ all -> 0x3c4e }
            android.content.Context r7 = r7.getContext()     // Catch:{ all -> 0x3c4e }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3c4e }
            java.lang.String r9 = X.JZV.A04(r7, r5)     // Catch:{ all -> 0x3c4e }
            goto L_0x2f8e
        L_0x2fed:
            boolean r9 = r12.A0k()     // Catch:{ all -> 0x3c4e }
            if (r9 == 0) goto L_0x3005
            long r5 = r3.A03()     // Catch:{ all -> 0x3c4e }
            double r9 = (double) r5     // Catch:{ all -> 0x3c4e }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x3c4e }
            long r5 = r5 / r7
            double r7 = (double) r5     // Catch:{ all -> 0x3c4e }
            java.lang.String r5 = "MMMM d"
            java.lang.String r9 = X.1G0.A0F(r5, r9, r7)     // Catch:{ all -> 0x3c4e }
            goto L_0x2f8e
        L_0x3005:
            android.widget.TextView r9 = r0.A0c     // Catch:{ all -> 0x3c4e }
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x3c4e }
            android.content.res.Resources r14 = r9.getResources()     // Catch:{ all -> 0x3c4e }
            long r9 = r3.A03()     // Catch:{ all -> 0x3c4e }
            long r12 = X.AnonymousClass3PE.A00     // Catch:{ all -> 0x3c4e }
            long r12 = r12 / r7
            long r9 = r9 + r12
            double r12 = (double) r9     // Catch:{ all -> 0x3c4e }
            java.lang.String r9 = X.1G0.A09(r14, r12)     // Catch:{ all -> 0x3c4e }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x3c4e }
            long r12 = r12 / r7
            r7 = 86400(0x15180, double:4.26873E-319)
            long r12 = r12 - r7
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x2f8e
            boolean r7 = r11.A1a     // Catch:{ all -> 0x3c4e }
            if (r7 != 0) goto L_0x2f8e
            X.1Zn r10 = X.1Zm.A00(r4)     // Catch:{ all -> 0x3c4e }
            java.lang.Integer r8 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x3c4e }
            java.lang.Integer r7 = X.AnonymousClass05K.A05     // Catch:{ all -> 0x3c4e }
            X.1Zp r7 = r10.A01(r8, r7, r2)     // Catch:{ all -> 0x3c4e }
            java.lang.String r10 = "reel_id"
            java.lang.String r8 = r3.A0k     // Catch:{ all -> 0x3c4e }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3c4e }
            r7.A03(r10, r8)     // Catch:{ all -> 0x3c4e }
            java.lang.String r8 = "story_timestamp"
            r7.A02(r8, r5)     // Catch:{ all -> 0x3c4e }
            java.lang.String r8 = "current_timestamp"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x3c4e }
            r7.A02(r8, r5)     // Catch:{ all -> 0x3c4e }
            r7.A00()     // Catch:{ all -> 0x3c4e }
            goto L_0x2f8e
        L_0x3056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c4e }
            r0.<init>(r12)     // Catch:{ all -> 0x3c4e }
            goto L_0x3061
        L_0x305c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c4e }
            r0.<init>(r12)     // Catch:{ all -> 0x3c4e }
        L_0x3061:
            throw r0     // Catch:{ all -> 0x3c4e }
        L_0x3062:
            android.widget.TextView r5 = r0.A0c     // Catch:{ all -> 0x3c4e }
            r5.setVisibility(r1)     // Catch:{ all -> 0x3c4e }
        L_0x3067:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x3073
            r5 = -1982028944(0xffffffff89dca370, float:-5.311677E-33)
        L_0x3070:
            X.0fS.A00(r5)     // Catch:{ all -> 0x3cb6 }
        L_0x3073:
            boolean r5 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r5 == 0) goto L_0x3081
            r6 = -1878158065(0xffffffff900d950f, float:-2.7922177E-29)
            java.lang.String r5 = "ReelViewerItemBinder.maybeBindMenuButton"
            X.0fS.A01(r5, r6)     // Catch:{ all -> 0x3cb6 }
        L_0x3081:
            r5 = r163
            com.instagram.model.reels.Reel r5 = r5.A0H     // Catch:{ all -> 0x3c43 }
            boolean r6 = r5.A18(r4)     // Catch:{ all -> 0x3c43 }
            if (r6 == 0) goto L_0x30ab
            boolean r6 = r3.A1l()     // Catch:{ all -> 0x3c43 }
            if (r6 != 0) goto L_0x30ab
        L_0x3091:
            X.3oV r10 = r0.A0v     // Catch:{ all -> 0x3c43 }
            android.view.View r9 = r10.getView()     // Catch:{ all -> 0x3c43 }
            X.6UR r8 = new X.6UR     // Catch:{ all -> 0x3c43 }
            r7 = r163
            r6 = r158
            r8.<init>(r3, r7, r6)     // Catch:{ all -> 0x3c43 }
            X.AnonymousClass0fU.A00(r8, r9)     // Catch:{ all -> 0x3c43 }
            android.view.View r6 = r10.getView()     // Catch:{ all -> 0x3c43 }
            r6.setVisibility(r2)     // Catch:{ all -> 0x3c43 }
            goto L_0x30ed
        L_0x30ab:
            com.instagram.feed.widget.IgProgressImageView r6 = r0.BGP()     // Catch:{ all -> 0x3c43 }
            android.content.Context r8 = r6.getContext()     // Catch:{ all -> 0x3c43 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3c43 }
            r6 = r163
            boolean r7 = X.AnonymousClass6YK.A02(r4, r3, r6)     // Catch:{ all -> 0x3c43 }
            r6 = r162
            boolean r6 = X.AnonymousClass6YK.A00(r8, r4, r3, r6, r7)     // Catch:{ all -> 0x3c43 }
            if (r6 == 0) goto L_0x30d2
            if (r7 != 0) goto L_0x30d2
            boolean r6 = r3.A12()     // Catch:{ all -> 0x3c43 }
            if (r6 != 0) goto L_0x30d2
            boolean r6 = r3.A17()     // Catch:{ all -> 0x3c43 }
            if (r6 == 0) goto L_0x3091
        L_0x30d2:
            X.1NN r6 = X.1NM.A00(r4)     // Catch:{ all -> 0x3c43 }
            boolean r6 = r6.A01()     // Catch:{ all -> 0x3c43 }
            if (r6 == 0) goto L_0x30e4
            X.3oV r6 = r0.A0v     // Catch:{ all -> 0x3c43 }
            boolean r6 = r6.CVM()     // Catch:{ all -> 0x3c43 }
            if (r6 == 0) goto L_0x30ed
        L_0x30e4:
            X.3oV r6 = r0.A0v     // Catch:{ all -> 0x3c43 }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x3c43 }
            r6.setVisibility(r1)     // Catch:{ all -> 0x3c43 }
        L_0x30ed:
            boolean r6 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r6 == 0) goto L_0x30f9
            r6 = -572946670(0xffffffffddd98712, float:-1.9593146E18)
            X.0fS.A00(r6)     // Catch:{ all -> 0x3cb6 }
        L_0x30f9:
            boolean r6 = com.facebook.systrace.Systrace.A0E(r33)
            if (r6 == 0) goto L_0x3105
            r6 = -864049801(0xffffffffcc7fa577, float:-6.7016156E7)
            X.0fS.A00(r6)
        L_0x3105:
            r6 = 1
            r8 = 3
            r7 = r32
            X.0qQ.A0B(r7, r8)
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x311a
            r8 = -882865472(0xffffffffcb608ac0, float:-1.4715584E7)
            java.lang.String r7 = "ReelViewerItemBinder.bindRetryOrError"
            X.0fS.A01(r7, r8)
        L_0x311a:
            X.3mM r7 = r0.A09     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x31a9
            boolean r7 = r7.A0E(r4)     // Catch:{ all -> 0x3c37 }
            if (r7 != r6) goto L_0x31a9
            X.3PP r7 = X.AnonymousClass3PO.A00(r4)     // Catch:{ all -> 0x3c37 }
            java.util.Set r8 = r7.A02     // Catch:{ all -> 0x3c37 }
            X.3mM r7 = r0.A09     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x3147
            com.instagram.model.reels.Reel r7 = r7.A0H     // Catch:{ all -> 0x3c37 }
            java.lang.String r7 = r7.getId()     // Catch:{ all -> 0x3c37 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x3c37 }
        L_0x3137:
            boolean r7 = X.00k.A0u(r8, r7)     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x31a9
            java.lang.String r9 = r3.A0k     // Catch:{ all -> 0x3c37 }
            java.lang.String r8 = "reel_story_retry"
            r7 = r32
            X.LS4.A02(r4, r9, r8, r7)     // Catch:{ all -> 0x3c37 }
            goto L_0x314a
        L_0x3147:
            r7 = r35
            goto L_0x3137
        L_0x314a:
            if (r188 == 0) goto L_0x3152
            X.2eb r7 = r0.A0n     // Catch:{ all -> 0x3c37 }
            r7.A03(r2)     // Catch:{ all -> 0x3c37 }
            goto L_0x31a0
        L_0x3152:
            X.3oV r11 = r0.A0w     // Catch:{ all -> 0x3c37 }
            android.view.View r7 = r11.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7     // Catch:{ all -> 0x3c37 }
            r7.setVisibility(r2)     // Catch:{ all -> 0x3c37 }
            X.3MM r10 = X.AnonymousClass3MM.A00     // Catch:{ all -> 0x3c37 }
            android.view.View r9 = r11.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r9 = (com.instagram.common.ui.base.IgSimpleImageView) r9     // Catch:{ all -> 0x3c37 }
            java.lang.String r8 = "show retry view"
            r7 = r32
            r10.A00(r9, r8, r7)     // Catch:{ all -> 0x3c37 }
            android.view.View r9 = r11.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r9 = (com.instagram.common.ui.base.IgSimpleImageView) r9     // Catch:{ all -> 0x3c37 }
            X.DEA r8 = new X.DEA     // Catch:{ all -> 0x3c37 }
            r7 = r158
            r8.<init>(r7)     // Catch:{ all -> 0x3c37 }
            X.AnonymousClass0fU.A00(r8, r9)     // Catch:{ all -> 0x3c37 }
            android.view.View r8 = r11.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r8 = (com.instagram.common.ui.base.IgSimpleImageView) r8     // Catch:{ all -> 0x3c37 }
            android.view.View r7 = r11.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7     // Catch:{ all -> 0x3c37 }
            android.content.Context r9 = r7.getContext()     // Catch:{ all -> 0x3c37 }
            r7 = 2131971746(0x7f134ea2, float:1.958048E38)
            java.lang.String r7 = r9.getString(r7)     // Catch:{ all -> 0x3c37 }
            r8.setContentDescription(r7)     // Catch:{ all -> 0x3c37 }
            X.2eb r7 = r0.A0n     // Catch:{ all -> 0x3c37 }
            r7.A03(r1)     // Catch:{ all -> 0x3c37 }
            X.2eb r7 = r0.A0o     // Catch:{ all -> 0x3c37 }
            r7.A03(r1)     // Catch:{ all -> 0x3c37 }
        L_0x31a0:
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3c37 }
            r7.setEnableProgressBar(r2)     // Catch:{ all -> 0x3c37 }
            goto L_0x3262
        L_0x31a9:
            X.3mM r7 = r0.A09     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x3c2f
            boolean r8 = r7.A0E(r4)     // Catch:{ all -> 0x3c37 }
            if (r8 == 0) goto L_0x3222
            com.instagram.model.reels.Reel r7 = r7.A0H     // Catch:{ all -> 0x3c37 }
            boolean r7 = r7.A1X     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x3222
            java.lang.String r8 = r3.A0k     // Catch:{ all -> 0x3c37 }
            java.lang.String r9 = "reel_story_unavailable"
            r7 = r32
            X.LS4.A02(r4, r8, r9, r7)     // Catch:{ all -> 0x3c37 }
            r7 = r24
            r7.setVisibility(r1)     // Catch:{ all -> 0x3c37 }
            X.1NN r7 = X.1NM.A00(r4)     // Catch:{ all -> 0x3c37 }
            boolean r7 = r7.A01()     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x31d9
            X.3oV r7 = r0.A0w     // Catch:{ all -> 0x3c37 }
            boolean r7 = r7.CVM()     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x31ef
        L_0x31d9:
            X.3oV r9 = r0.A0w     // Catch:{ all -> 0x3c37 }
            android.view.View r7 = r9.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7     // Catch:{ all -> 0x3c37 }
            r7.setVisibility(r1)     // Catch:{ all -> 0x3c37 }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r9 = (com.instagram.common.ui.base.IgSimpleImageView) r9     // Catch:{ all -> 0x3c37 }
            r7 = r35
            r9.setOnClickListener(r7)     // Catch:{ all -> 0x3c37 }
        L_0x31ef:
            X.2eb r7 = r0.A0n     // Catch:{ all -> 0x3c37 }
            r7.A03(r1)     // Catch:{ all -> 0x3c37 }
            X.2eb r7 = r0.A0o     // Catch:{ all -> 0x3c37 }
            r7.A03(r1)     // Catch:{ all -> 0x3c37 }
            android.view.View r7 = r155.getView()     // Catch:{ all -> 0x3c37 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x3c37 }
            r7.setVisibility(r2)     // Catch:{ all -> 0x3c37 }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3c37 }
            r7.setEnableProgressBar(r2)     // Catch:{ all -> 0x3c37 }
            X.2pI r9 = new X.2pI     // Catch:{ all -> 0x3c37 }
            r9.<init>()     // Catch:{ all -> 0x3c37 }
            java.util.List r7 = r9.A07     // Catch:{ all -> 0x3c37 }
            r7.add(r8)     // Catch:{ all -> 0x3c37 }
            X.2f9 r8 = X.AnonymousClass2f9.A00(r4)     // Catch:{ all -> 0x3c37 }
            X.2pI r7 = r9.A04()     // Catch:{ all -> 0x3c37 }
            r8.A0L(r7)     // Catch:{ all -> 0x3c37 }
            r9.A05()     // Catch:{ all -> 0x3c37 }
            goto L_0x3262
        L_0x3222:
            X.2eb r7 = r0.A0n     // Catch:{ all -> 0x3c37 }
            r7.A03(r1)     // Catch:{ all -> 0x3c37 }
            X.2eb r7 = r0.A0o     // Catch:{ all -> 0x3c37 }
            r7.A03(r1)     // Catch:{ all -> 0x3c37 }
            X.1NN r7 = X.1NM.A00(r4)     // Catch:{ all -> 0x3c37 }
            boolean r7 = r7.A01()     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x323e
            X.3oV r7 = r0.A0w     // Catch:{ all -> 0x3c37 }
            boolean r7 = r7.CVM()     // Catch:{ all -> 0x3c37 }
            if (r7 == 0) goto L_0x3254
        L_0x323e:
            X.3oV r8 = r0.A0w     // Catch:{ all -> 0x3c37 }
            android.view.View r7 = r8.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7     // Catch:{ all -> 0x3c37 }
            r7.setVisibility(r1)     // Catch:{ all -> 0x3c37 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x3c37 }
            com.instagram.common.ui.base.IgSimpleImageView r8 = (com.instagram.common.ui.base.IgSimpleImageView) r8     // Catch:{ all -> 0x3c37 }
            r7 = r35
            r8.setOnClickListener(r7)     // Catch:{ all -> 0x3c37 }
        L_0x3254:
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3c37 }
            r7.setEnableProgressBar(r6)     // Catch:{ all -> 0x3c37 }
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()     // Catch:{ all -> 0x3c37 }
            r7.setProgressBarIndeterminate(r2)     // Catch:{ all -> 0x3c37 }
        L_0x3262:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x326e
            r7 = -1684272234(0xffffffff9b9c0b96, float:-2.5815522E-22)
            X.0fS.A00(r7)
        L_0x326e:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x327c
            r8 = -197682011(0xfffffffff4379ca5, float:-5.818893E31)
            java.lang.String r7 = "ReelViewerItemBinder.bindViolationBanner"
            X.0fS.A01(r7, r8)
        L_0x327c:
            boolean r7 = r3.CWu()     // Catch:{ all -> 0x3c23 }
            if (r7 == 0) goto L_0x32b3
            r16.getClass()     // Catch:{ all -> 0x3c23 }
            r7 = r148
            X.3TX r10 = r7.A1N     // Catch:{ all -> 0x3c23 }
            boolean r9 = r16.A5v()     // Catch:{ all -> 0x3c23 }
            r7 = r16
            X.1Xy r7 = r7.A0C     // Catch:{ all -> 0x3c23 }
            java.lang.Boolean r7 = r7.BAe()     // Catch:{ all -> 0x3c23 }
            if (r7 == 0) goto L_0x32b1
            boolean r8 = r7.booleanValue()     // Catch:{ all -> 0x3c23 }
        L_0x329b:
            r7 = r16
            com.instagram.user.model.User r7 = r7.A2A(r4)     // Catch:{ all -> 0x3c23 }
            X.9IE r9 = X.C246493eh.A00(r7, r9, r8)     // Catch:{ all -> 0x3c23 }
            r7 = r31
            com.instagram.user.model.User r8 = r7.A01(r4)     // Catch:{ all -> 0x3c23 }
            r7 = r158
            X.AnonymousClass4G6.A00(r9, r7, r10, r8)     // Catch:{ all -> 0x3c23 }
            goto L_0x32b3
        L_0x32b1:
            r8 = 0
            goto L_0x329b
        L_0x32b3:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x32bf
            r7 = 631280163(0x25a09223, float:2.7854602E-16)
            X.0fS.A00(r7)
        L_0x32bf:
            java.util.List r8 = r3.A0b()
            X.3WT r7 = X.AnonymousClass3WT.COUNTDOWN
            X.3ui r7 = X.C289745e8.A00(r7, r8)
            if (r7 == 0) goto L_0x331e
            X.WaO r7 = r7.A0B()
        L_0x32cf:
            boolean r7 = X.C309186Xg.A00(r7)
            if (r7 != 0) goto L_0x3300
            X.WaJ r7 = X.C265894Ws.A01(r3)
            if (r7 == 0) goto L_0x32e8
            X.UNZ r7 = r7.A02
            java.lang.Integer r7 = r7.A03
            if (r7 == 0) goto L_0x3300
            int r8 = r7.intValue()
            r7 = -1
            if (r8 == r7) goto L_0x3300
        L_0x32e8:
            java.util.List r8 = r3.A0b()
            X.3WT r7 = X.AnonymousClass3WT.FUNDRAISER
            X.3ui r7 = X.C289745e8.A00(r7, r8)
            if (r7 != 0) goto L_0x3312
            r7 = 0
        L_0x32f5:
            X.A8l r8 = X.C39575A0r.A00(r4)
            boolean r7 = r8.A00(r7)
            r9 = 0
            if (r7 == 0) goto L_0x3301
        L_0x3300:
            r9 = 1
        L_0x3301:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x330f
            r8 = 1531519548(0x5b49223c, float:5.6614111E16)
            java.lang.String r7 = "ReelViewerItemBinder.bindBounceAndConfettiView"
            X.0fS.A01(r7, r8)
        L_0x330f:
            if (r9 == 0) goto L_0x3333
            goto L_0x3320
        L_0x3312:
            X.8YF r8 = r7.A0y
            if (r8 == 0) goto L_0x331c
            X.WaN r7 = new X.WaN
            r7.<init>(r8)
            goto L_0x32f5
        L_0x331c:
            r7 = 0
            goto L_0x32f5
        L_0x331e:
            r7 = 0
            goto L_0x32cf
        L_0x3320:
            android.widget.ImageView r7 = r0.A05     // Catch:{ all -> 0x3c17 }
            if (r7 != 0) goto L_0x3333
            android.view.ViewStub r7 = r0.A0Z     // Catch:{ all -> 0x3c17 }
            android.view.View r8 = r7.inflate()     // Catch:{ all -> 0x3c17 }
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r8, r7)     // Catch:{ all -> 0x3c17 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ all -> 0x3c17 }
            r0.A05 = r8     // Catch:{ all -> 0x3c17 }
        L_0x3333:
            android.widget.ImageView r7 = r0.A05     // Catch:{ all -> 0x3c17 }
            if (r7 == 0) goto L_0x333a
            r7.setVisibility(r1)     // Catch:{ all -> 0x3c17 }
        L_0x333a:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x3346
            r7 = 513180466(0x1e968332, float:1.5936129E-20)
            X.0fS.A00(r7)
        L_0x3346:
            X.0tS r8 = r30.A00()
            X.0s0 r7 = r8.A2x
            r9 = 10
            r9 = r20[r9]
            java.lang.Object r7 = r7.CDM(r8, r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x3534
            boolean r7 = X.2R8.A00(r4)
            if (r7 == 0) goto L_0x3534
            r9 = -2
            r7 = 8388611(0x800003, float:1.1754948E-38)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r9, r9, r7)
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()
            android.content.Context r7 = r7.getContext()
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r7)
            r7 = 1234567(0x12d687, float:1.729997E-39)
            r12.setId(r7)
            r12.setOrientation(r6)
            android.content.Context r7 = r12.getContext()
            android.content.res.Resources r8 = r7.getResources()
            r7 = 2131099788(0x7f06008c, float:1.781194E38)
            int r7 = r8.getColor(r7)
            r12.setBackgroundColor(r7)
            com.instagram.feed.widget.IgProgressImageView r7 = r0.BGP()
            r7.addView(r12, r10)
            X.3mM r7 = r0.A09
            X.0qQ.A0A(r7)
            com.instagram.model.reels.Reel r8 = r7.A0H
            r7 = 1258291203(0x4b000003, float:8388611.0)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r9, r9, r7)
            X.3HV r7 = r8.A0M
            if (r7 == 0) goto L_0x3534
            java.lang.String r9 = "emeimps: "
            java.lang.Double r8 = r7.A04
            java.lang.String r10 = "%.3f"
            java.lang.String r26 = "null"
            if (r8 == 0) goto L_0x356e
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x33c6:
            java.lang.String r25 = X.002.A0R(r9, r8)
            java.lang.String r9 = "ereply: "
            java.lang.Double r8 = r7.A05
            if (r8 == 0) goto L_0x356a
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x33df:
            java.lang.String r24 = X.002.A0R(r9, r8)
            java.lang.String r9 = "fp: "
            java.lang.Double r8 = r7.A06
            if (r8 == 0) goto L_0x3566
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x33f8:
            java.lang.String r23 = X.002.A0R(r9, r8)
            java.lang.String r9 = "pcontact: "
            java.lang.Double r8 = r7.A0K
            if (r8 == 0) goto L_0x3562
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x3411:
            java.lang.String r22 = X.002.A0R(r9, r8)
            java.lang.String r9 = "pevpvd: "
            java.lang.Double r8 = r7.A0L
            if (r8 == 0) goto L_0x355e
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x342a:
            java.lang.String r21 = X.002.A0R(r9, r8)
            java.lang.String r9 = "plike: "
            java.lang.Double r8 = r7.A0M
            if (r8 == 0) goto L_0x355a
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x3443:
            java.lang.String r20 = X.002.A0R(r9, r8)
            java.lang.String r9 = "pnext: "
            java.lang.Double r8 = r7.A0N
            if (r8 == 0) goto L_0x3556
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x345c:
            java.lang.String r19 = X.002.A0R(r9, r8)
            java.lang.String r9 = "preciprocal: "
            java.lang.Double r8 = r7.A0O
            if (r8 == 0) goto L_0x3552
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x3475:
            java.lang.String r18 = X.002.A0R(r9, r8)
            java.lang.String r9 = "preshare: "
            java.lang.Double r8 = r7.A0Q
            if (r8 == 0) goto L_0x354e
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x348e:
            java.lang.String r15 = X.002.A0R(r9, r8)
            java.lang.String r9 = "pskip: "
            java.lang.Double r8 = r7.A0S
            if (r8 == 0) goto L_0x354a
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x34a7:
            java.lang.String r14 = X.002.A0R(r9, r8)
            java.lang.String r9 = "ptap: "
            java.lang.Double r8 = r7.A0T
            if (r8 == 0) goto L_0x3546
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x34c0:
            java.lang.String r13 = X.002.A0R(r9, r8)
            java.lang.String r9 = "vm: "
            java.lang.Double r8 = r7.A0V
            if (r8 == 0) goto L_0x3543
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r8 = java.lang.String.format(r10, r8)
            X.0qQ.A07(r8)
        L_0x34d9:
            java.lang.String r9 = X.002.A0R(r9, r8)
            java.lang.String r8 = "vm_interaction: "
            java.lang.Double r7 = r7.A0W
            if (r7 == 0) goto L_0x34f2
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r26 = java.lang.String.format(r10, r7)
            X.0qQ.A07(r26)
        L_0x34f2:
            r7 = r26
            java.lang.String r8 = X.002.A0R(r8, r7)
            java.lang.String r7 = "\n\n"
            X.VG5.A00(r11, r12, r7)
            r7 = r25
            X.VG5.A00(r11, r12, r7)
            r7 = r24
            X.VG5.A00(r11, r12, r7)
            r7 = r23
            X.VG5.A00(r11, r12, r7)
            r7 = r22
            X.VG5.A00(r11, r12, r7)
            r7 = r21
            X.VG5.A00(r11, r12, r7)
            r7 = r20
            X.VG5.A00(r11, r12, r7)
            r7 = r19
            X.VG5.A00(r11, r12, r7)
            r7 = r18
            X.VG5.A00(r11, r12, r7)
            X.VG5.A00(r11, r12, r15)
            X.VG5.A00(r11, r12, r14)
            X.VG5.A00(r11, r12, r13)
            X.VG5.A00(r11, r12, r9)
            X.VG5.A00(r11, r12, r8)
        L_0x3534:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)
            if (r7 == 0) goto L_0x3572
            r8 = -703842938(0xffffffffd60c3586, float:-3.8540377E13)
            java.lang.String r7 = "ReelViewerItemBinder.bindToolbarViews"
            X.0fS.A01(r7, r8)
            goto L_0x3572
        L_0x3543:
            r8 = r26
            goto L_0x34d9
        L_0x3546:
            r8 = r26
            goto L_0x34c0
        L_0x354a:
            r8 = r26
            goto L_0x34a7
        L_0x354e:
            r8 = r26
            goto L_0x348e
        L_0x3552:
            r8 = r26
            goto L_0x3475
        L_0x3556:
            r8 = r26
            goto L_0x345c
        L_0x355a:
            r8 = r26
            goto L_0x3443
        L_0x355e:
            r8 = r26
            goto L_0x342a
        L_0x3562:
            r8 = r26
            goto L_0x3411
        L_0x3566:
            r8 = r26
            goto L_0x33f8
        L_0x356a:
            r8 = r26
            goto L_0x33df
        L_0x356e:
            r8 = r26
            goto L_0x33c6
        L_0x3572:
            boolean r7 = r5.A1b     // Catch:{ all -> 0x3c0b }
            r108 = r121
            r109 = r4
            r110 = r3
            r111 = r163
            r112 = r162
            r113 = r161
            r114 = r160
            r115 = r158
            r116 = r148
            r117 = r156
            r119 = r7
            X.C309196Xh.A01(r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119)     // Catch:{ all -> 0x3c0b }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x359b
            r8 = 1280322463(0x4c502b9f, float:5.457062E7)
            java.lang.String r7 = "StoryViewerCommentsViewComponent.bindOneTimeView"
            X.0fS.A01(r7, r8)     // Catch:{ all -> 0x3c0b }
        L_0x359b:
            X.6nl r7 = new X.6nl     // Catch:{ all -> 0x3bfd }
            r7.<init>(r4)     // Catch:{ all -> 0x3bfd }
            r8 = r31
            com.instagram.user.model.User r13 = r8.A01(r4)     // Catch:{ all -> 0x3bfd }
            X.6nl r8 = new X.6nl     // Catch:{ all -> 0x3bfd }
            r8.<init>(r4)     // Catch:{ all -> 0x3bfd }
            java.util.List r14 = X.C317356n8.A04(r16)     // Catch:{ all -> 0x3bfd }
            if (r14 != 0) goto L_0x35b3
            X.0sn r14 = X.0sn.A00     // Catch:{ all -> 0x3bfd }
        L_0x35b3:
            java.util.List r15 = X.C317356n8.A03(r16)     // Catch:{ all -> 0x3bfd }
            r9 = r4
            r10 = r3
            r11 = r35
            r12 = r8
            X.6n9 r8 = X.C317356n8.A01(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x3bfd }
            X.6Y8 r11 = X.AnonymousClass6Y8.A00     // Catch:{ all -> 0x3bfd }
            X.6Y9 r12 = X.AnonymousClass6Y9.A00     // Catch:{ all -> 0x3bfd }
            r9 = r0
            r10 = r35
            X.AnonymousClass6YA.A02(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3bfd }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x35d6
            r7 = 1074481886(0x400b4ade, float:2.1764445)
            X.0fS.A00(r7)     // Catch:{ all -> 0x3c0b }
        L_0x35d6:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x35e4
            r8 = 812966583(0x3074e2b7, float:8.9088864E-10)
            java.lang.String r7 = "ReelItemActionButtonViewBinder.bindView"
            X.0fS.A01(r7, r8)     // Catch:{ all -> 0x3c0b }
        L_0x35e4:
            boolean r7 = r5.A0k()     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x35ed
            java.lang.Integer r8 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x3bf2 }
            goto L_0x364c
        L_0x35ed:
            if (r187 != 0) goto L_0x3614
            if (r16 == 0) goto L_0x3614
            r7 = r16
            X.1Xy r7 = r7.A0C     // Catch:{ all -> 0x3bf2 }
            java.lang.Boolean r7 = r7.AkG()     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x3614
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x3bf2 }
            if (r7 != r6) goto L_0x3614
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x3bf2 }
            r7 = 36325720993051812(0x810e0d000034a4, double:3.035870455719247E-306)
            boolean r7 = X.182.A06(r9, r4, r7)     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x3611
            java.lang.Integer r8 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x3bf2 }
            goto L_0x364c
        L_0x3611:
            java.lang.Integer r8 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x3bf2 }
            goto L_0x364c
        L_0x3614:
            java.util.List r8 = r3.A0b()     // Catch:{ all -> 0x3bf2 }
            X.3WT r7 = X.AnonymousClass3WT.FUNDRAISER     // Catch:{ all -> 0x3bf2 }
            X.3ui r7 = X.C289745e8.A00(r7, r8)     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x362c
            X.8YF r7 = r7.A0y     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x362a
            X.WaN r8 = new X.WaN     // Catch:{ all -> 0x3bf2 }
            r8.<init>(r7)     // Catch:{ all -> 0x3bf2 }
            goto L_0x362d
        L_0x362a:
            r8 = 0
            goto L_0x362d
        L_0x362c:
            r8 = 0
        L_0x362d:
            if (r187 != 0) goto L_0x363e
            if (r8 == 0) goto L_0x363e
            X.A8l r7 = X.C39575A0r.A00(r4)     // Catch:{ all -> 0x3bf2 }
            boolean r7 = r7.A00(r8)     // Catch:{ all -> 0x3bf2 }
            if (r7 != r6) goto L_0x363e
            java.lang.Integer r8 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x3bf2 }
            goto L_0x364c
        L_0x363e:
            if (r16 == 0) goto L_0x37e4
            r7 = r16
            X.1Xy r7 = r7.A0C     // Catch:{ all -> 0x3bf2 }
            X.DTw r7 = r7.Aya()     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x37e4
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x3bf2 }
        L_0x364c:
            if (r17 != 0) goto L_0x37e4
            r7 = r162
            boolean r7 = r7.A09     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x365c
            java.lang.Integer r7 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x3bf2 }
            if (r8 == r7) goto L_0x37d5
            java.lang.Integer r7 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x3bf2 }
            if (r8 == r7) goto L_0x37d5
        L_0x365c:
            r7 = r146
            r7.A03(r2)     // Catch:{ all -> 0x3bf2 }
            r7 = r147
            android.widget.TextView r11 = r7.A01     // Catch:{ all -> 0x3bf2 }
            java.lang.String r9 = "Required value was null."
            if (r11 == 0) goto L_0x37c9
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            X.AnonymousClass6MN.A00(r11, r7)     // Catch:{ all -> 0x3bf2 }
            int r7 = r8.intValue()     // Catch:{ all -> 0x3bf2 }
            switch(r7) {
                case 1: goto L_0x3741;
                case 2: goto L_0x36d5;
                case 3: goto L_0x3691;
                case 4: goto L_0x36bb;
                default: goto L_0x3677;
            }     // Catch:{ all -> 0x3bf2 }
        L_0x3677:
            X.W9c r10 = new X.W9c     // Catch:{ all -> 0x3bf2 }
            r7 = r158
            r10.<init>(r3, r7)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r8 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131966127(0x7f1338af, float:1.9569083E38)
            java.lang.String r9 = r8.getString(r7)     // Catch:{ all -> 0x3bf2 }
        L_0x3689:
            X.AnonymousClass0fU.A00(r10, r11)     // Catch:{ all -> 0x3bf2 }
            r11.setText(r9)     // Catch:{ all -> 0x3bf2 }
            goto L_0x37ad
        L_0x3691:
            java.util.List r8 = r3.A0b()     // Catch:{ all -> 0x3bf2 }
            X.3WT r7 = X.AnonymousClass3WT.FUNDRAISER     // Catch:{ all -> 0x3bf2 }
            X.3ui r7 = X.C289745e8.A00(r7, r8)     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x37bd
            X.8YF r7 = r7.A0y     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x37b7
            X.WaN r8 = new X.WaN     // Catch:{ all -> 0x3bf2 }
            r8.<init>(r7)     // Catch:{ all -> 0x3bf2 }
            X.W9z r10 = new X.W9z     // Catch:{ all -> 0x3bf2 }
            r7 = r147
            r9 = r32
            r10.<init>(r4, r8, r7, r9)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r8 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131973528(0x7f135598, float:1.9584094E38)
            java.lang.String r9 = r8.getString(r7)     // Catch:{ all -> 0x3bf2 }
            goto L_0x3689
        L_0x36bb:
            if (r16 == 0) goto L_0x37c3
            r7 = r16
            X.1Xy r7 = r7.A0C     // Catch:{ all -> 0x3bf2 }
            X.DTw r8 = r7.Aya()     // Catch:{ all -> 0x3bf2 }
            if (r8 == 0) goto L_0x37cf
            X.LXZ r10 = new X.LXZ     // Catch:{ all -> 0x3bf2 }
            r9 = r32
            r7 = r158
            r10.<init>(r4, r8, r7, r9)     // Catch:{ all -> 0x3bf2 }
            java.lang.String r9 = r8.Bhv()     // Catch:{ all -> 0x3bf2 }
            goto L_0x3689
        L_0x36d5:
            X.DEH r10 = new X.DEH     // Catch:{ all -> 0x3bf2 }
            r8 = r16
            r7 = r158
            r10.<init>(r8, r7)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r8 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131971405(0x7f134d4d, float:1.9579788E38)
            java.lang.String r9 = r8.getString(r7)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r8 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131238711(0x7f081f37, float:1.8093708E38)
            android.graphics.drawable.Drawable r13 = r8.getDrawable(r7)     // Catch:{ all -> 0x3bf2 }
            if (r13 == 0) goto L_0x373e
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            android.content.res.Resources r8 = r7.getResources()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131165184(0x7f070000, float:1.7944578E38)
            int r7 = r8.getDimensionPixelSize(r7)     // Catch:{ all -> 0x3bf2 }
            r13.setBounds(r2, r2, r7, r7)     // Catch:{ all -> 0x3bf2 }
        L_0x3707:
            r12 = r35
            r11.setCompoundDrawables(r13, r12, r12, r12)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x3bf2 }
            r8 = 2131165207(0x7f070017, float:1.7944625E38)
            int r7 = r7.getDimensionPixelSize(r8)     // Catch:{ all -> 0x3bf2 }
            r11.setCompoundDrawablePadding(r7)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x3bf2 }
            int r12 = r7.getDimensionPixelSize(r8)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            android.content.res.Resources r8 = r7.getResources()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131165737(0x7f070229, float:1.79457E38)
            int r7 = r8.getDimensionPixelSize(r7)     // Catch:{ all -> 0x3bf2 }
            r11.setPaddingRelative(r12, r2, r7, r2)     // Catch:{ all -> 0x3bf2 }
            goto L_0x3689
        L_0x373e:
            r13 = r35
            goto L_0x3707
        L_0x3741:
            X.DEG r10 = new X.DEG     // Catch:{ all -> 0x3bf2 }
            r8 = r16
            r7 = r158
            r10.<init>(r8, r7)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r8 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            r7 = 2131966127(0x7f1338af, float:1.9569083E38)
            java.lang.String r9 = r8.getString(r7)     // Catch:{ all -> 0x3bf2 }
            java.util.List r8 = r3.A0b()     // Catch:{ all -> 0x3bf2 }
            X.3WT r7 = X.AnonymousClass3WT.GROUP_MENTION     // Catch:{ all -> 0x3bf2 }
            X.3ui r13 = X.C289745e8.A00(r7, r8)     // Catch:{ all -> 0x3bf2 }
            if (r13 == 0) goto L_0x3689
            X.0Tu r12 = X.0Tu.A05     // Catch:{ all -> 0x3bf2 }
            r7 = 36317453181392027(0x8106880006149b, double:3.0306418583337934E-306)
            boolean r7 = X.182.A06(r12, r4, r7)     // Catch:{ all -> 0x3bf2 }
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x3689
            X.9m3 r7 = r13.A0C()     // Catch:{ all -> 0x3bf2 }
            if (r7 == 0) goto L_0x3689
            java.util.List r8 = r7.A05     // Catch:{ all -> 0x3bf2 }
            if (r8 == 0) goto L_0x3689
            X.0t1 r7 = X.0eE.A00(r4)     // Catch:{ all -> 0x3bf2 }
            com.instagram.user.model.User r7 = r7.A00()     // Catch:{ all -> 0x3bf2 }
            boolean r7 = r8.contains(r7)     // Catch:{ all -> 0x3bf2 }
            if (r7 != r6) goto L_0x3689
            r13 = r35
            r11.setCompoundDrawables(r13, r13, r13, r13)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x3bf2 }
            r12 = 2131165737(0x7f070229, float:1.79457E38)
            int r8 = r7.getDimensionPixelSize(r12)     // Catch:{ all -> 0x3bf2 }
            android.content.Context r7 = r147.A00()     // Catch:{ all -> 0x3bf2 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ all -> 0x3bf2 }
            int r7 = r7.getDimensionPixelSize(r12)     // Catch:{ all -> 0x3bf2 }
            r11.setPadding(r8, r2, r7, r2)     // Catch:{ all -> 0x3bf2 }
            goto L_0x3689
        L_0x37ad:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x37f5
            r7 = -550026036(0xffffffffdf3744cc, float:-1.3205904E19)
            goto L_0x37f2
        L_0x37b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3bf2 }
            r0.<init>(r9)     // Catch:{ all -> 0x3bf2 }
            goto L_0x37d4
        L_0x37bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3bf2 }
            r0.<init>(r9)     // Catch:{ all -> 0x3bf2 }
            goto L_0x37d4
        L_0x37c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3bf2 }
            r0.<init>(r9)     // Catch:{ all -> 0x3bf2 }
            goto L_0x37d4
        L_0x37c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3bf2 }
            r0.<init>(r9)     // Catch:{ all -> 0x3bf2 }
            goto L_0x37d4
        L_0x37cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3bf2 }
            r0.<init>(r9)     // Catch:{ all -> 0x3bf2 }
        L_0x37d4:
            throw r0     // Catch:{ all -> 0x3bf2 }
        L_0x37d5:
            r7 = r146
            r7.A03(r1)     // Catch:{ all -> 0x3bf2 }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x37f5
            r7 = 286478649(0x11135139, float:1.1621284E-28)
            goto L_0x37f2
        L_0x37e4:
            r7 = r146
            r7.A03(r1)     // Catch:{ all -> 0x3bf2 }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x37f5
            r7 = 518503968(0x1ee7be20, float:2.453671E-20)
        L_0x37f2:
            X.0fS.A00(r7)     // Catch:{ all -> 0x3c0b }
        L_0x37f5:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x3803
            r8 = -542496191(0xffffffffdfaa2a41, float:-2.4523369E19)
            java.lang.String r7 = "ReelItemMentionReshareButtonViewBinder.bindView"
            X.0fS.A01(r7, r8)     // Catch:{ all -> 0x3c0b }
        L_0x3803:
            if (r187 != 0) goto L_0x3851
            if (r16 == 0) goto L_0x3851
            r7 = r16
            X.1Xy r7 = r7.A0C     // Catch:{ all -> 0x3be7 }
            java.lang.Boolean r7 = r7.AkG()     // Catch:{ all -> 0x3be7 }
            if (r7 == 0) goto L_0x3851
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x3be7 }
            if (r7 != r6) goto L_0x3851
            if (r17 != 0) goto L_0x3851
            r7 = r162
            boolean r7 = r7.A09     // Catch:{ all -> 0x3be7 }
            if (r7 != 0) goto L_0x3851
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x3be7 }
            r7 = 36325720993051812(0x810e0d000034a4, double:3.035870455719247E-306)
            boolean r7 = X.182.A06(r9, r4, r7)     // Catch:{ all -> 0x3be7 }
            if (r7 == 0) goto L_0x3851
            android.view.View r8 = r144.getView()     // Catch:{ all -> 0x3be7 }
            r7 = 2131439464(0x7f0b2f68, float:1.8500884E38)
            android.view.View r8 = r8.requireViewById(r7)     // Catch:{ all -> 0x3be7 }
            r7 = r145
            r7.A00 = r8     // Catch:{ all -> 0x3be7 }
            r7 = r144
            r7.setVisibility(r2)     // Catch:{ all -> 0x3be7 }
            r7 = r145
            android.view.View r9 = r7.A00     // Catch:{ all -> 0x3be7 }
            if (r9 == 0) goto L_0x3856
            X.DEI r8 = new X.DEI     // Catch:{ all -> 0x3be7 }
            r7 = r158
            r8.<init>(r3, r7)     // Catch:{ all -> 0x3be7 }
            X.AnonymousClass0fU.A00(r8, r9)     // Catch:{ all -> 0x3be7 }
            goto L_0x3856
        L_0x3851:
            r7 = r144
            r7.setVisibility(r1)     // Catch:{ all -> 0x3be7 }
        L_0x3856:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x3862
            r7 = -1557014047(0xffffffffa331d9e1, float:-9.641327E-18)
            X.0fS.A00(r7)     // Catch:{ all -> 0x3c0b }
        L_0x3862:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x3870
            r8 = -1783712963(0xffffffff95aeb33d, float:-7.056083E-26)
            java.lang.String r7 = "GroupMentionAddButtonViewBinder.bindView"
            X.0fS.A01(r7, r8)     // Catch:{ all -> 0x3c0b }
        L_0x3870:
            java.util.List r8 = r3.A0b()     // Catch:{ all -> 0x3bdc }
            X.3WT r7 = X.AnonymousClass3WT.GROUP_MENTION     // Catch:{ all -> 0x3bdc }
            X.3ui r7 = X.C289745e8.A00(r7, r8)     // Catch:{ all -> 0x3bdc }
            if (r7 == 0) goto L_0x3914
            X.9m3 r9 = r7.A0C()     // Catch:{ all -> 0x3bdc }
            if (r9 == 0) goto L_0x390c
            java.util.List r8 = r9.A05     // Catch:{ all -> 0x3bdc }
            X.0t1 r7 = X.0eE.A00(r4)     // Catch:{ all -> 0x3bdc }
            com.instagram.user.model.User r7 = r7.A00()     // Catch:{ all -> 0x3bdc }
            boolean r7 = r8.contains(r7)     // Catch:{ all -> 0x3bdc }
            if (r7 == 0) goto L_0x3914
            if (r187 != 0) goto L_0x3914
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x3bdc }
            r7 = 36317453180998809(0x81068800001499, double:3.030641858085121E-306)
            boolean r7 = X.182.A06(r10, r4, r7)     // Catch:{ all -> 0x3bdc }
            if (r7 == 0) goto L_0x3914
            r7 = 36317453181392027(0x8106880006149b, double:3.0306418583337934E-306)
            boolean r7 = X.182.A06(r10, r4, r7)     // Catch:{ all -> 0x3bdc }
            if (r7 != 0) goto L_0x3914
            android.view.View r8 = r142.getView()     // Catch:{ all -> 0x3bdc }
            r7 = 2131439447(0x7f0b2f57, float:1.850085E38)
            android.view.View r10 = r8.requireViewById(r7)     // Catch:{ all -> 0x3bdc }
            com.instagram.common.ui.widget.imageview.IgImageView r10 = (com.instagram.common.ui.widget.imageview.IgImageView) r10     // Catch:{ all -> 0x3bdc }
            r7 = r143
            r7.A00 = r10     // Catch:{ all -> 0x3bdc }
            if (r10 == 0) goto L_0x38c9
            X.ANw r8 = new X.ANw     // Catch:{ all -> 0x3bdc }
            r7 = r159
            r8.<init>(r7, r9)     // Catch:{ all -> 0x3bdc }
            X.AnonymousClass0fU.A00(r8, r10)     // Catch:{ all -> 0x3bdc }
        L_0x38c9:
            r7 = r142
            r7.setVisibility(r2)     // Catch:{ all -> 0x3bdc }
            X.1Av r12 = X.1Au.A00(r4)     // Catch:{ all -> 0x3bdc }
            X.0s0 r11 = r12.A3V     // Catch:{ all -> 0x3bdc }
            X.0YZ[] r14 = X.1Av.A8a     // Catch:{ all -> 0x3bdc }
            r13 = 399(0x18f, float:5.59E-43)
            r7 = r14[r13]     // Catch:{ all -> 0x3bdc }
            java.lang.Object r7 = r11.CDM(r12, r7)     // Catch:{ all -> 0x3bdc }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x3bdc }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x3bdc }
            if (r7 != 0) goto L_0x3914
            r7 = r143
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r7.A00     // Catch:{ all -> 0x3bdc }
            if (r10 == 0) goto L_0x3914
            android.view.View r7 = r10.getRootView()     // Catch:{ all -> 0x3bdc }
            if (r7 == 0) goto L_0x3914
            android.view.ViewGroup r7 = X.C49096EpL.A00(r7)     // Catch:{ all -> 0x3bdc }
            if (r7 == 0) goto L_0x3914
            X.Apc r9 = new X.Apc     // Catch:{ all -> 0x3bdc }
            r9.<init>(r7, r4, r10)     // Catch:{ all -> 0x3bdc }
            r7 = 1500(0x5dc, double:7.41E-321)
            r10.postDelayed(r9, r7)     // Catch:{ all -> 0x3bdc }
            r8 = r14[r13]     // Catch:{ all -> 0x3bdc }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x3bdc }
            r11.Epx(r12, r7, r8)     // Catch:{ all -> 0x3bdc }
            goto L_0x3914
        L_0x390c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3bdc }
            r0.<init>(r1)     // Catch:{ all -> 0x3bdc }
            throw r0     // Catch:{ all -> 0x3bdc }
        L_0x3914:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x3920
            r7 = 961935799(0x3955f9b7, float:2.0406289E-4)
            X.0fS.A00(r7)     // Catch:{ all -> 0x3c0b }
        L_0x3920:
            X.6mh r8 = r0.A1Z     // Catch:{ all -> 0x3c0b }
            X.0qQ.A0B(r8, r2)     // Catch:{ all -> 0x3c0b }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r7 == 0) goto L_0x3933
            r9 = 684205204(0x28c82494, float:2.2220324E-14)
            java.lang.String r7 = "ReelIdentifierViewBinder.bindView"
            X.0fS.A01(r7, r9)     // Catch:{ all -> 0x3c0b }
        L_0x3933:
            if (r189 == 0) goto L_0x3a22
            r7 = r163
            boolean r7 = r7.A0E(r4)     // Catch:{ all -> 0x3bd1 }
            if (r7 != 0) goto L_0x3a22
            r7 = r163
            java.util.List r7 = r7.A05     // Catch:{ all -> 0x3bd1 }
            if (r7 == 0) goto L_0x3958
            java.util.List r7 = X.00k.A0a(r7)     // Catch:{ all -> 0x3bd1 }
        L_0x3947:
            int r7 = r7.size()     // Catch:{ all -> 0x3bd1 }
            if (r7 > r6) goto L_0x3975
            boolean r6 = r5.A0i()     // Catch:{ all -> 0x3bd1 }
            if (r6 != 0) goto L_0x3975
            X.1Ns r9 = r5.A0W     // Catch:{ all -> 0x3bd1 }
            if (r9 != 0) goto L_0x395d
            goto L_0x395b
        L_0x3958:
            X.0sn r7 = X.0sn.A00     // Catch:{ all -> 0x3bd1 }
            goto L_0x3947
        L_0x395b:
            r7 = 0
            goto L_0x3961
        L_0x395d:
            java.lang.Integer r7 = r9.CAm()     // Catch:{ all -> 0x3bd1 }
        L_0x3961:
            java.lang.Integer r6 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x3bd1 }
            if (r7 == r6) goto L_0x3975
            if (r9 != 0) goto L_0x3969
            r7 = 0
            goto L_0x396d
        L_0x3969:
            java.lang.Integer r7 = r9.CAm()     // Catch:{ all -> 0x3bd1 }
        L_0x396d:
            java.lang.Integer r6 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x3bd1 }
            if (r7 == r6) goto L_0x3975
            boolean r6 = r5.A1O     // Catch:{ all -> 0x3bd1 }
            if (r6 == 0) goto L_0x3a22
        L_0x3975:
            X.TtX r7 = r8.A02     // Catch:{ all -> 0x3bd1 }
            if (r7 != 0) goto L_0x3989
            X.2eb r6 = r8.A01     // Catch:{ all -> 0x3bd1 }
            android.view.View r6 = r6.A01()     // Catch:{ all -> 0x3bd1 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x3bd1 }
            X.TtX r7 = new X.TtX     // Catch:{ all -> 0x3bd1 }
            r7.<init>(r6)     // Catch:{ all -> 0x3bd1 }
            r8.A02 = r7     // Catch:{ all -> 0x3bd1 }
        L_0x3989:
            boolean r6 = r7.A01     // Catch:{ all -> 0x3bd1 }
            if (r6 != 0) goto L_0x3a22
            X.2eb r1 = r8.A01     // Catch:{ all -> 0x3bd1 }
            r1.A03(r2)     // Catch:{ all -> 0x3bd1 }
            android.view.View r6 = r1.A01()     // Catch:{ all -> 0x3bd1 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r1)     // Catch:{ all -> 0x3bd1 }
            boolean r1 = r5.A0i()     // Catch:{ all -> 0x3bd1 }
            r7 = 0
            if (r1 != 0) goto L_0x39f9
            X.1Ns r9 = r5.A0W     // Catch:{ all -> 0x3bd1 }
            if (r9 != 0) goto L_0x39a8
            r6 = 0
            goto L_0x39ac
        L_0x39a8:
            java.lang.Integer r6 = r9.CAm()     // Catch:{ all -> 0x3bd1 }
        L_0x39ac:
            java.lang.Integer r1 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x3bd1 }
            if (r6 == r1) goto L_0x39f9
            if (r9 != 0) goto L_0x39b4
            r6 = 0
            goto L_0x39b8
        L_0x39b4:
            java.lang.Integer r6 = r9.CAm()     // Catch:{ all -> 0x3bd1 }
        L_0x39b8:
            java.lang.Integer r1 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x3bd1 }
            if (r6 == r1) goto L_0x39f9
            boolean r1 = r5.A1O     // Catch:{ all -> 0x3bd1 }
            if (r1 == 0) goto L_0x39d6
            android.widget.TextView r6 = r8.A00     // Catch:{ all -> 0x3bd1 }
            if (r6 != 0) goto L_0x39fc
            X.2eb r1 = r8.A01     // Catch:{ all -> 0x3bd1 }
            android.view.View r6 = r1.A01()     // Catch:{ all -> 0x3bd1 }
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r6, r1)     // Catch:{ all -> 0x3bd1 }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x3bd1 }
            r8.A00 = r6     // Catch:{ all -> 0x3bd1 }
            if (r6 == 0) goto L_0x3a09
            goto L_0x39fc
        L_0x39d6:
            android.widget.TextView r6 = r8.A00     // Catch:{ all -> 0x3bd1 }
            if (r6 != 0) goto L_0x39eb
            X.2eb r1 = r8.A01     // Catch:{ all -> 0x3bd1 }
            android.view.View r6 = r1.A01()     // Catch:{ all -> 0x3bd1 }
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r6, r1)     // Catch:{ all -> 0x3bd1 }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x3bd1 }
            r8.A00 = r6     // Catch:{ all -> 0x3bd1 }
            if (r6 == 0) goto L_0x3a09
        L_0x39eb:
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x3bd1 }
            if (r6 == 0) goto L_0x3a09
            r1 = 2131974443(0x7f13592b, float:1.958595E38)
            java.lang.String r7 = r6.getString(r1)     // Catch:{ all -> 0x3bd1 }
            goto L_0x3a09
        L_0x39f9:
            java.lang.String r7 = r5.A0r     // Catch:{ all -> 0x3bd1 }
            goto L_0x3a09
        L_0x39fc:
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x3bd1 }
            if (r6 == 0) goto L_0x3a09
            r1 = 2131971354(0x7f134d1a, float:1.9579685E38)
            java.lang.String r7 = r6.getString(r1)     // Catch:{ all -> 0x3bd1 }
        L_0x3a09:
            android.widget.TextView r6 = r8.A00     // Catch:{ all -> 0x3bd1 }
            if (r6 != 0) goto L_0x3a1e
            X.2eb r1 = r8.A01     // Catch:{ all -> 0x3bd1 }
            android.view.View r6 = r1.A01()     // Catch:{ all -> 0x3bd1 }
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r6, r1)     // Catch:{ all -> 0x3bd1 }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x3bd1 }
            r8.A00 = r6     // Catch:{ all -> 0x3bd1 }
            if (r6 == 0) goto L_0x3a27
        L_0x3a1e:
            r6.setText(r7)     // Catch:{ all -> 0x3bd1 }
            goto L_0x3a27
        L_0x3a22:
            X.2eb r6 = r8.A01     // Catch:{ all -> 0x3bd1 }
            r6.A03(r1)     // Catch:{ all -> 0x3bd1 }
        L_0x3a27:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r1 == 0) goto L_0x3a33
            r1 = 1718506142(0x666e529e, float:2.8136181E23)
            X.0fS.A00(r1)     // Catch:{ all -> 0x3c0b }
        L_0x3a33:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r1 == 0) goto L_0x3a41
            r6 = -190340563(0xfffffffff4a7a22d, float:-1.0625035E32)
            java.lang.String r1 = "ReelItemShareToFriendsStoryProducerLikesViewBinder.bindView"
            X.0fS.A01(r1, r6)     // Catch:{ all -> 0x3c0b }
        L_0x3a41:
            java.util.List r6 = r3.A0b()     // Catch:{ all -> 0x3bc6 }
            X.3WT r1 = X.AnonymousClass3WT.PHOTO_CRED_STICKER     // Catch:{ all -> 0x3bc6 }
            X.3ui r1 = X.C289745e8.A00(r1, r6)     // Catch:{ all -> 0x3bc6 }
            if (r1 == 0) goto L_0x3aa8
            X.BFl r6 = r1.A0L     // Catch:{ all -> 0x3bc6 }
            if (r6 != 0) goto L_0x3a5b
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r1 == 0) goto L_0x3ab4
            r1 = 416512728(0x18d37ad8, float:5.4666262E-24)
            goto L_0x3ab1
        L_0x3a5b:
            com.instagram.user.model.User r1 = r6.A00     // Catch:{ all -> 0x3bc6 }
            if (r1 == 0) goto L_0x3a62
            r1.Bh3()     // Catch:{ all -> 0x3bc6 }
        L_0x3a62:
            com.instagram.user.model.User r1 = r6.A00     // Catch:{ all -> 0x3bc6 }
            if (r1 == 0) goto L_0x3aa5
            java.lang.String r9 = r1.getUsername()     // Catch:{ all -> 0x3bc6 }
        L_0x3a6a:
            r1 = r141
            X.0eM r1 = r1.A01     // Catch:{ all -> 0x3bc6 }
            java.lang.Object r8 = r1.getValue()     // Catch:{ all -> 0x3bc6 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x3bc6 }
            com.instagram.common.ui.base.IgTextView r8 = (com.instagram.common.ui.base.IgTextView) r8     // Catch:{ all -> 0x3bc6 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x3bc6 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x3bc6 }
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1     // Catch:{ all -> 0x3bc6 }
            android.content.Context r7 = r1.getContext()     // Catch:{ all -> 0x3bc6 }
            r6 = 2131973585(0x7f1355d1, float:1.958421E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x3bc6 }
            java.lang.String r1 = r7.getString(r6, r1)     // Catch:{ all -> 0x3bc6 }
            r8.setText(r1)     // Catch:{ all -> 0x3bc6 }
            X.0Tu r1 = X.0Tu.A05     // Catch:{ all -> 0x3bc6 }
            r6 = 36321675134445187(0x810a5f00092683, double:3.033311838445052E-306)
            boolean r1 = X.182.A06(r1, r4, r6)     // Catch:{ all -> 0x3bc6 }
            if (r1 == 0) goto L_0x3aa8
            r1 = r140
            r1.setVisibility(r2)     // Catch:{ all -> 0x3bc6 }
            goto L_0x3aa8
        L_0x3aa5:
            java.lang.String r9 = ""
            goto L_0x3a6a
        L_0x3aa8:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r1 == 0) goto L_0x3ab4
            r1 = 1864865704(0x6f2797a8, float:5.186734E28)
        L_0x3ab1:
            X.0fS.A00(r1)     // Catch:{ all -> 0x3c0b }
        L_0x3ab4:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)
            if (r1 == 0) goto L_0x3ac0
            r1 = 1299171319(0x4d6fc7f7, float:2.5142872E8)
            X.0fS.A00(r1)
        L_0x3ac0:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)
            if (r1 == 0) goto L_0x3ace
            r6 = -1393109136(0xffffffffacf6d770, float:-7.015659E-12)
            java.lang.String r1 = "ReelViewerItemBinder.bindSuggestedHighlight"
            X.0fS.A01(r1, r6)
        L_0x3ace:
            com.instagram.model.reels.ReelType r6 = r5.A0P     // Catch:{ all -> 0x3bba }
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A0J     // Catch:{ all -> 0x3bba }
            if (r6 != r1) goto L_0x3aef
            X.6mT r7 = r0.A1G     // Catch:{ all -> 0x3bba }
            r6 = r163
            r1 = r158
            X.AnonymousClass6YB.A00(r6, r7, r1)     // Catch:{ all -> 0x3bba }
            X.6mU r1 = r0.A1C     // Catch:{ all -> 0x3bba }
            r6 = r154
            r7 = r121
            r8 = r3
            r9 = r163
            r10 = r161
            r11 = r1
            r12 = r158
            X.AnonymousClass6YC.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3bba }
            goto L_0x3b46
        L_0x3aef:
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A0D     // Catch:{ all -> 0x3bba }
            if (r6 != r1) goto L_0x3b0e
            X.6mT r7 = r0.A1F     // Catch:{ all -> 0x3bba }
            r6 = r163
            r1 = r158
            X.AnonymousClass6YB.A00(r6, r7, r1)     // Catch:{ all -> 0x3bba }
            X.6mU r1 = r0.A1B     // Catch:{ all -> 0x3bba }
            r6 = r35
            r7 = r121
            r8 = r3
            r9 = r163
            r10 = r161
            r11 = r1
            r12 = r158
            X.AnonymousClass6YC.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3bba }
            goto L_0x3b46
        L_0x3b0e:
            boolean r1 = r5.A0t()     // Catch:{ all -> 0x3bba }
            if (r1 == 0) goto L_0x3b2c
            X.3BQ r6 = r0.A0A     // Catch:{ all -> 0x3bba }
            X.3BQ r1 = X.AnonymousClass3BQ.SUPERLATIVE_FROM_SEE_YOURS     // Catch:{ all -> 0x3bba }
            if (r6 != r1) goto L_0x3b2c
            X.6mU r1 = r0.A1E     // Catch:{ all -> 0x3bba }
            r6 = r35
            r7 = r121
            r8 = r3
            r9 = r163
            r10 = r161
            r11 = r1
            r12 = r158
            X.AnonymousClass6YC.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3bba }
            goto L_0x3b46
        L_0x3b2c:
            X.6mT r7 = r0.A1H     // Catch:{ all -> 0x3bba }
            r6 = r163
            r1 = r158
            X.AnonymousClass6YB.A00(r6, r7, r1)     // Catch:{ all -> 0x3bba }
            X.6mU r1 = r0.A1D     // Catch:{ all -> 0x3bba }
            r6 = r35
            r7 = r121
            r8 = r3
            r9 = r163
            r10 = r161
            r11 = r1
            r12 = r158
            X.AnonymousClass6YC.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x3bba }
        L_0x3b46:
            boolean r1 = com.facebook.systrace.Systrace.A0E(r33)
            if (r1 == 0) goto L_0x3b52
            r1 = -60677400(0xfffffffffc6222e8, float:-4.6966683E36)
            X.0fS.A00(r1)
        L_0x3b52:
            X.0Tu r1 = X.0Tu.A05
            r6 = 36322847659928100(0x810b7000002a24, double:3.0340533482818275E-306)
            boolean r1 = X.182.A06(r1, r4, r6)
            if (r1 == 0) goto L_0x3bb9
            X.0sn r6 = X.0sn.A00
            java.lang.String r22 = ""
            X.0qQ.A0B(r6, r2)
            X.6d8 r1 = new X.6d8
            r7 = r1
            r8 = r10
            r9 = r35
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r23 = r9
            r24 = r9
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r36 = r9
            r37 = r9
            r38 = r9
            r39 = r6
            r40 = r6
            r41 = r9
            r42 = r9
            r43 = r9
            r44 = r2
            r45 = r2
            r46 = r2
            r47 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            android.view.View r0 = r0.itemView
            X.0qQ.A06(r0)
            X.C70340O2s.A00(r0, r4, r5, r3, r1)
        L_0x3bb9:
            return
        L_0x3bba:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 1359154871(0x51030eb7, float:3.5180474E10)
            goto L_0x3cf7
        L_0x3bc6:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r0 == 0) goto L_0x3c0a
            r0 = -1885431051(0xffffffff8f9e9af5, float:-1.563969E-29)
            goto L_0x3c07
        L_0x3bd1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r0 == 0) goto L_0x3c0a
            r0 = 1771936588(0x699d9b4c, float:2.381684E25)
            goto L_0x3c07
        L_0x3bdc:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r0 == 0) goto L_0x3c0a
            r0 = -1269915865(0xffffffffb44e9f27, float:-1.9243144E-7)
            goto L_0x3c07
        L_0x3be7:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r0 == 0) goto L_0x3c0a
            r0 = -2055380508(0xffffffff857d61e4, float:-1.19139825E-35)
            goto L_0x3c07
        L_0x3bf2:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r0 == 0) goto L_0x3c0a
            r0 = -444234543(0xffffffffe58584d1, float:-7.88156E22)
            goto L_0x3c07
        L_0x3bfd:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3c0b }
            if (r0 == 0) goto L_0x3c0a
            r0 = -641319120(0xffffffffd9c63f30, float:-6.9751901E15)
        L_0x3c07:
            X.0fS.A00(r0)     // Catch:{ all -> 0x3c0b }
        L_0x3c0a:
            throw r1     // Catch:{ all -> 0x3c0b }
        L_0x3c0b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 1220408982(0x48bdf696, float:389044.7)
            goto L_0x3cf7
        L_0x3c17:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 1404456698(0x53b64efa, float:1.56601811E12)
            goto L_0x3cf7
        L_0x3c23:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 1167018743(0x458f4af7, float:4585.3706)
            goto L_0x3cf7
        L_0x3c2f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c37 }
            r0.<init>(r1)     // Catch:{ all -> 0x3c37 }
            throw r0     // Catch:{ all -> 0x3c37 }
        L_0x3c37:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = -1890170550(0xffffffff8f56494a, float:-1.05651296E-29)
            goto L_0x3cf7
        L_0x3c43:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r0 == 0) goto L_0x3cb5
            r0 = -1784857409(0xffffffff959d3cbf, float:-6.3507635E-26)
            goto L_0x3cab
        L_0x3c4e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r0 == 0) goto L_0x3cb5
            r0 = 554833838(0x211217ae, float:4.9498064E-19)
            goto L_0x3cab
        L_0x3c59:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r0 == 0) goto L_0x3cb5
            r0 = 690881657(0x292e0479, float:3.863964E-14)
            goto L_0x3cab
        L_0x3c64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x3c6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
            goto L_0x3c75
        L_0x3c70:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x3c76 }
            r0.<init>(r11)     // Catch:{ all -> 0x3c76 }
        L_0x3c75:
            throw r0     // Catch:{ all -> 0x3c76 }
        L_0x3c76:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r0 == 0) goto L_0x3cb5
            r0 = -1607250729(0xffffffffa0334cd7, float:-1.5187314E-19)
            goto L_0x3cab
        L_0x3c81:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x3caf }
        L_0x3c83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x3ca0
        L_0x3c89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x3ca0
        L_0x3c8f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x3ca0
        L_0x3c95:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
            goto L_0x3ca0
        L_0x3c9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x3ca1 }
            r0.<init>(r8)     // Catch:{ all -> 0x3ca1 }
        L_0x3ca0:
            throw r0     // Catch:{ all -> 0x3ca1 }
        L_0x3ca1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)     // Catch:{ all -> 0x3cb6 }
            if (r0 == 0) goto L_0x3cb5
            r0 = 1471869501(0x57baf23d, float:4.11099137E14)
        L_0x3cab:
            X.0fS.A00(r0)     // Catch:{ all -> 0x3cb6 }
            goto L_0x3cb5
        L_0x3caf:
            r1 = move-exception
            r0 = r21
            X.1zE.A00(r0, r2)     // Catch:{ all -> 0x3cb6 }
        L_0x3cb5:
            throw r1     // Catch:{ all -> 0x3cb6 }
        L_0x3cb6:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = -961878404(0xffffffffc6aae67c, float:-21875.242)
            goto L_0x3cf7
        L_0x3cc1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 234889896(0xe0022a8, float:1.5793904E-30)
            goto L_0x3cf7
        L_0x3ccc:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 1641615833(0x61d911d9, float:5.005287E20)
            goto L_0x3cf7
        L_0x3cd7:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 400174689(0x17da2e61, float:1.4099627E-24)
            goto L_0x3cf7
        L_0x3ce2:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = -330565506(0xffffffffec4bf87e, float:-9.8634165E26)
            goto L_0x3cf7
        L_0x3ced:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r33)
            if (r0 == 0) goto L_0x3cfa
            r0 = 345351655(0x1495a5e7, float:1.5110592E-26)
        L_0x3cf7:
            X.0fS.A00(r0)
        L_0x3cfa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315686kL.A02(X.0iw, X.2nJ, com.instagram.common.session.UserSession, X.3uh, X.3mM, com.instagram.model.reels.ReelViewerConfig, X.3BQ, X.2qi, X.2qT, X.6aI, X.6Yf, X.6nT, X.6mk, X.6kx, X.6n1, X.6a7, X.6a9, java.lang.String, float, int, int, int, boolean, boolean, boolean):void");
    }
}
