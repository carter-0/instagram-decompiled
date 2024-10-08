package X;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PIQ implements C239473Gp {
    public boolean A00;
    public final 1Xz A01;
    public final C239453Gn A02;
    public final 1Xu A03;
    public final 0xa A04;
    public final String A05;
    public final Map A06 = AnonymousClass7TE.A1H();
    public final Set A07 = AnonymousClass7TE.A1F();
    public final C239513Gt A08;
    public final 1XI A09;

    private synchronized void A00() {
        if (!this.A00) {
            throw AnonymousClass7TE.A0z("notification category not initialized");
        }
    }

    public final void A9T(AnonymousClass5HJ r11, 0lg r12, Runnable runnable, String str) {
        A00();
        Map map = this.A06;
        String str2 = str;
        List A13 = C66580MXl.A13(str, map);
        if (A13 == null) {
            A13 = AnonymousClass7TE.A1C();
            map.put(str, A13);
        }
        A13.add(r11);
        0xY AR4 = this.A04.AR4();
        int A062 = C51966G9m.A06(A13);
        0qQ.A0B(str, 0);
        AR4.E5g(002.A0G(str, '|', A062), r11.A04());
        AR4.apply();
        this.A03.A03(r11, r12);
        A01(r12, runnable, str2, A13, false, false);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C239473Gp ASb() {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r1 = r12.A05     // Catch:{ all -> 0x00c1 }
            int r3 = r1.hashCode()     // Catch:{ all -> 0x00c1 }
            boolean r0 = r12.A00     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00bf
            X.3Gt r6 = r12.A08     // Catch:{ Exception -> 0x00b4 }
            r7 = 1
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x00b4 }
            r6.EwV(r0, r1, r3, r7)     // Catch:{ Exception -> 0x00b4 }
            boolean r0 = r12.A00     // Catch:{ Exception -> 0x00b4 }
            if (r0 != 0) goto L_0x00ad
            java.util.Map r5 = r12.A06     // Catch:{ Exception -> 0x00b4 }
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00ad
            java.util.Set r4 = r12.A07     // Catch:{ Exception -> 0x00b4 }
            boolean r0 = r4.isEmpty()     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00ad
            X.0xa r0 = r12.A04     // Catch:{ Exception -> 0x00b4 }
            java.util.Map r0 = r0.getAll()     // Catch:{ Exception -> 0x00b4 }
            java.util.Iterator r11 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ Exception -> 0x00b4 }
        L_0x0031:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00a3
            java.util.Map$Entry r10 = X.AnonymousClass7TE.A1J(r11)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r9 = X.DbT.A13(r10)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = "|"
            int r1 = r9.indexOf(r0)     // Catch:{ Exception -> 0x00b4 }
            r0 = -1
            if (r1 == r0) goto L_0x0031
            r0 = 0
            java.lang.String r2 = r9.substring(r0, r1)     // Catch:{ Exception -> 0x00b4 }
            int r0 = r1 + 1
            java.lang.String r1 = r9.substring(r0)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = "showing"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x005f
            r4.add(r2)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0031
        L_0x005f:
            java.util.List r8 = X.C66580MXl.A13(r2, r5)     // Catch:{ Exception -> 0x00b4 }
            if (r8 != 0) goto L_0x006c
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x00b4 }
            r5.put(r2, r8)     // Catch:{ Exception -> 0x00b4 }
        L_0x006c:
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x008a }
        L_0x0070:
            int r0 = r8.size()     // Catch:{ Exception -> 0x00b4 }
            if (r2 < r0) goto L_0x007b
            r0 = 0
            r8.add(r0)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0070
        L_0x007b:
            java.lang.Object r1 = r10.getValue()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b4 }
            r0 = 0
            X.5HJ r0 = X.AnonymousClass5HJ.A01(r1, r0)     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            r8.set(r2, r0)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0031
        L_0x008a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = "Failed to parse location info: Key = "
            r1.append(r0)     // Catch:{ Exception -> 0x00b4 }
            r1.append(r9)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = ", Exception: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r0, r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = "NotificationCategoryController"
            X.0wb.A03(r0, r1)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0031
        L_0x00a3:
            r12.A00 = r7     // Catch:{ Exception -> 0x00b4 }
            java.util.Collection r0 = r5.values()     // Catch:{ Exception -> 0x00b4 }
            r6.Ez0(r0, r3)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00bf
        L_0x00ad:
            java.lang.String r0 = "attempted to initialize twice"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x00b4 }
            throw r0     // Catch:{ Exception -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            X.3Gt r1 = r12.A08     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x00c1 }
            r1.AUY(r3, r0)     // Catch:{ all -> 0x00c1 }
            throw r2     // Catch:{ all -> 0x00c1 }
        L_0x00bf:
            monitor-exit(r12)
            return r12
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PIQ.ASb():X.3Gp");
    }

    public final void FKu(AnonymousClass5HJ r12, 0lg r13, Runnable runnable, String str) {
        A00();
        String str2 = str;
        List list = (List) this.A06.get(str);
        if (list != null) {
            int i = 0;
            while (true) {
                0lg r5 = r13;
                if (i >= list.size()) {
                    break;
                } else if (!this.A09.ACM((AnonymousClass5HJ) list.get(i), r12)) {
                    i++;
                } else if (i != -1) {
                    list.set(i, r12);
                    0xY AR4 = this.A04.AR4();
                    0qQ.A0B(str, 0);
                    AR4.E5g(002.A0G(str, '|', i), r12.A04());
                    AR4.apply();
                    if (this.A07.contains(str)) {
                        this.A03.A03(r12, r13);
                        A01(r5, runnable, str2, list, true, true);
                        return;
                    }
                }
            }
            this.A03.A04(r12, r13);
        }
    }

    private void A01(0lg r14, Runnable runnable, String str, List list, boolean z, boolean z2) {
        String str2 = str;
        String A002 = C284285Lx.A00(this.A05, str2);
        0lg r9 = r14;
        UserSession A012 = 0Gl.A01(r14);
        1XI r3 = this.A09;
        C370438wT AEa = r3.AEa(A012, A002, str2, list, z);
        AEa.A02 = z2;
        AnonymousClass5HJ r2 = AEa.A04;
        Set set = this.A07;
        if (!set.contains(str2)) {
            set.add(str2);
            DbW.A1L(this.A04.AR4(), 002.A0R(str2, "|showing"));
        }
        this.A03.A05(r2, r14);
        this.A01.A02(AEa, r9, runnable, A002, 64278);
        r3.AAv(r2, A012, str2);
    }

    public final void AWM(UserSession userSession, boolean z) {
        HashSet A12 = C66580MXl.A12(this.A07);
        this.A01.A01();
        A12.addAll(this.A06.keySet());
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            AnonymousClass5HJ EEC = EEC(userSession, AnonymousClass7TE.A18(it));
            if (EEC != null) {
                this.A03.A02(EEC, userSession);
            }
        }
        this.A02.A00();
    }

    public final void EED(AnonymousClass5HJ r26, 0lg r27, Runnable runnable, String str) {
        AnonymousClass5HJ r8;
        0lg r7;
        Runnable runnable2;
        String str2;
        String str3;
        A00();
        1b0 r11 = this.A09;
        if (r11 instanceof 1b0) {
            LinkedList linkedList = new LinkedList();
            String str4 = str;
            linkedList.add(str4);
            Map map = this.A06;
            linkedList.addAll(r11.A00(str4, map.keySet()));
            Iterator it = linkedList.iterator();
            int i = 0;
            while (true) {
                r8 = r26;
                r7 = r27;
                runnable2 = runnable;
                if (!it.hasNext()) {
                    break;
                }
                String str5 = (String) it.next();
                List list = (List) map.get(str5);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        AnonymousClass5HJ r1 = (AnonymousClass5HJ) it2.next();
                        if ((r1 != null && (str2 = r1.A0f) != null && (str3 = r8.A16) != null && str2.startsWith(str3)) || r11.ACM(r1, r8)) {
                            int i3 = i2;
                            0xY AR4 = this.A04.AR4();
                            0qQ.A0B(str5, 0);
                            AR4.ED3(002.A0G(str5, '|', i2));
                            if (i2 < C51966G9m.A06(list)) {
                                while (true) {
                                    i3++;
                                    if (i3 >= list.size()) {
                                        break;
                                    }
                                    AR4.E5g(002.A0G(str5, '|', i3 - 1), ((AnonymousClass5HJ) list.get(i3)).A04());
                                    AR4.apply();
                                }
                                AR4.ED3(002.A0G(str5, '|', C51966G9m.A06(list)));
                                AR4.apply();
                            }
                            AR4.apply();
                            it2.remove();
                            r11.DUe(r8, 0Gl.A01(r7));
                            if (list.isEmpty()) {
                                String A002 = C284285Lx.A00(this.A05, str5);
                                this.A01.A03(runnable2, A002, 64278);
                                this.A02.A01(A002);
                                this.A07.remove(str5);
                            } else if (this.A07.contains(str5)) {
                                A01(r7, runnable2, str5, list, true, false);
                            }
                            this.A03.A01(r8, r1, r7);
                            i++;
                        }
                        i2++;
                    }
                }
            }
            if (i > 0) {
                this.A03.A06(r8, r7, i);
            } else {
                runnable2.run();
                this.A03.A06(r8, r7, 0);
            }
            this.A02.A00();
        }
    }

    public final String toString() {
        C239023El r3 = new C239023El("\n");
        String str = this.A05;
        Iterator A0u = AnonymousClass7TF.A0u(this.A06);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        try {
            C9733Rfr.A00(r3, A1A, " = ", A0u);
            String obj = A1A.toString();
            String obj2 = this.A07.toString();
            Iterator A0u2 = AnonymousClass7TF.A0u(this.A04.getAll());
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            try {
                C9733Rfr.A00(r3, A1A2, " = ", A0u2);
                return 002.A18("\nmCategoryName: ", str, "\nmAggregateMode: ", "\nmData: \n", obj, "\nmShowing: \n", obj2, "\nmPreferences: \n", A1A2.toString());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public PIQ(1Xz r4, 1Xu r5, 1XI r6, 0xa r7) {
        C239513Gt r0;
        if (1AW.A06(0Tu.A05, 18305635946864523L)) {
            r0 = C239503Gs.A00;
        } else {
            r0 = OSY.A00;
        }
        this.A08 = r0;
        this.A01 = r4;
        this.A09 = r6;
        this.A04 = r7;
        this.A03 = r5;
        String AmK = r6.AmK();
        this.A02 = new C239453Gn(r4);
        this.A05 = AmK;
        if (AmK.contains("|")) {
            throw AnonymousClass7TE.A0w("category cannot contain delimiter");
        }
    }

    public final void EDA() {
        A00();
        String str = this.A05;
        0qQ.A0B(str, 0);
        this.A01.A03((Runnable) null, str, 64278);
        C239453Gn r0 = this.A02;
        r0.A01(str);
        r0.A00();
        0xY AR4 = this.A04.AR4();
        AR4.ED3("aggregated");
        AR4.apply();
    }

    public final void EDH(0lg r3) {
        A00();
        Iterator it = C66580MXl.A12(this.A07).iterator();
        while (it.hasNext()) {
            EEB(AnonymousClass7TE.A18(it));
        }
        EDA();
        0xY AR4 = this.A04.AR4();
        AR4.AHM();
        AR4.apply();
        this.A06.clear();
        this.A02.A00();
    }

    public final void EDI(UserSession userSession, long j) {
        long j2;
        AnonymousClass5HJ EEC;
        A00();
        HashMap A012 = this.A01.A01();
        HashSet A12 = C66580MXl.A12(this.A07);
        A12.addAll(this.A06.keySet());
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            StatusBarNotification statusBarNotification = (StatusBarNotification) A012.get(C284285Lx.A00(this.A05, A18));
            if (statusBarNotification == null) {
                EEC(userSession, A18);
            } else {
                Bundle bundle = statusBarNotification.getNotification().extras;
                if (bundle != null) {
                    j2 = bundle.getLong("com.instagram.android.igns.notification_life_time", j);
                } else {
                    j2 = j;
                }
                if (System.currentTimeMillis() >= statusBarNotification.getPostTime() + j2 && (EEC = EEC(userSession, A18)) != null) {
                    this.A03.A07(EEC, userSession);
                }
            }
        }
        this.A02.A00();
    }

    public final void EEB(String str) {
        A00();
        String A002 = C284285Lx.A00(this.A05, str);
        this.A01.A03((Runnable) null, A002, 64278);
        C239453Gn r0 = this.A02;
        r0.A01(A002);
        r0.A00();
        this.A07.remove(str);
        0xY AR4 = this.A04.AR4();
        0qQ.A0B(str, 0);
        AR4.ED3(002.A0R(str, "|showing"));
        AR4.apply();
    }

    public final AnonymousClass5HJ EEC(UserSession userSession, String str) {
        A00();
        0xY AR4 = this.A04.AR4();
        List list = (List) this.A06.remove(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                0qQ.A0B(str, 0);
                AR4.ED3(002.A0G(str, '|', i));
                this.A09.DUe((AnonymousClass5HJ) list.get(i), userSession);
            }
        }
        String A002 = C284285Lx.A00(this.A05, str);
        this.A01.A03((Runnable) null, A002, 64278);
        this.A02.A01(A002);
        this.A07.remove(str);
        0qQ.A0B(str, 0);
        AR4.ED3(002.A0R(str, "|showing"));
        AR4.apply();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (AnonymousClass5HJ) C66582MXn.A0r(list);
    }
}
