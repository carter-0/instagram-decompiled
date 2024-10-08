package X;

import android.os.SystemClock;
import android.util.LruCache;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4N0  reason: invalid class name */
public final class AnonymousClass4N0 implements C263654Mv {
    public static final LruCache A07 = new LruCache(200);
    public static final AtomicBoolean A08 = new AtomicBoolean(false);
    public AnonymousClass4Yf A00;
    public AnonymousClass4Yf A01;
    public AnonymousClass5ME A02;
    public AnonymousClass5ME A03;
    public final WeakReference A04;
    public final AnonymousClass4N1 A05;
    public final AnonymousClass4N4 A06 = new AnonymousClass4N4(new AnonymousClass4N2(), new Object());

    public final /* synthetic */ void Cwg(AnonymousClass4Yf r1) {
    }

    public final /* synthetic */ void D4H(String str, boolean z) {
    }

    public final void D7z(long j, String str, boolean z) {
    }

    public final void D80(int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.4Yk] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.4Yl, X.4Pe] */
    public final void DAN(AnonymousClass4Yf r6, String str, List list, long j, boolean z) {
        A02((C263674Mx) null, (Integer) null);
        String str2 = r6.A0E;
        boolean z2 = true;
        if (str2 != null) {
            boolean z3 = false;
            if (str2.contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                z3 = true;
            }
            if (!str2.contains(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                z2 = false;
            }
            if (z3 || z2) {
                AnonymousClass4WI A002 = A00(new Object());
                this.A04.get();
                this.A05.A05(new C264254Pe(A002));
                if (z3) {
                    this.A01 = r6;
                }
                if (z2) {
                    this.A00 = r6;
                }
            }
        }
    }

    public final void DCz(C284815Oa r1, String str, String str2, String str3, long j) {
    }

    public final /* synthetic */ void DGr(String str, long j) {
    }

    public final /* synthetic */ void DKJ(String str, byte[] bArr, long j) {
    }

    public final void DNp(boolean z) {
    }

    public final void DNr(String str, byte[] bArr, long j, long j2) {
    }

    public final /* synthetic */ void DNz(C17183VLn vLn) {
    }

    public final /* synthetic */ void DS6(Object obj) {
    }

    public final void DTt(byte[] bArr, long j) {
    }

    public final /* synthetic */ void DWg(String str, String str2) {
    }

    public final /* synthetic */ void DXW() {
    }

    public final void DXX(C297475ro r8, C284815Oa r9, C263684My r10, C263674Mx r11, String str) {
        A02(r11, (Integer) null);
        this.A05.A01(new UUE(r8, r9, r10, r11, str));
    }

    public final /* synthetic */ void DXc(2Co r1) {
    }

    public final void DXg(C263674Mx r1, float f, long j) {
    }

    public final void DYz(long j, String str) {
    }

    public final void DZ3() {
    }

    public final void DmQ(C263684My r1, C263674Mx r2, String str, long j, boolean z, boolean z2) {
    }

    public final void DnM(long j, long j2, boolean z, boolean z2, boolean z3) {
    }

    public final /* synthetic */ void DnZ(C297475ro r1) {
    }

    public final void Dnv(boolean z) {
    }

    public final void Drl(List list) {
    }

    public final void Dt8(C284815Oa r1, AnonymousClass4Yf r2, AnonymousClass4Yf r3, String str, String str2, List list, long j) {
    }

    public final void DyF() {
    }

    public final void DyH(int i, int i2, float f) {
    }

    public final void Dzh(boolean z, boolean z2) {
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onSeeking(long j) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.4Yk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.4Yk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.4Yk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.4Yk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4Yk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.4Yk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass4WI A00(X.C266314Yk r7) {
        /*
            r6 = this;
            X.4Yf r0 = r6.A01
            if (r0 != 0) goto L_0x0021
            r3 = 0
        L_0x0005:
            X.4Yf r0 = r6.A00
            if (r0 != 0) goto L_0x0015
            r4 = 0
        L_0x000a:
            X.5ME r1 = r6.A03
            X.5ME r2 = r6.A02
            X.4WI r0 = new X.4WI
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x0015:
            java.lang.String r1 = r0.A0E
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.4Yk r4 = new X.4Yk
            r4.<init>()
            goto L_0x000a
        L_0x0021:
            java.lang.String r1 = r0.A0E
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.4Yk r3 = new X.4Yk
            r3.<init>()
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4N0.A00(X.4Yk):X.4WI");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.5MB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.5MB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.5MB} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.5MA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass5MC A01() {
        /*
            r9 = this;
            X.4N4 r4 = r9.A06
            monitor-enter(r4)
            long r5 = r4.A03     // Catch:{ all -> 0x0091 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            java.lang.String r2 = "StallTimeCalculation"
            java.lang.String r1 = "Must call .end() first"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0091 }
            X.27B.A01(r2, r1, r0)     // Catch:{ all -> 0x0091 }
        L_0x0015:
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0091 }
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            long r7 = r7 - r0
        L_0x001d:
            java.util.List r6 = r4.A0B     // Catch:{ all -> 0x0091 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0091 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003b
            r5 = 0
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x0091 }
            X.5M9 r0 = (X.AnonymousClass5M9) r0     // Catch:{ all -> 0x0091 }
            long r2 = r0.A02     // Catch:{ all -> 0x0091 }
            long r0 = r0.A00     // Catch:{ all -> 0x0091 }
            long r2 = r2 + r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
            r6.remove(r5)     // Catch:{ all -> 0x0091 }
            goto L_0x001d
        L_0x003b:
            X.5M9 r2 = r4.A05     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0091 }
            r5.<init>(r6)     // Catch:{ all -> 0x0091 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x0061
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0091 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0091 }
        L_0x004f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0059
            r1.next()     // Catch:{ all -> 0x0091 }
            goto L_0x004f
        L_0x0059:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0091 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0091 }
        L_0x0061:
            monitor-exit(r4)
            X.5MA r4 = new X.5MA
            r4.<init>()
            if (r2 == 0) goto L_0x0089
            X.5MB r3 = new X.5MB
            r3.<init>()
        L_0x006e:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r1 = r5.iterator()
        L_0x0077:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008b
            r1.next()
            X.5MB r0 = new X.5MB
            r0.<init>()
            r2.add(r0)
            goto L_0x0077
        L_0x0089:
            r3 = 0
            goto L_0x006e
        L_0x008b:
            X.5MC r0 = new X.5MC
            r0.<init>(r3, r4, r2)
            return r0
        L_0x0091:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4N0.A01():X.5MC");
    }

    private Integer A02(C263674Mx r3, Integer num) {
        AnonymousClass4OI r0;
        C263634Mt r02 = (C263634Mt) this.A04.get();
        if (r02 != null) {
            r0 = r02.A0F.A07;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            int ordinal = r0.A0K.A07.ordinal();
            if (ordinal == 2) {
                return AnonymousClass05K.A0N;
            }
            if (ordinal == 0) {
                return AnonymousClass05K.A01;
            }
            if (ordinal == 1) {
                return AnonymousClass05K.A0C;
            }
        } else {
            if (r3 != null) {
                try {
                    return C296375px.A00(r3.A0M);
                } catch (IllegalArgumentException | NullPointerException unused) {
                }
            }
            if (num != null) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }

    public final void DxA(C263684My r4, C263674Mx r5, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A06.A01();
        AnonymousClass5MC A012 = A01();
        A02((C263674Mx) null, A02(r5, (Integer) null));
        this.A05.A00(new C14095Tpn(r5, A012, str, str3));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.5MA] */
    public final void DxH(C297475ro r5, C263684My r6, C263674Mx r7, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        C263634Mt r0 = (C263634Mt) this.A04.get();
        if (r0 != null) {
            r0.A08();
            r0.A07();
        }
        AnonymousClass5MC r2 = new AnonymousClass5MC((AnonymousClass5MB) null, new Object(), Collections.emptyList());
        A02((C263674Mx) null, num);
        this.A05.A02(new C299765vo(A00((C266314Yk) null), r2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.5MA] */
    public final void Dxb(C297475ro r5, C263684My r6, C263674Mx r7, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        C263634Mt r0 = (C263634Mt) this.A04.get();
        if (r0 != null) {
            r0.A08();
            r0.A07();
        }
        AnonymousClass5MC r2 = new AnonymousClass5MC((AnonymousClass5MB) null, new Object(), Collections.emptyList());
        A02((C263674Mx) null, num);
        this.A05.A03(new C300005wN(r7, A00((C266314Yk) null), r2));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.4Pe, X.4Pd] */
    public final void DyA() {
        long j;
        AnonymousClass4OI r0;
        String str;
        A08.compareAndSet(false, true);
        WeakReference weakReference = this.A04;
        C263634Mt r02 = (C263634Mt) weakReference.get();
        if (r02 != null) {
            j = r02.A08();
            r02.A07();
        } else {
            j = -1;
        }
        AnonymousClass4N4 r8 = this.A06;
        r8.A00();
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        synchronized (r8) {
            if (i == 0) {
                if (r8.A03 < 0) {
                    r8.A03 = SystemClock.elapsedRealtime();
                }
            } else if (r8.A03 < 0) {
                r8.A03 = SystemClock.elapsedRealtime();
                r8.A02 = j;
            }
        }
        C263634Mt r03 = (C263634Mt) weakReference.get();
        if (!(r03 == null || (r0 = r03.A0F.A07) == null || (str = r0.A0K.A0G) == null)) {
            LruCache lruCache = A07;
            synchronized (lruCache) {
                lruCache.get(str);
            }
        }
        A02((C263674Mx) null, (Integer) null);
        weakReference.get();
        this.A05.A06(new C264254Pe((AnonymousClass4WI) null));
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.5ME] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.5ME] */
    public final void DyV(C263684My r6, C263674Mx r7, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        AnonymousClass4OI r0;
        String str8;
        C263634Mt r02 = (C263634Mt) this.A04.get();
        if (r02 != null && (r0 = r02.A0F.A07) != null && (str8 = r0.A0K.A0G) != null) {
            this.A06.A01();
            AnonymousClass5MC A012 = A01();
            boolean z3 = false;
            LruCache lruCache = A07;
            synchronized (lruCache) {
                if (lruCache.get(str8) == null) {
                    z3 = true;
                }
                lruCache.put(str8, str8);
            }
            A02(r7, (Integer) null);
            AnonymousClass4WI A002 = A00((C266314Yk) null);
            if (z3) {
                this.A05.A07(new AnonymousClass5MD(r6, r7, A002, A012));
            } else {
                this.A05.A08(new C292645jI(r6, r7, A002, A012));
            }
            this.A03 = new Object();
            this.A02 = new Object();
        }
    }

    public final void E06(C284815Oa r3) {
        this.A04.get();
        this.A05.A04(new UUD(r3));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.4N3] */
    public AnonymousClass4N0(C263634Mt r4, Set set) {
        this.A05 = new AnonymousClass4N1(set);
        this.A04 = new WeakReference(r4);
    }
}
