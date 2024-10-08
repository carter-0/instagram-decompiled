package X;

import android.webkit.WebView;
import java.util.List;

public final class TIL implements Runnable {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ Q93 A01;
    public final /* synthetic */ String A02;

    public TIL(WebView webView, Q93 q93, String str) {
        this.A01 = q93;
        this.A00 = webView;
        this.A02 = str;
    }

    public final void run() {
        List<C13547TcJ> list = this.A01.A03;
        synchronized (list) {
            for (C13547TcJ DW3 : list) {
                DW3.DW3((C7902QcU) this.A00, this.A02);
            }
        }
    }
}
