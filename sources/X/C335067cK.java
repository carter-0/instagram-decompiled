package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7cK  reason: invalid class name and case insensitive filesystem */
public abstract class C335067cK {
    public static final C335907dj A01(C333867aH r3, String str, String str2) {
        Object obj;
        Object obj2;
        C376459Ib r1;
        List list;
        0qQ.A0B(r3, 0);
        0qQ.A0B(str, 1);
        Object obj3 = null;
        Iterator it = r3.A06.iterator();
        if (str2 != null) {
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((C335907dj) ((AnonymousClass9IV) obj2).A01).A0K, str2)) {
                    break;
                }
            }
            AnonymousClass9IV r2 = (AnonymousClass9IV) obj2;
            if (r2 != null && (r1 = (C376459Ib) r2.A00) != null && (list = (List) r1.A01) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (0qQ.A0K(((C335907dj) next).A0K, str)) {
                        obj3 = next;
                        break;
                    }
                }
            } else {
                return null;
            }
        } else {
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C335907dj) ((AnonymousClass9IV) obj).A01).A0K, str)) {
                    break;
                }
            }
            AnonymousClass9IV r22 = (AnonymousClass9IV) obj;
            if (r22 == null) {
                return null;
            }
            obj3 = r22.A01;
        }
        return (C335907dj) obj3;
    }

    public static final C335907dj A02(C333867aH r3, String str, String str2) {
        Object obj;
        Object obj2;
        C376459Ib r1;
        List list;
        0qQ.A0B(r3, 0);
        0qQ.A0B(str, 1);
        Object obj3 = null;
        if (str2 != null) {
            Iterator it = r3.A06.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((C335907dj) ((AnonymousClass9IV) obj2).A01).A0K, str2)) {
                    break;
                }
            }
            AnonymousClass9IV r2 = (AnonymousClass9IV) obj2;
            if (r2 != null && (r1 = (C376459Ib) r2.A00) != null && (list = (List) r1.A02) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (0qQ.A0K(((C335907dj) next).A0K, str)) {
                        obj3 = next;
                        break;
                    }
                }
            } else {
                return null;
            }
        } else {
            Iterator it3 = r3.A07.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (0qQ.A0K(((C335907dj) ((AnonymousClass9IV) obj).A01).A0K, str)) {
                    break;
                }
            }
            AnonymousClass9IV r22 = (AnonymousClass9IV) obj;
            if (r22 == null) {
                return null;
            }
            obj3 = r22.A01;
        }
        return (C335907dj) obj3;
    }

    public static final C333867aH A04(C333867aH r35, C335927dl r36, boolean z) {
        Collection collection;
        C335927dl r2 = r36;
        0qQ.A0B(r2, 1);
        AnonymousClass9IV r0 = r2.A00;
        boolean z2 = false;
        if (r0 != null) {
            z2 = true;
        }
        C333867aH r8 = r35;
        if (!z || r0 == null) {
            collection = r8.A06;
        } else {
            collection = 00k.A0S(r8.A06, 0sr.A1M(new AnonymousClass9IV[]{r0}));
        }
        ArrayList A0S = 00k.A0S(r2.A05, collection);
        C333817aC r11 = r8.A03;
        String str = r2.A04;
        if (str == null) {
            str = r11.A01;
        }
        boolean z3 = r2.A08;
        C333807aB r02 = r11.A00;
        Integer num = r2.A03;
        C333797aA r6 = r2.A02;
        boolean z4 = false;
        String str2 = r02.A04;
        String str3 = r02.A05;
        boolean z5 = r02.A07;
        int i = r02.A01;
        int i2 = r02.A00;
        boolean z6 = r02.A06;
        boolean z7 = r02.A08;
        boolean z8 = r02.A09;
        0qQ.A0B(str2, 0);
        0qQ.A0B(num, 2);
        0qQ.A0B(r6, 3);
        String str4 = str3;
        int i3 = i;
        Integer num2 = num;
        String str5 = str2;
        C333797aA r18 = r6;
        C333817aC r182 = new C333817aC(new C333807aB(r18, num2, str5, str4, i3, i2, z5, z6, z7, z8), str, z3, r11.A04, r11.A05);
        if (r8.A08 || z2) {
            z4 = true;
        }
        return C333867aH.A00((C61081JwJ) null, (C333847aF) null, r182, r8, A0S, (List) null, 0, 4090, false, z4);
    }

    public static final C333867aH A05(C333867aH r13, Integer num) {
        0qQ.A0B(num, 1);
        C333817aC r0 = r13.A03;
        C333807aB r1 = r0.A00;
        String str = r1.A04;
        String str2 = r1.A05;
        C333797aA r3 = r1.A02;
        boolean z = r1.A07;
        int i = r1.A01;
        int i2 = r1.A00;
        boolean z2 = r1.A06;
        boolean z3 = r1.A08;
        boolean z4 = r1.A09;
        0qQ.A0B(str, 0);
        0qQ.A0B(r3, 3);
        return C333867aH.A00((C61081JwJ) null, (C333847aF) null, new C333817aC(new C333807aB(r3, num, str, str2, i, i2, z, z2, z3, z4), r0.A01, r0.A03, r0.A04, r0.A05), r13, (List) null, (List) null, 0, 8187, false, false);
    }

    public static final C333867aH A06(C333867aH r2, String str, String str2, 0sP r5) {
        0qQ.A0B(str, 1);
        if (str2 != null) {
            return A08(r2, str2, new C377619Mn(str, r5, 0));
        }
        return A08(r2, str, new C377189Kw(r5, 49));
    }

    public static final C333867aH A07(C333867aH r7, String str, String str2, 0sP r10) {
        0qQ.A0B(str, 1);
        C333867aH r4 = r7;
        if (str2 != null) {
            return A08(r7, str2, new C73943PmN(str, r10, 26));
        }
        AnonymousClass9LG r3 = new AnonymousClass9LG(r10, 0);
        List<AnonymousClass9IV> list = r4.A07;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AnonymousClass9IV r1 : list) {
            arrayList.add(0qQ.A0K(((C335907dj) r1.A01).A0K, str) ? r3.invoke(r1) : r1);
        }
        return C333867aH.A00((C61081JwJ) null, (C333847aF) null, (C333817aC) null, r4, (List) null, arrayList, 0, 8189, false, false);
    }

    public static final C333867aH A08(C333867aH r7, String str, 0sP r9) {
        C333867aH r3 = r7;
        List<AnonymousClass9IV> list = r7.A06;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AnonymousClass9IV r1 : list) {
            arrayList.add(0qQ.A0K(((C335907dj) r1.A01).A0K, str) ? r9.invoke(r1) : r1);
        }
        return C333867aH.A00((C61081JwJ) null, (C333847aF) null, (C333817aC) null, r3, arrayList, (List) null, 0, 8190, false, false);
    }

    public static final C333867aH A09(C333867aH r7, Set set, Set set2) {
        0qQ.A0B(set, 1);
        0qQ.A0B(set2, 2);
        return C333867aH.A00((C61081JwJ) null, (C333847aF) null, (C333817aC) null, r7, A0B(r7.A06, set, set2), A0B(r7.A07, set, set2), 0, 8188, false, false);
    }

    public static final C61084JwM A00(List list) {
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C335907dj) it.next()).A0K);
        }
        Set A0k = 00k.A0k(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((C335907dj) it2.next()).A0N;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Set A0k2 = 00k.A0k(arrayList2);
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C335907dj) it3.next()).A0C);
        }
        return new C61084JwM(A0k, A0k2, 00k.A0k(arrayList3));
    }

    public static final C333867aH A03(C337197fs r57, C333867aH r58, UserSession userSession, AnonymousClass571 r60, AnonymousClass572 r61, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3) {
        String str5;
        User CCd;
        String str6 = str;
        0qQ.A0B(str6, 2);
        String str7 = str2;
        0qQ.A0B(str7, 3);
        String str8 = str4;
        0qQ.A0B(str8, 8);
        UserSession userSession2 = userSession;
        1Xj A02 = 1E7.A00(userSession2).A02(str8);
        boolean z4 = false;
        String str9 = str3;
        if (str3 != null) {
            z4 = true;
        }
        User A01 = AnonymousClass0t1.A01.A01(userSession2);
        C335847dd r8 = new C335847dd((ImageUrl) null, (1iA) null, (User) null, (String) null, (String) null, false);
        C335857de r15 = C335857de.A04;
        C335867df r10 = C335867df.APPROVED;
        C338057hL r14 = new C338057hL();
        C333897aK r16 = C333897aK.SHOW_ORIGINAL;
        if (A02 == null || (CCd = A02.A0C.CCd()) == null) {
            str5 = null;
        } else {
            str5 = CCd.getId();
        }
        Integer num = AnonymousClass05K.A01;
        C335897di r11 = (C335897di) C335897di.A01.get(Integer.valueOf((int) 182.A01(0Tu.A05, userSession2, 36606160882636130L)));
        if (r11 == null) {
            r11 = C335897di.PRODUCTION;
        }
        String str10 = str6;
        String str11 = str9;
        String str12 = str7;
        String str13 = str8;
        C335907dj r9 = new C335907dj(r10, r11, (C337227fv) null, r57, r14, r15, r16, r8, r60, (1bK) null, r61, (C337207ft) null, A01, (C337217fu) null, (Boolean) null, (Boolean) null, (Integer) null, num, (Long) null, str10, str11, str12, (String) null, str13, str5, list, (List) null, z4, false, false, false, false, false, z, false, false, false, false, false, false, false, false, false, z3, false, false, false, z2);
        C333867aH r3 = r58;
        if (str3 != null) {
            List<AnonymousClass9IV> list2 = r3.A06;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (AnonymousClass9IV r7 : list2) {
                if (0qQ.A0K(((C335907dj) r7.A01).A0K, str9)) {
                    C376459Ib r6 = (C376459Ib) r7.A00;
                    List singletonList = Collections.singletonList(r9);
                    0qQ.A07(singletonList);
                    ArrayList A0S = 00k.A0S(singletonList, (Collection) r6.A02);
                    r7 = AnonymousClass9IV.A00(C376459Ib.A00((C335917dk) r6.A00, (List) r6.A01, A0S), (C335907dj) r7.A01);
                }
                arrayList.add(r7);
            }
            return C333867aH.A00(new C61081JwJ(r9.A0K), (C333847aF) null, (C333817aC) null, r3, arrayList, (List) null, 0, 8158, false, false);
        }
        0sn r2 = 0sn.A00;
        Integer num2 = AnonymousClass05K.A00;
        List singletonList2 = Collections.singletonList(new AnonymousClass9IV(new C376459Ib(new C335917dk(num2, num2, (String) null, (String) null, 0, 0, false, false, false), (List) r2, (List) r2), r9));
        0qQ.A07(singletonList2);
        return C333867aH.A00(new C61081JwJ(r9.A0K), (C333847aF) null, (C333817aC) null, r3, (List) null, 00k.A0S(r3.A07, singletonList2), 0, 8157, false, false);
    }

    public static final ArrayList A0A(C333867aH r5, 0sP r6) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass9IV r2 : r5.A06) {
            Object obj = r2.A01;
            if (((Boolean) r6.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (List) ((C376459Ib) r2.A00).A01) {
                if (((Boolean) r6.invoke(next)).booleanValue()) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final List A0B(List list, Set set, Set set2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9IV r5 = (AnonymousClass9IV) it.next();
            String str = ((C335907dj) r5.A01).A0K;
            if (!set.contains(str)) {
                if (set2.contains(str)) {
                    C376459Ib r7 = (C376459Ib) r5.A00;
                    ArrayList arrayList2 = new ArrayList();
                    for (C335907dj r1 : (List) r7.A01) {
                        if (!set.contains(r1.A0K)) {
                            arrayList2.add(r1);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (C335907dj r12 : (List) r7.A02) {
                        if (!set.contains(r12.A0K)) {
                            arrayList3.add(r12);
                        }
                    }
                    r5 = AnonymousClass9IV.A00(C376459Ib.A00((C335917dk) r7.A00, arrayList2, arrayList3), (C335907dj) r5.A01);
                }
                arrayList.add(r5);
            }
        }
        return arrayList;
    }
}
