package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.5Eh  reason: invalid class name and case insensitive filesystem */
public abstract class C282675Eh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5Ei] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C282685Ei parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5Ei r0 = new X.5Ei     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.<init>()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x015e
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x015f
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r4.A1J()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            java.lang.String r1 = "font_size"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0038
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A02 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x0034:
            r4.A0z()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0016
        L_0x0038:
            java.lang.String r1 = "scale"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0048
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A05 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0048:
            java.lang.String r1 = "width"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0058
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A06 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0058:
            java.lang.String r1 = "height"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0068
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A03 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0068:
            java.lang.String r1 = "x"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0078
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A00 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0078:
            java.lang.String r1 = "y"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0088
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A01 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0088:
            java.lang.String r1 = "rotation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0098
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            float r1 = (float) r2     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r0.A04 = r1     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0098:
            java.lang.String r1 = "format_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r3 = 0
            if (r1 == 0) goto L_0x00b0
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x00ad
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x00ad:
            r0.A09 = r3     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x00b0:
            java.lang.String r1 = "effects"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x00e3
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 != r1) goto L_0x00df
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r3.<init>()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x00c5:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x00df
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x00c5
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x00c5
            r3.add(r1)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x00c5
        L_0x00df:
            r0.A0C = r3     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x00e3:
            java.lang.String r1 = "colors"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0116
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 != r1) goto L_0x0112
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            r3.<init>()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x00f8:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x0112
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x00f8
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x00f8
            r3.add(r1)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x00f8
        L_0x0112:
            r0.A0B = r3     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0116:
            java.lang.String r1 = "alignment"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x012e
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x012a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x012a:
            r0.A07 = r3     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x012e:
            java.lang.String r1 = "animation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0146
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x0142
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x0142:
            r0.A08 = r3     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x0146:
            java.lang.String r1 = "graphic_effect"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r1 == 0) goto L_0x0034
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            if (r2 == r1) goto L_0x015a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
        L_0x015a:
            r0.A0A = r3     // Catch:{ IOException -> 0x0167, Exception -> 0x0160 }
            goto L_0x0034
        L_0x015e:
            r0 = 0
        L_0x015f:
            return r0
        L_0x0160:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0167:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282675Eh.parseFromJson(X.16F):X.5Ei");
    }

    public static void A00(17Z r2, C282685Ei r3) {
        r2.A0c();
        r2.A0O("font_size", r3.A02);
        r2.A0O("scale", r3.A05);
        r2.A0O(IgReactMediaPickerNativeModule.WIDTH, r3.A06);
        r2.A0O(IgReactMediaPickerNativeModule.HEIGHT, r3.A03);
        r2.A0O("x", r3.A00);
        r2.A0O("y", r3.A01);
        r2.A0O("rotation", r3.A04);
        String str = r3.A09;
        if (str != null) {
            r2.A0R("format_type", str);
        }
        if (r3.A0C != null) {
            16P.A03(r2, "effects");
            for (String str2 : r3.A0C) {
                if (str2 != null) {
                    r2.A0t(str2);
                }
            }
            r2.A0Y();
        }
        if (r3.A0B != null) {
            16P.A03(r2, "colors");
            for (String str3 : r3.A0B) {
                if (str3 != null) {
                    r2.A0t(str3);
                }
            }
            r2.A0Y();
        }
        String str4 = r3.A07;
        if (str4 != null) {
            r2.A0R("alignment", str4);
        }
        String str5 = r3.A08;
        if (str5 != null) {
            r2.A0R("animation", str5);
        }
        String str6 = r3.A0A;
        if (str6 != null) {
            r2.A0R("graphic_effect", str6);
        }
        r2.A0Z();
    }
}
