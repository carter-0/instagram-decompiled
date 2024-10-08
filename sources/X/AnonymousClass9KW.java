package X;

/* renamed from: X.9KW  reason: invalid class name */
public final class AnonymousClass9KW extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KW(Object obj, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9KW, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9KW, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        Object obj2;
        String str;
        int i;
        switch (this.A00) {
            case 0:
                obj2 = this.A01;
                str = this.A02;
                i = 0;
                break;
            case 1:
                obj2 = this.A01;
                str = this.A02;
                i = 1;
                break;
            case 2:
                return new AnonymousClass9KW(this.A01, this.A02, r6, 2);
            default:
                obj2 = this.A01;
                str = this.A02;
                i = 3;
                break;
        }
        return new AnonymousClass9KW(obj2, str, r6, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KW) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r8 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a4, code lost:
        X.1zE.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ab, code lost:
        if (r3 == null) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r10 > X.182.A01(r2, r3, 36598090639346789L)) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0134;
                case 1: goto L_0x00f9;
                case 2: goto L_0x0114;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0eS.A00(r16)
            java.lang.Object r7 = r15.A01
            X.89T r7 = (X.AnonymousClass89T) r7
            java.lang.String r5 = r15.A02
            r6 = 0
            r4 = 1
            com.instagram.common.session.UserSession r3 = r7.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316615662768664(0x8105c500061218, double:3.030112208183962E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004c
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r7.A00
            long r10 = r10 - r0
            X.05G r0 = r7.A04
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003e
            r0 = 36598090639346789(0x8205c500040c65, double:3.208118116780725E-306)
            long r8 = X.182.A01(r2, r3, r0)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r8 = 0
            if (r0 <= 0) goto L_0x003f
        L_0x003e:
            r8 = 1
        L_0x003f:
            r0 = 36598090639346789(0x8205c500040c65, double:3.208118116780725E-306)
            X.182.A01(r2, r3, r0)
            if (r8 != 0) goto L_0x004c
        L_0x0049:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x004c:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0049
            r7.A01 = r4
            java.lang.String r0 = "ccp_v2"
            int r8 = X.C347207wR.A00(r3, r0, r5)
            X.1vn r5 = X.1vm.A01(r3)
            java.lang.Class<X.7wT> r9 = X.C347227wT.class
            java.lang.String r1 = "create"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012d }
            java.lang.reflect.Method r9 = r9.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012d }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012d }
            java.lang.Object r10 = r9.invoke(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012d }
            X.7wV r10 = (X.C347247wV) r10     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x012d }
            X.2IV r9 = new X.2IV
            r9.<init>()
            java.lang.String r1 = "IG"
            java.lang.String r0 = "source_app"
            r9.A09(r1, r0)
            X.2IV r13 = new X.2IV
            r13.<init>()
            java.lang.String r14 = "FB"
            java.lang.String r0 = "destination_app"
            r13.A09(r14, r0)
            java.lang.String r1 = "STORY"
            java.lang.String r12 = "source_surface"
            r13.A09(r1, r12)
            java.lang.String r11 = "destination_surface"
            r13.A09(r1, r11)
            X.2IV r1 = new X.2IV
            r1.<init>()
            r1.A09(r14, r0)
            java.lang.String r0 = "REELS"
            r1.A09(r0, r12)
            r1.A09(r0, r11)
            X.2IV[] r0 = new X.2IV[]{r13, r1}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = "crosspost_app_surface_list"
            r9.A05(r0, r1)
            X.2IS r1 = r10.A00
            java.lang.String r0 = "configs_request"
            r1.A00(r9, r0)
            r10.A02 = r4
            X.1Ef r4 = r10.build()
            X.0qQ.A07(r4)
            X.05G r0 = r7.A04
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ef
            r0 = 0
        L_0x00cc:
            X.1Ef r2 = r4.setMaxToleratedCacheAgeMs(r0)
            r2.setFreshCacheAgeMs(r0)
            X.7wa r0 = X.C347297wa.IG
            X.7wb r3 = new X.7wb
            r3.<init>(r7, r8)
            X.0qQ.A0B(r5, r6)
            X.7wc r2 = new X.7wc
            r2.<init>(r3, r0)
            r0 = 4
            X.ASf r1 = new X.ASf
            r1.<init>(r3, r0)
            X.1Lf r0 = X.1Lf.A01
            r5.ATM(r1, r2, r4, r0)
            goto L_0x0049
        L_0x00ef:
            r0 = 36598090639346789(0x8205c500040c65, double:3.208118116780725E-306)
            long r0 = X.182.A01(r2, r3, r0)
            goto L_0x00cc
        L_0x00f9:
            X.0eS.A00(r16)
            java.lang.Object r0 = r15.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r0
            java.util.Map r2 = r0.A0E
            java.lang.String r1 = r15.A02
            java.lang.Object r0 = r2.get(r1)
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x010f
            r0.EwR()
        L_0x010f:
            r2.remove(r1)
            goto L_0x0049
        L_0x0114:
            X.0eS.A00(r16)
            java.lang.String r0 = r15.A02
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
            if (r2 == 0) goto L_0x0049
            java.lang.Object r1 = r15.A01
            X.8S5 r1 = (X.AnonymousClass8S5) r1
            X.Amb r0 = new X.Amb
            r0.<init>(r2, r1)
            X.11Z.A02(r0)
            goto L_0x0049
        L_0x012d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0134:
            X.0eS.A00(r16)
            java.lang.Object r1 = r15.A01
            X.41x r1 = (X.C2594941x) r1
            java.lang.String r6 = r15.A02
            X.0eM r5 = r1.A01
            java.lang.Object r0 = r5.getValue()
            X.1LQ r0 = (X.1LQ) r0
            boolean r0 = r0.hasKey(r6)
            r7 = 0
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r0 = r5.getValue()
            X.1LQ r0 = (X.1LQ) r0
            java.io.InputStream r3 = r0.read(r6)
            X.41w r0 = r1.A00     // Catch:{ Exception -> 0x0198 }
            if (r3 == 0) goto L_0x018c
            boolean r0 = r0.A00     // Catch:{ Exception -> 0x0198 }
            if (r0 == 0) goto L_0x0176
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ Exception -> 0x0198 }
            X.16F r0 = r0.A01(r3)     // Catch:{ Exception -> 0x0198 }
            r0.A1J()     // Catch:{ Exception -> 0x0198 }
            X.9Iu r0 = X.AnonymousClass4V4.parseFromJson(r0)     // Catch:{ Exception -> 0x0198 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x0198 }
            X.4VW r4 = new X.4VW     // Catch:{ Exception -> 0x0198 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0198 }
        L_0x0173:
            X.4VX r4 = (X.AnonymousClass4VX) r4     // Catch:{ Exception -> 0x0198 }
            goto L_0x01ad
        L_0x0176:
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ Exception -> 0x0198 }
            X.16F r0 = r0.A01(r3)     // Catch:{ Exception -> 0x0198 }
            r0.A1J()     // Catch:{ Exception -> 0x0198 }
            X.JV7 r0 = X.C39568A0k.parseFromJson(r0)     // Catch:{ Exception -> 0x0198 }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x0198 }
            X.AVG r4 = new X.AVG     // Catch:{ Exception -> 0x0198 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0198 }
            goto L_0x0173
        L_0x018c:
            java.lang.String r0 = "Got unexpected null input stream from stash for key "
            java.lang.String r1 = X.002.A0R(r0, r6)     // Catch:{ Exception -> 0x0198 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0198 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0198 }
            throw r0     // Catch:{ Exception -> 0x0198 }
        L_0x0198:
            r2 = move-exception
            java.lang.String r1 = "OnDemandStashHelper"
            java.lang.String r0 = "Failed to deserialize payload"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x01a1 }
            goto L_0x01aa
        L_0x01a1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01a3 }
        L_0x01a3:
            r1 = move-exception
            X.1zE.A00(r3, r0)
            throw r1
        L_0x01a8:
            r4 = r7
            goto L_0x01b0
        L_0x01aa:
            r4 = r7
            if (r3 == 0) goto L_0x01b0
        L_0x01ad:
            r3.close()
        L_0x01b0:
            r3 = 0
            X.0qQ.A0B(r6, r3)
            java.lang.String r0 = "/lastFetchTime"
            java.lang.String r2 = X.002.A0R(r6, r0)
            java.lang.Object r0 = r5.getValue()
            X.2jB r0 = (X.C227392jB) r0
            X.2ij r0 = r0.A00
            X.0qQ.A0B(r2, r3)
            X.1FL r1 = r0.A00
            java.lang.String r0 = "metadata"
            java.lang.Object r1 = r1.A02(r2, r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x01df
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x01df
            long r0 = r1.longValue()
        L_0x01d9:
            X.9IL r2 = new X.9IL
            r2.<init>(r0, r4, r3)
            return r2
        L_0x01df:
            r0 = 0
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KW.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
