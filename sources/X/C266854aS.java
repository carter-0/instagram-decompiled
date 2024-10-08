package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import java.util.Map;

/* renamed from: X.4aS  reason: invalid class name and case insensitive filesystem */
public abstract class C266854aS {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C266864aT parseFromJson(X.16F r16) {
        /*
            r4 = 0
            r6 = r16
            X.0qQ.A0B(r6, r4)
            X.4aT r0 = new X.4aT     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == r3) goto L_0x0018
            r6.A0z()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x047d
        L_0x0018:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r9 = X.16L.A09     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == r9) goto L_0x047e
            java.lang.String r7 = r6.A0q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.String r1 = "filter_model_class"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5 = 0
            if (r1 == 0) goto L_0x0045
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x003c
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x003c:
            X.0qQ.A0B(r5, r4)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0L = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0041:
            r6.A0z()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0018
        L_0x0045:
            java.lang.String r1 = "filter_name"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x005f
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x0059
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0059:
            X.0qQ.A0B(r5, r4)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0M = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x005f:
            java.lang.String r1 = "texture_transform"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x008f
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x0089
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0074:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x0089
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.add(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0074
        L_0x0089:
            X.0qQ.A0B(r5, r4)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0S = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x008f:
            java.lang.String r1 = "content_transform"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x00bf
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x00b9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x00a4:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x00b9
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.add(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x00a4
        L_0x00b9:
            X.0qQ.A0B(r5, r4)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0R = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x00bf:
            java.lang.String r1 = "is_enabled"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0X = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x00cf:
            java.lang.String r1 = "strength"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x00e0
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0B = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x00e0:
            java.lang.String r1 = "brightness"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x00f1
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A00 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x00f1:
            java.lang.String r1 = "contrast"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0102
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A01 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0102:
            java.lang.String r1 = "saturation"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0113
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A07 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0113:
            java.lang.String r1 = "temperature"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0124
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0C = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0124:
            java.lang.String r1 = "fade"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0135
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A03 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0135:
            java.lang.String r1 = "vignette"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0146
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0F = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0146:
            java.lang.String r1 = "highlights"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0157
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A04 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0157:
            java.lang.String r1 = "shadows"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0168
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A08 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0168:
            java.lang.String r1 = "sharpen"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0179
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A09 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0179:
            java.lang.String r1 = "tint_shadows_intensity"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x018a
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0E = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x018a:
            java.lang.String r1 = "tint_shadows_color"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x01b8
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x01b4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x019f:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x01b4
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.add(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x019f
        L_0x01b4:
            r0.A0U = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x01b8:
            java.lang.String r1 = "tint_highlights_intensity"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x01c9
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0D = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x01c9:
            java.lang.String r1 = "tint_highlights_color"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x01f7
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x01f3
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x01de:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x01f3
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.add(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x01de
        L_0x01f3:
            r0.A0T = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x01f7:
            java.lang.String r1 = "isBlendEnabled"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0207
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0W = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0207:
            java.lang.String r1 = "usedForLayout"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0217
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0Y = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0217:
            java.lang.String r1 = "filter_map"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0252
            X.16L r1 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 != r3) goto L_0x024e
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r8.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x022a:
            X.16L r1 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == r9) goto L_0x024d
            java.lang.String r7 = r6.A1P()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x0243
            r8.put(r7, r5)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x022a
        L_0x0243:
            X.4aT r1 = parseFromJson(r6)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x022a
            r8.put(r7, r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x022a
        L_0x024d:
            r5 = r8
        L_0x024e:
            r0.A0P = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0252:
            java.lang.String r1 = "top_color"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0280
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x027c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0267:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x027c
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.add(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0267
        L_0x027c:
            r0.A0V = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0280:
            java.lang.String r1 = "bottom_color"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x02ae
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 != r1) goto L_0x02aa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0295:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x02aa
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r7 = new java.lang.Float     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r5.add(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0295
        L_0x02aa:
            r0.A0Q = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x02ae:
            java.lang.String r1 = "input_width"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x02bf
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A06 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x02bf:
            java.lang.String r1 = "input_height"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x02d0
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A05 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x02d0:
            java.lang.String r1 = "corner_radius"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x02e1
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A02 = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x02e1:
            java.lang.String r1 = "split"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x02f2
            double r7 = r6.A0U()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r1 = (float) r7     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0A = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x02f2:
            java.lang.String r1 = "left_filter"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0302
            X.4aT r1 = parseFromJson(r6)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0I = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0302:
            java.lang.String r1 = "right_filter"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0312
            X.4aT r1 = parseFromJson(r6)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0J = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0312:
            java.lang.String r1 = "externalRenderKey"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x032a
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x0326
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0326:
            r0.A0K = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x032a:
            java.lang.String r1 = "transform_matrix_params"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x033a
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = X.C266634a4.A00(r6)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0H = r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x033a:
            java.lang.String r1 = "glsl_shader_string"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0352
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x034e
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x034e:
            r0.A0N = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x0352:
            java.lang.String r1 = "json"
            boolean r1 = r1.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x036a
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r2 == r1) goto L_0x0366
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x0366:
            r0.A0O = r5     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x036a:
            java.lang.String r2 = "typed_parameter_map"
            boolean r1 = r2.equals(r7)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = r6.A0q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            boolean r1 = X.0qQ.A0K(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x046b
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.4da r7 = new X.4da     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.String r2 = r6.A1Q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.Qhi r1 = new X.Qhi     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r1.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r1 = r7.A0C(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r10.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Set r1 = r1.entrySet()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x03a6:
            boolean r1 = r9.hasNext()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x03c9
            java.lang.Object r1 = r9.next()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r8 = r1.getKey()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            double r1 = r1.doubleValue()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float r5 = (float) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Float r1 = java.lang.Float.valueOf(r5)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r10.put(r8, r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x03a6
        L_0x03c9:
            java.lang.String r2 = r6.A1Q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.Qhh r1 = new X.Qhh     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r1.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r1 = r7.A0C(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r11.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Set r1 = r1.entrySet()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x03eb:
            boolean r1 = r5.hasNext()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r5.next()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r2 = r1.getKey()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            float[] r1 = X.00k.A0w(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r11.put(r2, r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x03eb
        L_0x0409:
            java.lang.String r2 = r6.A1Q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.Qhj r1 = new X.Qhj     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r1.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r12 = r7.A0C(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.0qQ.A07(r12)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.String r2 = r6.A1Q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.Qhg r1 = new X.Qhg     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r1.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r13 = r7.A0C(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.0qQ.A07(r13)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.String r2 = r6.A1Q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.Qhk r1 = new X.Qhk     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r1.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r14 = r7.A0C(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.0qQ.A07(r14)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.String r2 = r6.A1Q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.Qhk r1 = new X.Qhk     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r1.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.Object r15 = r7.A0C(r1, r2)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            X.0qQ.A07(r15)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.Map r15 = (java.util.Map) r15     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r6.A12()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.util.LinkedHashMap r16 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r16.<init>()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r9 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.A0G = r9     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            goto L_0x0041
        L_0x046b:
            java.lang.String r2 = "Trying to parse "
            java.lang.String r1 = r6.A0q()     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.lang.String r0 = " as TypedParameterMap"
            java.lang.String r1 = X.002.A0g(r2, r1, r0)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
            throw r0     // Catch:{ IOException -> 0x0486, Exception -> 0x047f }
        L_0x047d:
            r0 = 0
        L_0x047e:
            return r0
        L_0x047f:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0486:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266854aS.parseFromJson(X.16F):X.4aT");
    }

    public static void A00(17Z r4, C266864aT r5) {
        r4.A0c();
        String str = r5.A0L;
        if (str != null) {
            r4.A0R("filter_model_class", str);
            r5.A00();
            r4.A0R("filter_name", r5.A00());
            16P.A03(r4, "texture_transform");
            for (Number number : r5.A0S) {
                if (number != null) {
                    r4.A0f(number.floatValue());
                }
            }
            r4.A0Y();
            16P.A03(r4, "content_transform");
            for (Number number2 : r5.A0R) {
                if (number2 != null) {
                    r4.A0f(number2.floatValue());
                }
            }
            r4.A0Y();
            r4.A0S("is_enabled", r5.A0X);
            r4.A0O("strength", r5.A0B);
            r4.A0O("brightness", r5.A00);
            r4.A0O("contrast", r5.A01);
            r4.A0O("saturation", r5.A07);
            r4.A0O("temperature", r5.A0C);
            r4.A0O("fade", r5.A03);
            r4.A0O("vignette", r5.A0F);
            r4.A0O("highlights", r5.A04);
            r4.A0O("shadows", r5.A08);
            r4.A0O("sharpen", r5.A09);
            r4.A0O("tint_shadows_intensity", r5.A0E);
            if (r5.A0U != null) {
                16P.A03(r4, "tint_shadows_color");
                for (Number number3 : r5.A0U) {
                    if (number3 != null) {
                        r4.A0f(number3.floatValue());
                    }
                }
                r4.A0Y();
            }
            r4.A0O("tint_highlights_intensity", r5.A0D);
            if (r5.A0T != null) {
                16P.A03(r4, "tint_highlights_color");
                for (Number number4 : r5.A0T) {
                    if (number4 != null) {
                        r4.A0f(number4.floatValue());
                    }
                }
                r4.A0Y();
            }
            r4.A0S("isBlendEnabled", r5.A0W);
            r4.A0S("usedForLayout", r5.A0Y);
            if (r5.A0P != null) {
                r4.A0q("filter_map");
                r4.A0c();
                for (Map.Entry entry : r5.A0P.entrySet()) {
                    if (!16P.A04(r4, entry)) {
                        A00(r4, (C266864aT) entry.getValue());
                    }
                }
                r4.A0Z();
            }
            if (r5.A0V != null) {
                16P.A03(r4, "top_color");
                for (Number number5 : r5.A0V) {
                    if (number5 != null) {
                        r4.A0f(number5.floatValue());
                    }
                }
                r4.A0Y();
            }
            if (r5.A0Q != null) {
                16P.A03(r4, "bottom_color");
                for (Number number6 : r5.A0Q) {
                    if (number6 != null) {
                        r4.A0f(number6.floatValue());
                    }
                }
                r4.A0Y();
            }
            r4.A0O("input_width", r5.A06);
            r4.A0O("input_height", r5.A05);
            r4.A0O("corner_radius", r5.A02);
            r4.A0O("split", r5.A0A);
            if (r5.A0I != null) {
                r4.A0q("left_filter");
                A00(r4, r5.A0I);
            }
            if (r5.A0J != null) {
                r4.A0q("right_filter");
                A00(r4, r5.A0J);
            }
            String str2 = r5.A0K;
            if (str2 != null) {
                r4.A0R("externalRenderKey", str2);
            }
            C266634a4.A01(r5.A0H, r4);
            String str3 = r5.A0N;
            if (str3 != null) {
                r4.A0R("glsl_shader_string", str3);
            }
            String str4 = r5.A0O;
            if (str4 != null) {
                r4.A0R("json", str4);
            }
            TypedParameterMap typedParameterMap = r5.A0G;
            if (typedParameterMap != null) {
                r4.A0q("typed_parameter_map");
                r4.A0c();
                C268544da r2 = new C268544da((15p) null);
                r4.A0R("float_map", r2.A0F(typedParameterMap.A02));
                r4.A0R("float_array_map", r2.A0F(typedParameterMap.A01));
                r4.A0R("int_map", r2.A0F(typedParameterMap.A03));
                r4.A0R("bool_map", r2.A0F(typedParameterMap.A00));
                r4.A0R("string_map", r2.A0F(typedParameterMap.A04));
                r4.A0R("texture_path_map", r2.A0F(typedParameterMap.A05));
                r4.A0Z();
            }
            r4.A0Z();
            return;
        }
        0qQ.A0F("filterModelClass");
        throw AnonymousClass00P.createAndThrow();
    }
}
