package X;

import java.util.ArrayList;

/* renamed from: X.SOg  reason: case insensitive filesystem */
public class C11347SOg {
    public int A00 = 0;
    public int A01 = 0;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05 = false;

    public static C11347SOg A02(String str) {
        if ("ACTION_LAUNCH_APP".equals(str)) {
            return new QK2();
        }
        if ("CLEAR_DEBUG_OVERLAY".equals(str)) {
            return new QK1();
        }
        if ("ACTION_REPORT".equals(str)) {
            return new QK3();
        }
        if ("ACTION_BWP_MORE_INFO".equals(str)) {
            return new QK0();
        }
        return new C11347SOg(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v9, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0445, code lost:
        if (r1 != null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0111, code lost:
        if (r13 != null) goto L_0x0113;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9 A[SYNTHETIC, Splitter:B:56:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe A[SYNTHETIC, Splitter:B:59:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012e A[Catch:{ all -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r18, android.os.Bundle r19, X.C340027ka r20, X.C340037kb r21) {
        /*
            r17 = this;
            r7 = r17
            r3 = r21
            r1 = r20
            boolean r0 = r7 instanceof X.QK3
            r2 = r19
            if (r0 == 0) goto L_0x0171
            r5 = r7
            X.QK3 r5 = (X.QK3) r5
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r6 = "action"
            java.lang.String r0 = "ACTION_REPORT"
            r4.put(r6, r0)
            r9 = r3
            com.facebook.browser.lite.BrowserLiteFragment r9 = (com.facebook.browser.lite.BrowserLiteFragment) r9
            java.lang.String r6 = r9.A0l
            java.lang.String r0 = "current_url"
            r4.put(r0, r6)
            android.net.Uri r0 = r9.A07
            if (r0 == 0) goto L_0x0032
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "url"
            r4.put(r0, r6)
        L_0x0032:
            r7 = r1
            com.facebook.browser.lite.BrowserLiteFragment r7 = (com.facebook.browser.lite.BrowserLiteFragment) r7
            X.A9z r8 = r7.A0d
            java.lang.String r0 = r9.A0l
            if (r0 == 0) goto L_0x004e
            if (r8 == 0) goto L_0x004e
            X.SRY r6 = X.SRY.A00()
            java.lang.String r12 = r9.A0l
            boolean r0 = r8.A0p
            if (r0 != 0) goto L_0x007b
            com.facebook.iabeventlogging.model.IABEmptyEvent r8 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x0049:
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r7.A0e
            r6.A06(r2, r8, r0)
        L_0x004e:
            android.content.Intent r6 = r1.getIntent()
            r1 = 0
            if (r6 == 0) goto L_0x005e
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA"
            boolean r0 = r6.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x005e
            r1 = 1
        L_0x005e:
            X.QLA r7 = r3.C8U()
            if (r1 == 0) goto L_0x02fb
            if (r7 == 0) goto L_0x02fb
            r0 = r7
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r10 = r0.A04
            android.content.Context r16 = r10.getContext()
            java.io.File r13 = r16.getFilesDir()
            java.lang.String r3 = "iab_screenshot.jpg"
            r1 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r6 = 0
            r12 = 1
            goto L_0x008e
        L_0x007b:
            X.0JP r0 = r8.A0m
            long r13 = r0.now()
            java.lang.String r10 = r8.A0Z
            java.lang.String r11 = r8.A0W
            com.facebook.privacy.zone.api.ZonedValue r9 = r8.A0Q
            com.facebook.iabeventlogging.model.IABReportStartEvent r8 = new com.facebook.iabeventlogging.model.IABReportStartEvent
            r15 = r13
            r8.<init>(r9, r10, r11, r12, r13, r15)
            goto L_0x0049
        L_0x008e:
            r10.setDrawingCacheEnabled(r12)     // Catch:{ NullPointerException -> 0x0124, all -> 0x0167 }
            android.graphics.Bitmap r0 = r10.getDrawingCache(r12)     // Catch:{ NullPointerException -> 0x0124, all -> 0x0167 }
            X.0fO.A03(r0)     // Catch:{ NullPointerException -> 0x0124, all -> 0x0167 }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r0)     // Catch:{ NullPointerException -> 0x0124, all -> 0x0167 }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ NullPointerException -> 0x0122 }
            java.lang.String r8 = "Unable to close file stream"
            java.io.File r14 = X.JTO.A0s(r13, r3)     // Catch:{ NullPointerException -> 0x0122 }
            r14.delete()     // Catch:{ NullPointerException -> 0x0122 }
            float r0 = X.JTO.A02(r9)     // Catch:{ NullPointerException -> 0x0122 }
            int r3 = X.AnonymousClass7TE.A05(r0, r1)     // Catch:{ NullPointerException -> 0x0122 }
            float r0 = X.JTO.A01(r9)     // Catch:{ NullPointerException -> 0x0122 }
            int r1 = X.AnonymousClass7TE.A05(r0, r1)     // Catch:{ NullPointerException -> 0x0122 }
            java.lang.String r0 = r14.getCanonicalPath()     // Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x00e9, all -> 0x00e7 }
            android.graphics.Bitmap r12 = X.0fO.A00(r9, r3, r1, r12)     // Catch:{ IOException -> 0x00e4, all -> 0x00e2 }
            r0 = 50
            X.0fO.A02(r11, r12, r13, r0)     // Catch:{ IOException -> 0x00e0 }
            r13.flush()     // Catch:{ IOException -> 0x00e0 }
            if (r12 == 0) goto L_0x00d1
            r12.recycle()     // Catch:{ NullPointerException -> 0x0122 }
        L_0x00d1:
            r13.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x0132
        L_0x00d5:
            r3 = move-exception
            java.lang.String r1 = "BrowserLiteWebView"
            boolean r0 = X.SQO.A00     // Catch:{ NullPointerException -> 0x0122 }
            if (r0 == 0) goto L_0x0132
            android.util.Log.e(r1, r8, r3)     // Catch:{ NullPointerException -> 0x0122 }
            goto L_0x0132
        L_0x00e0:
            r11 = move-exception
            goto L_0x00ec
        L_0x00e2:
            r11 = move-exception
            goto L_0x0113
        L_0x00e4:
            r11 = move-exception
            r12 = r15
            goto L_0x00ec
        L_0x00e7:
            r11 = move-exception
            goto L_0x0121
        L_0x00e9:
            r11 = move-exception
            r12 = r15
            r13 = r15
        L_0x00ec:
            java.lang.String r3 = "BrowserLiteWebView"
            java.lang.String r1 = "Unable to capture screenshot"
            boolean r0 = X.SQO.A00     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00f7
            android.util.Log.e(r3, r1, r11)     // Catch:{ all -> 0x010b }
        L_0x00f7:
            if (r12 == 0) goto L_0x00fc
            r12.recycle()     // Catch:{ NullPointerException -> 0x0122 }
        L_0x00fc:
            if (r13 == 0) goto L_0x0133
            r13.close()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0133
        L_0x0102:
            r1 = move-exception
            boolean r0 = X.SQO.A00     // Catch:{ NullPointerException -> 0x0122 }
            if (r0 == 0) goto L_0x0133
            android.util.Log.e(r3, r8, r1)     // Catch:{ NullPointerException -> 0x0122 }
            goto L_0x0133
        L_0x010b:
            r11 = move-exception
            if (r12 == 0) goto L_0x0111
            r12.recycle()     // Catch:{ NullPointerException -> 0x0122 }
        L_0x0111:
            if (r13 == 0) goto L_0x0121
        L_0x0113:
            r13.close()     // Catch:{ IOException -> 0x0117 }
            goto L_0x0121
        L_0x0117:
            r3 = move-exception
            java.lang.String r1 = "BrowserLiteWebView"
            boolean r0 = X.SQO.A00     // Catch:{ NullPointerException -> 0x0122 }
            if (r0 == 0) goto L_0x0121
            android.util.Log.e(r1, r8, r3)     // Catch:{ NullPointerException -> 0x0122 }
        L_0x0121:
            throw r11     // Catch:{ NullPointerException -> 0x0122 }
        L_0x0122:
            r8 = move-exception
            goto L_0x0126
        L_0x0124:
            r8 = move-exception
            r9 = r15
        L_0x0126:
            java.lang.String r3 = "BrowserLiteWebView"
            java.lang.String r1 = "Unable to capture screenshot, the drawing cache may not be ready yet."
            boolean r0 = X.SQO.A00     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            android.util.Log.e(r3, r1, r8)     // Catch:{ all -> 0x0164 }
            goto L_0x0133
        L_0x0132:
            r15 = r14
        L_0x0133:
            r10.setDrawingCacheEnabled(r6)
            if (r9 == 0) goto L_0x013b
            r9.recycle()
        L_0x013b:
            if (r15 == 0) goto L_0x0147
            java.lang.String r1 = r15.getAbsolutePath()
            java.lang.String r0 = "screenshot_uri"
            r4.put(r0, r1)
        L_0x0147:
            X.Rtn r3 = new X.Rtn
            r3.<init>(r2, r5, r4)
            java.lang.String r0 = "iab_source.html"
            java.io.File r2 = r16.getFilesDir()     // Catch:{ IOException -> 0x02fe }
            java.io.File r0 = X.JTO.A0s(r2, r0)     // Catch:{ IOException -> 0x02fe }
            r0.delete()     // Catch:{ IOException -> 0x02fe }
            java.lang.String r1 = "(function(){ return document.documentElement.innerHTML; })();"
            X.Sli r0 = new X.Sli     // Catch:{ IOException -> 0x02fe }
            r0.<init>(r3, r7, r2)     // Catch:{ IOException -> 0x02fe }
            r7.A0E(r0, r1, r6)     // Catch:{ IOException -> 0x02fe }
            return
        L_0x0164:
            r0 = move-exception
            r15 = r9
            goto L_0x0168
        L_0x0167:
            r0 = move-exception
        L_0x0168:
            r10.setDrawingCacheEnabled(r6)
            if (r15 == 0) goto L_0x0170
            r15.recycle()
        L_0x0170:
            throw r0
        L_0x0171:
            boolean r0 = r7 instanceof X.QK5
            r6 = r18
            if (r0 == 0) goto L_0x0227
            android.content.Intent r4 = X.QK5.A00(r1, r3)
            if (r4 == 0) goto L_0x0215
            r9 = 0
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_ENABLE_DDV2_IAB_OPEN_EXTERNAL_BROWSER"
            boolean r0 = r4.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r4.getDataString()
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r1.B4g(r0)
            android.net.Uri r0 = X.Pxg.A0L(r0)
            r4.setData(r0)
        L_0x0197:
            java.lang.Boolean r0 = X.SQY.A01
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r3.resolveActivity(r4, r0)
            if (r0 == 0) goto L_0x0225
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 == 0) goto L_0x0225
            java.lang.String r5 = r0.packageName
        L_0x01ab:
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.String r3 = "action"
            java.lang.String r0 = "ACTION_OPEN_WITH"
            r8.put(r3, r0)
            if (r5 != 0) goto L_0x01bb
            java.lang.String r5 = "unknown"
        L_0x01bb:
            java.lang.String r0 = "destination"
            r8.put(r0, r5)
            java.lang.String r3 = "click_id"
            java.lang.String r0 = r4.getStringExtra(r3)
            if (r0 == 0) goto L_0x01cb
            X.Pxh.A14(r4, r3, r8)
        L_0x01cb:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS"
            X.Pxh.A14(r4, r0, r8)
            java.lang.String r5 = "BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID"
            boolean r3 = r4.getBooleanExtra(r5, r9)
            r0 = 1
            if (r3 != r0) goto L_0x01de
            java.lang.String r0 = "YES"
            r8.put(r5, r0)
        L_0x01de:
            X.SRY.A01(r2, r8)
            java.lang.String r3 = r7.A03
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r3.toLowerCase(r0)
            java.lang.String r3 = " "
            java.lang.String r0 = "_"
            java.lang.String r9 = r5.replaceAll(r3, r0)
            com.facebook.browser.lite.BrowserLiteFragment r1 = (com.facebook.browser.lite.BrowserLiteFragment) r1
            X.A9z r5 = r1.A0d
            if (r5 == 0) goto L_0x020a
            X.SRY r3 = X.SRY.A00()
            java.lang.String r10 = r4.getDataString()
            boolean r0 = r5.A0p
            if (r0 != 0) goto L_0x0216
            com.facebook.iabeventlogging.model.IABEmptyEvent r7 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x0205:
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r1.A0e
            r3.A06(r2, r7, r0)
        L_0x020a:
            X.0b6 r0 = X.0b6.A00()
            X.0RA r0 = r0.A03()
            r0.A0G(r6, r4)
        L_0x0215:
            return
        L_0x0216:
            X.0JP r0 = r5.A0m
            long r11 = r0.now()
            java.lang.String r8 = r5.A0Z
            com.facebook.iabeventlogging.model.IABOpenExternalEvent r7 = new com.facebook.iabeventlogging.model.IABOpenExternalEvent
            r13 = r11
            r7.<init>(r8, r9, r10, r11, r13)
            goto L_0x0205
        L_0x0225:
            r5 = 0
            goto L_0x01ab
        L_0x0227:
            boolean r0 = r7 instanceof X.QK2
            if (r0 == 0) goto L_0x0271
            if (r20 == 0) goto L_0x02fe
            android.content.Intent r0 = r1.getIntent()
            if (r0 == 0) goto L_0x02fe
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r0 = "extra_app_intent"
            android.os.Parcelable r5 = r1.getParcelableExtra(r0)
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 == 0) goto L_0x02fe
            java.lang.Boolean r0 = X.SQY.A01
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r5, r0)
            if (r0 == 0) goto L_0x026f
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 == 0) goto L_0x026f
            java.lang.String r4 = r0.packageName
        L_0x0255:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "action"
            java.lang.String r0 = "ACTION_LAUNCH_APP"
            r3.put(r1, r0)
            if (r4 != 0) goto L_0x0265
            java.lang.String r4 = "unknown"
        L_0x0265:
            java.lang.String r0 = "destination"
            r3.put(r0, r4)
            X.SRY.A01(r2, r3)
            goto L_0x02f2
        L_0x026f:
            r4 = 0
            goto L_0x0255
        L_0x0271:
            boolean r0 = r7 instanceof X.QK4
            if (r0 == 0) goto L_0x029d
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "action"
            java.lang.String r0 = "ACTION_GO_FORWARD"
            r4.put(r1, r0)
            X.SRY.A01(r2, r4)
            if (r21 == 0) goto L_0x0215
            com.facebook.browser.lite.BrowserLiteFragment r3 = (com.facebook.browser.lite.BrowserLiteFragment) r3
            X.QLA r2 = r3.C8U()
            if (r2 == 0) goto L_0x0215
            boolean r0 = r3.A10
            if (r0 == 0) goto L_0x02ff
            int r1 = com.facebook.browser.lite.BrowserLiteFragment.A04(r3)
            com.facebook.browser.lite.webview.SystemWebView r2 = (com.facebook.browser.lite.webview.SystemWebView) r2
            X.QcV r0 = r2.A04
            r0.goBackOrForward(r1)
            return
        L_0x029d:
            boolean r0 = r7 instanceof X.QK1
            if (r0 == 0) goto L_0x02bd
            boolean r0 = X.S2G.A04
            if (r0 == 0) goto L_0x0215
            X.S2G r1 = X.S2G.A03
            if (r1 != 0) goto L_0x02b0
            X.S2G r1 = new X.S2G
            r1.<init>()
            X.S2G.A03 = r1
        L_0x02b0:
            java.util.LinkedList r0 = r1.A02
            r0.clear()
            android.widget.TextView r1 = r1.A00
            java.lang.String r0 = ""
            r1.setText(r0)
            return
        L_0x02bd:
            boolean r0 = r7 instanceof X.QK0
            if (r0 == 0) goto L_0x02d9
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "action"
            java.lang.String r0 = "bwp_more_options_menu_action"
            r3.put(r1, r0)
            java.lang.String r1 = "should_hide_report_website"
            java.lang.String r0 = "true"
            r3.put(r1, r0)
            X.SRY.A01(r2, r3)
            return
        L_0x02d9:
            boolean r4 = r7 instanceof X.QJz
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            if (r4 == 0) goto L_0x0307
            java.lang.String r4 = "action"
            java.lang.String r3 = "ACTION_GO_BACK"
            r0.put(r4, r3)
            X.SRY.A01(r2, r0)
            if (r20 == 0) goto L_0x0215
            r0 = 0
            r1.DIV(r0)
            return
        L_0x02f2:
            java.lang.String r0 = X.RQ7.A00     // Catch:{  }
            X.SQY.A01(r5, r0)     // Catch:{  }
            X.AnonymousClass0b5.A01(r6, r5)     // Catch:{  }
            return
        L_0x02fb:
            X.SRY.A01(r2, r4)
        L_0x02fe:
            return
        L_0x02ff:
            com.facebook.browser.lite.webview.SystemWebView r2 = (com.facebook.browser.lite.webview.SystemWebView) r2
            X.QcV r0 = r2.A04
            r0.goForward()
            return
        L_0x0307:
            java.lang.String r9 = r7.A02
            java.lang.String r4 = "action"
            r0.put(r4, r9)
            X.QLA r7 = r3.C8U()
            if (r7 == 0) goto L_0x0467
            int r4 = r9.hashCode()
            switch(r4) {
                case -1757774683: goto L_0x0449;
                case 26614404: goto L_0x044c;
                case 1796890997: goto L_0x044f;
                default: goto L_0x031b;
            }
        L_0x031b:
            java.lang.String r15 = r7.A05()
        L_0x031f:
            X.SPF r4 = X.SPF.A06
            if (r4 == 0) goto L_0x0333
            if (r15 == 0) goto L_0x0333
            X.JwK r5 = r4.A00
            boolean r4 = r5.A01
            if (r4 == 0) goto L_0x0333
            java.lang.Object r4 = r5.A00
            X.RtI r4 = (X.C10503RtI) r4
            java.lang.String r15 = X.C9229RUg.A00(r4, r15)
        L_0x0333:
            java.lang.String r4 = "url"
            r0.put(r4, r15)
        L_0x0339:
            r5 = r1
            com.facebook.browser.lite.BrowserLiteFragment r5 = (com.facebook.browser.lite.BrowserLiteFragment) r5
            X.A9z r4 = r5.A0d
            android.content.Intent r1 = r1.getIntent()
            if (r4 == 0) goto L_0x0445
            if (r1 == 0) goto L_0x0353
            int r8 = r9.hashCode()
            r7 = 0
            switch(r8) {
                case -2063737858: goto L_0x041e;
                case -2060589887: goto L_0x041b;
                case -1554255665: goto L_0x03ec;
                case -1526215918: goto L_0x03d7;
                case -938231181: goto L_0x03d4;
                case 26614404: goto L_0x0381;
                case 1803427515: goto L_0x0357;
                default: goto L_0x034e;
            }
        L_0x034e:
            java.lang.String r3 = "BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"
            X.Pxh.A14(r1, r3, r0)
        L_0x0353:
            X.SRY.A01(r2, r0)
            return
        L_0x0357:
            java.lang.String r3 = "REFRESH"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x034e
            X.SRY r3 = X.SRY.A00()
            r6 = 870(0x366, float:1.219E-42)
            java.lang.String r12 = X.C273654mx.A00(r6)
            boolean r6 = r4.A0p
            if (r6 != 0) goto L_0x0371
            com.facebook.iabeventlogging.model.IABEmptyEvent r6 = com.facebook.iabeventlogging.model.IABEvent.A04
            goto L_0x043e
        L_0x0371:
            X.0JP r6 = r4.A0m
            long r7 = r6.now()
            java.lang.String r9 = r4.A0Z
            com.facebook.iabeventlogging.model.IABRefreshEvent r6 = new com.facebook.iabeventlogging.model.IABRefreshEvent
            r10 = r7
            r6.<init>(r7, r9, r10, r12)
            goto L_0x043e
        L_0x0381:
            java.lang.String r6 = "COPY_LINK"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x034e
            X.SRY r8 = X.SRY.A00()
            boolean r6 = r4.A0p
            if (r6 != 0) goto L_0x03c5
            com.facebook.iabeventlogging.model.IABEmptyEvent r9 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x0393:
            com.facebook.privacy.zone.policy.ZonePolicy r4 = r5.A0e
            r8.A06(r2, r9, r4)
            java.lang.String r4 = "BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS"
            X.Pxh.A14(r1, r4, r0)
            java.lang.String r4 = "BrowserLiteIntent.EXTRA_IAB_CLICKID"
            java.lang.String r5 = r1.getStringExtra(r4)
            if (r5 == 0) goto L_0x03aa
            java.lang.String r4 = "click_id"
            r0.put(r4, r5)
        L_0x03aa:
            java.lang.String r5 = "BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID"
            boolean r4 = r1.getBooleanExtra(r5, r7)
            if (r4 == 0) goto L_0x03b7
            java.lang.String r4 = "YES"
            r0.put(r5, r4)
        L_0x03b7:
            boolean r3 = r3.CVN()
            if (r3 != 0) goto L_0x034e
            java.lang.String r4 = "BrowserLiteIntent.InstagramExtras.EXTRA_PAGE_TYPE"
            java.lang.String r3 = "BrowserLiteIntent.InstagramExtras.EXTRA_FOLLOWING_PAGE"
            r0.put(r4, r3)
            goto L_0x034e
        L_0x03c5:
            X.0JP r6 = r4.A0m
            long r10 = r6.now()
            java.lang.String r12 = r4.A0Z
            com.facebook.iabeventlogging.model.IABCopyLinkEvent r9 = new com.facebook.iabeventlogging.model.IABCopyLinkEvent
            r13 = r10
            r9.<init>(r10, r12, r13, r15)
            goto L_0x0393
        L_0x03d4:
            java.lang.String r3 = "SHARE_MESSENGER"
            goto L_0x0420
        L_0x03d7:
            java.lang.String r3 = "ACTION_PRIVACY_POLICY"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x034e
            if (r18 == 0) goto L_0x034e
            java.lang.String r3 = "https://www.facebook.com/privacy/policy/"
            android.content.Intent r3 = X.DbX.A09(r3)
            X.AnonymousClass0b5.A03(r6, r3)
            goto L_0x034e
        L_0x03ec:
            java.lang.String r3 = "OPEN_BROWSER_SETTINGS"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x034e
            com.facebook.browser.lite.views.BrowserLiteWrapperView r3 = r5.A0c
            if (r3 == 0) goto L_0x034e
            X.AH7 r4 = X.AH7.A01()
            java.lang.Class<X.QKv> r3 = X.C7580QKv.class
            java.util.ArrayList r3 = r4.A02(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x0406:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x034e
            java.lang.Object r4 = r5.next()
            X.QKv r4 = (X.C7580QKv) r4
            X.TBI r3 = new X.TBI
            r3.<init>(r4)
            X.SB5.A00(r3)
            goto L_0x0406
        L_0x041b:
            java.lang.String r3 = "SHARE_TIMELINE"
            goto L_0x0420
        L_0x041e:
            java.lang.String r3 = "SHARE_LINK_IN_MESSENGER"
        L_0x0420:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x034e
            X.SRY r3 = X.SRY.A00()
            X.0JP r6 = r4.A0m
            long r10 = r6.now()
            java.lang.String r7 = r4.A0Z
            com.facebook.privacy.zone.api.ZonedValue r4 = r4.A0Q
            java.lang.Object r8 = r4.A01
            java.lang.String r8 = (java.lang.String) r8
            com.facebook.iabeventlogging.model.IABShareEvent r6 = new com.facebook.iabeventlogging.model.IABShareEvent
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r12)
        L_0x043e:
            com.facebook.privacy.zone.policy.ZonePolicy r4 = r5.A0e
            r3.A06(r2, r6, r4)
            goto L_0x034e
        L_0x0445:
            if (r1 == 0) goto L_0x0353
            goto L_0x034e
        L_0x0449:
            java.lang.String r4 = "ACTION_SHARE_VIA"
            goto L_0x0451
        L_0x044c:
            java.lang.String r4 = "COPY_LINK"
            goto L_0x0451
        L_0x044f:
            java.lang.String r4 = "ACTION_SEND_IN_DIRECT"
        L_0x0451:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x031b
            X.SPF r5 = X.SPF.A06
            if (r5 == 0) goto L_0x031b
            boolean r4 = r5.A02()
            if (r4 == 0) goto L_0x031b
            X.QP8 r4 = r5.A01
            java.lang.String r15 = r4.A02
            goto L_0x031f
        L_0x0467:
            r15 = 0
            goto L_0x0339
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11347SOg.A03(android.content.Context, android.os.Bundle, X.7ka, X.7kb):void");
    }

    public final void A04(C11347SOg sOg) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            arrayList = AnonymousClass7TE.A1C();
            this.A04 = arrayList;
        }
        arrayList.add(sOg);
    }

    public C11347SOg(String str) {
        this.A02 = str;
    }

    public C11347SOg() {
    }
}
