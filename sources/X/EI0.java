package X;

import com.instagram.common.session.UserSession;

public final class EI0 extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C49963FGw A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EI0(UserSession userSession, C49963FGw fGw) {
        super(1695590504, 5, false, false);
        this.A00 = userSession;
        this.A01 = fGw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36324935014035952L) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            X.0eE r0 = X.AnonymousClass0t1.A01
            r1 = r31
            com.instagram.common.session.UserSession r8 = r1.A00
            com.instagram.user.model.User r10 = r0.A01(r8)
            android.content.Context r13 = X.C60960kU.A00
            if (r13 == 0) goto L_0x01c7
            java.lang.String r7 = r8.A06
            X.8sF r1 = new X.8sF
            r1.<init>(r8)
            r17 = 2
            r4 = 0
            r3 = 1
            java.lang.String r2 = "Instagram"
            java.lang.String r0 = X.0lz.A00(r13)     // Catch:{ NullPointerException -> 0x01b0 }
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x01b0 }
            if (r0 == 0) goto L_0x0039
            boolean r0 = X.0LA.A07()     // Catch:{ NullPointerException -> 0x01b0 }
            if (r0 != 0) goto L_0x0039
            X.0Tu r0 = X.0Tu.A05     // Catch:{ NullPointerException -> 0x01b0 }
            r5 = 36324935014035952(0x810d56000031f0, double:3.0353733994247335E-306)
            boolean r0 = X.182.A06(r0, r8, r5)     // Catch:{ NullPointerException -> 0x01b0 }
            r9 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            r0 = 874(0x36a, float:1.225E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)     // Catch:{ NullPointerException -> 0x01b0 }
            java.util.Map r0 = X.1CV.A09     // Catch:{ NullPointerException -> 0x01b0 }
            X.1CW r0 = new X.1CW     // Catch:{ NullPointerException -> 0x01b0 }
            r0.<init>(r13, r2)     // Catch:{ NullPointerException -> 0x01b0 }
            X.1CV r0 = r0.A00()     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r20 = r0.C1q(r7)     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r21 = "INSTAGRAM"
            X.8s5 r23 = X.C368108s5.A06     // Catch:{ NullPointerException -> 0x01b0 }
            X.8sI r2 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r5 = "user_name"
            java.lang.String r0 = r10.getFullName()     // Catch:{ NullPointerException -> 0x01b0 }
            X.0eP r8 = X.AnonymousClass7TE.A1L(r5, r0)     // Catch:{ NullPointerException -> 0x01b0 }
            r0 = 1717(0x6b5, float:2.406E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r6 = X.DbU.A0p(r10)     // Catch:{ NullPointerException -> 0x01b0 }
            X.0eP r6 = X.AnonymousClass7TE.A1L(r0, r6)     // Catch:{ NullPointerException -> 0x01b0 }
            X.0eP[] r6 = new X.0eP[]{r8, r6}     // Catch:{ NullPointerException -> 0x01b0 }
            java.util.LinkedHashMap r22 = X.0Yt.A07(r6)     // Catch:{ NullPointerException -> 0x01b0 }
            X.F3S r18 = new X.F3S     // Catch:{ NullPointerException -> 0x01b0 }
            r19 = r7
            r24 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ NullPointerException -> 0x01b0 }
            X.F3S[] r8 = new X.F3S[]{r18}     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r6 = "3.0"
            r1.A01 = r6     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r25 = X.AnonymousClass7TF.A0c()     // Catch:{ NullPointerException -> 0x01b0 }
            X.0qQ.A07(r25)     // Catch:{ NullPointerException -> 0x01b0 }
            if (r9 == 0) goto L_0x01c7
            X.1Uf r6 = X.AnonymousClass1UZ.A00(r13)     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r10 = "XE_ACCESS_LIBRARY_DATA"
            X.1Uk r6 = r6.A00(r10)     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r7 = "account_manager_migration_completed"
            boolean r6 = r6.getBoolean(r7, r4)     // Catch:{ NullPointerException -> 0x01b0 }
            if (r6 != 0) goto L_0x01c7
            r9 = r8[r4]     // Catch:{ NullPointerException -> 0x01b0 }
            X.8sI r4 = r9.A05     // Catch:{ NullPointerException -> 0x01b0 }
            if (r4 != r2) goto L_0x01c7
            X.1Uf r2 = X.AnonymousClass1UZ.A00(r13)     // Catch:{ NullPointerException -> 0x01b0 }
            X.1Uk r2 = r2.A00(r10)     // Catch:{ NullPointerException -> 0x01b0 }
            X.1W3 r2 = r2.AR0()     // Catch:{ NullPointerException -> 0x01b0 }
            r2.A0A(r7, r3)     // Catch:{ NullPointerException -> 0x01b0 }
            r2.A0B()     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r2 = "www.instagram.com"
            java.lang.String r20 = "ACTIVE_ACCOUNT"
            r3 = 2309(0x905, float:3.236E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r3)     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r26 = "IG_ACCOUNT_MANAGER_MIGRATION_SAVE"
            r6 = 0
            r27 = r6
            r28 = r6
            r29 = r6
            r30 = r1
            java.util.HashMap r23 = X.C48961Emz.A00(r25, r26, r27, r28, r29, r30)     // Catch:{ NullPointerException -> 0x01b0 }
            X.8sJ r18 = X.C368248sJ.WRITE_START     // Catch:{ NullPointerException -> 0x01b0 }
            r19 = r16
            r21 = r6
            r22 = r6
            r24 = r1
            X.C368188sD.A00(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ NullPointerException -> 0x01b0 }
            X.8sK r3 = r1.A02()     // Catch:{ NullPointerException -> 0x01b0 }
            if (r3 == 0) goto L_0x00ef
            X.8sK r4 = r1.A02()     // Catch:{ NullPointerException -> 0x01b0 }
            r3 = 857814589(0x3321363d, float:3.7535063E-8)
            r4.A02(r3)     // Catch:{ NullPointerException -> 0x01b0 }
        L_0x00ef:
            android.accounts.AccountManager r12 = android.accounts.AccountManager.get(r13)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            X.0qQ.A07(r12)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r11 = r9.A02     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            android.accounts.Account r8 = new android.accounts.Account     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            r8.<init>(r11, r2)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            org.json.JSONObject r7 = X.DbS.A11()     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            android.accounts.Account[] r4 = r12.getAccountsByType(r2)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            X.0qQ.A07(r4)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            r3 = 0
            int r15 = r4.length     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
        L_0x010a:
            if (r3 >= r15) goto L_0x011e
            r2 = r4[r3]     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            if (r2 == 0) goto L_0x011b
            java.lang.String r14 = r2.name     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            boolean r14 = X.0qQ.A0K(r14, r11)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            if (r14 != 0) goto L_0x011b
            r12.removeAccountExplicitly(r2)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
        L_0x011b:
            int r3 = r3 + 1
            goto L_0x010a
        L_0x011e:
            X.1Uf r2 = X.AnonymousClass1UZ.A00(r13)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            X.1Uk r2 = r2.A00(r10)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            X.0qQ.A07(r2)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r10 = "sso_settings_v2"
            java.lang.String r4 = r2.getString(r10, r6)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r2 = "userId"
            r7.put(r2, r11)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r11 = "name"
            java.util.Map r3 = r9.A03     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r5 = X.DbT.A11(r5, r3)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r2 = ""
            if (r5 != 0) goto L_0x0141
            r5 = r2
        L_0x0141:
            r7.put(r11, r5)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r5 = "profilePicUrl"
            java.lang.String r0 = X.DbT.A11(r0, r3)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            if (r0 == 0) goto L_0x014d
            r2 = r0
        L_0x014d:
            r7.put(r5, r2)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            if (r4 != 0) goto L_0x0153
            r4 = r6
        L_0x0153:
            r7.put(r10, r4)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r2 = "accessToken"
            java.lang.String r0 = r9.A01     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            r7.put(r2, r0)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            r12.addAccountExplicitly(r8, r6, r6)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r2 = "current_user"
            java.lang.String r0 = r7.toString()     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            r12.setUserData(r8, r2, r0)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r4 = "persisted_ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            r12.setUserData(r8, r4, r0)     // Catch:{ AccountsException | AuthenticatorException | OperationCanceledException | RemoteException | IOException | Exception | IllegalArgumentException | NullPointerException | RuntimeException -> 0x0198 }
            java.lang.String r28 = "true"
            java.util.HashMap r23 = X.C48961Emz.A00(r25, r26, r27, r28, r29, r30)     // Catch:{ NullPointerException -> 0x01b0 }
            X.8sJ r18 = X.C368248sJ.WRITE_SUCCESS     // Catch:{ NullPointerException -> 0x01b0 }
            X.C368188sD.A00(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ NullPointerException -> 0x01b0 }
            X.8sK r0 = r1.A02()     // Catch:{ NullPointerException -> 0x01b0 }
            if (r0 == 0) goto L_0x01c7
            X.8sK r0 = r1.A02()     // Catch:{ NullPointerException -> 0x01b0 }
            r3 = 857814589(0x3321363d, float:3.7535063E-8)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A00     // Catch:{ NullPointerException -> 0x01b0 }
            if (r2 == 0) goto L_0x01c7
            r0 = r17
            r2.markerEnd(r3, r0)     // Catch:{ NullPointerException -> 0x01b0 }
            return
        L_0x0198:
            r0 = move-exception
            java.lang.Integer r3 = X.AnonymousClass05K.A06     // Catch:{ NullPointerException -> 0x01b0 }
            java.lang.String r9 = r0.getMessage()     // Catch:{ NullPointerException -> 0x01b0 }
            r7 = r25
            r8 = r26
            r10 = r6
            r11 = r6
            r12 = r1
            java.util.HashMap r2 = X.C48961Emz.A00(r7, r8, r9, r10, r11, r12)     // Catch:{ NullPointerException -> 0x01b0 }
            r0 = r16
            r1.A04(r3, r0, r2)     // Catch:{ NullPointerException -> 0x01b0 }
            return
        L_0x01b0:
            r0 = move-exception
            java.lang.Integer r3 = X.AnonymousClass05K.A05
            java.lang.String r2 = "errors"
            java.lang.String r0 = r0.getMessage()
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.HashMap r2 = r1.A01(r0)
            java.lang.String r0 = "INSTAGRAM"
            r1.A04(r3, r0, r2)
            return
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EI0.run():void");
    }
}
