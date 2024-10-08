package X;

/* renamed from: X.7Tu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C332137Tu extends 03J implements C62320sa {
    public C332137Tu(Object obj) {
        super(0, obj, AnonymousClass7TI.class, "triggerJobsUponAnyItemsRendered", "triggerJobsUponAnyItemsRendered()V", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r18.COP() != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r28 = this;
            r0 = r28
            java.lang.Object r4 = r0.receiver
            X.7TI r4 = (X.AnonymousClass7TI) r4
            X.7Wa r0 = r4.A0p
            r0.CvY()
            com.instagram.common.session.UserSession r3 = r4.A0d
            X.7GH r9 = X.AnonymousClass7GF.A00(r3)
            X.7Zg r0 = r4.A08
            java.lang.String r10 = "clientInfra"
            if (r0 == 0) goto L_0x0385
            X.7ZY r0 = r0.BSN()
            int r1 = r0.getItemCount()
            X.7Zg r0 = r4.A08
            if (r0 == 0) goto L_0x0385
            X.7S7 r0 = r0.C6l()
            X.7SD r7 = r0.C6Q()
            X.0qQ.A07(r7)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r6 = 1
            X.0qQ.A0B(r9, r6)
            java.lang.String r0 = r9.A02
            int r0 = r0.length()
            r5 = 0
            if (r0 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0058
            boolean r0 = r9.A06
            if (r0 != 0) goto L_0x0058
            java.util.List r1 = r7.A0b
            int r0 = r1.size()
            r8 = 2
            if (r0 > r8) goto L_0x0058
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0389
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0389
        L_0x0058:
            X.4DH r0 = r4.A0U
            androidx.fragment.app.FragmentActivity r20 = r0.requireActivity()
            X.7Zg r8 = r4.A08
            if (r8 == 0) goto L_0x0385
            java.lang.String r2 = r4.A12
            java.lang.String r14 = r4.A11
            r0 = 3
            X.0qQ.A0B(r2, r0)
            X.7S7 r15 = r8.C6l()
            X.7SD r0 = r15.C6Q()
            int r9 = r0.A08
            java.lang.String r7 = r3.A06
            boolean r19 = r15.COR(r7)
            X.2Er r18 = r8.Api()
            if (r18 == 0) goto L_0x01b7
            r0 = 29
            if (r9 != r0) goto L_0x02f4
            r0 = 337(0x151, float:4.72E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02f4
            if (r19 != 0) goto L_0x00a5
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r5 = r0.A01
            r0 = 264(0x108, float:3.7E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r5.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x02f4
        L_0x00a5:
            X.2Ep r0 = r15.Cms()
            if (r0 == 0) goto L_0x01b7
            com.instagram.user.model.User r1 = r0.Ash()
            if (r1 == 0) goto L_0x01b7
            X.6gx r13 = X.C313746gw.A00(r3)
            java.lang.String r12 = r15.C6C()
            java.lang.String r11 = r15.C6k()
            int r17 = r18.AdN()
            if (r19 != 0) goto L_0x00ca
            boolean r0 = r18.COP()
            r10 = 0
            if (r0 == 0) goto L_0x00cb
        L_0x00ca:
            r10 = 1
        L_0x00cb:
            boolean r9 = r4.A0K
            boolean r16 = r1.A29()
            X.0wc r0 = r13.A03
            X.1Ln r5 = X.1Ln.A0E(r0)
            X.0Aj r0 = r5.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x016c
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r19 == 0) goto L_0x02f0
            java.lang.String r1 = "True"
        L_0x00e8:
            java.lang.String r0 = "is_admin"
            r4.put(r0, r1)
            if (r10 == 0) goto L_0x02ec
            java.lang.String r1 = "True"
        L_0x00f1:
            r0 = 153(0x99, float:2.14E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.put(r0, r1)
            if (r9 == 0) goto L_0x02e8
            java.lang.String r1 = "True"
        L_0x00fe:
            r0 = 837(0x345, float:1.173E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.put(r0, r1)
            if (r16 == 0) goto L_0x02e4
            java.lang.String r1 = "True"
        L_0x010b:
            r0 = 139(0x8b, float:1.95E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.put(r0, r1)
            java.lang.String r1 = X.C313756gx.A03(r2)
            java.lang.String r0 = "entrypoint"
            r4.put(r0, r1)
            if (r14 != 0) goto L_0x0121
            java.lang.String r14 = ""
        L_0x0121:
            java.lang.String r0 = "ad_id"
            r4.put(r0, r14)
            long r0 = r13.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0h(r0)
            if (r10 == 0) goto L_0x02dc
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x0137:
            r5.A0l(r0)
            java.lang.String r0 = "tap"
            r5.A0k(r0)
            java.lang.String r0 = X.C313756gx.A05(r2, r10)
            r5.A0p(r0)
            java.lang.String r0 = X.C313756gx.A04(r2)
            r5.A0q(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r0 = X.C313746gw.A01(r0)
            r5.A0o(r0)
            r5.A0s(r12)
            if (r11 == 0) goto L_0x02d9
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r11)
        L_0x0163:
            r5.A0i(r0)
            r5.A0w(r4)
            r5.Cgf()
        L_0x016c:
            boolean r0 = r18.COP()
            if (r0 == 0) goto L_0x01b7
            X.4kA r0 = X.AnonymousClass4k9.A00(r3)
            java.lang.String r11 = r15.C6C()
            X.0xa r9 = r0.A00
            r0 = 2728(0xaa8, float:3.823E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r1, r11)
            r5 = 0
            int r10 = r9.getInt(r0, r5)
            X.0xY r4 = r9.AR4()
            java.lang.String r1 = X.002.A0R(r1, r11)
            int r0 = r10 + 1
            r4.E5Z(r1, r0)
            if (r10 != 0) goto L_0x01a9
            r0 = 2727(0xaa7, float:3.821E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = r9.getInt(r1, r5)
            int r0 = r0 + 1
            r4.E5Z(r1, r0)
        L_0x01a9:
            java.lang.String r1 = "broadcast_channel_visit_count_for_pushability"
            int r0 = r9.getInt(r1, r5)
            int r0 = r0 + 1
            r4.E5Z(r1, r0)
            r4.apply()
        L_0x01b7:
            X.2Ep r0 = r15.Cms()
            if (r0 == 0) goto L_0x01f9
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r1 = r0.A0s
            if (r1 == 0) goto L_0x01f9
            X.2Ep r0 = r15.Cms()
            if (r0 == 0) goto L_0x02d6
            com.instagram.user.model.User r0 = r0.Ash()
        L_0x01cf:
            java.lang.String r23 = r15.C6C()
            java.lang.String r24 = r15.C6k()
            java.lang.String r4 = r1.A07
            if (r0 == 0) goto L_0x02d2
            boolean r27 = r0.A29()
        L_0x01df:
            X.2Er r8 = r8.Api()
            if (r8 == 0) goto L_0x01f9
            int r1 = r8.C6a()
            r0 = 28
            if (r1 == r0) goto L_0x029c
            r0 = 29
            if (r1 == r0) goto L_0x0260
            r0 = 32
            if (r1 == r0) goto L_0x0232
            r0 = 62
            if (r1 == r0) goto L_0x0232
        L_0x01f9:
            X.7SD r0 = r15.C6Q()
            boolean r0 = r0.A0n
            if (r0 != 0) goto L_0x022f
            X.3t3 r0 = r15.CBU()
            if (r0 == 0) goto L_0x022f
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x022f
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x022f
            r4 = 0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317934218385060(0x8106f8001016a4, double:3.030946068065168E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x022f
            X.NQN r0 = new X.NQN
            r0.<init>(r5)
            X.5g0 r2 = X.C290635fd.A01(r3, r0)
            r1 = 1967622104(0x754787d8, float:2.5293514E32)
            r0 = 2
            X.1ES.A05(r2, r1, r0, r4, r4)
        L_0x022f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0232:
            X.1Av r6 = X.1Au.A00(r3)
            X.0s0 r5 = r6.A38
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 393(0x189, float:5.51E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r5.CDM(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01f9
            boolean r0 = X.0qQ.A0K(r7, r4)
            if (r0 != 0) goto L_0x01f9
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315881222966926(0x81051a00000e8e, double:3.029647745495991E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x01f9
            X.9s1 r22 = X.C390899s1.SOCIAL_CHANNEL
            goto L_0x02c7
        L_0x0260:
            int r1 = r8.BHS()
            r0 = 7
            if (r1 != r0) goto L_0x01f9
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342158877552610932(0x20810517000d0e74, double:4.062082582117955E-152)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x01f9
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r5 = r0.A01
            r0 = 264(0x108, float:3.7E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r5.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x01f9
            int r1 = r8.AdN()
            if (r1 == r6) goto L_0x0299
            r0 = 2
            if (r1 == r0) goto L_0x02c5
            java.lang.String r1 = "ChannelsNuxLauncher"
            java.lang.String r0 = "Unsupported audience type."
            X.0KC.A0C(r1, r0)
            goto L_0x01f9
        L_0x0299:
            X.9s1 r22 = X.C390899s1.BROADCAST_CHANNEL
            goto L_0x02c7
        L_0x029c:
            X.6jB r0 = X.C314986jA.A00(r3)
            X.0xa r5 = r0.A01
            r0 = 3226(0xc9a, float:4.52E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r5.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x01f9
            boolean r0 = X.0qQ.A0K(r7, r4)
            if (r0 != 0) goto L_0x01f9
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319832592883372(0x8108b200001eac, double:3.032146607742041E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x01f9
            X.9s1 r22 = X.C390899s1.SUBSCRIBER_SOCIAL_CHANNEL
            goto L_0x02c7
        L_0x02c5:
            X.9s1 r22 = X.C390899s1.SUBSCRIBER_BROADCAST_CHANNEL
        L_0x02c7:
            r21 = r3
            r25 = r2
            r26 = r4
            X.C48824Ekm.A00(r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01f9
        L_0x02d2:
            r27 = 0
            goto L_0x01df
        L_0x02d6:
            r0 = 0
            goto L_0x01cf
        L_0x02d9:
            r0 = 0
            goto L_0x0163
        L_0x02dc:
            r0 = 1889(0x761, float:2.647E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0137
        L_0x02e4:
            java.lang.String r1 = "False"
            goto L_0x010b
        L_0x02e8:
            java.lang.String r1 = "False"
            goto L_0x00fe
        L_0x02ec:
            java.lang.String r1 = "False"
            goto L_0x00f1
        L_0x02f0:
            java.lang.String r1 = "False"
            goto L_0x00e8
        L_0x02f4:
            boolean r0 = X.AnonymousClass48O.A01(r9)
            if (r0 == 0) goto L_0x01b7
            java.lang.String r10 = "inbox_search"
            boolean r0 = r10.equals(r2)
            if (r0 == 0) goto L_0x01b7
            X.FYv r12 = X.C69866NtU.A00(r3)
            java.lang.String r9 = r15.C6C()
            java.lang.String r5 = r15.C6k()
            X.0wc r0 = r12.A02
            X.1Ln r4 = X.1Ln.A0F(r0)
            X.0Aj r0 = r4.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x01b7
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r19 == 0) goto L_0x0382
            java.lang.String r11 = "True"
        L_0x0325:
            java.lang.String r0 = "is_admin"
            r1.put(r0, r11)
            java.lang.String r11 = "True"
            r0 = 153(0x99, float:2.14E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.put(r0, r11)
            java.lang.String r11 = "False"
            java.lang.String r0 = "new_pc_user"
            r1.put(r0, r11)
            com.instagram.common.session.UserSession r0 = r12.A03
            java.lang.String r0 = r0.A06
            long r11 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4.A0h(r0)
            r0 = 1885(0x75d, float:2.641E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0l(r0)
            java.lang.String r0 = "tap"
            r4.A0k(r0)
            r0 = 3286(0xcd6, float:4.605E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A0p(r0)
            r4.A0q(r10)
            java.lang.String r0 = "instagram"
            r4.A0o(r0)
            r4.A0s(r9)
            if (r5 == 0) goto L_0x0380
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r5)
        L_0x0375:
            r4.A0i(r0)
            r4.A0w(r1)
            r4.Cgf()
            goto L_0x01b7
        L_0x0380:
            r0 = 0
            goto L_0x0375
        L_0x0382:
            java.lang.String r11 = "False"
            goto L_0x0325
        L_0x0385:
            X.0qQ.A0F(r10)
            goto L_0x03ac
        L_0x0389:
            java.util.Iterator r2 = r1.iterator()
        L_0x038d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03b1
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r9.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x038d
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x038d
            X.0sr.A1S()
        L_0x03ac:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03b1:
            if (r5 != r6) goto L_0x0058
            X.3t3 r2 = r7.A0P
            if (r2 == 0) goto L_0x0058
            X.3t0 r0 = X.C300965yF.A01(r2)
            java.lang.String r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r9.A04 = r1
            java.lang.Class<X.1jb> r0 = X.C66111jb.class
            X.MaY r7 = X.C66669Mac.A08(r3, r0)
            X.3t0 r0 = X.C300965yF.A01(r2)
            java.lang.String r5 = r0.A00
            java.lang.String r2 = r9.A02
            java.lang.String r0 = r9.A03
            X.0qQ.A0B(r7, r6)
            X.0qQ.A0B(r5, r8)
            X.1jb r1 = new X.1jb
            r1.<init>(r7)
            r1.A02 = r5
            r1.A01 = r2
            r1.A00 = r0
            X.1Ou r0 = X.1Ou.A01(r3)
            r0.A0A(r1)
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332137Tu.invoke():java.lang.Object");
    }
}
