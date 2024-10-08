package X;

/* renamed from: X.WHs  reason: case insensitive filesystem */
public final class C19040WHs implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;

    public C19040WHs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0148, code lost:
        if (r3.A04("eligibility", r2) != X.C16650Uym.A02) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017d, code lost:
        if (r5.A04("eligibility", r2) == X.C16650Uym.A02) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b0, code lost:
        if (r2 == X.C16664Uz0.A05) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ba, code lost:
        if (r3 == X.C16664Uz0.A05) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c0, code lost:
        if (r7 == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c6, code lost:
        if (r10 == false) goto L_0x01c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r17) {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A00
            r4 = r17
            switch(r0) {
                case 0: goto L_0x02a3;
                case 1: goto L_0x02a3;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x029b;
                case 5: goto L_0x00b9;
                case 6: goto L_0x01d1;
                case 7: goto L_0x002b;
                case 8: goto L_0x0019;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r5.A01
            X.1P0 r1 = (X.1P0) r1
            if (r17 == 0) goto L_0x0018
            java.lang.Object r0 = r4.Bny()
            if (r0 == 0) goto L_0x0018
            r1.onSuccess(r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r2 = r5.A01
            X.VvE r2 = (X.C18621VvE) r2
            java.lang.String r0 = r2.A07
            X.UXv r1 = X.VEV.A00(r4, r0)
            X.X6j r0 = r2.A03
            if (r0 == 0) goto L_0x0018
            r0.DKU(r1)
            return
        L_0x002b:
            if (r17 == 0) goto L_0x0018
            X.3lr r4 = X.C41845B3m.A0U(r4)
            if (r4 == 0) goto L_0x0018
            java.lang.Class<X.UQg> r2 = X.C15117UQg.class
            r3 = 0
            java.lang.String r1 = "xfb_live_location_update_subscribe(data:$input)"
            r0 = 1751118053(0x685ff0e5, float:4.2301258E24)
            X.3lr r7 = r4.getOptionalTreeField(r3, r1, r2, r0)
            if (r7 == 0) goto L_0x0018
            java.lang.String r0 = "strong_id__"
            java.lang.String r4 = r7.getOptionalStringField(r3, r0)
            if (r4 == 0) goto L_0x0018
            java.lang.Class<X.UQf> r2 = X.C15116UQf.class
            java.lang.String r1 = "location"
            r0 = 1195586568(0x47433408, float:49972.03)
            X.3lr r6 = r7.A02(r2, r1, r0)
            if (r6 == 0) goto L_0x0018
            X.Uyl r2 = X.C16649Uyl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            java.lang.String r0 = "status"
            java.lang.Enum r1 = r7.getOptionalEnumField(r1, r0, r2)
            X.Uyl r0 = X.C16649Uyl.SHARING
            if (r1 != r0) goto L_0x0018
            java.lang.Object r2 = r5.A01
            X.VN3 r2 = (X.VN3) r2
            java.util.concurrent.Executor r0 = X.C17145VJx.A00
            java.lang.String r0 = "latitude"
            double r8 = r6.getCoercedDoubleField(r3, r0)
            r1 = 1
            java.lang.String r0 = "longitude"
            double r10 = r6.getCoercedDoubleField(r1, r0)
            java.lang.String r0 = "accuracy_meters"
            int r12 = r6.A00(r0)
            r1 = 3
            java.lang.String r0 = "epoch_time_sec"
            double r0 = r6.getCoercedDoubleField(r1, r0)
            long r14 = (long) r0
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.HOURS
            long r5 = X.JTR.A0N(r5)
            long r0 = r0 + r5
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            com.facebook.locationsharing.core.models.Location r6 = new com.facebook.locationsharing.core.models.Location
            r6.<init>(r7, r8, r10, r12, r13, r14)
            com.facebook.locationsharing.core.models.LiveLocationSharer r5 = new com.facebook.locationsharing.core.models.LiveLocationSharer
            r5.<init>(r6, r4, r0)
            X.UOn r4 = r2.A00
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0018
            X.WIM r2 = r4.A00
            java.lang.String r1 = r4.A00
            X.WFi r0 = new X.WFi
            r0.<init>(r4, r3)
            r2.FMc(r0, r5, r1)
            return
        L_0x00b9:
            java.lang.Object r3 = r5.A01
            X.W1k r3 = (X.C18784W1k) r3
            if (r17 == 0) goto L_0x0018
            java.lang.Object r8 = r4.Bny()
            X.3FZ r8 = (X.AnonymousClass3FZ) r8
            if (r8 == 0) goto L_0x0018
            java.lang.Class<X.UJW> r7 = X.UJW.class
            java.lang.String r6 = "xig_user_by_igid_v2"
            X.3FZ r0 = r8.A00(r7, r6)
            if (r0 == 0) goto L_0x0018
            X.3FZ r0 = r8.A00(r7, r6)
            java.lang.Class<X.UJV> r5 = X.UJV.class
            java.lang.String r4 = "ig_advertiser"
            X.3FZ r0 = r0.A00(r5, r4)
            if (r0 == 0) goto L_0x0018
            X.3FZ r0 = r8.A00(r7, r6)
            X.3FZ r0 = r0.A00(r5, r4)
            java.lang.Class<X.UJU> r2 = X.UJU.class
            java.lang.String r1 = "ig_advertiser_settings"
            X.3FZ r0 = r0.A00(r2, r1)
            if (r0 == 0) goto L_0x0018
            X.3FZ r0 = r8.A00(r7, r6)
            X.3FZ r0 = r0.A00(r5, r4)
            X.3FZ r2 = r0.A00(r2, r1)
            java.lang.Class<X.UJT> r1 = X.UJT.class
            java.lang.String r0 = "ad_format_preferences"
            com.google.common.collect.ImmutableList r11 = r2.A02(r0, r1)
            boolean r0 = r11.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            r6 = 0
            if (r0 == 0) goto L_0x02ab
            com.instagram.business.promote.model.PromoteData r4 = r3.A03
            r4.A2S = r7
            X.Uyt r8 = X.C16657Uyt.AUTOMATIC_CREATIVE_OPTIMIZATION
            X.3kO r5 = r11.iterator()
        L_0x0119:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r3 = r5.next()
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            X.Uyt r2 = X.C16657Uyt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r0 = r3.A04(r1, r2)
            if (r0 == 0) goto L_0x0119
            java.lang.Enum r0 = r3.A04(r1, r2)
            if (r0 != r8) goto L_0x0119
        L_0x0135:
            if (r3 == 0) goto L_0x014a
            X.Uym r2 = X.C16650Uym.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "eligibility"
            java.lang.Enum r0 = r3.A04(r1, r2)
            if (r0 == 0) goto L_0x014a
            java.lang.Enum r1 = r3.A04(r1, r2)
            X.Uym r0 = X.C16650Uym.ELIGIBLE
            r10 = 1
            if (r1 == r0) goto L_0x014b
        L_0x014a:
            r10 = 0
        L_0x014b:
            X.Uyt r9 = X.C16657Uyt.MULTI_ADVERTISERS_CONTEXTUAL_ADS
            X.3kO r8 = r11.iterator()
        L_0x0151:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r8.next()
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            X.Uyt r2 = X.C16657Uyt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r0 = r5.A04(r1, r2)
            if (r0 == 0) goto L_0x0151
            java.lang.Enum r0 = r5.A04(r1, r2)
            if (r0 != r9) goto L_0x0151
            X.Uym r2 = X.C16650Uym.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "eligibility"
            java.lang.Enum r0 = r5.A04(r1, r2)
            if (r0 == 0) goto L_0x01cc
            java.lang.Enum r1 = r5.A04(r1, r2)
            X.Uym r0 = X.C16650Uym.ELIGIBLE
            if (r1 != r0) goto L_0x01cc
        L_0x017f:
            X.Uz0 r0 = r4.A14
            if (r0 != 0) goto L_0x01c6
            if (r10 == 0) goto L_0x01c8
            r3.getClass()
            X.Uz0 r1 = X.C16664Uz0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "value"
            java.lang.Enum r0 = r3.A04(r0, r1)
            X.Uz0 r0 = (X.C16664Uz0) r0
            r4.A14 = r0
        L_0x0194:
            X.Uz0 r3 = r4.A15
            if (r3 != 0) goto L_0x01c0
            if (r7 == 0) goto L_0x01c2
            r5.getClass()
            X.Uz0 r1 = X.C16664Uz0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "value"
            java.lang.Enum r3 = r5.A04(r0, r1)
            X.Uz0 r3 = (X.C16664Uz0) r3
            r4.A15 = r3
        L_0x01a9:
            X.Uz0 r2 = r4.A14
            if (r2 == 0) goto L_0x01b2
            X.Uz0 r1 = X.C16664Uz0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 1
            if (r2 != r1) goto L_0x01b3
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            r4.A2z = r0
            if (r3 == 0) goto L_0x01bc
            X.Uz0 r1 = X.C16664Uz0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 1
            if (r3 != r1) goto L_0x01bd
        L_0x01bc:
            r0 = 0
        L_0x01bd:
            r4.A31 = r0
            return
        L_0x01c0:
            if (r7 != 0) goto L_0x01a9
        L_0x01c2:
            r4.A15 = r6
            r3 = r6
            goto L_0x01a9
        L_0x01c6:
            if (r10 != 0) goto L_0x0194
        L_0x01c8:
            r4.A14 = r6
            goto L_0x0194
        L_0x01cb:
            r5 = 0
        L_0x01cc:
            r7 = 0
            goto L_0x017f
        L_0x01ce:
            r3 = 0
            goto L_0x0135
        L_0x01d1:
            if (r17 == 0) goto L_0x021d
            X.3lr r3 = X.C41845B3m.A0U(r4)
            if (r3 == 0) goto L_0x021d
            java.lang.Class<X.UQb> r2 = X.C15112UQb.class
            java.lang.String r1 = "xfb_live_location_sessions_for_thread_query(data:$data)"
            r0 = 1896830883(0x710f57a3, float:7.0979684E29)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x021d
            java.lang.Class<X.UQa> r2 = X.C15111UQa.class
            java.lang.String r1 = "live_location_sessions"
            r0 = -1420324719(0xffffffffab579091, float:-7.658397E-13)
            com.google.common.collect.ImmutableList r1 = r3.A06(r2, r1, r0)
            if (r1 == 0) goto L_0x021d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x01fc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x021e
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r1 = "creator_id"
            java.lang.String r1 = r2.A07(r1)
            if (r1 == 0) goto L_0x01fc
            java.lang.String r1 = "live_location_session_id"
            java.lang.String r1 = r2.A08(r1)
            if (r1 == 0) goto L_0x01fc
            r0.add(r3)
            goto L_0x01fc
        L_0x021d:
            r0 = 0
        L_0x021e:
            java.lang.Object r5 = r5.A01
            X.VVZ r5 = (X.VVZ) r5
            if (r0 != 0) goto L_0x0226
            X.0sn r0 = X.0sn.A00
        L_0x0226:
            X.7AX r6 = r5.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x022c:
            boolean r0 = r7.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x028a
            java.lang.Object r3 = r7.next()
            r1 = r3
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "creator_id"
            java.lang.String r2 = r1.A07(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r6.A04
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.lang.Long r0 = r0.BST()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x022c
        L_0x0256:
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x028c
            r1 = 1
            java.lang.String r0 = "live_location_session_id"
            java.lang.String r4 = r3.getOptionalStringField(r1, r0)
            if (r4 == 0) goto L_0x028c
            java.lang.String r0 = r5.A01
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x028c
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = r6.A08
            X.AnonymousClass7AX.A00(r6, r0, r1)
            X.VN2 r5 = new X.VN2
            r5.<init>()
            android.content.Context r4 = r6.A00
            com.instagram.common.session.UserSession r3 = r6.A04
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.util.concurrent.ExecutorService r1 = r5.A00
            X.TJy r0 = new X.TJy
            r0.<init>(r4, r3, r5, r2)
            r1.submit(r0)
            return
        L_0x028a:
            r3 = r4
            goto L_0x0256
        L_0x028c:
            X.7Af r3 = r6.A01
            java.lang.String r2 = r6.A08
            boolean r1 = r5.A02
            X.WFh r0 = new X.WFh
            r0.<init>(r6, r4, r1)
            r3.AOa(r0, r2)
            return
        L_0x029b:
            java.lang.Object r0 = r5.A01
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccess(r4)
            return
        L_0x02a3:
            java.lang.Object r0 = r5.A01
            X.DQs r0 = (X.C46214DQs) r0
            r0.onSuccess()
            return
        L_0x02ab:
            com.instagram.business.promote.model.PromoteData r0 = r3.A03
            r0.A15 = r6
            r0.A14 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19040WHs.invoke(X.3JD):void");
    }
}
