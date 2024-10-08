package X;

/* renamed from: X.PSj  reason: case insensitive filesystem */
public final class C73000PSj implements 1aV {
    public final /* synthetic */ C332557Vm A00;
    public final /* synthetic */ C333517Zg A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C73000PSj(C332557Vm r1, C333517Zg r2, Long l, Long l2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = l;
        this.A04 = str;
        this.A05 = str2;
        this.A08 = z;
        this.A09 = z2;
        this.A02 = l2;
        this.A06 = z3;
        this.A07 = z4;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.NSY, java.lang.Runnable] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (X.2El.A0C(r14) == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            X.7Zg r0 = r1.A01
            X.7S7 r3 = r0.C6l()
            X.7Vm r2 = r1.A00
            X.4DH r5 = r2.A01
            android.content.Context r0 = r5.requireContext()
            com.instagram.model.direct.DirectShareTarget r4 = r3.C6Z(r0)
            X.7SD r6 = r3.C6Q()
            com.instagram.common.session.UserSession r14 = r2.A04
            X.0iw r0 = r2.A02
            r23 = r0
            java.lang.Long r0 = r1.A03
            r22 = r0
            java.lang.String r13 = r1.A04
            X.3t3 r0 = r6.A0P
            r12 = 0
            if (r0 == 0) goto L_0x0128
            java.lang.String r11 = X.C300965yF.A06(r0)
        L_0x002d:
            java.lang.String r10 = r1.A05
            X.3tH r9 = r2.A05
            java.lang.String r16 = r3.C6G()
            java.lang.String r8 = r2.A08
            android.content.Context r0 = r5.requireContext()
            boolean r0 = X.0oI.A0C(r0)
            if (r0 == 0) goto L_0x0048
            boolean r5 = X.2El.A0C(r14)
            r0 = 1
            if (r5 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            int r7 = r3.C68(r0)
            java.lang.String r6 = r2.A0A
            if (r4 == 0) goto L_0x0125
            java.lang.String r5 = r14.A06
            r0 = 0
            java.lang.Integer r5 = r4.A04(r5, r0)
        L_0x0058:
            boolean r4 = r3.CZ0()
            boolean r3 = r1.A08
            boolean r0 = r1.A09
            r21 = r0
            boolean r0 = r2.A0D
            r20 = r0
            java.lang.String r0 = r2.A07
            r19 = r0
            java.lang.String r0 = r2.A0B
            java.lang.Long r2 = r1.A02
            boolean r15 = r1.A06
            r18 = r15
            boolean r1 = r1.A07
            r17 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            X.Mi7 r1 = X.C67089Mi7.A00(r14, r1)
            java.lang.String r15 = r1.A07
            if (r15 == 0) goto L_0x0164
            r1.A06 = r11
            r1.A05 = r5
            boolean r5 = r1.A0E
            r11 = 1
            if (r5 != 0) goto L_0x00a9
            java.util.List r5 = r1.A09
            boolean r5 = X.AnonymousClass4KJ.A00(r5)
            if (r5 != 0) goto L_0x00ab
            java.util.List r5 = r1.A09
            java.util.Iterator r15 = r5.iterator()
        L_0x0099:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L_0x00ab
            com.instagram.model.direct.DirectShareTarget r5 = X.DbT.A0f(r15)
            boolean r5 = r5.A0E()
            if (r5 == 0) goto L_0x0099
        L_0x00a9:
            r1.A0B = r11
        L_0x00ab:
            r1.A01 = r9
            java.util.List r5 = r1.A09
            boolean r5 = X.AnonymousClass4KJ.A00(r5)
            if (r5 != 0) goto L_0x0122
            java.util.List r5 = r1.A09
            java.util.ArrayList r11 = X.FFJ.A01(r5)
        L_0x00bb:
            X.3tH r9 = r1.A01
            X.3tH r5 = X.C254923tH.DJANGO
            if (r9 != r5) goto L_0x00cb
            X.2Dm r9 = r1.A0D
            java.lang.String r5 = r1.A06
            X.3U9 r5 = r9.BYg(r12, r5, r12, r11)
            r1.A00 = r5
        L_0x00cb:
            r5 = r23
            X.0wc r9 = X.AnonymousClass0kN.A01(r5, r14)
            java.lang.String r5 = "direct_enter_thread"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r9, r5)
            boolean r9 = r5.isSampled()
            if (r9 == 0) goto L_0x0164
            X.DbS.A1N(r5, r8)
            java.lang.String r11 = r1.A07
            java.lang.String r9 = X.C66654MaN.A00()
            java.lang.Boolean r9 = X.JTP.A0g(r5, r9, r11, r4)
            java.lang.String r4 = "is_pending"
            r5.A7p(r4, r9)
            java.lang.String r4 = r1.A06
            if (r4 == 0) goto L_0x00f6
            X.C66580MXl.A1J(r5, r4)
        L_0x00f6:
            if (r16 == 0) goto L_0x0105
            java.lang.Long r9 = X.DbV.A0q(r16)
            r4 = 666(0x29a, float:9.33E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r5.A9F(r4, r9)
        L_0x0105:
            r4 = -1
            if (r7 == r4) goto L_0x0111
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r4 = "folder"
            r5.A9O(r4, r7)
        L_0x0111:
            if (r6 == 0) goto L_0x0118
            java.lang.String r4 = "selected_filter"
            r5.AAJ(r4, r6)
        L_0x0118:
            if (r0 == 0) goto L_0x011f
            java.lang.String r4 = "display_location"
            r5.AAJ(r4, r0)
        L_0x011f:
            if (r10 == 0) goto L_0x0134
            goto L_0x012b
        L_0x0122:
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            goto L_0x00bb
        L_0x0125:
            r5 = r12
            goto L_0x0058
        L_0x0128:
            r11 = r12
            goto L_0x002d
        L_0x012b:
            java.lang.Long r4 = X.DbV.A0q(r10)     // Catch:{ NumberFormatException -> 0x0134 }
            java.lang.String r0 = "recipient_id"
            r5.A9F(r0, r4)     // Catch:{ NumberFormatException -> 0x0134 }
        L_0x0134:
            java.lang.String r4 = "consistent_thread_fbid"
            r0 = r22
            r5.A9F(r4, r0)
            X.C66580MXl.A1K(r5, r13)
            X.C66581MXm.A1H(r5, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "is_shh_mode"
            r5.A7p(r0, r3)
            java.lang.String r0 = "ephemeral_lifetime_ms"
            r5.A9F(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "is_dm_thread_eligible"
            r5.A7p(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_dm_e2ee_attribution_enabled"
            r5.A7p(r0, r2)
            r5.Cgf()
        L_0x0164:
            X.EK7 r0 = r1.A02
            if (r0 == 0) goto L_0x016b
            r0.A01()
        L_0x016b:
            X.Mk6 r6 = r1.A03
            if (r6 == 0) goto L_0x01bf
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x018b
            X.0wc r2 = r6.A05
            java.lang.String r0 = "omnipicker_search_enter_thread"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = X.C66654MaN.A00()
            r2.AAJ(r0, r3)
            r2.Cgf()
        L_0x018b:
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x01bf
            java.util.HashSet r11 = X.C67089Mi7.A01(r1)
            java.lang.Boolean r0 = r1.A04
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c3
            java.lang.Integer r15 = X.AnonymousClass05K.A15
        L_0x019d:
            r0 = 1
            r1.A0A = r0
            java.lang.Integer r3 = r1.A05
            X.3tH r2 = r1.A01
            boolean r0 = r1.A0B
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = r0.C6C()
        L_0x01b2:
            r12 = r6
            r13 = r2
            r16 = r3
            r17 = r19
            r18 = r0
            r19 = r11
            r12.A09(r13, r14, r15, r16, r17, r18, r19)
        L_0x01bf:
            return
        L_0x01c0:
            java.lang.String r0 = r1.A06
            goto L_0x01b2
        L_0x01c3:
            java.lang.String r0 = "add_group_member"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01ce
            java.lang.Integer r15 = X.AnonymousClass05K.A0N
            goto L_0x019d
        L_0x01ce:
            int r2 = r11.size()
            r0 = 1
            if (r2 <= r0) goto L_0x01d8
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            goto L_0x019d
        L_0x01d8:
            java.lang.Integer r2 = r1.A05
            X.3tH r5 = r1.A01
            boolean r0 = r1.A0B
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            X.2Ep r0 = r1.A00
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = r0.C6C()
        L_0x01ea:
            r12 = 0
            X.NSY r4 = new X.NSY
            r8 = r2
            r9 = r19
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ScheduledExecutorService r3 = r6.A07
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 2
            java.util.concurrent.ScheduledFuture r0 = r3.schedule(r4, r0, r2)
            r6.A03 = r0
            return
        L_0x0201:
            java.lang.String r0 = r1.A06
            goto L_0x01ea
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73000PSj.accept(java.lang.Object):void");
    }
}
