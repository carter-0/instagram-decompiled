package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.THy  reason: case insensitive filesystem */
public final class C13016THy implements Runnable {
    public final /* synthetic */ TZg A00;
    public final /* synthetic */ CountDownLatch A01;

    public C13016THy(TZg tZg, CountDownLatch countDownLatch) {
        this.A00 = tZg;
        this.A01 = countDownLatch;
    }

    public final void run() {
        C11760Sfy sfy = (C11760Sfy) this.A00;
        if (SDO.A0S.A01()) {
            sfy.A00.getCookieManager().removeAllCookies(new C11524Sbl(this.A01, 3));
            return;
        }
        throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
