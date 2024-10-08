package X;

import android.content.Intent;

public final class QQC extends AnonymousClass451 {
    public final C12139Snk A00;

    public final void A02() {
        C12139Snk snk = this.A00;
        Intent A0G = Pxe.A0G("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        Pxe.A1L(snk.A00, A0G);
        Pxf.A0O().A0C(snk.A00, A0G);
    }

    public QQC(C12139Snk snk, String str, String str2, String str3) {
        str.getClass();
        this.A01 = str;
        str2.getClass();
        this.A03 = str2;
        str3.getClass();
        this.A02 = str3;
        A01();
        this.A00 = snk;
    }
}
