package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.Rwv  reason: case insensitive filesystem */
public abstract class C10717Rwv {
    public final Bundle A00;
    public final Bundle A01;
    public final String A02;
    public final Set A03;
    public final boolean A04;

    public C10717Rwv(Bundle bundle, Bundle bundle2, String str, Set set, int i, boolean z) {
        this.A02 = str;
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A04 = z;
        this.A03 = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
    }
}
