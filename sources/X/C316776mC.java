package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.6mC  reason: invalid class name and case insensitive filesystem */
public final class C316776mC implements SensorEventListener {
    public final /* synthetic */ C316766mB A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C316776mC(C316766mB r1) {
        this.A00 = r1;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float[] fArr;
        C316766mB r2 = this.A00;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            f = 0.0f;
        } else {
            f = fArr[0];
        }
        r2.A00 = f;
    }
}
