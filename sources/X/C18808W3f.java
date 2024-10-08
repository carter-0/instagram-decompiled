package X;

import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;

/* renamed from: X.W3f  reason: case insensitive filesystem */
public final class C18808W3f {
    public static final ColorMatrix A03(float f) {
        float f2 = 1.0f - f;
        float[] fArr = new float[20];
        fArr[0] = (0.7874f * f2) + 0.2126f;
        float f3 = 0.7152f - (f2 * 0.7152f);
        fArr[1] = f3;
        float f4 = 0.0722f - (f2 * 0.0722f);
        fArr[2] = f4;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        float f5 = 0.2126f - (f2 * 0.2126f);
        fArr[5] = f5;
        fArr[6] = (0.2848f * f2) + 0.7152f;
        fArr[7] = f4;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = f5;
        fArr[11] = f3;
        C13990Tnq.A1X(fArr, (f2 * 0.9278f) + 0.0722f, 0.0f);
        fArr[14] = 0.0f;
        return A07(fArr);
    }

    public static final ColorMatrix A04(float f) {
        double radians = Math.toRadians((double) f);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float[] fArr = new float[20];
        fArr[0] = ((cos * 0.787f) + 0.213f) - (sin * 0.213f);
        float f2 = 0.715f - (cos * 0.715f);
        float f3 = sin * 0.715f;
        fArr[1] = f2 - f3;
        float f4 = 0.072f - (cos * 0.072f);
        fArr[2] = (sin * 0.928f) + f4;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        float f5 = 0.213f - (cos * 0.213f);
        fArr[5] = (0.143f * sin) + f5;
        fArr[6] = (0.285f * cos) + 0.715f + (0.14f * sin);
        fArr[7] = f4 - (0.283f * sin);
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = f5 - (0.787f * sin);
        fArr[11] = f2 + f3;
        C13990Tnq.A1X(fArr, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f);
        fArr[14] = 0.0f;
        return A07(fArr);
    }

    public static final ColorMatrix A05(float f) {
        float f2 = 1.0f - (2.0f * f);
        float f3 = f * 255.0f;
        float[] fArr = new float[20];
        fArr[0] = f2;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        C13990Tnq.A1Y(fArr, f3, 0.0f, f2);
        fArr[8] = 0.0f;
        fArr[9] = f3;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        C13990Tnq.A1X(fArr, f2, 0.0f);
        fArr[14] = f3;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        return new ColorMatrix(fArr);
    }

    public static final ColorMatrix A06(float f) {
        float f2 = 1.0f - f;
        float[] fArr = new float[20];
        fArr[0] = (0.607f * f2) + 0.393f;
        fArr[1] = 0.769f - (f2 * 0.769f);
        fArr[2] = 0.189f - (f2 * 0.189f);
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.349f - (f2 * 0.349f);
        fArr[6] = (0.314f * f2) + 0.686f;
        fArr[7] = 0.168f - (f2 * 0.168f);
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.272f - (f2 * 0.272f);
        fArr[11] = 0.534f - (f2 * 0.534f);
        C13990Tnq.A1X(fArr, (f2 * 0.869f) + 0.131f, 0.0f);
        fArr[14] = 0.0f;
        return A07(fArr);
    }

