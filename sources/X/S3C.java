package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

public final class S3C {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = 0;
    public final Context A03;
    public final AnonymousClass3RV A04;
    public final SRZ A05;
    public final RealtimeSinceBootClock A06;
    public final boolean A07;

    public final synchronized void A00() {
        long j;
        if (this.A07) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.A00;
            if (j2 < 0) {
                this.A00 = elapsedRealtime;
                this.A01 = elapsedRealtime;
            } else {
                long j3 = elapsedRealtime - j2;
                this.A00 = elapsedRealtime;
                if (j3 > 10000) {
                    j = this.A02 + 10000;
                } else {
                    j = this.A02 + j3;
                }
                this.A02 = j;
                AnonymousClass45J A0N = Pxf.A0N(this.A03, this.A04, "mqtt_radio_active_time");
                if (elapsedRealtime - this.A01 > 20000) {
                    this.A02 += A0N.getLong("total_wake_ms", 0);
                    C13849TiS AR1 = A0N.AR1();
                    AR1.E5a("total_wake_ms", this.A02);
                    AR1.AIO();
                    this.A02 = 0;
                    this.A01 = elapsedRealtime;
                }
                if (elapsedRealtime - A0N.getLong("last_log_ms", elapsedRealtime) > 3600000) {
                    this.A05.A06("mqtt_radio_active_time", S9J.A01("total_wake_ms", Long.toString(A0N.getLong("total_wake_ms", 0))));
                    C13849TiS AR12 = A0N.AR1();
                    AR12.ED1("total_wake_ms");
                    AR12.E5a("last_log_ms", elapsedRealtime);
                    AR12.AIR("EstimateRadioActiveTimeHelper", "Failed to reset total wake time and write last log time to preferences");
                }
            }
        }
    }

    public S3C(Context context, AnonymousClass3RV r9, RealtimeSinceBootClock realtimeSinceBootClock, SRZ srz, boolean z) {
        this.A03 = context;
        this.A05 = srz;
        this.A06 = realtimeSinceBootClock;
        this.A07 = z;
        this.A04 = r9;
        AnonymousClass45J A0N = Pxf.A0N(context, r9, "mqtt_radio_active_time");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A0N.getLong("last_log_ms", elapsedRealtime) >= elapsedRealtime) {
            C13849TiS AR1 = A0N.AR1();
            AR1.E5a("last_log_ms", elapsedRealtime);
            AR1.AIR("EstimateRadioActiveTimeHelper", "Failed to write last log time to preferences");
        }
    }
}
