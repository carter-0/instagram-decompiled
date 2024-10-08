package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.TAa  reason: case insensitive filesystem */
public final class C12844TAa implements Runnable {
    public final WeakReference A00;

    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A06();
        }
    }

    public C12844TAa(BiometricFragment biometricFragment) {
        this.A00 = C51965G9l.A0v(biometricFragment);
    }
}
