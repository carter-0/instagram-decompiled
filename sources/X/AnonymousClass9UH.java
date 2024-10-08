package X;

import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.9UH  reason: invalid class name */
public abstract class AnonymousClass9UH {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9U5 parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            r2 = 0
            X.9U5 r3 = new X.9U5     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            return r2
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x0159
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.String r0 = "is_saved_instagram_story"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0037
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A0B = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x0033:
            r5.A0z()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0016
        L_0x0037:
            java.lang.String r0 = "iso_sensitivity"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x004a
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A04 = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x004a:
            java.lang.String r0 = "exposure_time"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x005d
            long r0 = r5.A0y()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A05 = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x005d:
            java.lang.String r0 = "aperture"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0071
            double r1 = r5.A0U()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A01 = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x0071:
            java.lang.String r0 = "focal_length"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0085
            double r1 = r5.A0U()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A02 = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x0085:
            java.lang.String r0 = "awb_mode"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0098
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A03 = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x0098:
            java.lang.String r0 = "effect_persisted_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r2 = 0
            if (r0 == 0) goto L_0x00b0
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x00ad
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x00ad:
            r3.A07 = r2     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x00b0:
            java.lang.String r0 = "camera_tools"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x00e3
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 != r0) goto L_0x00df
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r2.<init>()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x00c5:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x00df
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x00c5
            java.lang.String r0 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x00c5
            r2.add(r0)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x00c5
        L_0x00df:
            r3.A09 = r2     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x00e3:
            java.lang.String r0 = "capture_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x00fb
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x00f7
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x00f7:
            r3.A06 = r2     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x00fb:
            java.lang.String r0 = "product_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x010b
            X.8GK r0 = X.AB6.parseFromJson(r5)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A00 = r0     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x010b:
            java.lang.String r0 = "effect_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0141
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 != r0) goto L_0x013a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r2.<init>()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x0120:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x013a
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x0120
            java.lang.String r0 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0120
            r2.add(r0)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0120
        L_0x013a:
            X.0qQ.A0B(r2, r4)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r3.A0A = r2     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x0141:
            java.lang.String r0 = "file_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r0 == 0) goto L_0x0033
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == r0) goto L_0x0155
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x0155:
            r3.A08 = r2     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0033
        L_0x0159:
            return r3
        L_0x015a:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0161:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UH.parseFromJson(X.16F):X.9U5");
    }

    public static String A00(AnonymousClass9U5 r6) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        A0K.A0S("is_saved_instagram_story", r6.A0B);
        Integer num = r6.A04;
        if (num != null) {
            A0K.A0P("iso_sensitivity", num.intValue());
        }
        Long l = r6.A05;
        if (l != null) {
            A0K.A0Q("exposure_time", l.longValue());
        }
        Float f = r6.A01;
        if (f != null) {
            A0K.A0O("aperture", f.floatValue());
        }
        Float f2 = r6.A02;
        if (f2 != null) {
            A0K.A0O("focal_length", f2.floatValue());
        }
        Integer num2 = r6.A03;
        if (num2 != null) {
            A0K.A0P("awb_mode", num2.intValue());
        }
        String str = r6.A07;
        if (str != null) {
            A0K.A0R("effect_persisted_metadata", str);
        }
        if (r6.A09 != null) {
            16P.A03(A0K, "camera_tools");
            Iterator it = r6.A09.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (A18 != null) {
                    A0K.A0t(A18);
                }
            }
            A0K.A0Y();
        }
        String str2 = r6.A06;
        if (str2 != null) {
            A0K.A0R("capture_type", str2);
        }
        if (r6.A00 != null) {
            A0K.A0q("product_info");
            AB6.A00(A0K, r6.A00);
        }
        r6.A00();
        16P.A03(A0K, "effect_ids");
        Iterator it2 = r6.A00().iterator();
        while (it2.hasNext()) {
            String A182 = AnonymousClass7TE.A18(it2);
            if (A182 != null) {
                A0K.A0t(A182);
            }
        }
        A0K.A0Y();
        String str3 = r6.A08;
        if (str3 != null) {
            A0K.A0R("file_path", str3);
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
