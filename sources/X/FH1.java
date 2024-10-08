package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

public final class FH1 {
    public static final FH1 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r19 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A01(android.content.Context r18, X.AnonymousClass0iw r19, X.0lg r20, X.G5M r21, java.lang.String r22) {
        /*
            r13 = 0
            r2 = 1
            r11 = r20
            X.0qQ.A0B(r11, r2)
            r5 = r18
            r12 = r22
            java.util.ArrayList r4 = A03(r5, r11, r12)
            if (r21 == 0) goto L_0x0023
            r1 = r21
            X.FfE r1 = (X.C50599FfE) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0023
            java.lang.Object r1 = r1.A01
            X.E4i r1 = (X.C47483E4i) r1
            int r0 = r4.size()
            r1.A00 = r0
        L_0x0023:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            android.accounts.AccountManager r9 = android.accounts.AccountManager.get(r5)
            r10 = r19
            if (r22 == 0) goto L_0x0032
            r7 = 1
            if (r19 != 0) goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            java.util.Iterator r6 = r4.iterator()
        L_0x0037:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r8 = r6.next()
            android.accounts.Account r8 = (android.accounts.Account) r8
            if (r7 == 0) goto L_0x00a1
            X.0qQ.A0A(r9)
            r14 = r13
            java.lang.String r0 = A00(r8, r9, r10, r11, r12, r13, r14)
        L_0x004d:
            if (r0 == 0) goto L_0x0037
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0037
            r3.add(r0)
            if (r21 == 0) goto L_0x0037
            r5 = r21
            X.FfE r5 = (X.C50599FfE) r5
            int r1 = r5.A00
            if (r1 != 0) goto L_0x0037
            java.lang.Object r4 = r5.A01
            X.E4i r4 = (X.C47483E4i) r4
            monitor-enter(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0072
            java.util.List r1 = r4.A0O     // Catch:{ all -> 0x00b8 }
            r1.add(r0)     // Catch:{ all -> 0x00b8 }
        L_0x0072:
            int r0 = r4.A01     // Catch:{ all -> 0x00b8 }
            int r1 = r0 + 1
            r4.A01 = r1     // Catch:{ all -> 0x00b8 }
            boolean r0 = r4.A0L     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x009f
            int r0 = r4.A00     // Catch:{ all -> 0x00b8 }
            if (r1 != r0) goto L_0x009f
            X.0aP r1 = r4.A07     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "token_ready_later"
            X.C49217ErM.A00(r1, r0)     // Catch:{ all -> 0x00b8 }
            android.os.Handler r1 = r4.A0M     // Catch:{ all -> 0x00b8 }
            r0 = 0
            r1.removeCallbacksAndMessages(r0)     // Catch:{ all -> 0x00b8 }
            boolean r0 = r4.A06()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()     // Catch:{ all -> 0x00b8 }
            X.FqW r0 = new X.FqW     // Catch:{ all -> 0x00b8 }
            r0.<init>(r5)     // Catch:{ all -> 0x00b8 }
            r1.runOnUiThread(r0)     // Catch:{ all -> 0x00b8 }
        L_0x009f:
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            goto L_0x0037
        L_0x00a1:
            X.0qQ.A0A(r9)
            X.AnonymousClass7TF.A1B(r9, r2, r8)
            r16 = 0
            r14 = r8
            r15 = r9
            r17 = r11
            r18 = r16
            r19 = r13
            r20 = r13
            java.lang.String r0 = A00(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x004d
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            throw r0
        L_0x00bb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH1.A01(android.content.Context, X.0iw, X.0lg, X.G5M, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList A03(Context context, 0lg r8, String str) {
        ArrayList A0q = AnonymousClass7TF.A0q(r8, 1);
        if (str != null) {
            A05(r8, str);
        }
        if (1DL.A07(context, "android.permission.GET_ACCOUNTS")) {
            Account[] accounts = AccountManager.get(context).getAccounts();
            0qQ.A07(accounts);
            for (Account account : accounts) {
                if (account != null && "com.google".equalsIgnoreCase(account.type)) {
                    A0q.add(account);
                }
            }
            if (str != null) {
                A06(r8, str, r3);
            }
        } else if (str != null) {
            A07(r8, str, "no_permission");
            return A0q;
        }
        return A0q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r15 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.accounts.Account r13, android.accounts.AccountManager r14, X.AnonymousClass0iw r15, X.0lg r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            java.lang.String r3 = "audience:server:client_id:894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com"
            r2 = 0
            r11 = r16
            X.0qQ.A0B(r11, r2)
            X.AnonymousClass7TG.A1O(r14, r13)
            java.lang.String r8 = ""
            r7 = 1
            r10 = r15
            r12 = r17
            if (r17 == 0) goto L_0x0016
            r9 = 1
            if (r15 != 0) goto L_0x0017
        L_0x0016:
            r9 = 0
        L_0x0017:
            java.lang.String r6 = "Required value was null."
            if (r9 == 0) goto L_0x0035
            if (r17 == 0) goto L_0x00cc
            if (r15 == 0) goto L_0x00c7
            X.0wc r1 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r0 = "get_google_token_attempt"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbS.A1G(r0, r12)
            X.DbW.A11(r0)
            X.DbW.A16(r0, r15)
            r0.Cgf()
        L_0x0035:
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r8 = r14.blockingGetAuthToken(r13, r3, r2)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            if (r19 != 0) goto L_0x0044
            java.lang.String r0 = "com.google"
            r14.invalidateAuthToken(r0, r8)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
        L_0x0044:
            if (r18 != 0) goto L_0x004a
            java.lang.String r8 = r14.blockingGetAuthToken(r13, r3, r2)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
        L_0x004a:
            if (r9 == 0) goto L_0x00c6
            if (r17 == 0) goto L_0x0093
            if (r15 == 0) goto L_0x0098
            if (r8 == 0) goto L_0x0059
            int r0 = r8.length()     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            if (r0 == 0) goto L_0x0059
            r7 = 0
        L_0x0059:
            if (r7 != 0) goto L_0x0081
            double r2 = (double) r4     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            double r0 = (double) r6     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.0wc r7 = X.AnonymousClass0kN.A02(r11)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            java.lang.String r6 = "get_google_token_success"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r7, r6)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.DbS.A1G(r6, r12)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.DbW.A11(r6)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.DbW.A16(r6, r15)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.DbY.A1D(r6, r0, r2)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.DbW.A12(r6, r2)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            X.DbW.A13(r6, r0)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            r6.Cgf()     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            return r8
        L_0x0081:
            r0 = 1300(0x514, float:1.822E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            double r14 = (double) r4     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            double r2 = (double) r0     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            r16 = r2
            A04(r10, r11, r12, r13, r14, r16)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            return r8
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
            goto L_0x009c
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
        L_0x009c:
            throw r0     // Catch:{ AuthenticatorException -> 0x00ac, OperationCanceledException -> 0x00b7, IOException -> 0x009d }
        L_0x009d:
            if (r9 == 0) goto L_0x00c6
            double r14 = (double) r4
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            r2 = 111(0x6f, float:1.56E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r2)
            goto L_0x00c1
        L_0x00ac:
            if (r9 == 0) goto L_0x00c6
            double r14 = (double) r4
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "AuthenticatorException"
            goto L_0x00c1
        L_0x00b7:
            if (r9 == 0) goto L_0x00c6
            double r14 = (double) r4
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "OperationCanceledException"
        L_0x00c1:
            r16 = r0
            A04(r10, r11, r12, r13, r14, r16)
        L_0x00c6:
            return r8
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH1.A00(android.accounts.Account, android.accounts.AccountManager, X.0iw, X.0lg, java.lang.String, boolean, boolean):java.lang.String");
    }

    public static final ArrayList A02(Context context, AnonymousClass0iw r2, 0lg r3, String str) {
        AnonymousClass7TG.A1N(context, r3);
        return A01(context, r2, r3, (G5M) null, str);
    }

    public static final void A04(AnonymousClass0iw r3, 0lg r4, String str, String str2, double d, double d2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "get_google_token_fail");
        A0e.AAJ("error_type", str2);
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        DbS.A1G(A0e, str);
        DbW.A11(A0e);
        DbZ.A1G(A0e, d2, d);
        FH8.A05(A0e);
        if (r3 != null) {
            str3 = r3.getModuleName();
        }
        DbS.A1K(A0e, str3);
        0qQ.A0B(r4, 0);
        DbY.A1I(A0e, "source", DbZ.A0m(r4), d);
        A0e.Cgf();
    }

    public static final void A05(0lg r6, String str) {
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "get_google_account_attempt");
        DbZ.A1G(A0e, A01, A002);
        DbY.A1I(A0e, "flow", str, A002);
        DbZ.A1E(A0e);
        A0e.A9F("api_level", DbS.A0j(Build.VERSION.SDK_INT));
        FH8.A08(A0e, r6);
    }

    public static final void A06(0lg r6, String str, int i) {
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "get_google_account_success");
        DbZ.A1H(A0e, A01, A002);
        DbW.A13(A0e, A01);
        FH8.A0E(A0e, "flow", str);
        DbY.A1B(A0e);
        A0e.A9F("num_of_google_account", DbS.A0j(i));
        FH8.A0A(A0e, r6);
        FH8.A0C(A0e, r6);
    }

    public static final void A07(0lg r6, String str, String str2) {
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "get_google_account_failure");
        DbZ.A1G(A0e, A01, A002);
        A0e.AAJ("error_type", str2);
        DbS.A1G(A0e, str);
        DbT.A1P(A0e);
        DbZ.A1F(A0e, A002);
        FH8.A08(A0e, r6);
    }
}
