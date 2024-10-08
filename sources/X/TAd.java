package X;

import android.content.Context;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;

public final class TAd implements Runnable {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public TAd(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public final void run() {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        Context context = fingerprintDialogFragment.getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        fingerprintDialogFragment.A04.A02(1);
        fingerprintDialogFragment.A04.A03(context.getString(2131962471));
    }
}
