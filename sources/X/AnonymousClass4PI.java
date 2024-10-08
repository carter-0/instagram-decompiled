package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.DummySurface;
import java.util.List;

/* renamed from: X.4PI  reason: invalid class name */
public class AnonymousClass4PI extends AnonymousClass4PJ {
    public static boolean A0m;
    public static boolean A0n;
    public static final int[] A0o = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public MediaFormat A0M;
    public Surface A0N;
    public Surface A0O;
    public AnonymousClass4YT A0P;
    public C296385py A0Q;
    public AnonymousClass4SC A0R;
    public Object A0S;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = true;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int A0b;
    public long A0c;
    public final long A0d;
    public final Context A0e;
    public final C264334Pm A0f;
    public final C264264Pf A0g;
    public final AnonymousClass4PZ A0h;
    public final C264324Pl A0i;
    public final boolean A0j;
    public final long[] A0k;
    public final long[] A0l;

    public AnonymousClass4PI(Context context, Handler handler, AnonymousClass4PH r16, AnonymousClass2SB r17, C265114Sp r18, C256823wP r19, AnonymousClass4PC r20, long j) {
        super(r16, r17, r18, r19, 2, true);
        boolean z = false;
        this.A0Y = false;
        this.A0W = false;
        this.A0j = 2BY.A02(2BQ.A1K);
        this.A0d = j;
        Context applicationContext = context.getApplicationContext();
        this.A0e = applicationContext;
        this.A0h = new AnonymousClass4PZ(context);
        C264264Pf r3 = new C264264Pf(applicationContext);
        this.A0g = r3;
        this.A0i = new C264324Pl(handler, r20);
        this.A0f = new C264334Pm(this, r3);
        if (Util.A00 == 29 && Util.A04.startsWith("Pixel ")) {
            z = true;
        }
        this.A0U = z;
        this.A0k = new long[10];
        this.A0l = new long[10];
        this.A0L = -9223372036854775807L;
        this.A0c = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A06 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0E = 1;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = X.AnonymousClass000.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r4.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        return (r5 * 3) / (r2 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(java.lang.String r4, int r5, int r6) {
        /*
            r3 = -1
            if (r5 == r3) goto L_0x000d
            if (r6 == r3) goto L_0x000d
            int r0 = r4.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L_0x0049;
                case -1662541442: goto L_0x003f;
                case 1187890754: goto L_0x0038;
                case 1331836730: goto L_0x0014;
                case 1599127256: goto L_0x0011;
                case 1599127257: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x0041
        L_0x0011:
            r0 = 1922(0x782, float:2.693E-42)
            goto L_0x003a
        L_0x0014:
            java.lang.String r0 = "video/avc"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x000d
            r2 = 16
            int r0 = r5 + 16
            int r1 = r0 + -1
            int r1 = r1 / r2
            int r0 = r6 + 16
            int r0 = r0 + -1
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r5 = r0 * 16
            goto L_0x0052
        L_0x0038:
            r0 = 1921(0x781, float:2.692E-42)
        L_0x003a:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x004b
        L_0x003f:
            java.lang.String r0 = "video/hevc"
        L_0x0041:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
            goto L_0x0053
        L_0x0049:
            java.lang.String r0 = "video/3gpp"
        L_0x004b:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000d
            int r5 = r5 * r6
        L_0x0052:
            r2 = 2
        L_0x0053:
            int r1 = r5 * 3
            int r0 = r2 * 2
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PI.A02(java.lang.String, int, int):int");
    }

    private void A03() {
        C251403n3 r1;
        this.A0Z = false;
        if (this.A0a && (r1 = this.A0B) != null) {
            this.A0Q = new C296385py(r1, this);
        }
    }

    public final void A0K() {
        this.A06 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0L = -9223372036854775807L;
        this.A0c = -9223372036854775807L;
        this.A0b = 0;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
        A03();
        AnonymousClass4PZ r2 = this.A0h;
        if (r2.A09 != null) {
            C264214Pa r1 = r2.A0A;
            if (r1 != null) {
                r1.A00.unregisterDisplayListener(r1);
            }
            r2.A0B.A02.sendEmptyMessage(2);
        }
        this.A0Q = null;
        this.A0a = false;
        this.A08 = 0;
        this.A09 = 0;
        try {
            super.A0K();
            synchronized (this.A09) {
            }
            C264324Pl r3 = this.A0i;
            C266094Xn r22 = this.A09;
            synchronized (r22) {
            }
            r3.A00.post(new C292295ii(r22, r3));
        } catch (Throwable th) {
            synchronized (this.A09) {
                C264324Pl r32 = this.A0i;
                C266094Xn r23 = this.A09;
                synchronized (r23) {
                    r32.A00.post(new C292295ii(r23, r32));
                    throw th;
                }
            }
        }
    }

    public final void A0R() {
        try {
            super.A0R();
        } finally {
            this.A03 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                if (this.A0O == surface) {
                    this.A0O = null;
                }
                surface.release();
                this.A0N = null;
            }
        }
    }

    public final void A0X() {
        if (!this.A0Z) {
            this.A0Z = true;
            this.A0i.A01(this.A0O);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (CaO() == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r9 != null) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CIs(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            r6 = 1
            if (r8 != r6) goto L_0x007d
            android.view.Surface r9 = (android.view.Surface) r9
            if (r9 != 0) goto L_0x000c
            android.view.Surface r0 = r7.A0N
            if (r0 == 0) goto L_0x003e
            r9 = r0
        L_0x000c:
            X.2BQ r0 = X.2BQ.A0R
            boolean r5 = X.2BY.A02(r0)
            android.view.Surface r0 = r7.A0O
            if (r0 == r9) goto L_0x0068
            r7.A0O = r9
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A0K = r0
            int r4 = r7.A01
            boolean r0 = r7.A0Y
            if (r0 == 0) goto L_0x002b
            boolean r0 = r7.CaO()
            r3 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            r2 = 2
            if (r4 == r6) goto L_0x0031
            if (r4 != r2) goto L_0x0064
        L_0x0031:
            X.3n3 r1 = r7.A0B
            if (r1 == 0) goto L_0x005e
            if (r9 == 0) goto L_0x005e
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x005e
            if (r5 == 0) goto L_0x00ff
            goto L_0x0051
        L_0x003e:
            X.2Km r1 = r7.A0C
            if (r1 == 0) goto L_0x000c
            boolean r0 = A07(r1, r7)
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.A06
            com.google.android.exoplayer2.video.DummySurface r9 = com.google.android.exoplayer2.video.DummySurface.A00(r0)
            r7.A0N = r9
            goto L_0x000c
        L_0x0051:
            r1.setOutputSurface(r9)     // Catch:{ IllegalStateException -> 0x0056 }
            goto L_0x0102
        L_0x0056:
            r7.A0R()
            r7.A0S()
            goto L_0x0102
        L_0x005e:
            r7.A0R()
            r7.A0S()
        L_0x0064:
            if (r9 == 0) goto L_0x0126
            goto L_0x0102
        L_0x0068:
            if (r9 == 0) goto L_0x011f
            android.view.Surface r0 = r7.A0N
            if (r9 == r0) goto L_0x011f
            r7.A04()
            boolean r0 = r7.A0Z
            if (r0 == 0) goto L_0x011f
            X.4Pl r1 = r7.A0i
            android.view.Surface r0 = r7.A0O
            r1.A01(r0)
            return
        L_0x007d:
            r0 = 4
            if (r8 != r0) goto L_0x0090
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r9.intValue()
            r7.A0E = r1
            X.3n3 r0 = r7.A0B
            if (r0 == 0) goto L_0x011f
            r0.setVideoScalingMode(r1)
            return
        L_0x0090:
            r0 = 7
            if (r8 != r0) goto L_0x0098
            X.4SC r9 = (X.AnonymousClass4SC) r9
            r7.A0R = r9
            return
        L_0x0098:
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r8 != r0) goto L_0x00aa
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r1 = r9.booleanValue()
            X.3n3 r0 = r7.A0B
            if (r0 == 0) goto L_0x011f
            r0.enableSR(r1)
            return
        L_0x00aa:
            r0 = 13
            if (r8 != r0) goto L_0x00ca
            r9.getClass()
            java.util.Collection r9 = (java.util.Collection) r9
            X.4Pm r1 = r7.A0f
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A01
            if (r0 != 0) goto L_0x00c1
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r9)
            r1.A01 = r0
            return
        L_0x00c1:
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A01
            r0.addAll(r9)
            return
        L_0x00ca:
            r0 = 14
            if (r8 != r0) goto L_0x011f
            r9.getClass()
            X.4S7 r9 = (X.AnonymousClass4S7) r9
            int r0 = r9.A01
            if (r0 == 0) goto L_0x011f
            int r0 = r9.A00
            if (r0 == 0) goto L_0x011f
            android.view.Surface r2 = r7.A0O
            if (r2 == 0) goto L_0x011f
            X.4Pm r1 = r7.A0f
            android.util.Pair r0 = r1.A00
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r0.first
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f8
            android.util.Pair r0 = r1.A00
            java.lang.Object r0 = r0.second
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00f8
            return
        L_0x00f8:
            android.util.Pair r0 = android.util.Pair.create(r2, r9)
            r1.A00 = r0
            return
        L_0x00ff:
            r1.setOutputSurface(r9)
        L_0x0102:
            android.view.Surface r0 = r7.A0N
            if (r9 == r0) goto L_0x0126
            r7.A04()
            r7.A03()
            if (r4 == r2) goto L_0x0110
            if (r3 == 0) goto L_0x011f
        L_0x0110:
            long r3 = r7.A0d
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r3
        L_0x011d:
            r7.A0H = r0
        L_0x011f:
            return
        L_0x0120:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x011d
        L_0x0126:
            r1 = -1
            r7.A0D = r1
            r7.A0B = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.A02 = r0
            r7.A0C = r1
            r7.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PI.CIs(int, java.lang.Object):void");
    }

    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    public static int A00(C256683wB r6) {
        int i = r6.A0B;
        if (i != -1) {
            List list = r6.A0X;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return i + i2;
        }
        return A02(r6.A0W, r6.A0L, r6.A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r0 != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C256683wB r7, X.C256823wP r8, boolean r9) {
        /*
            java.lang.String r5 = r7.A0W
            boolean r0 = X.2Kn.A06(r5)
            r3 = 0
            if (r0 != 0) goto L_0x000a
            return r3
        L_0x000a:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r7.A0O
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0011
            r4 = 1
        L_0x0011:
            java.util.List r2 = r8.Ave(r5, r4, r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x003b
            if (r9 == 0) goto L_0x003b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = X.2BR.A03(r7)
            if (r0 == 0) goto L_0x003b
            java.util.List r1 = r8.Ave(r0, r3, r3)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x003b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003b
            r2 = r1
        L_0x003b:
            if (r4 == 0) goto L_0x004f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x004f
            java.util.List r0 = r8.Ave(r5, r3, r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004e
            r6 = 2
        L_0x004e:
            return r6
        L_0x004f:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0058
            r1 = 129(0x81, float:1.81E-43)
            return r1
        L_0x0058:
            int r1 = r7.A07
            if (r1 == 0) goto L_0x0062
            r0 = 2
            if (r1 == r0) goto L_0x0062
            r1 = 130(0x82, float:1.82E-43)
            return r1
        L_0x0062:
            java.lang.Object r5 = r2.get(r3)
            X.2Km r5 = (X.2Km) r5
            java.lang.String r4 = r7.A0R
            if (r4 == 0) goto L_0x00b3
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x00b3
            java.lang.String r2 = X.2Kn.A02(r4)
            if (r2 == 0) goto L_0x00b3
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = "codec.mime "
            java.lang.String r0 = ", "
            java.lang.String r0 = X.002.A0u(r1, r4, r0, r2)
            X.2Km.A01(r5, r0)
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x0099
        L_0x008a:
            int r4 = r7.A0L
            if (r4 <= 0) goto L_0x0099
            int r2 = r7.A0A
            if (r2 <= 0) goto L_0x0099
            float r0 = r7.A01
            double r0 = (double) r0
            boolean r0 = r5.A08(r4, r2, r0)
        L_0x0099:
            boolean r1 = r5.A04
            r2 = 8
            if (r1 == 0) goto L_0x00a1
            r2 = 16
        L_0x00a1:
            boolean r1 = r5.A08
            if (r1 == 0) goto L_0x00a7
            r3 = 32
        L_0x00a7:
            r1 = 3
            if (r0 == 0) goto L_0x00ab
            r1 = 4
        L_0x00ab:
            r2 = r2 | r3
            r1 = r1 | r2
            return r1
        L_0x00ae:
            boolean r0 = X.2Km.A03(r7, r5, r6)
            goto L_0x0088
        L_0x00b3:
            r0 = 1
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PI.A01(X.3wB, X.3wP, boolean):int");
    }

    private void A04() {
        int i = this.A0D;
        if (i != -1 || this.A0B != -1) {
            this.A0i.A00(new C264344Pn(this.A02, i, this.A0B, this.A0C));
        }
    }

    public static void A05(AnonymousClass4PI r6) {
        int i = r6.A06;
        if (i != -1 || r6.A05 != -1) {
            if (r6.A0D != i || r6.A0B != r6.A05 || r6.A0C != 0 || r6.A02 != r6.A00) {
                r6.A0i.A00(new C264344Pn(r6.A00, i, r6.A05, 0));
                r6.A0D = r6.A06;
                r6.A0B = r6.A05;
                r6.A0C = 0;
                r6.A02 = r6.A00;
            }
        }
    }

    public static boolean A06(C256683wB r2, C256683wB r3, boolean z) {
        if (!r2.A0W.equals(r3.A0W) || r2.A0F != r3.A0F || ((!z && (r2.A0L != r3.A0L || r2.A0A != r3.A0A)) || !Util.A0I(r2.A0Q, r3.A0Q))) {
            return false;
        }
        return true;
    }

    public static boolean A07(2Km r1, AnonymousClass4PI r2) {
        if (!r2.A0X || r2.A0a || A08(r1.A03)) {
            return false;
        }
        if (!r1.A06 || DummySurface.A01()) {
            return true;
        }
        return false;
    }

    public static final boolean A08(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (AnonymousClass4PI.class) {
            if (!A0n) {
                if ("dangal".equals(Util.A01)) {
                    A0m = true;
                }
                A0n = true;
            }
        }
        return A0m;
    }

    public final void A0J() {
        if (this.A0j) {
            try {
                super.A0J();
            } finally {
                Surface surface = this.A0N;
                if (surface != null) {
                    Surface surface2 = null;
                    if (this.A0O == surface) {
                        this.A0O = surface2;
                    }
                    surface.release();
                    this.A0N = surface2;
                }
            }
        }
    }

    public void A0N(C256683wB[] r6, long j, long j2) {
        if (this.A0L == -9223372036854775807L) {
            this.A0L = j2;
            return;
        }
        int i = this.A0b;
        long[] jArr = this.A0k;
        if (i == jArr.length) {
            2AG.A04("MediaCodecVideoRenderer", 002.A0Q("Too many stream changes, so dropping offset: ", jArr[i - 1]));
        } else {
            this.A0b = i + 1;
        }
        int i2 = this.A0b - 1;
        jArr[i2] = j2;
        this.A0l[i2] = this.A0c;
    }

    public void A0T(long j) {
        this.A03--;
        while (true) {
            int i = this.A0b;
            if (i != 0) {
                long[] jArr = this.A0l;
                if (j >= jArr[0]) {
                    long[] jArr2 = this.A0k;
                    this.A0L = jArr2[0];
                    int i2 = i - 1;
                    this.A0b = i2;
                    System.arraycopy(jArr2, 1, jArr2, 0, i2);
                    System.arraycopy(jArr, 1, jArr, 0, this.A0b);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void A0V(AnonymousClass4PQ r5) {
        this.A03++;
        this.A0c = Math.max(r5.A01, this.A0c);
    }

    public final void A0Y(int i) {
        C266094Xn r3 = this.A09;
        r3.A04 += i;
        int i2 = this.A07 + i;
        this.A07 = i2;
        int i3 = this.A04 + i;
        this.A04 = i3;
        r3.A07 = Math.max(i3, r3.A07);
        if (i2 >= 0 && i2 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C264324Pl r2 = this.A0i;
            r2.A00.post(new C290235ez(r2));
            this.A07 = 0;
            this.A0F = elapsedRealtime;
        }
    }

    public final void A0Z(C251403n3 r9, int i, long j, long j2) {
        int i2;
        C256683wB r3 = this.A08;
        MediaFormat mediaFormat = this.A0M;
        AnonymousClass4SC r1 = this.A0R;
        long j3 = j2;
        if (r1 != null) {
            r1.DxT(mediaFormat, r3, j, j3);
        }
        27d.A01("releaseOutputBuffer");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r9.releaseOutputBuffer(i, j2);
        this.A06 += SystemClock.elapsedRealtime() - elapsedRealtime;
        27d.A00();
        this.A09.A09++;
        this.A04 = 0;
        this.A0J = SystemClock.elapsedRealtime() * 1000;
        A05(this);
        A0X();
        C266094Xn r4 = this.A09;
        long j4 = this.A06;
        int i3 = r4.A09;
        if (i3 == 0) {
            i2 = -1;
        } else {
            i2 = (int) (j4 / ((long) i3));
        }
        r4.A01 = i2;
    }

    public final boolean CSi() {
        return this.A0L;
    }

    public final void A0L(long j, boolean z) {
        long j2;
        super.A0L(j, z);
        A03();
        if (this.A0j) {
            C264264Pf r2 = this.A0g;
            r2.A02 = 0;
            r2.A03 = -1;
            r2.A05 = -1;
        }
        this.A0I = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A04 = 0;
        this.A0c = -9223372036854775807L;
        this.A08 = 0;
        this.A09 = 0;
        int i = this.A0b;
        if (i != 0) {
            this.A0L = this.A0k[i - 1];
            this.A0b = 0;
        }
        if (z) {
            long j3 = this.A0d;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0H = j2;
            return;
        }
        this.A0H = -9223372036854775807L;
    }

    public final void A0M(boolean z, boolean z2) {
        super.A0M(z, z2);
        AnonymousClass4RW r0 = this.A03;
        r0.getClass();
        this.A0a = r0.A00;
        C264324Pl r3 = this.A0i;
        r3.A00.post(new C266104Xo(this.A09, r3));
        this.A0h.A02();
    }

    public final void A0Q() {
        super.A0Q();
        this.A03 = 0;
    }

    public final void A0U(C256683wB r5) {
        super.A0U(r5);
        C264324Pl r3 = this.A0i;
        r3.A00.post(new C266234Yb(r5, (C290365fC) null, r3));
        this.A01 = r5.A02;
        this.A0A = r5.A0F;
    }

    public final boolean CaO() {
        Surface surface;
        Surface surface2;
        if (super.CaO() && !this.A0Z && (((surface2 = this.A0N) == null || this.A0O != surface2) && this.A0B != null && !this.A0a)) {
            this.A06 = AnonymousClass05K.A0Y;
        }
        if (!super.CaO() || (!this.A0Z && (((surface = this.A0N) == null || this.A0O != surface) && this.A0B != null && !this.A0a))) {
            long j = this.A0H;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A0H = -9223372036854775807L;
                }
            }
            return false;
        }
        this.A0H = -9223372036854775807L;
        return true;
    }

    public final void A0I() {
        this.A0H = -9223372036854775807L;
        if (this.A07 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C264324Pl r2 = this.A0i;
            r2.A00.post(new C290235ez(r2));
            this.A07 = 0;
            this.A0F = elapsedRealtime;
        }
        if (this.A0j) {
            this.A0g.A04();
        }
    }

    public final void EEq(long j, long j2) {
        super.EEq(j, j2);
    }
}
