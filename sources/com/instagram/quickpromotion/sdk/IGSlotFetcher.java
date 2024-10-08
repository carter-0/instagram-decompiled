package com.instagram.quickpromotion.sdk;

import X.0eP;
import X.0qQ;
import X.0sP;
import X.0sn;
import X.136;
import X.AnonymousClass05K;
import X.AnonymousClass4VW;
import X.AnonymousClass4Vy;
import X.AnonymousClass4Vz;
import X.AnonymousClass9J8;
import X.C265684Vt;
import X.C376649Iu;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IGSlotFetcher {
    public Integer A00 = AnonymousClass05K.A00;
    public final QuickPromotionSlot A01;
    public final AnonymousClass4Vy A02 = new AnonymousClass4Vy();
    public final Map A03;
    public final Map A04;
    public final Set A05;
    public final 136 A06 = new 136();
    public final Context A07;
    public final UserSession A08;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.quickpromotion.sdk.IGSlotFetcher r12, X.AnonymousClass42R r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r3 = 46
            boolean r0 = X.AnonymousClass9JX.A00(r3, r14)
            if (r0 == 0) goto L_0x0135
            r6 = r14
            X.9JX r6 = (X.AnonymousClass9JX) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0135
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r5) goto L_0x013c
            X.0eS.A00(r1)
        L_0x0024:
            X.5Jv r1 = (X.C283915Jv) r1
            X.4W5 r4 = r1.A00
            if (r4 != 0) goto L_0x0030
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.RegularImmutableMap.A02
        L_0x002c:
            X.0qQ.A07(r4)
            return r4
        L_0x0030:
            r0 = 4
            com.google.common.collect.ImmutableMap$Builder r3 = new com.google.common.collect.ImmutableMap$Builder
            r3.<init>(r0)
            java.lang.String r2 = r1.A01
            r1 = 39
            X.9LZ r0 = new X.9LZ
            r0.<init>(r3, r1)
            X.C283925Jw.A00(r4, r2, r0)
            com.google.common.collect.ImmutableMap r4 = r3.build()
            goto L_0x002c
        L_0x0047:
            X.0eS.A00(r1)
            java.lang.String r8 = r13.A01
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r12.A01
            java.util.Map r0 = X.AnonymousClass2kY.A01
            java.lang.Object r2 = r0.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x00cd
            X.0sm r7 = X.0Yt.A0E()
        L_0x005c:
            com.google.common.collect.CompactHashMap r9 = new com.google.common.collect.CompactHashMap
            r9.<init>()
            X.4Vy r0 = r12.A02
            if (r15 == 0) goto L_0x00ca
            long r2 = r0.A01
        L_0x0067:
            long r0 = r0.A00
            long r0 = r0 + r2
            long r10 = java.lang.System.currentTimeMillis()
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r11 = 0
            if (r2 <= 0) goto L_0x0074
            r11 = 1
        L_0x0074:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x007c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r7 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r7
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0098:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r2 = r3.next()
            com.instagram.quickpromotion.intf.Trigger r2 = (com.instagram.quickpromotion.intf.Trigger) r2
            X.9Iz r1 = new X.9Iz
            r1.<init>((com.instagram.quickpromotion.intf.QuickPromotionSurface) r7, (com.instagram.quickpromotion.intf.Trigger) r2, (java.lang.String) r8)
            java.util.Map r0 = r12.A03
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00b3
            if (r11 == 0) goto L_0x0098
        L_0x00b3:
            X.1J2.A01(r7, r2)
            java.lang.Object r0 = r9.get(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00c6
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>()
            r9.put(r7, r0)
        L_0x00c6:
            r0.add(r2)
            goto L_0x0098
        L_0x00ca:
            long r2 = r0.A02
            goto L_0x0067
        L_0x00cd:
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x00dd
            r1 = 16
        L_0x00dd:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x00e6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r2.next()
            X.2ka r0 = (X.C227972ka) r0
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r0.A00
            java.util.EnumSet r0 = r0.A01
            r7.put(r1, r0)
            goto L_0x00e6
        L_0x00fa:
            java.util.Set r0 = r9.entrySet()
            com.google.common.collect.ImmutableSetMultimap r2 = com.google.common.collect.ImmutableSetMultimap.A00(r0)
            android.content.Context r0 = r12.A07
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r7 = (int) r0
            X.4W0 r0 = new X.4W0
            r0.<init>(r2)
            X.3Ns r3 = new X.3Ns
            r3.<init>()
            X.4W1 r2 = new X.4W1
            r2.<init>(r13, r0, r3, r7)
            com.instagram.common.session.UserSession r1 = r12.A08
            X.4W3 r0 = X.AnonymousClass4W3.A00
            r2.ATC(r1, r0)
            r6.A01 = r12
            r6.A00 = r5
            java.lang.Object r1 = r3.A0E(r6)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0135:
            X.9JX r6 = new X.9JX
            r6.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x013c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGSlotFetcher.A00(com.instagram.quickpromotion.sdk.IGSlotFetcher, X.42R, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.quickpromotion.sdk.IGSlotFetcher r10, X.AnonymousClass42R r11, X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r4 = 32
            boolean r0 = X.C376709Ja.A00(r4, r12)
            if (r0 == 0) goto L_0x00bc
            r3 = r12
            X.9Ja r3 = (X.C376709Ja) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A03
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x00ac
            if (r0 != r5) goto L_0x00c6
            java.lang.Object r11 = r3.A02
            X.42R r11 = (X.AnonymousClass42R) r11
            java.lang.Object r10 = r3.A01
            com.instagram.quickpromotion.sdk.IGSlotFetcher r10 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r10
            X.0eS.A00(r2)
        L_0x002c:
            com.google.common.collect.ImmutableMap r2 = (com.google.common.collect.ImmutableMap) r2
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0036:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r6 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r6
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0A(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0055:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r4 = r8.next()
            X.4VQ r4 = (X.AnonymousClass4VQ) r4
            X.4UC r0 = r4.A01
            java.util.Set r0 = r0.CA0()
            java.util.Iterator r7 = r0.iterator()
        L_0x006b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r3 = r7.next()
            com.instagram.quickpromotion.intf.Trigger r3 = (com.instagram.quickpromotion.intf.Trigger) r3
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r10.A01
            X.0qQ.A0A(r6)
            java.util.Map r0 = X.AnonymousClass2kY.A01
            X.0qQ.A0B(r6, r5)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            java.util.EnumSet r0 = X.AnonymousClass2kY.A00(r1, r6)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r11.A01
            X.9Iz r2 = new X.9Iz
            r2.<init>((com.instagram.quickpromotion.intf.QuickPromotionSurface) r6, (com.instagram.quickpromotion.intf.Trigger) r3, (java.lang.String) r0)
            java.util.Map r1 = r10.A03
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x00a6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
        L_0x00a6:
            java.util.List r0 = (java.util.List) r0
            r0.add(r4)
            goto L_0x006b
        L_0x00ac:
            X.0eS.A00(r2)
            r3.A01 = r10
            r3.A02 = r11
            r3.A00 = r5
            java.lang.Object r2 = A00(r10, r11, r3, r13)
            if (r2 != r1) goto L_0x002c
            return r1
        L_0x00bc:
            X.9Ja r3 = new X.9Ja
            r3.<init>(r10, r12, r4)
            goto L_0x0016
        L_0x00c3:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x00c6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGSlotFetcher.A01(com.instagram.quickpromotion.sdk.IGSlotFetcher, X.42R, X.4D7, boolean):java.lang.Object");
    }

    public static final void A02(AnonymousClass9J8 r6, IGSlotFetcher iGSlotFetcher, 0sP r8) {
        r8.invoke(new C265684Vt(r6, "make_pending_callbacks"));
        Map map = iGSlotFetcher.A04;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((Set) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            0sn r3 = (List) iGSlotFetcher.A03.get(key);
            if (r3 == null) {
                r3 = 0sn.A00;
            }
            arrayList.add(new 0eP(new AnonymousClass4VW(new C376649Iu((List) r3, 11, "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969")), value));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            0eP r0 = (0eP) it.next();
            Object obj = r0.A00;
            Set<AnonymousClass4Vz> set = (Set) r0.A01;
            for (AnonymousClass4Vz r1 : set) {
                0qQ.A0B(obj, 0);
                r1.A00.resumeWith(obj);
            }
            set.clear();
        }
    }

    public IGSlotFetcher(Context context, UserSession userSession, QuickPromotionSlot quickPromotionSlot) {
        this.A01 = quickPromotionSlot;
        this.A08 = userSession;
        this.A07 = context;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        0qQ.A07(synchronizedMap);
        this.A03 = synchronizedMap;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        0qQ.A07(synchronizedSet);
        this.A05 = synchronizedSet;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        0qQ.A07(synchronizedMap2);
        this.A04 = synchronizedMap2;
    }
}
