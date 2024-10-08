package X;

import android.graphics.HardwareBufferRenderer;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

public final class TOZ implements Consumer {
    public final /* synthetic */ CountDownLatch A00;

    public TOZ(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        HardwareBufferRenderer.RenderResult renderResult = (HardwareBufferRenderer.RenderResult) obj;
        0qQ.A0B(renderResult, 0);
        renderResult.getFence().awaitForever();
        this.A00.countDown();
    }
}
