package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;

public final class QCC extends Fragment {
    public int A00;
    public long A01;
    public long A02;
    public QC3 A03;
    public final C11445SVh A04 = new C11445SVh(this);

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-160884726);
        QCC.super.onCreate(bundle);
        this.A03 = new 0SM();
        AnonymousClass0fD.A09(-2074729308, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1919433724);
        QCC.super.onPause();
        C11445SVh sVh = this.A04;
        Sensor sensor = sVh.A00;
        if (sensor != null) {
            sVh.A02.A00();
            sVh.A01.unregisterListener(sVh, sensor);
            AnonymousClass0BW.A00.A06(sVh, sensor);
            sVh.A01 = null;
            sVh.A00 = null;
        }
        if (getParentFragmentManager().A0R("dump_debug_info_dialog_fragment") != null) {
            0s1 r1 = new 0s1(getParentFragmentManager());
            r1.A03(this.A03);
            r1.A00();
        }
        AnonymousClass0fD.A09(-846301003, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-878129247);
        QCC.super.onResume();
        this.A02 = SystemClock.elapsedRealtime();
        SensorManager sensorManager = (SensorManager) requireActivity().getSystemService("sensor");
        C11445SVh sVh = this.A04;
        if (sVh.A00 == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            sVh.A00 = defaultSensor;
            if (defaultSensor != null) {
                sVh.A01 = sensorManager;
                C60240fb.A01(defaultSensor, sVh, sensorManager, 1);
            }
        }
        AnonymousClass0fD.A09(989473941, A022);
    }
}
