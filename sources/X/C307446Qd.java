package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Qd  reason: invalid class name and case insensitive filesystem */
public final class C307446Qd {
    public static final Handler A0O = new Handler(Looper.getMainLooper());
    public int A00;
    public Q3O A01;
    public C307776Rk A02;
    public C307826Rq A03;
    public C307456Qe A04 = new C307456Qe();
    public AnonymousClass6SE A05;
    public C276544tV A06;
    public C276694tk A07;
    public Map A08 = Collections.emptyMap();
    public C3034368u A09;
    public WeakReference A0A = new WeakReference((Object) null);
    public boolean A0B = false;
    public boolean A0C = false;
    public final C307436Qc A0D;
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final List A0G = new ArrayList();
    public final Map A0H = new HashMap();
    public final Map A0I = new HashMap();
    public final C229652no A0J;
    public final Object A0K = new Object();
    public final Runnable A0L = new C307466Qf(this);
    public final List A0M = new ArrayList();
    public volatile boolean A0N;

    private Pair A00(List list) {
        Pair pair;
        C3034468v r3;
        ArrayList<C11015S5m> arrayList;
        Map map;
        Map map2;
        List list2;
        Object obj;
        Runnable runnable;
        1KZ.A01("Bloks ProcessResources");
        LinkedList linkedList = new LinkedList(list);
        ArrayList arrayList2 = new ArrayList();
        C307786Rm r9 = (C307786Rm) this.A0A.get();
        boolean z = false;
        if (r9 == null) {
            pair = new Pair(false, new ArrayList());
        } else {
            C307456Qe r8 = this.A04;
            while (!linkedList.isEmpty()) {
                C3034368u r0 = (C3034368u) linkedList.poll();
                if (!(r0 == null || (r3 = r0.A01) == null)) {
                    C276544tV r4 = r0.A02;
                    C307456Qe A042 = this.A04.A04(r3.A06);
                    this.A04 = A042;
                    C307456Qe A002 = A042.A00(r3.A00);
                    this.A04 = A002;
                    C307456Qe A012 = A002.A01(r3.A03);
                    this.A04 = A012;
                    C307456Qe A052 = A012.A05(r3.A07);
                    this.A04 = A052;
                    this.A04 = A052.A02(r3.A04);
                    List list3 = null;
                    HashMap hashMap = null;
                    HashMap hashMap2 = null;
                    for (C276504tR r13 : r3.A05) {
                        C276494tQ r14 = (C276494tQ) r13;
                        String str = r14.A00;
                        if (hashMap != null) {
                            map = hashMap;
                        } else {
                            map = this.A04.A07;
                        }
                        if (!map.containsKey(str)) {
                            if (hashMap == null) {
                                hashMap = new HashMap(this.A04.A07);
                            }
                            hashMap.put(str, r13);
                        }
                        if (hashMap2 != null) {
                            map2 = hashMap2;
                        } else {
                            map2 = this.A04.A08;
                        }
                        if (!map2.containsKey(str)) {
                            if (r4 != null) {
                                list2 = r4.A09;
                            } else {
                                list2 = null;
                            }
                            C307896Rx A013 = C307886Rw.A01(r9, this.A04, list2);
                            String str2 = r14.A01;
                            AnonymousClass6RV A032 = C307476Qg.A03(r9, str2);
                            AnonymousClass6RZ A043 = C307476Qg.A04(r9, str2);
                            if (A032 != null) {
                                C13752TgO BH5 = A032.BH5(A013, r13, (Object) null);
                                obj = BH5.BHB();
                                runnable = BH5.AIV(r9, this, this.A0J);
                            } else if (A043 != null) {
                                C45273Ctc EpY = A043.EpY(r9, A013, this, r13, this.A0J);
                                obj = EpY.A00;
                                runnable = EpY.A01;
                            } else {
                                th = new RuntimeException(002.A0R("Missing variable module with type: ", str2));
                                throw th;
                            }
                            this.A02.A01(runnable);
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap(this.A04.A08);
                            }
                            hashMap2.put(str, obj);
                        }
                    }
                    C307456Qe A072 = this.A04.A07(hashMap, hashMap2);
                    this.A04 = A072;
                    if (r4 != null) {
                        list3 = r4.A09;
                    }
                    C307896Rx A014 = C307886Rw.A01(r9, A072, list3);
                    List<Q37> list4 = r3.A01;
                    if (list4 == null || list4.isEmpty()) {
                        try {
                            arrayList = new ArrayList<>();
                        } catch (Throwable th) {
                            1KZ.A00();
                            throw th;
                        }
                    } else {
                        1KZ.A01("Initialize BloksComponentQueryManager");
                        try {
                            if (this.A01 == null) {
                                AnonymousClass6RB r2 = (AnonymousClass6RB) r9.A00(R.id.bk_context_key_async_component_store);
                                if (r2 != null) {
                                    this.A01 = new Q3O(this.A02, this, r2);
                                } else {
                                    th = new RuntimeException("Attempting to process async components but missing component query store");
                                    throw th;
                                }
                            }
                            1KZ.A00();
                            1KZ.A01("Bloks Setup AsyncComponentQueries");
                            Q3O q3o = this.A01;
                            ArrayList arrayList3 = new ArrayList();
                            for (Q37 q37 : list4) {
                                String str3 = (String) Q3I.A00(A014, q37.A00, "appId");
                                if (str3 != null) {
                                    0sm r32 = (Map) Q3I.A00(A014, q37.A03, "params");
                                    if (r32 == null) {
                                        r32 = 0Yt.A0E();
                                    }
                                    Long l = (Long) Q3I.A00(A014, q37.A01, "cacheTtlSeconds");
                                    if (l != null) {
                                        HPH A022 = q3o.A02.A02(str3, r32, new J6W(12, A014, q37, q3o), l.longValue(), q37.A07);
                                        if (A022 instanceof C52691Gb3) {
                                            q3o.A00.A01(((C52691Gb3) A022).A00);
                                        } else if (A022 instanceof H5C) {
                                            arrayList3.add(new 0eP(q37, ((H5C) A022).A00));
                                        } else {
                                            th = new RuntimeException();
                                            throw th;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            synchronized (q3o.A03) {
                                ArrayList arrayList4 = new ArrayList(0Yv.A1E(arrayList3, 10));
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    0eP r02 = (0eP) it.next();
                                    arrayList4.add(Q3O.A00(q3o, A014, (C7310Q3m) r02.A01, (Q37) r02.A00, AnonymousClass05K.A00));
                                }
                                arrayList = 0Yv.A1F(arrayList4);
                            }
                            1KZ.A00();
                        } catch (Throwable th2) {
                            th = th2;
                            1KZ.A00();
                        }
                    }
                    for (C11015S5m s5m : arrayList) {
                        Q4Q q4q = s5m.A01;
                        Q3P q3p = s5m.A00;
                        if (q4q != null) {
                            linkedList.add(q4q.A00);
                            arrayList2.add(new Pair(q4q.A01, q4q.A02));
                        }
                        this.A04 = this.A04.A06(0se.A0M(new 0eP(q3p.A01, q3p.A00)));
                    }
                }
            }
            if (this.A04 != r8) {
                z = true;
            }
            pair = new Pair(Boolean.valueOf(z), arrayList2);
        }
        1KZ.A00();
        return pair;
    }

    private C276544tV A01(List list) {
        1KZ.A01("Bloks SnapshotComponent");
        C276544tV r0 = this.A06;
        try {
            if (!list.isEmpty()) {
                r0 = C7288Q2n.A00((C276634te) null, new C7309Q3l(list), r0);
            }
            return r0;
        } finally {
            1KZ.A00();
        }
    }

    public static void A02(C307446Qd r2) {
        synchronized (r2.A0K) {
            if (!r2.A0C) {
                r2.A0B = true;
                return;
            }
            Handler handler = A0O;
            Runnable runnable = r2.A0L;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final AnonymousClass6S3 A04(C307786Rm r12, C307826Rq r13, Map map) {
        C307456Qe r1 = this.A04;
        Map map2 = map;
        if (!map.isEmpty() || !r1.A03.isEmpty()) {
            r1 = new C307456Qe(r1.A00, r1.A07, r1.A04, r1.A08, map2, r1.A02, r1.A05, r1.A06, r1.A01);
        }
        this.A04 = r1;
        this.A02 = new C307776Rk(r12.A00);
        Map map3 = (Map) r12.A01.get(R.id.bk_context_key_data_modules);
        if (map3 == null) {
            map3 = Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(map3.size());
        Iterator it = map3.entrySet().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C307856Rt Bx9 = ((AnonymousClass6RV) entry.getValue()).Bx9(r12, this);
            Object key = entry.getKey();
            if (Bx9 != null) {
                obj = Bx9.A00;
            }
            hashMap.put(key, obj);
            if (Bx9 != null) {
                this.A02.A01(Bx9.A01);
            }
        }
        this.A04 = this.A04.A03(hashMap);
        this.A0A = new WeakReference(r12);
        this.A03 = r13;
        Pair A002 = A00(Collections.singletonList(this.A09));
        this.A09 = null;
        if (!((List) A002.second).isEmpty()) {
            this.A06 = A01((List) A002.second);
        }
        synchronized (this.A0K) {
            this.A0C = true;
            if (this.A0B) {
                A02(this);
            }
        }
        return new AnonymousClass6S3(this.A04, this.A06);
    }

    public final C276544tV A05() {
        if (this.A07 != null) {
            return this.A06;
        }
        AnonymousClass6SE r0 = this.A05;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final C276544tV A06() {
        if (this.A0N) {
            1Kn.A02("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
        }
        C245983dn.A02("Tree operations are only supported from the UI Thread");
        return A01(this.A0M);
    }

    public final void A08() {
        boolean z;
        if (!this.A0N) {
            C245983dn.A02("Tree operations are only supported from the UI Thread");
            Map map = this.A0I;
            boolean z2 = true;
            if (!map.isEmpty()) {
                this.A04 = this.A04.A06(map);
                map.clear();
                z = true;
            } else {
                z = false;
            }
            Map map2 = this.A0H;
            if (!map2.isEmpty()) {
                this.A04 = this.A04.A03(map2);
            }
            List list = this.A0G;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                Pair A002 = A00(arrayList);
                z |= ((Boolean) A002.first).booleanValue();
                this.A0M.addAll((Collection) A002.second);
            }
            1KZ.A01("Bloks ModelMutation");
            List list2 = this.A0M;
            C276544tV A012 = A01(list2);
            if (this.A06 == A012) {
                z2 = false;
            }
            boolean z3 = z | z2;
            this.A06 = A012;
            list2.clear();
            1KZ.A00();
            C307826Rq r3 = this.A03;
            if (r3 != null && z3) {
                r3.DUH(new AnonymousClass6S3(this.A04, this.A06));
            }
        }
    }

    public final void A09(C3034368u r3, Map map) {
        C245983dn.A02("Tree operations are only supported from the UI Thread");
        this.A0M.addAll((Collection) A00(Collections.singletonList(r3)).second);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.A04.A08);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!hashMap.isEmpty()) {
            this.A04 = this.A04.A06(hashMap);
            hashMap.putAll(this.A08);
            this.A08 = hashMap;
        }
    }

    public final void A0A(Q3P q3p) {
        C245983dn.A02("Tree operations are only supported from the UI Thread");
        Map A0M2 = 0se.A0M(new 0eP(q3p.A01, q3p.A00));
        this.A04 = this.A04.A06(A0M2);
        this.A08.putAll(A0M2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r3 != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C9108RPf r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0N
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.C245983dn.A02(r0)
            boolean r4 = r6 instanceof X.Q3P
            if (r4 != 0) goto L_0x0024
            boolean r0 = r6 instanceof X.Q3G
            if (r0 == 0) goto L_0x0050
            r3 = r6
            X.Q3G r3 = (X.Q3G) r3
            if (r3 == 0) goto L_0x0024
        L_0x0016:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C276614tc.A02
            r0.incrementAndGet()
            java.util.Map r2 = r5.A0H
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            r2.put(r1, r0)
        L_0x0024:
            if (r4 == 0) goto L_0x003c
            X.Q3P r6 = (X.Q3P) r6
            if (r6 == 0) goto L_0x003b
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C276614tc.A06
            r0.incrementAndGet()
            java.util.Map r2 = r5.A0I
            java.lang.String r1 = r6.A01
            java.lang.Object r0 = r6.A00
            r2.put(r1, r0)
            A02(r5)
        L_0x003b:
            return
        L_0x003c:
            boolean r0 = r6 instanceof X.Q3G
            if (r0 != 0) goto L_0x003b
            boolean r0 = r6 instanceof X.Q4M
            if (r0 == 0) goto L_0x0061
            X.Q4M r6 = (X.Q4M) r6
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            X.Q3P r6 = new X.Q3P
            r6.<init>(r1, r0)
            goto L_0x002a
        L_0x0050:
            boolean r0 = r6 instanceof X.Q4M
            if (r0 == 0) goto L_0x0067
            r0 = r6
            X.Q4M r0 = (X.Q4M) r0
            java.lang.String r1 = r0.A02
            java.lang.Object r0 = r0.A00
            X.Q3G r3 = new X.Q3G
            r3.<init>(r1, r0)
            goto L_0x0016
        L_0x0061:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0067:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307446Qd.A0B(X.RPf):void");
    }

    public final void A0C(AnonymousClass6SE r8, int i) {
        int i2;
        C299065uW[] r3;
        String str;
        String str2;
        C245983dn.A02("Committing Variables and Bound tree is only supported from the UI Thread");
        this.A05 = r8;
        C307786Rm r6 = (C307786Rm) this.A0A.get();
        List<C3034468v> list = r8.A05;
        for (C3034468v r32 : list) {
            this.A04 = this.A04.A04(r32.A06).A00(r32.A00).A01(r32.A03).A05(r32.A07).A02(r32.A04);
        }
        list.clear();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = r8.A03;
        for (Map.Entry entry : hashMap2.entrySet()) {
            C13752TgO tgO = (C13752TgO) entry.getValue();
            hashMap.put(entry.getKey(), tgO.BHB());
            tgO.AIV(r6, this, this.A0J);
        }
        hashMap2.clear();
        this.A04 = this.A04.A06(hashMap);
        this.A08 = r8.A08;
        List list2 = this.A0E;
        synchronized (list2) {
            r3 = (C299065uW[]) list2.toArray(new C299065uW[0]);
        }
        for (C299065uW D4y : r3) {
            D4y.D4y(this.A08, i);
        }
        if (r6 != null) {
            for (C46600Dhg dhg : r8.A04) {
                C276544tV r0 = dhg.A01;
                Object A062 = C307476Qg.A06(r6, r0);
                if (A062 == null) {
                    str = "BloksTreeManager";
                    str2 = "Binding was targeting a controller but the returned controller was null";
                } else {
                    int i3 = r0.A04;
                    int i4 = dhg.A00;
                    Object obj = dhg.A02;
                    if (i3 == 13688) {
                        C308246Th r4 = (C308246Th) A062;
                        if (obj == null) {
                            str = "ViewTransformsBindControllerOverride";
                            str2 = "Trying to set null value for a view transform property";
                        } else {
                            r4.EOz((C307786Rm) null, obj, i4);
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i3)}));
                    }
                }
                1Kn.A02(str, str2);
            }
        }
    }

    public final void A0D(C13670Tee tee, Q42 q42) {
        if (!this.A0N) {
            C245983dn.A02("Tree operations are only supported from the UI Thread");
            this.A0M.add(new Pair(tee, q42));
        }
    }

    public final void A0E(Q42 q42, long j) {
        A0D(new Q4L(j), q42);
    }

    public final void A0F(C276694tk r6, int i) {
        C276694tk r0;
        int i2;
        C299065uW[] r3;
        C245983dn.A02("Evaluation Context can only be set from the UI Thread");
        C276694tk r2 = this.A07;
        if (r2 == null) {
            r0 = r6;
        } else if (r2.A03 != r6.A03) {
            r2.A01.A03.A00(AnonymousClass05K.A0C);
            r0 = r6.A01(r2.A03);
        } else {
            return;
        }
        this.A07 = r0;
        this.A08 = new HashMap(r6.A01.A00.A08);
        this.A07.A01.A03.A00(AnonymousClass05K.A01);
        List list = this.A0E;
        synchronized (list) {
            r3 = (C299065uW[]) list.toArray(new C299065uW[0]);
        }
        for (C299065uW D4y : r3) {
            D4y.D4y(this.A08, i);
        }
    }

    public final void A0G(Object obj, Object obj2, String str, String str2) {
        A03(new Q4N(this, obj, obj2, str, str2));
    }

    public C307446Qd(C3034368u r3, C229652no r4, C307436Qc r5) {
        this.A06 = r3.A02;
        this.A09 = r3;
        this.A0J = r4;
        this.A0D = r5;
    }

    public static void A03(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A0O.post(runnable);
        }
    }

    public final void A07() {
        if (C245983dn.A03()) {
            int i = this.A00;
            if (i > 0) {
                int i2 = i - 1;
                this.A00 = i2;
                if (i2 == 0 && this.A0M.size() > 0) {
                    A08();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Negative recursion level.");
        }
    }
}
