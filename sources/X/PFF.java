package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class PFF implements C332447Vb {
    public final /* synthetic */ C70788OLi A00;

    public PFF(C70788OLi oLi) {
        this.A00 = oLi;
    }

    public final void Ewl(String str) {
        int i;
        C70788OLi oLi = this.A00;
        FragmentActivity activity = oLi.A02.getActivity();
        if (activity != null) {
            User user = oLi.A00;
            if (user != null) {
                ArrayList A01 = AnonymousClass48M.A01(AnonymousClass7TE.A1I(user));
                1pE A012 = 1pE.A01(activity, oLi.A03, oLi.A04, "rtc_call_entry_point");
                A012.A0A(str);
                A012.A0B(A01);
                A012.A13 = true;
                Boolean bool = oLi.A01;
                if (bool != null) {
                    C331537Rj r3 = oLi.A06;
                    boolean booleanValue = bool.booleanValue();
                    C254783t2 r1 = A012.A0B;
                    17k.A07(r1, AnonymousClass000.A00(2373));
                    A012.A0C = r3;
                    if (booleanValue) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                    1pE.A03(A012, r1, i);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
