package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.8Gx  reason: invalid class name and case insensitive filesystem */
public abstract class C353258Gx {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v38 */
    /* JADX WARNING: type inference failed for: r4v39 */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: type inference failed for: r4v45 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: type inference failed for: r4v49 */
    /* JADX WARNING: type inference failed for: r4v50 */
    /* JADX WARNING: type inference failed for: r4v51 */
    /* JADX WARNING: type inference failed for: r4v52 */
    /* JADX WARNING: type inference failed for: r4v53 */
    /* JADX WARNING: type inference failed for: r4v54 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.common.gallery.Medium parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            com.instagram.common.gallery.Medium r0 = new com.instagram.common.gallery.Medium     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.<init>()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0366
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0367
            java.lang.String r3 = r5.A0q()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r5.A1J()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            java.lang.String r1 = "id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0037
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A05 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0033:
            r5.A0z()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0016
        L_0x0037:
            java.lang.String r1 = "type"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0046
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A08 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0046:
            java.lang.String r1 = "path"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r4 = 0
            if (r1 == 0) goto L_0x0061
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x005b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x005b:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0X = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0061:
            java.lang.String r1 = "bucket_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0070
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A02 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0070:
            java.lang.String r1 = "bucket_name"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0087
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0084
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0084:
            r0.A0O = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0087:
            java.lang.String r1 = "rotation"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0096
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A07 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0096:
            java.lang.String r1 = "duration_in_ms"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x00a5
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A03 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x00a5:
            java.lang.String r1 = "date_taken"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x00b4
            long r3 = r5.A0y()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0D = r3     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x00b4:
            java.lang.String r1 = "date_added"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x00c4
            long r3 = r5.A0y()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0C = r3     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x00c4:
            java.lang.String r1 = "is_favorite"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0f = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x00d4:
            java.lang.String r1 = "uri"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x00ec
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x00e8
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x00e8:
            r0.A0b = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x00ec:
            java.lang.String r1 = "friendly_duration"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0104
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0100
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0100:
            r0.A0U = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0104:
            java.lang.String r1 = "thumbnail_path"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x011c
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0118
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0118:
            r0.A0a = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x011c:
            java.lang.String r1 = "max_sample_size"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x012c
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A06 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x012c:
            java.lang.String r1 = "landscape_colors"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x013c
            com.instagram.common.util.gradient.BackgroundGradientColors r1 = X.AnonymousClass0oP.parseFromJson(r5)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0H = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x013c:
            java.lang.String r1 = "attribution_content_url"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0154
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0150
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0150:
            r0.A0N = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0154:
            java.lang.String r1 = "should_fetch_audio_preview"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0164
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0g = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0164:
            java.lang.String r1 = "has_lat_lng"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0174
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0d = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0174:
            java.lang.String r1 = "latitude"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0184
            double r3 = r5.A0U()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A00 = r3     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0184:
            java.lang.String r1 = "longitude"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0194
            double r3 = r5.A0U()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A01 = r3     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0194:
            java.lang.String r1 = "width"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x01a4
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0B = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x01a4:
            java.lang.String r1 = "height"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x01b4
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A04 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x01b4:
            java.lang.String r1 = "locality"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x01cc
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x01c8
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x01c8:
            r0.A0V = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x01cc:
            java.lang.String r1 = "feature_name"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x01e4
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x01e0
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x01e0:
            r0.A0T = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x01e4:
            java.lang.String r1 = "sub_admin_area"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x01fc
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x01f8
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x01f8:
            r0.A0Z = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x01fc:
            java.lang.String r1 = "admin_area"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0214
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0210
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0210:
            r0.A0L = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0214:
            java.lang.String r1 = "countryName"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x022c
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0228
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0228:
            r0.A0R = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x022c:
            java.lang.String r1 = "faces"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0257
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 != r1) goto L_0x0253
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r4.<init>()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0241:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0253
            com.instagram.common.gallery.FaceCenter r1 = X.C393919xF.parseFromJson(r5)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0241
            r4.add(r1)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0241
        L_0x0253:
            r0.A0c = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0257:
            java.lang.String r1 = "source_media_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x026f
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x026b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x026b:
            r0.A0Y = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x026f:
            java.lang.String r1 = "ar_effect_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0287
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0283
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0283:
            r0.A0M = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0287:
            java.lang.String r1 = "capture_type"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x029f
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x029b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x029b:
            r0.A0Q = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x029f:
            java.lang.String r1 = "camera_position"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x02b7
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x02b3
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x02b3:
            r0.A0P = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x02b7:
            java.lang.String r1 = "effect_persisted_metadata"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x02cf
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x02cb
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x02cb:
            r0.A0S = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x02cf:
            java.lang.String r1 = "video_highlight_start_time_in_ms"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x02df
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0A = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x02df:
            java.lang.String r1 = "video_highlight_duration_in_ms"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x02ef
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A09 = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x02ef:
            java.lang.String r1 = "original_media_uri"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0307
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r3 == r1) goto L_0x0303
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
        L_0x0303:
            r0.A0W = r4     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0307:
            java.lang.String r1 = "is_motion_photo"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x031b
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0I = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x031b:
            java.lang.String r1 = "is_remix"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x032f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0K = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x032f:
            java.lang.String r1 = "generated_media_metadata"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x033f
            com.instagram.common.gallery.GeneratedMediaMetadata r1 = X.C393929xG.parseFromJson(r5)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0E = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x033f:
            java.lang.String r1 = "media_upload_metadata"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0352
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = X.AnonymousClass3QX.parseFromJson(r5)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            X.0qQ.A0B(r1, r2)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0G = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0352:
            java.lang.String r1 = "is_quicksnap_recap"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            if (r1 == 0) goto L_0x0033
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            r0.A0J = r1     // Catch:{ IOException -> 0x036f, Exception -> 0x0368 }
            goto L_0x0033
        L_0x0366:
            r0 = 0
        L_0x0367:
            return r0
        L_0x0368:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x036f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353258Gx.parseFromJson(X.16F):com.instagram.common.gallery.Medium");
    }

    public static void A00(17Z r4, Medium medium) {
        r4.A0c();
        r4.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, medium.A05);
        r4.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, medium.A08);
        String str = medium.A0X;
        if (str != null) {
            r4.A0R("path", str);
        }
        r4.A0P("bucket_id", medium.A02);
        String str2 = medium.A0O;
        if (str2 != null) {
            r4.A0R("bucket_name", str2);
        }
        r4.A0P("rotation", medium.A07);
        r4.A0P("duration_in_ms", medium.A03);
        r4.A0Q("date_taken", medium.A0D);
        r4.A0Q("date_added", medium.A0C);
        r4.A0S("is_favorite", medium.A0f);
        String str3 = medium.A0b;
        if (str3 != null) {
            r4.A0R("uri", str3);
        }
        String str4 = medium.A0U;
        if (str4 != null) {
            r4.A0R("friendly_duration", str4);
        }
        String str5 = medium.A0a;
        if (str5 != null) {
            r4.A0R("thumbnail_path", str5);
        }
        r4.A0P("max_sample_size", medium.A06);
        if (medium.A0H != null) {
            r4.A0q("landscape_colors");
            BackgroundGradientColors backgroundGradientColors = medium.A0H;
            r4.A0c();
            r4.A0P("top_color", backgroundGradientColors.A01);
            r4.A0P(AnonymousClass000.A00(4536), backgroundGradientColors.A00);
            r4.A0Z();
        }
        String str6 = medium.A0N;
        if (str6 != null) {
            r4.A0R("attribution_content_url", str6);
        }
        r4.A0S("should_fetch_audio_preview", medium.A0g);
        r4.A0S("has_lat_lng", medium.A0d);
        r4.A0N(Location.LATITUDE, medium.A00);
        r4.A0N("longitude", medium.A01);
        r4.A0P(IgReactMediaPickerNativeModule.WIDTH, medium.A0B);
        r4.A0P(IgReactMediaPickerNativeModule.HEIGHT, medium.A04);
        String str7 = medium.A0V;
        if (str7 != null) {
            r4.A0R("locality", str7);
        }
        String str8 = medium.A0T;
        if (str8 != null) {
            r4.A0R("feature_name", str8);
        }
        String str9 = medium.A0Z;
        if (str9 != null) {
            r4.A0R("sub_admin_area", str9);
        }
        String str10 = medium.A0L;
        if (str10 != null) {
            r4.A0R("admin_area", str10);
        }
        String str11 = medium.A0R;
        if (str11 != null) {
            r4.A0R("countryName", str11);
        }
        if (medium.A0c != null) {
            16P.A03(r4, "faces");
            for (FaceCenter faceCenter : medium.A0c) {
                if (faceCenter != null) {
                    r4.A0c();
                    r4.A0O("x", faceCenter.A01);
                    r4.A0O("y", faceCenter.A02);
                    r4.A0O("confidence", faceCenter.A00);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        String str12 = medium.A0Y;
        if (str12 != null) {
            r4.A0R("source_media_id", str12);
        }
        String str13 = medium.A0M;
        if (str13 != null) {
            r4.A0R("ar_effect_id", str13);
        }
        String str14 = medium.A0Q;
        if (str14 != null) {
            r4.A0R("capture_type", str14);
        }
        String str15 = medium.A0P;
        if (str15 != null) {
            r4.A0R("camera_position", str15);
        }
        String str16 = medium.A0S;
        if (str16 != null) {
            r4.A0R("effect_persisted_metadata", str16);
        }
        r4.A0P("video_highlight_start_time_in_ms", medium.A0A);
        r4.A0P("video_highlight_duration_in_ms", medium.A09);
        String str17 = medium.A0W;
        if (str17 != null) {
            r4.A0R("original_media_uri", str17);
        }
        Boolean bool = medium.A0I;
        if (bool != null) {
            r4.A0S("is_motion_photo", bool.booleanValue());
        }
        Boolean bool2 = medium.A0K;
        if (bool2 != null) {
            r4.A0S("is_remix", bool2.booleanValue());
        }
        if (medium.A0E != null) {
            r4.A0q("generated_media_metadata");
            GeneratedMediaMetadata generatedMediaMetadata = medium.A0E;
            r4.A0c();
            String str18 = generatedMediaMetadata.A00;
            if (str18 != null) {
                r4.A0R("generated_media_prompt", str18);
            }
            r4.A0S("is_internal", generatedMediaMetadata.A01);
            r4.A0Z();
        }
        r4.A0q("media_upload_metadata");
        AnonymousClass3QX.A00(r4, medium.A0G);
        Boolean bool3 = medium.A0J;
        if (bool3 != null) {
            r4.A0S("is_quicksnap_recap", bool3.booleanValue());
        }
        r4.A0Z();
    }
}
