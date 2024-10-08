package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.aistudio.model.UtmMetadata;

/* renamed from: X.MIt  reason: case insensitive filesystem */
public final class C66212MIt extends 0Yg implements C62320sa {
    public final /* synthetic */ C61396K5q A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66212MIt(C61396K5q k5q) {
        super(0);
        this.A00 = k5q;
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
