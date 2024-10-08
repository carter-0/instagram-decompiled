package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DiQ  reason: case insensitive filesystem */
public final class C46645DiQ implements C51946G8p {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final SparseArray A04;
    public final C51893G6j A05;
    public final C51893G6j A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final HashMap A0C;
    public final List A0D;
    public final Map A0E;
    public final Map A0F;
    public final Map A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final String BVX() {
        return "legacy_screen";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C46645DiQ A01(android.os.Bundle r34) {
        /*
            r0 = r34
            java.lang.String r1 = "BloksSurfaceProps_isFlattenedBundle"
            boolean r1 = X.DbT.A1X(r0, r1)
            java.lang.String r8 = "BloksSurfaceProps"
            r5 = 0
            if (r1 != 0) goto L_0x0014
            android.os.Bundle r0 = r0.getBundle(r8)
            if (r0 != 0) goto L_0x0014
            return r5
        L_0x0014:
            java.lang.String r1 = "BloksSurfaceProps_params"
            java.io.Serializable r6 = r0.getSerializable(r1)
            r2 = -1
            java.lang.String r1 = "BloksSurfaceProps_ttrcListener"
            int r9 = r0.getInt(r1, r2)
            java.lang.String r1 = "BloksSurfaceProps_clientTreeParameters"
            java.lang.Integer r1 = X.DbV.A0o(r0, r1)
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Object r2 = X.C14615TzM.A02(r7, r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "BloksSurfaceProps_externalVariables"
            java.lang.Integer r1 = X.DbV.A0o(r0, r1)
            java.lang.Object r1 = X.C14615TzM.A02(r7, r1)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = "BloksSurfaceProps_objectSet"
            java.lang.Integer r4 = X.DbV.A0o(r0, r3)
            java.lang.Class<android.util.SparseArray> r3 = android.util.SparseArray.class
            java.lang.Object r14 = X.C14615TzM.A02(r3, r4)
            android.util.SparseArray r14 = (android.util.SparseArray) r14
            java.lang.String r3 = "BloksSurfaceProps_screenId"
            java.lang.String r21 = r0.getString(r3, r5)
            java.lang.String r3 = "BloksSurfaceProps_screenModel"
            java.lang.Integer r4 = X.DbV.A0o(r0, r3)
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Object r17 = X.C14615TzM.A02(r3, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Object r4 = X.C14615TzM.A02(r3, r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = "BloksSurfaceProps_analyticsExtras"
            java.lang.Integer r3 = X.DbV.A0o(r0, r3)
            java.lang.Object r3 = X.C14615TzM.A02(r7, r3)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r7 = "BloksSurfaceProps_fromConfigChanges"
            boolean r12 = r0.getBoolean(r7)
            java.lang.String r7 = "BloksSurfaceProps_containsExternalVariables"
            boolean r9 = r0.getBoolean(r7)
            java.lang.String r7 = "BloksSurfaceProps_containsClientParameters"
            boolean r11 = r0.getBoolean(r7)
            java.lang.String r7 = "BloksSurfaceProps_appId"
            java.lang.String r10 = r0.getString(r7)
            java.lang.String r7 = "BloksSurfaceProps_analyticsModule"
            java.lang.String r18 = r0.getString(r7)
            if (r9 == 0) goto L_0x0148
            if (r1 == 0) goto L_0x009b
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x0148
        L_0x009b:
            r9 = 1
        L_0x009c:
            if (r11 == 0) goto L_0x0142
            if (r2 == 0) goto L_0x00a6
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x0142
        L_0x00a6:
            if (r9 == 0) goto L_0x013e
            java.lang.String r11 = "clientParams & external variables"
        L_0x00aa:
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()
            java.lang.String r7 = "Expected non empty "
            r9.append(r7)
            r9.append(r11)
            java.lang.String r7 = "for appId: "
            r9.append(r7)
            r9.append(r10)
            java.lang.String r7 = " fromConfigChange: "
            r9.append(r7)
            r9.append(r12)
            java.lang.String r24 = r9.toString()
            r26 = 1
            r22 = r5
            r23 = r8
            r25 = r5
            r27 = r26
            X.1Kn.A01(r22, r23, r24, r25, r26, r27)
        L_0x00d7:
            boolean r7 = r6 instanceof java.util.HashMap
            if (r7 == 0) goto L_0x013c
            java.util.HashMap r6 = (java.util.HashMap) r6
        L_0x00dd:
            if (r2 != 0) goto L_0x00e3
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
        L_0x00e3:
            if (r1 != 0) goto L_0x00e9
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
        L_0x00e9:
            java.lang.String r7 = "BloksSurfaceProps_markerId"
            int r28 = r0.getInt(r7)
            java.lang.String r7 = "BloksSurfaceProps_instanceId"
            int r27 = r0.getInt(r7)
            r7 = 86400(0x15180, double:4.26873E-319)
            java.lang.String r9 = "BloksSurfaceProps_preloadTtl"
            long r31 = r0.getLong(r9, r7)
            java.lang.String r7 = "BloksSurfaceProps_cacheKey"
            java.lang.String r20 = r0.getString(r7, r5)
            java.lang.String r5 = "BloksSurfaceProps_backupStartTimeStamp"
            long r29 = r0.getLong(r5)
            if (r4 != 0) goto L_0x0110
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
        L_0x0110:
            java.lang.String r5 = "BloksSurfaceProps_syncScreen"
            boolean r33 = r0.getBoolean(r5)
            if (r3 != 0) goto L_0x011c
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
        L_0x011c:
            java.lang.String r5 = "BloksSurfaceProps_lifecycleOnNavigateTo"
            X.G6j r16 = X.C46646DiR.A00(r0, r5)
            java.lang.String r5 = "BloksSurfaceProps_lifecycleOnNavigateFrom"
            X.G6j r15 = X.C46646DiR.A00(r0, r5)
            X.DiQ r13 = new X.DiQ
            r26 = r1
            r34 = r12
            r22 = r6
            r23 = r4
            r24 = r3
            r25 = r2
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r34)
            return r13
        L_0x013c:
            r6 = 0
            goto L_0x00dd
        L_0x013e:
            java.lang.String r11 = "clientParams"
            goto L_0x00aa
        L_0x0142:
            if (r9 == 0) goto L_0x00d7
            java.lang.String r11 = "external variables"
            goto L_0x00aa
        L_0x0148:
            r9 = 0
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46645DiQ.A01(android.os.Bundle):X.DiQ");
    }

    public static void A02(Bundle bundle, C46645DiQ diQ, boolean z) {
        if (diQ != null) {
            bundle.putString("__nav_data_type", "legacy_screen");
            if (z) {
                bundle.putBoolean("BloksSurfaceProps_isFlattenedBundle", true);
                bundle.putAll(A00(diQ, false));
                return;
            }
            bundle.putBundle("BloksSurfaceProps", A00(diQ, false));
        }
    }

    public final String Ac5() {
        return this.A09;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C46645DiQ)) {
            return false;
        }
        C46645DiQ diQ = (C46645DiQ) obj;
        String str = this.A09;
        String str2 = diQ.A09;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A0C.equals(diQ.A0C)) {
            return false;
        }
        String str3 = this.A0A;
        boolean isEmpty = TextUtils.isEmpty(str3);
        String str4 = diQ.A0A;
        if (isEmpty) {
            equals = TextUtils.isEmpty(str4);
        } else {
            equals = str3.equals(str4);
        }
        if (equals) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.A09;
        HashMap hashMap = this.A0C;
        String str2 = this.A0A;
        int A0E2 = (AnonymousClass7TG.A0E(str) * 31) + AnonymousClass7TE.A0L(hashMap);
        if (!TextUtils.isEmpty(str2)) {
            return C41845B3m.A01(str2, A0E2 * 31);
        }
        return A0E2;
    }

    public static Bundle A00(C46645DiQ diQ, boolean z) {
        long j;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("BloksSurfaceProps_appId", diQ.A09);
        A0a.putString("BloksSurfaceProps_analyticsModule", diQ.A08);
        A0a.putSerializable("BloksSurfaceProps_params", diQ.A0C);
        A0a.putInt("BloksSurfaceProps_markerId", diQ.A01);
        A0a.putInt("BloksSurfaceProps_instanceId", diQ.A00);
        A0a.putLong("BloksSurfaceProps_preloadTtl", diQ.A03);
        Map map = diQ.A0G;
        A0a.putBoolean("BloksSurfaceProps_containsExternalVariables", !map.isEmpty());
        A0a.putInt("BloksSurfaceProps_externalVariables", C14615TzM.A00(map));
        Map map2 = diQ.A0F;
        A0a.putInt("BloksSurfaceProps_clientTreeParameters", C14615TzM.A00(map2));
        A0a.putBoolean("BloksSurfaceProps_containsClientParameters", !map2.isEmpty());
        A0a.putString("BloksSurfaceProps_cacheKey", diQ.A0A);
        if (z) {
            j = -1;
        } else {
            j = diQ.A02;
        }
        A0a.putLong("BloksSurfaceProps_backupStartTimeStamp", j);
        A0a.putInt("BloksSurfaceProps_ttrcListener", C14615TzM.A00(diQ.A0D));
        A0a.putBoolean("BloksSurfaceProps_fromConfigChanges", z);
        SparseArray sparseArray = diQ.A04;
        if (sparseArray != null) {
            A0a.putInt("BloksSurfaceProps_objectSet", C14615TzM.A00(sparseArray));
        }
        String str = diQ.A0B;
        if (str != null) {
            A0a.putString("BloksSurfaceProps_screenId", str);
        }
        Object obj = diQ.A07;
        if (obj != null) {
            A0a.putInt("BloksSurfaceProps_screenModel", C14615TzM.A00(obj));
        }
        A0a.putInt("BloksSurfaceProps_analyticsExtras", C14615TzM.A00(diQ.A0E));
        C46646DiR.A01(A0a, diQ.A06, "BloksSurfaceProps_lifecycleOnNavigateTo");
        C46646DiR.A01(A0a, diQ.A05, "BloksSurfaceProps_lifecycleOnNavigateFrom");
        A0a.putBoolean("BloksSurfaceProps_syncScreen", diQ.A0I);
        return A0a;
    }

    public C46645DiQ(SparseArray sparseArray, C51893G6j g6j, C51893G6j g6j2, Object obj, String str, String str2, String str3, String str4, HashMap hashMap, List list, Map map, Map map2, Map map3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        Map map4 = map;
        long j3 = j2;
        int i3 = i;
        long j4 = j;
        int i4 = i2;
        Map map5 = map3;
        Map map6 = map2;
        String str5 = str2;
        this.A09 = str5;
        this.A08 = str;
        this.A0C = hashMap == null ? AnonymousClass7TE.A1E() : hashMap;
        this.A0F = map2 == null ? AnonymousClass7TE.A1E() : map6;
        this.A0G = map3 == null ? AnonymousClass7TE.A1E() : map5;
        this.A01 = i2 <= 0 ? 719983200 : i4;
        String str6 = str3;
        if (i3 == -1) {
            i3 = (AnonymousClass7TG.A0E(str5) * 31) + AnonymousClass7TE.A0L(hashMap);
            i3 = !TextUtils.isEmpty(str6) ? C41845B3m.A01(str6, i3 * 31) : i3;
            synchronized (C49820F8i.class) {
                LruCache lruCache = C49820F8i.A00;
                Integer valueOf = Integer.valueOf(i3);
                Integer num = (Integer) lruCache.get(valueOf);
                i3 = num != null ? (num.intValue() + 1) * 31 : i3;
                lruCache.put(valueOf, Integer.valueOf(i3));
            }
        }
        this.A00 = i3;
        this.A03 = j2 == -1 ? SandboxRepository.CACHE_TTL : j3;
        this.A0A = str6;
        this.A02 = j == -1 ? AwakeTimeSinceBootClock.INSTANCE.now() : j4;
        this.A0D = list;
        this.A0H = z2;
        this.A04 = sparseArray == null ? new SparseArray() : sparseArray;
        this.A0B = str4;
        this.A07 = obj;
        this.A0E = map == null ? AnonymousClass7TE.A1E() : map4;
        this.A06 = g6j2;
        this.A05 = g6j;
        this.A0I = z;
    }

    public C46645DiQ(SparseArray sparseArray, Object obj, String str, String str2, String str3, HashMap hashMap, List list, Map map, Map map2, Map map3, int i, boolean z) {
        int i2 = i;
        Map map4 = map3;
        Map map5 = map2;
        this.A09 = str;
        this.A08 = null;
        this.A0C = hashMap == null ? AnonymousClass7TE.A1E() : hashMap;
        this.A0F = map2 == null ? AnonymousClass7TE.A1E() : map5;
        this.A0G = map3 == null ? AnonymousClass7TE.A1E() : map4;
        this.A01 = i <= 0 ? 719983200 : i2;
        int A0E2 = (AnonymousClass7TG.A0E(str) * 31) + AnonymousClass7TE.A0L(hashMap);
        A0E2 = !TextUtils.isEmpty(str2) ? C41845B3m.A01(str2, A0E2 * 31) : A0E2;
        synchronized (C49820F8i.class) {
            LruCache lruCache = C49820F8i.A00;
            Integer valueOf = Integer.valueOf(A0E2);
            Integer num = (Integer) lruCache.get(valueOf);
            A0E2 = num != null ? (num.intValue() + 1) * 31 : A0E2;
            lruCache.put(valueOf, Integer.valueOf(A0E2));
        }
        this.A00 = A0E2;
        this.A03 = SandboxRepository.CACHE_TTL;
        this.A0A = str2;
        this.A02 = AwakeTimeSinceBootClock.INSTANCE.now();
        this.A0D = list;
        this.A0H = false;
        this.A04 = sparseArray == null ? new SparseArray() : sparseArray;
        this.A0B = str3;
        this.A07 = obj;
        this.A0E = map == null ? AnonymousClass7TE.A1E() : map;
        this.A06 = null;
        this.A05 = null;
        this.A0I = z;
    }
}
