package X;

import com.facebook.react.bridge.CatalystInstanceImpl;

public final /* synthetic */ class TC9 implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public /* synthetic */ TC9(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    public final void run() {
        new Thread(new TCB(this.A00), "destroy_react_context").start();
    }
}
