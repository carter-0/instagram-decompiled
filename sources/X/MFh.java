package X;

public final class MFh extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFh(L31 l31, String str, AnonymousClass4D7 r4, boolean z) {
        super(2, r4);
        this.A02 = 6;
        this.A03 = l31;
        this.A04 = str;
        this.A05 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MFh, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MFh, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        boolean z;
        int i;
        String str;
        Object obj2;
        Object obj3;
        AnonymousClass4D7 r7 = r12;
        switch (this.A02) {
            case 0:
                obj3 = this.A03;
                obj2 = this.A01;
                str = this.A04;
                z = this.A05;
                i = 0;
                break;
            case 1:
                obj3 = this.A03;
                str = this.A04;
                z = this.A05;
                obj2 = this.A01;
                i = 1;
                break;
            case 2:
                obj3 = this.A03;
                str = this.A04;
                z = this.A05;
                obj2 = this.A01;
                i = 2;
                break;
            case 3:
                obj3 = this.A03;
                str = this.A04;
                obj2 = this.A01;
                z = this.A05;
                i = 3;
                break;
            case 4:
                obj3 = this.A03;
                obj2 = this.A01;
                str = this.A04;
                z = this.A05;
                i = 4;
                break;
            case 5:
                obj3 = this.A03;
                obj2 = this.A01;
                str = this.A04;
                z = this.A05;
                i = 5;
                break;
            default:
                ? mFh = new MFh((L31) this.A03, this.A04, r12, this.A05);
                mFh.A01 = obj;
                return mFh;
        }
        return new MFh(obj3, obj2, str, r7, i, z);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MFh, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014d, code lost:
        X.0eS.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        if (r0 != r3) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0178, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ea, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x013f;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x017e;
                case 4: goto L_0x0033;
                case 5: goto L_0x0114;
                case 6: goto L_0x00d0;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r4 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r4) goto L_0x014d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0013:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A03
            X.JfV r0 = (X.C60089JfV) r0
            X.05G r2 = r0.A01
            java.lang.String r1 = r10.A04
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r10.A01
        L_0x0024:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            r10.A00 = r4
            java.lang.Object r0 = r2.emit(r0, r10)
            goto L_0x0176
        L_0x0030:
            X.0sn r0 = X.0sn.A00
            goto L_0x0024
        L_0x0033:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 != r5) goto L_0x00cb
            X.0eS.A00(r11)
        L_0x003f:
            X.3Ii r11 = (X.C239803Ii) r11
            java.lang.Object r3 = r10.A03
            X.KWg r3 = (X.C62030KWg) r3
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006d
            X.3Ih r11 = (X.C239793Ih) r11
            java.lang.Object r0 = r11.A00
            X.CFI r0 = (X.CFI) r0
            X.05G r2 = r3.A02
            java.util.List r1 = r0.A00
            X.KRL r0 = new X.KRL
            r0.<init>(r1)
            X.3Ih r11 = X.Dba.A0S(r0, r2)
        L_0x005c:
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c6
            X.05G r1 = r3.A02
            X.KRM r0 = X.KRM.A00
            r1.Epw(r0)
            goto L_0x01e8
        L_0x006d:
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0076:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A03
            X.KWg r0 = (X.C62030KWg) r0
            X.05G r1 = r0.A02
            X.KRO r0 = X.KRO.A00
            r1.Epw(r0)
            java.lang.Object r0 = r10.A01
            X.0lg r0 = (X.0lg) r0
            java.lang.String r6 = r10.A04
            boolean r4 = r10.A05
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "direct_v2/get_all_channels/"
            r2.A0A(r0)
            java.lang.Class<X.CFI> r1 = X.CFI.class
            java.lang.Class<X.D1D> r0 = X.D1D.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = "user_id"
            r2.A9m(r0, r6)
            if (r4 == 0) goto L_0x00b6
            r0 = 29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r1 = X.C51970G9q.A0k(r0)
            java.lang.String r0 = "thread_subtypes"
            r2.A9m(r0, r1)
        L_0x00b6:
            X.1OC r1 = r2.A0M()
            r10.A00 = r5
            r0 = 422279554(0x192b7982, float:8.865031E-24)
            java.lang.Object r11 = r1.A00(r0, r10)
            if (r11 != r3) goto L_0x003f
            return r3
        L_0x00c6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d0:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00eb
            if (r0 != r4) goto L_0x014d
            java.lang.Object r0 = r10.A01
            X.02o r1 = X.JTO.A1H(r0, r11)
        L_0x00e0:
            r0 = 0
            r10.A01 = r0
            r10.A00 = r2
            java.lang.Object r0 = r1.emit(r11, r10)
            goto L_0x0176
        L_0x00eb:
            X.0eS.A00(r11)
            java.lang.Object r1 = r10.A01
            X.02o r1 = (X.02o) r1
            java.lang.Object r0 = r10.A03
            X.L31 r0 = (X.L31) r0
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r5 = r0.A00
            java.lang.String r6 = r10.A04
            boolean r9 = r10.A05
            r10.A01 = r1
            r10.A00 = r4
            X.12T r0 = X.AnonymousClass12T.A00
            r7 = 0
            X.0nV r0 = X.DbX.A0c(r0)
            r8 = 0
            X.MFc r4 = new X.MFc
            r4.<init>((java.lang.Object) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (int) r8, (boolean) r9)
            java.lang.Object r11 = X.1Eo.A00(r10, r0, r4)
            if (r11 != r3) goto L_0x00e0
            return r3
        L_0x0114:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r6 = 1
            if (r0 == 0) goto L_0x0122
            if (r0 == r6) goto L_0x014d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0122:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A03
            X.Dky r0 = (X.C46771Dky) r0
            X.3ju r5 = r0.A04
            java.lang.Object r4 = r10.A01
            com.instagram.api.schemas.UserMonetizationProductType r4 = (com.instagram.api.schemas.UserMonetizationProductType) r4
            java.lang.String r2 = r10.A04
            boolean r1 = r10.A05
            X.EUV r0 = new X.EUV
            r0.<init>(r4, r2, r1)
            r10.A00 = r6
            java.lang.Object r0 = r5.ELH(r0, r10)
            goto L_0x0176
        L_0x013f:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x0152
            if (r0 == r5) goto L_0x014d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014d:
            X.0eS.A00(r11)
            goto L_0x01e8
        L_0x0152:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A03
            com.instagram.archive.data.ArchiveStoryRepository r0 = (com.instagram.archive.data.ArchiveStoryRepository) r0
            com.instagram.common.session.UserSession r4 = r0.A03
            java.lang.Object r0 = r10.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x0179
            java.lang.String r1 = r10.A04
            boolean r0 = r10.A05
            r10.A00 = r5
            X.1OC r1 = X.AnonymousClass738.A04(r4, r2, r1, r0)
            r0 = 953251634(0x38d17732, float:9.9880985E-5)
            java.lang.Object r0 = r1.A00(r0, r10)
        L_0x0176:
            if (r0 != r3) goto L_0x01e8
            return r3
        L_0x0179:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x017e:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x02f0
            if (r0 != r5) goto L_0x030f
            X.0eS.A00(r11)
        L_0x018a:
            X.3Ii r11 = (X.C239803Ii) r11
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0251
            java.lang.Object r3 = r10.A03
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r3 = (com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel) r3
            X.LDR r1 = r3.logger
            java.lang.Object r6 = r10.A01
            com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r6 = (com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.KkE r5 = r6.A00
            if (r5 != 0) goto L_0x020b
            java.lang.String r1 = "SuggestedRepliesLogger"
            r0 = 223(0xdf, float:3.12E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0E(r1, r0)
        L_0x01ad:
            java.lang.String r2 = r10.A04
            X.3Ih r11 = (X.C239793Ih) r11
            java.lang.Object r1 = r11.A00
            X.JwJ r1 = (X.C61081JwJ) r1
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r6 = r1.A00
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            X.05G r5 = r3._uiState
            if (r0 == 0) goto L_0x01eb
        L_0x01c9:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Object r2 = r0.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r0.A03
            X.7L2 r1 = (X.AnonymousClass7L2) r1
            X.AnonymousClass7TG.A1T(r2, r3, r6)
            X.JwC r0 = new X.JwC
            r0.<init>((X.AnonymousClass7L2) r1, (java.lang.Integer) r2, (java.lang.Integer) r3, (java.util.List) r6)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x01c9
        L_0x01e8:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x01eb:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.lang.Object r2 = r0.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r0.A03
            X.7L2 r1 = (X.AnonymousClass7L2) r1
            X.AnonymousClass7TG.A1T(r2, r3, r6)
            X.JwC r0 = new X.JwC
            r0.<init>((X.AnonymousClass7L2) r1, (java.lang.Integer) r2, (java.lang.Integer) r3, (java.util.List) r6)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x01eb
            goto L_0x01e8
        L_0x020b:
            X.0wc r1 = r1.A03
            java.lang.String r0 = "ig_creator_agents_suggested_replies_response_received_sr_message"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x01ad
            java.lang.String r2 = r6.A02
            java.lang.String r1 = ""
            if (r2 != 0) goto L_0x0220
            r2 = r1
        L_0x0220:
            java.lang.String r0 = "sr_session_id"
            r4.AAJ(r0, r2)
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x022a
            r1 = r0
        L_0x022a:
            java.lang.String r0 = "thread_session_id"
            r4.AAJ(r0, r1)
            X.Jqs r2 = new X.Jqs
            r2.<init>()
            X.KkF r1 = X.C62653KkF.SERVER
            java.lang.String r0 = "response_from"
            r2.A01(r1, r0)
            java.lang.String r0 = "sr_context"
            r4.AAK(r2, r0)
            java.lang.String r0 = "inbox_type"
            r4.A8M(r5, r0)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "sr_request_id"
            r4.AAJ(r0, r1)
            r4.Cgf()
            goto L_0x01ad
        L_0x0251:
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 == 0) goto L_0x030a
            java.lang.Object r4 = r10.A03
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r4 = (com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel) r4
            X.LDR r1 = r4.logger
            java.lang.Object r5 = r10.A01
            com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r5 = (com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) r5
            r0 = 3883(0xf2b, float:5.441E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.KkE r2 = r5.A00
            if (r2 != 0) goto L_0x029f
            java.lang.String r1 = "SuggestedRepliesLogger"
            r0 = 223(0xdf, float:3.12E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0E(r1, r0)
        L_0x0278:
            X.05G r6 = r4._uiState
        L_0x027a:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.Object r3 = r0.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A03
            X.7L2 r1 = (X.AnonymousClass7L2) r1
            X.AnonymousClass7TG.A1T(r3, r4, r2)
            X.JwC r0 = new X.JwC
            r0.<init>((X.AnonymousClass7L2) r1, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.util.List) r2)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x027a
            goto L_0x01e8
        L_0x029f:
            X.0wc r1 = r1.A03
            java.lang.String r0 = "ig_creator_agents_suggested_replies_error"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0278
            java.lang.String r0 = "inbox_type"
            r3.A8M(r2, r0)
            java.lang.String r1 = r5.A02
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x02b9
            r1 = r2
        L_0x02b9:
            java.lang.String r0 = "sr_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r5.A03
            if (r1 != 0) goto L_0x02c3
            r1 = r2
        L_0x02c3:
            java.lang.String r0 = "thread_session_id"
            r3.AAJ(r0, r1)
            X.Jqx r1 = new X.Jqx
            r1.<init>()
            java.lang.String r0 = "error_type"
            r1.A06(r0, r6)
            java.lang.String r0 = "error_message"
            r1.A06(r0, r2)
            r0 = 4032(0xfc0, float:5.65E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A06(r0, r2)
            java.lang.String r0 = "error_context"
            r3.AAK(r1, r0)
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "sr_request_id"
            r3.AAJ(r0, r1)
            r3.Cgf()
            goto L_0x0278
        L_0x02f0:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A03
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = (com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel) r0
            com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository r4 = r0.repository
            java.lang.String r2 = r10.A04
            java.lang.Object r1 = r10.A01
            com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r1 = (com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) r1
            boolean r0 = r10.A05
            r10.A00 = r5
            java.lang.Object r11 = r4.A00(r1, r2, r10, r0)
            if (r11 != r3) goto L_0x018a
            return r3
        L_0x030a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x030f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFh) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFh(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A05 = z;
    }
}
