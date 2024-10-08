package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.spherical.util.Quaternion;

/* renamed from: X.SVg  reason: case insensitive filesystem */
public final class C11444SVg implements SensorEventListener {
    public final /* synthetic */ C11446SVi A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        0qQ.A0B(sensorEvent, 0);
        if (sensorEvent.sensor.getType() == C11446SVi.A06) {
            C11446SVi sVi = this.A00;
            int i = sVi.A00;
            if (i <= 0) {
                float[] fArr = sVi.A04;
                SensorManager.getQuaternionFromVector(fArr, sensorEvent.values);
                Quaternion quaternion = sVi.A02;
                quaternion.w = fArr[0];
                quaternion.x = fArr[1];
                quaternion.y = fArr[2];
                quaternion.z = fArr[3];
                C13500TbR tbR = sVi.A03;
                long j = sensorEvent.timestamp;
                Q7x q7x = (Q7x) tbR;
                q7x.A04 = quaternion;
                C315826kc r1 = q7x.A0C;
                r1.A00(quaternion, j);
                i = sVi.A00;
                if (i == 0) {
                    r1.A03 = true;
                } else if (i <= -1) {
                    return;
                }
            }
            sVi.A00 = i - 1;
        }
    }

    public C11444SVg(C11446SVi sVi) {
        this.A00 = sVi;
    }
}
