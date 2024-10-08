package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.8z4  reason: invalid class name and case insensitive filesystem */
public final class C371768z4 implements SensorEventListener {
    public final /* synthetic */ C371748z1 A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C371768z4(C371748z1 r1) {
        this.A00 = r1;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C371748z1 r5 = this.A00;
        synchronized (r5) {
            if (r5.A04 && sensorEvent.sensor.getType() == 1) {
                float[] fArr = r5.A0O;
                float[] fArr2 = sensorEvent.values;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                r5.A02 = sensorEvent.timestamp;
            }
        }
    }
}
