package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.QgS  reason: case insensitive filesystem */
public final class C8074QgS extends QCQ {
    public final void A04() {
        C8115Qh7 qh7;
        super.A04();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            int i = bundle.getInt("fe_selector_view_model_class_id", -1);
            if (i == -1 || this.mParentFragment == null) {
                qh7 = null;
            } else {
                C11426STk A02 = AnonymousClass2E0.A02();
                Fragment requireParentFragment = requireParentFragment();
                while (requireParentFragment instanceof C8606Qxn) {
                    requireParentFragment = requireParentFragment.requireParentFragment();
                }
                2YL A08 = A02.A08(requireParentFragment, i);
                0qQ.A0C(A08, "null cannot be cast to non-null type com.facebookpay.msc.filter.controller.FilterEntryPointOwner");
                qh7 = (C8115Qh7) A08;
            }
            QDP A03 = A03();
            0qQ.A0C(A03, "null cannot be cast to non-null type com.facebookpay.msc.filter.controller.FilterOwner");
            ((C13603TdV) A03).CMl(qh7);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
