package X;

import com.facebook.browser.lite.BrowserLiteFragment;

public final class TJY implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ QLA A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public TJY(BrowserLiteFragment browserLiteFragment, QLA qla, String str, String str2) {
        this.A00 = browserLiteFragment;
        this.A03 = str;
        this.A01 = qla;
        this.A02 = str2;
    }

    public final void run() {
        String str = this.A03;
        QLA qla = this.A01;
        if (str.equals(qla.A05())) {
            qla.A0F(this.A02);
        }
    }
}
