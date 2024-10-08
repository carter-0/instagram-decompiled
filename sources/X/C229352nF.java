package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.2nF  reason: invalid class name and case insensitive filesystem */
public final class C229352nF implements AnonymousClass0lh {
    public final UserSession A00;
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    public C229352nF(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = new X.C294885nC();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C294885nC A02(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.util.concurrent.ConcurrentMap r0 = r2.A01
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L_0x0018
            X.5nC r1 = new X.5nC
            r1.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r3, r1)
            if (r0 == 0) goto L_0x0018
            r1 = r0
        L_0x0018:
            X.5nC r1 = (X.C294885nC) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229352nF.A02(java.lang.String):X.5nC");
    }

    public final void A04(C229372nH r2, String str) {
        0qQ.A0B(r2, 1);
        if (str != null) {
            A02(str).A05.add(r2);
        }
    }

    public final void A05(C229372nH r2, String str) {
        C294885nC r0;
        0qQ.A0B(r2, 1);
        if (str != null && (r0 = (C294885nC) this.A01.get(str)) != null) {
            r0.A05.remove(r2);
        }
    }

    public final void A08(String str, List list, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(list, 1);
        C294885nC r3 = (C294885nC) this.A01.get(str);
        if (r3 != null) {
            List list2 = r3.A03;
            list2.clear();
            list2.addAll(list);
            for (C229372nH D3v : r3.A05) {
                D3v.D3v(r3.A01, list, z, z2);
            }
        }
    }

