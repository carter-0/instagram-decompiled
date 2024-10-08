package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.MFv  reason: case insensitive filesystem */
public final class C66158MFv extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66158MFv(LRW lrw, IGAIAgentType iGAIAgentType, C62625Kiw kiw, Integer num, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass4D7 r12, int i) {
        super(2, r12);
        this.A01 = 0;
        this.A03 = lrw;
        this.A00 = i;
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A05 = num;
        this.A02 = iGAIAgentType;
        this.A07 = str6;
        this.A04 = kiw;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MFv, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFv, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        AnonymousClass4JK r2;
        String str;
        String str2;
        GPK gpk;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        Integer num2;
        int i;
        AnonymousClass4D7 r11 = r15;
        switch (this.A01) {
            case 0:
                int i2 = this.A00;
                String str7 = this.A09;
                String str8 = this.A06;
                String str9 = this.A08;
                String str10 = this.A0A;
                String str11 = this.A0B;
                IGAIAgentType iGAIAgentType = (IGAIAgentType) this.A02;
                String str12 = this.A07;
                return new C66158MFv((LRW) this.A03, iGAIAgentType, (C62625Kiw) this.A04, (Integer) this.A05, str7, str8, str9, str10, str11, str12, r11, i2);
            case 1:
                r2 = (AnonymousClass4JK) this.A05;
                str = this.A09;
                str2 = this.A0A;
                gpk = (GPK) this.A03;
                str3 = this.A06;
                str4 = this.A08;
                str5 = this.A0B;
                num = (Integer) this.A04;
                str6 = this.A07;
                num2 = (Integer) this.A02;
                i = 1;
                break;
            default:
                r2 = (AnonymousClass4JK) this.A05;
                str = this.A09;
                str2 = this.A0A;
                gpk = (GPK) this.A03;
                str3 = this.A06;
                str4 = this.A08;
                str5 = this.A0B;
                num = (Integer) this.A04;
                str6 = this.A07;
                num2 = (Integer) this.A02;
                i = 2;
                break;
        }
        return new C66158MFv(gpk, r2, num, num2, str, str2, str3, str4, str5, str6, r11, i);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MFv, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.contentnotes.data.OptimisticNetworkOperation] */
    /* JADX WARNING: type inference failed for: r15v8, types: [X.H8r] */
    /* JADX WARNING: type inference failed for: r15v9, types: [X.H8t] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        X.0eS.A00(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c9, code lost:
        r10.A00 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00cf, code lost:
        if (r0.A00(r10) != r12) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d1, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0184, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r10 = r28
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x0066;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Hj r12 = X.1Hj.A02
            int r0 = r10.A00
            r14 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r14) goto L_0x0074
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0015:
            X.0eS.A00(r29)
            java.lang.Object r15 = r10.A05
            X.4JK r15 = (X.AnonymousClass4JK) r15
            com.instagram.common.session.UserSession r0 = r15.A00
            r16 = r0
            X.0eM r0 = r15.A02
            java.lang.Object r13 = r0.getValue()
            com.instagram.direct.inbox.notes.NotesApi r13 = (com.instagram.direct.inbox.notes.NotesApi) r13
            java.lang.String r11 = r10.A09
            java.lang.String r9 = r10.A0A
            java.lang.Object r8 = r10.A03
            X.GPK r8 = (X.GPK) r8
            java.lang.String r7 = r10.A06
            java.lang.String r6 = r10.A08
            java.lang.String r5 = r10.A0B
            java.lang.Object r4 = r10.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r3 = r10.A07
            java.lang.Object r2 = r10.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0 = 31
            X.PmN r1 = new X.PmN
            r1.<init>(r9, r15, r0)
            X.H8t r0 = new X.H8t
            r27 = r1
            r25 = r5
            r26 = r3
            r23 = r7
            r24 = r6
            r21 = r11
            r22 = r9
            r19 = r4
            r20 = r2
            r17 = r16
            r18 = r13
            r15 = r0
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x00c9
        L_0x0066:
            X.1Hj r12 = X.1Hj.A02
            int r0 = r10.A00
            r14 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 == r14) goto L_0x0074
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0074:
            X.0eS.A00(r29)
            goto L_0x0182
        L_0x0079:
            X.0eS.A00(r29)
            java.lang.Object r15 = r10.A05
            X.4JK r15 = (X.AnonymousClass4JK) r15
            com.instagram.common.session.UserSession r0 = r15.A00
            r16 = r0
            X.0eM r0 = r15.A02
            java.lang.Object r13 = r0.getValue()
            com.instagram.direct.inbox.notes.NotesApi r13 = (com.instagram.direct.inbox.notes.NotesApi) r13
            java.lang.String r11 = r10.A09
            java.lang.String r9 = r10.A0A
            java.lang.Object r8 = r10.A03
            X.GPK r8 = (X.GPK) r8
            java.lang.String r7 = r10.A06
            java.lang.String r6 = r10.A08
            java.lang.String r5 = r10.A0B
            java.lang.Object r4 = r10.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r3 = r10.A07
            java.lang.Object r2 = r10.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0 = 30
            X.PmN r1 = new X.PmN
            r1.<init>(r9, r15, r0)
            X.H8r r0 = new X.H8r
            r27 = r1
            r25 = r5
            r26 = r3
            r23 = r7
            r24 = r6
            r21 = r11
            r22 = r9
            r19 = r4
            r20 = r2
            r17 = r16
            r18 = r13
            r15 = r0
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x00c9:
            r10.A00 = r14
            java.lang.Object r0 = r0.A00(r10)
            if (r0 != r12) goto L_0x0182
            return r12
        L_0x00d2:
            X.0eS.A00(r29)
            java.lang.Object r5 = r10.A03
            X.LRW r5 = (X.LRW) r5
            int r14 = r10.A00
            java.lang.String r4 = r10.A09
            java.lang.String r7 = r10.A06
            java.lang.String r13 = r10.A08
            java.lang.String r12 = r10.A0A
            java.lang.String r2 = r10.A0B
            java.lang.Object r1 = r10.A05
            java.lang.Object r9 = r10.A02
            com.instagram.api.schemas.IGAIAgentType r9 = (com.instagram.api.schemas.IGAIAgentType) r9
            java.lang.String r8 = r10.A07
            java.lang.Object r6 = r10.A04
            X.Kiw r6 = (X.C62625Kiw) r6
            java.lang.String r0 = "screen"
            X.AnonymousClass7TG.A1R(r12, r2)
            X.1Ln r3 = X.LRW.A00(r5)
            boolean r10 = X.DbT.A1Y(r3)
            if (r10 == 0) goto L_0x0182
            java.lang.String r10 = "ai_home_agent_impression"
            r3.A0l(r10)
            r11 = 10
            java.lang.String r15 = r5.A01
            java.lang.String r10 = "entry_point"
            X.0eP r15 = X.AnonymousClass7TE.A1L(r10, r15)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r10 = "index"
            X.0eP r16 = X.AnonymousClass7TE.A1L(r10, r14)
            java.lang.String r10 = "persona_name"
            X.0eP r17 = X.AnonymousClass7TE.A1L(r10, r13)
            X.0eP r18 = X.AnonymousClass7TE.A1L(r0, r12)
            java.lang.String r0 = "section_name"
            X.0eP r19 = X.AnonymousClass7TE.A1L(r0, r2)
            r0 = 0
            if (r1 == 0) goto L_0x0187
            java.lang.String r10 = r1.toString()
        L_0x0130:
            java.lang.String r2 = ""
            if (r10 != 0) goto L_0x0135
            r10 = r2
        L_0x0135:
            java.lang.String r1 = "section_index"
            X.0eP r20 = X.AnonymousClass7TE.A1L(r1, r10)
            if (r9 == 0) goto L_0x0141
            java.lang.String r9 = r9.A00
            if (r9 != 0) goto L_0x0142
        L_0x0141:
            r9 = r2
        L_0x0142:
            java.lang.String r1 = "agent_type"
            X.0eP r21 = X.AnonymousClass7TE.A1L(r1, r9)
            if (r8 != 0) goto L_0x014b
            r8 = r2
        L_0x014b:
            java.lang.String r1 = "creator_igid"
            X.0eP r22 = X.AnonymousClass7TE.A1L(r1, r8)
            if (r7 == 0) goto L_0x0154
            r2 = r7
        L_0x0154:
            java.lang.String r1 = "bot_id"
            X.0eP r23 = X.AnonymousClass7TE.A1L(r1, r2)
            if (r6 == 0) goto L_0x0185
            java.lang.String r2 = r6.name()
        L_0x0160:
            java.lang.String r1 = "display_type"
            X.0eP r24 = X.AnonymousClass7TE.A1L(r1, r2)
            X.0eP[] r1 = new X.0eP[]{r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r1)
            r3.A0x(r1)
            if (r4 == 0) goto L_0x0177
            java.lang.Long r0 = X.00y.A0n(r11, r4)
        L_0x0177:
            r3.A0j(r0)
            java.lang.String r0 = r5.A02
            r3.A0v(r0)
            r3.Cgf()
        L_0x0182:
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x0185:
            r2 = r0
            goto L_0x0160
        L_0x0187:
            r10 = r0
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66158MFv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66158MFv) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66158MFv(GPK gpk, AnonymousClass4JK r3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass4D7 r12, int i) {
        super(2, r12);
        this.A01 = i;
        this.A05 = r3;
        this.A09 = str;
        this.A0A = str2;
        this.A03 = gpk;
        this.A06 = str3;
        this.A08 = str4;
        this.A0B = str5;
        this.A04 = num;
        this.A07 = str6;
        this.A02 = num2;
    }
}
