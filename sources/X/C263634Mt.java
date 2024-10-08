package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Mt  reason: invalid class name and case insensitive filesystem */
public final class C263634Mt implements Handler.Callback {
    public static final Set A0Z = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final Set A0a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final AtomicInteger A0b = new AtomicInteger();
    public static final AtomicLong A0c = new AtomicLong(0);
    public long A00 = -1;
    public long A01 = -1;
    public AnonymousClass4NN A02;
    public C263614Mr A03;
    public C263524Mi A04;
    public AnonymousClass4N7 A05;
    public C263504Mg A06;
    public AnonymousClass4N6 A07;
    public HeroPlayerSetting A08;
    public String A09 = "";
    public List A0A = new ArrayList();
    public AtomicReference A0B = new AtomicReference(new C263674Mx());
    public boolean A0C = false;
    public boolean A0D;
    public final Handler A0E;
    public final C263664Mw A0F = new C263664Mw(this);
    public final C263694Mz A0G;
    public final AnonymousClass4N0 A0H;
    public final Object A0I = new Object();
    public final Object A0J = new Object();
    public final Object A0K = new Object();
    public final List A0L = new LinkedList();
    public final TreeMap A0M = new TreeMap();
    public final AtomicReference A0N = new AtomicReference(C263684My.A0D);
    public final long[] A0O = {0, 0};
    public volatile float A0P = 1.0f;
    public volatile float A0Q;
    public volatile int A0R;
    public volatile long A0S = 0;
    public volatile long A0T;
    public volatile long A0U;
    public volatile long A0V;
    public volatile String A0W;
    public volatile boolean A0X;
    public volatile boolean A0Y;

    public static void A02(C263634Mt r11, C266464Yz r12, AnonymousClass5OZ r13, String str, String str2, Throwable th) {
        String str3;
        A04(r11, str, th, new Object[0]);
        synchronized (r11.A0K) {
            AnonymousClass4NN r4 = r11.A02;
            str3 = str2;
            if (r4 != null) {
                C263684My r2 = (C263684My) r11.A0N.get();
                r4.A0H(new C284815Oa(r12, r13, str, ""), r2, (C263674Mx) r11.A0B.get(), str2);
            }
        }
        C263684My r8 = (C263684My) r11.A0N.get();
        r11.A0G.DXX((C297475ro) null, new C284815Oa(r12, r13, str, ""), r8, (C263674Mx) r11.A0B.get(), str3);
    }

