package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: X.Aij  reason: case insensitive filesystem */
public final class C40753Aij implements Runnable {
    public final /* synthetic */ APX A00;

    public C40753Aij(APX apx) {
        this.A00 = apx;
    }

    public final void run() {
        APX apx = this.A00;
        SensorManager sensorManager = apx.A05;
        ALC alc = apx.A06;
        Sensor sensor = apx.A04;
        if (sensorManager.registerListener(alc, sensor, 1, 2)) {
            AnonymousClass0BW.A00.A05(alc, sensor);
        }
        apx.A03 = false;
        apx.A02 = 0;
    }
}
