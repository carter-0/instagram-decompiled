package X;

import android.content.Context;

/* renamed from: X.45K  reason: invalid class name */
public final class AnonymousClass45K implements AnonymousClass45B {
    public final Context A00;

    public final String AbR() {
        return ((AnonymousClass3RX) AnonymousClass3RD.A00).A02().A00(this.A00, 002.A0R("rti.mqtt.", "mqtt_config")).getString("analytics_endpoint", "");
    }

    public final String BUM() {
        return ((AnonymousClass3RX) AnonymousClass3RD.A00).A02().A00(this.A00, 002.A0R("rti.mqtt.", "mqtt_config")).getString("host_name_ipv6", "");
    }

    public AnonymousClass45K(Context context) {
        this.A00 = context;
    }
}
