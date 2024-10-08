package X;

public final class EIB extends 0ng {
    public final /* synthetic */ 0lg A00;
    public final /* synthetic */ C49963FGw A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIB(0lg r4, C49963FGw fGw, String str) {
        super(449332491, 5, false, false);
        this.A00 = r4;
        this.A02 = str;
        this.A01 = fGw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36324935014035952L) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            android.content.Context r10 = X.C60960kU.A00
            X.0qQ.A07(r10)
            r0 = r24
            X.0lg r7 = r0.A00
            java.lang.String r5 = r0.A02
            X.8sF r0 = new X.8sF
            r0.<init>(r7)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.8s5 r3 = X.C368108s5.A06
            X.8sI r2 = X.C368238sI.ACTIVE_ACCOUNT
            r14 = 0
            X.FAQ r1 = new X.FAQ
            r1.<init>(r5, r14, r3, r2)
            r4.add(r1)
            r6 = 1
            java.lang.String r2 = "Instagram"
            java.lang.String r1 = X.0lz.A00(r10)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0042
            boolean r1 = X.0LA.A07()
            if (r1 != 0) goto L_0x0042
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324935014035952(0x810d56000031f0, double:3.0353733994247335E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            r9 = 1
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r9 = 0
        L_0x0043:
            r2 = 3
            java.lang.String r1 = "3.0"
            r0.A01 = r1
            java.lang.String r18 = X.AnonymousClass7TF.A0c()
            java.util.ArrayList r8 = X.DbV.A15(r18)
            java.util.Iterator r7 = r4.iterator()
        L_0x0054:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r7.next()
            X.FAQ r1 = (X.FAQ) r1
            X.8s5 r5 = r1.A02
            X.8sI r4 = r1.A03
            java.lang.String r3 = r1.A00
            X.FEV r1 = new X.FEV
            r1.<init>(r3, r5, r4)
            r8.add(r1)
            goto L_0x0054
        L_0x006f:
            if (r9 == 0) goto L_0x0134
            X.1Uf r1 = X.AnonymousClass1UZ.A00(r10)
            java.lang.String r5 = "XE_ACCESS_LIBRARY_DATA"
            X.1Uk r4 = r1.A00(r5)
            r1 = 2558(0x9fe, float:3.585E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            boolean r1 = r4.getBoolean(r3, r6)
            if (r1 != 0) goto L_0x0134
            X.1Uf r1 = X.AnonymousClass1UZ.A00(r10)
            X.1Uk r1 = r1.A00(r5)
            X.1W3 r1 = r1.AR0()
            r1.A0A(r3, r6)
            r1.A0B()
            java.lang.String r13 = "ACTIVE_ACCOUNT"
            r1 = 2309(0x905, float:3.236E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r1)
            java.lang.String r19 = "IG_ACCOUNT_MANAGER_MIGRATION_REMOVE"
            r20 = r14
            r21 = r14
            r22 = r14
            r23 = r0
            java.util.HashMap r16 = X.C48961Emz.A00(r18, r19, r20, r21, r22, r23)
            X.8sJ r11 = X.C368248sJ.REMOVE_START
            r15 = r14
            r17 = r0
            X.C368188sD.A00(r11, r12, r13, r14, r15, r16, r17)
            X.8sK r1 = r0.A02()
            if (r1 == 0) goto L_0x00c7
            X.8sK r3 = r0.A02()
            r1 = 857814851(0x33213743, float:3.7535994E-8)
            r3.A02(r1)
        L_0x00c7:
            android.accounts.AccountManager r6 = android.accounts.AccountManager.get(r10)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
            X.0qQ.A07(r6)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
            java.lang.String r1 = "www.instagram.com"
            android.accounts.Account[] r5 = r6.getAccountsByType(r1)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
            X.0qQ.A07(r5)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
            r4 = 0
            int r3 = r5.length     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
        L_0x00d9:
            if (r4 >= r3) goto L_0x00e5
            r1 = r5[r4]     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
            if (r1 == 0) goto L_0x00e2
            r6.removeAccountExplicitly(r1)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0106 }
        L_0x00e2:
            int r4 = r4 + 1
            goto L_0x00d9
        L_0x00e5:
            java.lang.String r22 = "true"
            java.util.HashMap r16 = X.C48961Emz.A00(r18, r19, r20, r21, r22, r23)
            X.8sJ r11 = X.C368248sJ.REMOVE_SUCCESS
            X.C368188sD.A00(r11, r12, r13, r14, r15, r16, r17)
            X.8sK r1 = r0.A02()
            if (r1 == 0) goto L_0x0134
            X.8sK r0 = r0.A02()
            r2 = 857814851(0x33213743, float:3.7535994E-8)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r0.A00
            if (r1 == 0) goto L_0x0134
            r0 = 2
            r1.markerEnd(r2, r0)
            return
        L_0x0106:
            r1 = move-exception
            java.lang.String r5 = r1.getMessage()
            r3 = r18
            r4 = r19
            r6 = r14
            r7 = r14
            r8 = r0
            java.util.HashMap r8 = X.C48961Emz.A00(r3, r4, r5, r6, r7, r8)
            X.8sJ r3 = X.C368248sJ.REMOVE_FAILURE
            java.lang.String r6 = "REMOVE_ERROR"
            r4 = r12
            r5 = r13
            r9 = r0
            X.C368188sD.A00(r3, r4, r5, r6, r7, r8, r9)
            X.8sK r1 = r0.A02()
            if (r1 == 0) goto L_0x0134
            X.8sK r0 = r0.A02()
            r1 = 857814851(0x33213743, float:3.7535994E-8)
            com.facebook.quicklog.QuickPerformanceLogger r0 = r0.A00
            if (r0 == 0) goto L_0x0134
            r0.markerEnd(r1, r2)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIB.run():void");
    }
}
