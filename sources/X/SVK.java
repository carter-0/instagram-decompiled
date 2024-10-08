package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class SVK implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public SVK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i = this.A00;
        0qQ.A0C(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        Dialog dialog = (Dialog) dialogInterface;
        if (i != 0) {
            View findViewById = dialog.findViewById(R.id.design_bottom_sheet);
            if (findViewById != null) {
                AnonymousClass2E0.A0A();
                DbT.A16(((Fragment) this.A01).requireContext(), findViewById, R.color.fds_transparent);
            }
        } else if (dialog.findViewById(R.id.design_bottom_sheet) != null) {
            C11426STk.A03().A00(((Fragment) this.A01).requireContext(), 21);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
