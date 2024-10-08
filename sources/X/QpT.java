package X;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

public final class QpT extends AnonymousClass63E implements C13637Te4 {
    public static final AnonymousClass63K A00;
    public static final AnonymousClass63I A01;
    public static final AnonymousClass63G A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.63G, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.63I] */
    static {
        ? obj = new Object();
        A02 = obj;
        ? obj2 = new Object();
        A01 = obj2;
        A00 = new AnonymousClass63K(obj2, obj, "ClientTelemetry.API");
    }

    public final AnonymousClass9GD Cgn(TelemetryData telemetryData) {
        SHO A002 = SFC.A00();
        A002.A03 = new Feature[]{C10083RmL.A00};
        A002.A02 = false;
        A002.A01 = new SxI(telemetryData);
        return AnonymousClass63E.A00(this, A002.A01(), 2);
    }
}
