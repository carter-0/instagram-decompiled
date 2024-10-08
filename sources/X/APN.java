package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class APN implements 00W {
    public final /* synthetic */ BrowserLiteFragment A00;

    public /* synthetic */ APN(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    public final void Cti(Object obj) {
        List list = this.A00.A0n;
        if (list != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("BLF.plugins.");
            A1A.append("onRequestPermissionResult");
            SSR A002 = SSR.A00();
            A1A.append(".Start");
            A002.A04(002.A0g("BLF.plugins.", "onRequestPermissionResult", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            SSR.A00().A04(AnonymousClass7TF.A0l(".End", A1A));
        }
    }
}
