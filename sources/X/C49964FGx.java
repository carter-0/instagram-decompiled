package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FGx  reason: case insensitive filesystem */
public final class C49964FGx {
    public EtX A00;
    public 02m A01;
    public List A02;
    public boolean A03;
    public String A04;
    public final C49880FBe A05;
    public final List A06;
    public final boolean A07;
    public final C258483z9 A08;
    public final ArrayList A09;

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0 A[SYNTHETIC, Splitter:B:63:0x01c0] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c3 A[Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01fd A[SYNTHETIC, Splitter:B:74:0x01fd] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0200 A[Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(androidx.fragment.app.FragmentActivity r23, X.C62937Kop r24, X.0lg r25, java.lang.String r26) {
        /*
            r22 = this;
            r7 = 0
            r2 = r23
            r4 = r25
            boolean r8 = X.AnonymousClass7TF.A1U(r7, r2, r4)
            r5 = r22
            java.util.List r0 = r5.A06
            r0.clear()
            r0 = r26
            r5.A04 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.List r3 = java.util.Collections.synchronizedList(r0)
            X.0qQ.A07(r3)
            X.0Tu r6 = X.0Tu.A05
            r0 = 18300847058324588(0x41048600000c6c, double:1.8932785966331283E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            if (r0 != 0) goto L_0x02bc
            X.02m r0 = X.02m.A0p
            r5.A01 = r0
            X.EtX r0 = new X.EtX
            r0.<init>(r2, r4)
            r5.A00 = r0
            X.02m r9 = r5.A01
            java.lang.String r11 = "qplLogger"
            if (r9 == 0) goto L_0x014a
            java.lang.String r14 = "caaIgOfflineExperimentManager"
            r0 = 18312903031535944(0x410f7d00003948, double:1.898043750385859E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            r1 = r0 ^ 1
            r2 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "caa_ig4a_is_in_thread_non_blocking_test"
            r9.markerAnnotate(r2, r0, r1)
            X.02m r1 = r5.A01
            if (r1 == 0) goto L_0x014a
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "ig4a_is_using_fblite_lite_cp"
            r1.markerAnnotate(r2, r0, r7)
            X.02m r9 = r5.A01
            if (r9 == 0) goto L_0x014a
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            r0 = 18312903031667018(0x410f7d0002394a, double:1.8980437504376663E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "ig4a_is_using_msgr_lite_cp"
            r9.markerAnnotate(r2, r0, r1)
            X.02m r1 = r5.A01
            if (r1 == 0) goto L_0x014a
            java.lang.String r0 = "get_google_accounts_start"
            r1.markerPoint(r2, r0)
            android.content.Context r1 = X.DbT.A04()
            java.lang.String r0 = "LOG_IN"
            java.util.ArrayList r0 = X.FH1.A03(r1, r4, r0)
            r5.A02 = r0
            X.02m r1 = r5.A01
            if (r1 == 0) goto L_0x014a
            java.lang.String r0 = "get_google_accounts_end"
            r1.markerPoint(r2, r0)
            java.util.List r0 = r5.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d7
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            X.2Xw r9 = X.AnonymousClass2Xw.A00
            X.2XO r1 = r9.A01()
            X.0lg r0 = r0.A00
            java.lang.Object r0 = X.DbZ.A0f(r0, r1)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00d7
            r5.A03 = r8
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            X.2XO r0 = r9.A00()
            java.lang.Object r0 = X.2XO.A00(r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            X.02m r10 = r5.A01
            if (r10 != 0) goto L_0x00d2
            r14 = r11
        L_0x00ca:
            X.0qQ.A0F(r14)
        L_0x00cd:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d2:
            java.lang.String r9 = "client_data_fetch_timeout_group"
            r10.markerAnnotate(r2, r9, r0)
        L_0x00d7:
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            r0 = 18302741138969386(0x41063f0001132a, double:1.8940272367747663E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            r15 = r0 ^ 1
            if (r15 == 0) goto L_0x00f8
            java.util.ArrayList r9 = r5.A09
            X.3z9 r1 = r5.A08
            X.Ftv r0 = new X.Ftv
            r0.<init>(r5, r4, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r1.Eyj(r0)
            r9.add(r0)
        L_0x00f8:
            java.util.ArrayList r10 = r5.A09
            X.3z9 r9 = r5.A08
            X.Ftw r0 = new X.Ftw
            r0.<init>(r5, r4, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r9.Eyj(r0)
            r10.add(r0)
            X.Ftx r0 = new X.Ftx
            r0.<init>(r5, r4, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r9.Eyj(r0)
            r10.add(r0)
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            r0 = 18312903031535944(0x410f7d00003948, double:1.898043750385859E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0260
            X.02m r12 = r5.A01
            if (r12 == 0) goto L_0x014a
            X.FBe r11 = r5.A05
            java.lang.String r13 = r5.A04
            X.EtX r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            r0 = 18312903031667018(0x410f7d0002394a, double:1.8980437504376663E-307)
            boolean r0 = X.1AW.A06(r6, r0)
            r14 = r0 ^ 1
            r6 = 4
            X.0qQ.A0B(r11, r6)
            X.C49934FFn.A00 = r13
            java.lang.String r13 = "facebook_active_session"
            java.lang.String r0 = "add_active_fb_account_start"
            r12.markerPoint(r2, r0)
            goto L_0x014e
        L_0x014a:
            X.0qQ.A0F(r11)
            goto L_0x00cd
        L_0x014e:
            X.8s5 r1 = X.C368108s5.A03     // Catch:{ SecurityException -> 0x016b, Exception -> 0x0176 }
            X.8sI r0 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ SecurityException -> 0x016b, Exception -> 0x0176 }
            com.google.common.util.concurrent.ListenableFuture r1 = X.C49934FFn.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x016b, Exception -> 0x0176 }
            X.FTR r0 = new X.FTR     // Catch:{ SecurityException -> 0x016b, Exception -> 0x0176 }
            r21 = r7
            r20 = r3
            r19 = r4
            r18 = r12
            r16 = r0
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ SecurityException -> 0x016b, Exception -> 0x0176 }
            X.C255183ti.A04(r0, r1, r9)     // Catch:{ SecurityException -> 0x016b, Exception -> 0x0176 }
            goto L_0x017c
        L_0x016b:
            r7 = move-exception
            java.lang.String r1 = "IGCrossAppAuthDataFetcher"
            java.lang.String r0 = "Failed to fetch active Facebook accounts"
            X.0KC.A0K(r1, r0, r7)
            java.lang.String r0 = "security_exception"
            goto L_0x0178
        L_0x0176:
            java.lang.String r0 = "other_exception"
        L_0x0178:
            com.google.common.util.concurrent.ListenableFuture r1 = A02(r11, r4, r13, r0)
        L_0x017c:
            r10.add(r1)
            java.lang.String r13 = "facebook_local_auth"
            java.lang.String r0 = "add_saved_fb_accounts_start"
            r12.markerPoint(r2, r0)
            X.8s5 r1 = X.C368108s5.A03     // Catch:{ SecurityException -> 0x01a3, Exception -> 0x01ae }
            X.8sI r0 = X.C368238sI.SAVED_ACCOUNTS     // Catch:{ SecurityException -> 0x01a3, Exception -> 0x01ae }
            com.google.common.util.concurrent.ListenableFuture r1 = X.C49934FFn.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x01a3, Exception -> 0x01ae }
            r21 = 3
            X.FTR r0 = new X.FTR     // Catch:{ SecurityException -> 0x01a3, Exception -> 0x01ae }
            r20 = r3
            r19 = r4
            r18 = r12
            r16 = r0
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ SecurityException -> 0x01a3, Exception -> 0x01ae }
            X.C255183ti.A04(r0, r1, r9)     // Catch:{ SecurityException -> 0x01a3, Exception -> 0x01ae }
            goto L_0x01b4
        L_0x01a3:
            r7 = move-exception
            java.lang.String r1 = "IGCrossAppAuthDataFetcher"
            java.lang.String r0 = "Failed to fetch saved Facebook accounts"
            X.0KC.A0K(r1, r0, r7)
            java.lang.String r0 = "security_exception"
            goto L_0x01b0
        L_0x01ae:
            java.lang.String r0 = "other_exception"
        L_0x01b0:
            com.google.common.util.concurrent.ListenableFuture r1 = A02(r11, r4, r13, r0)
        L_0x01b4:
            r10.add(r1)
            java.lang.String r0 = "add_active_msgr_account_start"
            r12.markerPoint(r2, r0)
            java.lang.String r13 = "messenger_active_session"
            if (r14 == 0) goto L_0x01c3
            X.8s5 r1 = X.C368108s5.A09     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
            goto L_0x01c5
        L_0x01c3:
            X.8s5 r1 = X.C368108s5.A08     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
        L_0x01c5:
            X.8sI r0 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
            com.google.common.util.concurrent.ListenableFuture r1 = X.C49934FFn.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
            X.FTR r0 = new X.FTR     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
            r17 = r11
            r18 = r12
            r19 = r4
            r20 = r3
            r21 = r8
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
            X.C255183ti.A04(r0, r1, r9)     // Catch:{ SecurityException -> 0x01e0, Exception -> 0x01eb }
            goto L_0x01f1
        L_0x01e0:
            r7 = move-exception
            java.lang.String r1 = "IGCrossAppAuthDataFetcher"
            java.lang.String r0 = "Failed to fetch active Messenger accounts"
            X.0KC.A0K(r1, r0, r7)
            java.lang.String r0 = "security_exception"
            goto L_0x01ed
        L_0x01eb:
            java.lang.String r0 = "other_exception"
        L_0x01ed:
            com.google.common.util.concurrent.ListenableFuture r1 = A02(r11, r4, r13, r0)
        L_0x01f1:
            r10.add(r1)
            java.lang.String r0 = "add_saved_msgr_accounts_start"
            r12.markerPoint(r2, r0)
            java.lang.String r7 = "messenger_local_auth"
            if (r14 == 0) goto L_0x0200
            X.8s5 r1 = X.C368108s5.A09     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
            goto L_0x0202
        L_0x0200:
            X.8s5 r1 = X.C368108s5.A08     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
        L_0x0202:
            X.8sI r0 = X.C368238sI.SAVED_ACCOUNTS     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
            com.google.common.util.concurrent.ListenableFuture r1 = X.C49934FFn.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
            X.FTR r0 = new X.FTR     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
            r17 = r11
            r18 = r12
            r19 = r4
            r20 = r3
            r21 = r6
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
            X.C255183ti.A04(r0, r1, r9)     // Catch:{ SecurityException -> 0x021d, Exception -> 0x0228 }
            goto L_0x022e
        L_0x021d:
            r6 = move-exception
            java.lang.String r1 = "IGCrossAppAuthDataFetcher"
            java.lang.String r0 = "Failed to fetch saved Messenger accounts"
            X.0KC.A0K(r1, r0, r6)
            java.lang.String r0 = "security_exception"
            goto L_0x022a
        L_0x0228:
            java.lang.String r0 = "other_exception"
        L_0x022a:
            com.google.common.util.concurrent.ListenableFuture r1 = A02(r11, r4, r7, r0)
        L_0x022e:
            r10.add(r1)
            java.lang.String r6 = "facebook_lite_active_session"
            java.lang.String r0 = "add_active_fblite_account_start"
            r12.markerPoint(r2, r0)
            X.8s5 r1 = X.C368108s5.A05     // Catch:{ SecurityException -> 0x0255, Exception -> 0x0291 }
            X.8sI r0 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ SecurityException -> 0x0255, Exception -> 0x0291 }
            com.google.common.util.concurrent.ListenableFuture r1 = X.C49934FFn.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x0255, Exception -> 0x0291 }
            r21 = 2
            X.FTR r0 = new X.FTR     // Catch:{ SecurityException -> 0x0255, Exception -> 0x0291 }
            r20 = r3
            r19 = r4
            r18 = r12
            r16 = r0
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ SecurityException -> 0x0255, Exception -> 0x0291 }
            X.C255183ti.A04(r0, r1, r9)     // Catch:{ SecurityException -> 0x0255, Exception -> 0x0291 }
            goto L_0x0297
        L_0x0255:
            r2 = move-exception
            java.lang.String r1 = "IGCrossAppAuthDataFetcher"
            java.lang.String r0 = "Failed to fetch Facebook Lite active account from lite provider"
            X.0KC.A0K(r1, r0, r2)
            java.lang.String r0 = "security_exception"
            goto L_0x0293
        L_0x0260:
            X.Fty r0 = new X.Fty
            r0.<init>(r5, r4, r3)
            A05(r9, r5, r0, r10)
            X.Ftz r0 = new X.Ftz
            r0.<init>(r5, r4, r3)
            A05(r9, r5, r0, r10)
            X.Fu0 r0 = new X.Fu0
            r0.<init>(r5, r4, r3)
            A05(r9, r5, r0, r10)
            X.Fu1 r0 = new X.Fu1
            r0.<init>(r5, r4, r3)
            A05(r9, r5, r0, r10)
            X.Fu2 r0 = new X.Fu2
            r0.<init>(r5, r4, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r9.Eyj(r0)
            X.0qQ.A07(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r5.A01(r0)
            goto L_0x0297
        L_0x0291:
            java.lang.String r0 = "other_exception"
        L_0x0293:
            com.google.common.util.concurrent.ListenableFuture r1 = A02(r11, r4, r6, r0)
        L_0x0297:
            r10.add(r1)
            if (r15 != 0) goto L_0x02a8
            X.Fu3 r0 = new X.Fu3
            r0.<init>(r5, r4, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r9.Eyj(r0)
            r10.add(r0)
        L_0x02a8:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.lang.Iterable) r10)
            X.1Kz r2 = new X.1Kz
            r2.<init>(r0)
            r1 = 3
            X.MB7 r0 = new X.MB7
            r4 = r24
            r0.<init>(r1, r3, r4)
            r2.A00(r0, r9)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49964FGx.A07(androidx.fragment.app.FragmentActivity, X.Kop, X.0lg, java.lang.String):void");
    }

    private final ListenableFuture A01(ListenableFuture listenableFuture) {
        if (!this.A02.isEmpty() || !this.A03) {
            return listenableFuture;
        }
        if (this.A00 == null) {
            0qQ.A0F("caaIgOfflineExperimentManager");
            throw AnonymousClass00P.createAndThrow();
        }
        long A0R = AnonymousClass7TE.A0R(2XO.A00(AnonymousClass2Xw.A00.A00()));
        return C255183ti.A02(listenableFuture, C61560nl.A00().A00, TimeUnit.MILLISECONDS, A0R);
    }

    public static final String A03(String str) {
        int length;
        if (!(str == null || (length = str.length()) == 0)) {
            int i = 0;
            while (i < length) {
                if (Character.isDigit(str.charAt(i))) {
                    i++;
                }
            }
            return str;
        }
        return "REDACTED_UID";
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [java.util.concurrent.Future, X.MmO] */
    public static final void A06(C49964FGx fGx, 0lg r28, List list) {
        int i;
        0Tu r3 = 0Tu.A05;
        if (!1AW.A06(r3, 18300701029436403L)) {
            Context A042 = DbT.A04();
            C49964FGx fGx2 = fGx;
            02m r2 = fGx2.A01;
            if (r2 != null) {
                r2.markerAnnotate(896612552, "count_of_google_accounts_for_token_fetch", fGx2.A02.size());
                ArrayList A1C = AnonymousClass7TE.A1C();
                C58716IwP iwP = new C58716IwP(30, (Object) A1C, (Object) fGx2);
                if (fGx2.A02.isEmpty()) {
                    iwP.invoke();
                    return;
                }
                AccountManager accountManager = AccountManager.get(A042);
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                02m r1 = fGx2.A01;
                if (r1 != null) {
                    r1.markerPoint(896612552, "add_google_oauth_accounts_start");
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    if (fGx2.A00 != null) {
                        boolean z = !1AW.A06(r3, 18302741138969386L);
                        if (fGx2.A00 != null) {
                            boolean z2 = !1AW.A06(r3, 18302741138969386L);
                            if (fGx2.A00 != null) {
                                boolean z3 = !1AW.A06(r3, 18302741138969386L);
                                02m r22 = fGx2.A01;
                                if (r22 != null) {
                                    r22.markerAnnotate(896612552, "remove_double_token_fetch_enabled", z2);
                                    02m r12 = fGx2.A01;
                                    if (r12 != null) {
                                        r12.markerAnnotate(896612552, "remove_token_invalidation_enabled", z3);
                                        0lg r15 = r28;
                                        if (fGx2.A02.size() <= 1 || !z) {
                                            int i2 = 0;
                                            for (Account account : fGx2.A02) {
                                                0qQ.A0A(accountManager);
                                                A1C.add(DbY.A0q("credential_type", "google_oauth", AnonymousClass7TE.A1L("token", FH1.A00(account, accountManager, (AnonymousClass0iw) null, r15, "LOG_IN", z2, z3)), AnonymousClass7TE.A1L("account_type", "google_oauth")));
                                                i2 = i + 1;
                                                A1C2.add(A03(account.toString()));
                                            }
                                        } else {
                                            List list2 = fGx2.A02;
                                            ArrayList A0r = AnonymousClass7TG.A0r(list2);
                                            int i3 = 0;
                                            for (Object next : list2) {
                                                int i4 = i3 + 1;
                                                if (i3 < 0) {
                                                    0sr.A1T();
                                                    break;
                                                } else {
                                                    DbY.A1U(fGx2.A08.Eyk(new C51567FwH((Account) next, accountManager, r15, z2, z3)), A1C3, A0r);
                                                    i3 = i4;
                                                }
                                            }
                                            1K8 r0 = 1L8.A03;
                                            Object obj = new C67347MmO(ImmutableList.copyOf((Iterable) A1C3), false).get();
                                            0qQ.A07(obj);
                                            i = 0;
                                            for (0eP r02 : (Iterable) obj) {
                                                A1C.add(DbY.A0q("credential_type", "google_oauth", AnonymousClass7TE.A1L("token", r02.A01), AnonymousClass7TE.A1L("account_type", "google_oauth")));
                                                i++;
                                                A1C2.add(A03((String) r02.A00));
                                            }
                                        }
                                        C49880FBe fBe = fGx2.A05;
                                        if (i == 0) {
                                            fBe.A01(r15, "google_oauth");
                                        } else {
                                            fBe.A03(r15, "google_oauth", A1C2);
                                        }
                                        list.addAll(A1C);
                                        iwP.invoke();
                                        02m r13 = fGx2.A01;
                                        if (r13 != null) {
                                            r13.markerPoint(896612552, "add_google_oauth_accounts_end");
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("caaIgOfflineExperimentManager");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("qplLogger");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.FBe] */
    public C49964FGx(boolean z) {
        this.A07 = z;
        this.A05 = new Object();
        C258473z8 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C61560nl.A00().A00);
        0qQ.A07(listeningDecorator);
        this.A08 = listeningDecorator;
        this.A09 = AnonymousClass7TE.A1C();
        List synchronizedList = Collections.synchronizedList(AnonymousClass7TE.A1C());
        0qQ.A07(synchronizedList);
        this.A06 = synchronizedList;
        this.A02 = 0sn.A00;
    }

    public static int A00(String str, AbstractCollection abstractCollection, List list, 0eP[] r5, int i) {
        list.add(0Yt.A06(r5));
        int i2 = i + 1;
        abstractCollection.add(A03(str));
        return i2;
    }

    public static ListenableFuture A02(C49880FBe fBe, 0lg r1, String str, String str2) {
        fBe.A02(r1, str, str2);
        ListenableFuture A032 = C255183ti.A03(0sn.A00);
        0qQ.A07(A032);
        return A032;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r9 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r9 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r2 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A04(X.C49964FGx r11, X.0lg r12, X.C368108s5 r13, X.C368238sI r14) {
        /*
            int r7 = r13.ordinal()
            java.lang.String r3 = "lite_content_provider"
            java.lang.String r10 = "CaaFetchClientDataHelper"
            r6 = 2
            r0 = 60
            java.lang.String r1 = X.C273654mx.A00(r0)
            r5 = 0
            r4 = 0
            r8 = r12
            if (r7 == r5) goto L_0x00d3
            if (r7 == r6) goto L_0x0095
            r0 = 6
            java.lang.String r2 = "ig_android_access_library_caa_aymh_fetch_msgr_local_auth"
            java.lang.String r9 = "ig_android_access_library_caa_aymh_fetch_msgr_active_token"
            if (r7 == r0) goto L_0x005c
            r0 = 7
            if (r7 != r0) goto L_0x0056
            int r0 = r14.ordinal()
            if (r0 == r5) goto L_0x002e
            if (r0 != r6) goto L_0x0033
            java.lang.String r9 = r11.A04
            if (r9 != 0) goto L_0x0039
        L_0x002c:
            r9 = r2
            goto L_0x0039
        L_0x002e:
            java.lang.String r2 = r11.A04
            if (r2 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0033:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0039:
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x0051 }
            r6.<init>()     // Catch:{ Exception -> 0x0051 }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x0051 }
            java.util.Set r11 = X.FAQ.A00(r3, r13, r14)     // Catch:{ Exception -> 0x0051 }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0051 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0051 }
            return r0
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Messenger accounts from lite provider"
            goto L_0x010d
        L_0x0056:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x005c:
            int r0 = r14.ordinal()
            if (r0 == r5) goto L_0x006a
            if (r0 != r6) goto L_0x006f
            java.lang.String r9 = r11.A04
            if (r9 != 0) goto L_0x0075
        L_0x0068:
            r9 = r2
            goto L_0x0075
        L_0x006a:
            java.lang.String r2 = r11.A04
            if (r2 == 0) goto L_0x0075
            goto L_0x0068
        L_0x006f:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0075:
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x010a }
            r6.<init>()     // Catch:{ Exception -> 0x010a }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x010a }
            X.FAQ r0 = new X.FAQ     // Catch:{ Exception -> 0x010a }
            r0.<init>(r4, r4, r13, r14)     // Catch:{ Exception -> 0x010a }
            java.util.Set r11 = java.util.Collections.singleton(r0)     // Catch:{ Exception -> 0x010a }
            X.0qQ.A07(r11)     // Catch:{ Exception -> 0x010a }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x010a }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x010a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x010a }
            return r0
        L_0x0095:
            int r0 = r14.ordinal()
            if (r0 != r5) goto L_0x00cd
            java.lang.String r9 = "fb_msgr_ig_access_library_caa_aymh_fetch_fblite_active_access_token"
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x00c9 }
            r6.<init>()     // Catch:{ Exception -> 0x00c9 }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x00c9 }
            X.EtX r0 = r11.A00     // Catch:{ Exception -> 0x00c9 }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "caaIgOfflineExperimentManager"
            X.0qQ.A0F(r0)     // Catch:{ Exception -> 0x00c9 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x00c9 }
            throw r0     // Catch:{ Exception -> 0x00c9 }
        L_0x00b4:
            r0 = 1223(0x4c7, float:1.714E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x00c9 }
            java.util.Set r11 = X.FAQ.A00(r0, r13, r14)     // Catch:{ Exception -> 0x00c9 }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00c9 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x00c9 }
            return r0
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Facebook Lite accounts from lite provider"
            goto L_0x010d
        L_0x00cd:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            int r0 = r14.ordinal()
            if (r0 == r5) goto L_0x00e8
            if (r0 != r6) goto L_0x00e2
            java.lang.String r9 = r11.A04
            if (r9 != 0) goto L_0x00ee
            java.lang.String r9 = "ig_android_access_library_caa_aymh_fetch_fb_local_auth"
            goto L_0x00ee
        L_0x00e2:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00e8:
            java.lang.String r9 = r11.A04
            if (r9 != 0) goto L_0x00ee
            java.lang.String r9 = "ig_android_access_library_caa_aymh_fetch_fb_active_token"
        L_0x00ee:
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x0106 }
            r6.<init>()     // Catch:{ Exception -> 0x0106 }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x0106 }
            java.util.Set r11 = X.FAQ.A00(r3, r13, r14)     // Catch:{ Exception -> 0x0106 }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0106 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0106 }
            return r0
        L_0x0106:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Facebook accounts from lite provider"
            goto L_0x010d
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Messenger accounts from legacy provider"
        L_0x010d:
            X.0KC.A0K(r10, r0, r1)
            X.0sn r0 = X.0sn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49964FGx.A04(X.FGx, X.0lg, X.8s5, X.8sI):java.util.List");
    }

    public static void A05(C258483z9 r0, C49964FGx fGx, Runnable runnable, AbstractCollection abstractCollection) {
        ListenableFuture Eyj = r0.Eyj(runnable);
        0qQ.A07(Eyj);
        abstractCollection.add(fGx.A01(Eyj));
    }

    public C49964FGx() {
        this(false);
    }
}
