package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class GU7 implements C46209DQm {
    public final Fragment A00;
    public final UserSession A01;

    public final void EBu(View view, 1Xj r8, AnonymousClass3W1 r9) {
        if (!r9.A2w) {
            r9.A2w = true;
            String A2n = r8.A2n();
            if (A2n != null) {
                LRh lRh = new LRh(this.A01, AnonymousClass7TE.A0S(view));
                String A0k = C51973G9u.A0k(r8);
                UserSession userSession = lRh.A07;
                AnonymousClass0iw r2 = lRh.A05;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), AnonymousClass000.A00(661));
                if (A0e.isSampled()) {
                    C51965G9l.A1C(C54689HOu.OPEN_CAROUSEL_REVIEW_BANNER, A0e);
                    DbW.A16(A0e, r2);
                    Long l = null;
                    try {
                        l = AnonymousClass7TE.A10(A2n);
                    } catch (NumberFormatException unused) {
                    }
                    C51965G9l.A1E(A0e, l);
                    C51965G9l.A1H(A0e, LRh.A00(A0k));
                    C51965G9l.A1K(A0e, lRh.A08);
                    A0e.Cgf();
                }
            }
        }
    }

    public final void DVG(1Xj r3, AnonymousClass3W1 r4) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            I5X.A00(activity, this.A01, r3);
        }
    }

    public GU7(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
