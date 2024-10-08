package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.util.Iterator;

/* renamed from: X.LHz  reason: case insensitive filesystem */
public abstract class C63999LHz {
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v19, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v21, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v23, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v25, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v27, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v29, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v31, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r5v45 */
    /* JADX WARNING: type inference failed for: r5v46 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: type inference failed for: r5v48 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo parseFromJson(X.16F r7) {
        /*
            r3 = 0
            X.0qQ.A0B(r7, r3)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r1 = new com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.<init>()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r2 = X.16L.A0D     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == r2) goto L_0x0016
            r7.A0z()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x05a0
        L_0x0016:
            X.16L r0 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r6 = X.16L.A09     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == r6) goto L_0x05a1
            java.lang.String r4 = X.AnonymousClass7TE.A17(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            java.lang.String r0 = "media_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0034
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A05 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x0030:
            r7.A0z()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "camera_position"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0043
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A01 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0043:
            r0 = 1160(0x488, float:1.626E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0056
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A02 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0056:
            java.lang.String r0 = "camera_tools"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r5 = 0
            if (r0 == 0) goto L_0x007d
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x0077
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x006b:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x0077
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x006b
        L_0x0077:
            X.0qQ.A0B(r5, r3)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0e = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x007d:
            java.lang.String r0 = "media_source"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x008c
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A04 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x008c:
            r0 = 549(0x225, float:7.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x009f
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A03 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x009f:
            java.lang.String r0 = "effect_ids"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x00c3
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x00bf
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x00b3:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x00bf
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x00b3
        L_0x00bf:
            r1.A0g = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x00c3:
            java.lang.String r0 = "effect_instance_ids"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x00e7
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x00e3
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x00d7:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x00e3
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x00d7
        L_0x00e3:
            r1.A0h = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x00e7:
            java.lang.String r0 = "effect_attribution_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x010b
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x0107
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x00fb:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x0107
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x00fb
        L_0x0107:
            r1.A0f = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x010b:
            java.lang.String r0 = "effect_indexes"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x012b
            X.16L r0 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 != r2) goto L_0x0127
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x011d:
            X.16L r0 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == r6) goto L_0x0127
            X.C41847B3o.A1M(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x011d
        L_0x0127:
            r1.A0a = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x012b:
            java.lang.String r0 = "greenscreen_sources"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x014f
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x014b
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x013f:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x014b
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x013f
        L_0x014b:
            r1.A0j = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x014f:
            java.lang.String r0 = "original_media_folder"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0V = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x015f:
            java.lang.String r0 = "music_sticker_extras"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x017f
            X.16L r0 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 != r2) goto L_0x017b
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x0171:
            X.16L r0 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == r6) goto L_0x017b
            X.C41847B3o.A1M(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0171
        L_0x017b:
            r1.A0b = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x017f:
            java.lang.String r0 = "has_postcapture_doodle"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x018f
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0v = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x018f:
            java.lang.String r0 = "postcapture_caption_length"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x019f
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A06 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x019f:
            java.lang.String r0 = "precapture_effect_ids"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x01c3
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x01bf
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x01b3:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x01bf
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x01b3
        L_0x01bf:
            r1.A0l = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x01c3:
            java.lang.String r0 = "post_capture_effect_instance_ids"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x01e7
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x01e3
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x01d7:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x01e3
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x01d7
        L_0x01e3:
            r1.A0m = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x01e7:
            java.lang.String r0 = "postcapture_sticker_ids"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x020b
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x0207
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x01fb:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x0207
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x01fb
        L_0x0207:
            r1.A0n = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x020b:
            java.lang.String r0 = "postcapture_sticker_types"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x022f
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x022b
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x021f:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x022b
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x021f
        L_0x022b:
            r1.A0o = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x022f:
            java.lang.String r0 = "post_capture_sticker_ids_and_types"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0252
            X.16L r0 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 != r2) goto L_0x024b
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x0241:
            X.16L r0 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == r6) goto L_0x024b
            X.C41847B3o.A1M(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0241
        L_0x024b:
            X.0qQ.A0B(r5, r3)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0c = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0252:
            java.lang.String r0 = "audio_or_effect_media_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0262
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0L = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0262:
            java.lang.String r0 = "audio_or_effect_media_ranking_token"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0M = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0272:
            java.lang.String r0 = "link_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0S = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0282:
            r0 = 1551(0x60f, float:2.173E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0296
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0R = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0296:
            java.lang.String r0 = "num_stop_motion_capture_frames"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x02a6
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0G = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x02a6:
            java.lang.String r0 = "variant_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x02b6
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0Z = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x02b6:
            java.lang.String r0 = "video_original_length_ms"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x02c6
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0H = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x02c6:
            java.lang.String r0 = "video_trimmed_length_ms"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x02d6
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0I = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x02d6:
            java.lang.String r0 = "create_mode_format"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0N = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x02e6:
            java.lang.String r0 = "is_clips_edited"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x02f6
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0w = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x02f6:
            java.lang.String r0 = "music_browse_category"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0306
            com.instagram.music.common.model.MusicBrowseCategory r0 = X.LJP.parseFromJson(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0E = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0306:
            java.lang.String r0 = "is_from_story_drafts"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0316
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0x = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0316:
            java.lang.String r0 = "story_draft_save_time"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0326
            long r4 = r7.A0y()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A09 = r4     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0326:
            java.lang.String r0 = "media_transformation"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0336
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r0 = X.C63140Ks8.parseFromJson(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0C = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0336:
            java.lang.String r0 = "is_gradient_background_visible"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0346
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0z = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0346:
            java.lang.String r0 = "custom_background_color"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0356
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0F = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0356:
            java.lang.String r0 = "is_gallery_layout"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0366
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0y = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0366:
            java.lang.String r0 = "gallery_suggestions_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0376
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo r0 = X.LI2.parseFromJson(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0D = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0376:
            r0 = 2677(0xa75, float:3.751E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x039e
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x039a
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x038e:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x039a
            X.AnonymousClass7TG.A1F(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x038e
        L_0x039a:
            r1.A0d = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x039e:
            java.lang.String r0 = "uses_detected_highlight"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x03ae
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A13 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x03ae:
            java.lang.String r0 = "last_crop_region"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x03d2
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x03ce
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x03c2:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x03ce
            X.C41847B3o.A1L(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x03c2
        L_0x03ce:
            r1.A0k = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x03d2:
            java.lang.String r0 = "smart_crop_region"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x03f6
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x03f2
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x03e6:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x03f2
            X.C41847B3o.A1L(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x03e6
        L_0x03f2:
            r1.A0p = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x03f6:
            java.lang.String r0 = "template_browser_entrypoint"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0406
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A08 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0406:
            java.lang.String r0 = "acr_browser_entrypoint"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0416
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A00 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0416:
            java.lang.String r0 = "acr_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x042a
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            com.instagram.api.schemas.ACRType r0 = X.C378199Ow.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0A = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x042a:
            java.lang.String r0 = "allow_translate_text_stickers"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x043a
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0q = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x043a:
            java.lang.String r0 = "creation_layout_footer_position"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x044d
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0O = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x044d:
            java.lang.String r0 = "reused_text_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x045d
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0Y = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x045d:
            java.lang.String r0 = "has_modified_reused_text"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x046d
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0r = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x046d:
            java.lang.String r0 = "has_modified_reused_text_position"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x047d
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0s = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x047d:
            java.lang.String r0 = "has_modified_reused_text_style"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x048d
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0t = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x048d:
            java.lang.String r0 = "has_modified_reused_text_timing"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x049d
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0u = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x049d:
            java.lang.String r0 = "newly_created_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x04ad
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A10 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x04ad:
            r0 = 1094(0x446, float:1.533E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x04c1
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0K = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x04c1:
            java.lang.String r0 = "sticker_insert_surface"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x04d1
            int r0 = r7.A1D()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A07 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x04d1:
            java.lang.String r0 = "is_roll_call_late"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x04e1
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A12 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x04e1:
            java.lang.String r0 = "prompt_sticker_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x04f1
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0X = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x04f1:
            java.lang.String r0 = "prompt_sticker_prompt"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0501
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0W = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0501:
            java.lang.String r0 = "prompt_sticker_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0511
            java.lang.Long r0 = X.AnonymousClass7TF.A0Z(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0J = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0511:
            java.lang.String r0 = "media_upload_metadata"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0524
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.AnonymousClass3QX.parseFromJson(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0B = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0524:
            java.lang.String r0 = "magic_mod_tools"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0548
            X.16L r4 = r7.A11()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 != r0) goto L_0x0544
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
        L_0x0538:
            X.16L r4 = r7.A1J()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r4 == r0) goto L_0x0544
            X.C41847B3o.A1L(r7, r5)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0538
        L_0x0544:
            r1.A0i = r5     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0548:
            r0 = 3539(0xdd3, float:4.959E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x055c
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0U = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x055c:
            r0 = 3538(0xdd2, float:4.958E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0570
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0T = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0570:
            java.lang.String r0 = "imagine_generation_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0580
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0Q = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0580:
            java.lang.String r0 = "ify_gen_ai_content_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0590
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r7)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A0P = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x0590:
            java.lang.String r0 = "is_preview_clip"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = r7.A0d()     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            r1.A11 = r0     // Catch:{ IOException -> 0x05a8, Exception -> 0x05a2 }
            goto L_0x0030
        L_0x05a0:
            r1 = 0
        L_0x05a1:
            return r1
        L_0x05a2:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x05a8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63999LHz.parseFromJson(X.16F):com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo");
    }

    public static void A00(17Z r3, ShareMediaLoggingInfo shareMediaLoggingInfo) {
        r3.A0c();
        r3.A0P("media_type", shareMediaLoggingInfo.A05);
        r3.A0P("camera_position", shareMediaLoggingInfo.A01);
        r3.A0P(AnonymousClass000.A00(1160), shareMediaLoggingInfo.A02);
        if (shareMediaLoggingInfo.A0e != null) {
            16P.A03(r3, "camera_tools");
            Iterator it = shareMediaLoggingInfo.A0e.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r3, it);
            }
            r3.A0Y();
        }
        r3.A0P("media_source", shareMediaLoggingInfo.A04);
        r3.A0P(AnonymousClass000.A00(549), shareMediaLoggingInfo.A03);
        if (shareMediaLoggingInfo.A0g != null) {
            16P.A03(r3, "effect_ids");
            Iterator it2 = shareMediaLoggingInfo.A0g.iterator();
            while (it2.hasNext()) {
                C41846B3n.A18(r3, it2);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0h != null) {
            16P.A03(r3, "effect_instance_ids");
            Iterator it3 = shareMediaLoggingInfo.A0h.iterator();
            while (it3.hasNext()) {
                C41846B3n.A18(r3, it3);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0f != null) {
            16P.A03(r3, "effect_attribution_id");
            Iterator it4 = shareMediaLoggingInfo.A0f.iterator();
            while (it4.hasNext()) {
                C41846B3n.A18(r3, it4);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0a != null) {
            r3.A0q("effect_indexes");
            r3.A0c();
            Iterator A0s = AnonymousClass7TF.A0s(shareMediaLoggingInfo.A0a);
            while (A0s.hasNext()) {
                C41847B3o.A1K(r3, A0s);
            }
            r3.A0Z();
        }
        if (shareMediaLoggingInfo.A0j != null) {
            16P.A03(r3, "greenscreen_sources");
            Iterator it5 = shareMediaLoggingInfo.A0j.iterator();
            while (it5.hasNext()) {
                C41846B3n.A18(r3, it5);
            }
            r3.A0Y();
        }
        String str = shareMediaLoggingInfo.A0V;
        if (str != null) {
            r3.A0R("original_media_folder", str);
        }
        if (shareMediaLoggingInfo.A0b != null) {
            r3.A0q("music_sticker_extras");
            r3.A0c();
            Iterator A0s2 = AnonymousClass7TF.A0s(shareMediaLoggingInfo.A0b);
            while (A0s2.hasNext()) {
                C41847B3o.A1K(r3, A0s2);
            }
            r3.A0Z();
        }
        r3.A0S("has_postcapture_doodle", shareMediaLoggingInfo.A0v);
        r3.A0P("postcapture_caption_length", shareMediaLoggingInfo.A06);
        if (shareMediaLoggingInfo.A0l != null) {
            16P.A03(r3, "precapture_effect_ids");
            Iterator it6 = shareMediaLoggingInfo.A0l.iterator();
            while (it6.hasNext()) {
                C41846B3n.A18(r3, it6);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0m != null) {
            16P.A03(r3, "post_capture_effect_instance_ids");
            Iterator it7 = shareMediaLoggingInfo.A0m.iterator();
            while (it7.hasNext()) {
                C41846B3n.A18(r3, it7);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0n != null) {
            16P.A03(r3, "postcapture_sticker_ids");
            Iterator it8 = shareMediaLoggingInfo.A0n.iterator();
            while (it8.hasNext()) {
                C41846B3n.A18(r3, it8);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0o != null) {
            16P.A03(r3, "postcapture_sticker_types");
            Iterator it9 = shareMediaLoggingInfo.A0o.iterator();
            while (it9.hasNext()) {
                C41846B3n.A18(r3, it9);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0c != null) {
            r3.A0q("post_capture_sticker_ids_and_types");
            r3.A0c();
            Iterator A0s3 = AnonymousClass7TF.A0s(shareMediaLoggingInfo.A0c);
            while (A0s3.hasNext()) {
                C41847B3o.A1K(r3, A0s3);
            }
            r3.A0Z();
        }
        String str2 = shareMediaLoggingInfo.A0L;
        if (str2 != null) {
            r3.A0R("audio_or_effect_media_id", str2);
        }
        String str3 = shareMediaLoggingInfo.A0M;
        if (str3 != null) {
            r3.A0R("audio_or_effect_media_ranking_token", str3);
        }
        String str4 = shareMediaLoggingInfo.A0S;
        if (str4 != null) {
            r3.A0R("link_type", str4);
        }
        String str5 = shareMediaLoggingInfo.A0R;
        if (str5 != null) {
            r3.A0R(AnonymousClass000.A00(1551), str5);
        }
        Integer num = shareMediaLoggingInfo.A0G;
        if (num != null) {
            r3.A0P("num_stop_motion_capture_frames", num.intValue());
        }
        String str6 = shareMediaLoggingInfo.A0Z;
        if (str6 != null) {
            r3.A0R("variant_id", str6);
        }
        Integer num2 = shareMediaLoggingInfo.A0H;
        if (num2 != null) {
            r3.A0P("video_original_length_ms", num2.intValue());
        }
        Integer num3 = shareMediaLoggingInfo.A0I;
        if (num3 != null) {
            r3.A0P("video_trimmed_length_ms", num3.intValue());
        }
        String str7 = shareMediaLoggingInfo.A0N;
        if (str7 != null) {
            r3.A0R("create_mode_format", str7);
        }
        r3.A0S("is_clips_edited", shareMediaLoggingInfo.A0w);
        if (shareMediaLoggingInfo.A0E != null) {
            r3.A0q("music_browse_category");
            LJP.A00(r3, shareMediaLoggingInfo.A0E);
        }
        r3.A0S("is_from_story_drafts", shareMediaLoggingInfo.A0x);
        r3.A0Q("story_draft_save_time", shareMediaLoggingInfo.A09);
        if (shareMediaLoggingInfo.A0C != null) {
            r3.A0q("media_transformation");
            MediaTransformation mediaTransformation = shareMediaLoggingInfo.A0C;
            r3.A0c();
            r3.A0O("translation_x", mediaTransformation.A01);
            r3.A0O("translation_y", mediaTransformation.A02);
            r3.A0O("zoom", mediaTransformation.A03);
            r3.A0O("rotation", mediaTransformation.A00);
            r3.A0Z();
        }
        r3.A0S("is_gradient_background_visible", shareMediaLoggingInfo.A0z);
        Integer num4 = shareMediaLoggingInfo.A0F;
        if (num4 != null) {
            r3.A0P("custom_background_color", num4.intValue());
        }
        r3.A0S("is_gallery_layout", shareMediaLoggingInfo.A0y);
        if (shareMediaLoggingInfo.A0D != null) {
            r3.A0q("gallery_suggestions_info");
            LI2.A00(r3, shareMediaLoggingInfo.A0D);
        }
        if (shareMediaLoggingInfo.A0d != null) {
            16P.A03(r3, AnonymousClass000.A00(2677));
            Iterator it10 = shareMediaLoggingInfo.A0d.iterator();
            while (it10.hasNext()) {
                C41846B3n.A18(r3, it10);
            }
            r3.A0Y();
        }
        r3.A0S("uses_detected_highlight", shareMediaLoggingInfo.A13);
        if (shareMediaLoggingInfo.A0k != null) {
            16P.A03(r3, "last_crop_region");
            Iterator it11 = shareMediaLoggingInfo.A0k.iterator();
            while (it11.hasNext()) {
                JTS.A1J(r3, it11);
            }
            r3.A0Y();
        }
        if (shareMediaLoggingInfo.A0p != null) {
            16P.A03(r3, "smart_crop_region");
            Iterator it12 = shareMediaLoggingInfo.A0p.iterator();
            while (it12.hasNext()) {
                JTS.A1J(r3, it12);
            }
            r3.A0Y();
        }
        r3.A0P("template_browser_entrypoint", shareMediaLoggingInfo.A08);
        r3.A0P("acr_browser_entrypoint", shareMediaLoggingInfo.A00);
        ACRType aCRType = shareMediaLoggingInfo.A0A;
        if (aCRType != null) {
            r3.A0R("acr_type", aCRType.A00);
        }
        r3.A0S("allow_translate_text_stickers", shareMediaLoggingInfo.A0q);
        String str8 = shareMediaLoggingInfo.A0O;
        if (str8 != null) {
            r3.A0R("creation_layout_footer_position", str8);
        }
        String str9 = shareMediaLoggingInfo.A0Y;
        if (str9 != null) {
            r3.A0R("reused_text_id", str9);
        }
        r3.A0S("has_modified_reused_text", shareMediaLoggingInfo.A0r);
        r3.A0S("has_modified_reused_text_position", shareMediaLoggingInfo.A0s);
        r3.A0S("has_modified_reused_text_style", shareMediaLoggingInfo.A0t);
        r3.A0S("has_modified_reused_text_timing", shareMediaLoggingInfo.A0u);
        r3.A0S("newly_created_sticker", shareMediaLoggingInfo.A10);
        String str10 = shareMediaLoggingInfo.A0K;
        if (str10 != null) {
            r3.A0R(AnonymousClass000.A00(1094), str10);
        }
        r3.A0P("sticker_insert_surface", shareMediaLoggingInfo.A07);
        r3.A0S("is_roll_call_late", shareMediaLoggingInfo.A12);
        String str11 = shareMediaLoggingInfo.A0X;
        if (str11 != null) {
            r3.A0R("prompt_sticker_type", str11);
        }
        String str12 = shareMediaLoggingInfo.A0W;
        if (str12 != null) {
            r3.A0R("prompt_sticker_prompt", str12);
        }
        Long l = shareMediaLoggingInfo.A0J;
        if (l != null) {
            r3.A0Q("prompt_sticker_id", l.longValue());
        }
        if (shareMediaLoggingInfo.A0B != null) {
            r3.A0q("media_upload_metadata");
            AnonymousClass3QX.A00(r3, shareMediaLoggingInfo.A0B);
        }
        if (shareMediaLoggingInfo.A0i != null) {
            16P.A03(r3, "magic_mod_tools");
            Iterator it13 = shareMediaLoggingInfo.A0i.iterator();
            while (it13.hasNext()) {
                JTS.A1J(r3, it13);
            }
            r3.A0Y();
        }
        String str13 = shareMediaLoggingInfo.A0U;
        if (str13 != null) {
            r3.A0R(AnonymousClass000.A00(3539), str13);
        }
        String str14 = shareMediaLoggingInfo.A0T;
        if (str14 != null) {
            r3.A0R(AnonymousClass000.A00(3538), str14);
        }
        String str15 = shareMediaLoggingInfo.A0Q;
        if (str15 != null) {
            r3.A0R("imagine_generation_type", str15);
        }
        String str16 = shareMediaLoggingInfo.A0P;
        if (str16 != null) {
            r3.A0R("ify_gen_ai_content_id", str16);
        }
        r3.A0S("is_preview_clip", shareMediaLoggingInfo.A11);
        r3.A0Z();
    }
}
