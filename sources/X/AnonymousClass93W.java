package X;

import java.io.IOException;

/* renamed from: X.93W  reason: invalid class name */
public final class AnonymousClass93W {
    public static C298815u5 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C298815u5 r2 = new C298815u5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                A00(r3, r2, A0q);
                r3.A0z();
            }
            r2.A00();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.16F r5, X.C298815u5 r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "preload_distance"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0013
            int r0 = r5.A1D()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A01 = r0
            return
        L_0x0013:
            java.lang.String r0 = "clips_special_response_type"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0038
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x0033
            r1 = 0
        L_0x0024:
            java.util.Map r0 = com.instagram.api.schemas.ClipsSpecialResponseType.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.api.schemas.ClipsSpecialResponseType r0 = (com.instagram.api.schemas.ClipsSpecialResponseType) r0
            if (r0 != 0) goto L_0x0030
            com.instagram.api.schemas.ClipsSpecialResponseType r0 = com.instagram.api.schemas.ClipsSpecialResponseType.UNRECOGNIZED
        L_0x0030:
            r6.A00 = r0
            return
        L_0x0033:
            java.lang.String r1 = r5.A1P()
            goto L_0x0024
        L_0x0038:
            java.lang.String r0 = "clips_items"
            boolean r0 = r0.equals(r7)
            r2 = 0
            if (r0 == 0) goto L_0x0063
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0060
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x004e:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0060
            X.4sL r0 = X.C275974sH.parseFromJson(r5)
            if (r0 == 0) goto L_0x004e
            r2.add(r0)
            goto L_0x004e
        L_0x0060:
            r6.A09 = r2
            return
        L_0x0063:
            java.lang.String r0 = "container_module"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x007a
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0077
            java.lang.String r2 = r5.A1P()
        L_0x0077:
            r6.A04 = r2
            return
        L_0x007a:
            java.lang.String r0 = "first_seen_media_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0091
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x008e
            java.lang.String r2 = r5.A1P()
        L_0x008e:
            r6.A05 = r2
            return
        L_0x0091:
            java.lang.String r0 = "items"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00bf
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00b8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x00a6:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00b8
            X.4sL r0 = X.C275974sH.parseFromJson(r5)
            if (r0 == 0) goto L_0x00a6
            r2.add(r0)
            goto L_0x00a6
        L_0x00b8:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r6.A0A = r2
            return
        L_0x00bf:
            java.lang.String r0 = "items_with_ads"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e9
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00e6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x00d4:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00e6
            X.BE8 r0 = X.C44086CVd.parseFromJson(r5)
            if (r0 == 0) goto L_0x00d4
            r2.add(r0)
            goto L_0x00d4
        L_0x00e6:
            r6.A0B = r2
            return
        L_0x00e9:
            java.lang.String r0 = "media_id_to_brand_safety_severity_map"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x012b
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x0128
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x00fe:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0127
            java.lang.String r3 = r5.A1P()
            r5.A1J()
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x0119
            r4.put(r3, r2)
            goto L_0x00fe
        L_0x0119:
            int r0 = r5.A1D()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00fe
            r4.put(r3, r0)
            goto L_0x00fe
        L_0x0127:
            r2 = r4
        L_0x0128:
            r6.A08 = r2
            return
        L_0x012b:
            java.lang.String r0 = "paging_info"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x013e
            X.4sZ r1 = X.C276094sY.parseFromJson(r5)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r6.A02 = r1
            return
        L_0x013e:
            java.lang.String r0 = "reels_page_index"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0155
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0152
            java.lang.String r2 = r5.A1P()
        L_0x0152:
            r6.A06 = r2
            return
        L_0x0155:
            java.lang.String r0 = "request_id"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x016c
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0169
            java.lang.String r2 = r5.A1P()
        L_0x0169:
            r6.A07 = r2
            return
        L_0x016c:
            java.lang.String r0 = "unable_to_load_chaining_media"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x017f
            boolean r0 = r5.A0d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A03 = r0
            return
        L_0x017f:
            X.1XY.A01(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93W.A00(X.16F, X.5u5, java.lang.String):void");
    }
}
