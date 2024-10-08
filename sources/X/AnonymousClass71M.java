package X;

import android.os.Bundle;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.modal.ModalActivity;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.71M  reason: invalid class name */
public final class AnonymousClass71M implements C322776wO {
    public final /* synthetic */ ProfileMediaTabFragment A00;

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public AnonymousClass71M(ProfileMediaTabFragment profileMediaTabFragment) {
        this.A00 = profileMediaTabFragment;
    }

    public final void DBy() {
        String str;
        ProfileMediaTabFragment profileMediaTabFragment = this.A00;
        C322706wH r2 = profileMediaTabFragment.A04.A07;
        GraphGuardianContentImpl graphGuardianContentImpl = ((C322736wK) r2.A03.get(profileMediaTabFragment.A03.A00)).A00;
        if (graphGuardianContentImpl == null || (str = graphGuardianContentImpl.A01) == null) {
            Bundle bundle = new Bundle();
            bundle.putString("analytics_module", profileMediaTabFragment.A04.A01.getModuleName());
            bundle.putString("location", "IG_PROFILE");
            AnonymousClass6W8.A03(profileMediaTabFragment.requireActivity(), bundle, profileMediaTabFragment.A00, ModalActivity.class, "account_status").A0C(profileMediaTabFragment.requireActivity());
            return;
        }
        SimpleWebViewActivity.A00(profileMediaTabFragment.requireContext(), profileMediaTabFragment.A00, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, (String) null, SQU.A01(profileMediaTabFragment.requireContext(), str)));
    }
}
