package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3z6  reason: invalid class name */
public abstract class AnonymousClass3z6 {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.1Xg r5, X.0uX r6, X.1Ua r7, boolean r8) {
        /*
            r4 = 0
            r3 = 0
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r8 == 0) goto L_0x0035
            X.1Xn r1 = r5.A05
            X.1Xj r0 = X.1Xi.A02(r1)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.getId()
        L_0x0015:
            boolean r0 = r7.A03(r0)
            if (r0 != 0) goto L_0x0031
            if (r6 == 0) goto L_0x0032
            X.1Xj r0 = X.1Xi.A02(r1)
            if (r0 == 0) goto L_0x0027
        L_0x0023:
            java.lang.String r4 = r0.getId()
        L_0x0027:
            java.lang.Boolean r0 = r6.A02(r4)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            return r3
        L_0x0033:
            r0 = r4
            goto L_0x0015
        L_0x0035:
            java.lang.String r0 = r5.A09
            boolean r0 = r7.A03(r0)
            if (r0 != 0) goto L_0x0031
            if (r6 == 0) goto L_0x0032
            X.1Xn r0 = r5.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0027
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3z6.A01(X.1Xg, X.0uX, X.1Ua, boolean):boolean");
    }

    public static final void A00(UserSession userSession, 0uX r25, 1XM r26, 1Ua r27, List list, int i) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        Object poll;
        Object poll2;
        Object poll3;
        Object poll4;
        LinkedList linkedList;
        LinkedList linkedList2;
        Object poll5;
        Object poll6;
        LinkedList linkedList3;
        Object poll7;
        Object poll8;
        LinkedList linkedList4;
        LinkedList linkedList5;
        int i2 = i;
        1XM r29 = r26;
        0qQ.A0B(r29, 1);
        0Tu r6 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean z = !0qQ.A0K(182.A04(r6, userSession2, 36880570638664012L), "rug_pull");
        0uX r15 = r25;
        1Ua r14 = r27;
        List list2 = list;
        if (!r29.A02() || !AnonymousClass1t2.A00(userSession2).booleanValue()) {
            if (!1Uh.A03(userSession2) || !1Uh.A02(userSession2)) {
                LinkedList linkedList6 = new LinkedList(r29.A00());
                LinkedList linkedList7 = new LinkedList(list2);
                linkedList7.removeAll(linkedList6);
                LinkedList linkedList8 = new LinkedList();
                LinkedList linkedList9 = new LinkedList();
                LinkedList linkedList10 = new LinkedList();
                LinkedList linkedList11 = new LinkedList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList(linkedList6);
                int size = arrayList2.size();
                num2 = null;
                for (int i3 = 0; i3 < size; i3++) {
                    Integer num3 = (1Xg) arrayList2.get(i3);
                    if (AnonymousClass3VP.A00(num3)) {
                        hashSet.add(Integer.valueOf(i3));
                        linkedList10.add(num3);
                    } else if (AnonymousClass3VP.A04(num3)) {
                        if (num2 == null) {
                            num2 = num3;
                        }
                        if (A01(num3, r15, r14, z) || A02(num3, r14)) {
                            linkedList9.add(num3);
                        } else {
                            linkedList8.add(num3);
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i3));
                        linkedList11.add(num3);
                    }
                }
                if (z) {
                    Collections.shuffle(linkedList9);
                }
                arrayList = new ArrayList();
                num = null;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (hashSet.contains(Integer.valueOf(i4)) || hashSet2.contains(Integer.valueOf(i4))) {
                        if (hashSet.contains(Integer.valueOf(i4)) && (!linkedList10.isEmpty())) {
                            poll = linkedList10.poll();
                        } else if (hashSet2.contains(Integer.valueOf(i4)) && (!linkedList11.isEmpty())) {
                            poll = linkedList11.poll();
                        }
                        if (poll != null) {
                            arrayList.add(poll);
                        }
                    } else {
                        if (!linkedList8.isEmpty()) {
                            poll2 = linkedList8.poll();
                        } else if (!linkedList7.isEmpty()) {
                            poll2 = linkedList7.poll();
                        } else if (!linkedList9.isEmpty()) {
                            poll2 = linkedList9.poll();
                        }
                        if (poll2 != null) {
                            arrayList.add(poll2);
                            if (num == null) {
                                num = poll2;
                            }
                        }
                    }
                }
            } else {
                LinkedList linkedList12 = new LinkedList(r29.A00());
                ArrayList arrayList3 = new ArrayList();
                for (Object next : list2) {
                    if (((1Xg) next).A06 == 1UQ.A0Y) {
                        arrayList3.add(next);
                    }
                }
                LinkedList linkedList13 = new LinkedList(00k.A0a(arrayList3));
                linkedList13.removeAll(linkedList12);
                ArrayList arrayList4 = new ArrayList();
                for (Object next2 : list2) {
                    if (AnonymousClass3VP.A02((1Xg) next2)) {
                        arrayList4.add(next2);
                    }
                }
                LinkedList linkedList14 = new LinkedList(00k.A0a(arrayList4));
                linkedList14.removeAll(linkedList12);
                LinkedList linkedList15 = new LinkedList();
                LinkedList linkedList16 = new LinkedList();
                LinkedList linkedList17 = new LinkedList();
                LinkedList linkedList18 = new LinkedList();
                LinkedList linkedList19 = new LinkedList();
                LinkedList linkedList20 = new LinkedList();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                ArrayList arrayList5 = new ArrayList(linkedList12);
                int size2 = arrayList5.size();
                num = null;
                num2 = null;
                for (int i5 = 0; i5 < size2; i5++) {
                    Integer num4 = (1Xg) arrayList5.get(i5);
                    if (AnonymousClass3VP.A00(num4)) {
                        hashSet3.add(Integer.valueOf(i5));
                        linkedList = linkedList19;
                    } else if (AnonymousClass3VP.A02(num4)) {
                        if (A01(num4, r15, r14, z)) {
                            linkedList2 = linkedList18;
                        } else {
                            linkedList2 = linkedList17;
                        }
                        linkedList2.add(num4);
                        hashSet5.add(Integer.valueOf(i5));
                    } else if (AnonymousClass3VP.A04(num4)) {
                        if (num2 == null) {
                            num2 = num4;
                        }
                        if (A01(num4, r15, r14, z) || A02(num4, r14)) {
                            linkedList = linkedList16;
                        } else {
                            linkedList = linkedList15;
                        }
                    } else {
                        hashSet4.add(Integer.valueOf(i5));
                        linkedList = linkedList20;
                    }
                    linkedList.add(num4);
                }
                linkedList17.addAll(linkedList14);
                if (z) {
                    Collections.shuffle(linkedList16);
                }
                int A01 = (int) 182.A01(r6, userSession2, 36609991993595853L);
                int A012 = (int) 182.A01(r6, userSession2, 36609991993530316L);
                arrayList = new ArrayList();
                for (int i6 = 0; i6 < i2; i6++) {
                    if (hashSet3.contains(Integer.valueOf(i6)) || hashSet4.contains(Integer.valueOf(i6))) {
                        if (!hashSet3.contains(Integer.valueOf(i6)) || !(!linkedList19.isEmpty())) {
                            if (hashSet4.contains(Integer.valueOf(i6)) && (!linkedList20.isEmpty())) {
                                poll3 = linkedList20.poll();
                            }
                        } else {
                            poll3 = linkedList19.poll();
                        }
                    } else if (!hashSet5.contains(Integer.valueOf(i6)) || !(!linkedList17.isEmpty())) {
                        if (!linkedList15.isEmpty()) {
                            poll4 = linkedList15.poll();
                        } else if ((!linkedList17.isEmpty()) && A03(arrayList, A01, A012)) {
                            poll4 = linkedList17.poll();
                        } else if (!linkedList13.isEmpty()) {
                            poll4 = linkedList13.poll();
                        } else if ((!linkedList18.isEmpty()) && A03(arrayList, A01, A012)) {
                            poll4 = linkedList18.poll();
                        } else if (!linkedList16.isEmpty()) {
                            poll4 = linkedList16.poll();
                        }
                        if (poll4 != null) {
                            arrayList.add(poll4);
                            if (num == null) {
                                num = poll4;
                            }
                        }
                    } else {
                        poll3 = linkedList17.poll();
                    }
                    if (poll3 != null) {
                        arrayList.add(poll3);
                    }
                }
            }
        } else if (!1Uh.A03(userSession2) || !1Uh.A02(userSession2)) {
            LinkedList linkedList21 = new LinkedList(r29.A00());
            ArrayList arrayList6 = new ArrayList();
            for (Object next3 : list2) {
                if (((1Xg) next3).A06 == 1UQ.A0Y) {
                    arrayList6.add(next3);
                }
            }
            LinkedList linkedList22 = new LinkedList(00k.A0a(arrayList6));
            linkedList22.removeAll(linkedList21);
            ArrayList arrayList7 = new ArrayList();
            for (Object next4 : list2) {
                if (((1Xg) next4).A06 == 1UQ.A0H) {
                    arrayList7.add(next4);
                }
            }
            LinkedList linkedList23 = new LinkedList(00k.A0a(arrayList7));
            linkedList23.removeAll(linkedList21);
            LinkedList linkedList24 = new LinkedList();
            LinkedList linkedList25 = new LinkedList();
            LinkedList linkedList26 = new LinkedList();
            LinkedList linkedList27 = new LinkedList();
            LinkedList linkedList28 = new LinkedList();
            LinkedList linkedList29 = new LinkedList();
            HashSet hashSet6 = new HashSet();
            HashSet hashSet7 = new HashSet();
            LinkedList linkedList30 = new LinkedList();
            ArrayList arrayList8 = new ArrayList(linkedList21);
            int size3 = arrayList8.size();
            num = null;
            num2 = null;
            for (int i7 = 0; i7 < size3; i7++) {
                Integer num5 = (1Xg) arrayList8.get(i7);
                if (AnonymousClass3VP.A00(num5)) {
                    hashSet6.add(Integer.valueOf(i7));
                    linkedList3 = linkedList28;
                } else if (AnonymousClass3VP.A04(num5)) {
                    if (num2 == null) {
                        num2 = num5;
                    }
                    if (A01(num5, r15, r14, z) || A02(num5, r14)) {
                        linkedList3 = linkedList25;
                    } else {
                        linkedList3 = linkedList24;
                    }
                } else {
                    0qQ.A0B(num5, 0);
                    if (AnonymousClass3VO.A08(1Xi.A02(num5.A05))) {
                        if (num2 == null) {
                            num2 = num5;
                        }
                        if (A01(num5, r15, r14, z) || A02(num5, r14)) {
                            linkedList3 = linkedList27;
                        } else {
                            linkedList3 = linkedList26;
                        }
                    } else if (num5.A06 == 1UQ.A0F || num5.A06 == 1UQ.A0O) {
                        linkedList3 = linkedList30;
                    } else {
                        hashSet7.add(Integer.valueOf(i7));
                        linkedList3 = linkedList29;
                    }
                }
                linkedList3.add(num5);
            }
            if (z) {
                Collections.shuffle(linkedList25);
                Collections.shuffle(linkedList27);
            }
            arrayList = new ArrayList();
            int size4 = i2 + linkedList30.size();
            for (int i8 = 0; i8 < size4; i8++) {
                if (hashSet6.contains(Integer.valueOf(i8)) || hashSet7.contains(Integer.valueOf(i8))) {
                    if (hashSet6.contains(Integer.valueOf(i8)) && (!linkedList28.isEmpty())) {
                        poll5 = linkedList28.poll();
                    } else if (hashSet7.contains(Integer.valueOf(i8)) && (!linkedList29.isEmpty())) {
                        poll5 = linkedList29.poll();
                    }
                    if (poll5 != null) {
                        arrayList.add(poll5);
                    }
                } else {
                    if (!linkedList24.isEmpty()) {
                        poll6 = linkedList24.poll();
                    } else if (!linkedList22.isEmpty()) {
                        poll6 = linkedList22.poll();
                    } else if (!linkedList25.isEmpty()) {
                        poll6 = linkedList25.poll();
                    } else if (!linkedList30.isEmpty()) {
                        poll6 = linkedList30.poll();
                    } else if (!linkedList26.isEmpty()) {
                        poll6 = linkedList26.poll();
                    } else if (!linkedList23.isEmpty()) {
                        poll6 = linkedList23.poll();
                    } else if (!linkedList27.isEmpty()) {
                        poll6 = linkedList27.poll();
                    }
                    1Xg r62 = (1Xg) poll6;
                    if (r62 != null) {
                        arrayList.add(r62);
                        if (num == null && (AnonymousClass3VP.A04(r62) || AnonymousClass3VO.A08(1Xi.A02(r62.A05)))) {
                            num = r62;
                        }
                    }
                }
            }
        } else {
            LinkedList linkedList31 = new LinkedList(r29.A00());
            ArrayList arrayList9 = new ArrayList();
            for (Object next5 : list2) {
                if (((1Xg) next5).A06 == 1UQ.A0Y) {
                    arrayList9.add(next5);
                }
            }
            LinkedList linkedList32 = new LinkedList(00k.A0a(arrayList9));
            linkedList32.removeAll(linkedList31);
            ArrayList arrayList10 = new ArrayList();
            for (Object next6 : list2) {
                if (AnonymousClass3VP.A02((1Xg) next6)) {
                    arrayList10.add(next6);
                }
            }
            LinkedList linkedList33 = new LinkedList(00k.A0a(arrayList10));
            linkedList33.removeAll(linkedList31);
            ArrayList arrayList11 = new ArrayList();
            for (Object next7 : list2) {
                if (((1Xg) next7).A06 == 1UQ.A0H) {
                    arrayList11.add(next7);
                }
            }
            LinkedList linkedList34 = new LinkedList(00k.A0a(arrayList11));
            linkedList34.removeAll(linkedList31);
            LinkedList linkedList35 = new LinkedList();
            LinkedList linkedList36 = new LinkedList();
            LinkedList linkedList37 = new LinkedList();
            LinkedList linkedList38 = new LinkedList();
            LinkedList linkedList39 = new LinkedList();
            LinkedList linkedList40 = new LinkedList();
            LinkedList linkedList41 = new LinkedList();
            LinkedList linkedList42 = new LinkedList();
            HashSet hashSet8 = new HashSet();
            HashSet hashSet9 = new HashSet();
            LinkedList linkedList43 = new LinkedList();
            AbstractCollection hashSet10 = new HashSet();
            ArrayList arrayList12 = new ArrayList(linkedList31);
            int size5 = arrayList12.size();
            num = null;
            num2 = null;
            for (int i9 = 0; i9 < size5; i9++) {
                Integer num6 = (1Xg) arrayList12.get(i9);
                if (AnonymousClass3VP.A00(num6)) {
                    hashSet8.add(Integer.valueOf(i9));
                    linkedList4 = linkedList41;
                } else if (AnonymousClass3VP.A04(num6)) {
                    if (num2 == null) {
                        num2 = num6;
                    }
                    if (A01(num6, r15, r14, z) || A02(num6, r14)) {
                        linkedList4 = linkedList36;
                    } else {
                        linkedList4 = linkedList35;
                    }
                } else if (AnonymousClass3VP.A02(num6)) {
                    if (A01(num6, r15, r14, z)) {
                        linkedList5 = linkedList38;
                    } else {
                        linkedList5 = linkedList37;
                    }
                    linkedList5.add(num6);
                    num6 = Integer.valueOf(i9);
                    linkedList4 = hashSet10;
                } else {
                    0qQ.A0B(num6, 0);
                    if (AnonymousClass3VO.A08(1Xi.A02(num6.A05))) {
                        if (num2 == null) {
                            num2 = num6;
                        }
                        if (A01(num6, r15, r14, z) || A02(num6, r14)) {
                            linkedList4 = linkedList40;
                        } else {
                            linkedList4 = linkedList39;
                        }
                    } else if (num6.A06 == 1UQ.A0F || num6.A06 == 1UQ.A0O) {
                        linkedList4 = linkedList43;
                    } else {
                        hashSet9.add(Integer.valueOf(i9));
                        linkedList4 = linkedList42;
                    }
                }
                linkedList4.add(num6);
            }
            linkedList37.addAll(linkedList33);
            if (z) {
                Collections.shuffle(linkedList36);
                Collections.shuffle(linkedList40);
            }
            int A013 = (int) 182.A01(r6, userSession2, 36609991993595853L);
            int A014 = (int) 182.A01(r6, userSession2, 36609991993530316L);
            arrayList = new ArrayList();
            int size6 = i2 + linkedList43.size();
            for (int i10 = 0; i10 < size6; i10++) {
                if (!hashSet8.contains(Integer.valueOf(i10)) && !hashSet9.contains(Integer.valueOf(i10))) {
                    if (!hashSet10.contains(Integer.valueOf(i10)) || !(!linkedList37.isEmpty())) {
                        if (!linkedList35.isEmpty()) {
                            poll8 = linkedList35.poll();
                        } else if ((!linkedList37.isEmpty()) && A03(arrayList, A013, A014)) {
                            poll8 = linkedList37.poll();
                        } else if (!linkedList32.isEmpty()) {
                            poll8 = linkedList32.poll();
                        } else if ((!linkedList38.isEmpty()) && A03(arrayList, A013, A014)) {
                            poll8 = linkedList38.poll();
                        } else if (!linkedList36.isEmpty()) {
                            poll8 = linkedList36.poll();
                        } else if (!linkedList43.isEmpty()) {
                            poll8 = linkedList43.poll();
                        } else if (!linkedList39.isEmpty()) {
                            poll8 = linkedList39.poll();
                        } else if (!linkedList34.isEmpty()) {
                            poll8 = linkedList34.poll();
                        } else if (!linkedList40.isEmpty()) {
                            poll8 = linkedList40.poll();
                        }
                        1Xg r10 = (1Xg) poll8;
                        if (r10 != null) {
                            arrayList.add(r10);
                            if (num == null && (AnonymousClass3VP.A04(r10) || AnonymousClass3VO.A08(1Xi.A02(r10.A05)))) {
                                num = r10;
                            }
                        }
                    } else {
                        poll7 = linkedList37.poll();
                    }
                } else if (!hashSet8.contains(Integer.valueOf(i10)) || !(!linkedList41.isEmpty())) {
                    if (hashSet9.contains(Integer.valueOf(i10)) && (!linkedList42.isEmpty())) {
                        poll7 = linkedList42.poll();
                    }
                } else {
                    poll7 = linkedList41.poll();
                }
                if (poll7 != null) {
                    arrayList.add(poll7);
                }
            }
        }
        boolean z2 = false;
        if (num2 != num) {
            z2 = true;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        1XM r0 = r29;
        r0.A0C = valueOf;
        r0.A01(arrayList);
    }

    public static final boolean A02(1Xg r3, 1Ua r4) {
        String BOq;
        AnonymousClass1Xn r32 = r3.A05;
        1Xj A02 = 1Xi.A02(r32);
        if (A02 == null || !A02.A5D()) {
            return false;
        }
        1Xj A022 = 1Xi.A02(r32);
        String str = null;
        if (A022 == null || (BOq = A022.A0C.BOq()) == null || BOq.length() == 0) {
            return false;
        }
        1Xj A023 = 1Xi.A02(r32);
        if (A023 != null && A023.A5z()) {
            return true;
        }
        1Xj A024 = 1Xi.A02(r32);
        if (A024 != null) {
            str = A024.A0C.BOq();
        }
        if (r4.A03(str)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(List list, int i, int i2) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                1UQ r1 = ((1Xg) it.next()).A06;
                if (r1 != 1UQ.A0F) {
                    if (r1 == 1UQ.A0O) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (list.size() >= i2) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (AnonymousClass3VP.A02((1Xg) listIterator.previous())) {
                    int nextIndex = listIterator.nextIndex();
                    if (nextIndex == -1 || (list.size() - nextIndex) - 1 >= i) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
