package X;

import com.facebook.dsp.core.OpacityData;

/* renamed from: X.XFi  reason: case insensitive filesystem */
public final class C21118XFi implements JRA {
    public static final C21118XFi A00 = new Object();

    public final GNY AE2(Integer num) {
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 4 || A03 == 5) {
            return new GNY((Object) C21255XRa.A0Z, 1.0f, 0);
        }
        return C22184Xwu.A00.AE2(num);
    }

    public final boolean AVl(Integer num) {
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 0) {
            return false;
        }
        if (A03 != 4) {
            return C21116XFg.A00.AVl(num);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cd, code lost:
        return X.C21053XCe.A06(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        return X.C21053XCe.A06(r12, -10654597);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0138, code lost:
        return X.C21053XCe.A06(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0160, code lost:
        return X.C21053XCe.A06(-10654597, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a9, code lost:
        return X.C21053XCe.A06(-920329, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b1, code lost:
        r6 = 436207615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c2, code lost:
        return new com.facebook.dsp.core.ColorData(r10, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.dsp.core.ColorData AIK(X.C21255XRa r17) {
        /*
            r16 = this;
            r14 = r17
            int r15 = X.C21053XCe.A02(r14)
            r13 = -5253121(0xffffffffffafd7ff, float:NaN)
            r12 = -8088413(0xffffffffff8494a3, float:NaN)
            r11 = -15392473(0xffffffffff152127, float:-1.982271E38)
            r10 = -11818498(0xffffffffff4ba9fe, float:-2.7071593E38)
            r9 = 872415231(0x33ffffff, float:1.1920928E-7)
            r8 = -14338497(0xffffffffff25363f, float:-2.1960428E38)
            r7 = -12759204(0xffffffffff3d4f5c, float:-2.5163615E38)
            r0 = -16743685(0xffffffffff0082fb, float:-1.7082127E38)
            r6 = -2235672(0xffffffffffdde2e8, float:NaN)
            r5 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r4 = -10654597(0xffffffffff5d6c7b, float:-2.9432265E38)
            r3 = -1
            r2 = -16116969(0xffffffffff0a1317, float:-1.8353258E38)
            r1 = -920329(0xfffffffffff1f4f7, float:NaN)
            switch(r15) {
                case 0: goto L_0x01ce;
                case 1: goto L_0x01c3;
                case 2: goto L_0x01bb;
                case 3: goto L_0x01b5;
                case 4: goto L_0x01ae;
                case 5: goto L_0x01aa;
                case 6: goto L_0x01a2;
                case 7: goto L_0x019d;
                case 8: goto L_0x0198;
                case 9: goto L_0x0193;
                case 10: goto L_0x018c;
                case 11: goto L_0x0185;
                case 12: goto L_0x017e;
                case 13: goto L_0x0177;
                case 14: goto L_0x0170;
                case 15: goto L_0x016b;
                case 16: goto L_0x0198;
                case 17: goto L_0x0166;
                case 18: goto L_0x0161;
                case 19: goto L_0x0159;
                case 20: goto L_0x019d;
                case 21: goto L_0x0155;
                case 22: goto L_0x0150;
                case 23: goto L_0x014b;
                case 24: goto L_0x0198;
                case 25: goto L_0x0146;
                case 26: goto L_0x0146;
                case 27: goto L_0x013e;
                case 28: goto L_0x0031;
                case 29: goto L_0x0031;
                case 30: goto L_0x0139;
                case 31: goto L_0x01ae;
                case 32: goto L_0x0131;
                case 33: goto L_0x019d;
                case 34: goto L_0x0031;
                case 35: goto L_0x0031;
                case 36: goto L_0x0031;
                case 37: goto L_0x0031;
                case 38: goto L_0x0031;
                case 39: goto L_0x0031;
                case 40: goto L_0x0031;
                case 41: goto L_0x0031;
                case 42: goto L_0x0031;
                case 43: goto L_0x0031;
                case 44: goto L_0x0031;
                case 45: goto L_0x0031;
                case 46: goto L_0x0031;
                case 47: goto L_0x0031;
                case 48: goto L_0x0031;
                case 49: goto L_0x0031;
                case 50: goto L_0x0031;
                case 51: goto L_0x0031;
                case 52: goto L_0x0031;
                case 53: goto L_0x01ce;
                case 54: goto L_0x0129;
                case 55: goto L_0x0129;
                case 56: goto L_0x019d;
                case 57: goto L_0x0124;
                case 58: goto L_0x011c;
                case 59: goto L_0x0031;
                case 60: goto L_0x0031;
                case 61: goto L_0x0031;
                case 62: goto L_0x0115;
                case 63: goto L_0x0110;
                case 64: goto L_0x0108;
                case 65: goto L_0x0100;
                case 66: goto L_0x00f8;
                case 67: goto L_0x00f0;
                case 68: goto L_0x0115;
                case 69: goto L_0x00e8;
                case 70: goto L_0x0139;
                case 71: goto L_0x01aa;
                case 72: goto L_0x00e4;
                case 73: goto L_0x0031;
                case 74: goto L_0x0198;
                case 75: goto L_0x0031;
                case 76: goto L_0x0159;
                case 77: goto L_0x00dd;
                case 78: goto L_0x00d5;
                case 79: goto L_0x0031;
                case 80: goto L_0x0139;
                case 81: goto L_0x01aa;
                case 82: goto L_0x011c;
                case 83: goto L_0x00ce;
                case 84: goto L_0x01ae;
                case 85: goto L_0x00c6;
                case 86: goto L_0x00c1;
                case 87: goto L_0x011c;
                case 88: goto L_0x00e8;
                case 89: goto L_0x00bd;
                case 90: goto L_0x00b9;
                case 91: goto L_0x00b4;
                case 92: goto L_0x00af;
                case 93: goto L_0x019d;
                case 94: goto L_0x00af;
                case 95: goto L_0x0155;
                case 96: goto L_0x0146;
                case 97: goto L_0x00a7;
                case 98: goto L_0x00a1;
                case 99: goto L_0x009b;
                case 100: goto L_0x009b;
                case 101: goto L_0x0095;
                case 102: goto L_0x0139;
                case 103: goto L_0x009b;
                case 104: goto L_0x0095;
                case 105: goto L_0x01ce;
                case 106: goto L_0x0198;
                case 107: goto L_0x0198;
                case 108: goto L_0x008d;
                case 109: goto L_0x0085;
                case 110: goto L_0x01ce;
                case 111: goto L_0x01b5;
                case 112: goto L_0x0139;
                case 113: goto L_0x01ce;
                case 114: goto L_0x01b5;
                case 115: goto L_0x007d;
                case 116: goto L_0x0077;
                case 117: goto L_0x0193;
                case 118: goto L_0x0166;
                case 119: goto L_0x0072;
                case 120: goto L_0x0139;
                case 121: goto L_0x0139;
                case 122: goto L_0x0095;
                case 123: goto L_0x01ce;
                case 124: goto L_0x009b;
                case 125: goto L_0x0139;
                case 126: goto L_0x006a;
                case 127: goto L_0x01ce;
                case 128: goto L_0x009b;
                case 129: goto L_0x006a;
                case 130: goto L_0x0062;
                case 131: goto L_0x006a;
                case 132: goto L_0x00af;
                case 133: goto L_0x00af;
                case 134: goto L_0x0155;
                case 135: goto L_0x005e;
                case 136: goto L_0x0166;
                case 137: goto L_0x0129;
                case 138: goto L_0x0166;
                case 139: goto L_0x0129;
                case 140: goto L_0x012c;
                case 141: goto L_0x019d;
                case 142: goto L_0x01ce;
                case 143: goto L_0x012c;
                case 144: goto L_0x0146;
                case 145: goto L_0x0166;
                case 146: goto L_0x01b5;
                case 147: goto L_0x01b5;
                case 148: goto L_0x0058;
                case 149: goto L_0x0166;
                case 150: goto L_0x0058;
                case 151: goto L_0x012c;
                case 152: goto L_0x01b5;
                case 153: goto L_0x01b5;
                case 154: goto L_0x0053;
                case 155: goto L_0x0161;
                case 156: goto L_0x013e;
                case 157: goto L_0x0031;
                case 158: goto L_0x0031;
                case 159: goto L_0x0031;
                case 160: goto L_0x0031;
                case 161: goto L_0x0031;
                case 162: goto L_0x0031;
                case 163: goto L_0x0031;
                case 164: goto L_0x0031;
                case 165: goto L_0x0031;
                case 166: goto L_0x0031;
                case 167: goto L_0x0031;
                case 168: goto L_0x0031;
                case 169: goto L_0x0031;
                case 170: goto L_0x0031;
                case 171: goto L_0x0031;
                case 172: goto L_0x0031;
                case 173: goto L_0x0031;
                case 174: goto L_0x0031;
                case 175: goto L_0x0031;
                case 176: goto L_0x0031;
                case 177: goto L_0x0031;
                case 178: goto L_0x0031;
                case 179: goto L_0x0031;
                case 180: goto L_0x0031;
                case 181: goto L_0x0031;
                case 182: goto L_0x0031;
                case 183: goto L_0x0031;
                case 184: goto L_0x0031;
                case 185: goto L_0x004d;
                case 186: goto L_0x0031;
                case 187: goto L_0x01bd;
                case 188: goto L_0x0031;
                case 189: goto L_0x01ce;
                case 190: goto L_0x0198;
                case 191: goto L_0x0198;
                case 192: goto L_0x0045;
                case 193: goto L_0x0166;
                case 194: goto L_0x004d;
                case 195: goto L_0x0095;
                case 196: goto L_0x01b5;
                case 197: goto L_0x01b5;
                case 198: goto L_0x0040;
                case 199: goto L_0x0038;
                default: goto L_0x0031;
            }
        L_0x0031:
            X.XFg r0 = X.C21116XFg.A00
            com.facebook.dsp.core.ColorData r0 = r0.AIK(r14)
            return r0
        L_0x0038:
            r0 = -6922749(0xffffffffff965e03, float:NaN)
            r6 = -2713596(0xffffffffffd69804, float:NaN)
            goto L_0x01c9
        L_0x0040:
            r10 = 1728053247(0x66ffffff, float:6.0446287E23)
            goto L_0x01bd
        L_0x0045:
            r0 = -9140587(0xffffffffff748695, float:-3.2503042E38)
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r12, r0)
            return r0
        L_0x004d:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r8, r8)
            return r0
        L_0x0053:
            r10 = -1643537(0xffffffffffe6ebef, float:NaN)
            goto L_0x01bd
        L_0x0058:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r13, r13)
            return r0
        L_0x005e:
            r10 = 1912602624(0x72000000, float:2.5353012E30)
            goto L_0x01bd
        L_0x0062:
            r0 = 2144130011(0x7fccd3db, float:NaN)
            r6 = 2135184996(0x7f445664, float:2.6097725E38)
            goto L_0x01c9
        L_0x006a:
            r0 = -3353637(0xffffffffffccd3db, float:NaN)
            r6 = -12298652(0xffffffffff445664, float:-2.6097725E38)
            goto L_0x01c9
        L_0x0072:
            r0 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            goto L_0x01a5
        L_0x0077:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r9, r9)
            return r0
        L_0x007d:
            r0 = 856298263(0x330a1317, float:3.214799E-8)
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r3, r0)
            return r0
        L_0x0085:
            r0 = -1510869769(0xffffffffa5f1f4f7, float:-4.197283E-16)
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r0, r2)
            return r0
        L_0x008d:
            r0 = 1275728663(0x4c0a1317, float:3.619542E7)
            r6 = 1290925303(0x4cf1f4f7, float:1.26855096E8)
            goto L_0x01c9
        L_0x0095:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r2, r2)
            return r0
        L_0x009b:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r1, r1)
            return r0
        L_0x00a1:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r5, r5)
            return r0
        L_0x00a7:
            r0 = -15434967(0xffffffffff147b29, float:-1.9736523E38)
            r6 = -12796894(0xffffffffff3cbc22, float:-2.508717E38)
            goto L_0x01c9
        L_0x00af:
            r0 = -6904140(0xffffffffff96a6b4, float:NaN)
            goto L_0x015c
        L_0x00b4:
            r10 = 671748887(0x280a1317, float:7.664678E-15)
            goto L_0x01bd
        L_0x00b9:
            r10 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            goto L_0x01bd
        L_0x00bd:
            r10 = -1308622848(0xffffffffb2000000, float:-7.4505806E-9)
            goto L_0x01bd
        L_0x00c1:
            r10 = 1291845631(0x4cffffff, float:1.3421772E8)
            goto L_0x01bd
        L_0x00c6:
            r0 = 638194455(0x260a1317, float:4.790424E-16)
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r0, r9)
            return r0
        L_0x00ce:
            r0 = -10021(0xffffffffffffd8db, float:NaN)
            r6 = 1727757703(0x66fb7d87, float:5.9381478E23)
            goto L_0x01c9
        L_0x00d5:
            r0 = 1275728663(0x4c0a1317, float:3.619542E7)
            r6 = 1291845631(0x4cffffff, float:1.3421772E8)
            goto L_0x01c9
        L_0x00dd:
            r0 = 435287287(0x19f1f4f7, float:2.5017756E-23)
            r6 = 420090647(0x190a1317, float:7.138288E-24)
            goto L_0x0134
        L_0x00e4:
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x01b1
        L_0x00e8:
            r0 = 1929379839(0x72ffffff, float:1.0141204E31)
            r6 = 1913262871(0x720a1317, float:2.7348486E30)
            goto L_0x01c9
        L_0x00f0:
            r0 = 212119740(0xca4b0bc, float:2.537457E-31)
            r6 = 100663295(0x5ffffff, float:2.4074123E-35)
            goto L_0x01c9
        L_0x00f8:
            r0 = 430223548(0x19a4b0bc, float:1.7028585E-23)
            r6 = 184549375(0xaffffff, float:2.4651902E-32)
            goto L_0x01c9
        L_0x0100:
            r0 = 648327356(0x26a4b0bc, float:1.142769E-15)
            r6 = 268435455(0xfffffff, float:2.5243547E-29)
            goto L_0x01c9
        L_0x0108:
            r0 = 866431164(0x33a4b0bc, float:7.668993E-8)
            r6 = 352321535(0x14ffffff, float:2.5849393E-26)
            goto L_0x01c9
        L_0x0110:
            r0 = 1067757756(0x3fa4b0bc, float:1.2866435)
            goto L_0x01b1
        L_0x0115:
            r0 = -4208688(0xffffffffffbfc7d0, float:NaN)
            r6 = -13943482(0xffffffffff2b3d46, float:-2.2761614E38)
            goto L_0x0134
        L_0x011c:
            r0 = -2944720(0xffffffffffd31130, float:NaN)
            r6 = -295545(0xfffffffffffb7d87, float:NaN)
            goto L_0x01c9
        L_0x0124:
            r10 = 503976727(0x1e0a1317, float:7.309607E-21)
            goto L_0x01bd
        L_0x0129:
            r12 = -6904140(0xffffffffff96a6b4, float:NaN)
        L_0x012c:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r12, r4)
            return r0
        L_0x0131:
            r0 = -12298652(0xffffffffff445664, float:-2.6097725E38)
        L_0x0134:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r6, r0)
            return r0
        L_0x0139:
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x01bd
        L_0x013e:
            r0 = 857022759(0x33152127, float:3.4721918E-8)
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r9, r0)
            return r0
        L_0x0146:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r3, r11)
            return r0
        L_0x014b:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r8, r1)
            return r0
        L_0x0150:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r3, r8)
            return r0
        L_0x0155:
            r10 = -3353637(0xffffffffffccd3db, float:NaN)
            goto L_0x01bd
        L_0x0159:
            r0 = -5984068(0xffffffffffa4b0bc, float:NaN)
        L_0x015c:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r4, r0)
            return r0
        L_0x0161:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r5, r10)
            return r0
        L_0x0166:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r5, r0)
            return r0
        L_0x016b:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r2, r3)
            return r0
        L_0x0170:
            r0 = -3868487(0xffffffffffc4f8b9, float:NaN)
            r6 = -16169953(0xffffffffff09441f, float:-1.8245794E38)
            goto L_0x01c9
        L_0x0177:
            r0 = -1643537(0xffffffffffe6ebef, float:NaN)
            r6 = -13943482(0xffffffffff2b3d46, float:-2.2761614E38)
            goto L_0x01c9
        L_0x017e:
            r0 = -2364161(0xffffffffffdbecff, float:NaN)
            r6 = -16502889(0xffffffffff042f97, float:-1.757052E38)
            goto L_0x01c9
        L_0x0185:
            r0 = -72474(0xfffffffffffee4e6, float:NaN)
            r6 = -8715760(0xffffffffff7b0210, float:-3.3364694E38)
            goto L_0x01c9
        L_0x018c:
            r0 = -201595(0xfffffffffffcec85, float:NaN)
            r6 = -10670588(0xffffffffff5d2e04, float:-2.9399831E38)
            goto L_0x01c9
        L_0x0193:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r3, r2)
            return r0
        L_0x0198:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r1, r2)
            return r0
        L_0x019d:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r6, r7)
            return r0
        L_0x01a2:
            r0 = -13943482(0xffffffffff2b3d46, float:-2.2761614E38)
        L_0x01a5:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r1, r0)
            return r0
        L_0x01aa:
            r0 = -13285291(0xffffffffff354855, float:-2.4096584E38)
            goto L_0x01c9
        L_0x01ae:
            r0 = 420090647(0x190a1317, float:7.138288E-24)
        L_0x01b1:
            r6 = 436207615(0x19ffffff, float:2.6469778E-23)
            goto L_0x01c9
        L_0x01b5:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r3, r3)
            return r0
        L_0x01bb:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x01bd:
            com.facebook.dsp.core.ColorData r0 = new com.facebook.dsp.core.ColorData
            r0.<init>(r10, r10)
            return r0
        L_0x01c3:
            r0 = 2131366679(0x7f0a1317, float:1.8353258E38)
            r6 = 1727132919(0x66f1f4f7, float:5.7130456E23)
        L_0x01c9:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r0, r6)
            return r0
        L_0x01ce:
            com.facebook.dsp.core.ColorData r0 = X.C21053XCe.A06(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21118XFi.AIK(X.XRa):com.facebook.dsp.core.ColorData");
    }

    public final int AKp(Integer num) {
        return C21053XCe.A07(num).AKp(num);
    }

    public final OpacityData E0e(C54642HLz hLz) {
        int A02 = C21053XCe.A02(hLz);
        float f = 0.12f;
        if (A02 != 1) {
            if (A02 != 2) {
                if (A02 != 3) {
                    if (A02 != 4) {
                        if (A02 != 5) {
                            return C22184Xwu.A00.E0e(hLz);
                        }
                        f = 0.0f;
                    }
                }
            }
            return new OpacityData(0.03f, 0.03f);
        }
        return new OpacityData(f, f);
    }

    public final float Evg(Integer num) {
        return C21053XCe.A07(num).Evg(num);
    }

    public final float EwD(Integer num) {
        return C21053XCe.A07(num).EwD(num);
    }

    public final C55796Hnc FIL(Integer num) {
        return C21053XCe.A07(num).FIL(num);
    }
}
