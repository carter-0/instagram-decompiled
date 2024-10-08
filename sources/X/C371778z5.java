package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.8z5  reason: invalid class name and case insensitive filesystem */
public final class C371778z5 implements SensorEventListener {
    public final /* synthetic */ C371748z1 A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C371778z5(C371748z1 r1) {
        this.A00 = r1;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C371748z1 r4 = this.A00;
        synchronized (r4) {
            if (r4.A04 && sensorEvent.sensor.getType() == 9) {
                float[] fArr = r4.A0P;
                float[] fArr2 = sensorEvent.values;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                r4.A02 = sensorEvent.timestamp;
            }
        }
    }
}
