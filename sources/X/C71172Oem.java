package X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.Arrays;

/* renamed from: X.Oem  reason: case insensitive filesystem */
public final class C71172Oem implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ OZz A00;
    public final /* synthetic */ OUV A01;

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        0qQ.A0B(bluetoothProfile, 1);
        if (i == 1) {
            OZz oZz = this.A00;
            oZz.A01 = (BluetoothHeadset) bluetoothProfile;
            OJP ojp = oZz.A0G;
            if (ojp != null) {
                C71017OYs oYs = ojp.A00;
                boolean A05 = oYs.A05.A05();
                oYs.A07.A00(002.A1D("onServiceConnected: turning bluetooth on: ", A05), new Object[0]);
                if (A05) {
                    C71017OYs.A00(oYs);
                }
                C70407O5k o5k = oYs.A01;
                if (o5k == null) {
                    0qQ.A0F("callback");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    o5k.A00.A0D();
                }
            } else {
                0KC.A0O("DefaultBluetoothManager", "Bluetooth connected but listener is null", Arrays.copyOf(new Object[0], 0));
            }
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            OZz oZz = this.A00;
            oZz.A01 = null;
            OJP ojp = oZz.A0G;
            if (ojp != null) {
                C71017OYs oYs = ojp.A00;
                oYs.A07.A00("onServiceDisconnected: turning bluetooth off", new Object[0]);
                C71017OYs.A01(oYs, true);
                C70407O5k o5k = oYs.A01;
                if (o5k == null) {
                    0qQ.A0F("callback");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    o5k.A00.A0D();
                }
            }
        }
    }

    public C71172Oem(OZz oZz, OUV ouv) {
        this.A00 = oZz;
        this.A01 = ouv;
    }
}
