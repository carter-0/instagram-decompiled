package com.facebook.browser.lite;

import X.02K;
import X.0b6;
import X.AnonymousClass7TF;
import X.C13847TiP;
import X.C13906Tl6;
import X.C13921TlP;
import X.C273654mx;
import X.C51968G9o;
import X.C67004Mgc;
import X.C7582QKx;
import X.MY3;
import X.NEK;
import X.Pxe;
import X.QLA;
import X.SFP;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.instagram.android.R;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class BrowserLiteWebChromeClient implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public int A00;
    public AlertDialog A01;
    public ContentResolver A02;
    public Intent A03;
    public Uri A04;
    public ValueCallback A05;
    public ValueCallback A06;
    public WebChromeClient.CustomViewCallback A07;
    public FrameLayout A08;
    public VideoView A09;
    public BrowserLiteFragment A0A;
    public BrowserLiteProgressBar A0B;
    public C13906Tl6 A0C;
    public C13847TiP A0D;
    public QLA A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public ValueCallback A0K;
    public WebChromeClient.FileChooserParams A0L;

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.0bY] */
    private void A00(ValueCallback valueCallback) {
        String str;
        if (valueCallback != null) {
            ValueCallback valueCallback2 = this.A05;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue((Object) null);
                this.A05 = null;
            }
            this.A05 = valueCallback;
            Intent A0G2 = Pxe.A0G("android.media.action.IMAGE_CAPTURE");
            try {
                NEK nek = new NEK();
                FragmentActivity requireActivity = this.A0A.requireActivity();
                File A032 = nek.A03(requireActivity, "webview_tmp_file", ".jpg");
                HashMap hashMap = MY3.A06;
                Uri A042 = MY3.A01(requireActivity, (ProviderInfo) null, new Object()).A04(A032);
                Uri[] uriArr = {A042};
                String action = A0G2.getAction();
                if ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.VIDEO_CAPTURE".equals(action)) {
                    str = "output";
                } else {
                    str = "android.intent.extra.STREAM";
                }
                Uri uri = uriArr[0];
                if (uri == null || !"file".equals(uri.getScheme())) {
                    A0G2.addFlags(1);
                    A0G2.addFlags(2);
                    A0G2.setClipData(new ClipData(new ClipDescription(str, new String[]{"text/uri-list"}), new ClipData.Item(uriArr[0])));
                    A0G2.putExtra(str, uriArr[0]);
                    this.A04 = A042;
                    A0G2.putExtra("output", A042);
                    try {
                        0b6.A00().A03().A0F(this.A0A.requireActivity(), A0G2, 4);
                    } catch (ActivityNotFoundException unused) {
                        this.A05 = null;
                        this.A04 = null;
                    }
                } else {
                    throw new SecurityException("Attempted to bypass content providers with file:// URI");
                }
            } catch (IOException unused2) {
                this.A05 = null;
                this.A04 = null;
            }
        }
    }

    private boolean A05(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (!(valueCallback == null || fileChooserParams == null)) {
            ValueCallback valueCallback2 = this.A05;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue((Object) null);
                this.A05 = null;
            }
            this.A05 = valueCallback;
            try {
                this.A0A.startActivityForResult(fileChooserParams.createIntent(), 2);
                return true;
            } catch (ActivityNotFoundException unused) {
                this.A05 = null;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|(1:5)|6|(3:8|9|10)|12|13|14|15|16|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.facebook.browser.lite.BrowserLiteWebChromeClient r4) {
        /*
            android.widget.FrameLayout r3 = r4.A08
            int r0 = r3.getVisibility()
            r2 = 8
            if (r0 != r2) goto L_0x000b
            return
        L_0x000b:
            android.widget.VideoView r0 = r4.A09
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r0.stopPlayback()
            r4.A09 = r1
        L_0x0015:
            android.webkit.WebChromeClient$CustomViewCallback r0 = r4.A07
            if (r0 == 0) goto L_0x001e
            r0.onCustomViewHidden()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            r4.A07 = r1
        L_0x001e:
            r3.setVisibility(r2)
            r1 = 8192(0x2000, float:1.14794E-41)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r4.A0A
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            android.view.View r0 = X.C66581MXm.A0A(r0)
            r0.setSystemUiVisibility(r1)
            r3.removeAllViews()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r3.removeAllViews()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            return
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.A01(com.facebook.browser.lite.BrowserLiteWebChromeClient):void");
    }

    public static void A02(BrowserLiteWebChromeClient browserLiteWebChromeClient, int i) {
        C13847TiP tiP = browserLiteWebChromeClient.A0D;
        if (tiP != null) {
            tiP.setProgress(i);
        } else {
            browserLiteWebChromeClient.A0B.setProgress(i);
        }
        for (C13921TlP tlP : browserLiteWebChromeClient.A0F) {
            if (tlP instanceof C7582QKx) {
                C7582QKx qKx = (C7582QKx) tlP;
                if (i == 100) {
                    SFP sfp = qKx.A00;
                    if (sfp != null) {
                        sfp.A00 = C51968G9o.A0u();
                    }
                    C7582QKx.A00(qKx);
                }
            }
        }
    }

    public static boolean A03(Activity activity) {
        return AnonymousClass7TF.A1Q(02K.A00(activity, C273654mx.A00(38)));
    }

    public static boolean A04(Activity activity) {
        boolean A1Q = AnonymousClass7TF.A1Q(02K.A00(activity, "android.permission.READ_MEDIA_IMAGES"));
        boolean A1Q2 = AnonymousClass7TF.A1Q(02K.A00(activity, "android.permission.READ_MEDIA_VIDEO"));
        if (!A1Q || !A1Q2) {
            return false;
        }
        return true;
    }

    public final void A06(int i, int[] iArr) {
        BrowserLiteFragment browserLiteFragment = this.A0A;
        FragmentActivity activity = browserLiteFragment.getActivity();
        if (i == 3) {
            int i2 = 0;
            while (i2 < iArr.length) {
                if (iArr[i2] == 0) {
                    i2++;
                } else if (Build.VERSION.SDK_INT >= 34 && activity != null && A03(activity)) {
                    Toast.makeText(browserLiteFragment.A05, R.string.f0nameremoved, 0).show();
                    return;
                } else {
                    return;
                }
            }
            A05(this.A0K, this.A0L);
        } else if (i == 4 && this.A0H && iArr.length > 0 && iArr[0] == 0) {
            A00(this.A0K);
        } else {
            return;
        }
        this.A0K = null;
        this.A0L = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.QcV, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.QLA r7, int r8) {
        /*
            r6 = this;
            r6.A00 = r8
            X.QL8 r1 = com.facebook.browser.lite.BrowserLiteFragment.A05(r7)
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = r7.A05()
            r1.A0A(r0)
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0025
            r0 = 100
            if (r8 != r0) goto L_0x0025
            com.facebook.browser.lite.BrowserLiteFragment r0 = r1.A0E
            X.A9z r3 = r0.A0d
            long r1 = java.lang.System.currentTimeMillis()
            boolean r0 = r3.A0p
            if (r0 == 0) goto L_0x0025
            r3.A0C = r1
        L_0x0025:
            com.facebook.browser.lite.webview.SystemWebView r7 = (com.facebook.browser.lite.webview.SystemWebView) r7
            X.QcV r0 = r7.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b2
            A02(r6, r8)
            X.QLA r1 = r6.A0E
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x00b2
            X.Rvy r1 = r1.A0H
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00b2
            X.QLA r4 = r1.A01
            android.content.Context r5 = r1.A00
            r0 = 1
            X.0qQ.A0B(r5, r0)
            java.lang.ref.WeakReference r1 = X.C9118RPq.A00
            if (r1 == 0) goto L_0x0055
            r0 = 0
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0075
            X.C9118RPq.A00 = r0
        L_0x0055:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131886133(0x7f120035, float:1.9406836E38)
            java.io.InputStreamReader r3 = X.Pxg.A0a(r1, r0)
            java.lang.String r2 = X.1r9.A00(r3)     // Catch:{ all -> 0x0097 }
            r3.close()
            int r1 = r2.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto L_0x0075
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r2)
            X.C9118RPq.A00 = r0
        L_0x0075:
            r4.A0F(r2)
            java.lang.ref.WeakReference r1 = X.C9116RPo.A00
            if (r1 == 0) goto L_0x0087
            r0 = 0
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00af
            X.C9116RPo.A00 = r0
        L_0x0087:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131886130(0x7f120032, float:1.940683E38)
            java.io.InputStreamReader r3 = X.Pxg.A0a(r1, r0)
            java.lang.String r2 = X.1r9.A00(r3)     // Catch:{ all -> 0x0097 }
            goto L_0x009e
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x009e:
            r3.close()
            int r1 = r2.length()
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 >= r0) goto L_0x00af
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r2)
            X.C9116RPo.A00 = r0
        L_0x00af:
            r4.A0F(r2)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.A07(X.QLA, int):void");
    }

    public boolean onShowFileChooser(QLA qla, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] strArr;
        int i;
        if (!this.A0J) {
            return A05(valueCallback, fileChooserParams);
        }
        FragmentActivity activity = this.A0A.getActivity();
        if (activity == null) {
            return false;
        }
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        boolean z = this.A0I;
        if (!z || !isCaptureEnabled || 02K.A00(activity, "android.permission.CAMERA") != 0) {
            if (this.A0H && z && isCaptureEnabled && 02K.A00(activity, "android.permission.CAMERA") != 0) {
                strArr = new String[]{"android.permission.CAMERA"};
                i = 4;
            } else if (Build.VERSION.SDK_INT < 33 || this.A0A.A05.getApplicationInfo().targetSdkVersion < 33 ? 02K.A00(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0 : !A04(activity)) {
                if (Build.VERSION.SDK_INT < 33 || this.A0A.A05.getApplicationInfo().targetSdkVersion < 33) {
                    strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
                } else {
                    strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                }
                i = 3;
            } else {
                A05(valueCallback, fileChooserParams);
                return true;
            }
            C67004Mgc.A05(activity, strArr, i);
            this.A0K = valueCallback;
            this.A0L = fileChooserParams;
            return true;
        }
        A00(valueCallback);
        return true;
    }

    public void openFileChooser(ValueCallback valueCallback, String str, String str2) {
        this.A06 = valueCallback;
        Intent A0G2 = Pxe.A0G("android.intent.action.GET_CONTENT");
        A0G2.addCategory("android.intent.category.OPENABLE");
        A0G2.setType(str);
        try {
            this.A0A.startActivityForResult(A0G2, 1);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            A01(this);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            A01(this);
        } catch (Throwable unused) {
        }
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        openFileChooser(valueCallback, str, "");
    }
}
