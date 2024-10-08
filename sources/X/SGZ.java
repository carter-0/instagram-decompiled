package X;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.Executor;

public final class SGZ {
    public 0hq A00;

    public static void A00(SR5 sr5, C10714Rws rws, SGZ sgz) {
        String str;
        0hq r3 = sgz.A00;
        if (r3 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else if (r3.A12()) {
            str = "Unable to start authentication. Called after onSaveInstanceState().";
        } else {
            BiometricFragment A0R = r3.A0R("androidx.biometric.BiometricFragment");
            if (A0R == null) {
                A0R = new BiometricFragment();
                0s1 r0 = new 0s1(r3);
                r0.A0B(A0R, "androidx.biometric.BiometricFragment");
                r0.A01();
                r3.A0a();
            }
            A0R.A09(sr5, rws);
            return;
        }
        Log.e("BiometricPromptCompat", str);
    }

    public final void A01(SR5 sr5, C10714Rws rws) {
        int i = rws.A00;
        if (i == 0) {
            i = 15;
        } else if ((i & 255) == 255) {
            throw AnonymousClass7TE.A0w("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT >= 30 || (i & Constants.LOAD_RESULT_PGO) == 0) {
            A00(sr5, rws, this);
            return;
        }
        throw AnonymousClass7TE.A0w("Crypto-based authentication is not supported for device credential prior to API 30.");
    }

    public SGZ(RLE rle, Fragment fragment, Executor executor) {
        QDG qdg;
        if (executor != null) {
            FragmentActivity activity = fragment.getActivity();
            0hq childFragmentManager = fragment.getChildFragmentManager();
            if (activity != null) {
                qdg = Pxj.A0M(activity);
                if (qdg != null) {
                    fragment.mLifecycleRegistry.A09(new C11625SdT(qdg));
                }
            } else {
                qdg = null;
            }
            this.A00 = childFragmentManager;
            if (qdg != null) {
                qdg.A0H = executor;
                qdg.A04 = rle;
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("Executor must not be null.");
    }
}
