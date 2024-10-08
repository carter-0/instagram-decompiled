package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.Map;

/* renamed from: X.4cX  reason: invalid class name and case insensitive filesystem */
public abstract class C267964cX extends C267974cY implements C267994ca, C268044cf {
    public static final 0sP A06 = AnonymousClass5RQ.A00;
    public AnonymousClass0vw A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public AnonymousClass0vw A04;
    public final C268104cl A05 = new AnonymousClass5SG(this);

    public int A0K(C292215ia r3) {
        C268834e4 r1 = (C268834e4) this;
        AnonymousClass6GP r0 = r1.A00;
        if (r0 != null) {
            return r0.A0K(r3);
        }
        Number number = (Number) r1.A0H.A0U.A0J.A0L().get(r3);
        if (number != null) {
            return number.intValue();
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public long A0L() {
        return ((C268054cg) this).A01;
    }

    public C268064ch A0M() {
        return (C268054cg) this;
    }

    public C289145d6 A0N() {
        C289145d6 r0 = ((C268054cg) this).A04;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public C267964cX A0O() {
        return ((C268054cg) this).A06;
    }

    public C267964cX A0P() {
        return ((C268054cg) this).A07;
    }

    public void A0Q() {
        C268054cg r4 = (C268054cg) this;
        GraphicsLayer graphicsLayer = r4.A03;
        if (graphicsLayer != null) {
            r4.A0I(graphicsLayer, r4.A00, r4.A01);
            return;
        }
        long j = r4.A01;
        r4.A0J(r4.A09, r4.A00, j);
    }

    public boolean A0R() {
        if (((C268054cg) this).A04 != null) {
            return true;
        }
        return false;
    }

    public AnonymousClass5R6 BLv() {
        return ((C268054cg) this).A0H;
    }

    public boolean CWf() {
        return false;
    }

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezu(long j) {
        return C291905i4.A00(this, j);
    }

    public final /* synthetic */ float Ezw(int i) {
        return ((float) i) / AwL();
    }

    public final /* synthetic */ long Ezx(long j) {
        return C289055cw.A03(this, j);
    }

    public final /* synthetic */ float F05(long j) {
        return C289055cw.A00(this, j);
    }

    public final /* synthetic */ long FH8(long j) {
        return C289055cw.A04(this, j);
    }

    public final /* synthetic */ long FH9(float f) {
        return C291905i4.A01(this, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        if (((r22 & ((r22 ^ -1) << 6)) & -9187201950435737472L) == 0) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        r18 = X.AnonymousClass0vw.A00(r9, r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        if (r9.A00 != 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
        r7 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        if (((r7[r18 >> 3] >> ((r18 & 7) << 3)) & 255) == 254) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010e, code lost:
        r6 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0110, code lost:
        if (r6 <= 8) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        if (((((long) r9.A01) * 32) ^ Long.MIN_VALUE) > ((((long) r6) * 25) ^ Long.MIN_VALUE)) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0127, code lost:
        r11 = r9.A04;
        r3 = r9.A02;
        X.01o.A01(r7, r6);
        r2 = 0;
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        r37 = r2 >> 3;
        r36 = (r2 & 7) << 3;
        r16 = (r7[r37] >> r36) & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0140, code lost:
        if (r16 != 128) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0142, code lost:
        r13 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        if (r2 != r6) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0148, code lost:
        X.AnonymousClass0vw.A01(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        r18 = X.AnonymousClass0vw.A00(r9, r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0151, code lost:
        r9.A01++;
        r1 = r9.A00;
        r0 = r9.A03;
        r13 = r18 >> 3;
        r16 = r0[r13];
        r11 = (r18 & 7) << 3;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016a, code lost:
        if (((r16 >> r11) & 255) != 128) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016d, code lost:
        r9.A00 = r1 - r2;
        r1 = r9.A00;
        r33 = (((255 << r11) ^ -1) & r16) | (r4 << r11);
        r0[r13] = r33;
        r0[(((r18 - 7) & r1) + (r1 & 7)) >> 3] = r33;
        r2 = r18 ^ -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019d, code lost:
        if (r16 != 254) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019f, code lost:
        r0 = r11[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a1, code lost:
        if (r0 == null) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a3, code lost:
        r35 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r35 = r35 * -862048943;
        r35 = r35 ^ (r35 << 16);
        r0 = r35 >>> 7;
        r26 = X.AnonymousClass0vw.A00(r9, r0);
        r0 = r0 & r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c5, code lost:
        if ((((r26 - r0) & r6) / 8) != (((r2 - r0) & r6) / 8)) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c7, code lost:
        r7[r37] = (((long) (r35 & 127)) << r36) | (((255 << r36) ^ -1) & r7[r37]);
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e3, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e7, code lost:
        r35 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ea, code lost:
        r21 = r26 >> 3;
        r19 = r7[r21];
        r18 = (r26 & 7) << 3;
        r0 = r35 & 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fa, code lost:
        if (((r19 >> r18) & 255) != 128) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fc, code lost:
        r7[r21] = (r19 & ((255 << r18) ^ -1)) | (((long) r0) << r18);
        r7[r37] = (r7[r37] & ((255 << r36) ^ -1)) | (128 << r36);
        r11[r26] = r11[r2];
        r11[r2] = null;
        r3[r26] = r3[r2];
        r3[r2] = 0.0f;
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0226, code lost:
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0235, code lost:
        r7[r21] = (((long) r0) << r18) | (r19 & ((255 << r18) ^ -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0243, code lost:
        if (r13 != -1) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0245, code lost:
        r13 = X.01o.A00(r7, r2 + 1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024b, code lost:
        r11[r13] = r11[r26];
        r11[r26] = r11[r2];
        r11[r2] = r11[r13];
        r3[r13] = r3[r26];
        r3[r26] = r3[r2];
        r3[r2] = r3[r13];
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0266, code lost:
        r0 = X.01o.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0269, code lost:
        if (r6 == 0) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x026b, code lost:
        r1 = (r6 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026f, code lost:
        r26 = r9.A04;
        r25 = r9.A02;
        X.AnonymousClass0vw.A02(r9, r1);
        r11 = r9.A03;
        r24 = r9.A04;
        r13 = r9.A02;
        r3 = r9.A00;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0285, code lost:
        if (r2 >= r6) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0295, code lost:
        if (((r7[r2 >> 3] >> ((r2 & 7) << 3)) & 255) >= 128) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0297, code lost:
        r23 = r26[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0299, code lost:
        if (r23 == null) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x029b, code lost:
        r1 = r23.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x029f, code lost:
        r1 = r1 * -862048943;
        r1 = r1 ^ (r1 << 16);
        r22 = X.AnonymousClass0vw.A00(r9, r1 >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = (((long) (r1 & 127)) << r20) | (r11[r21] & ((255 << r20) ^ -1));
        r11[r21] = r0;
        r11[(((r22 - 7) & r3) + (r3 & 7)) >> 3] = r0;
        r24[r22] = r23;
        r13[r22] = r25[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02d3, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02d6, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C267964cX r49, X.C289175d9 r50) {
        /*
            r14 = r49
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x0363
            r0 = r50
            X.5d6 r0 = r0.A00
            X.0sP r0 = r0.Bov()
            r12 = 8
            if (r0 == 0) goto L_0x0363
            X.0vw r9 = r14.A04
            if (r9 != 0) goto L_0x0023
            X.0vw r9 = new X.0vw
            r9.<init>()
            X.0vr r0 = X.01o.A01
            r0 = 6
            X.AnonymousClass0vw.A02(r9, r0)
            r14.A04 = r9
        L_0x0023:
            X.0vw r8 = r14.A00
            if (r8 != 0) goto L_0x0034
            X.0vw r8 = new X.0vw
            r8.<init>()
            X.0vr r0 = X.01o.A01
            r0 = 6
            X.AnonymousClass0vw.A02(r8, r0)
            r14.A00 = r8
        L_0x0034:
            java.lang.Object[] r0 = r8.A04
            r49 = r0
            float[] r0 = r8.A02
            r48 = r0
            long[] r0 = r8.A03
            r47 = r0
            int r0 = r0.length
            int r46 = r0 + -2
            if (r46 < 0) goto L_0x02e8
            r10 = 0
        L_0x0046:
            r31 = r47[r10]
            r29 = -1
            long r3 = r29 ^ r31
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r31
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02e0
            int r0 = r10 - r46
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r45 = 8 - r0
            r15 = 0
        L_0x0063:
            r0 = r45
            if (r15 >= r0) goto L_0x02de
            r33 = 255(0xff, double:1.26E-321)
            long r1 = r33 & r31
            r27 = 128(0x80, double:6.32E-322)
            int r0 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r0 >= 0) goto L_0x0195
            int r0 = r10 << 3
            int r0 = r0 + r15
            r44 = r49[r0]
            r43 = r48[r0]
            if (r44 == 0) goto L_0x00e3
            int r1 = r44.hashCode()
        L_0x007e:
            r42 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r42
            int r0 = r1 << 16
            r1 = r1 ^ r0
            int r41 = r1 >>> 7
            r7 = r1 & 127(0x7f, float:1.78E-43)
            int r6 = r9.A00
            r13 = r41 & r6
            r11 = 0
        L_0x008f:
            long[] r1 = r9.A03
            int r2 = r13 >> 3
            r0 = r13 & 7
            int r0 = r0 << 3
            r4 = r1[r2]
            long r4 = r4 >>> r0
            int r2 = r2 + 1
            r22 = r1[r2]
            int r1 = 64 - r0
            long r22 = r22 << r1
            long r2 = (long) r0
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r22 = r22 & r0
            long r22 = r22 | r4
            long r4 = (long) r7
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r4 * r16
            long r0 = r22 ^ r2
            long r20 = r0 - r16
            long r0 = r0 ^ r29
            long r20 = r20 & r0
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r20 = r20 & r18
        L_0x00c2:
            r16 = 0
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            int r0 = java.lang.Long.numberOfTrailingZeros(r20)
            int r2 = r0 >> 3
            int r2 = r2 + r13
            r2 = r2 & r6
            java.lang.Object[] r0 = r9.A04
            r1 = r0[r2]
            r0 = r44
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0189
            r2 = 1
            long r0 = r20 - r2
            long r20 = r20 & r0
            goto L_0x00c2
        L_0x00e3:
            r1 = 0
            goto L_0x007e
        L_0x00e5:
            long r1 = r22 ^ r29
            r0 = 6
            long r1 = r1 << r0
            long r22 = r22 & r1
            long r22 = r22 & r18
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x02d8
            r0 = r41
            int r18 = X.AnonymousClass0vw.A00(r9, r0)
            int r0 = r9.A00
            if (r0 != 0) goto L_0x0151
            long[] r7 = r9.A03
            int r0 = r18 >> 3
            r1 = r7[r0]
            r0 = r18 & 7
            int r0 = r0 << 3
            long r1 = r1 >> r0
            long r1 = r1 & r33
            r39 = 254(0xfe, double:1.255E-321)
            int r0 = (r1 > r39 ? 1 : (r1 == r39 ? 0 : -1))
            if (r0 == 0) goto L_0x0151
            int r6 = r9.A00
            if (r6 <= r12) goto L_0x0266
            int r0 = r9.A01
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 * r0
            long r0 = (long) r6
            r16 = 25
            long r0 = r0 * r16
            r16 = -9223372036854775808
            long r2 = r2 ^ r16
            long r0 = r0 ^ r16
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x0266
            java.lang.Object[] r11 = r9.A04
            float[] r3 = r9.A02
            X.01o.A01(r7, r6)
            r38 = 0
            r2 = 0
            r13 = -1
        L_0x0132:
            int r37 = r2 >> 3
            r16 = r7[r37]
            r0 = r2 & 7
            int r36 = r0 << 3
            long r16 = r16 >> r36
            long r16 = r16 & r33
            int r0 = (r16 > r27 ? 1 : (r16 == r27 ? 0 : -1))
            if (r0 != 0) goto L_0x019b
            int r0 = r2 + 1
            r13 = r2
            r2 = r0
        L_0x0146:
            if (r2 != r6) goto L_0x0132
            X.AnonymousClass0vw.A01(r9)
        L_0x014b:
            r0 = r41
            int r18 = X.AnonymousClass0vw.A00(r9, r0)
        L_0x0151:
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            int r1 = r9.A00
            long[] r0 = r9.A03
            int r13 = r18 >> 3
            r16 = r0[r13]
            r2 = r18 & 7
            int r11 = r2 << 3
            long r6 = r16 >> r11
            long r6 = r6 & r33
            int r3 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            r2 = 0
            if (r3 != 0) goto L_0x016d
            r2 = 1
        L_0x016d:
            int r1 = r1 - r2
            r9.A00 = r1
            int r1 = r9.A00
            long r33 = r33 << r11
            long r33 = r33 ^ r29
            long r33 = r33 & r16
            long r4 = r4 << r11
            long r33 = r33 | r4
            r0[r13] = r33
            int r2 = r18 + -7
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r33
            r2 = r18 ^ -1
        L_0x0189:
            if (r2 >= 0) goto L_0x018d
            r2 = r2 ^ -1
        L_0x018d:
            java.lang.Object[] r0 = r9.A04
            r0[r2] = r44
            float[] r0 = r9.A02
            r0[r2] = r43
        L_0x0195:
            long r31 = r31 >> r12
            int r15 = r15 + 1
            goto L_0x0063
        L_0x019b:
            int r0 = (r16 > r39 ? 1 : (r16 == r39 ? 0 : -1))
            if (r0 != 0) goto L_0x01e3
            r0 = r11[r2]
            if (r0 == 0) goto L_0x01e7
            int r35 = r0.hashCode()
        L_0x01a7:
            int r35 = r35 * r42
            int r0 = r35 << 16
            r35 = r35 ^ r0
            int r0 = r35 >>> 7
            int r26 = X.AnonymousClass0vw.A00(r9, r0)
            r0 = r0 & r6
            int r1 = r26 - r0
            r1 = r1 & r6
            int r1 = r1 / 8
            int r0 = r2 - r0
            r0 = r0 & r6
            int r0 = r0 / 8
            r24 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            r22 = -9223372036854775808
            if (r1 != r0) goto L_0x01ea
            r0 = r35 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            r18 = r7[r37]
            long r16 = r33 << r36
            long r16 = r16 ^ r29
            long r16 = r16 & r18
            long r0 = r0 << r36
            long r0 = r0 | r16
            r7[r37] = r0
            int r0 = r7.length
            int r16 = r0 + -1
            r0 = r7[r38]
            long r0 = r0 & r24
            long r0 = r0 | r22
            r7[r16] = r0
        L_0x01e3:
            int r2 = r2 + 1
            goto L_0x0146
        L_0x01e7:
            r35 = 0
            goto L_0x01a7
        L_0x01ea:
            int r21 = r26 >> 3
            r19 = r7[r21]
            r0 = r26 & 7
            int r18 = r0 << 3
            long r16 = r19 >> r18
            long r16 = r16 & r33
            int r1 = (r16 > r27 ? 1 : (r16 == r27 ? 0 : -1))
            r0 = r35 & 127(0x7f, float:1.78E-43)
            if (r1 != 0) goto L_0x0235
            long r0 = (long) r0
            long r16 = r33 << r18
            long r16 = r16 ^ r29
            long r19 = r19 & r16
            long r0 = r0 << r18
            long r19 = r19 | r0
            r7[r21] = r19
            r16 = r7[r37]
            long r0 = r33 << r36
            long r0 = r0 ^ r29
            long r16 = r16 & r0
            long r0 = r27 << r36
            long r16 = r16 | r0
            r7[r37] = r16
            r0 = r11[r2]
            r11[r26] = r0
            r0 = 0
            r11[r2] = r0
            r0 = r3[r2]
            r3[r26] = r0
            r0 = 0
            r3[r2] = r0
            r13 = r2
        L_0x0226:
            int r0 = r7.length
            int r16 = r0 + -1
            r0 = r7[r38]
            long r0 = r0 & r24
            long r0 = r0 | r22
            r7[r16] = r0
            int r2 = r2 + 1
            goto L_0x0146
        L_0x0235:
            long r0 = (long) r0
            long r16 = r33 << r18
            long r16 = r16 ^ r29
            long r19 = r19 & r16
            long r0 = r0 << r18
            long r0 = r0 | r19
            r7[r21] = r0
            r0 = -1
            if (r13 != r0) goto L_0x024b
            int r0 = r2 + 1
            int r13 = X.01o.A00(r7, r0, r6)
        L_0x024b:
            r0 = r11[r26]
            r11[r13] = r0
            r0 = r11[r2]
            r11[r26] = r0
            r0 = r11[r13]
            r11[r2] = r0
            r0 = r3[r26]
            r3[r13] = r0
            r0 = r3[r2]
            r3[r26] = r0
            r0 = r3[r13]
            r3[r2] = r0
            int r2 = r2 + -1
            goto L_0x0226
        L_0x0266:
            X.0vr r0 = X.01o.A01
            r1 = 6
            if (r6 == 0) goto L_0x026f
            int r0 = r6 * 2
            int r1 = r0 + 1
        L_0x026f:
            java.lang.Object[] r0 = r9.A04
            r26 = r0
            float[] r0 = r9.A02
            r25 = r0
            X.AnonymousClass0vw.A02(r9, r1)
            long[] r11 = r9.A03
            java.lang.Object[] r0 = r9.A04
            r24 = r0
            float[] r13 = r9.A02
            int r3 = r9.A00
            r2 = 0
        L_0x0285:
            if (r2 >= r6) goto L_0x014b
            int r0 = r2 >> 3
            r16 = r7[r0]
            r0 = r2 & 7
            int r0 = r0 << 3
            long r16 = r16 >> r0
            long r16 = r16 & r33
            int r0 = (r16 > r27 ? 1 : (r16 == r27 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d3
            r23 = r26[r2]
            if (r23 == 0) goto L_0x02d6
            int r1 = r23.hashCode()
        L_0x029f:
            int r1 = r1 * r42
            int r0 = r1 << 16
            r1 = r1 ^ r0
            int r0 = r1 >>> 7
            int r22 = X.AnonymousClass0vw.A00(r9, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            int r21 = r22 >> 3
            r16 = r22 & 7
            int r20 = r16 << 3
            r18 = r11[r21]
            long r16 = r33 << r20
            long r16 = r16 ^ r29
            long r18 = r18 & r16
            long r0 = r0 << r20
            long r0 = r0 | r18
            r11[r21] = r0
            int r17 = r22 + -7
            r17 = r17 & r3
            r16 = r3 & 7
            int r17 = r17 + r16
            int r16 = r17 >> 3
            r11[r16] = r0
            r24[r22] = r23
            r0 = r25[r2]
            r13[r22] = r0
        L_0x02d3:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x02d6:
            r1 = 0
            goto L_0x029f
        L_0x02d8:
            int r11 = r11 + 8
            int r13 = r13 + r11
            r13 = r13 & r6
            goto L_0x008f
        L_0x02de:
            if (r0 != r12) goto L_0x02e8
        L_0x02e0:
            r0 = r46
            if (r10 == r0) goto L_0x02e8
            int r10 = r10 + 1
            goto L_0x0046
        L_0x02e8:
            r8.A04()
            X.5R6 r0 = r14.BLv()
            X.4co r0 = r0.A0A
            if (r0 == 0) goto L_0x0307
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5TD r4 = r0.A0b
            if (r4 == 0) goto L_0x0307
            X.0sP r3 = A06
            r2 = 18
            X.IwR r1 = new X.IwR
            r0 = r50
            r1.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r14)
            r4.A00(r0, r1, r3)
        L_0x0307:
            long[] r7 = r8.A03
            int r0 = r7.length
            int r6 = r0 + -2
            if (r6 < 0) goto L_0x0360
            r5 = 0
        L_0x030f:
            r15 = r7[r5]
            r0 = -1
            long r3 = r15 ^ r0
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r15
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x035b
            int r0 = r5 - r6
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r4 = 8 - r0
            r3 = 0
        L_0x032b:
            if (r3 >= r4) goto L_0x0359
            r0 = 255(0xff, double:1.26E-321)
            long r10 = r15 & r0
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x034e
            r2 = 0
            int r0 = r9.A03(r2)
            if (r0 >= 0) goto L_0x034e
            X.4cX r1 = r14.A0P()
            if (r1 == 0) goto L_0x034e
        L_0x0344:
            X.0vw r0 = r1.A00
            if (r0 == 0) goto L_0x0352
            int r0 = r0.A03(r2)
            if (r0 < 0) goto L_0x0352
        L_0x034e:
            long r15 = r15 >> r12
            int r3 = r3 + 1
            goto L_0x032b
        L_0x0352:
            X.4cX r1 = r1.A0P()
            if (r1 != 0) goto L_0x0344
            goto L_0x034e
        L_0x0359:
            if (r4 != r12) goto L_0x0360
        L_0x035b:
            if (r5 == r6) goto L_0x0360
            int r5 = r5 + 1
            goto L_0x030f
        L_0x0360:
            r9.A04()
        L_0x0363:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267964cX.A00(X.4cX, X.5d9):void");
    }

    public static final void A01(C268054cg r2) {
        AnonymousClass5R6 r1;
        AnonymousClass5SM Aal;
        C268054cg r0 = r2.A06;
        if (r0 != null) {
            r1 = r0.A0H;
        } else {
            r1 = null;
        }
        AnonymousClass5R6 r02 = r2.A0H;
        boolean A0K = 0qQ.A0K(r1, r02);
        AnonymousClass5SJ r03 = r02.A0U.A0J;
        if (!A0K) {
            Aal = r03.Aal();
        } else {
            AnonymousClass5SK BaU = r03.BaU();
            if (BaU == null || (Aal = BaU.Aal()) == null) {
                return;
            }
        }
        Aal.A04();
    }

    public final /* synthetic */ C289145d6 Cfi(Map map, 0sP r5, int i, int i2) {
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new C289135d5(this, map, r5, i, i2);
        }
        I2E.A01(002.A0n("Size(", " x ", C273654mx.A00(436), i, i2));
        throw AnonymousClass00P.createAndThrow();
    }

    public final int AWx(C292215ia r6) {
        int A0K;
        if (!A0R() || (A0K = A0K(r6)) == Integer.MIN_VALUE) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return ((int) (this.A02 & 4294967295L)) + A0K;
    }

    public final /* synthetic */ float Ezv(float f) {
        return f / AwL();
    }

    public final /* synthetic */ float F06(float f) {
        return f * AwL();
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }

    public final void Efr(boolean z) {
        this.A01 = z;
    }
}
