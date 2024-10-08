package X;

public final class MEk extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEk(Object obj, Object obj2, Object obj3, String str, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A01 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A06 = z;
        this.A03 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEk, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        boolean z;
        int i;
        AnonymousClass4D7 r5 = r10;
        switch (this.A01) {
            case 0:
                obj2 = this.A04;
                obj4 = this.A02;
                str = this.A05;
                z = this.A06;
                obj3 = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A03;
                obj4 = this.A02;
                z = this.A06;
                i = 1;
                break;
            default:
                obj3 = this.A03;
                z = this.A06;
                obj2 = this.A04;
                str = this.A05;
                obj4 = this.A02;
                i = 2;
                break;
        }
        return new MEk(obj2, obj4, obj3, str, r5, i, z);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MEk, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ea, code lost:
        if (r0 <= 0) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r12 = r21
            r5 = r22
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0147;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003e
            X.0eS.A00(r5)
        L_0x0014:
            boolean r2 = X.AnonymousClass7TE.A1a(r5)
            java.lang.Object r0 = r12.A04
            X.6dA r0 = (X.C311736dA) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Av r0 = X.1Au.A00(r0)
            r0.A0R()
            java.lang.Object r1 = r12.A02
            X.1P0 r1 = (X.1P0) r1
            if (r2 == 0) goto L_0x0036
            X.1XP r0 = new X.1XP
            r0.<init>()
            r1.onSuccess(r0)
        L_0x0033:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0036:
            X.4dn r0 = X.AnonymousClass7BQ.A00()
            r1.onFail(r0)
            goto L_0x0033
        L_0x003e:
            X.0eS.A00(r5)
            java.lang.Object r8 = r12.A03
            com.instagram.model.effect.AttributedAREffect r8 = (com.instagram.model.effect.AttributedAREffect) r8
            int r2 = r8.A00
            java.lang.String r9 = X.LPR.A02(r2)
            r1 = 10
            if (r2 == r1) goto L_0x0090
            r1 = 11
            if (r2 == r1) goto L_0x008d
            r6 = 0
        L_0x0054:
            boolean r2 = r12.A06
            java.lang.Object r1 = r12.A04
            X.6dA r1 = (X.C311736dA) r1
            if (r2 == 0) goto L_0x0072
            X.6dC r4 = r1.A01
            com.instagram.common.session.UserSession r7 = r1.A00
            java.lang.String r10 = r12.A05
            r5 = 0
            r12.A00 = r3
            r1 = 222(0xde, float:3.11E-43)
            java.lang.String r11 = X.C273654mx.A00(r1)
            java.lang.Object r5 = r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x006f:
            if (r5 != r0) goto L_0x0014
            return r0
        L_0x0072:
            X.6dC r13 = r1.A01
            com.instagram.common.session.UserSession r2 = r1.A00
            r14 = 0
            r12.A00 = r4
            r1 = 222(0xde, float:3.11E-43)
            java.lang.String r19 = X.C273654mx.A00(r1)
            r15 = r6
            r16 = r2
            r17 = r8
            r18 = r9
            r20 = r12
            java.lang.Object r5 = r13.A01(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x006f
        L_0x008d:
            X.28D r6 = X.28D.A3O
            goto L_0x0054
        L_0x0090:
            X.28D r6 = X.28D.A4E
            goto L_0x0054
        L_0x0093:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0117
            if (r1 != r3) goto L_0x01a6
            X.0eS.A00(r5)
        L_0x009f:
            java.lang.Object r6 = r12.A04
            X.K66 r6 = (X.K66) r6
            java.lang.Object r2 = r12.A02
            X.5kq r2 = (X.C293505kq) r2
            java.lang.String r8 = r12.A05
            boolean r9 = r12.A06
            java.lang.Object r5 = r12.A03
            android.content.Intent r5 = (android.content.Intent) r5
            X.3Q2 r1 = X.C61829KNs.A02(r6)
            if (r1 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r0 = X.JTP.A0S(r6, r3)
            int r7 = X.JTT.A07(r0, r1)
            X.JXu r1 = r2.A0G
            X.JXu r0 = X.JXu.A03
            boolean r10 = X.AnonymousClass7TF.A1W(r1, r0)
            X.0eM r0 = r6.A0T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.L4H r4 = X.C63209KtG.A00(r0)
            X.1QP r3 = r4.A01
            long r0 = r4.A00
            java.lang.String r2 = "is_older_draft"
            r3.flowAnnotate(r0, r2, r10)
            long r0 = r4.A00
            java.lang.String r2 = "share_to_feed"
            r3.flowAnnotate(r0, r2, r9)
            long r1 = r4.A00
            if (r8 == 0) goto L_0x00ec
            java.util.regex.Pattern r0 = X.0mp.A00
            int r0 = r8.length()
            r8 = 1
            if (r0 > 0) goto L_0x00ed
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            java.lang.String r0 = "has_caption"
            r3.flowAnnotate(r1, r0, r8)
            long r1 = r4.A00
            r0 = 822(0x336, float:1.152E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.flowAnnotate(r1, r0, r7)
            long r1 = r4.A00
            java.lang.String r0 = "MEDIA_POSTED"
            r3.flowMarkPoint(r1, r0)
            long r0 = r4.A00
            r3.flowEndSuccess(r0)
            X.8ZP r4 = r6.A02
            if (r4 != 0) goto L_0x012e
            java.lang.String r0 = "autoCreatedReelFlowsPerfLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0117:
            X.0eS.A00(r5)
            java.lang.Object r1 = r12.A04
            X.K66 r1 = (X.K66) r1
            r1.EvY()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = X.K66.A01(r1)
            r12.A00 = r3
            java.lang.Object r1 = r1.A04(r12)
            if (r1 != r0) goto L_0x009f
            return r0
        L_0x012e:
            X.1QP r3 = r4.A02
            long r1 = r4.A01
            java.lang.String r0 = "REELS_SHARE_SHEET_SHARE_SUCCESS"
            r3.flowMarkPoint(r1, r0)
            long r0 = r4.A01
            r3.flowEndSuccess(r0)
            r0 = 0
            r4.A01 = r0
            r0 = 9683(0x25d3, float:1.3569E-41)
            X.K66.A0A(r5, r6, r0)
            goto L_0x0033
        L_0x0147:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r2 = 1
            if (r1 == 0) goto L_0x0188
            if (r1 != r2) goto L_0x01ab
            X.0eS.A00(r5)
        L_0x0153:
            java.lang.Object r1 = r12.A04
            X.Jig r1 = (X.C60284Jig) r1
            X.LEQ r0 = r1.A04
            if (r0 == 0) goto L_0x0033
            X.0Ud r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            X.LMa r0 = (X.C64082LMa) r0
            if (r0 == 0) goto L_0x0033
            X.OCw r1 = r1.A05
            if (r1 == 0) goto L_0x0033
            com.instagram.model.fundraiser.FundraiserDisplayInfoModel r0 = r0.A00
            r3 = 0
            if (r0 == 0) goto L_0x0186
            java.lang.String r6 = r0.A02
        L_0x0170:
            X.QP7 r2 = new X.QP7
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r2.<init>((com.instagram.common.typedurl.ImageUrl) r3, (com.instagram.user.model.User) r4, (java.lang.Long) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
            X.1aS r1 = r1.A00
            X.3xQ r0 = new X.3xQ
            r0.<init>(r2)
            r1.accept(r0)
            goto L_0x0033
        L_0x0186:
            r6 = r3
            goto L_0x0170
        L_0x0188:
            X.0eS.A00(r5)
            java.lang.Object r1 = r12.A04
            X.Jig r1 = (X.C60284Jig) r1
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r8 = r1.A07
            java.lang.String r10 = r12.A05
            java.lang.Object r9 = r12.A03
            X.3NV r9 = (X.AnonymousClass3NV) r9
            java.lang.Object r11 = r12.A02
            java.util.List r11 = (java.util.List) r11
            boolean r13 = r12.A06
            r12.A00 = r2
            java.lang.Object r1 = r8.A00(r9, r10, r11, r12, r13)
            if (r1 != r0) goto L_0x0153
            return r0
        L_0x01a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MEk) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
