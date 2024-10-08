package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6Nt  reason: invalid class name and case insensitive filesystem */
public final class C306846Nt {
    public static C21338XXf A00;
    public static final C306846Nt A01 = new Object();
    public static final int[] A02 = {R.color.netego_background_gradient_end, R.color.cyan_5, R.color.netego_su_background_gradient_end_2, R.color.cyan_5, R.color.netego_su_background_gradient_end_4, R.color.netego_su_background_gradient_end_4, R.color.netego_su_background_gradient_end_6};
    public static final int[] A03 = {R.color.netego_background_gradient_start, R.color.netego_su_background_gradient_start_1, R.color.netego_su_background_gradient_start_2, R.color.netego_su_background_gradient_end_6, R.color.netego_su_background_gradient_start_4, R.color.netego_su_background_gradient_start_1, R.color.netego_su_background_gradient_start_4};

    public static final int A00(C309426Yf r2, String str, int i) {
        if (r2 == null || !r2.A11) {
            return i;
        }
        Number number = (Number) r2.A1C.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public static final void A02(C309426Yf r2, C306866Nv r3, User user) {
        int A0H;
        0qQ.A0B(r3, 0);
        FollowButton followButton = r3.A0E;
        followButton.setCustomForegroundColor(-1);
        followButton.A09 = false;
        if (r2.A13) {
            followButton.setPrismStyle(C267034aq.SECONDAY_ALWAYS_LIGHT_AVOID_USING);
            FollowStatus B6o = user.B6o();
            FollowStatus followStatus = FollowStatus.A06;
            Context context = followButton.getContext();
            0qQ.A07(context);
            if (B6o == followStatus) {
                A0H = 1QE.A06(context, 1QE.A0E());
            } else {
                A0H = 1QE.A08(context, 1QE.A0E());
            }
        } else if (user.B6o() == FollowStatus.A06) {
            Context context2 = followButton.getContext();
            0qQ.A07(context2);
            A0H = 1QE.A03(context2);
        } else {
            A0H = 2Yu.A0H(followButton.getContext(), R.attr.igds_color_secondary_text);
        }
        followButton.setCustomForegroundColor(A0H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0301, code lost:
        if (r14 == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        if (r6.isEmpty() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        if (r4 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.animation.Animation r56, X.AnonymousClass0iw r57, com.instagram.common.session.UserSession r58, X.C255773uh r59, X.C250973mM r60, X.C306886Nx r61, X.C309426Yf r62, X.C317286n1 r63, X.C306866Nv r64, X.AnonymousClass6N0 r65, int r66, boolean r67) {
        /*
            r36 = r61
            com.instagram.user.model.User r17 = X.C306906Nz.A00(r36)
            r12 = r36
            X.6Nw r12 = (X.C306876Nw) r12
            X.3Oo r0 = r12.A01
            if (r0 == 0) goto L_0x0347
            java.lang.String r2 = r0.getUrl()
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r2, r1, r0)
        L_0x001f:
            r54 = r65
            r0 = r54
            boolean r11 = r0.A0B
            boolean r6 = r0.A0C
            int r0 = r0.A00
            r43 = r0
            r3 = r62
            boolean r4 = r3.A10
            r2 = r64
            android.view.View r0 = r2.A05
            r53 = r0
            int r0 = r53.getVisibility()
            r15 = 4
            r1 = 0
            if (r0 != r15) goto L_0x004d
            boolean r0 = r3.A11
            if (r0 == 0) goto L_0x004d
            r0 = r53
            r0.setVisibility(r1)
            java.lang.String r0 = r17.getId()
            X.C306896Ny.A04(r0)
        L_0x004d:
            r55 = r57
            if (r6 == 0) goto L_0x033f
            if (r5 == 0) goto L_0x033f
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = r2.A0D
        L_0x0055:
            r0 = r55
            r6.setUrl(r5, r0)
            android.widget.TextView r7 = r2.A09
            java.lang.String r0 = r12.A0D
            r7.setText(r0)
            java.util.List r6 = r12.A0I
            android.widget.LinearLayout r9 = r2.A07
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()
            if (r4 == 0) goto L_0x033b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
        L_0x006d:
            X.0qQ.A0C(r5, r0)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            if (r6 == 0) goto L_0x007b
            boolean r8 = r6.isEmpty()
            r0 = 0
            if (r8 == 0) goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            r10 = r0 ^ 1
            android.content.Context r0 = r9.getContext()
            r13 = 8
            if (r10 == 0) goto L_0x0305
            if (r6 == 0) goto L_0x0305
            boolean r14 = X.0mk.A02(r0)
            boolean r9 = r3.A0y
            com.instagram.common.ui.base.IgSimpleImageView r8 = r2.A0C
            X.0qQ.A0A(r0)
            java.lang.String r28 = r55.getModuleName()
            if (r9 == 0) goto L_0x00a4
            if (r14 != 0) goto L_0x00a4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r6)
            java.util.List r6 = X.00k.A0Y(r10)
        L_0x00a4:
            r10 = 18
            float r10 = X.0nA.A04(r0, r10)
            int r10 = (int) r10
            if (r9 == 0) goto L_0x02fb
            if (r14 != 0) goto L_0x02fb
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
        L_0x00b1:
            r31 = 0
        L_0x00b3:
            r9 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r20 = java.lang.Float.valueOf(r9)
            r19 = 0
            r9 = 1056964608(0x3f000000, float:0.5)
            float r9 = X.0nA.A00(r0, r9)
            int r9 = (int) r9
            java.lang.Integer r23 = java.lang.Integer.valueOf(r9)
            r9 = 2131100036(0x7f060184, float:1.7812442E38)
            int r9 = r0.getColor(r9)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r9)
            r32 = 1
            r22 = r19
            r24 = r19
            r26 = r19
            r27 = r19
            r29 = r6
            r30 = r10
            r33 = r1
            r34 = r32
            r35 = r1
            r18 = r0
            X.3b0 r6 = X.C244283aw.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r8.setImageDrawable(r6)
            r8.setVisibility(r1)
            if (r4 == 0) goto L_0x00f8
            r6 = 5
            r7.setTextAlignment(r6)
        L_0x00f8:
            r8 = 0
            if (r4 == 0) goto L_0x0319
        L_0x00fb:
            android.view.ViewTreeObserver r6 = r7.getViewTreeObserver()
            X.FPh r5 = new X.FPh
            r5.<init>(r0, r2)
            r6.addOnGlobalLayoutListener(r5)
        L_0x0107:
            java.lang.String r49 = r17.getFullName()
            if (r49 != 0) goto L_0x010f
            java.lang.String r49 = ""
        L_0x010f:
            java.lang.String r16 = r17.getUsername()
            int r5 = r49.length()
            r52 = 0
            r6 = r16
            if (r5 <= 0) goto L_0x0121
            r52 = 1
            r6 = r49
        L_0x0121:
            android.widget.TextView r5 = r2.A0A
            r18 = r5
            r5.setText(r6)
            if (r52 == 0) goto L_0x02e9
            if (r11 == 0) goto L_0x02e9
            android.widget.TextView r6 = r2.A08
            r5 = r16
            r6.setText(r5)
            r6.setVisibility(r1)
        L_0x0136:
            com.instagram.user.follow.FollowButton r7 = r2.A0E
            r11 = 1
            r7.A0A = r11
            r5 = r17
            A02(r3, r2, r5)
            X.4at r10 = r7.A0J
            java.lang.String r5 = "su_stories_confirmation_dialog"
            r10.A0H = r5
            X.0xF r9 = new X.0xF
            r9.<init>()
            java.lang.String r6 = r17.getId()
            r19 = r66
            r5 = r19
            int r51 = A00(r3, r6, r5)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r51)
            java.lang.String r5 = "position"
            X.0xF.A00(r9, r14, r5)
            X.6O0 r5 = new X.6O0
            r30 = r56
            r20 = r58
            r34 = r59
            r35 = r60
            r38 = r63
            r29 = r5
            r31 = r55
            r32 = r9
            r33 = r20
            r37 = r3
            r39 = r2
            r40 = r10
            r41 = r17
            r42 = r19
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r10.A00 = r5
            r9 = r55
            r6 = r17
            r5 = r20
            r10.A03(r9, r5, r6)
            java.lang.String r6 = r12.A09
            java.lang.String r9 = r12.A0E
            X.0qQ.A0B(r6, r11)
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r5.put(r1, r14)
            r5.put(r11, r6)
            if (r9 != 0) goto L_0x01a2
            java.lang.String r9 = ""
        L_0x01a2:
            r6 = 2
            r5.put(r6, r9)
            android.view.View r9 = r2.A06
            r9.setVisibility(r1)
            X.6O1 r6 = new X.6O1
            r39 = r6
            r40 = r5
            r41 = r30
            r42 = r55
            r43 = r20
            r44 = r34
            r45 = r36
            r46 = r38
            r47 = r2
            r48 = r17
            r50 = r16
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            X.AnonymousClass0fU.A00(r6, r9)
            if (r4 != 0) goto L_0x02b3
            if (r67 == 0) goto L_0x02ac
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L_0x01cf:
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            android.content.Context r5 = r7.getContext()
            X.0qQ.A07(r5)
            int r5 = X.0nA.A09(r5)
            double r5 = (double) r5
            double r5 = r5 * r10
            int r8 = (int) r5
            r9.width = r8
        L_0x01e3:
            java.lang.String r6 = r17.getId()
            r5 = r20
            X.C267154b3.A02(r7, r5, r6)
            if (r4 == 0) goto L_0x0281
            X.0qQ.A0A(r0)
            r4 = 2131100036(0x7f060184, float:1.7812442E38)
            int r5 = r0.getColor(r4)
            r4 = r53
            r4.setBackgroundColor(r5)
            r4 = 2130970335(0x7f0406df, float:1.7549377E38)
            int r4 = X.2Yu.A0H(r0, r4)
            int r5 = r0.getColor(r4)
            r4 = r18
            r4.setTextColor(r5)
            boolean r4 = r3.A13
            if (r4 == 0) goto L_0x028a
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            r4 = 32
            float r4 = X.0nA.A04(r0, r4)
            int r4 = (int) r4
            r5.height = r4
            android.view.View r4 = r2.A04
            if (r4 == 0) goto L_0x0225
            r4.setVisibility(r1)
        L_0x0225:
            android.view.View r4 = r2.A02
            if (r4 == 0) goto L_0x022c
            r4.setVisibility(r13)
        L_0x022c:
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r5, r4)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r4 = 3
            float r4 = X.0nA.A04(r0, r4)
            int r4 = (int) r4
            r5.bottomMargin = r4
        L_0x023f:
            boolean r4 = r3.A11
            if (r4 == 0) goto L_0x0282
            boolean r4 = r3.A10
            int[] r4 = X.C306856Nu.A00(r4)
            int r6 = r4.length
            com.instagram.common.ui.base.IgSimpleImageView r5 = r2.A0B
            if (r5 == 0) goto L_0x0251
            r5.setVisibility(r1)
        L_0x0251:
            r1 = 14
            float r1 = X.0nA.A04(r0, r1)
            int r4 = (int) r1
            r1 = 10
            float r0 = X.0nA.A04(r0, r1)
            int r0 = (int) r0
            if (r5 == 0) goto L_0x0281
            r5.setPadding(r4, r0, r0, r4)
            X.FOc r0 = new X.FOc
            r7 = r0
            r8 = r30
            r9 = r55
            r10 = r20
            r11 = r34
            r12 = r35
            r13 = r3
            r14 = r38
            r15 = r2
            r16 = r54
            r17 = r19
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x0281:
            return
        L_0x0282:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.A0B
            if (r0 == 0) goto L_0x0281
            r0.setVisibility(r15)
            return
        L_0x028a:
            android.view.View r4 = r2.A04
            if (r4 == 0) goto L_0x0291
            r4.setVisibility(r13)
        L_0x0291:
            android.view.View r4 = r2.A02
            if (r4 == 0) goto L_0x0298
            r4.setVisibility(r1)
        L_0x0298:
            android.view.View r4 = r2.A03
            if (r4 == 0) goto L_0x02aa
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
        L_0x02a0:
            java.lang.String r4 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r5, r4)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r5.topMargin = r1
            goto L_0x023f
        L_0x02aa:
            r5 = 0
            goto L_0x02a0
        L_0x02ac:
            r10 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            goto L_0x01cf
        L_0x02b3:
            X.0qQ.A0A(r0)
            r5 = 16
            float r5 = X.0nA.A04(r0, r5)
            int r6 = (int) r5
            boolean r5 = r3.A13
            if (r5 == 0) goto L_0x02d9
            android.view.View r5 = r2.A04
            if (r5 == 0) goto L_0x02c9
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
        L_0x02c9:
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            if (r8 == 0) goto L_0x01e3
            r5 = 10
            float r5 = X.0nA.A04(r0, r5)
            int r5 = (int) r5
            r8.setMargins(r6, r1, r6, r5)
            goto L_0x01e3
        L_0x02d9:
            r7.setPadding(r1, r1, r1, r1)
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            if (r5 == 0) goto L_0x01e3
            r5.setMargins(r6, r1, r6, r1)
            goto L_0x01e3
        L_0x02e9:
            if (r4 == 0) goto L_0x02f4
            if (r11 == 0) goto L_0x02f4
            android.widget.TextView r5 = r2.A08
            r5.setVisibility(r15)
            goto L_0x0136
        L_0x02f4:
            android.widget.TextView r5 = r2.A08
            r5.setVisibility(r13)
            goto L_0x0136
        L_0x02fb:
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            if (r9 == 0) goto L_0x00b1
            r31 = 1
            if (r14 != 0) goto L_0x00b3
            goto L_0x00b1
        L_0x0305:
            com.instagram.common.ui.base.IgSimpleImageView r9 = r2.A0C
            r9.setVisibility(r13)
            r8 = 0
            r9.setImageDrawable(r8)
            if (r4 == 0) goto L_0x0315
            r7.setTextAlignment(r15)
            goto L_0x00fb
        L_0x0315:
            if (r10 == 0) goto L_0x032a
            if (r6 == 0) goto L_0x032a
        L_0x0319:
            android.content.res.Resources r7 = r0.getResources()
            r6 = 2131165190(0x7f070006, float:1.794459E38)
            float r6 = r7.getDimension(r6)
            int r6 = (int) r6
            r5.setMargins(r1, r6, r1, r1)
            goto L_0x0107
        L_0x032a:
            android.content.res.Resources r7 = r0.getResources()
            r6 = 2131165200(0x7f070010, float:1.794461E38)
            float r6 = r7.getDimension(r6)
            int r6 = (int) r6
            r5.setMargins(r1, r6, r1, r1)
            goto L_0x0107
        L_0x033b:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            goto L_0x006d
        L_0x033f:
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = r2.A0D
            com.instagram.common.typedurl.ImageUrl r5 = r17.Bh3()
            goto L_0x0055
        L_0x0347:
            r5 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306846Nt.A01(android.view.animation.Animation, X.0iw, com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6Nx, X.6Yf, X.6n1, X.6Nv, X.6N0, int, boolean):void");
    }

    public final void A04(C250973mM r33, AnonymousClass6N0 r34, boolean z) {
        C317286n1 r11;
        int length;
        AnonymousClass6N0 r10 = r34;
        C255773uh r9 = r10.A08;
        if (r9 != null) {
            C270074g9 r7 = r9.A09;
            if (r7 != null) {
                List A012 = r7.A01();
                int size = A012.size();
                C306866Nv[] A04 = r10.A04();
                C309426Yf r4 = r10.A09;
                if (r4 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (r4.A11 || size >= (length = A04.length)) {
                    UserSession userSession = r10.A06;
                    if (userSession != null) {
                        AnonymousClass0iw r0 = r10.A05;
                        AnonymousClass0iw r16 = r0;
                        if (r0 != null) {
                            C250973mM r19 = r33;
                            if (z) {
                                String moduleName = r16.getModuleName();
                                boolean z2 = r4.A11;
                                0qQ.A0B(moduleName, 1);
                                C306896Ny.A01(new 0xG(moduleName), userSession, r7, z2);
                                if (!z2) {
                                    C306896Ny.A02 = System.currentTimeMillis();
                                }
                                if (!(r33 == null || r19.A0H.A0P != ReelType.A0I || (r11 = r10.A0A) == null)) {
                                    r11.Ckc(r19, "tap", "ess_su_card_shuffle", r4.A0B, r4.A0A, r10.A00);
                                }
                            }
                            int i = r4.A0M;
                            int size2 = A012.size();
                            int length2 = A04.length;
                            int min = Math.min(size2, length2);
                            C306896Ny.A01 = i;
                            C306896Ny.A00 = min;
                            for (int i2 = 0; i2 < length2; i2++) {
                                C306866Nv r14 = A04[i2];
                                if (A012.size() <= i2) {
                                    r14.A05.setVisibility(4);
                                } else {
                                    int i3 = (i2 + i) % size;
                                    C306886Nx r1 = (C306886Nx) A012.get(i3);
                                    C317286n1 r20 = r10.A0A;
                                    AnimationSet animationSet = r10.A02;
                                    if (animationSet != null) {
                                        A01(animationSet, r16, userSession, r9, r19, r1, r4, r20, r14, r10, i3, r7.A00.A0G);
                                        if (i2 == 0 && A00 != null) {
                                            String id = ((C306876Nw) r1).A02.getId();
                                            C317106mj.A06 = i3;
                                            C317106mj.A05 = id;
                                        }
                                        if (z) {
                                            if (r4.A11) {
                                                C306896Ny.A04(((C306876Nw) r1).A02.getId());
                                            }
                                            View view = r14.A05;
                                            view.clearAnimation();
                                            C294975nL A013 = C294975nL.A01(view, 0);
                                            A013.A0G();
                                            C294975nL A0E = A013.A0E(C71392co.A03(5.0d, 5.0d));
                                            A0E.A0U(0.95f, 1.0f, -1.0f);
                                            A0E.A0V(0.95f, 1.0f, -1.0f);
                                            A0E.A0H();
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                } else {
                    throw new IllegalArgumentException(002.A0n("There are ", " SU cardViewHolders but only ", " SuggestedUserItems.", length, size));
                }
            } else {
                throw new IllegalStateException("This is only null when the item is not a netego SU unit");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final boolean A03(Context context, C250973mM r5, int i) {
        int A022 = AnonymousClass4EQ.A02(context);
        0qQ.A0B(context, 0);
        if (((float) ((A022 - (C316216lI.A03(context) + context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material))) - (C316216lI.A04(context, r5) * 2))) >= 0nA.A04(context, i)) {
            return true;
        }
        return false;
    }
}
