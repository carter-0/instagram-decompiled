package X;

import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9Qx  reason: invalid class name and case insensitive filesystem */
public final class C378709Qx implements B16 {
    public final /* synthetic */ C341657nJ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ CountDownLatch A02;

    public final void onFinished() {
        String.format((Locale) null, "[Executing Finished] %s", new Object[]{this.A01});
        this.A02.countDown();
    }

    public C378709Qx(C341657nJ r1, String str, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = countDownLatch;
    }
}
