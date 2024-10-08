package X;

import android.os.Parcelable;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.8vf  reason: invalid class name and case insensitive filesystem */
public abstract class C369998vf {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v23, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v31, types: [java.util.Set, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v33, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r4v35, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v37, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r4v58 */
    /* JADX WARNING: type inference failed for: r4v59 */
    /* JADX WARNING: type inference failed for: r4v60 */
    /* JADX WARNING: type inference failed for: r4v61 */
    /* JADX WARNING: type inference failed for: r4v62 */
    /* JADX WARNING: type inference failed for: r4v63 */
    /* JADX WARNING: type inference failed for: r4v64 */
    /* JADX WARNING: type inference failed for: r4v65 */
    /* JADX WARNING: type inference failed for: r4v66 */
    /* JADX WARNING: type inference failed for: r4v67 */
    /* JADX WARNING: type inference failed for: r4v68 */
    /* JADX WARNING: type inference failed for: r4v69 */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: type inference failed for: r4v71 */
    /* JADX WARNING: type inference failed for: r4v72 */
    /* JADX WARNING: type inference failed for: r4v73 */
    /* JADX WARNING: type inference failed for: r4v74 */
    /* JADX WARNING: type inference failed for: r4v75 */
    /* JADX WARNING: type inference failed for: r4v76 */
    /* JADX WARNING: type inference failed for: r4v77 */
    /* JADX WARNING: type inference failed for: r4v78 */
    /* JADX WARNING: type inference failed for: r4v79 */
    /* JADX WARNING: type inference failed for: r4v80 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C349307zv parseFromJson(X.16F r6) {
        /*
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.7zv r1 = new X.7zv     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0709
        L_0x0016:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x070a
            java.lang.String r2 = r6.A0q()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            java.lang.String r0 = "width"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0037
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0K = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0033:
            r6.A0z()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0016
        L_0x0037:
            java.lang.String r0 = "height"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0046
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A08 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0046:
            java.lang.String r0 = "original_width"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0055
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0B = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0055:
            java.lang.String r0 = "original_height"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0064
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0A = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0064:
            java.lang.String r0 = "crop_rect_left"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0073
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A03 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0073:
            java.lang.String r0 = "crop_rect_top"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0082
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A05 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0082:
            java.lang.String r0 = "crop_rect_right"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0091
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A04 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0091:
            java.lang.String r0 = "crop_rect_bottom"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x00a0
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A02 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x00a0:
            java.lang.String r0 = "orientation"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x00af
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A09 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x00af:
            java.lang.String r0 = "full_video_duration_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x00bf
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A07 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x00bf:
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x00cf
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0H = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x00cf:
            java.lang.String r0 = "start_seek_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x00df
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0G = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x00df:
            java.lang.String r0 = "end_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x00ef
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A06 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x00ef:
            java.lang.String r0 = "segment_group_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4 = 0
            if (r0 == 0) goto L_0x0108
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0104
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0104:
            r1.A0p = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0108:
            java.lang.String r0 = "segment_index"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0118
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0D = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0118:
            java.lang.String r0 = "segment_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0128
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0C = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0128:
            java.lang.String r0 = "camera_position"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0140
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x013c
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x013c:
            r1.A0f = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0140:
            java.lang.String r0 = "mirrored"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0150
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1J = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0150:
            java.lang.String r0 = "file_path"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x016b
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0164
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0164:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0k = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x016b:
            java.lang.String r0 = "cover_file_path"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0183
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x017f
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x017f:
            r1.A0h = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0183:
            java.lang.String r0 = "imported"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0193
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A18 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0193:
            java.lang.String r0 = "date_added"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x01a3
            long r4 = r6.A0y()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0L = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x01a3:
            java.lang.String r0 = "date_taken"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x01b3
            long r4 = r6.A0y()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0M = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x01b3:
            java.lang.String r0 = "is_boomerang"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1I = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x01c3:
            java.lang.String r0 = "is_rollcall_v2"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1E = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x01d3:
            java.lang.String r0 = "should_background_cover_media"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1K = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x01e3:
            java.lang.String r0 = "original_background_gradient"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x01f3
            X.0v6 r0 = X.C61660oX.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0T = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x01f3:
            java.lang.String r0 = "camera_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0203
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A01 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0203:
            java.lang.String r0 = "ar_effect_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x021b
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0217
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0217:
            r1.A0m = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x021b:
            java.lang.String r0 = "ar_effect"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x022b
            com.instagram.camera.effect.models.CameraAREffect r0 = X.AnonymousClass515.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0P = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x022b:
            java.lang.String r0 = "effect_persisted_metadata"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0243
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x023f
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x023f:
            r1.A0j = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0243:
            java.lang.String r0 = "capture_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x025b
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0257
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0257:
            r1.A0g = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x025b:
            java.lang.String r0 = "camera_tools"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x028e
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x028a
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0270:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x028a
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0270
            java.lang.String r0 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0270
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0270
        L_0x028a:
            r1.A11 = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x028e:
            java.lang.String r0 = "camera_tool_infos"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x02b9
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x02b5
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x02a3:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x02b5
            X.55X r0 = X.AnonymousClass55W.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x02a3
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x02a3
        L_0x02b5:
            r1.A0y = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x02b9:
            java.lang.String r0 = "auto_created_source_ids"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x02ec
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x02e8
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x02ce:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x02e8
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x02ce
            java.lang.String r0 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x02ce
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x02ce
        L_0x02e8:
            r1.A10 = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x02ec:
            java.lang.String r0 = "product_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x02fc
            X.8GK r0 = X.AB6.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0W = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x02fc:
            java.lang.String r0 = "story_gated_feature"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0332
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x032b
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0311:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x032b
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0311
            java.lang.String r0 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0311
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0311
        L_0x032b:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A12 = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0332:
            java.lang.String r0 = "source_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0342
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0F = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0342:
            java.lang.String r0 = "reshare_source"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x035a
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0356
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0356:
            r1.A0o = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x035a:
            java.lang.String r0 = "archived_media_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0372
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x036e
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x036e:
            r1.A0d = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0372:
            java.lang.String r0 = "format_variant"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x038a
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0386
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0386:
            r1.A0l = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x038a:
            java.lang.String r0 = "medium"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x039a
            com.instagram.common.gallery.Medium r0 = X.C353258Gx.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0R = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x039a:
            java.lang.String r0 = "music_overlay_sticker_model"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x03aa
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C255673uX.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0V = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x03aa:
            java.lang.String r0 = "clips_segments_metadata"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x03d5
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x03d1
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x03bf:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x03d1
            X.4aA r0 = X.C266674a9.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x03bf
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x03bf
        L_0x03d1:
            r1.A0v = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x03d5:
            java.lang.String r0 = "external_media_segment_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0400
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x03fc
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x03ea:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x03fc
            X.9JM r0 = X.C39816AAn.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x03ea
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x03ea
        L_0x03fc:
            r1.A0w = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0400:
            java.lang.String r0 = "is_created_with_sound_sync"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0410
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A16 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0410:
            java.lang.String r0 = "template_clips_media_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0428
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0424
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0424:
            r1.A0s = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0428:
            java.lang.String r0 = "is_boomerang_v2"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0438
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A13 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0438:
            java.lang.String r0 = "is_post_capture_variant"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0448
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1A = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0448:
            java.lang.String r0 = "is_clips_remix"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0458
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A15 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0458:
            java.lang.String r0 = "num_times_post_capture_trim"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x046c
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0c = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x046c:
            java.lang.String r0 = "clips_camera_ar_effects"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0497
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x0493
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0481:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0493
            com.instagram.camera.effect.models.CameraAREffect r0 = X.AnonymousClass515.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0481
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0481
        L_0x0493:
            r1.A0u = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0497:
            java.lang.String r0 = "color_range"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x04ab
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0Z = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x04ab:
            java.lang.String r0 = "color_standard"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x04bf
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0a = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x04bf:
            java.lang.String r0 = "color_transfer"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x04d3
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0b = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x04d3:
            java.lang.String r0 = "concurrent_video"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x04e3
            X.7zv r0 = parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0X = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x04e3:
            java.lang.String r0 = "magic_mod_tool_data"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x050e
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x050a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x04f8:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x050a
            X.LMH r0 = X.LIX.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x04f8
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x04f8
        L_0x050a:
            r1.A0x = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x050e:
            java.lang.String r0 = "is_normalized"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x051e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A19 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x051e:
            java.lang.String r0 = "is_reversed"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x052e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1D = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x052e:
            java.lang.String r0 = "has_audio"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x053e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1H = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x053e:
            java.lang.String r0 = "text_mode_gradient_colors"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x054e
            X.0v6 r0 = X.C61660oX.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0U = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x054e:
            java.lang.String r0 = "is_saved_instagram_story"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x055e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1F = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x055e:
            java.lang.String r0 = "is_captured_draft"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x056e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A14 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x056e:
            java.lang.String r0 = "from_story_drafts"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x057e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A17 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x057e:
            java.lang.String r0 = "is_trimmed"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x058e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1G = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x058e:
            java.lang.String r0 = "is_reshare"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x059e
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1C = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x059e:
            java.lang.String r0 = "trimmed_start_pos_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x05ae
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0J = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x05ae:
            java.lang.String r0 = "trimmed_end_pos_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x05be
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0I = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x05be:
            java.lang.String r0 = "segmented_duration_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x05ce
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0E = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x05ce:
            java.lang.String r0 = "cache_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x05de
            int r0 = r6.A1D()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A00 = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x05de:
            java.lang.String r0 = "media_upload_metadata"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x05f1
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.AnonymousClass3QX.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0S = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x05f1:
            java.lang.String r0 = "attribution_content_url"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0609
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0605
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0605:
            r1.A0e = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0609:
            java.lang.String r0 = "original_audio_creation_params"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0634
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x0630
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x061e:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0630
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C255673uX.parseFromJson(r6)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x061e
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x061e
        L_0x0630:
            r1.A0z = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0634:
            java.lang.String r0 = "media_composition"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0648
            java.lang.String r0 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = com.facebook.videolite.transcoder.base.composition.MediaComposition.A00(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0O = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0648:
            java.lang.String r0 = "description"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0660
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x065c
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x065c:
            r1.A0i = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0660:
            java.lang.String r0 = "original_camera_destination_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0678
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x0674
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x0674:
            r1.A0n = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0678:
            java.lang.String r0 = "was_photo"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0688
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1L = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0688:
            java.lang.String r0 = "source_photo_file_path"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x06a0
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x069c
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x069c:
            r1.A0r = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x06a0:
            java.lang.String r0 = "all_clips_media_receivers_from_chat"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x06cd
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 != r0) goto L_0x06c9
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r4.<init>()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x06b5:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x06c9
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            com.instagram.user.model.User r0 = X.1aC.A00(r6, r3)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x06b5
            r4.add(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x06b5
        L_0x06c9:
            r1.A0t = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x06cd:
            java.lang.String r0 = "source_chat_thread_name"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x06e5
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r2 == r0) goto L_0x06e1
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
        L_0x06e1:
            r1.A0q = r4     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x06e5:
            java.lang.String r0 = "is_remix"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x06f9
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A0Y = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x06f9:
            java.lang.String r0 = "is_quicksnap_recap"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            if (r0 == 0) goto L_0x0033
            boolean r0 = r6.A0d()     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            r1.A1B = r0     // Catch:{ IOException -> 0x0712, Exception -> 0x070b }
            goto L_0x0033
        L_0x0709:
            r1 = 0
        L_0x070a:
            return r1
        L_0x070b:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0712:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369998vf.parseFromJson(X.16F):X.7zv");
    }

    public static void A00(17Z r3, C349307zv r4) {
        Medium medium;
        r3.A0c();
        r3.A0P(IgReactMediaPickerNativeModule.WIDTH, r4.A0K);
        r3.A0P(IgReactMediaPickerNativeModule.HEIGHT, r4.A08);
        r3.A0P("original_width", r4.A0B);
        r3.A0P("original_height", r4.A0A);
        r3.A0P("crop_rect_left", r4.A03);
        r3.A0P("crop_rect_top", r4.A05);
        r3.A0P("crop_rect_right", r4.A04);
        r3.A0P("crop_rect_bottom", r4.A02);
        r3.A0P("orientation", r4.A09);
        r3.A0P("full_video_duration_ms", r4.A07);
        r3.A0P("start_time_ms", r4.A0H);
        r3.A0P("start_seek_time_ms", r4.A0G);
        r3.A0P("end_time_ms", r4.A06);
        String str = r4.A0p;
        if (str != null) {
            r3.A0R("segment_group_id", str);
        }
        r3.A0P("segment_index", r4.A0D);
        r3.A0P("segment_count", r4.A0C);
        String str2 = r4.A0f;
        if (str2 != null) {
            r3.A0R("camera_position", str2);
        }
        r3.A0S("mirrored", r4.A1J);
        String str3 = r4.A0k;
        if (str3 != null) {
            r3.A0R("file_path", str3);
        }
        String str4 = r4.A0h;
        if (str4 != null) {
            r3.A0R("cover_file_path", str4);
        }
        r3.A0S("imported", r4.A18);
        r3.A0Q("date_added", r4.A0L);
        r3.A0Q("date_taken", r4.A0M);
        r3.A0S("is_boomerang", r4.A1I);
        r3.A0S("is_rollcall_v2", r4.A1E);
        r3.A0S("should_background_cover_media", r4.A1K);
        if (r4.A0T != null) {
            r3.A0q("original_background_gradient");
            C61660oX.A00(r3, r4.A0T);
        }
        r3.A0P("camera_id", r4.A01);
        String str5 = r4.A0m;
        if (str5 != null) {
            r3.A0R("ar_effect_id", str5);
        }
        if (r4.A0P != null) {
            r3.A0q("ar_effect");
            AnonymousClass515.A00(r3, r4.A0P);
        }
        String str6 = r4.A0j;
        if (str6 != null) {
            r3.A0R("effect_persisted_metadata", str6);
        }
        String str7 = r4.A0g;
        if (str7 != null) {
            r3.A0R("capture_type", str7);
        }
        if (r4.A11 != null) {
            16P.A03(r3, "camera_tools");
            for (String str8 : r4.A11) {
                if (str8 != null) {
                    r3.A0t(str8);
                }
            }
            r3.A0Y();
        }
        if (r4.A0y != null) {
            16P.A03(r3, "camera_tool_infos");
            for (AnonymousClass55X r0 : r4.A0y) {
                if (r0 != null) {
                    AnonymousClass55W.A00(r3, r0);
                }
            }
            r3.A0Y();
        }
        if (r4.A10 != null) {
            16P.A03(r3, "auto_created_source_ids");
            for (String str9 : r4.A10) {
                if (str9 != null) {
                    r3.A0t(str9);
                }
            }
            r3.A0Y();
        }
        if (r4.A0W != null) {
            r3.A0q("product_info");
            AB6.A00(r3, r4.A0W);
        }
        16P.A03(r3, "story_gated_feature");
        for (String str10 : r4.A12) {
            if (str10 != null) {
                r3.A0t(str10);
            }
        }
        r3.A0Y();
        r3.A0P("source_type", r4.A0F);
        String str11 = r4.A0o;
        if (str11 != null) {
            r3.A0R("reshare_source", str11);
        }
        String str12 = r4.A0d;
        if (str12 != null) {
            r3.A0R("archived_media_id", str12);
        }
        String str13 = r4.A0l;
        if (str13 != null) {
            r3.A0R("format_variant", str13);
        }
        if (r4.A0R != null) {
            r3.A0q("medium");
            C353258Gx.A00(r3, r4.A0R);
        }
        if (r4.A0V != null) {
            r3.A0q("music_overlay_sticker_model");
            C255673uX.A00(r3, r4.A0V, true);
        }
        if (r4.A0v != null) {
            16P.A03(r3, "clips_segments_metadata");
            for (C266684aA r02 : r4.A0v) {
                if (r02 != null) {
                    C266674a9.A00(r3, r02);
                }
            }
            r3.A0Y();
        }
        if (r4.A0w != null) {
            16P.A03(r3, "external_media_segment_info");
            for (AnonymousClass9JM r03 : r4.A0w) {
                if (r03 != null) {
                    C39816AAn.A00(r03, r3);
                }
            }
            r3.A0Y();
        }
        r3.A0S("is_created_with_sound_sync", r4.A16);
        String str14 = r4.A0s;
        if (str14 != null) {
            r3.A0R("template_clips_media_id", str14);
        }
        r3.A0S("is_boomerang_v2", r4.A13);
        r3.A0S("is_post_capture_variant", r4.A1A);
        r3.A0S("is_clips_remix", r4.A15);
        Integer num = r4.A0c;
        if (num != null) {
            r3.A0P("num_times_post_capture_trim", num.intValue());
        }
        if (r4.A0u != null) {
            16P.A03(r3, "clips_camera_ar_effects");
            for (CameraAREffect cameraAREffect : r4.A0u) {
                if (cameraAREffect != null) {
                    AnonymousClass515.A00(r3, cameraAREffect);
                }
            }
            r3.A0Y();
        }
        Integer num2 = r4.A0Z;
        if (num2 != null) {
            r3.A0P("color_range", num2.intValue());
        }
        Integer num3 = r4.A0a;
        if (num3 != null) {
            r3.A0P("color_standard", num3.intValue());
        }
        Integer num4 = r4.A0b;
        if (num4 != null) {
            r3.A0P("color_transfer", num4.intValue());
        }
        if (r4.A0X != null) {
            r3.A0q("concurrent_video");
            A00(r3, r4.A0X);
        }
        if (r4.A0x != null) {
            16P.A03(r3, "magic_mod_tool_data");
            for (LMH lmh : r4.A0x) {
                if (lmh != null) {
                    LIX.A00(r3, lmh);
                }
            }
            r3.A0Y();
        }
        r3.A0S("is_normalized", r4.A19);
        r3.A0S("is_reversed", r4.A1D);
        r3.A0S("has_audio", r4.A1H);
        if (r4.A0U != null) {
            r3.A0q("text_mode_gradient_colors");
            C61660oX.A00(r3, r4.A0U);
        }
        r3.A0S("is_saved_instagram_story", r4.A1F);
        r3.A0S("is_captured_draft", r4.A14);
        r3.A0S("from_story_drafts", r4.A17);
        r3.A0S("is_trimmed", r4.A1G);
        r3.A0S("is_reshare", r4.A1C);
        r3.A0P("trimmed_start_pos_ms", r4.A0J);
        r3.A0P("trimmed_end_pos_ms", r4.A0I);
        r3.A0P("segmented_duration_ms", r4.A0E);
        r3.A0P("cache_type", r4.A00);
        r4.A02();
        r3.A0q("media_upload_metadata");
        AnonymousClass3QX.A00(r3, r4.A02());
        String str15 = r4.A0e;
        if (str15 != null) {
            r3.A0R("attribution_content_url", str15);
        }
        if (r4.A0z != null) {
            16P.A03(r3, "original_audio_creation_params");
            for (MusicOverlayStickerModel musicOverlayStickerModel : r4.A0z) {
                if (musicOverlayStickerModel != null) {
                    C255673uX.A00(r3, musicOverlayStickerModel, true);
                }
            }
            r3.A0Y();
        }
        MediaComposition mediaComposition = r4.A0O;
        if (mediaComposition != null) {
            try {
                r3.A0R("media_composition", mediaComposition.A09().toString());
            } catch (JSONException e) {
                throw new IOException(e);
            }
        }
        String str16 = r4.A0i;
        if (str16 != null) {
            r3.A0R(DevServerEntity.COLUMN_DESCRIPTION, str16);
        }
        String str17 = r4.A0n;
        if (str17 != null) {
            r3.A0R("original_camera_destination_type", str17);
        }
        r3.A0S("was_photo", r4.A1L);
        String str18 = r4.A0r;
        if (str18 != null) {
            r3.A0R("source_photo_file_path", str18);
        }
        if (r4.A0t != null) {
            16P.A03(r3, "all_clips_media_receivers_from_chat");
            for (User user : r4.A0t) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    1aC.A08(r3, user);
                }
            }
            r3.A0Y();
        }
        String str19 = r4.A0q;
        if (str19 != null) {
            r3.A0R("source_chat_thread_name", str19);
        }
        Boolean bool = r4.A0Y;
        if (!(bool == null && ((medium = r4.A0R) == null || (bool = medium.A0K) == null))) {
            r3.A0S("is_remix", bool.booleanValue());
        }
        r3.A0S("is_quicksnap_recap", r4.A1B);
        r3.A0Z();
    }
}
