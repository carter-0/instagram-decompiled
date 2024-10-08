package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7WL  reason: invalid class name */
public final class AnonymousClass7WL {
    public AnonymousClass782 A00;
    public final 1a8 A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final 0wc A04;
    public final UserSession A05;
    public final C332297Uk A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final C62320sa A09;
    public final C62320sa A0A;

    public AnonymousClass7WL(0wc r2, 1a8 r3, UserSession userSession, C332297Uk r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10, C62320sa r11) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r3, 4);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r9, 8);
        0qQ.A0B(r10, 9);
        this.A05 = userSession;
        this.A04 = r2;
        this.A06 = r5;
        this.A01 = r3;
        this.A03 = r6;
        this.A0A = r7;
        this.A09 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A02 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0168, code lost:
        if (r5 == false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass782 A00(X.AnonymousClass7WL r25, boolean r26) {
        /*
            r5 = r25
            X.0sa r0 = r5.A03
            java.lang.Object r13 = r0.invoke()
            X.7Zg r13 = (X.C333517Zg) r13
            X.0sa r0 = r5.A07
            java.lang.Object r15 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r15 = (androidx.recyclerview.widget.RecyclerView) r15
            com.instagram.common.session.UserSession r0 = r5.A05
            android.content.Context r1 = r15.getContext()
            X.0qQ.A07(r1)
            X.0sa r2 = r5.A08
            java.lang.Object r12 = r2.invoke()
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r12 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r12
            X.0wc r4 = r5.A04
            X.7Uk r2 = r5.A06
            r25 = r2
            X.0sa r2 = r5.A09
            java.lang.Object r3 = r2.invoke()
            X.7Nw r3 = (X.C330707Nw) r3
            X.0sa r2 = r5.A0A
            java.lang.Object r2 = r2.invoke()
            X.7L2 r2 = (X.AnonymousClass7L2) r2
            r5 = 2
            X.0qQ.A0B(r13, r5)
            r5 = 4
            X.0qQ.A0B(r12, r5)
            r5 = 5
            X.0qQ.A0B(r4, r5)
            r5 = 7
            X.0qQ.A0B(r3, r5)
            r5 = 8
            X.0qQ.A0B(r2, r5)
            if (r26 == 0) goto L_0x014f
            X.7S7 r3 = r13.C6l()
            X.7SD r10 = r3.C6Q()
            X.0qQ.A07(r10)
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r3 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r3 == 0) goto L_0x014b
            X.0Tu r9 = X.0Tu.A05
            r3 = 36322890609601174(0x810b7a00002a96, double:3.034080509828024E-306)
            boolean r5 = X.182.A06(r9, r0, r3)
            if (r5 != 0) goto L_0x00fa
            r5 = 2131960959(0x7f13247f, float:1.9558601E38)
            java.lang.String r19 = r1.getString(r5)
        L_0x0073:
            X.0qQ.A07(r19)
            boolean r3 = X.182.A06(r9, r0, r3)
            if (r3 != 0) goto L_0x00aa
            r3 = 2131960961(0x7f132481, float:1.9558605E38)
            java.lang.String r20 = r1.getString(r3)
        L_0x0083:
            X.0qQ.A07(r20)
            r21 = 2131960960(0x7f132480, float:1.9558603E38)
            r24 = 2131960962(0x7f132482, float:1.9558607E38)
            r23 = 2131231666(0x7f0803b2, float:1.807942E38)
            r22 = 2131231665(0x7f0803b1, float:1.8079417E38)
            X.780 r16 = new X.780
            r17 = r1
            r18 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x009b:
            X.787 r2 = new X.787
            r3 = r1
            r4 = r15
            r5 = r0
            r6 = r13
            r7 = r16
            r8 = r25
            r9 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x00aa:
            int r9 = X.C70046NwO.A00(r0, r10)
            r7 = 0
            r5 = 1
            java.lang.Integer r3 = X.C71103Och.A00(r0, r9)
            int r4 = r3.intValue()
            if (r4 == r7) goto L_0x00f0
            if (r4 == r5) goto L_0x00e3
            r3 = 2
            if (r4 == r3) goto L_0x00d6
            r6 = 2131960891(0x7f13243b, float:1.9558463E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = (long) r9
            long r3 = r8.toDays(r3)
        L_0x00cb:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x00cf:
            r5[r7] = r3
            java.lang.String r20 = r1.getString(r6, r5)
            goto L_0x0083
        L_0x00d6:
            r6 = 2131960892(0x7f13243c, float:1.9558466E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = (long) r9
            long r3 = r8.toHours(r3)
            goto L_0x00cb
        L_0x00e3:
            r6 = 2131960893(0x7f13243d, float:1.9558468E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = (long) r9
            long r3 = r8.toMinutes(r3)
            goto L_0x00cb
        L_0x00f0:
            r6 = 2131960894(0x7f13243e, float:1.955847E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L_0x00cf
        L_0x00fa:
            int r5 = X.C70046NwO.A00(r0, r10)
            r11 = 0
            r14 = 1
            java.lang.Integer r6 = X.C71103Och.A00(r0, r5)
            int r7 = r6.intValue()
            if (r7 == r11) goto L_0x0141
            if (r7 == r14) goto L_0x0134
            r6 = 2
            if (r7 == r6) goto L_0x0127
            r8 = 2131960895(0x7f13243f, float:1.9558472E38)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = (long) r5
            long r5 = r14.toDays(r5)
        L_0x011b:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
        L_0x011f:
            r7[r11] = r5
            java.lang.String r19 = r1.getString(r8, r7)
            goto L_0x0073
        L_0x0127:
            r8 = 2131960896(0x7f132440, float:1.9558474E38)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = (long) r5
            long r5 = r14.toHours(r5)
            goto L_0x011b
        L_0x0134:
            r8 = 2131960897(0x7f132441, float:1.9558476E38)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = (long) r5
            long r5 = r14.toMinutes(r5)
            goto L_0x011b
        L_0x0141:
            r8 = 2131960898(0x7f132442, float:1.9558478E38)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x011f
        L_0x014b:
            r16 = 0
            goto L_0x009b
        L_0x014f:
            X.7S7 r7 = r13.C6l()
            X.7SD r5 = r7.C6Q()
            X.3Tu r5 = r5.A0H
            boolean r6 = X.C331057Pi.A02(r5)
            boolean r5 = X.C66642MaB.A02(r0, r6)
            if (r5 != 0) goto L_0x016a
            boolean r5 = X.C66642MaB.A02(r0, r6)
            r6 = 0
            if (r5 != 0) goto L_0x016b
        L_0x016a:
            r6 = 1
        L_0x016b:
            boolean r5 = r7.CSK()
            if (r5 == 0) goto L_0x01ad
            if (r6 == 0) goto L_0x01ad
            r5 = 2131973702(0x7f135646, float:1.9584447E38)
            java.lang.String r19 = r1.getString(r5)
            X.0qQ.A07(r19)
            r5 = 2131973704(0x7f135648, float:1.9584451E38)
            java.lang.String r20 = r1.getString(r5)
            X.0qQ.A07(r20)
            r21 = 2131973703(0x7f135647, float:1.958445E38)
            r22 = 2131239791(0x7f08236f, float:1.8095899E38)
            r23 = 2131239929(0x7f0823f9, float:1.8096179E38)
            r24 = 2131973705(0x7f135649, float:1.9584453E38)
            X.780 r8 = new X.780
            r17 = r1
            r18 = r2
            r16 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            X.781 r2 = new X.781
            r9 = r3
            r10 = r25
            r11 = r12
            r5 = r4
            r6 = r0
            r7 = r13
            r3 = r1
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L_0x01ad:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WL.A00(X.7WL, boolean):X.782");
    }

    public final void A01() {
        AnonymousClass782 r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass782 r02 = this.A00;
        if (r02 != null) {
            r02.A01();
        }
    }

    public final void A02() {
        AnonymousClass782 r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
        this.A00 = A00(this, ((AnonymousClass7L4) this.A02.invoke()).CdC());
        A01();
    }
}
