package X;

import android.os.SystemClock;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;

public final /* synthetic */ class TCH implements Runnable {
    public final /* synthetic */ MessageQueueThreadImpl A00;

    public /* synthetic */ TCH(MessageQueueThreadImpl messageQueueThreadImpl) {
        this.A00 = messageQueueThreadImpl;
    }

    public final void run() {
        SystemClock.uptimeMillis();
        SystemClock.currentThreadTimeMillis();
    }
}
