package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.5JI  reason: invalid class name */
public abstract class AnonymousClass5JI {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5JJ parseFromJson(X.16F r8) {
        /*
            r3 = 0
            X.0qQ.A0B(r8, r3)
            X.5JJ r0 = new X.5JJ     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.<init>()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x02b9
        L_0x0016:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x02ba
            java.lang.String r2 = r8.A0q()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r8.A1J()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.String r1 = "type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0065
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x003b
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x003b:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1 = 2
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r1)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            int r6 = r7.length     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r5 = 0
            goto L_0x0048
        L_0x0046:
            int r5 = r5 + 1
        L_0x0048:
            if (r5 >= r6) goto L_0x0061
            r2 = r7[r5]     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            int r1 = r2.intValue()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = "text"
        L_0x0056:
            boolean r1 = r1.equals(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x005e
        L_0x005b:
            java.lang.String r1 = "sticker"
            goto L_0x0056
        L_0x005e:
            if (r1 != 0) goto L_0x0062
            goto L_0x0046
        L_0x0061:
            r2 = 0
        L_0x0062:
            r0.A0A = r2     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0065:
            java.lang.String r1 = "sticker_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x007f
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0079
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x0079:
            r0.A0I = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x007b:
            r8.A0z()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x0016
        L_0x007f:
            java.lang.String r1 = "sticker_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0096
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0093
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x0093:
            r0.A0H = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0096:
            java.lang.String r1 = "start"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x00a5
            int r1 = r8.A1D()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A01 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x00a5:
            java.lang.String r1 = "end"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x00b4
            int r1 = r8.A1D()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A00 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x00b4:
            java.lang.String r1 = "x"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x00c8
            double r4 = r8.A0U()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A05 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x00c8:
            java.lang.String r1 = "y"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x00dc
            double r4 = r8.A0U()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A06 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x00dc:
            java.lang.String r1 = "width"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x00f0
            double r4 = r8.A0U()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A09 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x00f0:
            java.lang.String r1 = "height"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0105
            double r4 = r8.A0U()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A04 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0105:
            java.lang.String r1 = "rotation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x011a
            double r4 = r8.A0U()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A07 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x011a:
            java.lang.String r1 = "scale"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x012f
            double r4 = r8.A0U()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Float r1 = new java.lang.Float     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A08 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x012f:
            java.lang.String r1 = "z_index"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0143
            int r1 = r8.A1D()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A0B = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0143:
            java.lang.String r1 = "is_text_to_speech_enabled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x015f
            java.lang.String r4 = r8.A1Q()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r2 = 0
            if (r4 == 0) goto L_0x015b
            java.lang.String r1 = "1"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 != r5) goto L_0x015b
            r2 = 1
        L_0x015b:
            r0.A0P = r2     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x015f:
            java.lang.String r1 = "voice_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0177
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0173
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x0173:
            r0.A0K = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0177:
            java.lang.String r1 = "voice_name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x018f
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x018b
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x018b:
            r0.A0L = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x018f:
            java.lang.String r1 = "shortwave_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x01a7
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x01a3
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x01a3:
            r0.A0G = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x01a7:
            java.lang.String r1 = "is_outside_suggested_margins"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x01bb
            boolean r1 = r8.A0d()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A03 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x01bb:
            java.lang.String r1 = "text"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x01d3
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x01cf
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x01cf:
            r0.A0J = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x01d3:
            java.lang.String r1 = "reusable_text_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x01e3
            X.3ik r1 = X.AnonymousClass3i0.parseFromJson(r8)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A02 = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x01e3:
            java.lang.String r1 = "format_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x01fb
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x01f7
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x01f7:
            r0.A0E = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x01fb:
            java.lang.String r1 = "effects"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x022e
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 != r1) goto L_0x022a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r4.<init>()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x0210:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x022a
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0210
            java.lang.String r1 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0210
            r4.add(r1)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x0210
        L_0x022a:
            r0.A0N = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x022e:
            java.lang.String r1 = "colors"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0261
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 != r1) goto L_0x025d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r4.<init>()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x0243:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x025d
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0243
            java.lang.String r1 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0243
            r4.add(r1)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x0243
        L_0x025d:
            r0.A0M = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0261:
            java.lang.String r1 = "alignment"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0279
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x0275
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x0275:
            r0.A0C = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0279:
            java.lang.String r1 = "animation"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x0291
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x028d
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x028d:
            r0.A0D = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x0291:
            java.lang.String r1 = "graphic_effect"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x02a9
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r2 == r1) goto L_0x02a5
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
        L_0x02a5:
            r0.A0F = r4     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x02a9:
            java.lang.String r1 = "is_spinnable"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            if (r1 == 0) goto L_0x007b
            boolean r1 = r8.A0d()     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            r0.A0O = r1     // Catch:{ IOException -> 0x02c2, Exception -> 0x02bb }
            goto L_0x007b
        L_0x02b9:
            r0 = 0
        L_0x02ba:
            return r0
        L_0x02bb:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x02c2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5JI.parseFromJson(X.16F):X.5JJ");
    }

    public static void A00(17Z r2, AnonymousClass5JJ r3) {
        String str;
        String str2;
        r2.A0c();
        Integer num = r3.A0A;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str2 = "text";
            } else {
                str2 = "sticker";
            }
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        }
        String str3 = r3.A0I;
        if (str3 != null) {
            r2.A0R("sticker_type", str3);
        }
        String str4 = r3.A0H;
        if (str4 != null) {
            r2.A0R("sticker_id", str4);
        }
        r2.A0P("start", r3.A01);
        r2.A0P("end", r3.A00);
        Float f = r3.A05;
        if (f != null) {
            r2.A0O("x", f.floatValue());
        }
        Float f2 = r3.A06;
        if (f2 != null) {
            r2.A0O("y", f2.floatValue());
        }
        Float f3 = r3.A09;
        if (f3 != null) {
            r2.A0O(IgReactMediaPickerNativeModule.WIDTH, f3.floatValue());
        }
        Float f4 = r3.A04;
        if (f4 != null) {
            r2.A0O(IgReactMediaPickerNativeModule.HEIGHT, f4.floatValue());
        }
        Float f5 = r3.A07;
        if (f5 != null) {
            r2.A0O("rotation", f5.floatValue());
        }
        Float f6 = r3.A08;
        if (f6 != null) {
            r2.A0O("scale", f6.floatValue());
        }
        Integer num2 = r3.A0B;
        if (num2 != null) {
            r2.A0P("z_index", num2.intValue());
        }
        if (r3.A0P) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r2.A0R("is_text_to_speech_enabled", str);
        String str5 = r3.A0K;
        if (str5 != null) {
            r2.A0R("voice_id", str5);
        }
        String str6 = r3.A0L;
        if (str6 != null) {
            r2.A0R("voice_name", str6);
        }
        String str7 = r3.A0G;
        if (str7 != null) {
            r2.A0R("shortwave_id", str7);
        }
        Boolean bool = r3.A03;
        if (bool != null) {
            r2.A0S("is_outside_suggested_margins", bool.booleanValue());
        }
        String str8 = r3.A0J;
        if (str8 != null) {
            r2.A0R("text", str8);
        }
        if (r3.A02 != null) {
            r2.A0q("reusable_text_info");
            AnonymousClass3i0.A00(r2, r3.A02);
        }
        String str9 = r3.A0E;
        if (str9 != null) {
            r2.A0R("format_type", str9);
        }
        if (r3.A0N != null) {
            16P.A03(r2, "effects");
            for (String str10 : r3.A0N) {
                if (str10 != null) {
                    r2.A0t(str10);
                }
            }
            r2.A0Y();
        }
        if (r3.A0M != null) {
            16P.A03(r2, "colors");
            for (String str11 : r3.A0M) {
                if (str11 != null) {
                    r2.A0t(str11);
                }
            }
            r2.A0Y();
        }
        String str12 = r3.A0C;
        if (str12 != null) {
            r2.A0R("alignment", str12);
        }
        String str13 = r3.A0D;
        if (str13 != null) {
            r2.A0R("animation", str13);
        }
        String str14 = r3.A0F;
        if (str14 != null) {
            r2.A0R("graphic_effect", str14);
        }
        r2.A0S("is_spinnable", r3.A0O);
        r2.A0Z();
    }
}
