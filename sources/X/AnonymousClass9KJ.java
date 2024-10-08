package X;

/* renamed from: X.9KJ  reason: invalid class name */
public final class AnonymousClass9KJ extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KJ(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i, boolean z, boolean z2) {
        super(2, r5);
        this.A01 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = z;
        this.A06 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.9KJ] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        int i;
        int i2 = this.A01;
        Object obj4 = this.A04;
        AnonymousClass4D7 r4 = r10;
        switch (i2) {
            case 0:
                obj2 = this.A02;
                obj3 = this.A03;
                z = this.A05;
                z2 = this.A06;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                obj3 = this.A03;
                z = this.A05;
                z2 = this.A06;
                i = 1;
                break;
            default:
                z = this.A05;
                obj2 = this.A02;
                obj3 = this.A03;
                z2 = this.A06;
                i = 2;
                break;
        }
        return new AnonymousClass9KJ(obj4, obj2, obj3, r4, i, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KJ) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.4D7, X.9KJ] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013f, code lost:
        if (r1 != r0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        X.0eS.A00(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r19
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x011d;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0022
            X.0eS.A00(r20)
        L_0x0011:
            java.lang.Object r1 = r12.A04
            X.7Sj r1 = (X.C331787Sj) r1
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x001f
            X.7Sc r1 = r1.A09
            r0 = 0
            r1.Eyv(r0)
        L_0x001f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0022:
            X.0eS.A00(r20)
            java.lang.Object r7 = r12.A04
            X.7Sj r7 = (X.C331787Sj) r7
            boolean r4 = r12.A05
            if (r4 == 0) goto L_0x0033
            X.7Sc r2 = r7.A09
            r1 = 0
            r2.EwO(r1)
        L_0x0033:
            r2 = -45977659(0xfffffffffd426fc5, float:-1.6153161E37)
            java.lang.String r1 = "IgRunnableId.RESNAPSHOT"
            X.0fh.A01(r1, r2)
            r7.A0H = r3     // Catch:{ all -> 0x014f }
            r10 = 0
            if (r4 == 0) goto L_0x005c
            X.0eP r15 = r7.A02     // Catch:{ all -> 0x014f }
            X.4Co r1 = r7.A03     // Catch:{ all -> 0x014f }
            r2 = 0
            if (r1 == 0) goto L_0x004e
            boolean r1 = r1.CQL()     // Catch:{ all -> 0x014f }
            if (r1 != 0) goto L_0x004e
            r2 = 1
        L_0x004e:
            if (r2 == 0) goto L_0x0057
            X.4Co r1 = r7.A03     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x0057
            r1.AG7(r10)     // Catch:{ all -> 0x014f }
        L_0x0057:
            r7.A03 = r10     // Catch:{ all -> 0x014f }
            r7.A02 = r10     // Catch:{ all -> 0x014f }
            goto L_0x005d
        L_0x005c:
            r15 = r10
        L_0x005d:
            if (r15 != 0) goto L_0x008a
            java.lang.Object r6 = r12.A02     // Catch:{ all -> 0x014f }
            com.instagram.model.direct.DirectThreadKey r6 = (com.instagram.model.direct.DirectThreadKey) r6     // Catch:{ all -> 0x014f }
            java.lang.Object r5 = r12.A03     // Catch:{ all -> 0x014f }
            X.7SD r5 = (X.AnonymousClass7SD) r5     // Catch:{ all -> 0x014f }
            java.lang.String r2 = "DirectThreadDataViewModel.snapshotMessagesAndConvertToMessageRows"
            r1 = -1171056816(0xffffffffba331750, float:-6.831782E-4)
            X.0fh.A01(r2, r1)     // Catch:{ all -> 0x014f }
            X.2Dm r1 = r7.A0A     // Catch:{ all -> 0x0147 }
            X.3U9 r4 = r1.B33(r6)     // Catch:{ all -> 0x0147 }
            X.7Sn r1 = r7.A08     // Catch:{ all -> 0x0147 }
            java.util.List r2 = r1.A00(r4, r6)     // Catch:{ all -> 0x0147 }
            java.util.List r1 = X.C331787Sj.A00(r7, r5, r4, r2)     // Catch:{ all -> 0x0147 }
            X.0eP r15 = new X.0eP     // Catch:{ all -> 0x0147 }
            r15.<init>(r2, r1)     // Catch:{ all -> 0x0147 }
            r1 = 736234427(0x2be20bbb, float:1.6061522E-12)
            X.0fh.A00(r1)     // Catch:{ all -> 0x014f }
        L_0x008a:
            java.lang.Object r8 = r12.A02     // Catch:{ all -> 0x014f }
            com.instagram.model.direct.DirectThreadKey r8 = (com.instagram.model.direct.DirectThreadKey) r8     // Catch:{ all -> 0x014f }
            java.lang.Object r9 = r15.A00     // Catch:{ all -> 0x014f }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x014f }
            java.lang.Object r14 = r12.A03     // Catch:{ all -> 0x014f }
            X.7SD r14 = (X.AnonymousClass7SD) r14     // Catch:{ all -> 0x014f }
            int r2 = r14.A08     // Catch:{ all -> 0x014f }
            r1 = 29
            if (r2 != r1) goto L_0x00ac
            com.instagram.common.session.UserSession r5 = r7.A07     // Catch:{ all -> 0x014f }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x014f }
            r1 = 36319407397870964(0x81084f00671d74, double:3.0318777127040713E-306)
            boolean r1 = X.182.A06(r4, r5, r1)     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x00ac
            goto L_0x00cc
        L_0x00ac:
            boolean r1 = r7.A04     // Catch:{ all -> 0x014f }
            if (r1 == 0) goto L_0x00cc
            r1 = 0
            r7.A04 = r1     // Catch:{ all -> 0x014f }
            X.6oS r4 = X.C318116oQ.A00(r7)     // Catch:{ all -> 0x014f }
            X.12T r5 = r7.A06     // Catch:{ all -> 0x014f }
            r2 = 839614350(0x320b7f8e, float:8.1198674E-9)
            r1 = 4
            X.0nV r2 = r5.AOJ(r2, r1)     // Catch:{ all -> 0x014f }
            r11 = 3
            X.9KB r6 = new X.9KB     // Catch:{ all -> 0x014f }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x014f }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x014f }
            X.1Eo.A03(r1, r2, r6, r4)     // Catch:{ all -> 0x014f }
        L_0x00cc:
            r1 = -963771304(0xffffffffc68e0458, float:-18178.172)
            X.0fh.A00(r1)
            r1 = 0
            r7.A0H = r1
            boolean r1 = r12.A06
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            X.C331787Sj.A01(r7, r14, r0)
            goto L_0x0011
        L_0x00e2:
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r1 = r1.A04
            r18 = 17
            X.MfO r13 = new X.MfO
            r16 = r7
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r12.A00 = r3
            java.lang.Object r1 = X.1Eo.A00(r12, r1, r13)
            if (r1 != r0) goto L_0x0011
            return r0
        L_0x00fa:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r2 = 1
            if (r1 != 0) goto L_0x0142
            X.0eS.A00(r20)
            java.lang.Object r1 = r12.A04
            X.8q9 r1 = (X.C367078q9) r1
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r9 = r1.A00
            java.lang.Object r11 = r12.A02
            X.6ny r11 = (X.C317866ny) r11
            java.lang.Object r10 = r12.A03
            X.6nw r10 = (X.C317846nw) r10
            boolean r13 = r12.A05
            boolean r14 = r12.A06
            r12.A00 = r2
            java.lang.Object r1 = r9.A03(r10, r11, r12, r13, r14)
            goto L_0x013f
        L_0x011d:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r2 = 1
            if (r1 != 0) goto L_0x0142
            X.0eS.A00(r20)
            java.lang.Object r1 = r12.A04
            X.8q9 r1 = (X.C367078q9) r1
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r9 = r1.A00
            java.lang.Object r11 = r12.A02
            X.6ny r11 = (X.C317866ny) r11
            java.lang.Object r10 = r12.A03
            X.6nw r10 = (X.C317846nw) r10
            boolean r13 = r12.A05
            boolean r14 = r12.A06
            r12.A00 = r2
            java.lang.Object r1 = r9.A04(r10, r11, r12, r13, r14)
        L_0x013f:
            if (r1 != r0) goto L_0x001f
            return r0
        L_0x0142:
            X.0eS.A00(r20)
            goto L_0x001f
        L_0x0147:
            r1 = move-exception
            r0 = 1415912275(0x54651b53, float:3.93602374E12)
            X.0fh.A00(r0)     // Catch:{ all -> 0x014f }
            throw r1     // Catch:{ all -> 0x014f }
        L_0x014f:
            r1 = move-exception
            r0 = 814947920(0x30931e50, float:1.0704273E-9)
            X.0fh.A00(r0)
            r0 = 0
            r7.A0H = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
