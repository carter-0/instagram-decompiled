package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: X.6RB  reason: invalid class name */
public final class AnonymousClass6RB {
    public static final Handler A0E = new Handler(Looper.getMainLooper());
    public AnonymousClass6RN A00;
    public final Handler A01;
    public final C307616Qu A02;
    public final C229702nt A03;
    public final AnonymousClass6Q4 A04;
    public final AnonymousClass6RQ A05;
    public final AnonymousClass6RD A06;
    public final AnonymousClass6RA A07;
    public final AnonymousClass6R0 A08 = new AnonymousClass6R0();
    public final Object A09;
    public final Object A0A;
    public final Runnable A0B;
    public final List A0C;
    public final Executor A0D;

    public AnonymousClass6RB(C307616Qu r9, C229702nt r10, AnonymousClass6Q4 r11, C307556Qo r12, C307636Qw r13, AnonymousClass6RA r14) {
        AnonymousClass6RK r3;
        AnonymousClass6RN r1;
        AnonymousClass6RO r0;
        0qQ.A0B(r12, 4);
        Handler handler = new Handler(AnonymousClass6RC.A00.getLooper());
        AnonymousClass6RD r02 = new AnonymousClass6RD(r9, r12, r13, r14);
        this.A04 = r11;
        this.A03 = r10;
        this.A01 = handler;
        this.A06 = r02;
        this.A07 = r14;
        this.A02 = r9;
        Object obj = new Object();
        this.A0A = obj;
        synchronized (obj) {
            AnonymousClass6RE r32 = new AnonymousClass6RE(this);
            synchronized (r14.A04) {
                AnonymousClass6RK A012 = r14.A02.A01(new AnonymousClass6RG(r14, r32));
                AnonymousClass6R6 r2 = r14.A03;
                AnonymousClass6RL r03 = null;
                if (r2 != null) {
                    r3 = r2.A01(new AnonymousClass6RM(r14, r32));
                } else {
                    r3 = null;
                }
                r1 = new AnonymousClass6RN((AnonymousClass6RL) A012.A00, r3 != null ? (AnonymousClass6RL) r3.A00 : r03);
                r14.A00 = r1;
                r0 = new AnonymousClass6RO(A012, r3);
            }
            this.A00 = r1;
            this.A0B = r0;
        }
        this.A09 = new Object();
        this.A0D = new AnonymousClass6RP(handler);
        this.A0C = new ArrayList();
        AnonymousClass6RQ r15 = new AnonymousClass6RQ(this);
        this.A05 = r15;
        r11.A00.add(r15);
    }

