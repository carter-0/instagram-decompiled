package X;

import androidx.biometric.BiometricFragment;

public final class TI0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public TI0(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public final void run() {
        BiometricFragment biometricFragment = this.A01;
        BiometricFragment.A03(biometricFragment, this.A02, this.A00);
        biometricFragment.A05();
    }
}
