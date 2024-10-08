package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.EIu  reason: case insensitive filesystem */
public final class C47822EIu extends E5H {
    public static final String __redex_internal_original_name = "DirectRecipientPickerGlobalFragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_TARGET_LIST");
        String string = requireArguments().getString(AnonymousClass000.A00(4339));
        if (parcelableArrayList != null && string != null) {
            this.A0A.A0R(parcelableArrayList);
            EEP eep = this.A0A;
            C337257fy A02 = EEP.A02(eep);
            C49916FEq fEq = eep.A0B;
            if (fEq != null && A02 != null) {
                A02.EhX(string);
                fEq.A02.EjT(string);
            }
        }
    }
}
