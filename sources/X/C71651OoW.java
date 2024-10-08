package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.OoW  reason: case insensitive filesystem */
public final class C71651OoW implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71651OoW(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.facebook.msys.mca.MailboxFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: X.6AW} */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        X.DbS.A1U(r1.A01);
        ((java.lang.Runnable) r1.A02).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02f8, code lost:
        com.facebook.instagrammem.mca.MailboxInstagramMemJNI.dispatchVOOO(r0, r10, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03ae, code lost:
        com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r10, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03b1, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            r10 = r29
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x03f8;
                case 2: goto L_0x03db;
                case 3: goto L_0x03b2;
                case 4: goto L_0x0392;
                case 5: goto L_0x0375;
                case 6: goto L_0x0357;
                case 7: goto L_0x0339;
                case 8: goto L_0x031b;
                case 9: goto L_0x02fc;
                case 10: goto L_0x02db;
                case 11: goto L_0x02bd;
                case 12: goto L_0x02a3;
                case 13: goto L_0x01a1;
                case 14: goto L_0x0176;
                case 15: goto L_0x015d;
                case 16: goto L_0x013b;
                case 17: goto L_0x0119;
                case 18: goto L_0x0071;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A03
            X.Ma7 r0 = (X.C66638Ma7) r0
            X.ONf r3 = r0.A02
            java.lang.Object r0 = r1.A02
            X.1OS r0 = (X.1OS) r0
            java.lang.String r2 = r0.A05
            java.lang.Object r1 = r1.A01
            X.Pwk r1 = (X.C74551Pwk) r1
            X.Oxv r0 = r3.A03
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            r0.remove(r2)
            r0 = 0
            r1.DTM(r0, r0)
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r0 = r1.A02
            X.ONS r0 = (X.ONS) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r0.A02
            r3 = 1021646192(0x3ce51570, float:0.027964324)
            int r2 = r0.A01
            java.lang.String r0 = "eb_manager_add_device_end"
            r4.markerPoint(r3, r2, r0)
            r0 = 0
            boolean r0 = X.C66583MXo.A1W(r0, r10)
            if (r0 == 0) goto L_0x004b
            java.lang.Object r2 = r1.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.NiE r1 = X.C69252NiE.A02
            X.N0I r0 = new X.N0I
            r0.<init>(r1)
        L_0x0047:
            r2.A05(r0)
            return
        L_0x004b:
            r0 = -1
            boolean r0 = X.C66583MXo.A1W(r0, r10)
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r1.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.AddDeviceException r0 = new com.encryptedbackups.statemanager.model.AddDeviceException
            r0.<init>()
        L_0x005b:
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0047
        L_0x0060:
            r0 = -2
            boolean r0 = X.C66583MXo.A1W(r0, r10)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r1.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.WrongRecoveryCodeException r0 = new com.encryptedbackups.statemanager.model.WrongRecoveryCodeException
            r0.<init>()
            goto L_0x005b
        L_0x0071:
            java.lang.Object r3 = r1.A01
            X.67Z r3 = (X.AnonymousClass67Z) r3
            java.lang.Object r2 = r1.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r11 = r1.A03
            X.67N r11 = (X.AnonymousClass67N) r11
            com.facebook.msys.mca.MailboxNullable r10 = (com.facebook.msys.mca.MailboxNullable) r10
            java.lang.Object r0 = r10.value
            r4 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x0112
            X.5z0 r0 = (X.C301345z0) r0
            int r0 = X.C66580MXl.A04(r0)
            if (r0 == 0) goto L_0x0112
            java.util.HashSet r9 = X.C66580MXl.A12(r2)
            java.util.ArrayList r7 = X.C51970G9q.A0m(r2)
            r6 = 0
        L_0x0099:
            java.lang.Object r0 = r10.value
            X.5z0 r0 = (X.C301345z0) r0
            int r0 = X.C66580MXl.A04(r0)
            if (r6 >= r0) goto L_0x00cf
            java.lang.Object r0 = r10.value
            X.5z0 r0 = (X.C301345z0) r0
            com.facebook.msys.mci.CQLResultSet r1 = r0.mResultSet
            r0 = 1
            long r1 = r1.getLong(r6, r0)
            java.lang.Object r0 = r10.value
            X.5z0 r0 = (X.C301345z0) r0
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r0 = 2
            java.lang.Long r5 = r5.getNullableLong(r6, r0)
            java.lang.Object r0 = r10.value
            X.5z0 r0 = (X.C301345z0) r0
            java.lang.String r0 = X.C66580MXl.A0v(r0, r6, r4)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x00cc
            if (r5 == 0) goto L_0x00cc
            X.AnonymousClass7TE.A1Y(r7, r1)
        L_0x00cc:
            int r6 = r6 + 1
            goto L_0x0099
        L_0x00cf:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0112
            java.lang.Object r0 = r7.get(r4)
            long r15 = X.AnonymousClass7TE.A0R(r0)
            r0 = 13
            X.Opf r1 = new X.Opf
            r1.<init>((X.AnonymousClass67Z) r3, (int) r0)
            X.68L r0 = X.C66580MXl.A0F(r11, r4)
            com.facebook.msys.mca.MailboxFutureImpl r12 = X.C66580MXl.A0G(r0)
            java.lang.String r3 = "MailboxInstagramSecureMessage"
            java.lang.String r2 = "loadSHIMThreadInfoByFbId"
            int r13 = X.C3030067a.A00(r12)
            com.facebook.msys.mci.TraceInfo r1 = X.C66580MXl.A0I(r1, r12, r3, r2)
            r14 = 6
            X.Opi r10 = new X.Opi
            r10.<init>((X.AnonymousClass67N) r11, (com.facebook.msys.mca.MailboxFutureImpl) r12, (int) r13, (int) r14, (long) r15)
            boolean r0 = r0.EJd(r10)
            if (r0 != 0) goto L_0x010d
            r12.cancel(r4)
            X.C3030067a.A02(r13)
            X.C3030067a.A03(r1, r3, r2)
        L_0x010d:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            return
        L_0x0112:
            r3.A02(r8)
            r3.A00()
            return
        L_0x0119:
            java.lang.Object r2 = X.C66583MXo.A0g(r10)
            X.NB0 r2 = (X.NB0) r2
            java.lang.Object r3 = r1.A03
            X.65B r3 = (X.AnonymousClass65B) r3
            monitor-enter(r3)
            X.65C r0 = X.AnonymousClass65B.A03     // Catch:{ all -> 0x0138 }
            r3.A00 = r2     // Catch:{ all -> 0x0138 }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0138 }
            monitor-exit(r3)
            java.lang.Object r2 = r1.A02
            X.0sJ r2 = (X.0sJ) r2
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
            X.AnonymousClass65B.A03(r3, r0, r2)
            return
        L_0x0138:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x013b:
            com.facebook.msys.mca.Mailbox r10 = (com.facebook.msys.mca.Mailbox) r10
            java.lang.Object r11 = r1.A02
            com.facebook.msys.mca.MailboxFutureImpl r11 = (com.facebook.msys.mca.MailboxFutureImpl) r11
            r15 = 0
            com.facebook.msys.mca.MailboxNullable r12 = new com.facebook.msys.mca.MailboxNullable
            r12.<init>(r15)
            java.lang.Object r2 = r1.A03
            com.facebook.msys.mci.PrivacyContext r2 = (com.facebook.msys.mci.PrivacyContext) r2
            r0 = 47
            X.Opk r19 = X.C71726Opk.A00(r1, r0)
            java.lang.String r17 = "MCAMailboxSafetyInterventions"
            java.lang.String r18 = "ActiveSafetyInterventions"
            r13 = 0
            r14 = r13
            r16 = r2
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x015d:
            java.lang.Object r0 = r1.A03
            X.Oan r0 = (X.C71068Oan) r0
            X.OBt r2 = r0.A0C
            X.OMh r0 = r0.A03
            if (r0 == 0) goto L_0x0171
            com.facebook.msys.mca.MailboxCallback r2 = r2.A00
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r2.onCompletion(r0)
            goto L_0x018f
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0176:
            java.lang.Object r0 = r1.A03
            X.Oan r0 = (X.C71068Oan) r0
            X.OBt r2 = r0.A0C
            X.OMh r0 = r0.A03
            if (r0 == 0) goto L_0x019c
            com.facebook.msys.mca.MailboxCallback r2 = r2.A00
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r2.onCompletion(r0)
            r0 = 755177991(0x2d031a07, float:7.452267E-12)
            com.facebook.msys.mci.ExecutionLogger.activeFlowMarkerEnd(r0)
        L_0x018f:
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r1.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x019c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01a1:
            if (r29 == 0) goto L_0x029e
            java.lang.Object r0 = r1.A02
            X.OBt r0 = (X.C70571OBt) r0
            java.lang.Object r2 = r1.A03
            X.Oan r2 = (X.C71068Oan) r2
            java.lang.String r3 = r2.A0D
            java.lang.Object r1 = r1.A01
            r19 = 8
            X.IxG r18 = new X.IxG
            r20 = r10
            r21 = r2
            r22 = r0
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            r15 = 0
            r7 = 1
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r2 = r5.A06
            boolean r1 = X.0qQ.A0K(r2, r3)
            X.17k.A0F(r1)
            X.OIt r1 = X.OVM.A05
            X.OVM r1 = r1.A00(r5)
            X.68G r1 = r1.A02
            X.68F r3 = r1.A01
            X.6AT r1 = X.AnonymousClass6AR.A00(r5)
            X.692 r4 = r3.A00
            X.5wg r3 = r4.A01
            X.5wo r6 = r3.A05
            java.lang.Object r9 = r6.get()
            java.lang.String r9 = (java.lang.String) r9
            r16 = 0
            if (r9 == 0) goto L_0x01fd
            java.lang.String r6 = "/"
            X.0qQ.A0B(r6, r7)
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x01fd
            int r6 = r9.length()
            int r6 = r6 - r7
            java.lang.String r9 = X.C51967G9n.A0q(r9, r15, r6)
        L_0x01fd:
            boolean r6 = r1.A05
            if (r6 == 0) goto L_0x020d
            X.0JC r6 = X.0JC.A00()
            boolean r6 = r6.A04()
            if (r6 == 0) goto L_0x020d
            r16 = 1
        L_0x020d:
            com.facebook.msys.mci.AuthData r6 = r4.A03
            r6.getFacebookUserID()
            r23 = 0
            boolean r14 = r1.A02
            boolean r6 = r1.A07
            r11 = 2
            r12 = 30
            X.636 r8 = new X.636
            r10 = r9
            r17 = r6
            r8.<init>(r9, r10, r11, r12, r14, r15, r16, r17)
            android.content.Context r3 = r3.A01
            java.lang.String r6 = X.C61120lW.A04(r3)
            X.637 r3 = new X.637
            r3.<init>(r6)
            com.instagram.user.model.User r6 = X.AnonymousClass7TF.A0Q(r5)
            com.facebook.msys.mci.AccountSession r5 = r4.A02
            X.62u r4 = new X.62u
            r4.<init>(r5)
            X.6AW r5 = new X.6AW
            r5.<init>(r4)
            java.lang.Long r4 = r6.BST()
            long r20 = X.JTS.A06(r4)
            java.lang.String r25 = r6.B8Q()
            r22 = r5
            r24 = r2
            r26 = r20
            com.facebook.msys.mca.MailboxFutureImpl r2 = r22.A01(r23, r24, r25, r26)
            com.google.common.util.concurrent.ListenableFuture r7 = X.C303606Aa.A00(r2)
            X.1Lf r4 = X.1Lf.A01
            X.IxC r6 = new X.IxC
            r19 = r6
            r22 = r1
            r23 = r5
            r24 = r0
            r25 = r11
            r19.<init>(r20, r22, r23, r24, r25)
            X.0qQ.A0B(r7, r15)
            r2 = 13
            X.PqK r6 = X.C74178PqK.A00(r6, r2)
            X.6Ac r2 = new X.6Ac
            r2.<init>(r6)
            X.6Af r6 = X.C303646Ae.A01(r2, r7, r4)
            r14 = 7
            X.Iww r2 = new X.Iww
            r9 = r2
            r10 = r20
            r12 = r5
            r13 = r1
            r9.<init>(r10, r12, r13, r14)
            X.6Aj r1 = new X.6Aj
            r1.<init>(r2)
            X.6Af r2 = X.C303646Ae.A01(r1, r6, r4)
            r6 = 3
            X.IL2 r1 = new X.IL2
            r10 = r18
            r5 = r1
            r7 = r3
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            X.C255183ti.A04(r1, r2, r4)
            return
        L_0x029e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02a3:
            com.facebook.msys.mca.Mailbox r10 = (com.facebook.msys.mca.Mailbox) r10
            java.lang.Object r11 = r1.A02
            com.facebook.msys.mca.MailboxFutureImpl r11 = (com.facebook.msys.mca.MailboxFutureImpl) r11
            com.facebook.msys.mca.MailboxNullable r12 = X.C66581MXm.A0K()
            r0 = 14
            X.Opk r17 = X.C71726Opk.A00(r1, r0)
            java.lang.String r15 = "MCAMailboxInstagramOpenXmaReceiverFetch"
            java.lang.String r16 = "InstagramXmaBatchedReceiverFetchQuery"
            r13 = 0
            r14 = r13
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x02bd:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAY.A00
            r0 = 29
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 20
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 10
            goto L_0x02f8
        L_0x02db:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAY.A00
            r0 = 41
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 19
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 9
        L_0x02f8:
            com.facebook.instagrammem.mca.MailboxInstagramMemJNI.dispatchVOOO(r0, r10, r1, r2)
            return
        L_0x02fc:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 381(0x17d, float:5.34E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 18
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A03
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A02
            r0 = 54
            goto L_0x03ae
        L_0x031b:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 346(0x15a, float:4.85E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 14
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 45
            goto L_0x03ae
        L_0x0339:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 335(0x14f, float:4.7E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 10
            com.facebook.msys.util.NotificationScope r2 = X.C71734Opu.A01(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 33
            goto L_0x03ae
        L_0x0357:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 324(0x144, float:4.54E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 10
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 32
            goto L_0x03ae
        L_0x0375:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 339(0x153, float:4.75E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 7
            com.facebook.msys.util.NotificationScope r2 = X.C71734Opu.A01(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 25
            goto L_0x03ae
        L_0x0392:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 330(0x14a, float:4.62E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 5
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.Object r1 = r1.A03
            r0 = 22
        L_0x03ae:
            com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r10, r1, r2)
            return
        L_0x03b2:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAX.A00
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r0)
            X.5nb r2 = X.C66580MXl.A0H(r10)
            r0 = 4
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r2, r1, r3, r0)
            java.lang.Object r0 = r1.A03
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.String r11 = "ENCRYPTED_BACKUP_ONBOARDED_KEY"
            java.lang.Object r12 = r1.A02
            r13 = 0
            r9 = 16
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r2
            com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOOOOOOO(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x03db:
            com.facebook.msys.mci.AccountSession r10 = (com.facebook.msys.mci.AccountSession) r10
            X.681 r2 = X.NAW.A00
            r0 = 2
            java.lang.String r4 = X.C66580MXl.A0u(r2, r0)
            X.5nb r0 = X.C66580MXl.A0H(r10)
            r3 = 0
            com.facebook.msys.util.NotificationScope r2 = X.C71733Opt.A00(r0, r1, r4, r3)
            java.lang.Object r0 = r1.A03
            X.C66580MXl.A1N(r2, r0, r4)
            java.lang.Object r0 = r1.A02
            com.facebook.advancedcryptotransportpushnotifications.mca.MailboxAdvancedCryptoTransportPushNotificationsJNI.dispatchVOOO(r3, r10, r0, r2)
            return
        L_0x03f8:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r5 = r1.A03
            X.OdW r5 = (X.C71133OdW) r5
            java.lang.Object r4 = r1.A02
            int[] r4 = (int[]) r4
            java.lang.String r0 = "FETCH_BACKUP_STATUS_READ_CLIENT_STATE_END"
            X.C71133OdW.A04(r5, r0, r4)
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0425
            X.Njg r3 = X.C69341Njg.DEVICE_ONBOARDED
        L_0x040f:
            java.lang.Object r2 = r1.A01
            X.ObS r2 = (X.C71087ObS) r2
            java.lang.String r1 = r3.name()
            java.lang.String r0 = "backup_state"
            X.C71133OdW.A03(r5, r0, r1, r4)
            X.OFl r1 = r5.A00
            r0 = 1
            r1.A03 = r0
            r2.A05(r3)
            return
        L_0x0425:
            X.Njg r3 = X.C69341Njg.DEVICE_NOT_ONBOARDED
            goto L_0x040f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71651OoW.onCompletion(java.lang.Object):void");
    }
}
