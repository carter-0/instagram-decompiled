package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.4gb  reason: invalid class name and case insensitive filesystem */
public final class C270354gb {
    public static SparseIntArray A02 = new SparseIntArray();
    public static SparseIntArray A03 = new SparseIntArray();
    public static final int[] A04 = {0, 4, 8};
    public HashMap A00 = new HashMap();
    public HashMap A01 = new HashMap();

    static {
        A02.append(82, 25);
        A02.append(83, 26);
        A02.append(85, 29);
        A02.append(86, 30);
        A02.append(92, 36);
        A02.append(91, 35);
        A02.append(63, 4);
        A02.append(62, 3);
        A02.append(58, 1);
        A02.append(60, 91);
        A02.append(59, 92);
        A02.append(101, 6);
        A02.append(102, 7);
        A02.append(70, 17);
        A02.append(71, 18);
        A02.append(72, 19);
        A02.append(54, 99);
        A02.append(0, 27);
        A02.append(87, 32);
        A02.append(88, 33);
        A02.append(69, 10);
        A02.append(68, 9);
        A02.append(106, 13);
        A02.append(109, 16);
        A02.append(107, 14);
        A02.append(104, 11);
        A02.append(108, 15);
        A02.append(105, 12);
        A02.append(95, 40);
        A02.append(80, 39);
        A02.append(79, 41);
        A02.append(94, 42);
        A02.append(78, 20);
        A02.append(93, 37);
        A02.append(67, 5);
        A02.append(81, 87);
        A02.append(90, 87);
        A02.append(84, 87);
        A02.append(61, 87);
        A02.append(57, 87);
        A02.append(5, 24);
        A02.append(7, 28);
        A02.append(23, 31);
        A02.append(24, 8);
        A02.append(6, 34);
        A02.append(8, 2);
        A02.append(3, 23);
        A02.append(4, 21);
        A02.append(96, 95);
        A02.append(73, 96);
        A02.append(2, 22);
        A02.append(13, 43);
        A02.append(26, 44);
        A02.append(21, 45);
        A02.append(22, 46);
        A02.append(20, 60);
        A02.append(18, 47);
        A02.append(19, 48);
        A02.append(14, 49);
        A02.append(15, 50);
        A02.append(16, 51);
        A02.append(17, 52);
        A02.append(25, 53);
        A02.append(97, 54);
        A02.append(74, 55);
        A02.append(98, 56);
        A02.append(75, 57);
        A02.append(99, 58);
        A02.append(76, 59);
        A02.append(64, 61);
        A02.append(66, 62);
        A02.append(65, 63);
        A02.append(28, 64);
        A02.append(121, 65);
        A02.append(35, 66);
        A02.append(122, 67);
        A02.append(113, 79);
        A02.append(1, 38);
        A02.append(112, 68);
        A02.append(100, 69);
        A02.append(77, 70);
        A02.append(111, 97);
        A02.append(32, 71);
        A02.append(30, 72);
        A02.append(31, 73);
        A02.append(33, 74);
        A02.append(29, 75);
        A02.append(114, 76);
        A02.append(89, 77);
        A02.append(123, 78);
        A02.append(56, 80);
        A02.append(55, 81);
        A02.append(116, 82);
        A02.append(120, 83);
        A02.append(119, 84);
        A02.append(118, 85);
        A02.append(117, 86);
        A03.append(85, 6);
        A03.append(85, 7);
        A03.append(0, 27);
        A03.append(89, 13);
        A03.append(92, 16);
        A03.append(90, 14);
        A03.append(87, 11);
        A03.append(91, 15);
        A03.append(88, 12);
        A03.append(78, 40);
        A03.append(71, 39);
        A03.append(70, 41);
        A03.append(77, 42);
        A03.append(69, 20);
        A03.append(76, 37);
        A03.append(60, 5);
        A03.append(72, 87);
        A03.append(75, 87);
        A03.append(73, 87);
        A03.append(57, 87);
        A03.append(56, 87);
        A03.append(5, 24);
        A03.append(7, 28);
        A03.append(23, 31);
        A03.append(24, 8);
        A03.append(6, 34);
        A03.append(8, 2);
        A03.append(3, 23);
        A03.append(4, 21);
        A03.append(79, 95);
        A03.append(64, 96);
        A03.append(2, 22);
        A03.append(13, 43);
        A03.append(26, 44);
        A03.append(21, 45);
        A03.append(22, 46);
        A03.append(20, 60);
        A03.append(18, 47);
        A03.append(19, 48);
        A03.append(14, 49);
        A03.append(15, 50);
        A03.append(16, 51);
        A03.append(17, 52);
        A03.append(25, 53);
        A03.append(80, 54);
        A03.append(65, 55);
        A03.append(81, 56);
        A03.append(66, 57);
        A03.append(82, 58);
        A03.append(67, 59);
        A03.append(59, 62);
        A03.append(58, 63);
        A03.append(28, 64);
        A03.append(105, 65);
        A03.append(34, 66);
        A03.append(106, 67);
        A03.append(96, 79);
        A03.append(1, 38);
        A03.append(97, 98);
        A03.append(95, 68);
        A03.append(83, 69);
        A03.append(68, 70);
        A03.append(32, 71);
        A03.append(30, 72);
        A03.append(31, 73);
        A03.append(33, 74);
        A03.append(29, 75);
        A03.append(98, 76);
        A03.append(74, 77);
        A03.append(107, 78);
        A03.append(55, 80);
        A03.append(54, 81);
        A03.append(100, 82);
        A03.append(104, 83);
        A03.append(103, 84);
        A03.append(102, 85);
        A03.append(101, 86);
        A03.append(94, 97);
    }

