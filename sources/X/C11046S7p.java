package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.S7p  reason: case insensitive filesystem */
public abstract class C11046S7p {
    public static void A00(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void A01(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
