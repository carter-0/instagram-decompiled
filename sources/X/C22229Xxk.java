package X;

import android.os.Handler;
import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;

/* renamed from: X.Xxk  reason: case insensitive filesystem */
public final class C22229Xxk implements TransportCallbacks {
    public TransportCallbacks A00;
    public final Handler A01;

    public final void onSpeedTestResult(SpeedTestStatus speedTestStatus) {
        0qQ.A0B(speedTestStatus, 0);
        this.A01.post(new Y2S(this, speedTestStatus));
    }

    public final void onTransportEvent(TransportEvent transportEvent, TransportError transportError) {
        0qQ.A0B(transportEvent, 0);
        this.A01.post(new Y3D(this, transportError, transportEvent));
    }

    public C22229Xxk(Handler handler, TransportCallbacks transportCallbacks) {
        this.A00 = transportCallbacks;
        this.A01 = handler;
    }
}
