package X;

import com.instagram.common.session.UserSession;

public final class MFk extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;
    public final int A04;
    public final long A05;
    public final Object A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFk(UserSession userSession, String str, AnonymousClass4D7 r4, int i, long j) {
        super(2, r4);
        this.A06 = userSession;
        this.A07 = str;
        this.A04 = i;
        this.A05 = j;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MFk, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass4D7 r5 = r12;
        if (this.A03 == 0) {
            return new MFk((UserSession) this.A06, this.A07, r5, this.A04, this.A05);
        }
        long j = this.A05;
        return new MFk((C62527KhJ) this.A06, (C62415KfQ) this.A02, this.A07, r5, (C62320sa) this.A01, this.A04, j);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MFk, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A03
            X.1Hj r3 = X.1Hj.A02
            if (r0 == 0) goto L_0x007c
            int r0 = r12.A00
            r6 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0034
            if (r0 == r5) goto L_0x005d
            X.0eS.A00(r13)
        L_0x0014:
            java.lang.Object r0 = r12.A01
            X.DbS.A1U(r0)
            java.lang.Object r2 = r12.A02
            X.KfQ r2 = (X.C62415KfQ) r2
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            X.0gF r13 = X.C60340gF.A00
        L_0x0025:
            return r13
        L_0x0026:
            X.0eS.A00(r13)
            long r0 = r12.A05
            r12.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r12, r0)
            if (r0 != r3) goto L_0x0037
            return r3
        L_0x0034:
            X.0eS.A00(r13)
        L_0x0037:
            java.lang.Object r4 = r12.A02
            X.KfQ r4 = (X.C62415KfQ) r4
            java.lang.Object r2 = r12.A06
            X.KhJ r2 = (X.C62527KhJ) r2
            java.util.List r1 = r4.A04
            X.LES r0 = r4.A03
            X.0Ud r0 = r0.A0p
            boolean r0 = X.JTR.A1a(r0)
            boolean r0 = r4.isButtonVisible(r2, r1, r0)
            if (r0 != 0) goto L_0x0060
            r4.A00()
            r0 = 200(0xc8, double:9.9E-322)
            r12.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r12, r0)
            if (r0 != r3) goto L_0x0060
            return r3
        L_0x005d:
            X.0eS.A00(r13)
        L_0x0060:
            java.lang.Object r0 = r12.A02
            X.KfQ r0 = (X.C62415KfQ) r0
            X.3ju r5 = r0.A05
            java.lang.Object r4 = r12.A06
            X.KhJ r4 = (X.C62527KhJ) r4
            int r2 = r12.A04
            java.lang.String r1 = r12.A07
            X.KfR r0 = new X.KfR
            r0.<init>(r4, r1, r2)
            r12.A00 = r6
            java.lang.Object r0 = r5.ELH(r0, r12)
            if (r0 != r3) goto L_0x0014
            return r3
        L_0x007c:
            int r1 = r12.A00
            r0 = 1
            if (r1 == 0) goto L_0x0085
            X.0eS.A00(r13)
            return r13
        L_0x0085:
            X.0eS.A00(r13)
            java.lang.Object r5 = r12.A06
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r8 = r12.A07
            int r9 = r12.A04
            long r10 = r12.A05
            r12.A02 = r5
            r12.A01 = r8
            r12.A00 = r0
            X.1IW r4 = X.JTS.A0s(r12)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r6 = X.1y0.A00(r5)
            r0 = 12
            X.Plm r1 = new X.Plm
            r1.<init>(r5, r0)
            java.lang.Class<X.O7z> r0 = X.C70474O7z.class
            java.lang.Object r0 = r6.A01(r0, r1)
            X.O7z r0 = (X.C70474O7z) r0
            X.NAC r6 = r0.A00
            r0 = 47
            X.Oph r1 = new X.Oph
            r1.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5)
            X.68J r0 = r6.mMailboxApiHandleMetaProvider
            X.68L r0 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r7 = new com.facebook.msys.mca.MailboxFutureImpl
            r7.<init>(r0)
            r7.Eiu(r1)
            X.Ope r5 = new X.Ope
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r0 = r0.EJd(r5)
            if (r0 != 0) goto L_0x00d8
            r7.cancel(r2)
        L_0x00d8:
            java.lang.Object r13 = r4.A0E()
            if (r13 != r3) goto L_0x0025
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFk) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFk(C62527KhJ khJ, C62415KfQ kfQ, String str, AnonymousClass4D7 r5, C62320sa r6, int i, long j) {
        super(2, r5);
        this.A05 = j;
        this.A02 = kfQ;
        this.A06 = khJ;
        this.A04 = i;
        this.A07 = str;
        this.A01 = r6;
    }
}
