package X;

import com.facebook.react.bridge.CatalystInstanceImpl;

public final /* synthetic */ class TCC implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public /* synthetic */ TCC(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        this.A00.destroy();
    }
}
