package X;

import com.facebook.rsys.callmanager.gen.UnregisterCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Gy5  reason: case insensitive filesystem */
public final class C54022Gy5 extends UnregisterCallback {
    public final /* synthetic */ CountDownLatch A00;

    public C54022Gy5(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    public final void onUnregister(String str) {
        this.A00.countDown();
    }
}
