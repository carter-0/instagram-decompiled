package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.I5n  reason: case insensitive filesystem */
public abstract class C56633I5n {
    public static final Modifier A00(C287605aT r8, JPI jpi, C54630HLn hLn, 0sP r11, boolean z) {
        0qQ.A0B(hLn, 0);
        JPI jpi2 = jpi;
        0qQ.A0B(jpi, 2);
        C287605aT r7 = r8;
        0sP r0 = r11;
        AnonymousClass7TF.A1D(r8, 3, r11);
        int ordinal = hLn.ordinal();
        if (ordinal == 0) {
            return Modifier.A00;
        }
        if (ordinal != 1) {
            boolean z2 = z;
            if (ordinal == 2) {
                return HR3.A00((C287095Yz) null, r7, Modifier.A00, C51965G9l.A0R(3), new GNG(21, r0, jpi2), z2, jpi.getEnabled());
            } else if (ordinal == 3) {
                return HR4.A00((C287095Yz) null, r7, Modifier.A00, C51965G9l.A0R(1), new C66312MMv(6, r0, jpi2), z2, jpi.getEnabled());
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else {
            return C287635aW.A00((C287095Yz) null, r7, Modifier.A00, C51965G9l.A0R(0), (String) null, new GNG(20, r11, jpi2), jpi.getEnabled());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r6 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if ((r26 & 32) != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (r16 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.compose.foundation.lazy.LazyListState r18, X.C286575Wy r19, androidx.compose.ui.Modifier r20, X.JPI r21, X.0sP r22, X.0sP r23, X.AnonymousClass62P r24, int r25, int r26) {
        /*
            r9 = r18
            r14 = r23
            r11 = r20
            r5 = 0
            r13 = r22
            r15 = r24
            int r1 = X.DbW.A03(r5, r15, r13)
            r0 = 242838733(0xe796ccd, float:3.0744005E-30)
            r10 = r19
            r10.ExV(r0)
            r24 = r26
            r0 = r26 & 1
            r2 = r25
            if (r0 == 0) goto L_0x0136
            r4 = r25 | 6
        L_0x0021:
            r0 = r26 & 2
            r3 = r21
            if (r0 == 0) goto L_0x012b
            r4 = r4 | 48
        L_0x0029:
            r8 = r26 & 4
            if (r8 == 0) goto L_0x0120
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r0 = r26 & 8
            if (r0 == 0) goto L_0x0115
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r7 = r26 & 16
            if (r7 == 0) goto L_0x010a
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r25
            if (r0 != 0) goto L_0x0050
            r0 = r26 & 32
            if (r0 != 0) goto L_0x004d
            boolean r6 = r10.AGu(r9)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r6 != 0) goto L_0x004f
        L_0x004d:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x004f:
            r4 = r4 | r0
        L_0x0050:
            r6 = 74899(0x12493, float:1.04956E-40)
            r6 = r6 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r6 != r0) goto L_0x0082
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x0082
            r10.Evl()
        L_0x0062:
            X.5Xd r4 = r10.ASQ()
            if (r4 == 0) goto L_0x0081
            X.JAg r0 = new X.JAg
            r16 = r0
            r17 = r15
            r18 = r14
            r19 = r3
            r20 = r11
            r21 = r13
            r22 = r9
            r23 = r2
            r25 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.A06 = r0
        L_0x0081:
            return
        L_0x0082:
            r10.Ewr()
            r0 = r25 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r10.Aw3()
            if (r0 != 0) goto L_0x00f9
            r10.Evl()
            r0 = r26 & 32
            if (r0 == 0) goto L_0x009a
        L_0x0099:
            r4 = r4 & r6
        L_0x009a:
            boolean r0 = X.C51967G9n.A1S(r10)
            if (r0 == 0) goto L_0x00a8
            r6 = -509938533(0xffffffffe19af49b, float:-3.5730303E20)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPills (IgdsSegmentedPills.kt:145)"
            X.0fL.A01(r6, r0)
        L_0x00a8:
            if (r21 == 0) goto L_0x00f6
            X.JPI[] r0 = new X.JPI[]{r3}
            X.XDv r6 = X.C21082XDv.A03
            X.0qQ.A0B(r0, r5)
            java.util.List r5 = java.util.Arrays.asList(r0)
            X.0qQ.A07(r5)
            X.XE5 r0 = new X.XE5
            r0.<init>(r6)
            r0.addAll(r5)
            X.XDv r16 = r0.AEM()
            if (r16 == 0) goto L_0x00f6
        L_0x00c8:
            X.HLn r12 = X.C54630HLn.SINGLE
            r17 = 0
            r0 = r4 & 14
            r5 = r0 | 3072(0xc00, float:4.305E-42)
            int r0 = r4 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = r5 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            int r4 = r4 << r1
            r0 = r0 & r4
            int r18 = X.C51969G9p.A05(r5, r0, r4)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r0
            r18 = r18 | r4
            r19 = 128(0x80, float:1.794E-43)
            A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0062
            r0 = -408830758(0xffffffffe7a1bcda, float:-1.5275694E24)
            X.0fL.A00(r0)
            goto L_0x0062
        L_0x00f6:
            X.XDv r16 = X.C21082XDv.A03
            goto L_0x00c8
        L_0x00f9:
            if (r8 == 0) goto L_0x00fd
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
        L_0x00fd:
            if (r7 == 0) goto L_0x0101
            X.J1i r14 = X.C58971J1i.A00
        L_0x0101:
            r0 = r26 & 32
            if (r0 == 0) goto L_0x009a
            androidx.compose.foundation.lazy.LazyListState r9 = X.C305066Gi.A00(r10, r5, r5, r5, r1)
            goto L_0x0099
        L_0x010a:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003b
            int r0 = X.G9t.A0I(r10, r14)
            r4 = r4 | r0
            goto L_0x003b
        L_0x0115:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0035
            int r0 = X.G9t.A0H(r10, r13)
            r4 = r4 | r0
            goto L_0x0035
        L_0x0120:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002f
            int r0 = X.G9t.A0Q(r10, r11)
            r4 = r4 | r0
            goto L_0x002f
        L_0x012b:
            r0 = r25 & 48
            if (r0 != 0) goto L_0x0029
            int r0 = X.G9t.A0P(r10, r3)
            r4 = r4 | r0
            goto L_0x0029
        L_0x0136:
            r0 = r25 & 6
            if (r0 != 0) goto L_0x0142
            int r4 = X.G9t.A0O(r10, r15)
            r4 = r4 | r25
            goto L_0x0021
        L_0x0142:
            r4 = r2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56633I5n.A01(androidx.compose.foundation.lazy.LazyListState, X.5Wy, androidx.compose.ui.Modifier, X.JPI, X.0sP, X.0sP, X.62P, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: X.Ixv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.Ixv} */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r11 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (r11 == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c3, code lost:
        if ((r3 & 128) != 0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
        if ((r10 & 1572864) != 1048576) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0128, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x012a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(androidx.compose.foundation.lazy.LazyListState r22, X.C286575Wy r23, androidx.compose.ui.Modifier r24, X.C54630HLn r25, X.0sP r26, X.0sP r27, X.AnonymousClass62P r28, X.YCQ r29, X.C262224Cq r30, int r31, int r32) {
        /*
            r2 = r22
            r6 = r27
            r7 = r26
            r1 = r30
            r8 = r25
            r5 = r29
            r13 = r24
            r0 = 376297052(0x166dd65c, float:1.9212347E-25)
            r9 = r23
            r9.ExV(r0)
            r3 = r32
            r0 = r32 & 1
            r14 = r28
            r4 = r31
            if (r0 == 0) goto L_0x01d2
            r10 = r31 | 6
        L_0x0022:
            r19 = r32 & 2
            if (r19 == 0) goto L_0x01c7
            r10 = r10 | 48
        L_0x0028:
            r18 = r32 & 4
            if (r18 == 0) goto L_0x01bc
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r17 = r32 & 8
            if (r17 == 0) goto L_0x01b1
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r16 = r32 & 16
            if (r16 == 0) goto L_0x01a6
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r12 = r32 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r12 != 0) goto L_0x0048
            r0 = r31 & r0
            if (r0 != 0) goto L_0x0049
            int r0 = X.G9t.A0J(r9, r6)
        L_0x0048:
            r10 = r10 | r0
        L_0x0049:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r0 = r31 & r15
            if (r0 != 0) goto L_0x005e
            r0 = r32 & 64
            if (r0 != 0) goto L_0x005b
            boolean r11 = r9.AGu(r2)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r11 != 0) goto L_0x005d
        L_0x005b:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x005d:
            r10 = r10 | r0
        L_0x005e:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r31 & r0
            if (r0 != 0) goto L_0x0073
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0070
            boolean r11 = r9.AGw(r1)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 != 0) goto L_0x0072
        L_0x0070:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0072:
            r10 = r10 | r0
        L_0x0073:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r11 = r10 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r11 != r0) goto L_0x00a8
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x00a8
            r9.Evl()
        L_0x0086:
            X.5Xd r9 = r9.ASQ()
            if (r9 == 0) goto L_0x00a7
            r15 = 1
            X.JBl r0 = new X.JBl
            r19 = r2
            r20 = r13
            r21 = r14
            r22 = r6
            r23 = r1
            r14 = r3
            r16 = r5
            r17 = r8
            r18 = r7
            r12 = r0
            r13 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r9.A06 = r0
        L_0x00a7:
            return
        L_0x00a8:
            r9.Ewr()
            r0 = r31 & 1
            r11 = 0
            if (r0 == 0) goto L_0x0172
            boolean r0 = r9.Aw3()
            if (r0 != 0) goto L_0x0172
            r9.Evl()
            r0 = r32 & 64
            if (r0 == 0) goto L_0x00c1
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r10 = r10 & r0
        L_0x00c1:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c9
        L_0x00c5:
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r10 = r10 & r0
        L_0x00c9:
            boolean r0 = X.C51967G9n.A1S(r9)
            if (r0 == 0) goto L_0x00d7
            r12 = -514665831(0xffffffffe152d299, float:-2.4306196E20)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPills (IgdsSegmentedPills.kt:203)"
            X.0fL.A01(r12, r0)
        L_0x00d7:
            X.6Fc r24 = X.C287275Zs.A00()
            X.6Fk r25 = X.C55323Hfq.A00
            r28 = 0
            r0 = 1840045675(0x6dacde6b, float:6.6875386E27)
            r9.ExS(r0)
            r0 = r10 & 14
            r17 = 1
            boolean r12 = X.C51972G9s.A1I(r0)
            boolean r0 = X.C51973G9u.A1I(r10)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1J(r10)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1W(r10)
            boolean r16 = X.C51968G9o.A1T(r9, r1, r12, r0)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r10
            r0 = r0 ^ r15
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r12) goto L_0x010d
            boolean r0 = r9.AGu(r2)
            if (r0 != 0) goto L_0x0112
        L_0x010d:
            r0 = r10 & r15
            r15 = 0
            if (r0 != r12) goto L_0x0113
        L_0x0112:
            r15 = 1
        L_0x0113:
            r16 = r16 | r15
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r10
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r12 == r0) goto L_0x011e
            r17 = 0
        L_0x011e:
            r16 = r16 | r17
            java.lang.Object r0 = r9.ECw()
            if (r16 != 0) goto L_0x012a
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r0 != r12) goto L_0x0143
        L_0x012a:
            r16 = 1
            X.Ixv r0 = new X.Ixv
            r15 = r0
            r17 = r1
            r18 = r2
            r19 = r7
            r20 = r5
            r21 = r8
            r22 = r6
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r9.FLL(r0)
        L_0x0143:
            X.0sP r0 = (X.0sP) r0
            X.C51965G9l.A1X(r9, r11)
            r31 = 12607872(0xc06180, float:1.7667392E-38)
            int r11 = r10 >> 3
            r11 = r11 & 14
            r31 = r31 | r11
            int r10 = r10 >> 15
            r10 = r10 & 112(0x70, float:1.57E-43)
            r31 = r31 | r10
            r32 = 104(0x68, float:1.46E-43)
            r26 = r2
            r27 = r9
            r29 = r13
            r30 = r0
            X.AnonymousClass6HY.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0086
            r0 = 2109727750(0x7dbfe406, float:3.1883314E37)
            X.0fL.A00(r0)
            goto L_0x0086
        L_0x0172:
            if (r19 == 0) goto L_0x0176
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
        L_0x0176:
            if (r18 == 0) goto L_0x017a
            X.XDv r5 = X.C21082XDv.A03
        L_0x017a:
            if (r17 == 0) goto L_0x017e
            X.HLn r8 = X.C54630HLn.A04
        L_0x017e:
            if (r16 == 0) goto L_0x0182
            X.J1k r7 = X.C58973J1k.A00
        L_0x0182:
            if (r12 == 0) goto L_0x0186
            X.J1e r6 = X.C58967J1e.A00
        L_0x0186:
            r0 = r32 & 64
            if (r0 == 0) goto L_0x0192
            androidx.compose.foundation.lazy.LazyListState r2 = X.C51967G9n.A0A(r9)
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r10 = r10 & r0
        L_0x0192:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r1 = r9.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            java.lang.Object r0 = X.C51974G9v.A0Y(r9, r1, r0)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r1 = r0.A00
            goto L_0x00c5
        L_0x01a6:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003a
            int r0 = X.G9t.A0I(r9, r7)
            r10 = r10 | r0
            goto L_0x003a
        L_0x01b1:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A0R(r9, r8)
            r10 = r10 | r0
            goto L_0x0034
        L_0x01bc:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002e
            int r0 = X.G9t.A0Q(r9, r5)
            r10 = r10 | r0
            goto L_0x002e
        L_0x01c7:
            r0 = r31 & 48
            if (r0 != 0) goto L_0x0028
            int r0 = X.G9t.A0P(r9, r13)
            r10 = r10 | r0
            goto L_0x0028
        L_0x01d2:
            r0 = r31 & 6
            if (r0 != 0) goto L_0x01de
            int r10 = X.G9t.A0O(r9, r14)
            r10 = r10 | r31
            goto L_0x0022
        L_0x01de:
            r10 = r4
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56633I5n.A02(androidx.compose.foundation.lazy.LazyListState, X.5Wy, androidx.compose.ui.Modifier, X.HLn, X.0sP, X.0sP, X.62P, X.YCQ, X.4Cq, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if ((r24 & 32) != 0) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(androidx.compose.foundation.lazy.LazyListState r16, X.C286575Wy r17, androidx.compose.ui.Modifier r18, X.0sP r19, X.0sP r20, X.AnonymousClass62P r21, X.YCQ r22, int r23, int r24) {
        /*
            r10 = r19
            r13 = r22
            r6 = r16
            r12 = r21
            r11 = r20
            r8 = r18
            X.C51973G9u.A1E(r12, r13, r10)
            r0 = -1632164460(0xffffffff9eb72594, float:-1.939142E-20)
            r7 = r17
            r7.ExV(r0)
            r22 = r24
            r0 = r24 & 1
            r1 = r23
            if (r0 == 0) goto L_0x010f
            r0 = r23 | 6
        L_0x0021:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0104
            r0 = r0 | 48
        L_0x0027:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x00f9
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002d:
            r5 = r24 & 8
            if (r5 == 0) goto L_0x00ee
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0033:
            r4 = r24 & 16
            if (r4 == 0) goto L_0x00e3
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0039:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r23
            if (r2 != 0) goto L_0x004e
            r2 = r24 & 32
            if (r2 != 0) goto L_0x004b
            boolean r3 = r7.AGu(r6)
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x004d:
            r0 = r0 | r2
        L_0x004e:
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r0
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r2) goto L_0x007b
            boolean r2 = r7.Bwn()
            if (r2 == 0) goto L_0x007b
            r7.Evl()
        L_0x0060:
            X.5Xd r0 = r7.ASQ()
            if (r0 == 0) goto L_0x007a
            r23 = 4
            X.JAg r14 = new X.JAg
            r15 = r12
            r16 = r11
            r17 = r13
            r18 = r8
            r20 = r6
            r21 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A06 = r14
        L_0x007a:
            return
        L_0x007b:
            r7.Ewr()
            r2 = r23 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r2 == 0) goto L_0x00d2
            boolean r2 = r7.Aw3()
            if (r2 != 0) goto L_0x00d2
            r7.Evl()
            r2 = r24 & 32
            if (r2 == 0) goto L_0x0093
        L_0x0092:
            r0 = r0 & r3
        L_0x0093:
            boolean r2 = X.C51967G9n.A1S(r7)
            if (r2 == 0) goto L_0x00a1
            r3 = 875052100(0x34283c44, float:1.5668144E-7)
            java.lang.String r2 = "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPills (IgdsSegmentedPills.kt:172)"
            X.0fL.A01(r3, r2)
        L_0x00a1:
            X.HLn r9 = X.C54630HLn.MULTI
            r14 = 0
            r2 = r0 & 14
            r4 = r2 | 3072(0xc00, float:4.305E-42)
            int r2 = r0 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | r2
            int r2 = r0 << 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            int r0 = r0 << 6
            r0 = r0 & r3
            int r15 = X.C51969G9p.A05(r4, r0, r2)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r2
            r15 = r15 | r0
            r16 = 128(0x80, float:1.794E-43)
            A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0060
            r0 = -174365170(0xfffffffff59b660e, float:-3.939824E32)
            X.0fL.A00(r0)
            goto L_0x0060
        L_0x00d2:
            if (r5 == 0) goto L_0x00d6
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
        L_0x00d6:
            if (r4 == 0) goto L_0x00da
            X.J1j r11 = X.C58972J1j.A00
        L_0x00da:
            r2 = r24 & 32
            if (r2 == 0) goto L_0x0093
            androidx.compose.foundation.lazy.LazyListState r6 = X.C51967G9n.A0A(r7)
            goto L_0x0092
        L_0x00e3:
            r2 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0039
            int r2 = X.G9t.A0I(r7, r11)
            r0 = r0 | r2
            goto L_0x0039
        L_0x00ee:
            r2 = r1 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0033
            int r2 = X.G9t.A0R(r7, r8)
            r0 = r0 | r2
            goto L_0x0033
        L_0x00f9:
            r2 = r1 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x002d
            int r2 = X.G9t.A0G(r7, r10)
            r0 = r0 | r2
            goto L_0x002d
        L_0x0104:
            r2 = r23 & 48
            if (r2 != 0) goto L_0x0027
            int r2 = X.G9t.A0P(r7, r13)
            r0 = r0 | r2
            goto L_0x0027
        L_0x010f:
            r0 = r23 & 6
            if (r0 != 0) goto L_0x011b
            int r0 = X.G9t.A0O(r7, r12)
            r0 = r0 | r23
            goto L_0x0021
        L_0x011b:
            r0 = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56633I5n.A03(androidx.compose.foundation.lazy.LazyListState, X.5Wy, androidx.compose.ui.Modifier, X.0sP, X.0sP, X.62P, X.YCQ, int, int):void");
    }

    public static final void A04(C286575Wy r16, Modifier modifier, 0sP r18, 0sP r19, AnonymousClass62P r20, int i, int i2) {
        int i3;
        C54630HLn hLn;
        0sP r11;
        0sP r12 = r19;
        0sP r2 = r18;
        Modifier modifier2 = modifier;
        AnonymousClass62P r13 = r20;
        0qQ.A0B(r13, 0);
        C286575Wy r8 = r16;
        r8.ExV(692471031);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r8, r13) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r8, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r8, r2);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r8, r12);
        }
        if ((i3 & 1171) != 1170 || !r8.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r2 = null;
            }
            if (i8 != 0) {
                r12 = C58969J1g.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-204364502, "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPills (IgdsSegmentedPills.kt:115)");
            }
            if (r2 == null) {
                hLn = C54630HLn.A04;
            } else {
                hLn = C54630HLn.BUTTON;
            }
            if (r2 == null) {
                r11 = C58970J1h.A00;
            } else {
                r11 = r2;
            }
            A02((LazyListState) null, r8, modifier2, hLn, r11, r12, r13, (YCQ) null, (C262224Cq) null, C51965G9l.A01(i3) | ((i3 << 6) & 458752), 196);
            if (0fL.A02()) {
                0fL.A00(1142614436);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r13, r12, r2, modifier2, i5, i4, 11);
        }
    }
}
