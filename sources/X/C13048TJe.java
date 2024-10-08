package X;

import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.TJe  reason: case insensitive filesystem */
public final class C13048TJe implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public C13048TJe(XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, long j) {
        this.A01 = xplatNativeClientWrapper;
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = j;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onData");
        }
        C2603445g r4 = xplatNativeClientWrapper.stateCallback;
        if (r4 == null) {
            0qQ.A0F("stateCallback");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r4.onMessageDropped(this.A02, this.A03, this.A00);
        }
    }
}
