package X;

import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.util.Iterator;

public final /* synthetic */ class TCD implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public /* synthetic */ TCD(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        C10409Rrl rrl = this.A00.mNativeModuleRegistry;
        QZK qzk = rrl.A00;
        if (qzk.A09) {
            MessageQueueThread messageQueueThread = qzk.A04;
            0Sd.A00(messageQueueThread);
            messageQueueThread.assertIsOnThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
            ReactMarker.logMarker(RH1.A18);
            0fc.A01(8192, "NativeModuleRegistry_notifyJSInstanceInitialized", 1763277720);
            try {
                Iterator A0v = AnonymousClass7TF.A0v(rrl.A01);
                while (A0v.hasNext()) {
                    ((ModuleHolder) A0v.next()).markInitializable();
                }
            } finally {
                0fc.A00(8192, -1508065495);
                ReactMarker.logMarker(RH1.A17);
            }
        } else {
            throw AnonymousClass7TE.A0z("Tried to call assertOnNativeModulesQueueThread(message) on an uninitialized ReactContext");
        }
    }
}
