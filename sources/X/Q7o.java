package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.util.concurrent.atomic.AtomicInteger;

public final class Q7o extends Handler {
    public final C10222Rod A00;

    public Q7o(Looper looper, C10222Rod rod) {
        super(looper);
        this.A00 = rod;
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            CatalystInstanceImpl catalystInstanceImpl = this.A00.A00;
            AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
            catalystInstanceImpl.mJSExceptionHandler.handleException(e);
            catalystInstanceImpl.mReactQueueConfiguration.A02.runOnQueue(new TCC(catalystInstanceImpl));
        }
    }
}
