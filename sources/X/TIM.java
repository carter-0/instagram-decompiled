package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

public final class TIM implements Runnable {
    public final /* synthetic */ WebResourceRequest A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ Q93 A02;

    public TIM(WebResourceRequest webResourceRequest, WebView webView, Q93 q93) {
        this.A02 = q93;
        this.A01 = webView;
        this.A00 = webResourceRequest;
    }

    public final void run() {
        List list = this.A02.A06;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                Uri url = this.A00.getUrl();
                if (url != null) {
                    String obj = url.toString();
                    if (!AnonymousClass5He.A00(obj) && obj.startsWith("https://www.facebook.com/tr/?")) {
                        url.getQueryParameter("ev");
                        url.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    }
                }
            }
        }
    }
}
