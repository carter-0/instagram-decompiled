package X;

import android.os.Bundle;
import com.instagram.model.direct.threadkey.util.UnifiedThreadKeyParcelable;

/* renamed from: X.Mga  reason: case insensitive filesystem */
public abstract class C67002Mga {
    public static final C254743sy A00(Bundle bundle, String str) {
        UnifiedThreadKeyParcelable unifiedThreadKeyParcelable = (UnifiedThreadKeyParcelable) bundle.getParcelable(str);
        if (unifiedThreadKeyParcelable != null) {
            return unifiedThreadKeyParcelable.A00;
        }
        return null;
    }

    public static final void A01(Bundle bundle, C254743sy r2, String str) {
        DbY.A1S(bundle, r2);
        bundle.putParcelable(str, new UnifiedThreadKeyParcelable(r2));
    }
}
