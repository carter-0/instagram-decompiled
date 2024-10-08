package X;

import android.hardware.biometrics.BiometricPrompt;

public abstract class RRW {
    public static void A00(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
