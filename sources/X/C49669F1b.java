package X;

/* renamed from: X.F1b  reason: case insensitive filesystem */
public abstract class C49669F1b {
    public static final C49669F1b A00 = new Object();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: X.ENW} */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.F1b] */
    /* JADX WARNING: type inference failed for: r0v40, types: [java.lang.Object, X.Ebf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass4DH r21, X.AnonymousClass0aP r22, X.G8H r23, X.G8G r24, X.G51 r25, X.C46634DiE r26) {
        /*
            r20 = this;
            r2 = r20
            r1 = r24
            boolean r0 = r2 instanceof X.ENX
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r25
            if (r0 == 0) goto L_0x0075
            r11 = r2
            X.ENX r11 = (X.ENX) r11
            X.ENQ r1 = (X.ENQ) r1
            java.util.concurrent.atomic.AtomicReference r4 = r1.A02
            java.lang.Object r0 = r4.get()
            r0.getClass()
            X.EUt r0 = (X.C48075EUt) r0
            int r2 = r0.ordinal()
            r0 = 0
            if (r2 == r0) goto L_0x003f
            r0 = 1
            if (r2 == r0) goto L_0x0056
            r0 = 2
            if (r2 != r0) goto L_0x003e
            X.8ab r2 = X.Dba.A0I(r7)
            r0 = 2131961742(0x7f13278e, float:1.956019E38)
            r2.A08(r0)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            r0 = 0
            X.Dba.A0t(r0, r2, r1)
        L_0x003e:
            return
        L_0x003f:
            X.Ebf r0 = r11.A00
            if (r0 != 0) goto L_0x0056
            X.ERM r2 = new X.ERM
            r2.<init>()
            X.Ebf r0 = new X.Ebf
            r0.<init>()
            r0.A00 = r7
            r0.A01 = r2
            r11.A00 = r0
            r0.A01()
        L_0x0056:
            X.FTC r6 = new X.FTC
            r6.<init>(r7, r8, r9, r10, r11)
            monitor-enter(r4)
            java.lang.Object r3 = r4.get()     // Catch:{ all -> 0x0072 }
            X.EUt r0 = X.C48075EUt.PENDING     // Catch:{ all -> 0x0072 }
            r2 = 1
            if (r3 != r0) goto L_0x006b
            r2 = 0
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A01     // Catch:{ all -> 0x0072 }
            r0.add(r6)     // Catch:{ all -> 0x0072 }
        L_0x006b:
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x003e
            r6.apply(r1)
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            boolean r0 = r2 instanceof X.ENV
            r12 = r26
            if (r0 == 0) goto L_0x00a6
            X.ENN r1 = (X.ENN) r1
            X.AnonymousClass7TG.A1N(r8, r1)
            r0 = 3
            android.content.Context r4 = X.DbT.A06(r7, r12, r0)
            X.6qx r3 = r1.A00
            java.lang.String r2 = r3.A05
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r3.A02()
            X.1OC r2 = X.FHA.A03(r4, r8, r2, r1, r0)
            java.lang.String r1 = r3.A07
            java.lang.String r0 = r3.A06
            X.EMW r4 = new X.EMW
            r6 = r4
            r11 = r12
            r12 = r1
            r13 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L_0x00a0:
            r2.A00 = r4
            r7.schedule(r2)
            return
        L_0x00a6:
            boolean r0 = r2 instanceof X.ENU
            if (r0 == 0) goto L_0x00fa
            X.ENO r1 = (X.ENO) r1
            boolean r6 = X.AnonymousClass7TG.A1Z(r8, r1)
            r0 = 3
            android.content.Context r0 = X.DbT.A06(r7, r12, r0)
            X.6ST r11 = new X.6ST
            r11.<init>(r0, r6)
            r0 = 2131965555(0x7f133673, float:1.9567923E38)
            X.DbU.A1L(r7, r11, r0)
            android.content.Context r5 = r7.requireContext()
            java.lang.String r4 = r1.A01
            X.F1D r0 = r1.A00
            java.lang.String r3 = r0.A0G
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r0 = "accounts/google_token_login/"
            java.lang.String r1 = X.DbT.A0t(r5, r2, r0)
            java.lang.String r0 = X.Dbj.A01()
            X.DbZ.A0y(r5, r2, r0, r1)
            java.lang.String r0 = "nonce"
            r2.A9m(r0, r4)
            X.DbS.A1P(r2, r3)
            X.DbW.A1D(r2)
            X.1OC r2 = X.DbT.A0U(r2, r6)
            androidx.fragment.app.FragmentActivity r6 = r7.getActivity()
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            android.net.Uri r5 = X.C46413Dea.A01(r7)
            X.EMC r4 = new X.EMC
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00a0
        L_0x00fa:
            boolean r0 = r2 instanceof X.ENW
            if (r0 == 0) goto L_0x011d
            r0 = r2
            X.ENW r0 = (X.ENW) r0
            X.ENP r1 = (X.ENP) r1
            X.AnonymousClass7TG.A1N(r8, r1)
            X.EEM r5 = r0.A00
            java.lang.String r9 = r1.A02
            java.lang.String r10 = r1.A01
            X.F1D r0 = r1.A00
            java.lang.String r11 = r0.A0G
            X.48z r6 = X.C2612848z.A00
            java.lang.String r0 = "login_username_prefill"
            X.3xQ r7 = X.C257443xP.A01(r0)
            r12 = 0
            r5.A0A(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x011d:
            X.AnonymousClass7TG.A1N(r8, r1)
            r0 = 3
            X.0qQ.A0B(r12, r0)
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<X.ENP> r0 = X.ENP.class
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x014f
            r17 = 0
            X.EEM r13 = new X.EEM
            r14 = r7
            r15 = r7
            r16 = r8
            r18 = r12
            r19 = r17
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.ENW r0 = new X.ENW
            r0.<init>(r13)
        L_0x0144:
            r2 = r0
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r1
            r7 = r10
            r8 = r12
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x014f:
            java.lang.Class<X.ENO> r0 = X.ENO.class
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x015d
            X.ENU r0 = new X.ENU
            r0.<init>()
            goto L_0x0144
        L_0x015d:
            java.lang.Class<X.ENN> r0 = X.ENN.class
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x016b
            X.ENV r0 = new X.ENV
            r0.<init>()
            goto L_0x0144
        L_0x016b:
            java.lang.Class<X.ENQ> r0 = X.ENQ.class
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0179
            X.ENX r0 = new X.ENX
            r0.<init>()
            goto L_0x0144
        L_0x0179:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49669F1b.A00(X.4DH, X.0aP, X.G8H, X.G8G, X.G51, X.DiE):void");
    }
}
