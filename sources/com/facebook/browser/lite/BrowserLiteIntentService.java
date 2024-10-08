package com.facebook.browser.lite;

import X.AnonymousClass0fD;
import X.C62810vf;
import android.content.Intent;

public class BrowserLiteIntentService extends C62810vf {
    /* JADX WARNING: type inference failed for: r0v46, types: [X.QcV, android.view.View] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|(2:39|(2:111|112)(1:131))(2:113|(1:133))|117|118|119) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x0234 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.content.Intent r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0238
            java.util.regex.Pattern r0 = X.SCX.A01
            r6 = 1
            r5 = 0
            r2 = 0
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x0015 }
            android.content.ComponentName r0 = r11.getComponent()     // Catch:{ Exception -> 0x0015 }
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r0, r5)     // Catch:{ Exception -> 0x0015 }
            java.lang.String r2 = r0.processName     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            java.lang.Boolean r0 = X.SQY.A01
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = ":browser"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x0023
            X.AnonymousClass2DC.A00 = r6
        L_0x0023:
            X.RQ7.A01 = r6
            java.lang.String r3 = "EXTRA_ACTION"
            java.lang.String r4 = r11.getStringExtra(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0238
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LOGCAT"
            boolean r0 = r11.getBooleanExtra(r0, r5)
            X.SQO.A00 = r0
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String r1 = "Service got action request: %s"
            if (r0 == 0) goto L_0x0045
            r0 = 0
            java.lang.String.format(r0, r1, r2)
        L_0x0045:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1896793051: goto L_0x0052;
                case 270752123: goto L_0x005e;
                case 1206811370: goto L_0x0075;
                case 1258331532: goto L_0x00ac;
                default: goto L_0x004c;
            }
        L_0x004c:
            X.ACt r2 = X.C39872ACt.A00()
            monitor-enter(r2)
            goto L_0x00c8
        L_0x0052:
            java.lang.String r0 = "ACTION_CLEAR_DATA"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004c
            X.SCX.A00(r10)
            return
        L_0x005e:
            java.lang.String r0 = "ACTION_EXTRACT_HTML_RESOURCE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_PREFETCH_INFO"
            android.os.Parcelable r2 = r11.getParcelableExtra(r0)
            com.facebook.browser.lite.ipc.PrefetchCacheEntry r2 = (com.facebook.browser.lite.ipc.PrefetchCacheEntry) r2
            if (r2 == 0) goto L_0x0238
            java.lang.Class<X.S3N> r1 = X.S3N.class
            monitor-enter(r1)
            goto L_0x020b
        L_0x0075:
            java.lang.String r0 = "ACTION_INJECT_COOKIES"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_COOKIES"
            java.io.Serializable r3 = r11.getSerializableExtra(r0)
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            if (r3 == 0) goto L_0x0238
            java.lang.String r0 = "EXTRA_FLUSH_COOKIES"
            boolean r2 = r11.getBooleanExtra(r0, r6)
            int r0 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Inject cookies for %d urls, flush %s"
            X.SQO.A03(r0, r1)
            r1 = 0
            X.TJZ r0 = new X.TJZ
            r0.<init>(r10, r1, r3, r2)
            X.SB5.A00(r0)
            return
        L_0x00ac:
            java.lang.String r0 = "ACTION_WARM_UP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "ACTION_WARM_UP_WEBVIEW"
            boolean r0 = r11.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x0222
            android.content.Context r1 = r10.getApplicationContext()
            boolean r0 = X.S8C.A01(r1)
            if (r0 == 0) goto L_0x0238
            goto L_0x021e
        L_0x00c8:
            java.util.LinkedList r1 = r2.A00     // Catch:{ all -> 0x0208 }
            int r0 = r1.size()     // Catch:{ all -> 0x0208 }
            if (r0 <= 0) goto L_0x0206
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x0208 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0208 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0208 }
            X.7ka r4 = (X.C340027ka) r4     // Catch:{ all -> 0x0208 }
            if (r4 == 0) goto L_0x0206
            com.facebook.browser.lite.BrowserLiteFragment r4 = (com.facebook.browser.lite.BrowserLiteFragment) r4     // Catch:{ all -> 0x0208 }
            java.lang.String r1 = r11.getStringExtra(r3)     // Catch:{ all -> 0x0208 }
            if (r1 == 0) goto L_0x0206
            java.util.List r0 = r4.A0n     // Catch:{ all -> 0x0208 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0208 }
        L_0x00ec:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0208 }
            X.B3J r0 = (X.B3J) r0     // Catch:{ all -> 0x0208 }
            boolean r0 = r0.DIZ(r11, r1)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x00ec
            goto L_0x0206
        L_0x0100:
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0208 }
            switch(r0) {
                case -2116976163: goto L_0x0109;
                case -2074076840: goto L_0x0132;
                case -460868349: goto L_0x0139;
                case 1305823940: goto L_0x0154;
                case 1505276866: goto L_0x0174;
                case 1544542948: goto L_0x0182;
                case 1776594544: goto L_0x0193;
                default: goto L_0x0107;
            }     // Catch:{ all -> 0x0208 }
        L_0x0107:
            goto L_0x0206
        L_0x0109:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IAB_CLICKID_RECEIVED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            java.lang.String r3 = "BrowserLiteIntent.EXTRA_IAB_CLICKID"
            java.lang.String r1 = r11.getStringExtra(r3)     // Catch:{ all -> 0x0208 }
            android.content.Intent r0 = r4.A06     // Catch:{ all -> 0x0208 }
            r0.putExtra(r3, r1)     // Catch:{ all -> 0x0208 }
            android.content.Intent r3 = r4.A06     // Catch:{ all -> 0x0208 }
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS"
            java.lang.String r0 = "YES"
            r3.putExtra(r1, r0)     // Catch:{ all -> 0x0208 }
            android.content.Intent r3 = r4.A06     // Catch:{ all -> 0x0208 }
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID"
            boolean r0 = r11.getBooleanExtra(r1, r5)     // Catch:{ all -> 0x0208 }
            r3.putExtra(r1, r0)     // Catch:{ all -> 0x0208 }
            goto L_0x0206
        L_0x0132:
            java.lang.String r0 = "ACTION_CLOSE_BROWSER"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            goto L_0x014c
        L_0x0139:
            java.lang.String r0 = "NOTIFY_ON_BROWSER_TAB_MENU_CLOSE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            java.lang.String r0 = "EXTRA_BROWSER_TAB_MENU_TAB_COUNT"
            r11.getIntExtra(r0, r5)     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "EXTRA_BROWSER_TAB_MENU_CLOSE_ON_BACK"
            boolean r0 = r11.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x0208 }
        L_0x014c:
            if (r0 == 0) goto L_0x0206
            X.TBA r0 = new X.TBA     // Catch:{ all -> 0x0208 }
            r0.<init>(r4)     // Catch:{ all -> 0x0208 }
            goto L_0x018f
        L_0x0154:
            java.lang.String r0 = "ACTION_IAB_AUTOFILL_OPTOUT_FETCHED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            java.lang.String r3 = "BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY"
            java.lang.String r1 = r11.getStringExtra(r3)     // Catch:{ all -> 0x0208 }
            android.content.Intent r0 = r4.A06     // Catch:{ all -> 0x0208 }
            r0.putExtra(r3, r1)     // Catch:{ all -> 0x0208 }
            java.lang.String r3 = "BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY"
            boolean r1 = r11.getBooleanExtra(r3, r6)     // Catch:{ all -> 0x0208 }
            android.content.Intent r0 = r4.A06     // Catch:{ all -> 0x0208 }
            r0.putExtra(r3, r1)     // Catch:{ all -> 0x0208 }
            goto L_0x0206
        L_0x0174:
            java.lang.String r0 = "ACTION_REFRESH_TOP_WEBVIEW"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            X.TB9 r0 = new X.TB9     // Catch:{ all -> 0x0208 }
            r0.<init>(r4)     // Catch:{ all -> 0x0208 }
            goto L_0x018f
        L_0x0182:
            java.lang.String r0 = "ACTION_CREATE_SITE_INTEGRITY_REPORT"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            X.TB8 r0 = new X.TB8     // Catch:{ all -> 0x0208 }
            r0.<init>(r4)     // Catch:{ all -> 0x0208 }
        L_0x018f:
            X.SB5.A00(r0)     // Catch:{ all -> 0x0208 }
            goto L_0x0206
        L_0x0193:
            java.lang.String r0 = "ACTION_COMPLETE_WEB_SHARE_DIALOG"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x0206
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_WEB_SHARE_COMPLETION_MESSAGE"
            java.lang.String r8 = r11.getStringExtra(r0)     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_REFERER"
            java.lang.String r5 = r11.getStringExtra(r0)     // Catch:{ all -> 0x0208 }
            X.QLA r3 = r4.C8U()     // Catch:{ all -> 0x0208 }
            if (r3 == 0) goto L_0x0206
            if (r5 == 0) goto L_0x0206
            if (r8 == 0) goto L_0x0206
            java.lang.String r7 = "  (function dispatchEvent(eventName, data){    var event = document.createEvent('Event');    event.initEvent(eventName,true,true);    event.data = data;    document.dispatchEvent(event);  })('message', '"
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0208 }
            r6 = 0
        L_0x01b8:
            int r0 = r8.length()     // Catch:{ all -> 0x0208 }
            if (r6 >= r0) goto L_0x01f0
            char r1 = r8.charAt(r6)     // Catch:{ all -> 0x0208 }
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01cc
            r9.append(r1)     // Catch:{ all -> 0x0208 }
            goto L_0x01ed
        L_0x01cc:
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x01d1
            goto L_0x01dc
        L_0x01d1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0208 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "\\u%04X"
            goto L_0x01e6
        L_0x01dc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0208 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "\\x%02X"
        L_0x01e6:
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0208 }
            r9.append(r0)     // Catch:{ all -> 0x0208 }
        L_0x01ed:
            int r6 = r6 + 1
            goto L_0x01b8
        L_0x01f0:
            java.lang.String r1 = r9.toString()     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "');"
            java.lang.String r0 = X.002.A0g(r7, r1, r0)     // Catch:{ all -> 0x0208 }
            X.TJY r1 = new X.TJY     // Catch:{ all -> 0x0208 }
            r1.<init>(r4, r3, r5, r0)     // Catch:{ all -> 0x0208 }
            com.facebook.browser.lite.webview.SystemWebView r3 = (com.facebook.browser.lite.webview.SystemWebView) r3     // Catch:{ all -> 0x0208 }
            X.QcV r0 = r3.A04     // Catch:{ all -> 0x0208 }
            r0.post(r1)     // Catch:{ all -> 0x0208 }
        L_0x0206:
            monitor-exit(r2)
            return
        L_0x0208:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x020b:
            X.S3N r0 = X.S3N.A09     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0216
            X.S3N r0 = new X.S3N     // Catch:{ all -> 0x021b }
            r0.<init>(r10)     // Catch:{ all -> 0x021b }
            X.S3N.A09 = r0     // Catch:{ all -> 0x021b }
        L_0x0216:
            monitor-exit(r1)
            r0.A00(r2)
            return
        L_0x021b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x021e:
            android.webkit.WebSettings.getDefaultUserAgent(r1)     // Catch:{ Exception -> 0x0234 }
            goto L_0x0234
        L_0x0222:
            java.lang.String r0 = "ACTION_WARM_UP_FACTORY_PROVIDER"
            boolean r0 = r11.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x0238
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = X.S8C.A01(r0)
            if (r0 == 0) goto L_0x0238
        L_0x0234:
            X.RUF.A00()     // Catch:{ Exception -> 0x0238 }
            return
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteIntentService.A00(android.content.Intent):void");
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(1294123826);
        BrowserLiteIntentService.super.onCreate();
        AnonymousClass0fD.A0B(695558224, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(271823284);
        BrowserLiteIntentService.super.onStartCommand(intent, i, i2);
        if (intent != null && intent.getBooleanExtra("EXTRA_START_AS_SERVICE", false)) {
            A00(intent);
        }
        AnonymousClass0fD.A0B(1991039513, A04);
        return 3;
    }

    public final void onHandleWork(Intent intent) {
        A00(intent);
    }
}
