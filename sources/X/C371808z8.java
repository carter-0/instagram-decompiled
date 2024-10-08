package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;

/* renamed from: X.8z8  reason: invalid class name and case insensitive filesystem */
public final class C371808z8 implements SensorEventListener {
    public final /* synthetic */ C371748z1 A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C371808z8(C371748z1 r1) {
        this.A00 = r1;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        Iterator it = this.A00.A0N.iterator();
        while (it.hasNext()) {
            ((C41810B1p) it.next()).onRawSensorMeasurementChanged(C391119sN.RAW_GYROSCOPE, sensorEvent.values, sensorEvent.timestamp);
        }
    }
}
