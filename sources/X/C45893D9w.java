package X;

import android.os.Parcelable;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.D9w  reason: case insensitive filesystem */
public final class C45893D9w {
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C270194gL parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.4gL r0 = new X.4gL     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.<init>()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x036a
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 == r1) goto L_0x036b
            java.lang.String r3 = r5.A0q()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            boolean r1 = X.C41846B3n.A1Y(r5, r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r4 = 0
            if (r1 != 0) goto L_0x0362
            java.lang.String r1 = "broadcast_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 != 0) goto L_0x0362
            java.lang.String r1 = "broadcast_experiments"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0043
            X.4w0 r1 = X.C277464vD.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A02 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "cover_frame_url"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0052
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.16h.A00(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A05 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0052:
            java.lang.String r1 = "dash_playback_url"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0b = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0061:
            java.lang.String r1 = "dash_abr_playback_url"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0Z = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0070:
            java.lang.String r1 = "dash_manifest"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0a = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x007f:
            java.lang.String r1 = "progressive_playback_url"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0i = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x008e:
            java.lang.String r1 = "dimensions"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x009d
            X.547 r1 = X.C44866CmH.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A08 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x009d:
            java.lang.String r1 = "broadcast_owner"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x00ac
            com.instagram.user.model.User r1 = X.C41845B3m.A0a(r5, r2)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A09 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x00ac:
            java.lang.String r1 = "viewer_count"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x00bb
            java.lang.Integer r1 = X.AnonymousClass7TF.A0X(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0R = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x00bb:
            java.lang.String r1 = "viewer_count_avatars"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x00df
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 != r1) goto L_0x00db
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
        L_0x00cf:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 == r1) goto L_0x00db
            X.C41846B3n.A1E(r5, r4)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x00cf
        L_0x00db:
            r0.A0m = r4     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x00df:
            java.lang.String r1 = "total_unique_viewer_count"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x00ef
            java.lang.Integer r1 = X.AnonymousClass7TF.A0X(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0Q = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x00ef:
            java.lang.String r1 = "published_time"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x00ff
            java.lang.Long r1 = X.AnonymousClass7TF.A0Z(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0T = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x00ff:
            java.lang.String r1 = "expire_at"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x010f
            java.lang.Long r1 = X.AnonymousClass7TF.A0Z(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0S = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x010f:
            java.lang.String r1 = "muted"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x011f
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0L = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x011f:
            boolean r1 = X.C41845B3m.A1J(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x012d
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0e = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x012d:
            java.lang.String r1 = "broadcast_status"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0141
            java.lang.String r1 = r5.A1Q()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.4wI r1 = X.C278144wL.A00(r1)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A06 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0141:
            java.lang.String r1 = "ranked_position"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0151
            java.lang.Long r1 = X.AnonymousClass7TF.A0Z(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0V = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0151:
            java.lang.String r1 = "seen_ranked_position"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0161
            java.lang.Long r1 = X.AnonymousClass7TF.A0Z(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0W = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0161:
            java.lang.String r1 = "organic_tracking_token"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0171
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0h = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0171:
            java.lang.String r1 = "encoding_tag"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0181
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0c = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0181:
            java.lang.String r1 = "cobroadcasters"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x01a5
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 != r1) goto L_0x01a1
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
        L_0x0195:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 == r1) goto L_0x01a1
            X.C41846B3n.A1E(r5, r4)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x0195
        L_0x01a1:
            r0.A0n = r4     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x01a5:
            java.lang.String r1 = "question_pk"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x01b5
            java.lang.Long r1 = X.AnonymousClass7TF.A0Z(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0U = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x01b5:
            java.lang.String r1 = "simulcast_fb_broadcast_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x01c5
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0j = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x01c5:
            java.lang.String r1 = "internal_only"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x01d5
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0C = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x01d5:
            java.lang.String r1 = "visibility"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x01e9
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.3NV r1 = X.C278154wM.A00(r1)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0A = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x01e9:
            java.lang.String r1 = "number_of_qualities"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x01f9
            java.lang.Integer r1 = X.AnonymousClass7TF.A0X(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0P = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x01f9:
            java.lang.String r1 = "copyright_violation"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0209
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0B = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0209:
            java.lang.String r1 = "is_scheduled_live"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0219
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0I = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0219:
            java.lang.String r1 = "is_exclusive_live"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0229
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0F = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0229:
            java.lang.String r1 = "is_player_live_trace_enabled"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0239
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0H = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0239:
            java.lang.String r1 = "hide_from_feed_unit"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0249
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0E = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0249:
            java.lang.String r1 = "preview"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0259
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0g = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0259:
            java.lang.String r1 = "media_overlay_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0269
            X.4w3 r1 = X.C277974w2.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A04 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0269:
            java.lang.String r1 = "charity_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0279
            X.4wA r1 = X.C45561CyZ.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A01 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0279:
            java.lang.String r1 = "user_pay_viewer_config"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0289
            X.4wG r1 = X.C2815458k.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A03 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0289:
            java.lang.String r1 = "broadcast_message"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0299
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0Y = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0299:
            java.lang.String r1 = "igtv_post_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x02a9
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0d = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x02a9:
            java.lang.String r1 = "sponsor_tags"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x02d3
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 != r1) goto L_0x02cf
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
        L_0x02bd:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 == r1) goto L_0x02cf
            X.535 r1 = X.AnonymousClass534.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x02bd
            r4.add(r1)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x02bd
        L_0x02cf:
            r0.A0l = r4     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x02d3:
            java.lang.String r1 = "is_viewer_comment_allowed"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x02e3
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0K = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x02e3:
            java.lang.String r1 = "affiliate_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x02f3
            X.4w9 r1 = X.C45506Cxg.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A00 = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x02f3:
            java.lang.String r1 = "chat_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x031d
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 != r1) goto L_0x0319
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
        L_0x0307:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r3 == r1) goto L_0x0319
            X.BFL r1 = X.C45587Cyz.parseFromJson(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x0307
            r4.add(r1)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x0307
        L_0x0319:
            r0.A0k = r4     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x031d:
            java.lang.String r1 = "show_bff_upsell"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x032d
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0M = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x032d:
            java.lang.String r1 = "fan_club_subscribe_enabled"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x033d
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0D = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x033d:
            java.lang.String r1 = "sup_active"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x034d
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0S(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0J = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x034d:
            java.lang.String r1 = "index_position_in_response"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            if (r1 == 0) goto L_0x035d
            java.lang.Integer r1 = X.AnonymousClass7TF.A0X(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0O = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x035d:
            X.1XY.A01(r5, r0, r3)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x0362:
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r5)     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            r0.A0X = r1     // Catch:{ IOException -> 0x0372, Exception -> 0x036c }
            goto L_0x003f
        L_0x036a:
            r0 = 0
        L_0x036b:
            return r0
        L_0x036c:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0372:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45893D9w.parseFromJson(X.16F):X.4gL");
    }

    public static void A00(17Z r3, C270194gL r4) {
        r3.A0c();
        C41846B3n.A0y(r3, r4.A0X);
        if (r4.A02 != null) {
            r3.A0q("broadcast_experiments");
            C277464vD.A00(r3, r4.A02);
        }
        if (r4.A05 != null) {
            r3.A0q("cover_frame_url");
            16h.A01(r3, r4.A05);
        }
        String str = r4.A0b;
        if (str != null) {
            r3.A0R("dash_playback_url", str);
        }
        String str2 = r4.A0Z;
        if (str2 != null) {
            r3.A0R("dash_abr_playback_url", str2);
        }
        String str3 = r4.A0a;
        if (str3 != null) {
            r3.A0R("dash_manifest", str3);
        }
        String str4 = r4.A0i;
        if (str4 != null) {
            r3.A0R("progressive_playback_url", str4);
        }
        if (r4.A08 != null) {
            r3.A0q("dimensions");
            AnonymousClass547 r2 = r4.A08;
            r3.A0c();
            r3.A0P(IgReactMediaPickerNativeModule.HEIGHT, r2.A00);
            r3.A0P(IgReactMediaPickerNativeModule.WIDTH, r2.A01);
            r3.A0Z();
        }
        if (r4.A09 != null) {
            r3.A0q("broadcast_owner");
            User user = r4.A09;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r3, user);
        }
        Integer num = r4.A0R;
        if (num != null) {
            r3.A0P("viewer_count", num.intValue());
        }
        if (r4.A0m != null) {
            16P.A03(r3, "viewer_count_avatars");
            Iterator it = r4.A0m.iterator();
            while (it.hasNext()) {
                C41846B3n.A19(r3, it);
            }
            r3.A0Y();
        }
        Integer num2 = r4.A0Q;
        if (num2 != null) {
            r3.A0P("total_unique_viewer_count", num2.intValue());
        }
        Long l = r4.A0T;
        if (l != null) {
            r3.A0Q("published_time", l.longValue());
        }
        Long l2 = r4.A0S;
        if (l2 != null) {
            r3.A0Q("expire_at", l2.longValue());
        }
        Boolean bool = r4.A0L;
        if (bool != null) {
            r3.A0S("muted", bool.booleanValue());
        }
        C41846B3n.A11(r3, r4.A0e);
        C278114wI r0 = r4.A06;
        if (r0 != null) {
            r3.A0R("broadcast_status", r0.toString());
        }
        Long l3 = r4.A0V;
        if (l3 != null) {
            r3.A0Q("ranked_position", l3.longValue());
        }
        Long l4 = r4.A0W;
        if (l4 != null) {
            r3.A0Q("seen_ranked_position", l4.longValue());
        }
        String str5 = r4.A0h;
        if (str5 != null) {
            r3.A0R("organic_tracking_token", str5);
        }
        String str6 = r4.A0c;
        if (str6 != null) {
            r3.A0R("encoding_tag", str6);
        }
        if (r4.A0n != null) {
            16P.A03(r3, "cobroadcasters");
            Iterator it2 = r4.A0n.iterator();
            while (it2.hasNext()) {
                C41846B3n.A19(r3, it2);
            }
            r3.A0Y();
        }
        Long l5 = r4.A0U;
        if (l5 != null) {
            r3.A0Q("question_pk", l5.longValue());
        }
        String str7 = r4.A0j;
        if (str7 != null) {
            r3.A0R("simulcast_fb_broadcast_id", str7);
        }
        Boolean bool2 = r4.A0C;
        if (bool2 != null) {
            r3.A0S("internal_only", bool2.booleanValue());
        }
        AnonymousClass3NV r02 = r4.A0A;
        if (r02 != null) {
            r3.A0P("visibility", r02.A00.intValue());
        }
        Integer num3 = r4.A0P;
        if (num3 != null) {
            r3.A0P("number_of_qualities", num3.intValue());
        }
        Boolean bool3 = r4.A0B;
        if (bool3 != null) {
            r3.A0S("copyright_violation", bool3.booleanValue());
        }
        Boolean bool4 = r4.A0I;
        if (bool4 != null) {
            r3.A0S("is_scheduled_live", bool4.booleanValue());
        }
        Boolean bool5 = r4.A0F;
        if (bool5 != null) {
            r3.A0S("is_exclusive_live", bool5.booleanValue());
        }
        Boolean bool6 = r4.A0H;
        if (bool6 != null) {
            r3.A0S("is_player_live_trace_enabled", bool6.booleanValue());
        }
        Boolean bool7 = r4.A0E;
        if (bool7 != null) {
            r3.A0S("hide_from_feed_unit", bool7.booleanValue());
        }
        String str8 = r4.A0g;
        if (str8 != null) {
            r3.A0R("preview", str8);
        }
        if (r4.A04 != null) {
            r3.A0q("media_overlay_info");
            C277974w2.A00(r3, r4.A04);
        }
        if (r4.A01 != null) {
            r3.A0q("charity_info");
            C45561CyZ.A00(r3, r4.A01);
        }
        if (r4.A03 != null) {
            r3.A0q("user_pay_viewer_config");
            C2815458k.A00(r3, r4.A03);
        }
        String str9 = r4.A0Y;
        if (str9 != null) {
            r3.A0R("broadcast_message", str9);
        }
        String str10 = r4.A0d;
        if (str10 != null) {
            r3.A0R("igtv_post_id", str10);
        }
        if (r4.A0l != null) {
            16P.A03(r3, "sponsor_tags");
            for (AnonymousClass535 r03 : r4.A0l) {
                if (r03 != null) {
                    AnonymousClass534.A00(r3, r03);
                }
            }
            r3.A0Y();
        }
        Boolean bool8 = r4.A0K;
        if (bool8 != null) {
            r3.A0S("is_viewer_comment_allowed", bool8.booleanValue());
        }
        if (r4.A00 != null) {
            r3.A0q("affiliate_info");
            C45506Cxg.A00(r3, r4.A00);
        }
        if (r4.A0k != null) {
            16P.A03(r3, "chat_info");
            for (BFL bfl : r4.A0k) {
                if (bfl != null) {
                    C45587Cyz.A00(r3, bfl);
                }
            }
            r3.A0Y();
        }
        Boolean bool9 = r4.A0M;
        if (bool9 != null) {
            r3.A0S("show_bff_upsell", bool9.booleanValue());
        }
        Boolean bool10 = r4.A0D;
        if (bool10 != null) {
            r3.A0S("fan_club_subscribe_enabled", bool10.booleanValue());
        }
        Boolean bool11 = r4.A0J;
        if (bool11 != null) {
            r3.A0S("sup_active", bool11.booleanValue());
        }
        Integer num4 = r4.A0O;
        if (num4 != null) {
            r3.A0P("index_position_in_response", num4.intValue());
        }
        1XY.A00(r3, r4);
        r3.A0Z();
    }
}
