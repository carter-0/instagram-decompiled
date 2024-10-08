package X;

public final class MEe extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEe(Object obj, String str, String str2, String str3, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEe, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        String str;
        String str2;
        String str3;
        Object obj2;
        int i;
        AnonymousClass4D7 r5 = r9;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                str3 = this.A05;
                str = this.A03;
                str2 = this.A04;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                str = this.A03;
                str3 = this.A05;
                str2 = this.A04;
                i = 1;
                break;
            case 2:
                str = this.A03;
                str2 = this.A04;
                str3 = this.A05;
                obj2 = this.A02;
                i = 2;
                break;
            default:
                obj2 = this.A02;
                str2 = this.A04;
                str3 = this.A05;
                str = this.A03;
                i = 3;
                break;
        }
        return new MEe(obj2, str3, str, str2, r5, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MEe, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010d, code lost:
        if (r0 != r1) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0174, code lost:
        X.0eS.A00(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0179, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            int r3 = r0.A01
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r13 = 1
            switch(r3) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x009e;
                case 2: goto L_0x004e;
                default: goto L_0x000c;
            }
        L_0x000c:
            if (r2 == 0) goto L_0x0016
            X.0eS.A00(r27)
        L_0x0011:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0016:
            X.0eS.A00(r27)
            java.lang.Object r7 = r0.A02
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r7 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r7
            java.lang.String r6 = r0.A04
            X.Lio r4 = r7.A07
            X.05G r2 = r7.A0E
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0049
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r6)
            java.util.Map r2 = r4.A02
            java.lang.Object r5 = r2.get(r3)
            X.0pa r5 = (X.C61770pa) r5
            if (r5 == 0) goto L_0x0177
            java.lang.String r4 = r0.A05
            java.lang.String r3 = r0.A03
            X.FxP r2 = new X.FxP
            r2.<init>(r7, r6, r4, r3)
            r0.A00 = r13
            java.lang.Object r0 = r5.collect(r2, r0)
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x0049:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x004e:
            if (r2 != 0) goto L_0x0174
            X.0eS.A00(r27)
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r14 = 0
            java.lang.String r3 = r0.A03
            java.lang.String r2 = "item_id"
            X.0Df r5 = X.C41845B3m.A03(r4, r3, r2)
            java.lang.String r3 = r0.A04
            java.lang.String r2 = "otid"
            X.0Df.A00(r5, r3, r2)
            java.lang.String r3 = r0.A05
            java.lang.String r2 = "thread_id"
            X.2IS r4 = X.JTQ.A0D(r5, r3, r2)
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.String r2 = "input"
            X.1vR r8 = X.C41847B3o.A04(r5, r4, r2)
            java.util.Map r10 = r4.getParamsCopy()
            java.util.Map r11 = r3.getParamsCopy()
            java.lang.Class<X.Bi9> r12 = X.C42773Bi9.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGDScheduledMessageSendNowMutation"
            r15 = 0
            java.lang.String r17 = "xig_igd_scheduled_message_send_now"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r0.A02
            X.KWZ r2 = (X.KWZ) r2
            X.1vn r2 = r2.A02
            r0.A00 = r13
            java.lang.Object r0 = r2.A04(r7, r0)
            goto L_0x010d
        L_0x009e:
            if (r2 != 0) goto L_0x0174
            X.0eS.A00(r27)
            java.lang.Object r2 = r0.A02
            X.GhM r2 = (X.C53031GhM) r2
            X.HrB r5 = r2.A01
            java.lang.String r4 = r0.A03
            java.lang.String r3 = r0.A05
            java.lang.String r2 = r0.A04
            r0.A00 = r13
            java.lang.Object r0 = r5.A00(r4, r3, r2, r0)
            goto L_0x010d
        L_0x00b6:
            if (r2 != 0) goto L_0x0174
            X.0eS.A00(r27)
            java.lang.Object r5 = r0.A02
            X.KWh r5 = (X.C62031KWh) r5
            X.Kzt r6 = r5.A00
            java.lang.String r12 = r0.A05
            java.lang.String r11 = r0.A03
            java.lang.String r10 = r0.A04
            r3 = 0
            X.AnonymousClass7TF.A1B(r12, r3, r10)
            r2 = 3478(0xd96, float:4.874E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0110
            r2 = 3498(0xdaa, float:4.902E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0110
            java.lang.String r2 = "Invalid Operation Type"
            X.5sO r2 = X.C41845B3m.A0c(r2)
            X.0rr r4 = new X.0rr
            r4.<init>(r2)
        L_0x00ee:
            r6 = 0
            r3 = 45
            X.MGZ r2 = new X.MGZ
            r2.<init>(r5, r6, r3)
            X.7zl r3 = X.C349197zk.A00(r2, r4)
            r2 = 20
            X.MC9 r4 = X.MC9.A00(r3, r2)
            r3 = 46
            X.MGZ r2 = new X.MGZ
            r2.<init>(r5, r6, r3)
            r0.A00 = r13
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r4)
        L_0x010d:
            if (r0 != r1) goto L_0x0177
            return r1
        L_0x0110:
            r4 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r2 = "thread_id"
            X.0Df r7 = X.C41845B3m.A03(r7, r12, r2)
            java.lang.String r2 = "blend_id"
            X.0Df.A00(r7, r11, r2)
            r2 = 2704(0xa90, float:3.789E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0Df.A00(r7, r10, r2)
            java.lang.String r2 = "data"
            X.1vR r15 = X.C41847B3o.A04(r7, r8, r2)
            java.util.Map r17 = r8.getParamsCopy()
            java.util.Map r18 = r9.getParamsCopy()
            java.lang.Class<X.Bd7> r19 = X.Bd7.class
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            java.lang.String r16 = "UpdateBlendMembership"
            java.lang.String r24 = "xdt_update_blend_membership"
            com.facebook.pando.PandoGraphQLRequest r14 = new com.facebook.pando.PandoGraphQLRequest
            r20 = r13
            r21 = r4
            r22 = r3
            r23 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.1vn r2 = r6.A00
            X.032 r7 = r2.A05(r14)
            r2 = 49
            X.JVD r6 = new X.JVD
            r6.<init>(r2, r4)
            r2 = 24
            X.MCA r3 = new X.MCA
            r3.<init>((X.0sL) r6, (X.AnonymousClass0r6) r7, (int) r2)
            X.MG0 r2 = new X.MG0
            r2.<init>(r4)
            X.7qX r4 = new X.7qX
            r4.<init>(r2, r3)
            goto L_0x00ee
        L_0x0174:
            X.0eS.A00(r27)
        L_0x0177:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MEe) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
