package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2pp  reason: invalid class name and case insensitive filesystem */
public final class C230562pp extends C252233om {
    public final C232872ua A00;
    public final AnonymousClass57G A01;
    public final C232872ua A02;

    public final void A00(0jB r9, 1Nv r10, int i, int i2, boolean z) {
        C232872ua r0 = this.A00;
        1Nv r3 = r10;
        if (r0 != null && z) {
            r0.A05(r9, r10, i, i2);
        }
        AnonymousClass57G r2 = this.A01;
        if (r2 != null) {
            String A002 = AnonymousClass57G.A00(r2, r10);
            long currentTimeMillis = System.currentTimeMillis();
            if (AnonymousClass3WX.A02(r10, r2.A00)) {
                r2.A03.put(A002, new C305776Jm(r3, "feed_unit", currentTimeMillis, false));
            }
        }
        C232872ua r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if ((r10 instanceof 1Xj) || (r10 instanceof C255773uh) || (r10 instanceof C267324bN)) {
            r1.A05(r9, r10, i, i2);
        }
    }

    public final void A01(C254193s5 r13, 1Nv r14, int i) {
        C232872ua r1 = this.A00;
        if (r1 != null) {
            1Nv r5 = r14;
            String A012 = C232872ua.A01(r1, r14);
            1Bk A002 = C232872ua.A00(r1, r14);
            if (A012 != null && A002 != null) {
                r1.A04.put(A012, new C309376Ya(r5, Long.valueOf(System.currentTimeMillis()), (Long) null, i, -1, r13.A00));
            }
        }
    }

    public final void A02(1Nv r4, int i) {
        C232872ua r0 = this.A00;
        if (r0 != null) {
            r0.A06(r4, i);
        }
        AnonymousClass57G r2 = this.A01;
        if (r2 != null) {
            String A002 = AnonymousClass57G.A00(r2, r4);
            if (AnonymousClass3WX.A02(r4, r2.A00) && r2.A03.remove(A002) != null) {
                System.currentTimeMillis();
            }
        }
    }

