package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.42g  reason: invalid class name and case insensitive filesystem */
public final class C2595842g implements SensorEventListener {
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float[] fArr;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            f = -1.0f;
        } else {
            f = fArr[0];
        }
        AnonymousClass3FQ.A00 = f;
    }
}
