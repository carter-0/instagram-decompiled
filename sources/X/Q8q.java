package X;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.Html;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.android.R;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;

public final class Q8q extends WebChromeClient {
    public BrowserLiteWebChromeClient A00;

    public final Bitmap getDefaultVideoPoster() {
        return null;
    }

    public final View getVideoLoadingProgressView() {
        return null;
    }

    public final void getVisitedHistory(ValueCallback valueCallback) {
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof C13416TZw) {
            BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
            SystemWebView A002 = C7903QcV.A00(webView);
            BrowserLiteFragment browserLiteFragment = browserLiteWebChromeClient.A0A;
            if (browserLiteFragment.C8U() == A002) {
                BrowserLiteFragment.A0D(browserLiteFragment);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.QcV, android.webkit.WebView] */
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!(webView instanceof C13416TZw)) {
            return false;
        }
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        QLA A002 = C7903QcV.A00(webView);
        BrowserLiteFragment browserLiteFragment = browserLiteWebChromeClient.A0A;
        if (browserLiteFragment.C8U() != A002 || !z2) {
            return false;
        }
        A9z a9z = browserLiteFragment.A0d;
        if (a9z.A0p) {
            a9z.A0T = true;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(((SystemWebView) browserLiteFragment.A0R()).A04);
        message.sendToTarget();
        return true;
    }

    public final void onGeolocationPermissionsHidePrompt() {
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String str2;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        FragmentActivity activity = browserLiteWebChromeClient.A0A.getActivity();
        if (activity == null || browserLiteWebChromeClient.A03 == null) {
            callback.invoke(str, false, false);
            return;
        }
        try {
            str2 = new URI(str).getHost();
        } catch (Exception unused) {
            str2 = str;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        String string = activity.getString(R.string.f0nameremoved, Arrays.copyOf(new Object[]{str2}, 1));
        0qQ.A07(string);
        builder.setMessage(string).setPositiveButton(AnonymousClass7TE.A16(activity, R.string.f0nameremoved), new SV5(browserLiteWebChromeClient, callback, str, 1)).setNegativeButton(AnonymousClass7TE.A16(activity, R.string.f0nameremoved), new SV5(browserLiteWebChromeClient, callback, str, 0)).setOnCancelListener(new LU0(callback, browserLiteWebChromeClient, str, 0)).show();
    }

    public final void onHideCustomView() {
        try {
            BrowserLiteWebChromeClient.A01(this.A00);
        } catch (Throwable unused) {
        }
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!(webView instanceof C13416TZw)) {
            return false;
        }
        Iterator it = this.A00.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return false;
    }

    public final boolean onJsTimeout() {
        return true;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources;
        String str;
        Object[] objArr;
        String str2;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        if (permissionRequest != null && (resources = permissionRequest.getResources()) != null && resources.length == 1) {
            String str3 = resources[0];
            if ("android.webkit.resource.VIDEO_CAPTURE".equals(str3)) {
                FragmentActivity activity = browserLiteWebChromeClient.A0A.getActivity();
                if (activity != null) {
                    if (02K.A00(activity, "android.permission.CAMERA") != 0) {
                        str = "BrowserLiteWebChromeClient";
                        objArr = new Object[0];
                        str2 = "Does not have camera permission";
                    } else if (activity.getPackageManager() == null || !activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                        str = "BrowserLiteWebChromeClient";
                        objArr = new Object[0];
                        str2 = "Does not have camera";
                    } else {
                        browserLiteWebChromeClient.A0G = true;
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        String string = activity.getString(R.string.f0nameremoved, Arrays.copyOf(new Object[]{permissionRequest.getOrigin().getHost()}, 1));
                        0qQ.A07(string);
                        browserLiteWebChromeClient.A01 = builder.setMessage(string).setPositiveButton(AnonymousClass7TE.A16(activity, R.string.f0nameremoved), new SV4(1, activity, permissionRequest, browserLiteWebChromeClient)).setNegativeButton(AnonymousClass7TE.A16(activity, R.string.f0nameremoved), new SV4(0, activity, permissionRequest, browserLiteWebChromeClient)).setOnCancelListener(new FHY(2, activity, permissionRequest, browserLiteWebChromeClient)).show();
                        return;
                    }
                    SQO.A01(str, str2, objArr);
                }
            } else if ("android.webkit.resource.PROTECTED_MEDIA_ID".equals(str3)) {
                permissionRequest.grant(resources);
            }
        }
    }

    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        browserLiteWebChromeClient.A0G = false;
        AlertDialog alertDialog = browserLiteWebChromeClient.A01;
        if (alertDialog != null && alertDialog.isShowing()) {
            browserLiteWebChromeClient.A01.dismiss();
            browserLiteWebChromeClient.A01 = null;
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (webView instanceof C13416TZw) {
            this.A00.A07(C7903QcV.A00(webView), i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QcV, android.view.View] */
    public final void onReceivedTitle(WebView webView, String str) {
        String str2;
        if (webView instanceof C13416TZw) {
            BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
            SystemWebView A002 = C7903QcV.A00(webView);
            if (str == null || ReactWebViewManager.BLANK_URL.equals(str)) {
                str2 = null;
            } else {
                str2 = Html.fromHtml(str).toString();
            }
            if (A002.A04.getVisibility() == 0) {
                browserLiteWebChromeClient.A0A.A0c(str2);
            }
        }
    }

    public final void onRequestFocus(WebView webView) {
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        String str;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = this.A00;
        try {
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = browserLiteWebChromeClient.A08;
                frameLayout.addView(view);
                frameLayout.setVisibility(0);
                C66581MXm.A0A(browserLiteWebChromeClient.A0A.requireActivity()).setSystemUiVisibility(4);
                browserLiteWebChromeClient.A07 = customViewCallback;
                View focusedChild = ((FrameLayout) view).getFocusedChild();
                if (focusedChild instanceof VideoView) {
                    VideoView videoView = (VideoView) focusedChild;
                    browserLiteWebChromeClient.A09 = videoView;
                    videoView.setOnCompletionListener(browserLiteWebChromeClient);
                    browserLiteWebChromeClient.A09.setOnErrorListener(browserLiteWebChromeClient);
                }
                for (C13921TlP tlP : browserLiteWebChromeClient.A0F) {
                    C11364SPc sPc = (C11364SPc) tlP;
                    if (sPc instanceof C7584QKz) {
                        Context context = sPc.A00;
                        if (context != null) {
                            str = context.getString(R.string.f0nameremoved);
                        } else {
                            str = null;
                        }
                        C59689JTv.A03(context, str, (String) null, 1);
                    }
                }
            }
        } catch (Throwable th) {
            SQO.A00("BrowserLiteWebChromeClient", "Failed enter fullscreen %s", th, Pxf.A1Z(th));
        }
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!(webView instanceof C13416TZw)) {
            return false;
        }
        return this.A00.onShowFileChooser(C7903QcV.A00(webView), valueCallback, fileChooserParams);
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
    }

