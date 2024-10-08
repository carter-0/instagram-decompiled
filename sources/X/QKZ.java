package X;

import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;

public final class QKZ extends S6T {
    public WeakReference A00;
    public final C10981S3p A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C13347TVu((Object) this, 46));
    public final boolean A04;

    public final void A01(QLA qla, String str) {
        WeakReference weakReference;
        if (!AnonymousClass7TF.A1Z(this.A02) || (weakReference = this.A00) == null) {
            super.A01(qla, str);
            return;
        }
        C10151RnS rnS = (C10151RnS) weakReference.get();
        if (rnS == null) {
            return;
        }
        if (SDO.A0a.A01()) {
            rnS.A00.postMessage(str);
            return;
        }
        throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public QKZ(C10981S3p s3p) {
        super(s3p);
        this.A01 = s3p;
        0t0 A012 = AnonymousClass0eN.A01(TUA.A00);
        this.A02 = A012;
        this.A04 = AnonymousClass7TE.A1a(A012.getValue());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QcV, java.lang.Object, android.webkit.WebView] */
    public final void A00(QLA qla) {
        super.A00(qla);
        if (this.A04) {
            try {
                ? r2 = ((SystemWebView) qla).A04;
                0qQ.A0C(r2, "null cannot be cast to non-null type android.webkit.WebView");
                090.A04(r2, (TZi) this.A03.getValue(), JTP.A0y("*"));
            } catch (IllegalArgumentException e) {
                0KC.A0F("FbPaySDKIFrameInjector", "Failed to add web message listener", e);
            }
        } else {
            0KC.A0C("FbPaySDKIFrameInjector", 002.A1D("WEB_MESSAGE_LISTENER feature supported: ", AnonymousClass7TF.A1Z(this.A02)));
        }
    }
}
