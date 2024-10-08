package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.2li  reason: invalid class name and case insensitive filesystem */
public final class C228462li {
    public final C227802jw A00;
    public final C228422le A01;
    public final UserSession A02;

    public final void A00() {
        C227802jw r4 = this.A00;
        if (r4.mView != null) {
            ViewGroup CEd = r4.getScrollingViewProxy().CEd();
            if (CEd == null || CEd.getHeight() != 0) {
                r4.A09().A00().A02 = false;
                r4.A0T(false);
                if (182.A06(0Tu.A05, this.A02, 36323594984238379L)) {
                    this.A01.A07((RecyclerView) null);
                }
                r4.getScrollingViewProxy().EKm(r4);
            }
        }
    }

    public C228462li(C228422le r1, UserSession userSession, C227802jw r3) {
        this.A00 = r3;
        this.A02 = userSession;
        this.A01 = r1;
    }
}
