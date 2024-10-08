package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;

public final class WOZ implements X6P {
    public final /* synthetic */ C15321UaT A00;

    public WOZ(C15321UaT uaT) {
        this.A00 = uaT;
    }

    public final void Cqq(Fragment fragment) {
        C15321UaT uaT = this.A00;
        if (uaT.getActivity() != null) {
            FragmentActivity requireActivity = uaT.requireActivity();
            PromoteData promoteData = uaT.A0A;
            if (promoteData == null) {
                0qQ.A0F("promoteData");
                throw AnonymousClass00P.createAndThrow();
            } else {
                DbY.A14(fragment, requireActivity, promoteData.A0y);
            }
        }
    }

    public final void Cya() {
        C15321UaT.A02(this.A00);
    }
}
