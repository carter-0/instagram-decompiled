package X;

/* renamed from: X.9K5  reason: invalid class name */
public final class AnonymousClass9K5 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K5(C304476Dp r2, AnonymousClass5WJ r3, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A03 = 0;
        this.A02 = r2;
        this.A01 = j;
        this.A04 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9K5, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.9K5, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        Object obj2;
        long j;
        int i;
        AnonymousClass4D7 r4 = r13;
        switch (this.A03) {
            case 0:
                return new AnonymousClass9K5((C304476Dp) this.A02, (AnonymousClass5WJ) this.A04, r13, this.A01);
            case 1:
                obj2 = this.A04;
                j = this.A01;
                i = 1;
                break;
            case 2:
                return new AnonymousClass9K5((C358228aZ) this.A02, (C358328aj) this.A04, r13);
            default:
                j = this.A01;
                obj2 = this.A04;
                i = 3;
                break;
        }
        ? r2 = new AnonymousClass9K5(obj2, r4, i, j);
        r2.A02 = obj;
        return r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9K5) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.9K5, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            int r0 = r15.A03
            switch(r0) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x00c5;
                case 2: goto L_0x0043;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x01d3
            java.lang.Object r2 = r15.A02
            X.4Cq r2 = (X.C262224Cq) r2
            X.0eS.A00(r1)
        L_0x0017:
            boolean r0 = X.19E.A07(r2)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r15.A04
            X.38U r1 = (X.AnonymousClass38U) r1
            X.0Ud r0 = r1.A0D
            java.lang.Object r0 = r0.getValue()
            X.38c r0 = (X.C2375338c) r0
            X.AnonymousClass38U.A00(r1, r0)
        L_0x002c:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x002f:
            X.0eS.A00(r1)
            java.lang.Object r2 = r15.A02
            X.4Cq r2 = (X.C262224Cq) r2
            long r0 = r15.A01
            r15.A02 = r2
            r15.A00 = r3
            java.lang.Object r0 = X.C241603Pv.A01(r15, r0)
            if (r0 != r8) goto L_0x0017
            return r8
        L_0x0043:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r15.A00
            r10 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 != r10) goto L_0x01db
            long r2 = r15.A01
            X.0eS.A00(r1)
        L_0x0051:
            java.lang.Object r0 = r15.A04
            X.8aj r0 = (X.C358328aj) r0
            X.1Av r0 = r0.A01
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "preference_seen_low_device_storage_message"
            r1.E5c(r0, r2)
            r1.apply()
            goto L_0x002c
        L_0x0066:
            X.0eS.A00(r1)
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            long r4 = r0.getFreeSpace()
            r1 = 314572800(0x12c00000, double:1.554196136E-315)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            java.lang.Object r7 = r15.A04
            X.8aj r7 = (X.C358328aj) r7
            com.instagram.common.session.UserSession r9 = r7.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319248477330521(0x81082a00001c59, double:3.0317772107143735E-306)
            X.182.A06(r6, r9, r0)
            X.1Av r0 = r7.A01
            X.0xa r3 = r0.A01
            java.lang.String r2 = "preference_seen_low_device_storage_message"
            r0 = 0
            long r2 = r3.getLong(r2, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r13 = r11.toDays(r0)
            r0 = 37163673407521068(0x84082a0001012c, double:3.5657949367931475E-306)
            double r11 = X.182.A00(r6, r9, r0)
            r0 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r11 = r11 * r0
            double r0 = (double) r4
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x002c
            r4 = 3
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            X.0V2 r1 = r7.A04
            java.lang.Object r0 = r15.A02
            r15.A01 = r2
            r15.A00 = r10
            java.lang.Object r0 = r1.emit(r0, r15)
            if (r0 != r8) goto L_0x0051
            return r8
        L_0x00c5:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r15.A00
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00d4
            if (r0 == r2) goto L_0x00ea
            java.lang.Object r6 = r15.A02
            X.8vc r6 = (X.C369968vc) r6
            goto L_0x013f
        L_0x00d4:
            X.0eS.A00(r1)
            java.lang.Object r1 = r15.A02
            java.lang.Object r0 = r15.A04
            X.72N r0 = (X.AnonymousClass72N) r0
            X.0r6 r0 = r0.A0C
            r15.A02 = r1
            r15.A00 = r2
            java.lang.Object r1 = X.AnonymousClass10c.A03(r15, r0)
            if (r1 != r8) goto L_0x00ed
            return r8
        L_0x00ea:
            X.0eS.A00(r1)
        L_0x00ed:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x002c
            java.lang.Object r6 = X.00k.A0J(r1)
            X.8vc r6 = (X.C369968vc) r6
            if (r6 == 0) goto L_0x002c
            java.lang.Object r5 = r15.A04
            X.72N r5 = (X.AnonymousClass72N) r5
            X.2Nn r9 = r5.A09
            boolean r0 = r9.A02()
            if (r0 == 0) goto L_0x002c
            long r2 = r15.A01
            X.1Av r0 = r5.A0A
            X.0xa r10 = r0.A01
            java.lang.String r4 = "last_checked_drafts_memory"
            r0 = 0
            long r0 = r10.getLong(r4, r0)
            long r2 = r2 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r0.toDays(r2)
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            java.io.File r4 = r9.A01()     // Catch:{ all -> 0x014e }
            r15.A02 = r6     // Catch:{ all -> 0x014e }
            r15.A00 = r7     // Catch:{ all -> 0x014e }
            X.12T r3 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x014e }
            r2 = 0
            r1 = -18
            r0 = 3
            X.0nV r1 = r3.AOJ(r1, r0)     // Catch:{ all -> 0x014e }
            com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2 r0 = new com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2     // Catch:{ all -> 0x014e }
            r0.<init>(r5, r4, r2)     // Catch:{ all -> 0x014e }
            java.lang.Object r1 = X.1Eo.A00(r15, r1, r0)     // Catch:{ all -> 0x014e }
            if (r1 != r8) goto L_0x0142
            goto L_0x01e3
        L_0x013f:
            X.0eS.A00(r1)     // Catch:{ all -> 0x014e }
        L_0x0142:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x014e }
            long r0 = r1.longValue()     // Catch:{ all -> 0x014e }
            java.lang.Long r5 = new java.lang.Long     // Catch:{ all -> 0x014e }
            r5.<init>(r0)     // Catch:{ all -> 0x014e }
            goto L_0x0154
        L_0x014e:
            r0 = move-exception
            X.0eQ r5 = new X.0eQ
            r5.<init>(r0)
        L_0x0154:
            java.lang.Object r7 = r15.A04
            X.72N r7 = (X.AnonymousClass72N) r7
            long r2 = r15.A01
            boolean r0 = r5 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0191
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            float r4 = (float) r0
            r0 = 1308229632(0x4dfa0000, float:5.24288E8)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0191
            X.1Av r0 = r7.A0A
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "last_checked_drafts_memory"
            r1.E5c(r0, r2)
            r1.apply()
            X.3ju r2 = r7.A0B
            r0 = 1233125376(0x49800000, float:1048576.0)
            float r4 = r4 / r0
            X.51R r0 = r6.A05
            if (r0 == 0) goto L_0x01a0
            java.lang.String r1 = r0.A0E
        L_0x0189:
            X.9iJ r0 = new X.9iJ
            r0.<init>(r1, r4)
            r2.FIG(r0)
        L_0x0191:
            java.lang.Throwable r0 = X.0eR.A00(r5)
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = "ClipsDraftListViewModel"
            java.lang.String r0 = "Unable to calculate draft folder size."
            X.0wb.A03(r1, r0)
            goto L_0x002c
        L_0x01a0:
            r1 = 0
            goto L_0x0189
        L_0x01a2:
            X.1Hj r8 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x01b0
            if (r0 != r4) goto L_0x01e4
            X.0eS.A00(r1)
            goto L_0x002c
        L_0x01b0:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.6Dp r0 = (X.C304476Dp) r0
            X.5b4 r3 = r0.A01
            long r0 = r15.A01
            X.5cr r2 = new X.5cr
            r2.<init>(r0)
            java.lang.Object r0 = r15.A04
            X.5WJ r0 = (X.AnonymousClass5WJ) r0
            X.5b9 r1 = r0.A01
            r15.A00 = r4
            java.lang.Object r0 = r3.A02()
            java.lang.Object r0 = r3.A03(r1, r2, r0, r15)
            if (r0 != r8) goto L_0x002c
            return r8
        L_0x01d3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01db:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            return r8
        L_0x01e4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9K5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K5(Object obj, AnonymousClass4D7 r3, int i, long j) {
        super(2, r3);
        this.A03 = i;
        this.A01 = j;
        this.A04 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K5(C358228aZ r2, C358328aj r3, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A03 = 2;
        this.A04 = r3;
        this.A02 = r2;
    }
}
