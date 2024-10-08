package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.5Ej  reason: invalid class name and case insensitive filesystem */
public abstract class C282695Ej {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C282705Ek parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5Ek r0 = new X.5Ek     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r0.<init>()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x0173
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x0174
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r4.A1J()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            java.lang.String r1 = "text"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r3 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x003a:
            r0.A09 = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "is_quick_caption"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x004f
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r0.A0C = r1     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x004f:
            java.lang.String r1 = "position_data"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x005e
            X.5El r1 = X.C282725Em.parseFromJson(r4)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r0.A01 = r1     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x005e:
            java.lang.String r1 = "scale"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x0072
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r0.A03 = r1     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x0072:
            java.lang.String r1 = "font_size"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x0086
            double r2 = r4.A0U()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r0.A02 = r1     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x0086:
            java.lang.String r1 = "format_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x009d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x009a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x009a:
            r0.A06 = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x009d:
            java.lang.String r1 = "effects"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x00d0
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 != r1) goto L_0x00cc
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r3.<init>()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x00b2:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x00cc
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x00b2
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x00b2
            r3.add(r1)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x00b2
        L_0x00cc:
            r0.A0B = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x00d0:
            java.lang.String r1 = "colors"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x0103
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 != r1) goto L_0x00ff
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r3.<init>()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x00e5:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x00ff
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x00e5
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x00e5
            r3.add(r1)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x00e5
        L_0x00ff:
            r0.A0A = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x0103:
            java.lang.String r1 = "alignment"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x011b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x0117
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x0117:
            r0.A04 = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x011b:
            java.lang.String r1 = "animation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x0133
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x012f
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x012f:
            r0.A05 = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x0133:
            java.lang.String r1 = "graphic_effect"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x014b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x0147
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x0147:
            r0.A07 = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x014b:
            java.lang.String r1 = "template_sticker_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x0163
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r2 == r1) goto L_0x015f
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
        L_0x015f:
            r0.A08 = r3     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x0163:
            java.lang.String r1 = "sticker_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            if (r1 == 0) goto L_0x003c
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            r0.A00 = r1     // Catch:{ IOException -> 0x017c, Exception -> 0x0175 }
            goto L_0x003c
        L_0x0173:
            r0 = 0
        L_0x0174:
            return r0
        L_0x0175:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x017c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282695Ej.parseFromJson(X.16F):X.5Ek");
    }

    public static void A00(17Z r3, C282705Ek r4) {
        r3.A0c();
        String str = r4.A09;
        if (str != null) {
            r3.A0R("text", str);
        }
        r3.A0S("is_quick_caption", r4.A0C);
        if (r4.A01 != null) {
            r3.A0q("position_data");
            C282715El r2 = r4.A01;
            r3.A0c();
            Float f = r2.A03;
            if (f != null) {
                r3.A0O("x", f.floatValue());
            }
            Float f2 = r2.A04;
            if (f2 != null) {
                r3.A0O("y", f2.floatValue());
            }
            Integer num = r2.A05;
            if (num != null) {
                r3.A0P("z", num.intValue());
            }
            Float f3 = r2.A00;
            if (f3 != null) {
                r3.A0O(IgReactMediaPickerNativeModule.HEIGHT, f3.floatValue());
            }
            Float f4 = r2.A02;
            if (f4 != null) {
                r3.A0O(IgReactMediaPickerNativeModule.WIDTH, f4.floatValue());
            }
            Float f5 = r2.A01;
            if (f5 != null) {
                r3.A0O("rotation", f5.floatValue());
            }
            r3.A0Z();
        }
        Float f6 = r4.A03;
        if (f6 != null) {
            r3.A0O("scale", f6.floatValue());
        }
        Float f7 = r4.A02;
        if (f7 != null) {
            r3.A0O("font_size", f7.floatValue());
        }
        String str2 = r4.A06;
        if (str2 != null) {
            r3.A0R("format_type", str2);
        }
        if (r4.A0B != null) {
            16P.A03(r3, "effects");
            for (String str3 : r4.A0B) {
                if (str3 != null) {
                    r3.A0t(str3);
                }
            }
            r3.A0Y();
        }
        if (r4.A0A != null) {
            16P.A03(r3, "colors");
            for (String str4 : r4.A0A) {
                if (str4 != null) {
                    r3.A0t(str4);
                }
            }
            r3.A0Y();
        }
        String str5 = r4.A04;
        if (str5 != null) {
            r3.A0R("alignment", str5);
        }
        String str6 = r4.A05;
        if (str6 != null) {
            r3.A0R("animation", str6);
        }
        String str7 = r4.A07;
        if (str7 != null) {
            r3.A0R("graphic_effect", str7);
        }
        String str8 = r4.A08;
        if (str8 != null) {
            r3.A0R("template_sticker_id", str8);
        }
        r3.A0P("sticker_id", r4.A00);
        r3.A0Z();
    }
}
