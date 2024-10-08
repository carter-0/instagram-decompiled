package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Sq  reason: invalid class name and case insensitive filesystem */
public final class C331857Sq extends C331647Ru {
    public C69203Nh3 A00;
    public C69203Nh3 A01;
    public C69203Nh3 A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final 2YM A07;
    public final C333617Zq A08;
    public final AnonymousClass7I3 A09;
    public final C333657Zu A0A = new C333657Zu(this);
    public final C333647Zt A0B = new C333647Zt(this);
    public final C333667Zv A0C = new C333667Zv(this);
    public final AnonymousClass7ZW A0D;
    public final AnonymousClass7TP A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 6));
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 7));
    public final AnonymousClass0eM A0H = new C227862kA(new AnonymousClass9L0(this, 5), new AnonymousClass9L0(this, 8), C317496nM.A00, new 0Yh(C333637Zs.class));
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final C62320sa A0L;
    public final C62320sa A0M;

    public static final void A00(C331857Sq r3) {
        r3.A06 = false;
        ((RecyclerView) r3.A0K.invoke()).A16(r3.A0C);
        AnonymousClass7TP r0 = r3.A0E;
        C333657Zu r1 = r3.A0A;
        0qQ.A0B(r1, 0);
        r0.A01.remove(r1);
        A02(r3);
        r3.A03 = null;
        r3.A0M.invoke();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C331857Sq(AnonymousClass7TP r8, C331627Rs r9, C62320sa r10, C62320sa r11, C62320sa r12, C62320sa r13, C62320sa r14) {
        super(r9);
        UserSession userSession = r9.A00;
        AnonymousClass7I3 r5 = new AnonymousClass7I3(userSession);
        C333617Zq r4 = new C333617Zq(userSession);
        AnonymousClass7ZW r3 = new AnonymousClass7ZW(userSession);
        C333627Zr r2 = new C333627Zr(userSession, r4, r10, new AnonymousClass9L0(r13, 4));
        this.A0E = r8;
        this.A0I = r10;
        this.A0J = r11;
        this.A0K = r12;
        this.A0L = r13;
        this.A0M = r14;
        this.A09 = r5;
        this.A08 = r4;
        this.A0D = r3;
        this.A07 = r2;
    }

    public static final void A01(C331857Sq r4) {
        AnonymousClass74j r3 = r4.A0E.A00;
        if (r3 != null) {
            r3.A04 = true;
            FrameLayout frameLayout = r3.A01;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = r3.A00;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            r4.A05 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r5.A03 == X.AnonymousClass05K.A01) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C331857Sq r5) {
        /*
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0049
            java.lang.Integer r0 = r5.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r0 != r2) goto L_0x0046
            X.0eM r0 = r5.A0G
        L_0x000c:
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.0sa r0 = r5.A0K
            java.lang.Object r0 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            int r0 = r0.computeVerticalScrollOffset()
            if (r0 > r1) goto L_0x0030
            X.7TP r0 = r5.A0E
            X.74j r0 = r0.A00
            if (r0 != 0) goto L_0x0032
            java.lang.Integer r1 = r5.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0049
        L_0x0030:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x0032:
            java.lang.Integer r3 = r5.A03
            if (r3 != r2) goto L_0x004c
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = 1
            if (r3 != r0) goto L_0x0045
            X.Nh3 r0 = r5.A00
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != r1) goto L_0x004c
        L_0x0045:
            return
        L_0x0046:
            X.0eM r0 = r5.A0F
            goto L_0x000c
        L_0x0049:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0032
        L_0x004c:
            r5.A03 = r2
            X.Nh3 r4 = r5.A02
            r3 = 0
            r5.A02 = r3
            if (r4 == 0) goto L_0x0093
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L_0x0093
            r1 = 2
            X.Pha r0 = new X.Pha
            r0.<init>(r5, r1)
            r4.A05(r0)
        L_0x0064:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0087
            r0 = 2
            if (r1 == r0) goto L_0x0084
            r0 = 0
            if (r1 != r0) goto L_0x0097
            r2 = 0
        L_0x0072:
            X.7I3 r1 = r5.A09
            X.0eM r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.7Zs r0 = (X.C333637Zs) r0
            java.lang.String r0 = r0.A00()
            r1.A0B(r0, r2, r3)
            return
        L_0x0084:
            java.lang.String r2 = "thread_header"
            goto L_0x0072
        L_0x0087:
            X.Nh3 r0 = r5.A01
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r0.getCurrentDecorAvatarPosition()
            goto L_0x0072
        L_0x0090:
            java.lang.String r2 = "top_right"
            goto L_0x0072
        L_0x0093:
            A03(r5, r2)
            goto L_0x0064
        L_0x0097:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331857Sq.A02(X.7Sq):void");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.3uV, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e9, code lost:
        if (r7.length() == 0) goto L_0x01eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C331857Sq r39, java.lang.Integer r40) {
        /*
            int r1 = r40.intValue()
            r3 = 1
            r6 = r39
            if (r1 == r3) goto L_0x00ce
            r0 = 2
            if (r1 == r0) goto L_0x0084
            r0 = 0
            if (r1 != r0) goto L_0x007e
            X.Nh3 r5 = r6.A01
            r4 = 0
            if (r5 == 0) goto L_0x005c
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.7Zs r0 = (X.C333637Zs) r0
            X.7QK r1 = r0.A00
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0027
            X.7QH r0 = r1.A06
            r0.A00()
        L_0x0027:
            r1.A00(r5)
            android.view.ViewParent r1 = r5.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0039
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0039
            r1.removeView(r5)
        L_0x0039:
            X.7Rs r0 = r6.A00
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319398803414247(0x81084d00221ce7, double:3.0318722775350364E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x005c
            r5.A02()
            X.0sa r0 = r6.A0K
            java.lang.Object r1 = r0.invoke()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x005c
            X.7Zt r0 = r6.A0B
            r1.removeOnLayoutChangeListener(r0)
        L_0x005c:
            X.Nh3 r2 = r6.A00
            if (r2 == 0) goto L_0x0076
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.7Zs r0 = (X.C333637Zs) r0
            X.7QK r1 = r0.A00
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0073
            X.7QH r0 = r1.A06
            r0.A00()
        L_0x0073:
            r1.A00(r2)
        L_0x0076:
            A01(r6)
            r6.A01 = r4
            r6.A00 = r4
            return
        L_0x007e:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0084:
            X.Nh3 r2 = r6.A00
            if (r2 != 0) goto L_0x0097
            X.0sa r0 = r6.A0I
            java.lang.Object r0 = r0.invoke()
            android.content.Context r0 = (android.content.Context) r0
            X.Nh3 r2 = new X.Nh3
            r2.<init>(r0)
            r6.A00 = r2
        L_0x0097:
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L_0x01b0
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00ac
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00ac
            r1.removeView(r2)
        L_0x00ac:
            X.7TP r0 = r6.A0E
            X.74j r5 = r0.A00
            if (r5 == 0) goto L_0x01b0
            android.view.ViewGroup$LayoutParams r4 = r2.getDesiredContextAvatarLayoutParams()
            r1 = 0
            r5.A04 = r1
            android.widget.FrameLayout r0 = r5.A01
            if (r0 == 0) goto L_0x00c3
            r0.addView(r2, r4)
            r0.setVisibility(r1)
        L_0x00c3:
            android.widget.FrameLayout r1 = r5.A00
            if (r1 == 0) goto L_0x01b0
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x01b0
        L_0x00ce:
            X.Nh3 r2 = r6.A01
            if (r2 != 0) goto L_0x0183
            X.0sa r0 = r6.A0I
            java.lang.Object r0 = r0.invoke()
            android.content.Context r0 = (android.content.Context) r0
            X.Nh3 r2 = new X.Nh3
            r2.<init>(r0)
            X.0sa r0 = r6.A0J
            java.lang.Object r1 = r0.invoke()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x00f0
            android.widget.FrameLayout$LayoutParams r0 = r2.getDesiredDecorLayoutParams()
            r1.addView(r2, r0)
        L_0x00f0:
            X.P0K r0 = new X.P0K
            r0.<init>(r6)
            r2.setClickCallback(r0)
            X.7Rs r0 = r6.A00
            com.instagram.common.session.UserSession r8 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r4 = 36319398803414247(0x81084d00221ce7, double:3.0318722775350364E-306)
            boolean r0 = X.182.A06(r7, r8, r4)
            if (r0 == 0) goto L_0x0120
            X.A42 r0 = new X.A42
            r0.<init>(r6)
            r2.A04(r0)
            X.0sa r0 = r6.A0K
            java.lang.Object r1 = r0.invoke()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0120
            X.7Zt r0 = r6.A0B
            r1.addOnLayoutChangeListener(r0)
        L_0x0120:
            boolean r0 = X.182.A06(r7, r8, r4)
            if (r0 == 0) goto L_0x0181
            X.O5y r0 = new X.O5y
            r0.<init>(r6)
            r2.A01 = r0
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            com.instagram.common.ui.base.IgSimpleImageView r5 = new com.instagram.common.ui.base.IgSimpleImageView
            r5.<init>(r0)
            android.content.Context r4 = r5.getContext()
            X.0qQ.A07(r4)
            r1 = 2131238124(0x7f081cec, float:1.8092518E38)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r4.getColor(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r4, r1, r0)
            r5.setImageDrawable(r0)
            r0 = 8
            r5.setVisibility(r0)
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r0 = r4.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 51
            r1.gravity = r0
            r2.addView(r5, r1)
            X.Ohh r0 = new X.Ohh
            r0.<init>(r2)
            r5.setOnClickListener(r0)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r5.setPadding(r0, r0, r0, r0)
            r2.A00 = r5
        L_0x0181:
            r6.A01 = r2
        L_0x0183:
            X.7Rs r0 = r6.A00
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319398803414247(0x81084d00221ce7, double:3.0318722775350364E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x01b0
            X.0sa r0 = r6.A0K
            java.lang.Object r4 = r0.invoke()
            android.view.View r4 = (android.view.View) r4
            r0 = 2
            int[] r0 = new int[r0]
            r4.getLocationInWindow(r0)
            r1 = r0[r3]
            int r0 = r4.getHeight()
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.setBottomBounds(r0)
        L_0x01b0:
            r6.A02 = r2
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.7Zs r0 = (X.C333637Zs) r0
            r6 = 0
            X.7QK r1 = r0.A00
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x02a6
            r1.A00 = r2
            X.7QL r4 = r1.A05
            X.GnX r0 = r4.A01
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r0 = r0.A01
            X.9Ij r0 = (X.C376539Ij) r0
            if (r0 == 0) goto L_0x01eb
            X.JwJ r0 = X.AnonymousClass7QL.A00(r4, r0)
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r4 = r0.A00
            X.Jtx r4 = (X.C60939Jtx) r4
            if (r4 == 0) goto L_0x01eb
            java.lang.String r7 = r4.A02
            int r0 = r7.length()
            if (r0 != 0) goto L_0x01ef
            java.lang.String r7 = r4.A03
            int r0 = r7.length()
            if (r0 != 0) goto L_0x01ef
        L_0x01eb:
            r2.A03()
            return
        L_0x01ef:
            X.7QH r0 = r1.A06
            java.lang.String r8 = r4.A04
            X.0qQ.A0B(r8, r6)
            X.W1V r5 = r0.A01
            r13 = 0
            if (r5 == 0) goto L_0x02a3
            X.WH6 r4 = new X.WH6
            r4.<init>(r5)
        L_0x0200:
            android.net.Uri r7 = X.0cp.A03(r7)
            X.0sm r5 = X.0Yt.A0E()
            java.lang.String r16 = ""
            X.3uU r12 = X.C255653uU.A00(r7, r8, r5)
            X.28e r10 = X.28e.A01
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            java.lang.String r15 = "QUEUE_PLAYER_TYPE"
            X.3uV r11 = new X.3uV
            r11.<init>()
            com.facebook.video.heroplayer.ipc.AudioFocusLossSettings r9 = new com.facebook.video.heroplayer.ipc.AudioFocusLossSettings
            r9.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            r21 = -1
            X.4OI r8 = new X.4OI
            r19 = r6
            r20 = r6
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r6
            r27 = r3
            r28 = r3
            r29 = r6
            r30 = r6
            r31 = r6
            r32 = r6
            r33 = r6
            r34 = r6
            r35 = r6
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r40 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r8.A03 = r4
            X.JVf r10 = new X.JVf
            r10.<init>((X.AnonymousClass4OI) r8)
            r0.A01()
            android.content.Context r9 = r0.A03
            long r4 = r0.A02
            X.W1V r8 = new X.W1V
            r8.<init>(r9, r4)
            r0.A01 = r8
            X.7QJ r5 = r0.A04
            X.0qQ.A0B(r5, r6)
            java.util.Set r4 = r8.A0A
            r4.add(r5)
            X.W1V r9 = r0.A01
            if (r9 == 0) goto L_0x029c
            java.lang.Object r8 = r10.A01
            X.4OI r8 = (X.AnonymousClass4OI) r8
            boolean r4 = r9.A07
            if (r4 == 0) goto L_0x0289
            r9.A04(r10)
        L_0x0289:
            int r4 = r9.A00
            int r5 = r4 % 2
            X.U2w[] r4 = r9.A0D
            r4 = r4[r5]
            r4.A02(r8, r6)
            r4.A00()
            r4.setAlpha(r7)
            r9.A07 = r3
        L_0x029c:
            r0.A02(r2)
            r1.A04 = r3
            goto L_0x01eb
        L_0x02a3:
            r4 = r13
            goto L_0x0200
        L_0x02a6:
            android.view.ViewGroup r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x02bc
            android.view.ViewGroup r0 = r1.A00
            if (r0 == 0) goto L_0x02b5
            r1.A00(r0)
        L_0x02b5:
            r1.A00 = r2
            X.7QH r0 = r1.A06
            r0.A02(r2)
        L_0x02bc:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x01eb
            X.7QH r0 = r1.A06
            X.W1V r3 = r0.A01
            if (r3 == 0) goto L_0x01eb
            int r0 = r3.A00
            int r1 = r0 % 2
            X.U2w[] r0 = r3.A0D
            r0 = r0[r1]
            r0.A00()
            goto L_0x01eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331857Sq.A03(X.7Sq, java.lang.Integer):void");
    }
}
