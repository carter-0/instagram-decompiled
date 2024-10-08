package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.W5y  reason: case insensitive filesystem */
public final class C18851W5y implements SensorEventListener {
    public long A00;
    public boolean A01 = true;
    public final int A02;
    public final Sensor A03;
    public final 0sL A04;

    public C18851W5y(Sensor sensor, 0sL r3, int i) {
        this.A03 = sensor;
        this.A04 = r3;
        this.A02 = i;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent != null && this.A01 && sensorEvent.accuracy != 0) {
            int i = this.A02;
            if ((i <= 0 || System.currentTimeMillis() - this.A00 >= ((long) i)) && (fArr = sensorEvent.values) != null) {
                this.A04.invoke(this.A03, Float.valueOf(fArr[0]));
            }
        }
    }
}
