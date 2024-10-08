package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.instagram.android.R;
import com.instagram.react.delegate.IgReactDelegate;

public abstract class SQI {
    public static final FragmentActivity A00(Activity activity) {
        if (!(activity instanceof FragmentActivity)) {
            return null;
        }
        return (FragmentActivity) activity;
    }

    public static FragmentActivity A01(ReactContextBaseJavaModule reactContextBaseJavaModule) {
        return A00(reactContextBaseJavaModule.getCurrentActivity());
    }

    public static final AnonymousClass4DH A02(Activity activity) {
        0hq supportFragmentManager;
        FragmentActivity A00 = A00(activity);
        if (A00 == null) {
            return null;
        }
        if (A00 instanceof AnonymousClass2ZY) {
            supportFragmentManager = ((AnonymousClass2ZY) A00).AuV();
        } else {
            FragmentActivity A002 = A00(A00);
            if (A002 == null) {
                return null;
            }
            supportFragmentManager = A002.getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            return null;
        }
        AnonymousClass4DH A0P = supportFragmentManager.A0P(R.id.layout_container_main);
        if (A0P instanceof AnonymousClass4DH) {
            return A0P;
        }
        return null;
    }

    public static final boolean A03(Activity activity, int i) {
        R8S r8s;
        int i2;
        AnonymousClass4DH A02 = A02(activity);
        if (!(A02 == null || !(A02 instanceof R8S) || (r8s = (R8S) A02) == null)) {
            C7372Q9d q9d = ((IgReactDelegate) r8s.A00).A03;
            if (q9d != null) {
                i2 = q9d.A01;
            } else {
                i2 = 0;
            }
            if (i2 != i) {
                return false;
            }
            return true;
        }
        return false;
    }
}
