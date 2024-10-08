package X;

/* renamed from: X.Ar5  reason: case insensitive filesystem */
public final class C41269Ar5 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ C368618t1 A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ int[] A0D;
    public final /* synthetic */ int[] A0E;
    public final /* synthetic */ int[] A0F;

    public C41269Ar5(C368618t1 r3, int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2) {
        this.A0A = r3;
        this.A0E = iArr;
        this.A0D = iArr2;
        this.A0F = iArr3;
        this.A05 = i;
        this.A09 = j;
        this.A0C = z;
        this.A06 = i2;
        this.A04 = i3;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A08 = j2;
        this.A07 = j3;
        this.A03 = i4;
        this.A0B = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.7sh[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.7sh} */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.ADH, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r17 = 32
            java.lang.String r3 = "AREngineService.updateFrame"
            r2 = 242343366(0xe71ddc6, float:2.9812323E-30)
            r0 = r17
            X.0fc.A01(r0, r3, r2)
            r9 = r22
            X.8t1 r8 = r9.A0A
            java.lang.Integer r1 = r8.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00ad
            java.nio.ByteBuffer r0 = r8.A0L
            if (r0 == 0) goto L_0x00ad
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r8.A0a
            if (r0 == 0) goto L_0x00ad
            X.ADH r7 = new X.ADH
            r7.<init>()
            r0 = -1
            r7.A01 = r0
            r6 = 0
            r7.A0A = r6
            r7.A0C = r6
            int[] r15 = r9.A0E
            int r14 = r15.length
            boolean r0 = X.AnonymousClass7TF.A1Q(r14)
            r11 = 0
            if (r0 == 0) goto L_0x00b0
            java.nio.ByteBuffer r10 = r8.A0L
            if (r10 == 0) goto L_0x0090
            int r0 = r9.A05
            r21 = r0
            long r4 = r9.A09
            boolean r0 = r9.A0C
            r20 = r0
            int r0 = r9.A06
            r19 = r0
            int r13 = r9.A04
            float r14 = r9.A02
            float r11 = r9.A01
            float r12 = r9.A00
            long r2 = r9.A08
            long r0 = r9.A07
            boolean r15 = r10.hasArray()
            if (r15 == 0) goto L_0x0090
            byte[] r15 = r10.array()
            r16 = 0
            int r10 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ae
            int r10 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ae
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Float r10 = java.lang.Float.valueOf(r11)
            android.util.Pair r11 = new android.util.Pair
            r11.<init>(r14, r10)
        L_0x0074:
            r7.A0A = r15
            r10 = r21
            r7.A03 = r10
            r7.A07 = r4
            r4 = r20
            r7.A09 = r4
            r4 = r19
            r7.A04 = r4
            r7.A02 = r13
            r7.A0B = r6
            r7.A08 = r11
            r7.A00 = r12
        L_0x008c:
            r7.A06 = r2
            r7.A05 = r0
        L_0x0090:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r3 = r8.A0a
            if (r3 == 0) goto L_0x00a5
            X.ASL r0 = new X.ASL
            r0.<init>()
            X.ASJ r2 = new X.ASJ
            r2.<init>(r0, r7)
            int r1 = r9.A03
            boolean r0 = r9.A0B
            r3.updateFrame(r2, r1, r0)
        L_0x00a5:
            r2 = -167741247(0xfffffffff60078c1, float:-6.514289E32)
            r0 = r17
            X.0fc.A00(r0, r2)
        L_0x00ad:
            return
        L_0x00ae:
            r11 = r6
            goto L_0x0074
        L_0x00b0:
            int[] r13 = r9.A0D
            int r0 = r13.length
            if (r14 != r0) goto L_0x0090
            int[] r12 = r9.A0F
            int r0 = r12.length
            if (r14 != r0) goto L_0x0090
            X.7sh[] r10 = new X.C344957sh[r14]
            r1 = 0
        L_0x00bd:
            if (r1 >= r14) goto L_0x00c9
            X.7sh r0 = new X.7sh
            r0.<init>()
            r10[r1] = r0
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x00c9:
            r5 = 0
            r4 = 0
        L_0x00cb:
            if (r5 >= r14) goto L_0x0129
            java.nio.ByteBuffer r0 = r8.A0L
            if (r0 == 0) goto L_0x0127
            java.nio.ByteBuffer r3 = r0.slice()
            if (r3 == 0) goto L_0x00da
            r3.position(r4)
        L_0x00da:
            r0 = r15[r5]
            int r4 = r4 + r0
            java.nio.ByteBuffer r0 = r8.A0L
            if (r0 == 0) goto L_0x0125
            int r0 = r0.capacity()
        L_0x00e5:
            if (r4 <= r0) goto L_0x0111
            java.lang.Class<X.8t1> r2 = X.C368618t1.class
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Frame data limit exceeded: Expected: "
            r1.append(r0)
            java.nio.ByteBuffer r0 = r8.A0L
            if (r0 == 0) goto L_0x00fe
            int r0 = r0.capacity()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x00fe:
            r1.append(r11)
            java.lang.String r0 = " Actual: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            X.0KC.A02(r2, r0)
            return
        L_0x0111:
            if (r3 == 0) goto L_0x0116
            r3.limit(r4)
        L_0x0116:
            r2 = r10[r5]
            r1 = r13[r5]
            r0 = r12[r5]
            r2.A02 = r3
            r2.A00 = r1
            r2.A01 = r0
            int r5 = r5 + 1
            goto L_0x00cb
        L_0x0125:
            r0 = 0
            goto L_0x00e5
        L_0x0127:
            r3 = r6
            goto L_0x00da
        L_0x0129:
            int r0 = r9.A05
            r16 = r0
            long r4 = r9.A09
            boolean r15 = r9.A0C
            int r14 = r9.A06
            int r13 = r9.A04
            float r3 = r9.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            float r2 = r9.A01
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x016e
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r1, r0)
        L_0x014f:
            float r11 = r9.A00
            long r2 = r9.A08
            long r0 = r9.A07
            X.ADH.A00(r7)
            r7.A0C = r10
            r10 = r16
            r7.A03 = r10
            r7.A07 = r4
            r7.A09 = r15
            r7.A04 = r14
            r7.A02 = r13
            r7.A0B = r6
            r7.A08 = r12
            r7.A00 = r11
            goto L_0x008c
        L_0x016e:
            r12 = r6
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41269Ar5.run():void");
    }
}
