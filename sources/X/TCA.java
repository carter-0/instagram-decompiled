package X;

import com.facebook.react.bridge.CatalystInstanceImpl;
import java.util.Iterator;

public final /* synthetic */ class TCA implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public /* synthetic */ TCA(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        Iterator it = this.A00.mBridgeIdleListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onTransitionToBridgeIdle");
        }
    }
}
