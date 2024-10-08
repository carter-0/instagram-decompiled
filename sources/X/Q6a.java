package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;

public final class Q6a extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ RRK A00;

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public Q6a(RRK rrk) {
        this.A00 = rrk;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.A00.A00();
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        SR5 sr5;
        if (authenticationResult != null) {
            sr5 = C11365SPf.A02(authenticationResult.getCryptoObject());
        } else {
            sr5 = null;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = RRU.A00(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.A00.A02(new C10336RqZ(sr5, i2));
    }
}
