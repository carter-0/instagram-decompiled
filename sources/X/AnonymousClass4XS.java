package X;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4XS  reason: invalid class name */
public final class AnonymousClass4XS implements AnonymousClass4XT {
    public static final C256683wB A0X;
    public static final byte[] A0Y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public SparseArray A0C;
    public C265004Sd A0D;
    public AnonymousClass4YL A0E;
    public AnonymousClass4XV A0F;
    public boolean A0G;
    public boolean A0H;
    public C265994Xd[] A0I;
    public C265994Xd[] A0J;
    public final int A0K;
    public final C265994Xd A0L;
    public final AnonymousClass4XU A0M;
    public final AnonymousClass4XV A0N;
    public final AnonymousClass4XV A0O;
    public final AnonymousClass4XV A0P;
    public final AnonymousClass4XV A0Q;
    public final AnonymousClass4XV A0R;
    public final ArrayDeque A0S;
    public final ArrayDeque A0T;
    public final List A0U;
    public final boolean A0V;
    public final byte[] A0W;

    public final boolean Evy(AnonymousClass4Y7 r2) {
        return C11137SBs.A00(r2, true);
    }

    static {
        C256653w8 r1 = new C256653w8();
        r1.A0U = "application/x-emsg";
        A0X = new C256683wB(r1);
    }

