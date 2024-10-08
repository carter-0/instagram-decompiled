package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;

/* renamed from: X.8z3  reason: invalid class name and case insensitive filesystem */
public final class C371758z3 implements SensorEventListener {
    public final /* synthetic */ C371748z1 A00;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C371758z3(C371748z1 r1) {
        this.A00 = r1;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C371748z1 r3 = this.A00;
        synchronized (r3) {
            if (r3.A04) {
                SensorEvent sensorEvent2 = sensorEvent;
                if (sensorEvent2.sensor.getType() == 11 || sensorEvent2.sensor.getType() == 15 || sensorEvent2.sensor.getType() == 20) {
                    float[] fArr = r3.A0Q;
                    SensorManager.getRotationMatrixFromVector(fArr, sensorEvent2.values);
                    int rotation = r3.A0M.getDefaultDisplay().getRotation();
                    float[] fArr2 = r3.A0R;
                    int i = 131;
                    int i2 = 129;
                    if (rotation == 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i2 = 1;
                        if (rotation != 3) {
                            i = 1;
                            i2 = 3;
                        }
                    } else {
                        i = 129;
                        i2 = 131;
                    }
                    SensorManager.remapCoordinateSystem(fArr, i, i2, fArr2);
                    float[] fArr3 = r3.A0S;
                    fArr3[0] = fArr2[0];
                    fArr3[1] = fArr2[2];
                    fArr3[2] = -fArr2[1];
                    fArr3[3] = 0.0f;
                    fArr3[4] = fArr2[8];
                    fArr3[5] = fArr2[10];
                    fArr3[6] = -fArr2[9];
                    fArr3[7] = 0.0f;
                    fArr3[8] = -fArr2[4];
                    fArr3[9] = -fArr2[6];
                    fArr3[10] = fArr2[5];
                    fArr3[11] = 0.0f;
                    fArr3[12] = 0.0f;
                    fArr3[13] = 0.0f;
                    fArr3[14] = 0.0f;
                    fArr3[15] = 1.0f;
                    if (!r3.A05) {
                        float[] fArr4 = sensorEvent2.values;
                        if (!(fArr4[0] == 0.0f && fArr4[1] == 0.0f && fArr4[2] == 0.0f)) {
                            float[] fArr5 = new float[3];
                            SensorManager.getOrientation(fArr3, fArr5);
                            r3.A00 = (float) Math.toDegrees((double) fArr5[2]);
                            r3.A05 = true;
                        }
                    }
                    Matrix.rotateM(fArr3, 0, r3.A00, 0.0f, 1.0f, 0.0f);
                    Matrix.invertM(fArr3, 0, fArr3, 0);
                    r3.A02 = sensorEvent2.timestamp;
                    C371748z1.A00(r3);
                }
            }
        }
    }
}