    public final void onConsoleMessage(String str, int i, String str2) {
    }

    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019f, code lost:
        if (r3.equals(r0) != false) goto L_0x01a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage r13) {
        /*
            r12 = this;
            com.facebook.browser.lite.BrowserLiteWebChromeClient r5 = r12.A00
            java.lang.String r2 = r13.message()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            if (r0 != 0) goto L_0x020c
            int[] r1 = X.C9914RjT.A00
            android.webkit.ConsoleMessage$MessageLevel r0 = r13.messageLevel()
            int r0 = X.Pxe.A08(r0, r1)
            if (r0 != r4) goto L_0x0075
            X.QLA r0 = r5.A0E
            X.Rvy r1 = r0.A0H
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "FBNavResponseStart:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0085
            X.QLA r9 = r1.A01
            r0 = 19
            java.lang.String r0 = r2.substring(r0)
            long r2 = X.C10664Rvy.A00(r0)
            boolean r0 = r9.A0H()
            if (r0 != 0) goto L_0x0075
            long r0 = r9.A08
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0075
            r10 = -1
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0075
            r9.A08 = r2
            long r6 = r9.A06
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            java.lang.String r8 = "BrowserLiteWebView"
            long r0 = r2 - r6
            java.lang.Object[] r1 = X.Pxf.A1W(r0)
            java.lang.String r0 = "onResponseStart: %d ms"
            X.SQO.A01(r8, r0, r1)
            X.Rx5 r1 = r9.A0D
            if (r1 == 0) goto L_0x0075
            long r6 = r1.A01
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0075
            r1.A01 = r2
            com.facebook.browser.lite.BrowserLiteFragment r0 = r1.A03
            X.A9z r1 = r0.A0d
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x0075
            r1.A0G = r2
        L_0x0075:
            java.util.List r0 = r5.A0F
            java.util.Iterator r1 = r0.iterator()
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020c
            r1.next()
            goto L_0x007b
        L_0x0085:
            java.lang.String r0 = "FBNavResponseEnd:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x009d
            X.QLA r3 = r1.A01
            r0 = 17
            java.lang.String r0 = r2.substring(r0)
            long r0 = X.C10664Rvy.A00(r0)
            r3.A0B(r0)
            goto L_0x0075
        L_0x009d:
            java.lang.String r0 = "FBNavDomContentLoaded:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x00b5
            X.QLA r3 = r1.A01
            r0 = 22
            java.lang.String r0 = r2.substring(r0)
            long r0 = X.C10664Rvy.A00(r0)
            r3.A09(r0)
            goto L_0x0075
        L_0x00b5:
            java.lang.String r0 = "FBNavLoadEventEnd:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x00cd
            X.QLA r3 = r1.A01
            r0 = 18
            java.lang.String r0 = r2.substring(r0)
            long r0 = X.C10664Rvy.A00(r0)
            r3.A0A(r0)
            goto L_0x0075
        L_0x00cd:
            java.lang.String r0 = "FBNavAmpDetect:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x00fc
            X.QLA r6 = r1.A01
            r0 = 15
            java.lang.String r0 = r2.substring(r0)
            boolean r3 = java.lang.Boolean.parseBoolean(r0)
            boolean r0 = r6.A0H()
            if (r0 != 0) goto L_0x0075
            boolean r0 = r6.A0X
            if (r0 != 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00f8
            java.lang.String r2 = "BrowserLiteWebView"
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "AMP powered page detected!"
            X.SQO.A01(r2, r0, r1)
        L_0x00f8:
            r6.A0X = r3
            goto L_0x0075
        L_0x00fc:
            java.lang.String r0 = "FBNavFirstContentfulPaint:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x016e
            X.QLA r3 = r1.A01
            r0 = 26
            java.lang.String r0 = r2.substring(r0)
            long r0 = X.C10664Rvy.A00(r0)
            boolean r2 = r3.A0T
            if (r2 != 0) goto L_0x0075
            X.Rx5 r10 = r3.A0D
            if (r10 == 0) goto L_0x0075
            long r6 = r10.A00
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0158
            r10.A00 = r0
            X.SSR r2 = X.SSR.A00()
            java.lang.String r6 = "BLWV.onFirstContentfulPaint"
            r2.A05(r6, r0)
            com.facebook.browser.lite.BrowserLiteFragment r2 = r10.A03
            com.facebook.browser.lite.BrowserLiteFragment.A0H(r2, r6)
            X.A9z r7 = r2.A0d
            boolean r6 = r7.A0p
            if (r6 == 0) goto L_0x0138
            r7.A0D = r0
        L_0x0138:
            X.A4g r0 = r2.A0P
            com.instagram.common.session.UserSession r7 = r0.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36313579124295833(0x810302003a0899, double:3.0281918890265845E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0158
            X.A9z r1 = r2.A0d
            boolean r0 = r1.A0p
            if (r0 != 0) goto L_0x015c
            com.facebook.iabeventlogging.model.IABEmptyEvent r6 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x0151:
            android.os.Bundle r1 = r2.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r2.A0e
            r2.CjX(r1, r6, r0)
        L_0x0158:
            r3.A0T = r4
            goto L_0x0075
        L_0x015c:
            android.os.Parcelable$Creator r0 = com.facebook.iabeventlogging.model.IABEvent.CREATOR
            java.lang.String r7 = r1.A0Z
            long r8 = r1.A0D
            X.0JP r0 = r1.A0m
            long r10 = r0.now()
            com.facebook.iabeventlogging.model.IABFirstContentfulPaintEvent r6 = new com.facebook.iabeventlogging.model.IABFirstContentfulPaintEvent
            r6.<init>(r7, r8, r10)
            goto L_0x0151
        L_0x016e:
            java.lang.String r0 = "FBNavLargestContentfulPaint:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x01e2
            X.QLA r6 = r1.A01
            r0 = 28
            java.lang.String r0 = r2.substring(r0)
            long r1 = X.C10664Rvy.A00(r0)
            X.Rx5 r9 = r6.A0D
            if (r9 == 0) goto L_0x0075
            java.lang.String r0 = r6.A05()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r3 = r6.A05()
            java.lang.String r0 = r6.A0L
            if (r0 != 0) goto L_0x019b
            r0 = 0
            java.lang.String r0 = r6.A07(r0)
            r6.A0L = r0
        L_0x019b:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01c2
        L_0x01a1:
            com.facebook.browser.lite.BrowserLiteFragment r8 = r9.A03
            X.A9z r3 = r8.A0d
            boolean r0 = r3.A0p
            if (r0 == 0) goto L_0x01ab
            r3.A0E = r1
        L_0x01ab:
            X.SSR r7 = X.SSR.A00()
            java.lang.String r6 = "BLWV.onLargestContentfulPaint"
            java.util.Set r3 = r7.A05
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L_0x01bc
            r3.remove(r6)
        L_0x01bc:
            r7.A05(r6, r1)
            com.facebook.browser.lite.BrowserLiteFragment.A0H(r8, r6)
        L_0x01c2:
            com.facebook.browser.lite.BrowserLiteFragment r0 = r9.A03
            java.util.List r1 = r0.A0o
            java.lang.String r0 = "onLargestContentfulPaint"
            if (r1 == 0) goto L_0x0075
            java.lang.StringBuilder r2 = X.SSR.A01(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x01d3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01dd
            r1.next()
            goto L_0x01d3
        L_0x01dd:
            X.SSR.A03(r2)
            goto L_0x0075
        L_0x01e2:
            java.lang.String r0 = "FBNavINP:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0075
            X.QLA r1 = r1.A01
            r0 = 9
            java.lang.String r0 = r2.substring(r0)
            long r2 = X.C10664Rvy.A00(r0)
            X.Rx5 r0 = r1.A0D
            if (r0 == 0) goto L_0x0075
            com.facebook.browser.lite.BrowserLiteFragment r0 = r0.A03
            X.A9z r6 = r0.A0d
            boolean r0 = r6.A0p
            if (r0 == 0) goto L_0x0075
            long r0 = r6.A0J
            long r0 = java.lang.Math.max(r2, r0)
            r6.A0J = r0
            goto L_0x0075
        L_0x020c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q8q.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
    }
}
