package X;

public final class MEV extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEV(Object obj, String str, AnonymousClass4D7 r4, int i, long j) {
        super(2, r4);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = j;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEV, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        long j;
        String str;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        AnonymousClass4D7 r3 = r9;
        switch (i2) {
            case 0:
                str = this.A04;
                j = this.A02;
                i = 0;
                break;
            case 1:
                j = this.A02;
                str = this.A04;
                i = 1;
                break;
            case 2:
                j = this.A02;
                str = this.A04;
                i = 2;
                break;
            default:
                str = this.A04;
                j = this.A02;
                i = 3;
                break;
        }
        return new MEV(obj2, str, r3, i, j);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.MEV, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r10.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (r3.A05(r10) != r2) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        X.0eS.A00(r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x0083;
                case 2: goto L_0x009d;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r10.A00
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x000e
            goto L_0x0024
        L_0x000e:
            X.0eS.A00(r11)
            java.lang.Object r0 = r10.A03     // Catch:{ IOException -> 0x00c3 }
            X.6hJ r0 = (X.C313886hJ) r0     // Catch:{ IOException -> 0x00c3 }
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r5 = r0.A08     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r4 = r10.A04     // Catch:{ IOException -> 0x00c3 }
            long r0 = r10.A02     // Catch:{ IOException -> 0x00c3 }
            r10.A00 = r6     // Catch:{ IOException -> 0x00c3 }
            java.lang.Object r11 = r5.A05(r4, r10, r0)     // Catch:{ IOException -> 0x00c3 }
            if (r11 != r2) goto L_0x0027
            return r2
        L_0x0024:
            X.0eS.A00(r11)     // Catch:{ IOException -> 0x00c3 }
        L_0x0027:
            boolean r0 = X.AnonymousClass7TE.A1a(r11)     // Catch:{ IOException -> 0x00c3 }
            if (r0 != 0) goto L_0x0036
            java.lang.Object r0 = r10.A03     // Catch:{ IOException -> 0x00c3 }
            X.6hJ r0 = (X.C313886hJ) r0     // Catch:{ IOException -> 0x00c3 }
            X.2Fj r0 = r0.A03     // Catch:{ IOException -> 0x00c3 }
            r0.A0B(r3)     // Catch:{ IOException -> 0x00c3 }
        L_0x0036:
            java.lang.Object r1 = r10.A03     // Catch:{ IOException -> 0x00c3 }
            X.6hJ r1 = (X.C313886hJ) r1     // Catch:{ IOException -> 0x00c3 }
            X.2Fj r0 = r1.A03     // Catch:{ IOException -> 0x00c3 }
            java.lang.Object r0 = r0.A02()     // Catch:{ IOException -> 0x00c3 }
            X.LGC r0 = (X.LGC) r0     // Catch:{ IOException -> 0x00c3 }
            if (r0 == 0) goto L_0x00cc
            X.6gu r4 = r1.A06     // Catch:{ IOException -> 0x00c3 }
            if (r4 == 0) goto L_0x00cc
            long r8 = r0.A01     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r6 = r0.A08     // Catch:{ IOException -> 0x00c3 }
            X.Uz5 r0 = r0.A05     // Catch:{ IOException -> 0x00c3 }
            java.lang.String r7 = r0.A00     // Catch:{ IOException -> 0x00c3 }
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r0 = r1.A08     // Catch:{ IOException -> 0x00c3 }
            java.util.List r1 = r0.A04     // Catch:{ IOException -> 0x00c3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x00c3 }
            int r5 = r1.indexOf(r0)     // Catch:{ IOException -> 0x00c3 }
            r4.Cjr(r5, r6, r7, r8)     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00cc
        L_0x0060:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 1
            if (r0 == 0) goto L_0x006b
            X.0eS.A00(r11)
        L_0x006a:
            return r11
        L_0x006b:
            X.0eS.A00(r11)
            java.lang.Object r4 = r10.A03
            X.3Fv r4 = (X.C239283Fv) r4
            java.lang.String r3 = r10.A04
            long r0 = r10.A02
            X.0r6 r0 = r4.BOP(r3, r0)
            r10.A00 = r5
            java.lang.Object r11 = X.AnonymousClass10c.A02(r10, r0)
            if (r11 != r2) goto L_0x006a
            return r2
        L_0x0083:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 != 0) goto L_0x00bf
            X.0eS.A00(r11)
            java.lang.Object r5 = r10.A03
            com.instagram.direct.inbox.notes.NotesRepository r5 = (com.instagram.direct.inbox.notes.NotesRepository) r5
            com.instagram.direct.inbox.notes.NotesApi r4 = r5.A0C
            long r7 = r10.A02
            java.lang.String r6 = r10.A04
            X.NWL r3 = new X.NWL
            r3.<init>(r4, r5, r6, r7)
            goto L_0x00b6
        L_0x009d:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r10.A00
            r1 = 1
            if (r0 != 0) goto L_0x00bf
            X.0eS.A00(r11)
            java.lang.Object r5 = r10.A03
            com.instagram.direct.inbox.notes.NotesRepository r5 = (com.instagram.direct.inbox.notes.NotesRepository) r5
            com.instagram.direct.inbox.notes.NotesApi r4 = r5.A0C
            long r7 = r10.A02
            java.lang.String r6 = r10.A04
            X.NWM r3 = new X.NWM
            r3.<init>(r4, r5, r6, r7)
        L_0x00b6:
            r10.A00 = r1
            java.lang.Object r0 = r3.A05(r10)
            if (r0 != r2) goto L_0x00cc
            return r2
        L_0x00bf:
            X.0eS.A00(r11)
            goto L_0x00cc
        L_0x00c3:
            java.lang.Object r0 = r10.A03
            X.6hJ r0 = (X.C313886hJ) r0
            X.2Fj r0 = r0.A03
            r0.A0B(r3)
        L_0x00cc:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MEV) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
