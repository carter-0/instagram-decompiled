package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;

public abstract class FFC {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r2.has("client_input_params") != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap A00(android.net.Uri r5) {
        /*
            java.lang.String r4 = "server_params"
            java.lang.String r0 = "params"
            java.lang.String r3 = r5.getQueryParameter(r0)
            if (r3 == 0) goto L_0x0053
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0053
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x004e }
            r2.<init>(r3)     // Catch:{ IOException | JSONException -> 0x004e }
            boolean r0 = r2.has(r4)     // Catch:{ IOException | JSONException -> 0x004e }
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "client_input_params"
            boolean r1 = r2.has(r0)     // Catch:{ IOException | JSONException -> 0x004e }
            r0 = 0
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.has(r4)     // Catch:{ IOException | JSONException -> 0x004e }
            if (r0 == 0) goto L_0x0032
            java.lang.String r3 = r2.getString(r4)     // Catch:{ IOException | JSONException -> 0x004e }
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 != 0) goto L_0x003a
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException | JSONException -> 0x004e }
            return r0
        L_0x003a:
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException | JSONException -> 0x004e }
            X.16F r0 = r0.A03(r3)     // Catch:{ IOException | JSONException -> 0x004e }
            r0.A1J()     // Catch:{ IOException | JSONException -> 0x004e }
            java.util.HashMap r0 = X.F5I.A00(r0)     // Catch:{ IOException | JSONException -> 0x004e }
            if (r0 != 0) goto L_0x0057
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException | JSONException -> 0x004e }
            return r0
        L_0x004e:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            return r0
        L_0x0053:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFC.A00(android.net.Uri):java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r7, android.net.Uri r8, com.instagram.common.session.UserSession r9, int r10) {
        /*
            java.lang.String r0 = "app_id"
            java.lang.String r6 = r8.getQueryParameter(r0)
            r6.getClass()
            java.util.HashMap r5 = A00(r8)
            java.lang.String r0 = "bloks_screen_options"
            java.lang.String r0 = r8.getQueryParameter(r0)
            r3 = 0
            if (r0 == 0) goto L_0x001c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001c }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r4 = r3
        L_0x001d:
            java.lang.String r0 = "config"
            java.lang.String r0 = r8.getQueryParameter(r0)
            if (r0 == 0) goto L_0x00fb
            X.F1e r2 = X.C18136VmC.A00(r9, r0)
        L_0x0029:
            X.DiU r6 = X.C46649DiU.A04(r6, r5)
            r5 = 1
            if (r4 == 0) goto L_0x00f3
            java.lang.String r1 = "hides_tab_bar"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x0048
            boolean r1 = r4.optBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0048
            r1 = r1 ^ 1
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0l = r1
        L_0x0048:
            java.lang.String r1 = "presentation_method"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r4.optString(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r1 = X.C48718Ej3.A00(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0P = r1
        L_0x005e:
            java.lang.String r1 = "respect_safe_area_insets"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x0076
            boolean r1 = r4.optBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0076
            r1 = r1 ^ 1
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0f = r1
        L_0x0076:
            java.lang.String r1 = "renders_in_unsafe_area"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x008c
            boolean r1 = r4.optBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x008c
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0f = r1
        L_0x008c:
            java.lang.String r1 = "renders_in_unsafe_area_top"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00a2
            boolean r1 = r4.optBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00a2
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0h = r1
        L_0x00a2:
            java.lang.String r1 = "renders_in_unsafe_area_bottom"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00b8
            boolean r1 = r4.optBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00b8
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0g = r1
        L_0x00b8:
            java.lang.String r1 = "ttrc_marker_id"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00cc
            int r1 = r4.optInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00cc
            r6.A00 = r1
        L_0x00cc:
            java.lang.String r1 = "qpl_marker_id"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00e3
            int r1 = r4.optInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00e3
            X.02m r0 = X.02m.A0p
            r0.markerStart(r1)
        L_0x00e3:
            java.lang.String r1 = "screen_id"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x00ef
            java.lang.String r3 = r4.optString(r1)
        L_0x00ef:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0S = r3
        L_0x00f3:
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            if (r10 == r5) goto L_0x0107
            r6.A0D(r7, r0)
            return
        L_0x00fb:
            X.F1e r2 = new X.F1e
            r2.<init>(r9)
            r1 = 0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A00
            r0.A0k = r1
            goto L_0x0029
        L_0x0107:
            r6.A0E(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFC.A01(android.content.Context, android.net.Uri, com.instagram.common.session.UserSession, int):void");
    }

    public static void A02(Context context, UserSession userSession, String str) {
        Uri A03 = 0cp.A03(str);
        Context context2 = context;
        C359638dF.A03(context2, new C359618dD(userSession), A03.getQueryParameter("app_id"), (String) null, A00(A03), 600);
    }

    public static void A03(UserSession userSession, Context context, String str) {
        A01(context, 0cp.A03(str), userSession, 0);
    }
}
