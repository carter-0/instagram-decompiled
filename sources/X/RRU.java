package X;

import android.hardware.biometrics.BiometricPrompt;

public abstract class RRU {
    public static int A00(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
