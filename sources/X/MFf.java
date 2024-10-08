package X;

public final class MFf extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFf(L1U l1u, String str, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A02 = 1;
        this.A04 = l1u;
        this.A03 = j;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFf, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        Object obj3;
        long j;
        String str;
        int i;
        AnonymousClass4D7 r4 = r10;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A04;
                j = this.A03;
                str = this.A05;
                i = 0;
                break;
            case 1:
                MFf mFf = new MFf((L1U) this.A04, this.A05, r4, this.A03);
                mFf.A01 = obj;
                return mFf;
            default:
                obj3 = this.A04;
                str = this.A05;
                j = this.A03;
                obj2 = this.A01;
                i = 2;
                break;
        }
        return new MFf(obj2, obj3, str, r4, i, j);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MFf, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ed, code lost:
        if (r0 != r5) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        X.0eS.A00(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r3 = r19
            r2 = r20
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x00b5;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L_0x0018
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0018:
            X.0eS.A00(r2)
            java.lang.Object r0 = r3.A04     // Catch:{ IOException -> 0x011a }
            X.6hJ r0 = (X.C313886hJ) r0     // Catch:{ IOException -> 0x011a }
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r4 = r0.A08     // Catch:{ IOException -> 0x011a }
            java.lang.String r2 = r3.A05     // Catch:{ IOException -> 0x011a }
            long r0 = r3.A03     // Catch:{ IOException -> 0x011a }
            r3.A00 = r6     // Catch:{ IOException -> 0x011a }
            java.lang.Object r2 = r4.A02(r2, r3, r0)     // Catch:{ IOException -> 0x011a }
            if (r2 != r5) goto L_0x0031
            return r5
        L_0x002e:
            X.0eS.A00(r2)     // Catch:{ IOException -> 0x011a }
        L_0x0031:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x0044
            java.lang.Object r0 = r3.A04     // Catch:{ IOException -> 0x011a }
            X.6hJ r0 = (X.C313886hJ) r0     // Catch:{ IOException -> 0x011a }
            X.2Fj r1 = r0.A01     // Catch:{ IOException -> 0x011a }
            X.Ken r0 = X.C62376Ken.A00     // Catch:{ IOException -> 0x011a }
            r1.A0B(r0)     // Catch:{ IOException -> 0x011a }
            goto L_0x013a
        L_0x0044:
            java.lang.Object r0 = r3.A04     // Catch:{ IOException -> 0x011a }
            X.6hJ r0 = (X.C313886hJ) r0     // Catch:{ IOException -> 0x011a }
            X.6gu r6 = r0.A06     // Catch:{ IOException -> 0x011a }
            if (r6 == 0) goto L_0x013a
            long r4 = r3.A03     // Catch:{ IOException -> 0x011a }
            java.lang.Object r2 = r3.A01     // Catch:{ IOException -> 0x011a }
            X.LGC r2 = (X.LGC) r2     // Catch:{ IOException -> 0x011a }
            X.Uz5 r0 = r2.A05     // Catch:{ IOException -> 0x011a }
            java.lang.String r1 = r0.A00     // Catch:{ IOException -> 0x011a }
            java.lang.String r0 = r2.A08     // Catch:{ IOException -> 0x011a }
            r6.Cjo(r4, r1, r0)     // Catch:{ IOException -> 0x011a }
            goto L_0x013a
        L_0x005d:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 == r6) goto L_0x0116
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x006b:
            X.0eS.A00(r2)
            java.lang.Object r9 = r3.A04
            X.JjC r9 = (X.C60311JjC) r9
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r4 = r9.A06
            long r7 = r4.A00
            long r0 = r3.A03
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x013a
            X.LRN r10 = r9.A02
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00b0
            r15 = 0
        L_0x0085:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            r11 = 0
            r12 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            X.Jr6 r2 = X.LRN.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.LRO.A01(r2, r10)
            X.Gn9 r2 = X.C60311JjC.A00(r9)
            java.util.List r2 = X.C60311JjC.A01(r2)
            r10.A03(r2)
            java.lang.String r2 = r3.A05
            java.lang.Long r0 = X.JTO.A0y(r0)
            r3.A00 = r6
            java.lang.Object r0 = r4.A01(r0, r2, r3, r6)
            goto L_0x00ed
        L_0x00b0:
            java.lang.Long r15 = X.JTO.A0y(r0)
            goto L_0x0085
        L_0x00b5:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L_0x00f0
            if (r0 != r1) goto L_0x0116
            java.lang.Object r0 = r3.A01
            X.02o r9 = X.JTO.A1H(r0, r2)
        L_0x00c5:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r6 = r3.A05
            java.util.Iterator r4 = r2.iterator()
        L_0x00cd:
            boolean r0 = r4.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x013a
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.JtA r0 = (X.C60890JtA) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x00cd
            if (r1 == 0) goto L_0x013a
            r3.A01 = r2
            r3.A00 = r8
            java.lang.Object r0 = r9.emit(r1, r3)
        L_0x00ed:
            if (r0 != r5) goto L_0x013a
            return r5
        L_0x00f0:
            X.0eS.A00(r2)
            java.lang.Object r9 = r3.A01
            X.02o r9 = (X.02o) r9
            java.lang.Object r0 = r3.A04
            X.L1U r0 = (X.L1U) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            long r6 = r3.A03
            r3.A01 = r9
            r3.A00 = r1
            X.12T r0 = X.AnonymousClass12T.A00
            r2 = 0
            X.0nV r1 = X.DbX.A0c(r0)
            X.MGH r0 = new X.MGH
            r0.<init>(r4, r2, r6)
            java.lang.Object r2 = X.1Eo.A00(r3, r1, r0)
            if (r2 != r5) goto L_0x00c5
            return r5
        L_0x0116:
            X.0eS.A00(r2)
            goto L_0x013a
        L_0x011a:
            java.lang.Object r4 = r3.A04
            X.6hJ r4 = (X.C313886hJ) r4
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r1 = r4.A08
            java.lang.Object r3 = r3.A01
            X.LGC r3 = (X.LGC) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.util.HashMap r2 = r1.A08
            long r0 = r3.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r3)
            X.2Fj r1 = r4.A01
            X.Ken r0 = X.C62376Ken.A00
            r1.A0B(r0)
        L_0x013a:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFf) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFf(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i, long j) {
        super(2, r5);
        this.A02 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = j;
        this.A05 = str;
    }
}
