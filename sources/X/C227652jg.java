package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.2jg  reason: invalid class name and case insensitive filesystem */
public final class C227652jg implements AnonymousClass06Q {
    public final /* synthetic */ C227532jU A00;

    public C227652jg(C227532jU r1) {
        this.A00 = r1;
    }

    public final void onBackStackChanged() {
        C227532jU r5 = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01("IgTabHostFragment.onBackStackChangedListener", -871335122);
        }
        try {
            C227672jj.A04(r5.requireActivity(), r5.getChildFragmentManager(), (UserSession) r5.A05.getValue());
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(435695839);
            }
        }
    }
}
