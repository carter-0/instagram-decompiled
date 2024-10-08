package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2wN  reason: invalid class name and case insensitive filesystem */
public abstract class C233742wN implements AnonymousClass2wO {
    public UserSession A00;
    public 1PJ A01;
    public Boolean A02 = false;
    public final C228812mN A03;
    public final C233402vf A04;
    public final C233752wP A05;
    public final AnonymousClass2vH A06;
    public final C249863kU A07;
    public final 0wc A08;

    public void A07(List list, List list2, int i) {
    }

    private C58043Ikb A00(Map map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            C271754jX Bz6 = ((C271744jW) entry.getValue()).Bz6();
            C271754jX r1 = C271754jX.INSERTED_SUCCESSFULLY;
            C271744jW r0 = (C271744jW) entry.getValue();
            if (Bz6 == r1) {
                arrayList.add(A01(r0));
            } else if (r0.Bz6() == C271754jX.SEEN) {
                arrayList2.add(A01((C271744jW) entry.getValue()));
            }
        }
        return new C58043Ikb(this, arrayList2, arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[Catch:{ IOException -> 0x0078 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C271744jW r5) {
        /*
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ IOException -> 0x0078 }
            r4.<init>()     // Catch:{ IOException -> 0x0078 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x0078 }
            X.17W r3 = r0.A0A(r4)     // Catch:{ IOException -> 0x0078 }
            r3.A0c()     // Catch:{ IOException -> 0x0078 }
            java.lang.String r1 = "id"
            java.lang.String r0 = r5.getId()     // Catch:{ IOException -> 0x0078 }
            r3.A0R(r1, r0)     // Catch:{ IOException -> 0x0078 }
            java.lang.String r1 = "insertion_index"
            int r0 = r5.BHd()     // Catch:{ IOException -> 0x0078 }
            r3.A0P(r1, r0)     // Catch:{ IOException -> 0x0078 }
            X.4jX r1 = r5.Bz6()     // Catch:{ IOException -> 0x0078 }
            X.4jX r0 = X.C271754jX.SEEN     // Catch:{ IOException -> 0x0078 }
            java.lang.String r2 = "timestamp"
            if (r1 != r0) goto L_0x002b
            goto L_0x0047
        L_0x002b:
            X.4jX r0 = X.C271754jX.INSERTED_SUCCESSFULLY     // Catch:{ IOException -> 0x0078 }
            if (r1 != r0) goto L_0x0055
            r1 = r5
            X.4jV r1 = (X.C271734jV) r1     // Catch:{ IOException -> 0x0078 }
            boolean r0 = r1 instanceof X.C271834jf     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x003b
            X.4jf r1 = (X.C271834jf) r1     // Catch:{ IOException -> 0x0078 }
            long r0 = r1.A01     // Catch:{ IOException -> 0x0078 }
            goto L_0x0052
        L_0x003b:
            boolean r0 = r1 instanceof X.C271824je     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x0044
            X.4je r1 = (X.C271824je) r1     // Catch:{ IOException -> 0x0078 }
            long r0 = r1.A01     // Catch:{ IOException -> 0x0078 }
            goto L_0x0052
        L_0x0044:
            long r0 = r1.A00     // Catch:{ IOException -> 0x0078 }
            goto L_0x0052
        L_0x0047:
            r1 = r5
            X.4jV r1 = (X.C271734jV) r1     // Catch:{ IOException -> 0x0078 }
            boolean r0 = r1 instanceof X.C271834jf     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x006c
            X.4jf r1 = (X.C271834jf) r1     // Catch:{ IOException -> 0x0078 }
            long r0 = r1.A02     // Catch:{ IOException -> 0x0078 }
        L_0x0052:
            r3.A0Q(r2, r0)     // Catch:{ IOException -> 0x0078 }
        L_0x0055:
            java.lang.Integer r0 = r5.AwI()     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = "delivery_context"
            java.lang.String r0 = X.AnonymousClass93b.A00(r0)     // Catch:{ IOException -> 0x0078 }
            r3.A0R(r1, r0)     // Catch:{ IOException -> 0x0078 }
        L_0x0064:
            r3.close()     // Catch:{ IOException -> 0x0078 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0078 }
            return r0
        L_0x006c:
            boolean r0 = r1 instanceof X.C271824je     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x0075
            X.4je r1 = (X.C271824je) r1     // Catch:{ IOException -> 0x0078 }
            long r0 = r1.A02     // Catch:{ IOException -> 0x0078 }
            goto L_0x0052
        L_0x0075:
            long r0 = r1.A01     // Catch:{ IOException -> 0x0078 }
            goto L_0x0052
        L_0x0078:
            r3 = move-exception
            java.lang.Class<X.2wN> r2 = X.C233742wN.class
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "Failed to convert ad info to json"
            X.0KC.A07(r2, r0, r3, r1)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233742wN.A01(X.4jW):java.lang.String");
    }

    private void A02(String str, LinkedHashMap linkedHashMap, List list, Map map) {
        List list2;
        String str2;
        Map map2;
        C58043Ikb ikb;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        boolean z = !linkedHashMap2.isEmpty();
        HashSet hashSet = new HashSet();
        if (z) {
            hashSet.add(0);
        }
        int i = 1;
        while (true) {
            list2 = list;
            str2 = str;
            map2 = map;
            if (i >= list2.size()) {
                break;
            }
            if (E4e(str2, Collections.singletonList(list2.get(i)), map2, false).A00.size() > 0) {
                hashSet.add(Integer.valueOf(i));
                z = true;
            }
            i++;
        }
        if (z) {
            for (int i2 = 1; i2 < list2.size(); i2++) {
                if (!hashSet.contains(Integer.valueOf(i2))) {
                    Object obj = list2.get(i2);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("invalid_ad_in_multi_ad", new ArrayList());
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    1PW r5 = new 1PW(AnonymousClass05K.A00);
                    0qQ.A0B(str2, 0);
                    r5.A0E = str2;
                    ArrayList arrayList3 = new ArrayList(linkedHashMap3.keySet());
                    String str3 = (String) new ArrayList(linkedHashMap3.keySet()).get(0);
                    ArrayList arrayList4 = new ArrayList();
                    for (Collection addAll : linkedHashMap3.values()) {
                        arrayList4.addAll(addAll);
                    }
                    AnonymousClass2vH r15 = this.A06;
                    String obj2 = Collections.unmodifiableList(arrayList).toString();
                    String obj3 = Collections.unmodifiableList(arrayList2).toString();
                    if (arrayList3.contains("duplicate_ad_received")) {
                        if (182.A06(0Tu.A05, this.A00, 36318595642431801L)) {
                            ikb = A00(map2);
                            r15.Cgw(r5, (Long) null, obj, str3, (String) null, obj2, obj3, arrayList4, arrayList3, ikb, map2, false);
                        }
                    }
                    ikb = null;
                    r15.Cgw(r5, (Long) null, obj, str3, (String) null, obj2, obj3, arrayList4, arrayList3, ikb, map2, false);
                }
            }
            linkedHashMap2.put("invalid_ad_in_multi_ad", new ArrayList());
        }
    }

    private void A03(boolean z) {
        if (182.A06(0Tu.A05, this.A00, 36317405936358512L)) {
            0wc r2 = this.A08;
            0Aj A002 = r2.A00(r2.A00, "on_device_auto_exclusion_targeting");
            if (A002.isSampled()) {
                A002.A7p("is_invalidated", Boolean.valueOf(z));
                A002.Cgf();
            }
        }
    }

    private boolean A04(Object obj) {
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A06;
        if ((182.A06(r2, userSession, 36313725150431444L) || 182.A06(r2, userSession, 36319480405564857L) || 182.A06(r2, userSession, 36320618571899562L) || 182.A06(r2, userSession, 36325205596975836L)) && this.A03.CYA(obj)) {
            return true;
        }
        return false;
    }

    public Iterable A05(Object obj) {
        if (this instanceof C271814jd) {
            C376509Ig r4 = (C376509Ig) obj;
            0qQ.A0B(r4, 0);
            return 00k.A0U(00k.A0X(0sr.A1M(new 1Xj[]{((C295745oq) r4.A02).A00()})));
        } else if (this instanceof AnonymousClass2wL) {
            AnonymousClass4EB r42 = (AnonymousClass4EB) obj;
            0qQ.A0B(r42, 0);
            1Xj A022 = 1Xi.A02(r42.A01.A05);
            if (A022 == null) {
                return 0sn.A00;
            }
            List singletonList = Collections.singletonList(A022);
            0qQ.A07(singletonList);
            return singletonList;
        } else {
            C250973mM r43 = (C250973mM) obj;
            0qQ.A0B(r43, 0);
            List<C255773uh> A0O = r43.A0H.A0O(((C271844jg) this).A00);
            0qQ.A07(A0O);
            ArrayList arrayList = new ArrayList(0Yv.A1E(A0O, 10));
            for (C255773uh r0 : A0O) {
                1Xj r02 = r0.A0b;
                if (r02 != null) {
                    arrayList.add(r02);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return arrayList;
        }
    }

    public final List A06(1Xj r2) {
        if (this instanceof C271844jg) {
            List A3h = r2.A3h();
            if (A3h == null) {
                return 0sn.A00;
            }
            return A3h;
        } else if (!r2.A3P().isEmpty()) {
            return r2.A3P();
        } else {
            return Collections.emptyList();
        }
    }

    public boolean A08() {
        if (this instanceof C271814jd) {
            return ((C271814jd) this).A01;
        }
        if (this instanceof AnonymousClass2wL) {
            return C228342lQ.A04(((AnonymousClass2wL) this).A00);
        }
        UserSession userSession = ((C271844jg) this).A00;
        if (!C228342lQ.A03(userSession) || !182.A06(0Tu.A05, userSession, 36312879041283423L)) {
            return false;
        }
        return true;
    }

    public boolean A09() {
        if (this instanceof C271814jd) {
            return ((C271814jd) this).A02;
        }
        if (!(this instanceof C271844jg)) {
            return C228342lQ.A06(((AnonymousClass2wL) this).A00);
        }
        UserSession userSession = ((C271844jg) this).A00;
        if (!C228342lQ.A05(userSession) || !182.A06(0Tu.A05, userSession, 36312879041283423L)) {
            return false;
        }
        return true;
    }

    public boolean A0A() {
        UserSession userSession;
        0Tu r2;
        long j;
        if (this instanceof C271844jg) {
            userSession = ((C271844jg) this).A00;
            r2 = 0Tu.A05;
            j = 36330746104857337L;
        } else if (!(this instanceof AnonymousClass2wL)) {
            return false;
        } else {
            userSession = ((AnonymousClass2wL) this).A00;
            r2 = 0Tu.A05;
            j = 36330746104791800L;
        }
        return 182.A06(r2, userSession, j);
    }

    public boolean A0B(Object obj) {
        1Xj A022;
        UserSession userSession;
        if (this instanceof C271814jd) {
            C271814jd r1 = (C271814jd) this;
            C376509Ig r5 = (C376509Ig) obj;
            0qQ.A0B(r5, 0);
            A022 = ((C295745oq) r5.A02).A00();
            if (A022 == null) {
                return false;
            }
            userSession = r1.A00;
        } else if (this instanceof AnonymousClass2wL) {
            AnonymousClass2wL r12 = (AnonymousClass2wL) this;
            AnonymousClass4EB r52 = (AnonymousClass4EB) obj;
            0qQ.A0B(r52, 0);
            A022 = 1Xi.A02(r52.A01.A05);
            if (A022 == null) {
                return false;
            }
            userSession = r12.A00;
        } else {
            C250973mM r53 = (C250973mM) obj;
            0qQ.A0B(r53, 0);
            AnonymousClass6YW A002 = AnonymousClass6YW.A00(((C271844jg) this).A00);
            return A002.A01.getBoolean(r53.A0H.getId(), false);
        }
        return 1sd.A00(userSession).A05(A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r2 == X.AnonymousClass3PG.LOCAL) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(java.lang.Object r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C271814jd
            if (r0 == 0) goto L_0x0010
            r0 = r4
            X.4jd r0 = (X.C271814jd) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x000e
            r0 = 1
            if (r6 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        L_0x0010:
            boolean r0 = r4 instanceof X.AnonymousClass2wL
            if (r0 == 0) goto L_0x0030
            r1 = r4
            X.2wL r1 = (X.AnonymousClass2wL) r1
            X.4EB r5 = (X.AnonymousClass4EB) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.common.session.UserSession r3 = r1.A00
            X.3PG r2 = r5.A02
            X.3PG r0 = X.AnonymousClass3PG.CACHED
            if (r2 == r0) goto L_0x002a
            X.3PG r1 = X.AnonymousClass3PG.LOCAL
            r0 = 0
            if (r2 != r1) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            boolean r0 = X.C233832wY.A05(r3, r6, r7, r0)
            return r0
        L_0x0030:
            r0 = r4
            X.4jg r0 = (X.C271844jg) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.C233832wY.A04(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233742wN.A0C(java.lang.Object, boolean, boolean):boolean");
    }

    public final void AWG(C54608HKr hKr, 1PW r3, Object obj) {
        if (this.A03.CcL(obj) && !A04(obj)) {
            hKr.A01(this.A06, r3, obj);
        } else if (A04(obj)) {
            hKr.A02(this.A06, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0439, code lost:
        if (r12.iterator().hasNext() != false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x055d, code lost:
        r0 = java.util.Collections.singletonList(r0);
        X.0qQ.A07(r0);
        r13.put("duplicate_ad_received", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f4, code lost:
        if (X.B7L.A01(r0) == X.AnonymousClass05K.A00) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016f, code lost:
        if (X.0qQ.A0K(r0.COo(), true) == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x022a, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0268, code lost:
        if (X.182.A06(r6, r5, r0) == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x026a, code lost:
        r7.put("low_value", new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0272, code lost:
        A03(true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x06a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C271864ji E4e(java.lang.String r39, java.util.Collection r40, java.util.Map r41, boolean r42) {
        /*
            r38 = this;
            java.util.ArrayList r18 = new java.util.ArrayList
            r1 = r40
            r0 = r18
            r0.<init>(r1)
            java.util.HashSet r17 = new java.util.HashSet
            r17.<init>()
            java.util.Iterator r16 = r18.iterator()
            java.util.ArrayList r20 = new java.util.ArrayList
            r0 = r20
            r0.<init>(r1)
            r4 = r38
            boolean r0 = r4.A08()
            if (r0 != 0) goto L_0x075e
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.A02 = r0
            r19 = 0
        L_0x002a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x075e
            java.lang.Object r2 = r16.next()
            r8 = r4
            boolean r0 = r4 instanceof X.AnonymousClass2wL
            r26 = r0
            if (r0 == 0) goto L_0x074c
            r1 = r8
            X.2wL r1 = (X.AnonymousClass2wL) r1
            X.0qQ.A0B(r2, r3)
            X.2mN r0 = r1.A03
            boolean r0 = r0.CcL(r2)
            if (r0 != 0) goto L_0x0051
            X.2mN r0 = r1.A01
            boolean r0 = r0.CYA(r2)
            if (r0 == 0) goto L_0x002a
        L_0x0051:
            com.instagram.common.session.UserSession r5 = r4.A00
            java.lang.Boolean r0 = X.AnonymousClass1P8.A00(r5)
            boolean r0 = r0.booleanValue()
            r37 = r41
            if (r0 == 0) goto L_0x00a6
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323779670715904(0x810c49002c2e00, double:3.034642755656941E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x00a6
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r37)
            X.0qQ.A0B(r0, r3)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0080:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            java.lang.Object r6 = r0.getValue()
            X.4jW r6 = (X.C271744jW) r6
            java.lang.Integer r1 = r6.BJb()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0080
            X.4jX r0 = r6.Bz6()
            r11.put(r7, r0)
            goto L_0x0080
        L_0x00a6:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r37)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x00b7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r7 = r9.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r6 = r7.getValue()
            X.4jW r6 = (X.C271744jW) r6
            java.lang.Integer r1 = r6.BJb()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00b7
            java.lang.Object r1 = r7.getKey()
            X.4jX r0 = r6.Bz6()
            r11.put(r1, r0)
            goto L_0x00b7
        L_0x00dd:
            if (r42 == 0) goto L_0x00f6
            X.2wP r0 = r4.A05
            X.0qQ.A0B(r2, r3)
            X.1PJ r0 = r0.A01
            X.3I2 r0 = r0.ATo(r2)
            if (r0 == 0) goto L_0x00f6
            java.lang.Integer r1 = X.B7L.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r36 = 1
            if (r1 != r0) goto L_0x00f8
        L_0x00f6:
            r36 = 0
        L_0x00f8:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            X.2mN r10 = r4.A03
            boolean r1 = r10.CcL(r2)
            boolean r0 = r10.CYA(r2)
            boolean r0 = r4.A0C(r2, r1, r0)
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "afs_subscribed_invalidated_from_invalidator"
            java.util.List r1 = java.util.Collections.singletonList(r0)
            java.lang.String r0 = "afs_subscribed"
            r7.put(r0, r1)
        L_0x0122:
            java.lang.Iterable r0 = r4.A05(r2)
            java.util.Iterator r31 = r0.iterator()
        L_0x012a:
            boolean r0 = r31.hasNext()
            if (r0 == 0) goto L_0x032d
            java.lang.Object r12 = r31.next()
            X.1Xj r12 = (X.1Xj) r12
            if (r12 == 0) goto L_0x012a
            if (r36 != 0) goto L_0x0291
            java.lang.String r30 = "already_installed"
            r0 = r30
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0291
            java.lang.String r9 = "app_not_installed"
            boolean r0 = r7.containsKey(r9)
            if (r0 != 0) goto L_0x0291
            boolean r0 = r4.A09()
            if (r0 != 0) goto L_0x0291
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x0171
            X.1Xy r0 = r12.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0171
            java.lang.Boolean r1 = r0.COo()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            r29 = 1
            if (r0 != 0) goto L_0x0173
        L_0x0171:
            r29 = 0
        L_0x0173:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36330746105250557(0x81129f000742fd, double:3.039048356908236E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x032a
            int r28 = r12.A0m()
            java.lang.String r27 = r12.A2p()
            r0 = 36893696058721240(0x83129f000803d8, double:3.3950601743006105E-306)
            java.lang.String r1 = X.182.A04(r6, r5, r0)
            java.lang.String r0 = ","
            java.lang.String[] r25 = r1.split(r0)
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            r0 = r25
            int r0 = r0.length
            r32 = r0
            r13 = 0
        L_0x01a2:
            r0 = r32
            if (r13 >= r0) goto L_0x01f2
            r21 = r25[r13]
            r1 = 1
            java.lang.String r14 = ":"
            r0 = r21
            java.lang.String[] r0 = r0.split(r14)     // Catch:{ NumberFormatException -> 0x01e3 }
            int r14 = r0.length     // Catch:{ NumberFormatException -> 0x01e3 }
            if (r14 != r1) goto L_0x01ca
            r0 = r0[r3]     // Catch:{ NumberFormatException -> 0x01e3 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x01e3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01e3 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01e3 }
            java.lang.String r1 = ""
        L_0x01c4:
            r0 = r22
            r0.put(r14, r1)     // Catch:{ NumberFormatException -> 0x01e3 }
            goto L_0x01ef
        L_0x01ca:
            int r15 = r0.length     // Catch:{ NumberFormatException -> 0x01e3 }
            r14 = 2
            if (r15 != r14) goto L_0x01ef
            r14 = r0[r3]     // Catch:{ NumberFormatException -> 0x01e3 }
            java.lang.String r14 = r14.trim()     // Catch:{ NumberFormatException -> 0x01e3 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x01e3 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x01e3 }
            r0 = r0[r1]     // Catch:{ NumberFormatException -> 0x01e3 }
            java.lang.String r1 = r0.trim()     // Catch:{ NumberFormatException -> 0x01e3 }
            goto L_0x01c4
        L_0x01e3:
            r15 = move-exception
            java.lang.Class<X.2wN> r14 = X.C233742wN.class
            java.lang.Object[] r1 = new java.lang.Object[]{r21}
            java.lang.String r0 = "Failed to parse ad objective and goal: %s"
            X.0KC.A07(r14, r0, r15, r1)
        L_0x01ef:
            int r13 = r13 + 1
            goto L_0x01a2
        L_0x01f2:
            java.util.Set r0 = r22.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x01fa:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x032a
            java.lang.Object r1 = r14.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r13 = r0.intValue()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0 = r28
            if (r13 != r0) goto L_0x01fa
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x022a
            r0 = r27
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01fa
        L_0x022a:
            r15 = 1
        L_0x022b:
            java.util.List r0 = r4.A06(r12)
            java.util.Iterator r14 = r0.iterator()
        L_0x0233:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0276
            java.lang.Object r1 = r14.next()
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            java.lang.String r13 = "low_value"
            if (r15 != 0) goto L_0x0313
            r0 = 1
            X.0qQ.A0B(r1, r0)
            if (r29 == 0) goto L_0x0313
            java.lang.String r0 = r1.CHl()
            if (r0 != 0) goto L_0x0251
            java.lang.String r0 = ""
        L_0x0251:
            boolean r0 = X.0lz.A03(r0)
            if (r0 != 0) goto L_0x0313
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.put(r9, r0)
            r0 = 36329668067999989(0x8111a4000040f5, double:3.038366601810069E-306)
        L_0x0264:
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x0272
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.put(r13, r0)
        L_0x0272:
            r0 = 1
            r4.A03(r0)
        L_0x0276:
            r0 = r30
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0291
            boolean r0 = r7.containsKey(r9)
            if (r0 != 0) goto L_0x0291
            java.util.List r0 = r4.A06(r12)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0291
            r4.A03(r3)
        L_0x0291:
            r13 = r4
            boolean r0 = r4 instanceof X.C271844jg
            if (r0 == 0) goto L_0x012a
            X.4jg r13 = (X.C271844jg) r13
            float r6 = r12.A0l()
            r1 = 0
            r0 = 1058180956(0x3f128f5c, float:0.5725)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b3
            r0 = 1073154621(0x3ff70a3d, float:1.93)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02b2
            r0 = 1061830001(0x3f4a3d71, float:0.79)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b3
        L_0x02b2:
            r1 = 1
        L_0x02b3:
            java.lang.String r9 = "message"
            r6 = 817903741(0x30c0387d, float:1.3985894E-9)
            if (r1 == 0) goto L_0x02d4
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "AD_INVALID_MEDIA_ASPECT_RATIO"
            X.0f9 r14 = r1.AEf(r0, r6)
            java.lang.String r1 = "invalid_media_aspect_ratio "
            com.instagram.common.session.UserSession r0 = r13.A00
            java.lang.String r0 = X.C231122qu.A07(r0, r12)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r14.ABQ(r9, r0)
            r14.report()
        L_0x02d4:
            float r1 = r12.A0l()
            r0 = 1058180956(0x3f128f5c, float:0.5725)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x012a
            java.lang.String r0 = r12.A2u()
            if (r0 == 0) goto L_0x02f7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02f7
            java.lang.String r0 = r12.A2t()
            if (r0 == 0) goto L_0x02f7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x012a
        L_0x02f7:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "AD_MISSING_RENDERING_COLOR"
            X.0f9 r1 = r1.AEf(r0, r6)
            java.lang.String r6 = "missing_rendering_color "
            com.instagram.common.session.UserSession r0 = r13.A00
            java.lang.String r0 = X.C231122qu.A07(r0, r12)
            java.lang.String r0 = X.002.A0R(r6, r0)
            r1.ABQ(r9, r0)
            r1.report()
            goto L_0x012a
        L_0x0313:
            boolean r0 = X.C270804hK.A03(r1)
            if (r0 == 0) goto L_0x0233
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r30
            r7.put(r0, r1)
            r0 = 36329668068065526(0x8111a4000140f6, double:3.038366601851515E-306)
            goto L_0x0264
        L_0x032a:
            r15 = 0
            goto L_0x022b
        L_0x032d:
            r0 = 1
            r9 = r39
            if (r36 == 0) goto L_0x03f7
            X.2wP r12 = r4.A05
            java.lang.Iterable r14 = r4.A05(r2)
            java.util.HashSet r35 = new java.util.HashSet
            r35.<init>()
            java.lang.Iterable r1 = r4.A05(r2)
            java.util.Iterator r13 = r1.iterator()
        L_0x0345:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x035e
            java.lang.Object r1 = r13.next()
            X.1Xj r1 = (X.1Xj) r1
            r1.getClass()
            java.util.List r6 = r4.A06(r1)
            r1 = r35
            r1.addAll(r6)
            goto L_0x0345
        L_0x035e:
            boolean r34 = r4.A0B(r2)
            X.2vf r1 = r4.A04
            boolean r33 = r1.CVS(r2)
            X.3kU r1 = r4.A07
            java.util.LinkedList r1 = r1.A02
            java.util.Iterator r6 = r1.iterator()
        L_0x0370:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x03f4
            java.lang.Object r1 = r6.next()
            X.3n0 r1 = (X.C251373n0) r1
            java.lang.Object r1 = r1.BTb()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0370
            r32 = 1
        L_0x0388:
            boolean r31 = r4.A09()
            X.0qQ.A0B(r2, r3)
            X.0qQ.A0B(r14, r0)
            r30 = 2
            r29 = 3
            r28 = 5
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            X.1PJ r1 = r12.A01
            X.3I2 r27 = r1.ATo(r2)
            if (r27 == 0) goto L_0x0756
            java.lang.Integer r6 = X.B7L.A01(r27)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r6 == r1) goto L_0x0567
            com.instagram.common.session.UserSession r6 = r12.A00
            java.util.Iterator r12 = r14.iterator()
        L_0x03b3:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x03f1
            java.lang.Object r1 = r12.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x03b3
            boolean r1 = X.C271854jh.A00(r6, r1)
            if (r1 == 0) goto L_0x03b3
            r25 = 1
        L_0x03c9:
            java.util.List r1 = r27.BNf()
            if (r1 == 0) goto L_0x0518
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r15 = r1.iterator()
        L_0x03d8:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x051a
            java.lang.Object r6 = r15.next()
            r1 = r6
            X.3lU r1 = (X.C250463lU) r1
            java.lang.Integer r14 = X.B7L.A00(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r14 == r1) goto L_0x03d8
            r12.add(r6)
            goto L_0x03d8
        L_0x03f1:
            r25 = 0
            goto L_0x03c9
        L_0x03f4:
            r32 = 0
            goto L_0x0388
        L_0x03f7:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r13 = r4
            boolean r1 = r4 instanceof X.C271844jg
            if (r1 == 0) goto L_0x043c
            X.4jg r13 = (X.C271844jg) r13
            r1 = r2
            X.3mM r1 = (X.C250973mM) r1
            X.0qQ.A0B(r1, r3)
            com.instagram.model.reels.Reel r12 = r1.A0H
            com.instagram.common.session.UserSession r1 = r13.A00
            java.util.List r1 = r12.A0O(r1)
            X.0qQ.A07(r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r1.iterator()
        L_0x041d:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0431
            java.lang.Object r1 = r13.next()
            X.3uh r1 = (X.C255773uh) r1
            X.3IB r1 = r1.mBrandResearchSurvey
            if (r1 == 0) goto L_0x041d
            r12.add(r1)
            goto L_0x041d
        L_0x0431:
            java.util.Iterator r1 = r12.iterator()
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L_0x043c
            goto L_0x045c
        L_0x043c:
            java.lang.Iterable r1 = r4.A05(r2)
            X.0qQ.A0B(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0447:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0515
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0447
            boolean r0 = X.C271854jh.A00(r5, r0)
            if (r0 == 0) goto L_0x0447
            r0 = 1
        L_0x045c:
            X.2vf r1 = r4.A04
            boolean r12 = r1.CVS(r2)
            java.lang.String r1 = "duplicate_ad_received"
            if (r12 == 0) goto L_0x0482
            if (r0 != 0) goto L_0x0482
            java.lang.String r13 = r10.BEZ(r2)
            boolean r12 = r11.containsKey(r13)
            if (r12 == 0) goto L_0x0511
            java.lang.Object r12 = r11.get(r13)
            X.4jX r11 = X.C271754jX.SEEN
            if (r12 != r11) goto L_0x0511
            java.lang.String r11 = "duplicate_ad_seen"
        L_0x047c:
            r6.add(r11)
            r7.put(r1, r6)
        L_0x0482:
            X.3kU r11 = r4.A07
            java.util.LinkedList r11 = r11.A02
            java.util.Iterator r12 = r11.iterator()
        L_0x048a:
            boolean r11 = r12.hasNext()
            if (r11 == 0) goto L_0x04af
            java.lang.Object r11 = r12.next()
            X.3n0 r11 = (X.C251373n0) r11
            java.lang.Object r11 = r11.BTb()
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x048a
            if (r0 != 0) goto L_0x04af
            java.lang.String r0 = "duplicate_ad_in_pool"
            r6.add(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            r7.put(r1, r0)
        L_0x04af:
            boolean r0 = r4.A0B(r2)
            if (r0 == 0) goto L_0x04bf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "INSTAGRAM_MEDIA_WAS_HIDDEN"
            r7.put(r0, r1)
        L_0x04bf:
            boolean r0 = r10.CXm(r2)
            if (r0 == 0) goto L_0x058e
            java.util.List r6 = r10.BUO(r2)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x058e
            X.1Pi r1 = r10.BXm(r2)
            X.1Pi r0 = X.1Pi.A02
            if (r1 != r0) goto L_0x04eb
            X.0Tu r10 = X.0Tu.A05
            r0 = 36327950081145676(0x81101400013b4c, double:3.037280140005624E-306)
            boolean r0 = X.182.A06(r10, r5, r0)
            if (r0 == 0) goto L_0x04eb
        L_0x04e4:
            r0 = r37
            r4.A02(r9, r7, r6, r0)
            goto L_0x058e
        L_0x04eb:
            X.0Tu r10 = X.0Tu.A05
            r0 = 36327950081276750(0x81101400033b4e, double:3.0372801400885154E-306)
            boolean r0 = X.182.A06(r10, r5, r0)
            if (r0 != 0) goto L_0x04e4
            r0 = r37
            X.4ji r0 = r4.E4e(r9, r6, r0, r3)
            java.util.Collection r0 = r0.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x058e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "invalid_ad_in_multi_ad"
            r7.put(r0, r1)
            goto L_0x058e
        L_0x0511:
            java.lang.String r11 = "duplicate_ad_inserted"
            goto L_0x047c
        L_0x0515:
            r0 = 0
            goto L_0x045c
        L_0x0518:
            X.0sn r12 = X.0sn.A00
        L_0x051a:
            java.util.Iterator r22 = r12.iterator()
        L_0x051e:
            boolean r1 = r22.hasNext()
            if (r1 == 0) goto L_0x0567
            java.lang.Object r1 = r22.next()
            X.3lU r1 = (X.C250463lU) r1
            X.3lS r6 = r1.BI2()
            if (r6 == 0) goto L_0x06f1
            java.lang.String r12 = r6.BwJ()
            java.util.Map r6 = X.C46552Dgu.A01
            java.lang.Object r6 = r6.get(r12)
            X.Dgu r6 = (X.C46552Dgu) r6
            if (r6 != 0) goto L_0x0540
            X.Dgu r6 = X.C46552Dgu.UNKNOWN
        L_0x0540:
            int r12 = r6.ordinal()
        L_0x0544:
            java.lang.String r6 = "duplicate_ad_received"
            if (r12 == r0) goto L_0x0687
            r1 = r30
            if (r12 == r1) goto L_0x0651
            r1 = r29
            if (r12 == r1) goto L_0x067c
            r1 = 4
            if (r12 == r1) goto L_0x0633
            r1 = r28
            if (r12 != r1) goto L_0x051e
            if (r32 == 0) goto L_0x051e
            if (r25 != 0) goto L_0x051e
            java.lang.String r0 = "duplicate_ad_in_pool"
        L_0x055d:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r13.put(r6, r0)
        L_0x0567:
            java.lang.String r0 = "matched_qs_data"
            boolean r1 = r13.containsKey(r0)
            if (r1 == 0) goto L_0x0579
            java.lang.Object r24 = r13.get(r0)
            r0 = r24
            java.util.List r0 = (java.util.List) r0
            r24 = r0
        L_0x0579:
            java.lang.String r0 = "ad_meta_id"
            boolean r1 = r13.containsKey(r0)
            if (r1 == 0) goto L_0x058b
            java.lang.Object r23 = r13.get(r0)
            r0 = r23
            java.util.List r0 = (java.util.List) r0
            r23 = r0
        L_0x058b:
            r7.putAll(r13)
        L_0x058e:
            java.util.Set r0 = r7.keySet()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0745
            java.lang.String r1 = "already_installed"
            boolean r0 = r6.contains(r1)
            java.lang.String r10 = "app_not_installed"
            if (r0 != 0) goto L_0x05e8
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x062c
            boolean r12 = r4 instanceof X.C271844jg
            if (r12 == 0) goto L_0x061d
            r0 = r8
            X.4jg r0 = (X.C271844jg) r0
            com.instagram.common.session.UserSession r13 = r0.A00
            X.0Tu r11 = X.0Tu.A05
            r0 = 36326176259651145(0x810e7700013649, double:3.0361583681498765E-306)
        L_0x05bd:
            boolean r0 = X.182.A06(r11, r13, r0)
            if (r0 == 0) goto L_0x05e7
            if (r12 == 0) goto L_0x0611
            X.4jg r8 = (X.C271844jg) r8
            com.instagram.common.session.UserSession r8 = r8.A00
            r0 = 36330746105053948(0x81129f000442fc, double:3.0390483567838995E-306)
        L_0x05ce:
            boolean r0 = X.182.A06(r11, r8, r0)
            if (r0 == 0) goto L_0x05e7
            X.0wj r8 = X.0wj.A01
            r1 = 817904317(0x30c03abd, float:1.3986533E-9)
            java.lang.String r0 = "Legacy MC param is still true even mapped to false"
            X.0f9 r1 = r8.AEf(r0, r1)
            java.lang.String r0 = "module name"
            r1.ABQ(r0, r9)
            r1.report()
        L_0x05e7:
            r1 = r10
        L_0x05e8:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.1PW r0 = new X.1PW
            r0.<init>(r8)
            X.0qQ.A0B(r9, r3)
            r0.A0E = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r7 = r7.values()
            java.util.Iterator r8 = r7.iterator()
        L_0x0601:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x06f4
            java.lang.Object r7 = r8.next()
            java.util.Collection r7 = (java.util.Collection) r7
            r9.addAll(r7)
            goto L_0x0601
        L_0x0611:
            if (r26 == 0) goto L_0x05e7
            X.2wL r8 = (X.AnonymousClass2wL) r8
            com.instagram.common.session.UserSession r8 = r8.A00
            r0 = 36330746104988411(0x81129f000342fb, double:3.0390483567424537E-306)
            goto L_0x05ce
        L_0x061d:
            if (r26 == 0) goto L_0x05e7
            r0 = r8
            X.2wL r0 = (X.AnonymousClass2wL) r0
            com.instagram.common.session.UserSession r13 = r0.A00
            X.0Tu r11 = X.0Tu.A05
            r0 = 36326176259585608(0x810e7700003648, double:3.0361583681084306E-306)
            goto L_0x05bd
        L_0x062c:
            java.lang.Object r1 = r6.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x05e8
        L_0x0633:
            if (r33 == 0) goto L_0x051e
            if (r25 != 0) goto L_0x051e
            java.lang.String r0 = r10.BEZ(r2)
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x064d
            java.lang.Object r1 = r11.get(r0)
            X.4jX r0 = X.C271754jX.SEEN
            if (r1 != r0) goto L_0x064d
            java.lang.String r0 = "duplicate_ad_seen"
            goto L_0x055d
        L_0x064d:
            java.lang.String r0 = "duplicate_ad_inserted"
            goto L_0x055d
        L_0x0651:
            r1 = r35
            boolean r1 = r1 instanceof java.util.Collection
            if (r1 == 0) goto L_0x065f
            boolean r1 = r35.isEmpty()
            if (r1 == 0) goto L_0x065f
            goto L_0x051e
        L_0x065f:
            java.util.Iterator r6 = r35.iterator()
        L_0x0663:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x051e
            java.lang.Object r1 = r6.next()
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            boolean r1 = X.C270804hK.A03(r1)
            if (r1 == 0) goto L_0x0663
            if (r31 != 0) goto L_0x051e
            X.0sn r1 = X.0sn.A00
            java.lang.String r0 = "already_installed"
            goto L_0x0682
        L_0x067c:
            if (r34 == 0) goto L_0x051e
            X.0sn r1 = X.0sn.A00
            java.lang.String r0 = "INSTAGRAM_MEDIA_WAS_HIDDEN"
        L_0x0682:
            r13.put(r0, r1)
            goto L_0x0567
        L_0x0687:
            if (r25 != 0) goto L_0x051e
            r27.BSa()
            X.3lS r1 = r1.BI2()
            if (r1 == 0) goto L_0x06e8
            java.util.List r1 = r1.Apl()
            if (r1 == 0) goto L_0x06e8
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r21 = r1.iterator()
        L_0x06a1:
            boolean r1 = r21.hasNext()
            if (r1 == 0) goto L_0x06e8
            java.lang.Object r12 = r21.next()
            r14 = r12
            X.3lQ r14 = (X.C250423lQ) r14
            X.0qQ.A0B(r14, r3)
            java.lang.String r6 = r14.BMR()
            java.util.Map r1 = X.C379699Uy.A01
            java.lang.Object r6 = r1.get(r6)
            if (r6 != 0) goto L_0x06bf
            X.9Uy r6 = X.C379699Uy.UNKNOWN
        L_0x06bf:
            X.9Uy r1 = X.C379699Uy.UNKNOWN
            if (r6 == r1) goto L_0x06e5
            java.util.Map r1 = X.XFK.A01
            java.lang.String r6 = r14.Apa()
            java.lang.Object r6 = r1.get(r6)
            if (r6 != 0) goto L_0x06d1
            X.XFK r6 = X.XFK.A09
        L_0x06d1:
            X.XFK r1 = X.XFK.A09
            if (r6 == r1) goto L_0x06e5
            java.lang.Long r1 = r14.BoN()
            if (r1 == 0) goto L_0x06e5
            java.lang.Integer r6 = X.AnonymousClass05K.A01
        L_0x06dd:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 == r1) goto L_0x06a1
            r15.add(r12)
            goto L_0x06a1
        L_0x06e5:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            goto L_0x06dd
        L_0x06e8:
            X.0sn r6 = X.0sn.A00
            r1 = r30
            X.0qQ.A0B(r6, r1)
            goto L_0x051e
        L_0x06f1:
            r12 = -1
            goto L_0x0544
        L_0x06f4:
            X.2vH r10 = r4.A06
            java.util.List r7 = java.util.Collections.unmodifiableList(r24)
            java.lang.String r30 = r7.toString()
            java.util.List r7 = java.util.Collections.unmodifiableList(r23)
            java.lang.String r31 = r7.toString()
            java.lang.String r7 = "duplicate_ad_received"
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L_0x0749
            X.0Tu r11 = X.0Tu.A05
            r7 = 36318595642431801(0x81079200021939, double:3.031364355295668E-306)
            boolean r5 = X.182.A06(r11, r5, r7)
            if (r5 == 0) goto L_0x0749
            r5 = r37
            X.Ikb r34 = r4.A00(r5)
        L_0x0721:
            r26 = 0
            r24 = r10
            r25 = r0
            r27 = r2
            r28 = r1
            r29 = r26
            r32 = r9
            r33 = r6
            r35 = r37
            r24.Cgw(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0 = r17
            r0.add(r2)
            r16.remove()
            r1 = r20
            r0 = r19
            r4.A07(r1, r6, r0)
        L_0x0745:
            int r19 = r19 + 1
            goto L_0x002a
        L_0x0749:
            r34 = 0
            goto L_0x0721
        L_0x074c:
            X.2mN r0 = r4.A03
            boolean r0 = r0.CcL(r2)
            if (r0 != 0) goto L_0x0051
            goto L_0x002a
        L_0x0756:
            java.lang.String r1 = "Ad invalidation rule cannot be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x075e:
            X.4ji r2 = new X.4ji
            r1 = r18
            r0 = r17
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233742wN.E4e(java.lang.String, java.util.Collection, java.util.Map, boolean):X.4ji");
    }

    public C233742wN(UserSession userSession, C228812mN r4, C233402vf r5, AnonymousClass2vH r6, C249863kU r7, 1PJ r8) {
        this.A00 = userSession;
        this.A03 = r4;
        this.A06 = r6;
        this.A04 = r5;
        this.A07 = r7;
        this.A01 = r8;
        this.A05 = new C233752wP(userSession, r8);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "on_device_auto_exclusion_targeting";
        this.A08 = r1.A00();
    }
}
