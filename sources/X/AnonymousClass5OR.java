package X;

/* renamed from: X.5OR  reason: invalid class name */
public final class AnonymousClass5OR {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.util.List] */
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
    public static X.C289955eW parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5eW r2 = new X.5eW     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x02f1
            java.lang.String r1 = r4.A0q()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.lang.String r0 = "is_first_page"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0034
            r4.A0d()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x0030:
            r4.A0z()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "is_last_page"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A0Q = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0043:
            java.lang.String r0 = "continuation_token"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3 = 0
            if (r0 == 0) goto L_0x0055
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x008c
            goto L_0x0030
        L_0x0055:
            java.lang.String r0 = "auto_load_more_enabled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0064
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A0P = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0064:
            java.lang.String r0 = "next_max_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x007b
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x0078
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x0078:
            r2.A0G = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x007b:
            java.lang.String r0 = "last_updated"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0090
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x008c
            goto L_0x0030
        L_0x008c:
            r4.A1P()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0090:
            java.lang.String r0 = "last_checked"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x00a7
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x00a4
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x00a4:
            r2.A0F = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x00a7:
            java.lang.String r0 = "pagination_first_record_timestamp"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x00bf
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x00bb
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x00bb:
            r2.A0E = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x00bf:
            java.lang.String r0 = "counts"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x00cf
            X.5eZ r0 = X.C289975eY.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A0B = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x00cf:
            java.lang.String r0 = "copyright_stories"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x00fa
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x00f6
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x00e4:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x00f6
            X.5Gi r0 = X.C283145Gh.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x00e4
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x00e4
        L_0x00f6:
            r2.A0I = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x00fa:
            java.lang.String r0 = "friend_request_stories"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0125
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x0121
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x010f:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x0121
            X.5Gi r0 = X.C283145Gh.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x010f
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x010f
        L_0x0121:
            r2.A0K = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0125:
            java.lang.String r0 = "priority_stories"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0150
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x014c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x013a:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x014c
            X.5Gi r0 = X.C283145Gh.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x013a
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x013a
        L_0x014c:
            r2.A0O = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0150:
            java.lang.String r0 = "new_stories"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x017b
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x0177
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x0165:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x0177
            X.5Gi r0 = X.C283145Gh.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0165
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0165
        L_0x0177:
            r2.A0L = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x017b:
            java.lang.String r0 = "old_stories"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x01a6
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x01a2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x0190:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x01a2
            X.5Gi r0 = X.C283145Gh.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0190
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0190
        L_0x01a2:
            r2.A0M = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x01a6:
            java.lang.String r0 = "suggested_users"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x01b6
            X.3UH r0 = X.C44753CkP.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A07 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x01b6:
            java.lang.String r0 = "aymf"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x01c6
            X.Cuz r0 = X.B7H.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A0A = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x01c6:
            java.lang.String r0 = "ads_manager"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x01d6
            X.GRr r0 = X.GWC.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A08 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x01d6:
            java.lang.String r0 = "branded_content"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x01e6
            X.GSP r0 = X.GWP.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A09 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x01e6:
            java.lang.String r0 = "business_conversion_reminder"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x01f6
            X.BBV r0 = X.C39560A0c.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A04 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x01f6:
            java.lang.String r0 = "story_mentions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0206
            X.GSY r0 = X.GWE.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A05 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0206:
            java.lang.String r0 = "partition"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0216
            X.5iq r0 = X.C292345in.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A0C = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0216:
            java.lang.String r0 = "filters"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0241
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x023d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x022b:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x023d
            X.JwH r0 = X.B7E.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x022b
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x022b
        L_0x023d:
            r2.A0J = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0241:
            java.lang.String r0 = "pills"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x026c
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 != r0) goto L_0x0268
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r3.<init>()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x0256:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x0268
            com.instagram.newsfeed.model.PillsFilterCategory r0 = X.GWB.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0256
            r3.add(r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0256
        L_0x0268:
            r2.A0N = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x026c:
            java.lang.String r0 = "text_post_app_aysf"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x027c
            X.Jv7 r0 = X.C48358EdF.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A06 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x027c:
            java.lang.String r0 = "strong_starts_index"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x0294
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x0290
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x0290:
            r2.A0H = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x0294:
            java.lang.String r0 = "banner"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x02ac
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r1 == r0) goto L_0x02a8
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
        L_0x02a8:
            r2.A0D = r3     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x02ac:
            java.lang.String r0 = "badging_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x02bc
            X.9IM r0 = X.C292305ij.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A01 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x02bc:
            java.lang.String r0 = "unaggregated_badging_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x02cc
            X.9IM r0 = X.C292305ij.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A02 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x02cc:
            java.lang.String r0 = "truncation_config"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x02dc
            X.9Ir r0 = X.C289965eX.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A03 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x02dc:
            java.lang.String r0 = "ui_config"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            if (r0 == 0) goto L_0x02ec
            X.9I4 r0 = X.C292325il.parseFromJson(r4)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            r2.A00 = r0     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x02ec:
            X.1XY.A01(r4, r2, r1)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            goto L_0x0030
        L_0x02f1:
            java.util.List r1 = r2.A0I     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.lang.String r0 = "copyright_stories"
            X.C289955eW.A00(r1, r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.util.List r1 = r2.A0K     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.lang.String r0 = "friend_request_stories"
            X.C289955eW.A00(r1, r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.util.List r1 = r2.A0O     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.lang.String r0 = "priority_stories"
            X.C289955eW.A00(r1, r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.util.List r1 = r2.A0L     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.lang.String r0 = "new_stories"
            X.C289955eW.A00(r1, r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.util.List r1 = r2.A0M     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            java.lang.String r0 = "old_stories"
            X.C289955eW.A00(r1, r0)     // Catch:{ IOException -> 0x031c, Exception -> 0x0315 }
            return r2
        L_0x0315:
            r0 = move-exception
            X.1Pf r1 = new X.1Pf
            r1.<init>(r0)
            throw r1
        L_0x031c:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5OR.parseFromJson(X.16F):X.5eW");
    }
}
