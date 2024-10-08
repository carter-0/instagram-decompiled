package X;

import android.graphics.Rect;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.TtP  reason: case insensitive filesystem */
public abstract class C14291TtP {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C310416b1 parseFromJson(X.16F r6) {
        /*
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.6b1 r0 = new X.6b1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.<init>()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r2 == r1) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0271
        L_0x0016:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r2 == r1) goto L_0x0272
            java.lang.String r2 = r6.A0q()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r6.A1J()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            java.lang.String r1 = "tag"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r4 = 1
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r6.A1Q()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0C = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
        L_0x0034:
            r6.A0z()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0016
        L_0x0038:
            java.lang.String r1 = "source"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = r6.A1Q()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            java.lang.Integer r1 = X.AnonymousClass511.A00(r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0A = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x004e:
            java.lang.String r1 = "bounce_in"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x005d
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0F = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x005d:
            java.lang.String r1 = "fade_in"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x006c
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0N = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x006c:
            java.lang.String r1 = "touch_enabled_by_default"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x007b
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0R = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x007b:
            java.lang.String r1 = "removable_by_trash_can"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x008a
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0Q = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x008a:
            java.lang.String r1 = "fully_visible_onScreen"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0099
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0P = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x0099:
            java.lang.String r1 = "fully_visible_on_alignment_guide"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0O = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x00a8:
            java.lang.String r1 = "contour_path_enabled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0G = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x00b8:
            java.lang.String r1 = "min_scale_factor"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x00c9
            double r4 = r6.A0U()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = (float) r4     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A01 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x00c9:
            java.lang.String r1 = "max_scale_factor"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x00da
            double r4 = r6.A0U()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = (float) r4     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A00 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x00da:
            java.lang.String r1 = "starting_offset"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5 = 0
            if (r1 == 0) goto L_0x0109
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r2 != r1) goto L_0x0105
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
        L_0x00f0:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r2 == r1) goto L_0x0105
            double r1 = r6.A0U()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            java.lang.Float r4 = new java.lang.Float     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.add(r4)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x00f0
        L_0x0105:
            r0.A0E = r5     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x0109:
            java.lang.String r1 = "starting_scale_factor"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x011a
            double r4 = r6.A0U()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = (float) r4     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A04 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x011a:
            java.lang.String r1 = "starting_normalized_width"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x012b
            double r4 = r6.A0U()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = (float) r4     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A02 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x012b:
            java.lang.String r1 = "starting_rotation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x013c
            double r4 = r6.A0U()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = (float) r4     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A03 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x013c:
            java.lang.String r1 = "starting_layer"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x014c
            int r1 = r6.A1D()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A05 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x014c:
            java.lang.String r1 = "enable_rotate_gesture"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x015c
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0K = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x015c:
            java.lang.String r1 = "enable_scale_gesture"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x016c
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0L = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x016c:
            java.lang.String r1 = "enable_horizontal_translation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x017c
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0J = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x017c:
            java.lang.String r1 = "enable_vertical_translation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x018c
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0M = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x018c:
            java.lang.String r1 = "enable_bouncy_press_down"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x019c
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0H = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x019c:
            java.lang.String r1 = "start_time"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x01b0
            int r1 = r6.A1D()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0B = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x01b0:
            java.lang.String r1 = "end_time"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x01c4
            int r1 = r6.A1D()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A09 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x01c4:
            java.lang.String r1 = "content_description"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x01dc
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r2 == r1) goto L_0x01d8
            java.lang.String r5 = r6.A1P()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
        L_0x01d8:
            r0.A0D = r5     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x01dc:
            java.lang.String r1 = "bounds_spec"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0241
            X.Vc8 r5 = X.C17105VIb.parseFromJson(r6)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r5 == 0) goto L_0x022f
            java.lang.Integer r1 = r5.A08     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x022f
            int r2 = r1.intValue()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r2 == r3) goto L_0x0225
            if (r2 == r4) goto L_0x021b
            r1 = 2
            if (r2 == r1) goto L_0x020b
            r1 = 3
            if (r2 == r1) goto L_0x0200
            r1 = 4
            if (r2 != r1) goto L_0x022f
            goto L_0x0238
        L_0x0200:
            android.graphics.Rect r1 = r5.A07     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r1.getClass()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.Ut6 r5 = new X.Ut6     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x023d
        L_0x020b:
            int r4 = r5.A06     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = r5.A02     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            int r2 = (int) r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = r5.A03     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            int r1 = (int) r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r2 = (float) r2     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = (float) r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.Ut8 r5 = new X.Ut8     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>(r4, r2, r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x023d
        L_0x021b:
            float r2 = r5.A04     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = r5.A05     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.Ut7 r5 = new X.Ut7     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>(r2, r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x023d
        L_0x0225:
            float r2 = r5.A00     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            float r1 = r5.A01     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            X.8BG r5 = new X.8BG     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>(r2, r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x023d
        L_0x022f:
            r2 = 17
            r1 = 0
            X.Ut8 r5 = new X.Ut8     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>(r2, r1, r1)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x023d
        L_0x0238:
            X.9qg r5 = new X.9qg     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r5.<init>()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
        L_0x023d:
            r0.A06 = r5     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x0241:
            java.lang.String r1 = "enable_bulk_remove_drawables_by_tag"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0251
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0I = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x0251:
            java.lang.String r1 = "unlink_drawable_when_removed"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0261
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A0S = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x0261:
            java.lang.String r1 = "full_screen_config"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0034
            X.8DA r1 = X.C17106VIc.parseFromJson(r6)     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            r0.A07 = r1     // Catch:{ IOException -> 0x027a, Exception -> 0x0273 }
            goto L_0x0034
        L_0x0271:
            r0 = 0
        L_0x0272:
            return r0
        L_0x0273:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x027a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14291TtP.parseFromJson(X.16F):X.6b1");
    }

    public static void A00(17Z r3, C310416b1 r4) {
        String str;
        String str2;
        r3.A0c();
        Object obj = r4.A0C;
        if (obj != null) {
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = "";
            }
            r3.A0R("tag", str2);
        }
        r3.A0R("source", AnonymousClass512.A00(r4.A0A));
        r3.A0S("bounce_in", r4.A0F);
        r3.A0S("fade_in", r4.A0N);
        r3.A0S("touch_enabled_by_default", r4.A0R);
        r3.A0S("removable_by_trash_can", r4.A0Q);
        r3.A0S("fully_visible_onScreen", r4.A0P);
        r3.A0S("fully_visible_on_alignment_guide", r4.A0O);
        r3.A0S("contour_path_enabled", r4.A0G);
        r3.A0O("min_scale_factor", r4.A01);
        r3.A0O("max_scale_factor", r4.A00);
        if (r4.A0E != null) {
            16P.A03(r3, "starting_offset");
            for (Number number : r4.A0E) {
                if (number != null) {
                    r3.A0f(number.floatValue());
                }
            }
            r3.A0Y();
        }
        r3.A0O("starting_scale_factor", r4.A04);
        r3.A0O("starting_normalized_width", r4.A02);
        r3.A0O("starting_rotation", r4.A03);
        r3.A0P("starting_layer", r4.A05);
        r3.A0S("enable_rotate_gesture", r4.A0K);
        r3.A0S("enable_scale_gesture", r4.A0L);
        r3.A0S("enable_horizontal_translation", r4.A0J);
        r3.A0S("enable_vertical_translation", r4.A0M);
        r3.A0S("enable_bouncy_press_down", r4.A0H);
        Integer num = r4.A0B;
        if (num != null) {
            r3.A0P(TraceFieldType.StartTime, num.intValue());
        }
        Integer num2 = r4.A09;
        if (num2 != null) {
            r3.A0P("end_time", num2.intValue());
        }
        String str3 = r4.A0D;
        if (str3 != null) {
            r3.A0R("content_description", str3);
        }
        AnonymousClass8BH r1 = r4.A06;
        if (r1 != null) {
            r3.A0q("bounds_spec");
            C17677Vc8 A01 = r1.A01();
            r3.A0c();
            Integer num3 = A01.A08;
            if (num3 != null) {
                switch (num3.intValue()) {
                    case 1:
                        str = "NORMALIZED_CENTER";
                        break;
                    case 2:
                        str = "GRAVITY";
                        break;
                    case 3:
                        str = "ABSOLUTE";
                        break;
                    case 4:
                        str = "NO_OVERLAP";
                        break;
                    default:
                        str = "BIAS";
                        break;
                }
                r3.A0R("bounds_spec_type", str);
            }
            r3.A0O("bias_x", A01.A00);
            r3.A0O("bias_y", A01.A01);
            r3.A0O("normalized_center_x", A01.A04);
            r3.A0O("normalized_center_y", A01.A05);
            r3.A0P("gravity", A01.A06);
            r3.A0O("gravity_offset_x", A01.A02);
            r3.A0O("gravity_offset_y", A01.A03);
            Rect rect = A01.A07;
            if (rect != null) {
                r3.A0R("rect", rect.flattenToString());
            }
            r3.A0Z();
        }
        r3.A0S("enable_bulk_remove_drawables_by_tag", r4.A0I);
        r3.A0S("unlink_drawable_when_removed", r4.A0S);
        if (r4.A07 != null) {
            r3.A0q("full_screen_config");
            AnonymousClass8DA r2 = r4.A07;
            r3.A0c();
            r3.A0O("offset_y", r2.A00);
            r3.A0O("scale", r2.A01);
            r3.A0Z();
        }
        r3.A0Z();
    }
}
