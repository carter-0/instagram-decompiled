package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: X.SHy  reason: case insensitive filesystem */
public final class C11264SHy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap.Config A05 = Bitmap.Config.ARGB_8888;
    public Bitmap A06;
    public C10829Ryp A07;
    public Boolean A08;
    public ByteBuffer A09;
    public boolean A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public int[] A0F;
    public int[] A0G;
    public short[] A0H;
    public final C10367Rr4 A0I;
    public final int[] A0J = new int[256];

    public C11264SHy(C10829Ryp ryp, C10367Rr4 rr4, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.A0I = rr4;
        this.A07 = new C10829Ryp();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.A04 = 0;
                this.A07 = ryp;
                this.A02 = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.A09 = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.A09.order(ByteOrder.LITTLE_ENDIAN);
                this.A0A = false;
                Iterator it = ryp.A0A.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C10828Ryo) it.next()).A02 == 3) {
                            this.A0A = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.A03 = highestOneBit;
                int i2 = ryp.A06;
                this.A01 = i2 / highestOneBit;
                int i3 = ryp.A04;
                this.A00 = i3 / highestOneBit;
                int i4 = i2 * i3;
                ST0 st0 = this.A0I.A01;
                if (st0 == null) {
                    bArr = new byte[i4];
                } else {
                    bArr = (byte[]) st0.A04(i4, byte[].class);
                }
                this.A0C = bArr;
                int i5 = this.A01 * this.A00;
                if (st0 == null) {
                    iArr = new int[i5];
                } else {
                    iArr = (int[]) st0.A04(i5, int[].class);
                }
                this.A0G = iArr;
            } else {
                throw DbW.A0a("Sample size must be >=0, not: ", i);
            }
        }
    }

    private Bitmap A00() {
        Bitmap.Config config;
        Boolean bool = this.A08;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.A05;
        }
        C10367Rr4 rr4 = this.A0I;
        Bitmap AxL = rr4.A00.AxL(this.A01, this.A00, config);
        AxL.setHasAlpha(true);
        return AxL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r14v15, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap A01() {
        /*
            r39 = this;
            r8 = r39
            monitor-enter(r8)
            X.Ryp r0 = r8.A07     // Catch:{ all -> 0x0426 }
            int r0 = r0.A02     // Catch:{ all -> 0x0426 }
            r11 = 3
            r9 = 1
            if (r0 <= 0) goto L_0x000f
            int r0 = r8.A02     // Catch:{ all -> 0x0426 }
            if (r0 >= 0) goto L_0x0016
        L_0x000f:
            java.lang.String r0 = "StandardGifDecoder"
            android.util.Log.isLoggable(r0, r11)     // Catch:{ all -> 0x0426 }
            r8.A04 = r9     // Catch:{ all -> 0x0426 }
        L_0x0016:
            int r1 = r8.A04     // Catch:{ all -> 0x0426 }
            r3 = 0
            if (r1 == r9) goto L_0x041f
            r37 = 2
            r0 = r37
            if (r1 == r0) goto L_0x041f
            r7 = 0
            r8.A04 = r7     // Catch:{ all -> 0x0426 }
            byte[] r0 = r8.A0B     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x0034
            X.Rr4 r0 = r8.A0I     // Catch:{ all -> 0x0426 }
            r2 = 255(0xff, float:3.57E-43)
            X.ST0 r1 = r0.A01     // Catch:{ all -> 0x0426 }
            if (r1 != 0) goto L_0x005c
            byte[] r0 = new byte[r2]     // Catch:{ all -> 0x0426 }
        L_0x0032:
            r8.A0B = r0     // Catch:{ all -> 0x0426 }
        L_0x0034:
            X.Ryp r0 = r8.A07     // Catch:{ all -> 0x0426 }
            java.util.List r1 = r0.A0A     // Catch:{ all -> 0x0426 }
            int r0 = r8.A02     // Catch:{ all -> 0x0426 }
            java.lang.Object r6 = r1.get(r0)     // Catch:{ all -> 0x0426 }
            X.Ryo r6 = (X.C10828Ryo) r6     // Catch:{ all -> 0x0426 }
            int r1 = r8.A02     // Catch:{ all -> 0x0426 }
            int r1 = r1 - r9
            if (r1 < 0) goto L_0x005a
            X.Ryp r0 = r8.A07     // Catch:{ all -> 0x0426 }
            java.util.List r0 = r0.A0A     // Catch:{ all -> 0x0426 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x0426 }
            X.Ryo r2 = (X.C10828Ryo) r2     // Catch:{ all -> 0x0426 }
        L_0x004f:
            int[] r4 = r6.A0A     // Catch:{ all -> 0x0426 }
            if (r4 != 0) goto L_0x0057
            X.Ryp r0 = r8.A07     // Catch:{ all -> 0x0426 }
            int[] r4 = r0.A09     // Catch:{ all -> 0x0426 }
        L_0x0057:
            r8.A0F = r4     // Catch:{ all -> 0x0426 }
            goto L_0x0065
        L_0x005a:
            r2 = r3
            goto L_0x004f
        L_0x005c:
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Object r0 = r1.A04(r2, r0)     // Catch:{ all -> 0x0426 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0426 }
            goto L_0x0032
        L_0x0065:
            if (r4 != 0) goto L_0x0070
            java.lang.String r0 = "StandardGifDecoder"
            android.util.Log.isLoggable(r0, r11)     // Catch:{ all -> 0x0426 }
            r8.A04 = r9     // Catch:{ all -> 0x0426 }
            monitor-exit(r8)
            return r3
        L_0x0070:
            boolean r0 = r6.A09     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x0090
            int[] r1 = r8.A0J     // Catch:{ all -> 0x0426 }
            int r0 = r4.length     // Catch:{ all -> 0x0426 }
            java.lang.System.arraycopy(r4, r7, r1, r7, r0)     // Catch:{ all -> 0x0426 }
            r8.A0F = r1     // Catch:{ all -> 0x0426 }
            int r0 = r6.A07     // Catch:{ all -> 0x0426 }
            r1[r0] = r7     // Catch:{ all -> 0x0426 }
            int r1 = r6.A02     // Catch:{ all -> 0x0426 }
            r0 = r37
            if (r1 != r0) goto L_0x0090
            int r0 = r8.A02     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x0090
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0426 }
            r8.A08 = r0     // Catch:{ all -> 0x0426 }
        L_0x0090:
            int[] r0 = r8.A0G     // Catch:{ all -> 0x0426 }
            r36 = r0
            r10 = 0
            if (r2 != 0) goto L_0x0105
            android.graphics.Bitmap r1 = r8.A06     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x00a2
            X.Rr4 r0 = r8.A0I     // Catch:{ all -> 0x0426 }
            X.Thg r0 = r0.A00     // Catch:{ all -> 0x0426 }
            r0.E5H(r1)     // Catch:{ all -> 0x0426 }
        L_0x00a2:
            r8.A06 = r3     // Catch:{ all -> 0x0426 }
            r0 = r36
            java.util.Arrays.fill(r0, r7)     // Catch:{ all -> 0x0426 }
        L_0x00a9:
            java.nio.ByteBuffer r1 = r8.A09     // Catch:{ all -> 0x0426 }
            int r0 = r6.A00     // Catch:{ all -> 0x0426 }
            r1.position(r0)     // Catch:{ all -> 0x0426 }
            int r0 = r6.A04     // Catch:{ all -> 0x0426 }
            int r13 = r6.A03     // Catch:{ all -> 0x0426 }
            int r13 = r13 * r0
            byte[] r12 = r8.A0C     // Catch:{ all -> 0x0426 }
            if (r12 == 0) goto L_0x00bc
            int r0 = r12.length     // Catch:{ all -> 0x0426 }
            if (r0 >= r13) goto L_0x00c6
        L_0x00bc:
            X.Rr4 r0 = r8.A0I     // Catch:{ all -> 0x0426 }
            X.ST0 r1 = r0.A01     // Catch:{ all -> 0x0426 }
            if (r1 != 0) goto L_0x00fc
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x0426 }
        L_0x00c4:
            r8.A0C = r12     // Catch:{ all -> 0x0426 }
        L_0x00c6:
            short[] r10 = r8.A0H     // Catch:{ all -> 0x0426 }
            r0 = 4096(0x1000, float:5.74E-42)
            if (r10 != 0) goto L_0x00d0
            short[] r10 = new short[r0]     // Catch:{ all -> 0x0426 }
            r8.A0H = r10     // Catch:{ all -> 0x0426 }
        L_0x00d0:
            byte[] r5 = r8.A0E     // Catch:{ all -> 0x0426 }
            if (r5 != 0) goto L_0x00d8
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x0426 }
            r8.A0E = r5     // Catch:{ all -> 0x0426 }
        L_0x00d8:
            byte[] r4 = r8.A0D     // Catch:{ all -> 0x0426 }
            if (r4 != 0) goto L_0x00e2
            r0 = 4097(0x1001, float:5.741E-42)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0426 }
            r8.A0D = r4     // Catch:{ all -> 0x0426 }
        L_0x00e2:
            java.nio.ByteBuffer r0 = r8.A09     // Catch:{ all -> 0x0426 }
            byte r0 = r0.get()     // Catch:{ all -> 0x0426 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r33 = 1
            int r32 = r9 << r0
            int r31 = r32 + 1
            int r30 = r32 + 2
            int r29 = r0 + 1
            int r28 = r9 << r29
            int r28 = r28 - r9
            r27 = 0
            r1 = 0
            goto L_0x016d
        L_0x00fc:
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Object r12 = r1.A04(r13, r0)     // Catch:{ all -> 0x0426 }
            byte[] r12 = (byte[]) r12     // Catch:{ all -> 0x0426 }
            goto L_0x00c4
        L_0x0105:
            int r0 = r2.A02     // Catch:{ all -> 0x0426 }
            if (r0 != r11) goto L_0x0112
            android.graphics.Bitmap r0 = r8.A06     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x0112
            r0 = r36
            java.util.Arrays.fill(r0, r7)     // Catch:{ all -> 0x0426 }
        L_0x0112:
            int r1 = r2.A02     // Catch:{ all -> 0x0426 }
            if (r1 <= 0) goto L_0x00a9
            r0 = r37
            if (r1 != r0) goto L_0x0151
            boolean r0 = r6.A09     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x012c
            X.Ryp r1 = r8.A07     // Catch:{ all -> 0x0426 }
            int r3 = r1.A00     // Catch:{ all -> 0x0426 }
            int[] r0 = r6.A0A     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x0141
            int r1 = r1.A01     // Catch:{ all -> 0x0426 }
            int r0 = r6.A07     // Catch:{ all -> 0x0426 }
            if (r1 != r0) goto L_0x0141
        L_0x012c:
            int r5 = r2.A03     // Catch:{ all -> 0x0426 }
            int r1 = r8.A03     // Catch:{ all -> 0x0426 }
            int r5 = r5 / r1
            int r4 = r2.A06     // Catch:{ all -> 0x0426 }
            int r4 = r4 / r1
            int r3 = r2.A04     // Catch:{ all -> 0x0426 }
            int r3 = r3 / r1
            int r0 = r2.A05     // Catch:{ all -> 0x0426 }
            int r0 = r0 / r1
            int r2 = r8.A01     // Catch:{ all -> 0x0426 }
            int r4 = r4 * r2
            int r4 = r4 + r0
            int r5 = r5 * r2
            int r5 = r5 + r4
            goto L_0x0143
        L_0x0141:
            r10 = r3
            goto L_0x012c
        L_0x0143:
            if (r4 >= r5) goto L_0x00a9
            int r1 = r4 + r3
            r0 = r4
        L_0x0148:
            if (r0 >= r1) goto L_0x014f
            r36[r0] = r10     // Catch:{ all -> 0x0426 }
            int r0 = r0 + 1
            goto L_0x0148
        L_0x014f:
            int r4 = r4 + r2
            goto L_0x0143
        L_0x0151:
            if (r1 != r11) goto L_0x00a9
            android.graphics.Bitmap r2 = r8.A06     // Catch:{ all -> 0x0426 }
            if (r2 == 0) goto L_0x00a9
            int r1 = r8.A01     // Catch:{ all -> 0x0426 }
            int r0 = r8.A00     // Catch:{ all -> 0x0426 }
            r12 = r2
            r13 = r36
            r14 = r7
            r15 = r1
            r16 = r7
            r17 = r7
            r18 = r1
            r19 = r0
            r12.getPixels(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0426 }
            goto L_0x00a9
        L_0x016d:
            r0 = r32
            if (r1 >= r0) goto L_0x0179
            r10[r1] = r7     // Catch:{ all -> 0x0426 }
            byte r0 = (byte) r1     // Catch:{ all -> 0x0426 }
            r5[r1] = r0     // Catch:{ all -> 0x0426 }
            int r1 = r1 + 1
            goto L_0x016d
        L_0x0179:
            byte[] r0 = r8.A0B     // Catch:{ all -> 0x0426 }
            r26 = r0
            r25 = r29
            r24 = r30
            r23 = r28
            r2 = 0
            r22 = 0
            r1 = 0
            r21 = 0
            r3 = 0
            r20 = -1
            r19 = 0
            r18 = 0
        L_0x0190:
            r0 = r27
            if (r0 >= r13) goto L_0x01a2
            if (r2 != 0) goto L_0x01d0
            java.nio.ByteBuffer r0 = r8.A09     // Catch:{ all -> 0x0426 }
            byte r0 = r0.get()     // Catch:{ all -> 0x0426 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 > 0) goto L_0x01bd
            r8.A04 = r11     // Catch:{ all -> 0x0426 }
        L_0x01a2:
            java.util.Arrays.fill(r12, r3, r13, r7)     // Catch:{ all -> 0x0426 }
            boolean r0 = r6.A08     // Catch:{ all -> 0x0426 }
            r35 = r0
            if (r0 != 0) goto L_0x02aa
            int r0 = r8.A03     // Catch:{ all -> 0x0426 }
            if (r0 != r9) goto L_0x02aa
            int r0 = r6.A03     // Catch:{ all -> 0x0426 }
            r18 = r0
            int r14 = r6.A06     // Catch:{ all -> 0x0426 }
            int r13 = r6.A04     // Catch:{ all -> 0x0426 }
            int r12 = r6.A05     // Catch:{ all -> 0x0426 }
            int r0 = r8.A02     // Catch:{ all -> 0x0426 }
            goto L_0x0262
        L_0x01bd:
            java.nio.ByteBuffer r0 = r8.A09     // Catch:{ all -> 0x0426 }
            r15 = r0
            byte[] r0 = r8.A0B     // Catch:{ all -> 0x0426 }
            r14 = r0
            int r0 = r15.remaining()     // Catch:{ all -> 0x0426 }
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0426 }
            r15.get(r14, r7, r0)     // Catch:{ all -> 0x0426 }
            r22 = 0
        L_0x01d0:
            byte r0 = r26[r22]     // Catch:{ all -> 0x0426 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r1
            int r21 = r21 + r0
            int r1 = r1 + 8
            int r22 = r22 + 1
            int r2 = r2 + -1
        L_0x01dd:
            r0 = r25
            if (r1 < r0) goto L_0x0190
            r17 = r21 & r23
            int r21 = r21 >> r25
            int r1 = r1 - r25
            r14 = r17
            r0 = r32
            if (r14 != r0) goto L_0x01f6
            r23 = r28
            r25 = r29
            r24 = r30
            r20 = -1
            goto L_0x01dd
        L_0x01f6:
            r14 = r31
            r0 = r17
            if (r0 == r14) goto L_0x0190
            r0 = -1
            r14 = r0
            r0 = r20
            if (r0 != r14) goto L_0x020f
            byte r0 = r5[r17]     // Catch:{ all -> 0x0426 }
            r12[r3] = r0     // Catch:{ all -> 0x0426 }
            int r3 = r3 + 1
            int r27 = r27 + 1
            r20 = r17
            r18 = r17
            goto L_0x01dd
        L_0x020f:
            r14 = r24
            r0 = r17
            if (r0 < r14) goto L_0x021f
            r0 = r18
            byte r0 = (byte) r0     // Catch:{ all -> 0x0426 }
            r4[r19] = r0     // Catch:{ all -> 0x0426 }
            int r19 = r19 + 1
            r14 = r20
            goto L_0x0220
        L_0x021f:
            r14 = r0
        L_0x0220:
            r0 = r32
            if (r14 < r0) goto L_0x022d
            byte r0 = r5[r14]     // Catch:{ all -> 0x0426 }
            r4[r19] = r0     // Catch:{ all -> 0x0426 }
            int r19 = r19 + 1
            short r14 = r10[r14]     // Catch:{ all -> 0x0426 }
            goto L_0x0220
        L_0x022d:
            byte r0 = r5[r14]     // Catch:{ all -> 0x0426 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r18 = r0
            byte r0 = (byte) r0     // Catch:{ all -> 0x0426 }
            r16 = r0
        L_0x0236:
            r12[r3] = r0     // Catch:{ all -> 0x0426 }
            int r3 = r3 + 1
            int r27 = r27 + 1
            if (r19 <= 0) goto L_0x0243
            int r19 = r19 + -1
            byte r0 = r4[r19]     // Catch:{ all -> 0x0426 }
            goto L_0x0236
        L_0x0243:
            r15 = 4096(0x1000, float:5.74E-42)
            r14 = r24
            if (r14 >= r15) goto L_0x025e
            r0 = r20
            short r0 = (short) r0     // Catch:{ all -> 0x0426 }
            r10[r24] = r0     // Catch:{ all -> 0x0426 }
            r5[r24] = r16     // Catch:{ all -> 0x0426 }
            int r24 = r24 + 1
            r0 = r24 & r23
            if (r0 != 0) goto L_0x025e
            r14 = r24
            if (r14 >= r15) goto L_0x025e
            int r25 = r25 + 1
            int r23 = r23 + r24
        L_0x025e:
            r20 = r17
            goto L_0x01dd
        L_0x0262:
            boolean r17 = X.AnonymousClass7TF.A1Q(r0)
            int r10 = r8.A01     // Catch:{ all -> 0x0426 }
            byte[] r11 = r8.A0C     // Catch:{ all -> 0x0426 }
            int[] r5 = r8.A0F     // Catch:{ all -> 0x0426 }
            r4 = 0
            r3 = -1
        L_0x026e:
            r0 = r18
            if (r4 >= r0) goto L_0x0297
            int r0 = r4 + r14
            int r0 = r0 * r10
            int r15 = r0 + r12
            int r2 = r15 + r13
            int r0 = r0 + r10
            if (r0 >= r2) goto L_0x027d
            r2 = r0
        L_0x027d:
            int r16 = r13 * r4
        L_0x027f:
            if (r15 >= r2) goto L_0x0294
            byte r1 = r11[r16]     // Catch:{ all -> 0x0426 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r0 == r3) goto L_0x028f
            r0 = r5[r0]     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x028e
            r36[r15] = r0     // Catch:{ all -> 0x0426 }
            goto L_0x028f
        L_0x028e:
            r3 = r1
        L_0x028f:
            int r16 = r16 + 1
            int r15 = r15 + 1
            goto L_0x027f
        L_0x0294:
            int r4 = r4 + 1
            goto L_0x026e
        L_0x0297:
            java.lang.Boolean r0 = r8.A08     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x02a3
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0426 }
            if (r0 != 0) goto L_0x03de
            goto L_0x03d7
        L_0x02a3:
            if (r17 == 0) goto L_0x03d7
            r0 = -1
            if (r3 == r0) goto L_0x03d7
            goto L_0x03de
        L_0x02aa:
            int r0 = r6.A03     // Catch:{ all -> 0x0426 }
            int r13 = r8.A03     // Catch:{ all -> 0x0426 }
            int r34 = r0 / r13
            int r0 = r6.A06     // Catch:{ all -> 0x0426 }
            int r33 = r0 / r13
            int r0 = r6.A04     // Catch:{ all -> 0x0426 }
            r32 = r0
            int r31 = r0 / r13
            int r0 = r6.A05     // Catch:{ all -> 0x0426 }
            int r30 = r0 / r13
            int r0 = r8.A02     // Catch:{ all -> 0x0426 }
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0426 }
            boolean r28 = X.AnonymousClass7TF.A1Q(r0)
            int r10 = r8.A01     // Catch:{ all -> 0x0426 }
            int r0 = r8.A00     // Catch:{ all -> 0x0426 }
            r38 = r0
            byte[] r12 = r8.A0C     // Catch:{ all -> 0x0426 }
            int[] r0 = r8.A0F     // Catch:{ all -> 0x0426 }
            r27 = r0
            java.lang.Boolean r0 = r8.A08     // Catch:{ all -> 0x0426 }
            r26 = r0
            r25 = r0
            r24 = 8
            r5 = 0
            r1 = 0
            r4 = 1
        L_0x02df:
            r0 = r34
            if (r5 >= r0) goto L_0x03d2
            if (r35 == 0) goto L_0x03cd
            if (r1 < r0) goto L_0x02f6
            int r4 = r4 + 1
            r0 = r37
            if (r4 == r0) goto L_0x03c9
            if (r4 == r11) goto L_0x03c3
            r0 = 4
            if (r4 != r0) goto L_0x02f6
            r4 = 4
            r1 = 1
            r24 = 2
        L_0x02f6:
            int r23 = r1 + r24
        L_0x02f8:
            int r1 = r1 + r33
            boolean r2 = X.AnonymousClass7TF.A1S(r13, r9)
            r0 = r38
            if (r1 >= r0) goto L_0x03bd
            int r1 = r1 * r10
            int r15 = r1 + r30
            int r14 = r15 + r31
            int r1 = r1 + r10
            if (r1 >= r14) goto L_0x030b
            r14 = r1
        L_0x030b:
            int r22 = r5 * r13
            int r22 = r22 * r32
            if (r2 != 0) goto L_0x03a5
            int r3 = r14 - r15
            int r3 = r3 * r13
            int r3 = r3 + r22
        L_0x0316:
            if (r15 >= r14) goto L_0x03bd
            r2 = r22
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
        L_0x0324:
            int r0 = r13 + r22
            if (r2 >= r0) goto L_0x0350
            int r0 = r12.length     // Catch:{ all -> 0x0426 }
            if (r2 >= r0) goto L_0x0350
            if (r2 >= r3) goto L_0x0350
            byte r0 = r12[r2]     // Catch:{ all -> 0x0426 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r27[r0]     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x034d
            int r0 = r1 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r0
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r0
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r18 = r18 + r0
            int r17 = r17 + 1
        L_0x034d:
            int r2 = r2 + 1
            goto L_0x0324
        L_0x0350:
            int r16 = r22 + r32
            r2 = r16
        L_0x0354:
            int r0 = r13 + r16
            if (r2 >= r0) goto L_0x0380
            int r0 = r12.length     // Catch:{ all -> 0x0426 }
            if (r2 >= r0) goto L_0x0380
            if (r2 >= r3) goto L_0x0380
            byte r0 = r12[r2]     // Catch:{ all -> 0x0426 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r27[r0]     // Catch:{ all -> 0x0426 }
            if (r1 == 0) goto L_0x037d
            int r0 = r1 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r0
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r0
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r18 = r18 + r0
            int r17 = r17 + 1
        L_0x037d:
            int r2 = r2 + 1
            goto L_0x0354
        L_0x0380:
            if (r17 == 0) goto L_0x0399
            int r21 = r21 / r17
            int r1 = r21 << 24
            int r20 = r20 / r17
            int r0 = r20 << 16
            r1 = r1 | r0
            int r19 = r19 / r17
            int r0 = r19 << 8
            r1 = r1 | r0
            int r18 = r18 / r17
            r1 = r1 | r18
            if (r1 == 0) goto L_0x0399
            r36[r15] = r1     // Catch:{ all -> 0x0426 }
            goto L_0x039f
        L_0x0399:
            if (r28 == 0) goto L_0x039f
            if (r26 != 0) goto L_0x039f
            r26 = r29
        L_0x039f:
            int r22 = r22 + r13
            int r15 = r15 + 1
            goto L_0x0316
        L_0x03a5:
            if (r15 >= r14) goto L_0x03bd
            byte r0 = r12[r22]     // Catch:{ all -> 0x0426 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r27[r0]     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x03b2
            r36[r15] = r0     // Catch:{ all -> 0x0426 }
            goto L_0x03b8
        L_0x03b2:
            if (r28 == 0) goto L_0x03b8
            if (r26 != 0) goto L_0x03b8
            r26 = r29
        L_0x03b8:
            int r22 = r22 + r13
            int r15 = r15 + 1
            goto L_0x03a5
        L_0x03bd:
            int r5 = r5 + 1
            r1 = r23
            goto L_0x02df
        L_0x03c3:
            r4 = 3
            r1 = 2
            r24 = 4
            goto L_0x02f6
        L_0x03c9:
            r4 = 2
            r1 = 4
            goto L_0x02f6
        L_0x03cd:
            r23 = r1
            r1 = r5
            goto L_0x02f8
        L_0x03d2:
            if (r25 != 0) goto L_0x03e4
            if (r26 == 0) goto L_0x03d7
            goto L_0x03da
        L_0x03d7:
            r33 = 0
            goto L_0x03de
        L_0x03da:
            boolean r33 = r26.booleanValue()     // Catch:{ all -> 0x0426 }
        L_0x03de:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r33)     // Catch:{ all -> 0x0426 }
            r8.A08 = r0     // Catch:{ all -> 0x0426 }
        L_0x03e4:
            boolean r0 = r8.A0A     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x0409
            int r0 = r6.A02     // Catch:{ all -> 0x0426 }
            if (r0 == 0) goto L_0x03ee
            if (r0 != r9) goto L_0x0409
        L_0x03ee:
            android.graphics.Bitmap r1 = r8.A06     // Catch:{ all -> 0x0426 }
            if (r1 != 0) goto L_0x03f8
            android.graphics.Bitmap r1 = r8.A00()     // Catch:{ all -> 0x0426 }
            r8.A06 = r1     // Catch:{ all -> 0x0426 }
        L_0x03f8:
            int r0 = r8.A00     // Catch:{ all -> 0x0426 }
            r11 = r1
            r12 = r36
            r13 = r7
            r14 = r10
            r15 = r7
            r16 = r7
            r17 = r10
            r18 = r0
            r11.setPixels(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0426 }
        L_0x0409:
            android.graphics.Bitmap r11 = r8.A00()     // Catch:{ all -> 0x0426 }
            int r0 = r8.A00     // Catch:{ all -> 0x0426 }
            r12 = r36
            r13 = r7
            r14 = r10
            r15 = r7
            r16 = r7
            r17 = r10
            r18 = r0
            r11.setPixels(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0426 }
            monitor-exit(r8)
            return r11
        L_0x041f:
            java.lang.String r0 = "StandardGifDecoder"
            android.util.Log.isLoggable(r0, r11)     // Catch:{ all -> 0x0426 }
            monitor-exit(r8)
            return r3
        L_0x0426:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11264SHy.A01():android.graphics.Bitmap");
    }
}
