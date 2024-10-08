package X;

import com.instagram.common.session.UserSession;

public final class MGH extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final long A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGH(AnonymousClass4D7 r2, C62320sa r3, long j, long j2) {
        super(2, r2);
        this.A03 = 4;
        this.A05 = r3;
        this.A04 = j;
        this.A01 = j2;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGH, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGH, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        long j;
        long j2;
        int i;
        Object obj2;
        Object obj3;
        AnonymousClass4D7 r6 = r14;
        switch (this.A03) {
            case 0:
                j = this.A04;
                obj2 = this.A02;
                j2 = this.A01;
                obj3 = this.A05;
                i = 0;
                break;
            case 1:
                j = this.A04;
                obj3 = this.A05;
                obj2 = this.A02;
                j2 = this.A01;
                i = 1;
                break;
            case 2:
                j2 = this.A01;
                j = this.A04;
                obj3 = this.A05;
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                j2 = this.A01;
                j = this.A04;
                obj3 = this.A05;
                obj2 = this.A02;
                i = 3;
                break;
            case 4:
                MGH mgh = new MGH(r6, (C62320sa) this.A05, this.A04, this.A01);
                mgh.A02 = obj;
                return mgh;
            default:
                return new MGH((UserSession) this.A05, r14, this.A04);
        }
        return new MGH(obj3, obj2, r6, i, j2, j);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MGH, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0168 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0197 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A03
            X.1Hj r5 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x014c;
                case 1: goto L_0x0112;
                case 2: goto L_0x00d7;
                case 3: goto L_0x009f;
                case 4: goto L_0x005b;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r0 = r12.A00
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 != r1) goto L_0x0056
            X.0eS.A00(r13)
        L_0x0011:
            return r13
        L_0x0012:
            X.0eS.A00(r13)
            java.lang.Object r0 = r12.A05
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            long r7 = r12.A04
            r12.A02 = r0
            r12.A01 = r7
            r12.A00 = r1
            X.1IW r3 = X.JTS.A0s(r12)
            X.NAY r9 = X.OXH.A00(r0)
            r0 = 17
            X.Opf r2 = new X.Opf
            r2.<init>((java.lang.Object) r3, (int) r0)
            X.68J r1 = r9.mMailboxApiHandleMetaProvider
            r0 = 2
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r11 = new com.facebook.msys.mca.MailboxFutureImpl
            r11.<init>(r0)
            r11.Eiu(r2)
            r10 = 5
            X.Opc r6 = new X.Opc
            r6.<init>((long) r7, (java.lang.Object) r9, (int) r10, (java.lang.Object) r11)
            boolean r0 = r0.EJd(r6)
            if (r0 != 0) goto L_0x004f
            r0 = 0
            r11.cancel(r0)
        L_0x004f:
            java.lang.Object r13 = r3.A0E()
            if (r13 != r5) goto L_0x0011
            return r5
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005b:
            int r0 = r12.A00
            r6 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x008c
            if (r0 == r3) goto L_0x0079
            if (r0 != r4) goto L_0x0079
            java.lang.Object r0 = r12.A02
            X.02o r2 = X.JTO.A1H(r0, r13)
        L_0x006c:
            long r0 = r12.A01
            r12.A02 = r2
            r12.A00 = r6
        L_0x0072:
            java.lang.Object r0 = X.C241603Pv.A02(r12, r0)
            if (r0 != r5) goto L_0x007f
            return r5
        L_0x0079:
            java.lang.Object r0 = r12.A02
            X.02o r2 = X.JTO.A1H(r0, r13)
        L_0x007f:
            X.0gF r0 = X.C60340gF.A00
            r12.A02 = r2
            r12.A00 = r4
            java.lang.Object r0 = r2.emit(r0, r12)
            if (r0 != r5) goto L_0x006c
            return r5
        L_0x008c:
            X.0eS.A00(r13)
            java.lang.Object r2 = r12.A02
            X.02o r2 = (X.02o) r2
            java.lang.Object r0 = r12.A05
            X.DbS.A1U(r0)
            long r0 = r12.A04
            r12.A02 = r2
            r12.A00 = r3
            goto L_0x0072
        L_0x009f:
            int r0 = r12.A00
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00ae
            if (r0 == r4) goto L_0x00bf
            if (r0 == r6) goto L_0x0194
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ae:
            X.0eS.A00(r13)
            long r2 = r12.A01
            long r0 = r12.A04
            long r2 = r2 + r0
            r12.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r12, r2)
            if (r0 != r5) goto L_0x00c2
            return r5
        L_0x00bf:
            X.0eS.A00(r13)
        L_0x00c2:
            java.lang.Object r2 = r12.A05
            X.5b4 r2 = (X.AnonymousClass5b4) r2
            java.lang.Float r1 = X.JTP.A0i()
            java.lang.Object r0 = r12.A02
            X.5b7 r0 = (X.C287965b7) r0
            r12.A00 = r6
            java.lang.Object r0 = X.JTQ.A0V(r2, r0, r1, r12)
            if (r0 != r5) goto L_0x0197
            return r5
        L_0x00d7:
            int r0 = r12.A00
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00e6
            if (r0 == r4) goto L_0x00fa
            if (r0 == r6) goto L_0x0194
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e6:
            X.0eS.A00(r13)
            long r2 = r12.A01
            long r0 = r12.A04
            long r2 = r2 + r0
            r0 = 20
            long r2 = r2 + r0
            r12.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r12, r2)
            if (r0 != r5) goto L_0x00fd
            return r5
        L_0x00fa:
            X.0eS.A00(r13)
        L_0x00fd:
            java.lang.Object r2 = r12.A05
            X.5b4 r2 = (X.AnonymousClass5b4) r2
            java.lang.Float r1 = X.JTP.A0i()
            java.lang.Object r0 = r12.A02
            X.5b7 r0 = (X.C287965b7) r0
            r12.A00 = r6
            java.lang.Object r0 = X.JTQ.A0V(r2, r0, r1, r12)
            if (r0 != r5) goto L_0x0197
            return r5
        L_0x0112:
            int r0 = r12.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0121
            if (r0 == r2) goto L_0x012f
            if (r0 == r3) goto L_0x012f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0121:
            X.0eS.A00(r13)
            long r0 = r12.A04
            r12.A00 = r2
        L_0x0128:
            java.lang.Object r0 = X.C241603Pv.A01(r12, r0)
            if (r0 != r5) goto L_0x0132
            return r5
        L_0x012f:
            X.0eS.A00(r13)
        L_0x0132:
            java.lang.Object r0 = r12.A05
            X.TSn r0 = (X.C13272TSn) r0
            r0.A00()
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L_0x0197
            java.lang.Object r2 = r12.A02
            java.util.concurrent.TimeUnit r2 = (java.util.concurrent.TimeUnit) r2
            long r0 = r12.A01
            long r0 = r2.toMillis(r0)
            r12.A00 = r3
            goto L_0x0128
        L_0x014c:
            int r1 = r12.A00
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L_0x015b
            if (r1 == r0) goto L_0x0169
            if (r1 == r6) goto L_0x0169
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x015b:
            X.0eS.A00(r13)
            long r3 = r12.A04
            r12.A00 = r0
        L_0x0162:
            java.lang.Object r0 = X.C241603Pv.A01(r12, r3)
            if (r0 != r5) goto L_0x016c
            return r5
        L_0x0169:
            X.0eS.A00(r13)
        L_0x016c:
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r2 = r12.A02
            java.util.concurrent.TimeUnit r2 = (java.util.concurrent.TimeUnit) r2
            long r0 = r12.A01
            long r0 = r2.toMillis(r0)
            long r3 = r3 + r0
            java.lang.Object r0 = r12.A05
            X.TSn r0 = (X.C13272TSn) r0
            r0.A00()
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L_0x0197
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x016c
            long r3 = r3 - r1
            r12.A00 = r6
            goto L_0x0162
        L_0x0194:
            X.0eS.A00(r13)
        L_0x0197:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGH) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGH(UserSession userSession, AnonymousClass4D7 r3, long j) {
        super(2, r3);
        this.A03 = 5;
        this.A05 = userSession;
        this.A04 = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGH(Object obj, Object obj2, AnonymousClass4D7 r4, int i, long j, long j2) {
        super(2, r4);
        this.A03 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = obj;
        this.A02 = obj2;
    }
}
