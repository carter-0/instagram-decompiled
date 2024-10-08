package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.9Ny  reason: invalid class name and case insensitive filesystem */
public final class C377969Ny implements Runnable {
    public final /* synthetic */ APX A00;
    public final /* synthetic */ AnonymousClass7U7 A01;

    public C377969Ny(APX apx, AnonymousClass7U7 r2) {
        this.A01 = r2;
        this.A00 = apx;
    }

    public final void run() {
        Runnable ao0;
        SensorManager sensorManager;
        Sensor defaultSensor;
        AnonymousClass7U7 r7 = this.A01;
        APX apx = this.A00;
        FragmentActivity activity = r7.A01.getActivity();
        if (activity == null || !AnonymousClass7TE.A1a(r7.A08.invoke())) {
            if (apx != null) {
                apx.stopTracking();
                if (activity != null) {
                    ao0 = new C41078Ao0(apx, r7);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (apx == null) {
            0np r5 = r7.A02;
            AnonymousClass9L4 r1 = new AnonymousClass9L4(r7, 49);
            AnonymousClass7U8 r4 = r7.A03;
            AnonymousClass7TG.A1P(r5, r4);
            Object systemService = activity.getSystemService("sensor");
            if ((systemService instanceof SensorManager) && (sensorManager = (SensorManager) systemService) != null && (defaultSensor = sensorManager.getDefaultSensor(15)) != null && AnonymousClass7TE.A1a(r1.invoke())) {
                ao0 = new C41077Anz(new APX(defaultSensor, sensorManager, r4, r5), r7);
            } else {
                return;
            }
        } else {
            return;
        }
        activity.runOnUiThread(ao0);
    }
}
