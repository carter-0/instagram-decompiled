package X;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public final class Q8u extends WebChromeClient {
    public final S0R A00;

    public final Bitmap getDefaultVideoPoster() {
        return this.A00.A00.getDefaultVideoPoster();
    }

    public final View getVideoLoadingProgressView() {
        return this.A00.A00.getVideoLoadingProgressView();
    }

    public final void getVisitedHistory(ValueCallback valueCallback) {
        this.A00.A00.getVisitedHistory(valueCallback);
    }

    public final void onCloseWindow(WebView webView) {
        this.A00.A00.onCloseWindow(webView);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.A00.A00.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return this.A00.A00.onCreateWindow(webView, z, z2, message);
    }

    public final void onGeolocationPermissionsHidePrompt() {
        this.A00.A00.onGeolocationPermissionsHidePrompt();
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.A00.A00.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public final void onHideCustomView() {
        this.A00.A00.onHideCustomView();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsConfirm(webView, str, str2, jsResult);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.A00.A00.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.A00.A00.onPermissionRequest(permissionRequest);
    }

    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.A00.A00.onPermissionRequestCanceled(permissionRequest);
    }

    public final void onProgressChanged(WebView webView, int i) {
        this.A00.A00(webView, i);
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.A00.A00.onReceivedIcon(webView, bitmap);
    }

    public final void onReceivedTitle(WebView webView, String str) {
        this.A00.A00.onReceivedTitle(webView, str);
    }

    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.A00.A00.onReceivedTouchIconUrl(webView, str, z);
    }

    public final void onRequestFocus(WebView webView) {
        this.A00.A00.onRequestFocus(webView);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.A00.A00.onShowCustomView(view, customViewCallback);
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return this.A00.A00.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public Q8u(S0R s0r) {
        this.A00 = s0r;
    }
}
