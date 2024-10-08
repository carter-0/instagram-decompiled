package X;

import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.46K  reason: invalid class name */
public final class AnonymousClass46K implements Runnable {
    public final /* synthetic */ C2603845k A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;

    public AnonymousClass46K(XplatNativeClientWrapper xplatNativeClientWrapper, C2603845k r2) {
        this.A00 = r2;
        this.A01 = xplatNativeClientWrapper;
    }

    public final void run() {
        C2603845k r2 = this.A00;
        if (r2 == C2603845k.CONNECTING) {
            XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
            AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
            Iterator it = xplatNativeClientWrapper.observers.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(C273654mx.A00(355));
            }
        } else if (r2 == C2603845k.CONNECTED_AND_ACK) {
            XplatNativeClientWrapper xplatNativeClientWrapper2 = this.A01;
            AnonymousClass28I r02 = XplatNativeClientWrapper.Companion;
            Iterator it2 = xplatNativeClientWrapper2.observers.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(C273654mx.A00(859));
            }
        } else if (r2 == C2603845k.DISCONNECTED) {
            XplatNativeClientWrapper xplatNativeClientWrapper3 = this.A01;
            AnonymousClass28I r03 = XplatNativeClientWrapper.Companion;
            Iterator it3 = xplatNativeClientWrapper3.observers.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw new NullPointerException(C273654mx.A00(356));
            }
        }
        XplatNativeClientWrapper xplatNativeClientWrapper4 = this.A01;
        AnonymousClass28I r04 = XplatNativeClientWrapper.Companion;
        C2603445g r05 = xplatNativeClientWrapper4.stateCallback;
        if (r05 == null) {
            0qQ.A0F("stateCallback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r05.D5p(r2);
        }
    }
}
