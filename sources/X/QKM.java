package X;

import android.os.Bundle;

public abstract class QKM extends QC2 {
    public boolean A00 = false;

    public void onCreate(Bundle bundle) {
        int i;
        int A02 = AnonymousClass0fD.A02(279770036);
        QKM.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = -354337319;
        } else {
            this.A00 = bundle2.getBoolean("disable_drag_and_bg_tap_to_dismiss", false);
            i = -1135108024;
        }
        AnonymousClass0fD.A09(i, A02);
    }
}