    public final void A03(1Nv r18, int i) {
        C232872ua r11 = this.A00;
        if (r11 != null) {
            1Nv r3 = r18;
            String A012 = C232872ua.A01(r11, r3);
            1Bk A002 = C232872ua.A00(r11, r3);
            if (A012 != null && A002 != null) {
                C309376Ya r2 = (C309376Ya) r11.A04.remove(A012);
                if (r2 == null) {
                    0KC.A0O("ImpressionTracker", "Viewable info missing for media with key %s", new Object[]{A012});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C309376Ya r22 = new C309376Ya(r3, r2.A05, Long.valueOf(currentTimeMillis), r2.A01, r2.A00, r2.A02);
                r11.A05.put(A012, r22);
                C232872ua.A04(A002, r11, r22, r3, r11.A03, A012, i);
            }
        }
    }

    public final void onDestroy() {
        AnonymousClass57G r1 = this.A01;
        if (r1 != null) {
            r1.A03.clear();
            r1.A02.clear();
            r1.A01.clear();
        }
        C232872ua r12 = this.A00;
        if (r12 != null) {
            r12.A04.clear();
            r12.A05.clear();
        }
    }

    public final void onPause() {
        AnonymousClass57G r9 = this.A01;
        if (r9 != null) {
            Map map = r9.A03;
            HashMap hashMap = new HashMap(map);
            Map map2 = r9.A01;
            HashMap hashMap2 = new HashMap(map2);
            Map map3 = r9.A02;
            HashMap hashMap3 = new HashMap(map3);
            for (C305776Jm r0 : hashMap.values()) {
                1Nv r2 = r0.A01;
                String A002 = AnonymousClass57G.A00(r9, r2);
                if (AnonymousClass3WX.A02(r2, r9.A00) && map.remove(A002) != null) {
                    System.currentTimeMillis();
                }
            }
            for (C305776Jm r02 : hashMap2.values()) {
                r9.A02(r02.A01, r02.A02);
            }
            for (C305776Jm r03 : hashMap3.values()) {
                1Nv r22 = r03.A01;
                String A012 = AnonymousClass57G.A01(r9, r22, r03.A02);
                if (AnonymousClass3WX.A02(r22, r9.A00) && map3.remove(A012) != null) {
                    System.currentTimeMillis();
                }
            }
            map.clear();
            map.putAll(hashMap);
            map2.clear();
            map2.putAll(hashMap2);
            map3.clear();
            map3.putAll(hashMap3);
        }
        C232872ua r14 = this.A00;
        if (r14 != null) {
            for (Map.Entry entry : r14.A04.entrySet()) {
                C309376Ya r3 = (C309376Ya) entry.getValue();
                String str = (String) entry.getKey();
                1Nv r6 = r3.A03;
                1Bk A003 = C232872ua.A00(r14, r6);
                Long l = r3.A05;
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                long j = r3.A02;
                int i = r3.A01;
                int i2 = r3.A00;
                C309376Ya r5 = new C309376Ya(r6, l, valueOf, i, i2, j);
                r14.A05.put(str, r5);
                C232872ua.A04(A003, r14, r5, r6, r14.A03, str, i2);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Map map4 = r14.A05;
            for (C309376Ya r04 : map4.values()) {
                1Nv r1 = r04.A03;
                arrayList.add(r1);
                arrayList2.add(Integer.valueOf(r04.A00));
                hashSet.add(r1.getId());
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                1Xj r23 = (1Nv) arrayList.get(i3);
                int intValue = ((Number) arrayList2.get(i3)).intValue();
                r14.A06(r23, intValue);
                if (r23 instanceof 1Xj) {
                    1Xj r24 = r23;
                    if (r24.A5D() && intValue != -1) {
                        r14.A07(r24, r24.A1c(intValue), intValue);
                    }
                }
            }
            map4.clear();
            C229252n5 r12 = r14.A00;
            if (r12 != null) {
                r12.A01.A09();
                r12.A00.A09();
            }
        }
    }

    public final void onResume() {
        AnonymousClass57G r2 = this.A01;
        if (r2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            Map map = r2.A03;
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                C305776Jm r0 = (C305776Jm) entry.getValue();
                hashMap.put(key, new C305776Jm(r0.A01, r0.A02, currentTimeMillis, r0.A03));
            }
            map.clear();
            map.putAll(hashMap);
            HashMap hashMap2 = new HashMap();
            Map map2 = r2.A02;
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key2 = entry2.getKey();
                C305776Jm r02 = (C305776Jm) entry2.getValue();
                hashMap2.put(key2, new C305776Jm(r02.A01, r02.A02, currentTimeMillis, r02.A03));
            }
            map2.clear();
            map2.putAll(hashMap2);
            HashMap hashMap3 = new HashMap();
            Map map3 = r2.A01;
            for (Map.Entry entry3 : map3.entrySet()) {
                Object key3 = entry3.getKey();
                C305776Jm r03 = (C305776Jm) entry3.getValue();
                hashMap3.put(key3, new C305776Jm(r03.A01, r03.A02, currentTimeMillis, r03.A03));
            }
            map3.clear();
            map3.putAll(hashMap3);
        }
        C232872ua r04 = this.A00;
        if (r04 != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            HashMap hashMap4 = new HashMap();
            Map map4 = r04.A04;
            for (Map.Entry entry4 : map4.entrySet()) {
                Object key4 = entry4.getKey();
                C309376Ya r05 = (C309376Ya) entry4.getValue();
                hashMap4.put(key4, new C309376Ya(r05.A03, Long.valueOf(currentTimeMillis2), (Long) null, r05.A01, r05.A00, r05.A02));
            }
            map4.clear();
            map4.putAll(hashMap4);
        }
    }

    public C230562pp(UserSession userSession, C232842uX r4, AnonymousClass4DU r5, boolean z) {
        if (z) {
            this.A00 = null;
        } else {
            this.A00 = new C232872ua(userSession, (C232892uc) null, r4, r5);
        }
        this.A01 = null;
        this.A02 = null;
    }

    public C230562pp(C232872ua r1, C232872ua r2, AnonymousClass57G r3) {
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r2;
    }

    public C230562pp(C230552po r3) {
        this.A00 = null;
        this.A02 = r3.AXB();
        this.A01 = null;
    }
}
