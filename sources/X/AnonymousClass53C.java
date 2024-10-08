package X;

import com.instagram.common.typedurl.GifUrlLoggingExtras;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.53C  reason: invalid class name */
public abstract class AnonymousClass53C {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.model.mediasize.GifUrlImpl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.model.mediasize.GifUrlImpl parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.model.mediasize.GifUrlImpl r4 = new com.instagram.model.mediasize.GifUrlImpl     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0143
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 == r0) goto L_0x010d
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r5.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.String r0 = "width"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x003c
            double r1 = r5.A0U()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A03 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x0038:
            r5.A0z()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0016
        L_0x003c:
            java.lang.String r0 = "height"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0050
            double r1 = r5.A0U()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A02 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x0050:
            java.lang.String r0 = "url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r2 = 0
            if (r0 == 0) goto L_0x0068
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 == r0) goto L_0x0065
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x0065:
            r4.A09 = r2     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x0068:
            java.lang.String r0 = "webp"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x007f
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 == r0) goto L_0x007c
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x007c:
            r4.A0A = r2     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x007f:
            java.lang.String r0 = "mp4"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0096
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 == r0) goto L_0x0093
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x0093:
            r4.A08 = r2     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x0096:
            java.lang.String r0 = "url_expiration_timestamp_us"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00b1
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 != r0) goto L_0x00ae
            long r0 = r5.A0y()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x00ae:
            r4.A07 = r2     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x00b1:
            java.lang.String r0 = "url_fallback"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00c1
            com.instagram.model.mediasize.GifUrlImpl r0 = parseFromJson(r5)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A01 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x00c1:
            java.lang.String r0 = "logging_extras"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00d1
            com.instagram.common.typedurl.GifUrlLoggingExtras r0 = X.VB2.parseFromJson(r5)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A00 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x00d1:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00e5
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A05 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x00e5:
            java.lang.String r0 = "webp_size"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x00f9
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A06 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x00f9:
            java.lang.String r0 = "mp4_size"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0038
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r4.A04 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            goto L_0x0038
        L_0x010d:
            java.lang.String r0 = r4.A09     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = ""
            r4.A09 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.String r0 = r4.A0A     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x011c
            r2 = 1
        L_0x011c:
            java.lang.String r0 = r4.A08     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 == 0) goto L_0x0121
            r3 = 0
        L_0x0121:
            java.lang.String r1 = "url is null, isWebpUrlNull = "
            java.lang.String r0 = ", isMp4UrlNull = "
            java.lang.String r1 = X.002.A1C(r1, r0, r2, r3)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            java.lang.String r0 = "GifUrlImpl"
            X.0wb.A03(r0, r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x012e:
            com.instagram.model.mediasize.GifUrlImpl r1 = r4.A01     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r1 == 0) goto L_0x0144
            java.lang.Float r0 = r1.A02     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 != 0) goto L_0x013a
            java.lang.Float r0 = r4.A02     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r1.A02 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
        L_0x013a:
            java.lang.Float r0 = r1.A03     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            if (r0 != 0) goto L_0x0144
            java.lang.Float r0 = r4.A03     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            r1.A03 = r0     // Catch:{ IOException -> 0x014c, Exception -> 0x0145 }
            return r4
        L_0x0143:
            r4 = 0
        L_0x0144:
            return r4
        L_0x0145:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x014c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53C.parseFromJson(X.16F):com.instagram.model.mediasize.GifUrlImpl");
    }

    public static void A00(17Z r4, GifUrlImpl gifUrlImpl) {
        r4.A0c();
        Float f = gifUrlImpl.A03;
        if (f != null) {
            r4.A0O(IgReactMediaPickerNativeModule.WIDTH, f.floatValue());
        }
        Float f2 = gifUrlImpl.A02;
        if (f2 != null) {
            r4.A0O(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str = gifUrlImpl.A09;
        if (str != null) {
            r4.A0R("url", str);
        }
        String str2 = gifUrlImpl.A0A;
        if (str2 != null) {
            r4.A0R("webp", str2);
        }
        String str3 = gifUrlImpl.A08;
        if (str3 != null) {
            r4.A0R("mp4", str3);
        }
        Long l = gifUrlImpl.A07;
        if (l != null) {
            r4.A0Q("url_expiration_timestamp_us", l.longValue());
        }
        if (gifUrlImpl.A01 != null) {
            r4.A0q("url_fallback");
            A00(r4, gifUrlImpl.A01);
        }
        if (gifUrlImpl.A00 != null) {
            r4.A0q("logging_extras");
            GifUrlLoggingExtras gifUrlLoggingExtras = gifUrlImpl.A00;
            r4.A0c();
            Long l2 = gifUrlLoggingExtras.A00;
            if (l2 != null) {
                r4.A0Q("a_pk", l2.longValue());
            }
            String str4 = gifUrlLoggingExtras.A01;
            if (str4 != null) {
                r4.A0R("m_pk", str4);
            }
            String str5 = gifUrlLoggingExtras.A02;
            if (str5 != null) {
                r4.A0R("tracking_token", str5);
            }
            r4.A0Z();
        }
        Integer num = gifUrlImpl.A05;
        if (num != null) {
            r4.A0P("size", num.intValue());
        }
        Integer num2 = gifUrlImpl.A06;
        if (num2 != null) {
            r4.A0P("webp_size", num2.intValue());
        }
        Integer num3 = gifUrlImpl.A04;
        if (num3 != null) {
            r4.A0P("mp4_size", num3.intValue());
        }
        r4.A0Z();
    }
}
