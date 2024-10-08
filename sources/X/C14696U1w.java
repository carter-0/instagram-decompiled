package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate;

/* renamed from: X.U1w  reason: case insensitive filesystem */
public abstract class C14696U1w extends Handler {
    public volatile boolean A00;
    public final /* synthetic */ MqttBackgroundServiceDelegate A01;

    public final void A00() {
        ((UU0) this).A00.A0H();
    }

    public final void A01() {
        ((UU0) this).A00.A0G();
    }

    public final void A02(int i, int i2, Intent intent) {
        ((UU0) this).A00.A0I(i, i2, intent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14696U1w(Looper looper, MqttBackgroundServiceDelegate mqttBackgroundServiceDelegate) {
        super(looper);
        this.A01 = mqttBackgroundServiceDelegate;
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            int i = message.what;
            if (i == 1) {
                this.A01.A0G();
            } else if (i != 2) {
                if (i == 3) {
                    this.A01.A0H();
                    synchronized (this) {
                        this.A00 = true;
                        notifyAll();
                    }
                    return;
                }
                throw new IllegalStateException("Unsupported message");
            } else if (!this.A00) {
                this.A01.A0I(message.arg1, message.arg2, (Intent) message.obj);
            }
        } else {
            throw new IllegalStateException("Message is null");
        }
    }
}
