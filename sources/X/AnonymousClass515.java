package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.515  reason: invalid class name */
public abstract class AnonymousClass515 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v34, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r2v36, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r2v38, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v56 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: type inference failed for: r2v62 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: type inference failed for: r2v70 */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v72 */
    /* JADX WARNING: type inference failed for: r2v73 */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: type inference failed for: r2v75 */
    /* JADX WARNING: type inference failed for: r2v76 */
    /* JADX WARNING: type inference failed for: r2v77 */
    /* JADX WARNING: type inference failed for: r2v78 */
    /* JADX WARNING: type inference failed for: r2v79 */
    /* JADX WARNING: type inference failed for: r2v80 */
    /* JADX WARNING: type inference failed for: r2v81 */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0208, code lost:
        if (r1 == null) goto L_0x020a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.camera.effect.models.CameraAREffect parseFromJson(X.16F r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            com.instagram.camera.effect.models.CameraAREffect r3 = new com.instagram.camera.effect.models.CameraAREffect     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0016
            r7.A0z()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3 = 0
            return r3
        L_0x0016:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x047f
            java.lang.String r1 = r7.A0q()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            java.lang.String r0 = "effect_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x003a
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x003a:
            r3.A0K = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x003c:
            r7.A0z()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "effect_package_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0057
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0054
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0054:
            r3.A0M = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0057:
            java.lang.String r0 = "effect_file_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x006e
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x006b
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x006b:
            r3.A0J = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x006e:
            java.lang.String r0 = "is_draft"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0d = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x007d:
            java.lang.String r0 = "is_animated_photo_effect"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x008c
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0c = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x008c:
            java.lang.String r0 = "cache_key"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x00a3
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x00a0
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x00a0:
            r3.A0G = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x00a3:
            java.lang.String r0 = "compression_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x00ba
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x00b7
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x00b7:
            r3.A0H = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x00ba:
            java.lang.String r0 = "title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x00d2
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x00ce
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x00ce:
            r3.A0S = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x00d2:
            java.lang.String r0 = "asset_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x00ea
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x00e6
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x00e6:
            r3.A0A = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x00ea:
            java.lang.String r0 = "file_size"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x00fa
            long r0 = r7.A0y()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A02 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x00fa:
            java.lang.String r0 = "uncompressed_file_size"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x010a
            long r0 = r7.A0y()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A03 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x010a:
            java.lang.String r0 = "md5_hash"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0122
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x011e
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x011e:
            r3.A0P = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0122:
            java.lang.String r0 = "thumbnail_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0132
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A07 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0132:
            java.lang.String r0 = "transparent_background_thumbnail_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0142
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A08 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0142:
            java.lang.String r0 = "effect_instructions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x016d
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x0169
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0157:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0169
            X.7ui r0 = X.C346157uh.parseFromJson(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0157
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x0157
        L_0x0169:
            r3.A0X = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x016d:
            java.lang.String r0 = "supported_capture_modes"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x01a0
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x019c
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0182:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x019c
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0182
            java.lang.String r0 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0182
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x0182
        L_0x019c:
            r3.A0b = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x01a0:
            java.lang.String r0 = "internal_only"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0f = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x01b0:
            java.lang.String r0 = "capabilities_set"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x01e3
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x01df
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x01c5:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x01df
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x01c5
            java.lang.String r0 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x01c5
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x01c5
        L_0x01df:
            r3.A0a = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x01e3:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0210
            java.lang.String r6 = r7.A1Q()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r0 = 5
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            int r4 = r5.length     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2 = 0
        L_0x01f6:
            if (r2 >= r4) goto L_0x020a
            r1 = r5[r2]     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            java.lang.String r0 = X.AnonymousClass51A.A00(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            boolean r0 = X.0qQ.A0K(r0, r6)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0205
            goto L_0x0208
        L_0x0205:
            int r2 = r2 + 1
            goto L_0x01f6
        L_0x0208:
            if (r1 != 0) goto L_0x020c
        L_0x020a:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x020c:
            r3.A09 = r1     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0210:
            java.lang.String r0 = "attribution_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0228
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0224
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0224:
            r3.A0B = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0228:
            java.lang.String r0 = "attribution_username"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0240
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x023c
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x023c:
            r3.A0C = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0240:
            java.lang.String r0 = "attribution_profile_image_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0250
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A05 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0250:
            java.lang.String r0 = "capabilities_min_version_models"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x027b
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x0277
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0265:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0277
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r0 = X.AnonymousClass55b.parseFromJson(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0265
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x0265
        L_0x0277:
            r3.A0T = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x027b:
            java.lang.String r0 = "spark_vision_capability"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x028b
            com.facebook.cameracore.ardelivery.model.SparkVisionCapability r0 = X.AnonymousClass51B.parseFromJson(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A04 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x028b:
            java.lang.String r0 = "is_network_consent_required"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x029b
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0g = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x029b:
            java.lang.String r0 = "uses_flm_capability"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x02ab
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0j = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x02ab:
            java.lang.String r0 = "effect_info_ui_items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x02de
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x02da
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x02c0:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x02da
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x02c0
            java.lang.String r0 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x02c0
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x02c0
        L_0x02da:
            r3.A0V = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x02de:
            java.lang.String r0 = "effect_info_ui_secondary_items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0311
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x030d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x02f3:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x030d
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x02f3
            java.lang.String r0 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x02f3
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x02f3
        L_0x030d:
            r3.A0W = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0311:
            java.lang.String r0 = "save_status"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0321
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A01 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0321:
            java.lang.String r0 = "effect_manifest_json"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0339
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0335
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0335:
            r3.A0L = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0339:
            java.lang.String r0 = "preview_video_media"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0349
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A06 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0349:
            java.lang.String r0 = "effect_file_contents"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0374
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x0370
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x035e:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0370
            X.LMd r0 = X.C18176Vmq.parseFromJson(r7)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x035e
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x035e
        L_0x0370:
            r3.A0U = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0374:
            java.lang.String r0 = "effect_collection_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x038c
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0388
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0388:
            r3.A0I = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x038c:
            java.lang.String r0 = "use_hands_free"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x039c
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0i = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x039c:
            java.lang.String r0 = "hands_free_duration_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x03ac
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A00 = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x03ac:
            java.lang.String r0 = "is_encrypted"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x03bc
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r3.A0e = r0     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x03bc:
            java.lang.String r0 = "product_capabilities"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x03ef
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 != r0) goto L_0x03eb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            r2.<init>()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x03d1:
            X.16L r1 = r7.A1J()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x03eb
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x03d1
            java.lang.String r0 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x03d1
            r2.add(r0)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x03d1
        L_0x03eb:
            r3.A0Y = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x03ef:
            java.lang.String r0 = "formatted_media_count"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0407
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0403
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0403:
            r3.A0N = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0407:
            java.lang.String r0 = "formatted_media_count_accessibility"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x041f
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x041b
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x041b:
            r3.A0O = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x041f:
            java.lang.String r0 = "avatar_sdk_preset_glb"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0437
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0433
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0433:
            r3.A0D = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0437:
            java.lang.String r0 = "required_sdk_version"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x044f
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x044b
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x044b:
            r3.A0R = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x044f:
            java.lang.String r0 = "best_instance_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x0467
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x0463
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x0463:
            r3.A0F = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x0467:
            java.lang.String r0 = "avatar_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            if (r1 == r0) goto L_0x047b
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
        L_0x047b:
            r3.A0E = r2     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            goto L_0x003c
        L_0x047f:
            r3.A0G()     // Catch:{ IOException -> 0x048a, Exception -> 0x0483 }
            return r3
        L_0x0483:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x048a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass515.parseFromJson(X.16F):com.instagram.camera.effect.models.CameraAREffect");
    }

    public static void A00(17Z r3, CameraAREffect cameraAREffect) {
        r3.A0c();
        String str = cameraAREffect.A0K;
        if (str != null) {
            r3.A0R("effect_id", str);
        }
        String str2 = cameraAREffect.A0M;
        if (str2 != null) {
            r3.A0R("effect_package_id", str2);
        }
        String str3 = cameraAREffect.A0J;
        if (str3 != null) {
            r3.A0R("effect_file_id", str3);
        }
        r3.A0S("is_draft", cameraAREffect.A0d);
        r3.A0S("is_animated_photo_effect", cameraAREffect.A0c);
        String str4 = cameraAREffect.A0G;
        if (str4 != null) {
            r3.A0R("cache_key", str4);
        }
        String str5 = cameraAREffect.A0H;
        if (str5 != null) {
            r3.A0R(TraceFieldType.CompressionType, str5);
        }
        String str6 = cameraAREffect.A0S;
        if (str6 != null) {
            r3.A0R(DialogModule.KEY_TITLE, str6);
        }
        String str7 = cameraAREffect.A0A;
        if (str7 != null) {
            r3.A0R("asset_url", str7);
        }
        r3.A0Q("file_size", cameraAREffect.A02);
        r3.A0Q("uncompressed_file_size", cameraAREffect.A03);
        String str8 = cameraAREffect.A0P;
        if (str8 != null) {
            r3.A0R("md5_hash", str8);
        }
        if (cameraAREffect.A07 != null) {
            r3.A0q("thumbnail_url");
            16h.A01(r3, cameraAREffect.A07);
        }
        if (cameraAREffect.A08 != null) {
            r3.A0q("transparent_background_thumbnail_url");
            16h.A01(r3, cameraAREffect.A08);
        }
        if (cameraAREffect.A0X != null) {
            16P.A03(r3, "effect_instructions");
            for (C346167ui r0 : cameraAREffect.A0X) {
                if (r0 != null) {
                    C346157uh.A00(r3, r0);
                }
            }
            r3.A0Y();
        }
        if (cameraAREffect.A0b != null) {
            16P.A03(r3, "supported_capture_modes");
            for (String str9 : cameraAREffect.A0b) {
                if (str9 != null) {
                    r3.A0t(str9);
                }
            }
            r3.A0Y();
        }
        r3.A0S("internal_only", cameraAREffect.A0f);
        if (cameraAREffect.A0a != null) {
            16P.A03(r3, "capabilities_set");
            for (String str10 : cameraAREffect.A0a) {
                if (str10 != null) {
                    r3.A0t(str10);
                }
            }
            r3.A0Y();
        }
        Integer num = cameraAREffect.A09;
        if (num != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AnonymousClass51A.A00(num));
        }
        String str11 = cameraAREffect.A0B;
        if (str11 != null) {
            r3.A0R("attribution_id", str11);
        }
        String str12 = cameraAREffect.A0C;
        if (str12 != null) {
            r3.A0R("attribution_username", str12);
        }
        if (cameraAREffect.A05 != null) {
            r3.A0q("attribution_profile_image_url");
            16h.A01(r3, cameraAREffect.A05);
        }
        if (cameraAREffect.A0T != null) {
            16P.A03(r3, "capabilities_min_version_models");
            for (ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling : cameraAREffect.A0T) {
                if (aRCapabilityMinVersionModeling != null) {
                    AnonymousClass55b.A00(aRCapabilityMinVersionModeling, r3);
                }
            }
            r3.A0Y();
        }
        if (cameraAREffect.A04 != null) {
            r3.A0q("spark_vision_capability");
            SparkVisionCapability sparkVisionCapability = cameraAREffect.A04;
            r3.A0c();
            if (sparkVisionCapability.A00 != null) {
                16P.A03(r3, "identifiers");
                for (String str13 : sparkVisionCapability.A00) {
                    if (str13 != null) {
                        r3.A0t(str13);
                    }
                }
                r3.A0Y();
            }
            r3.A0Z();
        }
        r3.A0S("is_network_consent_required", cameraAREffect.A0g);
        r3.A0S("uses_flm_capability", cameraAREffect.A0j);
        if (cameraAREffect.A0V != null) {
            16P.A03(r3, "effect_info_ui_items");
            for (String str14 : cameraAREffect.A0V) {
                if (str14 != null) {
                    r3.A0t(str14);
                }
            }
            r3.A0Y();
        }
        if (cameraAREffect.A0W != null) {
            16P.A03(r3, "effect_info_ui_secondary_items");
            for (String str15 : cameraAREffect.A0W) {
                if (str15 != null) {
                    r3.A0t(str15);
                }
            }
            r3.A0Y();
        }
        r3.A0P("save_status", cameraAREffect.A01);
        String str16 = cameraAREffect.A0L;
        if (str16 != null) {
            r3.A0R("effect_manifest_json", str16);
        }
        if (cameraAREffect.A06 != null) {
            r3.A0q("preview_video_media");
            16h.A01(r3, cameraAREffect.A06);
        }
        if (cameraAREffect.A0U != null) {
            16P.A03(r3, "effect_file_contents");
            for (C64085LMd lMd : cameraAREffect.A0U) {
                if (lMd != null) {
                    C18176Vmq.A00(r3, lMd);
                }
            }
            r3.A0Y();
        }
        String str17 = cameraAREffect.A0I;
        if (str17 != null) {
            r3.A0R("effect_collection_id", str17);
        }
        r3.A0S("use_hands_free", cameraAREffect.A0i);
        r3.A0P("hands_free_duration_ms", cameraAREffect.A00);
        r3.A0S("is_encrypted", cameraAREffect.A0e);
        if (cameraAREffect.A0Y != null) {
            16P.A03(r3, "product_capabilities");
            for (String str18 : cameraAREffect.A0Y) {
                if (str18 != null) {
                    r3.A0t(str18);
                }
            }
            r3.A0Y();
        }
        String str19 = cameraAREffect.A0N;
        if (str19 != null) {
            r3.A0R("formatted_media_count", str19);
        }
        String str20 = cameraAREffect.A0O;
        if (str20 != null) {
            r3.A0R("formatted_media_count_accessibility", str20);
        }
        String str21 = cameraAREffect.A0D;
        if (str21 != null) {
            r3.A0R("avatar_sdk_preset_glb", str21);
        }
        String str22 = cameraAREffect.A0R;
        if (str22 != null) {
            r3.A0R("required_sdk_version", str22);
        }
        String str23 = cameraAREffect.A0F;
        if (str23 != null) {
            r3.A0R("best_instance_id", str23);
        }
        String str24 = cameraAREffect.A0E;
        if (str24 != null) {
            r3.A0R("avatar_type", str24);
        }
        r3.A0Z();
    }
}
