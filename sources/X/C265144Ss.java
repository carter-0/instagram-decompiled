package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.4Ss  reason: invalid class name and case insensitive filesystem */
public final class C265144Ss extends C265154St {
    public static final C265144Ss $redex_init_class = null;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    @Deprecated
    public long A04;
    public long A05;
    public long A06;
    public Uri A07;
    public Handler A08;
    public 27s A09;
    public AnonymousClass4RO A0A;
    public C265174Sv A0B;
    public C256633w6 A0C;
    public C257113ws A0D;
    public AnonymousClass4XY A0E;
    public IOException A0F;
    public boolean A0G;
    public boolean A0H;
    public long A0I = 0;
    public long A0J = 0;
    public Uri A0K;
    public C250823m7 A0L;
    public final AnonymousClass4SV A0M;
    public final C264544Qh A0N;
    public final AnonymousClass4RL A0O;
    public final C265174Sv A0P;
    public final Y3O A0Q;
    public final C265084Sm A0R;
    public final Object A0S;
    public final Runnable A0T;
    public final Runnable A0U;
    public final boolean A0V;
    public final SparseArray A0W;
    public final C257163wx A0X;
    public final AnonymousClass4SY A0Y;
    public final C265114Sp A0Z;
    public final C265104So A0a;
    public final C265194Sx A0b;
    public final C264984Sb A0c;
    public final XZD A0d;
    public final C265214Sz A0e;
    public final AnonymousClass4SX A0f;
    public final AnonymousClass4T1 A0g;
    public final C256363ve A0h;
    public final boolean A0i;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        if (A08(r23) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        if (r0 != -9223372036854775807L) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        if (r0 != -9223372036854775807L) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a2, code lost:
        if (r6 != -9223372036854775807L) goto L_0x01a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C265144Ss r43, boolean r44) {
        /*
            r11 = 0
            r4 = 0
        L_0x0002:
            r8 = r43
            android.util.SparseArray r1 = r8.A0W
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0023
            int r3 = r1.keyAt(r4)
            int r2 = r8.A00
            if (r3 < r2) goto L_0x0020
            java.lang.Object r1 = r1.valueAt(r4)
            X.4TG r1 = (X.AnonymousClass4TG) r1
            X.3w6 r0 = r8.A0C
            int r3 = r3 - r2
            r1.A01(r0, r3)
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0002
        L_0x0023:
            X.3w6 r0 = r8.A0C
            X.3wM r10 = r0.A02(r11)
            X.3w6 r0 = r8.A0C
            java.util.List r0 = r0.A0Q
            int r1 = r0.size()
            r13 = 1
            int r1 = r1 - r13
            X.3w6 r0 = r8.A0C
            X.3wM r23 = r0.A02(r1)
            X.3w6 r0 = r8.A0C
            long r4 = r0.A00(r1)
            long r0 = r8.A02
            long r0 = com.google.android.exoplayer2.util.Util.A06(r0)
            long r2 = com.google.android.exoplayer2.util.Util.A07(r0)
            X.3w6 r0 = r8.A0C
            long r6 = r0.A00(r11)
            long r0 = r10.A00
            long r16 = com.google.android.exoplayer2.util.Util.A07(r0)
            boolean r22 = A07(r10)
            r14 = r16
            r9 = 0
        L_0x005c:
            java.util.List r1 = r10.A03
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x00ad
            java.lang.Object r1 = r1.get(r9)
            X.3wK r1 = (X.C256773wK) r1
            java.util.List r12 = r1.A07
            int r0 = r1.A01
            r18 = 1
            if (r0 == r13) goto L_0x00a8
            int r1 = r1.A01
            r0 = 2
            if (r1 == r0) goto L_0x00a8
        L_0x0077:
            if (r22 == 0) goto L_0x007b
            if (r18 != 0) goto L_0x00a5
        L_0x007b:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00a5
            java.lang.Object r0 = r12.get(r11)
            X.3wG r0 = (X.C256733wG) r0
            X.4XE r12 = r0.A00()
            if (r12 == 0) goto L_0x00ab
            long r20 = r12.AeC(r6, r2)
            r18 = 0
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00ab
            long r0 = r12.B61(r6, r2)
            long r0 = r12.C7P(r0)
            long r0 = r0 + r16
            long r14 = java.lang.Math.max(r14, r0)
        L_0x00a5:
            int r9 = r9 + 1
            goto L_0x005c
        L_0x00a8:
            r18 = 0
            goto L_0x0077
        L_0x00ab:
            r14 = r16
        L_0x00ad:
            r0 = r23
            long r0 = r0.A00
            long r40 = com.google.android.exoplayer2.util.Util.A07(r0)
            boolean r22 = A07(r23)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x00bf:
            r0 = r23
            java.util.List r1 = r0.A03
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x0326
            java.lang.Object r1 = r1.get(r9)
            X.3wK r1 = (X.C256773wK) r1
            java.util.List r10 = r1.A07
            int r0 = r1.A01
            r12 = 1
            if (r0 == r13) goto L_0x0323
            int r1 = r1.A01
            r0 = 2
            if (r1 == r0) goto L_0x0323
        L_0x00db:
            if (r22 == 0) goto L_0x00df
            if (r12 != 0) goto L_0x031f
        L_0x00df:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x031f
            java.lang.Object r0 = r10.get(r11)
            X.3wG r0 = (X.C256733wG) r0
            X.4XE r10 = r0.A00()
            if (r10 != 0) goto L_0x02fb
            long r40 = r40 + r4
        L_0x00f3:
            X.3w6 r0 = r8.A0C
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0101
            boolean r0 = A08(r23)
            r26 = 1
            if (r0 == 0) goto L_0x0103
        L_0x0101:
            r26 = 0
        L_0x0103:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r26 == 0) goto L_0x011c
            X.3w6 r0 = r8.A0C
            long r0 = r0.A0E
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x011c
            long r4 = com.google.android.exoplayer2.util.Util.A07(r0)
            long r0 = r40 - r4
            long r14 = java.lang.Math.max(r14, r0)
        L_0x011c:
            long r40 = r40 - r14
            X.3w6 r9 = r8.A0C
            boolean r0 = r9.A0R
            r25 = r0
            if (r0 == 0) goto L_0x02f2
            long r0 = r9.A04
            r23 = r0
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            r11 = 1
        L_0x012f:
            X.C256703wD.A04(r11)
            long r0 = com.google.android.exoplayer2.util.Util.A07(r23)
            long r2 = r2 - r0
            long r2 = r2 - r14
            long r6 = com.google.android.exoplayer2.util.Util.A08(r2)
            X.4RL r0 = r8.A0O
            X.4RO r0 = r0.A02
            r18 = r0
            long r0 = r0.A02
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x0152
            X.5Mb r0 = r9.A0H
            if (r0 == 0) goto L_0x02ef
            long r0 = r0.A02
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x02ef
        L_0x0152:
            long r10 = java.lang.Math.min(r6, r0)
        L_0x0156:
            long r0 = r2 - r40
            long r4 = com.google.android.exoplayer2.util.Util.A08(r0)
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0168
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0168
            r4 = 0
        L_0x0168:
            long r0 = r9.A09
            int r12 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r12 == 0) goto L_0x0173
            long r4 = r4 + r0
            long r4 = java.lang.Math.min(r4, r6)
        L_0x0173:
            r0 = r18
            long r0 = r0.A03
            int r12 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r12 != 0) goto L_0x0185
            X.5Mb r0 = r9.A0H
            if (r0 == 0) goto L_0x018d
            long r0 = r0.A03
            int r12 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r12 == 0) goto L_0x018d
        L_0x0185:
            long r0 = java.lang.Math.min(r0, r6)
            long r4 = java.lang.Math.max(r4, r0)
        L_0x018d:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0192
            r10 = r4
        L_0x0192:
            X.4RO r0 = r8.A0A
            long r6 = r0.A04
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            X.5Mb r0 = r9.A0H
            if (r0 == 0) goto L_0x02e5
            long r6 = r0.A04
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x02e5
        L_0x01a4:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a9
            r6 = r4
        L_0x01a9:
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c6
            r6 = 5000000(0x4c4b40, double:2.470328E-317)
            r0 = 2
            long r0 = r40 / r0
            long r6 = java.lang.Math.min(r6, r0)
            long r0 = r2 - r6
            long r0 = com.google.android.exoplayer2.util.Util.A08(r0)
            long r0 = java.lang.Math.min(r0, r10)
            long r6 = java.lang.Math.max(r4, r0)
        L_0x01c6:
            r0 = r18
            float r13 = r0.A01
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01d7
            X.5Mb r0 = r9.A0H
            if (r0 == 0) goto L_0x02e0
            float r13 = r0.A01
        L_0x01d7:
            r0 = r18
            float r12 = r0.A00
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01e5
            X.5Mb r0 = r9.A0H
            if (r0 == 0) goto L_0x02db
            float r12 = r0.A00
        L_0x01e5:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01fb
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01fb
            X.5Mb r0 = r9.A0H
            if (r0 == 0) goto L_0x01f7
            long r0 = r0.A04
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01fb
        L_0x01f7:
            r13 = 1065353216(0x3f800000, float:1.0)
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x01fb:
            X.4RO r18 = new X.4RO
            r27 = r18
            r28 = r12
            r29 = r13
            r30 = r10
            r32 = r4
            r34 = r6
            r27.<init>(r28, r29, r30, r32, r34)
            r0 = r18
            r8.A0A = r0
            long r0 = com.google.android.exoplayer2.util.Util.A08(r14)
            long r23 = r23 + r0
            r0 = r18
            long r0 = r0.A04
            long r0 = com.google.android.exoplayer2.util.Util.A07(r0)
            long r2 = r2 - r0
            r4 = 5000000(0x4c4b40, double:2.470328E-317)
            r0 = 2
            long r0 = r40 / r0
            long r42 = java.lang.Math.min(r4, r0)
            int r0 = (r2 > r42 ? 1 : (r2 == r42 ? 0 : -1))
            if (r0 < 0) goto L_0x0230
            r42 = r2
        L_0x0230:
            long r14 = r14 - r16
            long r2 = r9.A04
            long r0 = r8.A02
            int r7 = r8.A00
            X.4RL r6 = r8.A0O
            if (r25 == 0) goto L_0x02d8
            X.4RO r5 = r8.A0A
        L_0x023e:
            X.4S9 r4 = new X.4S9
            r27 = r4
            r28 = r5
            r29 = r6
            r30 = r9
            r31 = r7
            r32 = r2
            r34 = r23
            r36 = r0
            r38 = r14
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r38, r40, r42)
            r8.A0C(r4)
            boolean r0 = r8.A0i
            if (r0 != 0) goto L_0x033e
            android.os.Handler r0 = r8.A08
            java.lang.Runnable r7 = r8.A0U
            r0.removeCallbacks(r7)
            if (r26 == 0) goto L_0x0335
            android.os.Handler r6 = r8.A08
            X.3w6 r2 = r8.A0C
            long r0 = r8.A02
            long r9 = com.google.android.exoplayer2.util.Util.A06(r0)
            java.util.List r0 = r2.A0Q
            int r0 = r0.size()
            int r3 = r0 + -1
            X.3wM r12 = r2.A02(r3)
            long r0 = r12.A00
            long r23 = com.google.android.exoplayer2.util.Util.A07(r0)
            long r4 = r2.A00(r3)
            long r0 = com.google.android.exoplayer2.util.Util.A07(r9)
            long r2 = r2.A04
            long r21 = com.google.android.exoplayer2.util.Util.A07(r2)
            r2 = 5000000(0x4c4b40, double:2.470328E-317)
            r14 = 0
            r13 = 0
        L_0x0294:
            java.util.List r10 = r12.A03
            int r9 = r10.size()
            if (r13 >= r9) goto L_0x032a
            java.lang.Object r9 = r10.get(r13)
            X.3wK r9 = (X.C256773wK) r9
            java.util.List r9 = r9.A07
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x02d5
            java.lang.Object r9 = r9.get(r14)
            X.3wG r9 = (X.C256733wG) r9
            X.4XE r9 = r9.A00()
            if (r9 == 0) goto L_0x02d5
            long r17 = r21 + r23
            long r9 = r9.BWL(r4, r0)
            long r17 = r17 + r9
            long r17 = r17 - r0
            r15 = 100000(0x186a0, double:4.94066E-319)
            long r10 = r2 - r15
            int r9 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r9 < 0) goto L_0x02d3
            int r9 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x02d5
            long r10 = r2 + r15
            int r9 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x02d5
        L_0x02d3:
            r2 = r17
        L_0x02d5:
            int r13 = r13 + 1
            goto L_0x0294
        L_0x02d8:
            r5 = 0
            goto L_0x023e
        L_0x02db:
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01e5
        L_0x02e0:
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01d7
        L_0x02e5:
            long r6 = r9.A0D
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            r6 = 30000(0x7530, double:1.4822E-319)
            goto L_0x01a4
        L_0x02ef:
            r10 = r6
            goto L_0x0156
        L_0x02f2:
            r42 = 0
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0230
        L_0x02fb:
            long r20 = r10.AeC(r4, r2)
            r18 = 0
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            long r0 = r10.B61(r4, r2)
            long r0 = r0 + r20
            r18 = 1
            long r0 = r0 - r18
            long r18 = r10.C7P(r0)
            long r18 = r18 + r40
            long r0 = r10.AzV(r0, r4)
            long r0 = r0 + r18
            long r6 = java.lang.Math.min(r6, r0)
        L_0x031f:
            int r9 = r9 + 1
            goto L_0x00bf
        L_0x0323:
            r12 = 0
            goto L_0x00db
        L_0x0326:
            r40 = r6
            goto L_0x00f3
        L_0x032a:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            long r0 = X.C7258Q1h.A03(r4, r2, r0)
            r6.postDelayed(r7, r0)
        L_0x0335:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x033f
            java.lang.String r0 = "process_manifest"
            A04(r8, r0)
        L_0x033e:
            return
        L_0x033f:
            if (r44 == 0) goto L_0x033e
            X.3w6 r1 = r8.A0C
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x033e
            long r1 = r1.A0A
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x033e
            A00(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265144Ss.A06(X.4Ss, boolean):void");
    }

    public static boolean A07(C256793wM r5) {
        int i = 0;
        while (true) {
            List list = r5.A03;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((C256773wK) list.get(i)).A01;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
            i++;
        }
        return true;
    }

    public static boolean A08(C256793wM r4) {
        int i = 0;
        while (true) {
            List list = r4.A03;
            if (i >= list.size()) {
                return false;
            }
            AnonymousClass4XE A002 = ((C256733wG) ((C256773wK) list.get(i)).A07.get(0)).A00();
            if (A002 == null || A002.isExplicit()) {
                return true;
            }
            i++;
        }
        return true;
    }

    public final void A0D() {
        C256633w6 r0;
        this.A0H = false;
        this.A0D = null;
        AnonymousClass4XY r02 = this.A0E;
        if (r02 != null) {
            r02.A03((AnonymousClass4TR) null);
            this.A0E = null;
        }
        this.A06 = 0;
        this.A05 = 0;
        if (this.A0i) {
            r0 = this.A0C;
        } else {
            r0 = null;
        }
        this.A0C = r0;
        this.A07 = this.A0K;
        this.A0F = null;
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.A08 = null;
        }
        this.A02 = -9223372036854775807L;
        this.A01 = 0;
        this.A03 = -9223372036854775807L;
        this.A00 = 0;
        this.A0W.clear();
        C265194Sx r1 = this.A0b;
        r1.A01.clear();
        r1.A00.clear();
        r1.A02.clear();
        this.A0Z.release();
    }

    static {
        27e.A00("goog.exo.dash");
    }

    public static void A00(C265144Ss r8) {
        long j = r8.A0C.A0A;
        if (j == 0) {
            j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        }
        long max = Math.max(0, (r8.A06 + j) - SystemClock.elapsedRealtime());
        Y3O y3o = r8.A0Q;
        y3o.A00 = AnonymousClass000.A00(1778);
        r8.A08.postDelayed(y3o, max);
    }

    public static void A01(C265144Ss r2, long j) {
        r2.A02 = j;
        if (r2.A0N.A0U) {
            A06(r2, true);
        } else {
            A05(r2, true);
        }
    }

    public static void A02(C265144Ss r10, AnonymousClass4TQ r11, Xz7 xz7, int i) {
        AnonymousClass4XY r1 = r10.A0E;
        if (r1.A00 == null) {
            r1.A00 = r10.A09;
        }
        r1.A02(r11, xz7, i);
        boolean z = r10.A0V;
        C265174Sv r2 = r10.A0P;
        AnonymousClass4Y0 r4 = new AnonymousClass4Y0(xz7.A02);
        int i2 = xz7.A00;
        if (z) {
            r2.A02((C256683wB) null, r4, (Object) null, i2, -1, 0, 0, -9223372036854775807L, -9223372036854775807L);
        } else {
            r2.A04((C256683wB) null, r4, (Object) null, i2, -1, 0, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public static void A03(C265144Ss r2, IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        if (r2.A0N.A0U) {
            A06(r2, true);
        } else {
            A05(r2, true);
        }
    }

    public static void A04(C265144Ss r55, String str) {
        long j;
        Uri uri;
        C265144Ss r3 = r55;
        r3.A08.removeCallbacks(r3.A0Q);
        boolean z = false;
        if (r3.A0E.A01 != null) {
            z = true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("already_loading", Boolean.valueOf(z));
        String str2 = str;
        hashMap.put("reason", str2);
        boolean z2 = false;
        if (str2.compareTo(AnonymousClass000.A00(1778)) == 0) {
            z2 = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = r3.A0I;
        long j3 = 0;
        if (j2 == 0) {
            j = 0;
        } else {
            j = elapsedRealtime - j2;
        }
        long j4 = r3.A0J;
        if (j4 != 0) {
            j3 = elapsedRealtime - j4;
        }
        if (z2) {
            r3.A0I = elapsedRealtime;
        } else {
            r3.A0J = elapsedRealtime;
        }
        hashMap.put("since_last_scheduled_ms", Long.valueOf(j));
        hashMap.put("since_last_unscheduled_ms", Long.valueOf(j3));
        AnonymousClass4XY r2 = r3.A0E;
        if (r2.A02 != null) {
            return;
        }
        if (r2.A01 != null) {
            r3.A0H = true;
            return;
        }
        synchronized (r3.A0S) {
            uri = r3.A07;
        }
        r3.A0H = false;
        Map emptyMap = Collections.emptyMap();
        C257253x6 r7 = new C257253x6(C257243x5.A02, new C257223x3(), "", (String) null, (String) null, (String) null, "", r3.A0Y.A00, (String) null, (Map) null, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, false, false, false, false, false);
        C256703wD.A02(uri);
        Xz7 xz7 = new Xz7(r3.A0D, new C257263x7(uri, r7, (String) null, emptyMap, (byte[]) null, 1, 1, 0, 0, -1), r3.A0h, 4);
        C22297Xz6 xz6 = new C22297Xz6(r3.A0d.A00);
        int i = ((C265074Sl) r3.A0R).A00;
        if (i == -1) {
            i = 3;
        }
        A02(r3, xz6, xz7, i);
    }

    @Deprecated
    public static void A05(C265144Ss r35, boolean z) {
        C265144Ss r8;
        boolean z2;
        AnonymousClass4RO r10;
        long currentTimeMillis;
        int i = 0;
        while (true) {
            r8 = r35;
            SparseArray sparseArray = r8.A0W;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            int i2 = r8.A00;
            if (keyAt >= i2) {
                ((AnonymousClass4TG) sparseArray.valueAt(i)).A01(r8.A0C, keyAt - i2);
            }
            i++;
        }
        int size = r8.A0C.A0Q.size() - 1;
        C256793wM A022 = r8.A0C.A02(size);
        long A002 = r8.A0C.A00(size);
        long A062 = Util.A06(r8.A02);
        UUID uuid = AnonymousClass4T7.A04;
        long A072 = Util.A07(A062);
        C256793wM A023 = r8.A0C.A02(0);
        long A003 = r8.A0C.A00(0);
        boolean A073 = A07(A023);
        long j = 0;
        int i3 = 0;
        while (true) {
            List list = A023.A03;
            if (i3 >= list.size()) {
                break;
            }
            C256773wK r9 = (C256773wK) list.get(i3);
            List list2 = r9.A07;
            if ((!A073 || r9.A01 != 3) && !list2.isEmpty()) {
                AnonymousClass4XE A004 = ((C256733wG) list2.get(0)).A00();
                if (A004 == null || A004.AeC(A003, A072) == 0) {
                    j = 0;
                } else {
                    j = Math.max(j, A004.C7P(A004.B61(A003, A072)));
                }
            }
            i3++;
        }
        j = 0;
        boolean A074 = A07(A022);
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (true) {
            List list3 = A022.A03;
            if (i4 >= list3.size()) {
                A002 = j2;
                break;
            }
            C256773wK r0 = (C256773wK) list3.get(i4);
            List list4 = r0.A07;
            if ((!A074 || r0.A01 != 3) && !list4.isEmpty()) {
                AnonymousClass4XE A005 = ((C256733wG) list4.get(0)).A00();
                if (A005 == null) {
                    break;
                }
                long AeC = A005.AeC(A002, A072);
                if (AeC == 0) {
                    A002 = 0;
                    break;
                } else {
                    long B61 = (A005.B61(A002, A072) + AeC) - 1;
                    j2 = Math.min(j2, A005.C7P(B61) + A005.AzV(B61, A002));
                }
            }
            i4++;
        }
        long j3 = 0;
        if (!r8.A0C.A0R || A08(A022)) {
            z2 = false;
        } else {
            long j4 = r8.A02;
            if (j4 != 0) {
                currentTimeMillis = SystemClock.elapsedRealtime() + j4;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long A075 = Util.A07(currentTimeMillis);
            C256633w6 r92 = r8.A0C;
            A002 = Math.min((A075 - Util.A07(r92.A04)) - Util.A07(r92.A02(size).A00), A002);
            long j5 = r8.A0C.A0E;
            if (j5 != -9223372036854775807L) {
                long A076 = A002 - Util.A07(j5);
                while (A076 < 0 && size > 0) {
                    size--;
                    A076 += r8.A0C.A00(size);
                }
                if (size == 0) {
                    j = Math.max(j, A076);
                } else {
                    j = r8.A0C.A00(0);
                }
            }
            z2 = true;
        }
        long j6 = A002 - j;
        for (int i5 = 0; i5 < r8.A0C.A0Q.size() - 1; i5++) {
            j6 += r8.A0C.A00(i5);
        }
        C256633w6 r93 = r8.A0C;
        if (r93.A0R) {
            long j7 = r8.A04;
            if (j7 == -1) {
                j7 = r93.A0D;
                if (j7 == -9223372036854775807L) {
                    j7 = 30000;
                }
            }
            j3 = j6 - Util.A07(j7);
            if (j3 < 5000000) {
                j3 = Math.min(5000000, j6 / 2);
            }
        }
        long A082 = r93.A04 + r93.A02(0).A00 + Util.A08(j);
        C256633w6 r11 = r8.A0C;
        long j8 = r11.A04;
        long j9 = r8.A02;
        int i6 = r8.A00;
        AnonymousClass4RL r14 = r8.A0O;
        if (r11.A0R) {
            r10 = r8.A0A;
        } else {
            r10 = null;
        }
        r8.A0C(new AnonymousClass4S9(r10, r14, r11, i6, j8, A082, j9, j, j6, j3));
        if (!r8.A0i) {
            Handler handler = r8.A08;
            Runnable runnable = r8.A0U;
            handler.removeCallbacks(runnable);
            if (z2) {
                r8.A08.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
            if (r8.A0H) {
                A04(r8, "process_manifest");
            } else if (z) {
                C256633w6 r1 = r8.A0C;
                if (r1.A0R && r1.A0A != -9223372036854775807L) {
                    A00(r8);
                }
            }
        }
    }

    public final void A0E(C250823m7 r6) {
        C264544Qh r3;
        this.A0L = r6;
        C265114Sp r2 = this.A0Z;
        r2.E3m();
        Looper myLooper = Looper.myLooper();
        C264894Rs r0 = this.A00;
        C256703wD.A01(r0);
        r2.Eg4(myLooper, r0);
        if (this.A0i) {
            r3 = this.A0N;
        } else {
            this.A0D = this.A0f.ALo();
            r3 = this.A0N;
            this.A0E = new AnonymousClass4XY("Loader:DashMediaSource");
            Looper myLooper2 = Looper.myLooper();
            C256703wD.A01(myLooper2);
            this.A08 = new Handler(myLooper2, (Handler.Callback) null);
            if (!r3.A0O) {
                A04(this, "prepare_source_internal");
            }
            if (this.A0C == null) {
                return;
            }
        }
        if (r3.A0U) {
            A06(this, false);
        } else {
            A05(this, false);
        }
    }

    public final void A0F(Xz7 xz7) {
        C257263x7 r2 = xz7.A02;
        C266214Xz r0 = xz7.A03;
        this.A0P.A03((C256683wB) null, new AnonymousClass4Y0(r0.A01, r2, r0.A02), (Object) null, xz7.A00, -1, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public final AnonymousClass4TH AMb(C264874Rq r30, AnonymousClass4QW r31, long j) {
        C264874Rq r1 = r30;
        int intValue = ((Number) r1.A04).intValue() - this.A00;
        C265174Sv r0 = new C265174Sv(r1, this.A04.A02, 0, this.A0C.A02(intValue).A00);
        C265184Sw r11 = new C265184Sw(r1, this.A03.A02, 0);
        int i = intValue + this.A00;
        C265194Sx r15 = this.A0b;
        C264984Sb r14 = this.A0c;
        C250823m7 r13 = this.A0L;
        C265114Sp r12 = this.A0Z;
        C265084Sm r10 = this.A0R;
        long j2 = this.A02;
        AnonymousClass4T1 r9 = this.A0g;
        C265104So r6 = this.A0a;
        C265214Sz r5 = this.A0e;
        C264894Rs r2 = this.A00;
        C256703wD.A01(r2);
        C265214Sz r19 = r5;
        C256633w6 r20 = this.A0C;
        C265194Sx r17 = r15;
        C264984Sb r18 = r14;
        C265104So r152 = r6;
        C265114Sp r142 = r12;
        C265184Sw r132 = r11;
        C264894Rs r122 = r2;
        C264544Qh r112 = this.A0N;
        AnonymousClass4TG r102 = new AnonymousClass4TG(r112, r122, r132, r142, r152, r0, r17, r18, r19, r20, r31, r10, r9, r13, i, intValue, j2);
        this.A0W.put(r102.A07, r102);
        return r102;
    }

    public final AnonymousClass4RL BQS() {
        return this.A0O;
    }

    public final void Cnl() {
        this.A0g.Cnj();
    }

    public final void ECj(AnonymousClass4TH r10) {
        AnonymousClass4TG r102 = (AnonymousClass4TG) r10;
        AnonymousClass4TL r1 = r102.A0H;
        r1.A03 = true;
        r1.A04.removeCallbacksAndMessages((Object) null);
        for (AnonymousClass4TP r4 : r102.A04) {
            r4.A07 = r102;
            r4.A0I.A08();
            for (C265984Xc A082 : r4.A0U) {
                A082.A08();
            }
            r4.A0M.A03(r4);
        }
        r102.A01 = null;
        this.A0W.remove(r102.A07);
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.4T1, java.lang.Object] */
    public C265144Ss(AnonymousClass4SV r4, 27s r5, C257163wx r6, C264544Qh r7, AnonymousClass4SY r8, AnonymousClass4RL r9, C265114Sp r10, C265104So r11, C264984Sb r12, C256633w6 r13, AnonymousClass4SX r14, C265084Sm r15, C256363ve r16, long j) {
        boolean z = false;
        this.A0O = r9;
        this.A0A = r9.A02;
        AnonymousClass4RK r0 = r9.A03;
        r0.getClass();
        Uri uri = r0.A00;
        this.A07 = uri;
        this.A0K = uri;
        this.A0C = r13;
        this.A0f = r14;
        this.A0h = r16;
        this.A0c = r12;
        this.A0Z = r10;
        this.A0R = r15;
        this.A04 = j;
        this.A0a = r11;
        this.A0N = r7;
        this.A0M = r4;
        this.A0X = r6;
        this.A0Y = r8;
        this.A0b = new C265194Sx();
        if (r13 != null && !r13.A0R) {
            z = true;
        }
        this.A0i = z;
        this.A0P = A09((C264874Rq) null);
        this.A0S = new Object();
        this.A0W = new SparseArray();
        this.A09 = r5;
        this.A0e = new C265204Sy(this);
        this.A03 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
        2BY.A02(2BQ.A0v);
        this.A0V = 2BY.A02(2BQ.A0g);
        if (z) {
            C256703wD.A04(!r13.A0R);
            this.A0g = new Object();
            return;
        }
        this.A0d = new XZD(this);
        this.A0g = new C22298Xz8(this);
        this.A0Q = new Y3O(this);
        this.A0U = new Y2h(r7, this);
        this.A0T = new C22384Y1p(this);
    }
}
