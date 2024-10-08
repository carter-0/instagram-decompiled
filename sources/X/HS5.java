package X;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.provider.Settings;

public abstract class HS5 {
    public static final Boolean A00(C307896Rx r4) {
        ContentResolver contentResolver;
        boolean z = false;
        if (!ValueAnimator.areAnimatorsEnabled()) {
            return true;
        }
        C307786Rm r0 = r4.A03;
        if (r0 == null || (contentResolver = r0.A00.getContentResolver()) == null) {
            return false;
        }
        if (Settings.Global.getFloat(contentResolver, AnonymousClass000.A00(506), 1.0f) == 0.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
