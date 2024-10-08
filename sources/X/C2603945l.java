package X;

import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.45l  reason: invalid class name and case insensitive filesystem */
public final class C2603945l implements Runnable {
    public final /* synthetic */ C2603445g A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;

    public C2603945l(C2603445g r1, XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A01 = xplatNativeClientWrapper;
        this.A00 = r1;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(C273654mx.A00(355));
        } else {
            this.A00.D5p(C2603845k.CONNECTING);
        }
    }
}
