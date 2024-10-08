package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.aistudio.model.UtmMetadata;

/* renamed from: X.MIu  reason: case insensitive filesystem */
public final class C66213MIu extends 0Yg implements C62320sa {
    public final /* synthetic */ C61399K5t A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66213MIu(C61399K5t k5t) {
        super(0);
        this.A00 = k5t;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.A00.mArguments;
        if (i >= 33) {
            if (bundle != null) {
                return bundle.getParcelable("utm_metadata", UtmMetadata.class);
            }
            return null;
        } else if (bundle != null) {
            return bundle.getParcelable("utm_metadata");
        } else {
            return null;
        }
    }
}
