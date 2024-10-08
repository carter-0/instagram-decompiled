package X;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Go  reason: invalid class name and case insensitive filesystem */
public final class C239463Go implements C239473Gp {
    public boolean A00;
    public final 1Xz A01;
    public final C239453Gn A02;
    public final C239513Gt A03;
    public final 1Xu A04;
    public final C239483Gq A05;
    public final C239443Gm A06;
    public final 1XI A07;
    public final String A08;
    public final C62320sa A09;
    public final boolean A0A;

    public final void A9T(AnonymousClass5HJ r8, 0lg r9, Runnable runnable, String str) {
        String str2 = str;
        0qQ.A0B(str, 1);
        C239443Gm r3 = this.A06;
        Map map = r3.A05;
        Object obj = map.get(str);
        if (obj == null) {
            obj = 0sn.A00;
            map.put(str, obj);
        }
        ArrayList A0T = 00k.A0T(r8, (Collection) obj);
        map.put(str, A0T);
        0xY AR4 = r3.A03.AR4();
        AR4.E5g(002.A0G(str, '|', A0T.size() - 1), r8.A04());
        AR4.apply();
        this.A04.A03(r8, r9);
        this.A05.A01(r9, runnable, str2, false, false);
        this.A02.A00();
    }

    public final void AWM(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        for (String A002 : 00k.A0a(this.A06.A05.keySet())) {
            AnonymousClass5HJ A003 = this.A05.A00(A002, true);
            if (A003 != null) {
                this.A04.A02(A003, userSession);
            }
        }
        this.A02.A00();
    }

    public final void EDA() {
    }

    public final void EEB(String str) {
        0qQ.A0B(str, 0);
        this.A05.A00(str, !this.A0A);
        this.A02.A00();
    }

    public final AnonymousClass5HJ EEC(UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        AnonymousClass5HJ A002 = this.A05.A00(str, true);
        this.A02.A00();
        return A002;
    }

