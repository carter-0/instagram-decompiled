package X;

import android.os.Bundle;

/* renamed from: X.3Kr  reason: invalid class name and case insensitive filesystem */
public abstract class C240383Kr extends C240393Ks {
    public final int A0G(06p r5, String str, boolean z) {
        0KC.A0H("IgDialogFragment", "Showing Dialog", new Throwable());
        return super.A0G(r5, str, true);
    }

    public final void A0L(0hq r3, String str) {
        if (!r3.A0G) {
            A0G(new 0s1(r3), str, true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        C240383Kr.super.onSaveInstanceState(bundle);
    }
}
