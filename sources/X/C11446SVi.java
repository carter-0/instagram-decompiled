package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.spherical.util.Quaternion;

/* renamed from: X.SVi  reason: case insensitive filesystem */
public final class C11446SVi implements SensorEventListener {
    public static int A06 = 15;
    public static Boolean A07;
    public int A00;
    public final SensorManager A01;
    public final Quaternion A02 = new Quaternion();
    public final C13500TbR A03;
    public final float[] A04 = new float[4];
    public final SensorEventListener A05 = new C11444SVg(this);

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        0qQ.A0B(sensorEvent, 0);
        this.A05.onSensorChanged(sensorEvent);
    }

    public C11446SVi(Context context, C13500TbR tbR) {
        SensorManager sensorManager;
        this.A03 = tbR;
        Object systemService = context.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A01 = sensorManager;
    }
}
