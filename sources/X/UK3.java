package X;

import java.nio.ByteBuffer;

public final class UK3 extends 2dy implements X2P {
    public static int A00(ByteBuffer byteBuffer, int i, int i2) {
        int A02 = C18807W3e.A02(byteBuffer, i, i2);
        if (A02 != 0) {
            return byteBuffer.getInt(A02);
        }
        return -1;
    }

    public final void ANd(ByteBuffer byteBuffer, int i) {
        String[] strArr;
        Class<UK3> cls = UK3.class;
        int i2 = 0;
        int A02 = C18807W3e.A02(byteBuffer, i, 0);
        if (A02 != 0) {
            i2 = byteBuffer.getInt(A02);
        }
        this.A0M = i2;
        C18807W3e.A06(byteBuffer, i, 1);
        int A022 = C18807W3e.A02(byteBuffer, i, 2);
        if (A022 == 0) {
            strArr = null;
        } else {
            int i3 = byteBuffer.getInt(byteBuffer.getInt(A022) + A022);
            int i4 = A022 + byteBuffer.getInt(A022) + 4;
            strArr = new String[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = (i5 * 4) + i4;
                int i7 = byteBuffer.getInt(i6);
                if (i7 != 0) {
                    strArr[i5] = C18807W3e.A05(byteBuffer, i6 + i7);
                }
            }
        }
        this.A0z = strArr;
        this.A0W = C18807W3e.A03(cls, byteBuffer, i, 3);
        this.A0x = C18807W3e.A0A(cls, byteBuffer, i, 4);
        this.A0N = A00(byteBuffer, i, 5);
        this.A10 = C18807W3e.A09(byteBuffer, i, 6);
        this.A0P = A00(byteBuffer, i, 7);
        int A023 = C18807W3e.A02(byteBuffer, i, 8);
        if (A023 != 0) {
            byteBuffer.get(A023);
        }
        this.A04 = C18807W3e.A01(byteBuffer, i, 9);
        float f = 1.0f;
        int A024 = C18807W3e.A02(byteBuffer, i, 10);
        if (A024 != 0) {
            f = byteBuffer.getFloat(A024);
        }
        this.A0E = f;
        this.A07 = C18807W3e.A01(byteBuffer, i, 11);
        Class<UK6> cls2 = UK6.class;
        this.A0g = (AnonymousClass3JV) C18807W3e.A04(cls2, byteBuffer, i, 12);
        Class<C15015UJu> cls3 = C15015UJu.class;
        this.A0X = (AnonymousClass6B0) C18807W3e.A03(cls3, byteBuffer, i, 13);
        this.A0I = C18807W3e.A01(byteBuffer, i, 14);
        Class<UK8> cls4 = UK8.class;
        this.A0p = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 15);
        this.A0J = C18807W3e.A01(byteBuffer, i, 16);
        this.A0q = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 17);
        Class<C15014UJt> cls5 = C15014UJt.class;
        this.A0b = (AnonymousClass6B0) C18807W3e.A03(cls5, byteBuffer, i, 18);
        this.A08 = C18807W3e.A01(byteBuffer, i, 19);
        this.A0k = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 20);
        this.A0h = (AnonymousClass3JV) C18807W3e.A04(cls2, byteBuffer, i, 21);
        this.A0c = (AnonymousClass6B0) C18807W3e.A03(cls3, byteBuffer, i, 22);
        float f2 = 1.0f;
        int A025 = C18807W3e.A02(byteBuffer, i, 23);
        if (A025 != 0) {
            f2 = byteBuffer.getFloat(A025);
        }
        this.A06 = f2;
        this.A0j = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 24);
        Class<UK5> cls6 = UK5.class;
        this.A0f = C18807W3e.A03(cls6, byteBuffer, i, 25);
        this.A0a = (AnonymousClass6B0) C18807W3e.A03(cls5, byteBuffer, i, 26);
        this.A0H = C18807W3e.A01(byteBuffer, i, 27);
        this.A0o = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 28);
        this.A0F = C18807W3e.A01(byteBuffer, i, 29);
        this.A0m = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 30);
        this.A0G = C18807W3e.A01(byteBuffer, i, 31);
        this.A0n = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 32);
        Class<C15020UJz> cls7 = C15020UJz.class;
        this.A0S = C18807W3e.A04(cls7, byteBuffer, i, 33);
        Class<C15012UJr> cls8 = C15012UJr.class;
        this.A0Z = (AnonymousClass6B0) C18807W3e.A03(cls8, byteBuffer, i, 34);
        this.A0V = (AnonymousClass6B8) C18807W3e.A03(UK2.class, byteBuffer, i, 35);
        this.A0T = C18807W3e.A04(cls7, byteBuffer, i, 36);
        this.A0d = (AnonymousClass6B0) C18807W3e.A03(cls8, byteBuffer, i, 37);
        this.A09 = C18807W3e.A01(byteBuffer, i, 38);
        this.A0l = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 39);
        this.A00 = C18807W3e.A00(byteBuffer, i, 40);
        this.A01 = C18807W3e.A00(byteBuffer, i, 41);
        float f3 = -1.0f;
        int A026 = C18807W3e.A02(byteBuffer, i, 42);
        if (A026 != 0) {
            f3 = byteBuffer.getFloat(A026);
        }
        this.A05 = f3;
        this.A0i = (AnonymousClass6B4) C18807W3e.A03(cls4, byteBuffer, i, 43);
        this.A03 = C18807W3e.A00(byteBuffer, i, 44);
        this.A0e = C18807W3e.A03(cls6, byteBuffer, i, 45);
        this.A0Y = (AnonymousClass6B0) C18807W3e.A03(cls5, byteBuffer, i, 46);
        boolean z = false;
        int A027 = C18807W3e.A02(byteBuffer, i, 47);
        if (A027 != 0 && byteBuffer.get(A027) == 1) {
            z = true;
        }
        this.A0u = z;
        this.A02 = C18807W3e.A00(byteBuffer, i, 48);
        this.A0O = A00(byteBuffer, i, 49);
        this.A0L = A00(byteBuffer, i, 50);
        this.A0w = C18807W3e.A08(byteBuffer, i, 51);
        this.A0y = (AnonymousClass6B4[]) C18807W3e.A0A(cls4, byteBuffer, i, 52);
        this.A0K = A00(byteBuffer, i, 53);
        this.A0s = C18807W3e.A06(byteBuffer, i, 57);
        C18807W3e.A06(byteBuffer, i, 58);
        this.A0C = C18807W3e.A01(byteBuffer, i, 59);
        this.A0U = C18807W3e.A04(cls7, byteBuffer, i, 60);
        this.A0A = C18807W3e.A01(byteBuffer, i, 61);
        int A028 = C18807W3e.A02(byteBuffer, i, 62);
        if (A028 != 0) {
            byteBuffer.getFloat(A028);
        }
        this.A0D = C18807W3e.A01(byteBuffer, i, 63);
        this.A0B = C18807W3e.A01(byteBuffer, i, 64);
        boolean z2 = false;
        int A029 = C18807W3e.A02(byteBuffer, i, 65);
        if (A029 != 0 && byteBuffer.get(A029) == 1) {
            z2 = true;
        }
        this.A0v = z2;
        this.A0R = (WI9) C18807W3e.A04(WI9.class, byteBuffer, i, 66);
        this.A0r = (C71542dx) C18807W3e.A04(UKB.class, byteBuffer, i, 67);
        boolean z3 = false;
        int A0210 = C18807W3e.A02(byteBuffer, i, 68);
        if (A0210 != 0 && byteBuffer.get(A0210) == 1) {
            z3 = true;
        }
        this.A0t = z3;
        this.A0Q = (WI7) C18807W3e.A03(WI7.class, byteBuffer, i, 122);
    }
}
