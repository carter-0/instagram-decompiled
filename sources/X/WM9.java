package X;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class WM9 implements C290325f8 {
    public int A00;
    public C17189VLt A01;
    public C10457RsY A02;
    public byte[] A03;
    public byte[] A04;
    public int A05;
    public HandlerThread A06;
    public X10 A07;
    public Q7s A08;
    public AnonymousClass5OP A09;
    public final X12 A0A;
    public final C14689U1o A0B;
    public final C21005X9c A0C;
    public final C13460Tan A0D;
    public final C265084Sm A0E;
    public final C19878Wh7 A0F = new C19878Wh7();
    public final List A0G;
    public final UUID A0H;
    public final Looper A0I;
    public final C264894Rs A0J;
    public final X13 A0K;
    public final HashMap A0L;

    private void A04(byte[] bArr, int i, boolean z) {
        try {
            C17189VLt BK8 = this.A0C.BK8(this.A0L, this.A0G, bArr, i);
            this.A01 = BK8;
            Q7s q7s = this.A08;
            AnonymousClass4Y0.A03.getAndIncrement();
            SystemClock.elapsedRealtime();
            Pxe.A1N(q7s, new C10592Rum(BK8, z), 1);
        } catch (Exception e) {
            A02(this, e, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r2.split("_", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if ("neg".equals(r4[r3 - 2]) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.WM9 r6, java.lang.Exception r7, int r8) {
        /*
            boolean r0 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r0 == 0) goto L_0x0037
            r0 = r7
            android.media.MediaDrm$MediaDrmStateException r0 = (android.media.MediaDrm.MediaDrmStateException) r0
            java.lang.String r2 = r0.getDiagnosticInfo()
            r5 = 0
            if (r2 == 0) goto L_0x006a
            java.lang.String r1 = "_"
            r0 = -1
            java.lang.String[] r4 = r2.split(r1, r0)
            int r3 = r4.length
            r1 = 2
            if (r3 < r1) goto L_0x006a
            int r0 = r3 + -1
            r2 = r4[r0]
            r0 = 3
            if (r3 < r0) goto L_0x002c
            int r3 = r3 - r1
            r1 = r4[r3]
            java.lang.String r0 = "neg"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r2.getClass()     // Catch:{ NumberFormatException -> 0x006a }
            int r5 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x006a }
            if (r0 == 0) goto L_0x006a
            goto L_0x0069
        L_0x0037:
            boolean r0 = r7 instanceof android.media.MediaDrmResetException
            if (r0 != 0) goto L_0x0066
            r1 = 6002(0x1772, float:8.41E-42)
            boolean r0 = r7 instanceof android.media.NotProvisionedException
            if (r0 != 0) goto L_0x006e
            boolean r0 = r7 instanceof android.media.DeniedByServerException
            if (r0 == 0) goto L_0x0048
            r1 = 6007(0x1777, float:8.418E-42)
            goto L_0x006e
        L_0x0048:
            boolean r0 = r7 instanceof X.AnonymousClass2A7
            if (r0 == 0) goto L_0x004f
            r1 = 6001(0x1771, float:8.409E-42)
            goto L_0x006e
        L_0x004f:
            boolean r0 = r7 instanceof X.V1j
            if (r0 == 0) goto L_0x0056
            r1 = 6003(0x1773, float:8.412E-42)
            goto L_0x006e
        L_0x0056:
            boolean r0 = r7 instanceof X.C16688V1r
            if (r0 == 0) goto L_0x005d
            r1 = 6008(0x1778, float:8.419E-42)
            goto L_0x006e
        L_0x005d:
            r0 = 1
            if (r8 == r0) goto L_0x0066
            r0 = 2
            if (r8 != r0) goto L_0x006e
            r1 = 6004(0x1774, float:8.413E-42)
            goto L_0x006e
        L_0x0066:
            r1 = 6006(0x1776, float:8.416E-42)
            goto L_0x006e
        L_0x0069:
            int r5 = -r5
        L_0x006a:
            int r1 = com.google.android.exoplayer2.util.Util.A01(r5)
        L_0x006e:
            X.5OP r0 = new X.5OP
            r0.<init>(r1, r7)
            r6.A09 = r0
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            X.2AG.A05(r1, r0, r7)
            X.Wh7 r0 = r6.A0F
            java.util.Set r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0086:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r1.next()
            X.4Sw r0 = (X.C265184Sw) r0
            r0.A04(r7)
            goto L_0x0086
        L_0x0096:
            int r1 = r6.A00
            r0 = 4
            if (r1 == r0) goto L_0x009e
            r0 = 1
            r6.A00 = r0
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WM9.A01(X.WM9, java.lang.Exception, int):void");
    }

    public static void A02(WM9 wm9, Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            WM6 wm6 = (WM6) wm9.A0A;
            wm6.A01.add(wm9);
            if (wm6.A00 == null) {
                wm6.A00 = wm9;
                wm9.A06();
                return;
            }
            return;
        }
        int i = 2;
        if (z) {
            i = 1;
        }
        A01(wm9, exc, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ NumberFormatException -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.WM9 r8, boolean r9) {
        /*
            byte[] r7 = r8.A04
            r2 = 1
            r5 = 2
            byte[] r1 = r8.A03
            if (r1 != 0) goto L_0x000c
            r8.A04(r7, r2, r9)
        L_0x000b:
            return
        L_0x000c:
            int r0 = r8.A00
            r6 = 4
            if (r0 == r6) goto L_0x0016
            X.X9c r0 = r8.A0C     // Catch:{ Exception -> 0x00b2 }
            r0.EIu(r7, r1)     // Catch:{ Exception -> 0x00b2 }
        L_0x0016:
            java.util.UUID r1 = X.AnonymousClass4T7.A04
            java.util.UUID r0 = r8.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0096
            A00(r8)
            byte[] r1 = r8.A04
            if (r1 == 0) goto L_0x0052
            X.X9c r0 = r8.A0C
            java.util.Map r3 = r0.E5n(r1)
            if (r3 == 0) goto L_0x0052
            java.lang.String r0 = "LicenseDurationRemaining"
            java.lang.String r0 = X.DbT.A11(r0, r3)     // Catch:{ NumberFormatException -> 0x003c }
            if (r0 == 0) goto L_0x003c
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x003c }
            goto L_0x0041
        L_0x003c:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0041:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "PlaybackDurationRemaining"
            java.lang.String r0 = X.DbT.A11(r0, r3)     // Catch:{ NumberFormatException -> 0x0054 }
            if (r0 == 0) goto L_0x0054
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0054 }
            goto L_0x0059
        L_0x0052:
            r1 = 0
            goto L_0x0062
        L_0x0054:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0059:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r0)
        L_0x0062:
            r1.getClass()
            java.lang.Object r0 = r1.first
            long r2 = X.AnonymousClass7TE.A0R(r0)
            java.lang.Object r0 = r1.second
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r3 = java.lang.Math.min(r2, r0)
            r1 = 60
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            java.lang.String r0 = "Offline license has expired or will expire soon. Remaining seconds: "
            X.002.A0Q(r0, r3)
            X.2AG.A01()
            r8.A04(r7, r5, r9)
            return
        L_0x0087:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            X.V1r r0 = new X.V1r
            r0.<init>()
            A01(r8, r0, r5)
            return
        L_0x0096:
            r8.A00 = r6
            X.Wh7 r0 = r8.A0F
            java.util.Set r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            X.4Sw r0 = (X.C265184Sw) r0
            r0.A01()
            goto L_0x00a2
        L_0x00b2:
            r0 = move-exception
            A01(r8, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WM9.A03(X.WM9, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2 == 4) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.WM9 r5) {
        /*
            int r2 = r5.A00
            r4 = 3
            if (r2 == r4) goto L_0x0009
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r3 = 1
            if (r0 != 0) goto L_0x005d
            X.X9c r2 = r5.A0C     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            byte[] r1 = r2.E1G()     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            r5.A04 = r1     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            X.4Rs r0 = r5.A0J     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            r2.Eg5(r0, r1)     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            byte[] r0 = r5.A04     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            X.X10 r0 = r2.ALl(r0)     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            r5.A07 = r0     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            r5.A00 = r4     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            X.Wh7 r0 = r5.A0F     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            java.util.Set r0 = r0.A01()     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
        L_0x002e:
            boolean r0 = r1.hasNext()     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r1.next()     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            X.4Sw r0 = (X.C265184Sw) r0     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            r0.A03(r4)     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            goto L_0x002e
        L_0x003e:
            byte[] r0 = r5.A04     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            r0.getClass()     // Catch:{ NotProvisionedException -> 0x0044, Exception -> 0x0057 }
            return r3
        L_0x0044:
            X.X12 r1 = r5.A0A
            X.WM6 r1 = (X.WM6) r1
            java.util.Set r0 = r1.A01
            r0.add(r5)
            X.WM9 r0 = r1.A00
            if (r0 != 0) goto L_0x005b
            r1.A00 = r5
            r5.A06()
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            A01(r5, r0, r3)
        L_0x005b:
            r0 = 0
            return r0
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WM9.A05(X.WM9):boolean");
    }

    public final void A06() {
        C10457RsY Bi7 = this.A0C.Bi7();
        this.A02 = Bi7;
        Q7s q7s = this.A08;
        AnonymousClass4Y0.A03.getAndIncrement();
        SystemClock.elapsedRealtime();
        Pxe.A1N(q7s, new C10592Rum(Bi7, true), 0);
    }

    public WM9(Looper looper, C264894Rs r3, X12 x12, X13 x13, C21005X9c x9c, C13460Tan tan, C265084Sm r8, HashMap hashMap, List list, UUID uuid) {
        this.A0H = uuid;
        this.A0A = x12;
        this.A0K = x13;
        this.A0C = x9c;
        list.getClass();
        this.A0G = Collections.unmodifiableList(list);
        this.A0L = hashMap;
        this.A0D = tan;
        this.A0E = r8;
        this.A0J = r3;
        this.A00 = 2;
        this.A0I = looper;
        this.A0B = new C14689U1o(looper, this);
    }

    public static void A00(WM9 wm9) {
        Thread currentThread = Thread.currentThread();
        Looper looper = wm9.A0I;
        if (currentThread != looper.getThread()) {
            2AG.A06("DefaultDrmSession", 002.A0u("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ", currentThread.getName(), "\nExpected thread: ", looper.getThread().getName()), new IllegalStateException());
        }
    }

    public final void A7C(C265184Sw r8) {
        int i;
        A00(this);
        int i2 = this.A05;
        boolean z = false;
        if (i2 < 0) {
            2AG.A03("DefaultDrmSession", 002.A0O("Session reference count less than zero: ", i2));
            this.A05 = 0;
        }
        if (r8 != null) {
            C19878Wh7 wh7 = this.A0F;
            synchronized (wh7.A02) {
                ArrayList arrayList = new ArrayList(wh7.A00);
                arrayList.add(r8);
                wh7.A00 = Collections.unmodifiableList(arrayList);
                Map map = wh7.A03;
                Integer num = (Integer) map.get(r8);
                if (num == null) {
                    HashSet hashSet = new HashSet(wh7.A01);
                    hashSet.add(r8);
                    wh7.A01 = Collections.unmodifiableSet(hashSet);
                }
                int i3 = 1;
                if (num != null) {
                    i3 = 1 + num.intValue();
                }
                C66580MXl.A1T(r8, map, i3);
            }
        }
        int i4 = this.A05 + 1;
        this.A05 = i4;
        if (i4 == 1) {
            if (this.A00 == 2) {
                z = true;
            }
            C256703wD.A04(z);
            HandlerThread A0I2 = Pxf.A0I("ExoPlayer:DrmRequestHandler");
            this.A06 = A0I2;
            A0I2.start();
            this.A08 = new Q7s(this.A06.getLooper(), this);
            if (A05(this)) {
                A03(this, true);
            }
        } else if (r8 != null && (((i = this.A00) == 3 || i == 4) && this.A0F.A00(r8) == 1)) {
            r8.A03(this.A00);
        }
        WMB wmb = ((WM7) this.A0K).A00;
        if (wmb.A06 != -9223372036854775807L) {
            wmb.A09.remove(this);
            Handler handler = wmb.A01;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final X10 At4() {
        A00(this);
        return this.A07;
    }

    public final AnonymousClass5OP B27() {
        A00(this);
        if (this.A00 == 1) {
            return this.A09;
        }
        return null;
    }

    public final UUID Bpi() {
        A00(this);
        return this.A0H;
    }

    public final int Bz1() {
        A00(this);
        return this.A00;
    }

    public final boolean E2s() {
        A00(this);
        return false;
    }

    public final void ECN(C265184Sw r10) {
        A00(this);
        int i = this.A05;
        if (i <= 0) {
            2AG.A03("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.A05 = i2;
        if (i2 == 0) {
            this.A00 = 0;
            this.A0B.removeCallbacksAndMessages((Object) null);
            Q7s q7s = this.A08;
            synchronized (q7s) {
                q7s.removeCallbacksAndMessages((Object) null);
                q7s.A00 = true;
            }
            this.A08 = null;
            this.A06.quit();
            this.A06 = null;
            this.A07 = null;
            this.A09 = null;
            this.A01 = null;
            this.A02 = null;
            byte[] bArr = this.A04;
            if (bArr != null) {
                this.A0C.AI9(bArr);
                this.A04 = null;
            }
        }
        if (r10 != null) {
            C19878Wh7 wh7 = this.A0F;
            synchronized (wh7.A02) {
                Map map = wh7.A03;
                Integer num = (Integer) map.get(r10);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(wh7.A00);
                    arrayList.remove(r10);
                    wh7.A00 = Collections.unmodifiableList(arrayList);
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        map.remove(r10);
                        HashSet hashSet = new HashSet(wh7.A01);
                        hashSet.remove(r10);
                        wh7.A01 = Collections.unmodifiableSet(hashSet);
                    } else {
                        C66580MXl.A1T(r10, map, intValue - 1);
                    }
                }
            }
            if (wh7.A00(r10) == 0) {
                r10.A02();
            }
        }
        X13 x13 = this.A0K;
        int i3 = this.A05;
        WM7 wm7 = (WM7) x13;
        if (i3 == 1) {
            WMB wmb = wm7.A00;
            if (wmb.A00 > 0) {
                long j = wmb.A06;
                if (j != -9223372036854775807L) {
                    wmb.A09.add(this);
                    Handler handler = wmb.A01;
                    handler.getClass();
                    handler.postAtTime(new C19967Wie(this), this, SystemClock.uptimeMillis() + j);
                }
            }
        } else if (i3 == 0) {
            WMB wmb2 = wm7.A00;
            wmb2.A08.remove(this);
            if (wmb2.A03 == this) {
                wmb2.A03 = null;
            }
            WM6 wm6 = wmb2.A07;
            Set set = wm6.A01;
            set.remove(this);
            if (wm6.A00 == this) {
                wm6.A00 = null;
                if (!set.isEmpty()) {
                    WM9 wm9 = (WM9) set.iterator().next();
                    wm6.A00 = wm9;
                    wm9.A06();
                }
            }
            if (wmb2.A06 != -9223372036854775807L) {
                Handler handler2 = wmb2.A01;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                wmb2.A09.remove(this);
            }
        }
        WMB.A03(wm7.A00);
    }

    public final boolean EHk(String str) {
        A00(this);
        C21005X9c x9c = this.A0C;
        byte[] bArr = this.A04;
        C256703wD.A01(bArr);
        return x9c.EHl(bArr, str);
    }
}
