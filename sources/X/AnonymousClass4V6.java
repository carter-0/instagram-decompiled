package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.4V6  reason: invalid class name */
public abstract class AnonymousClass4V6 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4UC parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.4UC r0 = new X.4UC     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.<init>()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x01b4
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x01b5
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r5.A1J()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            java.lang.String r1 = "creative"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x003a
            X.4V7 r1 = X.AnonymousClass4VC.parseFromJson(r5)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A08 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
        L_0x0036:
            r5.A0z()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0016
        L_0x003a:
            java.lang.String r1 = "template"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x004c
            X.4VA r1 = X.AnonymousClass4VH.parseFromJson(r5)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A09 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x004c:
            java.lang.String r1 = "id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r4 = 0
            if (r1 == 0) goto L_0x0064
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x0061
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
        L_0x0061:
            r0.A0C = r4     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x0064:
            java.lang.String r1 = "user_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x007e
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x0078
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
        L_0x0078:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0E = r4     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x007e:
            java.lang.String r1 = "promotion_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x0098
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x0092
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
        L_0x0092:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0D = r4     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x0098:
            java.lang.String r1 = "end_time"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x00a7
            long r1 = r5.A0y()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A02 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x00a7:
            java.lang.String r1 = "max_impressions"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x00b6
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A00 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x00b6:
            java.lang.String r1 = "is_server_force_pass"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x00c6
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0J = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x00c6:
            java.lang.String r1 = "disable_logging_to_qp_tables"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0M = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x00d6:
            java.lang.String r1 = "local_state"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x00e9
            X.4VB r1 = X.AnonymousClass4VI.parseFromJson(r5)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0A = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x00e9:
            java.lang.String r1 = "priority"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x00f9
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A01 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x00f9:
            java.lang.String r1 = "surface"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x0118
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            java.util.Map r2 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A02     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A06 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x0118:
            java.lang.String r1 = "triggers"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x0147
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 != r1) goto L_0x0143
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r4.<init>()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
        L_0x012d:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x0143
            java.lang.String r1 = r5.A1Q()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            com.instagram.quickpromotion.intf.Trigger r1 = X.2cY.A00(r1)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x012d
            r4.add(r1)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x012d
        L_0x0143:
            r0.A0F = r4     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x0147:
            java.lang.String r1 = "logging_data"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x015f
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r2 == r1) goto L_0x015b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
        L_0x015b:
            r0.A0B = r4     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x015f:
            java.lang.String r1 = "log_eligibility_waterfall"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x016f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0L = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x016f:
            java.lang.String r1 = "contextual_filters"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x017f
            X.4VK r1 = X.AnonymousClass4VJ.parseFromJson(r5)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A07 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x017f:
            java.lang.String r1 = "is_holdout"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x018f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0I = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x018f:
            java.lang.String r1 = "client_side_dry_run"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x019f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A0G = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x019f:
            java.lang.String r1 = "fetch_time_epoch"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            if (r1 == 0) goto L_0x01af
            long r1 = r5.A0y()     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            r0.A03 = r1     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x01af:
            X.1XY.A01(r5, r0, r2)     // Catch:{ IOException -> 0x01bd, Exception -> 0x01b6 }
            goto L_0x0036
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            return r0
        L_0x01b6:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x01bd:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4V6.parseFromJson(X.16F):X.4UC");
    }

    public static void A00(17Z r3, AnonymousClass4UC r4) {
        r3.A0c();
        r3.A0q("creative");
        AnonymousClass4VC.A00(r3, r4.A08);
        r3.A0q("template");
        AnonymousClass4VH.A00(r3, r4.A09);
        String str = r4.A0C;
        if (str != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r4.A0E);
        r3.A0R("promotion_id", r4.A0D);
        r3.A0Q("end_time", r4.A02);
        r3.A0P("max_impressions", r4.A00);
        r3.A0S("is_server_force_pass", r4.A0J);
        r3.A0S("disable_logging_to_qp_tables", r4.A0M);
        r3.A0q("local_state");
        AnonymousClass4VI.A00(r3, r4.A0A);
        r3.A0P("priority", r4.A01);
        r3.A0P("surface", r4.A06.A00);
        if (r4.A0F != null) {
            16P.A03(r3, "triggers");
            for (Trigger trigger : r4.A0F) {
                if (trigger != null) {
                    r3.A0t(trigger.A01);
                }
            }
            r3.A0Y();
        }
        String str2 = r4.A0B;
        if (str2 != null) {
            r3.A0R("logging_data", str2);
        }
        r3.A0S("log_eligibility_waterfall", r4.A0L);
        if (r4.A07 != null) {
            r3.A0q("contextual_filters");
            AnonymousClass4VJ.A00(r3, r4.A07);
        }
        r3.A0S("is_holdout", r4.A0I);
        r3.A0S("client_side_dry_run", r4.A0G);
        r3.A0Q("fetch_time_epoch", r4.A03);
        1XY.A00(r3, r4);
        r3.A0Z();
    }
}
