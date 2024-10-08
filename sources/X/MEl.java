package X;

public final class MEl extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEl(Object obj, String str, String str2, String str3, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A01 = i;
        this.A02 = obj;
        this.A06 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEl, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        boolean z;
        String str;
        String str2;
        String str3;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        AnonymousClass4D7 r5 = r10;
        if (i2 != 0) {
            str = this.A03;
            str2 = this.A04;
            str3 = this.A05;
            z = this.A06;
            i = 1;
        } else {
            z = this.A06;
            str = this.A03;
            str2 = this.A04;
            str3 = this.A05;
            i = 0;
        }
        return new MEl(obj2, str, str2, str3, r5, i, z);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MEl, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            if (r0 == 0) goto L_0x0081
            X.1Hj r3 = X.1Hj.A02
            int r0 = r12.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 == r5) goto L_0x006d
            X.0eS.A00(r13)
        L_0x0011:
            boolean r0 = r12.A06
            java.lang.Object r4 = r12.A02
            X.JjB r4 = (X.C60310JjB) r4
            java.lang.String r2 = r12.A03
            if (r0 == 0) goto L_0x0024
            r0 = 0
            X.C60310JjB.A01(r4, r0)
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r0 = r4.A07
            r0.A0I()
        L_0x0024:
            boolean r0 = X.C60310JjB.A02(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0040
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 39
            X.DbX.A1W(r4, r2, r1, r0)
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r1 = r4.A07
            X.6oS r0 = X.C318116oQ.A00(r4)
            r1.A0J(r2, r0)
        L_0x003d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0040:
            X.4Co r0 = r4.A00
            if (r0 != 0) goto L_0x003d
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 5
            X.MG2 r0 = new X.MG2
            r0.<init>(r4, r3, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            r4.A00 = r0
            goto L_0x003d
        L_0x0055:
            X.0eS.A00(r13)
            java.lang.Object r0 = r12.A02
            X.JjB r0 = (X.C60310JjB) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r4 = r0.A0B
            java.lang.String r2 = r12.A03
            java.lang.String r1 = r12.A04
            java.lang.String r0 = r12.A05
            r12.A00 = r5
            java.lang.Object r0 = r4.A01(r2, r1, r0, r12)
            if (r0 != r3) goto L_0x0070
            return r3
        L_0x006d:
            X.0eS.A00(r13)
        L_0x0070:
            java.lang.Object r0 = r12.A02
            X.JjB r0 = (X.C60310JjB) r0
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r0.A0D
            java.lang.String r0 = r12.A03
            r12.A00 = r6
            java.lang.Object r0 = r1.A01(r0, r12)
            if (r0 != r3) goto L_0x0011
            return r3
        L_0x0081:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r12.A00
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00d6
            if (r0 != r4) goto L_0x011e
            X.0eS.A00(r13)
        L_0x008e:
            java.lang.Object r6 = r12.A02
            X.DdZ r6 = (X.DdZ) r6
            boolean r5 = r12.A06
            java.lang.String r4 = r12.A03
            java.lang.String r3 = r12.A04
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00cd
            X.05G r1 = r6.A0C
            X.6z4 r0 = new X.6z4
            r0.<init>(r5)
            r1.Epw(r0)
            com.instagram.common.session.UserSession r0 = r6.A09
            boolean r0 = X.DcE.A03(r0)
            if (r0 != 0) goto L_0x00b5
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r6.A02(r2, r0)
        L_0x00b5:
            r6.A03(r5, r4, r3)
            X.3Ih r13 = X.C51967G9n.A0d()
        L_0x00bc:
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x003d
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0119
            X.05G r1 = r6.A0C
            X.6z5 r0 = X.C324316z5.A00
            r1.Epw(r0)
            goto L_0x003d
        L_0x00cd:
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00bc
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d6:
            X.0eS.A00(r13)
            java.lang.Object r5 = r12.A02
            X.DdZ r5 = (X.DdZ) r5
            X.05G r1 = r5.A0C
            X.6z3 r0 = X.C324296z3.A00
            r1.Epw(r0)
            X.JVC r6 = r5.A0A
            boolean r13 = r12.A06
            java.lang.String r9 = r12.A03
            java.lang.String r10 = r12.A04
            java.lang.String r11 = r12.A05
            com.instagram.common.session.UserSession r0 = r5.A09
            boolean r0 = X.C314866iy.A01(r0)
            if (r0 == 0) goto L_0x0117
            X.05G r0 = r5.A0E
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof X.C319296qM
            if (r0 == 0) goto L_0x0117
            X.6qM r1 = (X.C319296qM) r1
            if (r1 == 0) goto L_0x0117
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r1.A00
            if (r0 == 0) goto L_0x0117
            com.instagram.avatars.common.AvatarInfo r7 = r0.A01
        L_0x010a:
            r12.A00 = r4
            java.lang.Boolean r8 = X.AnonymousClass7TE.A0u()
            java.lang.Object r13 = r6.A01(r7, r8, r9, r10, r11, r12, r13)
            if (r13 != r3) goto L_0x008e
            return r3
        L_0x0117:
            r7 = r2
            goto L_0x010a
        L_0x0119:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MEl) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
