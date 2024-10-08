package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.HwW  reason: case insensitive filesystem */
public abstract class C56319HwW {
    public static final void A01(Fragment fragment, UserSession userSession, 1Xj r10, HNQ hnq, String str) {
        UserSession userSession2 = userSession;
        String str2 = str;
        if (HNQ.A07 == hnq || HNQ.A06 == hnq || HNQ.A0G == hnq) {
            1Yh A00 = C18138VmE.A00();
            1Yg A002 = VA4.A00();
            String id = r10.getId();
            if (id != null) {
                A00.A0B(A002.A00(fragment.requireContext(), userSession, id, str));
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (HNQ.A0H == hnq) {
            C48732EjH.A00().A02(fragment.requireActivity(), userSession2, str2, (String) null, false);
        }
    }

    public static final HNQ A00(1Xj r1) {
        switch (r1.A1Z().ordinal()) {
            case 0:
            case 9:
                return HNQ.A07;
            case 1:
            case 4:
                return HNQ.A0H;
            case 5:
                return HNQ.A06;
            case 7:
                return HNQ.A0G;
            default:
                return null;
        }
    }
}