    public static void A01(AnonymousClass4YM r5, AnonymousClass4XV r6, int i) {
        r6.A0G(i + 8);
        int A012 = r6.A01() & 16777215;
        if ((A012 & 1) == 0) {
            int i2 = A012 & 2;
            boolean z = false;
            if (i2 != 0) {
                z = true;
            }
            int A042 = r6.A04();
            int i3 = r5.A00;
            if (A042 == i3) {
                Arrays.fill(r5.A0E, 0, A042, z);
                AnonymousClass4XV r2 = r5.A0G;
                r2.A0E(r6.A00 - r6.A01);
                r5.A07 = true;
                r5.A09 = true;
                r6.A0J(r2.A02, 0, r2.A00);
                r2.A0G(0);
                r5.A09 = false;
                return;
            }
            throw new IOException(002.A02(A042, i3, "Length mismatch: ", ", "));
        }
        throw new IOException(Pxd.A00(547));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c6, code lost:
        if (r3 == 1701671783) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0405, code lost:
        if (r0.A07 == ((long) r0.A00)) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07bd, code lost:
        if ((r40 & 1) == 0) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0cc8, code lost:
        if (r16 != 3) goto L_0x0cca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0d5a, code lost:
        if (r12.A0E[r3] == false) goto L_0x0d5c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:654:0x0e38 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E68(X.AnonymousClass4Y7 r57, X.C265044Sh r58) {
        /*
            r56 = this;
        L_0x0000:
            r0 = r56
            int r3 = r0.A02
            r1 = r57
            if (r3 == 0) goto L_0x027e
            r6 = 1
            if (r3 == r6) goto L_0x0099
            r8 = 2
            if (r3 == r8) goto L_0x004a
            r24 = 0
            r23 = 3
            r9 = 4
            r7 = 0
            r2 = r23
            if (r3 != r2) goto L_0x0bb5
            X.4YL r10 = r0.A0E
            if (r10 != 0) goto L_0x0b32
            android.util.SparseArray r13 = r0.A0C
            int r12 = r13.size()
            r10 = 0
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
        L_0x0029:
            if (r11 >= r12) goto L_0x0a7c
            java.lang.Object r5 = r13.valueAt(r11)
            X.4YL r5 = (X.AnonymousClass4YL) r5
            int r3 = r5.A02
            X.4YM r2 = r5.A07
            int r2 = r2.A01
            if (r3 == r2) goto L_0x0047
            X.4YM r2 = r5.A07
            long[] r3 = r2.A0D
            int r2 = r5.A02
            r3 = r3[r2]
            int r2 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            r10 = r5
            r14 = r3
        L_0x0047:
            int r11 = r11 + 1
            goto L_0x0029
        L_0x004a:
            android.util.SparseArray r11 = r0.A0C
            int r10 = r11.size()
            r6 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0057:
            if (r9 >= r10) goto L_0x0075
            java.lang.Object r2 = r11.valueAt(r9)
            X.4YL r2 = (X.AnonymousClass4YL) r2
            X.4YM r3 = r2.A07
            boolean r2 = r3.A09
            if (r2 == 0) goto L_0x0072
            long r7 = r3.A02
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            java.lang.Object r6 = r11.valueAt(r9)
            X.4YL r6 = (X.AnonymousClass4YL) r6
            r4 = r7
        L_0x0072:
            int r9 = r9 + 1
            goto L_0x0057
        L_0x0075:
            if (r6 != 0) goto L_0x007a
            r1 = 3
            goto L_0x0337
        L_0x007a:
            r0 = r1
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r2 = r0.A02
            long r4 = r4 - r2
            int r0 = (int) r4
            if (r0 < 0) goto L_0x0a92
            r1.Evk(r0)
            X.4YM r5 = r6.A07
            X.4XV r4 = r5.A0G
            byte[] r3 = r4.A02
            int r2 = r4.A00
            r0 = 0
            r1.readFully(r3, r0, r2)
            r4.A0G(r0)
            r5.A09 = r0
            goto L_0x0000
        L_0x0099:
            long r4 = r0.A07
            int r3 = (int) r4
            int r2 = r0.A00
            int r3 = r3 - r2
            X.4XV r2 = r0.A0F
            if (r2 == 0) goto L_0x0279
            byte[] r2 = r2.A02
            r4 = 8
            r1.readFully(r2, r4, r3)
            int r3 = r0.A01
            X.4XV r2 = r0.A0F
            X.4YA r5 = new X.4YA
            r5.<init>(r2, r3)
            java.util.ArrayDeque r3 = r0.A0S
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00cc
            java.lang.Object r2 = r3.peek()
            X.4Y8 r2 = (X.AnonymousClass4Y8) r2
            java.util.List r2 = r2.A02
            r2.add(r5)
        L_0x00c6:
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r10 = r1.A02
            goto L_0x0407
        L_0x00cc:
            int r3 = r5.A00
            r2 = 1936286840(0x73696478, float:1.8491255E31)
            if (r3 != r2) goto L_0x016f
            X.4XV r9 = r5.A00
            r2 = r1
            X.4Y6 r2 = (X.AnonymousClass4Y6) r2
            long r2 = r2.A02
            r9.A0G(r4)
            int r4 = r9.A01()
            int r4 = r4 >> 24
            r5 = r4 & 255(0xff, float:3.57E-43)
            r4 = 4
            r9.A0H(r4)
            long r24 = r9.A07()
            if (r5 != 0) goto L_0x0142
            long r20 = r9.A07()
            long r4 = r9.A07()
        L_0x00f7:
            long r2 = r2 + r4
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = com.google.android.exoplayer2.util.Util.A09(r20, r22, r24)
            r4 = 2
            r9.A0H(r4)
            int r8 = r9.A05()
            int[] r7 = new int[r8]
            long[] r11 = new long[r8]
            long[] r10 = new long[r8]
            long[] r5 = new long[r8]
            r16 = r18
            r4 = 0
        L_0x0112:
            if (r4 >= r8) goto L_0x014b
            int r15 = r9.A01()
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x0a9e
            long r13 = r9.A07()
            r12 = 2147483647(0x7fffffff, float:NaN)
            r15 = r15 & r12
            r7[r4] = r15
            r11[r4] = r2
            r5[r4] = r16
            long r20 = r20 + r13
            long r14 = com.google.android.exoplayer2.util.Util.A09(r20, r22, r24)
            long r12 = r14 - r16
            r10[r4] = r12
            r12 = 4
            r9.A0H(r12)
            r12 = r7[r4]
            long r12 = (long) r12
            long r2 = r2 + r12
            int r4 = r4 + 1
            r16 = r14
            goto L_0x0112
        L_0x0142:
            long r20 = r9.A08()
            long r4 = r9.A08()
            goto L_0x00f7
        L_0x014b:
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            X.4YN r2 = new X.4YN
            r2.<init>(r7, r11, r10, r5)
            android.util.Pair r4 = android.util.Pair.create(r3, r2)
            java.lang.Object r2 = r4.first
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r0.A0B = r2
            X.4Sd r3 = r0.A0D
            java.lang.Object r2 = r4.second
            X.4YO r2 = (X.AnonymousClass4YO) r2
            r3.EKx(r2)
            r0.A0G = r6
            goto L_0x00c6
        L_0x016f:
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r3 != r2) goto L_0x00c6
            r2 = r1
            X.4Y6 r2 = (X.AnonymousClass4Y6) r2
            X.3ws r2 = r2.A05
            android.net.Uri r12 = r2.getUri()
            if (r12 == 0) goto L_0x00c6
            X.4XV r10 = r5.A00
            X.4Xd[] r2 = r0.A0J
            if (r2 == 0) goto L_0x00c6
            int r2 = r2.length
            if (r2 == 0) goto L_0x00c6
            r10.A0G(r4)
            int r2 = r10.A01()
            int r2 = r2 >> 24
            r3 = r2 & 255(0xff, float:3.57E-43)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x01e1
            if (r3 == r6) goto L_0x01ad
            r2 = 570(0x23a, float:7.99E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r3 = X.002.A0O(r2, r3)
            java.lang.String r2 = "FragmentedMp4Extractor"
            X.2AG.A04(r2, r3)
            goto L_0x00c6
        L_0x01ad:
            long r22 = r10.A07()
            long r18 = r10.A08()
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = com.google.android.exoplayer2.util.Util.A09(r18, r20, r22)
            long r24 = r10.A07()
            r26 = 1000(0x3e8, double:4.94E-321)
            r28 = r22
            long r22 = com.google.android.exoplayer2.util.Util.A09(r24, r26, r28)
            long r24 = r10.A07()
            r8 = 0
            java.lang.String r19 = r10.A09()
            r19.getClass()
            java.lang.String r20 = r10.A09()
            r20.getClass()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0214
        L_0x01e1:
            r8 = 0
            java.lang.String r19 = r10.A09()
            r19.getClass()
            java.lang.String r20 = r10.A09()
            r20.getClass()
            long r25 = r10.A07()
            long r21 = r10.A07()
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = com.google.android.exoplayer2.util.Util.A09(r21, r23, r25)
            long r2 = r0.A0B
            int r7 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x024c
            long r2 = r2 + r4
        L_0x0206:
            long r21 = r10.A07()
            r23 = 1000(0x3e8, double:4.94E-321)
            long r22 = com.google.android.exoplayer2.util.Util.A09(r21, r23, r25)
            long r24 = r10.A07()
        L_0x0214:
            int r9 = r10.A00
            int r7 = r10.A01
            int r9 = r9 - r7
            byte[] r11 = new byte[r9]
            r7 = 0
            r10.A0J(r11, r8, r9)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r9 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r18 = r9
            r21 = r11
            r18.<init>(r19, r20, r21, r22, r24)
            X.4XU r10 = r0.A0M
            byte[] r9 = r10.A00(r9)
            X.4XV r15 = new X.4XV
            r15.<init>((byte[]) r9)
            int r9 = r15.A00
            int r10 = r15.A01
            int r9 = r9 - r10
            X.4Xd[] r14 = r0.A0J
            int r13 = r14.length
            r11 = 0
        L_0x023c:
            if (r11 >= r13) goto L_0x0252
            r10 = r14[r11]
            r15.A0G(r8)
            r10.FMe(r12)
            r10.EJh(r15, r9)
            int r11 = r11 + 1
            goto L_0x023c
        L_0x024c:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0206
        L_0x0252:
            int r10 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x0267
            java.util.ArrayDeque r3 = r0.A0T
            X.Xa2 r2 = new X.Xa2
            r2.<init>(r4, r9)
            r3.addLast(r2)
            int r2 = r0.A03
            int r2 = r2 + r9
            r0.A03 = r2
            goto L_0x00c6
        L_0x0267:
            X.4Xd[] r5 = r0.A0J
            int r4 = r5.length
        L_0x026a:
            if (r7 >= r4) goto L_0x00c6
            r10 = r5[r7]
            r11 = 0
            r12 = r6
            r13 = r9
            r14 = r8
            r15 = r2
            r10.EJn(r11, r12, r13, r14, r15)
            int r7 = r7 + 1
            goto L_0x026a
        L_0x0279:
            r1.Evk(r3)
            goto L_0x00c6
        L_0x027e:
            int r2 = r0.A00
            r8 = 8
            r7 = 0
            r9 = 1
            if (r2 != 0) goto L_0x02a3
            X.4XV r4 = r0.A0N
            byte[] r2 = r4.A02
            boolean r2 = r1.E6T(r2, r7, r8, r9)
            if (r2 != 0) goto L_0x0292
            r0 = -1
            return r0
        L_0x0292:
            r0.A00 = r8
            r4.A0G(r7)
            long r2 = r4.A07()
            r0.A07 = r2
            int r2 = r4.A01()
            r0.A01 = r2
        L_0x02a3:
            long r2 = r0.A07
            r5 = 1
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02ec
            X.4XV r3 = r0.A0N
            byte[] r2 = r3.A02
            r1.readFully(r2, r8, r8)
            int r2 = r0.A00
            int r2 = r2 + 8
            r0.A00 = r2
            long r4 = r3.A08()
        L_0x02bc:
            r0.A07 = r4
        L_0x02be:
            long r5 = r0.A07
            int r12 = r0.A00
            long r3 = (long) r12
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0e38
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r10 = r1.A02
            long r1 = r10 - r3
            int r3 = r0.A01
            r4 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r3 != r4) goto L_0x0319
            android.util.SparseArray r12 = r0.A0C
            int r9 = r12.size()
            r8 = 0
        L_0x02db:
            if (r8 >= r9) goto L_0x03f0
            java.lang.Object r4 = r12.valueAt(r8)
            X.4YL r4 = (X.AnonymousClass4YL) r4
            X.4YM r4 = r4.A07
            r4.A02 = r1
            r4.A03 = r1
            int r8 = r8 + 1
            goto L_0x02db
        L_0x02ec:
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02be
            r6 = r1
            X.4Y6 r6 = (X.AnonymousClass4Y6) r6
            long r4 = r6.A04
            r10 = -1
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x030d
            java.util.ArrayDeque r3 = r0.A0S
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x030d
            java.lang.Object r2 = r3.peek()
            X.4Y8 r2 = (X.AnonymousClass4Y8) r2
            long r4 = r2.A00
        L_0x030d:
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x02be
            long r2 = r6.A02
            long r4 = r4 - r2
            int r2 = r0.A00
            long r2 = (long) r2
            long r4 = r4 + r2
            goto L_0x02bc
        L_0x0319:
            r13 = 1835295092(0x6d646174, float:4.4175247E27)
            r4 = 0
            if (r3 != r13) goto L_0x033b
            r0.A0E = r4
            long r5 = r5 + r1
            r0.A09 = r5
            boolean r3 = r0.A0G
            if (r3 != 0) goto L_0x0336
            X.4Sd r6 = r0.A0D
            long r4 = r0.A08
            X.SwL r3 = new X.SwL
            r3.<init>(r4, r1)
            r6.EKx(r3)
            r0.A0G = r9
        L_0x0336:
            r1 = 2
        L_0x0337:
            r0.A02 = r1
            goto L_0x0000
        L_0x033b:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r3 == r1) goto L_0x03f0
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r1) goto L_0x03f0
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r1) goto L_0x03f0
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r1) goto L_0x03f0
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r1) goto L_0x03f0
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r3 == r1) goto L_0x03f0
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r3 == r1) goto L_0x03f0
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 == r1) goto L_0x03f0
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r1) goto L_0x03c8
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r1) goto L_0x03c8
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r1) goto L_0x03c8
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r3 == r1) goto L_0x03c8
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r3 == r1) goto L_0x03c8
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r3 == r1) goto L_0x03c8
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r1) goto L_0x03c8
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r3 == r1) goto L_0x03c8
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r3 != r2) goto L_0x03c9
        L_0x03c8:
            r1 = 1
        L_0x03c9:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x03e9
            if (r12 != r8) goto L_0x0ab6
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0aaa
            int r1 = (int) r5
            X.4XV r3 = new X.4XV
            r3.<init>((int) r1)
            r0.A0F = r3
            X.4XV r1 = r0.A0N
            byte[] r2 = r1.A02
            byte[] r1 = r3.A02
            java.lang.System.arraycopy(r2, r7, r1, r7, r8)
        L_0x03e5:
            r0.A02 = r9
            goto L_0x0000
        L_0x03e9:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0ac2
            r0.A0F = r4
            goto L_0x03e5
        L_0x03f0:
            long r10 = r10 + r5
            r1 = 8
            long r10 = r10 - r1
            java.util.ArrayDeque r2 = r0.A0S
            X.4Y8 r1 = new X.4Y8
            r1.<init>(r3, r10)
            r2.push(r1)
            long r4 = r0.A07
            int r1 = r0.A00
            long r2 = (long) r1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0a8c
        L_0x0407:
            java.util.ArrayDeque r4 = r0.A0S
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0a75
            java.lang.Object r1 = r4.peek()
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            long r2 = r1.A00
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0a75
            java.lang.Object r12 = r4.pop()
            X.4Y8 r12 = (X.AnonymousClass4Y8) r12
            int r2 = r12.A00
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r1) goto L_0x0608
            r15 = 1
            r6 = 0
            java.util.List r1 = r12.A02
            com.google.android.exoplayer2.drm.DrmInitData r17 = A00(r1)
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            X.4Y8 r1 = r12.A00(r1)
            r1.getClass()
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            java.util.List r14 = r1.A02
            int r13 = r14.size()
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x044b:
            if (r9 >= r13) goto L_0x04b6
            java.lang.Object r3 = r14.get(r9)
            X.4YA r3 = (X.AnonymousClass4YA) r3
            int r2 = r3.A00
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 != r1) goto L_0x0494
            X.4XV r1 = r3.A00
            r2 = 12
            r1.A0G(r2)
            int r16 = r1.A01()
            int r2 = r1.A04()
            int r8 = r2 + -1
            int r7 = r1.A04()
            int r4 = r1.A04()
            int r3 = r1.A01()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            X.4YB r1 = new X.4YB
            r1.<init>(r8, r7, r4, r3)
            android.util.Pair r3 = android.util.Pair.create(r2, r1)
            java.lang.Object r1 = r3.first
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            java.lang.Object r1 = r3.second
            r5.put(r2, r1)
        L_0x0491:
            int r9 = r9 + 1
            goto L_0x044b
        L_0x0494:
            int r2 = r3.A00
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 != r1) goto L_0x0491
            X.4XV r2 = r3.A00
            r1 = 8
            r2.A0G(r1)
            int r1 = r2.A01()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x04b1
            long r20 = r2.A07()
            goto L_0x0491
        L_0x04b1:
            long r20 = r2.A08()
            goto L_0x0491
        L_0x04b6:
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.util.List r4 = r12.A01
            int r3 = r4.size()
            r2 = 0
        L_0x04c2:
            if (r2 >= r3) goto L_0x04f4
            java.lang.Object r1 = r4.get(r2)
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            int r9 = r1.A00
            r8 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 != r8) goto L_0x04f1
            r8 = 1836476516(0x6d766864, float:4.7662196E27)
            X.4YA r19 = r12.A01(r8)
            int r8 = r0.A0K
            r8 = r8 & 16
            r22 = 0
            if (r8 == 0) goto L_0x04e2
            r22 = 1
        L_0x04e2:
            r18 = r1
            r23 = r6
            X.4YI r8 = X.AnonymousClass4YC.A02(r17, r18, r19, r20, r22, r23)
            if (r8 == 0) goto L_0x04f1
            int r1 = r8.A00
            r7.put(r1, r8)
        L_0x04f1:
            int r2 = r2 + 1
            goto L_0x04c2
        L_0x04f4:
            int r9 = r7.size()
            android.util.SparseArray r8 = r0.A0C
            int r1 = r8.size()
            if (r1 == 0) goto L_0x0544
            int r1 = r8.size()
            if (r1 == r9) goto L_0x0507
            r15 = 0
        L_0x0507:
            X.C256703wD.A04(r15)
        L_0x050a:
            if (r6 >= r9) goto L_0x0407
            java.lang.Object r12 = r7.valueAt(r6)
            X.4YI r12 = (X.AnonymousClass4YI) r12
            int r4 = r12.A00
            java.lang.Object r3 = r8.get(r4)
            X.4YL r3 = (X.AnonymousClass4YL) r3
            int r2 = r5.size()
            r1 = 1
            if (r2 != r1) goto L_0x053c
            r1 = 0
            java.lang.Object r1 = r5.valueAt(r1)
        L_0x0526:
            X.4YB r1 = (X.AnonymousClass4YB) r1
            r3.A05 = r12
            r1.getClass()
            r3.A04 = r1
            X.4Xd r2 = r3.A06
            X.3wB r1 = r12.A07
            r2.AWP(r1)
            r3.A01()
            int r6 = r6 + 1
            goto L_0x050a
        L_0x053c:
            java.lang.Object r1 = r5.get(r4)
            r1.getClass()
            goto L_0x0526
        L_0x0544:
            if (r6 >= r9) goto L_0x0591
            java.lang.Object r12 = r7.valueAt(r6)
            X.4YI r12 = (X.AnonymousClass4YI) r12
            X.4Sd r2 = r0.A0D
            int r1 = r12.A03
            X.4Xd r1 = r2.FHW(r6, r1)
            X.4YL r4 = new X.4YL
            r4.<init>(r1)
            int r3 = r12.A00
            int r1 = r5.size()
            if (r1 != r15) goto L_0x0589
            r1 = 0
            java.lang.Object r1 = r5.valueAt(r1)
        L_0x0566:
            X.4YB r1 = (X.AnonymousClass4YB) r1
            r4.A05 = r12
            r1.getClass()
            r4.A04 = r1
            X.4Xd r2 = r4.A06
            X.3wB r1 = r12.A07
            r2.AWP(r1)
            r4.A01()
            r8.put(r3, r4)
            long r3 = r0.A08
            long r1 = r12.A04
            long r1 = java.lang.Math.max(r3, r1)
            r0.A08 = r1
            int r6 = r6 + 1
            goto L_0x0544
        L_0x0589:
            java.lang.Object r1 = r5.get(r3)
            r1.getClass()
            goto L_0x0566
        L_0x0591:
            X.4Xd[] r1 = r0.A0J
            r5 = 0
            if (r1 != 0) goto L_0x05d2
            r1 = 2
            X.4Xd[] r7 = new X.C265994Xd[r1]
            r0.A0J = r7
            X.4Xd r1 = r0.A0L
            if (r1 == 0) goto L_0x05d0
            r7[r5] = r1
            r6 = 1
        L_0x05a2:
            int r1 = r0.A0K
            r1 = r1 & 4
            if (r1 == 0) goto L_0x05b8
            int r4 = r6 + 1
            X.4Sd r3 = r0.A0D
            int r2 = r8.size()
            r1 = 5
            X.4Xd r1 = r3.FHW(r2, r1)
            r7[r6] = r1
            r6 = r4
        L_0x05b8:
            X.4Xd[] r1 = r0.A0J
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            X.4Xd[] r6 = (X.C265994Xd[]) r6
            r0.A0J = r6
            int r4 = r6.length
            r3 = 0
        L_0x05c4:
            if (r3 >= r4) goto L_0x05d2
            r2 = r6[r3]
            X.3wB r1 = A0X
            r2.AWP(r1)
            int r3 = r3 + 1
            goto L_0x05c4
        L_0x05d0:
            r6 = 0
            goto L_0x05a2
        L_0x05d2:
            X.4Xd[] r1 = r0.A0I
            if (r1 != 0) goto L_0x0601
            java.util.List r4 = r0.A0U
            int r1 = r4.size()
            X.4Xd[] r1 = new X.C265994Xd[r1]
            r0.A0I = r1
        L_0x05e0:
            int r1 = r1.length
            if (r5 >= r1) goto L_0x0601
            X.4Sd r3 = r0.A0D
            int r1 = r8.size()
            int r2 = r1 + 1
            int r2 = r2 + r5
            r1 = 3
            X.4Xd r2 = r3.FHW(r2, r1)
            java.lang.Object r1 = r4.get(r5)
            X.3wB r1 = (X.C256683wB) r1
            r2.AWP(r1)
            X.4Xd[] r1 = r0.A0I
            r1[r5] = r2
            int r5 = r5 + 1
            goto L_0x05e0
        L_0x0601:
            X.4Sd r1 = r0.A0D
            r1.ASU()
            goto L_0x0407
        L_0x0608:
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r1) goto L_0x0a62
            android.util.SparseArray r1 = r0.A0C
            r55 = r1
            int r1 = r0.A0K
            r40 = r1
            byte[] r1 = r0.A0W
            r54 = r1
            boolean r1 = r0.A0V
            r39 = r1
            java.util.List r1 = r12.A01
            r53 = r1
            int r38 = r53.size()
            r37 = 0
        L_0x0627:
            r2 = r37
            r1 = r38
            if (r2 >= r1) goto L_0x09e2
            r2 = r53
            r1 = r37
            java.lang.Object r9 = r2.get(r1)
            X.4Y8 r9 = (X.AnonymousClass4Y8) r9
            int r2 = r9.A00
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 != r1) goto L_0x09de
            r5 = 1
            r1 = r38
            if (r1 <= r5) goto L_0x09db
            if (r39 == 0) goto L_0x09db
        L_0x0645:
            r1 = 1952868452(0x74666864, float:7.301914E31)
            X.4YA r1 = r9.A01(r1)
            X.4XV r6 = r1.A00
            r4 = 8
            r6.A0G(r4)
            int r14 = r6.A01()
            r36 = 16777215(0xffffff, float:2.3509886E-38)
            r14 = r14 & r36
            int r2 = r6.A01()
            int r1 = r55.size()
            r3 = 1
            if (r1 != r3) goto L_0x09d3
            if (r5 != 0) goto L_0x09d3
            r2 = 0
            r1 = r55
            java.lang.Object r8 = r1.valueAt(r2)
        L_0x0670:
            X.4YL r8 = (X.AnonymousClass4YL) r8
            if (r8 == 0) goto L_0x09de
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0682
            long r1 = r6.A08()
            X.4YM r5 = r8.A07
            r5.A03 = r1
            r5.A02 = r1
        L_0x0682:
            X.4YB r2 = r8.A04
            r1 = r14 & 2
            if (r1 == 0) goto L_0x09cf
            int r1 = r6.A04()
            int r13 = r1 + -1
        L_0x068e:
            r1 = r14 & 8
            if (r1 == 0) goto L_0x09cb
            int r7 = r6.A04()
        L_0x0696:
            r1 = r14 & 16
            if (r1 == 0) goto L_0x09c7
            int r5 = r6.A04()
        L_0x069e:
            r1 = r14 & 32
            if (r1 == 0) goto L_0x09c3
            int r2 = r6.A04()
        L_0x06a6:
            X.4YM r6 = r8.A07
            X.4YB r1 = new X.4YB
            r1.<init>(r13, r7, r5, r2)
            r6.A05 = r1
            long r1 = r6.A04
            r32 = r1
            r8.A01()
            r2 = 1952867444(0x74666474, float:7.3014264E31)
            X.4YA r1 = r9.A01(r2)
            if (r1 == 0) goto L_0x06da
            r1 = r40 & 2
            if (r1 != 0) goto L_0x06da
            X.4YA r1 = r9.A01(r2)
            X.4XV r2 = r1.A00
            r2.A0G(r4)
            int r1 = r2.A01()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x09bd
            long r32 = r2.A08()
        L_0x06da:
            java.util.List r1 = r9.A02
            r52 = r1
            int r35 = r52.size()
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x06e6:
            r34 = 1953658222(0x7472756e, float:7.683823E31)
            r1 = r35
            if (r4 >= r1) goto L_0x070e
            r1 = r52
            java.lang.Object r13 = r1.get(r4)
            X.4YA r13 = (X.AnonymousClass4YA) r13
            int r7 = r13.A00
            r1 = r34
            if (r7 != r1) goto L_0x070b
            X.4XV r7 = r13.A00
            r1 = 12
            r7.A0G(r1)
            int r1 = r7.A04()
            if (r1 <= 0) goto L_0x070b
            int r2 = r2 + r1
            int r3 = r3 + 1
        L_0x070b:
            int r4 = r4 + 1
            goto L_0x06e6
        L_0x070e:
            r8.A02 = r5
            r8.A00 = r5
            r8.A01 = r5
            r6.A00(r3, r2)
            r31 = 0
            r7 = 0
            r13 = 0
        L_0x071b:
            r1 = r35
            if (r13 >= r1) goto L_0x0836
            r1 = r52
            java.lang.Object r3 = r1.get(r13)
            X.4YA r3 = (X.AnonymousClass4YA) r3
            int r2 = r3.A00
            r1 = r34
            if (r2 != r1) goto L_0x0832
            int r30 = r31 + 1
            X.4XV r1 = r3.A00
            r51 = r1
            r2 = 8
            r1.A0G(r2)
            int r14 = r51.A01()
            r14 = r14 & r36
            X.4YI r4 = r8.A05
            X.4YB r1 = r6.A05
            r50 = r1
            int[] r1 = r6.A0B
            int r19 = r51.A04()
            r1[r31] = r19
            long[] r3 = r6.A0D
            long r1 = r6.A03
            r3[r31] = r1
            r15 = r14 & 1
            if (r15 == 0) goto L_0x075e
            int r15 = r51.A01()
            long r15 = (long) r15
            long r1 = r1 + r15
            r3[r31] = r1
        L_0x075e:
            r1 = r14 & 4
            r2 = 1
            r18 = 0
            if (r1 == 0) goto L_0x0767
            r18 = 1
        L_0x0767:
            r1 = r50
            int r1 = r1.A01
            r29 = r1
            r49 = r1
            if (r18 == 0) goto L_0x0775
            int r29 = r51.A04()
        L_0x0775:
            r1 = r14 & 256(0x100, float:3.59E-43)
            r28 = 0
            if (r1 == 0) goto L_0x077d
            r28 = 1
        L_0x077d:
            r1 = r14 & 512(0x200, float:7.175E-43)
            r27 = 0
            if (r1 == 0) goto L_0x0785
            r27 = 1
        L_0x0785:
            r1 = r14 & 1024(0x400, float:1.435E-42)
            r26 = 0
            if (r1 == 0) goto L_0x078d
            r26 = 1
        L_0x078d:
            r1 = r14 & 2048(0x800, float:2.87E-42)
            r17 = 0
            if (r1 == 0) goto L_0x0795
            r17 = 1
        L_0x0795:
            long[] r3 = r4.A08
            r24 = 0
            if (r3 == 0) goto L_0x07a8
            int r1 = r3.length
            if (r1 != r2) goto L_0x07a8
            r2 = r3[r5]
            int r1 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r1 != 0) goto L_0x07a8
            long[] r1 = r4.A09
            r24 = r1[r5]
        L_0x07a8:
            int[] r1 = r6.A0A
            r23 = r1
            long[] r1 = r6.A0C
            r22 = r1
            boolean[] r1 = r6.A0F
            r21 = r1
            int r2 = r4.A03
            r1 = 2
            if (r2 != r1) goto L_0x07bf
            r1 = r40 & 1
            r20 = 1
            if (r1 != 0) goto L_0x07c1
        L_0x07bf:
            r20 = 0
        L_0x07c1:
            int r19 = r7 + r19
            long r1 = r4.A06
            r47 = r1
            if (r31 <= 0) goto L_0x082a
            long r3 = r6.A04
        L_0x07cb:
            r1 = r19
            if (r7 >= r1) goto L_0x082d
            if (r28 == 0) goto L_0x0825
            int r15 = r51.A04()
        L_0x07d5:
            if (r27 == 0) goto L_0x0820
            int r14 = r51.A04()
        L_0x07db:
            if (r7 != 0) goto L_0x0816
            if (r18 == 0) goto L_0x0816
            r18 = 1
            r16 = r29
        L_0x07e3:
            if (r17 == 0) goto L_0x0812
            int r1 = r51.A01()
            r17 = 1
        L_0x07eb:
            long r1 = (long) r1
            long r1 = r1 + r3
            long r1 = r1 - r24
            r43 = 1000000(0xf4240, double:4.940656E-318)
            r41 = r1
            r45 = r47
            long r1 = com.google.android.exoplayer2.util.Util.A09(r41, r43, r45)
            r22[r7] = r1
            int r1 = r16 >> 16
            r1 = r1 & 1
            if (r1 != 0) goto L_0x0810
            if (r20 == 0) goto L_0x0806
            if (r7 != 0) goto L_0x0810
        L_0x0806:
            r1 = 1
        L_0x0807:
            r21[r7] = r1
            r23[r7] = r14
            long r1 = (long) r15
            long r3 = r3 + r1
            int r7 = r7 + 1
            goto L_0x07cb
        L_0x0810:
            r1 = 0
            goto L_0x0807
        L_0x0812:
            r17 = 0
            r1 = 0
            goto L_0x07eb
        L_0x0816:
            if (r26 == 0) goto L_0x081d
            int r16 = r51.A01()
            goto L_0x07e3
        L_0x081d:
            r16 = r49
            goto L_0x07e3
        L_0x0820:
            r1 = r50
            int r14 = r1.A03
            goto L_0x07db
        L_0x0825:
            r1 = r50
            int r15 = r1.A00
            goto L_0x07d5
        L_0x082a:
            r3 = r32
            goto L_0x07cb
        L_0x082d:
            r6.A04 = r3
            r7 = r1
            r31 = r30
        L_0x0832:
            int r13 = r13 + 1
            goto L_0x071b
        L_0x0836:
            X.4YI r3 = r8.A05
            X.4YB r1 = r6.A05
            int r2 = r1.A02
            X.4YD[] r1 = r3.A0A
            r3 = r1[r2]
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            X.4YA r1 = r9.A01(r1)
            if (r1 == 0) goto L_0x0895
            X.4XV r15 = r1.A00
            int r14 = r3.A00
            r2 = 8
            r15.A0G(r2)
            int r1 = r15.A01()
            r1 = r1 & r36
            r4 = 1
            r1 = r1 & 1
            if (r1 != r4) goto L_0x0860
            r15.A0H(r2)
        L_0x0860:
            int r13 = r15.A02()
            int r8 = r15.A04()
            int r2 = r6.A00
            if (r8 != r2) goto L_0x0ace
            if (r13 != 0) goto L_0x0882
            boolean[] r7 = r6.A0E
            r4 = 0
            r13 = 0
        L_0x0872:
            if (r4 >= r8) goto L_0x088b
            int r2 = r15.A02()
            int r13 = r13 + r2
            r1 = 0
            if (r2 <= r14) goto L_0x087d
            r1 = 1
        L_0x087d:
            r7[r4] = r1
            int r4 = r4 + 1
            goto L_0x0872
        L_0x0882:
            if (r13 > r14) goto L_0x0885
            r4 = 0
        L_0x0885:
            int r13 = r13 * r8
            boolean[] r1 = r6.A0E
            java.util.Arrays.fill(r1, r5, r8, r4)
        L_0x088b:
            X.4XV r1 = r6.A0G
            r1.A0E(r13)
            r1 = 1
            r6.A07 = r1
            r6.A09 = r1
        L_0x0895:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            X.4YA r1 = r9.A01(r1)
            if (r1 == 0) goto L_0x08c8
            X.4XV r7 = r1.A00
            r8 = 8
            r7.A0G(r8)
            int r4 = r7.A01()
            r1 = r4 & r36
            r2 = 1
            r1 = r1 & 1
            if (r1 != r2) goto L_0x08b3
            r7.A0H(r8)
        L_0x08b3:
            int r1 = r7.A04()
            if (r1 != r2) goto L_0x0af4
            int r1 = r4 >> 24
            r4 = r1 & 255(0xff, float:3.57E-43)
            long r1 = r6.A02
            if (r4 != 0) goto L_0x093e
            long r7 = r7.A07()
        L_0x08c5:
            long r1 = r1 + r7
            r6.A02 = r1
        L_0x08c8:
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            X.4YA r1 = r9.A01(r1)
            if (r1 == 0) goto L_0x08d6
            X.4XV r1 = r1.A00
            A01(r6, r1, r5)
        L_0x08d6:
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            X.4YA r2 = r9.A01(r1)
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            X.4YA r1 = r9.A01(r1)
            if (r2 == 0) goto L_0x098b
            if (r1 == 0) goto L_0x098b
            X.4XV r9 = r2.A00
            X.4XV r7 = r1.A00
            if (r3 == 0) goto L_0x093c
            java.lang.String r14 = r3.A02
        L_0x08f0:
            r2 = 8
            r9.A0G(r2)
            int r3 = r9.A01()
            int r1 = r9.A01()
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r1 != r8) goto L_0x098b
            int r1 = r3 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 4
            r4 = 1
            if (r1 != r4) goto L_0x090d
            r9.A0H(r3)
        L_0x090d:
            int r1 = r9.A01()
            if (r1 != r4) goto L_0x0adc
            r7.A0G(r2)
            int r2 = r7.A01()
            int r1 = r7.A01()
            if (r1 != r8) goto L_0x098b
            int r1 = r2 >> 24
            r2 = r1 & 255(0xff, float:3.57E-43)
            if (r2 != r4) goto L_0x0943
            long r8 = r7.A07()
            r2 = 0
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0949
            r0 = 611(0x263, float:8.56E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x093c:
            r14 = 0
            goto L_0x08f0
        L_0x093e:
            long r7 = r7.A08()
            goto L_0x08c5
        L_0x0943:
            r1 = 2
            if (r2 < r1) goto L_0x0949
            r7.A0H(r3)
        L_0x0949:
            long r8 = r7.A07()
            r2 = 1
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0ae8
            r7.A0H(r4)
            int r2 = r7.A02()
            r1 = r2 & 240(0xf0, float:3.36E-43)
            int r18 = r1 >> 4
            r19 = r2 & 15
            int r1 = r7.A02()
            if (r1 != r4) goto L_0x098b
            int r17 = r7.A02()
            r1 = 16
            byte[] r3 = new byte[r1]
            r7.A0J(r3, r5, r1)
            r1 = 0
            if (r17 != 0) goto L_0x097d
            int r2 = r7.A02()
            byte[] r1 = new byte[r2]
            r7.A0J(r1, r5, r2)
        L_0x097d:
            r6.A07 = r4
            X.4YD r13 = new X.4YD
            r20 = r4
            r15 = r3
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r6.A06 = r13
        L_0x098b:
            int r8 = r52.size()
            r7 = 0
        L_0x0990:
            if (r7 >= r8) goto L_0x09de
            r1 = r52
            java.lang.Object r3 = r1.get(r7)
            X.4YA r3 = (X.AnonymousClass4YA) r3
            int r2 = r3.A00
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r1) goto L_0x09ba
            X.4XV r4 = r3.A00
            r1 = 8
            r4.A0G(r1)
            r3 = 16
            r1 = r54
            r4.A0J(r1, r5, r3)
            byte[] r2 = A0Y
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x09ba
            A01(r6, r4, r3)
        L_0x09ba:
            int r7 = r7 + 1
            goto L_0x0990
        L_0x09bd:
            long r32 = r2.A07()
            goto L_0x06da
        L_0x09c3:
            int r2 = r2.A01
            goto L_0x06a6
        L_0x09c7:
            int r5 = r2.A03
            goto L_0x069e
        L_0x09cb:
            int r7 = r2.A00
            goto L_0x0696
        L_0x09cf:
            int r13 = r2.A02
            goto L_0x068e
        L_0x09d3:
            r1 = r55
            java.lang.Object r8 = r1.get(r2)
            goto L_0x0670
        L_0x09db:
            r5 = 0
            goto L_0x0645
        L_0x09de:
            int r37 = r37 + 1
            goto L_0x0627
        L_0x09e2:
            java.util.List r1 = r12.A02
            com.google.android.exoplayer2.drm.DrmInitData r7 = A00(r1)
            r9 = 0
            if (r7 == 0) goto L_0x0a27
            int r6 = r55.size()
            r5 = 0
        L_0x09f0:
            if (r5 >= r6) goto L_0x0a27
            r1 = r55
            java.lang.Object r4 = r1.valueAt(r5)
            X.4YL r4 = (X.AnonymousClass4YL) r4
            X.4YI r3 = r4.A05
            X.4YM r1 = r4.A07
            X.4YB r1 = r1.A05
            int r2 = r1.A02
            X.4YD[] r1 = r3.A0A
            r1 = r1[r2]
            if (r1 == 0) goto L_0x0a25
            java.lang.String r1 = r1.A02
        L_0x0a0a:
            X.4Xd r4 = r4.A06
            X.3wB r3 = r3.A07
            com.google.android.exoplayer2.drm.DrmInitData r1 = r7.A00(r1)
            X.3w8 r2 = new X.3w8
            r2.<init>(r3)
            r2.A00(r1)
            X.3wB r1 = new X.3wB
            r1.<init>(r2)
            r4.AWP(r1)
            int r5 = r5 + 1
            goto L_0x09f0
        L_0x0a25:
            r1 = 0
            goto L_0x0a0a
        L_0x0a27:
            long r4 = r0.A0A
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0407
            int r12 = r55.size()
        L_0x0a36:
            if (r9 >= r12) goto L_0x0a5e
            r1 = r55
            java.lang.Object r13 = r1.valueAt(r9)
            X.4YL r13 = (X.AnonymousClass4YL) r13
            int r8 = r13.A01
        L_0x0a42:
            X.4YM r14 = r13.A07
            int r1 = r14.A00
            if (r8 >= r1) goto L_0x0a5b
            long[] r1 = r14.A0C
            r6 = r1[r8]
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0a5b
            boolean[] r1 = r14.A0F
            boolean r1 = r1[r8]
            if (r1 == 0) goto L_0x0a58
            r13.A03 = r8
        L_0x0a58:
            int r8 = r8 + 1
            goto L_0x0a42
        L_0x0a5b:
            int r9 = r9 + 1
            goto L_0x0a36
        L_0x0a5e:
            r0.A0A = r2
            goto L_0x0407
        L_0x0a62:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0407
            java.lang.Object r1 = r4.peek()
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            java.util.List r1 = r1.A01
            r1.add(r12)
            goto L_0x0407
        L_0x0a75:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r1
            goto L_0x0000
        L_0x0a7c:
            if (r10 != 0) goto L_0x0b10
            long r4 = r0.A09
            r2 = r1
            X.4Y6 r2 = (X.AnonymousClass4Y6) r2
            long r2 = r2.A02
            long r4 = r4 - r2
            int r2 = (int) r4
            if (r2 < 0) goto L_0x0b04
            r1.Evk(r2)
        L_0x0a8c:
            r0.A02 = r7
            r0.A00 = r7
            goto L_0x0000
        L_0x0a92:
            r0 = 541(0x21d, float:7.58E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0a9e:
            r0 = 599(0x257, float:8.4E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0aaa:
            r0 = 524(0x20c, float:7.34E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0ab6:
            r0 = 523(0x20b, float:7.33E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0ac2:
            r0 = 566(0x236, float:7.93E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0ace:
            java.lang.String r1 = "Length mismatch: "
            java.lang.String r0 = ", "
            java.lang.String r1 = X.002.A02(r8, r2, r1, r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0adc:
            r0 = 481(0x1e1, float:6.74E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0ae8:
            r0 = 482(0x1e2, float:6.75E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0af4:
            r0 = 598(0x256, float:8.38E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r1 = X.002.A0O(r0, r1)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0b04:
            r0 = 542(0x21e, float:7.6E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0b10:
            X.4YM r2 = r10.A07
            long[] r3 = r2.A0D
            int r2 = r10.A02
            r4 = r3[r2]
            r2 = r1
            X.4Y6 r2 = (X.AnonymousClass4Y6) r2
            long r2 = r2.A02
            long r4 = r4 - r2
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0b2d
            java.lang.String r3 = "FragmentedMp4Extractor"
            r2 = 510(0x1fe, float:7.15E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            X.2AG.A04(r3, r2)
            r2 = 0
        L_0x0b2d:
            r1.Evk(r2)
            r0.A0E = r10
        L_0x0b32:
            X.4YM r2 = r10.A07
            int[] r2 = r2.A0A
            int r4 = r10.A01
            r3 = r2[r4]
            r0.A06 = r3
            int r2 = r10.A03
            if (r4 >= r2) goto L_0x0b93
            r1.Evk(r3)
            X.4YL r2 = r0.A0E
            X.4YD r1 = X.AnonymousClass4YL.A00(r2)
            if (r1 == 0) goto L_0x0b6b
            X.4YM r4 = r2.A07
            X.4XV r3 = r4.A0G
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0b56
            r3.A0H(r1)
        L_0x0b56:
            int r2 = r2.A01
            boolean r1 = r4.A07
            if (r1 == 0) goto L_0x0b6b
            boolean[] r1 = r4.A0E
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x0b6b
            int r1 = r3.A05()
            int r1 = r1 * 6
            r3.A0H(r1)
        L_0x0b6b:
            X.4YL r4 = r0.A0E
            int r1 = r4.A01
            int r1 = r1 + 1
            r4.A01 = r1
            int r1 = r4.A00
            int r3 = r1 + 1
            r4.A00 = r3
            X.4YM r1 = r4.A07
            int[] r1 = r1.A0B
            int r2 = r4.A02
            r1 = r1[r2]
            if (r3 != r1) goto L_0x0b8d
            int r1 = r2 + 1
            r4.A02 = r1
            r4.A00 = r7
            r1 = r24
            r0.A0E = r1
        L_0x0b8d:
            r1 = r23
            r0.A02 = r1
            r0 = 0
            return r0
        L_0x0b93:
            X.4YI r2 = r10.A05
            int r2 = r2.A02
            if (r2 != r6) goto L_0x0ba1
            r2 = 8
            int r3 = r3 - r2
            r0.A06 = r3
            r1.Evk(r2)
        L_0x0ba1:
            X.4YL r5 = r0.A0E
            X.4YD r2 = X.AnonymousClass4YL.A00(r5)
            if (r2 != 0) goto L_0x0d45
            r3 = 0
        L_0x0baa:
            r0.A04 = r3
            int r2 = r0.A06
            int r2 = r2 + r3
            r0.A06 = r2
            r0.A02 = r9
            r0.A05 = r7
        L_0x0bb5:
            X.4YL r3 = r0.A0E
            X.4YM r2 = r3.A07
            r33 = r2
            X.4YI r2 = r3.A05
            r32 = r2
            X.4Xd r12 = r3.A06
            int r2 = r3.A01
            r22 = r2
            r2 = r33
            long[] r2 = r2.A0C
            r30 = r2[r22]
            r2 = r32
            int r2 = r2.A01
            if (r2 == 0) goto L_0x0d9a
            X.4XV r13 = r0.A0P
            byte[] r11 = r13.A02
            r11[r7] = r7
            r11[r6] = r7
            r11[r8] = r7
            int r21 = r2 + 1
            int r20 = 4 - r2
        L_0x0bdf:
            int r2 = r0.A04
            int r3 = r0.A06
            if (r2 >= r3) goto L_0x0dab
            int r3 = r0.A05
            if (r3 != 0) goto L_0x0c43
            r3 = r20
            r2 = r21
            r1.readFully(r11, r3, r2)
            r13.A0G(r7)
            int r2 = r13.A01()
            if (r2 < r6) goto L_0x0e2c
            int r2 = r2 + -1
            r0.A05 = r2
            X.4XV r2 = r0.A0Q
            r2.A0G(r7)
            r12.EJh(r2, r9)
            r12.EJh(r13, r6)
            X.4Xd[] r2 = r0.A0I
            int r2 = r2.length
            if (r2 <= 0) goto L_0x0c41
            r2 = r32
            X.3wB r2 = r2.A07
            java.lang.String r4 = r2.A0W
            byte r5 = r11[r9]
            java.lang.String r2 = "video/avc"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0c22
            r3 = r5 & 31
            r2 = 6
            if (r3 == r2) goto L_0x0c31
        L_0x0c22:
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0c41
            r3 = r5 & 126(0x7e, float:1.77E-43)
            int r3 = r3 >> r6
            r2 = 39
            if (r3 != r2) goto L_0x0c41
        L_0x0c31:
            r2 = 1
        L_0x0c32:
            r0.A0H = r2
            int r2 = r0.A04
            int r2 = r2 + 5
            r0.A04 = r2
            int r2 = r0.A06
            int r2 = r2 + r20
            r0.A06 = r2
            goto L_0x0bdf
        L_0x0c41:
            r2 = 0
            goto L_0x0c32
        L_0x0c43:
            boolean r2 = r0.A0H
            if (r2 == 0) goto L_0x0d35
            X.4XV r10 = r0.A0O
            r10.A0E(r3)
            byte[] r2 = r10.A02
            r1.readFully(r2, r7, r3)
            int r2 = r0.A05
            r12.EJh(r10, r2)
            int r4 = r0.A05
            byte[] r3 = r10.A02
            int r2 = r10.A00
            int r3 = X.AnonymousClass4XW.A00(r3, r2)
            r2 = r32
            X.3wB r2 = r2.A07
            java.lang.String r5 = r2.A0W
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r5)
            r10.A0G(r2)
            r10.A0F(r3)
            X.4Xd[] r2 = r0.A0I
            r19 = r2
        L_0x0c76:
            int r8 = r10.A00
            int r2 = r10.A01
            int r2 = r8 - r2
            r18 = 1
            if (r2 <= r6) goto L_0x0d39
            r5 = 0
        L_0x0c81:
            int r2 = r10.A01
            int r2 = r8 - r2
            if (r2 != 0) goto L_0x0d2a
            r5 = -1
        L_0x0c88:
            r3 = 0
        L_0x0c89:
            int r2 = r10.A01
            int r2 = r8 - r2
            if (r2 != 0) goto L_0x0d1f
            r3 = -1
        L_0x0c90:
            int r2 = r10.A01
            int r17 = r2 + r3
            r14 = -1
            if (r3 == r14) goto L_0x0d09
            int r8 = r8 - r2
            if (r3 > r8) goto L_0x0d09
            if (r5 != r9) goto L_0x0d18
            r2 = 8
            if (r3 < r2) goto L_0x0d18
            int r2 = r10.A02()
            int r8 = r10.A05()
            r5 = 49
            if (r8 != r5) goto L_0x0d07
            int r14 = r10.A01()
        L_0x0cb0:
            int r16 = r10.A02()
            r3 = 47
            if (r8 != r3) goto L_0x0cbb
            r10.A0H(r6)
        L_0x0cbb:
            r15 = 181(0xb5, float:2.54E-43)
            if (r2 != r15) goto L_0x0cca
            if (r8 == r5) goto L_0x0cc3
            if (r8 != r3) goto L_0x0cca
        L_0x0cc3:
            r15 = 1
            r3 = r16
            r2 = r23
            if (r3 == r2) goto L_0x0ccb
        L_0x0cca:
            r15 = 0
        L_0x0ccb:
            if (r8 != r5) goto L_0x0cd6
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r14 == r2) goto L_0x0cd4
            r18 = 0
        L_0x0cd4:
            r15 = r15 & r18
        L_0x0cd6:
            if (r15 == 0) goto L_0x0d18
            int r3 = r10.A02()
            r2 = r3 & 64
            r8 = 0
            if (r2 == 0) goto L_0x0d18
            r2 = r3 & 31
            r10.A0H(r6)
            int r14 = r2 * 3
            int r5 = r10.A01
            r2 = r19
            int r3 = r2.length
        L_0x0ced:
            if (r8 >= r3) goto L_0x0d18
            r2 = r19[r8]
            r10.A0G(r5)
            r2.EJh(r10, r14)
            r25 = r2
            r26 = r24
            r27 = r6
            r28 = r14
            r29 = r7
            r25.EJn(r26, r27, r28, r29, r30)
            int r8 = r8 + 1
            goto L_0x0ced
        L_0x0d07:
            r14 = 0
            goto L_0x0cb0
        L_0x0d09:
            java.lang.String r3 = "CeaUtil"
            r2 = 569(0x239, float:7.97E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            X.2AG.A04(r3, r2)
            int r2 = r10.A00
            r17 = r2
        L_0x0d18:
            r2 = r17
            r10.A0G(r2)
            goto L_0x0c76
        L_0x0d1f:
            int r2 = r10.A02()
            int r3 = r3 + r2
            r14 = 255(0xff, float:3.57E-43)
            if (r2 == r14) goto L_0x0c89
            goto L_0x0c90
        L_0x0d2a:
            int r3 = r10.A02()
            int r5 = r5 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x0c81
            goto L_0x0c88
        L_0x0d35:
            int r4 = r12.EJl(r1, r3, r7, r7)
        L_0x0d39:
            int r2 = r0.A04
            int r2 = r2 + r4
            r0.A04 = r2
            int r2 = r0.A05
            int r2 = r2 - r4
            r0.A05 = r2
            goto L_0x0bdf
        L_0x0d45:
            int r10 = r2.A00
            if (r10 == 0) goto L_0x0d7b
            X.4YM r2 = r5.A07
            X.4XV r13 = r2.A0G
        L_0x0d4d:
            X.4YM r12 = r5.A07
            int r3 = r5.A01
            boolean r2 = r12.A07
            if (r2 == 0) goto L_0x0d5c
            boolean[] r2 = r12.A0E
            boolean r2 = r2[r3]
            r11 = 1
            if (r2 != 0) goto L_0x0d5d
        L_0x0d5c:
            r11 = 0
        L_0x0d5d:
            X.4XV r4 = r5.A09
            byte[] r3 = r4.A02
            r2 = 0
            if (r11 == 0) goto L_0x0d66
            r2 = 128(0x80, float:1.794E-43)
        L_0x0d66:
            r2 = r2 | r10
            byte r2 = (byte) r2
            r3[r7] = r2
            r4.A0G(r7)
            X.4Xd r5 = r5.A06
            r5.EJh(r4, r6)
            r5.EJh(r13, r10)
            if (r11 != 0) goto L_0x0d84
            int r3 = r10 + 1
            goto L_0x0baa
        L_0x0d7b:
            byte[] r2 = r2.A04
            X.4XV r13 = r5.A08
            int r10 = r2.length
            r13.A0I(r2, r10)
            goto L_0x0d4d
        L_0x0d84:
            X.4XV r4 = r12.A0G
            int r3 = r4.A05()
            r2 = -2
            r4.A0H(r2)
            int r2 = r3 * 6
            int r2 = r2 + 2
            r5.EJh(r4, r2)
            int r3 = r10 + 1
            int r3 = r3 + r2
            goto L_0x0baa
        L_0x0d9a:
            int r2 = r0.A04
            int r3 = r0.A06
            if (r2 >= r3) goto L_0x0dab
            int r3 = r3 - r2
            int r3 = r12.EJl(r1, r3, r7, r7)
            int r2 = r0.A04
            int r2 = r2 + r3
            r0.A04 = r2
            goto L_0x0d9a
        L_0x0dab:
            r1 = r33
            boolean[] r1 = r1.A0F
            boolean r10 = r1[r22]
            X.4YL r5 = r0.A0E
            X.4YD r2 = X.AnonymousClass4YL.A00(r5)
            if (r2 == 0) goto L_0x0e06
            r1 = 1073741824(0x40000000, float:2.0)
            r10 = r10 | r1
            X.4Xh r4 = r2.A01
        L_0x0dbe:
            if (r5 == 0) goto L_0x0dce
            X.4YI r1 = r5.A05
            if (r1 == 0) goto L_0x0dce
            X.3wB r1 = r1.A07
            java.lang.String r2 = r1.A0W
            java.lang.String r1 = "application/x-mp4-vtt"
            if (r2 != r1) goto L_0x0dce
            r10 = r10 | 1
        L_0x0dce:
            r8 = r12
            r9 = r4
            r11 = r3
            r12 = r7
            r13 = r30
            r8.EJn(r9, r10, r11, r12, r13)
        L_0x0dd7:
            java.util.ArrayDeque r2 = r0.A0T
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0e08
            java.lang.Object r2 = r2.removeFirst()
            X.Xa2 r2 = (X.C21394Xa2) r2
            int r1 = r0.A03
            int r9 = r2.A00
            int r1 = r1 - r9
            r0.A03 = r1
            long r1 = r2.A01
            long r1 = r1 + r30
            X.4Xd[] r8 = r0.A0J
            int r5 = r8.length
            r4 = 0
        L_0x0df4:
            if (r4 >= r5) goto L_0x0dd7
            r10 = r8[r4]
            int r3 = r0.A03
            r11 = r24
            r12 = r6
            r13 = r9
            r14 = r3
            r15 = r1
            r10.EJn(r11, r12, r13, r14, r15)
            int r4 = r4 + 1
            goto L_0x0df4
        L_0x0e06:
            r4 = 0
            goto L_0x0dbe
        L_0x0e08:
            X.4YL r4 = r0.A0E
            int r1 = r4.A01
            int r1 = r1 + 1
            r4.A01 = r1
            int r1 = r4.A00
            int r3 = r1 + 1
            r4.A00 = r3
            X.4YM r1 = r4.A07
            int[] r1 = r1.A0B
            int r2 = r4.A02
            r1 = r1[r2]
            if (r3 != r1) goto L_0x0b8d
            int r1 = r2 + 1
            r4.A02 = r1
            r4.A00 = r7
            r1 = r24
            r0.A0E = r1
            goto L_0x0b8d
        L_0x0e2c:
            r0 = 514(0x202, float:7.2E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        L_0x0e38:
            r0 = 356(0x164, float:4.99E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            X.47p r0 = new X.47p
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XS.E68(X.4Y7, X.4Sh):int");
    }

    public final void EKu(long j, long j2) {
        SparseArray sparseArray = this.A0C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass4YL) sparseArray.valueAt(i)).A01();
        }
        this.A0T.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0S.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public AnonymousClass4XS(C265994Xd r6, List list, int i, boolean z) {
        this.A0K = i;
        this.A0U = Collections.unmodifiableList(list);
        this.A0L = r6;
        this.A0V = z;
        this.A0M = new AnonymousClass4XU();
        this.A0N = new AnonymousClass4XV(16);
        this.A0Q = new AnonymousClass4XV(AnonymousClass4XW.A01);
        this.A0P = new AnonymousClass4XV(5);
        this.A0O = new AnonymousClass4XV();
        byte[] bArr = new byte[16];
        this.A0W = bArr;
        this.A0R = new AnonymousClass4XV(bArr);
        this.A0S = new ArrayDeque();
        this.A0T = new ArrayDeque();
        this.A0C = new SparseArray();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A02 = 0;
        this.A00 = 0;
    }

    public static DrmInitData A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AnonymousClass4YA r2 = (AnonymousClass4YA) list.get(i);
            if (r2.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = r2.A00.A02;
                C10594Ruo A002 = C11303SKn.A00(bArr);
                if (A002 == null) {
                    2AG.A04("FragmentedMp4Extractor", Pxd.A00(565));
                } else {
                    arrayList.add(new DrmInitData.SchemeData((String) null, "video/mp4", A002.A01, bArr));
                }
            }
        }
        if (arrayList != null) {
            return new DrmInitData((String) null, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
        }
        return null;
    }

    public final void CMc(C265004Sd r1) {
        this.A0D = r1;
    }

    public AnonymousClass4XS() {
        this((C265994Xd) null, Collections.emptyList(), 0, false);
    }
}
