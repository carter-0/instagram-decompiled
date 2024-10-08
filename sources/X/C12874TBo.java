package X;

import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.TBo  reason: case insensitive filesystem */
public final class C12874TBo implements Runnable {
    public final /* synthetic */ XplatNativeClientWrapper A00;

    public C12874TBo(XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A00 = xplatNativeClientWrapper;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A00;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11(C273654mx.A00(356));
        }
        C2603445g r1 = xplatNativeClientWrapper.stateCallback;
        if (r1 == null) {
            0qQ.A0F("stateCallback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.D5p(C2603845k.DISCONNECTED);
        }
    }
}
