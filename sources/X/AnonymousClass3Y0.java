package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Y0  reason: invalid class name */
public final class AnonymousClass3Y0 {
    public static final int A00 = AnonymousClass3XX.A00;
    public static final AnonymousClass3Y0 A01 = new Object();

    public static final 2TR A02(C251263mp r8, 2V1 r9, C243243Xz r10) {
        0qQ.A0B(r10, 0);
        int i = A00;
        return A04(r8, r9, r10, (2VJ) null, (String) null, i, i, false);
    }

    public static final 2TR A03(C251263mp r15, 2V1 r16, C243243Xz r17) {
        C243243Xz r10 = r17;
        2TR r8 = r10.A07;
        AnonymousClass3Y0 r5 = A01;
        AnonymousClass3XI r1 = r10.A00;
        boolean z = false;
        C251263mp r6 = r15;
        if (r8 != null && (r1.A05.A07() || r1.A04.A07())) {
            C251263mp A02 = r8.A02();
            if (0qQ.A0K(r15.A0K(), A02.A0K()) && (A02 == r15 || 0qQ.A0K(A02.getClass(), r15.getClass()))) {
                z = 2Vb.A04(A02, r15, 2Sa.shouldCompareCommonPropsInIsEquivalentTo);
            }
        }
        2V1 r7 = r16;
        try {
            r1.A02(r15, r7, r8, false);
            if (!z) {
                2TR A022 = A02(r15, r7, r10);
                if (A022 != null) {
                    if (!r10.A00()) {
                        C244713bd r12 = C244703bc.A01;
                        Context context = r7.A0C;
                        0qQ.A07(context);
                        A022.A0D(r10, r12.A00(context), 0, 0, true);
                    }
                    if (r10.A00()) {
                        return A022;
                    }
                }
                r10.A02 = false;
                return A022;
            } else if (r8 != null) {
                List list = r8.A0s;
                String A08 = ((2Vz) list.get(list.size() - 1)).A04.A08();
                HashSet hashSet = new HashSet();
                hashSet.addAll(r1.A05.A03());
                hashSet.addAll(r1.A04.A03());
                return r5.A01(r6, r7, r8, (2TR) null, r10, A08, hashSet);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } catch (Exception e) {
            2Vb.A01(r15, r7, e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3bj, java.lang.Object] */
    public static final C244793bl A05(2TR r4) {
        if (r4 != null) {
            ArrayList arrayList = new ArrayList();
            ? obj = new Object();
            A01.A09(r4, obj, arrayList);
            if (!arrayList.isEmpty() || !C246013dq.A00(obj)) {
                return new C244793bl(obj, arrayList);
            }
        }
        return null;
    }

    public static final void A06(2TR r8, C243243Xz r9) {
        C243243Xz r5 = r9;
        0qQ.A0B(r9, 0);
        2TR r4 = r8;
        0qQ.A0B(r8, 1);
        List<C251263mp> list = r8.A0d;
        if (list != null) {
            2V1 A05 = r8.A05();
            for (C251263mp A0E : list) {
                r8.A0E(A0E, A05, r5);
            }
            list.clear();
        }
        int size = r8.A0f.size();
        for (int i = 0; i < size; i++) {
            A06((2TR) r8.A0f.get(i), r5);
        }
        C244713bd r1 = C244703bc.A01;
        Context context = r8.A04().A0C;
        0qQ.A07(context);
        r4.A0D(r5, r1.A00(context), 0, 0, true);
    }

    public static final void A08(2TR r3, AnonymousClass3XI r4) {
        0qQ.A0B(r3, 1);
        int size = r3.A0f.size();
        A07(r3, r4);
        for (int i = 0; i < size; i++) {
            A08((2TR) r3.A0f.get(i), r4);
        }
    }

    public static final 2V1 A00(C251263mp r11, 2V1 r12, C243243Xz r13, 2VJ r14, String str) {
        2VC r8;
        Map map;
        C243653Zr r1;
        Object obj;
        if (str == null) {
            str = AnonymousClass2VN.A00(r12.A01, r11, r12);
        }
        2V1 A002 = 2V1.A00(r11, r12, str);
        if (r11 instanceof C251253mo) {
            C251253mo r9 = (C251253mo) r11;
            if (r9.A11()) {
                2Vz r6 = A002.A05;
                r6.getClass();
                AnonymousClass3XI r15 = r13.A00;
                0qQ.A0B(str, 2);
                if (A002.A0A) {
                    r8 = r15.A04;
                } else {
                    r8 = r15.A05;
                }
                synchronized (r8) {
                    map = r8.A08;
                    r1 = (C243653Zr) map.get(str);
                }
                if (r1 != null) {
                    r8.A03.add(str);
                } else {
                    AnonymousClass2V6 r16 = r8.A00;
                    synchronized (r16) {
                        Map map2 = r16.A01;
                        obj = map2.get(str);
                        if (obj == null) {
                            obj = new Object();
                            map2.put(str, obj);
                        }
                    }
                    synchronized (obj) {
                        Map map3 = r16.A02;
                        0qQ.A06(map3);
                        Object obj2 = map3.get(str);
                        if (obj2 == null) {
                            boolean isTracing = ComponentsSystrace.A00.isTracing();
                            if (isTracing) {
                                ComponentsSystrace.A02(002.A0R("create-initial-state:", r11.A0J()));
                            }
                            2TB A0f = r9.A0f();
                            r9.A0w(A002, A0f);
                            0qQ.A07(A0f);
                            if (isTracing) {
                                ComponentsSystrace.A01();
                            }
                            obj2 = new C243653Zr((AnonymousClass2Si) null, A0f);
                            map3.put(str, obj2);
                        }
                        r1 = (C243653Zr) obj2;
                    }
                    0qQ.A05(r1);
                    synchronized (r8) {
                        r8.A03.add(str);
                        map.put(str, r1);
                    }
                }
                r6.A02 = r1.A01;
            }
            2VJ r0 = r12.A07;
            A002.A06 = r0;
            if (r14 == null) {
                r14 = r0;
            }
            A002.A07 = r14;
        }
        return A002;
    }

    private final 2TR A01(C251263mp r25, 2V1 r26, 2TR r27, 2TR r28, C243243Xz r29, String str, Set set) {
        int A012;
        int i;
        C243243Xz r4;
        int i2;
        int i3;
        boolean z;
        Set<String> set2;
        2TR r3 = r27;
        List list = r3.A0s;
        C251263mp r8 = r25;
        C243243Xz r10 = r29;
        if (!(r3 instanceof C244783bk)) {
            Iterator it = list.iterator();
            do {
                set2 = set;
                if (!it.hasNext()) {
                    String A08 = ((2Vz) list.get(list.size() - 1)).A04.A08();
                    for (String A0k : set2) {
                        if (00p.A0k(A0k, A08, false)) {
                            boolean isTracing = ComponentsSystrace.A00.isTracing();
                            if (isTracing) {
                                ComponentsSystrace.A02(002.A0R("reconcile:", r8.A0J()));
                            }
                            2TR A082 = r3.A08();
                            A082.A0f = new ArrayList(r3.A0f.size());
                            A082.A0h = null;
                            A07(r3, r10.A00);
                            2V1 A05 = A082.A05();
                            int size = r3.A0f.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                2TR r82 = (2TR) r3.A0f.get(i4);
                                List list2 = r82.A0s;
                                int max = Math.max(0, list2.size() - 1);
                                2TR A013 = A01(((2Vz) list2.get(max)).A03, A05, r82, r3, r10, r82.A0B(max), set2);
                                if (A013 != null) {
                                    A082.A0f.add(A082.A0f.size(), A013);
                                }
                            }
                            if (isTracing) {
                                ComponentsSystrace.A01();
                            }
                            return A082;
                        }
                    }
                    A08(r3, r10.A00);
                    return r3;
                }
            } while (!set2.contains(((2Vz) it.next()).A04.A08()));
        }
        2V1 r9 = r26;
        ThreadLocal threadLocal = r9.A0E;
        Object obj = threadLocal.get();
        Object obj2 = null;
        if (obj instanceof C243243Xz) {
            obj2 = obj;
        }
        threadLocal.set(r10);
        try {
            int i5 = A00;
            2TR A04 = A04(r8, r9, r10, (2VJ) null, str, i5, i5, false);
            if (A04 == null) {
                return A04;
            }
            2TR r42 = r28;
            if (r28 == null) {
                C244713bd r1 = C244703bc.A01;
                Context context = r9.A0C;
                0qQ.A07(context);
                A012 = r1.A00(context);
                z = true;
                r4 = r10;
                i2 = 0;
                i3 = 0;
            } else {
                A012 = r42.A01();
                int i6 = r42.A03;
                2TG r0 = r42.A0M;
                if (r0 != null) {
                    i = r0.A0B;
                } else {
                    i = 0;
                }
                boolean z2 = r42.A0k;
                r4 = r10;
                i2 = i6;
                i3 = i;
                z = z2;
            }
            A04.A0D(r4, A012, i2, i3, z);
            return A04;
        } finally {
            threadLocal.set(obj2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0227, code lost:
        if (r30 != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (r30 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0389, code lost:
        if (r4 == null) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03de, code lost:
        if (r20 == false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        if (r30 != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017e, code lost:
        if (r4 == null) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r20 == false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019a, code lost:
        if (r20 == false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019c, code lost:
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0357 A[LOOP:4: B:189:0x0351->B:191:0x0357, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.2TR A04(X.C251263mp r23, X.2V1 r24, X.C243243Xz r25, X.2VJ r26, java.lang.String r27, int r28, int r29, boolean r30) {
        /*
            r11 = r23
            java.lang.String r12 = "component"
            r6 = 4
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r20 = r0.isTracing()
            if (r20 == 0) goto L_0x001a
            java.lang.String r1 = "resolve:"
            java.lang.String r0 = r11.A0J()
            java.lang.String r0 = X.002.A0R(r1, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x001a:
            java.lang.String r15 = "Litho.Resolve.ComponentResolved"
            java.util.Set r2 = X.2SN.A00
            boolean r1 = r2.isEmpty()
            java.lang.String r5 = "after-create-node:"
            java.lang.String r4 = "Required value was null."
            java.lang.String r0 = "create-node:"
            r22 = 0
            r10 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            r25 = r28
            r26 = r29
            if (r1 == 0) goto L_0x00af
            if (r20 == 0) goto L_0x0045
            java.lang.String r1 = r11.A0J()
            java.lang.String r0 = X.002.A0R(r0, r1)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0045:
            boolean r14 = X.C251263mp.A03(r11)
            X.3Xp r1 = r9.A08
            int r0 = r11.A00
            boolean r13 = r1.A05(r0)
            if (r14 != 0) goto L_0x0055
            if (r13 == 0) goto L_0x0058
        L_0x0055:
            r12 = 1
            if (r30 == 0) goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            if (r13 == 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            X.2V1 r7 = A00(r11, r10, r9, r8, r7)     // Catch:{ Exception -> 0x0196 }
            goto L_0x006d
        L_0x0061:
            int r0 = r11.A00     // Catch:{ Exception -> 0x0196 }
            X.2TR r0 = r1.A02(r0)     // Catch:{ Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00a9
            X.2V1 r7 = r0.A04()     // Catch:{ Exception -> 0x0196 }
        L_0x006d:
            java.lang.String r3 = r7.A08()     // Catch:{ Exception -> 0x0196 }
            X.2Vz r2 = r7.A05     // Catch:{ Exception -> 0x0196 }
            r2.getClass()     // Catch:{ Exception -> 0x0196 }
            if (r12 == 0) goto L_0x0086
            X.2VJ r4 = r7.A07     // Catch:{ Exception -> 0x0196 }
            int r0 = r11.A00     // Catch:{ Exception -> 0x0196 }
            X.2TR r1 = r1.A02(r0)     // Catch:{ Exception -> 0x0196 }
            X.3bk r0 = new X.3bk     // Catch:{ Exception -> 0x0196 }
            r0.<init>(r10, r1, r4)     // Catch:{ Exception -> 0x0196 }
            goto L_0x00a0
        L_0x0086:
            r23 = r9
            r24 = r2
            r21 = r11
            X.3bL r1 = r21.A0F(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0196 }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x0196 }
            X.2TR r0 = r1.A01     // Catch:{ Exception -> 0x0196 }
            X.2TC r4 = r1.A00     // Catch:{ Exception -> 0x0196 }
            if (r0 != 0) goto L_0x00a2
            if (r20 == 0) goto L_0x03e3
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0196 }
            goto L_0x03e0
        L_0x00a0:
            r4 = r22
        L_0x00a2:
            if (r20 == 0) goto L_0x036c
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0196 }
            goto L_0x0361
        L_0x00a9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0196 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0196 }
            throw r0     // Catch:{ Exception -> 0x0196 }
        L_0x00af:
            java.util.Iterator r14 = r2.iterator()
            r3 = r22
        L_0x00b5:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r13 = r14.next()
            r1 = r13
            X.2SM r1 = (X.2SM) r1
            java.lang.String[] r2 = r1.A00
            boolean r1 = X.03t.A0O(r15, r2)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r1 = "*"
            boolean r1 = X.03t.A0O(r1, r2)
            if (r1 == 0) goto L_0x00b5
        L_0x00d2:
            if (r3 != 0) goto L_0x00d9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00d9:
            r3.add(r13)
            goto L_0x00b5
        L_0x00dd:
            if (r3 != 0) goto L_0x00e1
            X.0sn r3 = X.0sn.A00
        L_0x00e1:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x01a1
            if (r20 == 0) goto L_0x00f4
            java.lang.String r1 = r11.A0J()
            java.lang.String r0 = X.002.A0R(r0, r1)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x00f4:
            boolean r14 = X.C251263mp.A03(r11)
            X.3Xp r1 = r9.A08
            int r0 = r11.A00
            boolean r13 = r1.A05(r0)
            if (r14 != 0) goto L_0x0104
            if (r13 == 0) goto L_0x0107
        L_0x0104:
            r12 = 1
            if (r30 == 0) goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            if (r13 == 0) goto L_0x010b
            goto L_0x0110
        L_0x010b:
            X.2V1 r7 = A00(r11, r10, r9, r8, r7)     // Catch:{ Exception -> 0x018f }
            goto L_0x011c
        L_0x0110:
            int r0 = r11.A00     // Catch:{ Exception -> 0x018f }
            X.2TR r0 = r1.A02(r0)     // Catch:{ Exception -> 0x018f }
            if (r0 == 0) goto L_0x0189
            X.2V1 r7 = r0.A04()     // Catch:{ Exception -> 0x018f }
        L_0x011c:
            java.lang.String r3 = r7.A08()     // Catch:{ Exception -> 0x018f }
            X.2Vz r2 = r7.A05     // Catch:{ Exception -> 0x018f }
            r2.getClass()     // Catch:{ Exception -> 0x018f }
            if (r12 == 0) goto L_0x0135
            X.2VJ r4 = r7.A07     // Catch:{ Exception -> 0x018f }
            int r0 = r11.A00     // Catch:{ Exception -> 0x018f }
            X.2TR r1 = r1.A02(r0)     // Catch:{ Exception -> 0x018f }
            X.3bk r0 = new X.3bk     // Catch:{ Exception -> 0x018f }
            r0.<init>(r10, r1, r4)     // Catch:{ Exception -> 0x018f }
            goto L_0x014f
        L_0x0135:
            r23 = r9
            r24 = r2
            r21 = r11
            X.3bL r1 = r21.A0F(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x018f }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x018f }
            X.2TR r0 = r1.A01     // Catch:{ Exception -> 0x018f }
            X.2TC r4 = r1.A00     // Catch:{ Exception -> 0x018f }
            if (r0 != 0) goto L_0x0151
            if (r20 == 0) goto L_0x03e3
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x018f }
            goto L_0x03e0
        L_0x014f:
            r4 = r22
        L_0x0151:
            if (r20 == 0) goto L_0x0161
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x018f }
            java.lang.String r1 = r11.A0J()
            java.lang.String r1 = X.002.A0R(r5, r1)
            com.facebook.litho.ComponentsSystrace.A02(r1)
        L_0x0161:
            java.util.List r1 = r0.A0s
            int r1 = r1.size()
            if (r1 != 0) goto L_0x017e
            boolean r1 = r11.A0N()
            if (r1 == 0) goto L_0x0182
            java.lang.Integer r5 = r11.A0G()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r5 == r1) goto L_0x0182
        L_0x0177:
            X.2T1 r1 = X.C251263mp.A06
            X.0qQ.A08(r1)
            r0.A0W = r1
        L_0x017e:
            if (r4 != 0) goto L_0x0394
            goto L_0x038b
        L_0x0182:
            if (r14 != 0) goto L_0x0186
            if (r13 == 0) goto L_0x017e
        L_0x0186:
            if (r30 != 0) goto L_0x017e
            goto L_0x0177
        L_0x0189:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x018f }
            r0.<init>(r4)     // Catch:{ Exception -> 0x018f }
            throw r0     // Catch:{ Exception -> 0x018f }
        L_0x018f:
            r0 = move-exception
            X.2Vb.A01(r11, r10, r0)
            if (r20 == 0) goto L_0x03e3
            goto L_0x019c
        L_0x0196:
            r0 = move-exception
            X.2Vb.A01(r11, r10, r0)
            if (r20 == 0) goto L_0x03e3
        L_0x019c:
            com.facebook.litho.ComponentsSystrace.A01()
            goto L_0x03e0
        L_0x01a1:
            java.util.Iterator r14 = r3.iterator()
            r2 = r22
        L_0x01a7:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r13 = r14.next()
            boolean r1 = r13 instanceof X.C7850QbY
            if (r1 == 0) goto L_0x01a7
            if (r2 != 0) goto L_0x01bc
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x01bc:
            r2.add(r13)
            goto L_0x01a7
        L_0x01c0:
            if (r2 != 0) goto L_0x01c4
            X.0sn r2 = X.0sn.A00
        L_0x01c4:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>"
            X.0qQ.A0C(r2, r1)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.lang.String r1 = r11.A0J()
            r13.put(r12, r1)
            java.lang.String r12 = r11.A0J()
            java.lang.String r1 = "name"
            r13.put(r1, r12)
            r1 = 10
            int r12 = X.0Yv.A1E(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.util.Iterator r14 = r2.iterator()
        L_0x01ed:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L_0x0201
            java.lang.Object r12 = r14.next()
            X.QbY r12 = (X.C7850QbY) r12
            X.S5p r12 = r12.A01(r15)
            r1.add(r12)
            goto L_0x01ed
        L_0x0201:
            long r27 = java.lang.System.currentTimeMillis()
            long r18 = java.lang.System.nanoTime()
            if (r20 == 0) goto L_0x0216
            java.lang.String r12 = r11.A0J()
            java.lang.String r0 = X.002.A0R(r0, r12)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0216:
            boolean r17 = X.C251263mp.A03(r11)
            X.3Xp r0 = r9.A08
            int r12 = r11.A00
            boolean r16 = r0.A05(r12)
            if (r17 != 0) goto L_0x0226
            if (r16 == 0) goto L_0x0229
        L_0x0226:
            r12 = 1
            if (r30 == 0) goto L_0x022a
        L_0x0229:
            r12 = 0
        L_0x022a:
            if (r16 == 0) goto L_0x022d
            goto L_0x0232
        L_0x022d:
            X.2V1 r7 = A00(r11, r10, r9, r8, r7)     // Catch:{ Exception -> 0x0303 }
            goto L_0x023e
        L_0x0232:
            int r7 = r11.A00     // Catch:{ Exception -> 0x0303 }
            X.2TR r7 = r0.A02(r7)     // Catch:{ Exception -> 0x0303 }
            if (r7 == 0) goto L_0x02fd
            X.2V1 r7 = r7.A04()     // Catch:{ Exception -> 0x0303 }
        L_0x023e:
            java.lang.String r14 = r7.A08()     // Catch:{ Exception -> 0x0303 }
            X.2Vz r4 = r7.A05     // Catch:{ Exception -> 0x0303 }
            r4.getClass()     // Catch:{ Exception -> 0x0303 }
            if (r12 == 0) goto L_0x0257
            X.2VJ r12 = r7.A07     // Catch:{ Exception -> 0x0303 }
            int r8 = r11.A00     // Catch:{ Exception -> 0x0303 }
            X.2TR r8 = r0.A02(r8)     // Catch:{ Exception -> 0x0303 }
            X.3bk r0 = new X.3bk     // Catch:{ Exception -> 0x0303 }
            r0.<init>(r10, r8, r12)     // Catch:{ Exception -> 0x0303 }
            goto L_0x0271
        L_0x0257:
            r23 = r9
            r24 = r4
            r21 = r11
            X.3bL r8 = r21.A0F(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0305 }
            X.0qQ.A07(r8)     // Catch:{ Exception -> 0x0305 }
            X.2TR r0 = r8.A01     // Catch:{ Exception -> 0x0305 }
            X.2TC r8 = r8.A00     // Catch:{ Exception -> 0x0305 }
            if (r0 != 0) goto L_0x0273
            if (r20 == 0) goto L_0x030e
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0305 }
            goto L_0x030e
        L_0x0271:
            r8 = r22
        L_0x0273:
            if (r20 == 0) goto L_0x0283
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ Exception -> 0x0305 }
            java.lang.String r10 = r11.A0J()
            java.lang.String r5 = X.002.A0R(r5, r10)
            com.facebook.litho.ComponentsSystrace.A02(r5)
        L_0x0283:
            java.util.List r5 = r0.A0s
            int r5 = r5.size()
            if (r5 != 0) goto L_0x02a0
            boolean r5 = r11.A0N()
            if (r5 == 0) goto L_0x02f6
            java.lang.Integer r10 = r11.A0G()
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r10 == r5) goto L_0x02f6
        L_0x0299:
            X.2T1 r5 = X.C251263mp.A06
            X.0qQ.A08(r5)
            r0.A0W = r5
        L_0x02a0:
            if (r8 != 0) goto L_0x02ab
            boolean r5 = r11 instanceof X.C251253mo
            if (r5 == 0) goto L_0x02ab
            r5 = r11
            X.3mo r5 = (X.C251253mo) r5
            X.2TC r8 = r5.A00
        L_0x02ab:
            boolean r5 = r0 instanceof X.C244543bM
            if (r5 != 0) goto L_0x02bc
            if (r8 == 0) goto L_0x02bc
            boolean r5 = X.C251263mp.A03(r11)
            if (r5 == 0) goto L_0x02b9
            if (r30 != 0) goto L_0x02bc
        L_0x02b9:
            r8.A0N(r7, r0)
        L_0x02bc:
            r4.A00 = r8
            r0.A0F(r4)
            boolean r5 = r11 instanceof X.C251253mo
            if (r5 == 0) goto L_0x02e0
            X.3mo r11 = (X.C251253mo) r11
            boolean r5 = r11.A0z()
            if (r5 == 0) goto L_0x02e0
            X.2Uf r7 = new X.2Uf
            r7.<init>(r4, r11, r14)
            java.util.List r5 = r0.A0b
            if (r5 != 0) goto L_0x02dd
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            r0.A0b = r5
        L_0x02dd:
            r5.add(r7)
        L_0x02e0:
            r4.A00(r0)
            if (r8 == 0) goto L_0x02ee
            X.3Zj r4 = r8.A05
            if (r4 == 0) goto L_0x02f4
            java.util.Map r4 = r4.A0I
        L_0x02eb:
            r0.A0G(r4)
        L_0x02ee:
            if (r20 == 0) goto L_0x0310
            com.facebook.litho.ComponentsSystrace.A01()
            goto L_0x0310
        L_0x02f4:
            r4 = 0
            goto L_0x02eb
        L_0x02f6:
            if (r17 != 0) goto L_0x02fa
            if (r16 == 0) goto L_0x02a0
        L_0x02fa:
            if (r30 != 0) goto L_0x02a0
            goto L_0x0299
        L_0x02fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0303 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0303 }
            throw r0     // Catch:{ Exception -> 0x0303 }
        L_0x0303:
            r0 = move-exception
            goto L_0x0306
        L_0x0305:
            r0 = move-exception
        L_0x0306:
            X.2Vb.A01(r11, r10, r0)
            if (r20 == 0) goto L_0x030e
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x030e:
            r0 = r22
        L_0x0310:
            long r29 = java.lang.System.nanoTime()
            int r4 = r9.A06
            java.lang.String r25 = java.lang.String.valueOf(r4)
            long r29 = r29 - r18
            X.QbU r4 = new X.QbU
            r23 = r4
            r24 = r15
            r26 = r13
            r23.<init>(r24, r25, r26, r27, r29)
            java.util.Iterator r8 = r2.iterator()
            r7 = 0
        L_0x032c:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x034d
            java.lang.Object r6 = r8.next()
            int r5 = r7 + 1
            if (r7 >= 0) goto L_0x0342
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0342:
            X.QbY r6 = (X.C7850QbY) r6
            java.lang.Object r2 = r1.get(r7)
            r6.A02(r4, r2)
            r7 = r5
            goto L_0x032c
        L_0x034d:
            java.util.Iterator r2 = r3.iterator()
        L_0x0351:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x03dc
            java.lang.Object r1 = r2.next()
            X.2SM r1 = (X.2SM) r1
            r1.A00(r4)
            goto L_0x0351
        L_0x0361:
            java.lang.String r1 = r11.A0J()
            java.lang.String r1 = X.002.A0R(r5, r1)
            com.facebook.litho.ComponentsSystrace.A02(r1)
        L_0x036c:
            java.util.List r1 = r0.A0s
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0389
            boolean r1 = r11.A0N()
            if (r1 == 0) goto L_0x03e6
            java.lang.Integer r5 = r11.A0G()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r5 == r1) goto L_0x03e6
        L_0x0382:
            X.2T1 r1 = X.C251263mp.A06
            X.0qQ.A08(r1)
            r0.A0W = r1
        L_0x0389:
            if (r4 != 0) goto L_0x0394
        L_0x038b:
            boolean r1 = r11 instanceof X.C251253mo
            if (r1 == 0) goto L_0x0394
            r1 = r11
            X.3mo r1 = (X.C251253mo) r1
            X.2TC r4 = r1.A00
        L_0x0394:
            boolean r1 = r0 instanceof X.C244543bM
            if (r1 != 0) goto L_0x03a5
            if (r4 == 0) goto L_0x03a5
            boolean r1 = X.C251263mp.A03(r11)
            if (r1 == 0) goto L_0x03a2
            if (r30 != 0) goto L_0x03a5
        L_0x03a2:
            r4.A0N(r7, r0)
        L_0x03a5:
            r2.A00 = r4
            r0.A0F(r2)
            boolean r1 = r11 instanceof X.C251253mo
            if (r1 == 0) goto L_0x03c9
            X.3mo r11 = (X.C251253mo) r11
            boolean r1 = r11.A0z()
            if (r1 == 0) goto L_0x03c9
            X.2Uf r5 = new X.2Uf
            r5.<init>(r2, r11, r3)
            java.util.List r1 = r0.A0b
            if (r1 != 0) goto L_0x03c6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            r0.A0b = r1
        L_0x03c6:
            r1.add(r5)
        L_0x03c9:
            r2.A00(r0)
            if (r4 == 0) goto L_0x03d7
            X.3Zj r1 = r4.A05
            if (r1 == 0) goto L_0x03e4
            java.util.Map r1 = r1.A0I
        L_0x03d4:
            r0.A0G(r1)
        L_0x03d7:
            if (r20 == 0) goto L_0x03dc
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x03dc:
            r22 = r0
            if (r20 == 0) goto L_0x03e3
        L_0x03e0:
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x03e3:
            return r22
        L_0x03e4:
            r1 = 0
            goto L_0x03d4
        L_0x03e6:
            if (r14 != 0) goto L_0x03ea
            if (r13 == 0) goto L_0x0389
        L_0x03ea:
            if (r30 != 0) goto L_0x0389
            goto L_0x0382
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y0.A04(X.3mp, X.2V1, X.3Xz, X.2VJ, java.lang.String, int, int, boolean):X.2TR");
    }

    public static final void A07(2TR r2, AnonymousClass3XI r3) {
        2VC r0;
        for (2Vz r02 : r2.A0s) {
            2V1 r03 = r02.A04;
            String A08 = r03.A08();
            if (r03.A0A) {
                r0 = r3.A04;
            } else {
                r0 = r3.A05;
            }
            r0.A03.add(A08);
        }
    }

    private final void A09(2TR r4, C244773bj r5, List list) {
        C244773bj r0;
        int size = r4.A0f.size();
        for (int i = 0; i < size; i++) {
            A09((2TR) r4.A0f.get(i), r5, list);
        }
        List list2 = r4.A0b;
        if (list2 != null) {
            list.addAll(list2);
        }
        if (r4.A05().A02.A02 && !(r4 instanceof C244783bk) && (r0 = r4.A0Q) != null) {
            r5.A00(r0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.3bj, java.lang.Object] */
    public static final void A0A(2TR r4, C244773bj r5, List list) {
        if (r5 != null) {
            C244773bj r0 = r4.A0Q;
            C244773bj r02 = r0;
            if (r0 == null) {
                ? obj = new Object();
                r4.A0Q = obj;
                r02 = obj;
            }
            r02.A00(r5);
        }
        if (list != null) {
            for (Object next : list) {
                0qQ.A0B(next, 0);
                List list2 = r4.A0b;
                if (list2 == null) {
                    list2 = new ArrayList(4);
                    r4.A0b = list2;
                }
                list2.add(next);
            }
        }
    }
}
