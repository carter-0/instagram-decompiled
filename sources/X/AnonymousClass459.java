package X;

import android.content.Context;

/* renamed from: X.459  reason: invalid class name */
public final class AnonymousClass459 extends AnonymousClass45A {
    public final AnonymousClass458 A00;

    public AnonymousClass459(Context context, AnonymousClass3RV r8, AnonymousClass458 r9, AnonymousClass452 r10, Integer num) {
        super(context, r8, r10, num);
        this.A00 = r9;
        AnonymousClass45J A002 = this.A02.A00(this.A01, 002.A0R("rti.mqtt.", "mqtt_last_host"));
        if (System.currentTimeMillis() - A002.getLong("zero_rating_last_host_timestamp", 0) < 86400000) {
            this.A06 = A002.getString("zero_rating_last_host", "");
        }
    }
}