    public static String A03(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    public final void A0D(int i, int i2, int i3, int i4) {
        A0E(i, i2, i3, i4, 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c2, code lost:
        r12.A01(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d9, code lost:
        r0 = r10.getDimensionPixelSize(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02dd, code lost:
        r12.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        r1.append(r0);
        r1.append(java.lang.Integer.toHexString(r14));
        r1.append("   ");
        r1.append(A02.get(r14));
        android.util.Log.w("ConstraintSet", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0074, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018c, code lost:
        r0 = r10.getDimension(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0213, code lost:
        r12.A02(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022b, code lost:
        r0 = r10.getInt(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0235, code lost:
        r0 = r10.getFloat(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0239, code lost:
        r12.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0247, code lost:
        r12.A03(r1, r10.getBoolean(r14, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C320056rh A01(android.content.Context r17, android.util.AttributeSet r18, boolean r19) {
        /*
            X.6rh r11 = new X.6rh
            r11.<init>()
            if (r19 == 0) goto L_0x0303
            int[] r0 = X.C71482dO.A02
        L_0x0009:
            r2 = r17
            r1 = r18
            android.content.res.TypedArray r10 = r2.obtainStyledAttributes(r1, r0)
            if (r19 == 0) goto L_0x0307
            int r19 = r10.getIndexCount()
            X.A9y r12 = new X.A9y
            r12.<init>()
            r11.A01 = r12
            X.6rj r9 = r11.A04
            r8 = 0
            r9.A0C = r8
            X.6rk r7 = r11.A03
            r7.A12 = r8
            X.6ri r6 = r11.A05
            r6.A04 = r8
            X.6rl r5 = r11.A06
            r5.A0D = r8
            r4 = 0
        L_0x0030:
            r0 = r19
            if (r4 >= r0) goto L_0x07eb
            int r14 = r10.getIndex(r4)
            android.util.SparseIntArray r0 = A03
            int r18 = r0.get(r14)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r17 = "   "
            r13 = 3
            r16 = 21
            r1 = 17
            java.lang.String r2 = "ConstraintSet"
            r15 = 1
            r3 = -1
            switch(r18) {
                case 2: goto L_0x007d;
                case 3: goto L_0x004e;
                case 4: goto L_0x004e;
                case 5: goto L_0x0086;
                case 6: goto L_0x0089;
                case 7: goto L_0x0092;
                case 8: goto L_0x009b;
                case 9: goto L_0x004e;
                case 10: goto L_0x004e;
                case 11: goto L_0x00a1;
                case 12: goto L_0x00a7;
                case 13: goto L_0x00ad;
                case 14: goto L_0x00b3;
                case 15: goto L_0x00b9;
                case 16: goto L_0x00bf;
                case 17: goto L_0x00c5;
                case 18: goto L_0x00cd;
                case 19: goto L_0x00e3;
                case 20: goto L_0x00e9;
                case 21: goto L_0x00ef;
                case 22: goto L_0x00fc;
                case 23: goto L_0x010d;
                case 24: goto L_0x0117;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x0123;
                case 28: goto L_0x0129;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x0077;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x012f;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x0135;
                case 38: goto L_0x02b8;
                case 39: goto L_0x013b;
                case 40: goto L_0x0141;
                case 41: goto L_0x0147;
                case 42: goto L_0x014d;
                case 43: goto L_0x0153;
                case 44: goto L_0x0159;
                case 45: goto L_0x0161;
                case 46: goto L_0x0167;
                case 47: goto L_0x016d;
                case 48: goto L_0x0173;
                case 49: goto L_0x0179;
                case 50: goto L_0x017e;
                case 51: goto L_0x0183;
                case 52: goto L_0x0188;
                case 53: goto L_0x00d7;
                case 54: goto L_0x0192;
                case 55: goto L_0x0198;
                case 56: goto L_0x019e;
                case 57: goto L_0x01a4;
                case 58: goto L_0x01aa;
                case 59: goto L_0x01b0;
                case 60: goto L_0x01b6;
                case 61: goto L_0x004e;
                case 62: goto L_0x01bb;
                case 63: goto L_0x01c1;
                case 64: goto L_0x01c6;
                case 65: goto L_0x01d0;
                case 66: goto L_0x01e3;
                case 67: goto L_0x01eb;
                case 68: goto L_0x01f0;
                case 69: goto L_0x01f5;
                case 70: goto L_0x01f8;
                case 71: goto L_0x01fb;
                case 72: goto L_0x0202;
                case 73: goto L_0x0207;
                case 74: goto L_0x020d;
                case 75: goto L_0x021d;
                case 76: goto L_0x0222;
                case 77: goto L_0x0082;
                case 78: goto L_0x0227;
                case 79: goto L_0x0231;
                case 80: goto L_0x023e;
                case 81: goto L_0x0243;
                case 82: goto L_0x0250;
                case 83: goto L_0x025a;
                case 84: goto L_0x0263;
                case 85: goto L_0x00dd;
                case 86: goto L_0x026c;
                case 87: goto L_0x02c7;
                case 88: goto L_0x004e;
                case 89: goto L_0x004e;
                case 90: goto L_0x004e;
                case 91: goto L_0x004e;
                case 92: goto L_0x004e;
                case 93: goto L_0x02d0;
                case 94: goto L_0x02d5;
                case 95: goto L_0x02e2;
                case 96: goto L_0x02e7;
                case 97: goto L_0x011d;
                case 98: goto L_0x02ec;
                case 99: goto L_0x0218;
                default: goto L_0x004e;
            }
        L_0x004e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown attribute 0x"
        L_0x0055:
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r14)
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            android.util.SparseIntArray r0 = A02
            int r0 = r0.get(r14)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x0074:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0077:
            r1 = 31
            int r0 = r7.A0m
            goto L_0x02d9
        L_0x007d:
            r1 = 2
            int r0 = r7.A0C
            goto L_0x02d9
        L_0x0082:
            r2 = 77
            goto L_0x020f
        L_0x0086:
            r2 = 5
            goto L_0x020f
        L_0x0089:
            r1 = 6
            int r0 = r7.A0H
            int r0 = r10.getDimensionPixelOffset(r14, r0)
            goto L_0x02dd
        L_0x0092:
            r1 = 7
            int r0 = r7.A0I
            int r0 = r10.getDimensionPixelOffset(r14, r0)
            goto L_0x02dd
        L_0x009b:
            r1 = 8
            int r0 = r7.A0J
            goto L_0x02d9
        L_0x00a1:
            r1 = 11
            int r0 = r7.A0N
            goto L_0x02d9
        L_0x00a7:
            r1 = 12
            int r0 = r7.A0O
            goto L_0x02d9
        L_0x00ad:
            r1 = 13
            int r0 = r7.A0P
            goto L_0x02d9
        L_0x00b3:
            r1 = 14
            int r0 = r7.A0Q
            goto L_0x02d9
        L_0x00b9:
            r1 = 15
            int r0 = r7.A0R
            goto L_0x02d9
        L_0x00bf:
            r1 = 16
            int r0 = r7.A0S
            goto L_0x02d9
        L_0x00c5:
            int r0 = r7.A0T
            int r0 = r10.getDimensionPixelOffset(r14, r0)
            goto L_0x02dd
        L_0x00cd:
            r1 = 18
            int r0 = r7.A0U
            int r0 = r10.getDimensionPixelOffset(r14, r0)
            goto L_0x02dd
        L_0x00d7:
            r1 = 53
            float r0 = r5.A0A
            goto L_0x018c
        L_0x00dd:
            r1 = 85
            float r0 = r9.A02
            goto L_0x0235
        L_0x00e3:
            r1 = 19
            float r0 = r7.A01
            goto L_0x0235
        L_0x00e9:
            r1 = 20
            float r0 = r7.A03
            goto L_0x0235
        L_0x00ef:
            int r0 = r7.A0e
            int r1 = r10.getLayoutDimension(r14, r0)
            r0 = r16
            r12.A01(r0, r1)
            goto L_0x0074
        L_0x00fc:
            r2 = 22
            int[] r1 = A04
            int r0 = r6.A03
            int r0 = r10.getInt(r14, r0)
            r0 = r1[r0]
            r12.A01(r2, r0)
            goto L_0x0074
        L_0x010d:
            r1 = 23
            int r0 = r7.A0g
            int r0 = r10.getLayoutDimension(r14, r0)
            goto L_0x02dd
        L_0x0117:
            r1 = 24
            int r0 = r7.A0Z
            goto L_0x02d9
        L_0x011d:
            r1 = 97
            int r0 = r7.A0h
            goto L_0x022b
        L_0x0123:
            r1 = 27
            int r0 = r7.A0i
            goto L_0x022b
        L_0x0129:
            r1 = 28
            int r0 = r7.A0j
            goto L_0x02d9
        L_0x012f:
            r1 = 34
            int r0 = r7.A0p
            goto L_0x02d9
        L_0x0135:
            r1 = 37
            float r0 = r7.A05
            goto L_0x0235
        L_0x013b:
            r1 = 39
            float r0 = r7.A04
            goto L_0x0235
        L_0x0141:
            r1 = 40
            float r0 = r7.A06
            goto L_0x0235
        L_0x0147:
            r1 = 41
            int r0 = r7.A0Y
            goto L_0x022b
        L_0x014d:
            r1 = 42
            int r0 = r7.A0s
            goto L_0x022b
        L_0x0153:
            r1 = 43
            float r0 = r6.A00
            goto L_0x0235
        L_0x0159:
            r1 = 44
            r12.A03(r1, r15)
            float r0 = r5.A00
            goto L_0x018c
        L_0x0161:
            r1 = 45
            float r0 = r5.A02
            goto L_0x0235
        L_0x0167:
            r1 = 46
            float r0 = r5.A03
            goto L_0x0235
        L_0x016d:
            r1 = 47
            float r0 = r5.A04
            goto L_0x0235
        L_0x0173:
            r1 = 48
            float r0 = r5.A05
            goto L_0x0235
        L_0x0179:
            r1 = 49
            float r0 = r5.A06
            goto L_0x018c
        L_0x017e:
            r1 = 50
            float r0 = r5.A07
            goto L_0x018c
        L_0x0183:
            r1 = 51
            float r0 = r5.A08
            goto L_0x018c
        L_0x0188:
            r1 = 52
            float r0 = r5.A09
        L_0x018c:
            float r0 = r10.getDimension(r14, r0)
            goto L_0x0239
        L_0x0192:
            r1 = 54
            int r0 = r7.A0t
            goto L_0x022b
        L_0x0198:
            r1 = 55
            int r0 = r7.A0V
            goto L_0x022b
        L_0x019e:
            r1 = 56
            int r0 = r7.A0u
            goto L_0x02d9
        L_0x01a4:
            r1 = 57
            int r0 = r7.A0W
            goto L_0x02d9
        L_0x01aa:
            r1 = 58
            int r0 = r7.A0v
            goto L_0x02d9
        L_0x01b0:
            r1 = 59
            int r0 = r7.A0X
            goto L_0x02d9
        L_0x01b6:
            r1 = 60
            float r0 = r5.A01
            goto L_0x0235
        L_0x01bb:
            r1 = 62
            int r0 = r7.A0G
            goto L_0x02d9
        L_0x01c1:
            r1 = 63
            float r0 = r7.A00
            goto L_0x0235
        L_0x01c6:
            r1 = 64
            int r0 = r9.A04
            int r0 = A00(r10, r14, r0)
            goto L_0x02dd
        L_0x01d0:
            android.util.TypedValue r0 = r10.peekValue(r14)
            int r0 = r0.type
            r2 = 65
            if (r0 == r13) goto L_0x020f
            java.lang.String[] r1 = X.VJI.A00
            int r0 = r10.getInteger(r14, r8)
            r0 = r1[r0]
            goto L_0x0213
        L_0x01e3:
            r1 = 66
            int r0 = r10.getInt(r14, r8)
            goto L_0x02dd
        L_0x01eb:
            r1 = 67
            float r0 = r9.A01
            goto L_0x0235
        L_0x01f0:
            r1 = 68
            float r0 = r6.A01
            goto L_0x0235
        L_0x01f5:
            r1 = 69
            goto L_0x0235
        L_0x01f8:
            r1 = 70
            goto L_0x0235
        L_0x01fb:
            java.lang.String r0 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r2, r0)
            goto L_0x0074
        L_0x0202:
            r1 = 72
            int r0 = r7.A0c
            goto L_0x022b
        L_0x0207:
            r1 = 73
            int r0 = r7.A0d
            goto L_0x02d9
        L_0x020d:
            r2 = 74
        L_0x020f:
            java.lang.String r0 = r10.getString(r14)
        L_0x0213:
            r12.A02(r2, r0)
            goto L_0x0074
        L_0x0218:
            r1 = 99
            boolean r0 = r7.A11
            goto L_0x0247
        L_0x021d:
            r1 = 75
            boolean r0 = r7.A13
            goto L_0x0247
        L_0x0222:
            r1 = 76
            int r0 = r9.A06
            goto L_0x022b
        L_0x0227:
            r1 = 78
            int r0 = r6.A02
        L_0x022b:
            int r0 = r10.getInt(r14, r0)
            goto L_0x02dd
        L_0x0231:
            r1 = 79
            float r0 = r9.A00
        L_0x0235:
            float r0 = r10.getFloat(r14, r0)
        L_0x0239:
            r12.A00(r1, r0)
            goto L_0x0074
        L_0x023e:
            r1 = 80
            boolean r0 = r7.A10
            goto L_0x0247
        L_0x0243:
            r1 = 81
            boolean r0 = r7.A0z
        L_0x0247:
            boolean r0 = r10.getBoolean(r14, r0)
            r12.A03(r1, r0)
            goto L_0x0074
        L_0x0250:
            r1 = 82
            int r0 = r9.A03
            int r0 = r10.getInteger(r14, r0)
            goto L_0x02dd
        L_0x025a:
            r1 = 83
            int r0 = r5.A0B
            int r0 = A00(r10, r14, r0)
            goto L_0x02dd
        L_0x0263:
            r1 = 84
            int r0 = r9.A09
            int r0 = r10.getInteger(r14, r0)
            goto L_0x02dd
        L_0x026c:
            android.util.TypedValue r17 = r10.peekValue(r14)
            r0 = r17
            int r0 = r0.type
            r16 = -2
            r2 = 89
            r1 = 88
            if (r0 != r15) goto L_0x028c
            int r0 = r10.getResourceId(r14, r3)
            r9.A08 = r0
            r12.A01(r2, r0)
            int r0 = r9.A08
            if (r0 == r3) goto L_0x0074
        L_0x0289:
            r0 = r16
            goto L_0x02dd
        L_0x028c:
            r0 = r17
            int r0 = r0.type
            if (r0 != r13) goto L_0x02b1
            java.lang.String r13 = r10.getString(r14)
            r9.A0A = r13
            r0 = 90
            r12.A02(r0, r13)
            java.lang.String r13 = r9.A0A
            java.lang.String r0 = "/"
            int r0 = r13.indexOf(r0)
            if (r0 <= 0) goto L_0x02c2
            int r0 = r10.getResourceId(r14, r3)
            r9.A08 = r0
            r12.A01(r2, r0)
            goto L_0x0289
        L_0x02b1:
            int r0 = r9.A08
            int r3 = r10.getInteger(r14, r0)
            goto L_0x02c2
        L_0x02b8:
            int r0 = r11.A00
            int r3 = r10.getResourceId(r14, r0)
            r11.A00 = r3
            r1 = 38
        L_0x02c2:
            r12.A01(r1, r3)
            goto L_0x0074
        L_0x02c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unused attribute 0x"
            goto L_0x0055
        L_0x02d0:
            r1 = 93
            int r0 = r7.A08
            goto L_0x02d9
        L_0x02d5:
            r1 = 94
            int r0 = r7.A0M
        L_0x02d9:
            int r0 = r10.getDimensionPixelSize(r14, r0)
        L_0x02dd:
            r12.A01(r1, r0)
            goto L_0x0074
        L_0x02e2:
            A04(r10, r12, r14, r8)
            goto L_0x0074
        L_0x02e7:
            A04(r10, r12, r14, r15)
            goto L_0x0074
        L_0x02ec:
            android.util.TypedValue r0 = r10.peekValue(r14)
            int r0 = r0.type
            if (r0 != r13) goto L_0x02f9
            r10.getString(r14)
            goto L_0x0074
        L_0x02f9:
            int r0 = r11.A00
            int r0 = r10.getResourceId(r14, r0)
            r11.A00 = r0
            goto L_0x0074
        L_0x0303:
            int[] r0 = X.C71482dO.A00
            goto L_0x0009
        L_0x0307:
            int r4 = r10.getIndexCount()
            r3 = 0
            r2 = 0
        L_0x030d:
            if (r2 >= r4) goto L_0x07e2
            int r5 = r10.getIndex(r2)
            r0 = 1
            r9 = 1
            if (r5 == r0) goto L_0x032f
            r0 = 23
            if (r0 == r5) goto L_0x032f
            r0 = 24
            if (r0 == r5) goto L_0x032f
            X.6rj r0 = r11.A04
            r0.A0C = r9
            X.6rk r0 = r11.A03
            r0.A12 = r9
            X.6ri r0 = r11.A05
            r0.A04 = r9
            X.6rl r0 = r11.A06
            r0.A0D = r9
        L_0x032f:
            android.util.SparseIntArray r12 = A02
            int r1 = r12.get(r5)
            java.lang.String r7 = "   "
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = 3
            java.lang.String r6 = "ConstraintSet"
            switch(r1) {
                case 1: goto L_0x0364;
                case 2: goto L_0x036f;
                case 3: goto L_0x037a;
                case 4: goto L_0x0385;
                case 5: goto L_0x0390;
                case 6: goto L_0x0399;
                case 7: goto L_0x03a4;
                case 8: goto L_0x03af;
                case 9: goto L_0x03ba;
                case 10: goto L_0x03c5;
                case 11: goto L_0x03d0;
                case 12: goto L_0x03db;
                case 13: goto L_0x03e7;
                case 14: goto L_0x03f3;
                case 15: goto L_0x03ff;
                case 16: goto L_0x040b;
                case 17: goto L_0x0417;
                case 18: goto L_0x0423;
                case 19: goto L_0x042f;
                case 20: goto L_0x043b;
                case 21: goto L_0x0447;
                case 22: goto L_0x0453;
                case 23: goto L_0x0465;
                case 24: goto L_0x0471;
                case 25: goto L_0x047d;
                case 26: goto L_0x0489;
                case 27: goto L_0x0495;
                case 28: goto L_0x04a1;
                case 29: goto L_0x04ad;
                case 30: goto L_0x04b9;
                case 31: goto L_0x04c5;
                case 32: goto L_0x04d1;
                case 33: goto L_0x04dd;
                case 34: goto L_0x04e9;
                case 35: goto L_0x04f5;
                case 36: goto L_0x0501;
                case 37: goto L_0x050d;
                case 38: goto L_0x0519;
                case 39: goto L_0x0523;
                case 40: goto L_0x052f;
                case 41: goto L_0x053b;
                case 42: goto L_0x0547;
                case 43: goto L_0x0553;
                case 44: goto L_0x055f;
                case 45: goto L_0x056d;
                case 46: goto L_0x0579;
                case 47: goto L_0x0585;
                case 48: goto L_0x0591;
                case 49: goto L_0x059d;
                case 50: goto L_0x05a9;
                case 51: goto L_0x05b5;
                case 52: goto L_0x05c1;
                case 53: goto L_0x05cd;
                case 54: goto L_0x05d9;
                case 55: goto L_0x05e5;
                case 56: goto L_0x05f1;
                case 57: goto L_0x05fd;
                case 58: goto L_0x0609;
                case 59: goto L_0x0615;
                case 60: goto L_0x0621;
                case 61: goto L_0x062d;
                case 62: goto L_0x0639;
                case 63: goto L_0x0645;
                case 64: goto L_0x0651;
                case 65: goto L_0x065d;
                case 66: goto L_0x0678;
                case 67: goto L_0x0682;
                case 68: goto L_0x068e;
                case 69: goto L_0x069a;
                case 70: goto L_0x06a4;
                case 71: goto L_0x06ae;
                case 72: goto L_0x06b5;
                case 73: goto L_0x06c1;
                case 74: goto L_0x06cd;
                case 75: goto L_0x06d7;
                case 76: goto L_0x06e3;
                case 77: goto L_0x06ef;
                case 78: goto L_0x06f9;
                case 79: goto L_0x0705;
                case 80: goto L_0x0711;
                case 81: goto L_0x071d;
                case 82: goto L_0x0729;
                case 83: goto L_0x0735;
                case 84: goto L_0x0741;
                case 85: goto L_0x074d;
                case 86: goto L_0x0759;
                case 87: goto L_0x078f;
                case 88: goto L_0x033f;
                case 89: goto L_0x033f;
                case 90: goto L_0x033f;
                case 91: goto L_0x0798;
                case 92: goto L_0x07a4;
                case 93: goto L_0x07b0;
                case 94: goto L_0x07bc;
                case 95: goto L_0x07c8;
                case 96: goto L_0x07cf;
                case 97: goto L_0x07d6;
                default: goto L_0x033f;
            }
        L_0x033f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown attribute 0x"
        L_0x0346:
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            r1.append(r0)
            r1.append(r7)
            int r0 = r12.get(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r6, r0)
        L_0x0361:
            int r2 = r2 + 1
            goto L_0x030d
        L_0x0364:
            X.6rk r1 = r11.A03
            int r0 = r1.A09
            int r0 = A00(r10, r5, r0)
            r1.A09 = r0
            goto L_0x0361
        L_0x036f:
            X.6rk r1 = r11.A03
            int r0 = r1.A0C
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0C = r0
            goto L_0x0361
        L_0x037a:
            X.6rk r1 = r11.A03
            int r0 = r1.A0D
            int r0 = A00(r10, r5, r0)
            r1.A0D = r0
            goto L_0x0361
        L_0x0385:
            X.6rk r1 = r11.A03
            int r0 = r1.A0E
            int r0 = A00(r10, r5, r0)
            r1.A0E = r0
            goto L_0x0361
        L_0x0390:
            X.6rk r1 = r11.A03
            java.lang.String r0 = r10.getString(r5)
            r1.A0w = r0
            goto L_0x0361
        L_0x0399:
            X.6rk r1 = r11.A03
            int r0 = r1.A0H
            int r0 = r10.getDimensionPixelOffset(r5, r0)
            r1.A0H = r0
            goto L_0x0361
        L_0x03a4:
            X.6rk r1 = r11.A03
            int r0 = r1.A0I
            int r0 = r10.getDimensionPixelOffset(r5, r0)
            r1.A0I = r0
            goto L_0x0361
        L_0x03af:
            X.6rk r1 = r11.A03
            int r0 = r1.A0J
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0J = r0
            goto L_0x0361
        L_0x03ba:
            X.6rk r1 = r11.A03
            int r0 = r1.A0K
            int r0 = A00(r10, r5, r0)
            r1.A0K = r0
            goto L_0x0361
        L_0x03c5:
            X.6rk r1 = r11.A03
            int r0 = r1.A0L
            int r0 = A00(r10, r5, r0)
            r1.A0L = r0
            goto L_0x0361
        L_0x03d0:
            X.6rk r1 = r11.A03
            int r0 = r1.A0N
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0N = r0
            goto L_0x0361
        L_0x03db:
            X.6rk r1 = r11.A03
            int r0 = r1.A0O
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0O = r0
            goto L_0x0361
        L_0x03e7:
            X.6rk r1 = r11.A03
            int r0 = r1.A0P
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0P = r0
            goto L_0x0361
        L_0x03f3:
            X.6rk r1 = r11.A03
            int r0 = r1.A0Q
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0Q = r0
            goto L_0x0361
        L_0x03ff:
            X.6rk r1 = r11.A03
            int r0 = r1.A0R
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0R = r0
            goto L_0x0361
        L_0x040b:
            X.6rk r1 = r11.A03
            int r0 = r1.A0S
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0S = r0
            goto L_0x0361
        L_0x0417:
            X.6rk r1 = r11.A03
            int r0 = r1.A0T
            int r0 = r10.getDimensionPixelOffset(r5, r0)
            r1.A0T = r0
            goto L_0x0361
        L_0x0423:
            X.6rk r1 = r11.A03
            int r0 = r1.A0U
            int r0 = r10.getDimensionPixelOffset(r5, r0)
            r1.A0U = r0
            goto L_0x0361
        L_0x042f:
            X.6rk r1 = r11.A03
            float r0 = r1.A01
            float r0 = r10.getFloat(r5, r0)
            r1.A01 = r0
            goto L_0x0361
        L_0x043b:
            X.6rk r1 = r11.A03
            float r0 = r1.A03
            float r0 = r10.getFloat(r5, r0)
            r1.A03 = r0
            goto L_0x0361
        L_0x0447:
            X.6rk r1 = r11.A03
            int r0 = r1.A0e
            int r0 = r10.getLayoutDimension(r5, r0)
            r1.A0e = r0
            goto L_0x0361
        L_0x0453:
            X.6ri r6 = r11.A05
            int r0 = r6.A03
            int r1 = r10.getInt(r5, r0)
            r6.A03 = r1
            int[] r0 = A04
            r0 = r0[r1]
            r6.A03 = r0
            goto L_0x0361
        L_0x0465:
            X.6rk r1 = r11.A03
            int r0 = r1.A0g
            int r0 = r10.getLayoutDimension(r5, r0)
            r1.A0g = r0
            goto L_0x0361
        L_0x0471:
            X.6rk r1 = r11.A03
            int r0 = r1.A0Z
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0Z = r0
            goto L_0x0361
        L_0x047d:
            X.6rk r1 = r11.A03
            int r0 = r1.A0a
            int r0 = A00(r10, r5, r0)
            r1.A0a = r0
            goto L_0x0361
        L_0x0489:
            X.6rk r1 = r11.A03
            int r0 = r1.A0b
            int r0 = A00(r10, r5, r0)
            r1.A0b = r0
            goto L_0x0361
        L_0x0495:
            X.6rk r1 = r11.A03
            int r0 = r1.A0i
            int r0 = r10.getInt(r5, r0)
            r1.A0i = r0
            goto L_0x0361
        L_0x04a1:
            X.6rk r1 = r11.A03
            int r0 = r1.A0j
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0j = r0
            goto L_0x0361
        L_0x04ad:
            X.6rk r1 = r11.A03
            int r0 = r1.A0k
            int r0 = A00(r10, r5, r0)
            r1.A0k = r0
            goto L_0x0361
        L_0x04b9:
            X.6rk r1 = r11.A03
            int r0 = r1.A0l
            int r0 = A00(r10, r5, r0)
            r1.A0l = r0
            goto L_0x0361
        L_0x04c5:
            X.6rk r1 = r11.A03
            int r0 = r1.A0m
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0m = r0
            goto L_0x0361
        L_0x04d1:
            X.6rk r1 = r11.A03
            int r0 = r1.A0n
            int r0 = A00(r10, r5, r0)
            r1.A0n = r0
            goto L_0x0361
        L_0x04dd:
            X.6rk r1 = r11.A03
            int r0 = r1.A0o
            int r0 = A00(r10, r5, r0)
            r1.A0o = r0
            goto L_0x0361
        L_0x04e9:
            X.6rk r1 = r11.A03
            int r0 = r1.A0p
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0p = r0
            goto L_0x0361
        L_0x04f5:
            X.6rk r1 = r11.A03
            int r0 = r1.A0q
            int r0 = A00(r10, r5, r0)
            r1.A0q = r0
            goto L_0x0361
        L_0x0501:
            X.6rk r1 = r11.A03
            int r0 = r1.A0r
            int r0 = A00(r10, r5, r0)
            r1.A0r = r0
            goto L_0x0361
        L_0x050d:
            X.6rk r1 = r11.A03
            float r0 = r1.A05
            float r0 = r10.getFloat(r5, r0)
            r1.A05 = r0
            goto L_0x0361
        L_0x0519:
            int r0 = r11.A00
            int r0 = r10.getResourceId(r5, r0)
            r11.A00 = r0
            goto L_0x0361
        L_0x0523:
            X.6rk r1 = r11.A03
            float r0 = r1.A04
            float r0 = r10.getFloat(r5, r0)
            r1.A04 = r0
            goto L_0x0361
        L_0x052f:
            X.6rk r1 = r11.A03
            float r0 = r1.A06
            float r0 = r10.getFloat(r5, r0)
            r1.A06 = r0
            goto L_0x0361
        L_0x053b:
            X.6rk r1 = r11.A03
            int r0 = r1.A0Y
            int r0 = r10.getInt(r5, r0)
            r1.A0Y = r0
            goto L_0x0361
        L_0x0547:
            X.6rk r1 = r11.A03
            int r0 = r1.A0s
            int r0 = r10.getInt(r5, r0)
            r1.A0s = r0
            goto L_0x0361
        L_0x0553:
            X.6ri r1 = r11.A05
            float r0 = r1.A00
            float r0 = r10.getFloat(r5, r0)
            r1.A00 = r0
            goto L_0x0361
        L_0x055f:
            X.6rl r1 = r11.A06
            r1.A0C = r9
            float r0 = r1.A00
            float r0 = r10.getDimension(r5, r0)
            r1.A00 = r0
            goto L_0x0361
        L_0x056d:
            X.6rl r1 = r11.A06
            float r0 = r1.A02
            float r0 = r10.getFloat(r5, r0)
            r1.A02 = r0
            goto L_0x0361
        L_0x0579:
            X.6rl r1 = r11.A06
            float r0 = r1.A03
            float r0 = r10.getFloat(r5, r0)
            r1.A03 = r0
            goto L_0x0361
        L_0x0585:
            X.6rl r1 = r11.A06
            float r0 = r1.A04
            float r0 = r10.getFloat(r5, r0)
            r1.A04 = r0
            goto L_0x0361
        L_0x0591:
            X.6rl r1 = r11.A06
            float r0 = r1.A05
            float r0 = r10.getFloat(r5, r0)
            r1.A05 = r0
            goto L_0x0361
        L_0x059d:
            X.6rl r1 = r11.A06
            float r0 = r1.A06
            float r0 = r10.getDimension(r5, r0)
            r1.A06 = r0
            goto L_0x0361
        L_0x05a9:
            X.6rl r1 = r11.A06
            float r0 = r1.A07
            float r0 = r10.getDimension(r5, r0)
            r1.A07 = r0
            goto L_0x0361
        L_0x05b5:
            X.6rl r1 = r11.A06
            float r0 = r1.A08
            float r0 = r10.getDimension(r5, r0)
            r1.A08 = r0
            goto L_0x0361
        L_0x05c1:
            X.6rl r1 = r11.A06
            float r0 = r1.A09
            float r0 = r10.getDimension(r5, r0)
            r1.A09 = r0
            goto L_0x0361
        L_0x05cd:
            X.6rl r1 = r11.A06
            float r0 = r1.A0A
            float r0 = r10.getDimension(r5, r0)
            r1.A0A = r0
            goto L_0x0361
        L_0x05d9:
            X.6rk r1 = r11.A03
            int r0 = r1.A0t
            int r0 = r10.getInt(r5, r0)
            r1.A0t = r0
            goto L_0x0361
        L_0x05e5:
            X.6rk r1 = r11.A03
            int r0 = r1.A0V
            int r0 = r10.getInt(r5, r0)
            r1.A0V = r0
            goto L_0x0361
        L_0x05f1:
            X.6rk r1 = r11.A03
            int r0 = r1.A0u
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0u = r0
            goto L_0x0361
        L_0x05fd:
            X.6rk r1 = r11.A03
            int r0 = r1.A0W
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0W = r0
            goto L_0x0361
        L_0x0609:
            X.6rk r1 = r11.A03
            int r0 = r1.A0v
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0v = r0
            goto L_0x0361
        L_0x0615:
            X.6rk r1 = r11.A03
            int r0 = r1.A0X
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0X = r0
            goto L_0x0361
        L_0x0621:
            X.6rl r1 = r11.A06
            float r0 = r1.A01
            float r0 = r10.getFloat(r5, r0)
            r1.A01 = r0
            goto L_0x0361
        L_0x062d:
            X.6rk r1 = r11.A03
            int r0 = r1.A0F
            int r0 = A00(r10, r5, r0)
            r1.A0F = r0
            goto L_0x0361
        L_0x0639:
            X.6rk r1 = r11.A03
            int r0 = r1.A0G
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0G = r0
            goto L_0x0361
        L_0x0645:
            X.6rk r1 = r11.A03
            float r0 = r1.A00
            float r0 = r10.getFloat(r5, r0)
            r1.A00 = r0
            goto L_0x0361
        L_0x0651:
            X.6rj r1 = r11.A04
            int r0 = r1.A04
            int r0 = A00(r10, r5, r0)
            r1.A04 = r0
            goto L_0x0361
        L_0x065d:
            android.util.TypedValue r0 = r10.peekValue(r5)
            int r0 = r0.type
            X.6rj r6 = r11.A04
            if (r0 != r8) goto L_0x066f
            java.lang.String r0 = r10.getString(r5)
        L_0x066b:
            r6.A0B = r0
            goto L_0x0361
        L_0x066f:
            java.lang.String[] r1 = X.VJI.A00
            int r0 = r10.getInteger(r5, r3)
            r0 = r1[r0]
            goto L_0x066b
        L_0x0678:
            X.6rj r1 = r11.A04
            int r0 = r10.getInt(r5, r3)
            r1.A05 = r0
            goto L_0x0361
        L_0x0682:
            X.6rj r1 = r11.A04
            float r0 = r1.A01
            float r0 = r10.getFloat(r5, r0)
            r1.A01 = r0
            goto L_0x0361
        L_0x068e:
            X.6ri r1 = r11.A05
            float r0 = r1.A01
            float r0 = r10.getFloat(r5, r0)
            r1.A01 = r0
            goto L_0x0361
        L_0x069a:
            X.6rk r1 = r11.A03
            float r0 = r10.getFloat(r5, r0)
            r1.A07 = r0
            goto L_0x0361
        L_0x06a4:
            X.6rk r1 = r11.A03
            float r0 = r10.getFloat(r5, r0)
            r1.A02 = r0
            goto L_0x0361
        L_0x06ae:
            java.lang.String r0 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r6, r0)
            goto L_0x0361
        L_0x06b5:
            X.6rk r1 = r11.A03
            int r0 = r1.A0c
            int r0 = r10.getInt(r5, r0)
            r1.A0c = r0
            goto L_0x0361
        L_0x06c1:
            X.6rk r1 = r11.A03
            int r0 = r1.A0d
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0d = r0
            goto L_0x0361
        L_0x06cd:
            X.6rk r1 = r11.A03
            java.lang.String r0 = r10.getString(r5)
            r1.A0y = r0
            goto L_0x0361
        L_0x06d7:
            X.6rk r1 = r11.A03
            boolean r0 = r1.A13
            boolean r0 = r10.getBoolean(r5, r0)
            r1.A13 = r0
            goto L_0x0361
        L_0x06e3:
            X.6rj r1 = r11.A04
            int r0 = r1.A06
            int r0 = r10.getInt(r5, r0)
            r1.A06 = r0
            goto L_0x0361
        L_0x06ef:
            X.6rk r1 = r11.A03
            java.lang.String r0 = r10.getString(r5)
            r1.A0x = r0
            goto L_0x0361
        L_0x06f9:
            X.6ri r1 = r11.A05
            int r0 = r1.A02
            int r0 = r10.getInt(r5, r0)
            r1.A02 = r0
            goto L_0x0361
        L_0x0705:
            X.6rj r1 = r11.A04
            float r0 = r1.A00
            float r0 = r10.getFloat(r5, r0)
            r1.A00 = r0
            goto L_0x0361
        L_0x0711:
            X.6rk r1 = r11.A03
            boolean r0 = r1.A10
            boolean r0 = r10.getBoolean(r5, r0)
            r1.A10 = r0
            goto L_0x0361
        L_0x071d:
            X.6rk r1 = r11.A03
            boolean r0 = r1.A0z
            boolean r0 = r10.getBoolean(r5, r0)
            r1.A0z = r0
            goto L_0x0361
        L_0x0729:
            X.6rj r1 = r11.A04
            int r0 = r1.A03
            int r0 = r10.getInteger(r5, r0)
            r1.A03 = r0
            goto L_0x0361
        L_0x0735:
            X.6rl r1 = r11.A06
            int r0 = r1.A0B
            int r0 = A00(r10, r5, r0)
            r1.A0B = r0
            goto L_0x0361
        L_0x0741:
            X.6rj r1 = r11.A04
            int r0 = r1.A09
            int r0 = r10.getInteger(r5, r0)
            r1.A09 = r0
            goto L_0x0361
        L_0x074d:
            X.6rj r1 = r11.A04
            float r0 = r1.A02
            float r0 = r10.getFloat(r5, r0)
            r1.A02 = r0
            goto L_0x0361
        L_0x0759:
            android.util.TypedValue r1 = r10.peekValue(r5)
            int r0 = r1.type
            r7 = -1
            if (r0 != r9) goto L_0x076c
            X.6rj r1 = r11.A04
            int r0 = r10.getResourceId(r5, r7)
            r1.A08 = r0
            goto L_0x0361
        L_0x076c:
            int r0 = r1.type
            X.6rj r6 = r11.A04
            if (r0 != r8) goto L_0x0788
            java.lang.String r1 = r10.getString(r5)
            r6.A0A = r1
            java.lang.String r0 = "/"
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L_0x0361
            int r0 = r10.getResourceId(r5, r7)
            r6.A08 = r0
            goto L_0x0361
        L_0x0788:
            int r0 = r6.A08
            r10.getInteger(r5, r0)
            goto L_0x0361
        L_0x078f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unused attribute 0x"
            goto L_0x0346
        L_0x0798:
            X.6rk r1 = r11.A03
            int r0 = r1.A0B
            int r0 = A00(r10, r5, r0)
            r1.A0B = r0
            goto L_0x0361
        L_0x07a4:
            X.6rk r1 = r11.A03
            int r0 = r1.A0A
            int r0 = A00(r10, r5, r0)
            r1.A0A = r0
            goto L_0x0361
        L_0x07b0:
            X.6rk r1 = r11.A03
            int r0 = r1.A08
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A08 = r0
            goto L_0x0361
        L_0x07bc:
            X.6rk r1 = r11.A03
            int r0 = r1.A0M
            int r0 = r10.getDimensionPixelSize(r5, r0)
            r1.A0M = r0
            goto L_0x0361
        L_0x07c8:
            X.6rk r0 = r11.A03
            A04(r10, r0, r5, r3)
            goto L_0x0361
        L_0x07cf:
            X.6rk r0 = r11.A03
            A04(r10, r0, r5, r9)
            goto L_0x0361
        L_0x07d6:
            X.6rk r1 = r11.A03
            int r0 = r1.A0h
            int r0 = r10.getInt(r5, r0)
            r1.A0h = r0
            goto L_0x0361
        L_0x07e2:
            X.6rk r1 = r11.A03
            java.lang.String r0 = r1.A0y
            if (r0 == 0) goto L_0x07eb
            r0 = 0
            r1.A15 = r0
        L_0x07eb:
            r10.recycle()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270354gb.A01(android.content.Context, android.util.AttributeSet, boolean):X.6rh");
    }

    public static C320056rh A02(C270354gb r2, int i) {
        HashMap hashMap = r2.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C320056rh());
        }
        return (C320056rh) hashMap.get(valueOf);
    }

    public static void A05(C71492dQ r7, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    f = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                f = Math.abs(parseFloat2 / parseFloat);
                            } else {
                                f = Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        r7.A0z = str;
        r7.A01 = f;
        r7.A0J = i;
    }

    public static int[] A06(View view, String str) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = AnonymousClass3MD.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, PublicKeyCredentialControllerUtility.JSON_KEY_ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim == null || (hashMap = constraintLayout.A0F) == null || !hashMap.containsKey(trim)) {
                    obj = null;
                } else {
                    obj = constraintLayout.A0F.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Number) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public final void A09(int i, int i2) {
        C320056rh r0;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf) && (r0 = (C320056rh) hashMap.get(valueOf)) != null) {
            C320086rk r02 = r0.A03;
            switch (i2) {
                case 1:
                    r02.A0b = -1;
                    r02.A0a = -1;
                    r02.A0Z = -1;
                    r02.A0P = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
                case 2:
                    r02.A0l = -1;
                    r02.A0k = -1;
                    r02.A0j = -1;
                    r02.A0Q = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
                case 3:
                    r02.A0q = -1;
                    r02.A0r = -1;
                    r02.A0p = 0;
                    r02.A0S = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
                case 4:
                    r02.A0E = -1;
                    r02.A0D = -1;
                    r02.A0C = 0;
                    r02.A0N = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
                case 5:
                    r02.A09 = -1;
                    r02.A0B = -1;
                    r02.A0A = -1;
                    r02.A08 = 0;
                    r02.A0M = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
                case 6:
                    r02.A0n = -1;
                    r02.A0o = -1;
                    r02.A0m = 0;
                    r02.A0R = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
                default:
                    r02.A0L = -1;
                    r02.A0K = -1;
                    r02.A0J = 0;
                    r02.A0O = AnonymousClass972.MUTABLE_FLAG_MASK;
                    return;
            }
        }
    }

    public final void A0C(int i, int i2, int i3, int i4) {
        C320086rk r0;
        C320086rk r02;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C320056rh());
        }
        C320056rh r9 = (C320056rh) hashMap.get(valueOf);
        if (r9 != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C320086rk r03 = r9.A03;
                        r03.A0a = i3;
                        r03.A0b = -1;
                        return;
                    } else if (i4 == 2) {
                        C320086rk r04 = r9.A03;
                        r04.A0b = i3;
                        r04.A0a = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException(002.A0g("left to ", A03(i4), " undefined"));
                    }
                case 2:
                    if (i4 == 1) {
                        C320086rk r05 = r9.A03;
                        r05.A0k = i3;
                        r05.A0l = -1;
                        return;
                    } else if (i4 == 2) {
                        C320086rk r06 = r9.A03;
                        r06.A0l = i3;
                        r06.A0k = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                case 3:
                    if (i4 == 3) {
                        r0 = r9.A03;
                        r0.A0r = i3;
                        r0.A0q = -1;
                        break;
                    } else if (i4 == 4) {
                        r0 = r9.A03;
                        r0.A0q = i3;
                        r0.A0r = -1;
                        break;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                case 4:
                    if (i4 == 4) {
                        r0 = r9.A03;
                        r0.A0D = i3;
                        r0.A0E = -1;
                        break;
                    } else if (i4 == 3) {
                        r0 = r9.A03;
                        r0.A0E = i3;
                        r0.A0D = -1;
                        break;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                case 5:
                    if (i4 == 5) {
                        r02 = r9.A03;
                        r02.A09 = i3;
                    } else if (i4 == 3) {
                        r02 = r9.A03;
                        r02.A0B = i3;
                    } else if (i4 == 4) {
                        r02 = r9.A03;
                        r02.A0A = i3;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r02.A0D = -1;
                    r02.A0E = -1;
                    r02.A0r = -1;
                    r02.A0q = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        C320086rk r07 = r9.A03;
                        r07.A0o = i3;
                        r07.A0n = -1;
                        return;
                    } else if (i4 == 7) {
                        C320086rk r08 = r9.A03;
                        r08.A0n = i3;
                        r08.A0o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                default:
                    if (i4 == 7) {
                        C320086rk r09 = r9.A03;
                        r09.A0K = i3;
                        r09.A0L = -1;
                        return;
                    } else if (i4 == 6) {
                        C320086rk r010 = r9.A03;
                        r010.A0L = i3;
                        r010.A0K = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
            }
            r0.A09 = -1;
            r0.A0B = -1;
            r0.A0A = -1;
        }
    }

    public final void A0E(int i, int i2, int i3, int i4, int i5) {
        C320086rk r0;
        C320086rk r02;
        C320086rk r03;
        C320086rk r04;
        C320086rk r05;
        C320086rk r06;
        C320086rk r07;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C320056rh());
        }
        C320056rh r9 = (C320056rh) hashMap.get(valueOf);
        if (r9 != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        r0 = r9.A03;
                        r0.A0a = i3;
                        r0.A0b = -1;
                    } else if (i4 == 2) {
                        r0 = r9.A03;
                        r0.A0b = i3;
                        r0.A0a = -1;
                    } else {
                        throw new IllegalArgumentException(002.A0g("Left to ", A03(i4), " undefined"));
                    }
                    r0.A0Z = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        r02 = r9.A03;
                        r02.A0k = i3;
                        r02.A0l = -1;
                    } else if (i4 == 2) {
                        r02 = r9.A03;
                        r02.A0l = i3;
                        r02.A0k = -1;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r02.A0j = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        r03 = r9.A03;
                        r03.A0r = i3;
                        r03.A0q = -1;
                    } else if (i4 == 4) {
                        r03 = r9.A03;
                        r03.A0q = i3;
                        r03.A0r = -1;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r03.A09 = -1;
                    r03.A0B = -1;
                    r03.A0A = -1;
                    r03.A0p = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        r04 = r9.A03;
                        r04.A0D = i3;
                        r04.A0E = -1;
                    } else if (i4 == 3) {
                        r04 = r9.A03;
                        r04.A0E = i3;
                        r04.A0D = -1;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r04.A09 = -1;
                    r04.A0B = -1;
                    r04.A0A = -1;
                    r04.A0C = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        r05 = r9.A03;
                        r05.A09 = i3;
                    } else if (i4 == 3) {
                        r05 = r9.A03;
                        r05.A0B = i3;
                    } else if (i4 == 4) {
                        r05 = r9.A03;
                        r05.A0A = i3;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r05.A0D = -1;
                    r05.A0E = -1;
                    r05.A0r = -1;
                    r05.A0q = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        r06 = r9.A03;
                        r06.A0o = i3;
                        r06.A0n = -1;
                    } else if (i4 == 7) {
                        r06 = r9.A03;
                        r06.A0n = i3;
                        r06.A0o = -1;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r06.A0m = i5;
                    return;
                default:
                    if (i4 == 7) {
                        r07 = r9.A03;
                        r07.A0K = i3;
                        r07.A0L = -1;
                    } else if (i4 == 6) {
                        r07 = r9.A03;
                        r07.A0L = i3;
                        r07.A0K = -1;
                    } else {
                        throw new IllegalArgumentException(002.A0g("right to ", A03(i4), " undefined"));
                    }
                    r07.A0J = i5;
                    return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0277, code lost:
        if (java.lang.Float.isNaN(r3) == false) goto L_0x0247;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0262 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x025d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(androidx.constraintlayout.widget.ConstraintLayout r23) {
        /*
            r22 = this;
            r12 = r23
            int r20 = r12.getChildCount()
            r0 = r22
            java.util.HashMap r11 = r0.A00
            java.util.Set r1 = r11.keySet()
            java.util.HashSet r19 = new java.util.HashSet
            r0 = r19
            r0.<init>(r1)
            r10 = 0
            r9 = 0
        L_0x0017:
            r3 = 1
            r0 = r20
            if (r9 >= r0) goto L_0x0282
            android.view.View r8 = r12.getChildAt(r9)
            int r4 = r8.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r11.containsKey(r0)
            java.lang.String r5 = "ConstraintSet"
            if (r0 != 0) goto L_0x004e
            java.lang.String r2 = "id unknown "
            android.content.Context r0 = r8.getContext()     // Catch:{ Exception -> 0x0043 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x0043 }
            int r0 = r8.getId()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = r1.getResourceEntryName(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            java.lang.String r0 = "UNKNOWN"
        L_0x0045:
            java.lang.String r0 = X.002.A0R(r2, r0)
            android.util.Log.w(r5, r0)
            goto L_0x0262
        L_0x004e:
            r7 = -1
            if (r4 == r7) goto L_0x027a
            if (r4 == r7) goto L_0x0262
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r11.containsKey(r0)
            if (r0 == 0) goto L_0x0262
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = r19
            r0.remove(r1)
            java.lang.Object r6 = r11.get(r1)
            X.6rh r6 = (X.C320056rh) r6
            if (r6 == 0) goto L_0x0262
            boolean r0 = r8 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L_0x009b
            X.6rk r2 = r6.A03
            r2.A0f = r3
            r1 = r8
            androidx.constraintlayout.widget.Barrier r1 = (androidx.constraintlayout.widget.Barrier) r1
            r1.setId(r4)
            int r0 = r2.A0c
            r1.A00 = r0
            int r0 = r2.A0d
            r1.setMargin(r0)
            boolean r0 = r2.A13
            r1.setAllowsGoneWidget(r0)
            int[] r0 = r2.A15
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = r2.A0y
            if (r0 == 0) goto L_0x009b
            int[] r0 = A06(r1, r0)
            r2.A15 = r0
        L_0x0098:
            r1.setReferencedIds(r0)
        L_0x009b:
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            X.2dQ r5 = (X.C71492dQ) r5
            r5.A00()
            r6.A01(r5)
            java.util.HashMap r0 = r6.A02
            r21 = r0
            java.lang.String r18 = "\" not found on "
            java.lang.String r4 = " Custom Attribute \""
            java.lang.String r3 = "TransitionLayout"
            java.lang.Class r2 = r8.getClass()
            java.util.Set r0 = r21.keySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x00bd:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r1 = r17.next()
            java.lang.String r1 = (java.lang.String) r1
            r0 = r21
            java.lang.Object r15 = r0.get(r1)
            X.9uS r15 = (X.C392249uS) r15
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "set"
            java.lang.String r13 = X.002.A0R(r0, r1)
            goto L_0x00dd
        L_0x00dc:
            r13 = r1
        L_0x00dd:
            java.lang.Integer r0 = r15.A03     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            int r0 = r0.intValue()     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            switch(r0) {
                case 0: goto L_0x0154;
                case 1: goto L_0x0169;
                case 2: goto L_0x0124;
                case 3: goto L_0x0139;
                case 4: goto L_0x0113;
                case 5: goto L_0x00fd;
                case 6: goto L_0x017e;
                case 7: goto L_0x00e7;
                default: goto L_0x00e6;
            }     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
        L_0x00e6:
            goto L_0x00bd
        L_0x00e7:
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            int r0 = r15.A02     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x00fd:
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            boolean r0 = r15.A06     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x0113:
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.String r0 = r15.A05     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x0124:
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            int r0 = r15.A01     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x0139:
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            android.graphics.drawable.ColorDrawable r16 = new android.graphics.drawable.ColorDrawable     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            r16.<init>()     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            int r0 = r15.A01     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            r15 = r16
            r15.setColor(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r16}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x0154:
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            int r0 = r15.A02     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x0169:
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            float r0 = r15.A00     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x0192
        L_0x017e:
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.reflect.Method r14 = r2.getMethod(r13, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            float r0 = r15.A00     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
        L_0x0192:
            r14.invoke(r8, r0)     // Catch:{ NoSuchMethodException -> 0x01aa, IllegalAccessException | InvocationTargetException -> 0x0197 }
            goto L_0x00bd
        L_0x0197:
            r14 = move-exception
            java.lang.String r13 = r2.getName()
            r0 = r18
            java.lang.String r0 = X.002.A0u(r4, r1, r0, r13)
            android.util.Log.e(r3, r0)
            r14.printStackTrace()
            goto L_0x00bd
        L_0x01aa:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r3, r0)
            java.lang.String r14 = r2.getName()
            r0 = r18
            java.lang.String r0 = X.002.A0u(r4, r1, r0, r14)
            android.util.Log.e(r3, r0)
            java.lang.String r0 = " must have a method "
            java.lang.String r0 = X.002.A0g(r14, r0, r13)
            android.util.Log.e(r3, r0)
            goto L_0x00bd
        L_0x01ca:
            r8.setLayoutParams(r5)
            X.6ri r1 = r6.A05
            int r0 = r1.A02
            if (r0 != 0) goto L_0x01d8
            int r0 = r1.A03
            r8.setVisibility(r0)
        L_0x01d8:
            float r0 = r1.A00
            r8.setAlpha(r0)
            X.6rl r2 = r6.A06
            float r0 = r2.A01
            r8.setRotation(r0)
            float r0 = r2.A02
            r8.setRotationX(r0)
            float r0 = r2.A03
            r8.setRotationY(r0)
            float r0 = r2.A04
            r8.setScaleX(r0)
            float r0 = r2.A05
            r8.setScaleY(r0)
            int r0 = r2.A0B
            if (r0 == r7) goto L_0x0266
            android.view.ViewParent r1 = r8.getParent()
            android.view.View r1 = (android.view.View) r1
            int r0 = r2.A0B
            android.view.View r4 = r1.findViewById(r0)
            if (r4 == 0) goto L_0x024a
            int r1 = r4.getTop()
            int r0 = r4.getBottom()
            int r1 = r1 + r0
            float r3 = (float) r1
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            int r1 = r4.getLeft()
            int r0 = r4.getRight()
            int r1 = r1 + r0
            float r4 = (float) r1
            float r4 = r4 / r5
            int r1 = r8.getRight()
            int r0 = r8.getLeft()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x024a
            int r1 = r8.getBottom()
            int r0 = r8.getTop()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x024a
            int r0 = r8.getLeft()
            float r0 = (float) r0
            float r4 = r4 - r0
            int r0 = r8.getTop()
            float r0 = (float) r0
            float r3 = r3 - r0
            r8.setPivotX(r4)
        L_0x0247:
            r8.setPivotY(r3)
        L_0x024a:
            float r0 = r2.A08
            r8.setTranslationX(r0)
            float r0 = r2.A09
            r8.setTranslationY(r0)
            float r0 = r2.A0A
            r8.setTranslationZ(r0)
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x0262
            float r0 = r2.A00
            r8.setElevation(r0)
        L_0x0262:
            int r9 = r9 + 1
            goto L_0x0017
        L_0x0266:
            float r1 = r2.A06
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0271
            r8.setPivotX(r1)
        L_0x0271:
            float r3 = r2.A07
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x024a
            goto L_0x0247
        L_0x027a:
            java.lang.String r1 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0282:
            java.util.Iterator r7 = r19.iterator()
        L_0x0286:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02fa
            java.lang.Object r5 = r7.next()
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r4 = r11.get(r5)
            X.6rh r4 = (X.C320056rh) r4
            if (r4 == 0) goto L_0x0286
            X.6rk r6 = r4.A03
            int r0 = r6.A0f
            if (r0 != r3) goto L_0x02d9
            android.content.Context r0 = r12.getContext()
            androidx.constraintlayout.widget.Barrier r2 = new androidx.constraintlayout.widget.Barrier
            r2.<init>(r0)
            int r0 = r5.intValue()
            r2.setId(r0)
            int[] r0 = r6.A15
            if (r0 != 0) goto L_0x02be
            java.lang.String r0 = r6.A0y
            if (r0 == 0) goto L_0x02c1
            int[] r0 = A06(r2, r0)
            r6.A15 = r0
        L_0x02be:
            r2.setReferencedIds(r0)
        L_0x02c1:
            int r0 = r6.A0c
            r2.A00 = r0
            int r0 = r6.A0d
            r2.setMargin(r0)
            r1 = -2
            X.2dQ r0 = new X.2dQ
            r0.<init>(r1, r1)
            r2.A04()
            r4.A01(r0)
            r12.addView(r2, r0)
        L_0x02d9:
            boolean r0 = r6.A14
            if (r0 == 0) goto L_0x0286
            android.content.Context r0 = r12.getContext()
            androidx.constraintlayout.widget.Guideline r2 = new androidx.constraintlayout.widget.Guideline
            r2.<init>(r0)
            int r0 = r5.intValue()
            r2.setId(r0)
            r1 = -2
            X.2dQ r0 = new X.2dQ
            r0.<init>(r1, r1)
            r4.A01(r0)
            r12.addView(r2, r0)
            goto L_0x0286
        L_0x02fa:
            r0 = r20
            if (r10 >= r0) goto L_0x030e
            android.view.View r1 = r12.getChildAt(r10)
            boolean r0 = r1 instanceof X.C252043oT
            if (r0 == 0) goto L_0x030b
            X.3oT r1 = (X.C252043oT) r1
            r1.A08(r12)
        L_0x030b:
            int r10 = r10 + 1
            goto L_0x02fa
        L_0x030e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270354gb.A0H(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, X.9uS] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.9uS] */
    public final void A0I(ConstraintLayout constraintLayout) {
        Object invoke;
        C392249uS r1;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout2.getChildAt(i);
            C71492dQ r8 = (C71492dQ) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C320056rh());
                }
                C320056rh r7 = (C320056rh) hashMap.get(Integer.valueOf(id));
                if (r7 != null) {
                    HashMap hashMap2 = this.A01;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        C392249uS r15 = (C392249uS) hashMap2.get(str);
                        try {
                            if (str.equals("BackgroundColor")) {
                                invoke = Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor());
                                ? obj = new Object();
                                obj.A07 = false;
                                obj.A04 = r15.A04;
                                obj.A03 = r15.A03;
                                r1 = obj;
                            } else {
                                invoke = cls.getMethod(002.A0R("getMap", str), new Class[0]).invoke(childAt, new Object[0]);
                                ? obj2 = new Object();
                                obj2.A07 = false;
                                obj2.A04 = r15.A04;
                                obj2.A03 = r15.A03;
                                r1 = obj2;
                            }
                            r1.A00(invoke);
                            hashMap3.put(str, r1);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                    r7.A02 = hashMap3;
                    r7.A00 = id;
                    C320086rk r12 = r7.A03;
                    r12.A0a = r8.A0Y;
                    r12.A0b = r8.A0Z;
                    r12.A0k = r8.A0p;
                    r12.A0l = r8.A0q;
                    r12.A0r = r8.A0u;
                    r12.A0q = r8.A0t;
                    r12.A0E = r8.A0G;
                    r12.A0D = r8.A0F;
                    r12.A09 = r8.A0C;
                    r12.A0B = r8.A0E;
                    r12.A0A = r8.A0D;
                    r12.A0n = r8.A0r;
                    r12.A0o = r8.A0s;
                    r12.A0L = r8.A0N;
                    r12.A0K = r8.A0M;
                    r12.A03 = r8.A03;
                    r12.A05 = r8.A09;
                    r12.A0w = r8.A0z;
                    r12.A0F = r8.A0H;
                    r12.A0G = r8.A0I;
                    r12.A00 = r8.A00;
                    r12.A0H = r8.A0K;
                    r12.A0I = r8.A0L;
                    r12.A0i = r8.A0g;
                    r12.A01 = r8.A02;
                    r12.A0T = r8.A0V;
                    r12.A0U = r8.A0W;
                    r12.A0g = r8.width;
                    r12.A0e = r8.height;
                    r12.A0Z = r8.leftMargin;
                    r12.A0j = r8.rightMargin;
                    r12.A0p = r8.topMargin;
                    r12.A0C = r8.bottomMargin;
                    r12.A08 = r8.A0B;
                    r12.A06 = r8.A0A;
                    r12.A04 = r8.A04;
                    r12.A0s = r8.A0v;
                    r12.A0Y = r8.A0X;
                    r12.A10 = r8.A11;
                    r12.A0z = r8.A10;
                    r12.A0t = r8.A0b;
                    r12.A0V = r8.A0a;
                    r12.A0u = r8.A0d;
                    r12.A0W = r8.A0c;
                    r12.A0v = r8.A0f;
                    r12.A0X = r8.A0e;
                    r12.A07 = r8.A06;
                    r12.A02 = r8.A05;
                    r12.A0x = r8.A0y;
                    r12.A0S = r8.A0U;
                    r12.A0N = r8.A0P;
                    r12.A0P = r8.A0R;
                    r12.A0Q = r8.A0S;
                    r12.A0R = r8.A0T;
                    r12.A0O = r8.A0Q;
                    r12.A0M = r8.A0O;
                    r12.A0h = r8.A0w;
                    r12.A0J = r8.getMarginEnd();
                    r12.A0m = r8.getMarginStart();
                    C320066ri r13 = r7.A05;
                    r13.A03 = childAt.getVisibility();
                    r13.A00 = childAt.getAlpha();
                    C320096rl r82 = r7.A06;
                    r82.A01 = childAt.getRotation();
                    r82.A02 = childAt.getRotationX();
                    r82.A03 = childAt.getRotationY();
                    r82.A04 = childAt.getScaleX();
                    r82.A05 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        r82.A06 = pivotX;
                        r82.A07 = pivotY;
                    }
                    r82.A08 = childAt.getTranslationX();
                    r82.A09 = childAt.getTranslationY();
                    r82.A0A = childAt.getTranslationZ();
                    if (r82.A0C) {
                        r82.A00 = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        C320086rk r14 = r7.A03;
                        r14.A13 = barrier.A01.A02;
                        r14.A15 = barrier.getReferencedIds();
                        r14.A0c = barrier.A00;
                        r14.A0d = barrier.A01.A01;
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public static void A04(TypedArray typedArray, Object obj, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = typedArray.peekValue(i).type;
        if (i6 != 3) {
            int i7 = -2;
            boolean z = false;
            if (i6 != 5) {
                int i8 = typedArray.getInt(i, 0);
                if (i8 == -4) {
                    z = true;
                } else if (i8 == -3 || !(i8 == -2 || i8 == -1)) {
                    i7 = 0;
                } else {
                    i7 = i8;
                }
            } else {
                i7 = typedArray.getDimensionPixelSize(i, 0);
            }
            if (obj instanceof C71492dQ) {
                C71492dQ r6 = (C71492dQ) obj;
                if (i2 == 0) {
                    r6.width = i7;
                    r6.A11 = z;
                    return;
                }
                r6.height = i7;
                r6.A10 = z;
            } else if (obj instanceof C320086rk) {
                C320086rk r62 = (C320086rk) obj;
                if (i2 == 0) {
                    r62.A0g = i7;
                    r62.A10 = z;
                    return;
                }
                r62.A0e = i7;
                r62.A0z = z;
            } else if (obj instanceof C39802A9y) {
                C39802A9y a9y = (C39802A9y) obj;
                if (i2 == 0) {
                    a9y.A01(23, i7);
                    i5 = 80;
                } else {
                    a9y.A01(21, i7);
                    i5 = 81;
                }
                a9y.A03(i5, z);
            }
        } else {
            String string = typedArray.getString(i);
            if (string != null) {
                int indexOf = string.indexOf(61);
                int length = string.length();
                if (indexOf > 0 && indexOf < length - 1) {
                    String substring = string.substring(0, indexOf);
                    String substring2 = string.substring(indexOf + 1);
                    if (substring2.length() > 0) {
                        String trim = substring.trim();
                        String trim2 = substring2.trim();
                        if ("ratio".equalsIgnoreCase(trim)) {
                            if (obj instanceof C71492dQ) {
                                C71492dQ r63 = (C71492dQ) obj;
                                if (i2 == 0) {
                                    r63.width = 0;
                                } else {
                                    r63.height = 0;
                                }
                                A05(r63, trim2);
                            } else if (obj instanceof C320086rk) {
                                ((C320086rk) obj).A0w = trim2;
                            } else if (obj instanceof C39802A9y) {
                                ((C39802A9y) obj).A02(5, trim2);
                            }
                        } else if ("weight".equalsIgnoreCase(trim)) {
                            try {
                                float parseFloat = Float.parseFloat(trim2);
                                if (obj instanceof C71492dQ) {
                                    C71492dQ r64 = (C71492dQ) obj;
                                    if (i2 == 0) {
                                        r64.width = 0;
                                        r64.A04 = parseFloat;
                                        return;
                                    }
                                    r64.height = 0;
                                    r64.A0A = parseFloat;
                                } else if (obj instanceof C320086rk) {
                                    C320086rk r65 = (C320086rk) obj;
                                    if (i2 == 0) {
                                        r65.A0g = 0;
                                        r65.A04 = parseFloat;
                                        return;
                                    }
                                    r65.A0e = 0;
                                    r65.A06 = parseFloat;
                                } else if (obj instanceof C39802A9y) {
                                    C39802A9y a9y2 = (C39802A9y) obj;
                                    if (i2 == 0) {
                                        a9y2.A01(23, 0);
                                        i4 = 39;
                                    } else {
                                        a9y2.A01(21, 0);
                                        i4 = 40;
                                    }
                                    a9y2.A00(i4, parseFloat);
                                }
                            } catch (NumberFormatException unused) {
                            }
                        } else if ("parent".equalsIgnoreCase(trim)) {
                            float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                            if (obj instanceof C71492dQ) {
                                C71492dQ r66 = (C71492dQ) obj;
                                if (i2 == 0) {
                                    r66.width = 0;
                                    r66.A06 = max;
                                    r66.A0b = 2;
                                    return;
                                }
                                r66.height = 0;
                                r66.A05 = max;
                                r66.A0a = 2;
                            } else if (obj instanceof C320086rk) {
                                C320086rk r67 = (C320086rk) obj;
                                if (i2 == 0) {
                                    r67.A0g = 0;
                                    r67.A07 = max;
                                    r67.A0t = 2;
                                    return;
                                }
                                r67.A0e = 0;
                                r67.A02 = max;
                                r67.A0V = 2;
                            } else if (obj instanceof C39802A9y) {
                                C39802A9y a9y3 = (C39802A9y) obj;
                                if (i2 == 0) {
                                    a9y3.A01(23, 0);
                                    i3 = 54;
                                } else {
                                    a9y3.A01(21, 0);
                                    i3 = 55;
                                }
                                a9y3.A01(i3, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A07(int i, float f) {
        A02(this, i).A03.A07 = f;
    }

    public final void A08(int i, float f) {
        A02(this, i).A03.A03 = f;
    }

    public final void A0A(int i, int i2) {
        A02(this, i).A03.A0e = i2;
    }

    public final void A0B(int i, int i2) {
        A02(this, i).A03.A0g = i2;
    }

    public final void A0F(int i, String str) {
        A02(this, i).A03.A0w = str;
    }

    public final void A0G(ConstraintLayout constraintLayout) {
        A0H(constraintLayout);
        constraintLayout.A0D = null;
        constraintLayout.requestLayout();
    }
}
