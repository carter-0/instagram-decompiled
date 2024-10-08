package X;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.location.platform.api.Location;

public final class Q7q extends Handler {
    public final ComponentName A00;
    public final /* synthetic */ Q5Y A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7q(ComponentName componentName, Looper looper, Q5Y q5y) {
        super(looper);
        this.A01 = q5y;
        this.A00 = componentName;
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            Q5Y q5y = this.A01;
            try {
                ((AppOpsManager) q5y.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    Messenger messenger = message.replyTo;
                    String string = data.getString("tag");
                    if (messenger == null || string == null) {
                        0I2 r0 = 0KC.A01;
                        return;
                    }
                    TL5 A002 = Q5Y.A00(data.getBundle(Location.EXTRAS), q5y, new Sm8(this.A00, messenger, string), string);
                    if (A002 != null) {
                        A002.A01();
                    }
                } else if (i != 2 && i != 4) {
                    0KC.A0O("GcmTaskService", "Unrecognized message received: %s", new Object[]{message});
                }
            } catch (SecurityException e) {
                0KC.A0F("GcmTaskService", "Message was not sent from GCM.", e);
            }
        }
    }
}
