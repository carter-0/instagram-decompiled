package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.0fb  reason: invalid class name and case insensitive filesystem */
public abstract class C60240fb {
    public static void A00(SensorEventListener sensorEventListener, SensorManager sensorManager) {
        AnonymousClass0BW.A00.A06(sensorEventListener, (Sensor) null);
        sensorManager.unregisterListener(sensorEventListener);
    }

    public static boolean A01(Sensor sensor, SensorEventListener sensorEventListener, SensorManager sensorManager, int i) {
        boolean registerListener = sensorManager.registerListener(sensorEventListener, sensor, i);
        if (registerListener) {
            AnonymousClass0BW.A00.A05(sensorEventListener, sensor);
        }
        return registerListener;
    }
}
