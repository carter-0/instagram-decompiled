package X;

import android.hardware.biometrics.BiometricManager;

public abstract class RRX {
    public static int A00(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
