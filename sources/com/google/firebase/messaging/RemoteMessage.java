package com.google.firebase.messaging;

import X.01r;
import X.C301145yd;
import X.Pxf;
import X.SWT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(11);
    public Bundle A00;
    public Map A01;

    public final int A00() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        if ("normal".equals(string)) {
            return 2;
        }
        return 0;
    }

    public final int A01() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        if ("normal".equals(string)) {
            return 2;
        }
        return 0;
    }

    public final Map A02() {
        01r r4 = this.A01;
        if (r4 == null) {
            Bundle bundle = this.A00;
            r4 = new 01r(0);
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if ((obj instanceof String) && !next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                    r4.put(next, obj);
                }
            }
            this.A01 = r4;
        }
        return r4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A02(this.A00, parcel, 2);
        C301145yd.A06(parcel, A03);
    }
}
