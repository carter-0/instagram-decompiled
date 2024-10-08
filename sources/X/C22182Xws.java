package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.dsp.core.OpacityData;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Xws  reason: case insensitive filesystem */
public final class C22182Xws implements JRA {
    public static final C22182Xws A00 = new Object();

    public final GNY AE2(Integer num) {
        if (C51967G9n.A03(num, 0) == 5) {
            return new GNY((Object) C21255XRa.A24, 1.0f, 0);
        }
        return C22184Xwu.A00.AE2(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        return new com.facebook.dsp.core.ColorData(r0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        r5 = 16777215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0116, code lost:
        return X.C21053XCe.A06(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        return X.C21053XCe.A06(r8, -14079703);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.dsp.core.ColorData AIK(X.C21255XRa r11) {
        /*
            r10 = this;
            int r9 = X.C21053XCe.A02(r11)
            r8 = -14141117(0xffffffffff283943, float:-2.2360762E38)
            r7 = -4934476(0xffffffffffb4b4b4, float:NaN)
            r6 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            r5 = -13092808(0xffffffffff383838, float:-2.4486986E38)
            r4 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            r3 = -14737633(0xffffffffff1f1f1f, float:-2.1150884E38)
            r0 = -14079703(0xffffffffff292929, float:-2.2485325E38)
            r1 = -1
            r2 = -1842205(0xffffffffffe3e3e3, float:NaN)
            switch(r9) {
                case 8: goto L_0x0117;
                case 25: goto L_0x010e;
                case 28: goto L_0x0107;
                case 29: goto L_0x0103;
                case 34: goto L_0x00fc;
                case 35: goto L_0x008d;
                case 36: goto L_0x00f5;
                case 37: goto L_0x0089;
                case 38: goto L_0x00ee;
                case 39: goto L_0x0085;
                case 40: goto L_0x0081;
                case 41: goto L_0x00e7;
                case 42: goto L_0x007d;
                case 43: goto L_0x00e0;
                case 44: goto L_0x0079;
                case 45: goto L_0x00d9;
                case 46: goto L_0x0075;
                case 47: goto L_0x00d2;
                case 48: goto L_0x0071;
                case 49: goto L_0x00cb;
                case 50: goto L_0x006d;
                case 51: goto L_0x00c4;
                case 52: goto L_0x0069;
                case 56: goto L_0x00bd;
                case 62: goto L_0x00b6;
                case 68: goto L_0x00b6;
                case 71: goto L_0x0112;
                case 77: goto L_0x0064;
                case 81: goto L_0x0112;
                case 89: goto L_0x00b0;
                case 90: goto L_0x00aa;
                case 94: goto L_0x005c;
                case 98: goto L_0x00a3;
                case 103: goto L_0x009e;
                case 107: goto L_0x0056;
                case 113: goto L_0x0096;
                case 126: goto L_0x004e;
                case 132: goto L_0x0049;
                case 133: goto L_0x0049;
                case 144: goto L_0x0041;
                case 156: goto L_0x003c;
                case 186: goto L_0x0037;
                case 188: goto L_0x002f;
                case 194: goto L_0x002a;
                case 195: goto L_0x0027;
                default: goto L_0x0020;
            }
        L_0x0020:
            X.XFg r0 = X.C21116XFg.A00
            com.facebook.dsp.core.ColorData r1 = r0.AIK(r11)
            return r1
        L_0x0027:
            r8 = -394759(0xfffffffffff9f9f9, float:NaN)
        L_0x002a:
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r8, r0)
            return r1
        L_0x002f:
            r0 = -2500135(0xffffffffffd9d9d9, float:NaN)
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r0, r1)
            return r1
        L_0x0037:
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r0, r8)
            return r1
        L_0x003c:
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r1, r3)
            return r1
        L_0x0041:
            r0 = -15263977(0xffffffffff171717, float:-2.0083332E38)
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r1, r0)
            return r1
        L_0x0049:
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r6, r7)
            return r1
        L_0x004e:
            r4 = -3419431(0xffffffffffcbd2d9, float:NaN)
            r5 = -12105913(0xffffffffff474747, float:-2.6488646E38)
            goto L_0x0112
        L_0x0056:
            com.facebook.dsp.core.ColorData r1 = new com.facebook.dsp.core.ColorData
            r1.<init>(r2, r2)
            return r1
        L_0x005c:
            r4 = 2132552499(0x7f1c2b33, float:2.0758387E38)
            r5 = 1728053247(0x66ffffff, float:6.0446287E23)
            goto L_0x0112
        L_0x0064:
            r4 = 421276467(0x191c2b33, float:8.073735E-24)
            goto L_0x010a
        L_0x0069:
            r0 = -6729499(0xffffffffff9950e5, float:NaN)
            goto L_0x0090
        L_0x006d:
            r0 = -15028314(0xffffffffff1aafa6, float:-2.0561313E38)
            goto L_0x0090
        L_0x0071:
            r0 = -1745301(0xffffffffffe55e6b, float:NaN)
            goto L_0x0090
        L_0x0075:
            r0 = -9614619(0xffffffffff6d4ae5, float:-3.154159E38)
            goto L_0x0090
        L_0x0079:
            r0 = -3198303(0xffffffffffcf32a1, float:NaN)
            goto L_0x0090
        L_0x007d:
            r0 = -1797054(0xffffffffffe49442, float:NaN)
            goto L_0x0090
        L_0x0081:
            r0 = -10258294(0xffffffffff63788a, float:-3.0236063E38)
            goto L_0x0090
        L_0x0085:
            r0 = -15959774(0xffffffffff0c7922, float:-1.8672088E38)
            goto L_0x0090
        L_0x0089:
            r0 = -16747038(0xffffffffff0075e2, float:-1.7075327E38)
            goto L_0x0090
        L_0x008d:
            r0 = -7882779(0xffffffffff87b7e5, float:NaN)
        L_0x0090:
            com.facebook.dsp.core.ColorData r1 = new com.facebook.dsp.core.ColorData
            r1.<init>(r0, r0)
            return r1
        L_0x0096:
            r0 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r0, r2)
            return r1
        L_0x009e:
            r4 = -1
            r5 = -657931(0xfffffffffff5f5f5, float:NaN)
            goto L_0x0112
        L_0x00a3:
            r4 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r5 = -11447983(0xffffffffff515151, float:-2.7823087E38)
            goto L_0x0112
        L_0x00aa:
            r4 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r5 = -870704614(0xffffffffcc1a1a1a, float:-4.0396904E7)
            goto L_0x0112
        L_0x00b0:
            r4 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r5 = -1306912230(0xffffffffb21a1a1a, float:-8.969915E-9)
            goto L_0x0112
        L_0x00b6:
            r4 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r5 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x0112
        L_0x00bd:
            r4 = -2169879(0xffffffffffdee3e9, float:NaN)
            r5 = -13224394(0xffffffffff363636, float:-2.4220097E38)
            goto L_0x0112
        L_0x00c4:
            r4 = -5613057(0xffffffffffaa59ff, float:NaN)
            r5 = -5613057(0xffffffffffaa59ff, float:NaN)
            goto L_0x0112
        L_0x00cb:
            r4 = -14826567(0xffffffffff1dc3b9, float:-2.0970505E38)
            r5 = -14826567(0xffffffffff1dc3b9, float:-2.0970505E38)
            goto L_0x0112
        L_0x00d2:
            r4 = -38793(0xffffffffffff6877, float:NaN)
            r5 = -38793(0xffffffffffff6877, float:NaN)
            goto L_0x0112
        L_0x00d9:
            r4 = -8826113(0xffffffffff7952ff, float:-3.3140871E38)
            r5 = -8826113(0xffffffffff7952ff, float:-3.3140871E38)
            goto L_0x0112
        L_0x00e0:
            r4 = -1689421(0xffffffffffe638b3, float:NaN)
            r5 = -1689421(0xffffffffffe638b3, float:NaN)
            goto L_0x0112
        L_0x00e7:
            r4 = -154551(0xfffffffffffda449, float:NaN)
            r5 = -154551(0xfffffffffffda449, float:NaN)
            goto L_0x0112
        L_0x00ee:
            r4 = -15890906(0xffffffffff0d8626, float:-1.8811769E38)
            r5 = -15890906(0xffffffffff0d8626, float:-1.8811769E38)
            goto L_0x0112
        L_0x00f5:
            r4 = -16743685(0xffffffffff0082fb, float:-1.7082127E38)
            r5 = -16743685(0xffffffffff0082fb, float:-1.7082127E38)
            goto L_0x0112
        L_0x00fc:
            r4 = -6894593(0xffffffffff96cbff, float:NaN)
            r5 = -6894593(0xffffffffff96cbff, float:NaN)
            goto L_0x0112
        L_0x0103:
            r5 = -11711155(0xffffffffff4d4d4d, float:-2.728931E38)
            goto L_0x0112
        L_0x0107:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
        L_0x010a:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x0112
        L_0x010e:
            r4 = -1
            r5 = -14408668(0xffffffffff242424, float:-2.1818104E38)
        L_0x0112:
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r4, r5)
            return r1
        L_0x0117:
            r0 = -920329(0xfffffffffff1f4f7, float:NaN)
            com.facebook.dsp.core.ColorData r1 = X.C21053XCe.A06(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22182Xws.AIK(X.XRa):com.facebook.dsp.core.ColorData");
    }

    public final int AKp(Integer num) {
        switch (C21053XCe.A03(num)) {
            case 4:
            case 5:
            case 26:
                return 8;
            case 16:
                return 12;
            case 17:
                return 10;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return 4;
            default:
                return C21116XFg.A00.AKp(num);
        }
    }

    public final boolean AVl(Integer num) {
        return C21053XCe.A07(num).AVl(num);
    }

    public final OpacityData E0e(C54642HLz hLz) {
        int A02 = C21053XCe.A02(hLz);
        float f = 0.1f;
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
            return new OpacityData(0.05f, 0.03f);
        }
        return new OpacityData(f, f);
    }

    public final float Evg(Integer num) {
        return C21053XCe.A07(num).Evg(num);
    }

    public final float EwD(Integer num) {
        switch (C21053XCe.A03(num)) {
            case 23:
            case 32:
            case 75:
            case 76:
                return 8.0f;
            case 24:
                return 29.0f;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return 6.0f;
            case 33:
            case 73:
                return 10.0f;
            case 34:
                return 32.0f;
            case 35:
            case 36:
            case 40:
            case 74:
                return 0.0f;
            default:
                return C21116XFg.A00.EwD(num);
        }
    }

    public final C55796Hnc FIL(Integer num) {
        float f;
        float f2;
        XSX xsx;
        Integer num2;
        C55432Hhc hhc;
        float f3 = 1.04f;
        switch (C21053XCe.A03(num)) {
            case 0:
                xsx = XSX.OPTIMISTIC_TEXT_APP_REGULAR;
                f2 = 15.0f;
                num2 = AnonymousClass05K.A00;
                f = -0.02f;
                break;
            case 1:
                xsx = XSX.OPTIMISTIC_TEXT_APP_BOLD;
                num2 = AnonymousClass05K.A00;
                hhc = new C55432Hhc(1.04f);
                f2 = 15.0f;
                f = -0.02f;
                break;
            case 2:
            case 3:
                xsx = XSX.OPTIMISTIC_DISPLAY_APP;
                num2 = AnonymousClass05K.A00;
                hhc = new C55432Hhc(0.96f);
                f2 = 24.0f;
                f = 0.12f;
                break;
            case 4:
                xsx = XSX.OPTIMISTIC_TEXT_APP_BOLD;
                f2 = 17.0f;
                num2 = AnonymousClass05K.A00;
                f = 0.06f;
                f3 = 1.001f;
                break;
            case 5:
                xsx = XSX.OPTIMISTIC_TEXT_APP_REGULAR;
                f2 = 13.0f;
                num2 = AnonymousClass05K.A00;
                f = -0.04f;
                f3 = 1.1f;
                break;
            case 6:
                xsx = XSX.OPTIMISTIC_TEXT_APP_BOLD;
                f2 = 13.0f;
                num2 = AnonymousClass05K.A00;
                f = -0.04f;
                f3 = 1.06f;
                break;
            case 7:
                xsx = XSX.OPTIMISTIC_TEXT_APP_MEDIUM;
                num2 = AnonymousClass05K.A00;
                hhc = new C55432Hhc(0.96f);
                f2 = 16.0f;
                f = -0.1f;
                break;
            case 8:
                xsx = XSX.OPTIMISTIC_TEXT_APP_MEDIUM;
                f2 = 15.0f;
                num2 = AnonymousClass05K.A00;
                f = -0.06f;
                break;
            case 9:
                xsx = XSX.OPTIMISTIC_TEXT_APP;
                f2 = 11.0f;
                num2 = AnonymousClass05K.A00;
                f = -0.04f;
                f3 = 1.27f;
                break;
            default:
                return C21116XFg.A00.FIL(num);
        }
        hhc = new C55432Hhc(f3);
        return new C55796Hnc(hhc, num2, xsx, f2, f);
    }
}
