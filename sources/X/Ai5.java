package X;

import com.facebook.browser.lite.BrowserLiteFragment;
import java.time.Instant;

public final /* synthetic */ class Ai5 implements Runnable {
    public final /* synthetic */ C10727Rx5 A00;

    public /* synthetic */ Ai5(C10727Rx5 rx5) {
        this.A00 = rx5;
    }

    public final void run() {
        BrowserLiteFragment browserLiteFragment = this.A00.A03;
        SRY sry = browserLiteFragment.A0L;
        A9z a9z = browserLiteFragment.A0d;
        long A01 = browserLiteFragment.A0W.A01();
        C39896ADy aDy = browserLiteFragment.A0W;
        long j = aDy.A04;
        String str = aDy.A08;
        AnonymousClass59G A02 = aDy.A02(AnonymousClass05K.A00);
        C39896ADy aDy2 = browserLiteFragment.A0W;
        long j2 = aDy2.A00;
        if (j2 == -1) {
            j2 = Instant.now().getEpochSecond();
            aDy2.A00 = j2;
        }
        sry.A06(browserLiteFragment.A08, a9z.A02(Long.valueOf(j2), str, A02, A01, j), browserLiteFragment.A0e);
    }
}
