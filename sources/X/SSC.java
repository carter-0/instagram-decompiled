package X;

public abstract class SSC {
    public S4g A00;
    public boolean A01;
    public final AnonymousClass5A3 A02;
    public final C7422QCn A03 = new C7422QCn(this);

    public static C7422QCn A02(AnonymousClass5A3 r2, Object obj, Object obj2) {
        C8275QnH qnH = new C8275QnH(r2, obj, obj2, 1);
        A05(qnH);
        C7422QCn qCn = qnH.A03;
        0qQ.A0A(qCn);
        return qCn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.QnY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: X.QnY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: X.QnY} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.S4g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.2Fk r15, X.SSC r16) {
        /*
            r6 = r16
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x00a4
            X.QCn r1 = r6.A03
            X.59x r0 = r1.A01
            if (r0 == 0) goto L_0x000f
            r0.AOY(r1)
        L_0x000f:
            X.S4g r2 = r6.A00
            if (r2 == 0) goto L_0x0022
            monitor-enter(r2)
            boolean r0 = r2.A02     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            if (r0 != 0) goto L_0x0022
            X.S4g r0 = r6.A00
            r0.A00()
        L_0x0022:
            if (r15 != 0) goto L_0x0031
            X.SUj r2 = X.SUj.A02()
            java.lang.Object r0 = r1.A02()
            if (r0 == r2) goto L_0x0031
            r1.A0B(r2)
        L_0x0031:
            X.S4g r0 = new X.S4g
            r0.<init>()
            r6.A00 = r0
            X.RDz r0 = X.C8882RDz.LOADING
            r12 = 0
            X.SUj r3 = new X.SUj
            r3.<init>(r0, r12, r12)
            X.2Fk r0 = r1.A00
            if (r0 == 0) goto L_0x0047
            r1.A0D(r0)
        L_0x0047:
            r1.A00 = r15
            if (r15 == 0) goto L_0x0055
            r2 = 24
            X.Sdq r0 = new X.Sdq
            r0.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r1)
            r1.A0E(r15, r0)
        L_0x0055:
            X.S4g r0 = r6.A00
            boolean r2 = r6 instanceof X.C8279QnL
            if (r2 == 0) goto L_0x00a5
            X.QnL r6 = (X.C8279QnL) r6
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.5A3 r5 = r6.A02
            X.1MD r7 = r6.A00
            X.SFo r4 = r6.A03
            X.SOC r3 = r6.A01
            X.0qQ.A0B(r5, r2)
            X.AnonymousClass7TG.A1U(r7, r4, r3)
            java.lang.String r9 = r4.A03
            java.lang.String r10 = r4.A04
            java.lang.String r11 = r4.A05
            java.lang.String r13 = r4.A06
            java.lang.String r12 = r4.A07
            java.util.Map r14 = r4.A08
            X.Ry5 r8 = new X.Ry5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.SvM r2 = new X.SvM
            r2.<init>(r7, r0)
            X.Tdl r0 = r4.A00
            X.SHg r0 = r3.A02(r2, r8, r0)
            X.QnX r3 = new X.QnX
            r3.<init>(r0, r5, r4)
        L_0x0090:
            X.59x r0 = r1.A01
            if (r0 == 0) goto L_0x0097
            r0.AOY(r1)
        L_0x0097:
            r1.A01 = r3
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x00a4
            if (r3 == 0) goto L_0x00a4
            r3.A9U(r1)
        L_0x00a4:
            return
        L_0x00a5:
            boolean r2 = r6 instanceof X.C8283QnP
            if (r2 == 0) goto L_0x01a1
            X.QnP r6 = (X.C8283QnP) r6
            X.Rt5 r2 = r6.A03
            X.SJB r3 = r6.A00
            java.lang.String r7 = r2.A00
            java.lang.String r8 = X.AnonymousClass7TF.A0b()
            X.SGu r0 = X.AnonymousClass2E0.A0C()
            java.lang.String r10 = r0.A01()
            X.0eK r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.5A3 r0 = (X.AnonymousClass5A3) r0
            X.2E5 r0 = r0.A00
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r4 = r0.A01
            r9 = 0
            X.AnonymousClass7TF.A1D(r3, r9, r4)
            java.lang.String r0 = "0"
            boolean r6 = X.0qQ.A0K(r7, r0)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r2 = 9
            r0 = 79
            java.lang.String r0 = X.Py7.A01(r9, r2, r0)
            X.0Df r5 = X.C41845B3m.A03(r5, r10, r0)
            if (r6 != 0) goto L_0x0162
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x00e9
            java.lang.String r2 = "FBPAY_HUB"
        L_0x00e9:
            java.lang.String r0 = "payment_type"
            X.0Df.A00(r5, r2, r0)
            java.lang.String r0 = "actor_id"
            X.0Df.A00(r5, r7, r0)
            java.lang.String r7 = r3.A00
            if (r7 == 0) goto L_0x0112
            java.lang.String r6 = r3.A01
            if (r6 == 0) goto L_0x0112
            X.2IV r2 = X.Pxe.A0R()
            java.lang.String r0 = "otc_session_id"
            r2.A09(r7, r0)
            java.lang.String r0 = "otc_type"
            r2.A09(r6, r0)
            java.lang.String r0 = "one_time_checkout_input"
            X.C66580MXl.A1M(r5, r2, r0)
        L_0x0112:
            if (r8 == 0) goto L_0x011f
            int r0 = r8.length()
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "client_mutation_id"
            X.0Df.A00(r5, r8, r0)
        L_0x011f:
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x012f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = "target_account_id"
            X.0Df.A00(r5, r2, r0)
        L_0x012f:
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x013f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = "receiver_id"
            X.0Df.A00(r5, r2, r0)
        L_0x013f:
            java.lang.Class<X.S8f> r2 = X.C11060S8f.class
            java.lang.String r0 = "create"
            java.lang.Object r3 = X.Pxj.A0l(r12, r2, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x037a }
            X.SnC r3 = (X.C12114SnC) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x037a }
            X.2IS r2 = r3.A00
            java.lang.String r0 = "input"
            X.DbW.A18(r5, r2, r0)
            r0 = 1
            r3.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r2 = r3.build()
            X.0qQ.A07(r2)
            X.DGQ r0 = X.DGQ.A00
            X.Qna r3 = X.C8294Qna.A00(r12, r4, r2, r0)
            goto L_0x0090
        L_0x0162:
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x017e
            int r0 = r2.length()
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "payment_account_id"
            X.0Df.A00(r5, r2, r0)
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x0178
            java.lang.String r2 = "UNKNOWN"
        L_0x0178:
            java.lang.String r0 = "payment_type"
            X.0Df.A00(r5, r2, r0)
        L_0x017e:
            java.lang.Class<X.S8e> r2 = X.C11059S8e.class
            java.lang.String r0 = "create"
            java.lang.Object r3 = X.Pxj.A0l(r12, r2, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0380 }
            X.SnB r3 = (X.C12113SnB) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0380 }
            X.2IS r2 = r3.A00
            java.lang.String r0 = "data"
            X.DbW.A18(r5, r2, r0)
            r0 = 1
            r3.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r2 = r3.build()
            X.0qQ.A07(r2)
            X.DGP r0 = X.DGP.A00
            X.Qna r3 = X.C8294Qna.A00(r12, r4, r2, r0)
            goto L_0x0090
        L_0x01a1:
            boolean r2 = r6 instanceof X.C8280QnM
            if (r2 == 0) goto L_0x01f6
            X.QnM r6 = (X.C8280QnM) r6
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.5A3 r8 = r6.A02
            X.0sP r3 = r6.A04
            r2 = 12
            X.Sd0 r7 = new X.Sd0
            r7.<init>((int) r2, (X.0sP) r3)
            X.RyZ r5 = r6.A03
            X.SOC r4 = r6.A01
            r2 = 2
            X.0qQ.A0B(r5, r2)
            java.lang.String r14 = "TRUST_BINDING"
            java.util.Map r2 = r5.A06
            X.Ry5 r3 = new X.Ry5
            r9 = r3
            r10 = r12
            r11 = r12
            r13 = r12
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.SvN r2 = new X.SvN
            r2.<init>(r7, r0)
            X.Tdl r0 = r5.A01
            X.SHg r0 = r4.A02(r2, r3, r0)
            X.QnY r3 = new X.QnY
            r3.<init>(r0, r8, r5)
            X.SHg r4 = r3.A00
            X.RyZ r0 = r3.A02
            java.lang.Object r6 = r0.A04
            java.lang.String r7 = "CREATE_TRUST_BINDING"
            java.util.Set r8 = r0.A07
            X.SvL r5 = new X.SvL
            r5.<init>(r3)
            X.5A3 r0 = r3.A01
            X.2E5 r0 = r0.A00
            java.util.concurrent.Executor r9 = r0.A03
            r4.A01(r5, r6, r7, r8, r9)
            goto L_0x0090
        L_0x01f6:
            boolean r2 = r6 instanceof X.C8282QnO
            if (r2 == 0) goto L_0x0206
            X.QnO r6 = (X.C8282QnO) r6
            X.1MD r2 = r6.A00
            java.lang.Object r3 = r2.apply(r0)
            X.59x r3 = (X.C2818759x) r3
            goto L_0x0090
        L_0x0206:
            boolean r2 = r6 instanceof X.C8278QnK
            if (r2 == 0) goto L_0x0278
            X.QnK r6 = (X.C8278QnK) r6
            int r2 = r6.A00
            if (r2 == 0) goto L_0x0267
            java.lang.Object r2 = r6.A01
            X.SIS r2 = (X.SIS) r2
            X.RvS r2 = r2.A02
            java.lang.String r9 = r6.A03
            r11 = 1
            X.0qQ.A0B(r9, r11)
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r4 = X.AnonymousClass7TF.A0b()
            java.lang.String r3 = "client_mutation_id"
            X.0Df r5 = X.C41845B3m.A03(r6, r4, r3)
            java.lang.String r3 = "sensitive_string_value"
            X.0Df r4 = X.C41845B3m.A03(r6, r9, r3)
            java.lang.String r3 = "password"
            r5.A0E(r4, r3)
            java.lang.String r14 = "input"
            X.1vR r6 = X.C41847B3o.A04(r5, r8, r14)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Bky> r10 = X.C42878Bky.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IgPaymentsPINDeleteMutation"
            r13 = 8
            java.lang.String r15 = "payment_pin_delete"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r3 = r2.A01
            X.DGT r2 = X.DGT.A00
            X.Qna r3 = X.C8294Qna.A00(r0, r3, r5, r2)
            goto L_0x0090
        L_0x0267:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r6.A02
            X.Stc r2 = (X.Stc) r2
            X.S0a r4 = r2.A02
            java.lang.Object r3 = r6.A01
            X.SJK r3 = (X.SJK) r3
            java.lang.String r2 = r6.A03
            goto L_0x02c7
        L_0x0278:
            boolean r2 = r6 instanceof X.C8277QnJ
            if (r2 == 0) goto L_0x02a1
            X.QnJ r6 = (X.C8277QnJ) r6
            int r3 = r6.A00
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r6.A02
            if (r3 == 0) goto L_0x029c
            X.Stb r2 = (X.Stb) r2
            X.S0a r4 = r2.A01
        L_0x028c:
            java.lang.Object r3 = r6.A01
            X.SJK r3 = (X.SJK) r3
            java.lang.String r2 = "PERSISTENT_UP_TO_DATE"
            X.S1I r2 = X.C9619Rdx.A00(r2)
            X.Qna r3 = r4.A00(r0, r2, r3)
            goto L_0x0090
        L_0x029c:
            X.Std r2 = (X.C12404Std) r2
            X.S0a r4 = r2.A01
            goto L_0x028c
        L_0x02a1:
            boolean r2 = r6 instanceof X.C8275QnH
            if (r2 == 0) goto L_0x02d1
            X.QnH r6 = (X.C8275QnH) r6
            int r2 = r6.A00
            if (r2 == 0) goto L_0x02b7
            java.lang.Object r2 = r6.A01
            X.1MD r2 = (X.1MD) r2
            java.lang.Object r3 = r2.apply(r0)
            X.59x r3 = (X.C2818759x) r3
            goto L_0x0090
        L_0x02b7:
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r6.A02
            X.S4L r2 = (X.S4L) r2
            X.S0a r4 = r2.A01
            java.lang.Object r3 = r6.A01
            X.SJK r3 = (X.SJK) r3
            java.lang.String r2 = "PERSISTENT_UP_TO_5_MINS"
        L_0x02c7:
            X.S1I r2 = X.C9619Rdx.A00(r2)
            X.Qna r3 = r4.A00(r0, r2, r3)
            goto L_0x0090
        L_0x02d1:
            boolean r2 = r6 instanceof X.C8274QnG
            if (r2 == 0) goto L_0x0348
            X.QnG r6 = (X.C8274QnG) r6
            X.Rq3 r5 = r6.A00
            X.SSZ r2 = r6.A01
            java.util.HashMap r2 = X.SSZ.A03(r2)
            java.util.Collection r2 = r2.values()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1D(r2)
            X.0eK r2 = r5.A00
            java.lang.Object r2 = r2.get()
            X.5A3 r2 = (X.AnonymousClass5A3) r2
            X.2E5 r2 = r2.A00
            X.1vo r6 = r2.A00
            boolean r7 = X.C51970G9q.A1Y(r6)
            java.lang.Class<X.S8b> r3 = X.C11056S8b.class
            java.lang.String r2 = "create"
            java.lang.Object r8 = X.C41847B3o.A17(r3, r2, r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0386 }
            X.Smu r8 = (X.C12099Smu) r8     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0386 }
            com.google.common.collect.ImmutableList$Builder r4 = X.Pxe.A0Y()
            java.util.Iterator r3 = r9.iterator()
        L_0x0309:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0319
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L_0x0309
            r4.add(r2)
            goto L_0x0309
        L_0x0319:
            com.google.common.collect.ImmutableList r4 = X.DbZ.A0K(r4)
            X.2IS r3 = r8.A00
            java.lang.String r2 = "fbids"
            r3.A05(r2, r4)
            r2 = 1
            r8.A02 = r2
            X.1Ef r4 = r8.build()
            X.0qQ.A07(r4)
            r2 = 0
            X.1Ef r2 = r4.setMaxToleratedCacheAgeMs(r2)
            r2.setEnsureCacheWrite(r7)
            X.DGO r2 = X.DGO.A00
            X.Qna r3 = X.C8294Qna.A00(r0, r6, r4, r2)
            r2 = 3
            X.Svf r0 = new X.Svf
            r0.<init>(r5, r2)
            r3.A9U(r0)
            goto L_0x0090
        L_0x0348:
            boolean r2 = r6 instanceof X.C8276QnI
            if (r2 == 0) goto L_0x0362
            X.QnI r6 = (X.C8276QnI) r6
            int r4 = r6.A00
            X.Tg9 r3 = r6.A02
            android.util.SparseArray r2 = r6.A01
            if (r4 != 0) goto L_0x035c
            X.59x r3 = r3.EM7(r2, r0)
            goto L_0x0090
        L_0x035c:
            X.59x r3 = r3.EE9(r2, r0)
            goto L_0x0090
        L_0x0362:
            X.QnN r6 = (X.C8281QnN) r6
            if (r0 == 0) goto L_0x0377
            X.Stb r2 = r6.A03
            X.QNI r4 = r6.A00
            java.lang.String r3 = r6.A06
            X.S0b r2 = r2.A02
            X.0qQ.A0A(r4)
            X.Qna r3 = r2.A00(r0, r4, r3)
            goto L_0x0090
        L_0x0377:
            r3 = 0
            goto L_0x0090
        L_0x037a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0380:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0386:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSC.A04(X.2Fk, X.SSC):void");
    }

    public static void A05(SSC ssc) {
        if (!ssc.A01) {
            ssc.A01 = true;
            SUj A0W = Pxe.A0W(ssc.A03);
            if (A0W == null || A0W.A01 == null) {
                A04((2Fk) null, ssc);
            }
        }
    }

    public SSC(AnonymousClass5A3 r2) {
        this.A02 = r2;
    }

    public static C7422QCn A03(SSC ssc) {
        A05(ssc);
        return ssc.A03;
    }
}