    public final HPH A02(String str, Map map, 0sP r13, long j, boolean z) {
        C307576Qq r0;
        HPH A002;
        C307616Qu r02 = this.A02;
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = null;
        }
        String str2 = str;
        String A003 = Q32.A00(r0, str, map);
        synchronized (this.A09) {
            A002 = A00(this, (AnonymousClass6RN) null, str2, A003, j, z);
            if (A002 == null) {
                C21117XFh xFh = new C21117XFh(A003, r13, new AnonymousClass9LG(this, 8));
                this.A0C.add(xFh);
                A002 = new C52691Gb3(new C21120XFk(xFh));
            }
        }
        return A002;
    }

    public final void A03(Q3K q3k, JPG jpg, String str, Map map, Set set, long j, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        Map map2 = map;
        0qQ.A0B(map2, 1);
        0qQ.A0B(q3k, 5);
        this.A0D.execute(new Q38(q3k, this, jpg, str, map2, set, j, z, z2));
    }

    public final void A04(String str, Map map, Set set) {
        0qQ.A0B(str, 0);
        0qQ.A0B(map, 1);
        0qQ.A0B(set, 2);
        C307616Qu r1 = this.A02;
        C307576Qq r0 = null;
        if (r1 != null) {
            r0 = r1.A00;
        }
        String A002 = Q32.A00(r0, str, map);
        AnonymousClass6R6 A003 = this.A07.A00(str);
        0qQ.A0B(A002, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((REH) it.next()).ordinal();
            if (ordinal == 0) {
                A003.A01.A01(A002);
            } else if (ordinal == 1) {
                AnonymousClass6R2 r02 = A003.A00;
                r02.A04.execute(new FutureTask(new TNF(r02, A002)));
            } else {
                throw new RuntimeException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (X.Q32.A04(r3.A01, r3.A00, r10, r12) != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(java.lang.String r15, java.util.Map r16, java.util.Set r17, long r18) {
        /*
            r14 = this;
            r4 = 0
            r6 = 1
            r5 = r17
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0072
            X.6Qu r1 = r14.A02
            r0 = 0
            if (r1 == 0) goto L_0x0011
            X.6Qq r0 = r1.A00
        L_0x0011:
            r1 = r16
            java.lang.String r1 = X.Q32.A00(r0, r15, r1)
            X.6RA r0 = r14.A07
            X.6R6 r2 = r0.A00(r15)
            X.REH r0 = X.REH.MEMORY
            boolean r0 = r5.contains(r0)
            r10 = r18
            if (r0 == 0) goto L_0x0047
            X.0qQ.A0B(r1, r4)
            X.0JR r0 = r2.A02
            long r12 = r0.now()
            X.6Qy r0 = r2.A01
            X.Q3r r3 = r0.EzP(r1)
            if (r3 == 0) goto L_0x0047
            boolean r0 = r3 instanceof X.C7317Q3t
            if (r0 == 0) goto L_0x0047
            long r8 = r3.A00
            X.Q3K r7 = r3.A01
            boolean r0 = X.Q32.A04(r7, r8, r10, r12)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            return r6
        L_0x0047:
            X.REH r0 = X.REH.DISK
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0072
            r6 = 0
            X.0qQ.A0B(r1, r4)
            X.6R2 r0 = r2.A00
            java.util.concurrent.atomic.AtomicReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r1)
            X.Q41 r1 = (X.Q41) r1
            if (r1 == 0) goto L_0x0046
            X.0JR r0 = r2.A02
            long r12 = r0.now()
            long r8 = r1.A00
            boolean r6 = X.Q32.A03(r8, r10, r12)
            return r6
        L_0x0072:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RB.A05(java.lang.String, java.util.Map, java.util.Set, long):boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0156=Splitter:B:50:0x0156, B:57:0x015f=Splitter:B:57:0x015f} */
    public static final X.H5C A00(X.AnonymousClass6RB r19, X.AnonymousClass6RN r20, java.lang.String r21, java.lang.String r22, long r23, boolean r25) {
        /*
            java.lang.String r2 = "BloksComponentQueryStore"
            r4 = 0
            r8 = 0
            java.lang.String r1 = "getCachedComponentsOrSubscribeToQuery:syncFetchResponseForKey"
            r0 = 58
            java.lang.String r0 = X.002.A0T(r2, r1, r0)     // Catch:{ all -> 0x0163 }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x0163 }
            r7 = r19
            r6 = r20
            r5 = r21
            if (r20 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r3 = r8
            goto L_0x0036
        L_0x001a:
            X.6RA r0 = r7.A07     // Catch:{ all -> 0x0163 }
            X.6RL r3 = r6.A01     // Catch:{ all -> 0x0163 }
            if (r3 == 0) goto L_0x004f
            X.6Qu r0 = r0.A01     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x004f
            X.6Qq r1 = r0.A00     // Catch:{ all -> 0x0163 }
            X.6Qr r0 = r1.A00(r5)     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x0036
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0163 }
            X.6Qt r0 = (X.C307606Qt) r0     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x004f
        L_0x0036:
            X.6RA r0 = r7.A07     // Catch:{ all -> 0x0163 }
            X.6R6 r11 = r0.A00(r5)     // Catch:{ all -> 0x0163 }
            X.Q3K r9 = X.Q3K.FETCH     // Catch:{ all -> 0x0163 }
            r13 = r22
            X.0qQ.A0B(r13, r4)     // Catch:{ all -> 0x0163 }
            X.0JR r0 = r11.A02     // Catch:{ all -> 0x0163 }
            long r16 = r0.now()     // Catch:{ all -> 0x0163 }
            X.Q34 r10 = new X.Q34     // Catch:{ all -> 0x0163 }
            r10.<init>()     // Catch:{ all -> 0x0163 }
            goto L_0x0052
        L_0x004f:
            X.6RL r3 = r6.A00     // Catch:{ all -> 0x0163 }
            goto L_0x0036
        L_0x0052:
            if (r3 == 0) goto L_0x005c
            java.util.Map r1 = r3.A00     // Catch:{ all -> 0x0163 }
            X.6RJ r0 = new X.6RJ     // Catch:{ all -> 0x0163 }
            r0.<init>(r1)     // Catch:{ all -> 0x0163 }
            goto L_0x005e
        L_0x005c:
            X.6Qy r0 = r11.A01     // Catch:{ all -> 0x0163 }
        L_0x005e:
            X.Q3r r4 = r0.EzP(r13)     // Catch:{ all -> 0x0163 }
            r14 = r23
            if (r4 == 0) goto L_0x00b9
            boolean r0 = r4 instanceof X.C7317Q3t     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00b9
            long r0 = r4.A00     // Catch:{ all -> 0x0163 }
            X.Q3K r3 = r4.A01     // Catch:{ all -> 0x0163 }
            r18 = r3
            r19 = r0
            r21 = r14
            r23 = r16
            boolean r0 = X.Q32.A04(r18, r19, r21, r23)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r1 = "cache_src"
            java.lang.String r0 = "memory"
            r10.A01(r1, r0)     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = r10.A02     // Catch:{ all -> 0x0163 }
            java.util.Map r3 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = r10.A01     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x0163 }
            X.R9N r1 = new X.R9N     // Catch:{ all -> 0x0163 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0163 }
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x0163 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0163 }
        L_0x0099:
            java.lang.Class<X.1xI> r1 = X.AnonymousClass1xI.class
            monitor-enter(r1)     // Catch:{ all -> 0x0163 }
            monitor-exit(r1)     // Catch:{ all -> 0x0163 }
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x0163 }
            X.Q3r r3 = (X.C7315Q3r) r3     // Catch:{ all -> 0x0163 }
            boolean r1 = r3 instanceof X.C7317Q3t     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0155
            X.Q3t r3 = (X.C7317Q3t) r3     // Catch:{ all -> 0x0163 }
            X.Q3u r3 = r3.A00     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0163 }
            X.Q3h r0 = (X.C7305Q3h) r0     // Catch:{ all -> 0x0163 }
            X.Q3o r1 = new X.Q3o     // Catch:{ all -> 0x0163 }
            r1.<init>(r3, r0, r13)     // Catch:{ all -> 0x0163 }
            X.H5C r0 = new X.H5C     // Catch:{ all -> 0x0163 }
            r0.<init>(r1)     // Catch:{ all -> 0x0163 }
            goto L_0x0156
        L_0x00b9:
            if (r25 == 0) goto L_0x015f
            X.6R2 r3 = r11.A00     // Catch:{ all -> 0x0163 }
            java.util.concurrent.atomic.AtomicReference r0 = r3.A05     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0163 }
            X.Q41 r0 = (X.Q41) r0     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x015f
            long r0 = r0.A00     // Catch:{ all -> 0x0163 }
            r18 = r0
            r20 = r14
            r22 = r16
            boolean r0 = X.Q32.A03(r18, r20, r22)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x015f
            X.6Qo r0 = r11.A03     // Catch:{ all -> 0x0163 }
            long r18 = r0.currentMonotonicTimestamp()     // Catch:{ all -> 0x0163 }
            X.R9M r4 = new X.R9M     // Catch:{ all -> 0x0163 }
            r4.<init>()     // Catch:{ all -> 0x0163 }
            X.TNR r0 = new X.TNR     // Catch:{ all -> 0x0163 }
            r0.<init>(r3, r4, r13)     // Catch:{ all -> 0x0163 }
            java.util.concurrent.FutureTask r7 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0163 }
            r7.<init>(r0)     // Catch:{ all -> 0x0163 }
            java.util.concurrent.Executor r0 = r3.A04     // Catch:{ all -> 0x0163 }
            r0.execute(r7)     // Catch:{ all -> 0x0163 }
            android.os.HandlerThread r0 = r3.A00     // Catch:{ all -> 0x0163 }
            int r5 = r0.getThreadId()     // Catch:{ all -> 0x0163 }
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0163 }
            int r6 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0163 }
            X.0eM r0 = X.C245983dn.A00     // Catch:{ all -> 0x0163 }
            int r1 = android.os.Process.getThreadPriority(r5)     // Catch:{ all -> 0x0163 }
            r0 = r6
        L_0x010a:
            if (r6 >= r1) goto L_0x0113
            android.os.Process.setThreadPriority(r5, r0)     // Catch:{ SecurityException -> 0x0110 }
            goto L_0x0113
        L_0x0110:
            int r0 = r0 + 1
            goto L_0x010a
        L_0x0113:
            r7.run()     // Catch:{ all -> 0x015a }
            java.lang.Object r6 = r7.get()     // Catch:{ all -> 0x015a }
            android.os.Process.setThreadPriority(r5, r1)     // Catch:{ all -> 0x0163 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0163 }
            X.6Qo r5 = r3.A03     // Catch:{ all -> 0x0163 }
            long r0 = r5.currentMonotonicTimestamp()     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = "deserialize_start"
            r4.A00(r3, r0)     // Catch:{ all -> 0x0163 }
            X.Q3y r3 = X.C9815Rhd.A00(r6)     // Catch:{ all -> 0x0163 }
            long r0 = r5.currentMonotonicTimestamp()     // Catch:{ all -> 0x0163 }
            java.lang.String r5 = "deserialize_end"
            r4.A00(r5, r0)     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x0163 }
            java.util.Map r5 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x0163 }
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x0163 }
            java.util.Map r1 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x0163 }
            X.R9O r0 = new X.R9O     // Catch:{ all -> 0x0163 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0163 }
            X.S5o r12 = new X.S5o     // Catch:{ all -> 0x0163 }
            r12.<init>(r0, r3)     // Catch:{ all -> 0x0163 }
            X.0eP r0 = X.AnonymousClass6R6.A00(r9, r10, r11, r12, r13, r14, r16, r18)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x015f
            goto L_0x0099
        L_0x0155:
            r0 = r8
        L_0x0156:
            X.1KZ.A00()     // Catch:{ Exception -> 0x0168 }
            return r0
        L_0x015a:
            r0 = move-exception
            android.os.Process.setThreadPriority(r5, r1)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x015f:
            X.1KZ.A00()     // Catch:{ Exception -> 0x0168 }
            return r8
        L_0x0163:
            r0 = move-exception
            X.1KZ.A00()     // Catch:{ Exception -> 0x0168 }
            throw r0     // Catch:{ Exception -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            r1 = 1
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "Exception encountered when trying to perform syncFetchResponseForKey inside BloksComponentQueryWriteThroughCache: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            X.1Kn.A02(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RB.A00(X.6RB, X.6RN, java.lang.String, java.lang.String, long, boolean):X.H5C");
    }

    public static final void A01(AnonymousClass6RB r6, C7310Q3m q3m) {
        ArrayList arrayList = new ArrayList();
        synchronized (r6.A09) {
            Iterator it = r6.A0C.iterator();
            while (it.hasNext()) {
                C21117XFh xFh = (C21117XFh) it.next();
                0sP r2 = xFh.A01;
                if (0qQ.A0K(xFh.A00, q3m.A00())) {
                    arrayList.add(r2);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((0sP) it2.next()).invoke(q3m);
        }
    }
}
