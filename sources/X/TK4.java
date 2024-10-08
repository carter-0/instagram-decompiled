package X;

import android.net.Uri;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;

public final class TK4 implements Runnable {
    public final /* synthetic */ BrowserLiteJSBridgeProxy A00;
    public final /* synthetic */ C10947S2f A01;
    public final /* synthetic */ BrowserLiteJSBridgeCall A02;
    public final /* synthetic */ QLA A03;
    public final /* synthetic */ String A04;

    public TK4(BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy, C10947S2f s2f, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, QLA qla, String str) {
        this.A00 = browserLiteJSBridgeProxy;
        this.A03 = qla;
        this.A02 = browserLiteJSBridgeCall;
        this.A04 = str;
        this.A01 = s2f;
    }

    public final void run() {
        Uri uri;
        QLA qla = this.A03;
        BrowserLiteJSBridgeCall browserLiteJSBridgeCall = this.A02;
        if (C10062Rlz.A00.contains(this.A04)) {
            String A05 = qla.A05();
            Uri uri2 = null;
            if (A05 != null) {
                uri = Pxg.A0L(A05);
            } else {
                uri = null;
            }
            String str = browserLiteJSBridgeCall.A05;
            if (str != null) {
                uri2 = Pxg.A0L(str);
            }
            if (!(uri == null || uri.getAuthority() == null || uri2 == null || uri2.getAuthority() == null || !0qQ.A0K(uri.getAuthority(), uri2.getAuthority()))) {
                qla.A0F(this.A01.A00());
                return;
            }
        }
        SQO.A01("BrowserLiteJSBridgeProxy", "Could not invoke js callback due to domain change", new Object[0]);
    }
}
