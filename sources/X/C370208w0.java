package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.feed.media.ReelCTA;
import com.instagram.pendingmedia.model.BrandedContentTag;

/* renamed from: X.8w0  reason: invalid class name and case insensitive filesystem */
public abstract class C370208w0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v21, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v23, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass8PW parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8PW r2 = new X.8PW     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x02ac
            java.lang.String r1 = r4.A0q()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            java.lang.String r0 = "reel_ctas"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3 = 0
            if (r0 == 0) goto L_0x0050
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x004d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x003b:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x004d
            com.instagram.feed.media.ReelCTA r0 = X.C250763m1.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x003b
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x003b
        L_0x004d:
            r2.A0D = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0050:
            java.lang.String r0 = "captions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0062
            X.8Nz r0 = X.C370218w1.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A06 = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x005e:
            r4.A0z()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x0016
        L_0x0062:
            java.lang.String r0 = "media_gating_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0071
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = X.C45512Cxm.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A02 = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0071:
            java.lang.String r0 = "branded_content_tags"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x009b
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x0098
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x0086:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x0098
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.LJX.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0086
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x0086
        L_0x0098:
            r2.A0A = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x009b:
            java.lang.String r0 = "branded_content_project_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x00aa
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = X.LGt.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A03 = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x00aa:
            java.lang.String r0 = "is_paid_partnership_label"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0Q = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x00b9:
            java.lang.String r0 = "create_pa_boost_post_access_token"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0N = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x00c8:
            java.lang.String r0 = "reel_assets"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x00f3
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x00ef
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x00dd:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x00ef
            X.4nO r0 = X.C273904nN.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x00dd
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x00dd
        L_0x00ef:
            r2.A0C = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x00f3:
            java.lang.String r0 = "reel_interactives"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x011e
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x011a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x0108:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x011a
            X.3ui r0 = X.C273934nQ.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0108
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x0108
        L_0x011a:
            r2.A0E = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x011e:
            java.lang.String r0 = "static_stickers"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0149
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x0145
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x0133:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x0145
            X.3ui r0 = X.C273934nQ.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0133
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x0133
        L_0x0145:
            r2.A0F = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0149:
            java.lang.String r0 = "drawing_state_snapshot"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0174
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x0170
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x015e:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x0170
            X.VZx r0 = X.C18277Vos.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x015e
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x015e
        L_0x0170:
            r2.A0B = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0174:
            java.lang.String r0 = "text_format_types"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x01a7
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x01a3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x0189:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x01a3
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x0189
            java.lang.String r0 = r4.A1P()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0189
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x0189
        L_0x01a3:
            r2.A0I = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x01a7:
            java.lang.String r0 = "text_drawable_metadata_list"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x01d2
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x01ce
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x01bc:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x01ce
            X.5Ei r0 = X.C282675Eh.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x01bc
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x01bc
        L_0x01ce:
            r2.A0H = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x01d2:
            java.lang.String r0 = "story_captions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x01fd
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x01f9
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x01e7:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x01f9
            X.5Ek r0 = X.C282695Ej.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x01e7
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x01e7
        L_0x01f9:
            r2.A0G = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x01fd:
            java.lang.String r0 = "timed_sticker_drawable_metadata_list"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0228
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 != r0) goto L_0x0224
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r3.<init>()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x0212:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x0224
            X.5JJ r0 = X.AnonymousClass5JI.parseFromJson(r4)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0212
            r3.add(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x0212
        L_0x0224:
            r2.A0J = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0228:
            java.lang.String r0 = "view_mode"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0240
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x023c
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x023c:
            r2.A08 = r3     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0240:
            java.lang.String r0 = "is_viewport_filled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0250
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0R = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0250:
            java.lang.String r0 = "has_strokes_marked_internal"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0260
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0O = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0260:
            java.lang.String r0 = "is_from_stories_remix_mode"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0270
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0P = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0270:
            java.lang.String r0 = "target_view_size_provider_width"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0280
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A01 = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0280:
            java.lang.String r0 = "target_view_size_provider_height"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x0290
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A00 = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x0290:
            java.lang.String r0 = "gen_ai_detection_method"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r0 == 0) goto L_0x005e
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            if (r1 == r0) goto L_0x02a4
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
        L_0x02a4:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = X.C252913pu.A00(r3)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A04 = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            goto L_0x005e
        L_0x02ac:
            X.8PX r0 = new X.8PX     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0M = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.8PY r0 = new X.8PY     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            r2.A0L = r0     // Catch:{ IOException -> 0x02ca, Exception -> 0x02c3 }
            return r2
        L_0x02c3:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x02ca:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370208w0.parseFromJson(X.16F):X.8PW");
    }

    public static void A00(17Z r3, AnonymousClass8PW r4) {
        r3.A0c();
        if (r4.A0D != null) {
            16P.A03(r3, "reel_ctas");
            for (ReelCTA reelCTA : r4.A0D) {
                if (reelCTA != null) {
                    C250763m1.A00(r3, reelCTA);
                }
            }
            r3.A0Y();
        }
        if (r4.A06 != null) {
            r3.A0q("captions");
            C354948Nz r1 = r4.A06;
            r3.A0c();
            if (r1.A00 != null) {
                16P.A03(r3, "captions");
                for (String str : r1.A00) {
                    if (str != null) {
                        r3.A0t(str);
                    }
                }
                r3.A0Y();
            }
            r3.A0Z();
        }
        if (r4.A02 != null) {
            r3.A0q("media_gating_info");
            C45512Cxm.A00(r3, r4.A02);
        }
        if (r4.A0A != null) {
            16P.A03(r3, "branded_content_tags");
            for (BrandedContentTag brandedContentTag : r4.A0A) {
                if (brandedContentTag != null) {
                    LJX.A00(r3, brandedContentTag);
                }
            }
            r3.A0Y();
        }
        if (r4.A03 != null) {
            r3.A0q("branded_content_project_metadata");
            LGt.A00(r3, r4.A03);
        }
        r3.A0S("is_paid_partnership_label", r4.A0Q);
        r3.A0S("create_pa_boost_post_access_token", r4.A0N);
        if (r4.A0C != null) {
            16P.A03(r3, "reel_assets");
            for (C273914nO r0 : r4.A0C) {
                if (r0 != null) {
                    C273904nN.A00(r3, r0);
                }
            }
            r3.A0Y();
        }
        if (r4.A0E != null) {
            16P.A03(r3, "reel_interactives");
            for (C255783ui r02 : r4.A0E) {
                if (r02 != null) {
                    C273934nQ.A00(r3, r02);
                }
            }
            r3.A0Y();
        }
        if (r4.A0F != null) {
            16P.A03(r3, "static_stickers");
            for (C255783ui r03 : r4.A0F) {
                if (r03 != null) {
                    C273934nQ.A00(r3, r03);
                }
            }
            r3.A0Y();
        }
        if (r4.A0B != null) {
            16P.A03(r3, "drawing_state_snapshot");
            for (C17544VZx vZx : r4.A0B) {
                if (vZx != null) {
                    C18277Vos.A00(r3, vZx);
                }
            }
            r3.A0Y();
        }
        if (r4.A0I != null) {
            16P.A03(r3, "text_format_types");
            for (String str2 : r4.A0I) {
                if (str2 != null) {
                    r3.A0t(str2);
                }
            }
            r3.A0Y();
        }
        if (r4.A0H != null) {
            16P.A03(r3, "text_drawable_metadata_list");
            for (C282685Ei r04 : r4.A0H) {
                if (r04 != null) {
                    C282675Eh.A00(r3, r04);
                }
            }
            r3.A0Y();
        }
        if (r4.A0G != null) {
            16P.A03(r3, "story_captions");
            for (C282705Ek r05 : r4.A0G) {
                if (r05 != null) {
                    C282695Ej.A00(r3, r05);
                }
            }
            r3.A0Y();
        }
        if (r4.A0J != null) {
            16P.A03(r3, "timed_sticker_drawable_metadata_list");
            for (AnonymousClass5JJ r06 : r4.A0J) {
                if (r06 != null) {
                    AnonymousClass5JI.A00(r3, r06);
                }
            }
            r3.A0Y();
        }
        String str3 = r4.A08;
        if (str3 != null) {
            r3.A0R("view_mode", str3);
        }
        r3.A0S("is_viewport_filled", r4.A0R);
        r3.A0S("has_strokes_marked_internal", r4.A0O);
        r3.A0S("is_from_stories_remix_mode", r4.A0P);
        r3.A0P("target_view_size_provider_width", r4.A01);
        r3.A0P("target_view_size_provider_height", r4.A00);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = r4.A04;
        if (mediaGenAIDetectionMethod != null) {
            r3.A0R("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        r3.A0Z();
    }
}
