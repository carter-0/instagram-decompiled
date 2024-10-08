package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class I75 {
    public final AnonymousClass72Q A00;
    public final HashMap A01;
    public final LruCache A02;
    public final 1Av A03;
    public final HashMap A04;

    public I75(Context context, UserSession userSession, 1Av r4) {
        0qQ.A0B(r4, 3);
        this.A03 = r4;
        C359358ch A0B = r4.A0B();
        this.A02 = A0B == null ? C359348cg.A00() : A0B;
        this.A00 = new AnonymousClass72Q(context, userSession);
        this.A04 = AnonymousClass7TE.A1E();
        this.A01 = AnonymousClass7TE.A1E();
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.I75 r8, java.lang.String r9, java.util.List r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 28
            boolean r0 = X.C66147MDz.A02(r3, r11)
            if (r0 == 0) goto L_0x00bf
            r7 = r11
            X.MDz r7 = (X.C66147MDz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r6) goto L_0x00cb
            java.lang.Object r4 = r7.A03
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r9 = r7.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r7.A01
            X.I75 r8 = (X.I75) r8
            X.0eS.A00(r1)
        L_0x0030:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0042
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c6
            r0 = 0
            A05(r0)
            X.5sO r1 = X.DbU.A0f()
        L_0x0042:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0052
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            A03(r8, r9, r0, r4)
        L_0x004f:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0052:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005b:
            X.0eS.A00(r1)
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            A04(r8, r10, r0, r4)
            X.72Q r3 = r8.A00
            r7.A01 = r8
            r7.A02 = r9
            r7.A03 = r4
            r7.A00 = r6
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008d
            X.1Xj r0 = X.C51966G9m.A0t(r1)
            com.instagram.common.gallery.Medium r0 = r3.A00(r0)
            r2.add(r0)
            goto L_0x007b
        L_0x008d:
            r0 = 0
            X.5g0 r3 = r3.A01(r2, r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02
            X.4D7 r0 = X.1Ey.A02(r7)
            X.1IW r2 = new X.1IW
            r2.<init>(r6, r0)
            r2.A0I()
            r1 = 4
            X.EHO r0 = new X.EHO
            r0.<init>(r1, r2, r8)
            r3.A00 = r0
            r0 = 29
            X.J6f r0 = X.C59097J6f.A01(r3, r0)
            r2.CO0(r0)
            r1 = 1394228119(0x531a3b97, float:6.6242472E11)
            r0 = 0
            X.1ES.A06(r3, r1, r0)
            java.lang.Object r1 = r2.A0E()
            if (r1 != r5) goto L_0x0030
            return r5
        L_0x00bf:
            X.MDz r7 = new X.MDz
            r7.<init>(r8, r11, r3)
            goto L_0x0016
        L_0x00c6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I75.A00(X.I75, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.I75 r5, java.lang.String r6, java.util.List r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 24
            boolean r0 = X.C66131MDj.A01(r3, r8)
            if (r0 == 0) goto L_0x005a
            r4 = r8
            X.MDj r4 = (X.C66131MDj) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r1) goto L_0x0060
            java.lang.Object r6 = r4.A02
            java.lang.Object r5 = r4.A01
            X.I75 r5 = (X.I75) r5
            X.0eS.A00(r2)
        L_0x002a:
            java.util.HashMap r0 = r5.A04
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L_0x0047
            X.0wj r2 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsAutoCreatedReelsMediaFetcher"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Failed to get medium list from downloading source media"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x0047:
            return r3
        L_0x0048:
            X.0eS.A00(r2)
            java.util.HashMap r0 = r5.A01
            r0.put(r6, r7)
            X.C51966G9m.A1P(r5, r6, r4, r1)
            java.lang.Object r0 = A00(r5, r6, r7, r4)
            if (r0 != r3) goto L_0x002a
            return r3
        L_0x005a:
            X.MDj r4 = new X.MDj
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I75.A01(X.I75, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    public static final List A02(I75 i75, String str) {
        Object obj;
        List list = (List) i75.A01.get(str);
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            LruCache lruCache = i75.A02;
            if (!(lruCache == null || (obj = lruCache.get(A0t.A2n())) == null)) {
                A1C.add(obj);
            }
        }
        HashMap hashMap = i75.A04;
        hashMap.put(str, A1C);
        return (List) hashMap.get(str);
    }

    public static final void A05(Exception exc) {
        AnonymousClass7TF.A19(0wj.A01.AEf("ClipsAutoCreatedReelsMediaFetcher", 817902720), DialogModule.KEY_MESSAGE, "getRemoteMediaTask failed", exc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.I75 r5, java.lang.String r6) {
        /*
            java.util.HashMap r0 = r5.A01
            java.lang.Object r1 = r0.get(r6)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0017
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0017
        L_0x0015:
            r4 = 1
        L_0x0016:
            return r4
        L_0x0017:
            java.util.Iterator r3 = r1.iterator()
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0015
            X.1Xj r0 = X.C51966G9m.A0t(r3)
            android.util.LruCache r1 = r5.A02
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = r1.get(r0)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            r1 = 1
            if (r2 == 0) goto L_0x0016
            boolean r0 = r2.A06()
            if (r0 != r1) goto L_0x0016
            java.lang.String r1 = r2.A0X
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0016
            goto L_0x001b
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I75.A06(X.I75, java.lang.String):boolean");
    }

    public static final void A03(I75 i75, String str, List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = (Medium) it.next();
            LruCache lruCache = i75.A02;
            if (lruCache != null) {
                lruCache.put(medium.A0Y, medium);
            }
            map.put(medium.A0Y, medium);
        }
        LruCache lruCache2 = i75.A02;
        if (lruCache2 != null) {
            i75.A03.A0n(lruCache2);
        }
        i75.A04.put(str, 00k.A0X(00k.A0a(map.values())));
    }

    public static final void A04(I75 i75, List list, List list2, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            String A2n = A0t.A2n();
            if (A2n != null) {
                map.remove(A2n);
                LruCache lruCache = i75.A02;
                if (lruCache != null) {
                    String A2n2 = A0t.A2n();
                    if (A2n2 != null) {
                        Medium medium = (Medium) lruCache.get(A2n2);
                        if (medium != null && medium.A06() && new File(medium.A0X).exists()) {
                            String A2n3 = A0t.A2n();
                            if (A2n3 != null) {
                                map.put(A2n3, medium);
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                list2.add(A0t);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final Object A07(List list, String str, AnonymousClass4D7 r7) {
        if (!A06(this, str)) {
            return A01(this, str, list, r7);
        }
        List A022 = A02(this, str);
        if (A022 == null) {
            0f9 AEf = 0wj.A01.AEf("ClipsAutoCreatedReelsMediaFetcher", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Failed to get from existing mediums");
            AEf.report();
        }
        return A022;
    }
}
