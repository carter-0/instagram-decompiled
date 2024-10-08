package X;

import android.os.Bundle;

/* renamed from: X.Rvh  reason: case insensitive filesystem */
public abstract class C10648Rvh {
    public final Bundle A00;
    public final Bundle A01;
    public final C10507RtM A02;
    public final String A03;

    public C10648Rvh(Bundle bundle, Bundle bundle2, C10507RtM rtM, String str, boolean z) {
        AnonymousClass7TG.A1Q(bundle, bundle2);
        this.A03 = str;
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = rtM;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
