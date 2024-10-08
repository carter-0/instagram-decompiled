package X;

import java.util.ArrayList;
import java.util.Iterator;

public final class W1K {
    public static final C20382WqO A04 = new Object();
    public boolean A00;
    public final C19872Wgz A01;
    public final ArrayList A02 = new ArrayList();
    public final int[] A03 = new int[5];

    public static boolean A01(int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[i];
            if (i3 == 0) {
                return false;
            }
            i2 += i3;
            i++;
        } while (i < 5);
        if (i2 < 7) {
            return false;
        }
        float f = ((float) i2) / 7.0f;
        float f2 = f / 2.0f;
        return C13990Tnq.A04(iArr, f, 0) < f2 && C13990Tnq.A04(iArr, f, 1) < f2 && C13990Tnq.A04(iArr, f * 3.0f, 2) < 3.0f * f2 && C13990Tnq.A04(iArr, f, 3) < f2 && C13990Tnq.A04(iArr, f, 4) < f2;
    }

    public static boolean A00(W1K w1k) {
        ArrayList arrayList = w1k.A02;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (it.hasNext()) {
            C15232UWr uWr = (C15232UWr) it.next();
            if (uWr.A01 >= 2) {
                i++;
                f2 += uWr.A00;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f += AnonymousClass7TE.A00(((C15232UWr) it2.next()).A00, f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x017d, code lost:
        if (r10.A03(r11, r12) == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017f, code lost:
        r0 = r2[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0181, code lost:
        if (r0 >= r14) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0183, code lost:
        r2[4] = r0 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x018a, code lost:
        r16 = r2[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x018e, code lost:
        if (r16 >= r14) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0190, code lost:
        r0 = r2[0] + r2[1];
        r14 = r2[2];
        r15 = r2[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a3, code lost:
        if ((X.C13988Tno.A06(((r0 + r14) + r15) + r16, r8) * 5) >= r8) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a9, code lost:
        if (A01(r2) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ab, code lost:
        r1 = ((float) ((r11 - r16) - r15)) - (((float) r14) / 2.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r2[1] <= r1) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r13 < 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r10.A03(r11, r13) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r0 = r2[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r0 > r1) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        r2[0] = r0 + 1;
        r13 = r13 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r2[0] <= r1) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r12 >= r3) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r10.A03(r11, r12) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        X.C13990Tnq.A1Z(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        if (r12 != r3) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r12 >= r3) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (r10.A03(r11, r12) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r0 = r2[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r0 >= r1) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        r2[3] = r0 + 1;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (r12 == r3) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r2[3] < r1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        if (r12 >= r3) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r10.A03(r11, r12) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        r0 = r2[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c4, code lost:
        if (r0 >= r1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        r2[4] = r0 + 1;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        r14 = r2[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
        if (r14 >= r1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d1, code lost:
        r13 = r2[2];
        r15 = r2[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        if ((X.C13988Tno.A06((((r2[0] + r2[1]) + r13) + r15) + r14, r8) * 5) >= (r8 * 2)) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00eb, code lost:
        if (A01(r2) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        r17 = ((float) ((r12 - r14) - r15)) - (((float) r13) / 2.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0131, code lost:
        if (r2[1] <= r14) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0134, code lost:
        if (r15 < 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013a, code lost:
        if (r10.A03(r15, r12) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013c, code lost:
        r0 = r2[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013e, code lost:
        if (r0 > r14) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0140, code lost:
        r2[0] = r0 + 1;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0149, code lost:
        if (r2[0] <= r14) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014c, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014e, code lost:
        if (r11 >= r13) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0154, code lost:
        if (r10.A03(r11, r12) == false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0156, code lost:
        X.C13990Tnq.A1Z(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r11 != r13) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015d, code lost:
        if (r11 >= r13) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0163, code lost:
        if (r10.A03(r11, r12) != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0165, code lost:
        r0 = r2[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0167, code lost:
        if (r0 >= r14) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0169, code lost:
        r2[3] = r0 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0170, code lost:
        if (r11 == r13) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0174, code lost:
        if (r2[3] < r14) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0177, code lost:
        if (r11 >= r13) goto L_0x018a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(int[] r21, int r22, int r23) {
        /*
            r20 = this;
            r12 = r22
            r9 = 0
            r8 = r21[r9]
            r6 = 1
            r0 = r21[r6]
            int r8 = r8 + r0
            r7 = 2
            r1 = r21[r7]
            int r8 = r8 + r1
            r5 = 3
            r2 = r21[r5]
            int r8 = r8 + r2
            r4 = 4
            r0 = r21[r4]
            int r8 = r8 + r0
            int r3 = r23 - r0
            int r3 = r3 - r2
            float r2 = (float) r3
            float r0 = (float) r1
            r18 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r18
            float r2 = r2 - r0
            int r11 = (int) r2
            r19 = r20
            r0 = r19
            X.Wgz r10 = r0.A01
            int r3 = r10.A00
            int[] r2 = r0.A03
            java.util.Arrays.fill(r2, r9)
            r13 = r12
        L_0x002e:
            if (r13 < 0) goto L_0x003c
            boolean r0 = r10.A03(r11, r13)
            if (r0 == 0) goto L_0x003c
            X.C13990Tnq.A1Z(r2, r7)
            int r13 = r13 + -1
            goto L_0x002e
        L_0x003c:
            r17 = 2143289344(0x7fc00000, float:NaN)
            if (r13 >= 0) goto L_0x0061
        L_0x0040:
            boolean r0 = java.lang.Float.isNaN(r17)
            if (r0 != 0) goto L_0x01b9
            r0 = r17
            int r12 = (int) r0
            r14 = r21[r7]
            int r13 = r10.A02
            java.util.Arrays.fill(r2, r9)
            r15 = r11
        L_0x0051:
            if (r15 < 0) goto L_0x00f9
            boolean r0 = r10.A03(r15, r12)
            if (r0 == 0) goto L_0x00f9
            X.C13990Tnq.A1Z(r2, r7)
            int r15 = r15 + -1
            goto L_0x0051
        L_0x005f:
            if (r13 < 0) goto L_0x0040
        L_0x0061:
            boolean r0 = r10.A03(r11, r13)
            if (r0 != 0) goto L_0x0072
            r0 = r2[r6]
            if (r0 > r1) goto L_0x0072
            int r0 = r0 + 1
            r2[r6] = r0
            int r13 = r13 + -1
            goto L_0x005f
        L_0x0072:
            r0 = r2[r6]
            if (r0 <= r1) goto L_0x0079
            goto L_0x0040
        L_0x0077:
            if (r13 < 0) goto L_0x008a
        L_0x0079:
            boolean r0 = r10.A03(r11, r13)
            if (r0 == 0) goto L_0x008a
            r0 = r2[r9]
            if (r0 > r1) goto L_0x008a
            int r0 = r0 + 1
            r2[r9] = r0
            int r13 = r13 + -1
            goto L_0x0077
        L_0x008a:
            r0 = r2[r9]
            if (r0 <= r1) goto L_0x008f
            goto L_0x0040
        L_0x008f:
            int r12 = r12 + 1
            if (r12 >= r3) goto L_0x009d
            boolean r0 = r10.A03(r11, r12)
            if (r0 == 0) goto L_0x009d
            X.C13990Tnq.A1Z(r2, r7)
            goto L_0x008f
        L_0x009d:
            if (r12 != r3) goto L_0x00a0
            goto L_0x0040
        L_0x00a0:
            if (r12 >= r3) goto L_0x00b3
            boolean r0 = r10.A03(r11, r12)
            if (r0 != 0) goto L_0x00b3
            r0 = r2[r5]
            if (r0 >= r1) goto L_0x00b3
            int r0 = r0 + 1
            r2[r5] = r0
            int r12 = r12 + 1
            goto L_0x00a0
        L_0x00b3:
            if (r12 == r3) goto L_0x0040
            r0 = r2[r5]
            if (r0 < r1) goto L_0x00ba
            goto L_0x0040
        L_0x00ba:
            if (r12 >= r3) goto L_0x00cd
            boolean r0 = r10.A03(r11, r12)
            if (r0 == 0) goto L_0x00cd
            r0 = r2[r4]
            if (r0 >= r1) goto L_0x00cd
            int r0 = r0 + 1
            r2[r4] = r0
            int r12 = r12 + 1
            goto L_0x00ba
        L_0x00cd:
            r14 = r2[r4]
            if (r14 >= r1) goto L_0x0040
            r0 = r2[r9]
            r1 = r2[r6]
            int r0 = r0 + r1
            r13 = r2[r7]
            int r0 = r0 + r13
            r15 = r2[r5]
            int r0 = r0 + r15
            int r0 = r0 + r14
            int r0 = X.C13988Tno.A06(r0, r8)
            int r1 = r0 * 5
            int r0 = r8 * 2
            if (r1 >= r0) goto L_0x0040
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x0040
            int r12 = r12 - r14
            int r12 = r12 - r15
            float r0 = (float) r12
            r17 = r0
            float r0 = (float) r13
            float r0 = r0 / r18
            float r17 = r17 - r0
            goto L_0x0040
        L_0x00f9:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r15 >= 0) goto L_0x011e
        L_0x00fd:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01b9
            int r14 = (int) r1
            java.util.Arrays.fill(r2, r9)
            r11 = 0
        L_0x0108:
            if (r12 < r11) goto L_0x01b5
            if (r14 < r11) goto L_0x01b5
            int r0 = r14 - r11
            int r15 = r12 - r11
            boolean r0 = r10.A03(r0, r15)
            if (r0 == 0) goto L_0x01b5
            X.C13990Tnq.A1Z(r2, r7)
            int r11 = r11 + 1
            goto L_0x0108
        L_0x011c:
            if (r15 < 0) goto L_0x00fd
        L_0x011e:
            boolean r0 = r10.A03(r15, r12)
            if (r0 != 0) goto L_0x012f
            r0 = r2[r6]
            if (r0 > r14) goto L_0x012f
            int r0 = r0 + 1
            r2[r6] = r0
            int r15 = r15 + -1
            goto L_0x011c
        L_0x012f:
            r0 = r2[r6]
            if (r0 <= r14) goto L_0x0136
            goto L_0x00fd
        L_0x0134:
            if (r15 < 0) goto L_0x0147
        L_0x0136:
            boolean r0 = r10.A03(r15, r12)
            if (r0 == 0) goto L_0x0147
            r0 = r2[r9]
            if (r0 > r14) goto L_0x0147
            int r0 = r0 + 1
            r2[r9] = r0
            int r15 = r15 + -1
            goto L_0x0134
        L_0x0147:
            r0 = r2[r9]
            if (r0 <= r14) goto L_0x014c
            goto L_0x00fd
        L_0x014c:
            int r11 = r11 + 1
            if (r11 >= r13) goto L_0x015a
            boolean r0 = r10.A03(r11, r12)
            if (r0 == 0) goto L_0x015a
            X.C13990Tnq.A1Z(r2, r7)
            goto L_0x014c
        L_0x015a:
            if (r11 != r13) goto L_0x015d
            goto L_0x00fd
        L_0x015d:
            if (r11 >= r13) goto L_0x0170
            boolean r0 = r10.A03(r11, r12)
            if (r0 != 0) goto L_0x0170
            r0 = r2[r5]
            if (r0 >= r14) goto L_0x0170
            int r0 = r0 + 1
            r2[r5] = r0
            int r11 = r11 + 1
            goto L_0x015d
        L_0x0170:
            if (r11 == r13) goto L_0x00fd
            r0 = r2[r5]
            if (r0 < r14) goto L_0x0177
            goto L_0x00fd
        L_0x0177:
            if (r11 >= r13) goto L_0x018a
            boolean r0 = r10.A03(r11, r12)
            if (r0 == 0) goto L_0x018a
            r0 = r2[r4]
            if (r0 >= r14) goto L_0x018a
            int r0 = r0 + 1
            r2[r4] = r0
            int r11 = r11 + 1
            goto L_0x0177
        L_0x018a:
            r16 = r2[r4]
            r0 = r16
            if (r0 >= r14) goto L_0x00fd
            r0 = r2[r9]
            r14 = r2[r6]
            int r0 = r0 + r14
            r14 = r2[r7]
            int r0 = r0 + r14
            r15 = r2[r5]
            int r0 = r0 + r15
            int r0 = r0 + r16
            int r0 = X.C13988Tno.A06(r0, r8)
            int r0 = r0 * 5
            if (r0 >= r8) goto L_0x00fd
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x00fd
            int r11 = r11 - r16
            int r11 = r11 - r15
            float r1 = (float) r11
            float r0 = (float) r14
            float r0 = r0 / r18
            float r1 = r1 - r0
            goto L_0x00fd
        L_0x01b5:
            r0 = r2[r7]
            if (r0 != 0) goto L_0x01ba
        L_0x01b9:
            return r9
        L_0x01ba:
            if (r12 < r11) goto L_0x01ce
            if (r14 < r11) goto L_0x01ce
            int r0 = r14 - r11
            int r15 = r12 - r11
            boolean r0 = r10.A03(r0, r15)
            if (r0 != 0) goto L_0x01ce
            X.C13990Tnq.A1Z(r2, r6)
            int r11 = r11 + 1
            goto L_0x01ba
        L_0x01ce:
            r0 = r2[r6]
            if (r0 != 0) goto L_0x01d3
            return r9
        L_0x01d3:
            if (r12 < r11) goto L_0x01e7
            if (r14 < r11) goto L_0x01e7
            int r0 = r14 - r11
            int r15 = r12 - r11
            boolean r0 = r10.A03(r0, r15)
            if (r0 == 0) goto L_0x01e7
            X.C13990Tnq.A1Z(r2, r9)
            int r11 = r11 + 1
            goto L_0x01d3
        L_0x01e7:
            r0 = r2[r9]
            if (r0 == 0) goto L_0x01b9
            r15 = 1
        L_0x01ec:
            int r11 = r12 + r15
            if (r11 >= r3) goto L_0x0200
            int r0 = r14 + r15
            if (r0 >= r13) goto L_0x0200
            boolean r0 = r10.A03(r0, r11)
            if (r0 == 0) goto L_0x0200
            X.C13990Tnq.A1Z(r2, r7)
            int r15 = r15 + 1
            goto L_0x01ec
        L_0x0200:
            int r11 = r12 + r15
            if (r11 >= r3) goto L_0x0214
            int r0 = r14 + r15
            if (r0 >= r13) goto L_0x0214
            boolean r0 = r10.A03(r0, r11)
            if (r0 != 0) goto L_0x0214
            X.C13990Tnq.A1Z(r2, r5)
            int r15 = r15 + 1
            goto L_0x0200
        L_0x0214:
            r0 = r2[r5]
            if (r0 != 0) goto L_0x0219
            return r9
        L_0x0219:
            int r11 = r12 + r15
            if (r11 >= r3) goto L_0x022d
            int r0 = r14 + r15
            if (r0 >= r13) goto L_0x022d
            boolean r0 = r10.A03(r0, r11)
            if (r0 == 0) goto L_0x022d
            X.C13990Tnq.A1Z(r2, r4)
            int r15 = r15 + 1
            goto L_0x0219
        L_0x022d:
            r10 = r2[r4]
            if (r10 == 0) goto L_0x01b9
            r4 = 0
            r3 = 0
        L_0x0233:
            r0 = r2[r4]
            if (r0 == 0) goto L_0x01b9
            int r3 = r3 + r0
            int r4 = r4 + 1
            r0 = 5
            if (r4 < r0) goto L_0x0233
            r0 = 7
            if (r3 < r0) goto L_0x01b9
            float r4 = (float) r3
            r0 = 1088421888(0x40e00000, float:7.0)
            float r4 = r4 / r0
            r0 = 1068146622(0x3faa9fbe, float:1.333)
            float r11 = r4 / r0
            float r0 = X.C13990Tnq.A04(r2, r4, r9)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            float r0 = X.C13990Tnq.A04(r2, r4, r6)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            r3 = 1077936128(0x40400000, float:3.0)
            float r0 = r4 * r3
            float r0 = X.C13990Tnq.A04(r2, r0, r7)
            float r3 = r3 * r11
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            float r0 = X.C13990Tnq.A04(r2, r4, r5)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            float r0 = (float) r10
            float r0 = X.AnonymousClass7TE.A00(r4, r0)
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b9
            float r8 = (float) r8
            r0 = 1088421888(0x40e00000, float:7.0)
            float r8 = r8 / r0
        L_0x027b:
            r0 = r19
            java.util.ArrayList r7 = r0.A02
            int r0 = r7.size()
            if (r9 >= r0) goto L_0x02d5
            java.lang.Object r10 = r7.get(r9)
            X.UWr r10 = (X.C15232UWr) r10
            float r2 = r10.A01
            r0 = r17
            float r0 = X.AnonymousClass7TE.A00(r0, r2)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02d2
            float r0 = r10.A00
            float r0 = X.AnonymousClass7TE.A00(r1, r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02d2
            float r3 = r10.A00
            float r2 = X.AnonymousClass7TE.A00(r8, r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b1
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x02d2
        L_0x02b1:
            int r0 = r10.A01
            int r5 = r0 + 1
            float r4 = (float) r0
            float r0 = r10.A00
            float r3 = r4 * r0
            float r3 = r3 + r1
            float r2 = (float) r5
            float r3 = r3 / r2
            float r0 = r10.A01
            float r1 = r4 * r0
            float r1 = r1 + r17
            float r1 = r1 / r2
            float r0 = r10.A00
            float r4 = r4 * r0
            float r4 = r4 + r8
            float r4 = r4 / r2
            X.UWr r0 = new X.UWr
            r0.<init>(r3, r1, r4, r5)
            r7.set(r9, r0)
            return r6
        L_0x02d2:
            int r9 = r9 + 1
            goto L_0x027b
        L_0x02d5:
            X.UWr r2 = new X.UWr
            r0 = r17
            r2.<init>(r1, r0, r8, r6)
            r7.add(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1K.A02(int[], int, int):boolean");
    }

    public W1K(C19872Wgz wgz) {
        this.A01 = wgz;
    }
}
