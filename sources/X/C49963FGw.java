package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.FGw  reason: case insensitive filesystem */
public final class C49963FGw {
    public static final void A05(Context context) {
        1W3 AR0 = AnonymousClass1UZ.A00(context).A00("XE_ACCESS_LIBRARY_DATA").AR0();
        AR0.A0A("account_manager_migration_completed", false);
        AR0.A0B();
    }

    public final ListenableFuture A08(Context context, 0lg r9, String str, String str2, Set set) {
        0qQ.A0B(r9, 1);
        return A00(context, r9, new C368208sF(r9), this, str, str2, set);
    }

    public static final C368218sG A04(C368208sF r2, 2LC r3) {
        C368058s0 r1 = new C368058s0();
        0qQ.A0B(r2, 0);
        r1.A04 = r2;
        r1.A01 = r3;
        return new C368218sG(r1);
    }

    public static final boolean A07(0lg r5, String str, String str2) {
        0Tu r2 = 0Tu.A06;
        String str3 = str;
        if (1AW.A06(r2, 18298961568139168L)) {
            String str4 = str2;
            if (1AW.A06(r2, 18298961568270241L)) {
                return C250563lf.A0r(new C299885wA(r5), AnonymousClass05K.A00, str, str2);
            }
            String A04 = 1AW.A04(r2, 18861911521624162L);
            return C299895wB.A00(new C299885wA(r5), AnonymousClass05K.A00, A04, str4, str3, false);
        } else if (!1AW.A06(r2, 18298961567745950L)) {
            return true;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(1AW.A04(r2, 18861911521099869L));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.3zD, java.lang.Runnable] */
    public static final ListenableFuture A00(Context context, 0lg r10, C368208sF r11, C49963FGw fGw, String str, String str2, Set set) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str3 = str;
        if (!A07(r10, str, str2)) {
            return new 1Ks(A1C);
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A1C2.addAll(00k.A0a(set));
        C49439Evf evf = new C49439Evf(A1C2);
        C368208sF r4 = r11;
        r11.A01 = "3.0";
        2LC A00 = AnonymousClass2LA.A02.A00();
        if (A00 != null) {
            A00.A00 = "3.0";
        }
        FTI fti = new FTI(context, r4, fGw, A00, str3, evf);
        0nQ r3 = new 0nQ(0nY.A00(), 583345440, 2, false, true);
        ? obj = new Object();
        obj.A00 = new AnonymousClass6OO(fti, obj);
        r3.execute(obj);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        if (r6.moveToNext() != true) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.content.Context r36, java.lang.String r37, X.FAQ r38, X.C368218sG r39) {
        /*
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            r0 = r38
            X.8sI r2 = r0.A03
            X.8s5 r0 = r0.A02
            X.8s4 r5 = X.C368228sH.A01(r0)
            if (r5 == 0) goto L_0x0228
            X.8sI r17 = X.C368238sI.SAVED_ACCOUNTS
            r34 = r36
            r20 = r37
            r1 = r39
            r0 = r17
            if (r2 != r0) goto L_0x0180
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = X.C368118s6.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            A06(r5, r3, r2)
            goto L_0x002a
        L_0x0034:
            java.util.Iterator r16 = r3.iterator()
        L_0x0038:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r2 = r16.next()
            X.8s9 r2 = (X.C368148s9) r2
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02
            int r0 = r0.incrementAndGet()
            java.lang.String r15 = java.lang.Integer.toString(r0)
            X.8sD r0 = r1.A05
            X.8s4 r12 = r2.A04
            X.8s5 r3 = X.C368228sH.A00(r12)
            java.lang.String r3 = r3.name()
            java.lang.String r13 = "SAVED_ACCOUNTS"
            java.lang.String r28 = "resolver_name"
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            java.lang.String r29 = "LEGACY_PROVIDER"
            r7 = 1
            java.lang.String r30 = "caller_name"
            r6 = 3
            java.lang.String r32 = "instance_key"
            r31 = r20
            r33 = r15
            java.lang.String[] r5 = new java.lang.String[]{r28, r29, r30, r31, r32, r33}
            java.util.HashMap r5 = r0.A01(r5)
            r0.A09(r3, r5, r13)
            r35 = r17
            r36 = r18
            r37 = r15
            r38 = r2
            android.content.ContentProviderClient r21 = X.C368218sG.A00(r34, r35, r36, r37, r38, r39)
            if (r21 == 0) goto L_0x0038
            X.8sB r5 = r1.A04
            r5.DmG(r2)
            X.8s2 r5 = r1.A03     // Catch:{ RemoteException -> 0x0163 }
            X.0qQ.A0B(r15, r6)     // Catch:{ RemoteException -> 0x0163 }
            X.8s4 r6 = X.C368098s4.INSTAGRAM     // Catch:{ RemoteException -> 0x0163 }
            if (r12 != r6) goto L_0x00af
            X.8sI r9 = X.C368238sI.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ RemoteException -> 0x0163 }
            r6 = r21
            r7 = r15
            r8 = r2
            r10 = r0
            java.util.ArrayList r5 = r5.A02(r6, r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x0163 }
        L_0x009e:
            r22 = r2
            r23 = r17
            r24 = r1
            r19 = r15
            r21 = r5
            X.C368218sG.A04(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RemoteException -> 0x0163 }
            r4.addAll(r5)     // Catch:{ RemoteException -> 0x0163 }
            goto L_0x0038
        L_0x00af:
            X.8sI r22 = X.C368238sI.INACTIVE_LOGGED_IN_ACCOUNTS     // Catch:{ RemoteException -> 0x0163 }
            r24 = 0
            r23 = r18
            r25 = r15
            r26 = r2
            r27 = r0
            android.database.Cursor r6 = X.C368078s2.A00(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ RemoteException -> 0x0163 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ RemoteException -> 0x0163 }
            if (r6 == 0) goto L_0x00cc
            boolean r8 = r6.moveToNext()     // Catch:{ RemoteException -> 0x0163 }
            r9 = 1
            if (r8 == r7) goto L_0x00cd
        L_0x00cc:
            r9 = 0
        L_0x00cd:
            if (r9 == 0) goto L_0x009e
            java.lang.String r7 = r6.getString(r7)     // Catch:{ JSONException -> 0x013b }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x013b }
            if (r7 == 0) goto L_0x00ef
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013b }
            r10.<init>(r7)     // Catch:{ JSONException -> 0x013b }
            int r9 = r10.length()     // Catch:{ JSONException -> 0x013b }
            r8 = 0
        L_0x00e3:
            if (r8 >= r9) goto L_0x00ef
            java.lang.Object r7 = r10.get(r8)     // Catch:{ JSONException -> 0x013b }
            X.DbU.A1X(r7, r11)     // Catch:{ JSONException -> 0x013b }
            int r8 = r8 + 1
            goto L_0x00e3
        L_0x00ef:
            java.util.Iterator r10 = r11.iterator()     // Catch:{ JSONException -> 0x013b }
        L_0x00f3:
            boolean r7 = r10.hasNext()     // Catch:{ JSONException -> 0x013b }
            if (r7 == 0) goto L_0x0159
            java.lang.String r7 = X.AnonymousClass7TE.A18(r10)     // Catch:{ JSONException -> 0x013b }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013b }
            r9.<init>(r7)     // Catch:{ JSONException -> 0x013b }
            java.lang.String r7 = "profile"
            org.json.JSONObject r7 = r9.getJSONObject(r7)     // Catch:{ JSONException -> 0x013b }
            java.lang.String r8 = "uid"
            java.lang.String r22 = r7.getString(r8)     // Catch:{ JSONException -> 0x013b }
            java.lang.String r8 = "access_token"
            java.lang.String r23 = r9.getString(r8)     // Catch:{ JSONException -> 0x013b }
            java.lang.String r24 = "FACEBOOK"
            java.util.Map r8 = X.C368078s2.A00     // Catch:{ JSONException -> 0x013b }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ JSONException -> 0x013b }
            if (r8 == 0) goto L_0x0136
            X.8s5 r8 = (X.C368108s5) r8     // Catch:{ JSONException -> 0x013b }
            X.Wuz r9 = new X.Wuz     // Catch:{ JSONException -> 0x013b }
            r9.<init>((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x013b }
            X.F3S r7 = new X.F3S     // Catch:{ JSONException -> 0x013b }
            r21 = r7
            r25 = r9
            r26 = r8
            r27 = r17
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ JSONException -> 0x013b }
            r5.add(r7)     // Catch:{ JSONException -> 0x013b }
            goto L_0x00f3
        L_0x0136:
            java.lang.IllegalStateException r7 = X.AnonymousClass7TE.A0y()     // Catch:{ JSONException -> 0x013b }
            throw r7     // Catch:{ JSONException -> 0x013b }
        L_0x013b:
            r9 = move-exception
            java.lang.String r8 = "INACTIVE_LOGGED_IN_ACCOUNTS"
            java.lang.Integer r7 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x015e }
            java.lang.String r23 = "failure_reason"
            java.lang.String r24 = r9.getMessage()     // Catch:{ all -> 0x015e }
            r21 = r28
            r22 = r29
            r25 = r32
            r26 = r15
            java.lang.String[] r9 = new java.lang.String[]{r21, r22, r23, r24, r25, r26}     // Catch:{ all -> 0x015e }
            java.util.HashMap r9 = r0.A01(r9)     // Catch:{ all -> 0x015e }
            r0.A03(r7, r3, r8, r9)     // Catch:{ all -> 0x015e }
        L_0x0159:
            r6.close()     // Catch:{ RemoteException -> 0x0163 }
            goto L_0x009e
        L_0x015e:
            r2 = move-exception
            r6.close()     // Catch:{ RemoteException -> 0x0163 }
            throw r2     // Catch:{ RemoteException -> 0x0163 }
        L_0x0163:
            r2 = move-exception
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            java.lang.String r8 = "failure_reason"
            java.lang.String r9 = r2.getMessage()
            r6 = r28
            r7 = r29
            r10 = r32
            r11 = r15
            java.lang.String[] r2 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
            java.util.HashMap r2 = r0.A01(r2)
            r0.A03(r5, r3, r13, r2)
            goto L_0x0038
        L_0x0180:
            java.util.List r3 = java.util.Collections.singletonList(r5)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.8s1 r2 = r1.A06
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            java.util.List r0 = r2.A00(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0197:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0221
            java.lang.Object r6 = r7.next()
            X.8s9 r6 = (X.C368148s9) r6
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02
            int r0 = r0.incrementAndGet()
            java.lang.String r19 = java.lang.Integer.toString(r0)
            X.8sD r3 = r1.A05
            X.8s4 r0 = r6.A04
            X.8s5 r0 = X.C368228sH.A00(r0)
            java.lang.String r2 = r0.name()
            X.8sI r23 = X.C368238sI.ACTIVE_ACCOUNT
            java.lang.String r0 = "ACTIVE_ACCOUNT"
            java.lang.String r8 = "resolver_name"
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            java.lang.String r9 = "LEGACY_PROVIDER"
            java.lang.String r10 = "caller_name"
            java.lang.String r12 = "instance_key"
            r13 = r19
            r11 = r20
            java.lang.String[] r5 = new java.lang.String[]{r8, r9, r10, r11, r12, r13}
            java.util.HashMap r5 = r3.A01(r5)
            r3.A09(r2, r5, r0)
            r22 = r34
            r24 = r18
            r25 = r13
            r26 = r6
            r27 = r1
            android.content.ContentProviderClient r25 = X.C368218sG.A00(r22, r23, r24, r25, r26, r27)
            if (r25 == 0) goto L_0x0197
            X.8sB r5 = r1.A04
            r5.DmG(r6)
            X.8s2 r5 = r1.A03     // Catch:{ RemoteException -> 0x020b }
            r24 = r5
            r26 = r13
            r27 = r6
            r28 = r23
            r29 = r3
            java.util.ArrayList r5 = r24.A02(r25, r26, r27, r28, r29)     // Catch:{ RemoteException -> 0x020b }
            r21 = r5
            r22 = r6
            r24 = r1
            X.C368218sG.A04(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RemoteException -> 0x020b }
            r4.addAll(r5)     // Catch:{ RemoteException -> 0x020b }
            r25.close()     // Catch:{ RemoteException -> 0x020b }
            goto L_0x0197
        L_0x020b:
            r5 = move-exception
            java.lang.Integer r6 = X.AnonymousClass05K.A1F
            java.lang.String r10 = "failure_reason"
            java.lang.String r11 = r5.getMessage()
            java.lang.String[] r5 = new java.lang.String[]{r8, r9, r10, r11, r12, r13}
            java.util.HashMap r5 = r3.A01(r5)
            r3.A03(r6, r2, r0, r5)
            goto L_0x0197
        L_0x0221:
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
        L_0x0225:
            r14.addAll(r4)
        L_0x0228:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49963FGw.A01(android.content.Context, java.lang.String, X.FAQ, X.8sG):java.util.ArrayList");
    }

    public static ArrayList A02(Context context, String str, FAQ faq, C368218sG r14) {
        ArrayList arrayList;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C368238sI r0 = faq.A03;
        C368108s5 r9 = faq.A02;
        C368098s4 A01 = C368228sH.A01(r9);
        if (A01 != null) {
            C368238sI r10 = C368238sI.SAVED_ACCOUNTS;
            Context context2 = context;
            String str2 = str;
            C368218sG r11 = r14;
            if (r0 == r10) {
                arrayList = AnonymousClass7TE.A1C();
                List list = C39633A2x.A02;
                ArrayList<C368148s9> A1C2 = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A06(A01, A1C2, it);
                }
                for (C368148s9 A03 : A1C2) {
                    C368218sG.A03(context2, str2, arrayList, A03, r9, r10, r11);
                }
            } else {
                C368238sI r102 = C368238sI.ACTIVE_ACCOUNT;
                arrayList = AnonymousClass7TE.A1C();
                if (r0 == r102) {
                    List list2 = C39633A2x.A00;
                    ArrayList<C368148s9> A1C3 = AnonymousClass7TE.A1C();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        A06(A01, A1C3, it2);
                    }
                    for (C368148s9 A032 : A1C3) {
                        C368218sG.A03(context2, str2, arrayList, A032, r9, r102, r11);
                    }
                } else {
                    List list3 = C39633A2x.A01;
                    ArrayList<C368148s9> A1C4 = AnonymousClass7TE.A1C();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        A06(A01, A1C4, it3);
                    }
                    for (C368148s9 A033 : A1C4) {
                        C368218sG.A03(context2, str2, arrayList, A033, r9, C368238sI.ALL_ACCOUNTS, r11);
                    }
                }
            }
            A1C.addAll(Collections.unmodifiableList(arrayList));
        }
        return A1C;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0137 A[Catch:{ JSONException -> 0x01ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A03(android.content.Context r20, X.FAQ r21) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1 = r21
            X.8sI r2 = r1.A03
            X.8s5 r1 = r1.A02
            X.8s4 r6 = X.C368228sH.A01(r1)
            if (r6 == 0) goto L_0x02c3
            X.8sI r14 = X.C368238sI.ACTIVE_ACCOUNT
            java.lang.Class<X.Eve> r1 = X.C49438Eve.class
            r4 = r20
            if (r2 != r14) goto L_0x01d6
            java.lang.String r2 = r1.getName()
            X.0qQ.A07(r2)
            r10 = 0
            java.lang.String r7 = r6.A00
            X.0qQ.A07(r7)
            int r5 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            java.lang.String r1 = "android.permission.GET_ACCOUNTS"
            r4.checkPermission(r1, r5, r3)
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r4)
            X.0qQ.A07(r1)
            android.accounts.Account[] r9 = r1.getAccountsByType(r7)
            X.0qQ.A07(r9)
            int r8 = r9.length
            r5 = 0
        L_0x0042:
            if (r5 >= r8) goto L_0x006e
            r7 = r9[r5]
            java.lang.String r11 = r7.type
            int r3 = r6.ordinal()
            if (r3 == r10) goto L_0x0064
            r1 = 1
            if (r3 == r1) goto L_0x0064
            r1 = 6
            if (r3 != r1) goto L_0x0067
            X.8s5 r1 = X.C368108s5.A08
        L_0x0056:
            java.lang.String r1 = r1.A00
            X.0qQ.A07(r1)
            boolean r1 = X.0qQ.A0K(r11, r1)
            if (r1 != 0) goto L_0x006f
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0064:
            X.8s5 r1 = X.C368108s5.A03
            goto L_0x0056
        L_0x0067:
            java.lang.String r0 = "SsoSource not supported."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x006e:
            r7 = 0
        L_0x006f:
            X.8s5 r13 = X.C368228sH.A00(r6)
            r1 = 1717(0x6b5, float:2.406E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r1)
            java.lang.String r6 = "user_name"
            java.lang.String r9 = "auth_token"
            java.lang.String r11 = "user_id"
            r1 = 2
            X.0qQ.A0B(r13, r1)
            r1 = 0
            if (r7 == 0) goto L_0x02be
            android.accounts.AccountManager.get(r4)
            java.lang.String r3 = "sso_data"
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r4)
            java.lang.String r12 = r5.getUserData(r7, r3)     // Catch:{ SecurityException -> 0x0094 }
            goto L_0x009f
        L_0x0094:
            r5 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r5}
            java.lang.String r5 = "SecurityException"
            X.0KC.A0O(r2, r5, r8)
            r12 = 0
        L_0x009f:
            if (r12 == 0) goto L_0x02be
            int r5 = r12.length()
            if (r5 == 0) goto L_0x02be
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01ce }
            r8.<init>(r12)     // Catch:{ JSONException -> 0x01ce }
            boolean r12 = r8.has(r11)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r5 = "account_manager"
            if (r12 != 0) goto L_0x014b
            java.lang.String r10 = "profilePicUrl"
            java.lang.String r5 = "name"
            java.lang.String r6 = "userId"
            java.lang.String r8 = "accessToken"
            android.accounts.AccountManager.get(r4)     // Catch:{ JSONException -> 0x01ce }
            android.accounts.AccountManager r4 = android.accounts.AccountManager.get(r4)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r4 = r4.getUserData(r7, r3)     // Catch:{ SecurityException -> 0x00c8 }
            goto L_0x00d3
        L_0x00c8:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r3, r4}     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = "SecurityException"
            X.0KC.A0O(r2, r3, r4)     // Catch:{ JSONException -> 0x01ce }
            r4 = 0
        L_0x00d3:
            if (r4 == 0) goto L_0x0134
            int r3 = r4.length()     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x0134
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x012e }
            r9.<init>(r4)     // Catch:{ JSONException -> 0x012e }
            boolean r3 = r9.has(r8)     // Catch:{ JSONException -> 0x012e }
            if (r3 == 0) goto L_0x0134
            java.lang.String r3 = r9.getString(r8)     // Catch:{ JSONException -> 0x012e }
            if (r3 == 0) goto L_0x0134
            int r3 = r3.length()     // Catch:{ JSONException -> 0x012e }
            if (r3 == 0) goto L_0x0134
            boolean r3 = r9.has(r6)     // Catch:{ JSONException -> 0x012e }
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r6 = r7
            goto L_0x0101
        L_0x00fd:
            java.lang.String r6 = r9.getString(r6)     // Catch:{ JSONException -> 0x012e }
        L_0x0101:
            boolean r3 = r9.has(r5)     // Catch:{ JSONException -> 0x012e }
            if (r3 == 0) goto L_0x012c
            java.lang.String r5 = r9.getString(r5)     // Catch:{ JSONException -> 0x012e }
        L_0x010b:
            boolean r3 = r9.has(r10)     // Catch:{ JSONException -> 0x012e }
            if (r3 == 0) goto L_0x012a
            java.lang.String r4 = r9.getString(r10)     // Catch:{ JSONException -> 0x012e }
        L_0x0115:
            boolean r3 = r9.has(r8)     // Catch:{ JSONException -> 0x012e }
            if (r3 == 0) goto L_0x011f
            java.lang.String r7 = r9.getString(r8)     // Catch:{ JSONException -> 0x012e }
        L_0x011f:
            X.9Go r3 = new X.9Go     // Catch:{ JSONException -> 0x012e }
            r3.<init>(r6, r5, r4)     // Catch:{ JSONException -> 0x012e }
            X.9Gp r4 = new X.9Gp     // Catch:{ JSONException -> 0x012e }
            r4.<init>(r7, r3)     // Catch:{ JSONException -> 0x012e }
            goto L_0x0135
        L_0x012a:
            r4 = r7
            goto L_0x0115
        L_0x012c:
            r5 = r7
            goto L_0x010b
        L_0x012e:
            r4 = move-exception
            java.lang.String r3 = "JSONException when parsing account data."
            X.0KC.A0F(r2, r3, r4)     // Catch:{ JSONException -> 0x01ce }
        L_0x0134:
            r4 = r1
        L_0x0135:
            if (r4 == 0) goto L_0x02bc
            X.9Go r3 = r4.A01     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r9 = r3.A02     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r10 = r4.A00     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r11 = "FACEBOOK"
            X.FxV r12 = new X.FxV     // Catch:{ JSONException -> 0x01ce }
            r12.<init>(r4)     // Catch:{ JSONException -> 0x01ce }
            X.F3S r8 = new X.F3S     // Catch:{ JSONException -> 0x01ce }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x01ce }
            goto L_0x02bd
        L_0x014b:
            java.lang.String r3 = r8.getString(r9)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x02be
            int r3 = r3.length()     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x02be
            boolean r3 = r8.has(r11)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r17 = ""
            if (r3 == 0) goto L_0x0160
            goto L_0x0163
        L_0x0160:
            r16 = r17
            goto L_0x0167
        L_0x0163:
            java.lang.String r16 = r8.getString(r11)     // Catch:{ JSONException -> 0x01ce }
        L_0x0167:
            boolean r3 = r8.has(r6)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x01a7
            java.lang.String r6 = r8.getString(r6)     // Catch:{ JSONException -> 0x01ce }
        L_0x0171:
            boolean r3 = r8.has(r10)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x01a4
            java.lang.String r4 = r8.getString(r10)     // Catch:{ JSONException -> 0x01ce }
        L_0x017b:
            boolean r3 = r8.has(r9)     // Catch:{ JSONException -> 0x01ce }
            if (r3 == 0) goto L_0x0185
            java.lang.String r17 = r8.getString(r9)     // Catch:{ JSONException -> 0x01ce }
        L_0x0185:
            java.lang.String r18 = "FACEBOOK"
            java.lang.String r7 = r7.type     // Catch:{ JSONException -> 0x01ce }
            X.8s5 r20 = X.C368108s5.A03     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = "com.facebook.auth.login"
            boolean r3 = X.0qQ.A0K(r7, r3)     // Catch:{ JSONException -> 0x01ce }
            if (r3 != 0) goto L_0x01aa
            X.8s5 r20 = X.C368108s5.A08     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = "com.facebook.messenger"
            boolean r3 = X.0qQ.A0K(r7, r3)     // Catch:{ JSONException -> 0x01ce }
            if (r3 != 0) goto L_0x01aa
            java.lang.String r3 = "AppSource not supported."
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r3)     // Catch:{ JSONException -> 0x01ce }
            throw r3     // Catch:{ JSONException -> 0x01ce }
        L_0x01a4:
            r4 = r17
            goto L_0x017b
        L_0x01a7:
            r6 = r17
            goto L_0x0171
        L_0x01aa:
            java.lang.String r3 = "name"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r3, r6)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = "profile_pic_url"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r3, r4)     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r3 = "resolver_type"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r3, r5)     // Catch:{ JSONException -> 0x01ce }
            X.0eP[] r3 = new X.0eP[]{r6, r4, r3}     // Catch:{ JSONException -> 0x01ce }
            java.util.LinkedHashMap r19 = X.0Yt.A07(r3)     // Catch:{ JSONException -> 0x01ce }
            X.F3S r15 = new X.F3S     // Catch:{ JSONException -> 0x01ce }
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x01ce }
            r1 = r15
            goto L_0x02be
        L_0x01ce:
            r4 = move-exception
            java.lang.String r3 = "JSONException when parsing account data."
            X.0KC.A0F(r2, r3, r4)
            goto L_0x02be
        L_0x01d6:
            java.lang.String r8 = r1.getName()
            java.util.ArrayList r7 = X.DbV.A15(r8)
            java.lang.String r3 = r6.A00
            X.0qQ.A07(r3)
            int r2 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r5 = "android.permission.GET_ACCOUNTS"
            r4.checkPermission(r5, r2, r1)
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r4)
            X.0qQ.A07(r1)
            android.accounts.Account[] r3 = r1.getAccountsByType(r3)
            X.0qQ.A07(r3)
            int r2 = r3.length
            r1 = 0
        L_0x0200:
            if (r1 >= r2) goto L_0x0288
            r12 = r3[r1]
            X.8s5 r15 = X.C368228sH.A00(r6)
            int r10 = android.os.Process.myPid()
            int r9 = android.os.Process.myUid()
            r4.checkPermission(r5, r10, r9)
            android.accounts.AccountManager r10 = android.accounts.AccountManager.get(r4)
            X.0qQ.A07(r10)
            java.lang.String r9 = "persisted_ts"
            java.lang.String r9 = r10.getUserData(r12, r9)
            if (r9 == 0) goto L_0x0237
            long r9 = java.lang.Long.parseLong(r9)
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r9
            r10 = 7344000000(0x1b5bc8c00, double:3.628418103E-314)
            int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0237
        L_0x0234:
            int r1 = r1 + 1
            goto L_0x0200
        L_0x0237:
            X.4da r11 = new X.4da
            r11.<init>()
            java.lang.String r10 = "account_switcher_data"
            android.accounts.AccountManager r9 = android.accounts.AccountManager.get(r4)
            java.lang.String r12 = r9.getUserData(r12, r10)     // Catch:{ SecurityException -> 0x0247 }
            goto L_0x0252
        L_0x0247:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r9}
            java.lang.String r9 = "SecurityException"
            X.0KC.A0O(r8, r9, r10)
            r12 = 0
        L_0x0252:
            if (r12 == 0) goto L_0x0234
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r12)
            java.lang.String r9 = "user_id"
            boolean r9 = r10.has(r9)
            if (r9 != 0) goto L_0x0283
            java.lang.Class<X.9Gp> r9 = X.C376119Gp.class
            java.lang.Object r9 = r11.A0E(r12, r9)
            X.9Gp r9 = (X.C376119Gp) r9
            X.8sI r16 = X.C368238sI.SAVED_ACCOUNTS
            if (r9 == 0) goto L_0x0234
            X.9Go r10 = r9.A01
            java.lang.String r11 = r10.A02
            java.lang.String r12 = r9.A00
            java.lang.String r13 = "FACEBOOK"
            X.FxV r14 = new X.FxV
            r14.<init>(r9)
            X.F3S r10 = new X.F3S
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x027f:
            r7.add(r10)
            goto L_0x0234
        L_0x0283:
            X.F3S r10 = X.C49265Es8.A00(r12)
            goto L_0x027f
        L_0x0288:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r4 = r7.iterator()
        L_0x0290:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02b8
            java.lang.Object r3 = r4.next()
            X.F3S r3 = (X.F3S) r3
            java.util.Map r10 = r3.A03
            java.lang.String r2 = "resolver_type"
            java.lang.String r1 = "account_manager"
            r10.put(r2, r1)
            java.lang.String r7 = r3.A02
            java.lang.String r8 = r3.A01
            java.lang.String r9 = r3.A00
            X.8s5 r11 = r3.A04
            X.8sI r12 = r3.A05
            X.F3S r6 = new X.F3S
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.add(r6)
            goto L_0x0290
        L_0x02b8:
            r0.addAll(r5)
            return r0
        L_0x02bc:
            r8 = 0
        L_0x02bd:
            r1 = r8
        L_0x02be:
            if (r1 == 0) goto L_0x02c3
            r0.add(r1)
        L_0x02c3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49963FGw.A03(android.content.Context, X.FAQ):java.util.ArrayList");
    }

    public static void A06(Object obj, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (obj == ((C368148s9) next).A04) {
            abstractCollection.add(next);
        }
    }
}
