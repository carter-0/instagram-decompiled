package X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: X.Oel  reason: case insensitive filesystem */
public final class C71171Oel implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ C68373NDy A00;

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        0qQ.A0B(bluetoothProfile, 1);
        if (i == 1) {
            this.A00.A00 = (BluetoothHeadset) bluetoothProfile;
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            C68373NDy nDy = this.A00;
            nDy.A00 = null;
            nDy.A0C();
        }
    }

    public C71171Oel(C68373NDy nDy) {
        this.A00 = nDy;
    }
}
