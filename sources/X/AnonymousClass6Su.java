package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

/* renamed from: X.6Su  reason: invalid class name */
public abstract class AnonymousClass6Su {
    public static final ThreadLocal A00 = new C308126Sv("#dp");
    public static final ThreadLocal A01 = new C308126Sv("#%");
    public static final ThreadLocal A02 = new C308126Sv("#px");
    public static final ThreadLocal A03 = new C308126Sv("#sp");

    public static float A00(String str) {
        try {
            return ((NumberFormat) A01.get()).parse(str).floatValue() * 100.0f;
        } catch (ParseException e) {
            throw new IOException(002.A0R("can't parse pixel value: ", str), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return ((NumberFormat) A02.get()).parse(str).floatValue();
            }
            if (str.endsWith("sp")) {
                return (float) Math.round(((NumberFormat) A03.get()).parse(str).floatValue() * C64361Kj.A00().A00.getResources().getDisplayMetrics().scaledDensity);
            }
            if (str.endsWith("%")) {
                return A00(str);
            }
            return (float) Math.round(((NumberFormat) A00.get()).parse(str).floatValue() * (((float) C64361Kj.A00().A00.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        } catch (ParseException e) {
            throw new IOException(002.A0R("can't parse pixel value: ", str), e);
        }
    }

    public static float A02(String str) {
        try {
            return ((NumberFormat) A03.get()).parse(str).floatValue();
        } catch (ParseException e) {
            throw new IOException(002.A0R("can't parse scaled pixel value: ", str), e);
        }
    }

    public static C14507TxT A0B(String str) {
        float A012;
        Integer num;
        if ("auto".equalsIgnoreCase(str)) {
            return C14507TxT.A02;
        }
        if (str.endsWith("%")) {
            A012 = Float.parseFloat(str.substring(0, str.length() - 1));
            num = AnonymousClass05K.A01;
        } else {
            A012 = A01(str);
            num = AnonymousClass05K.A00;
        }
        return new C14507TxT(num, A012);
    }

    public static int A03(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new IOException(002.A0R("can't parse color value: ", str), e);
        }
    }

    public static int A04(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                break;
            case 3154575:
                if (str.equals(AnonymousClass000.A00(290))) {
                    return 0;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                break;
            case 109413500:
                if (str.equals(AnonymousClass000.A00(369))) {
                    return 3;
                }
                break;
        }
        throw new IOException(002.A0R("Can't parse unknown datetime format: ", str));
    }

    public static int A05(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1292790694:
                str2 = "adjust_hidden";
                break;
            case -1009740956:
                if (str.equals("adjust_resize")) {
                    return 16;
                }
                break;
            case 1976678381:
                str2 = "adjust_pan";
                break;
        }
        if (str.equals(str2)) {
            return 32;
        }
        throw new IOException(002.A0R("can't parse unknown mode: ", str));
    }

    public static int A06(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 8388613;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 8388611;
                }
                break;
        }
        throw new IOException(002.A0R("can't parse unknown textAlign: ", str));
    }

    public static int A07(String str) {
        switch (str.hashCode()) {
            case 3212:
                if (str.equals("dp")) {
                    return 1;
                }
                break;
            case 3592:
                if (str.equals("px")) {
                    return 0;
                }
                break;
            case 3677:
                if (str.equals("sp")) {
                    return 2;
                }
                break;
        }
        throw new IOException(002.A0R("can't parse unknown textUniSize: ", str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r8.equals("bold") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        X.1Kn.A02("text_style_ignored", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        throw new java.io.IOException(X.002.A0R("can't parse unknown typeface: ", r8));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A08(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            java.lang.String r7 = "semibold"
            java.lang.String r6 = "light"
            java.lang.String r5 = "heavy"
            r4 = 3
            java.lang.String r3 = "normal"
            java.lang.String r2 = "medium"
            java.lang.String r1 = "bold"
            switch(r0) {
                case -1178781136: goto L_0x0077;
                case -1078030475: goto L_0x0064;
                case -1039745817: goto L_0x004a;
                case 3029637: goto L_0x0043;
                case 99152071: goto L_0x0036;
                case 102970646: goto L_0x0051;
                case 1223860979: goto L_0x0020;
                case 1734741290: goto L_0x002d;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.String r0 = "can't parse unknown typeface: "
            java.lang.String r1 = X.002.A0R(r0, r8)
            X.3yO r0 = new X.3yO
            r0.<init>(r1)
            throw r0
        L_0x0020:
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.002.A0g(r7, r0, r1)
            goto L_0x0070
        L_0x002d:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x0014
        L_0x0036:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.002.A0g(r5, r0, r1)
            goto L_0x0070
        L_0x0043:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0075
            goto L_0x0014
        L_0x004a:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x0062
            goto L_0x0014
        L_0x0051:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.002.A0g(r6, r0, r3)
            java.lang.String r0 = "text_style_ignored"
            X.1Kn.A02(r0, r1)
        L_0x0062:
            r4 = 0
            return r4
        L_0x0064:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.002.A0g(r2, r0, r1)
        L_0x0070:
            java.lang.String r0 = "text_style_ignored"
            X.1Kn.A02(r0, r1)
        L_0x0075:
            r4 = 1
        L_0x0076:
            return r4
        L_0x0077:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4 = 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Su.A08(java.lang.String):int");
    }

    public static GradientDrawable.Orientation A09(String str) {
        switch (str.hashCode()) {
            case -1451623918:
                if (str.equals("bottom_left_to_top_right")) {
                    return GradientDrawable.Orientation.BL_TR;
                }
                break;
            case -1118360059:
                if (str.equals("top_to_bottom")) {
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                break;
            case 404498110:
                if (str.equals("top_left_to_bottom_right")) {
                    return GradientDrawable.Orientation.TL_BR;
                }
                break;
            case 1553519760:
                if (str.equals("left_to_right")) {
                    return GradientDrawable.Orientation.LEFT_RIGHT;
                }
                break;
        }
        throw new IOException(002.A0R("can't parse orientation value: ", str));
    }

    public static ImageView.ScaleType A0A(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                break;
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                break;
            case 951526612:
                if (str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                break;
        }
        throw new IOException(002.A0R("can't parse unknown scaleType: ", str));
    }
}
