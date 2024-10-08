package com.google.android.gms.ads.identifier;

import X.AnonymousClass3Qk;
import X.AnonymousClass64D;
import X.AnonymousClass7TE;
import X.C66581MXm;
import X.Pxe;
import X.Pxf;
import X.SVV;
import X.TR5;
import android.content.Context;
import com.google.android.gms.internal.ads_identifier.zze;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

public final class AdvertisingIdClient {
    public SVV A00;
    public zze A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = Pxe.A0p();
    public final boolean A05;

    public final class Info {
        public final String A00;
        public final boolean A01;

        public Info(String str, boolean z) {
            this.A00 = str;
            this.A01 = z;
        }

        public final String toString() {
            String str = this.A00;
            boolean z = this.A01;
            StringBuilder A14 = Pxe.A14(Pxf.A09(str) + 7);
            A14.append("{");
            A14.append(str);
            A14.append("}");
            A14.append(z);
            return A14.toString();
        }
    }

    public final void A01() {
        AnonymousClass3Qk.A05("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (!(context == null || this.A00 == null)) {
                try {
                    if (this.A02) {
                        AnonymousClass64D.A00().A02(context, this.A00);
                    }
                } catch (Throwable unused) {
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public final void finalize() {
        A01();
    }

    public AdvertisingIdClient(Context context, boolean z, boolean z2) {
        Context applicationContext;
        AnonymousClass3Qk.A02(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.A03 = context;
        this.A02 = false;
        this.A05 = z2;
    }

    public static final void A00(Info info, String str, Throwable th, float f, long j, boolean z) {
        if (Math.random() <= ((double) f)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str3 = "0";
            if (z) {
                str3 = str2;
            }
            A1E.put("app_context", str3);
            if (info != null) {
                if (!info.A01) {
                    str2 = "0";
                }
                A1E.put("limit_ad_tracking", str2);
                String str4 = info.A00;
                if (str4 != null) {
                    A1E.put("ad_id_size", Integer.toString(str4.length()));
                }
            }
            if (th != null) {
                A1E.put("error", C66581MXm.A0y(th));
            }
            if (str != null && !str.isEmpty()) {
                A1E.put("experiment_id", str);
            }
            A1E.put("tag", "AdvertisingIdClient");
            A1E.put("time_spent", Long.toString(j));
            new TR5(A1E).start();
        }
    }
}
