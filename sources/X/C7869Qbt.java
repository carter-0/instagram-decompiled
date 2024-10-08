package X;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.Qbt  reason: case insensitive filesystem */
public final class C7869Qbt extends AnonymousClass452 {
    public final Context A00;
    public volatile AnonymousClass453 A01 = new AnonymousClass453(DbS.A11());

    public final AnonymousClass453 A00() {
        return this.A01;
    }

    public C7869Qbt(Context context) {
        this.A00 = context;
    }

    public final void A01() {
        JSONObject A11 = DbS.A11();
        A04(A11);
        this.A01 = new AnonymousClass453(A11);
    }

    public final void A02() {
        0R3 A0O = Pxf.A0O();
        Intent A0G = Pxe.A0G("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        Context context = this.A00;
        A0O.A0C(context, A0G.setPackage(context.getPackageName()));
    }
}
