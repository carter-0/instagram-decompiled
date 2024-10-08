package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.3RY  reason: invalid class name */
public enum AnonymousClass3RY {
    A09("host_name_ipv6", 0),
    A07("analytics_endpoint", 1),
    A08("bc_host_name_timestamp", 2),
    A03("fb_uid", 3),
    A05(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, 4),
    A04("is_employee", 5),
    A06("year_class", 6),
    A0A("logging_health_stats_sample_rate", 7),
    A0B("log_analytic_events", 8),
    A0C("log_sr", 9),
    A0D("/settings/mqtt/id/mqtt_device_id", 10),
    A0E("/settings/mqtt/id/mqtt_device_secret", 11);
    
    public final AnonymousClass3RZ A00;
    public final String A01;

    public final void A00(Bundle bundle, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            this.A00.A02(bundle, obj, name());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot cast");
        sb.append(obj.getClass());
        throw new ClassCastException(sb.toString());
    }

    public final void A01(C13849TiS tiS, Object obj) {
        if (obj == null || this.A00.A00().isInstance(obj)) {
            this.A00.A03(tiS, obj, name());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot cast");
        sb.append(obj.getClass());
        throw new ClassCastException(sb.toString());
    }

    /* access modifiers changed from: public */
    AnonymousClass3RY(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }
}
