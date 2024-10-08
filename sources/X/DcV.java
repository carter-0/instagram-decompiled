package X;

import java.util.Arrays;

public abstract class DcV {
    public static byte[] A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    static {
        byte[] bArr = new byte[C11152SCh.MAX_FACTORIAL];
        // fill-array-data instruction
        bArr[0] = 126;
        bArr[1] = -113;
        bArr[2] = -124;
        bArr[3] = -100;
        bArr[4] = -128;
        bArr[5] = -123;
        bArr[6] = 126;
        bArr[7] = -117;
        bArr[8] = -124;
        bArr[9] = -122;
        bArr[10] = -117;
        bArr[11] = -124;
        bArr[12] = -100;
        bArr[13] = -111;
        bArr[14] = -108;
        bArr[15] = -116;
        bArr[16] = -100;
        bArr[17] = -125;
        bArr[18] = 126;
        bArr[19] = -128;
        bArr[20] = -100;
        bArr[21] = -115;
        bArr[22] = -123;
        bArr[23] = -116;
        bArr[24] = -117;
        bArr[25] = -126;
        bArr[26] = -100;
        bArr[27] = -117;
        bArr[28] = -110;
        bArr[29] = -118;
        bArr[30] = 127;
        bArr[31] = -126;
        bArr[32] = -113;
        bArr[33] = -56;
        bArr[34] = -55;
        bArr[35] = -38;
        bArr[36] = -51;
        bArr[37] = -57;
        bArr[38] = -55;
        bArr[39] = -61;
        bArr[40] = -51;
        bArr[41] = -56;
        bArr[42] = -78;
        bArr[43] = -66;
        bArr[44] = -66;
        bArr[45] = -70;
        bArr[46] = -67;
        bArr[47] = -124;
        bArr[48] = 121;
        bArr[49] = 121;
        bArr[50] = -78;
        bArr[51] = -81;
        bArr[52] = -74;
        bArr[53] = -70;
        bArr[54] = 120;
        bArr[55] = -77;
        bArr[56] = -72;
        bArr[57] = -67;
        bArr[58] = -66;
        bArr[59] = -85;
        bArr[60] = -79;
        bArr[61] = -68;
        bArr[62] = -85;
        bArr[63] = -73;
        bArr[64] = 120;
        bArr[65] = -83;
        bArr[66] = -71;
        bArr[67] = -73;
        bArr[68] = 121;
        bArr[69] = 127;
        bArr[70] = -128;
        bArr[71] = -128;
        bArr[72] = -126;
        bArr[73] = 123;
        bArr[74] = 122;
        bArr[75] = 123;
        bArr[76] = 122;
        bArr[77] = -128;
        bArr[78] = -126;
        bArr[79] = 122;
        bArr[80] = -126;
        bArr[81] = 123;
        bArr[82] = 126;
        bArr[83] = 127;
        bArr[84] = -119;
        bArr[85] = -68;
        bArr[86] = -81;
        bArr[87] = -80;
        bArr[88] = -121;
        bArr[89] = -77;
        bArr[90] = -79;
        bArr[91] = -85;
        bArr[92] = -70;
        bArr[93] = -70;
        bArr[94] = 115;
        bArr[95] = 110;
        bArr[96] = 104;
        bArr[97] = 112;
        bArr[98] = 115;
        bArr[99] = 102;
        bArr[100] = 114;
        bArr[101] = 106;
        bArr[102] = -60;
        bArr[103] = -68;
        bArr[104] = -61;
        bArr[105] = -62;
        bArr[106] = -71;
        bArr[107] = -77;
        bArr[108] = -62;
        bArr[109] = -55;
        bArr[110] = -63;
        bArr[111] = -74;
        bArr[112] = -71;
        bArr[113] = -58;
        bArr[114] = -21;
        bArr[115] = -35;
        bArr[116] = -21;
        bArr[117] = -21;
        bArr[118] = -31;
        bArr[119] = -25;
        bArr[120] = -26;
        bArr[121] = -41;
        bArr[122] = -31;
        bArr[123] = -36;
        bArr[124] = -108;
        bArr[125] = -105;
        bArr[126] = -113;
        bArr[127] = 127;
        bArr[128] = -122;
        bArr[129] = -127;
        bArr[130] = -125;
        bArr[131] = -108;
        bArr[132] = -113;
        bArr[133] = -110;
        bArr[134] = 127;
        bArr[135] = -119;
        bArr[136] = -124;
        bArr[137] = -123;
        bArr[138] = -114;
        bArr[139] = -108;
        bArr[140] = -119;
        bArr[141] = -122;
        bArr[142] = -119;
        bArr[143] = -123;
        bArr[144] = -110;
        bArr[145] = -99;
        bArr[146] = -101;
        bArr[147] = -115;
        bArr[148] = -102;
        bArr[149] = -106;
        bArr[150] = -119;
        bArr[151] = -107;
        bArr[152] = -115;
        bArr[153] = -79;
        bArr[154] = -96;
        bArr[155] = -83;
        bArr[156] = -92;
        bArr[157] = -95;
        bArr[158] = -92;
        bArr[159] = -98;
        bArr[160] = -100;
        bArr[161] = -81;
        bArr[162] = -92;
        bArr[163] = -86;
        bArr[164] = -87;
        bArr[165] = -102;
        bArr[166] = -98;
        bArr[167] = -86;
        bArr[168] = -97;
        bArr[169] = -96;
        A00 = bArr;
    }

    public static String A00() {
        return A02(33, 9, 98);
    }

    public static String A01() {
        return A02(145, 8, 38);
    }
}
