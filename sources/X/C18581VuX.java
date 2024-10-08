package X;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: X.VuX  reason: case insensitive filesystem */
public final class C18581VuX {
    public C18851W5y A00;
    public Integer A01;
    public final int A02;
    public final Context A03;
    public final Sensor A04;
    public final SensorManager A05;
    public final C331037Pg A06;
    public final C70811OMg A07;
    public final C62320sa A08;
    public final boolean A09;

    public static final void A00(C18581VuX vuX) {
        C331037Pg r2 = vuX.A06;
        r2.A05(1);
        vuX.A01 = AnonymousClass05K.A01;
        Activity activity = (Activity) 0mE.A00(vuX.A03, Activity.class);
        if (activity != null) {
            activity.setVolumeControlStream(AnonymousClass972.MUTABLE_FLAG_MASK);
        }
        if (r2.A0D()) {
            r2.A0C(false);
        }
    }

    public final void A01() {
        C18851W5y w5y;
        SensorManager sensorManager = this.A05;
        if (!(sensorManager == null || (w5y = this.A00) == null)) {
            w5y.A01 = false;
            C60240fb.A00(w5y, sensorManager);
        }
        if (this.A01 == AnonymousClass05K.A00) {
            A00(this);
        }
        this.A07.A01(this.A09);
    }

    public C18581VuX(Context context, C331037Pg r5, C62320sa r6, int i, int i2, boolean z) {
        SensorManager sensorManager;
        Sensor sensor;
        this.A06 = r5;
        this.A03 = context;
        this.A09 = z;
        this.A02 = i2;
        this.A08 = r6;
        Object systemService = context.getSystemService("sensor");
        C18851W5y w5y = null;
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A05 = sensorManager;
        this.A07 = new C70811OMg(context);
        this.A01 = AnonymousClass05K.A01;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(8);
        } else {
            sensor = null;
        }
        this.A04 = sensor;
        this.A00 = sensor != null ? new C18851W5y(sensor, new C20600Wvh(this, 0), i) : w5y;
    }
}
