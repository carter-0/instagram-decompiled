package X;

import androidx.fragment.app.Fragment;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

public final class EQ1 extends C47698EDh {
    public final /* synthetic */ C307896Rx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQ1(Fragment fragment, C307896Rx r13, AnonymousClass0aP r14, RegFlowExtras regFlowExtras, Object obj) {
        super(fragment, r14, (G69) null, regFlowExtras, (EXD) obj, (Integer) null, (String) null, false, false, true);
        this.A00 = r13;
    }

    public final void A03(User user) {
        super.A03(user);
        G53 A04 = C308206Td.A04(this.A00);
        if (A04 instanceof G53) {
            ((SignedOutFragmentActivity) A04).A0A = true;
        }
    }
}
