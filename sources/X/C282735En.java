package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.5En  reason: invalid class name and case insensitive filesystem */
public abstract class C282735En {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5Eo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C282745Eo parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5Eo r0 = new X.5Eo     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r0.<init>()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x00da
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r2 == r1) goto L_0x00db
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r4.A1J()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            java.lang.String r1 = "image_path"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r3 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
        L_0x003a:
            r0.A05 = r3     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "sticker_spec"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x004f
            X.513 r1 = X.C2802050s.parseFromJson(r4)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r0.A04 = r1     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x004f:
            java.lang.String r1 = "image_regions"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x0079
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r2 != r1) goto L_0x0076
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r3.<init>()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
        L_0x0064:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r2 == r1) goto L_0x0076
            X.5Eq r1 = X.C282755Ep.parseFromJson(r4)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x0064
            r3.add(r1)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x0064
        L_0x0076:
            r0.A07 = r3     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x0079:
            java.lang.String r1 = "type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x0094
            java.lang.String r2 = r4.A1P()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            java.util.Map r1 = X.C282775Er.A02     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.5Er r1 = (X.C282775Er) r1     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 != 0) goto L_0x0091
            X.5Er r1 = X.C282775Er.A07     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
        L_0x0091:
            r0.A03 = r1     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x0094:
            java.lang.String r1 = "original_image_url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x00ab
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r2 == r1) goto L_0x00a8
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
        L_0x00a8:
            r0.A06 = r3     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x00ab:
            java.lang.String r1 = "timing"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x00ba
            X.A5d r1 = X.C17027VFb.parseFromJson(r4)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r0.A02 = r1     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x00ba:
            java.lang.String r1 = "width"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x00ca
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r0.A01 = r1     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x00ca:
            java.lang.String r1 = "height"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            if (r1 == 0) goto L_0x003c
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            r0.A00 = r1     // Catch:{ IOException -> 0x00e3, Exception -> 0x00dc }
            goto L_0x003c
        L_0x00da:
            r0 = 0
        L_0x00db:
            return r0
        L_0x00dc:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00e3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282735En.parseFromJson(X.16F):X.5Eo");
    }

    public static void A00(17Z r4, C282745Eo r5) {
        r4.A0c();
        String str = r5.A05;
        if (str != null) {
            r4.A0R("image_path", str);
        }
        if (r5.A04 != null) {
            r4.A0q("sticker_spec");
            C2802050s.A00(r4, r5.A04);
        }
        if (r5.A07 != null) {
            16P.A03(r4, "image_regions");
            for (C282765Eq r2 : r5.A07) {
                if (r2 != null) {
                    r4.A0c();
                    r4.A0P("drawable_id", r2.A0B);
                    r4.A0O("center_x", r2.A00);
                    r4.A0O("center_y", r2.A01);
                    r4.A0O(IgReactMediaPickerNativeModule.WIDTH, r2.A0A);
                    r4.A0O(IgReactMediaPickerNativeModule.HEIGHT, r2.A02);
                    r4.A0O("normalized_center_x", r2.A03);
                    r4.A0O("normalized_center_y", r2.A05);
                    r4.A0O("normalized_center_x_precise", r2.A04);
                    r4.A0O("normalized_center_y_precise", r2.A06);
                    r4.A0O("normalized_width", r2.A08);
                    r4.A0O("normalized_height", r2.A07);
                    r4.A0P("video_position", r2.A0C);
                    r4.A0O("rotation", r2.A09);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        C282775Er r0 = r5.A03;
        if (r0 != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0.toString());
        }
        String str2 = r5.A06;
        if (str2 != null) {
            r4.A0R("original_image_url", str2);
        }
        if (r5.A02 != null) {
            r4.A0q("timing");
            C39687A5d a5d = r5.A02;
            r4.A0c();
            r4.A0P(TraceFieldType.StartTime, a5d.A01);
            r4.A0P(AnonymousClass000.A00(3060), a5d.A00);
            r4.A0Z();
        }
        r4.A0P(IgReactMediaPickerNativeModule.WIDTH, r5.A01);
        r4.A0P(IgReactMediaPickerNativeModule.HEIGHT, r5.A00);
        r4.A0Z();
    }
}
