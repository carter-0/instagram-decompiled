package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.NavigableSet;

/* renamed from: X.8Gg  reason: invalid class name and case insensitive filesystem */
public final class C353098Gg implements SensorEventListener {
    public long A00;
    public NavigableSet A01;
    public final Sensor A02;
    public final SensorManager A03;

    public C353098Gg(Context context) {
        0qQ.A0B(context, 1);
        Object systemService = context.getSystemService("sensor");
        if (systemService != null) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.A03 = sensorManager;
            this.A02 = sensorManager.getDefaultSensor(11);
            this.A00 = -1;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        0qQ.A0B(sensorEvent, 0);
        long j = this.A00;
        if (j != -1) {
            float[] fArr = new float[4];
            int currentTimeMillis = (int) (System.currentTimeMillis() - j);
            SensorManager.getQuaternionFromVector(fArr, sensorEvent.values);
            C60240fb.A00(this, this.A03);
            this.A00 = -1;
            NavigableSet navigableSet = this.A01;
            if (navigableSet != null) {
                navigableSet.add(new TAA(currentTimeMillis, fArr));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
