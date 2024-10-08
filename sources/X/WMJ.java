package X;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public final class WMJ implements C296735qY {
    public static final int[] A0O = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A0P = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0Q = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0R = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0S = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0T = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final int[] A0U = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final boolean[] A0V = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public C18615Vv8 A08;
    public UW5 A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final long A0I;
    public final AnonymousClass4XV A0J;
    public final ArrayDeque A0K;
    public final ArrayDeque A0L;
    public final ArrayList A0M;
    public final PriorityQueue A0N;

    public final void release() {
    }

    private ArrayList A00() {
        ArrayList arrayList = this.A0M;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C264814Rj A012 = ((C18615Vv8) arrayList.get(i2)).A01(AnonymousClass972.MUTABLE_FLAG_MASK);
            arrayList2.add(A012);
            if (A012 != null) {
                i = Math.min(i, A012.A07);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C264814Rj r1 = (C264814Rj) arrayList2.get(i3);
            if (r1 != null) {
                if (r1.A07 != i) {
                    r1 = ((C18615Vv8) arrayList.get(i3)).A01(i);
                    r1.getClass();
                }
                arrayList3.add(r1);
            }
        }
        return arrayList3;
    }

    private void A01() {
        C18615Vv8 vv8 = this.A08;
        vv8.A00 = this.A02;
        vv8.A06.clear();
        vv8.A07.clear();
        vv8.A05.setLength(0);
        vv8.A03 = 15;
        vv8.A02 = 0;
        vv8.A04 = 0;
        ArrayList arrayList = this.A0M;
        arrayList.clear();
        arrayList.add(this.A08);
    }

    private void A02(int i) {
        int i2 = this.A02;
        if (i2 != i) {
            this.A02 = i;
            if (i == 3) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.A0M;
                    if (i3 < arrayList.size()) {
                        ((C18615Vv8) arrayList.get(i3)).A00 = 3;
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                A01();
                if (i2 == 3 || i == 1 || i == 0) {
                    this.A0A = Collections.emptyList();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object AOh() {
        C256703wD.A04(DbW.A1a(this.A09));
        ArrayDeque arrayDeque = this.A0K;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        UW5 uw5 = (UW5) arrayDeque.pollFirst();
        this.A09 = uw5;
        return uw5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x028c, code lost:
        if (r0 != 3) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (r1[r7] == false) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0094 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AOk() {
        /*
            r14 = this;
            java.util.ArrayDeque r4 = r14.A0L
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0048
        L_0x0008:
            long r5 = r14.A0I
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0354
            long r7 = r14.A05
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0354
            long r1 = r14.A06
            long r1 = r1 - r7
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0354
            java.lang.Object r4 = r4.pollFirst()
            X.5qa r4 = (X.C296755qa) r4
            if (r4 == 0) goto L_0x0354
            java.util.List r3 = java.util.Collections.emptyList()
            r14.A0A = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14.A05 = r0
            r14.A0B = r3
            r3.getClass()
            X.WMI r2 = new X.WMI
            r2.<init>(r3)
            long r0 = r14.A06
            r4.A00 = r0
            r4.A01 = r2
            r4.A00 = r0
            return r4
        L_0x0048:
            java.util.PriorityQueue r3 = r14.A0N
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0008
            java.lang.Object r0 = r3.peek()
            X.4PQ r0 = (X.AnonymousClass4PQ) r0
            long r5 = r0.A01
            long r1 = r14.A06
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0008
            java.lang.Object r3 = r3.poll()
            X.4PQ r3 = (X.AnonymousClass4PQ) r3
            r6 = 4
            int r0 = r3.A00
            r0 = r0 & 4
            if (r0 != r6) goto L_0x0080
            java.lang.Object r4 = r4.pollFirst()
            X.4PR r4 = (X.AnonymousClass4PR) r4
            int r0 = r4.A00
            r0 = r0 | 4
            r4.A00 = r0
        L_0x0077:
            r3.clear()
            java.util.ArrayDeque r0 = r14.A0K
            r0.add(r3)
            return r4
        L_0x0080:
            java.nio.ByteBuffer r0 = r3.A02
            r0.getClass()
            X.4XV r5 = r14.A0J
            byte[] r1 = r0.array()
            int r0 = r0.limit()
            r5.A0I(r1, r0)
            r2 = 1
            r13 = 0
        L_0x0094:
            int r7 = r5.A00
            int r0 = r5.A01
            int r7 = r7 - r0
            int r1 = r14.A0F
            if (r7 < r1) goto L_0x0317
            r0 = 2
            if (r1 != r0) goto L_0x0310
            r9 = -4
        L_0x00a1:
            int r12 = r5.A02()
            int r7 = r5.A02()
            r0 = r9 & 2
            if (r0 != 0) goto L_0x0094
            r1 = r9 & 1
            int r0 = r14.A0H
            if (r1 != r0) goto L_0x0094
            r0 = r12 & 127(0x7f, float:1.78E-43)
            byte r11 = (byte) r0
            r0 = r7 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r0
            if (r11 != 0) goto L_0x00be
            if (r8 != 0) goto L_0x00be
            goto L_0x0094
        L_0x00be:
            boolean r10 = r14.A0C
            r0 = r9 & 4
            if (r0 != r6) goto L_0x00cf
            boolean[] r1 = A0V
            boolean r0 = r1[r12]
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r1[r7]
            r9 = 1
            if (r0 != 0) goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            r14.A0C = r9
            r7 = 0
            if (r9 == 0) goto L_0x00ea
            r1 = r11 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L_0x00ea
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x00f5
            byte r0 = r14.A00
            if (r0 != r11) goto L_0x00f5
            byte r0 = r14.A01
            if (r0 != r8) goto L_0x00f5
            r14.A0E = r7
            goto L_0x0094
        L_0x00ea:
            r14.A0E = r7
            if (r9 != 0) goto L_0x00fb
            if (r10 == 0) goto L_0x0094
        L_0x00f0:
            r14.A01()
        L_0x00f3:
            r13 = 1
            goto L_0x0094
        L_0x00f5:
            r14.A0E = r2
            r14.A00 = r11
            r14.A01 = r8
        L_0x00fb:
            if (r2 > r11) goto L_0x0182
            r0 = 15
            if (r11 > r0) goto L_0x0182
        L_0x0101:
            r14.A0D = r7
        L_0x0103:
            boolean r0 = r14.A0D
            if (r0 == 0) goto L_0x0094
            r7 = r11 & 224(0xe0, float:3.14E-43)
            if (r7 != 0) goto L_0x0111
            int r0 = r11 >> 3
            r0 = r0 & 1
            r14.A04 = r0
        L_0x0111:
            int r1 = r14.A04
            int r0 = r14.A0G
            if (r1 != r0) goto L_0x0094
            if (r7 != 0) goto L_0x015e
            r10 = r11 & 247(0xf7, float:3.46E-43)
            r0 = 17
            if (r10 != r0) goto L_0x013c
            r1 = r8 & 240(0xf0, float:3.36E-43)
            r0 = 48
            if (r1 != r0) goto L_0x013c
            X.Vv8 r7 = r14.A08
            r1 = r8 & 15
            int[] r0 = A0R
            r0 = r0[r1]
            char r0 = (char) r0
        L_0x012e:
            java.lang.StringBuilder r8 = r7.A05
            int r7 = r8.length()
            r1 = 32
            if (r7 >= r1) goto L_0x00f3
            r8.append(r0)
            goto L_0x00f3
        L_0x013c:
            r7 = r11 & 246(0xf6, float:3.45E-43)
            r0 = 18
            if (r7 != r0) goto L_0x019b
            r1 = r8 & 224(0xe0, float:3.14E-43)
            r0 = 32
            if (r1 != r0) goto L_0x019b
            X.Vv8 r0 = r14.A08
            r0.A02()
            X.Vv8 r7 = r14.A08
            r0 = r11 & 1
            r1 = r8 & 31
            if (r0 != 0) goto L_0x015b
            int[] r0 = A0S
        L_0x0157:
            r0 = r0[r1]
            char r0 = (char) r0
            goto L_0x012e
        L_0x015b:
            int[] r0 = A0T
            goto L_0x0157
        L_0x015e:
            X.Vv8 r7 = r14.A08
            r0 = r11 & 127(0x7f, float:1.78E-43)
            int r0 = r0 + -32
            int[] r11 = A0O
            r0 = r11[r0]
            char r10 = (char) r0
            java.lang.StringBuilder r9 = r7.A05
            int r1 = r9.length()
            r0 = 32
            if (r1 >= r0) goto L_0x0176
            r9.append(r10)
        L_0x0176:
            r0 = r8 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x00f3
            r0 = r8 & 127(0x7f, float:1.78E-43)
            int r0 = r0 + -32
            r0 = r11[r0]
            char r0 = (char) r0
            goto L_0x012e
        L_0x0182:
            r1 = r11 & 247(0xf7, float:3.46E-43)
            r0 = 20
            if (r1 != r0) goto L_0x0103
            r0 = 32
            if (r8 == r0) goto L_0x0198
            r0 = 47
            if (r8 == r0) goto L_0x0198
            switch(r8) {
                case 37: goto L_0x0198;
                case 38: goto L_0x0198;
                case 39: goto L_0x0198;
                default: goto L_0x0193;
            }
        L_0x0193:
            switch(r8) {
                case 41: goto L_0x0198;
                case 42: goto L_0x0101;
                case 43: goto L_0x0101;
                default: goto L_0x0196;
            }
        L_0x0196:
            goto L_0x0103
        L_0x0198:
            r7 = 1
            goto L_0x0101
        L_0x019b:
            r0 = 17
            if (r10 != r0) goto L_0x01cb
            r0 = r8 & 240(0xf0, float:3.36E-43)
            r9 = 32
            if (r0 != r9) goto L_0x01cb
            X.Vv8 r7 = r14.A08
            java.lang.StringBuilder r1 = r7.A05
            int r0 = r1.length()
            if (r0 >= r9) goto L_0x01b2
            r1.append(r9)
        L_0x01b2:
            r0 = r8 & 1
            boolean r9 = X.AnonymousClass7TF.A1S(r0, r2)
            int r8 = r8 >> r2
            r8 = r8 & 7
            java.util.List r7 = r7.A06
            int r1 = r1.length()
            X.VV5 r0 = new X.VV5
            r0.<init>(r8, r9, r1)
            r7.add(r0)
            goto L_0x00f3
        L_0x01cb:
            r1 = r11 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L_0x024c
            r1 = r8 & 192(0xc0, float:2.69E-43)
            r0 = 64
            if (r1 != r0) goto L_0x024c
            int[] r1 = A0Q
            r0 = r11 & 7
            r10 = r1[r0]
            r0 = r8 & 32
            r9 = 0
            if (r0 == 0) goto L_0x01e4
            int r10 = r10 + 1
        L_0x01e4:
            X.Vv8 r12 = r14.A08
            int r0 = r12.A03
            if (r10 == r0) goto L_0x020a
            int r0 = r14.A02
            if (r0 == r2) goto L_0x0206
            java.util.List r0 = r12.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x023b
            java.util.List r0 = r12.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x023b
            java.lang.StringBuilder r0 = r12.A05
            int r0 = r0.length()
            if (r0 != 0) goto L_0x023b
        L_0x0206:
            X.Vv8 r12 = r14.A08
            r12.A03 = r10
        L_0x020a:
            r1 = r8 & 16
            r0 = 16
            boolean r11 = X.AnonymousClass7TF.A1S(r1, r0)
            r0 = r8 & 1
            if (r0 != r2) goto L_0x0217
            r9 = 1
        L_0x0217:
            int r8 = r8 >> r2
            r10 = r8 & 7
            r8 = r10
            if (r11 == 0) goto L_0x021f
            r8 = 8
        L_0x021f:
            java.util.List r7 = r12.A06
            java.lang.StringBuilder r0 = r12.A05
            int r1 = r0.length()
            X.VV5 r0 = new X.VV5
            r0.<init>(r8, r9, r1)
            r7.add(r0)
            if (r11 == 0) goto L_0x00f3
            X.Vv8 r1 = r14.A08
            int[] r0 = A0P
            r0 = r0[r10]
            r1.A02 = r0
            goto L_0x00f3
        L_0x023b:
            int r7 = r14.A02
            int r0 = r14.A03
            X.Vv8 r1 = new X.Vv8
            r1.<init>(r7, r0)
            r14.A08 = r1
            java.util.ArrayList r0 = r14.A0M
            r0.add(r1)
            goto L_0x0206
        L_0x024c:
            r0 = 23
            if (r10 != r0) goto L_0x0260
            r0 = 33
            if (r8 < r0) goto L_0x0260
            r0 = 35
            if (r8 > r0) goto L_0x0260
            X.Vv8 r1 = r14.A08
            int r0 = r8 + -32
            r1.A04 = r0
            goto L_0x00f3
        L_0x0260:
            r0 = 20
            if (r7 != r0) goto L_0x00f3
            r1 = r8 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x00f3
            r1 = 2
            if (r8 == r0) goto L_0x030b
            r0 = 41
            r7 = 3
            if (r8 == r0) goto L_0x0306
            switch(r8) {
                case 37: goto L_0x02e5;
                case 38: goto L_0x02f0;
                case 39: goto L_0x02fb;
                default: goto L_0x0275;
            }
        L_0x0275:
            int r1 = r14.A02
            if (r1 == 0) goto L_0x00f3
            r0 = 33
            if (r8 == r0) goto L_0x02de
            switch(r8) {
                case 44: goto L_0x0282;
                case 45: goto L_0x0290;
                case 46: goto L_0x00f0;
                case 47: goto L_0x02d6;
                default: goto L_0x0280;
            }
        L_0x0280:
            goto L_0x00f3
        L_0x0282:
            java.util.List r0 = java.util.Collections.emptyList()
            r14.A0A = r0
            int r0 = r14.A02
            if (r0 == r2) goto L_0x00f0
            if (r0 != r7) goto L_0x00f3
            goto L_0x00f0
        L_0x0290:
            if (r1 != r2) goto L_0x00f3
            X.Vv8 r1 = r14.A08
            java.util.List r0 = r1.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02ae
            java.util.List r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02ae
            java.lang.StringBuilder r0 = r1.A05
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02ae
            goto L_0x00f3
        L_0x02ae:
            X.Vv8 r9 = r14.A08
            java.util.List r8 = r9.A07
            android.text.SpannableString r0 = X.C18615Vv8.A00(r9)
            r8.add(r0)
            java.lang.StringBuilder r0 = r9.A05
            r7 = 0
            r0.setLength(r7)
            java.util.List r0 = r9.A06
            r0.clear()
            int r1 = r9.A01
            int r0 = r9.A03
            int r1 = java.lang.Math.min(r1, r0)
        L_0x02cc:
            int r0 = r8.size()
            if (r0 < r1) goto L_0x00f3
            r8.remove(r7)
            goto L_0x02cc
        L_0x02d6:
            java.util.ArrayList r0 = r14.A00()
            r14.A0A = r0
            goto L_0x00f0
        L_0x02de:
            X.Vv8 r0 = r14.A08
            r0.A02()
            goto L_0x00f3
        L_0x02e5:
            r14.A02(r2)
            r14.A03 = r1
            X.Vv8 r0 = r14.A08
            r0.A01 = r1
            goto L_0x00f3
        L_0x02f0:
            r14.A02(r2)
            r14.A03 = r7
            X.Vv8 r0 = r14.A08
            r0.A01 = r7
            goto L_0x00f3
        L_0x02fb:
            r14.A02(r2)
            r14.A03 = r6
            X.Vv8 r0 = r14.A08
            r0.A01 = r6
            goto L_0x00f3
        L_0x0306:
            r14.A02(r7)
            goto L_0x00f3
        L_0x030b:
            r14.A02(r1)
            goto L_0x00f3
        L_0x0310:
            int r0 = r5.A02()
            byte r9 = (byte) r0
            goto L_0x00a1
        L_0x0317:
            if (r13 == 0) goto L_0x032a
            int r1 = r14.A02
            if (r1 == r2) goto L_0x0320
            r0 = 3
            if (r1 != r0) goto L_0x032a
        L_0x0320:
            java.util.ArrayList r0 = r14.A00()
            r14.A0A = r0
            long r0 = r14.A06
            r14.A05 = r0
        L_0x032a:
            java.util.List r1 = r14.A0A
            java.util.List r0 = r14.A0B
            if (r1 == r0) goto L_0x034a
            r14.A0B = r1
            r1.getClass()
            X.WMI r2 = new X.WMI
            r2.<init>(r1)
            java.lang.Object r4 = r4.pollFirst()
            X.5qa r4 = (X.C296755qa) r4
            long r0 = r3.A01
            r4.A00 = r0
            r4.A01 = r2
            r4.A00 = r0
            goto L_0x0077
        L_0x034a:
            r3.clear()
            java.util.ArrayDeque r0 = r14.A0K
            r0.add(r3)
            goto L_0x0048
        L_0x0354:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WMJ.AOk():java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void E5x(Object obj) {
        AbstractCollection abstractCollection;
        C296745qZ r5 = (C296745qZ) obj;
        C256703wD.A03(AnonymousClass7TF.A1W(r5, this.A09));
        UW5 uw5 = (UW5) r5;
        if ((uw5.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE) {
            uw5.clear();
            abstractCollection = this.A0K;
        } else {
            long j = this.A07;
            this.A07 = 1 + j;
            AnonymousClass4PQ r0 = AnonymousClass4PQ.$redex_init_class;
            uw5.A00 = j;
            abstractCollection = this.A0N;
        }
        abstractCollection.add(uw5);
        this.A09 = null;
    }

    public final void EgB(long j) {
        this.A06 = j;
    }

    public final void flush() {
        this.A07 = 0;
        this.A06 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.A0N;
            if (priorityQueue.isEmpty()) {
                break;
            }
            AnonymousClass4PR r1 = (AnonymousClass4PR) priorityQueue.poll();
            r1.clear();
            this.A0K.add(r1);
        }
        UW5 uw5 = this.A09;
        if (uw5 != null) {
            uw5.clear();
            this.A0K.add(uw5);
            this.A09 = null;
        }
        this.A0A = null;
        this.A0B = null;
        A02(0);
        this.A03 = 4;
        this.A08.A01 = 4;
        A01();
        this.A0C = false;
        this.A0E = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = 0;
        this.A0D = true;
        this.A05 = -9223372036854775807L;
    }

    public WMJ(String str, int i) {
        this();
        this.A0J = new AnonymousClass4XV();
        this.A0M = new ArrayList();
        this.A08 = new C18615Vv8(0, 4);
        this.A04 = 0;
        this.A0I = -9223372036854775807L;
        this.A0F = AnonymousClass000.A00(1093).equals(str) ? 2 : 3;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.A0G = 0;
                } else if (i != 4) {
                    2AG.A04("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                } else {
                    this.A0G = 1;
                }
                this.A0H = 1;
                A02(0);
                A01();
                this.A0D = true;
                this.A05 = -9223372036854775807L;
            }
            this.A0G = 1;
            this.A0H = 0;
            A02(0);
            A01();
            this.A0D = true;
            this.A05 = -9223372036854775807L;
        }
        this.A0G = 0;
        this.A0H = 0;
        A02(0);
        A01();
        this.A0D = true;
        this.A05 = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.UW6, java.lang.Object] */
    public WMJ() {
        this.A0K = new ArrayDeque();
        int i = 0;
        int i2 = 0;
        do {
            this.A0K.add(new C296745qZ());
            i2++;
        } while (i2 < 10);
        this.A0L = new ArrayDeque();
        do {
            ArrayDeque arrayDeque = this.A0L;
            WM5 wm5 = new WM5(this);
            ? obj = new Object();
            obj.A00 = wm5;
            arrayDeque.add(obj);
            i++;
        } while (i < 2);
        this.A0N = new PriorityQueue();
    }
}
