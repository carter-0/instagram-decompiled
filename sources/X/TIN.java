package X;

import android.text.TextUtils;
import com.facebook.browser.lite.BrowserLiteFragment;

public final class TIN implements Runnable {
    public final /* synthetic */ QL8 A00;
    public final /* synthetic */ QLA A01;
    public final /* synthetic */ String A02;

    public TIN(QL8 ql8, QLA qla, String str) {
        this.A00 = ql8;
        this.A01 = qla;
        this.A02 = str;
    }

    public final void run() {
        QLA qla = this.A01;
        BrowserLiteFragment browserLiteFragment = this.A00.A0E;
        if (qla == browserLiteFragment.C8U() && TextUtils.equals(qla.A05(), this.A02)) {
            DbT.A1J(browserLiteFragment);
        }
    }
}