    public static ColorMatrix A07(float[] fArr) {
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        return new ColorMatrix(fArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016f, code lost:
        if (r4 != null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0171, code lost:
        r0 = new android.graphics.ColorMatrixColorFilter(r5);
        r4 = android.graphics.RenderEffect.createColorFilterEffect(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0178, code lost:
        X.0qQ.A0A(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017f, code lost:
        r0 = new android.graphics.ColorMatrixColorFilter(r5);
        r4 = android.graphics.RenderEffect.createColorFilterEffect(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        throw X.AnonymousClass7TF.A0W("Invalid filter name: ", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.RenderEffect A09(com.facebook.react.bridge.ReadableArray r10) {
        /*
            r4 = 0
            r3 = 0
            int r2 = r10.size()
        L_0x0006:
            if (r3 >= r2) goto L_0x0187
            com.facebook.react.bridge.ReadableMap r0 = r10.getMap(r3)
            java.util.Iterator r0 = r0.getEntryIterator()
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r0)
            java.lang.String r1 = X.DbT.A13(r5)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2114203985: goto L_0x0159;
                case -1267206133: goto L_0x0142;
                case -1183703082: goto L_0x0131;
                case -905411385: goto L_0x0120;
                case -566947070: goto L_0x010f;
                case 3027047: goto L_0x00e8;
                case 109324790: goto L_0x00d6;
                case 648162385: goto L_0x00be;
                case 650888307: goto L_0x00ac;
                case 906978543: goto L_0x0026;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "Invalid filter name: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r1)
            throw r0
        L_0x0026:
            java.lang.String r0 = "dropShadow"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r5 = r5.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap"
            X.0qQ.A0C(r5, r0)
            com.facebook.react.bridge.ReadableMap r5 = (com.facebook.react.bridge.ReadableMap) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r0 = "offsetX"
            float r9 = X.W2U.A04(r5, r0)
            java.lang.String r0 = "offsetY"
            float r8 = X.W2U.A04(r5, r0)
            java.lang.String r1 = "color"
            boolean r0 = r5.hasKey(r1)
            if (r0 == 0) goto L_0x00a9
            int r7 = r5.getInt(r1)
        L_0x0055:
            java.lang.String r1 = "standardDeviation"
            boolean r0 = r5.hasKey(r1)
            if (r0 == 0) goto L_0x00a7
            double r5 = r5.getDouble(r1)
            float r0 = (float) r5
            float r6 = A00(r0)
        L_0x0066:
            r0 = 0
            if (r4 != 0) goto L_0x009b
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createOffsetEffect(r0, r0)
            X.0qQ.A07(r0)
            android.graphics.RenderEffect r5 = android.graphics.RenderEffect.createOffsetEffect(r9, r8)
        L_0x0074:
            X.0qQ.A07(r5)
            android.graphics.BlendMode r4 = android.graphics.BlendMode.SRC_IN
            android.graphics.BlendModeColorFilter r1 = new android.graphics.BlendModeColorFilter
            r1.<init>(r7, r4)
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createColorFilterEffect(r1, r5)
            X.0qQ.A07(r4)
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.DECAL
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createBlurEffect(r6, r6, r4, r1)
            X.0qQ.A07(r4)
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createBlendModeEffect(r4, r0, r1)
            X.0qQ.A07(r4)
            goto L_0x017b
        L_0x009b:
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createOffsetEffect(r0, r0, r4)
            X.0qQ.A07(r0)
            android.graphics.RenderEffect r5 = android.graphics.RenderEffect.createOffsetEffect(r9, r8, r4)
            goto L_0x0074
        L_0x00a7:
            r6 = 0
            goto L_0x0066
        L_0x00a9:
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0055
        L_0x00ac:
            java.lang.String r0 = "hueRotate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r0 = A01(r5)
            android.graphics.ColorMatrix r5 = A04(r0)
            goto L_0x016d
        L_0x00be:
            java.lang.String r0 = "brightness"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r1 = A01(r5)
            android.graphics.ColorMatrix r5 = new android.graphics.ColorMatrix
            r5.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setScale(r1, r1, r1, r0)
            goto L_0x016d
        L_0x00d6:
            java.lang.String r0 = "sepia"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r0 = A01(r5)
            android.graphics.ColorMatrix r5 = A06(r0)
            goto L_0x016d
        L_0x00e8:
            java.lang.String r0 = "blur"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r1 = A01(r5)
            double r5 = (double) r1
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00fd
            r4 = 0
            goto L_0x017b
        L_0x00fd:
            float r1 = A00(r1)
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.DECAL
            if (r4 != 0) goto L_0x010a
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createBlurEffect(r1, r1, r0)
            goto L_0x017b
        L_0x010a:
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createBlurEffect(r1, r1, r4, r0)
            goto L_0x017b
        L_0x010f:
            java.lang.String r0 = "contrast"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r0 = A01(r5)
            android.graphics.ColorMatrix r5 = A02(r0)
            goto L_0x016d
        L_0x0120:
            java.lang.String r0 = "grayscale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r0 = A01(r5)
            android.graphics.ColorMatrix r5 = A03(r0)
            goto L_0x016d
        L_0x0131:
            java.lang.String r0 = "invert"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r0 = A01(r5)
            android.graphics.ColorMatrix r5 = A05(r0)
            goto L_0x016d
        L_0x0142:
            java.lang.String r0 = "opacity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r1 = A01(r5)
            android.graphics.ColorMatrix r5 = new android.graphics.ColorMatrix
            r5.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setScale(r0, r0, r0, r1)
            goto L_0x016d
        L_0x0159:
            java.lang.String r0 = "saturate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            float r0 = A01(r5)
            android.graphics.ColorMatrix r5 = new android.graphics.ColorMatrix
            r5.<init>()
            r5.setSaturation(r0)
        L_0x016d:
            android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
            if (r4 != 0) goto L_0x017f
            r0.<init>(r5)
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createColorFilterEffect(r0)
        L_0x0178:
            X.0qQ.A0A(r4)
        L_0x017b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x017f:
            r0.<init>(r5)
            android.graphics.RenderEffect r4 = android.graphics.RenderEffect.createColorFilterEffect(r0, r4)
            goto L_0x0178
        L_0x0187:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18808W3f.A09(com.facebook.react.bridge.ReadableArray):android.graphics.RenderEffect");
    }

    public static final boolean A0A(ReadableArray readableArray) {
        if (readableArray.size() == 0) {
            return false;
        }
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            Object A0Y = C13991Tnr.A0Y(readableArray.getMap(i).getEntryIterator());
            if (0qQ.A0K(A0Y, "blur") || 0qQ.A0K(A0Y, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static float A01(Map.Entry entry) {
        String A00 = AnonymousClass000.A00(721);
        Object value = entry.getValue();
        0qQ.A0C(value, A00);
        return (float) ((Number) value).doubleValue();
    }

    public static final ColorMatrix A02(float f) {
        float f2 = 255.0f * ((-(f / 2.0f)) + 0.5f);
        float[] fArr = new float[20];
        fArr[0] = f;
        C13989Tnp.A1U(fArr, 0.0f);
        C13990Tnq.A1Y(fArr, f2, 0.0f, f);
        fArr[8] = 0.0f;
        fArr[9] = f2;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        C13990Tnq.A1X(fArr, f, 0.0f);
        fArr[14] = f2;
        return A07(fArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r5.preConcat(r2);
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.ColorMatrixColorFilter A08(com.facebook.react.bridge.ReadableArray r8) {
        /*
            android.graphics.ColorMatrix r5 = new android.graphics.ColorMatrix
            r5.<init>()
            r6 = 0
            int r4 = r8.size()
        L_0x000a:
            if (r6 >= r4) goto L_0x00ba
            com.facebook.react.bridge.ReadableMap r0 = r8.getMap(r6)
            java.util.Iterator r0 = r0.getEntryIterator()
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r0)
            java.lang.String r7 = X.DbT.A13(r0)
            java.lang.Object r1 = r0.getValue()
            r0 = 721(0x2d1, float:1.01E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            double r2 = X.JTO.A00(r1)
            float r1 = (float) r2
            int r0 = r7.hashCode()
            switch(r0) {
                case -2114203985: goto L_0x00a3;
                case -1267206133: goto L_0x0090;
                case -1183703082: goto L_0x0083;
                case -905411385: goto L_0x0076;
                case -566947070: goto L_0x0069;
                case 109324790: goto L_0x005c;
                case 648162385: goto L_0x0049;
                case 650888307: goto L_0x003c;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.String r0 = "Invalid color matrix filter: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r7)
            throw r0
        L_0x003c:
            java.lang.String r0 = "hueRotate"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = A04(r1)
            goto L_0x00b3
        L_0x0049:
            java.lang.String r0 = "brightness"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = new android.graphics.ColorMatrix
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r1, r1, r1, r0)
            goto L_0x00b3
        L_0x005c:
            java.lang.String r0 = "sepia"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = A06(r1)
            goto L_0x00b3
        L_0x0069:
            java.lang.String r0 = "contrast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = A02(r1)
            goto L_0x00b3
        L_0x0076:
            java.lang.String r0 = "grayscale"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = A03(r1)
            goto L_0x00b3
        L_0x0083:
            java.lang.String r0 = "invert"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = A05(r1)
            goto L_0x00b3
        L_0x0090:
            java.lang.String r0 = "opacity"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = new android.graphics.ColorMatrix
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r0, r0, r0, r1)
            goto L_0x00b3
        L_0x00a3:
            java.lang.String r0 = "saturate"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0035
            android.graphics.ColorMatrix r2 = new android.graphics.ColorMatrix
            r2.<init>()
            r2.setSaturation(r1)
        L_0x00b3:
            r5.preConcat(r2)
            int r6 = r6 + 1
            goto L_0x000a
        L_0x00ba:
            android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18808W3f.A08(com.facebook.react.bridge.ReadableArray):android.graphics.ColorMatrixColorFilter");
    }

    public static final float A00(float f) {
        return (W2U.A01(f) - 0.5f) / 0.57735f;
    }
}
