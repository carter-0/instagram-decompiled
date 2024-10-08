package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.W1q  reason: case insensitive filesystem */
public final class C18788W1q {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2.equals(r0) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return 700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r2.equals(r0) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        return org.webrtc.ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.String r2) {
        /*
            r1 = -1
            if (r2 == 0) goto L_0x000a
            int r0 = r2.hashCode()
            switch(r0) {
                case -1039745817: goto L_0x0069;
                case 48625: goto L_0x005e;
                case 49586: goto L_0x0053;
                case 50547: goto L_0x0048;
                case 51508: goto L_0x0045;
                case 52469: goto L_0x003a;
                case 53430: goto L_0x002f;
                case 54391: goto L_0x0024;
                case 55352: goto L_0x0019;
                case 56313: goto L_0x000e;
                case 3029637: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            return r1
        L_0x000b:
            java.lang.String r0 = "bold"
            goto L_0x0026
        L_0x000e:
            java.lang.String r0 = "900"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 900(0x384, float:1.261E-42)
            return r1
        L_0x0019:
            java.lang.String r0 = "800"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 800(0x320, float:1.121E-42)
            return r1
        L_0x0024:
            java.lang.String r0 = "700"
        L_0x0026:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 700(0x2bc, float:9.81E-43)
            return r1
        L_0x002f:
            java.lang.String r0 = "600"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 600(0x258, float:8.41E-43)
            return r1
        L_0x003a:
            java.lang.String r0 = "500"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 500(0x1f4, float:7.0E-43)
            return r1
        L_0x0045:
            java.lang.String r0 = "400"
            goto L_0x006b
        L_0x0048:
            java.lang.String r0 = "300"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 300(0x12c, float:4.2E-43)
            return r1
        L_0x0053:
            java.lang.String r0 = "200"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 200(0xc8, float:2.8E-43)
            return r1
        L_0x005e:
            java.lang.String r0 = "100"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 100
            return r1
        L_0x0069:
            java.lang.String r0 = "normal"
        L_0x006b:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1 = 400(0x190, float:5.6E-43)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18788W1q.A01(java.lang.String):int");
    }

    public static Typeface A02(AssetManager assetManager, Typeface typeface, String str, int i, int i2) {
        int i3;
        Typeface typeface2;
        boolean z = false;
        if (i == -1) {
            i = 0;
        } else if ((i & 2) != 0) {
            z = true;
        }
        if (i2 == -1) {
            int i4 = i & 1;
            i2 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            if (i4 != 0) {
                i2 = 700;
            }
        }
        if (str != null) {
            C18450Vry vry = C18450Vry.A02;
            Map map = vry.A00;
            if (map.containsKey(str)) {
                typeface = (Typeface) map.get(str);
            } else {
                Map map2 = vry.A01;
                Object obj = map2.get(str);
                if (obj == null) {
                    obj = new VLf();
                    map2.put(str, obj);
                }
                VLf vLf = (VLf) obj;
                if (i2 < 700) {
                    i3 = 0;
                    if (z) {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                    if (z) {
                        i3 = 3;
                    }
                }
                SparseArray sparseArray = vLf.A00;
                Typeface typeface3 = (Typeface) sparseArray.get(i3);
                if (typeface3 != null) {
                    return typeface3;
                }
                if (assetManager != null) {
                    String str2 = C18450Vry.A03[i3];
                    String[] strArr = C18450Vry.A04;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 2) {
                            break;
                        }
                        try {
                            typeface2 = Typeface.createFromAsset(assetManager, 002.A0u("fonts/", str, str2, strArr[i5]));
                            0qQ.A07(typeface2);
                            break;
                        } catch (RuntimeException unused) {
                            i5++;
                        }
                    }
                }
                typeface2 = Typeface.create(str, i3);
                0qQ.A07(typeface2);
                sparseArray.put(i3, typeface2);
                return typeface2;
            }
        } else if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        Typeface create = Typeface.create(typeface, i2, z);
        0qQ.A0A(create);
        return create;
    }

    public static int A00(String str) {
        if (str == null) {
            return -1;
        }
        if ("italic".equals(str)) {
            return 2;
        }
        if (!"normal".equals(str)) {
            return -1;
        }
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ad, code lost:
        r1.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(com.facebook.react.bridge.ReadableArray r4) {
        /*
            if (r4 == 0) goto L_0x01b9
            int r0 = r4.size()
            if (r0 == 0) goto L_0x01b9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L_0x000e:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x01b2
            java.lang.String r3 = r4.getString(r2)
            if (r3 == 0) goto L_0x0021
            int r0 = r3.hashCode()
            switch(r0) {
                case -1983120972: goto L_0x01a3;
                case -1933522176: goto L_0x0198;
                case -1534462052: goto L_0x018d;
                case -1195362251: goto L_0x0182;
                case -1061392823: goto L_0x0177;
                case -899039099: goto L_0x016c;
                case -771984547: goto L_0x0161;
                case -672279417: goto L_0x0156;
                case -659678800: goto L_0x014b;
                case 249095901: goto L_0x0140;
                case 273808209: goto L_0x0135;
                case 289909490: goto L_0x0125;
                case 296506098: goto L_0x0119;
                case 309330544: goto L_0x010d;
                case 310339585: goto L_0x0101;
                case 604478526: goto L_0x00f5;
                case 915975441: goto L_0x00e9;
                case 979426287: goto L_0x00dd;
                case 979432035: goto L_0x00d1;
                case 979664367: goto L_0x00c5;
                case 1001434505: goto L_0x00b9;
                case 1001438213: goto L_0x00ad;
                case 1001439040: goto L_0x00a1;
                case 1001439599: goto L_0x0095;
                case 1030714463: goto L_0x0089;
                case 1044065430: goto L_0x007d;
                case 1044067310: goto L_0x0071;
                case 1082592379: goto L_0x0065;
                case 1183323111: goto L_0x0059;
                case 1223989350: goto L_0x0048;
                case 1463562569: goto L_0x003c;
                case 1648446397: goto L_0x0030;
                case 2097122634: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0024:
            java.lang.String r0 = "stylistic-seventeen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss17'"
            goto L_0x01ad
        L_0x0030:
            java.lang.String r0 = "stylistic-fourteen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss14'"
            goto L_0x01ad
        L_0x003c:
            java.lang.String r0 = "stylistic-nineteen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss19'"
            goto L_0x01ad
        L_0x0048:
            java.lang.String r0 = "common-ligatures"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'liga'"
            r1.add(r0)
            java.lang.String r0 = "'clig'"
            goto L_0x01ad
        L_0x0059:
            java.lang.String r0 = "small-caps"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'smcp'"
            goto L_0x01ad
        L_0x0065:
            java.lang.String r0 = "no-discretionary-ligatures"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'dlig' off"
            goto L_0x01ad
        L_0x0071:
            java.lang.String r0 = "stylistic-twenty"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss20'"
            goto L_0x01ad
        L_0x007d:
            java.lang.String r0 = "stylistic-twelve"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss12'"
            goto L_0x01ad
        L_0x0089:
            java.lang.String r0 = "stylistic-sixteen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss16'"
            goto L_0x01ad
        L_0x0095:
            java.lang.String r0 = "stylistic-two"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss02'"
            goto L_0x01ad
        L_0x00a1:
            java.lang.String r0 = "stylistic-ten"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss10'"
            goto L_0x01ad
        L_0x00ad:
            java.lang.String r0 = "stylistic-six"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss06'"
            goto L_0x01ad
        L_0x00b9:
            java.lang.String r0 = "stylistic-one"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss01'"
            goto L_0x01ad
        L_0x00c5:
            java.lang.String r0 = "stylistic-nine"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss09'"
            goto L_0x01ad
        L_0x00d1:
            java.lang.String r0 = "stylistic-four"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss04'"
            goto L_0x01ad
        L_0x00dd:
            java.lang.String r0 = "stylistic-five"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss05'"
            goto L_0x01ad
        L_0x00e9:
            java.lang.String r0 = "no-historical-ligatures"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'hlig' off"
            goto L_0x01ad
        L_0x00f5:
            java.lang.String r0 = "stylistic-eleven"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss11'"
            goto L_0x01ad
        L_0x0101:
            java.lang.String r0 = "stylistic-three"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss03'"
            goto L_0x01ad
        L_0x010d:
            java.lang.String r0 = "stylistic-seven"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss07'"
            goto L_0x01ad
        L_0x0119:
            java.lang.String r0 = "stylistic-eight"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss08'"
            goto L_0x01ad
        L_0x0125:
            java.lang.String r0 = "no-common-ligatures"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'liga' off"
            r1.add(r0)
            java.lang.String r0 = "'clig' off"
            goto L_0x01ad
        L_0x0135:
            java.lang.String r0 = "contextual"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'calt'"
            goto L_0x01ad
        L_0x0140:
            java.lang.String r0 = "no-contextual"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'calt' off"
            goto L_0x01ad
        L_0x014b:
            java.lang.String r0 = "oldstyle-nums"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'onum'"
            goto L_0x01ad
        L_0x0156:
            java.lang.String r0 = "discretionary-ligatures"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'dlig'"
            goto L_0x01ad
        L_0x0161:
            java.lang.String r0 = "tabular-nums"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'tnum'"
            goto L_0x01ad
        L_0x016c:
            java.lang.String r0 = "historical-ligatures"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'hlig'"
            goto L_0x01ad
        L_0x0177:
            java.lang.String r0 = "lining-nums"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'lnum'"
            goto L_0x01ad
        L_0x0182:
            java.lang.String r0 = "proportional-nums"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'pnum'"
            goto L_0x01ad
        L_0x018d:
            java.lang.String r0 = "stylistic-eighteen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss18'"
            goto L_0x01ad
        L_0x0198:
            java.lang.String r0 = "stylistic-fifteen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss15'"
            goto L_0x01ad
        L_0x01a3:
            java.lang.String r0 = "stylistic-thirteen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "'ss13'"
        L_0x01ad:
            r1.add(r0)
            goto L_0x0021
        L_0x01b2:
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            return r0
        L_0x01b9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18788W1q.A03(com.facebook.react.bridge.ReadableArray):java.lang.String");
    }
}
