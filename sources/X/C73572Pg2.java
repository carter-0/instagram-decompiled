package X;

/* renamed from: X.Pg2  reason: case insensitive filesystem */
public final class C73572Pg2 extends AnonymousClass1Ek implements 0sH {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73572Pg2(Object obj, AnonymousClass4D7 r3, int i) {
        super(6, r3);
        this.A05 = i;
        this.A06 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7;
        int i;
        AnonymousClass4D7 r9 = (AnonymousClass4D7) obj6;
        switch (this.A05) {
            case 0:
                obj7 = this.A06;
                i = 0;
                break;
            case 1:
                obj7 = this.A06;
                i = 1;
                break;
            default:
                obj7 = this.A06;
                i = 2;
                break;
        }
        C73572Pg2 pg2 = new C73572Pg2(obj7, r9, i);
        pg2.A00 = obj;
        pg2.A01 = obj2;
        pg2.A02 = obj3;
        pg2.A03 = obj4;
        pg2.A04 = obj5;
        return pg2.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026e, code lost:
        if (r3 != null) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0304, code lost:
        if (r2.A01.A07 != false) goto L_0x0306;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r19
            int r0 = r5.A05
            X.0eS.A00(r20)
            switch(r0) {
                case 0: goto L_0x0247;
                case 1: goto L_0x0280;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r11 = r5.A00
            X.NpC r11 = (X.C69630NpC) r11
            java.lang.Object r9 = r5.A01
            X.NpD r9 = (X.C69631NpD) r9
            java.lang.Object r2 = r5.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r8 = r5.A03
            java.lang.Object r14 = r5.A04
            X.N4N r14 = (X.N4N) r14
            java.lang.Object r5 = r5.A06
            X.MuC r5 = (X.C67757MuC) r5
            X.01N r4 = X.0jo.A1H()
            boolean r0 = r2.isEmpty()
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007d
            X.N4N r0 = X.C67757MuC.A01(r5)
            java.lang.Integer r1 = r0.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x007d
            boolean r0 = r9 instanceof X.Ng6
            if (r0 == 0) goto L_0x007d
            boolean r0 = r11 instanceof X.Ng4
            if (r0 == 0) goto L_0x007d
            boolean r0 = r8 instanceof X.Ng1
            if (r0 == 0) goto L_0x007d
            X.N4N r0 = X.C67757MuC.A01(r5)
            r0.A01 = r6
            r2 = 2131968421(0x7f1341a5, float:1.9573736E38)
            java.lang.String r0 = r5.A0E
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            X.HsR r0 = new X.HsR
            r0.<init>(r1, r2)
            X.UqI r1 = new X.UqI
            r1.<init>(r0)
            r6 = 0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            X.5qz r0 = new X.5qz
            r0.<init>(r3, r3)
            r5.add(r1)
            r2.put(r1, r0)
            r1 = 3
            X.5r0 r0 = new X.5r0
            r0.<init>(r6, r5, r2, r1)
            r4.add(r0)
        L_0x0078:
            X.01N r8 = X.0jo.A1I(r4)
            return r8
        L_0x007d:
            boolean r0 = r11 instanceof X.Ng2
            java.lang.String r18 = "inform_module_resource"
            java.lang.String r10 = "server_results"
            if (r0 == 0) goto L_0x00c7
            r0 = r11
            X.Ng2 r0 = (X.Ng2) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r0.iterator()
            r15 = 0
        L_0x0093:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r12 = r17.next()
            int r16 = r15 + 1
            if (r15 < 0) goto L_0x023f
            int r7 = r4.size()
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r0 = r18
            r1.A09 = r0
            X.N4N r0 = X.C67757MuC.A01(r5)
            java.lang.String r0 = r0.A0F
            r1.A06 = r0
            r1.A05 = r10
            X.5r0 r0 = X.C67757MuC.A00(r1, r5, r12, r7, r15)
            if (r0 == 0) goto L_0x00c1
            r13.add(r0)
        L_0x00c1:
            r15 = r16
            goto L_0x0093
        L_0x00c4:
            r4.addAll(r13)
        L_0x00c7:
            boolean r0 = r14.A0N
            if (r0 != 0) goto L_0x0078
            boolean r0 = r9 instanceof X.Ng5
            java.lang.String r13 = "server"
            if (r0 == 0) goto L_0x0115
            X.Ng5 r9 = (X.Ng5) r9
            java.util.List r0 = r9.A00
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r0.iterator()
            r14 = 0
        L_0x00de:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r9 = r16.next()
            int r15 = r14 + 1
            if (r14 < 0) goto L_0x023f
            int r7 = r4.size()
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r1.A09 = r13
            java.lang.String r0 = "SEE_MORE"
            r1.A08 = r0
            X.N4N r0 = X.C67757MuC.A01(r5)
            java.lang.String r0 = r0.A0F
            r1.A06 = r0
            r1.A05 = r10
            r1.A0E = r6
            X.5r0 r0 = X.C67757MuC.A00(r1, r5, r9, r7, r14)
            if (r0 == 0) goto L_0x0110
            r12.add(r0)
        L_0x0110:
            r14 = r15
            goto L_0x00de
        L_0x0112:
            r4.addAll(r12)
        L_0x0115:
            boolean r0 = X.0u4.A08(r2)
            if (r0 != 0) goto L_0x011f
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r2)
        L_0x011f:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r2.iterator()
            r14 = 0
        L_0x0128:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r9 = r15.next()
            int r7 = r14 + 1
            if (r14 < 0) goto L_0x023f
            int r2 = r4.size()
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r1.A09 = r13
            X.N4N r0 = X.C67757MuC.A01(r5)
            java.lang.String r0 = r0.A0F
            r1.A06 = r0
            r1.A05 = r10
            X.5r0 r0 = X.C67757MuC.A00(r1, r5, r9, r2, r14)
            if (r0 == 0) goto L_0x0154
            r12.add(r0)
        L_0x0154:
            r14 = r7
            goto L_0x0128
        L_0x0156:
            r4.addAll(r12)
            boolean r0 = r11 instanceof X.Ng3
            if (r0 == 0) goto L_0x019d
            X.Ng3 r11 = (X.Ng3) r11
            java.util.List r0 = r11.A00
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
        L_0x016a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x019a
            java.lang.Object r9 = r13.next()
            int r7 = r12 + 1
            if (r12 < 0) goto L_0x023f
            int r2 = r4.size()
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r0 = r18
            r1.A09 = r0
            X.N4N r0 = X.C67757MuC.A01(r5)
            java.lang.String r0 = r0.A0F
            r1.A06 = r0
            r1.A05 = r10
            X.5r0 r0 = X.C67757MuC.A00(r1, r5, r9, r2, r12)
            if (r0 == 0) goto L_0x0198
            r11.add(r0)
        L_0x0198:
            r12 = r7
            goto L_0x016a
        L_0x019a:
            r4.addAll(r11)
        L_0x019d:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            boolean r0 = r8 instanceof X.C69175Nfy
            r7 = 0
            if (r0 == 0) goto L_0x01df
            X.OFd r0 = r5.A0D
            java.lang.String r1 = r0.A02
            int r0 = r0.A00
        L_0x01ac:
            X.UqM r7 = new X.UqM
            r7.<init>(r1, r0, r3)
        L_0x01b1:
            r2.add(r7)
        L_0x01b4:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r2.iterator()
            r7 = 0
        L_0x01bd:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r6 = r8.next()
            int r2 = r7 + 1
            if (r7 < 0) goto L_0x023f
            int r1 = r4.size()
            X.Mfz r0 = new X.Mfz
            r0.<init>()
            X.5r0 r0 = X.C67757MuC.A00(r0, r5, r6, r1, r7)
            if (r0 == 0) goto L_0x01dd
            r9.add(r0)
        L_0x01dd:
            r7 = r2
            goto L_0x01bd
        L_0x01df:
            boolean r0 = r8 instanceof X.C69176Nfz
            if (r0 == 0) goto L_0x021a
            java.lang.String r1 = r5.A0G
            java.lang.String r0 = "top_serp"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x020e
            java.lang.String r0 = "clips_serp_page"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x020e
            X.N4N r0 = X.C67757MuC.A01(r5)
            int r0 = r0.A04
            if (r0 != 0) goto L_0x020e
        L_0x01fd:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.TxC r0 = new X.TxC
            r0.<init>(r1)
            r2.add(r0)
            int r7 = r7 + 1
            r0 = 10
            if (r7 >= r0) goto L_0x01b4
            goto L_0x01fd
        L_0x020e:
            X.OFd r0 = r5.A0D
            java.lang.String r1 = r0.A03
            int r0 = r0.A01
            X.UqM r7 = new X.UqM
            r7.<init>(r1, r0, r6)
            goto L_0x01b1
        L_0x021a:
            boolean r0 = r8 instanceof X.Ng0
            if (r0 == 0) goto L_0x0225
            X.OFd r0 = r5.A0D
            java.lang.String r1 = r0.A03
            int r0 = r0.A01
            goto L_0x01ac
        L_0x0225:
            boolean r0 = r8 instanceof X.Ng1
            if (r0 != 0) goto L_0x01b4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x022e:
            r4.addAll(r9)
            X.Mmf r2 = X.C67363Mmf.A00
            r1 = 21
            X.To0 r0 = new X.To0
            r0.<init>(r5, r1)
            r2.A00(r4, r0, r3)
            goto L_0x0078
        L_0x023f:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0247:
            java.lang.Object r10 = r5.A00
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r5.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r5.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = r5.A03
            X.EaK r9 = (X.C48178EaK) r9
            java.lang.Object r12 = r5.A04
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r2 = r5.A06
            X.EKq r2 = (X.C47870EKq) r2
            X.05G r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            X.EKm r0 = X.C47866EKm.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x027d
            r11 = r4
            if (r3 == 0) goto L_0x0271
        L_0x0270:
            r11 = r3
        L_0x0271:
            int r13 = r4.size()
            boolean r14 = r2.A05
            X.N4E r8 = new X.N4E
            r8.<init>((X.C48178EaK) r9, (java.lang.String) r10, (java.util.List) r11, (java.util.Map) r12, (int) r13, (boolean) r14)
            return r8
        L_0x027d:
            X.0sn r3 = X.0sn.A00
            goto L_0x0270
        L_0x0280:
            java.lang.Object r6 = r5.A00
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r2 = r5.A01
            X.N9H r2 = (X.N9H) r2
            java.lang.Object r1 = r5.A02
            X.OGE r1 = (X.OGE) r1
            java.lang.Object r10 = r5.A03
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r5.A04
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r5 = r0.A00
            com.instagram.rtc.rsys.models.EngineModel r5 = (com.instagram.rtc.rsys.models.EngineModel) r5
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0312
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0312
            if (r5 == 0) goto L_0x0312
            java.util.List r0 = r1.A02
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x02b2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r4 = r8.next()
            r7 = r4
            com.instagram.model.direct.DirectShareTarget r7 = (com.instagram.model.direct.DirectShareTarget) r7
            java.util.List r0 = X.DbW.A0m(r7)
            java.lang.Object r3 = X.00k.A0J(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r3
            r0 = 0
            if (r3 == 0) goto L_0x02d0
            java.lang.String r0 = r3.getId()
        L_0x02d0:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r7.A0L()
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r7.A0M()
            if (r0 != 0) goto L_0x02b2
            boolean r0 = r7.A0P()
            if (r0 != 0) goto L_0x02b2
            r13.add(r4)
            goto L_0x02b2
        L_0x02f0:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r5.callModel
            if (r0 == 0) goto L_0x0310
            boolean r0 = r0.inviteRequestedVideo
        L_0x02f6:
            java.lang.String r11 = r1.A01
            boolean r14 = r1.A04
            boolean r15 = r1.A03
            if (r0 != 0) goto L_0x0306
            X.N9E r0 = r2.A01
            boolean r0 = r0.A07
            r16 = 0
            if (r0 == 0) goto L_0x0308
        L_0x0306:
            r16 = 1
        L_0x0308:
            java.lang.String r12 = r1.A00
            X.N95 r8 = new X.N95
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x0310:
            r0 = 1
            goto L_0x02f6
        L_0x0312:
            X.0sn r13 = X.0sn.A00
            r12 = 0
            java.lang.String r10 = ""
            r14 = 0
            r16 = 1
            X.N95 r8 = new X.N95
            r11 = r10
            r15 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73572Pg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