    public static final ArrayList A00(UserSession userSession, List list, List list2) {
        String str;
        String A2n;
        ArrayList arrayList = new ArrayList();
        List<C267324bN> list3 = list2;
        for (C267324bN r0 : list3) {
            1Xj r02 = r0.A02;
            if (!(r02 == null || (A2n = r02.A2n()) == null)) {
                arrayList.add(A2n);
            }
        }
        Set A0k = 00k.A0k(arrayList);
        ArrayList arrayList2 = new ArrayList(list);
        UserSession userSession2 = userSession;
        if (182.A06(0Tu.A05, userSession, 36322894904568476L)) {
            ArrayList<C267324bN> arrayList3 = new ArrayList<>();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                1Xj r03 = ((C267324bN) next).A02;
                if (r03 != null) {
                    str = r03.A2n();
                } else {
                    str = null;
                }
                if (00k.A0u(A0k, str)) {
                    arrayList3.add(next);
                }
            }
            for (C267324bN r3 : arrayList3) {
                AnonymousClass3VI.A00(userSession2).A07(new C52567GXs(AnonymousClass3VL.REELS, AnonymousClass05K.A00, Integer.valueOf(arrayList2.indexOf(r3) + list3.size()), Integer.valueOf(list3.indexOf(r3)), (Integer) null, (Integer) null, (String) null, r3.getId()));
                arrayList2.removeAll(arrayList3);
            }
        } else {
            018.A1A(arrayList2, new C377189Kw(A0k, 46));
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r7.A07 == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C276114sa r12, X.C294895nD r13, java.lang.String r14, java.util.List r15, boolean r16, boolean r17) {
        /*
            r11 = this;
            r1 = r16
            r3 = 0
            X.0qQ.A0B(r14, r3)
            r0 = 1
            X.0qQ.A0B(r15, r0)
            r0 = 5
            X.0qQ.A0B(r13, r0)
            X.5nC r7 = r11.A02(r14)
            java.util.List r2 = r7.A03
            java.util.Set r6 = r7.A05
            r7.A01 = r12
            r7.A02 = r13
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.5nD r0 = X.C294895nD.CHUNK_STREAMING
            if (r13 == r0) goto L_0x0027
            X.5nD r0 = X.C294895nD.GRAPHQL
            if (r13 != r0) goto L_0x002f
        L_0x0027:
            if (r16 == 0) goto L_0x002e
            boolean r0 = r7.A07
            r1 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            r4 = r17
            if (r1 == 0) goto L_0x00b9
            r2.clear()
            r7.A07 = r3
            java.util.List r0 = r7.A04
            r5.addAll(r0)
            r2.addAll(r5)
        L_0x0040:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r15.iterator()
        L_0x0049:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r7 = r9.next()
            r8 = r7
            X.4bN r8 = (X.C267324bN) r8
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0068
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.BsQ()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0073
        L_0x0068:
            java.util.List r0 = r8.A08
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0073
            goto L_0x0049
        L_0x0073:
            r3.add(r7)
            goto L_0x0049
        L_0x0077:
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r7 = r3.iterator()
        L_0x0086:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r3 = r7.next()
            X.4bN r3 = (X.C267324bN) r3
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x009e
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.BsQ()
            if (r0 != 0) goto L_0x00a0
        L_0x009e:
            X.0sn r0 = X.0sn.A00
        L_0x00a0:
            r3.A08 = r0
            r8.add(r3)
            goto L_0x0086
        L_0x00a6:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00b2
            com.instagram.common.session.UserSession r0 = r11.A00
            java.util.ArrayList r8 = A00(r0, r15, r2)
        L_0x00b2:
            r5.addAll(r8)
            A01(r12, r5, r6, r1, r4)
            goto L_0x00d1
        L_0x00b9:
            X.5nD r0 = X.C294895nD.DEFER_STREAMING
            if (r13 != r0) goto L_0x0174
            boolean r0 = r2 instanceof java.util.Collection
            r10 = 0
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00d5
        L_0x00c8:
            com.instagram.common.session.UserSession r0 = r11.A00
            java.util.ArrayList r5 = A00(r0, r15, r2)
            A01(r12, r5, r6, r3, r4)
        L_0x00d1:
            r2.addAll(r5)
        L_0x00d4:
            return
        L_0x00d5:
            java.util.Iterator r1 = r2.iterator()
        L_0x00d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            X.5o2 r0 = r0.A01
            X.5o2 r5 = X.C295365o2.PREVIEW
            if (r0 != r5) goto L_0x00d9
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0118
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0118
        L_0x00f5:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r5 = r15.iterator()
        L_0x00fe:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r1 = r5.next()
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r0 = r1.A02
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x00fe
            r8.put(r0, r1)
            goto L_0x00fe
        L_0x0118:
            java.util.Iterator r1 = r15.iterator()
        L_0x011c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            X.5o2 r0 = r0.A01
            if (r0 != r5) goto L_0x011c
            goto L_0x00c8
        L_0x012d:
            java.util.Iterator r9 = r2.iterator()
            r7 = 0
        L_0x0132:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r9.next()
            int r5 = r7 + 1
            if (r7 < 0) goto L_0x01f5
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r1 = r8.get(r0)
            if (r1 == 0) goto L_0x015c
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto L_0x015c
            r2.set(r7, r1)
            r10 = 1
        L_0x015c:
            r7 = r5
            goto L_0x0132
        L_0x015e:
            if (r10 == 0) goto L_0x00c8
            java.util.Iterator r1 = r6.iterator()
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r1.next()
            X.2nH r0 = (X.C229372nH) r0
            r0.D3v(r12, r2, r4, r3)
            goto L_0x0164
        L_0x0174:
            X.5nD r0 = X.C294895nD.GRAPHQL
            if (r13 != r0) goto L_0x0040
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r5 = r15.iterator()
        L_0x0181:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r1 = r5.next()
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r0 = r1.A02
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x0181
            r8.put(r0, r1)
            goto L_0x0181
        L_0x019b:
            java.util.Iterator r10 = r2.iterator()
            r7 = 0
            r9 = 0
        L_0x01a1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r10.next()
            int r5 = r7 + 1
            if (r7 < 0) goto L_0x01f5
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r1 = r8.get(r0)
            if (r1 == 0) goto L_0x01cb
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto L_0x01cb
            r2.set(r7, r1)
            r9 = 1
        L_0x01cb:
            r7 = r5
            goto L_0x01a1
        L_0x01cd:
            com.instagram.common.session.UserSession r0 = r11.A00
            java.util.ArrayList r1 = A00(r0, r15, r2)
            r2.addAll(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01df
            A01(r12, r1, r6, r3, r4)
        L_0x01df:
            if (r9 == 0) goto L_0x00d4
            java.util.Iterator r1 = r6.iterator()
        L_0x01e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r1.next()
            X.2nH r0 = (X.C229372nH) r0
            r0.D3v(r12, r2, r4, r3)
            goto L_0x01e5
        L_0x01f5:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229352nF.A03(X.4sa, X.5nD, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public final void A06(C267324bN r3, Integer num, String str, int i) {
        C294885nC r0 = (C294885nC) this.A01.get(str);
        if (r0 != null) {
            for (C229372nH D3p : r0.A05) {
                D3p.D3p(r3, num, i);
            }
        }
    }

    public final void A07(String str) {
        if (str != null) {
            this.A01.remove(str);
        }
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public static final void A01(C276114sa r2, List list, Set set, boolean z, boolean z2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C229372nH) it.next()).D3q(r2, list, z, z2);
        }
    }
}
