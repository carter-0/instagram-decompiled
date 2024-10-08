package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: X.3FR  reason: invalid class name */
public final class AnonymousClass3FR implements Runnable {
    public final /* synthetic */ Context A00;

    public AnonymousClass3FR(Context context) {
        this.A00 = context;
    }

    public final void run() {
        SensorManager sensorManager;
        Sensor defaultSensor;
        Context context = this.A00;
        try {
            if (!AnonymousClass3FQ.A01 && (sensorManager = (SensorManager) context.getSystemService("sensor")) != null && (defaultSensor = sensorManager.getDefaultSensor(5)) != null) {
                AnonymousClass3FQ.A01 = C60240fb.A01(defaultSensor, new C2595842g(), sensorManager, 3);
            }
        } catch (Throwable th) {
            new 0eQ(th);
        }
    }
}
