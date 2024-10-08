package X;

import com.instagram.direct.securityalert.data.SecurityAlertRepository;

public final class MFX extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public long A02;
    public final int A03 = 0;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFX(SecurityAlertRepository securityAlertRepository, AnonymousClass4D7 r3, int i, long j) {
        super(2, r3);
        this.A04 = securityAlertRepository;
        this.A02 = j;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MFX, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.MFX, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r3 = r9;
        if (this.A03 == 0) {
            return new MFX((C65364Ls5) this.A04, r9);
        }
        return new MFX((SecurityAlertRepository) this.A04, r3, this.A00, this.A02);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MFX, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0031
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A01
            r1 = 1
            if (r0 == 0) goto L_0x000f
            X.0eS.A00(r11)
        L_0x000e:
            return r11
        L_0x000f:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r0 = (com.instagram.direct.securityalert.data.SecurityAlertRepository) r0
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r5 = r0.A02
            long r8 = r10.A02
            int r7 = r10.A00
            r10.A01 = r1
            X.12T r0 = X.AnonymousClass12T.A00
            r6 = 0
            X.0nV r0 = X.DbX.A0c(r0)
            X.MGA r4 = new X.MGA
            r4.<init>((com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource) r5, (X.AnonymousClass4D7) r6, (int) r7, (long) r8)
            java.lang.Object r11 = X.1Eo.A00(r10, r0, r4)
            if (r11 != r3) goto L_0x000e
            return r3
        L_0x0031:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A01
            r6 = 1
            if (r0 == 0) goto L_0x0051
            int r5 = r10.A00
            long r1 = r10.A02
            X.0eS.A00(r11)
        L_0x003f:
            java.lang.Object r4 = r10.A04
            X.Ls5 r4 = (X.C65364Ls5) r4
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A00(r5, r0)
            int r5 = r5 + 1
            r0 = 91
            if (r5 < r0) goto L_0x0057
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0051:
            X.0eS.A00(r11)
            r1 = 44
            r5 = 1
        L_0x0057:
            r10.A02 = r1
            r10.A00 = r5
            r10.A01 = r6
            java.lang.Object r0 = X.C241603Pv.A01(r10, r1)
            if (r0 != r3) goto L_0x003f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFX) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFX(C65364Ls5 ls5, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A04 = ls5;
    }
}
