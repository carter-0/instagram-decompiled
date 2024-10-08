package X;

import android.os.Looper;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;

public final /* synthetic */ class TCB implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public /* synthetic */ TCB(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        CatalystInstanceImpl catalystInstanceImpl = this.A00;
        synchronized (catalystInstanceImpl.mJavaScriptContextHolder) {
        }
        catalystInstanceImpl.mHybridData.resetNative();
        C10554Ru8 ru8 = catalystInstanceImpl.mReactQueueConfiguration;
        MessageQueueThreadImpl messageQueueThreadImpl = ru8.A01;
        if (messageQueueThreadImpl.A00 != Looper.getMainLooper()) {
            messageQueueThreadImpl.quitSynchronous();
        }
        MessageQueueThreadImpl messageQueueThreadImpl2 = ru8.A00;
        if (messageQueueThreadImpl2.A00 != Looper.getMainLooper()) {
            messageQueueThreadImpl2.quitSynchronous();
        }
        0I1.A04("ReactNative", "CatalystInstanceImpl.destroy() end");
        ReactMarker.logMarker(RH1.A0W);
    }
}
