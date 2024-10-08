package X;

import com.facebook.mqtt.service.MqttSubscribeListener;

/* renamed from: X.M5m  reason: case insensitive filesystem */
public final class C65949M5m implements Runnable {
    public final /* synthetic */ C61079JwH A00;
    public final /* synthetic */ C2602344u A01;

    public C65949M5m(C61079JwH jwH, C2602344u r2) {
        this.A01 = r2;
        this.A00 = jwH;
    }

    public final void run() {
        C250773m2 r3 = this.A01.A00;
        if (r3 != null) {
            C61079JwH jwH = this.A00;
            r3.subscribe(jwH.A02, (C2605346a) jwH.A01, (MqttSubscribeListener) jwH.A00);
        }
    }
}