    public final void EED(AnonymousClass5HJ r22, 0lg r23, Runnable runnable, String str) {
        String str2;
        String str3;
        0lg r6 = r23;
        0qQ.A0B(r6, 0);
        String str4 = str;
        0qQ.A0B(str4, 1);
        1b0 r8 = this.A07;
        if (r8 instanceof 1b0) {
            C239443Gm r4 = this.A06;
            Map map = r4.A05;
            Iterator it = 00k.A0T(str4, r8.A00(str4, 00k.A0a(map.keySet()))).iterator();
            int i = 0;
            while (true) {
                AnonymousClass5HJ r13 = r22;
                Runnable runnable2 = runnable;
                if (it.hasNext()) {
                    String str5 = (String) it.next();
                    0qQ.A0B(str5, 0);
                    0sn r14 = (List) map.get(str5);
                    if (r14 == null) {
                        r14 = 0sn.A00;
                    }
                    if (!r14.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : r14) {
                            AnonymousClass5HJ r12 = (AnonymousClass5HJ) next;
                            if ((r12 != null && (str2 = r12.A0f) != null && (str3 = r13.A16) != null && 00p.A0k(str2, str3, false)) || r8.ACM(r12, r13)) {
                                arrayList.add(next);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Set A0k = 00k.A0k(arrayList);
                            List list = (List) map.get(str5);
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object next2 : list) {
                                    if (!A0k.contains(next2)) {
                                        arrayList2.add(next2);
                                    }
                                }
                                List A0h = 00k.A0h(arrayList2, r4.A01);
                                if (!list.equals(A0h)) {
                                    0xY AR4 = r4.A03.AR4();
                                    int i2 = 0;
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        it2.next();
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            0sr.A1T();
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                        AnonymousClass5HJ r15 = (AnonymousClass5HJ) 00k.A0O(A0h, i2);
                                        String A0G = 002.A0G(str5, '|', i2);
                                        if (r15 != null) {
                                            AR4.E5g(A0G, r15.A04());
                                        } else {
                                            AR4.ED3(A0G);
                                        }
                                        i2 = i3;
                                    }
                                    AR4.apply();
                                    map.put(str5, A0h);
                                }
                            }
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                this.A04.A01(r13, (AnonymousClass5HJ) it3.next(), r6);
                            }
                            if (r14.size() == arrayList.size()) {
                                String A002 = C284285Lx.A00(this.A08, str5);
                                this.A01.A03(runnable2, A002, 64278);
                                this.A02.A01(A002);
                                0xY AR42 = r4.A03.AR4();
                                AR42.ED3(002.A0R(str5, "|showing"));
                                AR42.apply();
                            } else if (r4.A03.contains(002.A0R(str5, "|showing"))) {
                                String str6 = str5;
                                this.A05.A01(r6, runnable2, str6, true, false);
                            }
                            i += arrayList.size();
                        } else {
                            continue;
                        }
                    }
                } else {
                    this.A04.A06(r13, r6, i);
                    this.A02.A00();
                    if (i == 0) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void FKu(AnonymousClass5HJ r18, 0lg r19, Runnable runnable, String str) {
        AnonymousClass5HJ r3;
        0lg r12 = r19;
        0qQ.A0B(r12, 0);
        String str2 = str;
        0qQ.A0B(str2, 1);
        C239443Gm r9 = this.A06;
        Map map = r9.A05;
        0sn r0 = (List) map.get(str2);
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        Iterator it = r0.iterator();
        while (true) {
            r3 = r18;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (this.A07.ACM((AnonymousClass5HJ) next, r3)) {
                if (next != null) {
                    Object obj = map.get(str2);
                    if (obj == null) {
                        obj = 0sn.A00;
                        map.put(str2, obj);
                    }
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                    int i = 0;
                    for (Object next2 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        if (0qQ.A0K(next2, next)) {
                            0xY AR4 = r9.A03.AR4();
                            AR4.E5g(002.A0G(str2, '|', i), r3.A04());
                            AR4.apply();
                            next2 = r3;
                        }
                        arrayList.add(next2);
                        i = i2;
                    }
                    map.put(str2, arrayList);
                    if (r9.A03.contains(002.A0R(str2, "|showing"))) {
                        this.A04.A03(r3, r12);
                        this.A05.A01(r12, runnable, str2, true, true);
                        return;
                    }
                }
            }
        }
        this.A04.A04(r3, r12);
    }

    public /* synthetic */ C239463Go(1Xz r10, C239453Gn r11, 1Xu r12, C239443Gm r13, 1XI r14, String str, boolean z) {
        C239513Gt r0;
        C239483Gq r2 = new C239483Gq(r10, r11, r12, r13, r14, str);
        C239493Gr r1 = C239493Gr.A00;
        0qQ.A0B(r12, 5);
        0qQ.A0B(str, 6);
        0qQ.A0B(r1, 8);
        this.A01 = r10;
        this.A07 = r14;
        this.A06 = r13;
        this.A02 = r11;
        this.A04 = r12;
        this.A08 = str;
        this.A05 = r2;
        this.A09 = r1;
        this.A0A = z;
        if (1AW.A06(0Tu.A05, 18305635946864523L)) {
            r0 = C239503Gs.A00;
        } else {
            r0 = OSY.A00;
        }
        this.A03 = r0;
        if (00l.A0d(str, "|", false)) {
            throw new IllegalArgumentException(C66579MXk.A00(696));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0161 A[EDGE_INSN: B:122:0x0161->B:77:0x0161 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143 A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015e A[Catch:{ all -> 0x00a0 }, LOOP:2: B:46:0x0117->B:76:0x015e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C239473Gp ASb() {
        /*
            r28 = this;
            r3 = r28
            java.lang.String r2 = r3.A08
            int r4 = r2.hashCode()
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0209
            monitor-enter(r3)
            boolean r0 = r3.A00     // Catch:{ all -> 0x0205 }
            if (r0 != 0) goto L_0x0208
            X.3Gt r0 = r3.A03     // Catch:{ Exception -> 0x01fa }
            r27 = r0
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x01fa }
            r7 = 1
            r0.EwV(r1, r2, r4, r7)     // Catch:{ Exception -> 0x01fa }
            X.3Gm r6 = r3.A06     // Catch:{ Exception -> 0x01fa }
            boolean r0 = r6.A00     // Catch:{ Exception -> 0x01fa }
            if (r0 != 0) goto L_0x01ec
            monitor-enter(r6)     // Catch:{ Exception -> 0x01fa }
            boolean r0 = r6.A00     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01eb
            X.0sa r0 = r6.A06     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x01e8 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01e8 }
            long r24 = r0.longValue()     // Catch:{ all -> 0x01e8 }
            X.0xa r0 = r6.A03     // Catch:{ all -> 0x01e8 }
            r26 = r0
            java.util.Map r11 = r26.getAll()     // Catch:{ all -> 0x01e8 }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01e8 }
            r2.<init>()     // Catch:{ all -> 0x01e8 }
            java.util.Set r0 = r11.entrySet()     // Catch:{ all -> 0x01e8 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x01e8 }
        L_0x0047:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x01e8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01e8 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x01e8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01e8 }
            X.0qQ.A0A(r5)     // Catch:{ all -> 0x01e8 }
            r1 = 0
            java.lang.String r0 = "|"
            int r0 = X.00l.A08(r5, r0, r1, r1)     // Catch:{ all -> 0x01e8 }
            if (r0 < 0) goto L_0x0047
            java.lang.String r8 = r5.substring(r1, r0)     // Catch:{ all -> 0x01e8 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x01e8 }
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)     // Catch:{ all -> 0x01e8 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "showing"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x0047
            java.lang.Object r0 = r2.get(r8)     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x008a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01e8 }
            r2.put(r8, r0)     // Catch:{ all -> 0x01e8 }
        L_0x008a:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01e8 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x01e8 }
            int r0 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x00a0 }
            int r0 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x00a0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a0 }
            r2.put(r8, r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x0047
        L_0x00a0:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ     // Catch:{ all -> 0x01e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e8 }
            goto L_0x0047
        L_0x00a7:
            X.0sa r0 = r6.A07     // Catch:{ all -> 0x01e8 }
            java.lang.Object r14 = r0.invoke()     // Catch:{ all -> 0x01e8 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x01e8 }
            java.util.LinkedHashMap r23 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01e8 }
            r23.<init>()     // Catch:{ all -> 0x01e8 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x01e8 }
            java.util.Iterator r22 = r0.iterator()     // Catch:{ all -> 0x01e8 }
            r10 = 0
            r21 = 0
        L_0x00bf:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0168
            java.lang.Object r0 = r22.next()     // Catch:{ all -> 0x01e8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01e8 }
            java.lang.Object r13 = r0.getKey()     // Catch:{ all -> 0x01e8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01e8 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01e8 }
            int r15 = r0.intValue()     // Catch:{ all -> 0x01e8 }
            int r1 = r6.A01     // Catch:{ all -> 0x01e8 }
            if (r15 < r1) goto L_0x00e1
            r21 = 1
        L_0x00e1:
            X.0qQ.A0B(r13, r10)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "|showing"
            java.lang.String r0 = X.002.A0R(r13, r0)     // Catch:{ all -> 0x01e8 }
            boolean r0 = r11.containsKey(r0)     // Catch:{ all -> 0x01e8 }
            r20 = 1
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = r6.A04     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = X.C284285Lx.A00(r0, r13)     // Catch:{ all -> 0x01e8 }
            boolean r0 = r14.contains(r0)     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0100
            r20 = 0
        L_0x0100:
            boolean r0 = r6.A08     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0109
            if (r20 == 0) goto L_0x0109
            r21 = 1
            goto L_0x00bf
        L_0x0109:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x01e8 }
            r12.<init>()     // Catch:{ all -> 0x01e8 }
            int r1 = r1 - r7
            int r0 = r15 - r1
            int r5 = java.lang.Math.max(r10, r0)     // Catch:{ all -> 0x01e8 }
            if (r5 > r15) goto L_0x0161
        L_0x0117:
            r2 = 0
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = X.002.A0G(r13, r0, r5)     // Catch:{ all -> 0x0134 }
            java.lang.Object r1 = r11.get(r0)     // Catch:{ all -> 0x0134 }
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0132
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0134 }
            if (r1 == 0) goto L_0x0132
            r0 = 0
            X.5HJ r1 = X.AnonymousClass5HJ.A01(r1, r0)     // Catch:{ IOException -> 0x0130 }
            goto L_0x013a
        L_0x0130:
            r1 = 0
            goto L_0x013a
        L_0x0132:
            r1 = r2
            goto L_0x013a
        L_0x0134:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ     // Catch:{ all -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e8 }
        L_0x013a:
            boolean r0 = r1 instanceof X.0eQ     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x013f
            r2 = r1
        L_0x013f:
            X.5HJ r2 = (X.AnonymousClass5HJ) r2     // Catch:{ all -> 0x01e8 }
            if (r2 == 0) goto L_0x015a
            if (r20 == 0) goto L_0x0156
            long r8 = r6.A02     // Catch:{ all -> 0x01e8 }
            r16 = -1
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0156
            long r0 = r2.A03     // Catch:{ all -> 0x01e8 }
            long r16 = r24 - r0
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            goto L_0x015a
        L_0x0156:
            r12.add(r2)     // Catch:{ all -> 0x01e8 }
            goto L_0x015c
        L_0x015a:
            r21 = 1
        L_0x015c:
            if (r5 == r15) goto L_0x0161
            int r5 = r5 + 1
            goto L_0x0117
        L_0x0161:
            r0 = r23
            r0.put(r13, r12)     // Catch:{ all -> 0x01e8 }
            goto L_0x00bf
        L_0x0168:
            if (r21 == 0) goto L_0x01de
            X.0xY r12 = r26.AR4()     // Catch:{ all -> 0x01e8 }
            r12.AHM()     // Catch:{ all -> 0x01e8 }
            java.util.Set r0 = r23.entrySet()     // Catch:{ all -> 0x01e8 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x01e8 }
        L_0x0179:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x01db
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x01e8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01e8 }
            java.lang.Object r9 = r0.getKey()     // Catch:{ all -> 0x01e8 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01e8 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x01e8 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x01e8 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01e8 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0179
            X.0qQ.A0B(r9, r10)     // Catch:{ all -> 0x01e8 }
            java.lang.String r1 = "|showing"
            java.lang.String r0 = X.002.A0R(r9, r1)     // Catch:{ all -> 0x01e8 }
            boolean r0 = r11.containsKey(r0)     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = X.002.A0R(r9, r1)     // Catch:{ all -> 0x01e8 }
            r12.E5T(r0, r7)     // Catch:{ all -> 0x01e8 }
        L_0x01af:
            r1 = 0
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x01e8 }
        L_0x01b4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0179
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x01e8 }
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x01ca
            X.0sr.A1T()     // Catch:{ all -> 0x01e8 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x01e8 }
            throw r0     // Catch:{ all -> 0x01e8 }
        L_0x01ca:
            X.5HJ r5 = (X.AnonymousClass5HJ) r5     // Catch:{ all -> 0x01e8 }
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r1 = X.002.A0G(r9, r0, r1)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = r5.A04()     // Catch:{ all -> 0x01e8 }
            r12.E5g(r1, r0)     // Catch:{ all -> 0x01e8 }
            r1 = r2
            goto L_0x01b4
        L_0x01db:
            r12.apply()     // Catch:{ all -> 0x01e8 }
        L_0x01de:
            java.util.Map r1 = r6.A05     // Catch:{ all -> 0x01e8 }
            r0 = r23
            r1.putAll(r0)     // Catch:{ all -> 0x01e8 }
            r6.A00 = r7     // Catch:{ all -> 0x01e8 }
            goto L_0x01eb
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x01fa }
            throw r0     // Catch:{ Exception -> 0x01fa }
        L_0x01eb:
            monitor-exit(r6)     // Catch:{ Exception -> 0x01fa }
        L_0x01ec:
            r3.A00 = r7     // Catch:{ Exception -> 0x01fa }
            r0 = 2
            X.9LU r1 = new X.9LU     // Catch:{ Exception -> 0x01fa }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x01fa }
            r0 = r27
            r0.Ez1(r1, r4)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0208
        L_0x01fa:
            r2 = move-exception
            X.3Gt r1 = r3.A03     // Catch:{ all -> 0x0205 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0205 }
            r1.AUY(r4, r0)     // Catch:{ all -> 0x0205 }
            throw r2     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0208:
            monitor-exit(r3)
        L_0x0209:
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239463Go.ASb():X.3Gp");
    }

    public final void EDH(0lg r5) {
        for (String A002 : 00k.A0a(this.A06.A05.keySet())) {
            AnonymousClass5HJ A003 = this.A05.A00(A002, true);
            if (A003 != null) {
                this.A04.A02(A003, r5);
            }
        }
        this.A02.A00();
    }

    public final void EDI(UserSession userSession, long j) {
        long j2;
        AnonymousClass5HJ A002;
        HashMap A012 = this.A01.A01();
        for (String str : 00k.A0a(this.A06.A05.keySet())) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) A012.get(C284285Lx.A00(this.A08, str));
            if (statusBarNotification == null) {
                this.A05.A00(str, true);
            } else {
                Bundle bundle = statusBarNotification.getNotification().extras;
                if (bundle != null) {
                    j2 = bundle.getLong("com.instagram.android.igns.notification_life_time", j);
                } else {
                    j2 = j;
                }
                if (((Number) this.A09.invoke()).longValue() >= statusBarNotification.getPostTime() + j2 && (A002 = this.A05.A00(str, true)) != null) {
                    this.A04.A07(A002, userSession);
                }
            }
        }
        this.A02.A00();
    }
}
