package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.XuJ  reason: case insensitive filesystem */
public final class C22035XuJ implements SensorEventListener {
    public C21458XbN A00;
    public float[] A01;
    public final Sensor A02;
    public final SensorManager A03;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        0qQ.A0B(sensorEvent2, 0);
        float[] fArr = new float[9];
        SensorManager.getRotationMatrixFromVector(fArr, sensorEvent2.values);
        float[] fArr2 = this.A01;
        if (fArr2 == null) {
            this.A01 = fArr;
            fArr2 = fArr;
        }
        float[] fArr3 = new float[3];
        SensorManager.getAngleChange(fArr3, fArr, fArr2);
        C21458XbN xbN = this.A00;
        if (xbN != null) {
            float f = fArr3[1];
            float f2 = fArr3[2];
            GOK gok = xbN.A0E;
            double d = (double) f2;
            float f3 = (float) (d * 57.29577951308232d);
            double d2 = (double) f;
            float f4 = (float) (d2 * 57.29577951308232d);
            double d3 = (double) xbN.A02;
            2V5 r1 = xbN.A07;
            float f5 = xbN.A00;
            float f6 = xbN.A04;
            C51967G9n.A19(r1, GMR.A00(f3, f5, f6));
            2V5 r12 = xbN.A06;
            float f7 = xbN.A03;
            C51967G9n.A19(r12, GMR.A00(f4, f5, f7));
            2V5 r13 = xbN.A09;
            float f8 = xbN.A01;
            C51967G9n.A19(r13, GMR.A00(f3, f8, f6));
            C51967G9n.A19(xbN.A08, GMR.A00(f4, f8, f7));
            2V5 r14 = xbN.A0A;
            UserSession userSession = gok.A04;
            C51967G9n.A19(r14, GMR.A01(userSession, (float) (d2 * d3 * -1.0d)));
            C51967G9n.A19(xbN.A0B, GMR.A01(userSession, (float) (d * d3)));
            2V5 r15 = xbN.A0C;
            float f9 = xbN.A05;
            C51967G9n.A19(r15, GMR.A01(userSession, f * f9 * -1.0f));
            C51967G9n.A19(xbN.A0D, GMR.A01(userSession, f2 * f9));
        }
    }

    public C22035XuJ(Context context) {
        Object systemService = context.getSystemService("sensor");
        if (systemService != null) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.A03 = sensorManager;
            this.A02 = sensorManager.getDefaultSensor(11);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