    public final void A0B() {
        A05(this, "play", new Object[0]);
        HeroPlayerSetting heroPlayerSetting = this.A08;
        AnonymousClass4NN r2 = this.A02;
        if (r2 != null && !heroPlayerSetting.A12.A0C) {
            1yA r1 = r2.A0C;
            if (!r1.A0D || r1.A0C) {
                r2.A0E();
            }
        }
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(2, -1L));
    }

    @Deprecated
    public final void A0C(int i) {
        A05(this, "seekTo: seekTimeMsWithPreview: %d", Integer.valueOf(i));
        this.A0T = (long) i;
        this.A0U = A0c.incrementAndGet();
        this.A0V = SystemClock.elapsedRealtime();
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(4, new long[]{this.A0T, this.A0U, 0}));
    }

    public final void A0D(Surface surface) {
        int hashCode;
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface.hashCode();
        }
        A05(this, "setSurface %x", Integer.valueOf(hashCode));
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(6, new Object[]{surface, -1, -1}));
        A0a.add(surface);
    }

    public final void A0E(AnonymousClass4OI r12) {
        C255653uU r3 = r12.A0K;
        A05(this, "setVideoPlaybackParams: %s", r3);
        Pair A012 = r3.A01();
        if (!((Boolean) A012.first).booleanValue()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid video source");
            A02(this, C266464Yz.A0e, AnonymousClass5OZ.NETWORK_SOURCE, 002.A0R("Invalid video source: ", (String) A012.second), r12.A07, illegalArgumentException);
            return;
        }
        A05(this, "dash manifest: %s", r3.A09);
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(1, r12));
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.4N7] */
    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Object, X.4N7] */
    public C263634Mt(Handler handler, Looper looper, C263614Mr r9, C263524Mi r10, C263654Mv r11, 274 r12, C263504Mg r13, HeroPlayerSetting heroPlayerSetting) {
        HashSet hashSet = new HashSet();
        A05(this, "Create HeroPlayer", new Object[0]);
        this.A0E = new Handler(looper, this);
        C263694Mz r0 = new C263694Mz(handler, r11);
        this.A0G = r0;
        AnonymousClass4N0 r1 = new AnonymousClass4N0(this, hashSet);
        this.A0H = r1;
        r0.A00.add(r1);
        this.A04 = r10;
        if (r13 != null) {
            this.A06 = r13;
            this.A08 = heroPlayerSetting;
            this.A0C |= heroPlayerSetting.A1y;
            this.A07 = new AnonymousClass4N5(this);
            A0Z.add(this);
            this.A05 = new Object();
            this.A03 = r9;
            return;
        }
        this.A06 = new C263504Mg(new C19072WKc(r12), false);
        this.A08 = heroPlayerSetting;
        this.A0C |= heroPlayerSetting.A1y;
        this.A07 = new AnonymousClass4N5(this);
        A0Z.add(this);
        this.A05 = new Object();
        this.A03 = r9;
        this.A0F.A08 = r12;
    }

    public static void A01(C263634Mt r3) {
        AnonymousClass4NN r2 = r3.A02;
        if (r2 != null && r3.A08.A12.A0C) {
            1yA r1 = r2.A0C;
            if (!r1.A0D || r1.A0C) {
                r2.A0E();
            }
        }
        r3.A0G.DyA();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r0.isValid() == false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C263634Mt r23, X.C263674Mx r24, boolean r25) {
        /*
            r4 = r23
            X.4Mw r5 = r4.A0F
            r6 = r24
            X.C263664Mw.A06(r5, r6)
            long r7 = r6.A0E
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0074
            long r1 = r6.A0F
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
            long r13 = r6.A00()
            long r2 = r6.A0E
            long r0 = r6.A0F
            boolean r7 = r6.A0Q
            r18 = r7 ^ 1
            boolean r7 = r6.A0N
            java.lang.String r9 = "onBufferingStopped, %dms"
            long r15 = r0 - r2
            java.lang.Long r8 = java.lang.Long.valueOf(r15)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            A05(r4, r9, r8)
            r11 = 20
            long r9 = r2 + r11
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x005e
            java.util.List r8 = r4.A0L
            monitor-enter(r8)
            X.4Yu r9 = new X.4Yu     // Catch:{ all -> 0x005b }
            r22 = r0
            r24 = r7
            r19 = r9
            r20 = r2
            r19.<init>(r20, r22, r24)     // Catch:{ all -> 0x005b }
            r8.add(r9)     // Catch:{ all -> 0x005b }
            long r0 = r4.A00     // Catch:{ all -> 0x005b }
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0059
            r4.A00 = r13     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r8)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x005b }
            throw r0
        L_0x005e:
            X.4NN r1 = r4.A02
            if (r1 == 0) goto L_0x006b
            X.1yA r0 = r1.A0C
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x006b
            X.AnonymousClass4NN.A05(r1, r13, r7)
        L_0x006b:
            X.4Mz r12 = r4.A0G
            r17 = r25
            r19 = r7
            r12.DnM(r13, r15, r17, r18, r19)
        L_0x0074:
            boolean r0 = r4.A0D
            boolean r3 = r6.A0R
            if (r0 == r3) goto L_0x0095
            r4.A0D = r3
            android.view.Surface r0 = r5.A0C
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 != 0) goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "onVisualPlayStateChanged"
            A05(r4, r0, r1)
            X.4Mz r0 = r4.A0G
            r0.Dzh(r3, r2)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263634Mt.A03(X.4Mt, X.4Mx, boolean):void");
    }

    public static void A04(C263634Mt r3, String str, Throwable th, Object... objArr) {
        if (r3.A0C) {
            StringBuilder sb = new StringBuilder();
            sb.append(r3.hashCode());
            sb.append(", playerId[");
            sb.append(r3.A0S);
            sb.append("]: ");
            sb.append(str);
            sb.append(", message = ");
            sb.append(th.getMessage());
            Log.e("HeroPlayer", String.format(sb.toString(), objArr), th);
        }
    }

    public static void A05(C263634Mt r3, String str, Object... objArr) {
        if (r3.A0C) {
            StringBuilder sb = new StringBuilder();
            sb.append(r3.hashCode());
            sb.append(", playerId[");
            sb.append(r3.A0S);
            sb.append("]: ");
            sb.append(str);
            27B.A02("HeroPlayer", sb.toString(), objArr);
        }
    }

    public final long A09() {
        long j = ((C263674Mx) this.A0B.get()).A0U;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public final C297475ro A0A() {
        long j;
        int i;
        int i2;
        List<C266414Yu> list = this.A0L;
        synchronized (list) {
            j = 0;
            i = 0;
            i2 = 0;
            for (C266414Yu r0 : list) {
                long j2 = r0.A00;
                long j3 = r0.A01;
                if (j2 <= j3 || j3 <= 0 || j2 <= 0) {
                    A04(this, "stallStartMs = %d, stallEndMs = %d", new IllegalStateException("Start stall time is greater or equal to end stall time"), Long.valueOf(j3), Long.valueOf(j2));
                } else {
                    long j4 = j2 - j3;
                    j += j4;
                    i++;
                    AnonymousClass4OI r02 = this.A0F.A07;
                    if (r02 != null && r02.A0K.A03()) {
                        27B.A04(this.A0M, this.A08.A0d, j3, j2);
                    }
                    if (j4 > 200) {
                        i2++;
                    }
                }
            }
            list.clear();
            this.A0M.clear();
            this.A00 = -1;
        }
        return new C297475ro(i, i2, j);
    }

    public final void A0F(String str) {
        A05(this, "pause", new Object[0]);
        Handler handler = this.A0E;
        String str2 = str;
        handler.sendMessage(handler.obtainMessage(3, str2));
        synchronized (this.A0K) {
            AnonymousClass4NN r3 = this.A02;
            if (r3 != null) {
                long A082 = A08();
                String str3 = r3.A06;
                if (str3 == null) {
                    str3 = AnonymousClass4NN.A02(r3);
                }
                AnonymousClass4NP r1 = r3.A0B;
                r1.A00(C264144Ot.REQUESTED_PAUSE, str3);
                r1.A01(str3);
                AnonymousClass4OY A002 = r3.A0A.A00(r3.A02, str3);
                if (A002 != null) {
                    A002.A01((C290425fI) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, "requested_pause", str3, (String) null, str2, (String) null, A082, r3.A01, SystemClock.elapsedRealtime(), false);
                    if (r3.A0C.A0F) {
                        A002.A00();
                    }
                }
            }
        }
    }

    public final boolean A0I() {
        if (this.A0S != 0) {
            return true;
        }
        return false;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final boolean handleMessage(android.os.Message r31) {
        /*
            r30 = this;
            r5 = r31
            int r2 = r5.what
            r10 = 2
            r1 = 1
            r0 = 0
            r3 = r30
            switch(r2) {
                case 1: goto L_0x0144;
                case 2: goto L_0x01a1;
                case 3: goto L_0x0234;
                case 4: goto L_0x027a;
                case 5: goto L_0x02d4;
                case 6: goto L_0x00c1;
                case 7: goto L_0x034d;
                case 8: goto L_0x0415;
                case 9: goto L_0x0497;
                case 10: goto L_0x04bb;
                case 11: goto L_0x053a;
                case 12: goto L_0x0544;
                case 13: goto L_0x054b;
                case 14: goto L_0x0fa7;
                case 15: goto L_0x058f;
                case 16: goto L_0x05d2;
                case 17: goto L_0x0616;
                case 18: goto L_0x0751;
                case 19: goto L_0x078a;
                case 20: goto L_0x000c;
                case 21: goto L_0x03b3;
                case 22: goto L_0x07ea;
                case 23: goto L_0x085d;
                case 24: goto L_0x08d4;
                case 25: goto L_0x08ed;
                case 26: goto L_0x096b;
                case 27: goto L_0x09ea;
                case 28: goto L_0x09f7;
                case 29: goto L_0x0a40;
                case 30: goto L_0x0a8c;
                case 31: goto L_0x0adf;
                case 32: goto L_0x0b31;
                case 33: goto L_0x0b38;
                case 34: goto L_0x000c;
                case 35: goto L_0x0b95;
                case 36: goto L_0x0bea;
                case 37: goto L_0x0c3f;
                case 38: goto L_0x000d;
                case 39: goto L_0x0c7e;
                case 40: goto L_0x0cdb;
                case 41: goto L_0x000c;
                case 42: goto L_0x000c;
                case 43: goto L_0x0d48;
                case 44: goto L_0x0db1;
                case 45: goto L_0x0dfd;
                case 46: goto L_0x0e48;
                case 47: goto L_0x0e9d;
                case 48: goto L_0x0ef2;
                case 49: goto L_0x0f48;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r0
        L_0x000d:
            X.4Mw r7 = r3.A0F
            java.lang.Object r8 = r5.obj
            X.4OL r8 = (X.AnonymousClass4OL) r8
            X.4Mt r6 = r7.A0D
            boolean r2 = r6.A0I()
            if (r2 != 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Before pause(), service player was evicted. Lazy recover at next play()"
            A05(r6, r0, r2)
        L_0x0022:
            X.C263664Mw.A04(r7)
            goto L_0x0fac
        L_0x0027:
            X.4Mg r4 = r6.A06
            X.274 r2 = r4.A00()
            if (r2 == 0) goto L_0x00a3
            X.274 r9 = r4.A00()
            long r4 = r6.A0S
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r10 = new java.lang.Object[]{r2}
            java.lang.String r2 = "id [%d]: moveToWarmup"
            X.28J.A03(r2, r10)
            X.29n r2 = r9.A0c
            X.4OS r5 = r2.A00(r4)
            if (r5 == 0) goto L_0x00b5
            X.4OI r4 = r5.A15
            android.view.Surface r2 = r5.A0J
            if (r4 == 0) goto L_0x00b5
            if (r2 == 0) goto L_0x00b5
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "moveToWarmup"
            X.AnonymousClass4OS.A0E(r5, r0, r2)
            android.os.Handler r2 = r5.A0G
            r0 = 42
            android.os.Message r0 = r2.obtainMessage(r0)
            X.AnonymousClass4OS.A07(r0, r5)
            X.2BM r4 = r9.A0J
            android.util.LruCache r9 = r4.A00
            int r2 = r9.size()
            int r0 = r9.maxSize()
            if (r2 != r0) goto L_0x009e
            java.util.Map r0 = r9.snapshot()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            r9.remove(r0)
            android.util.LruCache r4 = r4.A01
            java.lang.Object r2 = r5.getKey()
            java.lang.Object r0 = r5.getValue()
            r4.put(r2, r0)
        L_0x009e:
            java.lang.String r0 = r8.A04
            r9.put(r0, r8)
        L_0x00a3:
            r6.hashCode()
            X.C263664Mw.A02(r7)
            r6.A08()
            X.C263664Mw.A05(r7)
            r4 = 0
            r6.A0S = r4
            goto L_0x0fac
        L_0x00b5:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            A05(r6, r0, r2)
            X.C263664Mw.A03(r7)
            goto L_0x0022
        L_0x00c1:
            java.lang.Object r4 = r5.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r7 = r4[r0]
            android.view.Surface r7 = (android.view.Surface) r7
            r2 = r4[r1]
            java.lang.Number r2 = (java.lang.Number) r2
            int r11 = r2.intValue()
            r2 = r4[r10]
            java.lang.Number r2 = (java.lang.Number) r2
            int r12 = r2.intValue()
            X.4Mw r9 = r3.A0F
            r9.A0C = r7
            r9.A03 = r11
            r9.A02 = r12
            if (r7 == 0) goto L_0x00f1
            android.view.Surface r2 = r9.A06
            if (r7 != r2) goto L_0x00f1
            X.4Mt r6 = r9.A0D
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r0 = "surface already sent, skipping send again: %s"
            goto L_0x0179
        L_0x00f1:
            X.4Mt r8 = r9.A0D     // Catch:{ RemoteException -> 0x013b }
            boolean r2 = r8.A0I()     // Catch:{ RemoteException -> 0x013b }
            if (r2 != 0) goto L_0x010b
            java.lang.String r4 = "Before setSurface(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x013b }
            A05(r8, r4, r2)     // Catch:{ RemoteException -> 0x013b }
        L_0x0100:
            r8.hashCode()     // Catch:{ RemoteException -> 0x013b }
            X.C263664Mw.A02(r9)     // Catch:{ RemoteException -> 0x013b }
            X.0KF.A00(r7)     // Catch:{ RemoteException -> 0x013b }
            goto L_0x0fac
        L_0x010b:
            X.274 r13 = X.C263664Mw.A00(r9)     // Catch:{ RemoteException -> 0x013b }
            long r4 = r8.A0S     // Catch:{ RemoteException -> 0x013b }
            android.view.Surface r10 = r9.A0C     // Catch:{ RemoteException -> 0x013b }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ RemoteException -> 0x013b }
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r10}     // Catch:{ RemoteException -> 0x013b }
            java.lang.String r2 = "id [%d]: setSurface: %s"
            X.28J.A03(r2, r6)     // Catch:{ RemoteException -> 0x013b }
            X.29n r2 = r13.A0c     // Catch:{ RemoteException -> 0x013b }
            X.4OS r2 = r2.A00(r4)     // Catch:{ RemoteException -> 0x013b }
            if (r2 != 0) goto L_0x0133
            java.lang.String r4 = "When setSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x013b }
            A05(r8, r4, r2)     // Catch:{ RemoteException -> 0x013b }
            X.C263664Mw.A03(r9)     // Catch:{ RemoteException -> 0x013b }
            goto L_0x0100
        L_0x0133:
            r2.A0O(r10, r11, r12)     // Catch:{ RemoteException -> 0x013b }
            android.view.Surface r2 = r9.A0C     // Catch:{ RemoteException -> 0x013b }
            r9.A06 = r2     // Catch:{ RemoteException -> 0x013b }
            goto L_0x0100
        L_0x013b:
            r10 = move-exception
            X.4Mt r7 = r9.A0D
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting surface"
            goto L_0x0c79
        L_0x0144:
            X.4Mw r7 = r3.A0F
            java.lang.Object r5 = r5.obj
            X.4OI r5 = (X.AnonymousClass4OI) r5
            X.4Mt r6 = r7.A0D
            X.3uU r8 = r5.A0K
            X.3uR r2 = r8.A07
            java.lang.String r4 = r2.toString()
            android.net.Uri r2 = r8.A05
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r2}
            java.lang.String r2 = "prepareInternal, playRequest: %s, url: %s"
            A05(r6, r2, r4)
            java.lang.String r4 = r5.A06
            java.lang.String r2 = "QUEUE_PLAYER_TYPE"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x017e
            X.4OI r2 = r7.A07
            if (r2 == 0) goto L_0x017e
            X.3uU r2 = r2.A0K
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x017e
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "prepareInternal, unchanged video source, skip preparing"
        L_0x0179:
            A05(r6, r0, r2)
            goto L_0x0fac
        L_0x017e:
            X.C263664Mw.A05(r7)
            r7.A07 = r5
            r7.A09 = r1
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r6.A08
            boolean r8 = r2.A22
            if (r8 == 0) goto L_0x019c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r2 = "onPreparing"
            A05(r6, r2, r4)
            java.util.concurrent.atomic.AtomicInteger r2 = A0b
            r2.incrementAndGet()
            X.4Mz r2 = r6.A0G
            r2.DZ3()
        L_0x019c:
            X.C263664Mw.A01(r7)     // Catch:{ RemoteException -> 0x0514 }
            goto L_0x051c
        L_0x01a1:
            X.4Mw r10 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            X.4Mt r8 = r10.A0D
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r8.A08
            X.1yD r2 = r2.A10
            boolean r9 = r2.A0K
            if (r9 == 0) goto L_0x01b8
            A01(r8)
        L_0x01b8:
            boolean r2 = r10.A09
            if (r2 == 0) goto L_0x01c8
            X.C263664Mw.A01(r10)     // Catch:{ RemoteException -> 0x01c0 }
            goto L_0x01c8
        L_0x01c0:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r2 = "Error occurs while ensureAndRecoverServicePlayer in play"
            A04(r8, r2, r5, r4)
        L_0x01c8:
            if (r9 != 0) goto L_0x01cd
            A01(r8)
        L_0x01cd:
            r10.A0A = r1
            boolean r2 = r8.A0I()     // Catch:{ RemoteException -> 0x022a }
            if (r2 != 0) goto L_0x01e7
            java.lang.String r4 = "Before play(), service player was evicted. Recover now"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x022a }
            A05(r8, r4, r2)     // Catch:{ RemoteException -> 0x022a }
        L_0x01dc:
            X.C263664Mw.A01(r10)     // Catch:{ RemoteException -> 0x022a }
        L_0x01df:
            r8.hashCode()     // Catch:{ RemoteException -> 0x022a }
            X.C263664Mw.A02(r10)     // Catch:{ RemoteException -> 0x022a }
            goto L_0x0fac
        L_0x01e7:
            X.274 r9 = X.C263664Mw.A00(r10)     // Catch:{ RemoteException -> 0x022a }
            long r4 = r8.A0S     // Catch:{ RemoteException -> 0x022a }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ RemoteException -> 0x022a }
            java.lang.Object[] r11 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x022a }
            java.lang.String r2 = "id [%d]: play"
            X.28J.A03(r2, r11)     // Catch:{ RemoteException -> 0x022a }
            X.29n r2 = r9.A0c     // Catch:{ RemoteException -> 0x022a }
            X.4OS r4 = r2.A00(r4)     // Catch:{ RemoteException -> 0x022a }
            if (r4 != 0) goto L_0x020d
            java.lang.String r4 = "When play(), service player is noticed to be evicted earlier. Recover now"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x022a }
            A05(r8, r4, r2)     // Catch:{ RemoteException -> 0x022a }
            X.C263664Mw.A03(r10)     // Catch:{ RemoteException -> 0x022a }
            goto L_0x01dc
        L_0x020d:
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.A0R     // Catch:{ RemoteException -> 0x022a }
            boolean r2 = r2.compareAndSet(r1, r0)     // Catch:{ RemoteException -> 0x022a }
            r4.A0N(r6, r2)     // Catch:{ RemoteException -> 0x022a }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r9.A0H     // Catch:{ RemoteException -> 0x022a }
            boolean r2 = r2.A1h     // Catch:{ RemoteException -> 0x022a }
            if (r2 == 0) goto L_0x01df
            X.4OI r2 = r4.A15     // Catch:{ RemoteException -> 0x022a }
            if (r2 == 0) goto L_0x01df
            X.3uU r2 = r2.A0K     // Catch:{ RemoteException -> 0x022a }
            java.lang.String r2 = r2.A0G     // Catch:{ RemoteException -> 0x022a }
            if (r2 == 0) goto L_0x01df
            X.274.A04(r9, r2)     // Catch:{ RemoteException -> 0x022a }
            goto L_0x01df
        L_0x022a:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while sending play request"
            A04(r8, r0, r4, r2)
            goto L_0x0fac
        L_0x0234:
            X.4Mw r8 = r3.A0F
            java.lang.Object r7 = r5.obj
            java.lang.String r7 = (java.lang.String) r7
            r8.A0A = r0
            X.4Mt r6 = r8.A0D     // Catch:{ RemoteException -> 0x0271 }
            boolean r2 = r6.A0I()     // Catch:{ RemoteException -> 0x0271 }
            if (r2 != 0) goto L_0x0256
            java.lang.String r4 = "Before pause(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0271 }
            A05(r6, r4, r2)     // Catch:{ RemoteException -> 0x0271 }
        L_0x024b:
            r6.hashCode()     // Catch:{ RemoteException -> 0x0271 }
            X.C263664Mw.A02(r8)     // Catch:{ RemoteException -> 0x0271 }
            r6.A08()     // Catch:{ RemoteException -> 0x0271 }
            goto L_0x0fac
        L_0x0256:
            X.274 r2 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x0271 }
            long r4 = r6.A0S     // Catch:{ RemoteException -> 0x0271 }
            if (r7 != 0) goto L_0x0260
            java.lang.String r7 = ""
        L_0x0260:
            boolean r2 = r2.A0D(r7, r4, r0)     // Catch:{ RemoteException -> 0x0271 }
            if (r2 != 0) goto L_0x024b
            java.lang.String r4 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0271 }
            A05(r6, r4, r2)     // Catch:{ RemoteException -> 0x0271 }
            X.C263664Mw.A03(r8)     // Catch:{ RemoteException -> 0x0271 }
            goto L_0x024b
        L_0x0271:
            r10 = move-exception
            X.4Mt r7 = r8.A0D
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while pausing the video"
            goto L_0x0c79
        L_0x027a:
            java.lang.Object r2 = r5.obj
            long[] r2 = (long[]) r2
            X.4Mw r5 = r3.A0F
            r6 = r2[r0]
            int r4 = (int) r6
            r12 = r2[r1]
            r8 = 1
            r6 = r2[r10]
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x028e
            r0 = 1
        L_0x028e:
            r5.A01 = r4
            r6 = 0
            X.4Mt r4 = r5.A0D     // Catch:{ RemoteException -> 0x02c7 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x02c7 }
            if (r2 != 0) goto L_0x02ac
            java.lang.String r2 = "Before seekTo(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ RemoteException -> 0x02c7 }
            A05(r4, r2, r0)     // Catch:{ RemoteException -> 0x02c7 }
            r7 = 0
            r4.A0U = r7     // Catch:{ RemoteException -> 0x02c7 }
        L_0x02a4:
            r4.hashCode()     // Catch:{ RemoteException -> 0x02c7 }
            X.C263664Mw.A02(r5)     // Catch:{ RemoteException -> 0x02c7 }
            goto L_0x0fac
        L_0x02ac:
            X.274 r7 = X.C263664Mw.A00(r5)     // Catch:{ RemoteException -> 0x02c7 }
            long r8 = r4.A0S     // Catch:{ RemoteException -> 0x02c7 }
            int r2 = r5.A01     // Catch:{ RemoteException -> 0x02c7 }
            long r10 = (long) r2     // Catch:{ RemoteException -> 0x02c7 }
            r14 = r0
            boolean r0 = r7.A0B(r8, r10, r12, r14)     // Catch:{ RemoteException -> 0x02c7 }
            if (r0 != 0) goto L_0x02a4
            java.lang.String r2 = "When seekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ RemoteException -> 0x02c7 }
            A05(r4, r2, r0)     // Catch:{ RemoteException -> 0x02c7 }
            X.C263664Mw.A03(r5)     // Catch:{ RemoteException -> 0x02c7 }
            goto L_0x02a4
        L_0x02c7:
            r10 = move-exception
            X.4Mt r7 = r5.A0D
            r4 = 0
            r7.A0U = r4
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = "Error occurs while seeking the video"
            goto L_0x0c79
        L_0x02d4:
            java.lang.Object r2 = r5.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.4Mw r8 = r3.A0F
            r2 = r2[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            float r7 = r2.floatValue()
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x02ed
            int r2 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x02f6
        L_0x02ed:
            X.4Mt r4 = r8.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "Trying to set volume with invalid value"
            A05(r4, r2, r3)
        L_0x02f6:
            X.4Mt r9 = r8.A0D
            float r2 = java.lang.Math.min(r6, r7)
            float r2 = java.lang.Math.max(r5, r2)
            r9.A0Q = r2
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x0346 }
            if (r2 != 0) goto L_0x0319
            java.lang.String r3 = "Before setVolume(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0346 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0346 }
        L_0x030f:
            r9.hashCode()     // Catch:{ RemoteException -> 0x0346 }
            X.C263664Mw.A02(r8)     // Catch:{ RemoteException -> 0x0346 }
            r9.A08()     // Catch:{ RemoteException -> 0x0346 }
            goto L_0x0345
        L_0x0319:
            X.274 r7 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x0346 }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x0346 }
            float r6 = r9.A0Q     // Catch:{ RemoteException -> 0x0346 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0346 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0346 }
            java.lang.String r2 = "id [%d]: setVolume"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0346 }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0346 }
            X.4OS r2 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0346 }
            if (r2 != 0) goto L_0x0341
            java.lang.String r3 = "When setVolume(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0346 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0346 }
            X.C263664Mw.A03(r8)     // Catch:{ RemoteException -> 0x0346 }
            goto L_0x030f
        L_0x0341:
            r2.A0M(r6)     // Catch:{ RemoteException -> 0x0346 }
            goto L_0x030f
        L_0x0345:
            return r1
        L_0x0346:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting volume"
            goto L_0x0b91
        L_0x034d:
            java.lang.Object r7 = r5.obj
            android.os.ResultReceiver r7 = (android.os.ResultReceiver) r7
            X.4Mw r8 = r3.A0F
            r6 = 0
            r8.A0C = r6     // Catch:{ RemoteException -> 0x039b }
            r2 = -1
            r8.A03 = r2     // Catch:{ RemoteException -> 0x039b }
            r8.A02 = r2     // Catch:{ RemoteException -> 0x039b }
            X.4Mt r9 = r8.A0D     // Catch:{ RemoteException -> 0x039b }
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x039b }
            if (r2 != 0) goto L_0x0371
            java.lang.String r4 = "Before releaseSurface(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x039b }
            A05(r9, r4, r2)     // Catch:{ RemoteException -> 0x039b }
        L_0x036a:
            r9.hashCode()     // Catch:{ RemoteException -> 0x039b }
            X.C263664Mw.A02(r8)     // Catch:{ RemoteException -> 0x039b }
            goto L_0x0393
        L_0x0371:
            X.274 r2 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x039b }
            long r4 = r9.A0S     // Catch:{ RemoteException -> 0x039b }
            boolean r2 = r2.A0C(r7, r4)     // Catch:{ RemoteException -> 0x039b }
            if (r2 == 0) goto L_0x0388
            java.lang.String r4 = "Surface release request already sent, let it complete"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x039b }
            A05(r9, r4, r2)     // Catch:{ RemoteException -> 0x039b }
            r8.A06 = r6     // Catch:{ RemoteException -> 0x0398, all -> 0x0396 }
            r7 = r6
            goto L_0x036a
        L_0x0388:
            java.lang.String r4 = "When releaseSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x039b }
            A05(r9, r4, r2)     // Catch:{ RemoteException -> 0x039b }
            X.C263664Mw.A03(r8)     // Catch:{ RemoteException -> 0x039b }
            goto L_0x036a
        L_0x0393:
            if (r7 == 0) goto L_0x0fac
            goto L_0x03a7
        L_0x0396:
            r2 = move-exception
            throw r2
        L_0x0398:
            r5 = move-exception
            r7 = r6
            goto L_0x039c
        L_0x039b:
            r5 = move-exception
        L_0x039c:
            X.4Mt r4 = r8.A0D     // Catch:{ all -> 0x03ac }
            java.lang.String r2 = "Error occurs while releasing surface"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x03ac }
            A04(r4, r2, r5, r0)     // Catch:{ all -> 0x03ac }
            if (r7 == 0) goto L_0x0fac
        L_0x03a7:
            r7.send(r1, r6)
            goto L_0x0fac
        L_0x03ac:
            r2 = move-exception
            if (r7 == 0) goto L_0x03e5
            r7.send(r1, r6)
            throw r2
        L_0x03b3:
            X.4Mw r7 = r3.A0F
            java.lang.Object r8 = r5.obj
            X.4OL r8 = (X.AnonymousClass4OL) r8
            X.4Mt r9 = r7.A0D
            long r5 = r8.A01
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            android.view.Surface r2 = r8.A00()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = "switchToWarmupPlayer: player id: %d, surface: %s"
            A05(r9, r2, r3)
            X.4OI r2 = r7.A07
            if (r2 == 0) goto L_0x03e6
            java.lang.String r3 = r8.A04
            X.3uU r2 = r2.A0K
            java.lang.String r2 = r2.A0G
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03e6
            java.lang.String r0 = "switchToWarmupPlayer is called after setVideoPlaybackParams"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
        L_0x03e5:
            throw r2
        L_0x03e6:
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x03f6 }
            if (r2 == 0) goto L_0x03fe
            X.274 r4 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x03f6 }
            long r2 = r9.A0S     // Catch:{ RemoteException -> 0x03f6 }
            r4.A09(r2, r1)     // Catch:{ RemoteException -> 0x03f6 }
            goto L_0x03fe
        L_0x03f6:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "Error occurs while release player"
            A04(r9, r2, r4, r3)
        L_0x03fe:
            r9.A0S = r5
            long[] r4 = r9.A0O
            r2 = r4[r0]
            r4[r1] = r2
            long r2 = r9.A0S
            r4[r0] = r2
            android.view.Surface r0 = r8.A00()
            if (r0 == 0) goto L_0x0fb0
            r7.A0C = r0
            r7.A06 = r0
            return r1
        L_0x0415:
            X.4Mw r7 = r3.A0F
            X.4Mt r6 = r7.A0D     // Catch:{ RemoteException -> 0x0437 }
            boolean r2 = r6.A0I()     // Catch:{ RemoteException -> 0x0437 }
            if (r2 != 0) goto L_0x042d
            java.lang.String r4 = "Before release(), service player was evicted. Skip releasing"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0437 }
            A05(r6, r4, r2)     // Catch:{ RemoteException -> 0x0437 }
        L_0x0426:
            r6.hashCode()     // Catch:{ RemoteException -> 0x0437 }
            X.C263664Mw.A02(r7)     // Catch:{ RemoteException -> 0x0437 }
            goto L_0x0441
        L_0x042d:
            X.274 r2 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0437 }
            long r4 = r6.A0S     // Catch:{ RemoteException -> 0x0437 }
            r2.A09(r4, r0)     // Catch:{ RemoteException -> 0x0437 }
            goto L_0x0426
        L_0x0437:
            r5 = move-exception
            X.4Mt r6 = r7.A0D     // Catch:{ all -> 0x0483 }
            java.lang.String r4 = "Error occurs while release player"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0483 }
            A04(r6, r4, r5, r2)     // Catch:{ all -> 0x0483 }
        L_0x0441:
            X.C263664Mw.A05(r7)
            r2 = 0
            r6.A0Q = r2
            r4 = 0
            r6.A0S = r4
            long[] r2 = r6.A0O
            r2[r1] = r4
            r2[r0] = r4
            android.os.Handler r5 = r6.A0E
            android.os.Looper r0 = r5.getLooper()
            java.lang.Thread r4 = r0.getThread()
            java.lang.String r2 = r4.getName()
            java.lang.String r0 = "HeroPlayerInternalThread"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0fac
            java.util.concurrent.ConcurrentLinkedQueue r0 = X.C300515xK.A00
            boolean r0 = X.00k.A0u(r0, r4)
            if (r0 != 0) goto L_0x0fac
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r6.A08
            boolean r2 = r0.A2z
            android.os.Looper r0 = r5.getLooper()
            if (r2 == 0) goto L_0x047e
            r0.quitSafely()
            goto L_0x0fac
        L_0x047e:
            r0.quit()
            goto L_0x0fac
        L_0x0483:
            r6 = move-exception
            X.C263664Mw.A05(r7)
            X.4Mt r5 = r7.A0D
            r2 = 0
            r5.A0Q = r2
            r3 = 0
            r5.A0S = r3
            long[] r2 = r5.A0O
            r2[r1] = r3
            r2[r0] = r3
            throw r6
        L_0x0497:
            X.4Mw r6 = r3.A0F
            X.C263664Mw.A01(r6)     // Catch:{ RemoteException -> 0x04b2 }
            X.4Mt r5 = r6.A0D     // Catch:{ RemoteException -> 0x04b2 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x04b2 }
            java.lang.String r2 = "onVideoServiceConnected"
            A05(r5, r2, r4)     // Catch:{ RemoteException -> 0x04b2 }
            X.4Mz r2 = r5.A0G     // Catch:{ RemoteException -> 0x04b2 }
            r2.DyF()     // Catch:{ RemoteException -> 0x04b2 }
            r5.hashCode()     // Catch:{ RemoteException -> 0x04b2 }
            X.C263664Mw.A02(r6)     // Catch:{ RemoteException -> 0x04b2 }
            goto L_0x0fac
        L_0x04b2:
            r10 = move-exception
            X.4Mt r7 = r6.A0D
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs in handleServiceConnected"
            goto L_0x0c79
        L_0x04bb:
            X.4Mw r7 = r3.A0F
            r0 = 0
            r7.A08 = r0
            r7.A06 = r0
            X.4Mt r2 = r7.A0D
            long r4 = r2.A06()
            r7.A04 = r4
            X.4OI r0 = r7.A07
            if (r0 == 0) goto L_0x0509
            X.3uU r0 = r0.A0K
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0509
            long r4 = r2.A08()
        L_0x04da:
            r7.A05 = r4
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0B
            java.lang.Object r6 = r0.get()
            X.4Mx r6 = (X.C263674Mx) r6
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r10 = r6.A08
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x0506
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x0506
            long r4 = r6.A0H
            long r12 = r8 - r4
        L_0x04f6:
            long r10 = r10 + r12
            r6.A08 = r10
            long r4 = r6.A0D
            long r4 = r4 + r12
            r6.A0D = r4
            r6.A0O = r1
            r6.A0H = r8
            java.lang.Object r0 = r2.A0J
            monitor-enter(r0)
            goto L_0x050c
        L_0x0506:
            r12 = 0
            goto L_0x04f6
        L_0x0509:
            r4 = 0
            goto L_0x04da
        L_0x050c:
            r0.notifyAll()     // Catch:{ all -> 0x0537 }
            monitor-exit(r0)     // Catch:{ all -> 0x0537 }
            r2.hashCode()
            goto L_0x0532
        L_0x0514:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r2 = "Error occurs while ensureAndRecoverServicePlayer in prepare"
            A04(r6, r2, r5, r4)
        L_0x051c:
            if (r8 != 0) goto L_0x052f
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "onPreparing"
            A05(r6, r0, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = A0b
            r0.incrementAndGet()
            X.4Mz r0 = r6.A0G
            r0.DZ3()
        L_0x052f:
            r6.hashCode()
        L_0x0532:
            X.C263664Mw.A02(r7)
            goto L_0x0fac
        L_0x0537:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0537 }
            throw r2
        L_0x053a:
            X.4Mw r2 = r3.A0F
            java.lang.Object r0 = r5.obj
            X.4Mx r0 = (X.C263674Mx) r0
            X.C263664Mw.A06(r2, r0)
            return r1
        L_0x0544:
            X.4Mw r0 = r3.A0F
            X.C263664Mw.A03(r0)
            goto L_0x0fac
        L_0x054b:
            X.4Mw r7 = r3.A0F
            java.lang.Object r8 = r5.obj
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0586 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0586 }
            if (r2 != 0) goto L_0x055f
            java.lang.String r3 = "Before setCustomQuality(), service player was evicted. Skip setting custom quality"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0586 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0586 }
            return r1
        L_0x055f:
            X.274 r6 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0586 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0586 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0586 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r8}     // Catch:{ RemoteException -> 0x0586 }
            java.lang.String r2 = "id [%d]: setCustomQuality: %s"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0586 }
            X.29n r2 = r6.A0c     // Catch:{ RemoteException -> 0x0586 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0586 }
            if (r4 == 0) goto L_0x0fb0
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0586 }
            r2 = 25
            android.os.Message r2 = r3.obtainMessage(r2, r8)     // Catch:{ RemoteException -> 0x0586 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0586 }
            return r1
        L_0x0586:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting custom quality"
            goto L_0x0fa3
        L_0x058f:
            X.4Mw r7 = r3.A0F
            r8 = 0
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x05c9 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x05c9 }
            if (r2 != 0) goto L_0x05a2
            java.lang.String r3 = "Before setDeviceOrientationFrame(), service player was evicted. Skip setting device orientation frame"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x05c9 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x05c9 }
            return r1
        L_0x05a2:
            X.274 r6 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x05c9 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x05c9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x05c9 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x05c9 }
            java.lang.String r2 = "id [%d]: setDeviceOrientationFrame"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x05c9 }
            X.29n r2 = r6.A0c     // Catch:{ RemoteException -> 0x05c9 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x05c9 }
            if (r4 == 0) goto L_0x0fb0
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x05c9 }
            r2 = 13
            android.os.Message r2 = r3.obtainMessage(r2, r8)     // Catch:{ RemoteException -> 0x05c9 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x05c9 }
            return r1
        L_0x05c9:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting device orientation frame"
            goto L_0x0fa3
        L_0x05d2:
            X.4Mw r7 = r3.A0F
            java.lang.Object r8 = r5.obj
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x060d }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x060d }
            if (r2 != 0) goto L_0x05e6
            java.lang.String r3 = "Before setSpatialAudioFocus(), service player was evicted. Skip setting spatial audio focus"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x060d }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x060d }
            return r1
        L_0x05e6:
            X.274 r6 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x060d }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x060d }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x060d }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x060d }
            java.lang.String r2 = "id [%d]: setSpatialAudioFocus"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x060d }
            X.29n r2 = r6.A0c     // Catch:{ RemoteException -> 0x060d }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x060d }
            if (r4 == 0) goto L_0x0fb0
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x060d }
            r2 = 14
            android.os.Message r2 = r3.obtainMessage(r2, r8)     // Catch:{ RemoteException -> 0x060d }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x060d }
            return r1
        L_0x060d:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting spatial audio focus"
            goto L_0x0fa3
        L_0x0616:
            java.lang.Object r4 = r5.obj
            java.lang.String[] r4 = (java.lang.String[]) r4
            X.4Mw r9 = r3.A0F
            r12 = r4[r0]
            r11 = r4[r1]
            r8 = r4[r10]
            r2 = 3
            r7 = r4[r2]
            r2 = 4
            r6 = r4[r2]
            X.4OI r5 = r9.A07
            if (r5 == 0) goto L_0x0701
            X.3uU r3 = r5.A0K
            boolean r2 = r3.A03()
            if (r2 == 0) goto L_0x0701
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
            X.3uR r2 = r3.A07
            int r3 = r2.ordinal()
            if (r3 == r1) goto L_0x0647
            if (r3 == r0) goto L_0x066d
            r2 = 3
            if (r3 == r2) goto L_0x066a
            if (r3 != r10) goto L_0x0647
            java.lang.Integer r24 = X.AnonymousClass05K.A0N
        L_0x0647:
            X.4Mt r4 = r9.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "force live video to complete upon 410 dismiss error"
            A05(r4, r2, r3)
            boolean r2 = r9.A0A
            if (r2 == 0) goto L_0x0fb0
            X.5ro r21 = r4.A0A()
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0B
            java.lang.Object r9 = r2.get()
            X.4Mx r9 = (X.C263674Mx) r9
            if (r9 != 0) goto L_0x0670
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Force Video To End terminated early"
            A05(r4, r0, r2)
            return r1
        L_0x066a:
            java.lang.Integer r24 = X.AnonymousClass05K.A0j
            goto L_0x0647
        L_0x066d:
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            goto L_0x0647
        L_0x0670:
            long r2 = r9.A0E
            r7 = 0
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x067c
            boolean r2 = r9.A0O
            if (r2 == 0) goto L_0x0684
        L_0x067c:
            r9.A0O = r0
            r2 = -1
            r9.A0E = r2
            r9.A0F = r2
        L_0x0684:
            boolean r2 = r9.A0Q
            if (r2 != 0) goto L_0x06bf
            X.4NN r7 = r4.A02
            if (r7 == 0) goto L_0x06a1
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0N
            java.lang.Object r6 = r2.get()
            X.4My r6 = (X.C263684My) r6
            r3 = 0
            X.0qQ.A0B(r6, r1)
            X.1yA r2 = r7.A0C
            boolean r2 = r2.A0B
            if (r2 == 0) goto L_0x06a1
            X.AnonymousClass4NN.A09(r7, r6, r9, r3)
        L_0x06a1:
            X.4Mz r7 = r4.A0G
            r10 = 0
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0N
            java.lang.Object r8 = r2.get()
            X.4My r8 = (X.C263684My) r8
            java.lang.String r12 = "unknown"
            r17 = -1
            java.lang.String r2 = r5.A07
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r19 = r0
            r20 = r0
            r16 = r2
            r7.DyV(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20)
        L_0x06bf:
            X.4NN r8 = r4.A02
            if (r8 == 0) goto L_0x06df
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0N
            java.lang.Object r7 = r2.get()
            X.4My r7 = (X.C263684My) r7
            boolean r6 = r4.A0X
            java.lang.String r3 = r5.A07
            X.0qQ.A0B(r7, r1)
            r2 = 3
            X.0qQ.A0B(r3, r2)
            X.1yA r2 = r8.A0C
            boolean r2 = r2.A0B
            if (r2 == 0) goto L_0x06df
            X.AnonymousClass4NN.A0B(r8, r7, r9, r3, r6)
        L_0x06df:
            X.4Mz r7 = r4.A0G
            r25 = 0
            java.util.concurrent.atomic.AtomicReference r2 = r4.A0N
            java.lang.Object r6 = r2.get()
            X.4My r6 = (X.C263684My) r6
            boolean r3 = r4.A0X
            java.lang.String r2 = r5.A07
            r20 = r7
            r22 = r6
            r23 = r9
            r26 = r25
            r27 = r2
            r28 = r0
            r29 = r3
            r20.DxH(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x0701:
            r14 = 0
            X.4Mt r9 = r9.A0D
            X.4NN r10 = r9.A02
            if (r10 == 0) goto L_0x0728
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0B
            java.lang.Object r5 = r0.get()
            X.4Mx r5 = (X.C263674Mx) r5
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0N
            java.lang.Object r4 = r0.get()
            X.4My r4 = (X.C263684My) r4
            X.5OZ r3 = X.AnonymousClass5OZ.valueOf(r12)
            X.4Yz r2 = X.C266464Yz.valueOf(r11)
            X.5Oa r0 = new X.5Oa
            r0.<init>(r2, r3, r8, r7)
            r10.A0H(r0, r4, r5, r6)
        L_0x0728:
            X.4Mz r13 = r9.A0G
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0B
            java.lang.Object r4 = r0.get()
            X.4Mx r4 = (X.C263674Mx) r4
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0N
            java.lang.Object r3 = r0.get()
            X.4My r3 = (X.C263684My) r3
            X.5OZ r2 = X.AnonymousClass5OZ.valueOf(r12)
            X.4Yz r0 = X.C266464Yz.valueOf(r11)
            X.5Oa r15 = new X.5Oa
            r15.<init>(r0, r2, r8, r7)
            r17 = r4
            r18 = r6
            r16 = r3
            r13.DXX(r14, r15, r16, r17, r18)
            return r1
        L_0x0751:
            X.4Mw r8 = r3.A0F
            int r2 = r5.arg1
            r8.A00 = r2
            X.4Mt r7 = r8.A0D     // Catch:{ RemoteException -> 0x0781 }
            boolean r2 = r7.A0I()     // Catch:{ RemoteException -> 0x0781 }
            if (r2 != 0) goto L_0x0767
            java.lang.String r3 = "Before setRelativePosition(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0781 }
            A05(r7, r3, r2)     // Catch:{ RemoteException -> 0x0781 }
            return r1
        L_0x0767:
            X.274 r6 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x0781 }
            long r4 = r7.A0S     // Catch:{ RemoteException -> 0x0781 }
            int r2 = r8.A00     // Catch:{ RemoteException -> 0x0781 }
            long r2 = (long) r2     // Catch:{ RemoteException -> 0x0781 }
            boolean r2 = r6.A0A(r4, r2)     // Catch:{ RemoteException -> 0x0781 }
            if (r2 != 0) goto L_0x0fb0
            java.lang.String r3 = "When setRelativePosition(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0781 }
            A05(r7, r3, r2)     // Catch:{ RemoteException -> 0x0781 }
            X.C263664Mw.A03(r8)     // Catch:{ RemoteException -> 0x0781 }
            return r1
        L_0x0781:
            r2 = move-exception
            X.4Mt r4 = r8.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting relative position of the video"
            goto L_0x0fa3
        L_0x078a:
            X.4Mw r8 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            X.4Mt r9 = r8.A0D
            r9.A0X = r5
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x07e3 }
            if (r2 != 0) goto L_0x07a6
            java.lang.String r3 = "Before setLooping(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x07e3 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x07e3 }
            return r1
        L_0x07a6:
            X.274 r7 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x07e3 }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x07e3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x07e3 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x07e3 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6}     // Catch:{ RemoteException -> 0x07e3 }
            java.lang.String r2 = "id [%d]: setLooping %s"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x07e3 }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x07e3 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x07e3 }
            if (r4 != 0) goto L_0x07d0
            java.lang.String r3 = "When setLooping(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x07e3 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x07e3 }
            X.C263664Mw.A03(r8)     // Catch:{ RemoteException -> 0x07e3 }
            return r1
        L_0x07d0:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x07e3 }
            java.lang.String r2 = "Set Looping"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x07e3 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x07e3 }
            r2 = 18
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch:{ RemoteException -> 0x07e3 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x07e3 }
            return r1
        L_0x07e3:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting looping"
            goto L_0x0b91
        L_0x07ea:
            X.4Mw r4 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            X.4Mt r9 = r4.A0D
            r8 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r3 = new java.lang.Object[]{r7}
            java.lang.String r2 = "liveLatencyMode: %d"
            A05(r9, r2, r3)
            X.274 r6 = X.C263664Mw.A00(r4)     // Catch:{ RemoteException -> 0x0856 }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x0856 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0856 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r7}     // Catch:{ RemoteException -> 0x0856 }
            java.lang.String r2 = "id [%d]: liveLatencyMode %d"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0856 }
            X.29n r2 = r6.A0c     // Catch:{ RemoteException -> 0x0856 }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0856 }
            if (r5 != 0) goto L_0x082d
            java.lang.String r3 = "Fail to setLiveLatencyMode to : %d"
            if (r10 != 0) goto L_0x0824
            r8 = 0
        L_0x0824:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ RemoteException -> 0x0856 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0856 }
            goto L_0x0852
        L_0x082d:
            java.lang.Object[] r3 = new java.lang.Object[]{r7}     // Catch:{ RemoteException -> 0x0856 }
            java.lang.String r2 = "Set rewindableVideoMode: %d"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x0856 }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x0856 }
            r3 = 22
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x0856 }
            android.os.Message r2 = r4.obtainMessage(r3, r2)     // Catch:{ RemoteException -> 0x0856 }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x0856 }
            java.lang.String r3 = "setLiveLatencyMode successfully to : %d"
            if (r10 != 0) goto L_0x084a
            r8 = 0
        L_0x084a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ RemoteException -> 0x0856 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0856 }
        L_0x0852:
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0856 }
            return r1
        L_0x0856:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting liveLatencyMode the video"
            goto L_0x0b91
        L_0x085d:
            X.4Mw r4 = r3.A0F
            java.lang.Object r6 = r5.obj
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r8 = r6.intValue()
            X.4Mt r9 = r4.A0D
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            r2 = 3316(0xcf4, float:4.647E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            A05(r9, r2, r3)
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x08cd }
            if (r2 != 0) goto L_0x0884
            java.lang.String r3 = "player must be valid before updating the audioUsage"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x08cd }
        L_0x0880:
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x08cd }
            goto L_0x08cc
        L_0x0884:
            X.274 r7 = X.C263664Mw.A00(r4)     // Catch:{ RemoteException -> 0x08cd }
            long r2 = r9.A0S     // Catch:{ RemoteException -> 0x08cd }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ RemoteException -> 0x08cd }
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r6}     // Catch:{ RemoteException -> 0x08cd }
            java.lang.String r4 = "id [%d]: setAudioUsage %d"
            X.28J.A03(r4, r5)     // Catch:{ RemoteException -> 0x08cd }
            X.29n r4 = r7.A0c     // Catch:{ RemoteException -> 0x08cd }
            X.4OS r5 = r4.A00(r2)     // Catch:{ RemoteException -> 0x08cd }
            if (r5 != 0) goto L_0x08a6
            java.lang.String r3 = "failed to setAudioUsage to : %d"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x08cd }
        L_0x08a3:
            r2[r0] = r6     // Catch:{ RemoteException -> 0x08cd }
            goto L_0x0880
        L_0x08a6:
            java.lang.Object[] r3 = new java.lang.Object[]{r6}     // Catch:{ RemoteException -> 0x08cd }
            java.lang.String r2 = "Set audioUsage: %d"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x08cd }
            if (r8 == 0) goto L_0x08b7
            if (r8 == r10) goto L_0x08b5
            r2 = 0
            goto L_0x08b8
        L_0x08b5:
            r2 = 2
            goto L_0x08b8
        L_0x08b7:
            r2 = 1
        L_0x08b8:
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x08cd }
            r3 = 23
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ RemoteException -> 0x08cd }
            android.os.Message r2 = r4.obtainMessage(r3, r2)     // Catch:{ RemoteException -> 0x08cd }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x08cd }
            java.lang.String r3 = "setAudioUsage successfully to : %d"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x08cd }
            goto L_0x08a3
        L_0x08cc:
            return r1
        L_0x08cd:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "error occurred while setting audio usage"
            goto L_0x0b91
        L_0x08d4:
            X.4Mw r6 = r3.A0F
            X.4Mt r9 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "Force Video To End triggered"
            A05(r9, r2, r3)
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x0964 }
            if (r2 != 0) goto L_0x0936
            java.lang.String r3 = "Before pause(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0964 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0964 }
            return r1
        L_0x08ed:
            X.4Mw r6 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            X.4Mt r9 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "Pre Seek To"
            A05(r9, r2, r3)
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x0964 }
            if (r2 != 0) goto L_0x090e
            java.lang.String r3 = "Before preSeekTo(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0964 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0964 }
            return r1
        L_0x090e:
            X.274 r10 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0964 }
            long r2 = r9.A0S     // Catch:{ RemoteException -> 0x0964 }
            long r4 = (long) r4     // Catch:{ RemoteException -> 0x0964 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ RemoteException -> 0x0964 }
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ RemoteException -> 0x0964 }
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r7}     // Catch:{ RemoteException -> 0x0964 }
            java.lang.String r4 = "id [%d]: preSeekTo %d"
            X.28J.A03(r4, r5)     // Catch:{ RemoteException -> 0x0964 }
            X.29n r4 = r10.A0c     // Catch:{ RemoteException -> 0x0964 }
            X.4OS r4 = r4.A00(r2)     // Catch:{ RemoteException -> 0x0964 }
            if (r4 != 0) goto L_0x094f
            java.lang.String r3 = "When preSeekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0964 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0964 }
            goto L_0x094b
        L_0x0936:
            X.274 r5 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0964 }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x0964 }
            java.lang.String r2 = ""
            boolean r2 = r5.A0D(r2, r3, r1)     // Catch:{ RemoteException -> 0x0964 }
            if (r2 != 0) goto L_0x0fb0
            java.lang.String r3 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0964 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0964 }
        L_0x094b:
            X.C263664Mw.A03(r6)     // Catch:{ RemoteException -> 0x0964 }
            return r1
        L_0x094f:
            java.lang.Object[] r3 = new java.lang.Object[]{r7}     // Catch:{ RemoteException -> 0x0964 }
            java.lang.String r2 = "preSeekTo %d"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0964 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0964 }
            r2 = 26
            android.os.Message r2 = r3.obtainMessage(r2, r7)     // Catch:{ RemoteException -> 0x0964 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0964 }
            return r1
        L_0x0964:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while pausing the video"
            goto L_0x0b91
        L_0x096b:
            X.4Mw r8 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Number r2 = (java.lang.Number) r2
            float r7 = r2.floatValue()
            r6 = 1082130432(0x40800000, float:4.0)
            r5 = 1048576000(0x3e800000, float:0.25)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0981
            int r2 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x098a
        L_0x0981:
            X.4Mt r4 = r8.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r2 = "Trying to set playback speed with invalid value"
            A05(r4, r2, r3)
        L_0x098a:
            X.4Mt r9 = r8.A0D
            float r2 = java.lang.Math.min(r6, r7)
            float r2 = java.lang.Math.max(r5, r2)
            r9.A0P = r2
            boolean r2 = r9.A0I()     // Catch:{ RemoteException -> 0x09e3 }
            if (r2 != 0) goto L_0x09a4
            java.lang.String r3 = "Before setPlaybackSpeed(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09e3 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x09e3 }
            return r1
        L_0x09a4:
            X.274 r7 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x09e3 }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x09e3 }
            float r6 = r9.A0P     // Catch:{ RemoteException -> 0x09e3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x09e3 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x09e3 }
            java.lang.String r2 = "id [%d]: setPlaybackSpeed"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x09e3 }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x09e3 }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x09e3 }
            if (r5 != 0) goto L_0x09cc
            java.lang.String r3 = "When setPlaybackSpeed(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09e3 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x09e3 }
            X.C263664Mw.A03(r8)     // Catch:{ RemoteException -> 0x09e3 }
            return r1
        L_0x09cc:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09e3 }
            java.lang.String r2 = "Set playback speed"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x09e3 }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x09e3 }
            java.lang.Float r3 = java.lang.Float.valueOf(r6)     // Catch:{ RemoteException -> 0x09e3 }
            r2 = 27
            android.os.Message r2 = r4.obtainMessage(r2, r3)     // Catch:{ RemoteException -> 0x09e3 }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x09e3 }
            return r1
        L_0x09e3:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting playback speed"
            goto L_0x0b91
        L_0x09ea:
            X.4Mw r0 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.String r2 = (java.lang.String) r2
            X.4OI r0 = r0.A07
            if (r0 == 0) goto L_0x0fb0
            r0.A06 = r2
            return r1
        L_0x09f7:
            X.4Mw r7 = r3.A0F
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0a37 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0a37 }
            if (r2 != 0) goto L_0x0a09
            java.lang.String r3 = "Before retry(), service player was evicted. Lazy recover at next play()"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0a37 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0a37 }
            return r1
        L_0x0a09:
            X.274 r6 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0a37 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0a37 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0a37 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0a37 }
            java.lang.String r2 = "id [%d]: retry playback"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0a37 }
            X.29n r2 = r6.A0c     // Catch:{ RemoteException -> 0x0a37 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0a37 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0a37 }
            java.lang.String r2 = "retry"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0a37 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0a37 }
            r2 = 28
            android.os.Message r2 = r3.obtainMessage(r2)     // Catch:{ RemoteException -> 0x0a37 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0a37 }
            return r1
        L_0x0a37:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while retrying the same video playback"
            goto L_0x0fa3
        L_0x0a40:
            X.4Mw r7 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0ee9 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0ee9 }
            if (r2 != 0) goto L_0x0a5a
            java.lang.String r3 = "Before enableVideoTrack(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0ee9 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0ee9 }
            return r1
        L_0x0a5a:
            X.274 r8 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0ee9 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6}     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.String r2 = "id [%d]: enable video track %b"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0ee9 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0ee9 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0ee9 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.String r2 = "Enable Video Track"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0ee9 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0ee9 }
            r2 = 29
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch:{ RemoteException -> 0x0ee9 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0ee9 }
            return r1
        L_0x0a8c:
            X.4Mw r4 = r3.A0F
            java.lang.Object r5 = r5.obj
            X.4Mt r9 = r4.A0D
            java.lang.Object[] r3 = new java.lang.Object[]{r5}
            java.lang.String r2 = "should enable live low latency optimization: %s"
            A05(r9, r2, r3)
            X.274 r7 = X.C263664Mw.A00(r4)     // Catch:{ RemoteException -> 0x0ad8 }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x0ad8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0ad8 }
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r5}     // Catch:{ RemoteException -> 0x0ad8 }
            java.lang.String r2 = "id [%d]: setFullScreen %s"
            X.28J.A03(r2, r6)     // Catch:{ RemoteException -> 0x0ad8 }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0ad8 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0ad8 }
            if (r4 != 0) goto L_0x0ac0
            java.lang.String r3 = "Fail to enable live low latency optimization to : %s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x0ad8 }
        L_0x0aba:
            r2[r0] = r5     // Catch:{ RemoteException -> 0x0ad8 }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0ad8 }
            goto L_0x0ad7
        L_0x0ac0:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0ad8 }
            java.lang.String r2 = "Enable live low latency optimization"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0ad8 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0ad8 }
            r2 = 30
            android.os.Message r2 = r3.obtainMessage(r2, r5)     // Catch:{ RemoteException -> 0x0ad8 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0ad8 }
            java.lang.String r3 = "enable live low latency optimization successfully to : %s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x0ad8 }
            goto L_0x0aba
        L_0x0ad7:
            return r1
        L_0x0ad8:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while enabling live low latency optimization"
            goto L_0x0b91
        L_0x0adf:
            X.4Mw r4 = r3.A0F
            java.lang.Object r5 = r5.obj
            X.4Mt r9 = r4.A0D
            java.lang.Object[] r3 = new java.lang.Object[]{r5}
            java.lang.String r2 = "streamLatencyMode: %d"
            A05(r9, r2, r3)
            X.274 r7 = X.C263664Mw.A00(r4)     // Catch:{ RemoteException -> 0x0b2b }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x0b2b }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0b2b }
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r5}     // Catch:{ RemoteException -> 0x0b2b }
            java.lang.String r2 = "id [%d]: streamLatencyMode %d"
            X.28J.A03(r2, r6)     // Catch:{ RemoteException -> 0x0b2b }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0b2b }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0b2b }
            if (r4 != 0) goto L_0x0b13
            java.lang.String r3 = "Fail to streamLatencyMode to : %d"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x0b2b }
        L_0x0b0d:
            r2[r0] = r5     // Catch:{ RemoteException -> 0x0b2b }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0b2b }
            goto L_0x0b2a
        L_0x0b13:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0b2b }
            java.lang.String r2 = "Enable stream latency toggle"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0b2b }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0b2b }
            r2 = 31
            android.os.Message r2 = r3.obtainMessage(r2, r5)     // Catch:{ RemoteException -> 0x0b2b }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0b2b }
            java.lang.String r3 = "streamLatencyMode successfully to : %d"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x0b2b }
            goto L_0x0b0d
        L_0x0b2a:
            return r1
        L_0x0b2b:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting streamLatencyMode the video"
            goto L_0x0b91
        L_0x0b31:
            X.4Mw r0 = r3.A0F
            r0.A0B = r1
            r0.A09 = r1
            return r1
        L_0x0b38:
            X.4Mw r4 = r3.A0F
            java.lang.Object r6 = r5.obj
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r8 = r6.booleanValue()
            X.4Mt r9 = r4.A0D
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            java.lang.String r2 = "enableWakeLock: %s"
            A05(r9, r2, r3)
            X.274 r7 = X.C263664Mw.A00(r4)     // Catch:{ RemoteException -> 0x0b8c }
            long r3 = r9.A0S     // Catch:{ RemoteException -> 0x0b8c }
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0b8c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ RemoteException -> 0x0b8c }
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2}     // Catch:{ RemoteException -> 0x0b8c }
            java.lang.String r2 = "id [%d]: enableWakeLock %d"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0b8c }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0b8c }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0b8c }
            if (r4 != 0) goto L_0x0b76
            java.lang.String r3 = "Fail to enableWakeLock to : %s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x0b8c }
        L_0x0b70:
            r2[r0] = r6     // Catch:{ RemoteException -> 0x0b8c }
            A05(r9, r3, r2)     // Catch:{ RemoteException -> 0x0b8c }
            goto L_0x0b8b
        L_0x0b76:
            X.4T5 r3 = r4.A0R     // Catch:{ RemoteException -> 0x0b8c }
            if (r3 != 0) goto L_0x0b83
            android.content.Context r2 = r4.A0F     // Catch:{ RemoteException -> 0x0b8c }
            X.4T5 r3 = new X.4T5     // Catch:{ RemoteException -> 0x0b8c }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0b8c }
            r4.A0R = r3     // Catch:{ RemoteException -> 0x0b8c }
        L_0x0b83:
            r3.setEnabled(r8)     // Catch:{ RemoteException -> 0x0b8c }
            java.lang.String r3 = "enableWakeLock successfully to : %s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x0b8c }
            goto L_0x0b70
        L_0x0b8b:
            return r1
        L_0x0b8c:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setting enableWakeLock to the video"
        L_0x0b91:
            A04(r9, r0, r3, r2)
            return r1
        L_0x0b95:
            X.4Mw r7 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0be1 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0be1 }
            if (r2 != 0) goto L_0x0baf
            java.lang.String r3 = "Before onBeforeRender(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0be1 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0be1 }
            return r1
        L_0x0baf:
            X.274 r8 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0be1 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0be1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0be1 }
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch:{ RemoteException -> 0x0be1 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6}     // Catch:{ RemoteException -> 0x0be1 }
            java.lang.String r2 = "id [%d]: onBeforeRender %d"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0be1 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0be1 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0be1 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0be1 }
            java.lang.String r2 = "onBeforeRender"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0be1 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0be1 }
            r2 = 35
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch:{ RemoteException -> 0x0be1 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0be1 }
            return r1
        L_0x0be1:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while set onBeforeRender"
            goto L_0x0fa3
        L_0x0bea:
            X.4Mw r7 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0c36 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0c36 }
            if (r2 != 0) goto L_0x0c04
            java.lang.String r3 = "Before onRender(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0c36 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0c36 }
            return r1
        L_0x0c04:
            X.274 r8 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0c36 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0c36 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0c36 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x0c36 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6}     // Catch:{ RemoteException -> 0x0c36 }
            java.lang.String r2 = "id [%d]: onRender %b"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0c36 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0c36 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0c36 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0c36 }
            java.lang.String r2 = "onRender"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0c36 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0c36 }
            r2 = 36
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch:{ RemoteException -> 0x0c36 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0c36 }
            return r1
        L_0x0c36:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while set onRender "
            goto L_0x0fa3
        L_0x0c3f:
            X.4Mw r8 = r3.A0F
            X.4Mt r5 = r8.A0D     // Catch:{ RemoteException -> 0x0c72 }
            boolean r2 = r5.A0I()     // Catch:{ RemoteException -> 0x0c72 }
            if (r2 != 0) goto L_0x0c52
            java.lang.String r4 = "Before stop(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0c72 }
            A05(r5, r4, r2)     // Catch:{ RemoteException -> 0x0c72 }
            goto L_0x0fac
        L_0x0c52:
            X.274 r7 = X.C263664Mw.A00(r8)     // Catch:{ RemoteException -> 0x0c72 }
            long r4 = r5.A0S     // Catch:{ RemoteException -> 0x0c72 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ RemoteException -> 0x0c72 }
            java.lang.Object[] r6 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0c72 }
            java.lang.String r2 = "id [%d]: stop"
            X.28J.A03(r2, r6)     // Catch:{ RemoteException -> 0x0c72 }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0c72 }
            X.4OS r2 = r2.A00(r4)     // Catch:{ RemoteException -> 0x0c72 }
            if (r2 == 0) goto L_0x0fac
            r2.A0L()     // Catch:{ RemoteException -> 0x0c72 }
            goto L_0x0fac
        L_0x0c72:
            r10 = move-exception
            X.4Mt r7 = r8.A0D
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while stop player"
        L_0x0c79:
            A04(r7, r0, r10, r2)
            goto L_0x0fac
        L_0x0c7e:
            X.4Mw r6 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            X.4Mt r4 = r6.A0D     // Catch:{ RemoteException -> 0x0cd2 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0cd2 }
            if (r2 != 0) goto L_0x0c98
            java.lang.String r3 = "Before enableSR(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0cd2 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0cd2 }
            return r1
        L_0x0c98:
            X.274 r8 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0cd2 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0cd2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0cd2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ RemoteException -> 0x0cd2 }
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2}     // Catch:{ RemoteException -> 0x0cd2 }
            java.lang.String r2 = "id [%d]: enableSR %d"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0cd2 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0cd2 }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0cd2 }
            if (r5 == 0) goto L_0x0fb0
            java.lang.String r2 = "Enabling SR: "
            java.lang.String r3 = X.002.A1D(r2, r7)     // Catch:{ RemoteException -> 0x0cd2 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0cd2 }
            X.AnonymousClass4OS.A0E(r5, r3, r2)     // Catch:{ RemoteException -> 0x0cd2 }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x0cd2 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ RemoteException -> 0x0cd2 }
            r2 = 43
            android.os.Message r2 = r4.obtainMessage(r2, r3)     // Catch:{ RemoteException -> 0x0cd2 }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x0cd2 }
            return r1
        L_0x0cd2:
            r2 = move-exception
            X.4Mt r4 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while set enableSR "
            goto L_0x0fa3
        L_0x0cdb:
            java.lang.Object r2 = r5.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.4Mw r6 = r3.A0F
            r7 = 0
            r2 = r2[r1]
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r9 = r2.booleanValue()
            X.4Mt r4 = r6.A0D     // Catch:{ RemoteException -> 0x0d3f }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0d3f }
            if (r2 != 0) goto L_0x0cfa
            java.lang.String r3 = "Before reconfigureVrPlayer, service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0d3f }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0d3f }
            return r1
        L_0x0cfa:
            X.274 r8 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0d3f }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0d3f }
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0d3f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ RemoteException -> 0x0d3f }
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2}     // Catch:{ RemoteException -> 0x0d3f }
            java.lang.String r2 = "id [%d]: reconfigureVrPlayer %d"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0d3f }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0d3f }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0d3f }
            if (r5 == 0) goto L_0x0fb0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r5.A0w     // Catch:{ RemoteException -> 0x0d3f }
            X.1xH r2 = r2.A01     // Catch:{ RemoteException -> 0x0d3f }
            if (r2 == 0) goto L_0x0d24
            boolean r2 = r2.A0C     // Catch:{ RemoteException -> 0x0d3f }
            if (r2 == 0) goto L_0x0d24
            return r1
        L_0x0d24:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0d3f }
            java.lang.String r2 = "reconfigureVrPlayer"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x0d3f }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x0d3f }
            r3 = 48
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ RemoteException -> 0x0d3f }
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2}     // Catch:{ RemoteException -> 0x0d3f }
            android.os.Message r2 = r4.obtainMessage(r3, r2)     // Catch:{ RemoteException -> 0x0d3f }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x0d3f }
            return r1
        L_0x0d3f:
            r2 = move-exception
            X.4Mt r4 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while reconfigureVrPlayer "
            goto L_0x0fa3
        L_0x0d48:
            java.lang.Object r4 = r5.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            int r9 = r2.intValue()
            r2 = r4[r1]
            java.lang.Number r2 = (java.lang.Number) r2
            int r8 = r2.intValue()
            X.4Mw r6 = r3.A0F
            X.4Mt r4 = r6.A0D     // Catch:{ RemoteException -> 0x0da8 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0da8 }
            if (r2 != 0) goto L_0x0d6e
            java.lang.String r3 = "Before setVideoOutputResolution, service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0da8 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0da8 }
            return r1
        L_0x0d6e:
            X.274 r7 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0da8 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.String r2 = "id [%d]: setVideoOutputResolution"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0da8 }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0da8 }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0da8 }
            if (r5 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.String r2 = "setVideoOutputResolution"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x0da8 }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ RemoteException -> 0x0da8 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}     // Catch:{ RemoteException -> 0x0da8 }
            r2 = 44
            android.os.Message r2 = r4.obtainMessage(r2, r3)     // Catch:{ RemoteException -> 0x0da8 }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x0da8 }
            return r1
        L_0x0da8:
            r2 = move-exception
            X.4Mt r4 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while setVideoOutputResolution"
            goto L_0x0fa3
        L_0x0db1:
            X.4Mw r7 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0f94 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0f94 }
            if (r2 != 0) goto L_0x0dcb
            java.lang.String r3 = "Before selectAudioLangRole(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0f94 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0f94 }
            return r1
        L_0x0dcb:
            X.274 r8 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0f94 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6}     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.String r2 = "id [%d]: selectAudioLangRole: %b"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0f94 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0f94 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0f94 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.String r2 = "setAudioLangRole"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0f94 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0f94 }
            r2 = 45
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch:{ RemoteException -> 0x0f94 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0f94 }
            return r1
        L_0x0dfd:
            X.4Mw r6 = r3.A0F
            java.lang.Object r8 = r5.obj
            X.4Mt r4 = r6.A0D     // Catch:{ RemoteException -> 0x0e3f }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0e3f }
            if (r2 != 0) goto L_0x0e11
            java.lang.String r3 = "Before selectPreferredAudioLang(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0e3f }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0e3f }
            return r1
        L_0x0e11:
            X.274 r7 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0e3f }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0e3f }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0e3f }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r8}     // Catch:{ RemoteException -> 0x0e3f }
            java.lang.String r2 = "id [%d]: selectPreferredAudioLang: %s"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0e3f }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0e3f }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0e3f }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0e3f }
            java.lang.String r2 = "setPreferredAudioLang"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0e3f }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0e3f }
            r2 = 46
            android.os.Message r2 = r3.obtainMessage(r2, r8)     // Catch:{ RemoteException -> 0x0e3f }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0e3f }
            return r1
        L_0x0e3f:
            r2 = move-exception
            X.4Mt r4 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while selectPreferredAudioLang"
            goto L_0x0fa3
        L_0x0e48:
            X.4Mw r6 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            X.4Mt r4 = r6.A0D     // Catch:{ RemoteException -> 0x0e94 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0e94 }
            if (r2 != 0) goto L_0x0e62
            java.lang.String r3 = "Before selectAudioRole(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0e94 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0e94 }
            return r1
        L_0x0e62:
            X.274 r8 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0e94 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0e94 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0e94 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ RemoteException -> 0x0e94 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r7}     // Catch:{ RemoteException -> 0x0e94 }
            java.lang.String r2 = "id [%d]: selectAudioRole: %b"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0e94 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0e94 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0e94 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0e94 }
            java.lang.String r2 = "selectAudioRole"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0e94 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0e94 }
            r2 = 47
            android.os.Message r2 = r3.obtainMessage(r2, r7)     // Catch:{ RemoteException -> 0x0e94 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0e94 }
            return r1
        L_0x0e94:
            r2 = move-exception
            X.4Mt r4 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while selectAudioRole"
            goto L_0x0fa3
        L_0x0e9d:
            X.4Mw r7 = r3.A0F
            java.lang.Object r2 = r5.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0ee9 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0ee9 }
            if (r2 != 0) goto L_0x0eb7
            java.lang.String r3 = "Before enableAudioTrack(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0ee9 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0ee9 }
            return r1
        L_0x0eb7:
            X.274 r8 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0ee9 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6}     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.String r2 = "id [%d]: enable audio track %b"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0ee9 }
            X.29n r2 = r8.A0c     // Catch:{ RemoteException -> 0x0ee9 }
            X.4OS r4 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0ee9 }
            if (r4 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0ee9 }
            java.lang.String r2 = "Enable Audio Track"
            X.AnonymousClass4OS.A0E(r4, r2, r3)     // Catch:{ RemoteException -> 0x0ee9 }
            android.os.Handler r3 = r4.A0G     // Catch:{ RemoteException -> 0x0ee9 }
            r2 = 49
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch:{ RemoteException -> 0x0ee9 }
            X.AnonymousClass4OS.A07(r2, r4)     // Catch:{ RemoteException -> 0x0ee9 }
            return r1
        L_0x0ee9:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while set video track visibilty"
            goto L_0x0fa3
        L_0x0ef2:
            java.lang.Object r4 = r5.obj
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.4Mw r6 = r3.A0F
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            r8 = r4[r1]
            X.4Mt r4 = r6.A0D     // Catch:{ RemoteException -> 0x0f9c }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0f9c }
            if (r2 != 0) goto L_0x0f12
            java.lang.String r3 = "Before schedulePlaybackPosition(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0f9c }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0f9c }
            return r1
        L_0x0f12:
            X.274 r7 = X.C263664Mw.A00(r6)     // Catch:{ RemoteException -> 0x0f9c }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0f9c }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0f9c }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0f9c }
            java.lang.String r2 = "id [%d]: schedulePlaybackPosition"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0f9c }
            X.29n r2 = r7.A0c     // Catch:{ RemoteException -> 0x0f9c }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0f9c }
            if (r5 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0f9c }
            java.lang.String r2 = "schedulePlaybackPosition"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x0f9c }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x0f9c }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ RemoteException -> 0x0f9c }
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r8}     // Catch:{ RemoteException -> 0x0f9c }
            r2 = 50
            android.os.Message r2 = r4.obtainMessage(r2, r3)     // Catch:{ RemoteException -> 0x0f9c }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x0f9c }
            return r1
        L_0x0f48:
            java.lang.Object r2 = r5.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r8 = r2[r0]
            r6 = r2[r1]
            X.4Mw r7 = r3.A0F
            X.4Mt r4 = r7.A0D     // Catch:{ RemoteException -> 0x0f94 }
            boolean r2 = r4.A0I()     // Catch:{ RemoteException -> 0x0f94 }
            if (r2 != 0) goto L_0x0f62
            java.lang.String r3 = "Before handleExternalError(), service player was evicted. Skip it"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0f94 }
            A05(r4, r3, r2)     // Catch:{ RemoteException -> 0x0f94 }
            return r1
        L_0x0f62:
            X.274 r9 = X.C263664Mw.A00(r7)     // Catch:{ RemoteException -> 0x0f94 }
            long r3 = r4.A0S     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.Object[] r5 = new java.lang.Object[]{r2}     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.String r2 = "id [%d]: handleExternalError"
            X.28J.A03(r2, r5)     // Catch:{ RemoteException -> 0x0f94 }
            X.29n r2 = r9.A0c     // Catch:{ RemoteException -> 0x0f94 }
            X.4OS r5 = r2.A00(r3)     // Catch:{ RemoteException -> 0x0f94 }
            if (r5 == 0) goto L_0x0fb0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.String r2 = "handleExternalError"
            X.AnonymousClass4OS.A0E(r5, r2, r3)     // Catch:{ RemoteException -> 0x0f94 }
            android.os.Handler r4 = r5.A0G     // Catch:{ RemoteException -> 0x0f94 }
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r6}     // Catch:{ RemoteException -> 0x0f94 }
            r2 = 51
            android.os.Message r2 = r4.obtainMessage(r2, r3)     // Catch:{ RemoteException -> 0x0f94 }
            X.AnonymousClass4OS.A07(r2, r5)     // Catch:{ RemoteException -> 0x0f94 }
            return r1
        L_0x0f94:
            r2 = move-exception
            X.4Mt r4 = r7.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while selectAudioLangRole"
            goto L_0x0fa3
        L_0x0f9c:
            r2 = move-exception
            X.4Mt r4 = r6.A0D
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "Error occurs while schedulePlaybackPosition"
        L_0x0fa3:
            A04(r4, r0, r2, r3)
            return r1
        L_0x0fa7:
            X.4Mw r0 = r3.A0F
            X.C263664Mw.A04(r0)
        L_0x0fac:
            X.4N7 r0 = r3.A05
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x0fb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263634Mt.handleMessage(android.os.Message):boolean");
    }

    private long A00() {
        if (!A0I()) {
            return 0;
        }
        C263674Mx r1 = (C263674Mx) this.A0B.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!r1.A0Q || r1.A0O) {
            return 0;
        }
        return elapsedRealtime - r1.A0H;
    }

    public final long A06() {
        if (!A0I()) {
            return 0;
        }
        if (!this.A0Y || SystemClock.elapsedRealtime() - this.A0V > 1000) {
            return ((C263674Mx) this.A0B.get()).A08 + A00();
        }
        return this.A0T;
    }

    public final long A07() {
        if (A0I()) {
            return ((C263674Mx) this.A0B.get()).A0B;
        }
        return 0;
    }

    public final long A08() {
        AnonymousClass4OI r0;
        if (!A0I()) {
            return 0;
        }
        C263664Mw r5 = this.A0F;
        if (r5.A07 == null || !this.A0Y || SystemClock.elapsedRealtime() - this.A0V > 1000 || ((r0 = r5.A07) != null && r0.A0K.A03())) {
            return ((C263674Mx) this.A0B.get()).A00() + A00();
        }
        return this.A0T;
    }

    public final void A0G(String str, float f) {
        Float valueOf = Float.valueOf(f);
        A05(this, "setVolume %f, trigger: %s", valueOf, str);
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(5, new Object[]{valueOf, str}));
    }

    public final void A0H(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        A05(this, "setLooping: %s", valueOf);
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(19, valueOf));
    }

    public final boolean A0J() {
        if (!A0I() || !((C263674Mx) this.A0B.get()).A0Q) {
            return false;
        }
        return true;
    }
}
