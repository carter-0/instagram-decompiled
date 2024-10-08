package com.instagram.urlhandlers.media;

import X.0Tu;
import X.C71172bH;
import X.DbY;
import X.DbZ;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class MediaExternalUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (X.DbV.A1X(r3, r6) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        if (r1 == null) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(android.os.Bundle r8, android.os.Bundle r9, com.instagram.common.session.UserSession r10) {
        /*
            r7 = this;
            r4 = 1
            int r5 = X.DbW.A02(r4, r10, r9)
            java.lang.String r1 = X.DbS.A0m(r9)
            if (r1 == 0) goto L_0x0130
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0130
            android.net.Uri r3 = X.DbT.A09(r1)
            java.lang.String r1 = r3.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0130
            java.lang.String r1 = X.DbT.A0v(r3)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r0 = "shortcode"
            java.lang.String r1 = r3.getQueryParameter(r0)
            if (r1 == 0) goto L_0x00e3
            java.lang.String r6 = "open_comments"
            boolean r0 = X.DbV.A1X(r3, r6)
            if (r0 != 0) goto L_0x004f
            java.lang.String r6 = "open_like_count"
            boolean r0 = X.DbV.A1X(r3, r6)
            if (r0 == 0) goto L_0x00fa
        L_0x004f:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 41
            java.lang.String r5 = X.C273654mx.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 730(0x2da, float:1.023E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.0mp.A06(r0, r1)
            android.net.Uri r0 = X.0cp.A03(r0)
            java.lang.String r0 = r0.toString()
            r2.putString(r5, r0)
            r2.putBoolean(r6, r4)
        L_0x0075:
            java.lang.String r0 = "media_surface"
            java.lang.String r1 = r3.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0086
        L_0x007d:
            r0 = 2895(0xb4f, float:4.057E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
        L_0x0086:
            java.util.Set r4 = r3.getQueryParameterNames()
            r0 = 70
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = r3.getQueryParameter(r1)
            r0 = 2891(0xb4b, float:4.051E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
        L_0x00a3:
            java.util.Set r0 = r3.getQueryParameterNames()
            java.lang.String r1 = "collab_action"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = r3.getQueryParameter(r1)
            r0 = 2892(0xb4c, float:4.053E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
        L_0x00bc:
            r9.putAll(r2)
            X.FHB.A08(r9, r7, r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320652937929471(0x810971006022ff, double:3.0326653972524584E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00e2
            android.view.Window r3 = r7.getWindow()
            if (r3 == 0) goto L_0x00e2
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r0 = 16
            if (r2 < r1) goto L_0x00df
            r0 = 48
        L_0x00df:
            r3.setSoftInputMode(r0)
        L_0x00e2:
            return
        L_0x00e3:
            java.lang.String r0 = "raw_id"
            java.lang.String r1 = r3.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0130
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 2894(0xb4e, float:4.055E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            goto L_0x0075
        L_0x00fa:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 41
            java.lang.String r4 = X.C273654mx.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 730(0x2da, float:1.023E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.0mp.A06(r0, r1)
            android.net.Uri r0 = X.0cp.A03(r0)
            java.lang.String r0 = r0.toString()
            r2.putString(r4, r0)
            goto L_0x0075
        L_0x011f:
            java.util.List r2 = r3.getPathSegments()
            int r0 = r2.size()
            if (r0 == r5) goto L_0x0134
            int r1 = r2.size()
            r0 = 3
            if (r1 == r0) goto L_0x0134
        L_0x0130:
            r7.finish()
            return
        L_0x0134:
            r6 = 0
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r6)
            java.lang.String r1 = "p"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x014b
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r4)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0130
        L_0x014b:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = X.DbT.A10(r3)
            java.lang.String r5 = "applink"
            int r4 = X.00l.A08(r1, r5, r6, r6)
            r0 = -1
            if (r4 == r0) goto L_0x0162
            java.lang.String r0 = "www"
            java.lang.String r1 = X.00p.A0g(r1, r5, r0, r6)
        L_0x0162:
            r0 = 41
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r1)
            java.util.Set r4 = r3.getQueryParameterNames()
            r0 = 286(0x11e, float:4.01E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x018d
            java.lang.String r1 = r3.getQueryParameter(r1)
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_FEED_TYPE"
            r2.putString(r0, r1)
            java.lang.String r1 = X.DbT.A0v(r3)
            java.lang.String r0 = "com.instagram.url.constants.ARGUMENTS_KEY_THREAD_ID"
            r2.putString(r0, r1)
        L_0x018d:
            java.util.Set r0 = r3.getQueryParameterNames()
            java.lang.String r1 = "comment_id"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01a6
            java.lang.String r1 = r3.getQueryParameter(r1)
            r0 = 2893(0xb4d, float:4.054E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
        L_0x01a6:
            java.lang.String r1 = "media_surface"
            java.lang.String r0 = r3.getQueryParameter(r1)
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = r3.getQueryParameter(r1)
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onBackPressed() {
        FragmentActivity A00;
        super.onBackPressed();
        if (DbY.A1Y(0Tu.A05, this.A00, 36323045229406999L) && (A00 = C71172bH.A00()) != null) {
            DbZ.A16(DbY.A0H(A00));
        }
        if (getSupportFragmentManager().A0U.A04().isEmpty()) {
            finish();
        }
    }
}
